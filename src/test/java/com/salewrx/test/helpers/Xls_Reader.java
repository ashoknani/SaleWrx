
package com.salewrx.test.helpers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
	public String path;
	public FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;

	public Xls_Reader(final String path) {

		this.path = path;
		try {
			this.fis = new FileInputStream(path);
			this.workbook = new XSSFWorkbook(this.fis);
			this.sheet = this.workbook.getSheetAt(0);
			this.fis.close();
		} catch (final Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// returns the row count in a sheet

	public int getRowCount(final String sheetName) {
		final int index = this.workbook.getSheetIndex(sheetName);
		if (index == -1) {
			return 0;
		} else {
			this.sheet = this.workbook.getSheetAt(index);
			final int number = this.sheet.getLastRowNum() + 1;
			return number;
		}

	}

	// returns the data from a cell
	public String getCellData(final String sheetName, final String colName, final int rowNum) {
		try {
			if (rowNum <= 0) {
				return "";
			}

			final int index = this.workbook.getSheetIndex(sheetName);
			int col_Num = -1;
			if (index == -1) {
				return "";
			}

			this.sheet = this.workbook.getSheetAt(index);
			this.row = this.sheet.getRow(0);
			for (int i = 0; i < this.row.getLastCellNum(); i++) {
				// System.out.println(row.getCell(i).getStringCellValue().trim());
				if (this.row.getCell(i).getStringCellValue().trim().equals(colName.trim())) {
					col_Num = i;
				}
			}
			if (col_Num == -1) {
				return "";
			}

			this.sheet = this.workbook.getSheetAt(index);
			this.row = this.sheet.getRow(rowNum - 1);
			if (this.row == null) {
				return "";
			}
			this.cell = this.row.getCell(col_Num);

			if (this.cell == null) {
				return "";
			}

			// System.out.println(cell.getCellType().name());
			//
			if (this.cell.getCellType().name().equals("STRING")) {
				return this.cell.getStringCellValue();
			} else if ((this.cell.getCellType().name().equals("NUMERIC")) || (this.cell.getCellType().name().equals("FORMULA"))) {

				String cellText = String.valueOf(this.cell.getNumericCellValue());
				if (DateUtil.isCellDateFormatted(this.cell)) {
					// format in form of M/D/YY
					final double d = this.cell.getNumericCellValue();

					final Calendar cal = Calendar.getInstance();
					cal.setTime(DateUtil.getJavaDate(d));
					cellText = (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
					cellText = cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.MONTH) + 1 + "/" + cellText;

					// System.out.println(cellText);

				}

				return cellText;
			} else {
				this.cell.getCellType();
				if (CellType.BLANK != null) {
					return "";
				} else {
					return String.valueOf(this.cell.getBooleanCellValue());
				}
			}

		} catch (final Exception e) {

			e.printStackTrace();
			return "row " + rowNum + " or column " + colName + " does not exist in xls";
		}
	}

	// returns the data from a cell
	public String getCellData(final String sheetName, final int colNum, final int rowNum) {
		try {
			if (rowNum <= 0) {
				return "";
			}

			final int index = this.workbook.getSheetIndex(sheetName);

			if (index == -1) {
				return "";
			}

			this.sheet = this.workbook.getSheetAt(index);
			this.row = this.sheet.getRow(rowNum - 1);
			if (this.row == null) {
				return "";
			}
			this.cell = this.row.getCell(colNum);
			if (this.cell == null) {
				return "";
			}

			//
			if (this.cell.getCellType().name().equals("STRING")) {
				return this.cell.getStringCellValue();
			} else if ((this.cell.getCellType().name().equals("NUMERIC")) || (this.cell.getCellType().name().equals("FORMULA"))) {

				String cellText = String.valueOf(this.cell.getNumericCellValue());
				if (DateUtil.isCellDateFormatted(this.cell)) {
					// format in form of M/D/YY
					final double d = this.cell.getNumericCellValue();

					final Calendar cal = Calendar.getInstance();
					cal.setTime(DateUtil.getJavaDate(d));
					cellText = (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
					cellText = cal.get(Calendar.MONTH) + 1 + "/" + cal.get(Calendar.DAY_OF_MONTH) + "/" + cellText;

					// System.out.println(cellText);

				}

				return cellText;
			} else {
				this.cell.getCellType();
				if (CellType.BLANK != null) {
					return "";
				} else {
					return String.valueOf(this.cell.getBooleanCellValue());
				}
			}
		} catch (final Exception e) {

			e.printStackTrace();
			return "row " + rowNum + " or column " + colNum + " does not exist  in xls";
		}
	}

	// returns true if data is set successfully else false
	public boolean setCellData(final String sheetName, final String colName, final int rowNum, final String data) {
		try {
			this.fis = new FileInputStream(this.path);
			this.workbook = new XSSFWorkbook(this.fis);

			if (rowNum <= 0) {
				return false;
			}

			final int index = this.workbook.getSheetIndex(sheetName);
			int colNum = -1;
			if (index == -1) {
				return false;
			}

			this.sheet = this.workbook.getSheetAt(index);

			this.row = this.sheet.getRow(0);
			for (int i = 0; i < this.row.getLastCellNum(); i++) {
				// System.out.println(row.getCell(i).getStringCellValue().trim());
				if (this.row.getCell(i).getStringCellValue().trim().equals(colName)) {
					colNum = i;
				}
			}
			if (colNum == -1) {
				return false;
			}

			this.sheet.autoSizeColumn(colNum);
			this.row = this.sheet.getRow(rowNum - 1);
			if (this.row == null) {
				this.row = this.sheet.createRow(rowNum - 1);
			}

			this.cell = this.row.getCell(colNum);
			if (this.cell == null) {
				this.cell = this.row.createCell(colNum);
			}

			// cell style
			// CellStyle cs = workbook.createCellStyle();
			// cs.setWrapText(true);
			// cell.setCellStyle(cs);
			this.cell.setCellValue(data);

			this.fileOut = new FileOutputStream(this.path);

			this.workbook.write(this.fileOut);

			this.fileOut.close();

		} catch (final Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	// find whether sheets exists
	public boolean isSheetExist(final String sheetName) {
		int index = this.workbook.getSheetIndex(sheetName);
		if (index == -1) {
			index = this.workbook.getSheetIndex(sheetName.toUpperCase());
			if (index == -1) {
				return false;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

}
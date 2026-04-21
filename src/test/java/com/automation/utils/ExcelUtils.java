package com.automation.utils;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
    public static Object[] [] getData(String filePath, String sheetName){
        try {
            FileInputStream fis= new FileInputStream("C:\\Users\\Cybrain11\\Desktop\\htmlreport\\sheet1.xlsx");
            XSSFWorkbook workBook = new XSSFWorkBook(fis);

            Sheet sheet = workBook.getSheet(sheetName);

            int rows = sheet.getPhyiscalNumberOfRows();
            int cols= sheet.getRow(0).getPhysicalNumberOfCells();

            Object[][] data= new Object[rows-1][cols];

            for(int i=1;i<rows;i++){
                for(int j=0; j<cols;i++){
                    data[i-1][j]= sheet.getRow(i).getCell(j).toString();
                }
            }
            workBook close();
            return data;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

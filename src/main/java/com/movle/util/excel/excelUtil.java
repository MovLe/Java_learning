package com.movle.util.excel;

import com.google.common.collect.Maps;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/**
 * @ClassName excelUtil
 * @MethodDesc: excel的常用
 * @Author Movle
 * @Date 2021/11/17 下午2:57
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class excelUtil {
    public static void main(String[] args) {
        String filePath = "/Users/macbook/TestInfo/work.xlsx";
        Map<Integer, String> excelDataMap = readDataFromExcel(filePath);
        System.out.println(excelDataMap);
    }

    /**
     * 从excel中读取数据
     * @param filePath
     * @return
     */
    public static Map<Integer, String> readDataFromExcel(String filePath) {
        Map<Integer, String> excelDataMap = Maps.newHashMap();
        try {
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream(filePath));
            int sheetNum = xssfWorkbook.getNumberOfSheets();
            for (int i = 0; i < sheetNum; i++) {
                XSSFSheet sheet = xssfWorkbook.getSheetAt(i);
                int maxRow = sheet.getLastRowNum();
                for (int row = 0; row < maxRow; row++) {
                    int index = (int) sheet.getRow(row).getCell(0).getNumericCellValue();
                    String value = sheet.getRow(row).getCell(1).toString();
                    excelDataMap.put(index, value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return excelDataMap;
    }
}

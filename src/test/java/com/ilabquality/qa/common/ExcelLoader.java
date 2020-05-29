package com.ilabquality.qa.common;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;
import java.util.Objects;

public class ExcelLoader {

    private static final String EXCEL_FILE_NAME = "ilab_TestPlan.xlsx";
    private XSSFWorkbook workbook;

    ExcelLoader() {
        loadExcel();
    }

    private void loadExcel() {

        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(EXCEL_FILE_NAME);
            workbook = new XSSFWorkbook(Objects.requireNonNull(inputStream));
            inputStream.close();
        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }

    public XSSFWorkbook getWorkbook() {
        return workbook;
    }

}


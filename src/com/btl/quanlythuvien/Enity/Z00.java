package com.btl.quanlythuvien.Enity;

public class Z00 {
    private String Z00_DOC_NUMBER;
    private int Z00_NO_LINES;//số dòng của dữ liệu
    private int Z00_DATA_LEN;//độ dài của dữ liệu
    private String Z00_DATA;//dữ liệu bib

    public Z00() {
    }

    public Z00(String z00_DOC_NUMBER, int z00_NO_LINES, int z00_DATA_LEN, String z00_DATA) {
        Z00_DOC_NUMBER = z00_DOC_NUMBER;
        Z00_NO_LINES = z00_NO_LINES;
        Z00_DATA_LEN = z00_DATA_LEN;
        Z00_DATA = z00_DATA;
    }

    public String getZ00_DOC_NUMBER() {
        return Z00_DOC_NUMBER;
    }

    public void setZ00_DOC_NUMBER(String z00_DOC_NUMBER) {
        Z00_DOC_NUMBER = z00_DOC_NUMBER;
    }

    public int getZ00_NO_LINES() {
        return Z00_NO_LINES;
    }

    public void setZ00_NO_LINES(int z00_NO_LINES) {
        Z00_NO_LINES = z00_NO_LINES;
    }

    public int getZ00_DATA_LEN() {
        return Z00_DATA_LEN;
    }

    public void setZ00_DATA_LEN(int z00_DATA_LEN) {
        Z00_DATA_LEN = z00_DATA_LEN;
    }

    public String getZ00_DATA() {
        return Z00_DATA;
    }

    public void setZ00_DATA(String z00_DATA) {
        Z00_DATA = z00_DATA;
    }
}

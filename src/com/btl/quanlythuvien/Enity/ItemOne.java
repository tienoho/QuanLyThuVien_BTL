package com.btl.quanlythuvien.Enity;

public class ItemOne {
    private String Z30_REC_KEY;
    private String Z30_BARCODE;
    private String Z00R_TITLE;
    private String Z00R_AUTHOR;

    public ItemOne() {
    }

    public ItemOne(String z30_REC_KEY, String z30_BARCODE, String z00R_TITLE, String z00R_AUTHOR) {

        Z30_REC_KEY = z30_REC_KEY;
        Z30_BARCODE = z30_BARCODE;
        Z00R_TITLE = z00R_TITLE;
        Z00R_AUTHOR = z00R_AUTHOR;
    }

    public String getZ30_REC_KEY() {
        return Z30_REC_KEY;
    }

    public void setZ30_REC_KEY(String z30_REC_KEY) {
        Z30_REC_KEY = z30_REC_KEY;
    }

    public String getZ30_BARCODE() {
        return Z30_BARCODE;
    }

    public void setZ30_BARCODE(String z30_BARCODE) {
        Z30_BARCODE = z30_BARCODE;
    }

    public String getZ00R_TITLE() {
        return Z00R_TITLE;
    }

    public void setZ00R_TITLE(String z00R_TITLE) {
        Z00R_TITLE = z00R_TITLE;
    }

    public String getZ00R_AUTHOR() {
        return Z00R_AUTHOR;
    }

    public void setZ00R_AUTHOR(String z00R_AUTHOR) {
        Z00R_AUTHOR = z00R_AUTHOR;
    }
}

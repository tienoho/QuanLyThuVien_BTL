package com.btl.quanlythuvien.Enity;

public class ItemOne {
    private String Z30_REC_KEY;
    private String Z30_BARCODE;
    private String Z00R_TITLE;
    private String Z00R_AUTHOR;
    private String Z30_ITEM_STATUS;
    private float Z30_PRICE;

    public float getZ30_PRICE() {
        return Z30_PRICE;
    }

    public void setZ30_PRICE(float z30_PRICE) {
        Z30_PRICE = z30_PRICE;
    }

    public ItemOne() {
    }

    public ItemOne(String z30_REC_KEY, String z30_BARCODE, String z00R_TITLE, String z00R_AUTHOR, String z30_ITEM_STATUS,float Z30_PRICE) {
        Z30_REC_KEY = z30_REC_KEY;
        Z30_BARCODE = z30_BARCODE;
        Z00R_TITLE = z00R_TITLE;
        Z00R_AUTHOR = z00R_AUTHOR;
        Z30_ITEM_STATUS = z30_ITEM_STATUS;
        this.Z30_PRICE=Z30_PRICE;
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
    public String getZ30_ITEM_STATUS() {
        return Z30_ITEM_STATUS;
    }

    public void setZ30_ITEM_STATUS(String z30_ITEM_STATUS) {
        Z30_ITEM_STATUS = z30_ITEM_STATUS;
    }

}

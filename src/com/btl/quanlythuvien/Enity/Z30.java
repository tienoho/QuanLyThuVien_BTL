package com.btl.quanlythuvien.Enity;

public class Z30 {
    private String Z30_BARCODE;//b
    private String Z30_REC_KEY;//mã tài liệu
    private String Z30_SUB_LIBRARY;//mã thư viện
    private String Z30_MATERIAL;//loại tài liệu
    private String Z30_ITEM_STATUS;//01 mượn 20 ngày, 02 mượn 1 khóa học.03 chỉ được đọc trong thư viện
    private String Z30_UPDATE_DATE;//ngày câp nhật
    private String Z30_CATALOGER;//người biên mục
    private String Z30_DATE_LAST_RETURN;//ngày tra cuối cùng
    private String Z30_NO_LOANS;//số lần ddc mượn
    private String Z30_COLLECTION;//bộ sưu tập
    private String Z30_DESCRIPTION;//Mô tả
    private String Z30_ORDER_NUMBER;//số lượng
    private String Z30_PRICE;

    public Z30() {
    }

    public Z30(String z30_BARCODE, String z30_REC_KEY, String z30_SUB_LIBRARY, String z30_MATERIAL, String z30_ITEM_STATUS, String z30_UPDATE_DATE, String z30_CATALOGER, String z30_DATE_LAST_RETURN, String z30_NO_LOANS, String z30_COLLECTION, String z30_DESCRIPTION, String z30_ORDER_NUMBER, String z30_PRICE) {
        Z30_BARCODE = z30_BARCODE;
        Z30_REC_KEY = z30_REC_KEY;
        Z30_SUB_LIBRARY = z30_SUB_LIBRARY;
        Z30_MATERIAL = z30_MATERIAL;
        Z30_ITEM_STATUS = z30_ITEM_STATUS;
        Z30_UPDATE_DATE = z30_UPDATE_DATE;
        Z30_CATALOGER = z30_CATALOGER;
        Z30_DATE_LAST_RETURN = z30_DATE_LAST_RETURN;
        Z30_NO_LOANS = z30_NO_LOANS;
        Z30_COLLECTION = z30_COLLECTION;
        Z30_DESCRIPTION = z30_DESCRIPTION;
        Z30_ORDER_NUMBER = z30_ORDER_NUMBER;
        Z30_PRICE = z30_PRICE;
    }

    public String getZ30_BARCODE() {
        return Z30_BARCODE;
    }

    public void setZ30_BARCODE(String z30_BARCODE) {
        Z30_BARCODE = z30_BARCODE;
    }

    public String getZ30_REC_KEY() {
        return Z30_REC_KEY;
    }

    public void setZ30_REC_KEY(String z30_REC_KEY) {
        Z30_REC_KEY = z30_REC_KEY;
    }

    public String getZ30_SUB_LIBRARY() {
        return Z30_SUB_LIBRARY;
    }

    public void setZ30_SUB_LIBRARY(String z30_SUB_LIBRARY) {
        Z30_SUB_LIBRARY = z30_SUB_LIBRARY;
    }

    public String getZ30_MATERIAL() {
        return Z30_MATERIAL;
    }

    public void setZ30_MATERIAL(String z30_MATERIAL) {
        Z30_MATERIAL = z30_MATERIAL;
    }

    public String getZ30_ITEM_STATUS() {
        return Z30_ITEM_STATUS;
    }

    public void setZ30_ITEM_STATUS(String z30_ITEM_STATUS) {
        Z30_ITEM_STATUS = z30_ITEM_STATUS;
    }

    public String getZ30_UPDATE_DATE() {
        return Z30_UPDATE_DATE;
    }

    public void setZ30_UPDATE_DATE(String z30_UPDATE_DATE) {
        Z30_UPDATE_DATE = z30_UPDATE_DATE;
    }

    public String getZ30_CATALOGER() {
        return Z30_CATALOGER;
    }

    public void setZ30_CATALOGER(String z30_CATALOGER) {
        Z30_CATALOGER = z30_CATALOGER;
    }

    public String getZ30_DATE_LAST_RETURN() {
        return Z30_DATE_LAST_RETURN;
    }

    public void setZ30_DATE_LAST_RETURN(String z30_DATE_LAST_RETURN) {
        Z30_DATE_LAST_RETURN = z30_DATE_LAST_RETURN;
    }

    public String getZ30_NO_LOANS() {
        return Z30_NO_LOANS;
    }

    public void setZ30_NO_LOANS(String z30_NO_LOANS) {
        Z30_NO_LOANS = z30_NO_LOANS;
    }

    public String getZ30_COLLECTION() {
        return Z30_COLLECTION;
    }

    public void setZ30_COLLECTION(String z30_COLLECTION) {
        Z30_COLLECTION = z30_COLLECTION;
    }

    public String getZ30_DESCRIPTION() {
        return Z30_DESCRIPTION;
    }

    public void setZ30_DESCRIPTION(String z30_DESCRIPTION) {
        Z30_DESCRIPTION = z30_DESCRIPTION;
    }

    public String getZ30_ORDER_NUMBER() {
        return Z30_ORDER_NUMBER;
    }

    public void setZ30_ORDER_NUMBER(String z30_ORDER_NUMBER) {
        Z30_ORDER_NUMBER = z30_ORDER_NUMBER;
    }

    public String getZ30_PRICE() {
        return Z30_PRICE;
    }

    public void setZ30_PRICE(String z30_PRICE) {
        Z30_PRICE = z30_PRICE;
    }
}

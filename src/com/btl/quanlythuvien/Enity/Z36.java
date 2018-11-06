package com.btl.quanlythuvien.Enity;

public class Z36 {
    private String Z36_REC_KEY;//Id của tài liệu
    private String Z36_ID;//ID của người dùng
    private String Z36_NUMBER;//số lần mượn
    private String Z36_MATERIAL;//Loại vật liệu(CD,giấy,...)
    private String Z36_SUB_LIBRARY;//Kí hiệu thư viện
    private String Z36_STATUS;//A là đang mượn, C là đã trả, C đã làm mất
    private String Z36_LOAN_DATE;//Ngày mượn
    private String Z36_LOAN_HOUR;//giờ mượn
    private String Z36_DUE_DATE;//Ngày Hạn trả
    private String Z36_DUE_HOUR;//Giờ hạn trả
    private String Z36_RETURNED_DATE;//Ngày được trả
    private String Z36_RETURNED_HOUR;//Giờ được trả
    private String Z36_ITEM_STATUS;//tình Trạng của ITEM_STATUS Z30
    private String Z36_NOTE_1;
    private String Z36_PROCESS_STATUS;//RD đang được đoc, L mất,M Mượn

    public Z36() {
    }

    public Z36(String z36_REC_KEY, String z36_ID, String z36_NUMBER, String z36_MATERIAL, String z36_SUB_LIBRARY, String z36_STATUS, String z36_LOAN_DATE, String z36_LOAN_HOUR, String z36_DUE_DATE, String z36_DUE_HOUR, String z36_RETURNED_DATE, String z36_RETURNED_HOUR, String z36_ITEM_STATUS, String z36_NOTE_1, String z36_PROCESS_STATUS) {

        Z36_REC_KEY = z36_REC_KEY;
        Z36_ID = z36_ID;
        Z36_NUMBER = z36_NUMBER;
        Z36_MATERIAL = z36_MATERIAL;
        Z36_SUB_LIBRARY = z36_SUB_LIBRARY;
        Z36_STATUS = z36_STATUS;
        Z36_LOAN_DATE = z36_LOAN_DATE;
        Z36_LOAN_HOUR = z36_LOAN_HOUR;
        Z36_DUE_DATE = z36_DUE_DATE;
        Z36_DUE_HOUR = z36_DUE_HOUR;
        Z36_RETURNED_DATE = z36_RETURNED_DATE;
        Z36_RETURNED_HOUR = z36_RETURNED_HOUR;
        Z36_ITEM_STATUS = z36_ITEM_STATUS;
        Z36_NOTE_1 = z36_NOTE_1;
        Z36_PROCESS_STATUS = z36_PROCESS_STATUS;
    }

    public String getZ36_REC_KEY() {
        return Z36_REC_KEY;
    }

    public void setZ36_REC_KEY(String z36_REC_KEY) {
        Z36_REC_KEY = z36_REC_KEY;
    }

    public String getZ36_ID() {
        return Z36_ID;
    }

    public void setZ36_ID(String z36_ID) {
        Z36_ID = z36_ID;
    }

    public String getZ36_NUMBER() {
        return Z36_NUMBER;
    }

    public void setZ36_NUMBER(String z36_NUMBER) {
        Z36_NUMBER = z36_NUMBER;
    }

    public String getZ36_MATERIAL() {
        return Z36_MATERIAL;
    }

    public void setZ36_MATERIAL(String z36_MATERIAL) {
        Z36_MATERIAL = z36_MATERIAL;
    }

    public String getZ36_SUB_LIBRARY() {
        return Z36_SUB_LIBRARY;
    }

    public void setZ36_SUB_LIBRARY(String z36_SUB_LIBRARY) {
        Z36_SUB_LIBRARY = z36_SUB_LIBRARY;
    }

    public String getZ36_STATUS() {
        return Z36_STATUS;
    }

    public void setZ36_STATUS(String z36_STATUS) {
        Z36_STATUS = z36_STATUS;
    }

    public String getZ36_LOAN_DATE() {
        return Z36_LOAN_DATE;
    }

    public void setZ36_LOAN_DATE(String z36_LOAN_DATE) {
        Z36_LOAN_DATE = z36_LOAN_DATE;
    }

    public String getZ36_LOAN_HOUR() {
        return Z36_LOAN_HOUR;
    }

    public void setZ36_LOAN_HOUR(String z36_LOAN_HOUR) {
        Z36_LOAN_HOUR = z36_LOAN_HOUR;
    }

    public String getZ36_DUE_DATE() {
        return Z36_DUE_DATE;
    }

    public void setZ36_DUE_DATE(String z36_DUE_DATE) {
        Z36_DUE_DATE = z36_DUE_DATE;
    }

    public String getZ36_DUE_HOUR() {
        return Z36_DUE_HOUR;
    }

    public void setZ36_DUE_HOUR(String z36_DUE_HOUR) {
        Z36_DUE_HOUR = z36_DUE_HOUR;
    }

    public String getZ36_RETURNED_DATE() {
        return Z36_RETURNED_DATE;
    }

    public void setZ36_RETURNED_DATE(String z36_RETURNED_DATE) {
        Z36_RETURNED_DATE = z36_RETURNED_DATE;
    }

    public String getZ36_RETURNED_HOUR() {
        return Z36_RETURNED_HOUR;
    }

    public void setZ36_RETURNED_HOUR(String z36_RETURNED_HOUR) {
        Z36_RETURNED_HOUR = z36_RETURNED_HOUR;
    }

    public String getZ36_ITEM_STATUS() {
        return Z36_ITEM_STATUS;
    }

    public void setZ36_ITEM_STATUS(String z36_ITEM_STATUS) {
        Z36_ITEM_STATUS = z36_ITEM_STATUS;
    }

    public String getZ36_NOTE_1() {
        return Z36_NOTE_1;
    }

    public void setZ36_NOTE_1(String z36_NOTE_1) {
        Z36_NOTE_1 = z36_NOTE_1;
    }

    public String getZ36_PROCESS_STATUS() {
        return Z36_PROCESS_STATUS;
    }

    public void setZ36_PROCESS_STATUS(String z36_PROCESS_STATUS) {
        Z36_PROCESS_STATUS = z36_PROCESS_STATUS;
    }
}

package com.btl.quanlythuvien.Enity;

public class Z00R {
  private String  Z00R_DOC_NUMBER;
    private String  Z00R_TITLE;
    private String Z00R_AUTHOR;

    public Z00R() {
    }

    public Z00R(String z00R_DOC_NUMBER, String z00R_TITLE, String z00R_AUTHOR) {
        Z00R_DOC_NUMBER = z00R_DOC_NUMBER;
        Z00R_TITLE = z00R_TITLE;
        Z00R_AUTHOR = z00R_AUTHOR;
    }

    public String getZ00R_DOC_NUMBER() {
        return Z00R_DOC_NUMBER;
    }

    public void setZ00R_DOC_NUMBER(String z00R_DOC_NUMBER) {
        Z00R_DOC_NUMBER = z00R_DOC_NUMBER;
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

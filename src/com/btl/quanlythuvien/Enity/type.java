package com.btl.quanlythuvien.Enity;

public class type {
    private int id;
    private String symbol;
    private String content;

    public type() {
    }

    public type(String symbol, String content) {
        this.symbol = symbol;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

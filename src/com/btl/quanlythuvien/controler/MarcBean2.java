package com.btl.quanlythuvien.controler;

public class MarcBean2 {

    // bib
    private String id;
    // LDR
    private String LDR;
    // 008
    private String sp008;
    // 041
    private String sp041;
    // 082 $$a $$b ma xep gia || DDC
    private String sp082;
    // 100 $$a $$e  ||
    private String sp100;
    // 245 $$a .... || $$c
    private String sp245;
    // 260 $$a imprint || $$c year
    private String sp260;
    //300
    private String sp300;
    //650
    private String sp650;
    // 911 linh vuc
    private String ty911;
    // 915 linh vuc
    private String ty925;
    // 927 loai hinh tai lieu
    private String fi927;

    public MarcBean2(String id, String LDR, String sp008, String sp041, String sp082, String sp100, String sp245, String sp260, String sp300, String sp650, String ty911, String ty925, String fi927) {
        this.id = id;
        this.LDR = LDR;
        this.sp008 = sp008;
        this.sp041 = sp041;
        this.sp082 = sp082;
        this.sp100 = sp100;
        this.sp245 = sp245;
        this.sp260 = sp260;
        this.sp300 = sp300;
        this.sp650 = sp650;
        this.ty911 = ty911;
        this.ty925 = ty925;
        this.fi927 = fi927;
    }

    public String getId() {
        return id;
    }

    public String getLDR() {
        return LDR;
    }

    public String getSp008() {
        return sp008;
    }

    public String getSp041() {
        return sp041;
    }

    public String getSp082() {
        return sp082;
    }

    public String getSp100() {
        return sp100;
    }

    public String getSp245() {
        return sp245;
    }

    public String getSp260() {
        return sp260;
    }

    public String getSp300() {
        return sp300;
    }

    public String getSp650() {
        return sp650;
    }

    public String getTy911() {
        return ty911;
    }

    public String getTy925() {
        return ty925;
    }

    public String getFi927() {
        return fi927;
    }

    @Override
    public String toString() {
        return "" +
                "LDR='" + LDR + '\'' + "\n" +
                "001='" + id + '\'' + "\n" +
                "008='" + sp008 + '\'' + "\n" +
                "041='" + sp041 + '\'' + "\n" +
                "082='" + sp082 + '\'' + "\n" +
                "100='" + sp100 + '\'' + "\n" +
                "245='" + sp245 + '\'' + "\n" +
                "260='" + sp260 + '\'' + "\n" +
                "300='" + sp300 + '\'' + "\n" +
                "650='" + sp650 + '\'' + "\n" +
                "911='" + ty911 + '\'' + "\n" +
                "925='" + ty925 + '\'' + "\n" +
                "927='" + fi927 + '\'' + "\n" ;
    }
}

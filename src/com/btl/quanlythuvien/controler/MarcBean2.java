package com.btl.quanlythuvien.controler;

public class MarcBean2 {

    // bib
    private String id;

    // 005 ngay thang nam
    private String ye005;
    private String da005;
    private String mo005;

    // 082 $$a $$b ma xep gia || DDC
    private String sp082;
    // 100 $$a $$e  ||
    private String sp100;
    //private String in082;
    // 245 $$a .... || $$c
    private String sp245;

    // 260 $$a imprint || $$c year
    private String sp260;
    //300
    private String sp300;
    //650
    private String sp650;
    // 852 $$b localtion
    private String lo852;

    // 916 linh vuc
    private String ty916;

    // 927 loai hinh tai lieu
    private String fi927;

    public MarcBean2(String id, String sp082, String sp100, String sp245, String sp260, String sp300, String sp650, String fi927) {
        this.id = id;
        this.sp082 = sp082;
        this.sp100 = sp100;
        this.sp245 = sp245;
        this.sp260 = sp260;
        this.sp300 = sp300;
        this.sp650 = sp650;
        this.fi927 = fi927;
    }

    public String getId() {
        return id;
    }

    public String getYe005() {
        return ye005;
    }

    public String getDa005() {
        return da005;
    }

    public String getMo005() {
        return mo005;
    }


    public String getSp100() {
        return sp100;
    }


    public String getSp300() {
        return sp300;
    }



    public String getLo852() {
        return lo852;
    }

    public String getTy916() {
        return ty916;
    }

    public String getFi927() {
        return fi927;
    }

    @Override
    public String toString() {
        return "MarcBean{" +
                "id='" + id + '\'' +"\n"+
                ", ye005='" + ye005 + '\'' +"\n"+
                ", da005='" + da005 + '\'' +"\n"+
                ", mo005='" + mo005 + '\'' +"\n"+
                ", Sp082='" + sp082 + '\'' +"\n"+
                ", Sp100='" + sp100 + '\'' +"\n"+
                ", Sp245='" + sp245 + '\'' +"\n"+
                ", Sp260='" + sp260 + '\'' +"\n"+
                ", au300='" + sp300 + '\'' +"\n"+
                ", au650='" + sp650 + '\'' +"\n"+
                ", lo852='" + lo852 + '\'' +"\n"+
                ", ty916='" + ty916 + '\'' +"\n"+
                ", fi927='" + fi927 + '\'' +"\n"+
                '}';
    }
}

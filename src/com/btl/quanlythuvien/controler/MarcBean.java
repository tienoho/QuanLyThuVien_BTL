package com.btl.quanlythuvien.controler;

public class MarcBean {

    // bib
    private String id;

    // 005 ngay thang nam
    private String ye005;
    private String da005;
    private String mo005;

    // 082 $$a $$b ma xep gia || DDC
    private String cn082;
    private String in082;
    // 100 $$a $$e  ||
    private String sp100;
    //private String in082;
    // 245 $$a .... || $$c
    private String ti245;
    private String au245;

    // 260 $$a imprint || $$c year
    private String im260;
    private String ye260;
    //300
    private String sp300;

    // 852 $$b localtion
    private String lo852;

    // 916 linh vuc
    private String ty916;

    // 927 loai hinh tai lieu
    private String fi927;

    public MarcBean(String id, String cn082, String in082,String sp100, String ti245, String au245, String sp300,String im260, String ye260, String lo852, String ty916, String fi927) {
        this.id = id;
        this.cn082 = cn082;
        this.in082 = in082;
        this.sp100=sp100;
        this.ti245 = ti245;
        this.au245 = au245;
        this.sp300=sp300;
        this.im260 = im260;
        this.ye260 = ye260;
        this.lo852 = lo852;
        this.ty916 = ty916;
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

    public String getCn082() {
        return cn082;
    }

    public String getIn082() {
        return in082;
    }
    public String getSp100() {
        return sp100;
    }

    public String getTi245() {
        return ti245;
    }

    public String getAu245() {
        return au245;
    }
    public String getSp300() {
        return sp300;
    }

    public String getIm260() {
        return im260;
    }

    public String getYe260() {
        return ye260;
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
                "id='" + id + '\'' +
                ", ye005='" + ye005 + '\'' +
                ", da005='" + da005 + '\'' +
                ", mo005='" + mo005 + '\'' +
                ", cn082='" + cn082 + '\'' +
                ", in082='" + in082 + '\'' +
                ", Sp100='" + sp100 + '\'' +
                ", ti245='" + ti245 + '\'' +
                ", au245='" + au245 + '\'' +
                ", au300='" + sp300 + '\'' +
                ", im260='" + im260 + '\'' +
                ", ye260='" + ye260 + '\'' +
                ", lo852='" + lo852 + '\'' +
                ", ty916='" + ty916 + '\'' +
                ", fi927='" + fi927 + '\'' +
                '}';
    }
}
package com.btl.quanlythuvien.controler;

public class Bib {

    final String sL = "  L";
    public StringBuilder sb = null;

    public Bib(BibBean b) {
        //String.format("|%020d|", 93); // prints: |00000000000000000093|
        sb = new StringBuilder();
        sb.append(getMarc21(b.getFiledLDR(), "LDR"));
        sb.append(getMarc21(b.getField001(), "001"));
        sb.append(getMarc21(b.getField008(), "008"));
        sb.append(getMarc21(margeField(b.getField041a(), Marc2.mA),"041"));
        sb.append(getMarc21(margeField(b.getField082a(), Marc2.mA)+margeField(b.getField082b(), Marc2.mB),"082"));
        sb.append(getMarc21(margeField(b.getField100a(), Marc2.mA)+margeField(b.getField100e(), Marc2.mE),"100"));
        sb.append(getMarc21(margeField(b.getField245a(), Marc2.mA)+margeField(b.getField245b(), Marc2.mB)+margeField(b.getField100a(), Marc2.mC),"245"));
        sb.append(getMarc21(margeField(b.getField260a(), Marc2.mA)+margeField(b.getField260b(), Marc2.mB)+margeField(b.getField260c(), Marc2.mC),"260"));
        sb.append(getMarc21(margeField(b.getField300a(), Marc2.mA)+margeField(b.getField300b(), Marc2.mB)+margeField(b.getField300c(), Marc2.mC),"300"));
        sb.append(getMarc21(margeField(b.getField650a(), Marc2.mA)+margeField(b.getField650v(), Marc2.mV),"650"));
        sb.append(getMarc21(b.getField911(), "911"));
        sb.append(getMarc21(b.getField925(), "925"));
        sb.append(getMarc21(b.getField927(), "927"));
        sb.replace(sb.indexOf("123456789xyz"),sb.indexOf("123456789xyz")+12,getLDR(sb.length()+12));
    }

    private String getLDR(int sum) {
        String start=String.format("%05d", 132);
        String summ=String.format("%05d", sum);
        return start+"nam^a22"+summ+"^a^4500";
    }
    private String subField(String field, int length) {
        String sLength = String.format("%04d", length);
        return sLength + field;
    }

    private String margeField(String strIn, String doLa) {
        String outStr = "";
        if (!strIn.equals("")) {
            outStr = doLa + strIn;
        }
        return outStr;
    }

    private String getMarc21(String strIn, String field) {
        String outStr = "";
        if (!strIn.equals("")) {
            outStr=sL + strIn;
            outStr = subField(field, outStr.length()+3) + outStr;
        }
        return outStr;
    }
}

package com.btl.quanlythuvien.controler;

import java.util.ArrayList;

public class Marc2 {

    public static final String mA = "$$a";
    public static final String mB = "$$b";
    public static final String mC = "$$c";
    public static final String mD = "$$d";
    public static final String mE = "$$e";
    public static final String mF = "$$f";
    public static final String mG = "$$g";
    public static final String mH = "$$h";
    public static final String mI = "$$i";
    public static final String mJ = "$$j";
    public static final String mK = "$$k";
    public static final String mN = "$$n";
    public static final String mP = "$$p";
    public static final String mS = "$$s";
    public static final String mM = "$$m";
    public static final String mQ = "$$q";
    public static final String m2 = "$$2";
    public static final String m3 = "$$3";
    public static final String m6 = "$$6";
    public static final String m8 = "$$8";
    public static final String mL = "$$l";
    public static final String mT = "$$t";
    public static final String mU = "$$u";
    public static final String mV = "$$v";
    private static final String mX = "$$x";
    private static final String mZ = "$$z";
    private static final String m4 = "$$4";
    private static final String m0 = "$$0";
    private static final String sp = "  ";

    private static final String fiLDR = "LDR  L";
    private static final String fi008 = "008  L";
    private static final String fi927 = "927  L";
    private static final String fi911 = "911  L";
    private static final String fi925 = "925  L";
    //

    private static ArrayList<String> fi041() {
        String z = "041";
        String x = "L";
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add(z + "  " + x);
        arrayList.add(z + "0 " + x);
        arrayList.add(z + "1 " + x);

        return arrayList;
    }

    private static ArrayList<String> fi082() {
        String z = "082";
        String x = "L";
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add(z + "  " + x);
        arrayList.add(z + "0 " + x);
        arrayList.add(z + "00" + x);
        arrayList.add(z + "04" + x);
        arrayList.add(z + "1 " + x);
        arrayList.add(z + "10" + x);
        arrayList.add(z + "14" + x);
        arrayList.add(z + "7 " + x);
        arrayList.add(z + "70" + x);
        arrayList.add(z + "74" + x);

        return arrayList;
    }

    public static ArrayList<String> fi100() {
        String z = "100";
        String x = "L";
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add(z + "  " + x);
        arrayList.add(z + "0 " + x);
        arrayList.add(z + "1 " + x);
        arrayList.add(z + "3 " + x);

        return arrayList;
    }

    public static ArrayList<String> fi245() {
        ArrayList<String> arrayList = new ArrayList<>();
        String z = "245";
        String x = "L";
        arrayList.add(z + "  " + x);
        arrayList.add(z + " 0" + x);
        arrayList.add(z + " 1" + x);
        arrayList.add(z + " 2" + x);
        arrayList.add(z + " 3" + x);
        arrayList.add(z + " 4" + x);
        arrayList.add(z + " 5" + x);
        arrayList.add(z + " 6" + x);
        arrayList.add(z + " 7" + x);
        arrayList.add(z + " 8" + x);
        arrayList.add(z + " 9" + x);
        arrayList.add(z + "0 " + x);
        arrayList.add(z + "01" + x);
        arrayList.add(z + "02" + x);
        arrayList.add(z + "03" + x);
        arrayList.add(z + "04" + x);
        arrayList.add(z + "05" + x);
        arrayList.add(z + "06" + x);
        arrayList.add(z + "07" + x);
        arrayList.add(z + "08" + x);
        arrayList.add(z + "09" + x);
        arrayList.add(z + "10" + x);
        arrayList.add(z + "11" + x);
        arrayList.add(z + "12" + x);
        arrayList.add(z + "13" + x);
        arrayList.add(z + "14" + x);
        arrayList.add(z + "15" + x);
        arrayList.add(z + "16" + x);
        arrayList.add(z + "17" + x);
        arrayList.add(z + "18" + x);
        arrayList.add(z + "19" + x);
        arrayList.add(z + "1 " + x);
        arrayList.add(z + "00" + x);
        return arrayList;
    }

    private static ArrayList<String> fi260() {
        ArrayList<String> arrayList = new ArrayList<>();
        String z = "260";
        String x = "L";
        arrayList.add(z + "  " + x);
        arrayList.add(z + "2 " + x);
        arrayList.add(z + "3 " + x);
        return arrayList;
    }

    private static ArrayList<String> fi300() {
        String z = "300";
        String x = "L";
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add(z + "  " + x);

        return arrayList;
    }

    private static ArrayList<String> fi650() {
        String z = "650";
        String x = "L";
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add(z + "  " + x);
        arrayList.add(z + " 0" + x);
        arrayList.add(z + "00" + x);
        arrayList.add(z + "10" + x);
        arrayList.add(z + "20" + x);
        arrayList.add(z + " 1" + x);
        arrayList.add(z + "01" + x);
        arrayList.add(z + "11" + x);
        arrayList.add(z + "21" + x);
        arrayList.add(z + " 2" + x);
        arrayList.add(z + "02" + x);
        arrayList.add(z + "12" + x);
        arrayList.add(z + "22" + x);
        arrayList.add(z + " 3" + x);
        arrayList.add(z + "03" + x);
        arrayList.add(z + "13" + x);
        arrayList.add(z + "23" + x);
        arrayList.add(z + " 4" + x);
        arrayList.add(z + "04" + x);
        arrayList.add(z + "14" + x);
        arrayList.add(z + "24" + x);
        arrayList.add(z + " 5" + x);
        arrayList.add(z + "05" + x);
        arrayList.add(z + "15" + x);
        arrayList.add(z + "25" + x);
        arrayList.add(z + " 6" + x);
        arrayList.add(z + "06" + x);
        arrayList.add(z + "16" + x);
        arrayList.add(z + "26" + x);
        arrayList.add(z + " 7" + x);
        arrayList.add(z + "07" + x);
        arrayList.add(z + "17" + x);
        arrayList.add(z + "27" + x);
        return arrayList;
    }

    private static ArrayList<String> fi852() {
        ArrayList<String> arrayList = new ArrayList<>();
        String a = "852";
        String x = "L";
        arrayList.add(a + "  " + x);
        arrayList.add(a + " 0" + x);
        arrayList.add(a + " 1" + x);
        arrayList.add(a + " 2" + x);
        arrayList.add(a + "1 " + x);
        arrayList.add(a + "10" + x);
        arrayList.add(a + "11" + x);
        arrayList.add(a + "12" + x);
        arrayList.add(a + "2 " + x);
        arrayList.add(a + "20" + x);
        arrayList.add(a + "21" + x);
        arrayList.add(a + "22" + x);
        arrayList.add(a + "3 " + x);
        arrayList.add(a + "30" + x);
        arrayList.add(a + "31" + x);
        arrayList.add(a + "32" + x);
        arrayList.add(a + "4 " + x);
        arrayList.add(a + "40" + x);
        arrayList.add(a + "41" + x);
        arrayList.add(a + "42" + x);
        arrayList.add(a + "5 " + x);
        arrayList.add(a + "50" + x);
        arrayList.add(a + "51" + x);
        arrayList.add(a + "52" + x);
        arrayList.add(a + "6 " + x);
        arrayList.add(a + "60" + x);
        arrayList.add(a + "61" + x);
        arrayList.add(a + "62" + x);
        arrayList.add(a + "7 " + x);
        arrayList.add(a + "70" + x);
        arrayList.add(a + "71" + x);
        arrayList.add(a + "72" + x);
        arrayList.add(a + "8 " + x);
        arrayList.add(a + "80" + x);
        arrayList.add(a + "81" + x);
        arrayList.add(a + "82" + x);
        return arrayList;
    }

    private static ArrayList<String> fi916() {
        ArrayList<String> arrayList = new ArrayList<>();
        String a = "916";
        String x = "L";
        arrayList.add(a + "  " + x);
        arrayList.add(a + "00" + x);
        return arrayList;
    }

    public static String sp100(String data) {
        int i = 0;
        String author = null;
        for (String f : fi100())
            if (data.indexOf(f) > 0)
                i = data.indexOf(f);
        data = data.substring(i + 9);
        if (data.contains("$$"))
            author = data.substring(0, data.indexOf("$$"));
        else if (data.contains("L$$"))
            author = data.substring(0, data.indexOf("L$$") - 9);
        return author;
    }

    public static String sp245(String data) {
        ArrayList<String> s245 = new ArrayList<>();
        int i = 0;
        String title;
        String author = null;

        for (String f : fi245()) {
            if (data.indexOf(f) > 0) {
                i = data.indexOf(f);
            }
        }
        data = data.substring(i + 6);
        data = data.substring(3, data.indexOf(sp) - 7);

        if (data.contains(mC)) {
            author = data.substring(data.indexOf(mC) + 3);
            if (author.contains("$$")) {
                author = author.substring(0, author.indexOf("$$"));
            }
        }

        title = data.replace(mC + author, " ");

        if (data.contains(mA)) {
            title = title.replace(mA, "");
        }
        if (data.contains(mB)) {
            title = title.replace(mB, "");
        }
        if (data.contains(mF)) {
            title = title.replace(mF, "");
        }
        if (data.contains(mG)) {
            title = title.replace(mG, "");
        }
        if (data.contains(mH)) {
            title = title.replace(mH, "");
        }
        if (data.contains(mK)) {
            title = title.replace(mK, "");
        }
        if (data.contains(mN)) {
            title = title.replace(mN, "");
        }
        if (data.contains(mP)) {
            title = title.replace(mP, "");
        }
        if (data.contains(mS)) {
            title = title.replace(mS, "");
        }
        if (data.contains(m6)) {
            title = title.replace(m6, "");
        }
        if (data.contains(m8)) {
            title = title.replace(m8, "");
        }
        if (title.trim().endsWith("/")) {
            title = title.replace("/", "");
        }
        s245.add(title);
        s245.add(author);
        return s245.get(0);
    }

    private static String sp916(String data) {
        String type = null;
        int i = 0;
        for (String s : fi916()) {
            if (data.contains(s)) {
                i = data.indexOf(s);
                break;
            }
        }
        if (i <= 0) {
            type = null;
        } else {
            data = data.substring(i + 6);
            type = data.substring(0, data.indexOf(sp) - 7);
            if (type.contains(mA)) {
                type = type.replace(mA, "");
            }
        }
        if (type != null) {
            if (type.contains(m0)) {
                String str = type;
                type = str.substring(0, type.indexOf(m0) - 10);
                type = type + str.replace(m0, " - ").substring(str.indexOf(m0));
            }
        } else {
            type = null;
        }

        return type;
    }

    private static String spLDR(String data) {
        String linhvuc;
        if (data.contains(fiLDR)) {
            data = data.substring(data.indexOf(fiLDR) + 6);
            linhvuc = data.substring(0, data.indexOf(sp) - 7);
            if (linhvuc.contains("$$")) {
                linhvuc = linhvuc.replaceAll("$/$_", "");
            }
        } else {
            linhvuc = null;
        }
        return linhvuc;
    }

    private static String sp008(String data) {
        String linhvuc;
        if (data.contains(fi008)) {
            data = data.substring(data.indexOf(fi008) + 6);
            linhvuc = data.substring(0, data.indexOf(sp) - 7);
            if (linhvuc.contains("$$")) {
                linhvuc = linhvuc.replaceAll("$/$_", "");
            }
        } else {
            linhvuc = null;
        }
        return linhvuc;
    }

    private static String sp927(String data) {
        String linhvuc;
        if (data.contains(fi927)) {
            data = data.substring(data.indexOf(fi927) + 6);
            linhvuc = data.substring(0, data.indexOf(sp) - 7);
            if (linhvuc.contains("$$")) {
                linhvuc = linhvuc.replaceAll("$/$_", "");
            }
        } else {
            linhvuc = null;
        }
        return linhvuc;
    }

    private static String sp911(String data) {
        String linhvuc;
        if (data.contains(fi911)) {
            data = data.substring(data.indexOf(fi911) + 6);
            linhvuc = data.substring(0, data.indexOf(sp) - 7);
            if (linhvuc.contains("$$")) {
                linhvuc = linhvuc.replaceAll("$/$_", "");
            }
        } else {
            linhvuc = null;
        }
        return linhvuc;
    }

    private static String sp925(String data) {
        String linhvuc;
        if (data.contains(fi925)) {
            data = data.substring(data.indexOf(fi925) + 6);
            linhvuc = data.substring(0, data.indexOf(sp) - 7);
            if (linhvuc.contains("$$")) {
                linhvuc = linhvuc.replaceAll("$/$_", "");
            }
        } else {
            linhvuc = null;
        }
        return linhvuc;
    }

    private static String spCut(String data, ArrayList<String> fi) {
        String outStr = null;
        int i = 0;
        for (String f : fi) {
            if (data.indexOf(f) > 0) {
                i = data.indexOf(f);
            }
        }
        if (i == 0) {
            outStr = null;
        } else {
            data = data.substring(i + 5);
            data = data.substring(1, i);
            if (data.contains("L$$")) {
                outStr = data.substring(0, data.indexOf("L$$") - 9);
            }
        }
        return outStr;
    }


    public static MarcBean2 marcBeans(String id, String data) {
        String lDR = spLDR(data);
        String sp008 = sp008(data);
        String sp041 = spCut(data, fi041());
        String sp082 = spCut(data, fi082());
        String sp100 = spCut(data, fi100()).toString();
        String sp245 = spCut(data, fi245()).toString();
        String sp260 = spCut(data, fi260()).toString();
        String sp300 = spCut(data, fi300()).toString();
        String sp650 = spCut(data, fi650()).toString();
        String s911 = sp911(data);
        String s925 = sp925(data);
        String s927 = sp927(data);
        return new MarcBean2(id,
                lDR,
                sp008,
                sp041,
                sp082,
                sp100,
                sp245,
                sp260,
                sp300,
                sp650,
                s911,
                s925,
                s927);
    }
}
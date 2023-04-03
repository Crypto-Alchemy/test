package p000;

/* renamed from: o */
/* compiled from: AKTCoin */
public class C2935o {

    /* renamed from: a */
    public static final C9316sw f15752a = new C9316sw(1);

    /* renamed from: b */
    public static final C9316sw f15753b = new C9316sw(0);

    /* renamed from: a */
    public static String m23566a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m23567b(String str) {
        C9316sw swVar = new C9316sw(1);
        C9316sw swVar2 = new C9316sw(2);
        String substring = str.substring(2, (str.length() / 2) + 1);
        String substring2 = str.substring(66);
        m23574i(str);
        C9316sw h = m23573h(substring2);
        h.mo65937p(swVar2);
        if (C9316sw.m72074d(h, swVar) == 0) {
            return "03" + substring;
        }
        return "02" + substring;
    }

    /* renamed from: c */
    public static ex7 m23568c(String str, String str2) {
        ex7 ex7 = new ex7();
        ex7.mo19531p(str2);
        ex7.mo19532q(str);
        ex7.mo19530o();
        return ex7;
    }

    /* renamed from: d */
    public static String m23569d(String str, String str2) {
        byte[] i = m23574i(str);
        cx7 cx7 = new cx7(false);
        cx7.mo18375g(i);
        return cx7.mo18370b(str2);
    }

    /* renamed from: e */
    public static String m23570e(String str, String str2) {
        byte[] i = m23574i(str);
        cx7 cx7 = new cx7(false);
        cx7.mo18375g(i);
        return cx7.mo18372d(str2);
    }

    /* renamed from: f */
    public static String m23571f(String str, String str2) {
        String a = C3311sx.m27171a(str);
        ex7 ex7 = new ex7();
        ex7.mo19535t(a);
        ex7.mo19528m(true);
        String b = ex7.mo19517b(str2);
        if (b.length() != 32) {
            return "error";
        }
        return C2540id3.m19565g(b);
    }

    /* renamed from: g */
    public static String m23572g(String str) {
        String substring = str.substring(0, 2);
        lm1 lm1 = new lm1(m23573h(str.substring(2, 66)));
        if (substring.compareTo("03") == 0) {
            lm1.mo55936m();
        }
        C9316sw i = lm1.mo55932i();
        C9316sw j = lm1.mo55933j();
        return "04" + i.toString() + j.toString();
    }

    /* renamed from: h */
    public static C9316sw m23573h(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        if (length < 64) {
            int i = 64 - length;
            for (int i2 = 0; i2 < i; i2 += 2) {
                stringBuffer.append("00");
            }
            str = String.valueOf(stringBuffer.toString()) + str;
            length = str.length();
        }
        byte[] bArr = new byte[(length / 2)];
        for (int i3 = 0; i3 < length; i3 += 2) {
            bArr[i3 / 2] = (byte) ((Character.digit(str.charAt(i3), 16) << 4) + Character.digit(str.charAt(i3 + 1), 16));
        }
        return C9316sw.m72076i(bArr, 0);
    }

    /* renamed from: i */
    public static byte[] m23574i(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* renamed from: j */
    public static String m23575j(String str, String str2, String str3) {
        return m23569d(m23577l(str, str2), str3);
    }

    /* renamed from: k */
    public static String m23576k(String str, String str2, String str3) {
        return m23570e(m23577l(str, str2), str3);
    }

    /* renamed from: l */
    public static String m23577l(String str, String str2) {
        lm1 lm1 = new lm1(C9316sw.m72075h(m23574i(str2.substring(2, (str2.length() / 2) + 1))), C9316sw.m72075h(m23574i(str2.substring((str2.length() / 2) + 1))));
        new lm1();
        lm1 d = lm1.mo55928d(C9316sw.m72075h(m23574i(str)), new C9316sw(m65.f40785g));
        String swVar = d.mo55932i().toString();
        String str3 = String.valueOf(swVar) + d.mo55933j().toString();
        new cj5();
        return m23566a(cj5.m11892a(C2540id3.m19559a(str3)));
    }

    /* renamed from: m */
    public static String m23578m(String str) {
        lm1 h = lm1.m63867h();
        new lm1();
        lm1 d = h.mo55928d(C9316sw.m72075h(m23574i(str)), new C9316sw(m65.f40785g));
        C9316sw i = d.mo55932i();
        C9316sw j = d.mo55933j();
        String swVar = i.toString();
        String swVar2 = j.toString();
        return "04" + swVar + swVar2;
    }
}

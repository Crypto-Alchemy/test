package p000;

import java.math.BigInteger;
import java.sql.Timestamp;

/* renamed from: d2 */
/* compiled from: AKTSecpUtils */
public class C2127d2 {

    /* renamed from: a */
    public static ow7 f10432a = new ow7();

    /* renamed from: b */
    public static BigInteger f10433b;

    /* renamed from: c */
    public static BigInteger f10434c;

    /* renamed from: d */
    public static Boolean f10435d = Boolean.FALSE;

    /* renamed from: A */
    public static byte[] m14634A(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        for (int i = 0; i < 32; i++) {
            bArr2[31 - i] = bArr[i];
        }
        return bArr2;
    }

    /* renamed from: B */
    public static long m14635B() {
        return (new Timestamp(System.currentTimeMillis()).getTime() / 1000) / 60;
    }

    /* renamed from: a */
    public static String m14636a(ow7 ow7, String str) {
        f10433b = ow7.mo24207a()[0];
        f10434c = ow7.mo24208b();
        String k = ow7.mo24217k();
        C2540id3.m19565g(ow7.mo24214h());
        return m14656u(new String[]{"AKTRequestID", "PING", "AKTAPIID"}, new String[]{"GR8PPP01", k, str}, ow7.mo24213g("SERVER"), ow7.mo24213g("SOCKET"));
    }

    /* renamed from: b */
    public static String m14637b(ow7 ow7, String str) {
        String g = ow7.mo24213g("PONG");
        C3311sx.m27171a(g);
        ow7.mo24212f(f10434c);
        C2540id3.m19565g(ow7.mo24214h());
        String j = ow7.mo24216j(g);
        String str2 = String.valueOf(C3311sx.m27174d(C2540id3.m19564f(cj5.m11892a(C2540id3.m19559a(ow7.mo24213g("EMAIL").toLowerCase()))))) + "@AKT.com";
        ow7.mo24209c(str2, "EMAILB64");
        String l = ow7.mo24218l(str2);
        ow7.mo24218l("2505551212");
        return m14656u(new String[]{"AKTRequestID", "PING", "EMAIL", "TODECRYPT", "AKTAPIID"}, new String[]{"GR8PPP03", j, l, ow7.mo24218l("pppDecrypt"), str}, ow7.mo24213g("SERVER"), ow7.mo24213g("SOCKET"));
    }

    /* renamed from: c */
    public static byte[] m14638c(String str, String str2, String str3) {
        int i;
        cx7 cx7 = new cx7();
        try {
            ex7 ex7 = new ex7();
            ex7.mo19531p(str3);
            ex7.mo19532q(str2);
            ex7.mo19530o();
            String a = C3311sx.m27171a(ex7.mo19520e());
            ex7.mo19522g();
            byte[] a2 = C2540id3.m19559a(a);
            cx7.mo18377i(true);
            if (!cx7.mo18376h(a2, a2.length)) {
                System.out.println("AKTSU 937 Failed to initialize the encryption class.");
                System.out.println("AKTSU 938 Last error: " + cx7.mo18374f() + ".");
                byte[] bArr = new byte[2];
                bArr[0] = 1;
                return bArr;
            }
            int indexOf = str.indexOf("=");
            String str4 = null;
            if (indexOf >= 0) {
                int i2 = indexOf + 1;
                str.substring(0, i2);
                str = str.substring(i2);
            }
            try {
                str4 = cx7.mo18370b(str);
                i = str4.length();
            } catch (Exception unused) {
                i = 0;
            }
            if (i <= 0) {
                byte[] h = C2540id3.m19566h(C2540id3.m19559a(m14653r(str2)), m14653r(str3));
                C2540id3.m19562d(h);
                C3311sx.m27175e(h);
                cx7.mo18377i(true);
                if (!cx7.mo18376h(h, h.length)) {
                    System.out.println("AKTSU 988 Failed to initialize the encryption class.");
                    System.out.println("AKTSU 989 Last error: " + cx7.mo18374f() + ".");
                    byte[] bArr2 = new byte[2];
                    bArr2[0] = 5;
                    return bArr2;
                }
                try {
                    str4 = cx7.mo18370b(str);
                    str4.length();
                } catch (Exception e) {
                    System.out.println("AKTSU 1001 Error: " + e.toString());
                }
                if (str4.length() <= 0) {
                    System.out.println("AKTSU 1006 non recovery error");
                    byte[] bArr3 = new byte[2];
                    bArr3[0] = 9;
                    return bArr3;
                }
            }
            C3311sx.m27174d(str4);
            byte[] a3 = C2540id3.m19559a(str4);
            C2540id3.m19562d(a3);
            return a3;
        } catch (Exception e2) {
            System.out.println("AKTSU 1032: " + e2.toString());
            byte[] bArr4 = new byte[2];
            bArr4[0] = 2;
            return bArr4;
        }
    }

    /* renamed from: d */
    public static void m14639d(ow7 ow7, String str, String str2) {
        ow7.mo24209c(str, str2);
    }

    /* renamed from: e */
    public static String m14640e(ow7 ow7, String str, String str2) {
        ex7 c = C2935o.m23568c(str, str2);
        String e = c.mo19520e();
        String g = c.mo19522g();
        ow7.mo24209c("U5", g);
        ow7.mo24209c("K5", e);
        String str3 = "AKTRequestID=AKTSFMUSER|U5=" + g + "|AKTAPIID=login02|";
        String g2 = ow7.mo24213g("SERVER");
        return "port=" + ow7.mo24213g("SOCKET") + ",server=" + g2 + ",00#" + str3.length() + "#|" + str3;
    }

    /* renamed from: f */
    public static int m14641f(String str) {
        int length = ix7.f13413a.length;
        int i = 0;
        while (true) {
            int i2 = (length + i) / 2;
            int i3 = i2 - 1;
            int compareTo = ix7.f13413a[i3].compareTo(str);
            if (compareTo == 0) {
                return i3;
            }
            if (compareTo > 0) {
                if (length - i < 2) {
                    return i3;
                }
                length = i2;
            } else if (length - i < 2) {
                return i2;
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: g */
    public static String m14642g(byte[] bArr) {
        return C2540id3.m19565g(C2540id3.m19564f(bArr));
    }

    /* renamed from: h */
    public static int m14643h(String str, int i, String[] strArr, int i2) {
        int length = (64 - str.length()) / 2;
        int length2 = (str.length() * 8) / 22;
        if (length > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i3 = 0; i3 < length; i3++) {
                stringBuffer.append("00");
            }
            str = String.valueOf(stringBuffer.toString()) + str;
        }
        C9316sw h = C9316sw.m72075h(C3019p.m24453a(str));
        h.mo65921D(8 - i2);
        for (int i4 = 0; i4 < length2; i4++) {
            i--;
            strArr[i] = ix7.m19846a(h.mo65936o(11));
            h.mo65921D(11);
        }
        return i;
    }

    /* renamed from: i */
    public static String[] m14644i(String str) {
        int length = (str.length() - 2) / 8;
        if (((str.length() - 2) / 8) * 8 != str.length() - 2) {
            return null;
        }
        int length2 = (((str.length() - 2) * 4) + length) / 11;
        String[] strArr = new String[length2];
        if (length2 > 21) {
            m14643h(str.substring(0, 44), m14643h(str.substring(44), length2, strArr, length), strArr, length);
        } else {
            m14643h(str, length2, strArr, length);
        }
        return strArr;
    }

    /* renamed from: j */
    public static String m14645j(String str, String str2, String str3) {
        ex7 ex7 = new ex7();
        ex7.mo19535t(C3311sx.m27171a(str));
        ex7.mo19528m(false);
        String b = ex7.mo19517b(str2);
        if (b.length() != 32) {
            return "error";
        }
        ex7.mo19535t(b);
        return C2540id3.m19565g(ex7.mo19517b(str3));
    }

    /* renamed from: k */
    public static String m14646k(String str, String str2, String str3) {
        ex7 ex7 = new ex7();
        ex7.mo19535t(C3311sx.m27171a(str));
        ex7.mo19528m(false);
        String b = ex7.mo19517b(str2);
        if (b.length() != 32) {
            return "error";
        }
        ex7.mo19535t(b);
        return ex7.mo19518c(C2540id3.m19564f(C3019p.m24453a(str3)));
    }

    /* renamed from: l */
    public static C9316sw m14647l(String str) {
        byte[] a = C3019p.m24453a(str);
        int length = str.length() / 2;
        byte[] bArr = new byte[32];
        for (int i = 0; i < 32; i++) {
            if (i < length) {
                bArr[31 - i] = a[(length - i) - 1];
            } else {
                bArr[31 - i] = 0;
            }
        }
        new C9316sw(0);
        C9316sw h = C9316sw.m72075h(bArr);
        byte[] bArr2 = new byte[32];
        h.mo65923H(bArr2);
        m14642g(bArr2);
        C2540id3.m19559a(h.toString());
        m14642g(cj5.m11892a(bArr2));
        return h;
    }

    /* renamed from: m */
    public static String m14648m(String str) {
        boolean z;
        int length = str.length();
        if (length != 64 && length != 66) {
            return null;
        }
        String str2 = str;
        int i = 0;
        while (true) {
            if (i >= 5) {
                break;
            }
            int i2 = 24 - ((4 - i) * 3);
            if (i2 < 24) {
                int i3 = ((i2 * 8) / 3) + 2;
                String substring = str.substring(0, i3);
                str.substring(i3);
                new C9316sw(0);
                C3019p.m24453a(substring);
                C9316sw l = m14647l(str.substring(0, i3 - 2));
                l.mo65920C(256 - ((i2 * 32) / 3));
                byte[] bArr = new byte[32];
                l.mo65923H(bArr);
                C2540id3.m19565g(C2540id3.m19564f(bArr));
                byte[] a = cj5.m11892a(bArr);
                String g = C2540id3.m19565g(C2540id3.m19564f(a));
                C2540id3.m19564f(a);
                String substring2 = str.substring(i3);
                String substring3 = g.substring(0, 64 - i3);
                if (substring2.compareTo(substring3) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                C2540id3.m19565g(substring2);
                C2540id3.m19565g(substring3);
                if (z) {
                    str2 = str.substring(0, i3);
                    break;
                }
            } else if (str.length() < 66) {
                str2 = str + C2540id3.m19565g(C2540id3.m19564f(cj5.m11892a(C3019p.m24453a(str)))).substring(0, 2);
            }
            i++;
        }
        String[] i4 = m14644i(str2);
        String str3 = "";
        for (int i5 = 0; i5 < i4.length; i5++) {
            str3 = String.valueOf(str3) + i4[i5] + "|";
        }
        return str3;
    }

    /* renamed from: n */
    public static String[] m14649n() {
        String g = C2540id3.m19565g(C2540id3.m19560b(32));
        return new String[]{g, C2935o.m23567b(C2935o.m23578m(g))};
    }

    /* renamed from: o */
    public static String m14650o(String str) {
        String replace = str.replace(" ", "|");
        String[] w = m14658w(replace, "|");
        int length = w.length;
        int i = 0;
        C9316sw swVar = new C9316sw(0);
        C9316sw swVar2 = new C9316sw(0);
        byte[] bArr = new byte[32];
        for (int i2 = 0; i2 < length; i2++) {
            int f = m14641f(w[i2]);
            Integer.toHexString(f);
            C9316sw swVar3 = new C9316sw(f);
            if (i2 < 23) {
                swVar = swVar.mo65944z(new C9316sw(swVar3.mo65936o(11)));
            } else {
                swVar2 = swVar2.mo65944z(new C9316sw(swVar3.mo65936o(11)));
            }
            swVar.mo65923H(bArr);
            if (i2 < length - 1 && i2 != 22) {
                swVar.mo65920C(11);
            }
        }
        if (length > 21) {
            byte[] bArr2 = new byte[32];
            byte[] bArr3 = new byte[32];
            swVar.mo65920C(3);
            swVar.mo65923H(bArr2);
            byte[] bArr4 = new byte[32];
            C9316sw swVar4 = new C9316sw(0);
            C9316sw swVar5 = new C9316sw(0);
            swVar5.mo65926a(swVar2);
            swVar5.mo65921D(8);
            swVar.mo65926a(swVar5);
            C9316sw z = swVar4.mo65944z(new C9316sw(swVar2.mo65936o(8)));
            z.mo65920C(248);
            z.mo65923H(bArr3);
            String substring = C2540id3.m19565g(C2540id3.m19564f(bArr3)).substring(0, 2);
            swVar.mo65923H(bArr2);
            for (int i3 = 0; i3 < 32; i3++) {
                bArr4[i3] = bArr2[i3];
            }
            if (substring.compareTo(C2540id3.m19565g(C2540id3.m19564f(cj5.m11892a(bArr4))).substring(0, 2)) == 0) {
                i = 1;
            }
            if (i != 0) {
                return m14642g(bArr4);
            }
            System.out.println("1312 AKTS invalid mnemonic=" + replace);
            return "0000000000000000000000000000000000000000000000000000000000000000";
        }
        int i4 = length / 3;
        C9316sw swVar6 = new C9316sw(swVar.mo65936o(i4));
        byte[] bArr5 = new byte[32];
        swVar6.mo65920C(248);
        swVar6.mo65923H(bArr5);
        String g = m14642g(bArr5);
        C9316sw swVar7 = new C9316sw(0);
        swVar7.mo65926a(swVar);
        swVar7.mo65921D(i4);
        swVar7.mo65920C(256 - ((length * 32) / 3));
        byte[] bArr6 = new byte[32];
        swVar7.mo65923H(bArr6);
        int i5 = (length * 4) / 3;
        byte[] bArr7 = new byte[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            bArr7[i6] = bArr6[i6];
        }
        m14642g(bArr7);
        byte[] a = C2540id3.m19559a(m14642g(cj5.m11892a(bArr7)));
        byte[] a2 = C2540id3.m19559a(g);
        C2540id3.m19564f(a);
        C2540id3.m19564f(a2);
        if (length == 12) {
            byte b = a[0];
            byte b2 = a2[1];
        }
        byte[] bArr8 = new byte[32];
        swVar.mo65920C(i4);
        swVar.mo65920C(((64 - ((length * 8) / 3)) * 4) - 8);
        byte[] a3 = cj5.m11892a(bArr6);
        swVar.mo65923H(bArr6);
        m14642g(a3);
        int i7 = (32 - ((8 - i4) * 4)) + 1;
        int i8 = 32 - i7;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            bArr8[i10] = bArr6[i9];
            i9++;
            i10++;
        }
        while (i < i8) {
            bArr8[i10] = a3[i];
            i++;
            i10++;
        }
        return m14642g(bArr8);
    }

    /* renamed from: p */
    public static String m14651p(ow7 ow7) {
        return ow7.mo24213g("questions");
    }

    /* renamed from: q */
    public static String m14652q(ow7 ow7, String str) {
        return ow7.mo24213g(str);
    }

    /* renamed from: r */
    public static String m14653r(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            stringBuffer.append(C2540id3.m19568j(str.charAt(i)));
        }
        int length2 = stringBuffer.toString().length();
        byte[] bArr = new byte[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            bArr[i2] = (byte) stringBuffer.toString().charAt(i2);
        }
        return C2540id3.m19564f(bArr);
    }

    /* renamed from: s */
    public static void m14654s(ow7 ow7, String str, String str2) {
        f10432a = ow7;
        ow7.mo24209c("SERVER", str);
        f10432a.mo24209c("SOCKET", str2);
    }

    /* renamed from: t */
    public static boolean m14655t(String str, String str2) {
        String a = C3311sx.m27171a(str2);
        ex7 ex7 = new ex7();
        ex7.mo19535t(a);
        if (ex7.mo19517b(str).length() == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static String m14656u(String[] strArr, String[] strArr2, String str, String str2) {
        String str3 = "";
        for (int i = 0; i < strArr.length; i++) {
            str3 = String.valueOf(str3) + "|" + strArr[i] + "=" + strArr2[i];
        }
        return String.valueOf("port=" + str2 + ",server=" + str) + ",00#" + str3.length() + "#" + str3 + "|";
    }

    /* renamed from: v */
    public static String m14657v(String str, String str2) {
        ex7 ex7 = new ex7();
        ex7.mo19531p(str2);
        ex7.mo19532q(str);
        ex7.mo19530o();
        String a = C3311sx.m27171a(ex7.mo19520e());
        byte[] a2 = C2540id3.m19559a(C3311sx.m27171a(ex7.mo19522g()));
        byte[] a3 = C2540id3.m19559a(a);
        byte[] bArr = new byte[40];
        for (int i = 0; i < 20; i++) {
            bArr[i] = a2[i];
            bArr[i + 20] = a3[i];
        }
        byte[] a4 = cj5.m11892a(bArr);
        new C9316sw(0);
        C9316sw h = C9316sw.m72075h(a4);
        byte[] bArr2 = new byte[32];
        h.mo65923H(bArr2);
        String str3 = "";
        boolean z = false;
        int i2 = 0;
        while (!z) {
            if (a4[0] == -82) {
                str3 = C2540id3.m19565g(C2540id3.m19564f(bArr2));
                z = true;
            } else {
                int i3 = i2 + 1;
                if (i2 > 10000) {
                    z = true;
                } else {
                    h.mo65933l(1);
                    h.mo65923H(bArr2);
                    a4 = cj5.m11892a(bArr2);
                }
                i2 = i3;
            }
        }
        if (i2 >= 10000) {
            return null;
        }
        return str3;
    }

    /* renamed from: w */
    public static String[] m14658w(String str, String str2) {
        String[] strArr = new String[50];
        int lastIndexOf = str.lastIndexOf(124);
        if (lastIndexOf + 3 > str.length()) {
            str = str.substring(0, lastIndexOf);
        }
        int indexOf = str.indexOf(124);
        if (indexOf < 2) {
            str = str.substring(indexOf + 1);
        }
        int indexOf2 = str.indexOf(124);
        int i = 0;
        do {
            strArr[i] = str.substring(0, indexOf2);
            str = str.substring(indexOf2 + 1);
            i++;
            indexOf2 = str.indexOf(124);
        } while (indexOf2 > 0);
        int i2 = i + 1;
        strArr[i] = str;
        String[] strArr2 = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr2[i3] = strArr[i3];
        }
        return strArr2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14659x(p000.ow7 r10, java.lang.String[] r11) {
        /*
            r0 = 1
            r1 = r0
        L_0x0002:
            int r2 = r11.length
            if (r1 < r2) goto L_0x000c
            java.lang.String r11 = "login"
            java.lang.String r10 = m14636a(r10, r11)
            return r10
        L_0x000c:
            r2 = r11[r1]
            java.lang.String r3 = "="
            java.lang.String[] r2 = r2.split(r3)
            r3 = 0
            r3 = r2[r3]
            int r4 = r3.hashCode()
            switch(r4) {
                case 2390: goto L_0x0085;
                case 79528: goto L_0x0079;
                case 84016: goto L_0x006d;
                case 66081660: goto L_0x0037;
                case 1543712160: goto L_0x002e;
                case 1924154731: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0094
        L_0x0020:
            java.lang.String r4 = "AKTAPIID"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x002a
            goto L_0x0094
        L_0x002a:
            r2 = r2[r0]
            goto L_0x00a9
        L_0x002e:
            java.lang.String r4 = "AKTRequestID"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00a9
            goto L_0x0094
        L_0x0037:
            java.lang.String r4 = "EMAIL"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0040
            goto L_0x0094
        L_0x0040:
            java.lang.String r3 = "K5"
            java.lang.String r5 = m14652q(r10, r3)
            java.lang.String r6 = "U5"
            java.lang.String r7 = m14652q(r10, r6)
            ex7 r8 = new ex7
            r8.<init>()
            java.lang.String r9 = p000.C3311sx.m27171a(r5)
            r8.mo19535t(r9)
            r2 = r2[r0]
            java.lang.String r2 = r8.mo19517b(r2)
            m14639d(r10, r4, r2)
            m14639d(r10, r6, r7)
            m14639d(r10, r3, r5)
            java.lang.String r3 = "TEMPEMAIL"
            m14639d(r10, r3, r2)
            goto L_0x00a9
        L_0x006d:
            java.lang.String r4 = "UID"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0076
            goto L_0x0094
        L_0x0076:
            r2 = r2[r0]
            goto L_0x00a9
        L_0x0079:
            java.lang.String r4 = "PSK"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0082
            goto L_0x0094
        L_0x0082:
            r2 = r2[r0]
            goto L_0x00a9
        L_0x0085:
            java.lang.String r4 = "KA"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x008e
            goto L_0x0094
        L_0x008e:
            r2 = r2[r0]
            m14639d(r10, r4, r2)
            goto L_0x00a9
        L_0x0094:
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "AKTSU 1390 should not be here="
            r4.<init>(r5)
            r2 = r2[r0]
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.println(r2)
        L_0x00a9:
            int r1 = r1 + 1
            goto L_0x0002
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2127d2.m14659x(ow7, java.lang.String[]):java.lang.String");
    }

    /* renamed from: y */
    public static void m14660y(ow7 ow7, String[] strArr) {
        for (int i = 1; i < strArr.length; i++) {
            String[] split = strArr[i].split("=");
            String str = split[0];
            int hashCode = str.hashCode();
            if (hashCode != 2461688) {
                if (hashCode != 1543712160) {
                    if (hashCode == 1924154731 && str.equals("AKTAPIID")) {
                        String str2 = split[1];
                    }
                } else if (str.equals("AKTRequestID")) {
                }
            } else if (str.equals("PONG")) {
                String str3 = split[1];
            }
            System.out.println("AKTSU 1331 should not be here=" + split[1]);
        }
    }

    /* renamed from: z */
    public static String m14661z(ow7 ow7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        ow7 ow72 = ow7;
        String str9 = str;
        String str10 = str3;
        ex7 ex7 = new ex7();
        ex7.mo19531p(str10);
        ex7.mo19532q(str2);
        ex7.mo19530o();
        String e = ex7.mo19520e();
        String a = C3311sx.m27171a(e);
        String g = ex7.mo19522g();
        String f = C2540id3.m19564f(C3019p.m24453a(str8));
        ex7.mo19535t(a);
        ex7.mo19528m(true);
        String c = ex7.mo19518c(f);
        String replace = str5.toLowerCase().replace(" ", "");
        String replace2 = str7.toLowerCase().replace(" ", "");
        byte[] bArr = new byte[20];
        int i = 0;
        while (i < 20) {
            String str11 = replace2;
            bArr[i] = -96;
            i++;
            String str12 = str2;
            str10 = str10;
            str9 = str;
            replace = replace;
            ow72 = ow7;
        }
        int i2 = 0;
        while (i2 < replace.length()) {
            String str13 = replace;
            String str14 = replace2;
            bArr[i2] = (byte) str13.charAt(i2);
            i2++;
            String str15 = str2;
            str10 = str10;
            str9 = str;
            replace = str13;
            ow72 = ow7;
        }
        int i3 = 0;
        while (i3 < replace2.length()) {
            String str16 = replace2;
            bArr[(20 - i3) - 1] = (byte) str16.charAt(i3);
            i3++;
            String str17 = str2;
            replace2 = str16;
            str10 = str10;
            str9 = str;
            replace = replace;
            ow72 = ow7;
        }
        byte[] a2 = cj5.m11892a(bArr);
        ex7 ex72 = new ex7();
        ex72.mo19535t(C2540id3.m19564f(a2));
        ex72.mo19528m(true);
        String c2 = ex72.mo19518c(f);
        ex72.mo19534s();
        ex72.mo19535t(f);
        ex72.mo19528m(true);
        String c3 = ex72.mo19518c(String.valueOf(str2) + " " + str10);
        String d = C3311sx.m27174d(C2540id3.m19564f(cj5.m11892a(C2540id3.m19559a(f))));
        byte[] a3 = C2540id3.m19559a(f);
        int i4 = 32;
        byte[] bArr2 = new byte[32];
        String str18 = replace2;
        int i5 = 0;
        while (i5 < i4) {
            String str19 = str18;
            String str20 = c3;
            byte[] bArr3 = bArr2;
            String str21 = replace;
            String str22 = str3;
            bArr3[31 - i5] = a3[i5];
            i5++;
            replace = str21;
            bArr2 = bArr3;
            i4 = i4;
            ow72 = ow7;
            str9 = str;
            c3 = str20;
        }
        String d2 = C3311sx.m27174d(C2540id3.m19564f(cj5.m11892a(bArr2)));
        byte[] a4 = C2540id3.m19559a(a);
        C2540id3.m19562d(a4);
        C2540id3.m19565g(a);
        C2540id3.m19565g(a);
        m14642g(a4);
        ow72.mo24209c("U5", g);
        ow72.mo24209c("K5", e);
        ow72.mo24209c("KA", c);
        ow72.mo24209c("PBU5", d);
        ow72.mo24209c("PB5K", d2);
        ow72.mo24209c("EMAIL", str9);
        long B = m14635B();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(B);
        ow72.mo24209c("TIMENOW", stringBuffer.toString());
        String[] strArr = new String[21];
        C2540id3.m19565g(f);
        StringBuffer stringBuffer2 = new StringBuffer("");
        String[] strArr2 = {"AKTRequestID", "EMAIL", "KA", "SECURITYLEVEL", "KS", "U5", "PBU5", "PB5K", "UPKEY", "UPKEYH", "AKTAPIID", "FN", "QN1", "QN2", "KPPP", "PSK", "K5", "AN1", "AN2", "U", "P"};
        int i6 = 0;
        while (i6 < f.length()) {
            String str23 = str18;
            String str24 = replace;
            String str25 = str3;
            stringBuffer2.append(f.charAt((f.length() - i6) - 1));
            i6++;
            c3 = c3;
            replace = str24;
            strArr2 = strArr2;
            ow72 = ow7;
            str9 = str;
        }
        String stringBuffer3 = stringBuffer2.toString();
        String a5 = C3311sx.m27171a(g);
        C3311sx.m27174d(f);
        C2540id3.m19565g(a5);
        C2540id3.m19565g(a);
        C2540id3.m19565g(stringBuffer3);
        String b = fx7.m17478b(f);
        C3311sx.m27174d(b);
        String f2 = C2540id3.m19564f(cj5.m11892a(C2540id3.m19559a("" + stringBuffer3)));
        C3311sx.m27174d(f2);
        C2540id3.m19565g(f2);
        String f3 = C2540id3.m19564f(cj5.m11892a(C2540id3.m19559a(c3)));
        String b2 = C2540id3.m19560b(32);
        C3311sx.m27174d(C2540id3.m19564f(cj5.m11892a(C2540id3.m19559a(str.toLowerCase()))));
        ow72.mo24209c("EMAIL", str9);
        String l = ow7.mo24218l(str);
        ow72.mo24218l(" ");
        String l2 = ow72.mo24218l(a5);
        String l3 = ow72.mo24218l(a);
        String l4 = ow72.mo24218l(b);
        String l5 = ow72.mo24218l(f2);
        String l6 = ow72.mo24218l(c3);
        String l7 = ow72.mo24218l(f3);
        String l8 = ow72.mo24218l(c);
        String l9 = ow72.mo24218l(c2);
        String l10 = ow72.mo24218l("ZecureIT.uky");
        String l11 = ow72.mo24218l(str4);
        String l12 = ow72.mo24218l(str6);
        String str26 = l3;
        String l13 = ow72.mo24218l("1");
        String l14 = ow72.mo24218l(b2);
        String l15 = ow72.mo24218l(replace);
        String l16 = ow72.mo24218l(str18);
        String l17 = ow72.mo24218l(str2);
        String l18 = ow72.mo24218l(str3);
        String g2 = ow72.mo24213g("KPPP");
        strArr[0] = "GR8Reg01";
        strArr[1] = l;
        strArr[2] = l8;
        strArr[3] = l13;
        strArr[4] = l9;
        strArr[5] = l2;
        strArr[6] = l4;
        strArr[7] = l5;
        strArr[8] = l6;
        strArr[9] = l7;
        strArr[10] = "GR8Reg01";
        strArr[11] = l10;
        strArr[12] = l11;
        strArr[13] = l12;
        strArr[14] = g2;
        strArr[15] = l14;
        strArr[16] = str26;
        strArr[17] = l15;
        strArr[18] = l16;
        strArr[19] = l17;
        strArr[20] = l18;
        return m14656u(strArr2, strArr, ow72.mo24213g("SERVER"), ow72.mo24213g("SOCKET"));
    }
}

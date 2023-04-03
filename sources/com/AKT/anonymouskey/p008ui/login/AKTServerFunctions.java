package com.AKT.anonymouskey.p008ui.login;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0729l;
import java.util.Locale;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.activity.common.BasicActivity;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;

/* renamed from: com.AKT.anonymouskey.ui.login.AKTServerFunctions */
public abstract class AKTServerFunctions extends BasicActivity {

    /* renamed from: r */
    public ProgressLoading f8528r;

    /* renamed from: s */
    public boolean f8529s = false;

    /* renamed from: x */
    public MultiWalletViewModel f8530x;

    /* renamed from: y */
    public ow7 f8531y = MyApplicationClass.m64669c().f41192x;

    public AKTServerFunctions() {
        System.loadLibrary("TrustWalletCore");
    }

    /* renamed from: S */
    public static String m12035S(String str) {
        String f = C2540id3.m19564f(cj5.m11892a(C2540id3.m19559a(str.toLowerCase())));
        return C3311sx.m27174d(f) + "@akt.com";
    }

    /* renamed from: U */
    public static String m12036U(Context context, String str) {
        String i = f06.m57518i(context, "PBU5");
        String str2 = "|AKTRequestID=CHANGEEMAIL|PBU5=" + i;
        String str3 = str2 + "|EMAIL=" + m12035S(str) + "|AKTAPIID=CHANGE|";
        return ("server=" + C9198q.f44134e + ",port=" + C9198q.f44135f) + ",00#" + str3.length() + "#" + str3;
    }

    /* renamed from: Z */
    public static byte[] m12037Z(String str, String str2) {
        String replace = str.toLowerCase().replace(" ", "");
        String replace2 = str2.toLowerCase().replace(" ", "");
        int length = replace.length();
        int i = 32;
        if (length > 32) {
            length = 32;
        }
        byte[] bArr = new byte[32];
        for (int i2 = 0; i2 < 32; i2++) {
            if (i2 < length) {
                bArr[i2] = (byte) (((byte) replace.charAt(i2)) ^ 202);
            } else {
                bArr[i2] = -54;
            }
        }
        int length2 = replace2.length();
        if (length2 <= 32) {
            i = length2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 31 - i3;
            bArr[i4] = (byte) (bArr[i4] ^ ((byte) replace2.charAt(i3)));
        }
        C2540id3.m19565g(C2540id3.m19564f(bArr));
        C2540id3.m19565g(C2540id3.m19564f(bArr));
        return cj5.m11892a(bArr);
    }

    /* renamed from: a0 */
    public static String m12038a0(Context context) {
        String str = "|AKTRequestID=GETBLOB|PBU5=" + f06.m57518i(context, "PBU5") + "|AKTAPIID=getblob|";
        return ("server=" + C9198q.f44134e + ",port=" + C9198q.f44135f) + ",00#" + str.length() + "#" + str;
    }

    /* renamed from: g0 */
    public static String m12039g0(Context context, String str) {
        String str2 = "|AKTRequestID=PUTBLOB|PBU5=" + f06.m57518i(context, "PBU5") + "|BLOB=" + str + "|AKTAPIID=putblob|";
        return ("server=" + C9198q.f44134e + ",port=" + C9198q.f44135f) + ",00#" + str2.length() + "#" + str2;
    }

    /* renamed from: h0 */
    public static String m12040h0(Context context, String str) {
        return C2935o.m23575j(f06.m57518i(context, "ICEPRIVKEY"), C9198q.f44136g, str);
    }

    /* renamed from: l0 */
    public static String m12041l0(Context context, String str) {
        String[] n = C2127d2.m14649n();
        f06.m57524o(context, "ICEPRIVKEY", n[0]);
        f06.m57524o(context, "ICEPUBKEY", n[1]);
        String k = C2935o.m23576k(n[0], C9198q.f44136g, str);
        return n[1] + "|LSON=" + k + "|";
    }

    /* renamed from: R */
    public String mo12155R(ow7 ow7, String str, boolean z) {
        String str2;
        String str3 = C9198q.f44136g;
        String[] n = C2127d2.m14649n();
        String str4 = n[0];
        String str5 = n[1];
        f06.m57524o(this, "ICEPRIVKEY", str4);
        f06.m57524o(this, "ICEPUBKEY", str5);
        String l = C2935o.m23577l(str4, str3);
        if (z) {
            str2 = C2935o.m23570e(l, m12035S(str));
        } else {
            str2 = C2935o.m23570e(l, str);
        }
        String[] strArr = new String[5];
        String h = Common.f42577a.mo60902h(this, (String) null);
        String[] strArr2 = {"AKTRequestID", "EMAIL", "PUBKEY", "LANG", "AKTAPIID"};
        strArr[0] = "AKTSFMICE03";
        strArr[1] = str2;
        strArr[2] = str5;
        strArr[3] = h;
        if (z) {
            strArr[4] = "FORGOT";
        } else {
            strArr[4] = "AKTSFMICE03";
        }
        return C2127d2.m14656u(strArr2, strArr, C9198q.f44134e, C9198q.f44135f);
    }

    /* renamed from: T */
    public String mo12156T(ow7 ow7, String str, String str2) {
        ex7 c = C2935o.m23568c(str, str2);
        String e = c.mo19520e();
        String g = c.mo19522g();
        ow7.mo24209c("U5", g);
        ow7.mo24209c("K5", e);
        String str3 = "AKTRequestID=AKTAUTHUSER|U5=" + g + "|AKTAPIID=login02|";
        String g2 = ow7.mo24213g("SERVER");
        return "port=" + ow7.mo24213g("SOCKET") + ",server=" + g2 + ",00#" + str3.length() + "#|" + str3;
    }

    /* renamed from: V */
    public String mo12157V(String str, String str2) {
        ex7 ex7 = new ex7();
        ex7.mo19531p(str2);
        ex7.mo19532q(str);
        ex7.mo19530o();
        C3311sx.m27171a(ex7.mo19520e());
        String str3 = "|AKTRequestID=CHECKFORU5|U5=" + ex7.mo19522g() + "|AKTAPIID=checkU5|";
        String str4 = "server=" + C9198q.f44134e + ",port=" + C9198q.f44135f;
        String str5 = str4 + ",00#" + str3.length() + "#" + str3;
        dq6.m57042b("Lynn").mo51264a("667 AKTS toSend=" + str3, new Object[0]);
        return str5;
    }

    /* renamed from: W */
    public void mo12158W() {
        rl7.m71598a(getApplicationContext()).execute();
        f06.m57510a(this);
        up1.m72956a(this);
    }

    /* renamed from: X */
    public abstract void mo12159X();

    /* renamed from: Y */
    public byte[] mo12160Y(String str, String str2) {
        String replace = str.toLowerCase().replace(" ", "");
        String replace2 = str2.toLowerCase().replace(" ", "");
        int i = 20;
        byte[] bArr = new byte[20];
        for (int i2 = 0; i2 < 20; i2++) {
            bArr[i2] = -96;
        }
        int length = replace.length();
        if (length > 20) {
            length = 20;
        }
        for (int i3 = 0; i3 < length; i3++) {
            bArr[i3] = (byte) replace.charAt(i3);
        }
        int length2 = replace2.length();
        if (length2 <= 20) {
            i = length2;
        }
        for (int i4 = 0; i4 < i; i4++) {
            bArr[(20 - i4) - 1] = (byte) replace2.charAt(i4);
        }
        return cj5.m11892a(bArr);
    }

    /* renamed from: b0 */
    public String mo12161b0(String str, String str2, String str3) {
        byte[] Z = m12037Z(str2, str3);
        C2540id3.m19565g(C2540id3.m19564f(Z));
        ex7 ex7 = new ex7();
        ex7.mo19535t(C2540id3.m19564f(Z));
        ex7.mo19528m(true);
        String b = ex7.mo19517b(str);
        if (b.length() != 32) {
            byte[] Y = mo12160Y(str2, str3);
            C2540id3.m19565g(C2540id3.m19564f(Y));
            ex7.mo19535t(C2540id3.m19564f(Y));
            ex7.mo19528m(true);
            b = ex7.mo19517b(str);
        }
        return C2540id3.m19565g(b);
    }

    /* renamed from: c0 */
    public String mo12162c0(String str) {
        return C2935o.m23575j(f06.m57518i(this, "ICEPRIVKEY"), C9198q.f44136g, str);
    }

    /* renamed from: d0 */
    public boolean mo12163d0(String str) {
        boolean equals = str.toUpperCase(Locale.ROOT).equals("CONNECTION_REFUSED");
        if (equals) {
            ProgressLoading progressLoading = this.f8528r;
            if (progressLoading != null) {
                progressLoading.mo22266k();
            }
            mo57001Q(true);
            mo12159X();
        }
        return equals;
    }

    /* renamed from: e0 */
    public void mo12164e0(ow7 ow7, String str) {
        String str2;
        if (!mo12163d0(str)) {
            String[] w = C2127d2.m14658w(Common.f42577a.mo60918y(this, str), "|");
            int length = w.length;
            String[] split = w[0].split("=");
            if (split.length > 1) {
                str2 = split[1].toUpperCase();
            } else {
                str2 = "";
            }
            str2.hashCode();
            if (str2.equals("AKTSERVERERROR")) {
                mo12159X();
                mo12165f0(w, w[length - 1].split("=")[1]);
            } else if (!str2.equals("PUBKEY02")) {
                mo12159X();
            } else {
                mo12159X();
                String[] split2 = w[1].split("=");
                if (split2.length > 1) {
                    f06.m57524o(this, "SERPUBKEY", C2935o.m23572g(split2[1]));
                }
                ProgressLoading progressLoading = this.f8528r;
                if (progressLoading != null) {
                    progressLoading.mo22266k();
                }
            }
        }
    }

    /* renamed from: f0 */
    public void mo12165f0(String[] strArr, String str) {
        ProgressLoading progressLoading = this.f8528r;
        if (progressLoading != null) {
            progressLoading.mo22266k();
        }
    }

    /* renamed from: i0 */
    public String mo12166i0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        String[] strArr;
        String[] strArr2;
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        ex7 ex7 = new ex7();
        ex7.mo19531p(str13);
        ex7.mo19532q(str12);
        ex7.mo19530o();
        String e = ex7.mo19520e();
        String a = C3311sx.m27171a(e);
        String g = ex7.mo19522g();
        String f = C2540id3.m19564f(C3019p.m24453a(str10));
        String g2 = C2540id3.m19565g(f);
        byte[] h = C2540id3.m19566h(C2540id3.m19559a(C2127d2.m14653r(str2)), C2127d2.m14653r(str3));
        String f2 = C2540id3.m19564f(h);
        String d = C3311sx.m27174d(C2540id3.m19564f(h));
        ex7.mo19535t(f2);
        ex7.mo19528m(true);
        String c = ex7.mo19518c(f);
        byte[] Z = m12037Z(str5, str7);
        ex7 ex72 = new ex7();
        ex72.mo19535t(C2540id3.m19564f(Z));
        ex72.mo19528m(true);
        String c2 = ex72.mo19518c(f);
        ex72.mo19534s();
        ex72.mo19535t(f);
        ex72.mo19528m(true);
        String c3 = ex72.mo19518c(str12 + " " + str13);
        String b = fx7.m17478b(f);
        String d2 = C3311sx.m27174d(b);
        byte[] a2 = C2540id3.m19559a(f);
        byte[] bArr = new byte[32];
        String str14 = c2;
        for (int i = 0; i < 32; i++) {
            bArr[31 - i] = a2[i];
        }
        String d3 = C3311sx.m27174d(C2540id3.m19564f(cj5.m11892a(bArr)));
        f06.m57524o(this, "U5", g);
        f06.m57524o(this, "KA", c);
        String str15 = b;
        f06.m57524o(this, "PBU5", d2);
        String str16 = a;
        f06.m57524o(this, "PB5K", d3);
        String str17 = " ";
        f06.m57524o(this, "EMAIL", str11);
        String str18 = c3;
        this.f8531y.mo24209c("U5", g);
        String str19 = g;
        this.f8531y.mo24209c("K5", e);
        String str20 = f;
        this.f8531y.mo24209c("UK5", d);
        this.f8531y.mo24209c("KA", c);
        this.f8531y.mo24209c("PBU5", d2);
        this.f8531y.mo24209c("PB5K", d3);
        this.f8531y.mo24209c("PBHEX", g2);
        this.f8531y.mo24209c("EMAIL", str11);
        mo12167j0("K5", e);
        mo12167j0("UK5", d);
        boolean z = C9198q.f44130a;
        if (z) {
            strArr = new String[22];
            strArr2 = new String[22];
        } else {
            strArr = new String[17];
            strArr2 = new String[17];
        }
        strArr[0] = "AKTRequestID";
        strArr[0] = "AKTRequestID";
        strArr[1] = "EMAIL";
        strArr[2] = "KA";
        strArr[3] = "SECURITYLEVEL";
        strArr[4] = "KS";
        strArr[5] = "U5";
        strArr[6] = "PBU5";
        strArr[7] = "PB5K";
        strArr[8] = "UPKEY";
        strArr[9] = "UPKEYH";
        strArr[10] = "AKTAPIID";
        strArr[11] = "FN";
        strArr[12] = "QN1";
        strArr[13] = "QN2";
        strArr[14] = "PSK";
        strArr[15] = "Q1";
        strArr[16] = "Q2";
        if (z) {
            strArr[17] = "K5";
            strArr[18] = "AN1";
            strArr[19] = "AN2";
            strArr[20] = "U";
            strArr[21] = "P";
        }
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i2 = 0; i2 < str20.length(); i2++) {
            stringBuffer.append(str20.charAt((str20.length() - i2) - 1));
        }
        String f3 = C2540id3.m19564f(cj5.m11892a(C2540id3.m19559a("" + stringBuffer)));
        String f4 = C2540id3.m19564f(cj5.m11892a(C2540id3.m19559a(str18)));
        String b2 = C2540id3.m19560b(32);
        String f5 = C2540id3.m19564f(cj5.m11892a(C2540id3.m19559a(str.toLowerCase())));
        String str21 = C3311sx.m27174d(f5) + "@akt.com";
        f06.m57524o(this, "EMAIL", str21);
        f06.m57524o(this, "EMAILRAW", str11);
        String[] n = C2127d2.m14649n();
        String str22 = n[0];
        String str23 = n[1];
        f06.m57524o(this, "ICEPRIVKEY", str22);
        f06.m57524o(this, "ICEPUBKEY", str23);
        byte[] a3 = C3019p.m24453a(C2935o.m23577l(str22, C9198q.f44136g));
        String f6 = C2540id3.m19564f(a3);
        cx7 cx7 = new cx7(false);
        cx7.mo18375g(a3);
        cx7.mo18377i(false);
        ex7 ex73 = new ex7();
        ex73.mo19535t(f6);
        ex73.mo19528m(false);
        String c4 = ex73.mo19518c(str21);
        ex73.mo19518c(str17);
        String c5 = ex73.mo19518c(str19);
        String c6 = ex73.mo19518c(str16);
        String c7 = ex73.mo19518c(str15);
        C2540id3.m19565g(ex73.mo19517b(c7));
        String c8 = ex73.mo19518c(f3);
        String c9 = ex73.mo19518c(str18);
        String c10 = ex73.mo19518c(f4);
        String c11 = ex73.mo19518c(c);
        String c12 = ex73.mo19518c(str14);
        String c13 = ex73.mo19518c("ZecureIT.uky");
        String c14 = ex73.mo19518c(str4);
        String str24 = str23;
        String c15 = ex73.mo19518c(str6);
        String[] strArr3 = strArr;
        String c16 = ex73.mo19518c("1");
        String c17 = ex73.mo19518c(b2);
        String str25 = c6;
        String c18 = ex73.mo19518c(str5);
        String c19 = ex73.mo19518c(str7);
        String c20 = ex73.mo19518c(str8);
        String c21 = ex73.mo19518c(str9);
        String c22 = ex73.mo19518c(str2);
        String c23 = ex73.mo19518c(str3);
        strArr2[0] = "AKTSFMReg01";
        strArr2[1] = c4;
        strArr2[2] = c11;
        strArr2[3] = c16;
        strArr2[4] = c12;
        strArr2[5] = c5;
        strArr2[6] = c7;
        strArr2[7] = c8;
        strArr2[8] = c9;
        strArr2[9] = c10;
        strArr2[10] = "GR8Reg01";
        strArr2[11] = c13;
        strArr2[12] = c14;
        strArr2[13] = c15;
        strArr2[14] = c17;
        strArr2[15] = c20;
        strArr2[16] = c21;
        if (C9198q.f44130a) {
            strArr2[17] = str25;
            strArr2[18] = c18;
            strArr2[19] = c19;
            strArr2[20] = c22;
            strArr2[21] = c23;
        }
        String u = C2127d2.m14656u(strArr3, strArr2, C9198q.f44134e, C9198q.f44135f);
        int indexOf = u.indexOf("|");
        return u.substring(0, indexOf) + "," + str24 + u.substring(indexOf);
    }

    /* renamed from: j0 */
    public void mo12167j0(String str, String str2) {
        up1.m72960e(this, str, str2);
    }

    /* renamed from: k0 */
    public void mo12168k0(String str, String str2) {
        f06.m57524o(this, str, str2);
    }

    /* renamed from: m0 */
    public String mo12169m0(String str, String str2, String str3) {
        ex7 ex7 = new ex7();
        ex7.mo19531p(str3);
        ex7.mo19532q(str2);
        ex7.mo19530o();
        String e = ex7.mo19520e();
        C3311sx.m27171a(e);
        String g = ex7.mo19522g();
        String f = C2540id3.m19564f(C3019p.m24453a(str));
        byte[] h = C2540id3.m19566h(C2540id3.m19559a(C2127d2.m14653r(str2)), C2127d2.m14653r(str3));
        String f2 = C2540id3.m19564f(h);
        String d = C3311sx.m27174d(C2540id3.m19564f(h));
        ex7.mo19535t(f2);
        ex7.mo19528m(true);
        String c = ex7.mo19518c(f);
        String str4 = "|AKTRequestID=UPDATEKA" + "|PBU5=" + C3311sx.m27174d(C2540id3.m19564f(C2540id3.m19559a(fx7.m17478b(f)))) + "|U5=" + g + "|KA=" + c + "|AKTAPIID=reset02|";
        String str5 = "server=" + C9198q.f44134e + ",port=" + C9198q.f44135f;
        String str6 = str5 + ",00#" + str4.length() + "#" + str4;
        this.f8531y.mo24209c("tempU5", g);
        this.f8531y.mo24209c("tempKA", c);
        this.f8531y.mo24209c("tempK5", e);
        this.f8531y.mo24209c("tempUK5", d);
        return str6;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8530x = (MultiWalletViewModel) new C0729l(this).mo6421a(MultiWalletViewModel.class);
    }
}

package p000;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import net.safemoon.androidwallet.MyApplicationClass;

/* renamed from: u */
/* compiled from: AKTEncUtil */
public class C9377u {

    /* renamed from: a */
    public static final char[] f44835a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static String m72496a(Context context, String str) {
        String c = up1.m72958c(context, "UK5");
        if (c.isEmpty()) {
            c = C2127d2.m14652q(MyApplicationClass.m64669c().f41192x, "UK5");
        }
        byte[] a = C2540id3.m19559a(C2935o.m23569d(C2935o.m23571f(c, f06.m57518i(context, "KA")), str));
        if (a == null) {
            return "";
        }
        return new String(a, StandardCharsets.UTF_8);
    }

    /* renamed from: b */
    public static String m72497b(Context context, String str) {
        String c = up1.m72958c(context, "UK5");
        if (c.isEmpty()) {
            c = C2127d2.m14652q(MyApplicationClass.m64669c().f41192x, "UK5");
        }
        String f = C2935o.m23571f(c, f06.m57518i(context, "KA"));
        String e = C2935o.m23570e(f, C2540id3.m19564f(str.getBytes(StandardCharsets.UTF_8)));
        C2935o.m23569d(f, e);
        return e;
    }

    /* renamed from: c */
    public static String m72498c(Context context) {
        return m72499d(context, f06.m57518i(context, "SAFEMOON_PRIVATE_KEY"));
    }

    /* renamed from: d */
    public static String m72499d(Context context, String str) {
        String c = up1.m72958c(context, "UK5");
        if (c.isEmpty()) {
            c = C2127d2.m14652q(MyApplicationClass.m64669c().f41192x, "UK5");
        }
        String i = f06.m57518i(context, "KA");
        String j = C2127d2.m14645j(c, i, str);
        if (j.length() == 64) {
            return j;
        }
        String c2 = up1.m72958c(context, "K5");
        if (c2.isEmpty()) {
            C2127d2.m14652q(MyApplicationClass.m64669c().f41192x, "K5");
        }
        return C2127d2.m14645j(c2, i, str);
    }

    /* renamed from: e */
    public static String m72500e(Context context, String str) {
        return C2127d2.m14648m(m72499d(context, str));
    }

    /* renamed from: f */
    public static String m72501f(Context context, String str) {
        String c = up1.m72958c(context, "UK5");
        if (c.isEmpty()) {
            c = C2127d2.m14652q(MyApplicationClass.m64669c().f41192x, "UK5");
        }
        String i = f06.m57518i(context, "KA");
        String k = C2127d2.m14646k(c, i, str);
        if (k.compareTo("error") != 0) {
            return k;
        }
        String c2 = up1.m72958c(context, "K5");
        if (c2.isEmpty()) {
            C2127d2.m14652q(MyApplicationClass.m64669c().f41192x, "K5");
        }
        return C2127d2.m14646k(c2, i, str);
    }

    /* renamed from: g */
    public static String m72502g(Context context, String str) {
        if (str.isEmpty()) {
            return "";
        }
        String o = C2127d2.m14650o(str.trim().replace(" ", "|"));
        String c = up1.m72958c(context, "UK5");
        if (c.isEmpty()) {
            c = C2127d2.m14652q(MyApplicationClass.m64669c().f41192x, "UK5");
        }
        String i = f06.m57518i(context, "KA");
        String k = C2127d2.m14646k(c, i, o);
        if (k.compareTo("error") != 0) {
            return k;
        }
        String c2 = up1.m72958c(context, "K5");
        if (c2.isEmpty()) {
            C2127d2.m14652q(MyApplicationClass.m64669c().f41192x, "K5");
        }
        return C2127d2.m14646k(c2, i, o);
    }
}

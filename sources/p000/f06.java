package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: f06 */
/* compiled from: SharedPrefs */
public class f06 {

    /* renamed from: a */
    public static String f37695a = "safemoon_crypto";

    /* renamed from: a */
    public static void m57510a(Context context) {
        m57517h(context).edit().clear().commit();
    }

    /* renamed from: b */
    public static Boolean m57511b(Context context, String str, String str2) {
        return Boolean.valueOf(m57517h(context).edit().putString(str, str2).commit());
    }

    /* renamed from: c */
    public static boolean m57512c(Context context, String str) {
        return m57517h(context).contains(str);
    }

    /* renamed from: d */
    public static boolean m57513d(Context context, String str) {
        return m57517h(context).getBoolean(str, false);
    }

    /* renamed from: e */
    public static boolean m57514e(Context context, String str, boolean z) {
        return m57517h(context).getBoolean(str, z);
    }

    /* renamed from: f */
    public static int m57515f(Context context, String str, int i) {
        return m57517h(context).getInt(str, i);
    }

    /* renamed from: g */
    public static long m57516g(Context context, String str) {
        return m57517h(context).getLong(str, 0);
    }

    /* renamed from: h */
    public static SharedPreferences m57517h(Context context) {
        return context.getSharedPreferences(f37695a, 0);
    }

    /* renamed from: i */
    public static String m57518i(Context context, String str) {
        return m57517h(context).getString(str, "");
    }

    /* renamed from: j */
    public static String m57519j(Context context, String str, String str2) {
        return m57517h(context).getString(str, str2);
    }

    /* renamed from: k */
    public static void m57520k(Context context, String str) {
        m57517h(context).edit().remove(str).apply();
    }

    /* renamed from: l */
    public static void m57521l(Context context, String str, int i) {
        m57517h(context).edit().putInt(str, i).apply();
    }

    /* renamed from: m */
    public static void m57522m(Context context, String str, long j) {
        m57517h(context).edit().putLong(str, j).apply();
    }

    /* renamed from: n */
    public static void m57523n(Context context, String str, Boolean bool) {
        m57517h(context).edit().putBoolean(str, bool.booleanValue()).apply();
    }

    /* renamed from: o */
    public static void m57524o(Context context, String str, String str2) {
        m57517h(context).edit().putString(str, str2).apply();
    }

    /* renamed from: p */
    public static void m57525p(Context context, String str, boolean z) {
        m57517h(context).edit().putBoolean(str, z).apply();
    }
}

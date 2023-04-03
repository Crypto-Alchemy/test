package p000;

import android.text.TextUtils;

/* renamed from: re4 */
/* compiled from: OSUtils */
public class re4 {
    /* renamed from: a */
    public static String m26161a() {
        if (m26163c()) {
            return m26162b("ro.build.version.emui", "");
        }
        return "";
    }

    /* renamed from: b */
    public static String m26162b(String str, String str2) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.os.SystemProperties");
            return (String) cls2.getMethod("get", new Class[]{cls, cls}).invoke(cls2, new Object[]{str, str2});
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    /* renamed from: c */
    public static boolean m26163c() {
        return !TextUtils.isEmpty(m26162b("ro.build.version.emui", ""));
    }

    /* renamed from: d */
    public static boolean m26164d() {
        if (m26161a().contains("EmotionUI_3.0")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m26165e() {
        String a = m26161a();
        if ("EmotionUI 3".equals(a) || a.contains("EmotionUI_3.1")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m26166f() {
        if (m26164d() || m26165e()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m26167g() {
        return !TextUtils.isEmpty(m26162b("ro.miui.ui.version.name", ""));
    }
}

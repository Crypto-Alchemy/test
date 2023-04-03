package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: le1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class le1 {

    /* renamed from: a */
    public static Boolean f31292a;

    /* renamed from: b */
    public static Boolean f31293b;

    /* renamed from: c */
    public static Boolean f31294c;

    /* renamed from: d */
    public static Boolean f31295d;

    /* renamed from: a */
    public static boolean m47789a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f31295d == null) {
            boolean z = false;
            if (xp4.m54483h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f31295d = Boolean.valueOf(z);
        }
        return f31295d.booleanValue();
    }

    /* renamed from: b */
    public static boolean m47790b() {
        int i = mi2.f31711a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    /* renamed from: c */
    public static boolean m47791c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f31292a == null) {
            boolean z = false;
            if (xp4.m54480e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f31292a = Boolean.valueOf(z);
        }
        return f31292a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: d */
    public static boolean m47792d(Context context) {
        if (m47791c(context) && !xp4.m54482g()) {
            return true;
        }
        if (!m47793e(context)) {
            return false;
        }
        if (!xp4.m54483h() || xp4.m54486k()) {
            return true;
        }
        return false;
    }

    @TargetApi(21)
    /* renamed from: e */
    public static boolean m47793e(Context context) {
        if (f31293b == null) {
            boolean z = false;
            if (xp4.m54481f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f31293b = Boolean.valueOf(z);
        }
        return f31293b.booleanValue();
    }

    /* renamed from: f */
    public static boolean m47794f(Context context) {
        if (f31294c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f31294c = Boolean.valueOf(z);
        }
        return f31294c.booleanValue();
    }
}

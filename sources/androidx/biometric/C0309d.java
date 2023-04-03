package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.biometric.d */
/* compiled from: BiometricManager */
public class C0309d {

    /* renamed from: a */
    public final C0313d f1356a;

    /* renamed from: b */
    public final BiometricManager f1357b;

    /* renamed from: c */
    public final a22 f1358c;

    /* renamed from: androidx.biometric.d$a */
    /* compiled from: BiometricManager */
    public static class C0310a {
        /* renamed from: a */
        public static int m1689a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        /* renamed from: b */
        public static BiometricManager m1690b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        /* renamed from: c */
        public static Method m1691c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", new Class[]{BiometricPrompt.CryptoObject.class});
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.biometric.d$b */
    /* compiled from: BiometricManager */
    public static class C0311b {
        /* renamed from: a */
        public static int m1692a(BiometricManager biometricManager, int i) {
            return biometricManager.canAuthenticate(i);
        }
    }

    /* renamed from: androidx.biometric.d$c */
    /* compiled from: BiometricManager */
    public static class C0312c implements C0313d {

        /* renamed from: a */
        public final Context f1359a;

        public C0312c(Context context) {
            this.f1359a = context.getApplicationContext();
        }

        /* renamed from: a */
        public boolean mo2714a() {
            if (pb3.m24811a(this.f1359a) != null) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo2715b() {
            return pb3.m24812b(this.f1359a);
        }

        /* renamed from: c */
        public boolean mo2716c() {
            return ne1.m23121a(this.f1359a, Build.MODEL);
        }

        /* renamed from: d */
        public a22 mo2717d() {
            return a22.m14b(this.f1359a);
        }

        /* renamed from: e */
        public BiometricManager mo2718e() {
            return C0310a.m1690b(this.f1359a);
        }

        /* renamed from: f */
        public boolean mo2719f() {
            return qk4.m25739a(this.f1359a);
        }
    }

    /* renamed from: androidx.biometric.d$d */
    /* compiled from: BiometricManager */
    public interface C0313d {
        /* renamed from: a */
        boolean mo2714a();

        /* renamed from: b */
        boolean mo2715b();

        /* renamed from: c */
        boolean mo2716c();

        /* renamed from: d */
        a22 mo2717d();

        /* renamed from: e */
        BiometricManager mo2718e();

        /* renamed from: f */
        boolean mo2719f();
    }

    public C0309d(C0313d dVar) {
        BiometricManager biometricManager;
        this.f1356a = dVar;
        int i = Build.VERSION.SDK_INT;
        a22 a22 = null;
        if (i >= 29) {
            biometricManager = dVar.mo2718e();
        } else {
            biometricManager = null;
        }
        this.f1357b = biometricManager;
        this.f1358c = i <= 29 ? dVar.mo2717d() : a22;
    }

    /* renamed from: g */
    public static C0309d m1682g(Context context) {
        return new C0309d(new C0312c(context));
    }

    /* renamed from: a */
    public int mo2708a(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            return mo2709b(i);
        }
        BiometricManager biometricManager = this.f1357b;
        if (biometricManager == null) {
            return 1;
        }
        return C0311b.m1692a(biometricManager, i);
    }

    /* renamed from: b */
    public final int mo2709b(int i) {
        if (!C0288b.m1630e(i)) {
            return -2;
        }
        if (i == 0 || !this.f1356a.mo2714a()) {
            return 12;
        }
        if (!C0288b.m1628c(i)) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 == 29) {
                if (C0288b.m1631f(i)) {
                    return mo2713f();
                }
                return mo2712e();
            } else if (i2 != 28) {
                return mo2710c();
            } else {
                if (this.f1356a.mo2719f()) {
                    return mo2711d();
                }
                return 12;
            }
        } else if (this.f1356a.mo2715b()) {
            return 0;
        } else {
            return 11;
        }
    }

    /* renamed from: c */
    public final int mo2710c() {
        a22 a22 = this.f1358c;
        if (a22 == null) {
            return 1;
        }
        if (!a22.mo20e()) {
            return 12;
        }
        if (!this.f1358c.mo19d()) {
            return 11;
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo2711d() {
        if (!this.f1356a.mo2715b()) {
            return mo2710c();
        }
        if (mo2710c() == 0) {
            return 0;
        }
        return -1;
    }

    /* renamed from: e */
    public final int mo2712e() {
        BiometricPrompt.CryptoObject d;
        Object obj;
        Method c = C0310a.m1691c();
        if (!(c == null || (d = C0319f.m1765d(C0319f.m1762a())) == null)) {
            try {
                if (Build.VERSION.SDK_INT == 29) {
                    obj = c.invoke(this.f1357b, new Object[]{d});
                } else {
                    obj = null;
                }
                if (obj instanceof Integer) {
                    return ((Integer) obj).intValue();
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
        int f = mo2713f();
        if (this.f1356a.mo2716c() || f != 0) {
            return f;
        }
        return mo2711d();
    }

    /* renamed from: f */
    public final int mo2713f() {
        BiometricManager biometricManager = this.f1357b;
        if (biometricManager == null) {
            return 1;
        }
        return C0310a.m1689a(biometricManager);
    }
}

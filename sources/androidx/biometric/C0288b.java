package androidx.biometric;

import android.os.Build;
import androidx.biometric.BiometricPrompt;

/* renamed from: androidx.biometric.b */
/* compiled from: AuthenticatorUtils */
public class C0288b {
    /* renamed from: a */
    public static String m1626a(int i) {
        if (i == 15) {
            return "BIOMETRIC_STRONG";
        }
        if (i == 255) {
            return "BIOMETRIC_WEAK";
        }
        if (i == 32768) {
            return "DEVICE_CREDENTIAL";
        }
        if (i == 32783) {
            return "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
        }
        if (i != 33023) {
            return String.valueOf(i);
        }
        return "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
    }

    /* renamed from: b */
    public static int m1627b(BiometricPrompt.C0280d dVar, BiometricPrompt.C0279c cVar) {
        int i;
        if (dVar.mo2638a() != 0) {
            return dVar.mo2638a();
        }
        if (cVar != null) {
            i = 15;
        } else {
            i = 255;
        }
        if (dVar.mo2644g()) {
            return 32768 | i;
        }
        return i;
    }

    /* renamed from: c */
    public static boolean m1628c(int i) {
        return (i & 32768) != 0;
    }

    /* renamed from: d */
    public static boolean m1629d(int i) {
        return (i & 32767) != 0;
    }

    /* renamed from: e */
    public static boolean m1630e(int i) {
        if (i == 15 || i == 255) {
            return true;
        }
        if (i != 32768) {
            if (i == 32783) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28 || i2 > 29) {
                    return true;
                }
                return false;
            } else if (i == 33023 || i == 0) {
                return true;
            } else {
                return false;
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m1631f(int i) {
        return (i & 255) == 255;
    }
}

package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import androidx.biometric.BiometricPrompt;
import p000.a22;

/* renamed from: androidx.biometric.a */
/* compiled from: AuthenticationCallbackProvider */
public class C0282a {

    /* renamed from: a */
    public BiometricPrompt.AuthenticationCallback f1329a;

    /* renamed from: b */
    public a22.C0004c f1330b;

    /* renamed from: c */
    public final C0287d f1331c;

    /* renamed from: androidx.biometric.a$a */
    /* compiled from: AuthenticationCallbackProvider */
    public class C0283a extends a22.C0004c {
        public C0283a() {
        }

        /* renamed from: a */
        public void mo25a(int i, CharSequence charSequence) {
            C0282a.this.f1331c.mo2656a(i, charSequence);
        }

        /* renamed from: b */
        public void mo26b() {
            C0282a.this.f1331c.mo2657b();
        }

        /* renamed from: c */
        public void mo27c(int i, CharSequence charSequence) {
            C0282a.this.f1331c.mo2658c(charSequence);
        }

        /* renamed from: d */
        public void mo28d(a22.C0005d dVar) {
            BiometricPrompt.C0279c cVar;
            if (dVar != null) {
                cVar = C0319f.m1764c(dVar.mo29a());
            } else {
                cVar = null;
            }
            C0282a.this.f1331c.mo2659d(new BiometricPrompt.C0278b(cVar, 2));
        }
    }

    /* renamed from: androidx.biometric.a$b */
    /* compiled from: AuthenticationCallbackProvider */
    public static class C0284b {

        /* renamed from: androidx.biometric.a$b$a */
        /* compiled from: AuthenticationCallbackProvider */
        public class C0285a extends BiometricPrompt.AuthenticationCallback {

            /* renamed from: a */
            public final /* synthetic */ C0287d f1333a;

            public C0285a(C0287d dVar) {
                this.f1333a = dVar;
            }

            public void onAuthenticationError(int i, CharSequence charSequence) {
                this.f1333a.mo2656a(i, charSequence);
            }

            public void onAuthenticationFailed() {
                this.f1333a.mo2657b();
            }

            public void onAuthenticationHelp(int i, CharSequence charSequence) {
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                BiometricPrompt.C0279c cVar;
                if (authenticationResult != null) {
                    cVar = C0319f.m1763b(C0284b.m1620b(authenticationResult));
                } else {
                    cVar = null;
                }
                int i = Build.VERSION.SDK_INT;
                int i2 = -1;
                if (i >= 30) {
                    if (authenticationResult != null) {
                        i2 = C0286c.m1621a(authenticationResult);
                    }
                } else if (i != 29) {
                    i2 = 2;
                }
                this.f1333a.mo2659d(new BiometricPrompt.C0278b(cVar, i2));
            }
        }

        /* renamed from: a */
        public static BiometricPrompt.AuthenticationCallback m1619a(C0287d dVar) {
            return new C0285a(dVar);
        }

        /* renamed from: b */
        public static BiometricPrompt.CryptoObject m1620b(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getCryptoObject();
        }
    }

    /* renamed from: androidx.biometric.a$c */
    /* compiled from: AuthenticationCallbackProvider */
    public static class C0286c {
        /* renamed from: a */
        public static int m1621a(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    /* renamed from: androidx.biometric.a$d */
    /* compiled from: AuthenticationCallbackProvider */
    public static class C0287d {
        /* renamed from: a */
        public void mo2656a(int i, CharSequence charSequence) {
            throw null;
        }

        /* renamed from: b */
        public void mo2657b() {
            throw null;
        }

        /* renamed from: c */
        public void mo2658c(CharSequence charSequence) {
            throw null;
        }

        /* renamed from: d */
        public void mo2659d(BiometricPrompt.C0278b bVar) {
            throw null;
        }
    }

    public C0282a(C0287d dVar) {
        this.f1331c = dVar;
    }

    /* renamed from: a */
    public BiometricPrompt.AuthenticationCallback mo2650a() {
        if (this.f1329a == null) {
            this.f1329a = C0284b.m1619a(this.f1331c);
        }
        return this.f1329a;
    }

    /* renamed from: b */
    public a22.C0004c mo2651b() {
        if (this.f1330b == null) {
            this.f1330b = new C0283a();
        }
        return this.f1330b;
    }
}

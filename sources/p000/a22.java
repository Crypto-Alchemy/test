package p000;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
/* renamed from: a22 */
/* compiled from: FingerprintManagerCompat */
public class a22 {

    /* renamed from: a */
    public final Context f28a;

    /* renamed from: a22$a */
    /* compiled from: FingerprintManagerCompat */
    public class C0002a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a */
        public final /* synthetic */ C0004c f29a;

        public C0002a(C0004c cVar) {
            this.f29a = cVar;
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.f29a.mo25a(i, charSequence);
        }

        public void onAuthenticationFailed() {
            this.f29a.mo26b();
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.f29a.mo27c(i, charSequence);
        }

        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f29a.mo28d(new C0005d(a22.m16f(C0003b.m23b(authenticationResult))));
        }
    }

    /* renamed from: a22$b */
    /* compiled from: FingerprintManagerCompat */
    public static class C0003b {
        /* renamed from: a */
        public static void m22a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        /* renamed from: b */
        public static FingerprintManager.CryptoObject m23b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        /* renamed from: c */
        public static FingerprintManager m24c(Context context) {
            int i = Build.VERSION.SDK_INT;
            if (i == 23) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            if (i <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return null;
            }
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }

        /* renamed from: d */
        public static boolean m25d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        /* renamed from: e */
        public static boolean m26e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        /* renamed from: f */
        public static C0006e m27f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new C0006e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new C0006e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new C0006e(cryptoObject.getMac());
            }
            return null;
        }

        /* renamed from: g */
        public static FingerprintManager.CryptoObject m28g(C0006e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.mo30a() != null) {
                return new FingerprintManager.CryptoObject(eVar.mo30a());
            }
            if (eVar.mo32c() != null) {
                return new FingerprintManager.CryptoObject(eVar.mo32c());
            }
            if (eVar.mo31b() != null) {
                return new FingerprintManager.CryptoObject(eVar.mo31b());
            }
            return null;
        }
    }

    /* renamed from: a22$c */
    /* compiled from: FingerprintManagerCompat */
    public static abstract class C0004c {
        /* renamed from: a */
        public abstract void mo25a(int i, CharSequence charSequence);

        /* renamed from: b */
        public abstract void mo26b();

        /* renamed from: c */
        public abstract void mo27c(int i, CharSequence charSequence);

        /* renamed from: d */
        public abstract void mo28d(C0005d dVar);
    }

    /* renamed from: a22$d */
    /* compiled from: FingerprintManagerCompat */
    public static final class C0005d {

        /* renamed from: a */
        public final C0006e f30a;

        public C0005d(C0006e eVar) {
            this.f30a = eVar;
        }

        /* renamed from: a */
        public C0006e mo29a() {
            return this.f30a;
        }
    }

    public a22(Context context) {
        this.f28a = context;
    }

    /* renamed from: b */
    public static a22 m14b(Context context) {
        return new a22(context);
    }

    /* renamed from: c */
    public static FingerprintManager m15c(Context context) {
        return C0003b.m24c(context);
    }

    /* renamed from: f */
    public static C0006e m16f(FingerprintManager.CryptoObject cryptoObject) {
        return C0003b.m27f(cryptoObject);
    }

    /* renamed from: g */
    public static FingerprintManager.AuthenticationCallback m17g(C0004c cVar) {
        return new C0002a(cVar);
    }

    /* renamed from: h */
    public static FingerprintManager.CryptoObject m18h(C0006e eVar) {
        return C0003b.m28g(eVar);
    }

    /* renamed from: a */
    public void mo18a(C0006e eVar, int i, sa0 sa0, C0004c cVar, Handler handler) {
        CancellationSignal cancellationSignal;
        FingerprintManager c = m15c(this.f28a);
        if (c != null) {
            if (sa0 != null) {
                cancellationSignal = (CancellationSignal) sa0.mo25693b();
            } else {
                cancellationSignal = null;
            }
            C0003b.m22a(c, m18h(eVar), cancellationSignal, i, m17g(cVar), handler);
        }
    }

    /* renamed from: d */
    public boolean mo19d() {
        FingerprintManager c = m15c(this.f28a);
        if (c == null || !C0003b.m25d(c)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo20e() {
        FingerprintManager c = m15c(this.f28a);
        if (c == null || !C0003b.m26e(c)) {
            return false;
        }
        return true;
    }

    /* renamed from: a22$e */
    /* compiled from: FingerprintManagerCompat */
    public static class C0006e {

        /* renamed from: a */
        public final Signature f31a;

        /* renamed from: b */
        public final Cipher f32b;

        /* renamed from: c */
        public final Mac f33c;

        public C0006e(Signature signature) {
            this.f31a = signature;
            this.f32b = null;
            this.f33c = null;
        }

        /* renamed from: a */
        public Cipher mo30a() {
            return this.f32b;
        }

        /* renamed from: b */
        public Mac mo31b() {
            return this.f33c;
        }

        /* renamed from: c */
        public Signature mo32c() {
            return this.f31a;
        }

        public C0006e(Cipher cipher) {
            this.f32b = cipher;
            this.f31a = null;
            this.f33c = null;
        }

        public C0006e(Mac mac) {
            this.f33c = mac;
            this.f32b = null;
            this.f31a = null;
        }
    }
}

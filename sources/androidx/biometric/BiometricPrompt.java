package androidx.biometric;

import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0719h;
import androidx.lifecycle.C0729l;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public class BiometricPrompt {

    /* renamed from: a */
    public FragmentManager f1307a;

    public static class ResetCallbackObserver implements tg3 {

        /* renamed from: a */
        public final WeakReference<C0314e> f1308a;

        public ResetCallbackObserver(C0314e eVar) {
            this.f1308a = new WeakReference<>(eVar);
        }

        @C0719h(Lifecycle.Event.ON_DESTROY)
        public void resetCallback() {
            if (this.f1308a.get() != null) {
                this.f1308a.get().mo2724E();
            }
        }
    }

    /* renamed from: androidx.biometric.BiometricPrompt$a */
    public static abstract class C0277a {
        /* renamed from: a */
        public void mo2629a(int i, CharSequence charSequence) {
        }

        /* renamed from: b */
        public void mo2630b() {
        }

        /* renamed from: c */
        public void mo2631c(C0278b bVar) {
        }
    }

    /* renamed from: androidx.biometric.BiometricPrompt$b */
    public static class C0278b {

        /* renamed from: a */
        public final C0279c f1309a;

        /* renamed from: b */
        public final int f1310b;

        public C0278b(C0279c cVar, int i) {
            this.f1309a = cVar;
            this.f1310b = i;
        }

        /* renamed from: a */
        public int mo2632a() {
            return this.f1310b;
        }

        /* renamed from: b */
        public C0279c mo2633b() {
            return this.f1309a;
        }
    }

    /* renamed from: androidx.biometric.BiometricPrompt$d */
    public static class C0280d {

        /* renamed from: a */
        public final CharSequence f1315a;

        /* renamed from: b */
        public final CharSequence f1316b;

        /* renamed from: c */
        public final CharSequence f1317c;

        /* renamed from: d */
        public final CharSequence f1318d;

        /* renamed from: e */
        public final boolean f1319e;

        /* renamed from: f */
        public final boolean f1320f;

        /* renamed from: g */
        public final int f1321g;

        /* renamed from: androidx.biometric.BiometricPrompt$d$a */
        public static class C0281a {

            /* renamed from: a */
            public CharSequence f1322a = null;

            /* renamed from: b */
            public CharSequence f1323b = null;

            /* renamed from: c */
            public CharSequence f1324c = null;

            /* renamed from: d */
            public CharSequence f1325d = null;

            /* renamed from: e */
            public boolean f1326e = true;

            /* renamed from: f */
            public boolean f1327f = false;

            /* renamed from: g */
            public int f1328g = 0;

            /* renamed from: a */
            public C0280d mo2645a() {
                boolean z;
                if (TextUtils.isEmpty(this.f1322a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                } else if (C0288b.m1630e(this.f1328g)) {
                    int i = this.f1328g;
                    if (i != 0) {
                        z = C0288b.m1628c(i);
                    } else {
                        z = this.f1327f;
                    }
                    if (TextUtils.isEmpty(this.f1325d) && !z) {
                        throw new IllegalArgumentException("Negative text must be set and non-empty.");
                    } else if (TextUtils.isEmpty(this.f1325d) || !z) {
                        return new C0280d(this.f1322a, this.f1323b, this.f1324c, this.f1325d, this.f1326e, this.f1327f, this.f1328g);
                    } else {
                        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
                    }
                } else {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + C0288b.m1626a(this.f1328g));
                }
            }

            /* renamed from: b */
            public C0281a mo2646b(int i) {
                this.f1328g = i;
                return this;
            }

            /* renamed from: c */
            public C0281a mo2647c(boolean z) {
                this.f1326e = z;
                return this;
            }

            /* renamed from: d */
            public C0281a mo2648d(CharSequence charSequence) {
                this.f1323b = charSequence;
                return this;
            }

            /* renamed from: e */
            public C0281a mo2649e(CharSequence charSequence) {
                this.f1322a = charSequence;
                return this;
            }
        }

        public C0280d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, boolean z2, int i) {
            this.f1315a = charSequence;
            this.f1316b = charSequence2;
            this.f1317c = charSequence3;
            this.f1318d = charSequence4;
            this.f1319e = z;
            this.f1320f = z2;
            this.f1321g = i;
        }

        /* renamed from: a */
        public int mo2638a() {
            return this.f1321g;
        }

        /* renamed from: b */
        public CharSequence mo2639b() {
            return this.f1317c;
        }

        /* renamed from: c */
        public CharSequence mo2640c() {
            CharSequence charSequence = this.f1318d;
            if (charSequence != null) {
                return charSequence;
            }
            return "";
        }

        /* renamed from: d */
        public CharSequence mo2641d() {
            return this.f1316b;
        }

        /* renamed from: e */
        public CharSequence mo2642e() {
            return this.f1315a;
        }

        /* renamed from: f */
        public boolean mo2643f() {
            return this.f1319e;
        }

        @Deprecated
        /* renamed from: g */
        public boolean mo2644g() {
            return this.f1320f;
        }
    }

    public BiometricPrompt(FragmentActivity fragmentActivity, C0277a aVar) {
        if (fragmentActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        } else if (aVar != null) {
            mo2627h(fragmentActivity.getSupportFragmentManager(), m1587g(fragmentActivity), (Executor) null, aVar);
        } else {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
    }

    /* renamed from: a */
    public static void m1584a(Fragment fragment, C0314e eVar) {
        if (eVar != null) {
            fragment.getLifecycle().mo6295a(new ResetCallbackObserver(eVar));
        }
    }

    /* renamed from: e */
    public static C0289c m1585e(FragmentManager fragmentManager) {
        return (C0289c) fragmentManager.mo5984l0("androidx.biometric.BiometricFragment");
    }

    /* renamed from: f */
    public static C0289c m1586f(FragmentManager fragmentManager) {
        C0289c e = m1585e(fragmentManager);
        if (e != null) {
            return e;
        }
        C0289c x = C0289c.m1633x();
        fragmentManager.mo5996q().mo6264e(x, "androidx.biometric.BiometricFragment").mo6140k();
        fragmentManager.mo5972h0();
        return x;
    }

    /* renamed from: g */
    public static C0314e m1587g(FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            return (C0314e) new C0729l(fragmentActivity).mo6421a(C0314e.class);
        }
        return null;
    }

    /* renamed from: b */
    public void mo2624b(C0280d dVar) {
        if (dVar != null) {
            mo2625c(dVar, (C0279c) null);
            return;
        }
        throw new IllegalArgumentException("PromptInfo cannot be null.");
    }

    /* renamed from: c */
    public final void mo2625c(C0280d dVar, C0279c cVar) {
        FragmentManager fragmentManager = this.f1307a;
        if (fragmentManager != null && !fragmentManager.mo5947R0()) {
            m1586f(this.f1307a).mo2673h(dVar, cVar);
        }
    }

    /* renamed from: d */
    public void mo2626d() {
        C0289c e;
        FragmentManager fragmentManager = this.f1307a;
        if (fragmentManager != null && (e = m1585e(fragmentManager)) != null) {
            e.mo2676k(3);
        }
    }

    /* renamed from: h */
    public final void mo2627h(FragmentManager fragmentManager, C0314e eVar, Executor executor, C0277a aVar) {
        this.f1307a = fragmentManager;
        if (eVar != null) {
            if (executor != null) {
                eVar.mo2733N(executor);
            }
            eVar.mo2732M(aVar);
        }
    }

    /* renamed from: androidx.biometric.BiometricPrompt$c */
    public static class C0279c {

        /* renamed from: a */
        public final Signature f1311a;

        /* renamed from: b */
        public final Cipher f1312b;

        /* renamed from: c */
        public final Mac f1313c;

        /* renamed from: d */
        public final IdentityCredential f1314d;

        public C0279c(Signature signature) {
            this.f1311a = signature;
            this.f1312b = null;
            this.f1313c = null;
            this.f1314d = null;
        }

        /* renamed from: a */
        public Cipher mo2634a() {
            return this.f1312b;
        }

        /* renamed from: b */
        public IdentityCredential mo2635b() {
            return this.f1314d;
        }

        /* renamed from: c */
        public Mac mo2636c() {
            return this.f1313c;
        }

        /* renamed from: d */
        public Signature mo2637d() {
            return this.f1311a;
        }

        public C0279c(Cipher cipher) {
            this.f1311a = null;
            this.f1312b = cipher;
            this.f1313c = null;
            this.f1314d = null;
        }

        public C0279c(Mac mac) {
            this.f1311a = null;
            this.f1312b = null;
            this.f1313c = mac;
            this.f1314d = null;
        }

        public C0279c(IdentityCredential identityCredential) {
            this.f1311a = null;
            this.f1312b = null;
            this.f1313c = null;
            this.f1314d = identityCredential;
        }
    }

    public BiometricPrompt(Fragment fragment, C0277a aVar) {
        if (fragment == null) {
            throw new IllegalArgumentException("Fragment must not be null.");
        } else if (aVar != null) {
            FragmentActivity activity = fragment.getActivity();
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            C0314e g = m1587g(activity);
            m1584a(fragment, g);
            mo2627h(childFragmentManager, g, (Executor) null, aVar);
        } else {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
    }
}

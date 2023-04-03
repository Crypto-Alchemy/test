package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0729l;
import androidx.media3.common.PlaybackException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: androidx.biometric.c */
/* compiled from: BiometricFragment */
public class C0289c extends Fragment {

    /* renamed from: a */
    public Handler f1334a = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public C0314e f1335d;

    /* renamed from: androidx.biometric.c$a */
    /* compiled from: BiometricFragment */
    public class C0290a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f1336a;

        /* renamed from: d */
        public final /* synthetic */ CharSequence f1337d;

        public C0290a(int i, CharSequence charSequence) {
            this.f1336a = i;
            this.f1337d = charSequence;
        }

        public void run() {
            C0289c.this.f1335d.mo2754i().mo2629a(this.f1336a, this.f1337d);
        }
    }

    /* renamed from: androidx.biometric.c$b */
    /* compiled from: BiometricFragment */
    public class C0291b implements Runnable {
        public C0291b() {
        }

        public void run() {
            C0289c.this.f1335d.mo2754i().mo2630b();
        }
    }

    /* renamed from: androidx.biometric.c$c */
    /* compiled from: BiometricFragment */
    public class C0292c implements pf4<BiometricPrompt.C0278b> {
        public C0292c() {
        }

        /* renamed from: a */
        public void onChanged(BiometricPrompt.C0278b bVar) {
            if (bVar != null) {
                C0289c.this.mo2661B(bVar);
                C0289c.this.f1335d.mo2728I((BiometricPrompt.C0278b) null);
            }
        }
    }

    /* renamed from: androidx.biometric.c$d */
    /* compiled from: BiometricFragment */
    public class C0293d implements pf4<p10> {
        public C0293d() {
        }

        /* renamed from: a */
        public void onChanged(p10 p10) {
            if (p10 != null) {
                C0289c.this.mo2690y(p10.mo24314b(), p10.mo24315c());
                C0289c.this.f1335d.mo2725F((p10) null);
            }
        }
    }

    /* renamed from: androidx.biometric.c$e */
    /* compiled from: BiometricFragment */
    public class C0294e implements pf4<CharSequence> {
        public C0294e() {
        }

        /* renamed from: a */
        public void onChanged(CharSequence charSequence) {
            if (charSequence != null) {
                C0289c.this.mo2660A(charSequence);
                C0289c.this.f1335d.mo2725F((p10) null);
            }
        }
    }

    /* renamed from: androidx.biometric.c$f */
    /* compiled from: BiometricFragment */
    public class C0295f implements pf4<Boolean> {
        public C0295f() {
        }

        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                C0289c.this.mo2691z();
                C0289c.this.f1335d.mo2726G(false);
            }
        }
    }

    /* renamed from: androidx.biometric.c$g */
    /* compiled from: BiometricFragment */
    public class C0296g implements pf4<Boolean> {
        public C0296g() {
        }

        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                if (C0289c.this.mo2687u()) {
                    C0289c.this.mo2663D();
                } else {
                    C0289c.this.mo2662C();
                }
                C0289c.this.f1335d.mo2743X(false);
            }
        }
    }

    /* renamed from: androidx.biometric.c$h */
    /* compiled from: BiometricFragment */
    public class C0297h implements pf4<Boolean> {
        public C0297h() {
        }

        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool.booleanValue()) {
                C0289c.this.mo2676k(1);
                C0289c.this.mo2678n();
                C0289c.this.f1335d.mo2737R(false);
            }
        }
    }

    /* renamed from: androidx.biometric.c$i */
    /* compiled from: BiometricFragment */
    public class C0298i implements Runnable {
        public C0298i() {
        }

        public void run() {
            C0289c.this.f1335d.mo2738S(false);
        }
    }

    /* renamed from: androidx.biometric.c$j */
    /* compiled from: BiometricFragment */
    public class C0299j implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f1347a;

        /* renamed from: d */
        public final /* synthetic */ CharSequence f1348d;

        public C0299j(int i, CharSequence charSequence) {
            this.f1347a = i;
            this.f1348d = charSequence;
        }

        public void run() {
            C0289c.this.mo2664E(this.f1347a, this.f1348d);
        }
    }

    /* renamed from: androidx.biometric.c$k */
    /* compiled from: BiometricFragment */
    public class C0300k implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ BiometricPrompt.C0278b f1350a;

        public C0300k(BiometricPrompt.C0278b bVar) {
            this.f1350a = bVar;
        }

        public void run() {
            C0289c.this.f1335d.mo2754i().mo2631c(this.f1350a);
        }
    }

    /* renamed from: androidx.biometric.c$l */
    /* compiled from: BiometricFragment */
    public static class C0301l {
        /* renamed from: a */
        public static Intent m1670a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.biometric.c$m */
    /* compiled from: BiometricFragment */
    public static class C0302m {
        /* renamed from: a */
        public static void m1671a(android.hardware.biometrics.BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
        }

        /* renamed from: b */
        public static void m1672b(android.hardware.biometrics.BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
        }

        /* renamed from: c */
        public static android.hardware.biometrics.BiometricPrompt m1673c(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        /* renamed from: d */
        public static BiometricPrompt.Builder m1674d(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        /* renamed from: e */
        public static void m1675e(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        /* renamed from: f */
        public static void m1676f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        /* renamed from: g */
        public static void m1677g(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        /* renamed from: h */
        public static void m1678h(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* renamed from: androidx.biometric.c$n */
    /* compiled from: BiometricFragment */
    public static class C0303n {
        /* renamed from: a */
        public static void m1679a(BiometricPrompt.Builder builder, boolean z) {
            BiometricPrompt.Builder unused = builder.setConfirmationRequired(z);
        }

        /* renamed from: b */
        public static void m1680b(BiometricPrompt.Builder builder, boolean z) {
            BiometricPrompt.Builder unused = builder.setDeviceCredentialAllowed(z);
        }
    }

    /* renamed from: androidx.biometric.c$o */
    /* compiled from: BiometricFragment */
    public static class C0304o {
        /* renamed from: a */
        public static void m1681a(BiometricPrompt.Builder builder, int i) {
            BiometricPrompt.Builder unused = builder.setAllowedAuthenticators(i);
        }
    }

    /* renamed from: androidx.biometric.c$p */
    /* compiled from: BiometricFragment */
    public static class C0305p implements Executor {

        /* renamed from: a */
        public final Handler f1352a = new Handler(Looper.getMainLooper());

        public void execute(Runnable runnable) {
            this.f1352a.post(runnable);
        }
    }

    /* renamed from: androidx.biometric.c$q */
    /* compiled from: BiometricFragment */
    public static class C0306q implements Runnable {

        /* renamed from: a */
        public final WeakReference<C0289c> f1353a;

        public C0306q(C0289c cVar) {
            this.f1353a = new WeakReference<>(cVar);
        }

        public void run() {
            if (this.f1353a.get() != null) {
                this.f1353a.get().mo2672M();
            }
        }
    }

    /* renamed from: androidx.biometric.c$r */
    /* compiled from: BiometricFragment */
    public static class C0307r implements Runnable {

        /* renamed from: a */
        public final WeakReference<C0314e> f1354a;

        public C0307r(C0314e eVar) {
            this.f1354a = new WeakReference<>(eVar);
        }

        public void run() {
            if (this.f1354a.get() != null) {
                this.f1354a.get().mo2736Q(false);
            }
        }
    }

    /* renamed from: androidx.biometric.c$s */
    /* compiled from: BiometricFragment */
    public static class C0308s implements Runnable {

        /* renamed from: a */
        public final WeakReference<C0314e> f1355a;

        public C0308s(C0314e eVar) {
            this.f1355a = new WeakReference<>(eVar);
        }

        public void run() {
            if (this.f1355a.get() != null) {
                this.f1355a.get().mo2742W(false);
            }
        }
    }

    /* renamed from: l */
    public static int m1632l(a22 a22) {
        if (!a22.mo20e()) {
            return 12;
        }
        if (!a22.mo19d()) {
            return 11;
        }
        return 0;
    }

    /* renamed from: x */
    public static C0289c m1633x() {
        return new C0289c();
    }

    /* renamed from: A */
    public void mo2660A(CharSequence charSequence) {
        if (mo2688v()) {
            mo2671L(charSequence);
        }
    }

    /* renamed from: B */
    public void mo2661B(BiometricPrompt.C0278b bVar) {
        mo2667H(bVar);
    }

    /* renamed from: C */
    public void mo2662C() {
        CharSequence r = this.f1335d.mo2763r();
        if (r == null) {
            r = getString(r45.default_error_msg);
        }
        mo2664E(13, r);
        mo2676k(2);
    }

    /* renamed from: D */
    public void mo2663D() {
        mo2689w();
    }

    /* renamed from: E */
    public void mo2664E(int i, CharSequence charSequence) {
        mo2665F(i, charSequence);
        mo2678n();
    }

    /* renamed from: F */
    public final void mo2665F(int i, CharSequence charSequence) {
        if (!this.f1335d.mo2769x() && this.f1335d.mo2767v()) {
            this.f1335d.mo2729J(false);
            this.f1335d.mo2755j().execute(new C0290a(i, charSequence));
        }
    }

    /* renamed from: G */
    public final void mo2666G() {
        if (this.f1335d.mo2767v()) {
            this.f1335d.mo2755j().execute(new C0291b());
        }
    }

    /* renamed from: H */
    public final void mo2667H(BiometricPrompt.C0278b bVar) {
        mo2668I(bVar);
        mo2678n();
    }

    /* renamed from: I */
    public final void mo2668I(BiometricPrompt.C0278b bVar) {
        if (this.f1335d.mo2767v()) {
            this.f1335d.mo2729J(false);
            this.f1335d.mo2755j().execute(new C0300k(bVar));
        }
    }

    /* renamed from: J */
    public final void mo2669J() {
        BiometricPrompt.Builder d = C0302m.m1674d(requireContext().getApplicationContext());
        CharSequence t = this.f1335d.mo2765t();
        CharSequence s = this.f1335d.mo2764s();
        CharSequence l = this.f1335d.mo2757l();
        if (t != null) {
            C0302m.m1678h(d, t);
        }
        if (s != null) {
            C0302m.m1677g(d, s);
        }
        if (l != null) {
            C0302m.m1675e(d, l);
        }
        CharSequence r = this.f1335d.mo2763r();
        if (!TextUtils.isEmpty(r)) {
            C0302m.m1676f(d, r, this.f1335d.mo2755j(), this.f1335d.mo2762q());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C0303n.m1679a(d, this.f1335d.mo2768w());
        }
        int b = this.f1335d.mo2747b();
        if (i >= 30) {
            C0304o.m1681a(d, b);
        } else if (i >= 29) {
            C0303n.m1680b(d, C0288b.m1628c(b));
        }
        mo2674i(C0302m.m1673c(d), getContext());
    }

    /* renamed from: K */
    public final void mo2670K() {
        Context applicationContext = requireContext().getApplicationContext();
        a22 b = a22.m14b(applicationContext);
        int l = m1632l(b);
        if (l != 0) {
            mo2664E(l, or1.m23963a(applicationContext, l));
        } else if (isAdded()) {
            this.f1335d.mo2738S(true);
            if (!ne1.m23126f(applicationContext, Build.MODEL)) {
                this.f1334a.postDelayed(new C0298i(), 500);
                z12.m30913B().mo22281x(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.f1335d.mo2730K(0);
            mo2675j(b, applicationContext);
        }
    }

    /* renamed from: L */
    public final void mo2671L(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(r45.default_error_msg);
        }
        this.f1335d.mo2741V(2);
        this.f1335d.mo2739T(charSequence);
    }

    /* renamed from: M */
    public void mo2672M() {
        if (!this.f1335d.mo2723D() && getContext() != null) {
            this.f1335d.mo2746a0(true);
            this.f1335d.mo2729J(true);
            if (mo2688v()) {
                mo2670K();
            } else {
                mo2669J();
            }
        }
    }

    /* renamed from: h */
    public void mo2673h(BiometricPrompt.C0280d dVar, BiometricPrompt.C0279c cVar) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.f1335d.mo2745Z(dVar);
            int b = C0288b.m1627b(dVar, cVar);
            if (Build.VERSION.SDK_INT < 30 && b == 15 && cVar == null) {
                this.f1335d.mo2735P(C0319f.m1762a());
            } else {
                this.f1335d.mo2735P(cVar);
            }
            if (mo2687u()) {
                this.f1335d.mo2744Y(getString(r45.confirm_device_credential_password));
            } else {
                this.f1335d.mo2744Y((CharSequence) null);
            }
            if (mo2687u() && C0309d.m1682g(activity).mo2708a(255) != 0) {
                this.f1335d.mo2729J(true);
                mo2689w();
            } else if (this.f1335d.mo2770y()) {
                this.f1334a.postDelayed(new C0306q(this), 600);
            } else {
                mo2672M();
            }
        }
    }

    /* renamed from: i */
    public void mo2674i(android.hardware.biometrics.BiometricPrompt biometricPrompt, Context context) {
        String str;
        BiometricPrompt.CryptoObject d = C0319f.m1765d(this.f1335d.mo2756k());
        CancellationSignal b = this.f1335d.mo2753h().mo26404b();
        C0305p pVar = new C0305p();
        BiometricPrompt.AuthenticationCallback a = this.f1335d.mo2748c().mo2650a();
        if (d == null) {
            try {
                C0302m.m1672b(biometricPrompt, b, pVar, a);
            } catch (NullPointerException unused) {
                if (context != null) {
                    str = context.getString(r45.default_error_msg);
                } else {
                    str = "";
                }
                mo2664E(1, str);
            }
        } else {
            C0302m.m1671a(biometricPrompt, d, b, pVar, a);
        }
    }

    /* renamed from: j */
    public void mo2675j(a22 a22, Context context) {
        try {
            a22.mo18a(C0319f.m1766e(this.f1335d.mo2756k()), 0, this.f1335d.mo2753h().mo26405c(), this.f1335d.mo2748c().mo2651b(), (Handler) null);
        } catch (NullPointerException unused) {
            mo2664E(1, or1.m23963a(context, 1));
        }
    }

    /* renamed from: k */
    public void mo2676k(int i) {
        if (i == 3 || !this.f1335d.mo2721B()) {
            if (mo2688v()) {
                this.f1335d.mo2730K(i);
                if (i == 1) {
                    mo2665F(10, or1.m23963a(getContext(), 10));
                }
            }
            this.f1335d.mo2753h().mo26403a();
        }
    }

    /* renamed from: m */
    public final void mo2677m() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C0314e eVar = (C0314e) new C0729l(getActivity()).mo6421a(C0314e.class);
            this.f1335d = eVar;
            eVar.mo2731L(activity);
            this.f1335d.mo2751f().observe(this, new C0292c());
            this.f1335d.mo2749d().observe(this, new C0293d());
            this.f1335d.mo2750e().observe(this, new C0294e());
            this.f1335d.mo2766u().observe(this, new C0295f());
            this.f1335d.mo2722C().observe(this, new C0296g());
            this.f1335d.mo2771z().observe(this, new C0297h());
        }
    }

    /* renamed from: n */
    public void mo2678n() {
        this.f1335d.mo2746a0(false);
        mo2679o();
        if (!this.f1335d.mo2769x() && isAdded()) {
            getParentFragmentManager().mo5996q().mo6146r(this).mo6140k();
        }
        Context context = getContext();
        if (context != null && ne1.m23125e(context, Build.MODEL)) {
            this.f1335d.mo2736Q(true);
            this.f1334a.postDelayed(new C0307r(this.f1335d), 600);
        }
    }

    /* renamed from: o */
    public final void mo2679o() {
        this.f1335d.mo2746a0(false);
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            z12 z12 = (z12) parentFragmentManager.mo5984l0("androidx.biometric.FingerprintDialogFragment");
            if (z12 == null) {
                return;
            }
            if (z12.isAdded()) {
                z12.mo22267l();
            } else {
                parentFragmentManager.mo5996q().mo6146r(z12).mo6140k();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.f1335d.mo2734O(false);
            mo2683q(i2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo2677m();
    }

    public void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && C0288b.m1628c(this.f1335d.mo2747b())) {
            this.f1335d.mo2742W(true);
            this.f1334a.postDelayed(new C0308s(this.f1335d), 250);
        }
    }

    public void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT < 29 && !this.f1335d.mo2769x() && !mo2684r()) {
            mo2676k(0);
        }
    }

    /* renamed from: p */
    public final int mo2682p() {
        Context context = getContext();
        if (context == null || !ne1.m23126f(context, Build.MODEL)) {
            return PlaybackException.ERROR_CODE_IO_UNSPECIFIED;
        }
        return 0;
    }

    /* renamed from: q */
    public final void mo2683q(int i) {
        if (i == -1) {
            mo2667H(new BiometricPrompt.C0278b((BiometricPrompt.C0279c) null, 1));
        } else {
            mo2664E(10, getString(r45.generic_error_user_canceled));
        }
    }

    /* renamed from: r */
    public final boolean mo2684r() {
        FragmentActivity activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final boolean mo2685s() {
        FragmentActivity activity = getActivity();
        if (activity == null || this.f1335d.mo2756k() == null || !ne1.m23127g(activity, Build.MANUFACTURER, Build.MODEL)) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public final boolean mo2686t() {
        if (Build.VERSION.SDK_INT != 28 || qk4.m25739a(getContext())) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public boolean mo2687u() {
        if (Build.VERSION.SDK_INT > 28 || !C0288b.m1628c(this.f1335d.mo2747b())) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final boolean mo2688v() {
        if (Build.VERSION.SDK_INT < 28 || mo2685s() || mo2686t()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final void mo2689w() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            KeyguardManager a = pb3.m24811a(activity);
            if (a == null) {
                mo2664E(12, getString(r45.generic_error_no_keyguard));
                return;
            }
            CharSequence t = this.f1335d.mo2765t();
            CharSequence s = this.f1335d.mo2764s();
            CharSequence l = this.f1335d.mo2757l();
            if (s == null) {
                s = l;
            }
            Intent a2 = C0301l.m1670a(a, t, s);
            if (a2 == null) {
                mo2664E(14, getString(r45.generic_error_no_device_credential));
                return;
            }
            this.f1335d.mo2734O(true);
            if (mo2688v()) {
                mo2679o();
            }
            a2.setFlags(134742016);
            startActivityForResult(a2, 1);
        }
    }

    /* renamed from: y */
    public void mo2690y(int i, CharSequence charSequence) {
        if (!or1.m23964b(i)) {
            i = 8;
        }
        Context context = getContext();
        if (Build.VERSION.SDK_INT < 29 && or1.m23965c(i) && context != null && pb3.m24812b(context) && C0288b.m1628c(this.f1335d.mo2747b())) {
            mo2689w();
        } else if (mo2688v()) {
            if (charSequence == null) {
                charSequence = or1.m23963a(getContext(), i);
            }
            if (i == 5) {
                int g = this.f1335d.mo2752g();
                if (g == 0 || g == 3) {
                    mo2665F(i, charSequence);
                }
                mo2678n();
                return;
            }
            if (this.f1335d.mo2720A()) {
                mo2664E(i, charSequence);
            } else {
                mo2671L(charSequence);
                this.f1334a.postDelayed(new C0299j(i, charSequence), (long) mo2682p());
            }
            this.f1335d.mo2738S(true);
        } else {
            if (charSequence == null) {
                charSequence = getString(r45.default_error_msg) + " " + i;
            }
            mo2664E(i, charSequence);
        }
    }

    /* renamed from: z */
    public void mo2691z() {
        if (mo2688v()) {
            mo2671L(getString(r45.fingerprint_not_recognized));
        }
        mo2666G();
    }
}

package androidx.biometric;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.C0282a;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: androidx.biometric.e */
/* compiled from: BiometricViewModel */
public class C0314e extends ad7 {

    /* renamed from: a */
    public Executor f1360a;

    /* renamed from: b */
    public BiometricPrompt.C0277a f1361b;

    /* renamed from: c */
    public WeakReference<FragmentActivity> f1362c;

    /* renamed from: d */
    public BiometricPrompt.C0280d f1363d;

    /* renamed from: e */
    public BiometricPrompt.C0279c f1364e;

    /* renamed from: f */
    public C0282a f1365f;

    /* renamed from: g */
    public ta0 f1366g;

    /* renamed from: h */
    public DialogInterface.OnClickListener f1367h;

    /* renamed from: i */
    public CharSequence f1368i;

    /* renamed from: j */
    public int f1369j = 0;

    /* renamed from: k */
    public boolean f1370k;

    /* renamed from: l */
    public boolean f1371l;

    /* renamed from: m */
    public boolean f1372m;

    /* renamed from: n */
    public boolean f1373n;

    /* renamed from: o */
    public boolean f1374o;

    /* renamed from: p */
    public k04<BiometricPrompt.C0278b> f1375p;

    /* renamed from: q */
    public k04<p10> f1376q;

    /* renamed from: r */
    public k04<CharSequence> f1377r;

    /* renamed from: s */
    public k04<Boolean> f1378s;

    /* renamed from: t */
    public k04<Boolean> f1379t;

    /* renamed from: u */
    public boolean f1380u = true;

    /* renamed from: v */
    public k04<Boolean> f1381v;

    /* renamed from: w */
    public int f1382w = 0;

    /* renamed from: x */
    public k04<Integer> f1383x;

    /* renamed from: y */
    public k04<CharSequence> f1384y;

    /* renamed from: androidx.biometric.e$a */
    /* compiled from: BiometricViewModel */
    public class C0315a extends BiometricPrompt.C0277a {
        public C0315a() {
        }
    }

    /* renamed from: androidx.biometric.e$b */
    /* compiled from: BiometricViewModel */
    public static final class C0316b extends C0282a.C0287d {

        /* renamed from: a */
        public final WeakReference<C0314e> f1386a;

        public C0316b(C0314e eVar) {
            this.f1386a = new WeakReference<>(eVar);
        }

        /* renamed from: a */
        public void mo2656a(int i, CharSequence charSequence) {
            if (this.f1386a.get() != null && !this.f1386a.get().mo2769x() && this.f1386a.get().mo2767v()) {
                this.f1386a.get().mo2725F(new p10(i, charSequence));
            }
        }

        /* renamed from: b */
        public void mo2657b() {
            if (this.f1386a.get() != null && this.f1386a.get().mo2767v()) {
                this.f1386a.get().mo2726G(true);
            }
        }

        /* renamed from: c */
        public void mo2658c(CharSequence charSequence) {
            if (this.f1386a.get() != null) {
                this.f1386a.get().mo2727H(charSequence);
            }
        }

        /* renamed from: d */
        public void mo2659d(BiometricPrompt.C0278b bVar) {
            if (this.f1386a.get() != null && this.f1386a.get().mo2767v()) {
                if (bVar.mo2632a() == -1) {
                    bVar = new BiometricPrompt.C0278b(bVar.mo2633b(), this.f1386a.get().mo2761p());
                }
                this.f1386a.get().mo2728I(bVar);
            }
        }
    }

    /* renamed from: androidx.biometric.e$c */
    /* compiled from: BiometricViewModel */
    public static class C0317c implements Executor {

        /* renamed from: a */
        public final Handler f1387a = new Handler(Looper.getMainLooper());

        public void execute(Runnable runnable) {
            this.f1387a.post(runnable);
        }
    }

    /* renamed from: androidx.biometric.e$d */
    /* compiled from: BiometricViewModel */
    public static class C0318d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public final WeakReference<C0314e> f1388a;

        public C0318d(C0314e eVar) {
            this.f1388a = new WeakReference<>(eVar);
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f1388a.get() != null) {
                this.f1388a.get().mo2743X(true);
            }
        }
    }

    /* renamed from: b0 */
    public static <T> void m1705b0(k04<T> k04, T t) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            k04.setValue(t);
        } else {
            k04.postValue(t);
        }
    }

    /* renamed from: A */
    public boolean mo2720A() {
        return this.f1380u;
    }

    /* renamed from: B */
    public boolean mo2721B() {
        return this.f1374o;
    }

    /* renamed from: C */
    public LiveData<Boolean> mo2722C() {
        if (this.f1379t == null) {
            this.f1379t = new k04<>();
        }
        return this.f1379t;
    }

    /* renamed from: D */
    public boolean mo2723D() {
        return this.f1370k;
    }

    /* renamed from: E */
    public void mo2724E() {
        this.f1361b = null;
    }

    /* renamed from: F */
    public void mo2725F(p10 p10) {
        if (this.f1376q == null) {
            this.f1376q = new k04<>();
        }
        m1705b0(this.f1376q, p10);
    }

    /* renamed from: G */
    public void mo2726G(boolean z) {
        if (this.f1378s == null) {
            this.f1378s = new k04<>();
        }
        m1705b0(this.f1378s, Boolean.valueOf(z));
    }

    /* renamed from: H */
    public void mo2727H(CharSequence charSequence) {
        if (this.f1377r == null) {
            this.f1377r = new k04<>();
        }
        m1705b0(this.f1377r, charSequence);
    }

    /* renamed from: I */
    public void mo2728I(BiometricPrompt.C0278b bVar) {
        if (this.f1375p == null) {
            this.f1375p = new k04<>();
        }
        m1705b0(this.f1375p, bVar);
    }

    /* renamed from: J */
    public void mo2729J(boolean z) {
        this.f1371l = z;
    }

    /* renamed from: K */
    public void mo2730K(int i) {
        this.f1369j = i;
    }

    /* renamed from: L */
    public void mo2731L(FragmentActivity fragmentActivity) {
        this.f1362c = new WeakReference<>(fragmentActivity);
    }

    /* renamed from: M */
    public void mo2732M(BiometricPrompt.C0277a aVar) {
        this.f1361b = aVar;
    }

    /* renamed from: N */
    public void mo2733N(Executor executor) {
        this.f1360a = executor;
    }

    /* renamed from: O */
    public void mo2734O(boolean z) {
        this.f1372m = z;
    }

    /* renamed from: P */
    public void mo2735P(BiometricPrompt.C0279c cVar) {
        this.f1364e = cVar;
    }

    /* renamed from: Q */
    public void mo2736Q(boolean z) {
        this.f1373n = z;
    }

    /* renamed from: R */
    public void mo2737R(boolean z) {
        if (this.f1381v == null) {
            this.f1381v = new k04<>();
        }
        m1705b0(this.f1381v, Boolean.valueOf(z));
    }

    /* renamed from: S */
    public void mo2738S(boolean z) {
        this.f1380u = z;
    }

    /* renamed from: T */
    public void mo2739T(CharSequence charSequence) {
        if (this.f1384y == null) {
            this.f1384y = new k04<>();
        }
        m1705b0(this.f1384y, charSequence);
    }

    /* renamed from: U */
    public void mo2740U(int i) {
        this.f1382w = i;
    }

    /* renamed from: V */
    public void mo2741V(int i) {
        if (this.f1383x == null) {
            this.f1383x = new k04<>();
        }
        m1705b0(this.f1383x, Integer.valueOf(i));
    }

    /* renamed from: W */
    public void mo2742W(boolean z) {
        this.f1374o = z;
    }

    /* renamed from: X */
    public void mo2743X(boolean z) {
        if (this.f1379t == null) {
            this.f1379t = new k04<>();
        }
        m1705b0(this.f1379t, Boolean.valueOf(z));
    }

    /* renamed from: Y */
    public void mo2744Y(CharSequence charSequence) {
        this.f1368i = charSequence;
    }

    /* renamed from: Z */
    public void mo2745Z(BiometricPrompt.C0280d dVar) {
        this.f1363d = dVar;
    }

    /* renamed from: a0 */
    public void mo2746a0(boolean z) {
        this.f1370k = z;
    }

    /* renamed from: b */
    public int mo2747b() {
        BiometricPrompt.C0280d dVar = this.f1363d;
        if (dVar != null) {
            return C0288b.m1627b(dVar, this.f1364e);
        }
        return 0;
    }

    /* renamed from: c */
    public C0282a mo2748c() {
        if (this.f1365f == null) {
            this.f1365f = new C0282a(new C0316b(this));
        }
        return this.f1365f;
    }

    /* renamed from: d */
    public k04<p10> mo2749d() {
        if (this.f1376q == null) {
            this.f1376q = new k04<>();
        }
        return this.f1376q;
    }

    /* renamed from: e */
    public LiveData<CharSequence> mo2750e() {
        if (this.f1377r == null) {
            this.f1377r = new k04<>();
        }
        return this.f1377r;
    }

    /* renamed from: f */
    public LiveData<BiometricPrompt.C0278b> mo2751f() {
        if (this.f1375p == null) {
            this.f1375p = new k04<>();
        }
        return this.f1375p;
    }

    /* renamed from: g */
    public int mo2752g() {
        return this.f1369j;
    }

    /* renamed from: h */
    public ta0 mo2753h() {
        if (this.f1366g == null) {
            this.f1366g = new ta0();
        }
        return this.f1366g;
    }

    /* renamed from: i */
    public BiometricPrompt.C0277a mo2754i() {
        if (this.f1361b == null) {
            this.f1361b = new C0315a();
        }
        return this.f1361b;
    }

    /* renamed from: j */
    public Executor mo2755j() {
        Executor executor = this.f1360a;
        if (executor != null) {
            return executor;
        }
        return new C0317c();
    }

    /* renamed from: k */
    public BiometricPrompt.C0279c mo2756k() {
        return this.f1364e;
    }

    /* renamed from: l */
    public CharSequence mo2757l() {
        BiometricPrompt.C0280d dVar = this.f1363d;
        if (dVar != null) {
            return dVar.mo2639b();
        }
        return null;
    }

    /* renamed from: m */
    public LiveData<CharSequence> mo2758m() {
        if (this.f1384y == null) {
            this.f1384y = new k04<>();
        }
        return this.f1384y;
    }

    /* renamed from: n */
    public int mo2759n() {
        return this.f1382w;
    }

    /* renamed from: o */
    public LiveData<Integer> mo2760o() {
        if (this.f1383x == null) {
            this.f1383x = new k04<>();
        }
        return this.f1383x;
    }

    /* renamed from: p */
    public int mo2761p() {
        int b = mo2747b();
        if (!C0288b.m1629d(b) || C0288b.m1628c(b)) {
            return -1;
        }
        return 2;
    }

    /* renamed from: q */
    public DialogInterface.OnClickListener mo2762q() {
        if (this.f1367h == null) {
            this.f1367h = new C0318d(this);
        }
        return this.f1367h;
    }

    /* renamed from: r */
    public CharSequence mo2763r() {
        CharSequence charSequence = this.f1368i;
        if (charSequence != null) {
            return charSequence;
        }
        BiometricPrompt.C0280d dVar = this.f1363d;
        if (dVar != null) {
            return dVar.mo2640c();
        }
        return null;
    }

    /* renamed from: s */
    public CharSequence mo2764s() {
        BiometricPrompt.C0280d dVar = this.f1363d;
        if (dVar != null) {
            return dVar.mo2641d();
        }
        return null;
    }

    /* renamed from: t */
    public CharSequence mo2765t() {
        BiometricPrompt.C0280d dVar = this.f1363d;
        if (dVar != null) {
            return dVar.mo2642e();
        }
        return null;
    }

    /* renamed from: u */
    public LiveData<Boolean> mo2766u() {
        if (this.f1378s == null) {
            this.f1378s = new k04<>();
        }
        return this.f1378s;
    }

    /* renamed from: v */
    public boolean mo2767v() {
        return this.f1371l;
    }

    /* renamed from: w */
    public boolean mo2768w() {
        BiometricPrompt.C0280d dVar = this.f1363d;
        if (dVar == null || dVar.mo2643f()) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public boolean mo2769x() {
        return this.f1372m;
    }

    /* renamed from: y */
    public boolean mo2770y() {
        return this.f1373n;
    }

    /* renamed from: z */
    public LiveData<Boolean> mo2771z() {
        if (this.f1381v == null) {
            this.f1381v = new k04<>();
        }
        return this.f1381v;
    }
}

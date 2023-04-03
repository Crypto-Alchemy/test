package p000;

import android.os.CancellationSignal;

/* renamed from: ta0 */
/* compiled from: CancellationSignalProvider */
public class ta0 {

    /* renamed from: a */
    public final C3353c f18108a = new C3351a();

    /* renamed from: b */
    public CancellationSignal f18109b;

    /* renamed from: c */
    public sa0 f18110c;

    /* renamed from: ta0$a */
    /* compiled from: CancellationSignalProvider */
    public class C3351a implements C3353c {
        public C3351a() {
        }

        /* renamed from: a */
        public sa0 mo26406a() {
            return new sa0();
        }

        /* renamed from: b */
        public CancellationSignal mo26407b() {
            return C3352b.m27661b();
        }
    }

    /* renamed from: ta0$b */
    /* compiled from: CancellationSignalProvider */
    public static class C3352b {
        /* renamed from: a */
        public static void m27660a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        /* renamed from: b */
        public static CancellationSignal m27661b() {
            return new CancellationSignal();
        }
    }

    /* renamed from: ta0$c */
    /* compiled from: CancellationSignalProvider */
    public interface C3353c {
        /* renamed from: a */
        sa0 mo26406a();

        /* renamed from: b */
        CancellationSignal mo26407b();
    }

    /* renamed from: a */
    public void mo26403a() {
        CancellationSignal cancellationSignal = this.f18109b;
        if (cancellationSignal != null) {
            try {
                C3352b.m27660a(cancellationSignal);
            } catch (NullPointerException unused) {
            }
            this.f18109b = null;
        }
        sa0 sa0 = this.f18110c;
        if (sa0 != null) {
            try {
                sa0.mo25692a();
            } catch (NullPointerException unused2) {
            }
            this.f18110c = null;
        }
    }

    /* renamed from: b */
    public CancellationSignal mo26404b() {
        if (this.f18109b == null) {
            this.f18109b = this.f18108a.mo26407b();
        }
        return this.f18109b;
    }

    /* renamed from: c */
    public sa0 mo26405c() {
        if (this.f18110c == null) {
            this.f18110c = this.f18108a.mo26406a();
        }
        return this.f18110c;
    }
}

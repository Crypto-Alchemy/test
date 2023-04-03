package p000;

import com.google.android.gms.internal.measurement.C4085b;
import java.util.List;

/* renamed from: at8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class at8 extends s49<at8, ys8> implements t79 {
    /* access modifiers changed from: private */
    public static final at8 zzh;
    /* access modifiers changed from: private */
    public j59 zza = s49.m51526m();
    /* access modifiers changed from: private */
    public j59 zze = s49.m51526m();
    private m59<tq8> zzf = s49.m51528o();
    private m59<et8> zzg = s49.m51528o();

    static {
        at8 at8 = new at8();
        zzh = at8;
        s49.m51531u(at8.class, at8);
    }

    /* renamed from: I */
    public static ys8 m31926I() {
        return (ys8) zzh.mo47633r();
    }

    /* renamed from: J */
    public static at8 m31927J() {
        return zzh;
    }

    /* renamed from: L */
    public static /* synthetic */ void m31929L(at8 at8, Iterable iterable) {
        j59 j59 = at8.zza;
        if (!j59.zza()) {
            at8.zza = s49.m51527n(j59);
        }
        C4085b.m34125j(iterable, at8.zza);
    }

    /* renamed from: N */
    public static /* synthetic */ void m31931N(at8 at8, Iterable iterable) {
        j59 j59 = at8.zze;
        if (!j59.zza()) {
            at8.zze = s49.m51527n(j59);
        }
        C4085b.m34125j(iterable, at8.zze);
    }

    /* renamed from: P */
    public static /* synthetic */ void m31933P(at8 at8, Iterable iterable) {
        at8.mo29061T();
        C4085b.m34125j(iterable, at8.zzf);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m31934Q(at8 at8, int i) {
        at8.mo29061T();
        at8.zzf.remove(i);
    }

    /* renamed from: R */
    public static /* synthetic */ void m31935R(at8 at8, Iterable iterable) {
        at8.mo29062U();
        C4085b.m34125j(iterable, at8.zzg);
    }

    /* renamed from: S */
    public static /* synthetic */ void m31936S(at8 at8, int i) {
        at8.mo29062U();
        at8.zzg.remove(i);
    }

    /* renamed from: B */
    public final int mo29054B() {
        return this.zze.size();
    }

    /* renamed from: C */
    public final List<tq8> mo29055C() {
        return this.zzf;
    }

    /* renamed from: D */
    public final int mo29056D() {
        return this.zzf.size();
    }

    /* renamed from: E */
    public final tq8 mo29057E(int i) {
        return this.zzf.get(i);
    }

    /* renamed from: F */
    public final List<et8> mo29058F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final int mo29059G() {
        return this.zzg.size();
    }

    /* renamed from: H */
    public final et8 mo29060H(int i) {
        return this.zzg.get(i);
    }

    /* renamed from: T */
    public final void mo29061T() {
        m59<tq8> m59 = this.zzf;
        if (!m59.zza()) {
            this.zzf = s49.m51529p(m59);
        }
    }

    /* renamed from: U */
    public final void mo29062U() {
        m59<et8> m59 = this.zzg;
        if (!m59.zza()) {
            this.zzg = s49.m51529p(m59);
        }
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzh, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zza", "zze", "zzf", tq8.class, "zzg", et8.class});
        } else if (i2 == 3) {
            return new at8();
        } else {
            if (i2 == 4) {
                return new ys8((bq8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzh;
        }
    }

    /* renamed from: x */
    public final List<Long> mo29063x() {
        return this.zza;
    }

    /* renamed from: y */
    public final int mo29064y() {
        return this.zza.size();
    }

    /* renamed from: z */
    public final List<Long> mo29065z() {
        return this.zze;
    }
}

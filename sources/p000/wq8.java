package p000;

import com.google.android.gms.internal.measurement.C4085b;
import java.util.List;

/* renamed from: wq8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class wq8 extends s49<wq8, uq8> implements t79 {
    /* access modifiers changed from: private */
    public static final wq8 zzj;
    private int zza;
    /* access modifiers changed from: private */
    public m59<er8> zze = s49.m51528o();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        wq8 wq8 = new wq8();
        zzj = wq8;
        s49.m51531u(wq8.class, wq8);
    }

    /* renamed from: I */
    public static uq8 m54013I() {
        return (uq8) zzj.mo47633r();
    }

    /* renamed from: K */
    public static /* synthetic */ void m54015K(wq8 wq8, int i, er8 er8) {
        er8.getClass();
        wq8.mo49254S();
        wq8.zze.set(i, er8);
    }

    /* renamed from: L */
    public static /* synthetic */ void m54016L(wq8 wq8, er8 er8) {
        er8.getClass();
        wq8.mo49254S();
        wq8.zze.add(er8);
    }

    /* renamed from: M */
    public static /* synthetic */ void m54017M(wq8 wq8, Iterable iterable) {
        wq8.mo49254S();
        C4085b.m34125j(iterable, wq8.zze);
    }

    /* renamed from: O */
    public static /* synthetic */ void m54019O(wq8 wq8, int i) {
        wq8.mo49254S();
        wq8.zze.remove(i);
    }

    /* renamed from: P */
    public static /* synthetic */ void m54020P(wq8 wq8, String str) {
        str.getClass();
        wq8.zza |= 1;
        wq8.zzf = str;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m54021Q(wq8 wq8, long j) {
        wq8.zza |= 2;
        wq8.zzg = j;
    }

    /* renamed from: R */
    public static /* synthetic */ void m54022R(wq8 wq8, long j) {
        wq8.zza |= 4;
        wq8.zzh = j;
    }

    /* renamed from: B */
    public final String mo49247B() {
        return this.zzf;
    }

    /* renamed from: C */
    public final boolean mo49248C() {
        return (this.zza & 2) != 0;
    }

    /* renamed from: D */
    public final long mo49249D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final boolean mo49250E() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: F */
    public final long mo49251F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean mo49252G() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: H */
    public final int mo49253H() {
        return this.zzi;
    }

    /* renamed from: S */
    public final void mo49254S() {
        m59<er8> m59 = this.zze;
        if (!m59.zza()) {
            this.zze = s49.m51529p(m59);
        }
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zza", "zze", er8.class, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new wq8();
        } else {
            if (i2 == 4) {
                return new uq8((bq8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }

    /* renamed from: x */
    public final List<er8> mo49255x() {
        return this.zze;
    }

    /* renamed from: y */
    public final int mo49256y() {
        return this.zze.size();
    }

    /* renamed from: z */
    public final er8 mo49257z(int i) {
        return this.zze.get(i);
    }
}

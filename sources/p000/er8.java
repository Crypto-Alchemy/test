package p000;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.internal.measurement.C4085b;
import java.util.List;

/* renamed from: er8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class er8 extends s49<er8, br8> implements t79 {
    /* access modifiers changed from: private */
    public static final er8 zzk;
    private int zza;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;
    /* access modifiers changed from: private */
    public m59<er8> zzj = s49.m51528o();

    static {
        er8 er8 = new er8();
        zzk = er8;
        s49.m51531u(er8.class, er8);
    }

    /* renamed from: K */
    public static br8 m44025K() {
        return (br8) zzk.mo47633r();
    }

    /* renamed from: M */
    public static /* synthetic */ void m44027M(er8 er8, String str) {
        str.getClass();
        er8.zza |= 1;
        er8.zze = str;
    }

    /* renamed from: N */
    public static /* synthetic */ void m44028N(er8 er8, String str) {
        str.getClass();
        er8.zza |= 2;
        er8.zzf = str;
    }

    /* renamed from: O */
    public static /* synthetic */ void m44029O(er8 er8) {
        er8.zza &= -3;
        er8.zzf = zzk.zzf;
    }

    /* renamed from: P */
    public static /* synthetic */ void m44030P(er8 er8, long j) {
        er8.zza |= 4;
        er8.zzg = j;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m44031Q(er8 er8) {
        er8.zza &= -5;
        er8.zzg = 0;
    }

    /* renamed from: R */
    public static /* synthetic */ void m44032R(er8 er8, double d) {
        er8.zza |= 16;
        er8.zzi = d;
    }

    /* renamed from: S */
    public static /* synthetic */ void m44033S(er8 er8) {
        er8.zza &= -17;
        er8.zzi = Utils.DOUBLE_EPSILON;
    }

    /* renamed from: T */
    public static /* synthetic */ void m44034T(er8 er8, er8 er82) {
        er82.getClass();
        er8.mo42391X();
        er8.zzj.add(er82);
    }

    /* renamed from: U */
    public static /* synthetic */ void m44035U(er8 er8, Iterable iterable) {
        er8.mo42391X();
        C4085b.m34125j(iterable, er8.zzj);
    }

    /* renamed from: B */
    public final String mo42382B() {
        return this.zzf;
    }

    /* renamed from: C */
    public final boolean mo42383C() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: D */
    public final long mo42384D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final boolean mo42385E() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: F */
    public final float mo42386F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean mo42387G() {
        return (this.zza & 16) != 0;
    }

    /* renamed from: H */
    public final double mo42388H() {
        return this.zzi;
    }

    /* renamed from: I */
    public final List<er8> mo42389I() {
        return this.zzj;
    }

    /* renamed from: J */
    public final int mo42390J() {
        return this.zzj.size();
    }

    /* renamed from: X */
    public final void mo42391X() {
        m59<er8> m59 = this.zzj;
        if (!m59.zza()) {
            this.zzj = s49.m51529p(m59);
        }
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", er8.class});
        } else if (i2 == 3) {
            return new er8();
        } else {
            if (i2 == 4) {
                return new br8((bq8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzk;
        }
    }

    /* renamed from: x */
    public final boolean mo42392x() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: y */
    public final String mo42393y() {
        return this.zze;
    }

    /* renamed from: z */
    public final boolean mo42394z() {
        return (this.zza & 2) != 0;
    }
}

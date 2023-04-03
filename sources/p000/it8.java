package p000;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: it8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class it8 extends s49<it8, gt8> implements t79 {
    /* access modifiers changed from: private */
    public static final it8 zzk;
    private int zza;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        it8 it8 = new it8();
        zzk = it8;
        s49.m51531u(it8.class, it8);
    }

    /* renamed from: H */
    public static gt8 m45961H() {
        return (gt8) zzk.mo47633r();
    }

    /* renamed from: J */
    public static /* synthetic */ void m45963J(it8 it8, long j) {
        it8.zza |= 1;
        it8.zze = j;
    }

    /* renamed from: K */
    public static /* synthetic */ void m45964K(it8 it8, String str) {
        str.getClass();
        it8.zza |= 2;
        it8.zzf = str;
    }

    /* renamed from: L */
    public static /* synthetic */ void m45965L(it8 it8, String str) {
        str.getClass();
        it8.zza |= 4;
        it8.zzg = str;
    }

    /* renamed from: M */
    public static /* synthetic */ void m45966M(it8 it8) {
        it8.zza &= -5;
        it8.zzg = zzk.zzg;
    }

    /* renamed from: N */
    public static /* synthetic */ void m45967N(it8 it8, long j) {
        it8.zza |= 8;
        it8.zzh = j;
    }

    /* renamed from: O */
    public static /* synthetic */ void m45968O(it8 it8) {
        it8.zza &= -9;
        it8.zzh = 0;
    }

    /* renamed from: P */
    public static /* synthetic */ void m45969P(it8 it8, double d) {
        it8.zza |= 32;
        it8.zzj = d;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m45970Q(it8 it8) {
        it8.zza &= -33;
        it8.zzj = Utils.DOUBLE_EPSILON;
    }

    /* renamed from: B */
    public final boolean mo43923B() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: C */
    public final String mo43924C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final boolean mo43925D() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: E */
    public final long mo43926E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final boolean mo43927F() {
        return (this.zza & 32) != 0;
    }

    /* renamed from: G */
    public final double mo43928G() {
        return this.zzj;
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new it8();
        } else {
            if (i2 == 4) {
                return new gt8((bq8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzk;
        }
    }

    /* renamed from: x */
    public final boolean mo43929x() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: y */
    public final long mo43930y() {
        return this.zze;
    }

    /* renamed from: z */
    public final String mo43931z() {
        return this.zzf;
    }
}

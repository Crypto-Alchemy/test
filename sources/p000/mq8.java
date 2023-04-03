package p000;

/* renamed from: mq8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class mq8 extends s49<mq8, lq8> implements t79 {
    /* access modifiers changed from: private */
    public static final mq8 zzi;
    private int zza;
    private int zze;
    private at8 zzf;
    private at8 zzg;
    private boolean zzh;

    static {
        mq8 mq8 = new mq8();
        zzi = mq8;
        s49.m51531u(mq8.class, mq8);
    }

    /* renamed from: F */
    public static lq8 m48422F() {
        return (lq8) zzi.mo47633r();
    }

    /* renamed from: H */
    public static /* synthetic */ void m48424H(mq8 mq8, int i) {
        mq8.zza |= 1;
        mq8.zze = i;
    }

    /* renamed from: I */
    public static /* synthetic */ void m48425I(mq8 mq8, at8 at8) {
        at8.getClass();
        mq8.zzf = at8;
        mq8.zza |= 2;
    }

    /* renamed from: J */
    public static /* synthetic */ void m48426J(mq8 mq8, at8 at8) {
        mq8.zzg = at8;
        mq8.zza |= 4;
    }

    /* renamed from: K */
    public static /* synthetic */ void m48427K(mq8 mq8, boolean z) {
        mq8.zza |= 8;
        mq8.zzh = z;
    }

    /* renamed from: B */
    public final boolean mo45852B() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: C */
    public final at8 mo45853C() {
        at8 at8 = this.zzg;
        if (at8 == null) {
            return at8.m31927J();
        }
        return at8;
    }

    /* renamed from: D */
    public final boolean mo45854D() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: E */
    public final boolean mo45855E() {
        return this.zzh;
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new mq8();
        } else {
            if (i2 == 4) {
                return new lq8((bq8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }

    /* renamed from: x */
    public final boolean mo45856x() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: y */
    public final int mo45857y() {
        return this.zze;
    }

    /* renamed from: z */
    public final at8 mo45858z() {
        at8 at8 = this.zzf;
        if (at8 == null) {
            return at8.m31927J();
        }
        return at8;
    }
}

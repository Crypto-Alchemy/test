package p000;

/* renamed from: tq8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class tq8 extends s49<tq8, rq8> implements t79 {
    /* access modifiers changed from: private */
    public static final tq8 zzg;
    private int zza;
    private int zze;
    private long zzf;

    static {
        tq8 tq8 = new tq8();
        zzg = tq8;
        s49.m51531u(tq8.class, tq8);
    }

    /* renamed from: C */
    public static rq8 m52412C() {
        return (rq8) zzg.mo47633r();
    }

    /* renamed from: E */
    public static /* synthetic */ void m52414E(tq8 tq8, int i) {
        tq8.zza |= 1;
        tq8.zze = i;
    }

    /* renamed from: F */
    public static /* synthetic */ void m52415F(tq8 tq8, long j) {
        tq8.zza |= 2;
        tq8.zzf = j;
    }

    /* renamed from: B */
    public final long mo48157B() {
        return this.zzf;
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        } else if (i2 == 3) {
            return new tq8();
        } else {
            if (i2 == 4) {
                return new rq8((bq8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }

    /* renamed from: x */
    public final boolean mo48158x() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: y */
    public final int mo48159y() {
        return this.zze;
    }

    /* renamed from: z */
    public final boolean mo48160z() {
        return (this.zza & 2) != 0;
    }
}

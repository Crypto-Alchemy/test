package p000;

/* renamed from: rn8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class rn8 extends s49<rn8, on8> implements t79 {
    /* access modifiers changed from: private */
    public static final rn8 zzk;
    private int zza;
    private int zze;
    private String zzf = "";
    private xm8 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        rn8 rn8 = new rn8();
        zzk = rn8;
        s49.m51531u(rn8.class, rn8);
    }

    /* renamed from: G */
    public static on8 m51180G() {
        return (on8) zzk.mo47633r();
    }

    /* renamed from: I */
    public static /* synthetic */ void m51182I(rn8 rn8, String str) {
        rn8.zza |= 2;
        rn8.zzf = str;
    }

    /* renamed from: B */
    public final xm8 mo47447B() {
        xm8 xm8 = this.zzg;
        if (xm8 == null) {
            return xm8.m54447G();
        }
        return xm8;
    }

    /* renamed from: C */
    public final boolean mo47448C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final boolean mo47449D() {
        return this.zzi;
    }

    /* renamed from: E */
    public final boolean mo47450E() {
        return (this.zza & 32) != 0;
    }

    /* renamed from: F */
    public final boolean mo47451F() {
        return this.zzj;
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new rn8();
        } else {
            if (i2 == 4) {
                return new on8((fm8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzk;
        }
    }

    /* renamed from: x */
    public final boolean mo47452x() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: y */
    public final int mo47453y() {
        return this.zze;
    }

    /* renamed from: z */
    public final String mo47454z() {
        return this.zzf;
    }
}

package p000;

/* renamed from: xm8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class xm8 extends s49<xm8, um8> implements t79 {
    /* access modifiers changed from: private */
    public static final xm8 zzi;
    private int zza;
    private eo8 zze;
    private ln8 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        xm8 xm8 = new xm8();
        zzi = xm8;
        s49.m51531u(xm8.class, xm8);
    }

    /* renamed from: G */
    public static xm8 m54447G() {
        return zzi;
    }

    /* renamed from: I */
    public static /* synthetic */ void m54449I(xm8 xm8, String str) {
        xm8.zza |= 8;
        xm8.zzh = str;
    }

    /* renamed from: B */
    public final ln8 mo49513B() {
        ln8 ln8 = this.zzf;
        if (ln8 == null) {
            return ln8.m47870I();
        }
        return ln8;
    }

    /* renamed from: C */
    public final boolean mo49514C() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: D */
    public final boolean mo49515D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final boolean mo49516E() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: F */
    public final String mo49517F() {
        return this.zzh;
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new xm8();
        } else {
            if (i2 == 4) {
                return new um8((fm8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }

    /* renamed from: x */
    public final boolean mo49518x() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: y */
    public final eo8 mo49519y() {
        eo8 eo8 = this.zze;
        if (eo8 == null) {
            return eo8.m44002G();
        }
        return eo8;
    }

    /* renamed from: z */
    public final boolean mo49520z() {
        return (this.zza & 2) != 0;
    }
}

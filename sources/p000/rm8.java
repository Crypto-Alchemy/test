package p000;

import java.util.List;

/* renamed from: rm8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class rm8 extends s49<rm8, om8> implements t79 {
    /* access modifiers changed from: private */
    public static final rm8 zzm;
    private int zza;
    private int zze;
    private String zzf = "";
    private m59<xm8> zzg = s49.m51528o();
    private boolean zzh;
    private ln8 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        rm8 rm8 = new rm8();
        zzm = rm8;
        s49.m51531u(rm8.class, rm8);
    }

    /* renamed from: K */
    public static om8 m51160K() {
        return (om8) zzm.mo47633r();
    }

    /* renamed from: M */
    public static /* synthetic */ void m51162M(rm8 rm8, String str) {
        rm8.zza |= 2;
        rm8.zzf = str;
    }

    /* renamed from: N */
    public static /* synthetic */ void m51163N(rm8 rm8, int i, xm8 xm8) {
        xm8.getClass();
        m59<xm8> m59 = rm8.zzg;
        if (!m59.zza()) {
            rm8.zzg = s49.m51529p(m59);
        }
        rm8.zzg.set(i, xm8);
    }

    /* renamed from: B */
    public final List<xm8> mo47435B() {
        return this.zzg;
    }

    /* renamed from: C */
    public final int mo47436C() {
        return this.zzg.size();
    }

    /* renamed from: D */
    public final xm8 mo47437D(int i) {
        return this.zzg.get(i);
    }

    /* renamed from: E */
    public final boolean mo47438E() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: F */
    public final ln8 mo47439F() {
        ln8 ln8 = this.zzi;
        if (ln8 == null) {
            return ln8.m47870I();
        }
        return ln8;
    }

    /* renamed from: G */
    public final boolean mo47440G() {
        return this.zzj;
    }

    /* renamed from: H */
    public final boolean mo47441H() {
        return this.zzk;
    }

    /* renamed from: I */
    public final boolean mo47442I() {
        return (this.zza & 64) != 0;
    }

    /* renamed from: J */
    public final boolean mo47443J() {
        return this.zzl;
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zza", "zze", "zzf", "zzg", xm8.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new rm8();
        } else {
            if (i2 == 4) {
                return new om8((fm8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzm;
        }
    }

    /* renamed from: x */
    public final boolean mo47444x() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: y */
    public final int mo47445y() {
        return this.zze;
    }

    /* renamed from: z */
    public final String mo47446z() {
        return this.zzf;
    }
}

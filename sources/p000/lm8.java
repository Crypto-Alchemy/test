package p000;

import java.util.List;

/* renamed from: lm8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class lm8 extends s49<lm8, im8> implements t79 {
    /* access modifiers changed from: private */
    public static final lm8 zzj;
    private int zza;
    private int zze;
    private m59<rn8> zzf = s49.m51528o();
    private m59<rm8> zzg = s49.m51528o();
    private boolean zzh;
    private boolean zzi;

    static {
        lm8 lm8 = new lm8();
        zzj = lm8;
        s49.m51531u(lm8.class, lm8);
    }

    /* renamed from: H */
    public static /* synthetic */ void m47850H(lm8 lm8, int i, rn8 rn8) {
        rn8.getClass();
        m59<rn8> m59 = lm8.zzf;
        if (!m59.zza()) {
            lm8.zzf = s49.m51529p(m59);
        }
        lm8.zzf.set(i, rn8);
    }

    /* renamed from: I */
    public static /* synthetic */ void m47851I(lm8 lm8, int i, rm8 rm8) {
        rm8.getClass();
        m59<rm8> m59 = lm8.zzg;
        if (!m59.zza()) {
            lm8.zzg = s49.m51529p(m59);
        }
        lm8.zzg.set(i, rm8);
    }

    /* renamed from: B */
    public final int mo45452B() {
        return this.zzf.size();
    }

    /* renamed from: C */
    public final rn8 mo45453C(int i) {
        return this.zzf.get(i);
    }

    /* renamed from: D */
    public final List<rm8> mo45454D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final int mo45455E() {
        return this.zzg.size();
    }

    /* renamed from: F */
    public final rm8 mo45456F(int i) {
        return this.zzg.get(i);
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zza", "zze", "zzf", rn8.class, "zzg", rm8.class, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new lm8();
        } else {
            if (i2 == 4) {
                return new im8((fm8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }

    /* renamed from: x */
    public final boolean mo45457x() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: y */
    public final int mo45458y() {
        return this.zze;
    }

    /* renamed from: z */
    public final List<rn8> mo45459z() {
        return this.zzf;
    }
}

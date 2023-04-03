package p000;

import com.google.android.gms.internal.measurement.C4085b;
import java.util.List;

/* renamed from: et8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class et8 extends s49<et8, ct8> implements t79 {
    /* access modifiers changed from: private */
    public static final et8 zzg;
    private int zza;
    private int zze;
    private j59 zzf = s49.m51526m();

    static {
        et8 et8 = new et8();
        zzg = et8;
        s49.m51531u(et8.class, et8);
    }

    /* renamed from: D */
    public static ct8 m44059D() {
        return (ct8) zzg.mo47633r();
    }

    /* renamed from: F */
    public static /* synthetic */ void m44061F(et8 et8, int i) {
        et8.zza |= 1;
        et8.zze = i;
    }

    /* renamed from: G */
    public static /* synthetic */ void m44062G(et8 et8, Iterable iterable) {
        j59 j59 = et8.zzf;
        if (!j59.zza()) {
            et8.zzf = s49.m51527n(j59);
        }
        C4085b.m34125j(iterable, et8.zzf);
    }

    /* renamed from: B */
    public final int mo42413B() {
        return this.zzf.size();
    }

    /* renamed from: C */
    public final long mo42414C(int i) {
        return this.zzf.mo44057Y(i);
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zza", "zze", "zzf"});
        } else if (i2 == 3) {
            return new et8();
        } else {
            if (i2 == 4) {
                return new ct8((bq8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }

    /* renamed from: x */
    public final boolean mo42415x() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: y */
    public final int mo42416y() {
        return this.zze;
    }

    /* renamed from: z */
    public final List<Long> mo42417z() {
        return this.zzf;
    }
}

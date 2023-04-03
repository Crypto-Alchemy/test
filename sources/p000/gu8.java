package p000;

import com.google.android.gms.internal.measurement.zzgs;
import java.util.List;

/* renamed from: gu8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class gu8 extends s49<gu8, yt8> implements t79 {
    /* access modifiers changed from: private */
    public static final gu8 zzk;
    private int zza;
    private int zze;
    private m59<gu8> zzf = s49.m51528o();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        gu8 gu8 = new gu8();
        zzk = gu8;
        s49.m51531u(gu8.class, gu8);
    }

    /* renamed from: B */
    public final boolean mo42985B() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: C */
    public final String mo42986C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final boolean mo42987D() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: E */
    public final boolean mo42988E() {
        return this.zzi;
    }

    /* renamed from: F */
    public final boolean mo42989F() {
        return (this.zza & 16) != 0;
    }

    /* renamed from: G */
    public final double mo42990G() {
        return this.zzj;
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zza", "zze", zzgs.zzb(), "zzf", gu8.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new gu8();
        } else {
            if (i2 == 4) {
                return new yt8((kt8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzk;
        }
    }

    /* renamed from: x */
    public final zzgs mo42991x() {
        zzgs zza2 = zzgs.zza(this.zze);
        if (zza2 == null) {
            return zzgs.UNKNOWN;
        }
        return zza2;
    }

    /* renamed from: y */
    public final List<gu8> mo42992y() {
        return this.zzf;
    }

    /* renamed from: z */
    public final String mo42993z() {
        return this.zzg;
    }
}

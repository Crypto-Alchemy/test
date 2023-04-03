package p000;

import com.google.android.gms.internal.measurement.zzew;
import java.util.List;

/* renamed from: eo8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class eo8 extends s49<eo8, un8> implements t79 {
    /* access modifiers changed from: private */
    public static final eo8 zzi;
    private int zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private m59<String> zzh = s49.m51528o();

    static {
        eo8 eo8 = new eo8();
        zzi = eo8;
        s49.m51531u(eo8.class, eo8);
    }

    /* renamed from: G */
    public static eo8 m44002G() {
        return zzi;
    }

    /* renamed from: B */
    public final String mo42336B() {
        return this.zzf;
    }

    /* renamed from: C */
    public final boolean mo42337C() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: D */
    public final boolean mo42338D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final List<String> mo42339E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final int mo42340F() {
        return this.zzh.size();
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zza", "zze", zzew.zzb(), "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new eo8();
        } else {
            if (i2 == 4) {
                return new un8((fm8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }

    /* renamed from: x */
    public final boolean mo42341x() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: y */
    public final zzew mo42342y() {
        zzew zza2 = zzew.zza(this.zze);
        if (zza2 == null) {
            return zzew.UNKNOWN_MATCH_TYPE;
        }
        return zza2;
    }

    /* renamed from: z */
    public final boolean mo42343z() {
        return (this.zza & 2) != 0;
    }
}

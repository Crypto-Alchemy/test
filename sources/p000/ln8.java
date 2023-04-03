package p000;

import com.google.android.gms.internal.measurement.zzep;

/* renamed from: ln8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class ln8 extends s49<ln8, an8> implements t79 {
    /* access modifiers changed from: private */
    public static final ln8 zzj;
    private int zza;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        ln8 ln8 = new ln8();
        zzj = ln8;
        s49.m51531u(ln8.class, ln8);
    }

    /* renamed from: I */
    public static ln8 m47870I() {
        return zzj;
    }

    /* renamed from: B */
    public final boolean mo45464B() {
        return this.zzf;
    }

    /* renamed from: C */
    public final boolean mo45465C() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: D */
    public final String mo45466D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final boolean mo45467E() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: F */
    public final String mo45468F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean mo45469G() {
        return (this.zza & 16) != 0;
    }

    /* renamed from: H */
    public final String mo45470H() {
        return this.zzi;
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zza", "zze", zzep.zzb(), "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new ln8();
        } else {
            if (i2 == 4) {
                return new an8((fm8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }

    /* renamed from: x */
    public final boolean mo45471x() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: y */
    public final zzep mo45472y() {
        zzep zza2 = zzep.zza(this.zze);
        if (zza2 == null) {
            return zzep.UNKNOWN_COMPARISON_TYPE;
        }
        return zza2;
    }

    /* renamed from: z */
    public final boolean mo45473z() {
        return (this.zza & 2) != 0;
    }
}

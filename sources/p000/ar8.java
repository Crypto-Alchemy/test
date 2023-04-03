package p000;

/* renamed from: ar8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class ar8 extends s49<ar8, yq8> implements t79 {
    /* access modifiers changed from: private */
    public static final ar8 zzg;
    private int zza;
    private String zze = "";
    private long zzf;

    static {
        ar8 ar8 = new ar8();
        zzg = ar8;
        s49.m51531u(ar8.class, ar8);
    }

    /* renamed from: B */
    public static /* synthetic */ void m31912B(ar8 ar8, long j) {
        ar8.zza |= 2;
        ar8.zzf = j;
    }

    /* renamed from: x */
    public static yq8 m31913x() {
        return (yq8) zzg.mo47633r();
    }

    /* renamed from: z */
    public static /* synthetic */ void m31915z(ar8 ar8, String str) {
        str.getClass();
        ar8.zza |= 1;
        ar8.zze = str;
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        } else if (i2 == 3) {
            return new ar8();
        } else {
            if (i2 == 4) {
                return new yq8((bq8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}

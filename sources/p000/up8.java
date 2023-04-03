package p000;

/* renamed from: up8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class up8 extends s49<up8, rp8> implements t79 {
    /* access modifiers changed from: private */
    public static final up8 zzg;
    private int zza;
    private String zze = "";
    private String zzf = "";

    static {
        up8 up8 = new up8();
        zzg = up8;
        s49.m51531u(up8.class, up8);
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zza", "zze", "zzf"});
        } else if (i2 == 3) {
            return new up8();
        } else {
            if (i2 == 4) {
                return new rp8((ho8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }

    /* renamed from: x */
    public final String mo48484x() {
        return this.zze;
    }

    /* renamed from: y */
    public final String mo48485y() {
        return this.zzf;
    }
}

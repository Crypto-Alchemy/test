package p000;

/* renamed from: hp8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class hp8 extends s49<hp8, ko8> implements t79 {
    /* access modifiers changed from: private */
    public static final hp8 zzi;
    private int zza;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        hp8 hp8 = new hp8();
        zzi = hp8;
        s49.m51531u(hp8.class, hp8);
    }

    /* renamed from: E */
    public static /* synthetic */ void m45339E(hp8 hp8, String str) {
        str.getClass();
        hp8.zza |= 1;
        hp8.zze = str;
    }

    /* renamed from: B */
    public final boolean mo43341B() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: C */
    public final int mo43342C() {
        return this.zzh;
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new hp8();
        } else {
            if (i2 == 4) {
                return new ko8((ho8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }

    /* renamed from: x */
    public final String mo43343x() {
        return this.zze;
    }

    /* renamed from: y */
    public final boolean mo43344y() {
        return this.zzf;
    }

    /* renamed from: z */
    public final boolean mo43345z() {
        return this.zzg;
    }
}

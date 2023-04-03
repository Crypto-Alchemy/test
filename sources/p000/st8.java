package p000;

import java.util.List;

/* renamed from: st8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class st8 extends s49<st8, qt8> implements t79 {
    /* access modifiers changed from: private */
    public static final st8 zzg;
    private int zza;
    private String zze = "";
    private m59<gu8> zzf = s49.m51528o();

    static {
        st8 st8 = new st8();
        zzg = st8;
        s49.m51531u(st8.class, st8);
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zza", "zze", "zzf", gu8.class});
        } else if (i2 == 3) {
            return new st8();
        } else {
            if (i2 == 4) {
                return new qt8((kt8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }

    /* renamed from: x */
    public final String mo47867x() {
        return this.zze;
    }

    /* renamed from: y */
    public final List<gu8> mo47868y() {
        return this.zzf;
    }
}

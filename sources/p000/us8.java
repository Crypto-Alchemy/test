package p000;

import com.google.android.gms.internal.measurement.zzga;

/* renamed from: us8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class us8 extends s49<us8, rr8> implements t79 {
    /* access modifiers changed from: private */
    public static final us8 zzg;
    private int zza;
    private int zze = 1;
    private m59<ar8> zzf = s49.m51528o();

    static {
        us8 us8 = new us8();
        zzg = us8;
        s49.m51531u(us8.class, us8);
    }

    /* renamed from: x */
    public static rr8 m52995x() {
        return (rr8) zzg.mo47633r();
    }

    /* renamed from: z */
    public static /* synthetic */ void m52997z(us8 us8, ar8 ar8) {
        ar8.getClass();
        m59<ar8> m59 = us8.zzf;
        if (!m59.zza()) {
            us8.zzf = s49.m51529p(m59);
        }
        us8.zzf.add(ar8);
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zza", "zze", zzga.zzb(), "zzf", ar8.class});
        } else if (i2 == 3) {
            return new us8();
        } else {
            if (i2 == 4) {
                return new rr8((bq8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}

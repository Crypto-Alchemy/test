package p000;

import java.util.List;

/* renamed from: ot8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class ot8 extends s49<ot8, mt8> implements t79 {
    /* access modifiers changed from: private */
    public static final ot8 zze;
    private m59<st8> zza = s49.m51528o();

    static {
        ot8 ot8 = new ot8();
        zze = ot8;
        s49.m51531u(ot8.class, ot8);
    }

    /* renamed from: z */
    public static ot8 m49554z() {
        return zze;
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", st8.class});
        } else if (i2 == 3) {
            return new ot8();
        } else {
            if (i2 == 4) {
                return new mt8((kt8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    /* renamed from: x */
    public final List<st8> mo46537x() {
        return this.zza;
    }

    /* renamed from: y */
    public final int mo46538y() {
        return this.zza.size();
    }
}

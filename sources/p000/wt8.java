package p000;

import java.util.List;

/* renamed from: wt8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class wt8 extends s49<wt8, ut8> implements t79 {
    /* access modifiers changed from: private */
    public static final wt8 zzg;
    private int zza;
    private m59<gu8> zze = s49.m51528o();
    private ot8 zzf;

    static {
        wt8 wt8 = new wt8();
        zzg = wt8;
        s49.m51531u(wt8.class, wt8);
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zze", gu8.class, "zzf"});
        } else if (i2 == 3) {
            return new wt8();
        } else {
            if (i2 == 4) {
                return new ut8((kt8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }

    /* renamed from: x */
    public final List<gu8> mo49270x() {
        return this.zze;
    }

    /* renamed from: y */
    public final ot8 mo49271y() {
        ot8 ot8 = this.zzf;
        if (ot8 == null) {
            return ot8.m49554z();
        }
        return ot8;
    }
}

package p000;

import java.util.List;

/* renamed from: jr8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class jr8 extends s49<jr8, ir8> implements t79 {
    /* access modifiers changed from: private */
    public static final jr8 zze;
    private m59<or8> zza = s49.m51528o();

    static {
        jr8 jr8 = new jr8();
        zze = jr8;
        s49.m51531u(jr8.class, jr8);
    }

    /* renamed from: C */
    public static /* synthetic */ void m46711C(jr8 jr8, or8 or8) {
        or8.getClass();
        m59<or8> m59 = jr8.zza;
        if (!m59.zza()) {
            jr8.zza = s49.m51529p(m59);
        }
        jr8.zza.add(or8);
    }

    /* renamed from: z */
    public static ir8 m46712z() {
        return (ir8) zze.mo47633r();
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", or8.class});
        } else if (i2 == 3) {
            return new jr8();
        } else {
            if (i2 == 4) {
                return new ir8((bq8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    /* renamed from: x */
    public final List<or8> mo44566x() {
        return this.zza;
    }

    /* renamed from: y */
    public final or8 mo44567y(int i) {
        return this.zza.get(0);
    }
}

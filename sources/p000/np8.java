package p000;

import java.util.List;

/* renamed from: np8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class np8 extends s49<np8, kp8> implements t79 {
    /* access modifiers changed from: private */
    public static final np8 zzn;
    private int zza;
    private long zze;
    private String zzf = "";
    private int zzg;
    private m59<up8> zzh = s49.m51528o();
    private m59<hp8> zzi = s49.m51528o();
    /* access modifiers changed from: private */
    public m59<lm8> zzj = s49.m51528o();
    private String zzk = "";
    private boolean zzl;
    private m59<wt8> zzm = s49.m51528o();

    static {
        np8 np8 = new np8();
        zzn = np8;
        s49.m51531u(np8.class, np8);
    }

    /* renamed from: J */
    public static kp8 m48903J() {
        return (kp8) zzn.mo47633r();
    }

    /* renamed from: K */
    public static np8 m48904K() {
        return zzn;
    }

    /* renamed from: M */
    public static /* synthetic */ void m48906M(np8 np8, int i, hp8 hp8) {
        hp8.getClass();
        m59<hp8> m59 = np8.zzi;
        if (!m59.zza()) {
            np8.zzi = s49.m51529p(m59);
        }
        np8.zzi.set(i, hp8);
    }

    /* renamed from: B */
    public final String mo46122B() {
        return this.zzf;
    }

    /* renamed from: C */
    public final List<up8> mo46123C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final int mo46124D() {
        return this.zzi.size();
    }

    /* renamed from: E */
    public final hp8 mo46125E(int i) {
        return this.zzi.get(i);
    }

    /* renamed from: F */
    public final List<lm8> mo46126F() {
        return this.zzj;
    }

    /* renamed from: G */
    public final boolean mo46127G() {
        return this.zzl;
    }

    /* renamed from: H */
    public final List<wt8> mo46128H() {
        return this.zzm;
    }

    /* renamed from: I */
    public final int mo46129I() {
        return this.zzm.size();
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", up8.class, "zzi", hp8.class, "zzj", lm8.class, "zzk", "zzl", "zzm", wt8.class});
        } else if (i2 == 3) {
            return new np8();
        } else {
            if (i2 == 4) {
                return new kp8((ho8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzn;
        }
    }

    /* renamed from: x */
    public final boolean mo46130x() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: y */
    public final long mo46131y() {
        return this.zze;
    }

    /* renamed from: z */
    public final boolean mo46132z() {
        return (this.zza & 2) != 0;
    }
}

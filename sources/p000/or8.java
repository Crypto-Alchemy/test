package p000;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.C4085b;
import com.google.android.gms.internal.measurement.zzfi;
import java.util.List;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: or8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class or8 extends s49<or8, nr8> implements t79 {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final or8 zzaa;
    private String zzA = "";
    private long zzB;
    private int zzC;
    private String zzD = "";
    private String zzE = "";
    private boolean zzF;
    /* access modifiers changed from: private */
    public m59<mq8> zzG = s49.m51528o();
    private String zzH = "";
    private int zzI;
    private int zzJ;
    private int zzK;
    private String zzL = "";
    private long zzM;
    private long zzN;
    private String zzO = "";
    private String zzP = "";
    private int zzQ;
    private String zzR = "";
    private us8 zzS;
    private g59 zzT = s49.m51525l();
    private long zzU;
    private long zzV;
    private String zzW = "";
    private String zzX = "";
    private int zzY;
    private boolean zzZ;
    private int zze;
    private int zzf;
    private int zzg;
    /* access modifiers changed from: private */
    public m59<wq8> zzh = s49.m51528o();
    private m59<it8> zzi = s49.m51528o();
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private int zzs;
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private long zzw;
    private long zzx;
    private String zzy = "";
    private boolean zzz;

    static {
        or8 or8 = new or8();
        zzaa = or8;
        s49.m51531u(or8.class, or8);
    }

    /* renamed from: K0 */
    public static nr8 m49408K0() {
        return (nr8) zzaa.mo47633r();
    }

    /* renamed from: M0 */
    public static /* synthetic */ void m49410M0(or8 or8, int i) {
        or8.zze |= 1;
        or8.zzg = 1;
    }

    /* renamed from: N0 */
    public static /* synthetic */ void m49411N0(or8 or8, int i, wq8 wq8) {
        wq8.getClass();
        or8.mo46504c1();
        or8.zzh.set(i, wq8);
    }

    /* renamed from: O0 */
    public static /* synthetic */ void m49412O0(or8 or8, wq8 wq8) {
        wq8.getClass();
        or8.mo46504c1();
        or8.zzh.add(wq8);
    }

    /* renamed from: P0 */
    public static /* synthetic */ void m49413P0(or8 or8, Iterable iterable) {
        or8.mo46504c1();
        C4085b.m34125j(iterable, or8.zzh);
    }

    /* renamed from: R0 */
    public static /* synthetic */ void m49415R0(or8 or8, int i) {
        or8.mo46504c1();
        or8.zzh.remove(i);
    }

    /* renamed from: S0 */
    public static /* synthetic */ void m49416S0(or8 or8, int i, it8 it8) {
        it8.getClass();
        or8.mo46505d1();
        or8.zzi.set(i, it8);
    }

    /* renamed from: T0 */
    public static /* synthetic */ void m49417T0(or8 or8, it8 it8) {
        it8.getClass();
        or8.mo46505d1();
        or8.zzi.add(it8);
    }

    /* renamed from: U0 */
    public static /* synthetic */ void m49418U0(or8 or8, Iterable iterable) {
        or8.mo46505d1();
        C4085b.m34125j(iterable, or8.zzi);
    }

    /* renamed from: V0 */
    public static /* synthetic */ void m49419V0(or8 or8, int i) {
        or8.mo46505d1();
        or8.zzi.remove(i);
    }

    /* renamed from: W0 */
    public static /* synthetic */ void m49420W0(or8 or8, long j) {
        or8.zze |= 2;
        or8.zzj = j;
    }

    /* renamed from: X0 */
    public static /* synthetic */ void m49421X0(or8 or8, long j) {
        or8.zze |= 4;
        or8.zzk = j;
    }

    /* renamed from: Y0 */
    public static /* synthetic */ void m49422Y0(or8 or8, long j) {
        or8.zze |= 8;
        or8.zzl = j;
    }

    /* renamed from: Z0 */
    public static /* synthetic */ void m49423Z0(or8 or8, long j) {
        or8.zze |= 16;
        or8.zzm = j;
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m49424a0(or8 or8, long j) {
        or8.zze |= 32;
        or8.zzn = j;
    }

    /* renamed from: a1 */
    public static /* synthetic */ void m49425a1(or8 or8) {
        or8.zze &= -17;
        or8.zzm = 0;
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m49426b0(or8 or8) {
        or8.zze &= -33;
        or8.zzn = 0;
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m49427c0(or8 or8, String str) {
        or8.zze |= 64;
        or8.zzo = "android";
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m49428d0(or8 or8, String str) {
        str.getClass();
        or8.zze |= 128;
        or8.zzp = str;
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m49429e0(or8 or8, String str) {
        str.getClass();
        or8.zze |= 256;
        or8.zzq = str;
    }

    /* renamed from: e1 */
    public static /* synthetic */ void m49430e1(or8 or8, String str) {
        str.getClass();
        or8.zze |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        or8.zzH = str;
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m49431f0(or8 or8, String str) {
        str.getClass();
        or8.zze |= RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
        or8.zzr = str;
    }

    /* renamed from: f1 */
    public static /* synthetic */ void m49432f1(or8 or8, int i) {
        or8.zze |= 33554432;
        or8.zzI = i;
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m49433g0(or8 or8, int i) {
        or8.zze |= RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
        or8.zzs = i;
    }

    /* renamed from: g1 */
    public static /* synthetic */ void m49434g1(or8 or8) {
        or8.zze &= -268435457;
        or8.zzL = zzaa.zzL;
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m49435h0(or8 or8, String str) {
        str.getClass();
        or8.zze |= 2048;
        or8.zzt = str;
    }

    /* renamed from: h1 */
    public static /* synthetic */ void m49436h1(or8 or8, long j) {
        or8.zze |= 536870912;
        or8.zzM = j;
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m49437i0(or8 or8, String str) {
        str.getClass();
        or8.zze |= 4096;
        or8.zzu = str;
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m49438i1(or8 or8, long j) {
        or8.zze |= 1073741824;
        or8.zzN = j;
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m49439j0(or8 or8, String str) {
        str.getClass();
        or8.zze |= 8192;
        or8.zzv = str;
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m49440j1(or8 or8) {
        or8.zze &= Integer.MAX_VALUE;
        or8.zzO = zzaa.zzO;
    }

    /* renamed from: k0 */
    public static /* synthetic */ void m49441k0(or8 or8, long j) {
        or8.zze |= Http2.INITIAL_MAX_FRAME_SIZE;
        or8.zzw = j;
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m49442k1(or8 or8, int i) {
        or8.zzf |= 2;
        or8.zzQ = i;
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m49443l0(or8 or8, long j) {
        or8.zze |= 32768;
        or8.zzx = 42004;
    }

    /* renamed from: l1 */
    public static /* synthetic */ void m49444l1(or8 or8, String str) {
        str.getClass();
        or8.zzf |= 4;
        or8.zzR = str;
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m49445m0(or8 or8, String str) {
        str.getClass();
        or8.zze |= 65536;
        or8.zzy = str;
    }

    /* renamed from: m1 */
    public static /* synthetic */ void m49446m1(or8 or8, us8 us8) {
        us8.getClass();
        or8.zzS = us8;
        or8.zzf |= 8;
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m49447n0(or8 or8) {
        or8.zze &= -65537;
        or8.zzy = zzaa.zzy;
    }

    /* renamed from: n1 */
    public static /* synthetic */ void m49448n1(or8 or8, Iterable iterable) {
        int i;
        g59 g59 = or8.zzT;
        if (!g59.zza()) {
            int size = g59.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            or8.zzT = g59.mo42780P(i);
        }
        C4085b.m34125j(iterable, or8.zzT);
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m49449o0(or8 or8, boolean z) {
        or8.zze |= 131072;
        or8.zzz = z;
    }

    /* renamed from: o1 */
    public static /* synthetic */ void m49450o1(or8 or8, long j) {
        or8.zzf |= 16;
        or8.zzU = j;
    }

    /* renamed from: p0 */
    public static /* synthetic */ void m49451p0(or8 or8) {
        or8.zze &= -131073;
        or8.zzz = false;
    }

    /* renamed from: p1 */
    public static /* synthetic */ void m49452p1(or8 or8, long j) {
        or8.zzf |= 32;
        or8.zzV = j;
    }

    /* renamed from: q0 */
    public static /* synthetic */ void m49453q0(or8 or8, String str) {
        str.getClass();
        or8.zze |= 262144;
        or8.zzA = str;
    }

    /* renamed from: q1 */
    public static /* synthetic */ void m49454q1(or8 or8, String str) {
        str.getClass();
        or8.zzf |= 64;
        or8.zzW = str;
    }

    /* renamed from: r0 */
    public static /* synthetic */ void m49455r0(or8 or8) {
        or8.zze &= -262145;
        or8.zzA = zzaa.zzA;
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m49456r1(or8 or8, String str) {
        str.getClass();
        or8.zzf |= 128;
        or8.zzX = str;
    }

    /* renamed from: s0 */
    public static /* synthetic */ void m49457s0(or8 or8, long j) {
        or8.zze |= 524288;
        or8.zzB = j;
    }

    /* renamed from: t0 */
    public static /* synthetic */ void m49458t0(or8 or8, int i) {
        or8.zze |= 1048576;
        or8.zzC = i;
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m49459u0(or8 or8, String str) {
        or8.zze |= 2097152;
        or8.zzD = str;
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m49460v0(or8 or8) {
        or8.zze &= -2097153;
        or8.zzD = zzaa.zzD;
    }

    /* renamed from: w0 */
    public static /* synthetic */ void m49461w0(or8 or8, String str) {
        str.getClass();
        or8.zze |= 4194304;
        or8.zzE = str;
    }

    /* renamed from: x0 */
    public static /* synthetic */ void m49462x0(or8 or8, boolean z) {
        or8.zze |= 8388608;
        or8.zzF = z;
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m49463y0(or8 or8, Iterable iterable) {
        m59<mq8> m59 = or8.zzG;
        if (!m59.zza()) {
            or8.zzG = s49.m51529p(m59);
        }
        C4085b.m34125j(iterable, or8.zzG);
    }

    /* renamed from: A0 */
    public final String mo46455A0() {
        return this.zzO;
    }

    /* renamed from: A1 */
    public final boolean mo46456A1() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: B */
    public final long mo46457B() {
        return this.zzw;
    }

    /* renamed from: B0 */
    public final boolean mo46458B0() {
        return (this.zzf & 2) != 0;
    }

    /* renamed from: B1 */
    public final long mo46459B1() {
        return this.zzk;
    }

    /* renamed from: C */
    public final boolean mo46460C() {
        return (this.zze & 32768) != 0;
    }

    /* renamed from: C0 */
    public final int mo46461C0() {
        return this.zzQ;
    }

    /* renamed from: C1 */
    public final boolean mo46462C1() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: D */
    public final long mo46463D() {
        return this.zzx;
    }

    /* renamed from: D0 */
    public final String mo46464D0() {
        return this.zzR;
    }

    /* renamed from: D1 */
    public final long mo46465D1() {
        return this.zzl;
    }

    /* renamed from: E */
    public final String mo46466E() {
        return this.zzy;
    }

    /* renamed from: E1 */
    public final boolean mo46467E1() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: F */
    public final boolean mo46468F() {
        return (this.zze & 131072) != 0;
    }

    /* renamed from: F0 */
    public final boolean mo46469F0() {
        return (this.zzf & 16) != 0;
    }

    /* renamed from: F1 */
    public final long mo46470F1() {
        return this.zzm;
    }

    /* renamed from: G */
    public final boolean mo46471G() {
        return this.zzz;
    }

    /* renamed from: G0 */
    public final long mo46472G0() {
        return this.zzU;
    }

    /* renamed from: G1 */
    public final boolean mo46473G1() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: H */
    public final String mo46474H() {
        return this.zzA;
    }

    /* renamed from: H0 */
    public final String mo46475H0() {
        return this.zzW;
    }

    /* renamed from: H1 */
    public final long mo46476H1() {
        return this.zzn;
    }

    /* renamed from: I */
    public final boolean mo46477I() {
        return (this.zze & 524288) != 0;
    }

    /* renamed from: I0 */
    public final boolean mo46478I0() {
        return (this.zzf & 128) != 0;
    }

    /* renamed from: I1 */
    public final String mo46479I1() {
        return this.zzo;
    }

    /* renamed from: J */
    public final long mo46480J() {
        return this.zzB;
    }

    /* renamed from: J0 */
    public final String mo46481J0() {
        return this.zzX;
    }

    /* renamed from: J1 */
    public final String mo46482J1() {
        return this.zzp;
    }

    /* renamed from: K */
    public final boolean mo46483K() {
        return (this.zze & 1048576) != 0;
    }

    /* renamed from: K1 */
    public final String mo46484K1() {
        return this.zzq;
    }

    /* renamed from: L */
    public final int mo46485L() {
        return this.zzC;
    }

    /* renamed from: L1 */
    public final String mo46486L1() {
        return this.zzr;
    }

    /* renamed from: M */
    public final String mo46487M() {
        return this.zzD;
    }

    /* renamed from: M1 */
    public final boolean mo46488M1() {
        return (this.zze & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0;
    }

    /* renamed from: N */
    public final String mo46489N() {
        return this.zzE;
    }

    /* renamed from: N1 */
    public final int mo46490N1() {
        return this.zzs;
    }

    /* renamed from: O */
    public final boolean mo46491O() {
        return (this.zze & 8388608) != 0;
    }

    /* renamed from: O1 */
    public final String mo46492O1() {
        return this.zzt;
    }

    /* renamed from: P */
    public final boolean mo46493P() {
        return this.zzF;
    }

    /* renamed from: Q */
    public final List<mq8> mo46494Q() {
        return this.zzG;
    }

    /* renamed from: R */
    public final String mo46495R() {
        return this.zzH;
    }

    /* renamed from: S */
    public final boolean mo46496S() {
        return (this.zze & 33554432) != 0;
    }

    /* renamed from: T */
    public final int mo46497T() {
        return this.zzI;
    }

    /* renamed from: U */
    public final boolean mo46498U() {
        return (this.zze & 536870912) != 0;
    }

    /* renamed from: V */
    public final long mo46499V() {
        return this.zzM;
    }

    /* renamed from: X */
    public final boolean mo46500X() {
        return (this.zze & 1073741824) != 0;
    }

    /* renamed from: Y */
    public final long mo46501Y() {
        return this.zzN;
    }

    /* renamed from: Z */
    public final boolean mo46502Z() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: b1 */
    public final int mo46503b1() {
        return this.zzg;
    }

    /* renamed from: c1 */
    public final void mo46504c1() {
        m59<wq8> m59 = this.zzh;
        if (!m59.zza()) {
            this.zzh = s49.m51529p(m59);
        }
    }

    /* renamed from: d1 */
    public final void mo46505d1() {
        m59<it8> m59 = this.zzi;
        if (!m59.zza()) {
            this.zzi = s49.m51529p(m59);
        }
    }

    /* renamed from: s1 */
    public final List<wq8> mo46506s1() {
        return this.zzh;
    }

    /* renamed from: t1 */
    public final int mo46507t1() {
        return this.zzh.size();
    }

    /* renamed from: u1 */
    public final wq8 mo46508u1(int i) {
        return this.zzh.get(i);
    }

    /* renamed from: v1 */
    public final List<it8> mo46509v1() {
        return this.zzi;
    }

    /* renamed from: w */
    public final Object mo29044w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s49.m51532v(zzaa, "\u0001.\u0000\u0002\u00017.\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)", new Object[]{"zze", "zzf", "zzg", "zzh", wq8.class, "zzi", it8.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", mq8.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", zzfi.zzb(), "zzZ"});
        } else if (i2 == 3) {
            return new or8();
        } else {
            if (i2 == 4) {
                return new nr8((bq8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzaa;
        }
    }

    /* renamed from: w1 */
    public final int mo46510w1() {
        return this.zzi.size();
    }

    /* renamed from: x */
    public final String mo46511x() {
        return this.zzu;
    }

    /* renamed from: x1 */
    public final it8 mo46512x1(int i) {
        return this.zzi.get(i);
    }

    /* renamed from: y */
    public final String mo46513y() {
        return this.zzv;
    }

    /* renamed from: y1 */
    public final boolean mo46514y1() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: z */
    public final boolean mo46515z() {
        return (this.zze & Http2.INITIAL_MAX_FRAME_SIZE) != 0;
    }

    /* renamed from: z1 */
    public final long mo46516z1() {
        return this.zzj;
    }
}

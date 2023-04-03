package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0836t;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.C0909b;
import androidx.media3.exoplayer.drm.C0912c;
import androidx.media3.exoplayer.source.C0964e;
import androidx.media3.exoplayer.source.C0971h;
import androidx.media3.exoplayer.source.C0977j;
import androidx.media3.exoplayer.source.C0997p;
import androidx.media3.exoplayer.upstream.C1019b;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p000.d21;
import p000.xs5;
import p000.zs6;

/* renamed from: androidx.media3.exoplayer.source.m */
/* compiled from: ProgressiveMediaPeriod */
public final class C0986m implements C0971h, jy1, Loader.C1012b<C0987a>, Loader.C1016f, C0997p.C1001d {

    /* renamed from: A1 */
    public static final C0792h f5282A1 = new C0792h.C0794b().mo6658S("icy").mo6670e0("application/x-icy").mo6644E();

    /* renamed from: z1 */
    public static final Map<String, String> f5283z1 = m7314L();

    /* renamed from: A */
    public final long f5284A;

    /* renamed from: B */
    public final Loader f5285B = new Loader("ProgressiveMediaPeriod");

    /* renamed from: C */
    public final C0984l f5286C;

    /* renamed from: H */
    public final lo0 f5287H;

    /* renamed from: I */
    public final Runnable f5288I;

    /* renamed from: L */
    public final Runnable f5289L;

    /* renamed from: M */
    public final Handler f5290M;

    /* renamed from: P */
    public C0971h.C0972a f5291P;

    /* renamed from: Q */
    public IcyHeaders f5292Q;

    /* renamed from: U */
    public C0997p[] f5293U;

    /* renamed from: X */
    public C0990d[] f5294X;

    /* renamed from: Y */
    public boolean f5295Y;

    /* renamed from: Z */
    public boolean f5296Z;

    /* renamed from: a */
    public final Uri f5297a;

    /* renamed from: b1 */
    public long f5298b1;

    /* renamed from: d */
    public final x11 f5299d;

    /* renamed from: e */
    public final C0912c f5300e;

    /* renamed from: e0 */
    public boolean f5301e0;

    /* renamed from: e1 */
    public boolean f5302e1;

    /* renamed from: g */
    public final C1019b f5303g;

    /* renamed from: k */
    public final C0977j.C0978a f5304k;

    /* renamed from: k0 */
    public C0991e f5305k0;

    /* renamed from: o1 */
    public int f5306o1;

    /* renamed from: p1 */
    public boolean f5307p1;

    /* renamed from: q1 */
    public boolean f5308q1;

    /* renamed from: r */
    public final C0909b.C0910a f5309r;

    /* renamed from: r1 */
    public int f5310r1;

    /* renamed from: s */
    public final C0988b f5311s;

    /* renamed from: s1 */
    public boolean f5312s1;

    /* renamed from: t1 */
    public long f5313t1;

    /* renamed from: u1 */
    public long f5314u1;

    /* renamed from: v0 */
    public xs5 f5315v0;

    /* renamed from: v1 */
    public boolean f5316v1;

    /* renamed from: w1 */
    public int f5317w1;

    /* renamed from: x */
    public final C2891nf f5318x;

    /* renamed from: x1 */
    public boolean f5319x1;

    /* renamed from: y */
    public final String f5320y;

    /* renamed from: y1 */
    public boolean f5321y1;

    /* renamed from: androidx.media3.exoplayer.source.m$a */
    /* compiled from: ProgressiveMediaPeriod */
    public final class C0987a implements Loader.C1015e, C0964e.C0965a {

        /* renamed from: a */
        public final long f5322a = vi3.m28818a();

        /* renamed from: b */
        public final Uri f5323b;

        /* renamed from: c */
        public final n96 f5324c;

        /* renamed from: d */
        public final C0984l f5325d;

        /* renamed from: e */
        public final jy1 f5326e;

        /* renamed from: f */
        public final lo0 f5327f;

        /* renamed from: g */
        public final mt4 f5328g = new mt4();

        /* renamed from: h */
        public volatile boolean f5329h;

        /* renamed from: i */
        public boolean f5330i = true;

        /* renamed from: j */
        public long f5331j;

        /* renamed from: k */
        public d21 f5332k = mo7725i(0);

        /* renamed from: l */
        public zs6 f5333l;

        /* renamed from: m */
        public boolean f5334m;

        public C0987a(Uri uri, x11 x11, C0984l lVar, jy1 jy1, lo0 lo0) {
            this.f5323b = uri;
            this.f5324c = new n96(x11);
            this.f5325d = lVar;
            this.f5326e = jy1;
            this.f5327f = lo0;
        }

        /* renamed from: a */
        public void mo7723a() throws IOException {
            int i = 0;
            while (i == 0 && !this.f5329h) {
                try {
                    long j = this.f5328g.f15249a;
                    d21 i2 = mo7725i(j);
                    this.f5332k = i2;
                    long b = this.f5324c.mo6964b(i2);
                    if (b != -1) {
                        b += j;
                        C0986m.this.mo7706Z();
                    }
                    long j2 = b;
                    IcyHeaders unused = C0986m.this.f5292Q = IcyHeaders.m7633a(this.f5324c.mo7616d());
                    u11 u11 = this.f5324c;
                    if (!(C0986m.this.f5292Q == null || C0986m.this.f5292Q.f5582r == -1)) {
                        u11 = new C0964e(this.f5324c, C0986m.this.f5292Q.f5582r, this);
                        zs6 O = C0986m.this.mo7698O();
                        this.f5333l = O;
                        O.mo7303d(C0986m.f5282A1);
                    }
                    long j3 = j;
                    this.f5325d.mo7690d(u11, this.f5323b, this.f5324c.mo7616d(), j, j2, this.f5326e);
                    if (C0986m.this.f5292Q != null) {
                        this.f5325d.mo7689c();
                    }
                    if (this.f5330i) {
                        this.f5325d.mo7688b(j3, this.f5331j);
                        this.f5330i = false;
                    }
                    while (true) {
                        long j4 = j3;
                        while (i == 0 && !this.f5329h) {
                            this.f5327f.mo22884a();
                            i = this.f5325d.mo7692f(this.f5328g);
                            j3 = this.f5325d.mo7691e();
                            if (j3 > C0986m.this.f5284A + j4) {
                                this.f5327f.mo22886c();
                                C0986m.this.f5290M.post(C0986m.this.f5289L);
                            }
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.f5325d.mo7691e() != -1) {
                        this.f5328g.f15249a = this.f5325d.mo7691e();
                    }
                    b21.m11033a(this.f5324c);
                } catch (InterruptedException unused2) {
                    throw new InterruptedIOException();
                } catch (Throwable th) {
                    if (!(i == 1 || this.f5325d.mo7691e() == -1)) {
                        this.f5328g.f15249a = this.f5325d.mo7691e();
                    }
                    b21.m11033a(this.f5324c);
                    throw th;
                }
            }
        }

        /* renamed from: b */
        public void mo7619b(gm4 gm4) {
            long j;
            if (!this.f5334m) {
                j = this.f5331j;
            } else {
                j = Math.max(C0986m.this.mo7697N(true), this.f5331j);
            }
            int a = gm4.mo20676a();
            zs6 zs6 = (zs6) C2725kr.m20985e(this.f5333l);
            zs6.mo7300a(gm4, a);
            zs6.mo7301b(j, 1, a, 0, (zs6.C3758a) null);
            this.f5334m = true;
        }

        /* renamed from: c */
        public void mo7724c() {
            this.f5329h = true;
        }

        /* renamed from: i */
        public final d21 mo7725i(long j) {
            return new d21.C2129b().mo18411i(this.f5323b).mo18410h(j).mo18408f(C0986m.this.f5320y).mo18404b(6).mo18407e(C0986m.f5283z1).mo18403a();
        }

        /* renamed from: j */
        public final void mo7726j(long j, long j2) {
            this.f5328g.f15249a = j;
            this.f5331j = j2;
            this.f5330i = true;
            this.f5334m = false;
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.m$b */
    /* compiled from: ProgressiveMediaPeriod */
    public interface C0988b {
        /* renamed from: l */
        void mo7727l(long j, boolean z, boolean z2);
    }

    /* renamed from: androidx.media3.exoplayer.source.m$c */
    /* compiled from: ProgressiveMediaPeriod */
    public final class C0989c implements yk5 {

        /* renamed from: a */
        public final int f5336a;

        public C0989c(int i) {
            this.f5336a = i;
        }

        /* renamed from: b */
        public void mo7593b() throws IOException {
            C0986m.this.mo7705Y(this.f5336a);
        }

        /* renamed from: f */
        public int mo7594f(long j) {
            return C0986m.this.mo7718i0(this.f5336a, j);
        }

        /* renamed from: g */
        public boolean mo7595g() {
            return C0986m.this.mo7700Q(this.f5336a);
        }

        /* renamed from: p */
        public int mo7596p(c82 c82, DecoderInputBuffer decoderInputBuffer, int i) {
            return C0986m.this.mo7712e0(this.f5336a, c82, decoderInputBuffer, i);
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.m$d */
    /* compiled from: ProgressiveMediaPeriod */
    public static final class C0990d {

        /* renamed from: a */
        public final int f5338a;

        /* renamed from: b */
        public final boolean f5339b;

        public C0990d(int i, boolean z) {
            this.f5338a = i;
            this.f5339b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0990d.class != obj.getClass()) {
                return false;
            }
            C0990d dVar = (C0990d) obj;
            if (this.f5338a == dVar.f5338a && this.f5339b == dVar.f5339b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f5338a * 31) + (this.f5339b ? 1 : 0);
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.m$e */
    /* compiled from: ProgressiveMediaPeriod */
    public static final class C0991e {

        /* renamed from: a */
        public final ws6 f5340a;

        /* renamed from: b */
        public final boolean[] f5341b;

        /* renamed from: c */
        public final boolean[] f5342c;

        /* renamed from: d */
        public final boolean[] f5343d;

        public C0991e(ws6 ws6, boolean[] zArr) {
            this.f5340a = ws6;
            this.f5341b = zArr;
            int i = ws6.f19234a;
            this.f5342c = new boolean[i];
            this.f5343d = new boolean[i];
        }
    }

    public C0986m(Uri uri, x11 x11, C0984l lVar, C0912c cVar, C0909b.C0910a aVar, C1019b bVar, C0977j.C0978a aVar2, C0988b bVar2, C2891nf nfVar, String str, int i) {
        this.f5297a = uri;
        this.f5299d = x11;
        this.f5300e = cVar;
        this.f5309r = aVar;
        this.f5303g = bVar;
        this.f5304k = aVar2;
        this.f5311s = bVar2;
        this.f5318x = nfVar;
        this.f5320y = str;
        this.f5284A = (long) i;
        this.f5286C = lVar;
        this.f5287H = new lo0();
        this.f5288I = new sw4(this);
        this.f5289L = new tw4(this);
        this.f5290M = w67.m29384v();
        this.f5294X = new C0990d[0];
        this.f5293U = new C0997p[0];
        this.f5314u1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5298b1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5306o1 = 1;
    }

    /* renamed from: L */
    public static Map<String, String> m7314L() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m7315R() {
        if (!this.f5321y1) {
            ((C0971h.C0972a) C2725kr.m20985e(this.f5291P)).mo7246g(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m7316S() {
        this.f5312s1 = true;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* renamed from: J */
    public final void mo7694J() {
        C2725kr.m20987g(this.f5296Z);
        C2725kr.m20985e(this.f5305k0);
        C2725kr.m20985e(this.f5315v0);
    }

    /* renamed from: K */
    public final boolean mo7695K(C0987a aVar, int i) {
        xs5 xs5;
        if (this.f5312s1 || !((xs5 = this.f5315v0) == null || xs5.mo11157i() == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED)) {
            this.f5317w1 = i;
            return true;
        }
        if (!this.f5296Z || mo7720k0()) {
            this.f5308q1 = this.f5296Z;
            this.f5313t1 = 0;
            this.f5317w1 = 0;
            for (C0997p U : this.f5293U) {
                U.mo7771U();
            }
            aVar.mo7726j(0, 0);
            return true;
        }
        this.f5316v1 = true;
        return false;
    }

    /* renamed from: M */
    public final int mo7696M() {
        int i = 0;
        for (C0997p G : this.f5293U) {
            i += G.mo7758G();
        }
        return i;
    }

    /* renamed from: N */
    public final long mo7697N(boolean z) {
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.f5293U.length; i++) {
            if (z || ((C0991e) C2725kr.m20985e(this.f5305k0)).f5342c[i]) {
                j = Math.max(j, this.f5293U[i].mo7797z());
            }
        }
        return j;
    }

    /* renamed from: O */
    public zs6 mo7698O() {
        return mo7711d0(new C0990d(0, true));
    }

    /* renamed from: P */
    public final boolean mo7699P() {
        if (this.f5314u1 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public boolean mo7700Q(int i) {
        if (mo7720k0() || !this.f5293U[i].mo7762K(this.f5319x1)) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    public final void mo7701U() {
        boolean z;
        Metadata metadata;
        if (!this.f5321y1 && !this.f5296Z && this.f5295Y && this.f5315v0 != null) {
            C0997p[] pVarArr = this.f5293U;
            int length = pVarArr.length;
            int i = 0;
            while (i < length) {
                if (pVarArr[i].mo7757F() != null) {
                    i++;
                } else {
                    return;
                }
            }
            this.f5287H.mo22886c();
            int length2 = this.f5293U.length;
            C0836t[] tVarArr = new C0836t[length2];
            boolean[] zArr = new boolean[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                C0792h hVar = (C0792h) C2725kr.m20985e(this.f5293U[i2].mo7757F());
                String str = hVar.f4175C;
                boolean m = vv3.m29139m(str);
                if (m || vv3.m29143q(str)) {
                    z = true;
                } else {
                    z = false;
                }
                zArr[i2] = z;
                this.f5301e0 = z | this.f5301e0;
                IcyHeaders icyHeaders = this.f5292Q;
                if (icyHeaders != null) {
                    if (m || this.f5294X[i2].f5339b) {
                        Metadata metadata2 = hVar.f4173A;
                        if (metadata2 == null) {
                            metadata = new Metadata(icyHeaders);
                        } else {
                            metadata = metadata2.mo6542a(icyHeaders);
                        }
                        hVar = hVar.mo6636b().mo6663X(metadata).mo6644E();
                    }
                    if (m && hVar.f4198r == -1 && hVar.f4200s == -1 && icyHeaders.f5577a != -1) {
                        hVar = hVar.mo6636b().mo6646G(icyHeaders.f5577a).mo6644E();
                    }
                }
                tVarArr[i2] = new C0836t(Integer.toString(i2), hVar.mo6637c(this.f5300e.mo7361d(hVar)));
            }
            this.f5305k0 = new C0991e(new ws6(tVarArr), zArr);
            this.f5296Z = true;
            ((C0971h.C0972a) C2725kr.m20985e(this.f5291P)).mo7587f(this);
        }
    }

    /* renamed from: V */
    public final void mo7702V(int i) {
        mo7694J();
        C0991e eVar = this.f5305k0;
        boolean[] zArr = eVar.f5343d;
        if (!zArr[i]) {
            C0792h c = eVar.f5340a.mo27595b(i).mo6918c(0);
            this.f5304k.mo7648i(vv3.m29135i(c.f4175C), c, 0, (Object) null, this.f5313t1);
            zArr[i] = true;
        }
    }

    /* renamed from: W */
    public final void mo7703W(int i) {
        mo7694J();
        boolean[] zArr = this.f5305k0.f5341b;
        if (this.f5316v1 && zArr[i]) {
            if (!this.f5293U[i].mo7762K(false)) {
                this.f5314u1 = 0;
                this.f5316v1 = false;
                this.f5308q1 = true;
                this.f5313t1 = 0;
                this.f5317w1 = 0;
                for (C0997p U : this.f5293U) {
                    U.mo7771U();
                }
                ((C0971h.C0972a) C2725kr.m20985e(this.f5291P)).mo7246g(this);
            }
        }
    }

    /* renamed from: X */
    public void mo7704X() throws IOException {
        this.f5285B.mo7810k(this.f5303g.mo7825b(this.f5306o1));
    }

    /* renamed from: Y */
    public void mo7705Y(int i) throws IOException {
        this.f5293U[i].mo7764N();
        mo7704X();
    }

    /* renamed from: Z */
    public final void mo7706Z() {
        this.f5290M.post(new uw4(this));
    }

    /* renamed from: a */
    public long mo7241a() {
        return mo7247h();
    }

    /* renamed from: a0 */
    public void mo7224u(C0987a aVar, long j, long j2, boolean z) {
        n96 d = aVar.f5324c;
        vi3 vi3 = new vi3(aVar.f5322a, aVar.f5332k, d.mo23540p(), d.mo23541q(), j, j2, d.mo23539o());
        this.f5303g.mo7826c(aVar.f5322a);
        this.f5304k.mo7651r(vi3, 1, -1, (C0792h) null, 0, (Object) null, aVar.f5331j, this.f5298b1);
        if (!z) {
            for (C0997p U : this.f5293U) {
                U.mo7771U();
            }
            if (this.f5310r1 > 0) {
                ((C0971h.C0972a) C2725kr.m20985e(this.f5291P)).mo7246g(this);
            }
        }
    }

    /* renamed from: b */
    public void mo7708b(C0792h hVar) {
        this.f5290M.post(this.f5288I);
    }

    /* renamed from: b0 */
    public void mo7223s(C0987a aVar, long j, long j2) {
        xs5 xs5;
        long j3;
        if (this.f5298b1 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && (xs5 = this.f5315v0) != null) {
            boolean h = xs5.mo11156h();
            long N = mo7697N(true);
            if (N == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = N + 10000;
            }
            this.f5298b1 = j3;
            this.f5311s.mo7727l(j3, h, this.f5302e1);
        }
        n96 d = aVar.f5324c;
        vi3 vi3 = new vi3(aVar.f5322a, aVar.f5332k, d.mo23540p(), d.mo23541q(), j, j2, d.mo23539o());
        this.f5303g.mo7826c(aVar.f5322a);
        this.f5304k.mo7654u(vi3, 1, -1, (C0792h) null, 0, (Object) null, aVar.f5331j, this.f5298b1);
        this.f5319x1 = true;
        ((C0971h.C0972a) C2725kr.m20985e(this.f5291P)).mo7246g(this);
    }

    /* renamed from: c */
    public long mo7243c(long j, ys5 ys5) {
        mo7694J();
        if (!this.f5315v0.mo11156h()) {
            return 0;
        }
        xs5.C3641a f = this.f5315v0.mo11155f(j);
        return ys5.mo28203a(j, f.f19968a.f20675a, f.f19969b.f20675a);
    }

    /* renamed from: c0 */
    public Loader.C1013c mo7222k(C0987a aVar, long j, long j2, IOException iOException, int i) {
        Loader.C1013c cVar;
        C0987a aVar2;
        boolean z;
        n96 d = aVar.f5324c;
        vi3 vi3 = new vi3(aVar.f5322a, aVar.f5332k, d.mo23540p(), d.mo23541q(), j, j2, d.mo23539o());
        long a = this.f5303g.mo7824a(new C1019b.C1022c(vi3, new jr3(1, -1, (C0792h) null, 0, (Object) null, w67.m29335U0(aVar.f5331j), w67.m29335U0(this.f5298b1)), iOException, i));
        if (a == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            cVar = Loader.f5450g;
            C0987a aVar3 = aVar;
        } else {
            int M = mo7696M();
            if (M > this.f5317w1) {
                aVar2 = aVar;
                z = true;
            } else {
                z = false;
                aVar2 = aVar;
            }
            if (mo7695K(aVar2, M)) {
                cVar = Loader.m7530h(z, a);
            } else {
                cVar = Loader.f5449f;
            }
        }
        boolean z2 = !cVar.mo7814c();
        this.f5304k.mo7656w(vi3, 1, -1, (C0792h) null, 0, (Object) null, aVar.f5331j, this.f5298b1, iOException, z2);
        if (z2) {
            this.f5303g.mo7826c(aVar.f5322a);
        }
        return cVar;
    }

    /* renamed from: d */
    public boolean mo7244d() {
        if (!this.f5285B.mo7809j() || !this.f5287H.mo22887d()) {
            return false;
        }
        return true;
    }

    /* renamed from: d0 */
    public final zs6 mo7711d0(C0990d dVar) {
        int length = this.f5293U.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.f5294X[i])) {
                return this.f5293U[i];
            }
        }
        C0997p k = C0997p.m7426k(this.f5318x, this.f5300e, this.f5309r);
        k.mo7779c0(this);
        int i2 = length + 1;
        C0990d[] dVarArr = (C0990d[]) Arrays.copyOf(this.f5294X, i2);
        dVarArr[length] = dVar;
        this.f5294X = (C0990d[]) w67.m29362k(dVarArr);
        C0997p[] pVarArr = (C0997p[]) Arrays.copyOf(this.f5293U, i2);
        pVarArr[length] = k;
        this.f5293U = (C0997p[]) w67.m29362k(pVarArr);
        return k;
    }

    /* renamed from: e */
    public boolean mo7245e(long j) {
        if (this.f5319x1 || this.f5285B.mo7808i() || this.f5316v1) {
            return false;
        }
        if (this.f5296Z && this.f5310r1 == 0) {
            return false;
        }
        boolean e = this.f5287H.mo22888e();
        if (this.f5285B.mo7809j()) {
            return e;
        }
        mo7719j0();
        return true;
    }

    /* renamed from: e0 */
    public int mo7712e0(int i, c82 c82, DecoderInputBuffer decoderInputBuffer, int i2) {
        if (mo7720k0()) {
            return -3;
        }
        mo7702V(i);
        int R = this.f5293U[i].mo7768R(c82, decoderInputBuffer, i2, this.f5319x1);
        if (R == -3) {
            mo7703W(i);
        }
        return R;
    }

    /* renamed from: f */
    public zs6 mo7713f(int i, int i2) {
        return mo7711d0(new C0990d(i, false));
    }

    /* renamed from: f0 */
    public void mo7714f0() {
        if (this.f5296Z) {
            for (C0997p Q : this.f5293U) {
                Q.mo7767Q();
            }
        }
        this.f5285B.mo7812m(this);
        this.f5290M.removeCallbacksAndMessages((Object) null);
        this.f5291P = null;
        this.f5321y1 = true;
    }

    /* renamed from: g */
    public void mo7715g(xs5 xs5) {
        this.f5290M.post(new vw4(this, xs5));
    }

    /* renamed from: g0 */
    public final boolean mo7716g0(boolean[] zArr, long j) {
        int length = this.f5293U.length;
        for (int i = 0; i < length; i++) {
            if (!this.f5293U[i].mo7775Y(j, false) && (zArr[i] || !this.f5301e0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public long mo7247h() {
        long j;
        mo7694J();
        if (this.f5319x1 || this.f5310r1 == 0) {
            return Long.MIN_VALUE;
        }
        if (mo7699P()) {
            return this.f5314u1;
        }
        if (this.f5301e0) {
            int length = this.f5293U.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C0991e eVar = this.f5305k0;
                if (eVar.f5341b[i] && eVar.f5342c[i] && !this.f5293U[i].mo7761J()) {
                    j = Math.min(j, this.f5293U[i].mo7797z());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = mo7697N(false);
        }
        if (j == Long.MIN_VALUE) {
            return this.f5313t1;
        }
        return j;
    }

    /* renamed from: h0 */
    public final void m7317T(xs5 xs5) {
        xs5 xs52;
        boolean z;
        if (this.f5292Q == null) {
            xs52 = xs5;
        } else {
            xs52 = new xs5.C3642b(CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
        }
        this.f5315v0 = xs52;
        this.f5298b1 = xs5.mo11157i();
        int i = 1;
        if (this.f5312s1 || xs5.mo11157i() != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            z = false;
        } else {
            z = true;
        }
        this.f5302e1 = z;
        if (z) {
            i = 7;
        }
        this.f5306o1 = i;
        this.f5311s.mo7727l(this.f5298b1, xs5.mo11156h(), this.f5302e1);
        if (!this.f5296Z) {
            mo7701U();
        }
    }

    /* renamed from: i */
    public void mo7248i(long j) {
    }

    /* renamed from: i0 */
    public int mo7718i0(int i, long j) {
        if (mo7720k0()) {
            return 0;
        }
        mo7702V(i);
        C0997p pVar = this.f5293U[i];
        int E = pVar.mo7756E(j, this.f5319x1);
        pVar.mo7780d0(E);
        if (E == 0) {
            mo7703W(i);
        }
        return E;
    }

    /* renamed from: j */
    public long mo7249j(dx1[] dx1Arr, boolean[] zArr, yk5[] yk5Arr, boolean[] zArr2, long j) {
        boolean z;
        dx1 dx1;
        boolean z2;
        boolean z3;
        mo7694J();
        C0991e eVar = this.f5305k0;
        ws6 ws6 = eVar.f5340a;
        boolean[] zArr3 = eVar.f5342c;
        int i = this.f5310r1;
        int i2 = 0;
        for (int i3 = 0; i3 < dx1Arr.length; i3++) {
            C0989c cVar = yk5Arr[i3];
            if (cVar != null && (dx1Arr[i3] == null || !zArr[i3])) {
                int a = cVar.f5336a;
                C2725kr.m20987g(zArr3[a]);
                this.f5310r1--;
                zArr3[a] = false;
                yk5Arr[i3] = null;
            }
        }
        if (!this.f5307p1 ? j == 0 : i != 0) {
            z = false;
        } else {
            z = true;
        }
        for (int i4 = 0; i4 < dx1Arr.length; i4++) {
            if (yk5Arr[i4] == null && (dx1 = dx1Arr[i4]) != null) {
                if (dx1.length() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C2725kr.m20987g(z2);
                if (dx1.mo7670h(0) == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C2725kr.m20987g(z3);
                int c = ws6.mo27596c(dx1.mo7678n());
                C2725kr.m20987g(!zArr3[c]);
                this.f5310r1++;
                zArr3[c] = true;
                yk5Arr[i4] = new C0989c(c);
                zArr2[i4] = true;
                if (!z) {
                    C0997p pVar = this.f5293U[c];
                    if (pVar.mo7775Y(j, true) || pVar.mo7754C() == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (this.f5310r1 == 0) {
            this.f5316v1 = false;
            this.f5308q1 = false;
            if (this.f5285B.mo7809j()) {
                C0997p[] pVarArr = this.f5293U;
                int length = pVarArr.length;
                while (i2 < length) {
                    pVarArr[i2].mo7789r();
                    i2++;
                }
                this.f5285B.mo7806f();
            } else {
                C0997p[] pVarArr2 = this.f5293U;
                int length2 = pVarArr2.length;
                while (i2 < length2) {
                    pVarArr2[i2].mo7771U();
                    i2++;
                }
            }
        } else if (z) {
            j = mo7250l(j);
            while (i2 < yk5Arr.length) {
                if (yk5Arr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f5307p1 = true;
        return j;
    }

    /* renamed from: j0 */
    public final void mo7719j0() {
        C0987a aVar = new C0987a(this.f5297a, this.f5299d, this.f5286C, this, this.f5287H);
        if (this.f5296Z) {
            C2725kr.m20987g(mo7699P());
            long j = this.f5298b1;
            if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || this.f5314u1 <= j) {
                aVar.mo7726j(((xs5) C2725kr.m20985e(this.f5315v0)).mo11155f(this.f5314u1).f19968a.f20676b, this.f5314u1);
                for (C0997p a0 : this.f5293U) {
                    a0.mo7777a0(this.f5314u1);
                }
                this.f5314u1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            } else {
                this.f5319x1 = true;
                this.f5314u1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                return;
            }
        }
        this.f5317w1 = mo7696M();
        this.f5304k.mo7640A(new vi3(aVar.f5322a, aVar.f5332k, this.f5285B.mo7813n(aVar, this, this.f5303g.mo7825b(this.f5306o1))), 1, -1, (C0792h) null, 0, (Object) null, aVar.f5331j, this.f5298b1);
    }

    /* renamed from: k0 */
    public final boolean mo7720k0() {
        if (this.f5308q1 || mo7699P()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public long mo7250l(long j) {
        mo7694J();
        boolean[] zArr = this.f5305k0.f5341b;
        if (!this.f5315v0.mo11156h()) {
            j = 0;
        }
        int i = 0;
        this.f5308q1 = false;
        this.f5313t1 = j;
        if (mo7699P()) {
            this.f5314u1 = j;
            return j;
        } else if (this.f5306o1 != 7 && mo7716g0(zArr, j)) {
            return j;
        } else {
            this.f5316v1 = false;
            this.f5314u1 = j;
            this.f5319x1 = false;
            if (this.f5285B.mo7809j()) {
                C0997p[] pVarArr = this.f5293U;
                int length = pVarArr.length;
                while (i < length) {
                    pVarArr[i].mo7789r();
                    i++;
                }
                this.f5285B.mo7806f();
            } else {
                this.f5285B.mo7807g();
                C0997p[] pVarArr2 = this.f5293U;
                int length2 = pVarArr2.length;
                while (i < length2) {
                    pVarArr2[i].mo7771U();
                    i++;
                }
            }
            return j;
        }
    }

    /* renamed from: m */
    public long mo7251m() {
        if (!this.f5308q1) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        if (!this.f5319x1 && mo7696M() <= this.f5317w1) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        this.f5308q1 = false;
        return this.f5313t1;
    }

    /* renamed from: n */
    public void mo7721n() {
        for (C0997p S : this.f5293U) {
            S.mo7769S();
        }
        this.f5286C.mo7687a();
    }

    /* renamed from: o */
    public void mo7252o() throws IOException {
        mo7704X();
        if (this.f5319x1 && !this.f5296Z) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    /* renamed from: p */
    public void mo7722p() {
        this.f5295Y = true;
        this.f5290M.post(this.f5288I);
    }

    /* renamed from: q */
    public void mo7254q(C0971h.C0972a aVar, long j) {
        this.f5291P = aVar;
        this.f5287H.mo22888e();
        mo7719j0();
    }

    /* renamed from: r */
    public ws6 mo7255r() {
        mo7694J();
        return this.f5305k0.f5340a;
    }

    /* renamed from: t */
    public void mo7256t(long j, boolean z) {
        mo7694J();
        if (!mo7699P()) {
            boolean[] zArr = this.f5305k0.f5342c;
            int length = this.f5293U.length;
            for (int i = 0; i < length; i++) {
                this.f5293U[i].mo7788q(j, z, zArr[i]);
            }
        }
    }
}

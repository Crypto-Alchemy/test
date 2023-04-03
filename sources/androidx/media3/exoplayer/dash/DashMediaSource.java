package androidx.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.common.C0798k;
import androidx.media3.common.C0831s;
import androidx.media3.common.ParserException;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.dash.C0884a;
import androidx.media3.exoplayer.dash.C0888c;
import androidx.media3.exoplayer.dash.C0892d;
import androidx.media3.exoplayer.drm.C0908a;
import androidx.media3.exoplayer.drm.C0909b;
import androidx.media3.exoplayer.drm.C0912c;
import androidx.media3.exoplayer.source.C0955a;
import androidx.media3.exoplayer.source.C0971h;
import androidx.media3.exoplayer.source.C0973i;
import androidx.media3.exoplayer.source.C0977j;
import androidx.media3.exoplayer.upstream.C1018a;
import androidx.media3.exoplayer.upstream.C1019b;
import androidx.media3.exoplayer.upstream.C1023c;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;
import p000.cj3;
import p000.q56;
import p000.x11;

public final class DashMediaSource extends C0955a {

    /* renamed from: A */
    public Loader f4796A;

    /* renamed from: B */
    public ov6 f4797B;

    /* renamed from: C */
    public IOException f4798C;

    /* renamed from: D */
    public Handler f4799D;

    /* renamed from: E */
    public C0798k.C0807g f4800E;

    /* renamed from: F */
    public Uri f4801F;

    /* renamed from: G */
    public Uri f4802G;

    /* renamed from: H */
    public d11 f4803H;

    /* renamed from: I */
    public boolean f4804I;

    /* renamed from: J */
    public long f4805J;

    /* renamed from: K */
    public long f4806K;

    /* renamed from: L */
    public long f4807L;

    /* renamed from: M */
    public int f4808M;

    /* renamed from: N */
    public long f4809N;

    /* renamed from: O */
    public int f4810O;

    /* renamed from: h */
    public final C0798k f4811h;

    /* renamed from: i */
    public final boolean f4812i;

    /* renamed from: j */
    public final x11.C3565a f4813j;

    /* renamed from: k */
    public final C0884a.C0885a f4814k;

    /* renamed from: l */
    public final tn0 f4815l;

    /* renamed from: m */
    public final C0912c f4816m;

    /* renamed from: n */
    public final C1019b f4817n;

    /* renamed from: o */
    public final C3178qz f4818o;

    /* renamed from: p */
    public final long f4819p;

    /* renamed from: q */
    public final C0977j.C0978a f4820q;

    /* renamed from: r */
    public final C1023c.C1024a<? extends d11> f4821r;

    /* renamed from: s */
    public final C0880e f4822s;

    /* renamed from: t */
    public final Object f4823t;

    /* renamed from: u */
    public final SparseArray<C0886b> f4824u;

    /* renamed from: v */
    public final Runnable f4825v;

    /* renamed from: w */
    public final Runnable f4826w;

    /* renamed from: x */
    public final C0892d.C0894b f4827x;

    /* renamed from: y */
    public final cj3 f4828y;

    /* renamed from: z */
    public x11 f4829z;

    public static final class Factory implements C0973i.C0974a {

        /* renamed from: a */
        public final C0884a.C0885a f4830a;

        /* renamed from: b */
        public final x11.C3565a f4831b;

        /* renamed from: c */
        public rk1 f4832c;

        /* renamed from: d */
        public tn0 f4833d;

        /* renamed from: e */
        public C1019b f4834e;

        /* renamed from: f */
        public long f4835f;

        /* renamed from: g */
        public C1023c.C1024a<? extends d11> f4836g;

        public Factory(x11.C3565a aVar) {
            this(new C0888c.C0889a(aVar), aVar);
        }

        /* renamed from: d */
        public DashMediaSource mo7206a(C0798k kVar) {
            t12 t12;
            C2725kr.m20985e(kVar.f4244d);
            C1023c.C1024a aVar = this.f4836g;
            if (aVar == null) {
                aVar = new e11();
            }
            List<StreamKey> list = kVar.f4244d.f4310d;
            if (!list.isEmpty()) {
                t12 = new t12(aVar, list);
            } else {
                t12 = aVar;
            }
            return new DashMediaSource(kVar, (d11) null, this.f4831b, t12, this.f4830a, this.f4833d, this.f4832c.mo7378a(kVar), this.f4834e, this.f4835f, (C0876a) null);
        }

        /* renamed from: e */
        public Factory mo7207b(rk1 rk1) {
            this.f4832c = (rk1) C2725kr.m20986f(rk1, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        /* renamed from: f */
        public Factory mo7208c(C1019b bVar) {
            this.f4834e = (C1019b) C2725kr.m20986f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory(C0884a.C0885a aVar, x11.C3565a aVar2) {
            this.f4830a = (C0884a.C0885a) C2725kr.m20985e(aVar);
            this.f4831b = aVar2;
            this.f4832c = new C0908a();
            this.f4834e = new C1018a();
            this.f4835f = 30000;
            this.f4833d = new g71();
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$a */
    public class C0876a implements q56.C3125b {
        public C0876a() {
        }

        /* renamed from: a */
        public void mo7212a(IOException iOException) {
            DashMediaSource.this.mo7191W(iOException);
        }

        /* renamed from: b */
        public void mo7213b() {
            DashMediaSource.this.mo7192X(q56.m25431h());
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$b */
    public static final class C0877b extends C0831s {

        /* renamed from: A */
        public final d11 f4838A;

        /* renamed from: B */
        public final C0798k f4839B;

        /* renamed from: C */
        public final C0798k.C0807g f4840C;

        /* renamed from: e */
        public final long f4841e;

        /* renamed from: g */
        public final long f4842g;

        /* renamed from: k */
        public final long f4843k;

        /* renamed from: r */
        public final int f4844r;

        /* renamed from: s */
        public final long f4845s;

        /* renamed from: x */
        public final long f4846x;

        /* renamed from: y */
        public final long f4847y;

        public C0877b(long j, long j2, long j3, int i, long j4, long j5, long j6, d11 d11, C0798k kVar, C0798k.C0807g gVar) {
            boolean z;
            d11 d112 = d11;
            C0798k.C0807g gVar2 = gVar;
            boolean z2 = d112.f10422d;
            boolean z3 = true;
            if (gVar2 != null) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20987g(z2 != z ? false : z3);
            this.f4841e = j;
            this.f4842g = j2;
            this.f4843k = j3;
            this.f4844r = i;
            this.f4845s = j4;
            this.f4846x = j5;
            this.f4847y = j6;
            this.f4838A = d112;
            this.f4839B = kVar;
            this.f4840C = gVar2;
        }

        /* renamed from: z */
        public static boolean m6334z(d11 d11) {
            if (!d11.f10422d || d11.f10423e == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || d11.f10420b != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public int mo6867f(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f4844r) >= 0 && intValue < mo6875m()) {
                return intValue;
            }
            return -1;
        }

        /* renamed from: k */
        public C0831s.C0833b mo6873k(int i, C0831s.C0833b bVar, boolean z) {
            String str;
            C2725kr.m20983c(i, 0, mo6875m());
            Integer num = null;
            if (z) {
                str = this.f4838A.mo18392d(i).f13722a;
            } else {
                str = null;
            }
            if (z) {
                num = Integer.valueOf(this.f4844r + i);
            }
            return bVar.mo6905v(str, num, 0, this.f4838A.mo18395g(i), w67.m29391y0(this.f4838A.mo18392d(i).f13723b - this.f4838A.mo18392d(0).f13723b) - this.f4845s);
        }

        /* renamed from: m */
        public int mo6875m() {
            return this.f4838A.mo18393e();
        }

        /* renamed from: q */
        public Object mo6879q(int i) {
            C2725kr.m20983c(i, 0, mo6875m());
            return Integer.valueOf(this.f4844r + i);
        }

        /* renamed from: s */
        public C0831s.C0835d mo6881s(int i, C0831s.C0835d dVar, long j) {
            C2725kr.m20983c(i, 0, 1);
            long y = mo7214y(j);
            Object obj = C0831s.C0835d.f4447Q;
            C0798k kVar = this.f4839B;
            d11 d11 = this.f4838A;
            return dVar.mo6915k(obj, kVar, d11, this.f4841e, this.f4842g, this.f4843k, true, m6334z(d11), this.f4840C, y, this.f4846x, 0, mo6875m() - 1, this.f4845s);
        }

        /* renamed from: t */
        public int mo6882t() {
            return 1;
        }

        /* renamed from: y */
        public final long mo7214y(long j) {
            h11 b;
            long j2 = this.f4847y;
            if (!m6334z(this.f4838A)) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.f4846x) {
                    return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                }
            }
            long j3 = this.f4845s + j2;
            long g = this.f4838A.mo18395g(0);
            int i = 0;
            while (i < this.f4838A.mo18393e() - 1 && j3 >= g) {
                j3 -= g;
                i++;
                g = this.f4838A.mo18395g(i);
            }
            jn4 d = this.f4838A.mo18392d(i);
            int a = d.mo21985a(2);
            if (a == -1 || (b = d.f13724c.get(a).f14465c.get(0).mo27725b()) == null || b.mo20922i(g) == 0) {
                return j2;
            }
            return (j2 + b.mo20916c(b.mo20921h(j3, g))) - j3;
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$c */
    public final class C0878c implements C0892d.C0894b {
        public C0878c() {
        }

        /* renamed from: a */
        public void mo7215a(long j) {
            DashMediaSource.this.mo7184P(j);
        }

        /* renamed from: b */
        public void mo7216b() {
            DashMediaSource.this.mo7185Q();
        }

        public /* synthetic */ C0878c(DashMediaSource dashMediaSource, C0876a aVar) {
            this();
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$d */
    public static final class C0879d implements C1023c.C1024a<Long> {

        /* renamed from: a */
        public static final Pattern f4849a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        /* renamed from: b */
        public Long mo7217a(Uri uri, InputStream inputStream) throws IOException {
            long j;
            long j2;
            String readLine = new BufferedReader(new InputStreamReader(inputStream, be0.f21263c)).readLine();
            try {
                Matcher matcher = f4849a.matcher(readLine);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    long time = simpleDateFormat.parse(group).getTime();
                    if (!"Z".equals(matcher.group(2))) {
                        if (Marker.ANY_NON_NULL_MARKER.equals(matcher.group(4))) {
                            j = 1;
                        } else {
                            j = -1;
                        }
                        long parseLong = Long.parseLong(matcher.group(5));
                        String group2 = matcher.group(7);
                        if (TextUtils.isEmpty(group2)) {
                            j2 = 0;
                        } else {
                            j2 = Long.parseLong(group2);
                        }
                        time -= j * ((((parseLong * 60) + j2) * 60) * 1000);
                    }
                    return Long.valueOf(time);
                }
                throw ParserException.createForMalformedManifest("Couldn't parse timestamp: " + readLine, (Throwable) null);
            } catch (ParseException e) {
                throw ParserException.createForMalformedManifest((String) null, e);
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$e */
    public final class C0880e implements Loader.C1012b<C1023c<d11>> {
        public C0880e() {
        }

        /* renamed from: a */
        public void mo7224u(C1023c<d11> cVar, long j, long j2, boolean z) {
            DashMediaSource.this.mo7186R(cVar, j, j2);
        }

        /* renamed from: b */
        public void mo7223s(C1023c<d11> cVar, long j, long j2) {
            DashMediaSource.this.mo7187S(cVar, j, j2);
        }

        /* renamed from: c */
        public Loader.C1013c mo7222k(C1023c<d11> cVar, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.mo7188T(cVar, j, j2, iOException, i);
        }

        public /* synthetic */ C0880e(DashMediaSource dashMediaSource, C0876a aVar) {
            this();
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$f */
    public final class C0881f implements cj3 {
        public C0881f() {
        }

        /* renamed from: a */
        public final void mo7225a() throws IOException {
            if (DashMediaSource.this.f4798C != null) {
                throw DashMediaSource.this.f4798C;
            }
        }

        /* renamed from: b */
        public void mo7226b() throws IOException {
            DashMediaSource.this.f4796A.mo7226b();
            mo7225a();
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$g */
    public final class C0882g implements Loader.C1012b<C1023c<Long>> {
        public C0882g() {
        }

        /* renamed from: a */
        public void mo7224u(C1023c<Long> cVar, long j, long j2, boolean z) {
            DashMediaSource.this.mo7186R(cVar, j, j2);
        }

        /* renamed from: b */
        public void mo7223s(C1023c<Long> cVar, long j, long j2) {
            DashMediaSource.this.mo7189U(cVar, j, j2);
        }

        /* renamed from: c */
        public Loader.C1013c mo7222k(C1023c<Long> cVar, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.mo7190V(cVar, j, j2, iOException);
        }

        public /* synthetic */ C0882g(DashMediaSource dashMediaSource, C0876a aVar) {
            this();
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.DashMediaSource$h */
    public static final class C0883h implements C1023c.C1024a<Long> {
        public C0883h() {
        }

        public /* synthetic */ C0883h(C0876a aVar) {
            this();
        }

        /* renamed from: b */
        public Long mo7217a(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(w67.m29303E0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        ir3.m19787a("media3.exoplayer.dash");
    }

    public /* synthetic */ DashMediaSource(C0798k kVar, d11 d11, x11.C3565a aVar, C1023c.C1024a aVar2, C0884a.C0885a aVar3, tn0 tn0, C0912c cVar, C1019b bVar, long j, C0876a aVar4) {
        this(kVar, d11, aVar, aVar2, aVar3, tn0, cVar, bVar, j);
    }

    /* renamed from: H */
    public static long m6295H(jn4 jn4, long j, long j2) {
        jn4 jn42 = jn4;
        long j3 = j;
        long j4 = j2;
        long y0 = w67.m29391y0(jn42.f13723b);
        boolean L = m6298L(jn4);
        long j5 = Long.MAX_VALUE;
        for (int i = 0; i < jn42.f13724c.size(); i++) {
            C2751lb lbVar = jn42.f13724c.get(i);
            List<xd5> list = lbVar.f14465c;
            if ((!L || lbVar.f14464b != 3) && !list.isEmpty()) {
                h11 b = list.get(0).mo27725b();
                if (b == null) {
                    return y0 + j3;
                }
                long l = b.mo20925l(j3, j4);
                if (l == 0) {
                    return y0;
                }
                long e = (b.mo20918e(j3, j4) + l) - 1;
                j5 = Math.min(j5, b.mo20917d(e, j3) + b.mo20916c(e) + y0);
            }
        }
        return j5;
    }

    /* renamed from: I */
    public static long m6296I(jn4 jn4, long j, long j2) {
        jn4 jn42 = jn4;
        long j3 = j;
        long j4 = j2;
        long y0 = w67.m29391y0(jn42.f13723b);
        boolean L = m6298L(jn4);
        long j5 = y0;
        for (int i = 0; i < jn42.f13724c.size(); i++) {
            C2751lb lbVar = jn42.f13724c.get(i);
            List<xd5> list = lbVar.f14465c;
            if ((!L || lbVar.f14464b != 3) && !list.isEmpty()) {
                h11 b = list.get(0).mo27725b();
                if (b == null || b.mo20925l(j3, j4) == 0) {
                    return y0;
                }
                j5 = Math.max(j5, b.mo20916c(b.mo20918e(j3, j4)) + y0);
            }
        }
        return j5;
    }

    /* renamed from: J */
    public static long m6297J(d11 d11, long j) {
        h11 b;
        d11 d112 = d11;
        int e = d11.mo18393e() - 1;
        jn4 d = d112.mo18392d(e);
        long y0 = w67.m29391y0(d.f13723b);
        long g = d112.mo18395g(e);
        long y02 = w67.m29391y0(j);
        long y03 = w67.m29391y0(d112.f10419a);
        long y04 = w67.m29391y0(5000);
        for (int i = 0; i < d.f13724c.size(); i++) {
            List<xd5> list = d.f13724c.get(i).f14465c;
            if (!list.isEmpty() && (b = list.get(0).mo27725b()) != null) {
                long f = ((y03 + y0) + b.mo20919f(g, y02)) - y02;
                if (f < y04 - 100000 || (f > y04 && f < y04 + 100000)) {
                    y04 = f;
                }
            }
        }
        return gl3.m44753a(y04, 1000, RoundingMode.CEILING);
    }

    /* renamed from: L */
    public static boolean m6298L(jn4 jn4) {
        for (int i = 0; i < jn4.f13724c.size(); i++) {
            int i2 = jn4.f13724c.get(i).f14464b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: M */
    public static boolean m6299M(jn4 jn4) {
        for (int i = 0; i < jn4.f13724c.size(); i++) {
            h11 b = jn4.f13724c.get(i).f14465c.get(0).mo27725b();
            if (b == null || b.mo20923j()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m6300N() {
        mo7193Y(false);
    }

    /* renamed from: A */
    public void mo7181A() {
        d11 d11;
        this.f4804I = false;
        this.f4829z = null;
        Loader loader = this.f4796A;
        if (loader != null) {
            loader.mo7811l();
            this.f4796A = null;
        }
        this.f4805J = 0;
        this.f4806K = 0;
        if (this.f4812i) {
            d11 = this.f4803H;
        } else {
            d11 = null;
        }
        this.f4803H = d11;
        this.f4801F = this.f4802G;
        this.f4798C = null;
        Handler handler = this.f4799D;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f4799D = null;
        }
        this.f4807L = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f4808M = 0;
        this.f4809N = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f4810O = 0;
        this.f4824u.clear();
        this.f4818o.mo25285i();
        this.f4816m.mo7358a();
    }

    /* renamed from: K */
    public final long mo7182K() {
        return (long) Math.min((this.f4808M - 1) * 1000, 5000);
    }

    /* renamed from: O */
    public final void mo7183O() {
        q56.m25433j(this.f4796A, new C0876a());
    }

    /* renamed from: P */
    public void mo7184P(long j) {
        long j2 = this.f4809N;
        if (j2 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || j2 < j) {
            this.f4809N = j;
        }
    }

    /* renamed from: Q */
    public void mo7185Q() {
        this.f4799D.removeCallbacks(this.f4826w);
        mo7201e0();
    }

    /* renamed from: R */
    public void mo7186R(C1023c<?> cVar, long j, long j2) {
        C1023c<?> cVar2 = cVar;
        vi3 vi3 = new vi3(cVar2.f5478a, cVar2.f5479b, cVar.mo7833f(), cVar.mo7831d(), j, j2, cVar.mo7830b());
        this.f4817n.mo7826c(cVar2.f5478a);
        this.f4820q.mo7650q(vi3, cVar2.f5480c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ca  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7187S(androidx.media3.exoplayer.upstream.C1023c<p000.d11> r19, long r20, long r22) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r14 = r20
            vi3 r12 = new vi3
            long r3 = r0.f5478a
            d21 r5 = r0.f5479b
            android.net.Uri r6 = r19.mo7833f()
            java.util.Map r7 = r19.mo7831d()
            long r16 = r19.mo7830b()
            r2 = r12
            r8 = r20
            r10 = r22
            r14 = r12
            r12 = r16
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            androidx.media3.exoplayer.upstream.b r2 = r1.f4817n
            long r3 = r0.f5478a
            r2.mo7826c(r3)
            androidx.media3.exoplayer.source.j$a r2 = r1.f4820q
            int r3 = r0.f5480c
            r2.mo7653t(r14, r3)
            java.lang.Object r2 = r19.mo7832e()
            d11 r2 = (p000.d11) r2
            d11 r3 = r1.f4803H
            r4 = 0
            if (r3 != 0) goto L_0x003e
            r3 = r4
            goto L_0x0042
        L_0x003e:
            int r3 = r3.mo18393e()
        L_0x0042:
            jn4 r5 = r2.mo18392d(r4)
            long r5 = r5.f13723b
            r7 = r4
        L_0x0049:
            if (r7 >= r3) goto L_0x005a
            d11 r8 = r1.f4803H
            jn4 r8 = r8.mo18392d(r7)
            long r8 = r8.f13723b
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x005a
            int r7 = r7 + 1
            goto L_0x0049
        L_0x005a:
            boolean r5 = r2.f10422d
            r6 = 1
            if (r5 == 0) goto L_0x00cc
            int r5 = r3 - r7
            int r8 = r2.mo18393e()
            if (r5 <= r8) goto L_0x0070
            java.lang.String r5 = "DashMediaSource"
            java.lang.String r8 = "Loaded out of sync manifest"
            p000.gk3.m18132i(r5, r8)
        L_0x006e:
            r5 = r6
            goto L_0x00a8
        L_0x0070:
            long r8 = r1.f4809N
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x00a7
            long r10 = r2.f10426h
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x00a7
            java.lang.String r5 = "DashMediaSource"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Loaded stale dynamic manifest: "
            r8.append(r9)
            long r9 = r2.f10426h
            r8.append(r9)
            java.lang.String r9 = ", "
            r8.append(r9)
            long r9 = r1.f4809N
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            p000.gk3.m18132i(r5, r8)
            goto L_0x006e
        L_0x00a7:
            r5 = r4
        L_0x00a8:
            if (r5 == 0) goto L_0x00ca
            int r2 = r1.f4808M
            int r3 = r2 + 1
            r1.f4808M = r3
            androidx.media3.exoplayer.upstream.b r3 = r1.f4817n
            int r0 = r0.f5480c
            int r0 = r3.mo7825b(r0)
            if (r2 >= r0) goto L_0x00c2
            long r2 = r18.mo7182K()
            r1.mo7198c0(r2)
            goto L_0x00c9
        L_0x00c2:
            androidx.media3.exoplayer.dash.DashManifestStaleException r0 = new androidx.media3.exoplayer.dash.DashManifestStaleException
            r0.<init>()
            r1.f4798C = r0
        L_0x00c9:
            return
        L_0x00ca:
            r1.f4808M = r4
        L_0x00cc:
            r1.f4803H = r2
            boolean r5 = r1.f4804I
            boolean r2 = r2.f10422d
            r2 = r2 & r5
            r1.f4804I = r2
            r8 = r20
            long r10 = r8 - r22
            r1.f4805J = r10
            r1.f4806K = r8
            java.lang.Object r2 = r1.f4823t
            monitor-enter(r2)
            d21 r5 = r0.f5479b     // Catch:{ all -> 0x011a }
            android.net.Uri r5 = r5.f10437a     // Catch:{ all -> 0x011a }
            android.net.Uri r8 = r1.f4801F     // Catch:{ all -> 0x011a }
            if (r5 != r8) goto L_0x00e9
            r4 = r6
        L_0x00e9:
            if (r4 == 0) goto L_0x00f8
            d11 r4 = r1.f4803H     // Catch:{ all -> 0x011a }
            android.net.Uri r4 = r4.f10429k     // Catch:{ all -> 0x011a }
            if (r4 == 0) goto L_0x00f2
            goto L_0x00f6
        L_0x00f2:
            android.net.Uri r4 = r19.mo7833f()     // Catch:{ all -> 0x011a }
        L_0x00f6:
            r1.f4801F = r4     // Catch:{ all -> 0x011a }
        L_0x00f8:
            monitor-exit(r2)     // Catch:{ all -> 0x011a }
            if (r3 != 0) goto L_0x0111
            d11 r0 = r1.f4803H
            boolean r2 = r0.f10422d
            if (r2 == 0) goto L_0x010d
            e67 r0 = r0.f10427i
            if (r0 == 0) goto L_0x0109
            r1.mo7194Z(r0)
            goto L_0x0119
        L_0x0109:
            r18.mo7183O()
            goto L_0x0119
        L_0x010d:
            r1.mo7193Y(r6)
            goto L_0x0119
        L_0x0111:
            int r0 = r1.f4810O
            int r0 = r0 + r7
            r1.f4810O = r0
            r1.mo7193Y(r6)
        L_0x0119:
            return
        L_0x011a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x011a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.mo7187S(androidx.media3.exoplayer.upstream.c, long, long):void");
    }

    /* renamed from: T */
    public Loader.C1013c mo7188T(C1023c<d11> cVar, long j, long j2, IOException iOException, int i) {
        Loader.C1013c cVar2;
        C1023c<d11> cVar3 = cVar;
        IOException iOException2 = iOException;
        vi3 vi3 = new vi3(cVar3.f5478a, cVar3.f5479b, cVar.mo7833f(), cVar.mo7831d(), j, j2, cVar.mo7830b());
        long a = this.f4817n.mo7824a(new C1019b.C1022c(vi3, new jr3(cVar3.f5480c), iOException2, i));
        if (a == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            cVar2 = Loader.f5450g;
        } else {
            cVar2 = Loader.m7530h(false, a);
        }
        boolean z = !cVar2.mo7814c();
        this.f4820q.mo7657x(vi3, cVar3.f5480c, iOException2, z);
        if (z) {
            this.f4817n.mo7826c(cVar3.f5478a);
        }
        return cVar2;
    }

    /* renamed from: U */
    public void mo7189U(C1023c<Long> cVar, long j, long j2) {
        C1023c<Long> cVar2 = cVar;
        vi3 vi3 = new vi3(cVar2.f5478a, cVar2.f5479b, cVar.mo7833f(), cVar.mo7831d(), j, j2, cVar.mo7830b());
        this.f4817n.mo7826c(cVar2.f5478a);
        this.f4820q.mo7653t(vi3, cVar2.f5480c);
        mo7192X(cVar.mo7832e().longValue() - j);
    }

    /* renamed from: V */
    public Loader.C1013c mo7190V(C1023c<Long> cVar, long j, long j2, IOException iOException) {
        C1023c<Long> cVar2 = cVar;
        IOException iOException2 = iOException;
        C0977j.C0978a aVar = this.f4820q;
        vi3 vi3 = r4;
        vi3 vi32 = new vi3(cVar2.f5478a, cVar2.f5479b, cVar.mo7833f(), cVar.mo7831d(), j, j2, cVar.mo7830b());
        aVar.mo7657x(vi3, cVar2.f5480c, iOException2, true);
        this.f4817n.mo7826c(cVar2.f5478a);
        mo7191W(iOException2);
        return Loader.f5449f;
    }

    /* renamed from: W */
    public final void mo7191W(IOException iOException) {
        gk3.m18127d("DashMediaSource", "Failed to resolve time offset.", iOException);
        mo7193Y(true);
    }

    /* renamed from: X */
    public final void mo7192X(long j) {
        this.f4807L = j;
        mo7193Y(true);
    }

    /* renamed from: Y */
    public final void mo7193Y(boolean z) {
        boolean z2;
        long j;
        long j2;
        jn4 jn4;
        C0798k.C0807g gVar;
        boolean z3;
        for (int i = 0; i < this.f4824u.size(); i++) {
            int keyAt = this.f4824u.keyAt(i);
            if (keyAt >= this.f4810O) {
                this.f4824u.valueAt(i).mo7240K(this.f4803H, keyAt - this.f4810O);
            }
        }
        jn4 d = this.f4803H.mo18392d(0);
        int e = this.f4803H.mo18393e() - 1;
        jn4 d2 = this.f4803H.mo18392d(e);
        long g = this.f4803H.mo18395g(e);
        long y0 = w67.m29391y0(w67.m29339X(this.f4807L));
        long I = m6296I(d, this.f4803H.mo18395g(0), y0);
        long H = m6295H(d2, g, y0);
        if (!this.f4803H.f10422d || m6299M(d2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            long j3 = this.f4803H.f10424f;
            if (j3 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                I = Math.max(I, H - w67.m29391y0(j3));
            }
        }
        long j4 = H - I;
        d11 d11 = this.f4803H;
        jn4 jn42 = d;
        if (d11.f10422d) {
            if (d11.f10419a != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                z3 = true;
            } else {
                z3 = false;
            }
            C2725kr.m20987g(z3);
            long y02 = (y0 - w67.m29391y0(this.f4803H.f10419a)) - I;
            mo7202f0(y02, j4);
            long U0 = this.f4803H.f10419a + w67.m29335U0(I);
            long y03 = y02 - w67.m29391y0(this.f4800E.f4297a);
            long min = Math.min(5000000, j4 / 2);
            j2 = U0;
            if (y03 < min) {
                j = min;
            } else {
                j = y03;
            }
            jn4 = jn42;
        } else {
            jn4 = jn42;
            j2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            j = 0;
        }
        long y04 = I - w67.m29391y0(jn4.f13723b);
        d11 d112 = this.f4803H;
        long j5 = d112.f10419a;
        long j6 = this.f4807L;
        int i2 = this.f4810O;
        C0798k kVar = this.f4811h;
        if (d112.f10422d) {
            gVar = this.f4800E;
        } else {
            gVar = null;
        }
        mo7585z(new C0877b(j5, j2, j6, i2, y04, j4, j, d112, kVar, gVar));
        if (!this.f4812i) {
            this.f4799D.removeCallbacks(this.f4826w);
            if (z2) {
                this.f4799D.postDelayed(this.f4826w, m6297J(this.f4803H, w67.m29339X(this.f4807L)));
            }
            if (this.f4804I) {
                mo7201e0();
            } else if (z) {
                d11 d113 = this.f4803H;
                if (d113.f10422d) {
                    long j7 = d113.f10423e;
                    if (j7 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                        if (j7 == 0) {
                            j7 = 5000;
                        }
                        mo7198c0(Math.max(0, (this.f4805J + j7) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }

    /* renamed from: Z */
    public final void mo7194Z(e67 e67) {
        String str = e67.f11081a;
        if (w67.m29346c(str, "urn:mpeg:dash:utc:direct:2014") || w67.m29346c(str, "urn:mpeg:dash:utc:direct:2012")) {
            mo7195a0(e67);
        } else if (w67.m29346c(str, "urn:mpeg:dash:utc:http-iso:2014") || w67.m29346c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            mo7196b0(e67, new C0879d());
        } else if (w67.m29346c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || w67.m29346c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            mo7196b0(e67, new C0883h((C0876a) null));
        } else if (w67.m29346c(str, "urn:mpeg:dash:utc:ntp:2014") || w67.m29346c(str, "urn:mpeg:dash:utc:ntp:2012")) {
            mo7183O();
        } else {
            mo7191W(new IOException("Unsupported UTC timing scheme"));
        }
    }

    /* renamed from: a0 */
    public final void mo7195a0(e67 e67) {
        try {
            mo7192X(w67.m29303E0(e67.f11082b) - this.f4806K);
        } catch (ParserException e) {
            mo7191W(e);
        }
    }

    /* renamed from: b0 */
    public final void mo7196b0(e67 e67, C1023c.C1024a<Long> aVar) {
        mo7200d0(new C1023c(this.f4829z, Uri.parse(e67.f11082b), 5, aVar), new C0882g(this, (C0876a) null), 1);
    }

    /* renamed from: c */
    public C0971h mo7197c(C0973i.C0975b bVar, C2891nf nfVar, long j) {
        C0973i.C0975b bVar2 = bVar;
        int intValue = ((Integer) bVar2.f15659a).intValue() - this.f4810O;
        int i = intValue;
        C0977j.C0978a t = mo7580t(bVar2, this.f4803H.mo18392d(intValue).f13723b);
        C0909b.C0910a q = mo7577q(bVar);
        C0886b bVar3 = r2;
        C0886b bVar4 = new C0886b(intValue + this.f4810O, this.f4803H, this.f4818o, i, this.f4814k, this.f4797B, this.f4816m, q, this.f4817n, t, this.f4807L, this.f4828y, nfVar, this.f4815l, this.f4827x, mo7583w());
        C0886b bVar5 = bVar3;
        this.f4824u.put(bVar5.f4868a, bVar5);
        return bVar5;
    }

    /* renamed from: c0 */
    public final void mo7198c0(long j) {
        this.f4799D.postDelayed(this.f4825v, j);
    }

    /* renamed from: d */
    public C0798k mo7199d() {
        return this.f4811h;
    }

    /* renamed from: d0 */
    public final <T> void mo7200d0(C1023c<T> cVar, Loader.C1012b<C1023c<T>> bVar, int i) {
        this.f4820q.mo7659z(new vi3(cVar.f5478a, cVar.f5479b, this.f4796A.mo7813n(cVar, bVar, i)), cVar.f5480c);
    }

    /* renamed from: e0 */
    public final void mo7201e0() {
        Uri uri;
        this.f4799D.removeCallbacks(this.f4825v);
        if (!this.f4796A.mo7808i()) {
            if (this.f4796A.mo7809j()) {
                this.f4804I = true;
                return;
            }
            synchronized (this.f4823t) {
                uri = this.f4801F;
            }
            this.f4804I = false;
            mo7200d0(new C1023c(this.f4829z, uri, 4, this.f4821r), this.f4822s, this.f4817n.mo7825b(4));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00cf  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7202f0(long r18, long r20) {
        /*
            r17 = this;
            r0 = r17
            long r5 = p000.w67.m29335U0(r18)
            androidx.media3.common.k r1 = r0.f4811h
            androidx.media3.common.k$g r1 = r1.f4246g
            long r1 = r1.f4299e
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x001b
            long r1 = java.lang.Math.min(r5, r1)
        L_0x0019:
            r9 = r1
            goto L_0x002d
        L_0x001b:
            d11 r1 = r0.f4803H
            hx5 r1 = r1.f10428j
            if (r1 == 0) goto L_0x002c
            long r1 = r1.f13091c
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x002c
            long r1 = java.lang.Math.min(r5, r1)
            goto L_0x0019
        L_0x002c:
            r9 = r5
        L_0x002d:
            long r1 = r18 - r20
            long r1 = p000.w67.m29335U0(r1)
            r3 = 0
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x003e
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x003e
            r1 = r3
        L_0x003e:
            d11 r3 = r0.f4803H
            long r3 = r3.f10421c
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x004b
            long r1 = r1 + r3
            long r1 = java.lang.Math.min(r1, r5)
        L_0x004b:
            r3 = r1
            androidx.media3.common.k r1 = r0.f4811h
            androidx.media3.common.k$g r1 = r1.f4246g
            long r1 = r1.f4298d
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x005b
            long r3 = p000.w67.m29376r(r1, r3, r5)
            goto L_0x006b
        L_0x005b:
            d11 r1 = r0.f4803H
            hx5 r1 = r1.f10428j
            if (r1 == 0) goto L_0x006b
            long r1 = r1.f13090b
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x006b
            long r3 = p000.w67.m29376r(r1, r3, r5)
        L_0x006b:
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0070
            r9 = r3
        L_0x0070:
            androidx.media3.common.k$g r1 = r0.f4800E
            long r1 = r1.f4297a
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0079
            goto L_0x0090
        L_0x0079:
            d11 r1 = r0.f4803H
            hx5 r2 = r1.f10428j
            if (r2 == 0) goto L_0x0087
            long r5 = r2.f13089a
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0087
            r1 = r5
            goto L_0x0090
        L_0x0087:
            long r1 = r1.f10425g
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            long r1 = r0.f4819p
        L_0x0090:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0095
            r1 = r3
        L_0x0095:
            int r5 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x00b0
            r1 = 5000000(0x4c4b40, double:2.470328E-317)
            r5 = 2
            long r5 = r20 / r5
            long r1 = java.lang.Math.min(r1, r5)
            long r1 = r18 - r1
            long r11 = p000.w67.m29335U0(r1)
            r13 = r3
            r15 = r9
            long r1 = p000.w67.m29376r(r11, r13, r15)
        L_0x00b0:
            androidx.media3.common.k r5 = r0.f4811h
            androidx.media3.common.k$g r5 = r5.f4246g
            float r6 = r5.f4300g
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r12 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r12 == 0) goto L_0x00be
            goto L_0x00c8
        L_0x00be:
            d11 r6 = r0.f4803H
            hx5 r6 = r6.f10428j
            if (r6 == 0) goto L_0x00c7
            float r6 = r6.f13092d
            goto L_0x00c8
        L_0x00c7:
            r6 = r11
        L_0x00c8:
            float r5 = r5.f4301k
            int r12 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r12 == 0) goto L_0x00cf
            goto L_0x00d9
        L_0x00cf:
            d11 r5 = r0.f4803H
            hx5 r5 = r5.f10428j
            if (r5 == 0) goto L_0x00d8
            float r5 = r5.f13093e
            goto L_0x00d9
        L_0x00d8:
            r5 = r11
        L_0x00d9:
            int r12 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 != 0) goto L_0x00f1
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x00f1
            d11 r11 = r0.f4803H
            hx5 r11 = r11.f10428j
            if (r11 == 0) goto L_0x00ef
            long r11 = r11.f13089a
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x00f1
        L_0x00ef:
            r5 = r13
            r6 = r5
        L_0x00f1:
            androidx.media3.common.k$g$a r7 = new androidx.media3.common.k$g$a
            r7.<init>()
            androidx.media3.common.k$g$a r1 = r7.mo6784k(r1)
            androidx.media3.common.k$g$a r1 = r1.mo6782i(r3)
            androidx.media3.common.k$g$a r1 = r1.mo6780g(r9)
            androidx.media3.common.k$g$a r1 = r1.mo6783j(r6)
            androidx.media3.common.k$g$a r1 = r1.mo6781h(r5)
            androidx.media3.common.k$g r1 = r1.mo6779f()
            r0.f4800E = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.mo7202f0(long, long):void");
    }

    /* renamed from: g */
    public void mo7203g(C0971h hVar) {
        C0886b bVar = (C0886b) hVar;
        bVar.mo7236G();
        this.f4824u.remove(bVar.f4868a);
    }

    /* renamed from: m */
    public void mo7204m() throws IOException {
        this.f4828y.mo7226b();
    }

    /* renamed from: y */
    public void mo7205y(ov6 ov6) {
        this.f4797B = ov6;
        this.f4816m.mo7362e();
        this.f4816m.mo7359b(Looper.myLooper(), mo7583w());
        if (this.f4812i) {
            mo7193Y(false);
            return;
        }
        this.f4829z = this.f4813j.mo21778a();
        this.f4796A = new Loader("DashMediaSource");
        this.f4799D = w67.m29384v();
        mo7201e0();
    }

    public DashMediaSource(C0798k kVar, d11 d11, x11.C3565a aVar, C1023c.C1024a<? extends d11> aVar2, C0884a.C0885a aVar3, tn0 tn0, C0912c cVar, C1019b bVar, long j) {
        this.f4811h = kVar;
        this.f4800E = kVar.f4246g;
        this.f4801F = ((C0798k.C0809h) C2725kr.m20985e(kVar.f4244d)).f4307a;
        this.f4802G = kVar.f4244d.f4307a;
        this.f4803H = d11;
        this.f4813j = aVar;
        this.f4821r = aVar2;
        this.f4814k = aVar3;
        this.f4816m = cVar;
        this.f4817n = bVar;
        this.f4819p = j;
        this.f4815l = tn0;
        this.f4818o = new C3178qz();
        boolean z = d11 != null;
        this.f4812i = z;
        this.f4820q = mo7579s((C0973i.C0975b) null);
        this.f4823t = new Object();
        this.f4824u = new SparseArray<>();
        this.f4827x = new C0878c(this, (C0876a) null);
        this.f4809N = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f4807L = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        if (z) {
            C2725kr.m20987g(true ^ d11.f10422d);
            this.f4822s = null;
            this.f4825v = null;
            this.f4826w = null;
            this.f4828y = new cj3.C1682a();
            return;
        }
        this.f4822s = new C0880e(this, (C0876a) null);
        this.f4828y = new C0881f();
        this.f4825v = new f11(this);
        this.f4826w = new g11(this);
    }
}

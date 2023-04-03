package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.C0778b;
import androidx.media3.common.C0784c;
import androidx.media3.common.C0788f;
import androidx.media3.common.C0789g;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0798k;
import androidx.media3.common.C0816l;
import androidx.media3.common.C0820n;
import androidx.media3.common.C0821o;
import androidx.media3.common.C0831s;
import androidx.media3.common.C0840v;
import androidx.media3.common.C0842w;
import androidx.media3.common.C0844x;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.audio.C0860a;
import androidx.media3.exoplayer.source.C0973i;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p000.C2988os;
import p000.C3428us;
import p000.ax1;
import p000.cr4;
import p000.fs3;
import p000.jv1;
import p000.va6;

/* renamed from: ow1 */
/* compiled from: ExoPlayerImpl */
public final class ow1 extends C0784c implements jv1 {

    /* renamed from: A */
    public final C3428us f16085A;

    /* renamed from: B */
    public final va6 f16086B;

    /* renamed from: C */
    public final dg7 f16087C;

    /* renamed from: D */
    public final yk7 f16088D;

    /* renamed from: E */
    public final long f16089E;

    /* renamed from: F */
    public int f16090F;

    /* renamed from: G */
    public boolean f16091G;

    /* renamed from: H */
    public int f16092H;

    /* renamed from: I */
    public int f16093I;

    /* renamed from: J */
    public boolean f16094J;

    /* renamed from: K */
    public int f16095K;

    /* renamed from: L */
    public ys5 f16096L;

    /* renamed from: M */
    public x06 f16097M;

    /* renamed from: N */
    public boolean f16098N;

    /* renamed from: O */
    public C0821o.C0823b f16099O;

    /* renamed from: P */
    public C0816l f16100P;

    /* renamed from: Q */
    public C0816l f16101Q;

    /* renamed from: R */
    public C0792h f16102R;

    /* renamed from: S */
    public C0792h f16103S;

    /* renamed from: T */
    public AudioTrack f16104T;

    /* renamed from: U */
    public Object f16105U;

    /* renamed from: V */
    public Surface f16106V;

    /* renamed from: W */
    public SurfaceHolder f16107W;

    /* renamed from: X */
    public SphericalGLSurfaceView f16108X;

    /* renamed from: Y */
    public boolean f16109Y;

    /* renamed from: Z */
    public TextureView f16110Z;

    /* renamed from: a0 */
    public int f16111a0;

    /* renamed from: b */
    public final gt6 f16112b;

    /* renamed from: b0 */
    public int f16113b0;

    /* renamed from: c */
    public final C0821o.C0823b f16114c;

    /* renamed from: c0 */
    public int f16115c0;

    /* renamed from: d */
    public final lo0 f16116d;

    /* renamed from: d0 */
    public int f16117d0;

    /* renamed from: e */
    public final Context f16118e;

    /* renamed from: e0 */
    public n31 f16119e0;

    /* renamed from: f */
    public final C0821o f16120f;

    /* renamed from: f0 */
    public n31 f16121f0;

    /* renamed from: g */
    public final md5[] f16122g;

    /* renamed from: g0 */
    public int f16123g0;

    /* renamed from: h */
    public final ft6 f16124h;

    /* renamed from: h0 */
    public C0778b f16125h0;

    /* renamed from: i */
    public final xk2 f16126i;

    /* renamed from: i0 */
    public float f16127i0;

    /* renamed from: j */
    public final ax1.C1593f f16128j;

    /* renamed from: j0 */
    public boolean f16129j0;

    /* renamed from: k */
    public final ax1 f16130k;

    /* renamed from: k0 */
    public hx0 f16131k0;

    /* renamed from: l */
    public final mi3<C0821o.C0826d> f16132l;

    /* renamed from: l0 */
    public boolean f16133l0;

    /* renamed from: m */
    public final CopyOnWriteArraySet<jv1.C2634a> f16134m;

    /* renamed from: m0 */
    public boolean f16135m0;

    /* renamed from: n */
    public final C0831s.C0833b f16136n;

    /* renamed from: n0 */
    public hv4 f16137n0;

    /* renamed from: o */
    public final List<C3001e> f16138o;

    /* renamed from: o0 */
    public boolean f16139o0;

    /* renamed from: p */
    public final boolean f16140p;

    /* renamed from: p0 */
    public boolean f16141p0;

    /* renamed from: q */
    public final C0973i.C0974a f16142q;

    /* renamed from: q0 */
    public C0788f f16143q0;

    /* renamed from: r */
    public final C3142qf f16144r;

    /* renamed from: r0 */
    public C0844x f16145r0;

    /* renamed from: s */
    public final Looper f16146s;

    /* renamed from: s0 */
    public C0816l f16147s0;

    /* renamed from: t */
    public final C2332fx f16148t;

    /* renamed from: t0 */
    public zp4 f16149t0;

    /* renamed from: u */
    public final long f16150u;

    /* renamed from: u0 */
    public int f16151u0;

    /* renamed from: v */
    public final long f16152v;

    /* renamed from: v0 */
    public int f16153v0;

    /* renamed from: w */
    public final dh0 f16154w;

    /* renamed from: w0 */
    public long f16155w0;

    /* renamed from: x */
    public final C2999c f16156x;

    /* renamed from: y */
    public final C3000d f16157y;

    /* renamed from: z */
    public final C2988os f16158z;

    /* renamed from: ow1$b */
    /* compiled from: ExoPlayerImpl */
    public static final class C2998b {
        /* renamed from: a */
        public static br4 m24235a(Context context, ow1 ow1, boolean z) {
            lr3 A0 = lr3.m21725A0(context);
            if (A0 == null) {
                gk3.m18132i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new br4(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z) {
                ow1.mo24145o1(A0);
            }
            return new br4(A0.mo22937H0());
        }
    }

    /* renamed from: ow1$c */
    /* compiled from: ExoPlayerImpl */
    public final class C2999c implements z97, C0860a, zn6, iv3, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.C1029b, C3428us.C3430b, C2988os.C2990b, va6.C3477b, jv1.C2634a {
        public C2999c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: R */
        public /* synthetic */ void m24246R(C0821o.C0826d dVar) {
            dVar.mo6719L(ow1.this.f16100P);
        }

        /* renamed from: A */
        public void mo7080A(int i, long j, long j2) {
            ow1.this.f16144r.mo19125A(i, j, j2);
        }

        /* renamed from: B */
        public void mo7081B(n31 n31) {
            n31 unused = ow1.this.f16121f0 = n31;
            ow1.this.f16144r.mo19126B(n31);
        }

        /* renamed from: C */
        public void mo24168C(long j, int i) {
            ow1.this.f16144r.mo19128C(j, i);
        }

        /* renamed from: D */
        public /* synthetic */ void mo24169D(C0792h hVar) {
            o97.m23725a(this, hVar);
        }

        /* renamed from: E */
        public void mo22088E(boolean z) {
            ow1.this.mo24132C2();
        }

        /* renamed from: F */
        public void mo24170F(float f) {
            ow1.this.mo24150q2();
        }

        /* renamed from: G */
        public void mo24171G(int i) {
            boolean E = ow1.this.mo6678E();
            ow1.this.mo24167z2(E, i, ow1.m24078D1(E, i));
        }

        /* renamed from: a */
        public void mo24172a(int i) {
            C0788f d1 = ow1.m24146u1(ow1.this.f16086B);
            if (!d1.equals(ow1.this.f16143q0)) {
                C0788f unused = ow1.this.f16143q0 = d1;
                ow1.this.f16132l.mo23194l(29, new uw1(d1));
            }
        }

        /* renamed from: b */
        public void mo7082b(boolean z) {
            if (ow1.this.f16129j0 != z) {
                boolean unused = ow1.this.f16129j0 = z;
                ow1.this.f16132l.mo23194l(23, new xw1(z));
            }
        }

        /* renamed from: c */
        public void mo7083c(Exception exc) {
            ow1.this.f16144r.mo19141c(exc);
        }

        /* renamed from: d */
        public void mo24173d(C0792h hVar, p31 p31) {
            C0792h unused = ow1.this.f16102R = hVar;
            ow1.this.f16144r.mo19142d(hVar, p31);
        }

        /* renamed from: e */
        public void mo24174e(String str) {
            ow1.this.f16144r.mo19143e(str);
        }

        /* renamed from: f */
        public void mo24175f(String str, long j, long j2) {
            ow1.this.f16144r.mo19144f(str, j, j2);
        }

        /* renamed from: g */
        public void mo24094g() {
            ow1.this.mo24167z2(false, -1, 3);
        }

        /* renamed from: h */
        public void mo24176h(C0844x xVar) {
            C0844x unused = ow1.this.f16145r0 = xVar;
            ow1.this.f16132l.mo23194l(25, new ww1(xVar));
        }

        /* renamed from: i */
        public void mo7084i(String str) {
            ow1.this.f16144r.mo19146i(str);
        }

        /* renamed from: j */
        public void mo7085j(String str, long j, long j2) {
            ow1.this.f16144r.mo19147j(str, j, j2);
        }

        /* renamed from: k */
        public void mo7867k(Surface surface) {
            ow1.this.mo24159v2((Object) null);
        }

        /* renamed from: l */
        public void mo7086l(C0792h hVar, p31 p31) {
            C0792h unused = ow1.this.f16103S = hVar;
            ow1.this.f16144r.mo19148l(hVar, p31);
        }

        /* renamed from: m */
        public void mo24177m(List<dx0> list) {
            ow1.this.f16132l.mo23194l(27, new pw1(list));
        }

        /* renamed from: n */
        public void mo7087n(long j) {
            ow1.this.f16144r.mo19150n(j);
        }

        /* renamed from: o */
        public void mo24178o(Exception exc) {
            ow1.this.f16144r.mo19151o(exc);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            ow1.this.mo24157u2(surfaceTexture);
            ow1.this.mo24141k2(i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ow1.this.mo24159v2((Object) null);
            ow1.this.mo24141k2(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            ow1.this.mo24141k2(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        /* renamed from: p */
        public void mo7868p(Surface surface) {
            ow1.this.mo24159v2(surface);
        }

        /* renamed from: q */
        public void mo24183q(n31 n31) {
            ow1.this.f16144r.mo19153q(n31);
            C0792h unused = ow1.this.f16102R = null;
            n31 unused2 = ow1.this.f16119e0 = null;
        }

        /* renamed from: r */
        public void mo24184r(n31 n31) {
            n31 unused = ow1.this.f16119e0 = n31;
            ow1.this.f16144r.mo19154r(n31);
        }

        /* renamed from: s */
        public void mo7088s(n31 n31) {
            ow1.this.f16144r.mo19155s(n31);
            C0792h unused = ow1.this.f16103S = null;
            n31 unused2 = ow1.this.f16121f0 = null;
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            ow1.this.mo24141k2(i2, i3);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (ow1.this.f16109Y) {
                ow1.this.mo24159v2(surfaceHolder.getSurface());
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (ow1.this.f16109Y) {
                ow1.this.mo24159v2((Object) null);
            }
            ow1.this.mo24141k2(0, 0);
        }

        /* renamed from: t */
        public void mo24188t(hx0 hx0) {
            hx0 unused = ow1.this.f16131k0 = hx0;
            ow1.this.f16132l.mo23194l(27, new tw1(hx0));
        }

        /* renamed from: u */
        public void mo24189u(int i, long j) {
            ow1.this.f16144r.mo19156u(i, j);
        }

        /* renamed from: v */
        public void mo24190v(Object obj, long j) {
            ow1.this.f16144r.mo19157v(obj, j);
            if (ow1.this.f16105U == obj) {
                ow1.this.f16132l.mo23194l(26, new vw1());
            }
        }

        /* renamed from: w */
        public void mo24191w(int i, boolean z) {
            ow1.this.f16132l.mo23194l(30, new sw1(i, z));
        }

        /* renamed from: x */
        public void mo21641x(Metadata metadata) {
            ow1 ow1 = ow1.this;
            C0816l unused = ow1.f16147s0 = ow1.f16147s0.mo6797b().mo6803I(metadata).mo6800F();
            C0816l S0 = ow1.this.mo24151r1();
            if (!S0.equals(ow1.this.f16100P)) {
                C0816l unused2 = ow1.this.f16100P = S0;
                ow1.this.f16132l.mo23191i(14, new qw1(this));
            }
            ow1.this.f16132l.mo23191i(28, new rw1(metadata));
            ow1.this.f16132l.mo23189f();
        }

        /* renamed from: y */
        public void mo7089y(Exception exc) {
            ow1.this.f16144r.mo19158y(exc);
        }

        /* renamed from: z */
        public /* synthetic */ void mo7090z(C0792h hVar) {
            C3507vs.m29089a(this, hVar);
        }
    }

    /* renamed from: ow1$d */
    /* compiled from: ExoPlayerImpl */
    public static final class C3000d implements k97, ba0, cr4.C2116b {

        /* renamed from: a */
        public k97 f16160a;

        /* renamed from: d */
        public ba0 f16161d;

        /* renamed from: e */
        public k97 f16162e;

        /* renamed from: g */
        public ba0 f16163g;

        public C3000d() {
        }

        /* renamed from: a */
        public void mo11460a(long j, float[] fArr) {
            ba0 ba0 = this.f16163g;
            if (ba0 != null) {
                ba0.mo11460a(j, fArr);
            }
            ba0 ba02 = this.f16161d;
            if (ba02 != null) {
                ba02.mo11460a(j, fArr);
            }
        }

        /* renamed from: b */
        public void mo11461b() {
            ba0 ba0 = this.f16163g;
            if (ba0 != null) {
                ba0.mo11461b();
            }
            ba0 ba02 = this.f16161d;
            if (ba02 != null) {
                ba02.mo11461b();
            }
        }

        /* renamed from: d */
        public void mo22236d(long j, long j2, C0792h hVar, MediaFormat mediaFormat) {
            k97 k97 = this.f16162e;
            if (k97 != null) {
                k97.mo22236d(j, j2, hVar, mediaFormat);
            }
            k97 k972 = this.f16160a;
            if (k972 != null) {
                k972.mo22236d(j, j2, hVar, mediaFormat);
            }
        }

        /* renamed from: k */
        public void mo7154k(int i, Object obj) {
            if (i == 7) {
                this.f16160a = (k97) obj;
            } else if (i == 8) {
                this.f16161d = (ba0) obj;
            } else if (i == 10000) {
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
                if (sphericalGLSurfaceView == null) {
                    this.f16162e = null;
                    this.f16163g = null;
                    return;
                }
                this.f16162e = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f16163g = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }
    }

    /* renamed from: ow1$e */
    /* compiled from: ExoPlayerImpl */
    public static final class C3001e implements ds3 {

        /* renamed from: a */
        public final Object f16164a;

        /* renamed from: b */
        public C0831s f16165b;

        public C3001e(Object obj, C0831s sVar) {
            this.f16164a = obj;
            this.f16165b = sVar;
        }

        /* renamed from: a */
        public Object mo18924a() {
            return this.f16164a;
        }

        /* renamed from: b */
        public C0831s mo18925b() {
            return this.f16165b;
        }
    }

    static {
        ir3.m19787a("media3.exoplayer");
    }

    /* JADX WARNING: type inference failed for: r40v0, types: [androidx.media3.common.o] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @android.annotation.SuppressLint({"HandlerLeak"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ow1(p000.jv1.C2635b r39, androidx.media3.common.C0821o r40) {
        /*
            r38 = this;
            r1 = r38
            r0 = r39
            r38.<init>()
            lo0 r2 = new lo0
            r2.<init>()
            r1.f16116d = r2
            java.lang.String r3 = "ExoPlayerImpl"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x033e }
            r4.<init>()     // Catch:{ all -> 0x033e }
            java.lang.String r5 = "Init "
            r4.append(r5)     // Catch:{ all -> 0x033e }
            int r5 = java.lang.System.identityHashCode(r38)     // Catch:{ all -> 0x033e }
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch:{ all -> 0x033e }
            r4.append(r5)     // Catch:{ all -> 0x033e }
            java.lang.String r5 = " ["
            r4.append(r5)     // Catch:{ all -> 0x033e }
            java.lang.String r5 = "AndroidXMedia3/1.0.0-beta02"
            r4.append(r5)     // Catch:{ all -> 0x033e }
            java.lang.String r5 = "] ["
            r4.append(r5)     // Catch:{ all -> 0x033e }
            java.lang.String r5 = p000.w67.f19025e     // Catch:{ all -> 0x033e }
            r4.append(r5)     // Catch:{ all -> 0x033e }
            java.lang.String r5 = "]"
            r4.append(r5)     // Catch:{ all -> 0x033e }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x033e }
            p000.gk3.m18129f(r3, r4)     // Catch:{ all -> 0x033e }
            android.content.Context r3 = r0.f13852a     // Catch:{ all -> 0x033e }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x033e }
            r1.f16118e = r3     // Catch:{ all -> 0x033e }
            hd2<dh0, qf> r4 = r0.f13860i     // Catch:{ all -> 0x033e }
            dh0 r5 = r0.f13853b     // Catch:{ all -> 0x033e }
            java.lang.Object r4 = r4.apply(r5)     // Catch:{ all -> 0x033e }
            qf r4 = (p000.C3142qf) r4     // Catch:{ all -> 0x033e }
            r1.f16144r = r4     // Catch:{ all -> 0x033e }
            hv4 r5 = r0.f13862k     // Catch:{ all -> 0x033e }
            r1.f16137n0 = r5     // Catch:{ all -> 0x033e }
            androidx.media3.common.b r5 = r0.f13863l     // Catch:{ all -> 0x033e }
            r1.f16125h0 = r5     // Catch:{ all -> 0x033e }
            int r5 = r0.f13868q     // Catch:{ all -> 0x033e }
            r1.f16111a0 = r5     // Catch:{ all -> 0x033e }
            int r5 = r0.f13869r     // Catch:{ all -> 0x033e }
            r1.f16113b0 = r5     // Catch:{ all -> 0x033e }
            boolean r5 = r0.f13867p     // Catch:{ all -> 0x033e }
            r1.f16129j0 = r5     // Catch:{ all -> 0x033e }
            long r5 = r0.f13876y     // Catch:{ all -> 0x033e }
            r1.f16089E = r5     // Catch:{ all -> 0x033e }
            ow1$c r15 = new ow1$c     // Catch:{ all -> 0x033e }
            r14 = 0
            r15.<init>()     // Catch:{ all -> 0x033e }
            r1.f16156x = r15     // Catch:{ all -> 0x033e }
            ow1$d r13 = new ow1$d     // Catch:{ all -> 0x033e }
            r13.<init>()     // Catch:{ all -> 0x033e }
            r1.f16157y = r13     // Catch:{ all -> 0x033e }
            android.os.Handler r6 = new android.os.Handler     // Catch:{ all -> 0x033e }
            android.os.Looper r5 = r0.f13861j     // Catch:{ all -> 0x033e }
            r6.<init>(r5)     // Catch:{ all -> 0x033e }
            rd6<qd5> r5 = r0.f13855d     // Catch:{ all -> 0x033e }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x033e }
            r7 = r5
            qd5 r7 = (p000.qd5) r7     // Catch:{ all -> 0x033e }
            r8 = r6
            r9 = r15
            r10 = r15
            r11 = r15
            r12 = r15
            md5[] r7 = r7.mo22685a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x033e }
            r1.f16122g = r7     // Catch:{ all -> 0x033e }
            int r5 = r7.length     // Catch:{ all -> 0x033e }
            r12 = 0
            if (r5 <= 0) goto L_0x00a1
            r5 = 1
            goto L_0x00a2
        L_0x00a1:
            r5 = r12
        L_0x00a2:
            p000.C2725kr.m20987g(r5)     // Catch:{ all -> 0x033e }
            rd6<ft6> r5 = r0.f13857f     // Catch:{ all -> 0x033e }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x033e }
            r10 = r5
            ft6 r10 = (p000.ft6) r10     // Catch:{ all -> 0x033e }
            r1.f16124h = r10     // Catch:{ all -> 0x033e }
            rd6<androidx.media3.exoplayer.source.i$a> r5 = r0.f13856e     // Catch:{ all -> 0x033e }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x033e }
            androidx.media3.exoplayer.source.i$a r5 = (androidx.media3.exoplayer.source.C0973i.C0974a) r5     // Catch:{ all -> 0x033e }
            r1.f16142q = r5     // Catch:{ all -> 0x033e }
            rd6<fx> r5 = r0.f13859h     // Catch:{ all -> 0x033e }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x033e }
            r9 = r5
            fx r9 = (p000.C2332fx) r9     // Catch:{ all -> 0x033e }
            r1.f16148t = r9     // Catch:{ all -> 0x033e }
            boolean r5 = r0.f13870s     // Catch:{ all -> 0x033e }
            r1.f16140p = r5     // Catch:{ all -> 0x033e }
            ys5 r5 = r0.f13871t     // Catch:{ all -> 0x033e }
            r1.f16096L = r5     // Catch:{ all -> 0x033e }
            r16 = r15
            long r14 = r0.f13872u     // Catch:{ all -> 0x033e }
            r1.f16150u = r14     // Catch:{ all -> 0x033e }
            long r14 = r0.f13873v     // Catch:{ all -> 0x033e }
            r1.f16152v = r14     // Catch:{ all -> 0x033e }
            boolean r5 = r0.f13877z     // Catch:{ all -> 0x033e }
            r1.f16098N = r5     // Catch:{ all -> 0x033e }
            android.os.Looper r15 = r0.f13861j     // Catch:{ all -> 0x033e }
            r1.f16146s = r15     // Catch:{ all -> 0x033e }
            dh0 r14 = r0.f13853b     // Catch:{ all -> 0x033e }
            r1.f16154w = r14     // Catch:{ all -> 0x033e }
            if (r40 != 0) goto L_0x00e7
            r5 = r1
            goto L_0x00e9
        L_0x00e7:
            r5 = r40
        L_0x00e9:
            r1.f16120f = r5     // Catch:{ all -> 0x033e }
            mi3 r8 = new mi3     // Catch:{ all -> 0x033e }
            wv1 r11 = new wv1     // Catch:{ all -> 0x033e }
            r11.<init>(r1)     // Catch:{ all -> 0x033e }
            r8.<init>(r15, r14, r11)     // Catch:{ all -> 0x033e }
            r1.f16132l = r8     // Catch:{ all -> 0x033e }
            java.util.concurrent.CopyOnWriteArraySet r8 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ all -> 0x033e }
            r8.<init>()     // Catch:{ all -> 0x033e }
            r1.f16134m = r8     // Catch:{ all -> 0x033e }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x033e }
            r8.<init>()     // Catch:{ all -> 0x033e }
            r1.f16138o = r8     // Catch:{ all -> 0x033e }
            x06$a r8 = new x06$a     // Catch:{ all -> 0x033e }
            r8.<init>(r12)     // Catch:{ all -> 0x033e }
            r1.f16097M = r8     // Catch:{ all -> 0x033e }
            gt6 r8 = new gt6     // Catch:{ all -> 0x033e }
            int r11 = r7.length     // Catch:{ all -> 0x033e }
            pd5[] r11 = new p000.pd5[r11]     // Catch:{ all -> 0x033e }
            int r12 = r7.length     // Catch:{ all -> 0x033e }
            dx1[] r12 = new p000.dx1[r12]     // Catch:{ all -> 0x033e }
            r20 = r6
            androidx.media3.common.w r6 = androidx.media3.common.C0842w.f4545d     // Catch:{ all -> 0x033e }
            r21 = r9
            r9 = 0
            r8.<init>(r11, r12, r6, r9)     // Catch:{ all -> 0x033e }
            r1.f16112b = r8     // Catch:{ all -> 0x033e }
            androidx.media3.common.s$b r6 = new androidx.media3.common.s$b     // Catch:{ all -> 0x033e }
            r6.<init>()     // Catch:{ all -> 0x033e }
            r1.f16136n = r6     // Catch:{ all -> 0x033e }
            androidx.media3.common.o$b$a r6 = new androidx.media3.common.o$b$a     // Catch:{ all -> 0x033e }
            r6.<init>()     // Catch:{ all -> 0x033e }
            r12 = 21
            int[] r9 = new int[r12]     // Catch:{ all -> 0x033e }
            r11 = 1
            r18 = 0
            r9[r18] = r11     // Catch:{ all -> 0x033e }
            r12 = 2
            r9[r11] = r12     // Catch:{ all -> 0x033e }
            r23 = r2
            r2 = 3
            r9[r12] = r2     // Catch:{ all -> 0x033e }
            r19 = 13
            r9[r2] = r19     // Catch:{ all -> 0x033e }
            r22 = 14
            r2 = 4
            r9[r2] = r22     // Catch:{ all -> 0x033e }
            r24 = 15
            r2 = 5
            r9[r2] = r24     // Catch:{ all -> 0x033e }
            r25 = 16
            r2 = 6
            r9[r2] = r25     // Catch:{ all -> 0x033e }
            r26 = 17
            r2 = 7
            r9[r2] = r26     // Catch:{ all -> 0x033e }
            r27 = 18
            r2 = 8
            r9[r2] = r27     // Catch:{ all -> 0x033e }
            r28 = 19
            r2 = 9
            r9[r2] = r28     // Catch:{ all -> 0x033e }
            r11 = 31
            r2 = 10
            r9[r2] = r11     // Catch:{ all -> 0x033e }
            r29 = 11
            r30 = 20
            r9[r29] = r30     // Catch:{ all -> 0x033e }
            r29 = 12
            r31 = 30
            r9[r29] = r31     // Catch:{ all -> 0x033e }
            r29 = 21
            r9[r19] = r29     // Catch:{ all -> 0x033e }
            r19 = 22
            r9[r22] = r19     // Catch:{ all -> 0x033e }
            r19 = 23
            r9[r24] = r19     // Catch:{ all -> 0x033e }
            r19 = 24
            r9[r25] = r19     // Catch:{ all -> 0x033e }
            r19 = 25
            r9[r26] = r19     // Catch:{ all -> 0x033e }
            r19 = 26
            r9[r27] = r19     // Catch:{ all -> 0x033e }
            r19 = 27
            r9[r28] = r19     // Catch:{ all -> 0x033e }
            r19 = 28
            r9[r30] = r19     // Catch:{ all -> 0x033e }
            androidx.media3.common.o$b$a r6 = r6.mo6852c(r9)     // Catch:{ all -> 0x033e }
            r9 = 29
            boolean r12 = r10.mo20183e()     // Catch:{ all -> 0x033e }
            androidx.media3.common.o$b$a r6 = r6.mo6853d(r9, r12)     // Catch:{ all -> 0x033e }
            androidx.media3.common.o$b r6 = r6.mo6854e()     // Catch:{ all -> 0x033e }
            r1.f16114c = r6     // Catch:{ all -> 0x033e }
            androidx.media3.common.o$b$a r9 = new androidx.media3.common.o$b$a     // Catch:{ all -> 0x033e }
            r9.<init>()     // Catch:{ all -> 0x033e }
            androidx.media3.common.o$b$a r6 = r9.mo6851b(r6)     // Catch:{ all -> 0x033e }
            r9 = 4
            androidx.media3.common.o$b$a r6 = r6.mo6850a(r9)     // Catch:{ all -> 0x033e }
            androidx.media3.common.o$b$a r6 = r6.mo6850a(r2)     // Catch:{ all -> 0x033e }
            androidx.media3.common.o$b r6 = r6.mo6854e()     // Catch:{ all -> 0x033e }
            r1.f16099O = r6     // Catch:{ all -> 0x033e }
            r12 = 0
            xk2 r6 = r14.mo18771c(r15, r12)     // Catch:{ all -> 0x033e }
            r1.f16126i = r6     // Catch:{ all -> 0x033e }
            xv1 r9 = new xv1     // Catch:{ all -> 0x033e }
            r9.<init>(r1)     // Catch:{ all -> 0x033e }
            r1.f16128j = r9     // Catch:{ all -> 0x033e }
            zp4 r6 = p000.zp4.m31419j(r8)     // Catch:{ all -> 0x033e }
            r1.f16149t0 = r6     // Catch:{ all -> 0x033e }
            r4.mo19149m0(r5, r15)     // Catch:{ all -> 0x033e }
            int r6 = p000.w67.f19021a     // Catch:{ all -> 0x033e }
            if (r6 >= r11) goto L_0x01e0
            br4 r5 = new br4     // Catch:{ all -> 0x033e }
            r5.<init>()     // Catch:{ all -> 0x033e }
            goto L_0x01e6
        L_0x01e0:
            boolean r5 = r0.f13850A     // Catch:{ all -> 0x033e }
            br4 r5 = p000.ow1.C2998b.m24235a(r3, r1, r5)     // Catch:{ all -> 0x033e }
        L_0x01e6:
            r22 = r5
            ax1 r11 = new ax1     // Catch:{ all -> 0x033e }
            rd6<ti3> r5 = r0.f13858g     // Catch:{ all -> 0x033e }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x033e }
            r17 = r5
            ti3 r17 = (p000.ti3) r17     // Catch:{ all -> 0x033e }
            int r5 = r1.f16090F     // Catch:{ all -> 0x033e }
            boolean r12 = r1.f16091G     // Catch:{ all -> 0x033e }
            ys5 r2 = r1.f16096L     // Catch:{ all -> 0x033e }
            r25 = r15
            qi3 r15 = r0.f13874w     // Catch:{ all -> 0x033e }
            r27 = r2
            r26 = r3
            long r2 = r0.f13875x     // Catch:{ all -> 0x033e }
            boolean r0 = r1.f16098N     // Catch:{ all -> 0x033e }
            r28 = r5
            r5 = r11
            r33 = r6
            r32 = r20
            r6 = r7
            r7 = r10
            r30 = r21
            r21 = r9
            r9 = r17
            r34 = r10
            r10 = r30
            r35 = r11
            r11 = r28
            r17 = 0
            r36 = r13
            r13 = r4
            r20 = r14
            r28 = r17
            r14 = r27
            r37 = r16
            r16 = r2
            r18 = r0
            r19 = r25
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x033e }
            r0 = r35
            r1.f16130k = r0     // Catch:{ all -> 0x033e }
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.f16127i0 = r2     // Catch:{ all -> 0x033e }
            r2 = 0
            r1.f16090F = r2     // Catch:{ all -> 0x033e }
            androidx.media3.common.l r3 = androidx.media3.common.C0816l.f4337t1     // Catch:{ all -> 0x033e }
            r1.f16100P = r3     // Catch:{ all -> 0x033e }
            r1.f16101Q = r3     // Catch:{ all -> 0x033e }
            r1.f16147s0 = r3     // Catch:{ all -> 0x033e }
            r3 = -1
            r1.f16151u0 = r3     // Catch:{ all -> 0x033e }
            r3 = r33
            r5 = 21
            if (r3 >= r5) goto L_0x0256
            int r3 = r1.mo24138J1(r2)     // Catch:{ all -> 0x033e }
            r1.f16123g0 = r3     // Catch:{ all -> 0x033e }
            goto L_0x025c
        L_0x0256:
            int r3 = p000.w67.m29300D(r26)     // Catch:{ all -> 0x033e }
            r1.f16123g0 = r3     // Catch:{ all -> 0x033e }
        L_0x025c:
            hx0 r3 = p000.hx0.f13086d     // Catch:{ all -> 0x033e }
            r1.f16131k0 = r3     // Catch:{ all -> 0x033e }
            r3 = 1
            r1.f16133l0 = r3     // Catch:{ all -> 0x033e }
            r1.mo6710v(r4)     // Catch:{ all -> 0x033e }
            android.os.Handler r5 = new android.os.Handler     // Catch:{ all -> 0x033e }
            r6 = r25
            r5.<init>(r6)     // Catch:{ all -> 0x033e }
            r6 = r30
            r6.mo20258h(r5, r4)     // Catch:{ all -> 0x033e }
            r4 = r37
            r1.mo24147p1(r4)     // Catch:{ all -> 0x033e }
            r5 = r39
            long r6 = r5.f13854c     // Catch:{ all -> 0x033e }
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0284
            r0.mo11271t(r6)     // Catch:{ all -> 0x033e }
        L_0x0284:
            os r0 = new os     // Catch:{ all -> 0x033e }
            android.content.Context r6 = r5.f13852a     // Catch:{ all -> 0x033e }
            r7 = r32
            r0.<init>(r6, r7, r4)     // Catch:{ all -> 0x033e }
            r1.f16158z = r0     // Catch:{ all -> 0x033e }
            boolean r6 = r5.f13866o     // Catch:{ all -> 0x033e }
            r0.mo24091b(r6)     // Catch:{ all -> 0x033e }
            us r0 = new us     // Catch:{ all -> 0x033e }
            android.content.Context r6 = r5.f13852a     // Catch:{ all -> 0x033e }
            r0.<init>(r6, r7, r4)     // Catch:{ all -> 0x033e }
            r1.f16085A = r0     // Catch:{ all -> 0x033e }
            boolean r6 = r5.f13864m     // Catch:{ all -> 0x033e }
            if (r6 == 0) goto L_0x02a4
            androidx.media3.common.b r14 = r1.f16125h0     // Catch:{ all -> 0x033e }
            goto L_0x02a6
        L_0x02a4:
            r14 = r28
        L_0x02a6:
            r0.mo26860m(r14)     // Catch:{ all -> 0x033e }
            va6 r0 = new va6     // Catch:{ all -> 0x033e }
            android.content.Context r6 = r5.f13852a     // Catch:{ all -> 0x033e }
            r0.<init>(r6, r7, r4)     // Catch:{ all -> 0x033e }
            r1.f16086B = r0     // Catch:{ all -> 0x033e }
            androidx.media3.common.b r4 = r1.f16125h0     // Catch:{ all -> 0x033e }
            int r4 = r4.f4146e     // Catch:{ all -> 0x033e }
            int r4 = p000.w67.m29347c0(r4)     // Catch:{ all -> 0x033e }
            r0.mo27090h(r4)     // Catch:{ all -> 0x033e }
            dg7 r4 = new dg7     // Catch:{ all -> 0x033e }
            android.content.Context r6 = r5.f13852a     // Catch:{ all -> 0x033e }
            r4.<init>(r6)     // Catch:{ all -> 0x033e }
            r1.f16087C = r4     // Catch:{ all -> 0x033e }
            int r6 = r5.f13865n     // Catch:{ all -> 0x033e }
            if (r6 == 0) goto L_0x02cc
            r12 = r3
            goto L_0x02cd
        L_0x02cc:
            r12 = r2
        L_0x02cd:
            r4.mo18766a(r12)     // Catch:{ all -> 0x033e }
            yk7 r4 = new yk7     // Catch:{ all -> 0x033e }
            android.content.Context r6 = r5.f13852a     // Catch:{ all -> 0x033e }
            r4.<init>(r6)     // Catch:{ all -> 0x033e }
            r1.f16088D = r4     // Catch:{ all -> 0x033e }
            int r5 = r5.f13865n     // Catch:{ all -> 0x033e }
            r6 = 2
            if (r5 != r6) goto L_0x02e0
            r12 = r3
            goto L_0x02e1
        L_0x02e0:
            r12 = r2
        L_0x02e1:
            r4.mo28143a(r12)     // Catch:{ all -> 0x033e }
            androidx.media3.common.f r0 = m24146u1(r0)     // Catch:{ all -> 0x033e }
            r1.f16143q0 = r0     // Catch:{ all -> 0x033e }
            androidx.media3.common.x r0 = androidx.media3.common.C0844x.f4554k     // Catch:{ all -> 0x033e }
            r1.f16145r0 = r0     // Catch:{ all -> 0x033e }
            androidx.media3.common.b r0 = r1.f16125h0     // Catch:{ all -> 0x033e }
            r5 = r34
            r5.mo20187i(r0)     // Catch:{ all -> 0x033e }
            int r0 = r1.f16123g0     // Catch:{ all -> 0x033e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x033e }
            r2 = 10
            r1.mo24148p2(r3, r2, r0)     // Catch:{ all -> 0x033e }
            int r0 = r1.f16123g0     // Catch:{ all -> 0x033e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x033e }
            r1.mo24148p2(r6, r2, r0)     // Catch:{ all -> 0x033e }
            androidx.media3.common.b r0 = r1.f16125h0     // Catch:{ all -> 0x033e }
            r2 = 3
            r1.mo24148p2(r3, r2, r0)     // Catch:{ all -> 0x033e }
            int r0 = r1.f16111a0     // Catch:{ all -> 0x033e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x033e }
            r2 = 4
            r1.mo24148p2(r6, r2, r0)     // Catch:{ all -> 0x033e }
            int r0 = r1.f16113b0     // Catch:{ all -> 0x033e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x033e }
            r2 = 5
            r1.mo24148p2(r6, r2, r0)     // Catch:{ all -> 0x033e }
            boolean r0 = r1.f16129j0     // Catch:{ all -> 0x033e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x033e }
            r2 = 9
            r1.mo24148p2(r3, r2, r0)     // Catch:{ all -> 0x033e }
            r0 = r36
            r2 = 7
            r1.mo24148p2(r6, r2, r0)     // Catch:{ all -> 0x033e }
            r2 = 8
            r3 = 6
            r1.mo24148p2(r3, r2, r0)     // Catch:{ all -> 0x033e }
            r23.mo22888e()
            return
        L_0x033e:
            r0 = move-exception
            lo0 r2 = r1.f16116d
            r2.mo22888e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ow1.<init>(jv1$b, androidx.media3.common.o):void");
    }

    /* renamed from: D1 */
    public static int m24078D1(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* renamed from: H1 */
    public static long m24083H1(zp4 zp4) {
        C0831s.C0835d dVar = new C0831s.C0835d();
        C0831s.C0833b bVar = new C0831s.C0833b();
        zp4.f20628a.mo6874l(zp4.f20629b.f15659a, bVar);
        if (zp4.f20630c == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return zp4.f20628a.mo6880r(bVar.f4438e, dVar).mo6910f();
        }
        return bVar.mo6901q() + zp4.f20630c;
    }

    /* renamed from: K1 */
    public static boolean m24087K1(zp4 zp4) {
        if (zp4.f20632e == 3 && zp4.f20639l && zp4.f20640m == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public /* synthetic */ void m24091M1(C0821o.C0826d dVar, C0789g gVar) {
        dVar.mo6730c0(this.f16120f, new C0821o.C0825c(gVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public /* synthetic */ void m24095O1(ax1.C1592e eVar) {
        this.f16126i.mo22780h(new dw1(this, eVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public /* synthetic */ void m24105T1(C0821o.C0826d dVar) {
        dVar.mo6725W(this.f16099O);
    }

    /* renamed from: V1 */
    public static /* synthetic */ void m24109V1(int i, C0821o.C0827e eVar, C0821o.C0827e eVar2, C0821o.C0826d dVar) {
        dVar.mo6726Z(i);
        dVar.mo6742o0(eVar, eVar2, i);
    }

    /* renamed from: b2 */
    public static /* synthetic */ void m24121b2(zp4 zp4, C0821o.C0826d dVar) {
        dVar.mo6716E(zp4.f20634g);
        dVar.mo6727a0(zp4.f20634g);
    }

    /* renamed from: u1 */
    public static C0788f m24146u1(va6 va6) {
        return new C0788f(0, va6.mo27088d(), va6.mo27087c());
    }

    /* renamed from: A1 */
    public final long mo24127A1(zp4 zp4) {
        if (zp4.f20628a.mo6883u()) {
            return w67.m29391y0(this.f16155w0);
        }
        if (zp4.f20629b.mo23781b()) {
            return zp4.f20645r;
        }
        return mo24142l2(zp4.f20628a, zp4.f20629b, zp4.f20645r);
    }

    /* renamed from: A2 */
    public final void mo24128A2(zp4 zp4, int i, int i2, boolean z, boolean z2, int i3, long j, int i4) {
        boolean z3;
        boolean z4;
        boolean z5;
        zp4 zp42 = zp4;
        int i5 = i3;
        zp4 zp43 = this.f16149t0;
        this.f16149t0 = zp42;
        Pair<Boolean, Integer> y1 = mo24164y1(zp4, zp43, z2, i3, !zp43.f20628a.equals(zp42.f20628a));
        boolean booleanValue = ((Boolean) y1.first).booleanValue();
        int intValue = ((Integer) y1.second).intValue();
        C0816l lVar = this.f16100P;
        C0798k kVar = null;
        if (booleanValue) {
            if (!zp42.f20628a.mo6883u()) {
                kVar = zp42.f20628a.mo6880r(zp42.f20628a.mo6874l(zp42.f20629b.f15659a, this.f16136n).f4438e, this.f4156a).f4461e;
            }
            this.f16147s0 = C0816l.f4337t1;
        }
        if (booleanValue || !zp43.f20637j.equals(zp42.f20637j)) {
            this.f16147s0 = this.f16147s0.mo6797b().mo6804J(zp42.f20637j).mo6800F();
            lVar = mo24151r1();
        }
        boolean z6 = !lVar.equals(this.f16100P);
        this.f16100P = lVar;
        if (zp43.f20639l != zp42.f20639l) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (zp43.f20632e != zp42.f20632e) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || z3) {
            mo24132C2();
        }
        boolean z7 = zp43.f20634g;
        boolean z8 = zp42.f20634g;
        if (z7 != z8) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            mo24130B2(z8);
        }
        if (!zp43.f20628a.equals(zp42.f20628a)) {
            this.f16132l.mo23191i(0, new qv1(zp42, i));
        }
        if (z2) {
            this.f16132l.mo23191i(11, new kw1(i5, mo24136G1(i5, zp43, i4), mo24135F1(j)));
        }
        if (booleanValue) {
            this.f16132l.mo23191i(1, new lw1(kVar, intValue));
        }
        if (zp43.f20633f != zp42.f20633f) {
            this.f16132l.mo23191i(10, new mw1(zp42));
            if (zp42.f20633f != null) {
                this.f16132l.mo23191i(10, new nw1(zp42));
            }
        }
        gt6 gt6 = zp43.f20636i;
        gt6 gt62 = zp42.f20636i;
        if (gt6 != gt62) {
            this.f16124h.mo20184f(gt62.f12613e);
            this.f16132l.mo23191i(2, new rv1(zp42));
        }
        if (z6) {
            this.f16132l.mo23191i(14, new sv1(this.f16100P));
        }
        if (z5) {
            this.f16132l.mo23191i(3, new tv1(zp42));
        }
        if (z4 || z3) {
            this.f16132l.mo23191i(-1, new uv1(zp42));
        }
        if (z4) {
            this.f16132l.mo23191i(4, new vv1(zp42));
        }
        if (z3) {
            this.f16132l.mo23191i(5, new bw1(zp42, i2));
        }
        if (zp43.f20640m != zp42.f20640m) {
            this.f16132l.mo23191i(6, new gw1(zp42));
        }
        if (m24087K1(zp43) != m24087K1(zp4)) {
            this.f16132l.mo23191i(7, new hw1(zp42));
        }
        if (!zp43.f20641n.equals(zp42.f20641n)) {
            this.f16132l.mo23191i(12, new iw1(zp42));
        }
        if (z) {
            this.f16132l.mo23191i(-1, new jw1());
        }
        mo24165y2();
        this.f16132l.mo23189f();
        if (zp43.f20642o != zp42.f20642o) {
            Iterator<jv1.C2634a> it = this.f16134m.iterator();
            while (it.hasNext()) {
                it.next().mo22088E(zp42.f20642o);
            }
        }
    }

    /* renamed from: B */
    public void mo6676B(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        mo24133D2();
        if (textureView == null) {
            mo24153s1();
            return;
        }
        mo24146o2();
        this.f16110Z = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            gk3.m18132i("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f16156x);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            mo24159v2((Object) null);
            mo24141k2(0, 0);
            return;
        }
        mo24157u2(surfaceTexture);
        mo24141k2(textureView.getWidth(), textureView.getHeight());
    }

    /* renamed from: B1 */
    public final int mo24129B1() {
        if (this.f16149t0.f20628a.mo6883u()) {
            return this.f16151u0;
        }
        zp4 zp4 = this.f16149t0;
        return zp4.f20628a.mo6874l(zp4.f20629b.f15659a, this.f16136n).f4438e;
    }

    /* renamed from: B2 */
    public final void mo24130B2(boolean z) {
        hv4 hv4 = this.f16137n0;
        if (hv4 == null) {
            return;
        }
        if (z && !this.f16139o0) {
            hv4.mo21406a(0);
            this.f16139o0 = true;
        } else if (!z && this.f16139o0) {
            hv4.mo21407b(0);
            this.f16139o0 = false;
        }
    }

    /* renamed from: C */
    public void mo6677C(int i, long j) {
        int i2 = i;
        long j2 = j;
        mo24133D2();
        this.f16144r.mo19134G();
        C0831s sVar = this.f16149t0.f20628a;
        if (i2 < 0 || (!sVar.mo6883u() && i2 >= sVar.mo6882t())) {
            throw new IllegalSeekPositionException(sVar, i, j2);
        }
        int i3 = 1;
        this.f16092H++;
        if (mo6701g()) {
            gk3.m18132i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            ax1.C1592e eVar = new ax1.C1592e(this.f16149t0);
            eVar.mo11285b(1);
            this.f16128j.mo11289a(eVar);
            return;
        }
        if (mo6686P() != 1) {
            i3 = 2;
        }
        int R = mo6687R();
        zp4 i22 = mo24139i2(this.f16149t0.mo28553g(i3), sVar, mo24140j2(sVar, i, j2));
        this.f16130k.mo11279z0(sVar, i, w67.m29391y0(j));
        mo24128A2(i22, 0, 1, true, true, 1, mo24127A1(i22), R);
    }

    /* renamed from: C1 */
    public final Pair<Object, Long> mo24131C1(C0831s sVar, C0831s sVar2) {
        boolean z;
        long N = mo6685N();
        int i = -1;
        if (sVar.mo6883u() || sVar2.mo6883u()) {
            if (sVar.mo6883u() || !sVar2.mo6883u()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                i = mo24129B1();
            }
            if (z) {
                N = -9223372036854775807L;
            }
            return mo24140j2(sVar2, i, N);
        }
        Pair<Object, Long> n = sVar.mo6876n(this.f4156a, this.f16136n, mo6687R(), w67.m29391y0(N));
        Object obj = ((Pair) w67.m29360j(n)).first;
        if (sVar2.mo6867f(obj) != -1) {
            return n;
        }
        Object x0 = ax1.m10864x0(this.f4156a, this.f16136n, this.f16090F, this.f16091G, obj, sVar, sVar2);
        if (x0 == null) {
            return mo24140j2(sVar2, -1, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
        }
        sVar2.mo6874l(x0, this.f16136n);
        int i2 = this.f16136n.f4438e;
        return mo24140j2(sVar2, i2, sVar2.mo6880r(i2, this.f4156a).mo6908e());
    }

    /* renamed from: C2 */
    public final void mo24132C2() {
        int P = mo6686P();
        boolean z = true;
        if (P != 1) {
            if (P == 2 || P == 3) {
                boolean z1 = mo24166z1();
                dg7 dg7 = this.f16087C;
                if (!mo6678E() || z1) {
                    z = false;
                }
                dg7.mo18767b(z);
                this.f16088D.mo28144b(mo6678E());
                return;
            } else if (P != 4) {
                throw new IllegalStateException();
            }
        }
        this.f16087C.mo18767b(false);
        this.f16088D.mo28144b(false);
    }

    /* renamed from: D */
    public C0821o.C0823b mo6842D() {
        mo24133D2();
        return this.f16099O;
    }

    /* renamed from: D2 */
    public final void mo24133D2() {
        IllegalStateException illegalStateException;
        this.f16116d.mo22885b();
        if (Thread.currentThread() != mo6713y().getThread()) {
            String A = w67.m29294A("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), mo6713y().getThread().getName());
            if (!this.f16133l0) {
                if (this.f16135m0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                gk3.m18133j("ExoPlayerImpl", A, illegalStateException);
                this.f16135m0 = true;
                return;
            }
            throw new IllegalStateException(A);
        }
    }

    /* renamed from: E */
    public boolean mo6678E() {
        mo24133D2();
        return this.f16149t0.f20639l;
    }

    /* renamed from: E1 */
    public ExoPlaybackException mo6705l() {
        mo24133D2();
        return this.f16149t0.f20633f;
    }

    /* renamed from: F */
    public void mo6679F(boolean z) {
        mo24133D2();
        if (this.f16091G != z) {
            this.f16091G = z;
            this.f16130k.mo11215V0(z);
            this.f16132l.mo23191i(9, new ew1(z));
            mo24165y2();
            this.f16132l.mo23189f();
        }
    }

    /* renamed from: F1 */
    public final C0821o.C0827e mo24135F1(long j) {
        int i;
        Object obj;
        C0798k kVar;
        long j2;
        int R = mo6687R();
        Object obj2 = null;
        if (!this.f16149t0.f20628a.mo6883u()) {
            zp4 zp4 = this.f16149t0;
            Object obj3 = zp4.f20629b.f15659a;
            zp4.f20628a.mo6874l(obj3, this.f16136n);
            int f = this.f16149t0.f20628a.mo6867f(obj3);
            i = f;
            obj = obj3;
            obj2 = this.f16149t0.f20628a.mo6880r(R, this.f4156a).f4459a;
            kVar = this.f4156a.f4461e;
        } else {
            i = -1;
            kVar = null;
            obj = null;
        }
        long U0 = w67.m29335U0(j);
        if (this.f16149t0.f20629b.mo23781b()) {
            j2 = w67.m29335U0(m24083H1(this.f16149t0));
        } else {
            j2 = U0;
        }
        C0973i.C0975b bVar = this.f16149t0.f20629b;
        return new C0821o.C0827e(obj2, R, kVar, obj, i, U0, j2, bVar.f15660b, bVar.f15661c);
    }

    /* renamed from: G */
    public long mo6843G() {
        mo24133D2();
        return 3000;
    }

    /* renamed from: G1 */
    public final C0821o.C0827e mo24136G1(int i, zp4 zp4, int i2) {
        int i3;
        Object obj;
        C0798k kVar;
        int i4;
        Object obj2;
        long j;
        long j2;
        zp4 zp42 = zp4;
        C0831s.C0833b bVar = new C0831s.C0833b();
        if (!zp42.f20628a.mo6883u()) {
            Object obj3 = zp42.f20629b.f15659a;
            zp42.f20628a.mo6874l(obj3, bVar);
            int i5 = bVar.f4438e;
            i4 = i5;
            obj = obj3;
            i3 = zp42.f20628a.mo6867f(obj3);
            obj2 = zp42.f20628a.mo6880r(i5, this.f4156a).f4459a;
            kVar = this.f4156a.f4461e;
        } else {
            i4 = i2;
            i3 = -1;
            obj2 = null;
            kVar = null;
            obj = null;
        }
        if (i == 0) {
            if (zp42.f20629b.mo23781b()) {
                C0973i.C0975b bVar2 = zp42.f20629b;
                j2 = bVar.mo6887e(bVar2.f15660b, bVar2.f15661c);
                j = m24083H1(zp4);
                long U0 = w67.m29335U0(j2);
                long U02 = w67.m29335U0(j);
                C0973i.C0975b bVar3 = zp42.f20629b;
                return new C0821o.C0827e(obj2, i4, kVar, obj, i3, U0, U02, bVar3.f15660b, bVar3.f15661c);
            } else if (zp42.f20629b.f15663e != -1) {
                j2 = m24083H1(this.f16149t0);
            } else {
                j2 = bVar.f4440k + bVar.f4439g;
            }
        } else if (zp42.f20629b.mo23781b()) {
            j2 = zp42.f20645r;
            j = m24083H1(zp4);
            long U03 = w67.m29335U0(j2);
            long U022 = w67.m29335U0(j);
            C0973i.C0975b bVar32 = zp42.f20629b;
            return new C0821o.C0827e(obj2, i4, kVar, obj, i3, U03, U022, bVar32.f15660b, bVar32.f15661c);
        } else {
            j2 = bVar.f4440k + zp42.f20645r;
        }
        j = j2;
        long U032 = w67.m29335U0(j2);
        long U0222 = w67.m29335U0(j);
        C0973i.C0975b bVar322 = zp42.f20629b;
        return new C0821o.C0827e(obj2, i4, kVar, obj, i3, U032, U0222, bVar322.f15660b, bVar322.f15661c);
    }

    /* renamed from: H */
    public int mo6680H() {
        mo24133D2();
        if (this.f16149t0.f20628a.mo6883u()) {
            return this.f16153v0;
        }
        zp4 zp4 = this.f16149t0;
        return zp4.f20628a.mo6867f(zp4.f20629b.f15659a);
    }

    /* renamed from: I */
    public void mo6681I(TextureView textureView) {
        mo24133D2();
        if (textureView != null && textureView == this.f16110Z) {
            mo24153s1();
        }
    }

    /* renamed from: I1 */
    public final void m24093N1(ax1.C1592e eVar) {
        long j;
        boolean z;
        long j2;
        boolean z2;
        int i = this.f16092H - eVar.f7851c;
        this.f16092H = i;
        boolean z3 = true;
        if (eVar.f7852d) {
            this.f16093I = eVar.f7853e;
            this.f16094J = true;
        }
        if (eVar.f7854f) {
            this.f16095K = eVar.f7855g;
        }
        if (i == 0) {
            C0831s sVar = eVar.f7850b.f20628a;
            if (!this.f16149t0.f20628a.mo6883u() && sVar.mo6883u()) {
                this.f16151u0 = -1;
                this.f16155w0 = 0;
                this.f16153v0 = 0;
            }
            if (!sVar.mo6883u()) {
                List<C0831s> K = ((dr4) sVar).mo18907K();
                if (K.size() == this.f16138o.size()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C2725kr.m20987g(z2);
                for (int i2 = 0; i2 < K.size(); i2++) {
                    C0831s unused = this.f16138o.get(i2).f16165b = K.get(i2);
                }
            }
            if (this.f16094J) {
                if (eVar.f7850b.f20629b.equals(this.f16149t0.f20629b) && eVar.f7850b.f20631d == this.f16149t0.f20645r) {
                    z3 = false;
                }
                if (z3) {
                    if (sVar.mo6883u() || eVar.f7850b.f20629b.mo23781b()) {
                        j2 = eVar.f7850b.f20631d;
                    } else {
                        zp4 zp4 = eVar.f7850b;
                        j2 = mo24142l2(sVar, zp4.f20629b, zp4.f20631d);
                    }
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                }
                z = z3;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.f16094J = false;
            mo24128A2(eVar.f7850b, 1, this.f16095K, false, z, this.f16093I, j, -1);
        }
    }

    /* renamed from: J */
    public C0844x mo6682J() {
        mo24133D2();
        return this.f16145r0;
    }

    /* renamed from: J1 */
    public final int mo24138J1(int i) {
        AudioTrack audioTrack = this.f16104T;
        if (!(audioTrack == null || audioTrack.getAudioSessionId() == i)) {
            this.f16104T.release();
            this.f16104T = null;
        }
        if (this.f16104T == null) {
            this.f16104T = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.f16104T.getAudioSessionId();
    }

    /* renamed from: L */
    public int mo6683L() {
        mo24133D2();
        if (mo6701g()) {
            return this.f16149t0.f20629b.f15661c;
        }
        return -1;
    }

    /* renamed from: M */
    public long mo6684M() {
        mo24133D2();
        return this.f16152v;
    }

    /* renamed from: N */
    public long mo6685N() {
        mo24133D2();
        if (!mo6701g()) {
            return mo6696b0();
        }
        zp4 zp4 = this.f16149t0;
        zp4.f20628a.mo6874l(zp4.f20629b.f15659a, this.f16136n);
        zp4 zp42 = this.f16149t0;
        if (zp42.f20630c == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return zp42.f20628a.mo6880r(mo6687R(), this.f4156a).mo6908e();
        }
        return this.f16136n.mo6900p() + w67.m29335U0(this.f16149t0.f20630c);
    }

    /* renamed from: P */
    public int mo6686P() {
        mo24133D2();
        return this.f16149t0.f20632e;
    }

    /* renamed from: R */
    public int mo6687R() {
        mo24133D2();
        int B1 = mo24129B1();
        if (B1 == -1) {
            return 0;
        }
        return B1;
    }

    /* renamed from: S */
    public void mo6688S(int i) {
        mo24133D2();
        if (this.f16090F != i) {
            this.f16090F = i;
            this.f16130k.mo11210S0(i);
            this.f16132l.mo23191i(8, new yv1(i));
            mo24165y2();
            this.f16132l.mo23189f();
        }
    }

    /* renamed from: T */
    public void mo6689T(C0840v vVar) {
        mo24133D2();
        if (this.f16124h.mo20183e() && !vVar.equals(this.f16124h.mo20180b())) {
            this.f16124h.mo20188j(vVar);
            this.f16132l.mo23194l(19, new fw1(vVar));
        }
    }

    /* renamed from: U */
    public void mo6690U(SurfaceView surfaceView) {
        SurfaceHolder surfaceHolder;
        mo24133D2();
        if (surfaceView == null) {
            surfaceHolder = null;
        } else {
            surfaceHolder = surfaceView.getHolder();
        }
        mo24155t1(surfaceHolder);
    }

    /* renamed from: V */
    public int mo6691V() {
        mo24133D2();
        return this.f16090F;
    }

    /* renamed from: W */
    public boolean mo6692W() {
        mo24133D2();
        return this.f16091G;
    }

    /* renamed from: X */
    public long mo6693X() {
        mo24133D2();
        if (this.f16149t0.f20628a.mo6883u()) {
            return this.f16155w0;
        }
        zp4 zp4 = this.f16149t0;
        if (zp4.f20638k.f15662d != zp4.f20629b.f15662d) {
            return zp4.f20628a.mo6880r(mo6687R(), this.f4156a).mo6911g();
        }
        long j = zp4.f20643p;
        if (this.f16149t0.f20638k.mo23781b()) {
            zp4 zp42 = this.f16149t0;
            C0831s.C0833b l = zp42.f20628a.mo6874l(zp42.f20638k.f15659a, this.f16136n);
            long i = l.mo6893i(this.f16149t0.f20638k.f15660b);
            if (i == Long.MIN_VALUE) {
                j = l.f4439g;
            } else {
                j = i;
            }
        }
        zp4 zp43 = this.f16149t0;
        return w67.m29335U0(mo24142l2(zp43.f20628a, zp43.f20638k, j));
    }

    /* renamed from: a */
    public void mo6844a() {
        AudioTrack audioTrack;
        gk3.m18129f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + "AndroidXMedia3/1.0.0-beta02" + "] [" + w67.f19025e + "] [" + ir3.m19788b() + "]");
        mo24133D2();
        if (w67.f19021a < 21 && (audioTrack = this.f16104T) != null) {
            audioTrack.release();
            this.f16104T = null;
        }
        this.f16158z.mo24091b(false);
        this.f16086B.mo27089g();
        this.f16087C.mo18767b(false);
        this.f16088D.mo28144b(false);
        this.f16085A.mo26856i();
        if (!this.f16130k.mo11247j0()) {
            this.f16132l.mo23194l(10, new zv1());
        }
        this.f16132l.mo23192j();
        this.f16126i.mo22777e((Object) null);
        this.f16148t.mo20259i(this.f16144r);
        zp4 g = this.f16149t0.mo28553g(1);
        this.f16149t0 = g;
        zp4 b = g.mo28548b(g.f20629b);
        this.f16149t0 = b;
        b.f20643p = b.f20645r;
        this.f16149t0.f20644q = 0;
        this.f16144r.mo19140a();
        this.f16124h.mo20185g();
        mo24146o2();
        Surface surface = this.f16106V;
        if (surface != null) {
            surface.release();
            this.f16106V = null;
        }
        if (this.f16139o0) {
            ((hv4) C2725kr.m20985e(this.f16137n0)).mo21407b(0);
            this.f16139o0 = false;
        }
        this.f16131k0 = hx0.f13086d;
        this.f16141p0 = true;
    }

    /* renamed from: a0 */
    public C0816l mo6694a0() {
        mo24133D2();
        return this.f16100P;
    }

    /* renamed from: b */
    public void mo6695b(C0820n nVar) {
        mo24133D2();
        if (nVar == null) {
            nVar = C0820n.f4404g;
        }
        if (!this.f16149t0.f20641n.equals(nVar)) {
            zp4 f = this.f16149t0.mo28552f(nVar);
            this.f16092H++;
            this.f16130k.mo11208Q0(nVar);
            mo24128A2(f, 0, 1, false, false, 5, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, -1);
        }
    }

    /* renamed from: b0 */
    public long mo6696b0() {
        mo24133D2();
        return w67.m29335U0(mo24127A1(this.f16149t0));
    }

    /* renamed from: c0 */
    public long mo6697c0() {
        mo24133D2();
        return this.f16150u;
    }

    /* renamed from: d */
    public C0820n mo6698d() {
        mo24133D2();
        return this.f16149t0.f20641n;
    }

    /* renamed from: e */
    public void mo6699e() {
        mo24133D2();
        boolean E = mo6678E();
        int i = 2;
        int p = this.f16085A.mo26863p(E, 2);
        mo24167z2(E, p, m24078D1(E, p));
        zp4 zp4 = this.f16149t0;
        if (zp4.f20632e == 1) {
            zp4 e = zp4.mo28551e((ExoPlaybackException) null);
            if (e.f20628a.mo6883u()) {
                i = 4;
            }
            zp4 g = e.mo28553g(i);
            this.f16092H++;
            this.f16130k.mo11241h0();
            mo24128A2(g, 1, 1, false, false, 5, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, -1);
        }
    }

    /* renamed from: g */
    public boolean mo6701g() {
        mo24133D2();
        return this.f16149t0.f20629b.mo23781b();
    }

    public long getDuration() {
        mo24133D2();
        if (!mo6701g()) {
            return mo6603e0();
        }
        zp4 zp4 = this.f16149t0;
        C0973i.C0975b bVar = zp4.f20629b;
        zp4.f20628a.mo6874l(bVar.f15659a, this.f16136n);
        return w67.m29335U0(this.f16136n.mo6887e(bVar.f15660b, bVar.f15661c));
    }

    /* renamed from: h */
    public long mo6703h() {
        mo24133D2();
        return w67.m29335U0(this.f16149t0.f20644q);
    }

    /* renamed from: i */
    public void mo6845i(List<C0798k> list, boolean z) {
        mo24133D2();
        mo24152r2(mo24160w1(list), z);
    }

    /* renamed from: i2 */
    public final zp4 mo24139i2(zp4 zp4, C0831s sVar, Pair<Object, Long> pair) {
        boolean z;
        C0973i.C0975b bVar;
        ws6 ws6;
        gt6 gt6;
        List list;
        int i;
        long j;
        C0831s sVar2 = sVar;
        Pair<Object, Long> pair2 = pair;
        if (sVar.mo6883u() || pair2 != null) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        C0831s sVar3 = zp4.f20628a;
        zp4 i2 = zp4.mo28555i(sVar);
        if (sVar.mo6883u()) {
            C0973i.C0975b k = zp4.m31420k();
            long y0 = w67.m29391y0(this.f16155w0);
            zp4 b = i2.mo28549c(k, y0, y0, y0, 0, ws6.f19232g, this.f16112b, ImmutableList.m36627of()).mo28548b(k);
            b.f20643p = b.f20645r;
            return b;
        }
        Object obj = i2.f20629b.f15659a;
        boolean z2 = !obj.equals(((Pair) w67.m29360j(pair)).first);
        if (z2) {
            bVar = new C0973i.C0975b(pair2.first);
        } else {
            bVar = i2.f20629b;
        }
        C0973i.C0975b bVar2 = bVar;
        long longValue = ((Long) pair2.second).longValue();
        long y02 = w67.m29391y0(mo6685N());
        if (!sVar3.mo6883u()) {
            y02 -= sVar3.mo6874l(obj, this.f16136n).mo6901q();
        }
        if (z2 || longValue < y02) {
            C0973i.C0975b bVar3 = bVar2;
            C2725kr.m20987g(!bVar3.mo23781b());
            if (z2) {
                ws6 = ws6.f19232g;
            } else {
                ws6 = i2.f20635h;
            }
            ws6 ws62 = ws6;
            C0973i.C0975b bVar4 = bVar3;
            if (z2) {
                gt6 = this.f16112b;
            } else {
                gt6 = i2.f20636i;
            }
            gt6 gt62 = gt6;
            if (z2) {
                list = ImmutableList.m36627of();
            } else {
                list = i2.f20637j;
            }
            zp4 b2 = i2.mo28549c(bVar4, longValue, longValue, longValue, 0, ws62, gt62, list).mo28548b(bVar4);
            b2.f20643p = longValue;
            return b2;
        }
        if (i == 0) {
            int f = sVar2.mo6867f(i2.f20638k.f15659a);
            if (f == -1 || sVar2.mo6872j(f, this.f16136n).f4438e != sVar2.mo6874l(bVar2.f15659a, this.f16136n).f4438e) {
                sVar2.mo6874l(bVar2.f15659a, this.f16136n);
                if (bVar2.mo23781b()) {
                    j = this.f16136n.mo6887e(bVar2.f15660b, bVar2.f15661c);
                } else {
                    j = this.f16136n.f4439g;
                }
                i2 = i2.mo28549c(bVar2, i2.f20645r, i2.f20645r, i2.f20631d, j - i2.f20645r, i2.f20635h, i2.f20636i, i2.f20637j).mo28548b(bVar2);
                i2.f20643p = j;
            }
        } else {
            C0973i.C0975b bVar5 = bVar2;
            C2725kr.m20987g(!bVar5.mo23781b());
            long max = Math.max(0, i2.f20644q - (longValue - y02));
            long j2 = i2.f20643p;
            if (i2.f20638k.equals(i2.f20629b)) {
                j2 = longValue + max;
            }
            i2 = i2.mo28549c(bVar5, longValue, longValue, longValue, max, i2.f20635h, i2.f20636i, i2.f20637j);
            i2.f20643p = j2;
        }
        return i2;
    }

    /* renamed from: j */
    public void mo6704j(SurfaceView surfaceView) {
        SurfaceHolder surfaceHolder;
        mo24133D2();
        if (surfaceView instanceof j97) {
            mo24146o2();
            mo24159v2(surfaceView);
            mo24156t2(surfaceView.getHolder());
        } else if (surfaceView instanceof SphericalGLSurfaceView) {
            mo24146o2();
            this.f16108X = (SphericalGLSurfaceView) surfaceView;
            mo24162x1(this.f16157y).mo18277n(10000).mo18276m(this.f16108X).mo18275l();
            this.f16108X.mo7847d(this.f16156x);
            mo24159v2(this.f16108X.getVideoSurface());
            mo24156t2(surfaceView.getHolder());
        } else {
            if (surfaceView == null) {
                surfaceHolder = null;
            } else {
                surfaceHolder = surfaceView.getHolder();
            }
            mo24161w2(surfaceHolder);
        }
    }

    /* renamed from: j2 */
    public final Pair<Object, Long> mo24140j2(C0831s sVar, int i, long j) {
        if (sVar.mo6883u()) {
            this.f16151u0 = i;
            if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                j = 0;
            }
            this.f16155w0 = j;
            this.f16153v0 = 0;
            return null;
        }
        if (i == -1 || i >= sVar.mo6882t()) {
            i = sVar.mo6865e(this.f16091G);
            j = sVar.mo6880r(i, this.f4156a).mo6908e();
        }
        return sVar.mo6876n(this.f4156a, this.f16136n, i, w67.m29391y0(j));
    }

    /* renamed from: k2 */
    public final void mo24141k2(int i, int i2) {
        if (i != this.f16115c0 || i2 != this.f16117d0) {
            this.f16115c0 = i;
            this.f16117d0 = i2;
            this.f16132l.mo23194l(24, new aw1(i, i2));
        }
    }

    /* renamed from: l2 */
    public final long mo24142l2(C0831s sVar, C0973i.C0975b bVar, long j) {
        sVar.mo6874l(bVar.f15659a, this.f16136n);
        return j + this.f16136n.mo6901q();
    }

    /* renamed from: m */
    public void mo6846m(boolean z) {
        mo24133D2();
        int p = this.f16085A.mo26863p(z, mo6686P());
        mo24167z2(z, p, m24078D1(z, p));
    }

    /* renamed from: m2 */
    public final zp4 mo24143m2(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i < 0 || i2 < i || i2 > this.f16138o.size()) {
            z = false;
        } else {
            z = true;
        }
        C2725kr.m20981a(z);
        int R = mo6687R();
        C0831s x = mo6712x();
        int size = this.f16138o.size();
        this.f16092H++;
        mo24144n2(i, i2);
        C0831s v1 = mo24158v1();
        zp4 i22 = mo24139i2(this.f16149t0, v1, mo24131C1(x, v1));
        int i3 = i22.f20632e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && R >= i22.f20628a.mo6882t()) {
            z2 = true;
        }
        if (z2) {
            i22 = i22.mo28553g(4);
        }
        this.f16130k.mo11256m0(i, i2, this.f16097M);
        return i22;
    }

    /* renamed from: n2 */
    public final void mo24144n2(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.f16138o.remove(i3);
        }
        this.f16097M = this.f16097M.mo27640a(i, i2);
    }

    /* renamed from: o */
    public C0842w mo6706o() {
        mo24133D2();
        return this.f16149t0.f20636i.f12612d;
    }

    /* renamed from: o1 */
    public void mo24145o1(C0020ag agVar) {
        C2725kr.m20985e(agVar);
        this.f16144r.mo19145f0(agVar);
    }

    /* renamed from: o2 */
    public final void mo24146o2() {
        if (this.f16108X != null) {
            mo24162x1(this.f16157y).mo18277n(10000).mo18276m((Object) null).mo18275l();
            this.f16108X.mo7852i(this.f16156x);
            this.f16108X = null;
        }
        TextureView textureView = this.f16110Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f16156x) {
                gk3.m18132i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f16110Z.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.f16110Z = null;
        }
        SurfaceHolder surfaceHolder = this.f16107W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f16156x);
            this.f16107W = null;
        }
    }

    /* renamed from: p1 */
    public void mo24147p1(jv1.C2634a aVar) {
        this.f16134m.add(aVar);
    }

    /* renamed from: p2 */
    public final void mo24148p2(int i, int i2, Object obj) {
        for (md5 md5 : this.f16122g) {
            if (md5.mo21684f() == i) {
                mo24162x1(md5).mo18277n(i2).mo18276m(obj).mo18275l();
            }
        }
    }

    /* renamed from: q */
    public hx0 mo6707q() {
        mo24133D2();
        return this.f16131k0;
    }

    /* renamed from: q1 */
    public final List<fs3.C2325c> mo24149q1(int i, List<C0973i> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            fs3.C2325c cVar = new fs3.C2325c(list.get(i2), this.f16140p);
            arrayList.add(cVar);
            this.f16138o.add(i2 + i, new C3001e(cVar.f12042b, cVar.f12041a.mo7634M()));
        }
        this.f16097M = this.f16097M.mo27646g(i, arrayList.size());
        return arrayList;
    }

    /* renamed from: q2 */
    public final void mo24150q2() {
        mo24148p2(1, 2, Float.valueOf(this.f16127i0 * this.f16085A.mo26854g()));
    }

    /* renamed from: r */
    public void mo6708r(C0821o.C0826d dVar) {
        C2725kr.m20985e(dVar);
        this.f16132l.mo23193k(dVar);
    }

    /* renamed from: r1 */
    public final C0816l mo24151r1() {
        C0831s x = mo6712x();
        if (x.mo6883u()) {
            return this.f16147s0;
        }
        return this.f16147s0.mo6797b().mo6802H(x.mo6880r(mo6687R(), this.f4156a).f4461e.f4247k).mo6800F();
    }

    /* renamed from: r2 */
    public void mo24152r2(List<C0973i> list, boolean z) {
        mo24133D2();
        mo24154s2(list, -1, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, z);
    }

    /* renamed from: s */
    public int mo6709s() {
        mo24133D2();
        if (mo6701g()) {
            return this.f16149t0.f20629b.f15660b;
        }
        return -1;
    }

    /* renamed from: s1 */
    public void mo24153s1() {
        mo24133D2();
        mo24146o2();
        mo24159v2((Object) null);
        mo24141k2(0, 0);
    }

    /* renamed from: s2 */
    public final void mo24154s2(List<C0973i> list, int i, long j, boolean z) {
        int i2;
        long j2;
        int i3 = i;
        int B1 = mo24129B1();
        long b0 = mo6696b0();
        boolean z2 = true;
        this.f16092H++;
        if (!this.f16138o.isEmpty()) {
            mo24144n2(0, this.f16138o.size());
        }
        List<fs3.C2325c> q1 = mo24149q1(0, list);
        C0831s v1 = mo24158v1();
        if (v1.mo6883u() || i3 < v1.mo6882t()) {
            long j3 = j;
            if (z) {
                int e = v1.mo6865e(this.f16091G);
                j2 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                i2 = e;
            } else if (i3 == -1) {
                i2 = B1;
                j2 = b0;
            } else {
                i2 = i3;
                j2 = j3;
            }
            zp4 i22 = mo24139i2(this.f16149t0, v1, mo24140j2(v1, i2, j2));
            int i4 = i22.f20632e;
            if (!(i2 == -1 || i4 == 1)) {
                i4 = (v1.mo6883u() || i2 >= v1.mo6882t()) ? 4 : 2;
            }
            zp4 g = i22.mo28553g(i4);
            this.f16130k.mo11200L0(q1, i2, w67.m29391y0(j2), this.f16097M);
            if (this.f16149t0.f20629b.f15659a.equals(g.f20629b.f15659a) || this.f16149t0.f20628a.mo6883u()) {
                z2 = false;
            }
            mo24128A2(g, 0, 1, false, z2, 4, mo24127A1(g), -1);
            return;
        }
        throw new IllegalSeekPositionException(v1, i3, j);
    }

    /* renamed from: t1 */
    public void mo24155t1(SurfaceHolder surfaceHolder) {
        mo24133D2();
        if (surfaceHolder != null && surfaceHolder == this.f16107W) {
            mo24153s1();
        }
    }

    /* renamed from: t2 */
    public final void mo24156t2(SurfaceHolder surfaceHolder) {
        this.f16109Y = false;
        this.f16107W = surfaceHolder;
        surfaceHolder.addCallback(this.f16156x);
        Surface surface = this.f16107W.getSurface();
        if (surface == null || !surface.isValid()) {
            mo24141k2(0, 0);
            return;
        }
        Rect surfaceFrame = this.f16107W.getSurfaceFrame();
        mo24141k2(surfaceFrame.width(), surfaceFrame.height());
    }

    /* renamed from: u2 */
    public final void mo24157u2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        mo24159v2(surface);
        this.f16106V = surface;
    }

    /* renamed from: v */
    public void mo6710v(C0821o.C0826d dVar) {
        C2725kr.m20985e(dVar);
        this.f16132l.mo23186c(dVar);
    }

    /* renamed from: v1 */
    public final C0831s mo24158v1() {
        return new dr4(this.f16138o, this.f16097M);
    }

    /* renamed from: v2 */
    public final void mo24159v2(Object obj) {
        boolean z;
        ArrayList<cr4> arrayList = new ArrayList<>();
        md5[] md5Arr = this.f16122g;
        int length = md5Arr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                break;
            }
            md5 md5 = md5Arr[i];
            if (md5.mo21684f() == 2) {
                arrayList.add(mo24162x1(md5).mo18277n(1).mo18276m(obj).mo18275l());
            }
            i++;
        }
        Object obj2 = this.f16105U;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                for (cr4 a : arrayList) {
                    a.mo18264a(this.f16089E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.f16105U;
            Surface surface = this.f16106V;
            if (obj3 == surface) {
                surface.release();
                this.f16106V = null;
            }
        }
        this.f16105U = obj;
        if (z) {
            mo24163x2(false, ExoPlaybackException.createForUnexpected(new ExoTimeoutException(3), PlaybackException.ERROR_CODE_TIMEOUT));
        }
    }

    /* renamed from: w */
    public int mo6711w() {
        mo24133D2();
        return this.f16149t0.f20640m;
    }

    /* renamed from: w1 */
    public final List<C0973i> mo24160w1(List<C0798k> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.f16142q.mo7206a(list.get(i)));
        }
        return arrayList;
    }

    /* renamed from: w2 */
    public void mo24161w2(SurfaceHolder surfaceHolder) {
        mo24133D2();
        if (surfaceHolder == null) {
            mo24153s1();
            return;
        }
        mo24146o2();
        this.f16109Y = true;
        this.f16107W = surfaceHolder;
        surfaceHolder.addCallback(this.f16156x);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            mo24159v2((Object) null);
            mo24141k2(0, 0);
            return;
        }
        mo24159v2(surface);
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        mo24141k2(surfaceFrame.width(), surfaceFrame.height());
    }

    /* renamed from: x */
    public C0831s mo6712x() {
        mo24133D2();
        return this.f16149t0.f20628a;
    }

    /* renamed from: x1 */
    public final cr4 mo24162x1(cr4.C2116b bVar) {
        int B1 = mo24129B1();
        ax1 ax1 = this.f16130k;
        C0831s sVar = this.f16149t0.f20628a;
        if (B1 == -1) {
            B1 = 0;
        }
        return new cr4(ax1, bVar, sVar, B1, this.f16154w, ax1.mo11177A());
    }

    /* renamed from: x2 */
    public final void mo24163x2(boolean z, ExoPlaybackException exoPlaybackException) {
        zp4 zp4;
        boolean z2;
        if (z) {
            zp4 = mo24143m2(0, this.f16138o.size()).mo28551e((ExoPlaybackException) null);
        } else {
            zp4 zp42 = this.f16149t0;
            zp4 = zp42.mo28548b(zp42.f20629b);
            zp4.f20643p = zp4.f20645r;
            zp4.f20644q = 0;
        }
        zp4 g = zp4.mo28553g(1);
        if (exoPlaybackException != null) {
            g = g.mo28551e(exoPlaybackException);
        }
        zp4 zp43 = g;
        this.f16092H++;
        this.f16130k.mo11238f1();
        if (!zp43.f20628a.mo6883u() || this.f16149t0.f20628a.mo6883u()) {
            z2 = false;
        } else {
            z2 = true;
        }
        mo24128A2(zp43, 0, 1, false, z2, 4, mo24127A1(zp43), -1);
    }

    /* renamed from: y */
    public Looper mo6713y() {
        return this.f16146s;
    }

    /* renamed from: y1 */
    public final Pair<Boolean, Integer> mo24164y1(zp4 zp4, zp4 zp42, boolean z, int i, boolean z2) {
        C0831s sVar = zp42.f20628a;
        C0831s sVar2 = zp4.f20628a;
        if (sVar2.mo6883u() && sVar.mo6883u()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (sVar2.mo6883u() != sVar.mo6883u()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (!sVar.mo6880r(sVar.mo6874l(zp42.f20629b.f15659a, this.f16136n).f4438e, this.f4156a).f4459a.equals(sVar2.mo6880r(sVar2.mo6874l(zp4.f20629b.f15659a, this.f16136n).f4438e, this.f4156a).f4459a)) {
            if (z && i == 0) {
                i2 = 1;
            } else if (z && i == 1) {
                i2 = 2;
            } else if (!z2) {
                throw new IllegalStateException();
            }
            return new Pair<>(Boolean.TRUE, Integer.valueOf(i2));
        } else if (!z || i != 0 || zp42.f20629b.f15662d >= zp4.f20629b.f15662d) {
            return new Pair<>(Boolean.FALSE, -1);
        } else {
            return new Pair<>(Boolean.TRUE, 0);
        }
    }

    /* renamed from: y2 */
    public final void mo24165y2() {
        C0821o.C0823b bVar = this.f16099O;
        C0821o.C0823b F = w67.m29304F(this.f16120f, this.f16114c);
        this.f16099O = F;
        if (!F.equals(bVar)) {
            this.f16132l.mo23191i(13, new cw1(this));
        }
    }

    /* renamed from: z */
    public C0840v mo6714z() {
        mo24133D2();
        return this.f16124h.mo20180b();
    }

    /* renamed from: z1 */
    public boolean mo24166z1() {
        mo24133D2();
        return this.f16149t0.f20642o;
    }

    /* renamed from: z2 */
    public final void mo24167z2(boolean z, int i, int i2) {
        boolean z2;
        int i3 = 0;
        if (!z || i == -1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 && i != 1) {
            i3 = 1;
        }
        zp4 zp4 = this.f16149t0;
        if (zp4.f20639l != z2 || zp4.f20640m != i3) {
            this.f16092H++;
            zp4 d = zp4.mo28550d(z2, i3);
            this.f16130k.mo11205O0(z2, i3);
            mo24128A2(d, 0, i2, false, false, 5, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, -1);
        }
    }
}

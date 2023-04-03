package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0798k;
import androidx.media3.common.C0820n;
import androidx.media3.common.C0831s;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.C0971h;
import androidx.media3.exoplayer.source.C0973i;
import com.google.common.collect.C4632i;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.cr4;
import p000.fs3;
import p000.ft6;
import p000.md5;
import p000.z81;

/* renamed from: ax1 */
/* compiled from: ExoPlayerImplInternal */
public final class ax1 implements Handler.Callback, C0971h.C0972a, ft6.C2331a, fs3.C2326d, z81.C3720a, cr4.C2115a {

    /* renamed from: A */
    public final Looper f7793A;

    /* renamed from: A1 */
    public boolean f7794A1;

    /* renamed from: B */
    public final C0831s.C0835d f7795B;

    /* renamed from: B1 */
    public ExoPlaybackException f7796B1;

    /* renamed from: C */
    public final C0831s.C0833b f7797C;

    /* renamed from: C1 */
    public long f7798C1;

    /* renamed from: D1 */
    public long f7799D1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    /* renamed from: H */
    public final long f7800H;

    /* renamed from: I */
    public final boolean f7801I;

    /* renamed from: L */
    public final z81 f7802L;

    /* renamed from: M */
    public final ArrayList<C1591d> f7803M;

    /* renamed from: P */
    public final dh0 f7804P;

    /* renamed from: Q */
    public final C1593f f7805Q;

    /* renamed from: U */
    public final qr3 f7806U;

    /* renamed from: X */
    public final fs3 f7807X;

    /* renamed from: Y */
    public final qi3 f7808Y;

    /* renamed from: Z */
    public final long f7809Z;

    /* renamed from: a */
    public final md5[] f7810a;

    /* renamed from: b1 */
    public boolean f7811b1;

    /* renamed from: d */
    public final Set<md5> f7812d;

    /* renamed from: e */
    public final od5[] f7813e;

    /* renamed from: e0 */
    public ys5 f7814e0;

    /* renamed from: e1 */
    public boolean f7815e1;

    /* renamed from: g */
    public final ft6 f7816g;

    /* renamed from: k */
    public final gt6 f7817k;

    /* renamed from: k0 */
    public zp4 f7818k0;

    /* renamed from: o1 */
    public boolean f7819o1;

    /* renamed from: p1 */
    public boolean f7820p1;

    /* renamed from: q1 */
    public boolean f7821q1;

    /* renamed from: r */
    public final ti3 f7822r;

    /* renamed from: r1 */
    public int f7823r1;

    /* renamed from: s */
    public final C2332fx f7824s;

    /* renamed from: s1 */
    public boolean f7825s1;

    /* renamed from: t1 */
    public boolean f7826t1;

    /* renamed from: u1 */
    public boolean f7827u1;

    /* renamed from: v0 */
    public C1592e f7828v0;

    /* renamed from: v1 */
    public boolean f7829v1;

    /* renamed from: w1 */
    public int f7830w1;

    /* renamed from: x */
    public final xk2 f7831x;

    /* renamed from: x1 */
    public C1595h f7832x1;

    /* renamed from: y */
    public final HandlerThread f7833y;

    /* renamed from: y1 */
    public long f7834y1;

    /* renamed from: z1 */
    public int f7835z1;

    /* renamed from: ax1$a */
    /* compiled from: ExoPlayerImplInternal */
    public class C1588a implements md5.C2822a {
        public C1588a() {
        }

        /* renamed from: a */
        public void mo11280a() {
            boolean unused = ax1.this.f7827u1 = true;
        }

        /* renamed from: b */
        public void mo11281b() {
            ax1.this.f7831x.mo22781i(2);
        }
    }

    /* renamed from: ax1$b */
    /* compiled from: ExoPlayerImplInternal */
    public static final class C1589b {

        /* renamed from: a */
        public final List<fs3.C2325c> f7837a;

        /* renamed from: b */
        public final x06 f7838b;

        /* renamed from: c */
        public final int f7839c;

        /* renamed from: d */
        public final long f7840d;

        public /* synthetic */ C1589b(List list, x06 x06, int i, long j, C1588a aVar) {
            this(list, x06, i, j);
        }

        public C1589b(List<fs3.C2325c> list, x06 x06, int i, long j) {
            this.f7837a = list;
            this.f7838b = x06;
            this.f7839c = i;
            this.f7840d = j;
        }
    }

    /* renamed from: ax1$c */
    /* compiled from: ExoPlayerImplInternal */
    public static class C1590c {

        /* renamed from: a */
        public final int f7841a;

        /* renamed from: b */
        public final int f7842b;

        /* renamed from: c */
        public final int f7843c;

        /* renamed from: d */
        public final x06 f7844d;
    }

    /* renamed from: ax1$d */
    /* compiled from: ExoPlayerImplInternal */
    public static final class C1591d implements Comparable<C1591d> {

        /* renamed from: a */
        public final cr4 f7845a;

        /* renamed from: d */
        public int f7846d;

        /* renamed from: e */
        public long f7847e;

        /* renamed from: g */
        public Object f7848g;

        public C1591d(cr4 cr4) {
            this.f7845a = cr4;
        }

        /* renamed from: a */
        public int compareTo(C1591d dVar) {
            boolean z;
            boolean z2;
            Object obj = this.f7848g;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (dVar.f7848g == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (obj != null) {
                    return -1;
                }
                return 1;
            } else if (obj == null) {
                return 0;
            } else {
                int i = this.f7846d - dVar.f7846d;
                if (i != 0) {
                    return i;
                }
                return w67.m29370o(this.f7847e, dVar.f7847e);
            }
        }

        /* renamed from: d */
        public void mo11284d(int i, long j, Object obj) {
            this.f7846d = i;
            this.f7847e = j;
            this.f7848g = obj;
        }
    }

    /* renamed from: ax1$e */
    /* compiled from: ExoPlayerImplInternal */
    public static final class C1592e {

        /* renamed from: a */
        public boolean f7849a;

        /* renamed from: b */
        public zp4 f7850b;

        /* renamed from: c */
        public int f7851c;

        /* renamed from: d */
        public boolean f7852d;

        /* renamed from: e */
        public int f7853e;

        /* renamed from: f */
        public boolean f7854f;

        /* renamed from: g */
        public int f7855g;

        public C1592e(zp4 zp4) {
            this.f7850b = zp4;
        }

        /* renamed from: b */
        public void mo11285b(int i) {
            boolean z;
            boolean z2 = this.f7849a;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            this.f7849a = z2 | z;
            this.f7851c += i;
        }

        /* renamed from: c */
        public void mo11286c(int i) {
            this.f7849a = true;
            this.f7854f = true;
            this.f7855g = i;
        }

        /* renamed from: d */
        public void mo11287d(zp4 zp4) {
            boolean z;
            boolean z2 = this.f7849a;
            if (this.f7850b != zp4) {
                z = true;
            } else {
                z = false;
            }
            this.f7849a = z2 | z;
            this.f7850b = zp4;
        }

        /* renamed from: e */
        public void mo11288e(int i) {
            boolean z = true;
            if (!this.f7852d || this.f7853e == 5) {
                this.f7849a = true;
                this.f7852d = true;
                this.f7853e = i;
                return;
            }
            if (i != 5) {
                z = false;
            }
            C2725kr.m20981a(z);
        }
    }

    /* renamed from: ax1$f */
    /* compiled from: ExoPlayerImplInternal */
    public interface C1593f {
        /* renamed from: a */
        void mo11289a(C1592e eVar);
    }

    /* renamed from: ax1$g */
    /* compiled from: ExoPlayerImplInternal */
    public static final class C1594g {

        /* renamed from: a */
        public final C0973i.C0975b f7856a;

        /* renamed from: b */
        public final long f7857b;

        /* renamed from: c */
        public final long f7858c;

        /* renamed from: d */
        public final boolean f7859d;

        /* renamed from: e */
        public final boolean f7860e;

        /* renamed from: f */
        public final boolean f7861f;

        public C1594g(C0973i.C0975b bVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f7856a = bVar;
            this.f7857b = j;
            this.f7858c = j2;
            this.f7859d = z;
            this.f7860e = z2;
            this.f7861f = z3;
        }
    }

    /* renamed from: ax1$h */
    /* compiled from: ExoPlayerImplInternal */
    public static final class C1595h {

        /* renamed from: a */
        public final C0831s f7862a;

        /* renamed from: b */
        public final int f7863b;

        /* renamed from: c */
        public final long f7864c;

        public C1595h(C0831s sVar, int i, long j) {
            this.f7862a = sVar;
            this.f7863b = i;
            this.f7864c = j;
        }
    }

    public ax1(md5[] md5Arr, ft6 ft6, gt6 gt6, ti3 ti3, C2332fx fxVar, int i, boolean z, C3142qf qfVar, ys5 ys5, qi3 qi3, long j, boolean z2, Looper looper, dh0 dh0, C1593f fVar, br4 br4) {
        md5[] md5Arr2 = md5Arr;
        C2332fx fxVar2 = fxVar;
        C3142qf qfVar2 = qfVar;
        long j2 = j;
        dh0 dh02 = dh0;
        br4 br42 = br4;
        this.f7805Q = fVar;
        this.f7810a = md5Arr2;
        this.f7816g = ft6;
        this.f7817k = gt6;
        this.f7822r = ti3;
        this.f7824s = fxVar2;
        this.f7823r1 = i;
        this.f7825s1 = z;
        this.f7814e0 = ys5;
        this.f7808Y = qi3;
        this.f7809Z = j2;
        this.f7798C1 = j2;
        this.f7815e1 = z2;
        this.f7804P = dh02;
        this.f7800H = ti3.mo26451b();
        this.f7801I = ti3.mo26450a();
        zp4 j3 = zp4.m31419j(gt6);
        this.f7818k0 = j3;
        this.f7828v0 = new C1592e(j3);
        this.f7813e = new od5[md5Arr2.length];
        for (int i2 = 0; i2 < md5Arr2.length; i2++) {
            md5Arr2[i2].mo21695s(i2, br42);
            this.f7813e[i2] = md5Arr2[i2].mo21693p();
        }
        this.f7802L = new z81(this, dh02);
        this.f7803M = new ArrayList<>();
        this.f7812d = C4632i.m37037h();
        this.f7795B = new C0831s.C0835d();
        this.f7797C = new C0831s.C0833b();
        ft6.mo20181c(this, fxVar2);
        this.f7794A1 = true;
        Handler handler = new Handler(looper);
        this.f7806U = new qr3(qfVar2, handler);
        this.f7807X = new fs3(this, qfVar2, handler, br42);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f7833y = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f7793A = looper2;
        this.f7831x = dh02.mo18771c(looper2, this);
    }

    /* renamed from: N */
    public static boolean m10850N(boolean z, C0973i.C0975b bVar, long j, C0973i.C0975b bVar2, C0831s.C0833b bVar3, long j2) {
        if (z || j != j2 || !bVar.f15659a.equals(bVar2.f15659a)) {
            return false;
        }
        if (!bVar.mo23781b() || !bVar3.mo6904t(bVar.f15660b)) {
            if (!bVar2.mo23781b() || !bVar3.mo6904t(bVar2.f15660b)) {
                return false;
            }
            return true;
        } else if (bVar3.mo6895k(bVar.f15660b, bVar.f15661c) == 4 || bVar3.mo6895k(bVar.f15660b, bVar.f15661c) == 2) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: P */
    public static boolean m10851P(md5 md5) {
        if (md5.getState() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public static boolean m10852R(zp4 zp4, C0831s.C0833b bVar) {
        C0973i.C0975b bVar2 = zp4.f20629b;
        C0831s sVar = zp4.f20628a;
        if (sVar.mo6883u() || sVar.mo6874l(bVar2.f15659a, bVar).f4441r) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ Boolean m10853S() {
        return Boolean.valueOf(this.f7811b1);
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m10854T(cr4 cr4) {
        try {
            mo11255m(cr4);
        } catch (ExoPlaybackException e) {
            gk3.m18127d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: s0 */
    public static void m10859s0(C0831s sVar, C1591d dVar, C0831s.C0835d dVar2, C0831s.C0833b bVar) {
        long j;
        int i = sVar.mo6880r(sVar.mo6874l(dVar.f7848g, bVar).f4438e, dVar2).f4457M;
        Object obj = sVar.mo6873k(i, bVar, true).f4437d;
        long j2 = bVar.f4439g;
        if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            j = j2 - 1;
        } else {
            j = Long.MAX_VALUE;
        }
        dVar.mo11284d(i, j, obj);
    }

    /* renamed from: t0 */
    public static boolean m10860t0(C1591d dVar, C0831s sVar, C0831s sVar2, int i, boolean z, C0831s.C0835d dVar2, C0831s.C0833b bVar) {
        long j;
        C1591d dVar3 = dVar;
        C0831s sVar3 = sVar;
        C0831s sVar4 = sVar2;
        C0831s.C0835d dVar4 = dVar2;
        C0831s.C0833b bVar2 = bVar;
        Object obj = dVar3.f7848g;
        if (obj == null) {
            if (dVar3.f7845a.mo18269f() == Long.MIN_VALUE) {
                j = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            } else {
                j = w67.m29391y0(dVar3.f7845a.mo18269f());
            }
            Pair<Object, Long> w0 = m10863w0(sVar, new C1595h(dVar3.f7845a.mo18271h(), dVar3.f7845a.mo18267d(), j), false, i, z, dVar2, bVar);
            if (w0 == null) {
                return false;
            }
            dVar.mo11284d(sVar3.mo6867f(w0.first), ((Long) w0.second).longValue(), w0.first);
            if (dVar3.f7845a.mo18269f() == Long.MIN_VALUE) {
                m10859s0(sVar3, dVar, dVar4, bVar2);
            }
            return true;
        }
        int f = sVar3.mo6867f(obj);
        if (f == -1) {
            return false;
        }
        if (dVar3.f7845a.mo18269f() == Long.MIN_VALUE) {
            m10859s0(sVar3, dVar, dVar4, bVar2);
            return true;
        }
        dVar3.f7846d = f;
        sVar4.mo6874l(dVar3.f7848g, bVar2);
        if (bVar2.f4441r && sVar4.mo6880r(bVar2.f4438e, dVar4).f4456L == sVar4.mo6867f(dVar3.f7848g)) {
            long q = dVar3.f7847e + bVar.mo6901q();
            Pair<Object, Long> n = sVar.mo6876n(dVar2, bVar, sVar3.mo6874l(dVar3.f7848g, bVar2).f4438e, q);
            dVar.mo11284d(sVar3.mo6867f(n.first), ((Long) n.second).longValue(), n.first);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c1  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.ax1.C1594g m10861v0(androidx.media3.common.C0831s r30, p000.zp4 r31, p000.ax1.C1595h r32, p000.qr3 r33, int r34, boolean r35, androidx.media3.common.C0831s.C0835d r36, androidx.media3.common.C0831s.C0833b r37) {
        /*
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r35
            r11 = r37
            boolean r0 = r30.mo6883u()
            if (r0 == 0) goto L_0x0025
            ax1$g r0 = new ax1$g
            androidx.media3.exoplayer.source.i$b r2 = p000.zp4.m31420k()
            r3 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r8 = 1
            r9 = 0
            r1 = r0
            r1.<init>(r2, r3, r5, r7, r8, r9)
            return r0
        L_0x0025:
            androidx.media3.exoplayer.source.i$b r14 = r8.f20629b
            java.lang.Object r12 = r14.f15659a
            boolean r13 = m10852R(r8, r11)
            androidx.media3.exoplayer.source.i$b r0 = r8.f20629b
            boolean r0 = r0.mo23781b()
            if (r0 != 0) goto L_0x003b
            if (r13 == 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            long r0 = r8.f20645r
            goto L_0x003d
        L_0x003b:
            long r0 = r8.f20630c
        L_0x003d:
            r15 = r0
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            r19 = 0
            r20 = 1
            if (r9 == 0) goto L_0x00a1
            r2 = 1
            r0 = r30
            r1 = r32
            r3 = r34
            r4 = r35
            r5 = r36
            r21 = r14
            r14 = r6
            r6 = r37
            android.util.Pair r0 = m10863w0(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x006c
            int r0 = r7.mo6865e(r10)
            r6 = r0
            r0 = r15
            r2 = r19
            r3 = r2
            r4 = r20
            goto L_0x0097
        L_0x006c:
            long r1 = r9.f7864c
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x007e
            java.lang.Object r0 = r0.first
            androidx.media3.common.s$b r0 = r7.mo6874l(r0, r11)
            int r6 = r0.f4438e
            r0 = r15
            r2 = r19
            goto L_0x008b
        L_0x007e:
            java.lang.Object r12 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r6 = r14
            r2 = r20
        L_0x008b:
            int r3 = r8.f20632e
            r4 = 4
            if (r3 != r4) goto L_0x0093
            r3 = r20
            goto L_0x0095
        L_0x0093:
            r3 = r19
        L_0x0095:
            r4 = r19
        L_0x0097:
            r9 = r36
            r29 = r2
            r27 = r3
            r28 = r4
            r3 = r6
            goto L_0x00ba
        L_0x00a1:
            r21 = r14
            r14 = r6
            androidx.media3.common.s r0 = r8.f20628a
            boolean r0 = r0.mo6883u()
            if (r0 == 0) goto L_0x00be
            int r0 = r7.mo6865e(r10)
        L_0x00b0:
            r9 = r36
            r3 = r0
            r0 = r15
            r27 = r19
            r28 = r27
            r29 = r28
        L_0x00ba:
            r6 = r21
            goto L_0x0155
        L_0x00be:
            int r0 = r7.mo6867f(r12)
            if (r0 != r14) goto L_0x00f1
            androidx.media3.common.s r5 = r8.f20628a
            r0 = r36
            r1 = r37
            r2 = r34
            r3 = r35
            r4 = r12
            r6 = r30
            java.lang.Object r0 = m10864x0(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x00de
            int r0 = r7.mo6865e(r10)
            r4 = r20
            goto L_0x00e6
        L_0x00de:
            androidx.media3.common.s$b r0 = r7.mo6874l(r0, r11)
            int r0 = r0.f4438e
            r4 = r19
        L_0x00e6:
            r9 = r36
            r3 = r0
            r28 = r4
            r0 = r15
            r27 = r19
            r29 = r27
            goto L_0x00ba
        L_0x00f1:
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x00fc
            androidx.media3.common.s$b r0 = r7.mo6874l(r12, r11)
            int r0 = r0.f4438e
            goto L_0x00b0
        L_0x00fc:
            if (r13 == 0) goto L_0x0149
            androidx.media3.common.s r0 = r8.f20628a
            r6 = r21
            java.lang.Object r1 = r6.f15659a
            r0.mo6874l(r1, r11)
            androidx.media3.common.s r0 = r8.f20628a
            int r1 = r11.f4438e
            r9 = r36
            androidx.media3.common.s$d r0 = r0.mo6880r(r1, r9)
            int r0 = r0.f4456L
            androidx.media3.common.s r1 = r8.f20628a
            java.lang.Object r2 = r6.f15659a
            int r1 = r1.mo6867f(r2)
            if (r0 != r1) goto L_0x0140
            long r0 = r37.mo6901q()
            long r4 = r15 + r0
            androidx.media3.common.s$b r0 = r7.mo6874l(r12, r11)
            int r3 = r0.f4438e
            r0 = r30
            r1 = r36
            r2 = r37
            android.util.Pair r0 = r0.mo6876n(r1, r2, r3, r4)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r12 = r1
            r0 = r2
            goto L_0x0141
        L_0x0140:
            r0 = r15
        L_0x0141:
            r3 = r14
            r27 = r19
            r28 = r27
            r29 = r20
            goto L_0x0155
        L_0x0149:
            r9 = r36
            r6 = r21
            r3 = r14
            r0 = r15
            r27 = r19
            r28 = r27
            r29 = r28
        L_0x0155:
            if (r3 == r14) goto L_0x0175
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r30
            r1 = r36
            r2 = r37
            android.util.Pair r0 = r0.mo6876n(r1, r2, r3, r4)
            java.lang.Object r12 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = r33
            r25 = r17
            goto L_0x0179
        L_0x0175:
            r2 = r33
            r25 = r0
        L_0x0179:
            androidx.media3.exoplayer.source.i$b r2 = r2.mo25219B(r7, r12, r0)
            int r3 = r2.f15663e
            if (r3 == r14) goto L_0x018b
            int r4 = r6.f15663e
            if (r4 == r14) goto L_0x0188
            if (r3 < r4) goto L_0x0188
            goto L_0x018b
        L_0x0188:
            r3 = r19
            goto L_0x018d
        L_0x018b:
            r3 = r20
        L_0x018d:
            java.lang.Object r4 = r6.f15659a
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x01a4
            boolean r4 = r6.mo23781b()
            if (r4 != 0) goto L_0x01a4
            boolean r4 = r2.mo23781b()
            if (r4 != 0) goto L_0x01a4
            if (r3 == 0) goto L_0x01a4
            goto L_0x01a6
        L_0x01a4:
            r20 = r19
        L_0x01a6:
            androidx.media3.common.s$b r17 = r7.mo6874l(r12, r11)
            r12 = r13
            r13 = r6
            r3 = r6
            r14 = r15
            r16 = r2
            r18 = r25
            boolean r4 = m10850N(r12, r13, r14, r16, r17, r18)
            if (r20 != 0) goto L_0x01ba
            if (r4 == 0) goto L_0x01bb
        L_0x01ba:
            r2 = r3
        L_0x01bb:
            boolean r4 = r2.mo23781b()
            if (r4 == 0) goto L_0x01e0
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x01ca
            long r0 = r8.f20645r
            goto L_0x01e0
        L_0x01ca:
            java.lang.Object r0 = r2.f15659a
            r7.mo6874l(r0, r11)
            int r0 = r2.f15661c
            int r1 = r2.f15660b
            int r1 = r11.mo6898n(r1)
            if (r0 != r1) goto L_0x01de
            long r0 = r37.mo6894j()
            goto L_0x01e0
        L_0x01de:
            r0 = 0
        L_0x01e0:
            r23 = r0
            ax1$g r0 = new ax1$g
            r21 = r0
            r22 = r2
            r21.<init>(r22, r23, r25, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ax1.m10861v0(androidx.media3.common.s, zp4, ax1$h, qr3, int, boolean, androidx.media3.common.s$d, androidx.media3.common.s$b):ax1$g");
    }

    /* renamed from: w */
    public static C0792h[] m10862w(dx1 dx1) {
        int i;
        if (dx1 != null) {
            i = dx1.length();
        } else {
            i = 0;
        }
        C0792h[] hVarArr = new C0792h[i];
        for (int i2 = 0; i2 < i; i2++) {
            hVarArr[i2] = dx1.mo7663b(i2);
        }
        return hVarArr;
    }

    /* renamed from: w0 */
    public static Pair<Object, Long> m10863w0(C0831s sVar, C1595h hVar, boolean z, int i, boolean z2, C0831s.C0835d dVar, C0831s.C0833b bVar) {
        C0831s sVar2;
        Object x0;
        C0831s sVar3 = sVar;
        C1595h hVar2 = hVar;
        C0831s.C0833b bVar2 = bVar;
        C0831s sVar4 = hVar2.f7862a;
        if (sVar.mo6883u()) {
            return null;
        }
        if (sVar4.mo6883u()) {
            sVar2 = sVar3;
        } else {
            sVar2 = sVar4;
        }
        try {
            Pair<Object, Long> n = sVar2.mo6876n(dVar, bVar, hVar2.f7863b, hVar2.f7864c);
            if (sVar.equals(sVar2)) {
                return n;
            }
            if (sVar.mo6867f(n.first) == -1) {
                C0831s.C0835d dVar2 = dVar;
                if (z && (x0 = m10864x0(dVar, bVar, i, z2, n.first, sVar2, sVar)) != null) {
                    return sVar.mo6876n(dVar, bVar, sVar.mo6874l(x0, bVar2).f4438e, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
                }
                return null;
            } else if (!sVar2.mo6874l(n.first, bVar2).f4441r || sVar2.mo6880r(bVar2.f4438e, dVar).f4456L != sVar2.mo6867f(n.first)) {
                return n;
            } else {
                return sVar.mo6876n(dVar, bVar, sVar.mo6874l(n.first, bVar2).f4438e, hVar2.f7864c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* renamed from: x0 */
    public static Object m10864x0(C0831s.C0835d dVar, C0831s.C0833b bVar, int i, boolean z, Object obj, C0831s sVar, C0831s sVar2) {
        int f = sVar.mo6867f(obj);
        int m = sVar.mo6875m();
        int i2 = f;
        int i3 = -1;
        for (int i4 = 0; i4 < m && i3 == -1; i4++) {
            i2 = sVar.mo6869h(i2, bVar, dVar, i, z);
            if (i2 == -1) {
                break;
            }
            i3 = sVar2.mo6867f(sVar.mo6879q(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return sVar2.mo6879q(i3);
    }

    /* renamed from: A */
    public Looper mo11177A() {
        return this.f7793A;
    }

    /* renamed from: A0 */
    public final void mo11178A0(boolean z) throws ExoPlaybackException {
        C0973i.C0975b bVar = this.f7806U.mo25240p().f15230f.f16038a;
        long D0 = mo11184D0(bVar, this.f7818k0.f20645r, true, false);
        if (D0 != this.f7818k0.f20645r) {
            zp4 zp4 = this.f7818k0;
            this.f7818k0 = mo11197K(bVar, D0, zp4.f20630c, zp4.f20631d, z, 5);
        }
    }

    /* renamed from: B */
    public final long mo11179B() {
        return mo11181C(this.f7818k0.f20643p);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac A[Catch:{ all -> 0x0148 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00af A[Catch:{ all -> 0x0148 }] */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11180B0(p000.ax1.C1595h r19) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r18 = this;
            r11 = r18
            r0 = r19
            ax1$e r1 = r11.f7828v0
            r8 = 1
            r1.mo11285b(r8)
            zp4 r1 = r11.f7818k0
            androidx.media3.common.s r1 = r1.f20628a
            int r4 = r11.f7823r1
            boolean r5 = r11.f7825s1
            androidx.media3.common.s$d r6 = r11.f7795B
            androidx.media3.common.s$b r7 = r11.f7797C
            r3 = 1
            r2 = r19
            android.util.Pair r1 = m10863w0(r1, r2, r3, r4, r5, r6, r7)
            r2 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            if (r1 != 0) goto L_0x004c
            zp4 r7 = r11.f7818k0
            androidx.media3.common.s r7 = r7.f20628a
            android.util.Pair r7 = r11.mo11278z(r7)
            java.lang.Object r9 = r7.first
            androidx.media3.exoplayer.source.i$b r9 = (androidx.media3.exoplayer.source.C0973i.C0975b) r9
            java.lang.Object r7 = r7.second
            java.lang.Long r7 = (java.lang.Long) r7
            long r12 = r7.longValue()
            zp4 r7 = r11.f7818k0
            androidx.media3.common.s r7 = r7.f20628a
            boolean r7 = r7.mo6883u()
            r7 = r7 ^ r8
            r10 = r7
            r16 = r4
        L_0x0047:
            r4 = r12
            r12 = r16
            goto L_0x00a2
        L_0x004c:
            java.lang.Object r7 = r1.first
            java.lang.Object r9 = r1.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            long r9 = r0.f7864c
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x005e
            r9 = r4
            goto L_0x005f
        L_0x005e:
            r9 = r12
        L_0x005f:
            qr3 r14 = r11.f7806U
            zp4 r15 = r11.f7818k0
            androidx.media3.common.s r15 = r15.f20628a
            androidx.media3.exoplayer.source.i$b r7 = r14.mo25219B(r15, r7, r12)
            boolean r14 = r7.mo23781b()
            if (r14 == 0) goto L_0x0094
            zp4 r4 = r11.f7818k0
            androidx.media3.common.s r4 = r4.f20628a
            java.lang.Object r5 = r7.f15659a
            androidx.media3.common.s$b r12 = r11.f7797C
            r4.mo6874l(r5, r12)
            androidx.media3.common.s$b r4 = r11.f7797C
            int r5 = r7.f15660b
            int r4 = r4.mo6898n(r5)
            int r5 = r7.f15661c
            if (r4 != r5) goto L_0x008e
            androidx.media3.common.s$b r4 = r11.f7797C
            long r4 = r4.mo6894j()
            r12 = r4
            goto L_0x008f
        L_0x008e:
            r12 = r2
        L_0x008f:
            r4 = r12
            r12 = r9
            r9 = r7
            r10 = r8
            goto L_0x00a2
        L_0x0094:
            long r14 = r0.f7864c
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x009c
            r4 = r8
            goto L_0x009d
        L_0x009c:
            r4 = r6
        L_0x009d:
            r16 = r9
            r10 = r4
            r9 = r7
            goto L_0x0047
        L_0x00a2:
            zp4 r7 = r11.f7818k0     // Catch:{ all -> 0x0148 }
            androidx.media3.common.s r7 = r7.f20628a     // Catch:{ all -> 0x0148 }
            boolean r7 = r7.mo6883u()     // Catch:{ all -> 0x0148 }
            if (r7 == 0) goto L_0x00af
            r11.f7832x1 = r0     // Catch:{ all -> 0x0148 }
            goto L_0x00be
        L_0x00af:
            r0 = 4
            if (r1 != 0) goto L_0x00c1
            zp4 r1 = r11.f7818k0     // Catch:{ all -> 0x0148 }
            int r1 = r1.f20632e     // Catch:{ all -> 0x0148 }
            if (r1 == r8) goto L_0x00bb
            r11.mo11221Y0(r0)     // Catch:{ all -> 0x0148 }
        L_0x00bb:
            r11.mo11265p0(r6, r8, r6, r8)     // Catch:{ all -> 0x0148 }
        L_0x00be:
            r7 = r4
            goto L_0x0135
        L_0x00c1:
            zp4 r1 = r11.f7818k0     // Catch:{ all -> 0x0148 }
            androidx.media3.exoplayer.source.i$b r1 = r1.f20629b     // Catch:{ all -> 0x0148 }
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x0148 }
            if (r1 == 0) goto L_0x0110
            qr3 r1 = r11.f7806U     // Catch:{ all -> 0x0148 }
            mr3 r1 = r1.mo25240p()     // Catch:{ all -> 0x0148 }
            if (r1 == 0) goto L_0x00e4
            boolean r7 = r1.f15228d     // Catch:{ all -> 0x0148 }
            if (r7 == 0) goto L_0x00e4
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00e4
            androidx.media3.exoplayer.source.h r1 = r1.f15225a     // Catch:{ all -> 0x0148 }
            ys5 r2 = r11.f7814e0     // Catch:{ all -> 0x0148 }
            long r1 = r1.mo7243c(r4, r2)     // Catch:{ all -> 0x0148 }
            goto L_0x00e5
        L_0x00e4:
            r1 = r4
        L_0x00e5:
            long r14 = p000.w67.m29335U0(r1)     // Catch:{ all -> 0x0148 }
            zp4 r3 = r11.f7818k0     // Catch:{ all -> 0x0148 }
            long r6 = r3.f20645r     // Catch:{ all -> 0x0148 }
            long r6 = p000.w67.m29335U0(r6)     // Catch:{ all -> 0x0148 }
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0111
            zp4 r3 = r11.f7818k0     // Catch:{ all -> 0x0148 }
            int r6 = r3.f20632e     // Catch:{ all -> 0x0148 }
            r7 = 2
            if (r6 == r7) goto L_0x00ff
            r7 = 3
            if (r6 != r7) goto L_0x0111
        L_0x00ff:
            long r7 = r3.f20645r     // Catch:{ all -> 0x0148 }
            r0 = 2
            r1 = r18
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            zp4 r0 = r1.mo11197K(r2, r3, r5, r7, r9, r10)
            r11.f7818k0 = r0
            return
        L_0x0110:
            r1 = r4
        L_0x0111:
            zp4 r3 = r11.f7818k0     // Catch:{ all -> 0x0148 }
            int r3 = r3.f20632e     // Catch:{ all -> 0x0148 }
            if (r3 != r0) goto L_0x0119
            r0 = r8
            goto L_0x011a
        L_0x0119:
            r0 = 0
        L_0x011a:
            long r14 = r11.mo11182C0(r9, r1, r0)     // Catch:{ all -> 0x0148 }
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0123
            goto L_0x0124
        L_0x0123:
            r8 = 0
        L_0x0124:
            r8 = r8 | r10
            zp4 r0 = r11.f7818k0     // Catch:{ all -> 0x0144 }
            androidx.media3.common.s r4 = r0.f20628a     // Catch:{ all -> 0x0144 }
            androidx.media3.exoplayer.source.i$b r5 = r0.f20629b     // Catch:{ all -> 0x0144 }
            r1 = r18
            r2 = r4
            r3 = r9
            r6 = r12
            r1.mo11257m1(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0144 }
            r10 = r8
            r7 = r14
        L_0x0135:
            r0 = 2
            r1 = r18
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            zp4 r0 = r1.mo11197K(r2, r3, r5, r7, r9, r10)
            r11.f7818k0 = r0
            return
        L_0x0144:
            r0 = move-exception
            r10 = r8
            r7 = r14
            goto L_0x014a
        L_0x0148:
            r0 = move-exception
            r7 = r4
        L_0x014a:
            r14 = 2
            r1 = r18
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r14
            zp4 r1 = r1.mo11197K(r2, r3, r5, r7, r9, r10)
            r11.f7818k0 = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ax1.mo11180B0(ax1$h):void");
    }

    /* renamed from: C */
    public final long mo11181C(long j) {
        mr3 j2 = this.f7806U.mo25234j();
        if (j2 == null) {
            return 0;
        }
        return Math.max(0, j - j2.mo23377y(this.f7834y1));
    }

    /* renamed from: C0 */
    public final long mo11182C0(C0973i.C0975b bVar, long j, boolean z) throws ExoPlaybackException {
        boolean z2;
        if (this.f7806U.mo25240p() != this.f7806U.mo25241q()) {
            z2 = true;
        } else {
            z2 = false;
        }
        return mo11184D0(bVar, j, z2, z);
    }

    /* renamed from: D */
    public final void mo11183D(C0971h hVar) {
        if (this.f7806U.mo25246v(hVar)) {
            this.f7806U.mo25248y(this.f7834y1);
            mo11212U();
        }
    }

    /* renamed from: D0 */
    public final long mo11184D0(C0973i.C0975b bVar, long j, boolean z, boolean z2) throws ExoPlaybackException {
        mo11242h1();
        this.f7820p1 = false;
        if (z2 || this.f7818k0.f20632e == 3) {
            mo11221Y0(2);
        }
        mr3 p = this.f7806U.mo25240p();
        mr3 mr3 = p;
        while (mr3 != null && !bVar.equals(mr3.f15230f.f16038a)) {
            mr3 = mr3.mo23363j();
        }
        if (z || p != mr3 || (mr3 != null && mr3.mo23378z(j) < 0)) {
            for (md5 n : this.f7810a) {
                mo11258n(n);
            }
            if (mr3 != null) {
                while (this.f7806U.mo25240p() != mr3) {
                    this.f7806U.mo25226b();
                }
                this.f7806U.mo25249z(mr3);
                mr3.mo23376x(1000000000000L);
                mo11266q();
            }
        }
        if (mr3 != null) {
            this.f7806U.mo25249z(mr3);
            if (!mr3.f15228d) {
                mr3.f15230f = mr3.f15230f.mo24083b(j);
            } else if (mr3.f15229e) {
                long l = mr3.f15225a.mo7250l(j);
                mr3.f15225a.mo7256t(l - this.f7800H, this.f7801I);
                j = l;
            }
            mo11269r0(j);
            mo11212U();
        } else {
            this.f7806U.mo25230f();
            mo11269r0(j);
        }
        mo11187F(false);
        this.f7831x.mo22781i(2);
        return j;
    }

    /* renamed from: E */
    public final void mo11185E(IOException iOException, int i) {
        ExoPlaybackException createForSource = ExoPlaybackException.createForSource(iOException, i);
        mr3 p = this.f7806U.mo25240p();
        if (p != null) {
            createForSource = createForSource.copyWithMediaPeriodId(p.f15230f.f16038a);
        }
        gk3.m18127d("ExoPlayerImplInternal", "Playback error", createForSource);
        mo11240g1(false, false);
        this.f7818k0 = this.f7818k0.mo28551e(createForSource);
    }

    /* renamed from: E0 */
    public final void mo11186E0(cr4 cr4) throws ExoPlaybackException {
        if (cr4.mo18269f() == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            mo11188F0(cr4);
        } else if (this.f7818k0.f20628a.mo6883u()) {
            this.f7803M.add(new C1591d(cr4));
        } else {
            C1591d dVar = new C1591d(cr4);
            C0831s sVar = this.f7818k0.f20628a;
            if (m10860t0(dVar, sVar, sVar, this.f7823r1, this.f7825s1, this.f7795B, this.f7797C)) {
                this.f7803M.add(dVar);
                Collections.sort(this.f7803M);
                return;
            }
            cr4.mo18274k(false);
        }
    }

    /* renamed from: F */
    public final void mo11187F(boolean z) {
        C0973i.C0975b bVar;
        long j;
        mr3 j2 = this.f7806U.mo25234j();
        if (j2 == null) {
            bVar = this.f7818k0.f20629b;
        } else {
            bVar = j2.f15230f.f16038a;
        }
        boolean z2 = !this.f7818k0.f20638k.equals(bVar);
        if (z2) {
            this.f7818k0 = this.f7818k0.mo28548b(bVar);
        }
        zp4 zp4 = this.f7818k0;
        if (j2 == null) {
            j = zp4.f20645r;
        } else {
            j = j2.mo23362i();
        }
        zp4.f20643p = j;
        this.f7818k0.f20644q = mo11179B();
        if ((z2 || z) && j2 != null && j2.f15228d) {
            mo11248j1(j2.mo23367n(), j2.mo23368o());
        }
    }

    /* renamed from: F0 */
    public final void mo11188F0(cr4 cr4) throws ExoPlaybackException {
        if (cr4.mo18266c() == this.f7793A) {
            mo11255m(cr4);
            int i = this.f7818k0.f20632e;
            if (i == 3 || i == 2) {
                this.f7831x.mo22781i(2);
                return;
            }
            return;
        }
        this.f7831x.mo22776d(15, cr4).mo22784a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01a2  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11189G(androidx.media3.common.C0831s r25, boolean r26) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r24 = this;
            r11 = r24
            r12 = r25
            zp4 r2 = r11.f7818k0
            ax1$h r3 = r11.f7832x1
            qr3 r4 = r11.f7806U
            int r5 = r11.f7823r1
            boolean r6 = r11.f7825s1
            androidx.media3.common.s$d r7 = r11.f7795B
            androidx.media3.common.s$b r8 = r11.f7797C
            r1 = r25
            ax1$g r7 = m10861v0(r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.media3.exoplayer.source.i$b r8 = r7.f7856a
            long r9 = r7.f7858c
            boolean r0 = r7.f7859d
            long r13 = r7.f7857b
            zp4 r1 = r11.f7818k0
            androidx.media3.exoplayer.source.i$b r1 = r1.f20629b
            boolean r1 = r1.equals(r8)
            r15 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0038
            zp4 r1 = r11.f7818k0
            long r1 = r1.f20645r
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            r16 = r5
            goto L_0x003a
        L_0x0038:
            r16 = r15
        L_0x003a:
            r17 = 3
            r6 = 0
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 4
            boolean r1 = r7.f7860e     // Catch:{ all -> 0x0127 }
            if (r1 == 0) goto L_0x0053
            zp4 r1 = r11.f7818k0     // Catch:{ all -> 0x0127 }
            int r1 = r1.f20632e     // Catch:{ all -> 0x0127 }
            if (r1 == r15) goto L_0x0050
            r11.mo11221Y0(r4)     // Catch:{ all -> 0x0127 }
        L_0x0050:
            r11.mo11265p0(r5, r5, r5, r15)     // Catch:{ all -> 0x0127 }
        L_0x0053:
            if (r16 != 0) goto L_0x0075
            qr3 r1 = r11.f7806U     // Catch:{ all -> 0x0127 }
            long r3 = r11.f7834y1     // Catch:{ all -> 0x006f }
            long r21 = r24.mo11276y()     // Catch:{ all -> 0x006f }
            r2 = r25
            r15 = -1
            r20 = 4
            r15 = r5
            r5 = r21
            boolean r0 = r1.mo25223F(r2, r3, r5)     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x00a7
            r11.mo11178A0(r15)     // Catch:{ all -> 0x0124 }
            goto L_0x00a7
        L_0x006f:
            r0 = move-exception
            r15 = r5
            r20 = 4
            goto L_0x012b
        L_0x0075:
            r20 = r4
            r15 = r5
            boolean r1 = r25.mo6883u()     // Catch:{ all -> 0x0124 }
            if (r1 != 0) goto L_0x00a7
            qr3 r1 = r11.f7806U     // Catch:{ all -> 0x0124 }
            mr3 r1 = r1.mo25240p()     // Catch:{ all -> 0x0124 }
        L_0x0084:
            if (r1 == 0) goto L_0x00a2
            or3 r2 = r1.f15230f     // Catch:{ all -> 0x0124 }
            androidx.media3.exoplayer.source.i$b r2 = r2.f16038a     // Catch:{ all -> 0x0124 }
            boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x009d
            qr3 r2 = r11.f7806U     // Catch:{ all -> 0x0124 }
            or3 r3 = r1.f15230f     // Catch:{ all -> 0x0124 }
            or3 r2 = r2.mo25242r(r12, r3)     // Catch:{ all -> 0x0124 }
            r1.f15230f = r2     // Catch:{ all -> 0x0124 }
            r1.mo23354A()     // Catch:{ all -> 0x0124 }
        L_0x009d:
            mr3 r1 = r1.mo23363j()     // Catch:{ all -> 0x0124 }
            goto L_0x0084
        L_0x00a2:
            long r0 = r11.mo11182C0(r8, r13, r0)     // Catch:{ all -> 0x0124 }
            r13 = r0
        L_0x00a7:
            zp4 r0 = r11.f7818k0
            androidx.media3.common.s r4 = r0.f20628a
            androidx.media3.exoplayer.source.i$b r5 = r0.f20629b
            boolean r0 = r7.f7861f
            if (r0 == 0) goto L_0x00b3
            r6 = r13
            goto L_0x00b5
        L_0x00b3:
            r6 = r18
        L_0x00b5:
            r1 = r24
            r2 = r25
            r3 = r8
            r1.mo11257m1(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x00c7
            zp4 r0 = r11.f7818k0
            long r0 = r0.f20630c
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0105
        L_0x00c7:
            zp4 r0 = r11.f7818k0
            androidx.media3.exoplayer.source.i$b r1 = r0.f20629b
            java.lang.Object r1 = r1.f15659a
            androidx.media3.common.s r0 = r0.f20628a
            if (r16 == 0) goto L_0x00e6
            if (r26 == 0) goto L_0x00e6
            boolean r2 = r0.mo6883u()
            if (r2 != 0) goto L_0x00e6
            androidx.media3.common.s$b r2 = r11.f7797C
            androidx.media3.common.s$b r0 = r0.mo6874l(r1, r2)
            boolean r0 = r0.f4441r
            if (r0 != 0) goto L_0x00e6
            r23 = 1
            goto L_0x00e8
        L_0x00e6:
            r23 = r15
        L_0x00e8:
            zp4 r0 = r11.f7818k0
            long r5 = r0.f20631d
            int r0 = r12.mo6867f(r1)
            r1 = -1
            if (r0 != r1) goto L_0x00f5
            r17 = r20
        L_0x00f5:
            r1 = r24
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r23
            r10 = r17
            zp4 r0 = r1.mo11197K(r2, r3, r5, r7, r9, r10)
            r11.f7818k0 = r0
        L_0x0105:
            r24.mo11267q0()
            zp4 r0 = r11.f7818k0
            androidx.media3.common.s r0 = r0.f20628a
            r11.mo11273u0(r12, r0)
            zp4 r0 = r11.f7818k0
            zp4 r0 = r0.mo28555i(r12)
            r11.f7818k0 = r0
            boolean r0 = r25.mo6883u()
            if (r0 != 0) goto L_0x0120
            r6 = 0
            r11.f7832x1 = r6
        L_0x0120:
            r11.mo11187F(r15)
            return
        L_0x0124:
            r0 = move-exception
            r6 = 0
            goto L_0x012b
        L_0x0127:
            r0 = move-exception
            r20 = r4
            r15 = r5
        L_0x012b:
            zp4 r1 = r11.f7818k0
            androidx.media3.common.s r4 = r1.f20628a
            androidx.media3.exoplayer.source.i$b r5 = r1.f20629b
            boolean r1 = r7.f7861f
            if (r1 == 0) goto L_0x0137
            r18 = r13
        L_0x0137:
            r1 = r24
            r2 = r25
            r3 = r8
            r15 = r6
            r6 = r18
            r1.mo11257m1(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x014c
            zp4 r1 = r11.f7818k0
            long r1 = r1.f20630c
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x018a
        L_0x014c:
            zp4 r1 = r11.f7818k0
            androidx.media3.exoplayer.source.i$b r2 = r1.f20629b
            java.lang.Object r2 = r2.f15659a
            androidx.media3.common.s r1 = r1.f20628a
            if (r16 == 0) goto L_0x016b
            if (r26 == 0) goto L_0x016b
            boolean r3 = r1.mo6883u()
            if (r3 != 0) goto L_0x016b
            androidx.media3.common.s$b r3 = r11.f7797C
            androidx.media3.common.s$b r1 = r1.mo6874l(r2, r3)
            boolean r1 = r1.f4441r
            if (r1 != 0) goto L_0x016b
            r23 = 1
            goto L_0x016d
        L_0x016b:
            r23 = 0
        L_0x016d:
            zp4 r1 = r11.f7818k0
            long r5 = r1.f20631d
            int r1 = r12.mo6867f(r2)
            r2 = -1
            if (r1 != r2) goto L_0x017a
            r17 = r20
        L_0x017a:
            r1 = r24
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r23
            r10 = r17
            zp4 r1 = r1.mo11197K(r2, r3, r5, r7, r9, r10)
            r11.f7818k0 = r1
        L_0x018a:
            r24.mo11267q0()
            zp4 r1 = r11.f7818k0
            androidx.media3.common.s r1 = r1.f20628a
            r11.mo11273u0(r12, r1)
            zp4 r1 = r11.f7818k0
            zp4 r1 = r1.mo28555i(r12)
            r11.f7818k0 = r1
            boolean r1 = r25.mo6883u()
            if (r1 != 0) goto L_0x01a4
            r11.f7832x1 = r15
        L_0x01a4:
            r1 = 0
            r11.mo11187F(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ax1.mo11189G(androidx.media3.common.s, boolean):void");
    }

    /* renamed from: G0 */
    public final void mo11190G0(cr4 cr4) {
        Looper c = cr4.mo18266c();
        if (!c.getThread().isAlive()) {
            gk3.m18132i("TAG", "Trying to send message on a dead thread.");
            cr4.mo18274k(false);
            return;
        }
        this.f7804P.mo18771c(c, (Handler.Callback) null).mo22780h(new zw1(this, cr4));
    }

    /* renamed from: H */
    public final void mo11191H(C0971h hVar) throws ExoPlaybackException {
        if (this.f7806U.mo25246v(hVar)) {
            mr3 j = this.f7806U.mo25234j();
            j.mo23369p(this.f7802L.mo108d().f4406a, this.f7818k0.f20628a);
            mo11248j1(j.mo23367n(), j.mo23368o());
            if (j == this.f7806U.mo25240p()) {
                mo11269r0(j.f15230f.f16039b);
                mo11266q();
                zp4 zp4 = this.f7818k0;
                C0973i.C0975b bVar = zp4.f20629b;
                long j2 = j.f15230f.f16039b;
                this.f7818k0 = mo11197K(bVar, j2, zp4.f20630c, j2, false, 5);
            }
            mo11212U();
        }
    }

    /* renamed from: H0 */
    public final void mo11192H0(long j) {
        for (md5 md5 : this.f7810a) {
            if (md5.mo21686h() != null) {
                mo11194I0(md5, j);
            }
        }
    }

    /* renamed from: I */
    public final void mo11193I(C0820n nVar, float f, boolean z, boolean z2) throws ExoPlaybackException {
        if (z) {
            if (z2) {
                this.f7828v0.mo11285b(1);
            }
            this.f7818k0 = this.f7818k0.mo28552f(nVar);
        }
        mo11260n1(nVar.f4406a);
        for (md5 md5 : this.f7810a) {
            if (md5 != null) {
                md5.mo7465r(f, nVar.f4406a);
            }
        }
    }

    /* renamed from: I0 */
    public final void mo11194I0(md5 md5, long j) {
        md5.mo21688j();
        if (md5 instanceof co6) {
            ((co6) md5).mo12152Y(j);
        }
    }

    /* renamed from: J */
    public final void mo11195J(C0820n nVar, boolean z) throws ExoPlaybackException {
        mo11193I(nVar, nVar.f4406a, true, z);
    }

    /* renamed from: J0 */
    public final void mo11196J0(boolean z, AtomicBoolean atomicBoolean) {
        if (this.f7826t1 != z) {
            this.f7826t1 = z;
            if (!z) {
                for (md5 md5 : this.f7810a) {
                    if (!m10851P(md5) && this.f7812d.remove(md5)) {
                        md5.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* renamed from: K */
    public final zp4 mo11197K(C0973i.C0975b bVar, long j, long j2, long j3, boolean z, int i) {
        boolean z2;
        ImmutableList<Metadata> immutableList;
        gt6 gt6;
        ws6 ws6;
        ws6 ws62;
        gt6 gt62;
        C0973i.C0975b bVar2 = bVar;
        long j4 = j2;
        if (this.f7794A1 || j != this.f7818k0.f20645r || !bVar.equals(this.f7818k0.f20629b)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f7794A1 = z2;
        mo11267q0();
        zp4 zp4 = this.f7818k0;
        ws6 ws63 = zp4.f20635h;
        gt6 gt63 = zp4.f20636i;
        List<Metadata> list = zp4.f20637j;
        if (this.f7807X.mo20151s()) {
            mr3 p = this.f7806U.mo25240p();
            if (p == null) {
                ws62 = ws6.f19232g;
            } else {
                ws62 = p.mo23367n();
            }
            if (p == null) {
                gt62 = this.f7817k;
            } else {
                gt62 = p.mo23368o();
            }
            ImmutableList<Metadata> u = mo11272u(gt62.f12611c);
            if (p != null) {
                or3 or3 = p.f15230f;
                if (or3.f16040c != j4) {
                    p.f15230f = or3.mo24082a(j4);
                }
            }
            ws6 = ws62;
            gt6 = gt62;
            immutableList = u;
        } else if (!bVar.equals(this.f7818k0.f20629b)) {
            ws6 ws64 = ws6.f19232g;
            ws6 = ws64;
            gt6 = this.f7817k;
            immutableList = ImmutableList.m36627of();
        } else {
            immutableList = list;
            ws6 = ws63;
            gt6 = gt63;
        }
        if (z) {
            this.f7828v0.mo11288e(i);
        }
        return this.f7818k0.mo28549c(bVar, j, j2, j3, mo11179B(), ws6, gt6, immutableList);
    }

    /* renamed from: K0 */
    public final void mo11198K0(C1589b bVar) throws ExoPlaybackException {
        this.f7828v0.mo11285b(1);
        if (bVar.f7839c != -1) {
            this.f7832x1 = new C1595h(new dr4(bVar.f7837a, bVar.f7838b), bVar.f7839c, bVar.f7840d);
        }
        mo11189G(this.f7807X.mo20141C(bVar.f7837a, bVar.f7838b), false);
    }

    /* renamed from: L */
    public final boolean mo11199L(md5 md5, mr3 mr3) {
        mr3 j = mr3.mo23363j();
        if (!mr3.f15230f.f16043f || !j.f15228d || (!(md5 instanceof co6) && !(md5 instanceof jv3) && md5.mo21698v() < j.mo23366m())) {
            return false;
        }
        return true;
    }

    /* renamed from: L0 */
    public void mo11200L0(List<fs3.C2325c> list, int i, long j, x06 x06) {
        this.f7831x.mo22776d(17, new C1589b(list, x06, i, j, (C1588a) null)).mo22784a();
    }

    /* renamed from: M */
    public final boolean mo11201M() {
        mr3 q = this.f7806U.mo25241q();
        if (!q.f15228d) {
            return false;
        }
        int i = 0;
        while (true) {
            md5[] md5Arr = this.f7810a;
            if (i >= md5Arr.length) {
                return true;
            }
            md5 md5 = md5Arr[i];
            yk5 yk5 = q.f15227c[i];
            if (md5.mo21686h() != yk5 || (yk5 != null && !md5.mo21687i() && !mo11199L(md5, q))) {
                return false;
            }
            i++;
        }
        return false;
    }

    /* renamed from: M0 */
    public final void mo11202M0(boolean z) {
        if (z != this.f7829v1) {
            this.f7829v1 = z;
            if (!z && this.f7818k0.f20642o) {
                this.f7831x.mo22781i(2);
            }
        }
    }

    /* renamed from: N0 */
    public final void mo11203N0(boolean z) throws ExoPlaybackException {
        this.f7815e1 = z;
        mo11267q0();
        if (this.f7819o1 && this.f7806U.mo25241q() != this.f7806U.mo25240p()) {
            mo11178A0(true);
            mo11187F(false);
        }
    }

    /* renamed from: O */
    public final boolean mo11204O() {
        mr3 j = this.f7806U.mo25234j();
        if (j == null || j.mo23364k() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: O0 */
    public void mo11205O0(boolean z, int i) {
        this.f7831x.mo22778f(1, z ? 1 : 0, i).mo22784a();
    }

    /* renamed from: P0 */
    public final void mo11206P0(boolean z, int i, boolean z2, int i2) throws ExoPlaybackException {
        this.f7828v0.mo11285b(z2 ? 1 : 0);
        this.f7828v0.mo11286c(i2);
        this.f7818k0 = this.f7818k0.mo28550d(z, i);
        this.f7820p1 = false;
        mo11235e0(z);
        if (!mo11229b1()) {
            mo11242h1();
            mo11254l1();
            return;
        }
        int i3 = this.f7818k0.f20632e;
        if (i3 == 3) {
            mo11236e1();
            this.f7831x.mo22781i(2);
        } else if (i3 == 2) {
            this.f7831x.mo22781i(2);
        }
    }

    /* renamed from: Q */
    public final boolean mo11207Q() {
        mr3 p = this.f7806U.mo25240p();
        long j = p.f15230f.f16042e;
        if (!p.f15228d || (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && this.f7818k0.f20645r >= j && mo11229b1())) {
            return false;
        }
        return true;
    }

    /* renamed from: Q0 */
    public void mo11208Q0(C0820n nVar) {
        this.f7831x.mo22776d(4, nVar).mo22784a();
    }

    /* renamed from: R0 */
    public final void mo11209R0(C0820n nVar) throws ExoPlaybackException {
        this.f7802L.mo106b(nVar);
        mo11195J(this.f7802L.mo108d(), true);
    }

    /* renamed from: S0 */
    public void mo11210S0(int i) {
        this.f7831x.mo22778f(11, i, 0).mo22784a();
    }

    /* renamed from: T0 */
    public final void mo11211T0(int i) throws ExoPlaybackException {
        this.f7823r1 = i;
        if (!this.f7806U.mo25224G(this.f7818k0.f20628a, i)) {
            mo11178A0(true);
        }
        mo11187F(false);
    }

    /* renamed from: U */
    public final void mo11212U() {
        boolean a1 = mo11226a1();
        this.f7821q1 = a1;
        if (a1) {
            this.f7806U.mo25234j().mo23358d(this.f7834y1);
        }
        mo11245i1();
    }

    /* renamed from: U0 */
    public final void mo11213U0(ys5 ys5) {
        this.f7814e0 = ys5;
    }

    /* renamed from: V */
    public final void mo11214V() {
        this.f7828v0.mo11287d(this.f7818k0);
        if (this.f7828v0.f7849a) {
            this.f7805Q.mo11289a(this.f7828v0);
            this.f7828v0 = new C1592e(this.f7818k0);
        }
    }

    /* renamed from: V0 */
    public void mo11215V0(boolean z) {
        this.f7831x.mo22778f(12, z ? 1 : 0, 0).mo22784a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090 A[LOOP:1: B:24:0x0074->B:34:0x0090, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0062 A[EDGE_INSN: B:65:0x0062->B:20:0x0062 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0073 A[EDGE_INSN: B:72:0x0073->B:23:0x0073 ?: BREAK  , SYNTHETIC] */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11216W(long r8, long r10) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r7 = this;
            java.util.ArrayList<ax1$d> r0 = r7.f7803M
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00f7
            zp4 r0 = r7.f7818k0
            androidx.media3.exoplayer.source.i$b r0 = r0.f20629b
            boolean r0 = r0.mo23781b()
            if (r0 == 0) goto L_0x0014
            goto L_0x00f7
        L_0x0014:
            boolean r0 = r7.f7794A1
            if (r0 == 0) goto L_0x001e
            r0 = 1
            long r8 = r8 - r0
            r0 = 0
            r7.f7794A1 = r0
        L_0x001e:
            zp4 r0 = r7.f7818k0
            androidx.media3.common.s r1 = r0.f20628a
            androidx.media3.exoplayer.source.i$b r0 = r0.f20629b
            java.lang.Object r0 = r0.f15659a
            int r0 = r1.mo6867f(r0)
            int r1 = r7.f7835z1
            java.util.ArrayList<ax1$d> r2 = r7.f7803M
            int r2 = r2.size()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            if (r1 <= 0) goto L_0x0044
            java.util.ArrayList<ax1$d> r3 = r7.f7803M
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            ax1$d r3 = (p000.ax1.C1591d) r3
            goto L_0x0045
        L_0x0044:
            r3 = r2
        L_0x0045:
            if (r3 == 0) goto L_0x0062
            int r4 = r3.f7846d
            if (r4 > r0) goto L_0x0053
            if (r4 != r0) goto L_0x0062
            long r3 = r3.f7847e
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x0062
        L_0x0053:
            int r1 = r1 + -1
            if (r1 <= 0) goto L_0x0044
            java.util.ArrayList<ax1$d> r3 = r7.f7803M
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            ax1$d r3 = (p000.ax1.C1591d) r3
            goto L_0x0045
        L_0x0062:
            java.util.ArrayList<ax1$d> r3 = r7.f7803M
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0073
            java.util.ArrayList<ax1$d> r3 = r7.f7803M
            java.lang.Object r3 = r3.get(r1)
            ax1$d r3 = (p000.ax1.C1591d) r3
            goto L_0x0074
        L_0x0073:
            r3 = r2
        L_0x0074:
            if (r3 == 0) goto L_0x0099
            java.lang.Object r4 = r3.f7848g
            if (r4 == 0) goto L_0x0099
            int r4 = r3.f7846d
            if (r4 < r0) goto L_0x0086
            if (r4 != r0) goto L_0x0099
            long r4 = r3.f7847e
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0099
        L_0x0086:
            int r1 = r1 + 1
            java.util.ArrayList<ax1$d> r3 = r7.f7803M
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0073
            java.util.ArrayList<ax1$d> r3 = r7.f7803M
            java.lang.Object r3 = r3.get(r1)
            ax1$d r3 = (p000.ax1.C1591d) r3
            goto L_0x0074
        L_0x0099:
            if (r3 == 0) goto L_0x00f5
            java.lang.Object r4 = r3.f7848g
            if (r4 == 0) goto L_0x00f5
            int r4 = r3.f7846d
            if (r4 != r0) goto L_0x00f5
            long r4 = r3.f7847e
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x00f5
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x00f5
            cr4 r4 = r3.f7845a     // Catch:{ all -> 0x00de }
            r7.mo11188F0(r4)     // Catch:{ all -> 0x00de }
            cr4 r4 = r3.f7845a
            boolean r4 = r4.mo18265b()
            if (r4 != 0) goto L_0x00c6
            cr4 r3 = r3.f7845a
            boolean r3 = r3.mo18273j()
            if (r3 == 0) goto L_0x00c3
            goto L_0x00c6
        L_0x00c3:
            int r1 = r1 + 1
            goto L_0x00cb
        L_0x00c6:
            java.util.ArrayList<ax1$d> r3 = r7.f7803M
            r3.remove(r1)
        L_0x00cb:
            java.util.ArrayList<ax1$d> r3 = r7.f7803M
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00dc
            java.util.ArrayList<ax1$d> r3 = r7.f7803M
            java.lang.Object r3 = r3.get(r1)
            ax1$d r3 = (p000.ax1.C1591d) r3
            goto L_0x0099
        L_0x00dc:
            r3 = r2
            goto L_0x0099
        L_0x00de:
            r8 = move-exception
            cr4 r9 = r3.f7845a
            boolean r9 = r9.mo18265b()
            if (r9 != 0) goto L_0x00ef
            cr4 r9 = r3.f7845a
            boolean r9 = r9.mo18273j()
            if (r9 == 0) goto L_0x00f4
        L_0x00ef:
            java.util.ArrayList<ax1$d> r9 = r7.f7803M
            r9.remove(r1)
        L_0x00f4:
            throw r8
        L_0x00f5:
            r7.f7835z1 = r1
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ax1.mo11216W(long, long):void");
    }

    /* renamed from: W0 */
    public final void mo11217W0(boolean z) throws ExoPlaybackException {
        this.f7825s1 = z;
        if (!this.f7806U.mo25225H(this.f7818k0.f20628a, z)) {
            mo11178A0(true);
        }
        mo11187F(false);
    }

    /* renamed from: X */
    public final void mo11218X() throws ExoPlaybackException {
        or3 o;
        this.f7806U.mo25248y(this.f7834y1);
        if (this.f7806U.mo25221D() && (o = this.f7806U.mo25239o(this.f7834y1, this.f7818k0)) != null) {
            mr3 g = this.f7806U.mo25231g(this.f7813e, this.f7816g, this.f7822r.mo26454e(), this.f7807X, o, this.f7817k);
            g.f15225a.mo7254q(this, o.f16039b);
            if (this.f7806U.mo25240p() == g) {
                mo11269r0(o.f16039b);
            }
            mo11187F(false);
        }
        if (this.f7821q1) {
            this.f7821q1 = mo11204O();
            mo11245i1();
            return;
        }
        mo11212U();
    }

    /* renamed from: X0 */
    public final void mo11219X0(x06 x06) throws ExoPlaybackException {
        this.f7828v0.mo11285b(1);
        mo11189G(this.f7807X.mo20142D(x06), false);
    }

    /* renamed from: Y */
    public final void mo11220Y() throws ExoPlaybackException {
        boolean z;
        boolean z2 = false;
        while (mo11223Z0()) {
            if (z2) {
                mo11214V();
            }
            mr3 mr3 = (mr3) C2725kr.m20985e(this.f7806U.mo25226b());
            if (this.f7818k0.f20629b.f15659a.equals(mr3.f15230f.f16038a.f15659a)) {
                C0973i.C0975b bVar = this.f7818k0.f20629b;
                if (bVar.f15660b == -1) {
                    C0973i.C0975b bVar2 = mr3.f15230f.f16038a;
                    if (bVar2.f15660b == -1 && bVar.f15663e != bVar2.f15663e) {
                        z = true;
                        or3 or3 = mr3.f15230f;
                        C0973i.C0975b bVar3 = or3.f16038a;
                        long j = or3.f16039b;
                        this.f7818k0 = mo11197K(bVar3, j, or3.f16040c, j, !z, 0);
                        mo11267q0();
                        mo11254l1();
                        z2 = true;
                    }
                }
            }
            z = false;
            or3 or32 = mr3.f15230f;
            C0973i.C0975b bVar32 = or32.f16038a;
            long j2 = or32.f16039b;
            this.f7818k0 = mo11197K(bVar32, j2, or32.f16040c, j2, !z, 0);
            mo11267q0();
            mo11254l1();
            z2 = true;
        }
    }

    /* renamed from: Y0 */
    public final void mo11221Y0(int i) {
        zp4 zp4 = this.f7818k0;
        if (zp4.f20632e != i) {
            if (i != 2) {
                this.f7799D1 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            }
            this.f7818k0 = zp4.mo28553g(i);
        }
    }

    /* renamed from: Z */
    public final void mo11222Z() {
        long j;
        boolean z;
        mr3 q = this.f7806U.mo25241q();
        if (q != null) {
            int i = 0;
            if (q.mo23363j() == null || this.f7819o1) {
                if (q.f15230f.f16046i || this.f7819o1) {
                    while (true) {
                        md5[] md5Arr = this.f7810a;
                        if (i < md5Arr.length) {
                            md5 md5 = md5Arr[i];
                            yk5 yk5 = q.f15227c[i];
                            if (yk5 != null && md5.mo21686h() == yk5 && md5.mo21687i()) {
                                long j2 = q.f15230f.f16042e;
                                if (j2 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || j2 == Long.MIN_VALUE) {
                                    j = -9223372036854775807L;
                                } else {
                                    j = q.mo23365l() + q.f15230f.f16042e;
                                }
                                mo11194I0(md5, j);
                            }
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (mo11201M()) {
                if (q.mo23363j().f15228d || this.f7834y1 >= q.mo23363j().mo23366m()) {
                    gt6 o = q.mo23368o();
                    mr3 c = this.f7806U.mo25227c();
                    gt6 o2 = c.mo23368o();
                    C0831s sVar = this.f7818k0.f20628a;
                    mo11257m1(sVar, c.f15230f.f16038a, sVar, q.f15230f.f16038a, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
                    if (!c.f15228d || c.f15225a.mo7251m() == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                        for (int i2 = 0; i2 < this.f7810a.length; i2++) {
                            boolean c2 = o.mo20847c(i2);
                            boolean c3 = o2.mo20847c(i2);
                            if (c2 && !this.f7810a[i2].mo21691n()) {
                                if (this.f7813e[i2].mo21684f() == -2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                pd5 pd5 = o.f12610b[i2];
                                pd5 pd52 = o2.f12610b[i2];
                                if (!c3 || !pd52.equals(pd5) || z) {
                                    mo11194I0(this.f7810a[i2], c.mo23366m());
                                }
                            }
                        }
                        return;
                    }
                    mo11192H0(c.mo23366m());
                }
            }
        }
    }

    /* renamed from: Z0 */
    public final boolean mo11223Z0() {
        mr3 p;
        mr3 j;
        if (mo11229b1() && !this.f7819o1 && (p = this.f7806U.mo25240p()) != null && (j = p.mo23363j()) != null && this.f7834y1 >= j.mo23366m() && j.f15231g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo11224a() {
        this.f7831x.mo22781i(10);
    }

    /* renamed from: a0 */
    public final void mo11225a0() throws ExoPlaybackException {
        mr3 q = this.f7806U.mo25241q();
        if (q != null && this.f7806U.mo25240p() != q && !q.f15231g && mo11259n0()) {
            mo11266q();
        }
    }

    /* renamed from: a1 */
    public final boolean mo11226a1() {
        long j;
        if (!mo11204O()) {
            return false;
        }
        mr3 j2 = this.f7806U.mo25234j();
        long C = mo11181C(j2.mo23364k());
        if (j2 == this.f7806U.mo25240p()) {
            j = j2.mo23377y(this.f7834y1);
        } else {
            j = j2.mo23377y(this.f7834y1) - j2.f15230f.f16039b;
        }
        return this.f7822r.mo26458i(j, C, this.f7802L.mo108d().f4406a);
    }

    /* renamed from: b */
    public void mo11227b() {
        this.f7831x.mo22781i(22);
    }

    /* renamed from: b0 */
    public final void mo11228b0() throws ExoPlaybackException {
        mo11189G(this.f7807X.mo20146i(), true);
    }

    /* renamed from: b1 */
    public final boolean mo11229b1() {
        zp4 zp4 = this.f7818k0;
        if (!zp4.f20639l || zp4.f20640m != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public synchronized void mo11230c(cr4 cr4) {
        if (!this.f7811b1) {
            if (this.f7833y.isAlive()) {
                this.f7831x.mo22776d(14, cr4).mo22784a();
                return;
            }
        }
        gk3.m18132i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        cr4.mo18274k(false);
    }

    /* renamed from: c0 */
    public final void mo11231c0(C1590c cVar) throws ExoPlaybackException {
        this.f7828v0.mo11285b(1);
        mo11189G(this.f7807X.mo20153v(cVar.f7841a, cVar.f7842b, cVar.f7843c, cVar.f7844d), false);
    }

    /* renamed from: c1 */
    public final boolean mo11232c1(boolean z) {
        long j;
        boolean z2;
        boolean z3;
        if (this.f7830w1 == 0) {
            return mo11207Q();
        }
        if (!z) {
            return false;
        }
        zp4 zp4 = this.f7818k0;
        if (!zp4.f20634g) {
            return true;
        }
        if (mo11234d1(zp4.f20628a, this.f7806U.mo25240p().f15230f.f16038a)) {
            j = this.f7808Y.mo25114c();
        } else {
            j = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        long j2 = j;
        mr3 j3 = this.f7806U.mo25234j();
        if (!j3.mo23370q() || !j3.f15230f.f16046i) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!j3.f15230f.f16038a.mo23781b() || j3.f15228d) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2 || z3 || this.f7822r.mo26453d(mo11179B(), this.f7802L.mo108d().f4406a, this.f7820p1, j2)) {
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    public final void mo11233d0() {
        for (mr3 p = this.f7806U.mo25240p(); p != null; p = p.mo23363j()) {
            for (dx1 dx1 : p.mo23368o().f12611c) {
                if (dx1 != null) {
                    dx1.mo7674k();
                }
            }
        }
    }

    /* renamed from: d1 */
    public final boolean mo11234d1(C0831s sVar, C0973i.C0975b bVar) {
        if (bVar.mo23781b() || sVar.mo6883u()) {
            return false;
        }
        sVar.mo6880r(sVar.mo6874l(bVar.f15659a, this.f7797C).f4438e, this.f7795B);
        if (!this.f7795B.mo6914i()) {
            return false;
        }
        C0831s.C0835d dVar = this.f7795B;
        if (!dVar.f4467y || dVar.f4464r == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return false;
        }
        return true;
    }

    /* renamed from: e0 */
    public final void mo11235e0(boolean z) {
        for (mr3 p = this.f7806U.mo25240p(); p != null; p = p.mo23363j()) {
            for (dx1 dx1 : p.mo23368o().f12611c) {
                if (dx1 != null) {
                    dx1.mo7679o(z);
                }
            }
        }
    }

    /* renamed from: e1 */
    public final void mo11236e1() throws ExoPlaybackException {
        this.f7820p1 = false;
        this.f7802L.mo28377g();
        for (md5 md5 : this.f7810a) {
            if (m10851P(md5)) {
                md5.start();
            }
        }
    }

    /* renamed from: f */
    public void mo7587f(C0971h hVar) {
        this.f7831x.mo22776d(8, hVar).mo22784a();
    }

    /* renamed from: f0 */
    public final void mo11237f0() {
        for (mr3 p = this.f7806U.mo25240p(); p != null; p = p.mo23363j()) {
            for (dx1 dx1 : p.mo23368o().f12611c) {
                if (dx1 != null) {
                    dx1.mo7684t();
                }
            }
        }
    }

    /* renamed from: f1 */
    public void mo11238f1() {
        this.f7831x.mo22773a(6).mo22784a();
    }

    /* renamed from: g0 */
    public void mo7246g(C0971h hVar) {
        this.f7831x.mo22776d(9, hVar).mo22784a();
    }

    /* renamed from: g1 */
    public final void mo11240g1(boolean z, boolean z2) {
        boolean z3;
        if (z || !this.f7826t1) {
            z3 = true;
        } else {
            z3 = false;
        }
        mo11265p0(z3, false, true, false);
        this.f7828v0.mo11285b(z2 ? 1 : 0);
        this.f7822r.mo26455f();
        mo11221Y0(1);
    }

    /* renamed from: h0 */
    public void mo11241h0() {
        this.f7831x.mo22773a(0).mo22784a();
    }

    /* renamed from: h1 */
    public final void mo11242h1() throws ExoPlaybackException {
        this.f7802L.mo28378h();
        for (md5 md5 : this.f7810a) {
            if (m10851P(md5)) {
                mo11270s(md5);
            }
        }
    }

    public boolean handleMessage(Message message) {
        mr3 q;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2 = 1000;
        try {
            switch (message.what) {
                case 0:
                    mo11244i0();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mo11206P0(z, message.arg2, true, 1);
                    break;
                case 2:
                    mo11261o();
                    break;
                case 3:
                    mo11180B0((C1595h) message.obj);
                    break;
                case 4:
                    mo11209R0((C0820n) message.obj);
                    break;
                case 5:
                    mo11213U0((ys5) message.obj);
                    break;
                case 6:
                    mo11240g1(false, true);
                    break;
                case 7:
                    mo11250k0();
                    return true;
                case 8:
                    mo11191H((C0971h) message.obj);
                    break;
                case 9:
                    mo11183D((C0971h) message.obj);
                    break;
                case 10:
                    mo11262o0();
                    break;
                case 11:
                    mo11211T0(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    mo11217W0(z2);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    mo11196J0(z3, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    mo11186E0((cr4) message.obj);
                    break;
                case 15:
                    mo11190G0((cr4) message.obj);
                    break;
                case 16:
                    mo11195J((C0820n) message.obj, false);
                    break;
                case 17:
                    mo11198K0((C1589b) message.obj);
                    break;
                case 18:
                    mo11246j((C1589b) message.obj, message.arg1);
                    break;
                case 19:
                    mo11231c0((C1590c) message.obj);
                    break;
                case 20:
                    mo11253l0(message.arg1, message.arg2, (x06) message.obj);
                    break;
                case 21:
                    mo11219X0((x06) message.obj);
                    break;
                case 22:
                    mo11228b0();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    mo11203N0(z4);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    mo11202M0(z5);
                    break;
                case 25:
                    mo11252l();
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e) {
            e = e;
            if (e.type == 1 && (q = this.f7806U.mo25241q()) != null) {
                e = e.copyWithMediaPeriodId(q.f15230f.f16038a);
            }
            if (!e.isRecoverable || this.f7796B1 != null) {
                ExoPlaybackException exoPlaybackException = this.f7796B1;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f7796B1;
                }
                gk3.m18127d("ExoPlayerImplInternal", "Playback error", e);
                mo11240g1(true, false);
                this.f7818k0 = this.f7818k0.mo28551e(e);
            } else {
                gk3.m18133j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f7796B1 = e;
                xk2 xk2 = this.f7831x;
                xk2.mo22779g(xk2.mo22776d(25, e));
            }
        } catch (DrmSession.DrmSessionException e2) {
            mo11185E(e2, e2.errorCode);
        } catch (ParserException e3) {
            int i3 = e3.dataType;
            if (i3 != 1) {
                if (i3 == 4) {
                    if (e3.contentIsMalformed) {
                        i = PlaybackException.ERROR_CODE_PARSING_MANIFEST_MALFORMED;
                    } else {
                        i = PlaybackException.ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED;
                    }
                }
                mo11185E(e3, i2);
            } else if (e3.contentIsMalformed) {
                i = PlaybackException.ERROR_CODE_PARSING_CONTAINER_MALFORMED;
            } else {
                i = PlaybackException.ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED;
            }
            i2 = i;
            mo11185E(e3, i2);
        } catch (DataSourceException e4) {
            mo11185E(e4, e4.reason);
        } catch (BehindLiveWindowException e5) {
            mo11185E(e5, PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW);
        } catch (IOException e6) {
            mo11185E(e6, PlaybackException.ERROR_CODE_IO_UNSPECIFIED);
        } catch (RuntimeException e7) {
            if ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) {
                i2 = PlaybackException.ERROR_CODE_FAILED_RUNTIME_CHECK;
            }
            ExoPlaybackException createForUnexpected = ExoPlaybackException.createForUnexpected(e7, i2);
            gk3.m18127d("ExoPlayerImplInternal", "Playback error", createForUnexpected);
            mo11240g1(true, false);
            this.f7818k0 = this.f7818k0.mo28551e(createForUnexpected);
        }
        mo11214V();
        return true;
    }

    /* renamed from: i0 */
    public final void mo11244i0() {
        int i;
        this.f7828v0.mo11285b(1);
        mo11265p0(false, false, false, true);
        this.f7822r.mo26452c();
        if (this.f7818k0.f20628a.mo6883u()) {
            i = 4;
        } else {
            i = 2;
        }
        mo11221Y0(i);
        this.f7807X.mo20154w(this.f7824s.mo20256d());
        this.f7831x.mo22781i(2);
    }

    /* renamed from: i1 */
    public final void mo11245i1() {
        boolean z;
        mr3 j = this.f7806U.mo25234j();
        if (this.f7821q1 || (j != null && j.f15225a.mo7244d())) {
            z = true;
        } else {
            z = false;
        }
        zp4 zp4 = this.f7818k0;
        if (z != zp4.f20634g) {
            this.f7818k0 = zp4.mo28547a(z);
        }
    }

    /* renamed from: j */
    public final void mo11246j(C1589b bVar, int i) throws ExoPlaybackException {
        this.f7828v0.mo11285b(1);
        fs3 fs3 = this.f7807X;
        if (i == -1) {
            i = fs3.mo20150q();
        }
        mo11189G(fs3.mo20143f(i, bVar.f7837a, bVar.f7838b), false);
    }

    /* renamed from: j0 */
    public synchronized boolean mo11247j0() {
        if (!this.f7811b1) {
            if (this.f7833y.isAlive()) {
                this.f7831x.mo22781i(7);
                mo11263o1(new yw1(this), this.f7809Z);
                return this.f7811b1;
            }
        }
        return true;
    }

    /* renamed from: j1 */
    public final void mo11248j1(ws6 ws6, gt6 gt6) {
        this.f7822r.mo26456g(this.f7810a, ws6, gt6.f12611c);
    }

    /* renamed from: k */
    public void mo11249k(C0820n nVar) {
        this.f7831x.mo22776d(16, nVar).mo22784a();
    }

    /* renamed from: k0 */
    public final void mo11250k0() {
        mo11265p0(true, false, true, false);
        this.f7822r.mo26457h();
        mo11221Y0(1);
        this.f7833y.quit();
        synchronized (this) {
            this.f7811b1 = true;
            notifyAll();
        }
    }

    /* renamed from: k1 */
    public final void mo11251k1() throws ExoPlaybackException, IOException {
        if (!this.f7818k0.f20628a.mo6883u() && this.f7807X.mo20151s()) {
            mo11218X();
            mo11222Z();
            mo11225a0();
            mo11220Y();
        }
    }

    /* renamed from: l */
    public final void mo11252l() throws ExoPlaybackException {
        mo11178A0(true);
    }

    /* renamed from: l0 */
    public final void mo11253l0(int i, int i2, x06 x06) throws ExoPlaybackException {
        this.f7828v0.mo11285b(1);
        mo11189G(this.f7807X.mo20139A(i, i2, x06), false);
    }

    /* renamed from: l1 */
    public final void mo11254l1() throws ExoPlaybackException {
        long j;
        boolean z;
        mr3 p = this.f7806U.mo25240p();
        if (p != null) {
            if (p.f15228d) {
                j = p.f15225a.mo7251m();
            } else {
                j = -9223372036854775807L;
            }
            if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                mo11269r0(j);
                if (j != this.f7818k0.f20645r) {
                    zp4 zp4 = this.f7818k0;
                    this.f7818k0 = mo11197K(zp4.f20629b, j, zp4.f20630c, j, true, 5);
                }
            } else {
                z81 z81 = this.f7802L;
                if (p != this.f7806U.mo25241q()) {
                    z = true;
                } else {
                    z = false;
                }
                long i = z81.mo28379i(z);
                this.f7834y1 = i;
                long y = p.mo23377y(i);
                mo11216W(this.f7818k0.f20645r, y);
                this.f7818k0.f20645r = y;
            }
            this.f7818k0.f20643p = this.f7806U.mo25234j().mo23362i();
            this.f7818k0.f20644q = mo11179B();
            zp4 zp42 = this.f7818k0;
            if (zp42.f20639l && zp42.f20632e == 3 && mo11234d1(zp42.f20628a, zp42.f20629b) && this.f7818k0.f20641n.f4406a == 1.0f) {
                float b = this.f7808Y.mo25113b(mo11274v(), mo11179B());
                if (this.f7802L.mo108d().f4406a != b) {
                    this.f7802L.mo106b(this.f7818k0.f20641n.mo6838e(b));
                    mo11193I(this.f7818k0.f20641n, this.f7802L.mo108d().f4406a, false, false);
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo11255m(cr4 cr4) throws ExoPlaybackException {
        if (!cr4.mo18273j()) {
            try {
                cr4.mo18270g().mo7154k(cr4.mo18272i(), cr4.mo18268e());
            } finally {
                cr4.mo18274k(true);
            }
        }
    }

    /* renamed from: m0 */
    public void mo11256m0(int i, int i2, x06 x06) {
        this.f7831x.mo22775c(20, i, i2, x06).mo22784a();
    }

    /* renamed from: m1 */
    public final void mo11257m1(C0831s sVar, C0973i.C0975b bVar, C0831s sVar2, C0973i.C0975b bVar2, long j) {
        C0820n nVar;
        if (!mo11234d1(sVar, bVar)) {
            if (bVar.mo23781b()) {
                nVar = C0820n.f4404g;
            } else {
                nVar = this.f7818k0.f20641n;
            }
            if (!this.f7802L.mo108d().equals(nVar)) {
                this.f7802L.mo106b(nVar);
                return;
            }
            return;
        }
        sVar.mo6880r(sVar.mo6874l(bVar.f15659a, this.f7797C).f4438e, this.f7795B);
        this.f7808Y.mo25112a((C0798k.C0807g) w67.m29360j(this.f7795B.f4452B));
        if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            this.f7808Y.mo25116e(mo11275x(sVar, bVar.f15659a, j));
            return;
        }
        Object obj = this.f7795B.f4459a;
        Object obj2 = null;
        if (!sVar2.mo6883u()) {
            obj2 = sVar2.mo6880r(sVar2.mo6874l(bVar2.f15659a, this.f7797C).f4438e, this.f7795B).f4459a;
        }
        if (!w67.m29346c(obj2, obj)) {
            this.f7808Y.mo25116e(CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
        }
    }

    /* renamed from: n */
    public final void mo11258n(md5 md5) throws ExoPlaybackException {
        if (m10851P(md5)) {
            this.f7802L.mo28373a(md5);
            mo11270s(md5);
            md5.mo21683c();
            this.f7830w1--;
        }
    }

    /* renamed from: n0 */
    public final boolean mo11259n0() throws ExoPlaybackException {
        boolean z;
        mr3 q = this.f7806U.mo25241q();
        gt6 o = q.mo23368o();
        int i = 0;
        boolean z2 = false;
        while (true) {
            md5[] md5Arr = this.f7810a;
            if (i >= md5Arr.length) {
                return !z2;
            }
            md5 md5 = md5Arr[i];
            if (m10851P(md5)) {
                if (md5.mo21686h() != q.f15227c[i]) {
                    z = true;
                } else {
                    z = false;
                }
                if (!o.mo20847c(i) || z) {
                    if (!md5.mo21691n()) {
                        md5.mo21692o(m10862w(o.f12611c[i]), q.f15227c[i], q.mo23366m(), q.mo23365l());
                    } else if (md5.mo7149e()) {
                        mo11258n(md5);
                    } else {
                        z2 = true;
                    }
                }
            }
            i++;
        }
    }

    /* renamed from: n1 */
    public final void mo11260n1(float f) {
        for (mr3 p = this.f7806U.mo25240p(); p != null; p = p.mo23363j()) {
            for (dx1 dx1 : p.mo23368o().f12611c) {
                if (dx1 != null) {
                    dx1.mo7672i(f);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11261o() throws androidx.media3.exoplayer.ExoPlaybackException, java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            dh0 r1 = r0.f7804P
            long r1 = r1.mo18769a()
            xk2 r3 = r0.f7831x
            r4 = 2
            r3.mo22783k(r4)
            r16.mo11251k1()
            zp4 r3 = r0.f7818k0
            int r3 = r3.f20632e
            r5 = 1
            if (r3 == r5) goto L_0x01f7
            r6 = 4
            if (r3 != r6) goto L_0x001d
            goto L_0x01f7
        L_0x001d:
            qr3 r3 = r0.f7806U
            mr3 r3 = r3.mo25240p()
            r7 = 10
            if (r3 != 0) goto L_0x002b
            r0.mo11277y0(r1, r7)
            return
        L_0x002b:
            java.lang.String r9 = "doSomeWork"
            p000.ps6.m25173a(r9)
            r16.mo11254l1()
            boolean r9 = r3.f15228d
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            if (r9 == 0) goto L_0x00ab
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r13 = r13 * r10
            androidx.media3.exoplayer.source.h r9 = r3.f15225a
            zp4 r15 = r0.f7818k0
            long r7 = r15.f20645r
            long r10 = r0.f7800H
            long r7 = r7 - r10
            boolean r10 = r0.f7801I
            r9.mo7256t(r7, r10)
            r8 = r5
            r9 = r8
            r7 = r12
        L_0x0050:
            md5[] r10 = r0.f7810a
            int r11 = r10.length
            if (r7 >= r11) goto L_0x00b2
            r10 = r10[r7]
            boolean r11 = m10851P(r10)
            if (r11 != 0) goto L_0x005e
            goto L_0x00a6
        L_0x005e:
            long r4 = r0.f7834y1
            r10.mo7468u(r4, r13)
            if (r8 == 0) goto L_0x006d
            boolean r4 = r10.mo7149e()
            if (r4 == 0) goto L_0x006d
            r8 = 1
            goto L_0x006e
        L_0x006d:
            r8 = r12
        L_0x006e:
            yk5[] r4 = r3.f15227c
            r4 = r4[r7]
            yk5 r5 = r10.mo21686h()
            if (r4 == r5) goto L_0x007a
            r4 = 1
            goto L_0x007b
        L_0x007a:
            r4 = r12
        L_0x007b:
            if (r4 != 0) goto L_0x0085
            boolean r5 = r10.mo21687i()
            if (r5 == 0) goto L_0x0085
            r5 = 1
            goto L_0x0086
        L_0x0085:
            r5 = r12
        L_0x0086:
            if (r4 != 0) goto L_0x0099
            if (r5 != 0) goto L_0x0099
            boolean r4 = r10.mo7150g()
            if (r4 != 0) goto L_0x0099
            boolean r4 = r10.mo7149e()
            if (r4 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r4 = r12
            goto L_0x009a
        L_0x0099:
            r4 = 1
        L_0x009a:
            if (r9 == 0) goto L_0x00a0
            if (r4 == 0) goto L_0x00a0
            r9 = 1
            goto L_0x00a1
        L_0x00a0:
            r9 = r12
        L_0x00a1:
            if (r4 != 0) goto L_0x00a6
            r10.mo21690m()
        L_0x00a6:
            int r7 = r7 + 1
            r4 = 2
            r5 = 1
            goto L_0x0050
        L_0x00ab:
            androidx.media3.exoplayer.source.h r4 = r3.f15225a
            r4.mo7252o()
            r8 = 1
            r9 = 1
        L_0x00b2:
            or3 r4 = r3.f15230f
            long r4 = r4.f16042e
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == 0) goto L_0x00cf
            boolean r7 = r3.f15228d
            if (r7 == 0) goto L_0x00cf
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x00cd
            zp4 r7 = r0.f7818k0
            long r7 = r7.f20645r
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x00cf
        L_0x00cd:
            r4 = 1
            goto L_0x00d0
        L_0x00cf:
            r4 = r12
        L_0x00d0:
            if (r4 == 0) goto L_0x00e0
            boolean r5 = r0.f7819o1
            if (r5 == 0) goto L_0x00e0
            r0.f7819o1 = r12
            zp4 r5 = r0.f7818k0
            int r5 = r5.f20640m
            r7 = 5
            r0.mo11206P0(r12, r5, r12, r7)
        L_0x00e0:
            r5 = 3
            if (r4 == 0) goto L_0x00f0
            or3 r4 = r3.f15230f
            boolean r4 = r4.f16046i
            if (r4 == 0) goto L_0x00f0
            r0.mo11221Y0(r6)
            r16.mo11242h1()
            goto L_0x0139
        L_0x00f0:
            zp4 r4 = r0.f7818k0
            int r4 = r4.f20632e
            r7 = 2
            if (r4 != r7) goto L_0x010d
            boolean r4 = r0.mo11232c1(r9)
            if (r4 == 0) goto L_0x010d
            r0.mo11221Y0(r5)
            r4 = 0
            r0.f7796B1 = r4
            boolean r4 = r16.mo11229b1()
            if (r4 == 0) goto L_0x0139
            r16.mo11236e1()
            goto L_0x0139
        L_0x010d:
            zp4 r4 = r0.f7818k0
            int r4 = r4.f20632e
            if (r4 != r5) goto L_0x0139
            int r4 = r0.f7830w1
            if (r4 != 0) goto L_0x011e
            boolean r4 = r16.mo11207Q()
            if (r4 == 0) goto L_0x0120
            goto L_0x0139
        L_0x011e:
            if (r9 != 0) goto L_0x0139
        L_0x0120:
            boolean r4 = r16.mo11229b1()
            r0.f7820p1 = r4
            r4 = 2
            r0.mo11221Y0(r4)
            boolean r4 = r0.f7820p1
            if (r4 == 0) goto L_0x0136
            r16.mo11237f0()
            qi3 r4 = r0.f7808Y
            r4.mo25115d()
        L_0x0136:
            r16.mo11242h1()
        L_0x0139:
            zp4 r4 = r0.f7818k0
            int r4 = r4.f20632e
            r7 = 2
            if (r4 != r7) goto L_0x017d
            r4 = r12
        L_0x0141:
            md5[] r7 = r0.f7810a
            int r8 = r7.length
            if (r4 >= r8) goto L_0x0166
            r7 = r7[r4]
            boolean r7 = m10851P(r7)
            if (r7 == 0) goto L_0x0163
            md5[] r7 = r0.f7810a
            r7 = r7[r4]
            yk5 r7 = r7.mo21686h()
            yk5[] r8 = r3.f15227c
            r8 = r8[r4]
            if (r7 != r8) goto L_0x0163
            md5[] r7 = r0.f7810a
            r7 = r7[r4]
            r7.mo21690m()
        L_0x0163:
            int r4 = r4 + 1
            goto L_0x0141
        L_0x0166:
            zp4 r3 = r0.f7818k0
            boolean r4 = r3.f20634g
            if (r4 != 0) goto L_0x017d
            long r3 = r3.f20644q
            r7 = 500000(0x7a120, double:2.47033E-318)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x017d
            boolean r3 = r16.mo11204O()
            if (r3 == 0) goto L_0x017d
            r3 = 1
            goto L_0x017e
        L_0x017d:
            r3 = r12
        L_0x017e:
            if (r3 != 0) goto L_0x0183
            r0.f7799D1 = r13
            goto L_0x01a1
        L_0x0183:
            long r3 = r0.f7799D1
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x0192
            dh0 r3 = r0.f7804P
            long r3 = r3.mo18770b()
            r0.f7799D1 = r3
            goto L_0x01a1
        L_0x0192:
            dh0 r3 = r0.f7804P
            long r3 = r3.mo18770b()
            long r7 = r0.f7799D1
            long r3 = r3 - r7
            r7 = 4000(0xfa0, double:1.9763E-320)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x01ef
        L_0x01a1:
            boolean r3 = r16.mo11229b1()
            if (r3 == 0) goto L_0x01af
            zp4 r3 = r0.f7818k0
            int r3 = r3.f20632e
            if (r3 != r5) goto L_0x01af
            r3 = 1
            goto L_0x01b0
        L_0x01af:
            r3 = r12
        L_0x01b0:
            boolean r4 = r0.f7829v1
            if (r4 == 0) goto L_0x01bc
            boolean r4 = r0.f7827u1
            if (r4 == 0) goto L_0x01bc
            if (r3 == 0) goto L_0x01bc
            r15 = 1
            goto L_0x01bd
        L_0x01bc:
            r15 = r12
        L_0x01bd:
            zp4 r4 = r0.f7818k0
            boolean r7 = r4.f20642o
            if (r7 == r15) goto L_0x01c9
            zp4 r4 = r4.mo28554h(r15)
            r0.f7818k0 = r4
        L_0x01c9:
            r0.f7827u1 = r12
            if (r15 != 0) goto L_0x01ee
            zp4 r4 = r0.f7818k0
            int r4 = r4.f20632e
            if (r4 != r6) goto L_0x01d4
            goto L_0x01ee
        L_0x01d4:
            if (r3 != 0) goto L_0x01e6
            r3 = 2
            if (r4 != r3) goto L_0x01da
            goto L_0x01e6
        L_0x01da:
            if (r4 != r5) goto L_0x01eb
            int r3 = r0.f7830w1
            if (r3 == 0) goto L_0x01eb
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.mo11277y0(r1, r3)
            goto L_0x01eb
        L_0x01e6:
            r3 = 10
            r0.mo11277y0(r1, r3)
        L_0x01eb:
            p000.ps6.m25175c()
        L_0x01ee:
            return
        L_0x01ef:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Playback stuck buffering and not loading"
            r1.<init>(r2)
            throw r1
        L_0x01f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ax1.mo11261o():void");
    }

    /* renamed from: o0 */
    public final void mo11262o0() throws ExoPlaybackException {
        boolean z;
        float f = this.f7802L.mo108d().f4406a;
        mr3 p = this.f7806U.mo25240p();
        mr3 q = this.f7806U.mo25241q();
        boolean z2 = true;
        while (p != null && p.f15228d) {
            gt6 v = p.mo23374v(f, this.f7818k0.f20628a);
            if (!v.mo20845a(p.mo23368o())) {
                if (z2) {
                    mr3 p2 = this.f7806U.mo25240p();
                    boolean z3 = this.f7806U.mo25249z(p2);
                    boolean[] zArr = new boolean[this.f7810a.length];
                    long b = p2.mo23356b(v, this.f7818k0.f20645r, z3, zArr);
                    zp4 zp4 = this.f7818k0;
                    if (zp4.f20632e == 4 || b == zp4.f20645r) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zp4 zp42 = this.f7818k0;
                    mr3 mr3 = p2;
                    boolean[] zArr2 = zArr;
                    this.f7818k0 = mo11197K(zp42.f20629b, b, zp42.f20630c, zp42.f20631d, z, 5);
                    if (z) {
                        mo11269r0(b);
                    }
                    boolean[] zArr3 = new boolean[this.f7810a.length];
                    int i = 0;
                    while (true) {
                        md5[] md5Arr = this.f7810a;
                        if (i >= md5Arr.length) {
                            break;
                        }
                        md5 md5 = md5Arr[i];
                        boolean P = m10851P(md5);
                        zArr3[i] = P;
                        yk5 yk5 = mr3.f15227c[i];
                        if (P) {
                            if (yk5 != md5.mo21686h()) {
                                mo11258n(md5);
                            } else if (zArr2[i]) {
                                md5.mo21699w(this.f7834y1);
                            }
                        }
                        i++;
                    }
                    mo11268r(zArr3);
                } else {
                    this.f7806U.mo25249z(p);
                    if (p.f15228d) {
                        p.mo23355a(v, Math.max(p.f15230f.f16039b, p.mo23377y(this.f7834y1)), false);
                    }
                }
                mo11187F(true);
                if (this.f7818k0.f20632e != 4) {
                    mo11212U();
                    mo11254l1();
                    this.f7831x.mo22781i(2);
                    return;
                }
                return;
            }
            if (p == q) {
                z2 = false;
            }
            p = p.mo23363j();
        }
    }

    /* renamed from: o1 */
    public final synchronized void mo11263o1(rd6<Boolean> rd6, long j) {
        long b = this.f7804P.mo18770b() + j;
        boolean z = false;
        while (!rd6.get().booleanValue() && j > 0) {
            try {
                this.f7804P.mo18772d();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = b - this.f7804P.mo18770b();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: p */
    public final void mo11264p(int i, boolean z) throws ExoPlaybackException {
        boolean z2;
        boolean z3;
        boolean z4;
        md5 md5 = this.f7810a[i];
        if (!m10851P(md5)) {
            mr3 q = this.f7806U.mo25241q();
            if (q == this.f7806U.mo25240p()) {
                z2 = true;
            } else {
                z2 = false;
            }
            gt6 o = q.mo23368o();
            pd5 pd5 = o.f12610b[i];
            C0792h[] w = m10862w(o.f12611c[i]);
            if (!mo11229b1() || this.f7818k0.f20632e != 3) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z || !z3) {
                z4 = false;
            } else {
                z4 = true;
            }
            this.f7830w1++;
            this.f7812d.add(md5);
            md5.mo21689l(pd5, w, q.f15227c[i], this.f7834y1, z4, z2, q.mo23366m(), q.mo23365l());
            md5.mo7154k(11, new C1588a());
            this.f7802L.mo28374c(md5);
            if (z3) {
                md5.start();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11265p0(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            r28 = this;
            r1 = r28
            xk2 r0 = r1.f7831x
            r2 = 2
            r0.mo22783k(r2)
            r2 = 0
            r1.f7796B1 = r2
            r3 = 0
            r1.f7820p1 = r3
            z81 r0 = r1.f7802L
            r0.mo28378h()
            r4 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r1.f7834y1 = r4
            md5[] r4 = r1.f7810a
            int r5 = r4.length
            r6 = r3
        L_0x001e:
            java.lang.String r7 = "ExoPlayerImplInternal"
            if (r6 >= r5) goto L_0x0033
            r0 = r4[r6]
            r1.mo11258n(r0)     // Catch:{ ExoPlaybackException -> 0x002a, RuntimeException -> 0x0028 }
            goto L_0x0030
        L_0x0028:
            r0 = move-exception
            goto L_0x002b
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            java.lang.String r8 = "Disable failed."
            p000.gk3.m18127d(r7, r8, r0)
        L_0x0030:
            int r6 = r6 + 1
            goto L_0x001e
        L_0x0033:
            if (r29 == 0) goto L_0x0053
            md5[] r4 = r1.f7810a
            int r5 = r4.length
            r6 = r3
        L_0x0039:
            if (r6 >= r5) goto L_0x0053
            r0 = r4[r6]
            java.util.Set<md5> r8 = r1.f7812d
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L_0x0050
            r0.reset()     // Catch:{ RuntimeException -> 0x0049 }
            goto L_0x0050
        L_0x0049:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            p000.gk3.m18127d(r7, r0, r8)
        L_0x0050:
            int r6 = r6 + 1
            goto L_0x0039
        L_0x0053:
            r1.f7830w1 = r3
            zp4 r0 = r1.f7818k0
            androidx.media3.exoplayer.source.i$b r4 = r0.f20629b
            long r5 = r0.f20645r
            zp4 r0 = r1.f7818k0
            androidx.media3.exoplayer.source.i$b r0 = r0.f20629b
            boolean r0 = r0.mo23781b()
            if (r0 != 0) goto L_0x0075
            zp4 r0 = r1.f7818k0
            androidx.media3.common.s$b r7 = r1.f7797C
            boolean r0 = m10852R(r0, r7)
            if (r0 == 0) goto L_0x0070
            goto L_0x0075
        L_0x0070:
            zp4 r0 = r1.f7818k0
            long r7 = r0.f20645r
            goto L_0x0079
        L_0x0075:
            zp4 r0 = r1.f7818k0
            long r7 = r0.f20630c
        L_0x0079:
            if (r30 == 0) goto L_0x00a2
            r1.f7832x1 = r2
            zp4 r0 = r1.f7818k0
            androidx.media3.common.s r0 = r0.f20628a
            android.util.Pair r0 = r1.mo11278z(r0)
            java.lang.Object r4 = r0.first
            androidx.media3.exoplayer.source.i$b r4 = (androidx.media3.exoplayer.source.C0973i.C0975b) r4
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            zp4 r0 = r1.f7818k0
            androidx.media3.exoplayer.source.i$b r0 = r0.f20629b
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00a2
            r0 = 1
            goto L_0x00a3
        L_0x00a2:
            r0 = r3
        L_0x00a3:
            r17 = r4
            r25 = r5
            qr3 r4 = r1.f7806U
            r4.mo25230f()
            r1.f7821q1 = r3
            zp4 r3 = new zp4
            zp4 r4 = r1.f7818k0
            androidx.media3.common.s r5 = r4.f20628a
            int r11 = r4.f20632e
            if (r32 == 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            androidx.media3.exoplayer.ExoPlaybackException r2 = r4.f20633f
        L_0x00bb:
            r12 = r2
            r13 = 0
            if (r0 == 0) goto L_0x00c2
            ws6 r2 = p000.ws6.f19232g
            goto L_0x00c4
        L_0x00c2:
            ws6 r2 = r4.f20635h
        L_0x00c4:
            r14 = r2
            if (r0 == 0) goto L_0x00ca
            gt6 r2 = r1.f7817k
            goto L_0x00cc
        L_0x00ca:
            gt6 r2 = r4.f20636i
        L_0x00cc:
            r15 = r2
            if (r0 == 0) goto L_0x00d4
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.m36627of()
            goto L_0x00d6
        L_0x00d4:
            java.util.List<androidx.media3.common.Metadata> r0 = r4.f20637j
        L_0x00d6:
            r16 = r0
            zp4 r0 = r1.f7818k0
            boolean r2 = r0.f20639l
            r18 = r2
            int r2 = r0.f20640m
            r19 = r2
            androidx.media3.common.n r0 = r0.f20641n
            r20 = r0
            r23 = 0
            r27 = 0
            r4 = r3
            r6 = r17
            r9 = r25
            r21 = r25
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r27)
            r1.f7818k0 = r3
            if (r31 == 0) goto L_0x00fd
            fs3 r0 = r1.f7807X
            r0.mo20156y()
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ax1.mo11265p0(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: q */
    public final void mo11266q() throws ExoPlaybackException {
        mo11268r(new boolean[this.f7810a.length]);
    }

    /* renamed from: q0 */
    public final void mo11267q0() {
        boolean z;
        mr3 p = this.f7806U.mo25240p();
        if (p == null || !p.f15230f.f16045h || !this.f7815e1) {
            z = false;
        } else {
            z = true;
        }
        this.f7819o1 = z;
    }

    /* renamed from: r */
    public final void mo11268r(boolean[] zArr) throws ExoPlaybackException {
        mr3 q = this.f7806U.mo25241q();
        gt6 o = q.mo23368o();
        for (int i = 0; i < this.f7810a.length; i++) {
            if (!o.mo20847c(i) && this.f7812d.remove(this.f7810a[i])) {
                this.f7810a[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.f7810a.length; i2++) {
            if (o.mo20847c(i2)) {
                mo11264p(i2, zArr[i2]);
            }
        }
        q.f15231g = true;
    }

    /* renamed from: r0 */
    public final void mo11269r0(long j) throws ExoPlaybackException {
        long j2;
        mr3 p = this.f7806U.mo25240p();
        if (p == null) {
            j2 = j + 1000000000000L;
        } else {
            j2 = p.mo23378z(j);
        }
        this.f7834y1 = j2;
        this.f7802L.mo28375e(j2);
        for (md5 md5 : this.f7810a) {
            if (m10851P(md5)) {
                md5.mo21699w(this.f7834y1);
            }
        }
        mo11233d0();
    }

    /* renamed from: s */
    public final void mo11270s(md5 md5) throws ExoPlaybackException {
        if (md5.getState() == 2) {
            md5.stop();
        }
    }

    /* renamed from: t */
    public void mo11271t(long j) {
        this.f7798C1 = j;
    }

    /* renamed from: u */
    public final ImmutableList<Metadata> mo11272u(dx1[] dx1Arr) {
        ImmutableList.C4534a aVar = new ImmutableList.C4534a();
        boolean z = false;
        for (dx1 dx1 : dx1Arr) {
            if (dx1 != null) {
                Metadata metadata = dx1.mo7663b(0).f4173A;
                if (metadata == null) {
                    aVar.mo34667a(new Metadata(new Metadata.Entry[0]));
                } else {
                    aVar.mo34667a(metadata);
                    z = true;
                }
            }
        }
        if (z) {
            return aVar.mo34692l();
        }
        return ImmutableList.m36627of();
    }

    /* renamed from: u0 */
    public final void mo11273u0(C0831s sVar, C0831s sVar2) {
        if (!sVar.mo6883u() || !sVar2.mo6883u()) {
            for (int size = this.f7803M.size() - 1; size >= 0; size--) {
                if (!m10860t0(this.f7803M.get(size), sVar, sVar2, this.f7823r1, this.f7825s1, this.f7795B, this.f7797C)) {
                    this.f7803M.get(size).f7845a.mo18274k(false);
                    this.f7803M.remove(size);
                }
            }
            Collections.sort(this.f7803M);
        }
    }

    /* renamed from: v */
    public final long mo11274v() {
        zp4 zp4 = this.f7818k0;
        return mo11275x(zp4.f20628a, zp4.f20629b.f15659a, zp4.f20645r);
    }

    /* renamed from: x */
    public final long mo11275x(C0831s sVar, Object obj, long j) {
        sVar.mo6880r(sVar.mo6874l(obj, this.f7797C).f4438e, this.f7795B);
        C0831s.C0835d dVar = this.f7795B;
        if (dVar.f4464r != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && dVar.mo6914i()) {
            C0831s.C0835d dVar2 = this.f7795B;
            if (dVar2.f4467y) {
                return w67.m29391y0(dVar2.mo6907d() - this.f7795B.f4464r) - (j + this.f7797C.mo6901q());
            }
        }
        return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: y */
    public final long mo11276y() {
        mr3 q = this.f7806U.mo25241q();
        if (q == null) {
            return 0;
        }
        long l = q.mo23365l();
        if (!q.f15228d) {
            return l;
        }
        int i = 0;
        while (true) {
            md5[] md5Arr = this.f7810a;
            if (i >= md5Arr.length) {
                return l;
            }
            if (m10851P(md5Arr[i]) && this.f7810a[i].mo21686h() == q.f15227c[i]) {
                long v = this.f7810a[i].mo21698v();
                if (v == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l = Math.max(v, l);
            }
            i++;
        }
    }

    /* renamed from: y0 */
    public final void mo11277y0(long j, long j2) {
        this.f7831x.mo22782j(2, j + j2);
    }

    /* renamed from: z */
    public final Pair<C0973i.C0975b, Long> mo11278z(C0831s sVar) {
        long j = 0;
        if (sVar.mo6883u()) {
            return Pair.create(zp4.m31420k(), 0L);
        }
        C0831s sVar2 = sVar;
        Pair<Object, Long> n = sVar2.mo6876n(this.f7795B, this.f7797C, sVar.mo6865e(this.f7825s1), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
        C0973i.C0975b B = this.f7806U.mo25219B(sVar, n.first, 0);
        long longValue = ((Long) n.second).longValue();
        if (B.mo23781b()) {
            sVar.mo6874l(B.f15659a, this.f7797C);
            if (B.f15661c == this.f7797C.mo6898n(B.f15660b)) {
                j = this.f7797C.mo6894j();
            }
            longValue = j;
        }
        return Pair.create(B, Long.valueOf(longValue));
    }

    /* renamed from: z0 */
    public void mo11279z0(C0831s sVar, int i, long j) {
        this.f7831x.mo22776d(3, new C1595h(sVar, i, j)).mo22784a();
    }
}

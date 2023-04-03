package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.drm.C0909b;
import androidx.media3.exoplayer.drm.C0921g;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.upstream.C1019b;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class DefaultDrmSession implements DrmSession {

    /* renamed from: a */
    public final List<DrmInitData.SchemeData> f4928a;

    /* renamed from: b */
    public final C0921g f4929b;

    /* renamed from: c */
    public final C0896a f4930c;

    /* renamed from: d */
    public final C0897b f4931d;

    /* renamed from: e */
    public final int f4932e;

    /* renamed from: f */
    public final boolean f4933f;

    /* renamed from: g */
    public final boolean f4934g;

    /* renamed from: h */
    public final HashMap<String, String> f4935h;

    /* renamed from: i */
    public final rt0<C0909b.C0910a> f4936i;

    /* renamed from: j */
    public final C1019b f4937j;

    /* renamed from: k */
    public final br4 f4938k;

    /* renamed from: l */
    public final C0929j f4939l;

    /* renamed from: m */
    public final UUID f4940m;

    /* renamed from: n */
    public final C0900e f4941n;

    /* renamed from: o */
    public int f4942o;

    /* renamed from: p */
    public int f4943p;

    /* renamed from: q */
    public HandlerThread f4944q;

    /* renamed from: r */
    public C0898c f4945r;

    /* renamed from: s */
    public hw0 f4946s;

    /* renamed from: t */
    public DrmSession.DrmSessionException f4947t;

    /* renamed from: u */
    public byte[] f4948u;

    /* renamed from: v */
    public byte[] f4949v;

    /* renamed from: w */
    public C0921g.C0922a f4950w;

    /* renamed from: x */
    public C0921g.C0925d f4951x;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th) {
            super(th);
        }
    }

    /* renamed from: androidx.media3.exoplayer.drm.DefaultDrmSession$a */
    public interface C0896a {
        /* renamed from: a */
        void mo7340a(Exception exc, boolean z);

        /* renamed from: b */
        void mo7341b();

        /* renamed from: c */
        void mo7342c(DefaultDrmSession defaultDrmSession);
    }

    /* renamed from: androidx.media3.exoplayer.drm.DefaultDrmSession$b */
    public interface C0897b {
        /* renamed from: a */
        void mo7343a(DefaultDrmSession defaultDrmSession, int i);

        /* renamed from: b */
        void mo7344b(DefaultDrmSession defaultDrmSession, int i);
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: androidx.media3.exoplayer.drm.DefaultDrmSession$c */
    public class C0898c extends Handler {

        /* renamed from: a */
        public boolean f4952a;

        public C0898c(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final boolean mo7345a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            IOException iOException;
            MediaDrmCallbackException mediaDrmCallbackException2 = mediaDrmCallbackException;
            C0899d dVar = (C0899d) message.obj;
            if (!dVar.f4955b) {
                return false;
            }
            int i = dVar.f4958e + 1;
            dVar.f4958e = i;
            if (i > DefaultDrmSession.this.f4937j.mo7825b(3)) {
                return false;
            }
            vi3 vi3 = new vi3(dVar.f4954a, mediaDrmCallbackException2.dataSpec, mediaDrmCallbackException2.uriAfterRedirects, mediaDrmCallbackException2.responseHeaders, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f4956c, mediaDrmCallbackException2.bytesLoaded);
            jr3 jr3 = new jr3(3);
            if (mediaDrmCallbackException.getCause() instanceof IOException) {
                iOException = (IOException) mediaDrmCallbackException.getCause();
            } else {
                iOException = new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause());
            }
            long a = DefaultDrmSession.this.f4937j.mo7824a(new C1019b.C1022c(vi3, jr3, iOException, dVar.f4958e));
            if (a == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                return false;
            }
            synchronized (this) {
                if (this.f4952a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), a);
                return true;
            }
        }

        /* renamed from: b */
        public void mo7346b(int i, Object obj, boolean z) {
            obtainMessage(i, new C0899d(vi3.m28818a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* renamed from: c */
        public synchronized void mo7347c() {
            removeCallbacksAndMessages((Object) null);
            this.f4952a = true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.media3.exoplayer.drm.MediaDrmCallbackException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: androidx.media3.exoplayer.drm.MediaDrmCallbackException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: androidx.media3.exoplayer.drm.MediaDrmCallbackException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Throwable, java.lang.Exception] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r6.obj
                androidx.media3.exoplayer.drm.DefaultDrmSession$d r0 = (androidx.media3.exoplayer.drm.DefaultDrmSession.C0899d) r0
                int r1 = r6.what     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                if (r1 == 0) goto L_0x0020
                r2 = 1
                if (r1 != r2) goto L_0x001a
                androidx.media3.exoplayer.drm.DefaultDrmSession r1 = androidx.media3.exoplayer.drm.DefaultDrmSession.this     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                androidx.media3.exoplayer.drm.j r2 = r1.f4939l     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                java.util.UUID r1 = r1.f4940m     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                java.lang.Object r3 = r0.f4957d     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                androidx.media3.exoplayer.drm.g$a r3 = (androidx.media3.exoplayer.drm.C0921g.C0922a) r3     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                byte[] r1 = r2.mo7417a(r1, r3)     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                goto L_0x0040
            L_0x001a:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                r1.<init>()     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                throw r1     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
            L_0x0020:
                androidx.media3.exoplayer.drm.DefaultDrmSession r1 = androidx.media3.exoplayer.drm.DefaultDrmSession.this     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                androidx.media3.exoplayer.drm.j r2 = r1.f4939l     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                java.util.UUID r1 = r1.f4940m     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                java.lang.Object r3 = r0.f4957d     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                androidx.media3.exoplayer.drm.g$d r3 = (androidx.media3.exoplayer.drm.C0921g.C0925d) r3     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                byte[] r1 = r2.mo7418b(r1, r3)     // Catch:{ MediaDrmCallbackException -> 0x0038, Exception -> 0x002f }
                goto L_0x0040
            L_0x002f:
                r1 = move-exception
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                p000.gk3.m18133j(r2, r3, r1)
                goto L_0x0040
            L_0x0038:
                r1 = move-exception
                boolean r2 = r5.mo7345a(r6, r1)
                if (r2 == 0) goto L_0x0040
                return
            L_0x0040:
                androidx.media3.exoplayer.drm.DefaultDrmSession r2 = androidx.media3.exoplayer.drm.DefaultDrmSession.this
                androidx.media3.exoplayer.upstream.b r2 = r2.f4937j
                long r3 = r0.f4954a
                r2.mo7826c(r3)
                monitor-enter(r5)
                boolean r2 = r5.f4952a     // Catch:{ all -> 0x0065 }
                if (r2 != 0) goto L_0x0063
                androidx.media3.exoplayer.drm.DefaultDrmSession r2 = androidx.media3.exoplayer.drm.DefaultDrmSession.this     // Catch:{ all -> 0x0065 }
                androidx.media3.exoplayer.drm.DefaultDrmSession$e r2 = r2.f4941n     // Catch:{ all -> 0x0065 }
                int r6 = r6.what     // Catch:{ all -> 0x0065 }
                java.lang.Object r0 = r0.f4957d     // Catch:{ all -> 0x0065 }
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x0065 }
                android.os.Message r6 = r2.obtainMessage(r6, r0)     // Catch:{ all -> 0x0065 }
                r6.sendToTarget()     // Catch:{ all -> 0x0065 }
            L_0x0063:
                monitor-exit(r5)     // Catch:{ all -> 0x0065 }
                return
            L_0x0065:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0065 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.DefaultDrmSession.C0898c.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: androidx.media3.exoplayer.drm.DefaultDrmSession$d */
    public static final class C0899d {

        /* renamed from: a */
        public final long f4954a;

        /* renamed from: b */
        public final boolean f4955b;

        /* renamed from: c */
        public final long f4956c;

        /* renamed from: d */
        public final Object f4957d;

        /* renamed from: e */
        public int f4958e;

        public C0899d(long j, boolean z, long j2, Object obj) {
            this.f4954a = j;
            this.f4955b = z;
            this.f4956c = j2;
            this.f4957d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: androidx.media3.exoplayer.drm.DefaultDrmSession$e */
    public class C0900e extends Handler {
        public C0900e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession.this.mo7314A(obj, obj2);
            } else if (i == 1) {
                DefaultDrmSession.this.mo7334u(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, C0921g gVar, C0896a aVar, C0897b bVar, List<DrmInitData.SchemeData> list, int i, boolean z, boolean z2, byte[] bArr, HashMap<String, String> hashMap, C0929j jVar, Looper looper, C1019b bVar2, br4 br4) {
        if (i == 1 || i == 3) {
            C2725kr.m20985e(bArr);
        }
        this.f4940m = uuid;
        this.f4930c = aVar;
        this.f4931d = bVar;
        this.f4929b = gVar;
        this.f4932e = i;
        this.f4933f = z;
        this.f4934g = z2;
        if (bArr != null) {
            this.f4949v = bArr;
            this.f4928a = null;
        } else {
            this.f4928a = Collections.unmodifiableList((List) C2725kr.m20985e(list));
        }
        this.f4935h = hashMap;
        this.f4939l = jVar;
        this.f4936i = new rt0<>();
        this.f4937j = bVar2;
        this.f4938k = br4;
        this.f4942o = 2;
        this.f4941n = new C0900e(looper);
    }

    /* renamed from: A */
    public final void mo7314A(Object obj, Object obj2) {
        if (obj != this.f4951x) {
            return;
        }
        if (this.f4942o == 2 || mo7332q()) {
            this.f4951x = null;
            if (obj2 instanceof Exception) {
                this.f4930c.mo7340a((Exception) obj2, false);
                return;
            }
            try {
                this.f4929b.mo7401f((byte[]) obj2);
                this.f4930c.mo7341b();
            } catch (Exception e) {
                this.f4930c.mo7340a(e, true);
            }
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: B */
    public final boolean mo7315B() {
        if (mo7332q()) {
            return true;
        }
        try {
            byte[] d = this.f4929b.mo7399d();
            this.f4948u = d;
            this.f4929b.mo7403h(d, this.f4938k);
            this.f4946s = this.f4929b.mo7404i(this.f4948u);
            this.f4942o = 3;
            mo7328m(new o71(3));
            C2725kr.m20985e(this.f4948u);
            return true;
        } catch (NotProvisionedException unused) {
            this.f4930c.mo7342c(this);
            return false;
        } catch (Exception e) {
            mo7333t(e, 1);
            return false;
        }
    }

    /* renamed from: C */
    public final void mo7316C(byte[] bArr, int i, boolean z) {
        try {
            this.f4950w = this.f4929b.mo7409n(bArr, this.f4928a, i, this.f4935h);
            ((C0898c) w67.m29360j(this.f4945r)).mo7346b(1, C2725kr.m20985e(this.f4950w), z);
        } catch (Exception e) {
            mo7335v(e, true);
        }
    }

    /* renamed from: D */
    public void mo7317D() {
        this.f4951x = this.f4929b.mo7398c();
        ((C0898c) w67.m29360j(this.f4945r)).mo7346b(0, C2725kr.m20985e(this.f4951x), true);
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    /* renamed from: E */
    public final boolean mo7318E() {
        try {
            this.f4929b.mo7400e(this.f4948u, this.f4949v);
            return true;
        } catch (Exception e) {
            mo7333t(e, 1);
            return false;
        }
    }

    /* renamed from: a */
    public final UUID mo7319a() {
        return this.f4940m;
    }

    /* renamed from: b */
    public boolean mo7320b() {
        return this.f4933f;
    }

    /* renamed from: c */
    public final hw0 mo7321c() {
        return this.f4946s;
    }

    /* renamed from: d */
    public void mo7322d(C0909b.C0910a aVar) {
        boolean z = false;
        if (this.f4943p < 0) {
            gk3.m18126c("DefaultDrmSession", "Session reference count less than zero: " + this.f4943p);
            this.f4943p = 0;
        }
        if (aVar != null) {
            this.f4936i.mo25535e(aVar);
        }
        int i = this.f4943p + 1;
        this.f4943p = i;
        if (i == 1) {
            if (this.f4942o == 2) {
                z = true;
            }
            C2725kr.m20987g(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f4944q = handlerThread;
            handlerThread.start();
            this.f4945r = new C0898c(this.f4944q.getLooper());
            if (mo7315B()) {
                mo7329n(true);
            }
        } else if (aVar != null && mo7332q() && this.f4936i.count(aVar) == 1) {
            aVar.mo7391k(this.f4942o);
        }
        this.f4931d.mo7343a(this, this.f4943p);
    }

    /* renamed from: e */
    public Map<String, String> mo7323e() {
        byte[] bArr = this.f4948u;
        if (bArr == null) {
            return null;
        }
        return this.f4929b.mo7397b(bArr);
    }

    /* renamed from: f */
    public void mo7324f(C0909b.C0910a aVar) {
        int i = this.f4943p;
        if (i <= 0) {
            gk3.m18126c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.f4943p = i2;
        if (i2 == 0) {
            this.f4942o = 0;
            ((C0900e) w67.m29360j(this.f4941n)).removeCallbacksAndMessages((Object) null);
            ((C0898c) w67.m29360j(this.f4945r)).mo7347c();
            this.f4945r = null;
            ((HandlerThread) w67.m29360j(this.f4944q)).quit();
            this.f4944q = null;
            this.f4946s = null;
            this.f4947t = null;
            this.f4950w = null;
            this.f4951x = null;
            byte[] bArr = this.f4948u;
            if (bArr != null) {
                this.f4929b.mo7406k(bArr);
                this.f4948u = null;
            }
        }
        if (aVar != null) {
            this.f4936i.mo25538j(aVar);
            if (this.f4936i.count(aVar) == 0) {
                aVar.mo7393m();
            }
        }
        this.f4931d.mo7344b(this, this.f4943p);
    }

    /* renamed from: g */
    public boolean mo7325g(String str) {
        return this.f4929b.mo7405j((byte[]) C2725kr.m20989i(this.f4948u), str);
    }

    public final DrmSession.DrmSessionException getError() {
        if (this.f4942o == 1) {
            return this.f4947t;
        }
        return null;
    }

    public final int getState() {
        return this.f4942o;
    }

    /* renamed from: m */
    public final void mo7328m(uq0<C0909b.C0910a> uq0) {
        for (C0909b.C0910a accept : this.f4936i.elementSet()) {
            uq0.accept(accept);
        }
    }

    @RequiresNonNull({"sessionId"})
    /* renamed from: n */
    public final void mo7329n(boolean z) {
        if (!this.f4934g) {
            byte[] bArr = (byte[]) w67.m29360j(this.f4948u);
            int i = this.f4932e;
            if (i == 0 || i == 1) {
                if (this.f4949v == null) {
                    mo7316C(bArr, 1, z);
                } else if (this.f4942o == 4 || mo7318E()) {
                    long o = mo7330o();
                    if (this.f4932e == 0 && o <= 60) {
                        gk3.m18125b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + o);
                        mo7316C(bArr, 2, z);
                    } else if (o <= 0) {
                        mo7333t(new KeysExpiredException(), 2);
                    } else {
                        this.f4942o = 4;
                        mo7328m(new p71());
                    }
                }
            } else if (i != 2) {
                if (i == 3) {
                    C2725kr.m20985e(this.f4949v);
                    C2725kr.m20985e(this.f4948u);
                    mo7316C(this.f4949v, 3, z);
                }
            } else if (this.f4949v == null || mo7318E()) {
                mo7316C(bArr, 2, z);
            }
        }
    }

    /* renamed from: o */
    public final long mo7330o() {
        if (!l70.f14426d.equals(this.f4940m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C2725kr.m20985e(uk7.m28346b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    /* renamed from: p */
    public boolean mo7331p(byte[] bArr) {
        return Arrays.equals(this.f4948u, bArr);
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: q */
    public final boolean mo7332q() {
        int i = this.f4942o;
        if (i == 3 || i == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final void mo7333t(Exception exc, int i) {
        this.f4947t = new DrmSession.DrmSessionException(exc, C0915d.m6615a(exc, i));
        gk3.m18127d("DefaultDrmSession", "DRM session error", exc);
        mo7328m(new n71(exc));
        if (this.f4942o != 4) {
            this.f4942o = 1;
        }
    }

    /* renamed from: u */
    public final void mo7334u(Object obj, Object obj2) {
        if (obj == this.f4950w && mo7332q()) {
            this.f4950w = null;
            if (obj2 instanceof Exception) {
                mo7335v((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f4932e == 3) {
                    this.f4929b.mo7407l((byte[]) w67.m29360j(this.f4949v), bArr);
                    mo7328m(new q71());
                    return;
                }
                byte[] l = this.f4929b.mo7407l(this.f4948u, bArr);
                int i = this.f4932e;
                if (!((i != 2 && (i != 0 || this.f4949v == null)) || l == null || l.length == 0)) {
                    this.f4949v = l;
                }
                this.f4942o = 4;
                mo7328m(new r71());
            } catch (Exception e) {
                mo7335v(e, true);
            }
        }
    }

    /* renamed from: v */
    public final void mo7335v(Exception exc, boolean z) {
        int i;
        if (exc instanceof NotProvisionedException) {
            this.f4930c.mo7342c(this);
            return;
        }
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        mo7333t(exc, i);
    }

    /* renamed from: w */
    public final void mo7336w() {
        if (this.f4932e == 0 && this.f4942o == 4) {
            w67.m29360j(this.f4948u);
            mo7329n(false);
        }
    }

    /* renamed from: x */
    public void mo7337x(int i) {
        if (i == 2) {
            mo7336w();
        }
    }

    /* renamed from: y */
    public void mo7338y() {
        if (mo7315B()) {
            mo7329n(true);
        }
    }

    /* renamed from: z */
    public void mo7339z(Exception exc, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 3;
        }
        mo7333t(exc, i);
    }
}

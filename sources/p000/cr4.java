package p000;

import android.os.Looper;
import androidx.media3.common.C0831s;
import androidx.media3.exoplayer.ExoPlaybackException;

/* renamed from: cr4 */
/* compiled from: PlayerMessage */
public final class cr4 {

    /* renamed from: a */
    public final C2116b f10258a;

    /* renamed from: b */
    public final C2115a f10259b;

    /* renamed from: c */
    public final dh0 f10260c;

    /* renamed from: d */
    public final C0831s f10261d;

    /* renamed from: e */
    public int f10262e;

    /* renamed from: f */
    public Object f10263f;

    /* renamed from: g */
    public Looper f10264g;

    /* renamed from: h */
    public int f10265h;

    /* renamed from: i */
    public long f10266i = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    /* renamed from: j */
    public boolean f10267j = true;

    /* renamed from: k */
    public boolean f10268k;

    /* renamed from: l */
    public boolean f10269l;

    /* renamed from: m */
    public boolean f10270m;

    /* renamed from: n */
    public boolean f10271n;

    /* renamed from: cr4$a */
    /* compiled from: PlayerMessage */
    public interface C2115a {
        /* renamed from: c */
        void mo11230c(cr4 cr4);
    }

    /* renamed from: cr4$b */
    /* compiled from: PlayerMessage */
    public interface C2116b {
        /* renamed from: k */
        void mo7154k(int i, Object obj) throws ExoPlaybackException;
    }

    public cr4(C2115a aVar, C2116b bVar, C0831s sVar, int i, dh0 dh0, Looper looper) {
        this.f10259b = aVar;
        this.f10258a = bVar;
        this.f10261d = sVar;
        this.f10264g = looper;
        this.f10260c = dh0;
        this.f10265h = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040 A[SYNTHETIC, Splitter:B:16:0x0040] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo18264a(long r6) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f10268k     // Catch:{ all -> 0x0048 }
            p000.C2725kr.m20987g(r0)     // Catch:{ all -> 0x0048 }
            android.os.Looper r0 = r5.f10264g     // Catch:{ all -> 0x0048 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0048 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0048 }
            if (r0 == r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            p000.C2725kr.m20987g(r0)     // Catch:{ all -> 0x0048 }
            dh0 r0 = r5.f10260c     // Catch:{ all -> 0x0048 }
            long r0 = r0.mo18770b()     // Catch:{ all -> 0x0048 }
            long r0 = r0 + r6
        L_0x001f:
            boolean r2 = r5.f10270m     // Catch:{ all -> 0x0048 }
            if (r2 != 0) goto L_0x003a
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x003a
            dh0 r2 = r5.f10260c     // Catch:{ all -> 0x0048 }
            r2.mo18772d()     // Catch:{ all -> 0x0048 }
            r5.wait(r6)     // Catch:{ all -> 0x0048 }
            dh0 r6 = r5.f10260c     // Catch:{ all -> 0x0048 }
            long r6 = r6.mo18770b()     // Catch:{ all -> 0x0048 }
            long r6 = r0 - r6
            goto L_0x001f
        L_0x003a:
            if (r2 == 0) goto L_0x0040
            boolean r6 = r5.f10269l     // Catch:{ all -> 0x0048 }
            monitor-exit(r5)
            return r6
        L_0x0040:
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0048 }
            java.lang.String r7 = "Message delivery timed out."
            r6.<init>(r7)     // Catch:{ all -> 0x0048 }
            throw r6     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cr4.mo18264a(long):boolean");
    }

    /* renamed from: b */
    public boolean mo18265b() {
        return this.f10267j;
    }

    /* renamed from: c */
    public Looper mo18266c() {
        return this.f10264g;
    }

    /* renamed from: d */
    public int mo18267d() {
        return this.f10265h;
    }

    /* renamed from: e */
    public Object mo18268e() {
        return this.f10263f;
    }

    /* renamed from: f */
    public long mo18269f() {
        return this.f10266i;
    }

    /* renamed from: g */
    public C2116b mo18270g() {
        return this.f10258a;
    }

    /* renamed from: h */
    public C0831s mo18271h() {
        return this.f10261d;
    }

    /* renamed from: i */
    public int mo18272i() {
        return this.f10262e;
    }

    /* renamed from: j */
    public synchronized boolean mo18273j() {
        return this.f10271n;
    }

    /* renamed from: k */
    public synchronized void mo18274k(boolean z) {
        this.f10269l = z | this.f10269l;
        this.f10270m = true;
        notifyAll();
    }

    /* renamed from: l */
    public cr4 mo18275l() {
        C2725kr.m20987g(!this.f10268k);
        if (this.f10266i == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            C2725kr.m20981a(this.f10267j);
        }
        this.f10268k = true;
        this.f10259b.mo11230c(this);
        return this;
    }

    /* renamed from: m */
    public cr4 mo18276m(Object obj) {
        C2725kr.m20987g(!this.f10268k);
        this.f10263f = obj;
        return this;
    }

    /* renamed from: n */
    public cr4 mo18277n(int i) {
        C2725kr.m20987g(!this.f10268k);
        this.f10262e = i;
        return this;
    }
}

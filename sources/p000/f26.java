package p000;

import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayDeque;
import p000.o31;

/* renamed from: f26 */
/* compiled from: SimpleDecoder */
public abstract class f26<I extends DecoderInputBuffer, O extends o31, E extends DecoderException> implements m31<I, O, E> {

    /* renamed from: a */
    public final Thread f11490a;

    /* renamed from: b */
    public final Object f11491b = new Object();

    /* renamed from: c */
    public final ArrayDeque<I> f11492c = new ArrayDeque<>();

    /* renamed from: d */
    public final ArrayDeque<O> f11493d = new ArrayDeque<>();

    /* renamed from: e */
    public final I[] f11494e;

    /* renamed from: f */
    public final O[] f11495f;

    /* renamed from: g */
    public int f11496g;

    /* renamed from: h */
    public int f11497h;

    /* renamed from: i */
    public I f11498i;

    /* renamed from: j */
    public E f11499j;

    /* renamed from: k */
    public boolean f11500k;

    /* renamed from: l */
    public boolean f11501l;

    /* renamed from: m */
    public int f11502m;

    /* renamed from: f26$a */
    /* compiled from: SimpleDecoder */
    public class C2261a extends Thread {
        public C2261a(String str) {
            super(str);
        }

        public void run() {
            f26.this.mo19608u();
        }
    }

    public f26(I[] iArr, O[] oArr) {
        this.f11494e = iArr;
        this.f11496g = iArr.length;
        for (int i = 0; i < this.f11496g; i++) {
            this.f11494e[i] = mo19595h();
        }
        this.f11495f = oArr;
        this.f11497h = oArr.length;
        for (int i2 = 0; i2 < this.f11497h; i2++) {
            this.f11495f[i2] = mo19596i();
        }
        C2261a aVar = new C2261a("ExoPlayer:SimpleDecoder");
        this.f11490a = aVar;
        aVar.start();
    }

    /* renamed from: a */
    public void mo18654a() {
        synchronized (this.f11491b) {
            this.f11501l = true;
            this.f11491b.notify();
        }
        try {
            this.f11490a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void flush() {
        synchronized (this.f11491b) {
            this.f11500k = true;
            this.f11502m = 0;
            I i = this.f11498i;
            if (i != null) {
                mo19605r(i);
                this.f11498i = null;
            }
            while (!this.f11492c.isEmpty()) {
                mo19605r((DecoderInputBuffer) this.f11492c.removeFirst());
            }
            while (!this.f11493d.isEmpty()) {
                ((o31) this.f11493d.removeFirst()).mo19507v();
            }
        }
    }

    /* renamed from: g */
    public final boolean mo19594g() {
        if (this.f11492c.isEmpty() || this.f11497h <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public abstract I mo19595h();

    /* renamed from: i */
    public abstract O mo19596i();

    /* renamed from: j */
    public abstract E mo19597j(Throwable th);

    /* renamed from: k */
    public abstract E mo19598k(I i, O o, boolean z);

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.mo23893p() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.mo23888g(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.mo23892o() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.mo23888g(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r1.mo23894r() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        r3.mo23888g(134217728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0 = mo19598k(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        r0 = mo19597j(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r0 = mo19597j(r0);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19599l() throws java.lang.InterruptedException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f11491b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.f11501l     // Catch:{ all -> 0x009b }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.mo19594g()     // Catch:{ all -> 0x009b }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.f11491b     // Catch:{ all -> 0x009b }
            r1.wait()     // Catch:{ all -> 0x009b }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.f11501l     // Catch:{ all -> 0x009b }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            return r2
        L_0x001a:
            java.util.ArrayDeque<I> r1 = r6.f11492c     // Catch:{ all -> 0x009b }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x009b }
            androidx.media3.decoder.DecoderInputBuffer r1 = (androidx.media3.decoder.DecoderInputBuffer) r1     // Catch:{ all -> 0x009b }
            O[] r3 = r6.f11495f     // Catch:{ all -> 0x009b }
            int r4 = r6.f11497h     // Catch:{ all -> 0x009b }
            r5 = 1
            int r4 = r4 - r5
            r6.f11497h = r4     // Catch:{ all -> 0x009b }
            r3 = r3[r4]     // Catch:{ all -> 0x009b }
            boolean r4 = r6.f11500k     // Catch:{ all -> 0x009b }
            r6.f11500k = r2     // Catch:{ all -> 0x009b }
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            boolean r0 = r1.mo23893p()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.mo23888g(r0)
            goto L_0x006e
        L_0x003c:
            boolean r0 = r1.mo23892o()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.mo23888g(r0)
        L_0x0047:
            boolean r0 = r1.mo23894r()
            if (r0 == 0) goto L_0x0052
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r3.mo23888g(r0)
        L_0x0052:
            androidx.media3.decoder.DecoderException r0 = r6.mo19598k(r1, r3, r4)     // Catch:{ RuntimeException -> 0x005d, OutOfMemoryError -> 0x0057 }
            goto L_0x0062
        L_0x0057:
            r0 = move-exception
            androidx.media3.decoder.DecoderException r0 = r6.mo19597j(r0)
            goto L_0x0062
        L_0x005d:
            r0 = move-exception
            androidx.media3.decoder.DecoderException r0 = r6.mo19597j(r0)
        L_0x0062:
            if (r0 == 0) goto L_0x006e
            java.lang.Object r4 = r6.f11491b
            monitor-enter(r4)
            r6.f11499j = r0     // Catch:{ all -> 0x006b }
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            return r2
        L_0x006b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            throw r0
        L_0x006e:
            java.lang.Object r4 = r6.f11491b
            monitor-enter(r4)
            boolean r0 = r6.f11500k     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0079
            r3.mo19507v()     // Catch:{ all -> 0x0098 }
            goto L_0x0093
        L_0x0079:
            boolean r0 = r3.mo23892o()     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0088
            int r0 = r6.f11502m     // Catch:{ all -> 0x0098 }
            int r0 = r0 + r5
            r6.f11502m = r0     // Catch:{ all -> 0x0098 }
            r3.mo19507v()     // Catch:{ all -> 0x0098 }
            goto L_0x0093
        L_0x0088:
            int r0 = r6.f11502m     // Catch:{ all -> 0x0098 }
            r3.f15782e = r0     // Catch:{ all -> 0x0098 }
            r6.f11502m = r2     // Catch:{ all -> 0x0098 }
            java.util.ArrayDeque<O> r0 = r6.f11493d     // Catch:{ all -> 0x0098 }
            r0.addLast(r3)     // Catch:{ all -> 0x0098 }
        L_0x0093:
            r6.mo19605r(r1)     // Catch:{ all -> 0x0098 }
            monitor-exit(r4)     // Catch:{ all -> 0x0098 }
            return r5
        L_0x0098:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0098 }
            throw r0
        L_0x009b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f26.mo19599l():boolean");
    }

    /* renamed from: m */
    public final I mo19502e() throws DecoderException {
        boolean z;
        I i;
        synchronized (this.f11491b) {
            mo19603p();
            if (this.f11498i == null) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20987g(z);
            int i2 = this.f11496g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f11494e;
                int i3 = i2 - 1;
                this.f11496g = i3;
                i = iArr[i3];
            }
            this.f11498i = i;
        }
        return i;
    }

    /* renamed from: n */
    public final O mo18656c() throws DecoderException {
        synchronized (this.f11491b) {
            mo19603p();
            if (this.f11493d.isEmpty()) {
                return null;
            }
            O o = (o31) this.f11493d.removeFirst();
            return o;
        }
    }

    /* renamed from: o */
    public final void mo19602o() {
        if (mo19594g()) {
            this.f11491b.notify();
        }
    }

    /* renamed from: p */
    public final void mo19603p() throws DecoderException {
        E e = this.f11499j;
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: q */
    public final void mo19501d(I i) throws DecoderException {
        boolean z;
        synchronized (this.f11491b) {
            mo19603p();
            if (i == this.f11498i) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20981a(z);
            this.f11492c.addLast(i);
            mo19602o();
            this.f11498i = null;
        }
    }

    /* renamed from: r */
    public final void mo19605r(I i) {
        i.mo6968h();
        I[] iArr = this.f11494e;
        int i2 = this.f11496g;
        this.f11496g = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: s */
    public void mo19606s(O o) {
        synchronized (this.f11491b) {
            mo19607t(o);
            mo19602o();
        }
    }

    /* renamed from: t */
    public final void mo19607t(O o) {
        o.mo6968h();
        O[] oArr = this.f11495f;
        int i = this.f11497h;
        this.f11497h = i + 1;
        oArr[i] = o;
    }

    /* renamed from: u */
    public final void mo19608u() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (mo19599l());
    }

    /* renamed from: v */
    public final void mo19609v(int i) {
        boolean z;
        if (this.f11496g == this.f11494e.length) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        for (I w : this.f11494e) {
            w.mo6970w(i);
        }
    }
}

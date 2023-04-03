package p000;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ds */
/* compiled from: AsynchronousMediaCodecBufferEnqueuer */
public class C2192ds {

    /* renamed from: g */
    public static final ArrayDeque<C2194b> f10832g = new ArrayDeque<>();

    /* renamed from: h */
    public static final Object f10833h = new Object();

    /* renamed from: a */
    public final MediaCodec f10834a;

    /* renamed from: b */
    public final HandlerThread f10835b;

    /* renamed from: c */
    public Handler f10836c;

    /* renamed from: d */
    public final AtomicReference<RuntimeException> f10837d;

    /* renamed from: e */
    public final lo0 f10838e;

    /* renamed from: f */
    public boolean f10839f;

    /* renamed from: ds$a */
    /* compiled from: AsynchronousMediaCodecBufferEnqueuer */
    public class C2193a extends Handler {
        public C2193a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C2192ds.this.mo18911f(message);
        }
    }

    /* renamed from: ds$b */
    /* compiled from: AsynchronousMediaCodecBufferEnqueuer */
    public static class C2194b {

        /* renamed from: a */
        public int f10841a;

        /* renamed from: b */
        public int f10842b;

        /* renamed from: c */
        public int f10843c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f10844d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f10845e;

        /* renamed from: f */
        public int f10846f;

        /* renamed from: a */
        public void mo18923a(int i, int i2, int i3, long j, int i4) {
            this.f10841a = i;
            this.f10842b = i2;
            this.f10843c = i3;
            this.f10845e = j;
            this.f10846f = i4;
        }
    }

    public C2192ds(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new lo0());
    }

    /* renamed from: c */
    public static void m15352c(jw0 jw0, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = jw0.f13893f;
        cryptoInfo.numBytesOfClearData = m15354e(jw0.f13891d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m15354e(jw0.f13892e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C2725kr.m20985e(m15353d(jw0.f13889b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C2725kr.m20985e(m15353d(jw0.f13888a, cryptoInfo.iv));
        cryptoInfo.mode = jw0.f13890c;
        if (w67.f19021a >= 24) {
            cryptoInfo.setPattern(new MediaCodec$CryptoInfo$Pattern(jw0.f13894g, jw0.f13895h));
        }
    }

    /* renamed from: d */
    public static byte[] m15353d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: e */
    public static int[] m15354e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* renamed from: k */
    public static C2194b m15355k() {
        ArrayDeque<C2194b> arrayDeque = f10832g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                C2194b bVar = new C2194b();
                return bVar;
            }
            C2194b removeFirst = arrayDeque.removeFirst();
            return removeFirst;
        }
    }

    /* renamed from: o */
    public static void m15356o(C2194b bVar) {
        ArrayDeque<C2194b> arrayDeque = f10832g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    /* renamed from: b */
    public final void mo18910b() throws InterruptedException {
        this.f10838e.mo22886c();
        ((Handler) C2725kr.m20985e(this.f10836c)).obtainMessage(2).sendToTarget();
        this.f10838e.mo22884a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: ds$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: ds$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18911f(android.os.Message r10) {
        /*
            r9 = this;
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L_0x0036
            r2 = 1
            if (r0 == r2) goto L_0x0022
            r2 = 2
            if (r0 == r2) goto L_0x001c
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r9.f10837d
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r2.<init>(r10)
            p000.ao0.m10672a(r0, r1, r2)
            goto L_0x0049
        L_0x001c:
            lo0 r10 = r9.f10838e
            r10.mo22888e()
            goto L_0x0049
        L_0x0022:
            java.lang.Object r10 = r10.obj
            r1 = r10
            ds$b r1 = (p000.C2192ds.C2194b) r1
            int r3 = r1.f10841a
            int r4 = r1.f10842b
            android.media.MediaCodec$CryptoInfo r5 = r1.f10844d
            long r6 = r1.f10845e
            int r8 = r1.f10846f
            r2 = r9
            r2.mo18913h(r3, r4, r5, r6, r8)
            goto L_0x0049
        L_0x0036:
            java.lang.Object r10 = r10.obj
            r1 = r10
            ds$b r1 = (p000.C2192ds.C2194b) r1
            int r3 = r1.f10841a
            int r4 = r1.f10842b
            int r5 = r1.f10843c
            long r6 = r1.f10845e
            int r8 = r1.f10846f
            r2 = r9
            r2.mo18912g(r3, r4, r5, r6, r8)
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            m15356o(r1)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C2192ds.mo18911f(android.os.Message):void");
    }

    /* renamed from: g */
    public final void mo18912g(int i, int i2, int i3, long j, int i4) {
        try {
            this.f10834a.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            ao0.m10672a(this.f10837d, (Object) null, e);
        }
    }

    /* renamed from: h */
    public final void mo18913h(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            synchronized (f10833h) {
                this.f10834a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            ao0.m10672a(this.f10837d, (Object) null, e);
        }
    }

    /* renamed from: i */
    public void mo18914i() {
        if (this.f10839f) {
            try {
                mo18915j();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: j */
    public final void mo18915j() throws InterruptedException {
        ((Handler) C2725kr.m20985e(this.f10836c)).removeCallbacksAndMessages((Object) null);
        mo18910b();
    }

    /* renamed from: l */
    public final void mo18916l() {
        RuntimeException andSet = this.f10837d.getAndSet((Object) null);
        if (andSet != null) {
            throw andSet;
        }
    }

    /* renamed from: m */
    public void mo18917m(int i, int i2, int i3, long j, int i4) {
        mo18916l();
        C2194b k = m15355k();
        k.mo18923a(i, i2, i3, j, i4);
        ((Handler) w67.m29360j(this.f10836c)).obtainMessage(0, k).sendToTarget();
    }

    /* renamed from: n */
    public void mo18918n(int i, int i2, jw0 jw0, long j, int i3) {
        mo18916l();
        C2194b k = m15355k();
        k.mo18923a(i, i2, 0, j, i3);
        m15352c(jw0, k.f10844d);
        ((Handler) w67.m29360j(this.f10836c)).obtainMessage(1, k).sendToTarget();
    }

    /* renamed from: p */
    public void mo18919p() {
        if (this.f10839f) {
            mo18914i();
            this.f10835b.quit();
        }
        this.f10839f = false;
    }

    /* renamed from: q */
    public void mo18920q() {
        if (!this.f10839f) {
            this.f10835b.start();
            this.f10836c = new C2193a(this.f10835b.getLooper());
            this.f10839f = true;
        }
    }

    /* renamed from: r */
    public void mo18921r() throws InterruptedException {
        mo18910b();
    }

    public C2192ds(MediaCodec mediaCodec, HandlerThread handlerThread, lo0 lo0) {
        this.f10834a = mediaCodec;
        this.f10835b = handlerThread;
        this.f10838e = lo0;
        this.f10837d = new AtomicReference<>();
    }
}

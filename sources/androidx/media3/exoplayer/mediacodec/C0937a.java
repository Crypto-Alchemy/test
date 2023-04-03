package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.C0941c;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.exoplayer.mediacodec.a */
/* compiled from: AsynchronousMediaCodecAdapter */
public final class C0937a implements C0941c {

    /* renamed from: a */
    public final MediaCodec f5107a;

    /* renamed from: b */
    public final C2322fs f5108b;

    /* renamed from: c */
    public final C2192ds f5109c;

    /* renamed from: d */
    public final boolean f5110d;

    /* renamed from: e */
    public boolean f5111e;

    /* renamed from: f */
    public int f5112f;

    /* renamed from: androidx.media3.exoplayer.mediacodec.a$b */
    /* compiled from: AsynchronousMediaCodecAdapter */
    public static final class C0939b implements C0941c.C0943b {

        /* renamed from: a */
        public final rd6<HandlerThread> f5113a;

        /* renamed from: b */
        public final rd6<HandlerThread> f5114b;

        /* renamed from: c */
        public final boolean f5115c;

        public C0939b(int i, boolean z) {
            this(new C1646bs(i), new C2117cs(i), z);
        }

        /* renamed from: e */
        public static /* synthetic */ HandlerThread m6882e(int i) {
            return new HandlerThread(C0937a.m6859t(i));
        }

        /* renamed from: f */
        public static /* synthetic */ HandlerThread m6883f(int i) {
            return new HandlerThread(C0937a.m6860u(i));
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.media3.exoplayer.mediacodec.C0937a mo7502a(androidx.media3.exoplayer.mediacodec.C0941c.C0942a r10) throws java.io.IOException {
            /*
                r9 = this;
                androidx.media3.exoplayer.mediacodec.d r0 = r10.f5118a
                java.lang.String r0 = r0.f5124a
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004d }
                r2.<init>()     // Catch:{ Exception -> 0x004d }
                java.lang.String r3 = "createCodec:"
                r2.append(r3)     // Catch:{ Exception -> 0x004d }
                r2.append(r0)     // Catch:{ Exception -> 0x004d }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x004d }
                p000.ps6.m25173a(r2)     // Catch:{ Exception -> 0x004d }
                android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x004d }
                androidx.media3.exoplayer.mediacodec.a r2 = new androidx.media3.exoplayer.mediacodec.a     // Catch:{ Exception -> 0x004b }
                rd6<android.os.HandlerThread> r3 = r9.f5113a     // Catch:{ Exception -> 0x004b }
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x004b }
                r5 = r3
                android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x004b }
                rd6<android.os.HandlerThread> r3 = r9.f5114b     // Catch:{ Exception -> 0x004b }
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x004b }
                r6 = r3
                android.os.HandlerThread r6 = (android.os.HandlerThread) r6     // Catch:{ Exception -> 0x004b }
                boolean r7 = r9.f5115c     // Catch:{ Exception -> 0x004b }
                r8 = 0
                r3 = r2
                r4 = r0
                r3.<init>(r4, r5, r6, r7)     // Catch:{ Exception -> 0x004b }
                p000.ps6.m25175c()     // Catch:{ Exception -> 0x0048 }
                android.media.MediaFormat r1 = r10.f5119b     // Catch:{ Exception -> 0x0048 }
                android.view.Surface r3 = r10.f5121d     // Catch:{ Exception -> 0x0048 }
                android.media.MediaCrypto r4 = r10.f5122e     // Catch:{ Exception -> 0x0048 }
                int r10 = r10.f5123f     // Catch:{ Exception -> 0x0048 }
                r2.mo7500w(r1, r3, r4, r10)     // Catch:{ Exception -> 0x0048 }
                return r2
            L_0x0048:
                r10 = move-exception
                r1 = r2
                goto L_0x004f
            L_0x004b:
                r10 = move-exception
                goto L_0x004f
            L_0x004d:
                r10 = move-exception
                r0 = r1
            L_0x004f:
                if (r1 != 0) goto L_0x0057
                if (r0 == 0) goto L_0x005a
                r0.release()
                goto L_0x005a
            L_0x0057:
                r1.mo7484a()
            L_0x005a:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.C0937a.C0939b.mo7502a(androidx.media3.exoplayer.mediacodec.c$a):androidx.media3.exoplayer.mediacodec.a");
        }

        public C0939b(rd6<HandlerThread> rd6, rd6<HandlerThread> rd62, boolean z) {
            this.f5113a = rd6;
            this.f5114b = rd62;
            this.f5115c = z;
        }
    }

    /* renamed from: t */
    public static String m6859t(int i) {
        return m6861v(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* renamed from: u */
    public static String m6860u(int i) {
        return m6861v(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* renamed from: v */
    public static String m6861v(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m6862x(C0941c.C0944c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.mo7504a(this, j, j2);
    }

    /* renamed from: a */
    public void mo7484a() {
        try {
            if (this.f5112f == 1) {
                this.f5109c.mo18919p();
                this.f5108b.mo20133o();
            }
            this.f5112f = 2;
        } finally {
            if (!this.f5111e) {
                this.f5107a.release();
                this.f5111e = true;
            }
        }
    }

    /* renamed from: b */
    public void mo7485b(C0941c.C0944c cVar, Handler handler) {
        mo7501y();
        this.f5107a.setOnFrameRenderedListener(new C1578as(this, cVar), handler);
    }

    /* renamed from: c */
    public void mo7486c(int i, int i2, jw0 jw0, long j, int i3) {
        this.f5109c.mo18918n(i, i2, jw0, j, i3);
    }

    /* renamed from: d */
    public MediaFormat mo7487d() {
        return this.f5108b.mo20125g();
    }

    /* renamed from: e */
    public void mo7488e(int i) {
        mo7501y();
        this.f5107a.setVideoScalingMode(i);
    }

    /* renamed from: f */
    public ByteBuffer mo7489f(int i) {
        return this.f5107a.getInputBuffer(i);
    }

    public void flush() {
        this.f5109c.mo18914i();
        this.f5107a.flush();
        this.f5108b.mo20123e();
        this.f5107a.start();
    }

    /* renamed from: g */
    public void mo7491g(Surface surface) {
        mo7501y();
        this.f5107a.setOutputSurface(surface);
    }

    /* renamed from: h */
    public void mo7492h(int i, int i2, int i3, long j, int i4) {
        this.f5109c.mo18917m(i, i2, i3, j, i4);
    }

    /* renamed from: i */
    public boolean mo7493i() {
        return false;
    }

    /* renamed from: j */
    public void mo7494j(Bundle bundle) {
        mo7501y();
        this.f5107a.setParameters(bundle);
    }

    /* renamed from: k */
    public void mo7495k(int i, long j) {
        this.f5107a.releaseOutputBuffer(i, j);
    }

    /* renamed from: l */
    public int mo7496l() {
        return this.f5108b.mo20121c();
    }

    /* renamed from: m */
    public int mo7497m(MediaCodec.BufferInfo bufferInfo) {
        return this.f5108b.mo20122d(bufferInfo);
    }

    /* renamed from: n */
    public void mo7498n(int i, boolean z) {
        this.f5107a.releaseOutputBuffer(i, z);
    }

    /* renamed from: o */
    public ByteBuffer mo7499o(int i) {
        return this.f5107a.getOutputBuffer(i);
    }

    /* renamed from: w */
    public final void mo7500w(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.f5108b.mo20126h(this.f5107a);
        ps6.m25173a("configureCodec");
        this.f5107a.configure(mediaFormat, surface, mediaCrypto, i);
        ps6.m25175c();
        this.f5109c.mo18920q();
        ps6.m25173a("startCodec");
        this.f5107a.start();
        ps6.m25175c();
        this.f5112f = 1;
    }

    /* renamed from: y */
    public final void mo7501y() {
        if (this.f5110d) {
            try {
                this.f5109c.mo18921r();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public C0937a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.f5107a = mediaCodec;
        this.f5108b = new C2322fs(handlerThread);
        this.f5109c = new C2192ds(mediaCodec, handlerThread2);
        this.f5110d = z;
        this.f5112f = 0;
    }
}

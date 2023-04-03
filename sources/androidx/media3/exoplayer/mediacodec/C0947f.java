package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.C0941c;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.exoplayer.mediacodec.f */
/* compiled from: SynchronousMediaCodecAdapter */
public final class C0947f implements C0941c {

    /* renamed from: a */
    public final MediaCodec f5136a;

    /* renamed from: b */
    public ByteBuffer[] f5137b;

    /* renamed from: c */
    public ByteBuffer[] f5138c;

    /* renamed from: androidx.media3.exoplayer.mediacodec.f$b */
    /* compiled from: SynchronousMediaCodecAdapter */
    public static class C0949b implements C0941c.C0943b {
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.media3.exoplayer.mediacodec.C0941c mo7502a(androidx.media3.exoplayer.mediacodec.C0941c.C0942a r6) throws java.io.IOException {
            /*
                r5 = this;
                r0 = 0
                android.media.MediaCodec r1 = r5.mo7520b(r6)     // Catch:{ IOException -> 0x0030, RuntimeException -> 0x002e }
                java.lang.String r2 = "configureCodec"
                p000.ps6.m25173a(r2)     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                android.media.MediaFormat r2 = r6.f5119b     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                android.view.Surface r3 = r6.f5121d     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                android.media.MediaCrypto r4 = r6.f5122e     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                int r6 = r6.f5123f     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                r1.configure(r2, r3, r4, r6)     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                p000.ps6.m25175c()     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                java.lang.String r6 = "startCodec"
                p000.ps6.m25173a(r6)     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                r1.start()     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                p000.ps6.m25175c()     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                androidx.media3.exoplayer.mediacodec.f r6 = new androidx.media3.exoplayer.mediacodec.f     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                r6.<init>(r1)     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                return r6
            L_0x0029:
                r6 = move-exception
                goto L_0x002c
            L_0x002b:
                r6 = move-exception
            L_0x002c:
                r0 = r1
                goto L_0x0031
            L_0x002e:
                r6 = move-exception
                goto L_0x0031
            L_0x0030:
                r6 = move-exception
            L_0x0031:
                if (r0 == 0) goto L_0x0036
                r0.release()
            L_0x0036:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.C0947f.C0949b.mo7502a(androidx.media3.exoplayer.mediacodec.c$a):androidx.media3.exoplayer.mediacodec.c");
        }

        /* renamed from: b */
        public MediaCodec mo7520b(C0941c.C0942a aVar) throws IOException {
            C2725kr.m20985e(aVar.f5118a);
            String str = aVar.f5118a.f5124a;
            ps6.m25173a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            ps6.m25175c();
            return createByCodecName;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m6937q(C0941c.C0944c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.mo7504a(this, j, j2);
    }

    /* renamed from: a */
    public void mo7484a() {
        this.f5137b = null;
        this.f5138c = null;
        this.f5136a.release();
    }

    /* renamed from: b */
    public void mo7485b(C0941c.C0944c cVar, Handler handler) {
        this.f5136a.setOnFrameRenderedListener(new dk6(this, cVar), handler);
    }

    /* renamed from: c */
    public void mo7486c(int i, int i2, jw0 jw0, long j, int i3) {
        this.f5136a.queueSecureInputBuffer(i, i2, jw0.mo22096a(), j, i3);
    }

    /* renamed from: d */
    public MediaFormat mo7487d() {
        return this.f5136a.getOutputFormat();
    }

    /* renamed from: e */
    public void mo7488e(int i) {
        this.f5136a.setVideoScalingMode(i);
    }

    /* renamed from: f */
    public ByteBuffer mo7489f(int i) {
        if (w67.f19021a >= 21) {
            return this.f5136a.getInputBuffer(i);
        }
        return ((ByteBuffer[]) w67.m29360j(this.f5137b))[i];
    }

    public void flush() {
        this.f5136a.flush();
    }

    /* renamed from: g */
    public void mo7491g(Surface surface) {
        this.f5136a.setOutputSurface(surface);
    }

    /* renamed from: h */
    public void mo7492h(int i, int i2, int i3, long j, int i4) {
        this.f5136a.queueInputBuffer(i, i2, i3, j, i4);
    }

    /* renamed from: i */
    public boolean mo7493i() {
        return false;
    }

    /* renamed from: j */
    public void mo7494j(Bundle bundle) {
        this.f5136a.setParameters(bundle);
    }

    /* renamed from: k */
    public void mo7495k(int i, long j) {
        this.f5136a.releaseOutputBuffer(i, j);
    }

    /* renamed from: l */
    public int mo7496l() {
        return this.f5136a.dequeueInputBuffer(0);
    }

    /* renamed from: m */
    public int mo7497m(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f5136a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && w67.f19021a < 21) {
                this.f5138c = this.f5136a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    /* renamed from: n */
    public void mo7498n(int i, boolean z) {
        this.f5136a.releaseOutputBuffer(i, z);
    }

    /* renamed from: o */
    public ByteBuffer mo7499o(int i) {
        if (w67.f19021a >= 21) {
            return this.f5136a.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) w67.m29360j(this.f5138c))[i];
    }

    public C0947f(MediaCodec mediaCodec) {
        this.f5136a = mediaCodec;
        if (w67.f19021a < 21) {
            this.f5137b = mediaCodec.getInputBuffers();
            this.f5138c = mediaCodec.getOutputBuffers();
        }
    }
}

package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.C0792h;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.exoplayer.mediacodec.c */
/* compiled from: MediaCodecAdapter */
public interface C0941c {

    /* renamed from: androidx.media3.exoplayer.mediacodec.c$a */
    /* compiled from: MediaCodecAdapter */
    public static final class C0942a {

        /* renamed from: a */
        public final C0945d f5118a;

        /* renamed from: b */
        public final MediaFormat f5119b;

        /* renamed from: c */
        public final C0792h f5120c;

        /* renamed from: d */
        public final Surface f5121d;

        /* renamed from: e */
        public final MediaCrypto f5122e;

        /* renamed from: f */
        public final int f5123f;

        public C0942a(C0945d dVar, MediaFormat mediaFormat, C0792h hVar, Surface surface, MediaCrypto mediaCrypto, int i) {
            this.f5118a = dVar;
            this.f5119b = mediaFormat;
            this.f5120c = hVar;
            this.f5121d = surface;
            this.f5122e = mediaCrypto;
            this.f5123f = i;
        }

        /* renamed from: a */
        public static C0942a m6902a(C0945d dVar, MediaFormat mediaFormat, C0792h hVar, MediaCrypto mediaCrypto) {
            return new C0942a(dVar, mediaFormat, hVar, (Surface) null, mediaCrypto, 0);
        }

        /* renamed from: b */
        public static C0942a m6903b(C0945d dVar, MediaFormat mediaFormat, C0792h hVar, Surface surface, MediaCrypto mediaCrypto) {
            return new C0942a(dVar, mediaFormat, hVar, surface, mediaCrypto, 0);
        }
    }

    /* renamed from: androidx.media3.exoplayer.mediacodec.c$b */
    /* compiled from: MediaCodecAdapter */
    public interface C0943b {
        /* renamed from: a */
        C0941c mo7502a(C0942a aVar) throws IOException;
    }

    /* renamed from: androidx.media3.exoplayer.mediacodec.c$c */
    /* compiled from: MediaCodecAdapter */
    public interface C0944c {
        /* renamed from: a */
        void mo7504a(C0941c cVar, long j, long j2);
    }

    /* renamed from: a */
    void mo7484a();

    /* renamed from: b */
    void mo7485b(C0944c cVar, Handler handler);

    /* renamed from: c */
    void mo7486c(int i, int i2, jw0 jw0, long j, int i3);

    /* renamed from: d */
    MediaFormat mo7487d();

    /* renamed from: e */
    void mo7488e(int i);

    /* renamed from: f */
    ByteBuffer mo7489f(int i);

    void flush();

    /* renamed from: g */
    void mo7491g(Surface surface);

    /* renamed from: h */
    void mo7492h(int i, int i2, int i3, long j, int i4);

    /* renamed from: i */
    boolean mo7493i();

    /* renamed from: j */
    void mo7494j(Bundle bundle);

    /* renamed from: k */
    void mo7495k(int i, long j);

    /* renamed from: l */
    int mo7496l();

    /* renamed from: m */
    int mo7497m(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: n */
    void mo7498n(int i, boolean z);

    /* renamed from: o */
    ByteBuffer mo7499o(int i);
}

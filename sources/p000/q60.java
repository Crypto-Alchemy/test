package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.C1725a;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p000.ig2;

/* renamed from: q60 */
/* compiled from: ByteBufferGifDecoder */
public class q60 implements gf5<ByteBuffer, jg2> {

    /* renamed from: f */
    public static final C3128a f16810f = new C3128a();

    /* renamed from: g */
    public static final C3129b f16811g = new C3129b();

    /* renamed from: a */
    public final Context f16812a;

    /* renamed from: b */
    public final List<ImageHeaderParser> f16813b;

    /* renamed from: c */
    public final C3129b f16814c;

    /* renamed from: d */
    public final C3128a f16815d;

    /* renamed from: e */
    public final hg2 f16816e;

    /* renamed from: q60$a */
    /* compiled from: ByteBufferGifDecoder */
    public static class C3128a {
        /* renamed from: a */
        public ig2 mo24948a(ig2.C2541a aVar, rg2 rg2, ByteBuffer byteBuffer, int i) {
            return new d86(aVar, rg2, byteBuffer, i);
        }
    }

    /* renamed from: q60$b */
    /* compiled from: ByteBufferGifDecoder */
    public static class C3129b {

        /* renamed from: a */
        public final Queue<sg2> f16817a = p67.m24678f(0);

        /* renamed from: a */
        public synchronized sg2 mo24949a(ByteBuffer byteBuffer) {
            sg2 poll;
            poll = this.f16817a.poll();
            if (poll == null) {
                poll = new sg2();
            }
            return poll.mo25781p(byteBuffer);
        }

        /* renamed from: b */
        public synchronized void mo24950b(sg2 sg2) {
            sg2.mo25766a();
            this.f16817a.offer(sg2);
        }
    }

    public q60(Context context, List<ImageHeaderParser> list, t20 t20, C2982oq oqVar) {
        this(context, list, t20, oqVar, f16811g, f16810f);
    }

    /* renamed from: e */
    public static int m25446e(rg2 rg2, int i, int i2) {
        int i3;
        int min = Math.min(rg2.mo25369a() / i2, rg2.mo25372d() / i);
        if (min == 0) {
            i3 = 0;
        } else {
            i3 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i3);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Downsampling GIF, sampleSize: ");
            sb.append(max);
            sb.append(", target dimens: [");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("], actual dimens: [");
            sb.append(rg2.mo25372d());
            sb.append("x");
            sb.append(rg2.mo25369a());
            sb.append("]");
        }
        return max;
    }

    /* renamed from: c */
    public final mg2 mo24945c(ByteBuffer byteBuffer, int i, int i2, sg2 sg2, xi4 xi4) {
        Bitmap.Config config;
        long b = ok3.m23850b();
        try {
            rg2 c = sg2.mo25768c();
            if (c.mo25370b() > 0) {
                if (c.mo25371c() == 0) {
                    if (xi4.mo27760c(tg2.f18150a) == DecodeFormat.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    ig2 a = this.f16815d.mo24948a(this.f16816e, c, byteBuffer, m25446e(c, i, i2));
                    a.mo18575d(config);
                    a.mo18573c();
                    Bitmap b2 = a.mo18572b();
                    if (b2 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Decoded GIF from stream in ");
                            sb.append(ok3.m23849a(b));
                        }
                        return null;
                    }
                    mg2 mg2 = new mg2(new jg2(this.f16812a, a, w37.m29260c(), i, i2, b2));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Decoded GIF from stream in ");
                        sb2.append(ok3.m23849a(b));
                    }
                    return mg2;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Decoded GIF from stream in ");
                sb3.append(ok3.m23849a(b));
            }
        }
    }

    /* renamed from: d */
    public mg2 mo415b(ByteBuffer byteBuffer, int i, int i2, xi4 xi4) {
        sg2 a = this.f16814c.mo24949a(byteBuffer);
        try {
            return mo24945c(byteBuffer, i, i2, a, xi4);
        } finally {
            this.f16814c.mo24950b(a);
        }
    }

    /* renamed from: f */
    public boolean mo414a(ByteBuffer byteBuffer, xi4 xi4) throws IOException {
        if (((Boolean) xi4.mo27760c(tg2.f18151b)).booleanValue() || C1725a.m12274g(this.f16813b, byteBuffer) != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }

    public q60(Context context, List<ImageHeaderParser> list, t20 t20, C2982oq oqVar, C3129b bVar, C3128a aVar) {
        this.f16812a = context.getApplicationContext();
        this.f16813b = list;
        this.f16815d = aVar;
        this.f16816e = new hg2(t20, oqVar);
        this.f16814c = bVar;
    }
}

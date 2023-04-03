package androidx.media3.extractor.flv;

import androidx.media3.common.C0792h;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.flv.TagPayloadReader;
import p000.zs6;

/* renamed from: androidx.media3.extractor.flv.b */
/* compiled from: VideoTagPayloadReader */
public final class C1035b extends TagPayloadReader {

    /* renamed from: b */
    public final gm4 f5551b = new gm4(q24.f16719a);

    /* renamed from: c */
    public final gm4 f5552c = new gm4(4);

    /* renamed from: d */
    public int f5553d;

    /* renamed from: e */
    public boolean f5554e;

    /* renamed from: f */
    public boolean f5555f;

    /* renamed from: g */
    public int f5556g;

    public C1035b(zs6 zs6) {
        super(zs6);
    }

    /* renamed from: b */
    public boolean mo7880b(gm4 gm4) throws TagPayloadReader.UnsupportedFormatException {
        int D = gm4.mo20662D();
        int i = (D >> 4) & 15;
        int i2 = D & 15;
        if (i2 == 7) {
            this.f5556g = i;
            if (i != 5) {
                return true;
            }
            return false;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i2);
    }

    /* renamed from: c */
    public boolean mo7881c(gm4 gm4, long j) throws ParserException {
        int i;
        int D = gm4.mo20662D();
        long o = j + (((long) gm4.mo20690o()) * 1000);
        if (D == 0 && !this.f5554e) {
            gm4 gm42 = new gm4(new byte[gm4.mo20676a()]);
            gm4.mo20685j(gm42.mo20679d(), 0, gm4.mo20676a());
            C3697yv b = C3697yv.m30841b(gm42);
            this.f5553d = b.f20383b;
            this.f5546a.mo7303d(new C0792h.C0794b().mo6670e0("video/avc").mo6648I(b.f20387f).mo6675j0(b.f20384c).mo6656Q(b.f20385d).mo6666a0(b.f20386e).mo6659T(b.f20382a).mo6644E());
            this.f5554e = true;
            return false;
        } else if (D != 1 || !this.f5554e) {
            return false;
        } else {
            if (this.f5556g == 1) {
                i = 1;
            } else {
                i = 0;
            }
            if (!this.f5555f && i == 0) {
                return false;
            }
            byte[] d = this.f5552c.mo20679d();
            d[0] = 0;
            d[1] = 0;
            d[2] = 0;
            int i2 = 4 - this.f5553d;
            int i3 = 0;
            while (gm4.mo20676a() > 0) {
                gm4.mo20685j(this.f5552c.mo20679d(), i2, this.f5553d);
                this.f5552c.mo20674P(0);
                int H = this.f5552c.mo20666H();
                this.f5551b.mo20674P(0);
                this.f5546a.mo7300a(this.f5551b, 4);
                this.f5546a.mo7300a(gm4, H);
                i3 = i3 + 4 + H;
            }
            this.f5546a.mo7301b(o, i, i3, 0, (zs6.C3758a) null);
            this.f5555f = true;
            return true;
        }
    }
}

package androidx.media3.extractor.flv;

import androidx.media3.common.C0792h;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.flv.TagPayloadReader;
import java.util.Collections;
import p000.C2740l5;
import p000.zs6;

/* renamed from: androidx.media3.extractor.flv.a */
/* compiled from: AudioTagPayloadReader */
public final class C1034a extends TagPayloadReader {

    /* renamed from: e */
    public static final int[] f5547e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f5548b;

    /* renamed from: c */
    public boolean f5549c;

    /* renamed from: d */
    public int f5550d;

    public C1034a(zs6 zs6) {
        super(zs6);
    }

    /* renamed from: b */
    public boolean mo7880b(gm4 gm4) throws TagPayloadReader.UnsupportedFormatException {
        String str;
        if (!this.f5548b) {
            int D = gm4.mo20662D();
            int i = (D >> 4) & 15;
            this.f5550d = i;
            if (i == 2) {
                this.f5546a.mo7303d(new C0792h.C0794b().mo6670e0("audio/mpeg").mo6647H(1).mo6671f0(f5547e[(D >> 2) & 3]).mo6644E());
                this.f5549c = true;
            } else if (i == 7 || i == 8) {
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                this.f5546a.mo7303d(new C0792h.C0794b().mo6670e0(str).mo6647H(1).mo6671f0(8000).mo6644E());
                this.f5549c = true;
            } else if (i != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f5550d);
            }
            this.f5548b = true;
        } else {
            gm4.mo20675Q(1);
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo7881c(gm4 gm4, long j) throws ParserException {
        if (this.f5550d == 2) {
            int a = gm4.mo20676a();
            this.f5546a.mo7300a(gm4, a);
            this.f5546a.mo7301b(j, 1, a, 0, (zs6.C3758a) null);
            return true;
        }
        int D = gm4.mo20662D();
        if (D == 0 && !this.f5549c) {
            int a2 = gm4.mo20676a();
            byte[] bArr = new byte[a2];
            gm4.mo20685j(bArr, 0, a2);
            C2740l5.C2742b e = C2740l5.m21231e(bArr);
            this.f5546a.mo7303d(new C0792h.C0794b().mo6670e0("audio/mp4a-latm").mo6648I(e.f14416c).mo6647H(e.f14415b).mo6671f0(e.f14414a).mo6659T(Collections.singletonList(bArr)).mo6644E());
            this.f5549c = true;
            return false;
        } else if (this.f5550d == 10 && D != 1) {
            return false;
        } else {
            int a3 = gm4.mo20676a();
            this.f5546a.mo7300a(gm4, a3);
            this.f5546a.mo7301b(j, 1, a3, 0, (zs6.C3758a) null);
            return true;
        }
    }
}

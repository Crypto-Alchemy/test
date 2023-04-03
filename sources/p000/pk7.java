package p000;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.util.ArrayList;

/* renamed from: pk7 */
/* compiled from: WebvttDecoder */
public final class pk7 extends z26 {

    /* renamed from: o */
    public final gm4 f16530o = new gm4();

    /* renamed from: p */
    public final kk7 f16531p = new kk7();

    public pk7() {
        super("WebvttDecoder");
    }

    /* renamed from: C */
    public static int m25013C(gm4 gm4) {
        int i = 0;
        int i2 = -1;
        while (i2 == -1) {
            i = gm4.mo20680e();
            String p = gm4.mo20691p();
            if (p == null) {
                i2 = 0;
            } else if ("STYLE".equals(p)) {
                i2 = 2;
            } else if (p.startsWith("NOTE")) {
                i2 = 1;
            } else {
                i2 = 3;
            }
        }
        gm4.mo20674P(i);
        return i2;
    }

    /* renamed from: D */
    public static void m25014D(gm4 gm4) {
        do {
        } while (!TextUtils.isEmpty(gm4.mo20691p()));
    }

    /* renamed from: A */
    public xc6 mo11312A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        mk7 m;
        this.f16530o.mo20672N(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            qk7.m25745d(this.f16530o);
            do {
            } while (!TextUtils.isEmpty(this.f16530o.mo20691p()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int C = m25013C(this.f16530o);
                if (C == 0) {
                    return new sk7(arrayList2);
                }
                if (C == 1) {
                    m25014D(this.f16530o);
                } else if (C == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f16530o.mo20691p();
                        arrayList.addAll(this.f16531p.mo22344d(this.f16530o));
                    } else {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                } else if (C == 3 && (m = nk7.m23271m(this.f16530o, arrayList)) != null) {
                    arrayList2.add(m);
                }
            }
        } catch (ParserException e) {
            throw new SubtitleDecoderException((Throwable) e);
        }
    }
}

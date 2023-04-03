package p000;

import androidx.media3.extractor.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;
import p000.dx0;

/* renamed from: hz3 */
/* compiled from: Mp4WebvttDecoder */
public final class hz3 extends z26 {

    /* renamed from: o */
    public final gm4 f13121o = new gm4();

    public hz3() {
        super("Mp4WebvttDecoder");
    }

    /* renamed from: C */
    public static dx0 m19336C(gm4 gm4, int i) throws SubtitleDecoderException {
        CharSequence charSequence = null;
        dx0.C2206b bVar = null;
        while (i > 0) {
            if (i >= 8) {
                int n = gm4.mo20689n();
                int n2 = gm4.mo20689n();
                int i2 = n - 8;
                String C = w67.m29298C(gm4.mo20679d(), gm4.mo20680e(), i2);
                gm4.mo20675Q(i2);
                i = (i - 8) - i2;
                if (n2 == 1937011815) {
                    bVar = nk7.m23273o(C);
                } else if (n2 == 1885436268) {
                    charSequence = nk7.m23275q((String) null, C.trim(), Collections.emptyList());
                }
            } else {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (bVar != null) {
            return bVar.mo18993o(charSequence).mo18979a();
        }
        return nk7.m23270l(charSequence);
    }

    /* renamed from: A */
    public xc6 mo11312A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f13121o.mo20672N(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f13121o.mo20676a() > 0) {
            if (this.f13121o.mo20676a() >= 8) {
                int n = this.f13121o.mo20689n();
                if (this.f13121o.mo20689n() == 1987343459) {
                    arrayList.add(m19336C(this.f13121o, n - 8));
                } else {
                    this.f13121o.mo20675Q(n - 8);
                }
            } else {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new iz3(arrayList);
    }
}

package p000;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;
import p000.dx0;

/* renamed from: az6 */
/* compiled from: Tx3gDecoder */
public final class az6 extends z26 {

    /* renamed from: o */
    public final gm4 f7895o = new gm4();

    /* renamed from: p */
    public final boolean f7896p;

    /* renamed from: q */
    public final int f7897q;

    /* renamed from: r */
    public final int f7898r;

    /* renamed from: s */
    public final String f7899s;

    /* renamed from: t */
    public final float f7900t;

    /* renamed from: u */
    public final int f7901u;

    public az6(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z = true;
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f7897q = bArr[24];
            this.f7898r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f7899s = "Serif".equals(w67.m29298C(bArr, 43, bArr.length - 43)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.f7901u = i;
            z = (bArr[0] & 32) == 0 ? false : z;
            this.f7896p = z;
            if (z) {
                this.f7900t = w67.m29372p(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i), Utils.FLOAT_EPSILON, 0.95f);
            } else {
                this.f7900t = 0.85f;
            }
        } else {
            this.f7897q = 0;
            this.f7898r = -1;
            this.f7899s = str;
            this.f7896p = false;
            this.f7900t = 0.85f;
            this.f7901u = -1;
        }
    }

    /* renamed from: D */
    public static void m11001D(boolean z) throws SubtitleDecoderException {
        if (!z) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    /* renamed from: E */
    public static void m11002E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: F */
    public static void m11003F(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z3 = true;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z3 = false;
            }
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z3 && !z && !z2) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* renamed from: G */
    public static void m11004G(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    /* renamed from: H */
    public static String m11005H(gm4 gm4) throws SubtitleDecoderException {
        boolean z;
        char g;
        if (gm4.mo20676a() >= 2) {
            z = true;
        } else {
            z = false;
        }
        m11001D(z);
        int J = gm4.mo20668J();
        if (J == 0) {
            return "";
        }
        if (gm4.mo20676a() < 2 || ((g = gm4.mo20682g()) != 65279 && g != 65534)) {
            return gm4.mo20660B(J, be0.f21263c);
        }
        return gm4.mo20660B(J, be0.f21266f);
    }

    /* renamed from: A */
    public xc6 mo11312A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f7895o.mo20672N(bArr, i);
        String H = m11005H(this.f7895o);
        if (H.isEmpty()) {
            return bz6.f8312d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(H);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        m11003F(spannableStringBuilder2, this.f7897q, 0, 0, spannableStringBuilder.length(), 16711680);
        m11002E(spannableStringBuilder2, this.f7898r, -1, 0, spannableStringBuilder.length(), 16711680);
        m11004G(spannableStringBuilder, this.f7899s, 0, spannableStringBuilder.length());
        float f = this.f7900t;
        while (this.f7895o.mo20676a() >= 8) {
            int e = this.f7895o.mo20680e();
            int n = this.f7895o.mo20689n();
            int n2 = this.f7895o.mo20689n();
            boolean z2 = true;
            if (n2 == 1937013100) {
                if (this.f7895o.mo20676a() < 2) {
                    z2 = false;
                }
                m11001D(z2);
                int J = this.f7895o.mo20668J();
                for (int i2 = 0; i2 < J; i2++) {
                    mo11313C(this.f7895o, spannableStringBuilder);
                }
            } else if (n2 == 1952608120 && this.f7896p) {
                if (this.f7895o.mo20676a() < 2) {
                    z2 = false;
                }
                m11001D(z2);
                f = w67.m29372p(((float) this.f7895o.mo20668J()) / ((float) this.f7901u), Utils.FLOAT_EPSILON, 0.95f);
            }
            this.f7895o.mo20674P(e + n);
        }
        return new bz6(new dx0.C2206b().mo18993o(spannableStringBuilder).mo18986h(f, 0).mo18987i(0).mo18979a());
    }

    /* renamed from: C */
    public final void mo11313C(gm4 gm4, SpannableStringBuilder spannableStringBuilder) throws SubtitleDecoderException {
        boolean z;
        int i;
        if (gm4.mo20676a() >= 12) {
            z = true;
        } else {
            z = false;
        }
        m11001D(z);
        int J = gm4.mo20668J();
        int J2 = gm4.mo20668J();
        gm4.mo20675Q(2);
        int D = gm4.mo20662D();
        gm4.mo20675Q(1);
        int n = gm4.mo20689n();
        if (J2 > spannableStringBuilder.length()) {
            gk3.m18132i("Tx3gDecoder", "Truncating styl end (" + J2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            i = spannableStringBuilder.length();
        } else {
            i = J2;
        }
        if (J >= i) {
            gk3.m18132i("Tx3gDecoder", "Ignoring styl with start (" + J + ") >= end (" + i + ").");
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i2 = J;
        int i3 = i;
        m11003F(spannableStringBuilder2, D, this.f7897q, i2, i3, 0);
        m11002E(spannableStringBuilder2, n, this.f7898r, i2, i3, 0);
    }
}

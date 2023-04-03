package p000;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: io1 */
/* compiled from: EmojiSpan */
public abstract class io1 extends ReplacementSpan {

    /* renamed from: a */
    public final Paint.FontMetricsInt f13338a = new Paint.FontMetricsInt();

    /* renamed from: d */
    public final ho1 f13339d;

    /* renamed from: e */
    public short f13340e = -1;

    /* renamed from: g */
    public short f13341g = -1;

    /* renamed from: k */
    public float f13342k = 1.0f;

    public io1(ho1 ho1) {
        gu4.m18429g(ho1, "metadata cannot be null");
        this.f13339d = ho1;
    }

    /* renamed from: a */
    public final ho1 mo21582a() {
        return this.f13339d;
    }

    /* renamed from: b */
    public final int mo21583b() {
        return this.f13340e;
    }

    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f13338a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f13338a;
        this.f13342k = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f13339d.mo21320e());
        this.f13341g = (short) ((int) (((float) this.f13339d.mo21320e()) * this.f13342k));
        short i3 = (short) ((int) (((float) this.f13339d.mo21324i()) * this.f13342k));
        this.f13340e = i3;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f13338a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i3;
    }
}

package p000;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.emoji2.text.C0593c;

/* renamed from: p27 */
/* compiled from: TypefaceEmojiSpan */
public final class p27 extends io1 {

    /* renamed from: r */
    public static Paint f16266r;

    public p27(ho1 ho1) {
        super(ho1);
    }

    /* renamed from: c */
    public static Paint m24472c() {
        if (f16266r == null) {
            TextPaint textPaint = new TextPaint();
            f16266r = textPaint;
            textPaint.setColor(C0593c.m4517b().mo5619c());
            f16266r.setStyle(Paint.Style.FILL);
        }
        return f16266r;
    }

    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (C0593c.m4517b().mo5621i()) {
            canvas.drawRect(f, (float) i3, f + ((float) mo21583b()), (float) i5, m24472c());
        }
        mo21582a().mo21316a(canvas, f, (float) i4, paint);
    }
}

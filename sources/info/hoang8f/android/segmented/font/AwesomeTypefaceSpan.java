package info.hoang8f.android.segmented.font;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

public class AwesomeTypefaceSpan extends TypefaceSpan {

    /* renamed from: a */
    public final Context f29988a;

    /* renamed from: d */
    public final sp2 f29989d;

    public AwesomeTypefaceSpan(Context context, sp2 sp2) {
        super(sp2.mo47848b().toString());
        this.f29988a = context.getApplicationContext();
        this.f29989d = sp2;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTypeface(r27.m50930b(this.f29988a, this.f29989d));
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(r27.m50930b(this.f29988a, this.f29989d));
    }
}

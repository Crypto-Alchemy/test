package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public class AppCompatRatingBar extends RatingBar {

    /* renamed from: a */
    public final C2307fn f1036a;

    public AppCompatRatingBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.f1036a.mo20017b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m15.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        xo6.m30262a(this, getContext());
        C2307fn fnVar = new C2307fn(this);
        this.f1036a = fnVar;
        fnVar.mo20018c(attributeSet, i);
    }
}

package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Placeholder extends View {

    /* renamed from: a */
    public int f3201a = -1;

    /* renamed from: d */
    public View f3202d = null;

    /* renamed from: e */
    public int f3203e = 4;

    public Placeholder(Context context) {
        super(context);
        mo5121a((AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo5121a(AttributeSet attributeSet) {
        super.setVisibility(this.f3203e);
        this.f3201a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c65.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.ConstraintLayout_placeholder_content) {
                    this.f3201a = obtainStyledAttributes.getResourceId(index, this.f3201a);
                } else if (index == c65.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f3203e = obtainStyledAttributes.getInt(index, this.f3203e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public void mo5122b(ConstraintLayout constraintLayout) {
        if (this.f3202d != null) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f3202d.getLayoutParams();
            layoutParams2.f3170u0.mo4396g1(0);
            ConstraintWidget.DimensionBehaviour C = layoutParams.f3170u0.mo4331C();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
            if (C != dimensionBehaviour) {
                layoutParams.f3170u0.mo4399h1(layoutParams2.f3170u0.mo4369V());
            }
            if (layoutParams.f3170u0.mo4363S() != dimensionBehaviour) {
                layoutParams.f3170u0.mo4344I0(layoutParams2.f3170u0.mo4441z());
            }
            layoutParams2.f3170u0.mo4396g1(8);
        }
    }

    /* renamed from: c */
    public void mo5123c(ConstraintLayout constraintLayout) {
        if (this.f3201a == -1 && !isInEditMode()) {
            setVisibility(this.f3203e);
        }
        View findViewById = constraintLayout.findViewById(this.f3201a);
        this.f3202d = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).f3146i0 = true;
            this.f3202d.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f3202d;
    }

    public int getEmptyVisibility() {
        return this.f3203e;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f3201a != i) {
            View view = this.f3202d;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.LayoutParams) this.f3202d.getLayoutParams()).f3146i0 = false;
                this.f3202d = null;
            }
            this.f3201a = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f3203e = i;
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo5121a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo5121a(attributeSet);
    }
}

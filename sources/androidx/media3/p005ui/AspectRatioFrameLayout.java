package androidx.media3.p005ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.media3.ui.AspectRatioFrameLayout */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    public final C1069c f5675a;

    /* renamed from: d */
    public C1068b f5676d;

    /* renamed from: e */
    public float f5677e;

    /* renamed from: g */
    public int f5678g;

    /* renamed from: androidx.media3.ui.AspectRatioFrameLayout$b */
    public interface C1068b {
        /* renamed from: a */
        void mo8097a(float f, float f2, boolean z);
    }

    /* renamed from: androidx.media3.ui.AspectRatioFrameLayout$c */
    public final class C1069c implements Runnable {

        /* renamed from: a */
        public float f5679a;

        /* renamed from: d */
        public float f5680d;

        /* renamed from: e */
        public boolean f5681e;

        /* renamed from: g */
        public boolean f5682g;

        public C1069c() {
        }

        /* renamed from: a */
        public void mo8098a(float f, float f2, boolean z) {
            this.f5679a = f;
            this.f5680d = f2;
            this.f5681e = z;
            if (!this.f5682g) {
                this.f5682g = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        public void run() {
            this.f5682g = false;
            if (AspectRatioFrameLayout.this.f5676d != null) {
                AspectRatioFrameLayout.this.f5676d.mo8097a(this.f5679a, this.f5680d, this.f5681e);
            }
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getResizeMode() {
        return this.f5678g;
    }

    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f5677e > Utils.FLOAT_EPSILON) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f3 = (float) measuredWidth;
            float f4 = (float) measuredHeight;
            float f5 = f3 / f4;
            float f6 = (this.f5677e / f5) - 1.0f;
            if (Math.abs(f6) <= 0.01f) {
                this.f5675a.mo8098a(this.f5677e, f5, false);
                return;
            }
            int i3 = this.f5678g;
            if (i3 != 0) {
                if (i3 == 1) {
                    f2 = this.f5677e;
                } else if (i3 != 2) {
                    if (i3 == 4) {
                        if (f6 > Utils.FLOAT_EPSILON) {
                            f = this.f5677e;
                        } else {
                            f2 = this.f5677e;
                        }
                    }
                    this.f5675a.mo8098a(this.f5677e, f5, true);
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                } else {
                    f = this.f5677e;
                }
                measuredHeight = (int) (f3 / f2);
                this.f5675a.mo8098a(this.f5677e, f5, true);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            } else if (f6 > Utils.FLOAT_EPSILON) {
                f2 = this.f5677e;
                measuredHeight = (int) (f3 / f2);
                this.f5675a.mo8098a(this.f5677e, f5, true);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            } else {
                f = this.f5677e;
            }
            measuredWidth = (int) (f4 * f);
            this.f5675a.mo8098a(this.f5677e, f5, true);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    public void setAspectRatio(float f) {
        if (this.f5677e != f) {
            this.f5677e = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(C1068b bVar) {
        this.f5676d = bVar;
    }

    public void setResizeMode(int i) {
        if (this.f5678g != i) {
            this.f5678g = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5678g = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h65.AspectRatioFrameLayout, 0, 0);
            try {
                this.f5678g = obtainStyledAttributes.getInt(h65.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f5675a = new C1069c();
    }
}

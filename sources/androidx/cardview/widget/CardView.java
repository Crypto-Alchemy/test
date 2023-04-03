package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.github.mikephil.charting.utils.Utils;

public class CardView extends FrameLayout {

    /* renamed from: x */
    public static final int[] f1410x = {16842801};

    /* renamed from: y */
    public static final rb0 f1411y;

    /* renamed from: a */
    public boolean f1412a;

    /* renamed from: d */
    public boolean f1413d;

    /* renamed from: e */
    public int f1414e;

    /* renamed from: g */
    public int f1415g;

    /* renamed from: k */
    public final Rect f1416k;

    /* renamed from: r */
    public final Rect f1417r;

    /* renamed from: s */
    public final qb0 f1418s;

    /* renamed from: androidx.cardview.widget.CardView$a */
    public class C0332a implements qb0 {

        /* renamed from: a */
        public Drawable f1419a;

        public C0332a() {
        }

        /* renamed from: a */
        public void mo2847a(int i, int i2, int i3, int i4) {
            CardView.this.f1417r.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1416k;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        /* renamed from: b */
        public void mo2848b(Drawable drawable) {
            this.f1419a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        /* renamed from: c */
        public boolean mo2849c() {
            return CardView.this.getUseCompatPadding();
        }

        /* renamed from: d */
        public Drawable mo2850d() {
            return this.f1419a;
        }

        /* renamed from: e */
        public boolean mo2851e() {
            return CardView.this.getPreventCornerOverlap();
        }

        /* renamed from: f */
        public View mo2852f() {
            return CardView.this;
        }
    }

    static {
        pb0 pb0 = new pb0();
        f1411y = pb0;
        pb0.mo24530o();
    }

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1411y.mo24527l(this.f1418s);
    }

    public float getCardElevation() {
        return f1411y.mo24520e(this.f1418s);
    }

    public int getContentPaddingBottom() {
        return this.f1416k.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1416k.left;
    }

    public int getContentPaddingRight() {
        return this.f1416k.right;
    }

    public int getContentPaddingTop() {
        return this.f1416k.top;
    }

    public float getMaxCardElevation() {
        return f1411y.mo24529n(this.f1418s);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1413d;
    }

    public float getRadius() {
        return f1411y.mo24526k(this.f1418s);
    }

    public boolean getUseCompatPadding() {
        return this.f1412a;
    }

    public void onMeasure(int i, int i2) {
        rb0 rb0 = f1411y;
        if (!(rb0 instanceof pb0)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) rb0.mo24525j(this.f1418s)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) rb0.mo24518c(this.f1418s)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f1411y.mo24522g(this.f1418s, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f1411y.mo24528m(this.f1418s, f);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f1416k.set(i, i2, i3, i4);
        f1411y.mo24517b(this.f1418s);
    }

    public void setMaxCardElevation(float f) {
        f1411y.mo24523h(this.f1418s, f);
    }

    public void setMinimumHeight(int i) {
        this.f1415g = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f1414e = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1413d) {
            this.f1413d = z;
            f1411y.mo24519d(this.f1418s);
        }
    }

    public void setRadius(float f) {
        f1411y.mo24524i(this.f1418s, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1412a != z) {
            this.f1412a = z;
            f1411y.mo24516a(this.f1418s);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e15.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1411y.mo24522g(this.f1418s, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1416k = rect;
        this.f1417r = new Rect();
        C0332a aVar = new C0332a();
        this.f1418s = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b65.CardView, i, b55.CardView);
        int i3 = b65.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1410x);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(s15.cardview_light_background);
            } else {
                i2 = getResources().getColor(s15.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(b65.CardView_cardCornerRadius, Utils.FLOAT_EPSILON);
        float dimension2 = obtainStyledAttributes.getDimension(b65.CardView_cardElevation, Utils.FLOAT_EPSILON);
        float dimension3 = obtainStyledAttributes.getDimension(b65.CardView_cardMaxElevation, Utils.FLOAT_EPSILON);
        this.f1412a = obtainStyledAttributes.getBoolean(b65.CardView_cardUseCompatPadding, false);
        this.f1413d = obtainStyledAttributes.getBoolean(b65.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(b65.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(b65.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(b65.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(b65.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(b65.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1414e = obtainStyledAttributes.getDimensionPixelSize(b65.CardView_android_minWidth, 0);
        this.f1415g = obtainStyledAttributes.getDimensionPixelSize(b65.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f1411y.mo24521f(aVar, context, colorStateList, dimension, dimension2, f);
    }
}

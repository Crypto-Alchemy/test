package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.C1477e
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: L */
    public static final int[] f7299L = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: M */
    public static final int[] f7300M = {16843660};

    /* renamed from: A */
    public boolean f7301A;

    /* renamed from: B */
    public final C1470a f7302B;

    /* renamed from: C */
    public WeakReference<al4> f7303C;

    /* renamed from: H */
    public int f7304H;

    /* renamed from: I */
    public int f7305I;

    /* renamed from: a */
    public ViewPager f7306a;

    /* renamed from: d */
    public TextView f7307d;

    /* renamed from: e */
    public TextView f7308e;

    /* renamed from: g */
    public TextView f7309g;

    /* renamed from: k */
    public int f7310k;

    /* renamed from: r */
    public float f7311r;

    /* renamed from: s */
    public int f7312s;

    /* renamed from: x */
    public int f7313x;

    /* renamed from: y */
    public boolean f7314y;

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$a */
    public class C1470a extends DataSetObserver implements ViewPager.C1481i, ViewPager.C1480h {

        /* renamed from: a */
        public int f7315a;

        public C1470a() {
        }

        /* renamed from: a */
        public void mo10639a(ViewPager viewPager, al4 al4, al4 al42) {
            PagerTitleStrip.this.mo10627a(al4, al42);
        }

        /* renamed from: c */
        public void mo10640c(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.mo10611c(i, f, false);
        }

        /* renamed from: d */
        public void mo10641d(int i) {
            this.f7315a = i;
        }

        /* renamed from: e */
        public void mo10642e(int i) {
            if (this.f7315a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.mo10628b(pagerTitleStrip.f7306a.getCurrentItem(), PagerTitleStrip.this.f7306a.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f = pagerTitleStrip2.f7311r;
                if (f < Utils.FLOAT_EPSILON) {
                    f = 0.0f;
                }
                pagerTitleStrip2.mo10611c(pagerTitleStrip2.f7306a.getCurrentItem(), f, true);
            }
        }

        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.mo10628b(pagerTitleStrip.f7306a.getCurrentItem(), PagerTitleStrip.this.f7306a.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f = pagerTitleStrip2.f7311r;
            if (f < Utils.FLOAT_EPSILON) {
                f = 0.0f;
            }
            pagerTitleStrip2.mo10611c(pagerTitleStrip2.f7306a.getCurrentItem(), f, true);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$b */
    public static class C1471b extends SingleLineTransformationMethod {

        /* renamed from: a */
        public Locale f7317a;

        public C1471b(Context context) {
            this.f7317a = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f7317a);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context) {
        this(context, (AttributeSet) null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C1471b(textView.getContext()));
    }

    /* renamed from: a */
    public void mo10627a(al4 al4, al4 al42) {
        if (al4 != null) {
            al4.mo385t(this.f7302B);
            this.f7303C = null;
        }
        if (al42 != null) {
            al42.mo377l(this.f7302B);
            this.f7303C = new WeakReference<>(al42);
        }
        ViewPager viewPager = this.f7306a;
        if (viewPager != null) {
            this.f7310k = -1;
            this.f7311r = -1.0f;
            mo10628b(viewPager.getCurrentItem(), al42);
            requestLayout();
        }
    }

    /* renamed from: b */
    public void mo10628b(int i, al4 al4) {
        int i2;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (al4 != null) {
            i2 = al4.mo370e();
        } else {
            i2 = 0;
        }
        this.f7314y = true;
        CharSequence charSequence3 = null;
        if (i < 1 || al4 == null) {
            charSequence = null;
        } else {
            charSequence = al4.mo372g(i - 1);
        }
        this.f7307d.setText(charSequence);
        TextView textView = this.f7308e;
        if (al4 == null || i >= i2) {
            charSequence2 = null;
        } else {
            charSequence2 = al4.mo372g(i);
        }
        textView.setText(charSequence2);
        int i3 = i + 1;
        if (i3 < i2 && al4 != null) {
            charSequence3 = al4.mo372g(i3);
        }
        this.f7309g.setText(charSequence3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f7307d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f7308e.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f7309g.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f7310k = i;
        if (!this.f7301A) {
            mo10611c(i, this.f7311r, false);
        }
        this.f7314y = false;
    }

    /* renamed from: c */
    public void mo10611c(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        float f2 = f;
        if (i6 != this.f7310k) {
            mo10628b(i6, this.f7306a.getAdapter());
        } else if (!z && f2 == this.f7311r) {
            return;
        }
        this.f7301A = true;
        int measuredWidth = this.f7307d.getMeasuredWidth();
        int measuredWidth2 = this.f7308e.getMeasuredWidth();
        int measuredWidth3 = this.f7309g.getMeasuredWidth();
        int i7 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i8 = paddingRight + i7;
        int i9 = (width - (paddingLeft + i7)) - i8;
        float f3 = 0.5f + f2;
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        int i10 = ((width - i8) - ((int) (((float) i9) * f3))) - i7;
        int i11 = measuredWidth2 + i10;
        int baseline = this.f7307d.getBaseline();
        int baseline2 = this.f7308e.getBaseline();
        int baseline3 = this.f7309g.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i12 = max - baseline;
        int i13 = max - baseline2;
        int i14 = max - baseline3;
        int i15 = measuredWidth3;
        int max2 = Math.max(Math.max(this.f7307d.getMeasuredHeight() + i12, this.f7308e.getMeasuredHeight() + i13), this.f7309g.getMeasuredHeight() + i14);
        int i16 = this.f7313x & 112;
        if (i16 == 16) {
            i5 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i16 != 80) {
            i4 = i12 + paddingTop;
            i2 = i13 + paddingTop;
            i3 = paddingTop + i14;
            TextView textView = this.f7308e;
            textView.layout(i10, i2, i11, textView.getMeasuredHeight() + i2);
            int min = Math.min(paddingLeft, (i10 - this.f7312s) - measuredWidth);
            TextView textView2 = this.f7307d;
            textView2.layout(min, i4, measuredWidth + min, textView2.getMeasuredHeight() + i4);
            int max3 = Math.max((width - paddingRight) - i15, i11 + this.f7312s);
            TextView textView3 = this.f7309g;
            textView3.layout(max3, i3, max3 + i15, textView3.getMeasuredHeight() + i3);
            this.f7311r = f;
            this.f7301A = false;
        } else {
            i5 = (height - paddingBottom) - max2;
        }
        i4 = i12 + i5;
        i2 = i13 + i5;
        i3 = i5 + i14;
        TextView textView4 = this.f7308e;
        textView4.layout(i10, i2, i11, textView4.getMeasuredHeight() + i2);
        int min2 = Math.min(paddingLeft, (i10 - this.f7312s) - measuredWidth);
        TextView textView22 = this.f7307d;
        textView22.layout(min2, i4, measuredWidth + min2, textView22.getMeasuredHeight() + i4);
        int max32 = Math.max((width - paddingRight) - i15, i11 + this.f7312s);
        TextView textView32 = this.f7309g;
        textView32.layout(max32, i3, max32 + i15, textView32.getMeasuredHeight() + i3);
        this.f7311r = f;
        this.f7301A = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f7312s;
    }

    public void onAttachedToWindow() {
        al4 al4;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            al4 adapter = viewPager.getAdapter();
            viewPager.mo10663S(this.f7302B);
            viewPager.mo10670b(this.f7302B);
            this.f7306a = viewPager;
            WeakReference<al4> weakReference = this.f7303C;
            if (weakReference != null) {
                al4 = weakReference.get();
            } else {
                al4 = null;
            }
            mo10627a(al4, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f7306a;
        if (viewPager != null) {
            mo10627a(viewPager.getAdapter(), (al4) null);
            this.f7306a.mo10663S((ViewPager.C1481i) null);
            this.f7306a.mo10656L(this.f7302B);
            this.f7306a = null;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f7306a != null) {
            float f = this.f7311r;
            if (f < Utils.FLOAT_EPSILON) {
                f = 0.0f;
            }
            mo10611c(this.f7310k, f, true);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (((float) size) * 0.2f), -2);
            this.f7307d.measure(childMeasureSpec2, childMeasureSpec);
            this.f7308e.measure(childMeasureSpec2, childMeasureSpec);
            this.f7309g.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                i3 = View.MeasureSpec.getSize(i2);
            } else {
                i3 = Math.max(getMinHeight(), this.f7308e.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i3, i2, this.f7308e.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    public void requestLayout() {
        if (!this.f7314y) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.f7313x = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.f7304H = i;
        int i2 = (i << 24) | (this.f7305I & 16777215);
        this.f7307d.setTextColor(i2);
        this.f7309g.setTextColor(i2);
    }

    public void setTextColor(int i) {
        this.f7305I = i;
        this.f7308e.setTextColor(i);
        int i2 = (this.f7304H << 24) | (this.f7305I & 16777215);
        this.f7307d.setTextColor(i2);
        this.f7309g.setTextColor(i2);
    }

    public void setTextSize(int i, float f) {
        this.f7307d.setTextSize(i, f);
        this.f7308e.setTextSize(i, f);
        this.f7309g.setTextSize(i, f);
    }

    public void setTextSpacing(int i) {
        this.f7312s = i;
        requestLayout();
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7310k = -1;
        this.f7311r = -1.0f;
        this.f7302B = new C1470a();
        TextView textView = new TextView(context);
        this.f7307d = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f7308e = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f7309g = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7299L);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            lo6.m21661o(this.f7307d, resourceId);
            lo6.m21661o(this.f7308e, resourceId);
            lo6.m21661o(this.f7309g, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f7307d.setTextColor(color);
            this.f7308e.setTextColor(color);
            this.f7309g.setTextColor(color);
        }
        this.f7313x = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f7305I = this.f7308e.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f7307d.setEllipsize(TextUtils.TruncateAt.END);
        this.f7308e.setEllipsize(TextUtils.TruncateAt.END);
        this.f7309g.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f7300M);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f7307d);
            setSingleLineAllCaps(this.f7308e);
            setSingleLineAllCaps(this.f7309g);
        } else {
            this.f7307d.setSingleLine();
            this.f7308e.setSingleLine();
            this.f7309g.setSingleLine();
        }
        this.f7312s = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}

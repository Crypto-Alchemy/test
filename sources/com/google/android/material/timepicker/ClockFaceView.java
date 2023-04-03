package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p000.C3335t8;

class ClockFaceView extends RadialViewGroup implements ClockHandView.C4449d {

    /* renamed from: A1 */
    public final int f24602A1;

    /* renamed from: B1 */
    public final int f24603B1;

    /* renamed from: C1 */
    public String[] f24604C1;

    /* renamed from: D1 */
    public float f24605D1;

    /* renamed from: E1 */
    public final ColorStateList f24606E1;

    /* renamed from: r1 */
    public final ClockHandView f24607r1;

    /* renamed from: s1 */
    public final Rect f24608s1;

    /* renamed from: t1 */
    public final RectF f24609t1;

    /* renamed from: u1 */
    public final SparseArray<TextView> f24610u1;

    /* renamed from: v1 */
    public final C3715z7 f24611v1;

    /* renamed from: w1 */
    public final int[] f24612w1;

    /* renamed from: x1 */
    public final float[] f24613x1;

    /* renamed from: y1 */
    public final int f24614y1;

    /* renamed from: z1 */
    public final int f24615z1;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    public class C4444a implements ViewTreeObserver.OnPreDrawListener {
        public C4444a() {
        }

        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo34050w(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f24607r1.mo34057g()) - ClockFaceView.this.f24614y1);
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    public class C4445b extends C3715z7 {
        public C4445b() {
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            super.mo5479g(view, t8Var);
            int intValue = ((Integer) view.getTag(g35.material_value_index)).intValue();
            if (intValue > 0) {
                t8Var.mo26215O0((View) ClockFaceView.this.f24610u1.get(intValue - 1));
            }
            t8Var.mo26246i0(C3335t8.C3338c.m27596a(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.materialClockStyle);
    }

    /* renamed from: F */
    public static float m36259F(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    /* renamed from: D */
    public final void mo34044D() {
        RectF d = this.f24607r1.mo34054d();
        for (int i = 0; i < this.f24610u1.size(); i++) {
            TextView textView = this.f24610u1.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f24608s1);
                this.f24608s1.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f24608s1);
                this.f24609t1.set(this.f24608s1);
                textView.getPaint().setShader(mo34045E(d, this.f24609t1));
                textView.invalidate();
            }
        }
    }

    /* renamed from: E */
    public final RadialGradient mo34045E(RectF rectF, RectF rectF2) {
        if (!RectF.intersects(rectF, rectF2)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f24609t1.left, rectF.centerY() - this.f24609t1.top, rectF.width() * 0.5f, this.f24612w1, this.f24613x1, Shader.TileMode.CLAMP);
    }

    /* renamed from: G */
    public void mo34046G(String[] strArr, int i) {
        this.f24604C1 = strArr;
        mo34047H(i);
    }

    /* renamed from: H */
    public final void mo34047H(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f24610u1.size();
        for (int i2 = 0; i2 < Math.max(this.f24604C1.length, size); i2++) {
            TextView textView = this.f24610u1.get(i2);
            if (i2 >= this.f24604C1.length) {
                removeView(textView);
                this.f24610u1.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(c45.material_clockface_textview, this, false);
                    this.f24610u1.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f24604C1[i2]);
                textView.setTag(g35.material_value_index, Integer.valueOf(i2));
                ga7.m17785p0(textView, this.f24611v1);
                textView.setTextColor(this.f24606E1);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, new Object[]{this.f24604C1[i2]}));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo34048a(float f, boolean z) {
        if (Math.abs(this.f24605D1 - f) > 0.001f) {
            this.f24605D1 = f;
            mo34044D();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3335t8.m27495S0(accessibilityNodeInfo).mo26243h0(C3335t8.C3337b.m27595b(1, this.f24604C1.length, false, 1));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo34044D();
    }

    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int F = (int) (((float) this.f24603B1) / m36259F(((float) this.f24615z1) / ((float) displayMetrics.heightPixels), ((float) this.f24602A1) / ((float) displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(F, 1073741824);
        setMeasuredDimension(F, F);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    /* renamed from: w */
    public void mo34050w(int i) {
        if (i != mo34074v()) {
            super.mo34050w(i);
            this.f24607r1.mo34060j(mo34074v());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24608s1 = new Rect();
        this.f24609t1 = new RectF();
        this.f24610u1 = new SparseArray<>();
        this.f24613x1 = new float[]{Utils.FLOAT_EPSILON, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u55.ClockFaceView, i, e55.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList b = to3.m52391b(context, obtainStyledAttributes, u55.ClockFaceView_clockNumberTextColor);
        this.f24606E1 = b;
        LayoutInflater.from(context).inflate(c45.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(g35.material_clock_hand);
        this.f24607r1 = clockHandView;
        this.f24614y1 = resources.getDimensionPixelSize(k25.material_clock_hand_padding);
        int colorForState = b.getColorForState(new int[]{16842913}, b.getDefaultColor());
        this.f24612w1 = new int[]{colorForState, colorForState, b.getDefaultColor()};
        clockHandView.mo34052b(this);
        int defaultColor = C2554in.m19713a(context, w15.material_timepicker_clockface).getDefaultColor();
        ColorStateList b2 = to3.m52391b(context, obtainStyledAttributes, u55.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(b2 != null ? b2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new C4444a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f24611v1 = new C4445b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        mo34046G(strArr, 0);
        this.f24615z1 = resources.getDimensionPixelSize(k25.material_time_picker_minimum_screen_height);
        this.f24602A1 = resources.getDimensionPixelSize(k25.material_time_picker_minimum_screen_width);
        this.f24603B1 = resources.getDimensionPixelSize(k25.material_clock_size);
    }
}

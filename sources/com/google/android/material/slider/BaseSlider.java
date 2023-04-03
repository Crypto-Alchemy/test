package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.slider.BaseSlider;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.C3335t8;
import p000.C5751dz;
import p000.C5821ez;

abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends C5751dz<S>, T extends C5821ez<S>> extends View {

    /* renamed from: P1 */
    public static final String f24195P1 = BaseSlider.class.getSimpleName();

    /* renamed from: Q1 */
    public static final int f24196Q1 = e55.Widget_MaterialComponents_Slider;

    /* renamed from: A */
    public final C4357f f24197A;

    /* renamed from: A1 */
    public float f24198A1;

    /* renamed from: B */
    public final List<bs6> f24199B;

    /* renamed from: B1 */
    public float[] f24200B1;

    /* renamed from: C */
    public final List<L> f24201C;

    /* renamed from: C1 */
    public boolean f24202C1;

    /* renamed from: D1 */
    public int f24203D1;

    /* renamed from: E1 */
    public boolean f24204E1;

    /* renamed from: F1 */
    public boolean f24205F1;

    /* renamed from: G1 */
    public boolean f24206G1;

    /* renamed from: H */
    public final List<T> f24207H;

    /* renamed from: H1 */
    public ColorStateList f24208H1;

    /* renamed from: I */
    public boolean f24209I;

    /* renamed from: I1 */
    public ColorStateList f24210I1;

    /* renamed from: J1 */
    public ColorStateList f24211J1;

    /* renamed from: K1 */
    public ColorStateList f24212K1;

    /* renamed from: L */
    public ValueAnimator f24213L;

    /* renamed from: L1 */
    public ColorStateList f24214L1;

    /* renamed from: M */
    public ValueAnimator f24215M;

    /* renamed from: M1 */
    public final uo3 f24216M1;

    /* renamed from: N1 */
    public float f24217N1;

    /* renamed from: O1 */
    public int f24218O1;

    /* renamed from: P */
    public final int f24219P;

    /* renamed from: Q */
    public int f24220Q;

    /* renamed from: U */
    public int f24221U;

    /* renamed from: a */
    public final Paint f24222a;

    /* renamed from: b1 */
    public int f24223b1;

    /* renamed from: d */
    public final Paint f24224d;

    /* renamed from: e */
    public final Paint f24225e;

    /* renamed from: e0 */
    public int f24226e0;

    /* renamed from: e1 */
    public int f24227e1;

    /* renamed from: g */
    public final Paint f24228g;

    /* renamed from: k */
    public final Paint f24229k;

    /* renamed from: k0 */
    public int f24230k0;

    /* renamed from: o1 */
    public int f24231o1;

    /* renamed from: p1 */
    public int f24232p1;

    /* renamed from: q1 */
    public int f24233q1;

    /* renamed from: r */
    public final Paint f24234r;

    /* renamed from: r1 */
    public float f24235r1;

    /* renamed from: s */
    public final C4356e f24236s;

    /* renamed from: s1 */
    public MotionEvent f24237s1;

    /* renamed from: t1 */
    public ud3 f24238t1;

    /* renamed from: u1 */
    public boolean f24239u1;

    /* renamed from: v0 */
    public int f24240v0;

    /* renamed from: v1 */
    public float f24241v1;

    /* renamed from: w1 */
    public float f24242w1;

    /* renamed from: x */
    public final AccessibilityManager f24243x;

    /* renamed from: x1 */
    public ArrayList<Float> f24244x1;

    /* renamed from: y */
    public BaseSlider<S, L, T>.C6956d f24245y;

    /* renamed from: y1 */
    public int f24246y1;

    /* renamed from: z1 */
    public int f24247z1;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new C4351a();

        /* renamed from: a */
        public float f24248a;

        /* renamed from: d */
        public float f24249d;

        /* renamed from: e */
        public ArrayList<Float> f24250e;

        /* renamed from: g */
        public float f24251g;

        /* renamed from: k */
        public boolean f24252k;

        /* renamed from: com.google.android.material.slider.BaseSlider$SliderState$a */
        public static class C4351a implements Parcelable.Creator<SliderState> {
            /* renamed from: a */
            public SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel, (C4352a) null);
            }

            /* renamed from: b */
            public SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        }

        public /* synthetic */ SliderState(Parcel parcel, C4352a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f24248a);
            parcel.writeFloat(this.f24249d);
            parcel.writeList(this.f24250e);
            parcel.writeFloat(this.f24251g);
            parcel.writeBooleanArray(new boolean[]{this.f24252k});
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        public SliderState(Parcel parcel) {
            super(parcel);
            this.f24248a = parcel.readFloat();
            this.f24249d = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f24250e = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f24251g = parcel.readFloat();
            this.f24252k = parcel.createBooleanArray()[0];
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$a */
    public class C4352a implements C4357f {

        /* renamed from: a */
        public final /* synthetic */ AttributeSet f24253a;

        /* renamed from: b */
        public final /* synthetic */ int f24254b;

        public C4352a(AttributeSet attributeSet, int i) {
            this.f24253a = attributeSet;
            this.f24254b = i;
        }

        /* renamed from: a */
        public bs6 mo33463a() {
            TypedArray h = wo6.m54004h(BaseSlider.this.getContext(), this.f24253a, u55.Slider, this.f24254b, BaseSlider.f24196Q1, new int[0]);
            bs6 a = BaseSlider.m35796S(BaseSlider.this.getContext(), h);
            h.recycle();
            return a;
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$b */
    public class C4353b implements ValueAnimator.AnimatorUpdateListener {
        public C4353b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (bs6 A0 : BaseSlider.this.f24199B) {
                A0.mo29709A0(floatValue);
            }
            ga7.m17767g0(BaseSlider.this);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$c */
    public class C4354c extends AnimatorListenerAdapter {
        public C4354c() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            for (bs6 b : BaseSlider.this.f24199B) {
                pe7.m49899e(BaseSlider.this).mo45423b(b);
            }
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$e */
    public static class C4356e extends ox1 {

        /* renamed from: q */
        public final BaseSlider<?, ?, ?> f24260q;

        /* renamed from: r */
        public Rect f24261r = new Rect();

        public C4356e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f24260q = baseSlider;
        }

        /* renamed from: B */
        public int mo24223B(float f, float f2) {
            for (int i = 0; i < this.f24260q.getValues().size(); i++) {
                this.f24260q.mo33357d0(i, this.f24261r);
                if (this.f24261r.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: C */
        public void mo24224C(List<Integer> list) {
            for (int i = 0; i < this.f24260q.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        /* renamed from: L */
        public boolean mo24231L(int i, int i2, Bundle bundle) {
            if (!this.f24260q.isEnabled()) {
                return false;
            }
            if (i2 == 4096 || i2 == 8192) {
                float g = this.f24260q.mo33398l(20);
                if (i2 == 8192) {
                    g = -g;
                }
                if (this.f24260q.mo33336G()) {
                    g = -g;
                }
                if (!this.f24260q.mo33355b0(i, ep3.m16273a(this.f24260q.getValues().get(i).floatValue() + g, this.f24260q.getValueFrom(), this.f24260q.getValueTo()))) {
                    return false;
                }
                this.f24260q.mo33361e0();
                this.f24260q.postInvalidate();
                mo24225E(i);
                return true;
            }
            if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                if (this.f24260q.mo33355b0(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                    this.f24260q.mo33361e0();
                    this.f24260q.postInvalidate();
                    mo24225E(i);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: P */
        public void mo24235P(int i, C3335t8 t8Var) {
            t8Var.mo26229b(C3335t8.C3336a.f17994L);
            List<Float> values = this.f24260q.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.f24260q.getValueFrom();
            float valueTo = this.f24260q.getValueTo();
            if (this.f24260q.isEnabled()) {
                if (floatValue > valueFrom) {
                    t8Var.mo26227a(8192);
                }
                if (floatValue < valueTo) {
                    t8Var.mo26227a(4096);
                }
            }
            t8Var.mo26193D0(C3335t8.C3339d.m27597a(1, valueFrom, valueTo, floatValue));
            t8Var.mo26239f0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f24260q.getContentDescription() != null) {
                sb.append(this.f24260q.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(mo33468Y(i));
                sb.append(this.f24260q.mo33457z(floatValue));
            }
            t8Var.mo26247j0(sb.toString());
            this.f24260q.mo33357d0(i, this.f24261r);
            t8Var.mo26228a0(this.f24261r);
        }

        /* renamed from: Y */
        public final String mo33468Y(int i) {
            if (i == this.f24260q.getValues().size() - 1) {
                return this.f24260q.getContext().getString(y45.material_slider_range_end);
            }
            if (i == 0) {
                return this.f24260q.getContext().getString(y45.material_slider_range_start);
            }
            return "";
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$f */
    public interface C4357f {
        /* renamed from: a */
        bs6 mo33463a();
    }

    public BaseSlider(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public static float m35795A(ValueAnimator valueAnimator, float f) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return floatValue;
    }

    /* renamed from: S */
    public static bs6 m35796S(Context context, TypedArray typedArray) {
        return bs6.m32704t0(context, (AttributeSet) null, 0, typedArray.getResourceId(u55.Slider_labelStyle, e55.Widget_MaterialComponents_Tooltip));
    }

    /* renamed from: U */
    public static int m35797U(float[] fArr, float f) {
        return Math.round(f * ((float) ((fArr.length / 2) - 1)));
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f24244x1.size() == 1) {
            floatValue2 = this.f24241v1;
        }
        float O = mo33344O(floatValue2);
        float O2 = mo33344O(floatValue);
        if (mo33336G()) {
            return new float[]{O2, O};
        }
        return new float[]{O, O2};
    }

    private float getValueOfTouchPosition() {
        double a0 = mo33354a0(this.f24217N1);
        if (mo33336G()) {
            a0 = 1.0d - a0;
        }
        float f = this.f24242w1;
        float f2 = this.f24241v1;
        return (float) ((a0 * ((double) (f - f2))) + ((double) f2));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.f24217N1;
        if (mo33336G()) {
            f = 1.0f - f;
        }
        float f2 = this.f24242w1;
        float f3 = this.f24241v1;
        return (f * (f2 - f3)) + f3;
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f24244x1.size() != arrayList.size() || !this.f24244x1.equals(arrayList)) {
                this.f24244x1 = arrayList;
                this.f24206G1 = true;
                this.f24247z1 = 0;
                mo33361e0();
                mo33404o();
                mo33419s();
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    /* renamed from: B */
    public final float mo33331B(int i, float f) {
        float f2;
        float f3;
        float f4 = this.f24198A1;
        float f5 = Utils.FLOAT_EPSILON;
        if (f4 == Utils.FLOAT_EPSILON) {
            f5 = getMinSeparation();
        }
        if (this.f24218O1 == 0) {
            f5 = mo33417q(f5);
        }
        if (mo33336G()) {
            f5 = -f5;
        }
        int i2 = i + 1;
        if (i2 >= this.f24244x1.size()) {
            f2 = this.f24242w1;
        } else {
            f2 = this.f24244x1.get(i2).floatValue() - f5;
        }
        int i3 = i - 1;
        if (i3 < 0) {
            f3 = this.f24241v1;
        } else {
            f3 = this.f24244x1.get(i3).floatValue() + f5;
        }
        return ep3.m16273a(f, f3, f2);
    }

    /* renamed from: C */
    public final int mo33332C(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* renamed from: D */
    public boolean mo33333D() {
        if (this.f24238t1 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final void mo33334E() {
        this.f24222a.setStrokeWidth((float) this.f24240v0);
        this.f24224d.setStrokeWidth((float) this.f24240v0);
        this.f24229k.setStrokeWidth(((float) this.f24240v0) / 2.0f);
        this.f24234r.setStrokeWidth(((float) this.f24240v0) / 2.0f);
    }

    /* renamed from: F */
    public final boolean mo33335F() {
        ViewParent parent = getParent();
        while (true) {
            boolean z = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) {
                z = true;
            }
            if (z && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    /* renamed from: G */
    public final boolean mo33336G() {
        if (ga7.m17715B(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final void mo33337H(Resources resources) {
        this.f24226e0 = resources.getDimensionPixelSize(k25.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(k25.mtrl_slider_track_side_padding);
        this.f24220Q = dimensionPixelOffset;
        this.f24223b1 = dimensionPixelOffset;
        this.f24221U = resources.getDimensionPixelSize(k25.mtrl_slider_thumb_radius);
        this.f24227e1 = resources.getDimensionPixelOffset(k25.mtrl_slider_track_top);
        this.f24233q1 = resources.getDimensionPixelSize(k25.mtrl_slider_label_padding);
    }

    /* renamed from: I */
    public final void mo33338I() {
        if (this.f24198A1 > Utils.FLOAT_EPSILON) {
            mo33363g0();
            int min = Math.min((int) (((this.f24242w1 - this.f24241v1) / this.f24198A1) + 1.0f), (this.f24203D1 / (this.f24240v0 * 2)) + 1);
            float[] fArr = this.f24200B1;
            if (fArr == null || fArr.length != min * 2) {
                this.f24200B1 = new float[(min * 2)];
            }
            float f = ((float) this.f24203D1) / ((float) (min - 1));
            for (int i = 0; i < min * 2; i += 2) {
                float[] fArr2 = this.f24200B1;
                fArr2[i] = ((float) this.f24223b1) + (((float) (i / 2)) * f);
                fArr2[i + 1] = (float) mo33400m();
            }
        }
    }

    /* renamed from: J */
    public final void mo33339J(Canvas canvas, int i, int i2) {
        if (mo33352Y()) {
            int O = (int) (((float) this.f24223b1) + (mo33344O(this.f24244x1.get(this.f24247z1).floatValue()) * ((float) i)));
            if (Build.VERSION.SDK_INT < 28) {
                int i3 = this.f24232p1;
                canvas.clipRect((float) (O - i3), (float) (i2 - i3), (float) (O + i3), (float) (i3 + i2), Region.Op.UNION);
            }
            canvas.drawCircle((float) O, (float) i2, (float) this.f24232p1, this.f24228g);
        }
    }

    /* renamed from: K */
    public final void mo33340K(Canvas canvas) {
        if (this.f24202C1 && this.f24198A1 > Utils.FLOAT_EPSILON) {
            float[] activeRange = getActiveRange();
            int U = m35797U(this.f24200B1, activeRange[0]);
            int U2 = m35797U(this.f24200B1, activeRange[1]);
            int i = U * 2;
            canvas.drawPoints(this.f24200B1, 0, i, this.f24229k);
            int i2 = U2 * 2;
            canvas.drawPoints(this.f24200B1, i, i2 - i, this.f24234r);
            float[] fArr = this.f24200B1;
            canvas.drawPoints(fArr, i2, fArr.length - i2, this.f24229k);
        }
    }

    /* renamed from: L */
    public final void mo33341L() {
        this.f24223b1 = this.f24220Q + Math.max(this.f24231o1 - this.f24221U, 0);
        if (ga7.m17747T(this)) {
            mo33362f0(getWidth());
        }
    }

    /* renamed from: M */
    public final boolean mo33342M(int i) {
        int i2 = this.f24247z1;
        int c = (int) ep3.m16275c(((long) i2) + ((long) i), 0, (long) (this.f24244x1.size() - 1));
        this.f24247z1 = c;
        if (c == i2) {
            return false;
        }
        if (this.f24246y1 != -1) {
            this.f24246y1 = c;
        }
        mo33361e0();
        postInvalidate();
        return true;
    }

    /* renamed from: N */
    public final boolean mo33343N(int i) {
        if (mo33336G()) {
            if (i == Integer.MIN_VALUE) {
                i = Integer.MAX_VALUE;
            } else {
                i = -i;
            }
        }
        return mo33342M(i);
    }

    /* renamed from: O */
    public final float mo33344O(float f) {
        float f2 = this.f24241v1;
        float f3 = (f - f2) / (this.f24242w1 - f2);
        if (mo33336G()) {
            return 1.0f - f3;
        }
        return f3;
    }

    /* renamed from: P */
    public final Boolean mo33345P(int i, KeyEvent keyEvent) {
        if (i != 61) {
            if (i != 66) {
                if (i != 81) {
                    if (i == 69) {
                        mo33342M(-1);
                        return Boolean.TRUE;
                    } else if (i != 70) {
                        switch (i) {
                            case 21:
                                mo33343N(-1);
                                return Boolean.TRUE;
                            case 22:
                                mo33343N(1);
                                return Boolean.TRUE;
                            case 23:
                                break;
                            default:
                                return null;
                        }
                    }
                }
                mo33342M(1);
                return Boolean.TRUE;
            }
            this.f24246y1 = this.f24247z1;
            postInvalidate();
            return Boolean.TRUE;
        } else if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(mo33342M(1));
        } else {
            if (keyEvent.isShiftPressed()) {
                return Boolean.valueOf(mo33342M(-1));
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: Q */
    public final void mo33346Q() {
        for (T a : this.f24207H) {
            a.mo42456a(this);
        }
    }

    /* renamed from: R */
    public final void mo33347R() {
        for (T b : this.f24207H) {
            b.mo42457b(this);
        }
    }

    /* renamed from: T */
    public boolean mo33348T() {
        boolean z;
        if (this.f24246y1 != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float m0 = mo33401m0(valueOfTouchPositionAbsolute);
        this.f24246y1 = 0;
        float abs = Math.abs(this.f24244x1.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.f24244x1.size(); i++) {
            float abs2 = Math.abs(this.f24244x1.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float m02 = mo33401m0(this.f24244x1.get(i).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            if (!mo33336G() ? m02 - m0 >= Utils.FLOAT_EPSILON : m02 - m0 <= Utils.FLOAT_EPSILON) {
                z = false;
            } else {
                z = true;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.f24246y1 = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(m02 - m0) < ((float) this.f24219P)) {
                    this.f24246y1 = -1;
                    return false;
                } else if (z) {
                    this.f24246y1 = i;
                }
            }
            abs = abs2;
        }
        if (this.f24246y1 != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public final void mo33349V(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        TypedArray h = wo6.m54004h(context, attributeSet, u55.Slider, i, f24196Q1, new int[0]);
        this.f24241v1 = h.getFloat(u55.Slider_android_valueFrom, Utils.FLOAT_EPSILON);
        this.f24242w1 = h.getFloat(u55.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f24241v1));
        this.f24198A1 = h.getFloat(u55.Slider_android_stepSize, Utils.FLOAT_EPSILON);
        int i4 = u55.Slider_trackColor;
        boolean hasValue = h.hasValue(i4);
        if (hasValue) {
            i2 = i4;
        } else {
            i2 = u55.Slider_trackColorInactive;
        }
        if (!hasValue) {
            i4 = u55.Slider_trackColorActive;
        }
        ColorStateList b = to3.m52391b(context, h, i2);
        if (b == null) {
            b = C2554in.m19713a(context, w15.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(b);
        ColorStateList b2 = to3.m52391b(context, h, i4);
        if (b2 == null) {
            b2 = C2554in.m19713a(context, w15.material_slider_active_track_color);
        }
        setTrackActiveTintList(b2);
        this.f24216M1.mo48440a0(to3.m52391b(context, h, u55.Slider_thumbColor));
        int i5 = u55.Slider_thumbStrokeColor;
        if (h.hasValue(i5)) {
            setThumbStrokeColor(to3.m52391b(context, h, i5));
        }
        setThumbStrokeWidth(h.getDimension(u55.Slider_thumbStrokeWidth, Utils.FLOAT_EPSILON));
        ColorStateList b3 = to3.m52391b(context, h, u55.Slider_haloColor);
        if (b3 == null) {
            b3 = C2554in.m19713a(context, w15.material_slider_halo_color);
        }
        setHaloTintList(b3);
        this.f24202C1 = h.getBoolean(u55.Slider_tickVisible, true);
        int i6 = u55.Slider_tickColor;
        boolean hasValue2 = h.hasValue(i6);
        if (hasValue2) {
            i3 = i6;
        } else {
            i3 = u55.Slider_tickColorInactive;
        }
        if (!hasValue2) {
            i6 = u55.Slider_tickColorActive;
        }
        ColorStateList b4 = to3.m52391b(context, h, i3);
        if (b4 == null) {
            b4 = C2554in.m19713a(context, w15.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(b4);
        ColorStateList b5 = to3.m52391b(context, h, i6);
        if (b5 == null) {
            b5 = C2554in.m19713a(context, w15.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(b5);
        setThumbRadius(h.getDimensionPixelSize(u55.Slider_thumbRadius, 0));
        setHaloRadius(h.getDimensionPixelSize(u55.Slider_haloRadius, 0));
        setThumbElevation(h.getDimension(u55.Slider_thumbElevation, Utils.FLOAT_EPSILON));
        setTrackHeight(h.getDimensionPixelSize(u55.Slider_trackHeight, 0));
        this.f24230k0 = h.getInt(u55.Slider_labelBehavior, 0);
        if (!h.getBoolean(u55.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        h.recycle();
    }

    /* renamed from: W */
    public final void mo33350W(int i) {
        BaseSlider<S, L, T>.C6956d dVar = this.f24245y;
        if (dVar == null) {
            this.f24245y = new C4355d(this, (C4352a) null);
        } else {
            removeCallbacks(dVar);
        }
        this.f24245y.mo33466a(i);
        postDelayed(this.f24245y, 200);
    }

    /* renamed from: X */
    public final void mo33351X(bs6 bs6, float f) {
        bs6.mo29710B0(mo33457z(f));
        int O = (this.f24223b1 + ((int) (mo33344O(f) * ((float) this.f24203D1)))) - (bs6.getIntrinsicWidth() / 2);
        int m = mo33400m() - (this.f24233q1 + this.f24231o1);
        bs6.setBounds(O, m - bs6.getIntrinsicHeight(), bs6.getIntrinsicWidth() + O, m);
        Rect rect = new Rect(bs6.getBounds());
        rc1.m51061c(pe7.m49898d(this), this, rect);
        bs6.setBounds(rect);
        pe7.m49899e(this).mo45422a(bs6);
    }

    /* renamed from: Y */
    public final boolean mo33352Y() {
        if (this.f24204E1 || !(getBackground() instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public final boolean mo33353Z(float f) {
        return mo33355b0(this.f24246y1, f);
    }

    /* renamed from: a0 */
    public final double mo33354a0(float f) {
        float f2 = this.f24198A1;
        if (f2 <= Utils.FLOAT_EPSILON) {
            return (double) f;
        }
        int i = (int) ((this.f24242w1 - this.f24241v1) / f2);
        return ((double) Math.round(f * ((float) i))) / ((double) i);
    }

    /* renamed from: b0 */
    public final boolean mo33355b0(int i, float f) {
        if (((double) Math.abs(f - this.f24244x1.get(i).floatValue())) < 1.0E-4d) {
            return false;
        }
        this.f24244x1.set(i, Float.valueOf(mo33331B(i, f)));
        this.f24247z1 = i;
        mo33418r(i);
        return true;
    }

    /* renamed from: c0 */
    public final boolean mo33356c0() {
        return mo33353Z(getValueOfTouchPosition());
    }

    /* renamed from: d0 */
    public void mo33357d0(int i, Rect rect) {
        int O = this.f24223b1 + ((int) (mo33344O(getValues().get(i).floatValue()) * ((float) this.f24203D1)));
        int m = mo33400m();
        int i2 = this.f24231o1;
        rect.set(O - i2, m - i2, O + i2, m + i2);
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f24236s.mo24252v(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f24222a.setColor(mo33332C(this.f24214L1));
        this.f24224d.setColor(mo33332C(this.f24212K1));
        this.f24229k.setColor(mo33332C(this.f24211J1));
        this.f24234r.setColor(mo33332C(this.f24210I1));
        for (bs6 next : this.f24199B) {
            if (next.isStateful()) {
                next.setState(getDrawableState());
            }
        }
        if (this.f24216M1.isStateful()) {
            this.f24216M1.setState(getDrawableState());
        }
        this.f24228g.setColor(mo33332C(this.f24208H1));
        this.f24228g.setAlpha(63);
    }

    /* renamed from: e0 */
    public final void mo33361e0() {
        if (!mo33352Y() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int O = (int) ((mo33344O(this.f24244x1.get(this.f24247z1).floatValue()) * ((float) this.f24203D1)) + ((float) this.f24223b1));
                int m = mo33400m();
                int i = this.f24232p1;
                ij1.m19653l(background, O - i, m - i, O + i, m + i);
            }
        }
    }

    /* renamed from: f0 */
    public final void mo33362f0(int i) {
        this.f24203D1 = Math.max(i - (this.f24223b1 * 2), 0);
        mo33338I();
    }

    /* renamed from: g0 */
    public final void mo33363g0() {
        if (this.f24206G1) {
            mo33393i0();
            mo33395j0();
            mo33391h0();
            mo33397k0();
            mo33403n0();
            this.f24206G1 = false;
        }
    }

    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f24236s.mo24254x();
    }

    public int getActiveThumbIndex() {
        return this.f24246y1;
    }

    public int getFocusedThumbIndex() {
        return this.f24247z1;
    }

    public int getHaloRadius() {
        return this.f24232p1;
    }

    public ColorStateList getHaloTintList() {
        return this.f24208H1;
    }

    public int getLabelBehavior() {
        return this.f24230k0;
    }

    public float getMinSeparation() {
        return Utils.FLOAT_EPSILON;
    }

    public float getStepSize() {
        return this.f24198A1;
    }

    public float getThumbElevation() {
        return this.f24216M1.mo48477w();
    }

    public int getThumbRadius() {
        return this.f24231o1;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f24216M1.mo48419E();
    }

    public float getThumbStrokeWidth() {
        return this.f24216M1.mo48421G();
    }

    public ColorStateList getThumbTintList() {
        return this.f24216M1.mo48478x();
    }

    public ColorStateList getTickActiveTintList() {
        return this.f24210I1;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f24211J1;
    }

    public ColorStateList getTickTintList() {
        if (this.f24211J1.equals(this.f24210I1)) {
            return this.f24210I1;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f24212K1;
    }

    public int getTrackHeight() {
        return this.f24240v0;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f24214L1;
    }

    public int getTrackSidePadding() {
        return this.f24223b1;
    }

    public ColorStateList getTrackTintList() {
        if (this.f24214L1.equals(this.f24212K1)) {
            return this.f24212K1;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f24203D1;
    }

    public float getValueFrom() {
        return this.f24241v1;
    }

    public float getValueTo() {
        return this.f24242w1;
    }

    public List<Float> getValues() {
        return new ArrayList(this.f24244x1);
    }

    /* renamed from: h */
    public void mo33390h(L l) {
        this.f24201C.add(l);
    }

    /* renamed from: h0 */
    public final void mo33391h0() {
        if (this.f24198A1 > Utils.FLOAT_EPSILON && !mo33399l0(this.f24242w1)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.toString(this.f24198A1), Float.toString(this.f24241v1), Float.toString(this.f24242w1)}));
        }
    }

    /* renamed from: i */
    public final void mo33392i(bs6 bs6) {
        bs6.mo29727z0(pe7.m49898d(this));
    }

    /* renamed from: i0 */
    public final void mo33393i0() {
        if (this.f24241v1 >= this.f24242w1) {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", new Object[]{Float.toString(this.f24241v1), Float.toString(this.f24242w1)}));
        }
    }

    /* renamed from: j */
    public final Float mo33394j(int i) {
        float f;
        if (this.f24205F1) {
            f = mo33398l(20);
        } else {
            f = mo33396k();
        }
        if (i == 21) {
            if (!mo33336G()) {
                f = -f;
            }
            return Float.valueOf(f);
        } else if (i == 22) {
            if (mo33336G()) {
                f = -f;
            }
            return Float.valueOf(f);
        } else if (i == 69) {
            return Float.valueOf(-f);
        } else {
            if (i == 70 || i == 81) {
                return Float.valueOf(f);
            }
            return null;
        }
    }

    /* renamed from: j0 */
    public final void mo33395j0() {
        if (this.f24242w1 <= this.f24241v1) {
            throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", new Object[]{Float.toString(this.f24242w1), Float.toString(this.f24241v1)}));
        }
    }

    /* renamed from: k */
    public final float mo33396k() {
        float f = this.f24198A1;
        if (f == Utils.FLOAT_EPSILON) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: k0 */
    public final void mo33397k0() {
        Iterator<Float> it = this.f24244x1.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.f24241v1 || next.floatValue() > this.f24242w1) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", new Object[]{Float.toString(next.floatValue()), Float.toString(this.f24241v1), Float.toString(this.f24242w1)}));
            } else if (this.f24198A1 > Utils.FLOAT_EPSILON && !mo33399l0(next.floatValue())) {
                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", new Object[]{Float.toString(next.floatValue()), Float.toString(this.f24241v1), Float.toString(this.f24198A1), Float.toString(this.f24198A1)}));
            }
        }
    }

    /* renamed from: l */
    public final float mo33398l(int i) {
        float k = mo33396k();
        float f = (this.f24242w1 - this.f24241v1) / k;
        float f2 = (float) i;
        if (f <= f2) {
            return k;
        }
        return ((float) Math.round(f / f2)) * k;
    }

    /* renamed from: l0 */
    public final boolean mo33399l0(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.f24241v1))).divide(new BigDecimal(Float.toString(this.f24198A1)), MathContext.DECIMAL64).doubleValue();
        if (Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final int mo33400m() {
        int i = this.f24227e1;
        int i2 = 0;
        if (this.f24230k0 == 1) {
            i2 = this.f24199B.get(0).getIntrinsicHeight();
        }
        return i + i2;
    }

    /* renamed from: m0 */
    public final float mo33401m0(float f) {
        return (mo33344O(f) * ((float) this.f24203D1)) + ((float) this.f24223b1);
    }

    /* renamed from: n */
    public final ValueAnimator mo33402n(boolean z) {
        float f;
        ValueAnimator valueAnimator;
        long j;
        TimeInterpolator timeInterpolator;
        float f2 = Utils.FLOAT_EPSILON;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (z) {
            valueAnimator = this.f24215M;
        } else {
            valueAnimator = this.f24213L;
        }
        float A = m35795A(valueAnimator, f);
        if (z) {
            f2 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{A, f2});
        if (z) {
            j = 83;
        } else {
            j = 117;
        }
        ofFloat.setDuration(j);
        if (z) {
            timeInterpolator = C5807el.f28632e;
        } else {
            timeInterpolator = C5807el.f28630c;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new C4353b());
        return ofFloat;
    }

    /* renamed from: n0 */
    public final void mo33403n0() {
        float f = this.f24198A1;
        if (f != Utils.FLOAT_EPSILON) {
            if (((float) ((int) f)) != f) {
                String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", new Object[]{"stepSize", Float.valueOf(f)});
            }
            float f2 = this.f24241v1;
            if (((float) ((int) f2)) != f2) {
                String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", new Object[]{"valueFrom", Float.valueOf(f2)});
            }
            float f3 = this.f24242w1;
            if (((float) ((int) f3)) != f3) {
                String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", new Object[]{"valueTo", Float.valueOf(f3)});
            }
        }
    }

    /* renamed from: o */
    public final void mo33404o() {
        if (this.f24199B.size() > this.f24244x1.size()) {
            List<bs6> subList = this.f24199B.subList(this.f24244x1.size(), this.f24199B.size());
            for (bs6 next : subList) {
                if (ga7.m17746S(this)) {
                    mo33416p(next);
                }
            }
            subList.clear();
        }
        while (this.f24199B.size() < this.f24244x1.size()) {
            bs6 a = this.f24197A.mo33463a();
            this.f24199B.add(a);
            if (ga7.m17746S(this)) {
                mo33392i(a);
            }
        }
        int i = 1;
        if (this.f24199B.size() == 1) {
            i = 0;
        }
        for (bs6 l0 : this.f24199B) {
            l0.mo48462l0((float) i);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (bs6 i : this.f24199B) {
            mo33392i(i);
        }
    }

    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.C6956d dVar = this.f24245y;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.f24209I = false;
        for (bs6 p : this.f24199B) {
            mo33416p(p);
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        if (this.f24206G1) {
            mo33363g0();
            mo33338I();
        }
        super.onDraw(canvas);
        int m = mo33400m();
        mo33452u(canvas, this.f24203D1, m);
        if (((Float) Collections.max(getValues())).floatValue() > this.f24241v1) {
            mo33451t(canvas, this.f24203D1, m);
        }
        mo33340K(canvas);
        if ((this.f24239u1 || isFocused()) && isEnabled()) {
            mo33339J(canvas, this.f24203D1, m);
            if (this.f24246y1 != -1) {
                mo33454w();
            }
        }
        mo33453v(canvas, this.f24203D1, m);
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.f24246y1 = -1;
            mo33455x();
            this.f24236s.mo24245o(this.f24247z1);
            return;
        }
        mo33456y(i);
        this.f24236s.mo24241V(this.f24247z1);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f24244x1.size() == 1) {
            this.f24246y1 = 0;
        }
        if (this.f24246y1 == -1) {
            Boolean P = mo33345P(i, keyEvent);
            if (P != null) {
                return P.booleanValue();
            }
            return super.onKeyDown(i, keyEvent);
        }
        this.f24205F1 |= keyEvent.isLongPress();
        Float j = mo33394j(i);
        if (j != null) {
            if (mo33353Z(this.f24244x1.get(this.f24246y1).floatValue() + j.floatValue())) {
                mo33361e0();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return mo33342M(1);
            } else {
                if (keyEvent.isShiftPressed()) {
                    return mo33342M(-1);
                }
                return false;
            }
        }
        this.f24246y1 = -1;
        mo33455x();
        postInvalidate();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f24205F1 = false;
        return super.onKeyUp(i, keyEvent);
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f24226e0;
        int i4 = 0;
        if (this.f24230k0 == 1) {
            i4 = this.f24199B.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f24241v1 = sliderState.f24248a;
        this.f24242w1 = sliderState.f24249d;
        setValuesInternal(sliderState.f24250e);
        this.f24198A1 = sliderState.f24251g;
        if (sliderState.f24252k) {
            requestFocus();
        }
        mo33419s();
    }

    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f24248a = this.f24241v1;
        sliderState.f24249d = this.f24242w1;
        sliderState.f24250e = new ArrayList<>(this.f24244x1);
        sliderState.f24251g = this.f24198A1;
        sliderState.f24252k = hasFocus();
        return sliderState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        mo33362f0(i);
        mo33361e0();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - ((float) this.f24223b1)) / ((float) this.f24203D1);
        this.f24217N1 = f;
        float max = Math.max(Utils.FLOAT_EPSILON, f);
        this.f24217N1 = max;
        this.f24217N1 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f24235r1 = x;
            if (!mo33335F()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo33348T()) {
                    requestFocus();
                    this.f24239u1 = true;
                    mo33356c0();
                    mo33361e0();
                    invalidate();
                    mo33346Q();
                }
            }
        } else if (actionMasked == 1) {
            this.f24239u1 = false;
            MotionEvent motionEvent2 = this.f24237s1;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f24237s1.getX() - motionEvent.getX()) <= ((float) this.f24219P) && Math.abs(this.f24237s1.getY() - motionEvent.getY()) <= ((float) this.f24219P) && mo33348T()) {
                mo33346Q();
            }
            if (this.f24246y1 != -1) {
                mo33356c0();
                this.f24246y1 = -1;
                mo33347R();
            }
            mo33455x();
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.f24239u1) {
                if (mo33335F() && Math.abs(x - this.f24235r1) < ((float) this.f24219P)) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                mo33346Q();
            }
            if (mo33348T()) {
                this.f24239u1 = true;
                mo33356c0();
                mo33361e0();
                invalidate();
            }
        }
        setPressed(this.f24239u1);
        this.f24237s1 = MotionEvent.obtain(motionEvent);
        return true;
    }

    /* renamed from: p */
    public final void mo33416p(bs6 bs6) {
        nd7 e = pe7.m49899e(this);
        if (e != null) {
            e.mo45423b(bs6);
            bs6.mo29723v0(pe7.m49898d(this));
        }
    }

    /* renamed from: q */
    public final float mo33417q(float f) {
        if (f == Utils.FLOAT_EPSILON) {
            return Utils.FLOAT_EPSILON;
        }
        float f2 = (f - ((float) this.f24223b1)) / ((float) this.f24203D1);
        float f3 = this.f24241v1;
        return (f2 * (f3 - this.f24242w1)) + f3;
    }

    /* renamed from: r */
    public final void mo33418r(int i) {
        for (L a : this.f24201C) {
            a.mo42095a(this, this.f24244x1.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f24243x;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            mo33350W(i);
        }
    }

    /* renamed from: s */
    public final void mo33419s() {
        for (L l : this.f24201C) {
            Iterator<Float> it = this.f24244x1.iterator();
            while (it.hasNext()) {
                l.mo42095a(this, it.next().floatValue(), false);
            }
        }
    }

    public void setActiveThumbIndex(int i) {
        this.f24246y1 = i;
    }

    public void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (z) {
            i = 0;
        } else {
            i = 2;
        }
        setLayerType(i, (Paint) null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f24244x1.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f24247z1 = i;
        this.f24236s.mo24241V(i);
        postInvalidate();
    }

    public void setHaloRadius(int i) {
        if (i != this.f24232p1) {
            this.f24232p1 = i;
            Drawable background = getBackground();
            if (mo33352Y() || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                vj1.m53413a((RippleDrawable) background, this.f24232p1);
            }
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f24208H1)) {
            this.f24208H1 = colorStateList;
            Drawable background = getBackground();
            if (mo33352Y() || !(background instanceof RippleDrawable)) {
                this.f24228g.setColor(mo33332C(colorStateList));
                this.f24228g.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i) {
        if (this.f24230k0 != i) {
            this.f24230k0 = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(ud3 ud3) {
        this.f24238t1 = ud3;
    }

    public void setSeparationUnit(int i) {
        this.f24218O1 = i;
    }

    public void setStepSize(float f) {
        if (f < Utils.FLOAT_EPSILON) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.toString(f), Float.toString(this.f24241v1), Float.toString(this.f24242w1)}));
        } else if (this.f24198A1 != f) {
            this.f24198A1 = f;
            this.f24206G1 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.f24216M1.mo48439Z(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(int i) {
        if (i != this.f24231o1) {
            this.f24231o1 = i;
            mo33341L();
            this.f24216M1.setShapeAppearanceModel(rz5.m51446a().mo47602q(0, (float) this.f24231o1).mo47599m());
            uo3 uo3 = this.f24216M1;
            int i2 = this.f24231o1;
            uo3.setBounds(0, 0, i2 * 2, i2 * 2);
            postInvalidate();
        }
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f24216M1.mo48460k0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(C2554in.m19713a(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.f24216M1.mo48462l0(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f24216M1.mo48478x())) {
            this.f24216M1.mo48440a0(colorStateList);
            invalidate();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f24210I1)) {
            this.f24210I1 = colorStateList;
            this.f24234r.setColor(mo33332C(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f24211J1)) {
            this.f24211J1 = colorStateList;
            this.f24229k.setColor(mo33332C(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f24202C1 != z) {
            this.f24202C1 = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f24212K1)) {
            this.f24212K1 = colorStateList;
            this.f24224d.setColor(mo33332C(colorStateList));
            invalidate();
        }
    }

    public void setTrackHeight(int i) {
        if (this.f24240v0 != i) {
            this.f24240v0 = i;
            mo33334E();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f24214L1)) {
            this.f24214L1 = colorStateList;
            this.f24222a.setColor(mo33332C(colorStateList));
            invalidate();
        }
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.f24241v1 = f;
        this.f24206G1 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f24242w1 = f;
        this.f24206G1 = true;
        postInvalidate();
    }

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    /* renamed from: t */
    public final void mo33451t(Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f24223b1;
        float f = (float) i;
        float f2 = (float) i2;
        Canvas canvas2 = canvas;
        canvas2.drawLine(((float) i3) + (activeRange[0] * f), f2, ((float) i3) + (activeRange[1] * f), f2, this.f24224d);
    }

    /* renamed from: u */
    public final void mo33452u(Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f24223b1;
        float f = (float) i;
        float f2 = ((float) i3) + (activeRange[1] * f);
        if (f2 < ((float) (i3 + i))) {
            float f3 = (float) i2;
            canvas.drawLine(f2, f3, (float) (i3 + i), f3, this.f24222a);
        }
        int i4 = this.f24223b1;
        float f4 = ((float) i4) + (activeRange[0] * f);
        if (f4 > ((float) i4)) {
            float f5 = (float) i2;
            canvas.drawLine((float) i4, f5, f4, f5, this.f24222a);
        }
    }

    /* renamed from: v */
    public final void mo33453v(Canvas canvas, int i, int i2) {
        if (!isEnabled()) {
            Iterator<Float> it = this.f24244x1.iterator();
            while (it.hasNext()) {
                canvas.drawCircle(((float) this.f24223b1) + (mo33344O(it.next().floatValue()) * ((float) i)), (float) i2, (float) this.f24231o1, this.f24225e);
            }
        }
        Iterator<Float> it2 = this.f24244x1.iterator();
        while (it2.hasNext()) {
            canvas.save();
            int O = this.f24223b1 + ((int) (mo33344O(it2.next().floatValue()) * ((float) i)));
            int i3 = this.f24231o1;
            canvas.translate((float) (O - i3), (float) (i2 - i3));
            this.f24216M1.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: w */
    public final void mo33454w() {
        if (this.f24230k0 != 2) {
            if (!this.f24209I) {
                this.f24209I = true;
                ValueAnimator n = mo33402n(true);
                this.f24213L = n;
                this.f24215M = null;
                n.start();
            }
            Iterator<bs6> it = this.f24199B.iterator();
            for (int i = 0; i < this.f24244x1.size() && it.hasNext(); i++) {
                if (i != this.f24247z1) {
                    mo33351X(it.next(), this.f24244x1.get(i).floatValue());
                }
            }
            if (it.hasNext()) {
                mo33351X(it.next(), this.f24244x1.get(this.f24247z1).floatValue());
            } else {
                throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", new Object[]{Integer.valueOf(this.f24199B.size()), Integer.valueOf(this.f24244x1.size())}));
            }
        }
    }

    /* renamed from: x */
    public final void mo33455x() {
        if (this.f24209I) {
            this.f24209I = false;
            ValueAnimator n = mo33402n(false);
            this.f24215M = n;
            this.f24213L = null;
            n.addListener(new C4354c());
            this.f24215M.start();
        }
    }

    /* renamed from: y */
    public final void mo33456y(int i) {
        if (i == 1) {
            mo33342M(Integer.MAX_VALUE);
        } else if (i == 2) {
            mo33342M(Integer.MIN_VALUE);
        } else if (i == 17) {
            mo33343N(Integer.MAX_VALUE);
        } else if (i == 66) {
            mo33343N(Integer.MIN_VALUE);
        }
    }

    /* renamed from: z */
    public final String mo33457z(float f) {
        String str;
        if (mo33333D()) {
            return this.f24238t1.mo48385a(f);
        }
        if (((float) ((int) f)) == f) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        return String.format(str, new Object[]{Float.valueOf(f)});
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$d */
    public class C4355d implements Runnable {

        /* renamed from: a */
        public int f24258a;

        public C4355d() {
            this.f24258a = -1;
        }

        /* renamed from: a */
        public void mo33466a(int i) {
            this.f24258a = i;
        }

        public void run() {
            BaseSlider.this.f24236s.mo24242W(this.f24258a, 4);
        }

        public /* synthetic */ C4355d(BaseSlider baseSlider, C4352a aVar) {
            this();
        }
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.sliderStyle);
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i) {
        super(xo3.m54461c(context, attributeSet, i, f24196Q1), attributeSet, i);
        this.f24199B = new ArrayList();
        this.f24201C = new ArrayList();
        this.f24207H = new ArrayList();
        this.f24209I = false;
        this.f24239u1 = false;
        this.f24244x1 = new ArrayList<>();
        this.f24246y1 = -1;
        this.f24247z1 = -1;
        this.f24198A1 = Utils.FLOAT_EPSILON;
        this.f24202C1 = true;
        this.f24205F1 = false;
        uo3 uo3 = new uo3();
        this.f24216M1 = uo3;
        this.f24218O1 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f24222a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f24224d = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f24225e = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f24228g = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f24229k = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f24234r = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        mo33337H(context2.getResources());
        this.f24197A = new C4352a(attributeSet, i);
        mo33349V(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        uo3.mo48453h0(2);
        this.f24219P = ViewConfiguration.get(context2).getScaledTouchSlop();
        C4356e eVar = new C4356e(this);
        this.f24236s = eVar;
        ga7.m17785p0(this, eVar);
        this.f24243x = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList(list));
    }
}

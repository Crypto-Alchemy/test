package com.creageek.segmentedbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010c\u001a\u00020b¢\u0006\u0004\bd\u0010eB\u001b\b\u0016\u0012\u0006\u0010c\u001a\u00020b\u0012\b\u0010g\u001a\u0004\u0018\u00010f¢\u0006\u0004\bd\u0010hJ\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002J$\u0010\u0010\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J2\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u0013H\u0002J\u0018\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0002J(\u0010&\u001a\u00020%2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0002J\u0018\u0010'\u001a\u00020%2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0013H\u0002J\u0018\u0010(\u001a\u00020%2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0013H\u0002J\"\u0010+\u001a\u00020*2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010)\u001a\u00020\u0013H\u0002R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010.R\u0014\u00101\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010.R\u0014\u00103\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010.R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u00105R\u0018\u00108\u001a\u0004\u0018\u0001048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010.R\u0014\u0010;\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010.R\u0014\u0010=\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010.R\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010.R\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010.R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010.R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010.R\u0014\u0010$\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010?R\u0014\u0010I\u001a\u00020F8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020F8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR(\u0010Q\u001a\u0004\u0018\u00010\u00132\b\u0010L\u001a\u0004\u0018\u00010\u00138\u0006@BX\u000e¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010SR$\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0018\u00010U8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bV\u0010WR$\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0018\u00010U8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010WR$\u0010\\\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0018\u00010U8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b[\u0010WR$\u0010a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b]\u0010N\u001a\u0004\b^\u0010P\"\u0004\b_\u0010`¨\u0006i"}, mo44877d2 = {"Lcom/creageek/segmentedbutton/SegmentedButton;", "Landroid/widget/RadioGroup;", "Landroid/view/View$OnClickListener;", "Lr37;", "onFinishInflate", "Landroid/view/View;", "v", "onClick", "", "includeRipple", "i", "Landroid/widget/RadioButton;", "Lcom/creageek/segmentedbutton/SegmentType;", "type", "Lcom/creageek/segmentedbutton/SegmentSpreadType;", "spreadType", "h", "Landroid/graphics/drawable/Drawable;", "drawable", "", "rippleColor", "rippleColorSelected", "Landroid/graphics/drawable/RippleDrawable;", "j", "segmentColor", "segmentColorSelected", "borderColor", "borderColorSelected", "Landroid/graphics/drawable/StateListDrawable;", "c", "color", "colorSelected", "Landroid/content/res/ColorStateList;", "g", "", "r", "r0", "Landroid/graphics/drawable/ShapeDrawable;", "f", "b", "e", "strokeColor", "Landroid/graphics/drawable/LayerDrawable;", "a", "Lcom/creageek/segmentedbutton/SegmentSpreadType;", "d", "I", "textSize", "segmentHeight", "textColor", "k", "textColorSelected", "Landroid/graphics/Typeface;", "Landroid/graphics/Typeface;", "segmentFont", "s", "segmentFontChecked", "x", "y", "borderWidth", "A", "borderInnerWidth", "B", "F", "C", "rI", "H", "L", "M", "P", "", "Q", "[I", "stateChecked", "U", "stateUnchecked", "<set-?>", "e0", "Ljava/lang/Integer;", "getCheckedIndex", "()Ljava/lang/Integer;", "checkedIndex", "k0", "Landroid/widget/RadioButton;", "checkedChild", "Lkotlin/Function1;", "v0", "Lrc2;", "onSegmentSelected", "b1", "onSegmentReselected", "e1", "onSegmentUnselected", "o1", "getInitialCheckedIndex", "setInitialCheckedIndex", "(Ljava/lang/Integer;)V", "initialCheckedIndex", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "library-segmented_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SegmentedButton.kt */
public final class SegmentedButton extends RadioGroup implements View.OnClickListener {

    /* renamed from: A */
    public final int f9386A;

    /* renamed from: B */
    public final float f9387B;

    /* renamed from: C */
    public final float f9388C;

    /* renamed from: H */
    public final int f9389H;

    /* renamed from: I */
    public final int f9390I;

    /* renamed from: L */
    public final int f9391L;

    /* renamed from: M */
    public final int f9392M;

    /* renamed from: P */
    public final float f9393P;

    /* renamed from: Q */
    public final int[] f9394Q;

    /* renamed from: U */
    public final int[] f9395U;

    /* renamed from: a */
    public final SegmentSpreadType f9396a;

    /* renamed from: b1 */
    public rc2<? super RadioButton, r37> f9397b1;

    /* renamed from: d */
    public final int f9398d;

    /* renamed from: e */
    public final int f9399e;

    /* renamed from: e0 */
    public Integer f9400e0;

    /* renamed from: e1 */
    public rc2<? super RadioButton, r37> f9401e1;

    /* renamed from: g */
    public final int f9402g;

    /* renamed from: k */
    public final int f9403k;

    /* renamed from: k0 */
    public RadioButton f9404k0;

    /* renamed from: o1 */
    public Integer f9405o1;

    /* renamed from: r */
    public Typeface f9406r;

    /* renamed from: s */
    public Typeface f9407s;

    /* renamed from: v0 */
    public rc2<? super RadioButton, r37> f9408v0;

    /* renamed from: x */
    public final int f9409x;

    /* renamed from: y */
    public final int f9410y;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: com.creageek.segmentedbutton.SegmentedButton$a */
    /* compiled from: SegmentedButton.kt */
    public /* synthetic */ class C1905a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9411a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f9412b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003b */
        static {
            /*
                com.creageek.segmentedbutton.SegmentSpreadType[] r0 = com.creageek.segmentedbutton.SegmentSpreadType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.creageek.segmentedbutton.SegmentSpreadType r2 = com.creageek.segmentedbutton.SegmentSpreadType.evenly     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.creageek.segmentedbutton.SegmentSpreadType r3 = com.creageek.segmentedbutton.SegmentSpreadType.wrap     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f9411a = r0
                com.creageek.segmentedbutton.SegmentType[] r0 = com.creageek.segmentedbutton.SegmentType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.creageek.segmentedbutton.SegmentType r3 = com.creageek.segmentedbutton.SegmentType.first     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.creageek.segmentedbutton.SegmentType r1 = com.creageek.segmentedbutton.SegmentType.center     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                com.creageek.segmentedbutton.SegmentType r1 = com.creageek.segmentedbutton.SegmentType.last     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                com.creageek.segmentedbutton.SegmentType r1 = com.creageek.segmentedbutton.SegmentType.only     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                f9412b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.creageek.segmentedbutton.SegmentedButton.C1905a.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SegmentedButton(Context context) {
        this(context, (AttributeSet) null);
        vx2.m53591g(context, "context");
    }

    /* renamed from: d */
    public static /* synthetic */ StateListDrawable m13152d(SegmentedButton segmentedButton, SegmentType segmentType, int i, int i2, int i3, int i4, int i5, Object obj) {
        int i6;
        if ((i5 & 16) != 0) {
            i6 = i2;
        } else {
            i6 = i4;
        }
        return segmentedButton.mo13049c(segmentType, i, i2, i3, i6);
    }

    /* renamed from: a */
    public final LayerDrawable mo13047a(SegmentType segmentType, int i, int i2) {
        LayerDrawable layerDrawable = new LayerDrawable(new ShapeDrawable[]{mo13050e(segmentType, i2), mo13048b(segmentType, i)});
        int i3 = C1905a.f9412b[segmentType.ordinal()];
        if (i3 == 1) {
            int i4 = this.f9410y;
            layerDrawable.setLayerInset(1, i4, i4, this.f9386A, i4);
        } else if (i3 == 2) {
            int i5 = this.f9386A;
            int i6 = this.f9410y;
            layerDrawable.setLayerInset(1, i5, i6, i5, i6);
        } else if (i3 == 3) {
            int i7 = this.f9386A;
            int i8 = this.f9410y;
            layerDrawable.setLayerInset(1, i7, i8, i8, i8);
        } else if (i3 == 4) {
            int i9 = this.f9410y;
            layerDrawable.setLayerInset(1, i9, i9, i9, i9);
        }
        return layerDrawable;
    }

    /* renamed from: b */
    public final ShapeDrawable mo13048b(SegmentType segmentType, int i) {
        return mo13051f(segmentType, i, this.f9388C, this.f9393P);
    }

    /* renamed from: c */
    public final StateListDrawable mo13049c(SegmentType segmentType, int i, int i2, int i3, int i4) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(this.f9394Q, mo13047a(segmentType, i2, i4));
        stateListDrawable.addState(this.f9395U, mo13047a(segmentType, i, i3));
        return stateListDrawable;
    }

    /* renamed from: e */
    public final ShapeDrawable mo13050e(SegmentType segmentType, int i) {
        return mo13051f(segmentType, i, this.f9387B, this.f9393P);
    }

    /* renamed from: f */
    public final ShapeDrawable mo13051f(SegmentType segmentType, int i, float f, float f2) {
        float[] fArr;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        int i2 = C1905a.f9412b[segmentType.ordinal()];
        if (i2 == 1) {
            fArr = new float[]{f, f, f2, f2, f2, f2, f, f};
        } else if (i2 == 2) {
            fArr = new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
        } else if (i2 == 3) {
            fArr = new float[]{f2, f2, f, f, f, f, f2, f2};
        } else if (i2 == 4) {
            fArr = new float[]{f, f, f, f, f, f, f, f};
        } else {
            throw new NoWhenBranchMatchedException();
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        return shapeDrawable;
    }

    /* renamed from: g */
    public final ColorStateList mo13052g(int i, int i2) {
        return new ColorStateList(new int[][]{this.f9395U, this.f9394Q}, new int[]{i, i2});
    }

    public final Integer getCheckedIndex() {
        return this.f9400e0;
    }

    public final Integer getInitialCheckedIndex() {
        return this.f9405o1;
    }

    /* renamed from: h */
    public final RadioButton mo13055h(RadioButton radioButton, SegmentType segmentType, SegmentSpreadType segmentSpreadType, boolean z) {
        int i;
        radioButton.setTextSize(0, (float) this.f9398d);
        radioButton.setTypeface(this.f9406r);
        Drawable d = m13152d(this, segmentType, this.f9389H, this.f9390I, this.f9409x, 0, 16, (Object) null);
        Drawable j = mo13057j(d, this.f9391L, this.f9392M);
        radioButton.setTextColor(mo13052g(this.f9402g, this.f9403k));
        if (z) {
            d = j;
        }
        radioButton.setBackground(d);
        radioButton.setButtonDrawable((Drawable) null);
        radioButton.setGravity(17);
        int i2 = C1905a.f9411a[segmentSpreadType.ordinal()];
        if (i2 == 1) {
            i = -1;
        } else if (i2 == 2) {
            i = -2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        radioButton.setLayoutParams(new RadioGroup.LayoutParams(i, this.f9399e, 1.0f));
        return radioButton;
    }

    /* renamed from: i */
    public final void mo13056i(boolean z) {
        RadioButton radioButton;
        SegmentType segmentType;
        int childCount = getChildCount();
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                View childAt = getChildAt(i);
                if (childAt instanceof RadioButton) {
                    radioButton = (RadioButton) childAt;
                } else {
                    radioButton = null;
                }
                if (radioButton != null) {
                    radioButton.setOnClickListener(this);
                    if (getChildCount() == 1) {
                        segmentType = SegmentType.only;
                    } else {
                        int i2 = i + 1;
                        if (i2 == 1) {
                            segmentType = SegmentType.first;
                        } else if (i2 == getChildCount()) {
                            segmentType = SegmentType.last;
                        } else {
                            segmentType = SegmentType.center;
                        }
                    }
                    mo13055h(radioButton, segmentType, this.f9396a, z);
                }
                if (i != childCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: j */
    public final RippleDrawable mo13057j(Drawable drawable, int i, int i2) {
        return new RippleDrawable(new ColorStateList(new int[][]{this.f9395U, this.f9394Q}, new int[]{i, i2}), drawable, drawable);
    }

    public void onClick(View view) {
        RadioButton radioButton;
        if (view instanceof RadioButton) {
            radioButton = (RadioButton) view;
        } else {
            radioButton = null;
        }
        if (radioButton != null) {
            int indexOfChild = indexOfChild(radioButton);
            Integer num = this.f9400e0;
            if (num != null && num.intValue() == indexOfChild) {
                rc2<? super RadioButton, r37> rc2 = this.f9397b1;
                if (rc2 != null) {
                    rc2.invoke(radioButton);
                    return;
                }
                return;
            }
            radioButton.setTypeface(this.f9407s);
            rc2<? super RadioButton, r37> rc22 = this.f9408v0;
            if (rc22 != null) {
                rc22.invoke(radioButton);
            }
            RadioButton radioButton2 = this.f9404k0;
            if (radioButton2 != null) {
                radioButton2.setTypeface(this.f9406r);
                rc2<? super RadioButton, r37> rc23 = this.f9401e1;
                if (rc23 != null) {
                    rc23.invoke(radioButton2);
                }
            }
            this.f9404k0 = radioButton;
            this.f9400e0 = Integer.valueOf(indexOfChild);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        mo13056i(true);
    }

    public final void setInitialCheckedIndex(Integer num) {
        this.f9405o1 = num;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SegmentedButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        vx2.m53591g(context, "context");
        this.f9393P = dy1.m15522a(0.1f);
        this.f9394Q = new int[]{16842912};
        this.f9395U = new int[]{-16842912};
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p55.SegmentedButton, 0, 0);
        vx2.m53590f(obtainStyledAttributes, "context.theme.obtainStyl…           0, 0\n        )");
        this.f9396a = SegmentSpreadType.values()[obtainStyledAttributes.getInt(p55.SegmentedButton_spreadType, SegmentSpreadType.wrap.getValue())];
        this.f9398d = obtainStyledAttributes.getDimensionPixelSize(p55.SegmentedButton_textSize, context.getResources().getDimensionPixelSize(j25.default_segment_text_size));
        this.f9399e = obtainStyledAttributes.getDimensionPixelSize(p55.SegmentedButton_segmentHeight, context.getResources().getDimensionPixelSize(j25.default_segment_height));
        this.f9402g = obtainStyledAttributes.getColor(p55.SegmentedButton_textColor, zr0.m31440c(context, u15.default_text_color));
        this.f9403k = obtainStyledAttributes.getColor(p55.SegmentedButton_textColorChecked, zr0.m31440c(context, u15.default_text_color_checked));
        this.f9389H = obtainStyledAttributes.getColor(p55.SegmentedButton_segmentColor, zr0.m31440c(context, u15.default_segment_color));
        this.f9390I = obtainStyledAttributes.getColor(p55.SegmentedButton_segmentColorChecked, zr0.m31440c(context, u15.default_segment_color_checked));
        this.f9409x = obtainStyledAttributes.getColor(p55.SegmentedButton_borderColor, zr0.m31440c(context, u15.default_border_color));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(p55.SegmentedButton_borderWidth, context.getResources().getDimensionPixelSize(j25.default_border_width));
        this.f9410y = dimensionPixelSize;
        float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(p55.SegmentedButton_cornerRadius, context.getResources().getDimensionPixelSize(j25.default_corner_radius));
        this.f9387B = dimensionPixelSize2;
        this.f9391L = obtainStyledAttributes.getColor(p55.SegmentedButton_rippleColor, zr0.m31440c(context, u15.default_ripple_color));
        this.f9392M = obtainStyledAttributes.getColor(p55.SegmentedButton_rippleColorChecked, zr0.m31440c(context, u15.default_ripple_color_checked));
        int b = ap3.m31899b(((float) dimensionPixelSize) / 2.0f);
        this.f9386A = b;
        this.f9388C = dimensionPixelSize2 - ((float) b);
        int resourceId = obtainStyledAttributes.getResourceId(p55.SegmentedButton_segmentFont, -1);
        if (resourceId != -1) {
            this.f9406r = uf5.m28225h(context, resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(p55.SegmentedButton_segmentFontChecked, -1);
        if (resourceId2 != -1) {
            this.f9407s = uf5.m28225h(context, resourceId2);
        } else if (resourceId != -1) {
            this.f9407s = this.f9406r;
        }
        obtainStyledAttributes.recycle();
    }
}

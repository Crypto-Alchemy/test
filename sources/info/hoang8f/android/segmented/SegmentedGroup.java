package info.hoang8f.android.segmented;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.mlkit.common.MlKitException;
import java.util.HashMap;

public class SegmentedGroup extends RadioGroup {

    /* renamed from: A */
    public int f29963A;

    /* renamed from: a */
    public int f29964a;

    /* renamed from: d */
    public Resources f29965d;

    /* renamed from: e */
    public int f29966e;

    /* renamed from: g */
    public int f29967g;

    /* renamed from: k */
    public int f29968k;

    /* renamed from: r */
    public C5973b f29969r;

    /* renamed from: s */
    public Float f29970s;

    /* renamed from: x */
    public RadioGroup.OnCheckedChangeListener f29971x;

    /* renamed from: y */
    public HashMap<Integer, TransitionDrawable> f29972y;

    /* renamed from: info.hoang8f.android.segmented.SegmentedGroup$a */
    public class C5972a implements RadioGroup.OnCheckedChangeListener {
        public C5972a() {
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            TransitionDrawable transitionDrawable;
            ((TransitionDrawable) SegmentedGroup.this.f29972y.get(Integer.valueOf(i))).reverseTransition(MlKitException.CODE_SCANNER_UNAVAILABLE);
            if (!(SegmentedGroup.this.f29963A == 0 || (transitionDrawable = (TransitionDrawable) SegmentedGroup.this.f29972y.get(Integer.valueOf(SegmentedGroup.this.f29963A))) == null)) {
                transitionDrawable.reverseTransition(MlKitException.CODE_SCANNER_UNAVAILABLE);
            }
            int unused = SegmentedGroup.this.f29963A = i;
            if (SegmentedGroup.this.f29971x != null) {
                SegmentedGroup.this.f29971x.onCheckedChanged(radioGroup, i);
            }
        }
    }

    /* renamed from: info.hoang8f.android.segmented.SegmentedGroup$b */
    public class C5973b {

        /* renamed from: a */
        public int f29974a;

        /* renamed from: b */
        public int f29975b;

        /* renamed from: c */
        public final int f29976c = v25.radio_checked;

        /* renamed from: d */
        public final int f29977d = v25.radio_unchecked;

        /* renamed from: e */
        public float f29978e;

        /* renamed from: f */
        public final float f29979f;

        /* renamed from: g */
        public final float[] f29980g;

        /* renamed from: h */
        public final float[] f29981h;

        /* renamed from: i */
        public final float[] f29982i;

        /* renamed from: j */
        public final float[] f29983j;

        /* renamed from: k */
        public final float[] f29984k;

        /* renamed from: l */
        public final float[] f29985l;

        /* renamed from: m */
        public float[] f29986m;

        public C5973b(float f) {
            float applyDimension = TypedValue.applyDimension(1, 0.1f, SegmentedGroup.this.getResources().getDisplayMetrics());
            this.f29979f = applyDimension;
            this.f29974a = -1;
            this.f29975b = -1;
            this.f29978e = f;
            this.f29980g = new float[]{f, f, applyDimension, applyDimension, applyDimension, applyDimension, f, f};
            this.f29981h = new float[]{applyDimension, applyDimension, f, f, f, f, applyDimension, applyDimension};
            this.f29982i = new float[]{applyDimension, applyDimension, applyDimension, applyDimension, applyDimension, applyDimension, applyDimension, applyDimension};
            this.f29983j = new float[]{f, f, f, f, f, f, f, f};
            this.f29984k = new float[]{f, f, f, f, applyDimension, applyDimension, applyDimension, applyDimension};
            this.f29985l = new float[]{applyDimension, applyDimension, applyDimension, applyDimension, f, f, f, f};
        }

        /* renamed from: a */
        public final int mo43678a(View view) {
            return SegmentedGroup.this.indexOfChild(view);
        }

        /* renamed from: b */
        public float[] mo43679b(View view) {
            mo43683f(mo43680c(), mo43678a(view));
            return this.f29986m;
        }

        /* renamed from: c */
        public final int mo43680c() {
            return SegmentedGroup.this.getChildCount();
        }

        /* renamed from: d */
        public int mo43681d() {
            return this.f29976c;
        }

        /* renamed from: e */
        public int mo43682e() {
            return this.f29977d;
        }

        /* renamed from: f */
        public final void mo43683f(int i, int i2) {
            float[] fArr;
            float[] fArr2;
            if (this.f29974a != i || this.f29975b != i2) {
                this.f29974a = i;
                this.f29975b = i2;
                if (i == 1) {
                    this.f29986m = this.f29983j;
                } else if (i2 == 0) {
                    if (SegmentedGroup.this.getOrientation() == 0) {
                        fArr2 = this.f29980g;
                    } else {
                        fArr2 = this.f29984k;
                    }
                    this.f29986m = fArr2;
                } else if (i2 == i - 1) {
                    if (SegmentedGroup.this.getOrientation() == 0) {
                        fArr = this.f29981h;
                    } else {
                        fArr = this.f29985l;
                    }
                    this.f29986m = fArr;
                } else {
                    this.f29986m = this.f29982i;
                }
            }
        }
    }

    public SegmentedGroup(Context context) {
        super(context);
        this.f29968k = -1;
        this.f29965d = getResources();
        this.f29966e = zr0.m31440c(getContext(), z15.radio_button_selected_color);
        this.f29967g = zr0.m31440c(getContext(), z15.radio_button_unselected_color);
        this.f29964a = (int) getResources().getDimension(b25.radio_button_stroke_border);
        Float valueOf = Float.valueOf(getResources().getDimension(b25.radio_button_conner_radius));
        this.f29970s = valueOf;
        this.f29969r = new C5973b(valueOf.floatValue());
    }

    /* renamed from: e */
    public final void mo43668e(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, z55.SegmentedGroup, 0, 0);
        try {
            this.f29964a = (int) obtainStyledAttributes.getDimension(z55.SegmentedGroup_sc_border_width, getResources().getDimension(b25.radio_button_stroke_border));
            this.f29970s = Float.valueOf(obtainStyledAttributes.getDimension(z55.SegmentedGroup_sc_corner_radius, getResources().getDimension(b25.radio_button_conner_radius)));
            this.f29966e = obtainStyledAttributes.getColor(z55.SegmentedGroup_sc_tint_color, zr0.m31440c(getContext(), z15.radio_button_selected_color));
            this.f29968k = obtainStyledAttributes.getColor(z55.SegmentedGroup_sc_checked_text_color, zr0.m31440c(getContext(), 17170443));
            this.f29967g = obtainStyledAttributes.getColor(z55.SegmentedGroup_sc_unchecked_tint_color, zr0.m31440c(getContext(), z15.radio_button_unselected_color));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: f */
    public void mo43669f() {
        this.f29972y = new HashMap<>();
        int childCount = super.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            mo43670g(childAt);
            if (i != childCount - 1) {
                RadioGroup.LayoutParams layoutParams = (RadioGroup.LayoutParams) childAt.getLayoutParams();
                RadioGroup.LayoutParams layoutParams2 = new RadioGroup.LayoutParams(layoutParams.width, layoutParams.height, layoutParams.weight);
                if (getOrientation() == 0) {
                    layoutParams2.setMargins(0, 0, -this.f29964a, 0);
                } else {
                    layoutParams2.setMargins(0, 0, 0, -this.f29964a);
                }
                childAt.setLayoutParams(layoutParams2);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final void mo43670g(View view) {
        int d = this.f29969r.mo43681d();
        int e = this.f29969r.mo43682e();
        ((Button) view).setTextColor(new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{this.f29966e, this.f29968k}));
        Drawable mutate = zr0.m31442e(getContext(), d).mutate();
        Drawable mutate2 = zr0.m31442e(getContext(), e).mutate();
        GradientDrawable gradientDrawable = (GradientDrawable) mutate;
        gradientDrawable.setColor(this.f29966e);
        gradientDrawable.setStroke(this.f29964a, this.f29966e);
        GradientDrawable gradientDrawable2 = (GradientDrawable) mutate2;
        gradientDrawable2.setStroke(this.f29964a, this.f29966e);
        gradientDrawable2.setColor(this.f29967g);
        gradientDrawable.setCornerRadii(this.f29969r.mo43679b(view));
        gradientDrawable2.setCornerRadii(this.f29969r.mo43679b(view));
        GradientDrawable gradientDrawable3 = (GradientDrawable) zr0.m31442e(getContext(), e).mutate();
        gradientDrawable3.setStroke(this.f29964a, this.f29966e);
        gradientDrawable3.setColor(this.f29967g);
        gradientDrawable3.setCornerRadii(this.f29969r.mo43679b(view));
        gradientDrawable3.setColor(Color.argb(50, Color.red(this.f29966e), Color.green(this.f29966e), Color.blue(this.f29966e)));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{mutate2, gradientDrawable3});
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{mutate2, mutate});
        if (((RadioButton) view).isChecked()) {
            transitionDrawable.reverseTransition(0);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842912, 16842919}, layerDrawable);
        stateListDrawable.addState(StateSet.WILD_CARD, transitionDrawable);
        this.f29972y.put(Integer.valueOf(view.getId()), transitionDrawable);
        view.setBackground(stateListDrawable);
        super.setOnCheckedChangeListener(new C5972a());
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        mo43669f();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f29972y.remove(Integer.valueOf(view.getId()));
    }

    public void setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.f29971x = onCheckedChangeListener;
    }

    public void setTintColor(int i) {
        this.f29966e = i;
        mo43669f();
    }

    public void setUnCheckedTintColor(int i, int i2) {
        this.f29967g = i;
        mo43669f();
    }

    public void setTintColor(int i, int i2) {
        this.f29966e = i;
        this.f29968k = i2;
        mo43669f();
    }

    public SegmentedGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29968k = -1;
        this.f29965d = getResources();
        this.f29966e = zr0.m31440c(getContext(), z15.radio_button_selected_color);
        this.f29967g = zr0.m31440c(getContext(), z15.radio_button_unselected_color);
        this.f29964a = (int) getResources().getDimension(b25.radio_button_stroke_border);
        this.f29970s = Float.valueOf(getResources().getDimension(b25.radio_button_conner_radius));
        mo43668e(attributeSet);
        this.f29969r = new C5973b(this.f29970s.floatValue());
    }
}

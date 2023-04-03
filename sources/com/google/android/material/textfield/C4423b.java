package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.material.textfield.b */
/* compiled from: DropdownMenuEndIconDelegate */
public class C4423b extends wp1 {

    /* renamed from: q */
    public static final boolean f24558q = true;

    /* renamed from: d */
    public final TextWatcher f24559d = new C4424a();

    /* renamed from: e */
    public final View.OnFocusChangeListener f24560e = new C4427c();

    /* renamed from: f */
    public final TextInputLayout.C4409e f24561f = new C4428d(this.f35405a);

    /* renamed from: g */
    public final TextInputLayout.C4410f f24562g = new C4429e();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: h */
    public final TextInputLayout.C4411g f24563h = new C4430f();

    /* renamed from: i */
    public boolean f24564i = false;

    /* renamed from: j */
    public boolean f24565j = false;

    /* renamed from: k */
    public long f24566k = Long.MAX_VALUE;

    /* renamed from: l */
    public StateListDrawable f24567l;

    /* renamed from: m */
    public uo3 f24568m;

    /* renamed from: n */
    public AccessibilityManager f24569n;

    /* renamed from: o */
    public ValueAnimator f24570o;

    /* renamed from: p */
    public ValueAnimator f24571p;

    /* renamed from: com.google.android.material.textfield.b$a */
    /* compiled from: DropdownMenuEndIconDelegate */
    public class C4424a extends so6 {

        /* renamed from: com.google.android.material.textfield.b$a$a */
        /* compiled from: DropdownMenuEndIconDelegate */
        public class C4425a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ AutoCompleteTextView f24573a;

            public C4425a(AutoCompleteTextView autoCompleteTextView) {
                this.f24573a = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f24573a.isPopupShowing();
                C4423b.this.mo34012E(isPopupShowing);
                boolean unused = C4423b.this.f24564i = isPopupShowing;
            }
        }

        public C4424a() {
        }

        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView e = C4423b.m36216y(C4423b.this.f35405a.getEditText());
            if (C4423b.this.f24569n.isTouchExplorationEnabled() && C4423b.m36198D(e) && !C4423b.this.f35407c.hasFocus()) {
                e.dismissDropDown();
            }
            e.post(new C4425a(e));
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b */
    /* compiled from: DropdownMenuEndIconDelegate */
    public class C4426b implements ValueAnimator.AnimatorUpdateListener {
        public C4426b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C4423b.this.f35407c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.b$c */
    /* compiled from: DropdownMenuEndIconDelegate */
    public class C4427c implements View.OnFocusChangeListener {
        public C4427c() {
        }

        public void onFocusChange(View view, boolean z) {
            C4423b.this.f35405a.setEndIconActivated(z);
            if (!z) {
                C4423b.this.mo34012E(false);
                boolean unused = C4423b.this.f24564i = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.b$d */
    /* compiled from: DropdownMenuEndIconDelegate */
    public class C4428d extends TextInputLayout.C4409e {
        public C4428d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            super.mo5479g(view, t8Var);
            if (!C4423b.m36198D(C4423b.this.f35405a.getEditText())) {
                t8Var.mo26239f0(Spinner.class.getName());
            }
            if (t8Var.mo26216P()) {
                t8Var.mo26264s0((CharSequence) null);
            }
        }

        /* renamed from: h */
        public void mo9957h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo9957h(view, accessibilityEvent);
            AutoCompleteTextView e = C4423b.m36216y(C4423b.this.f35405a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C4423b.this.f24569n.isTouchExplorationEnabled() && !C4423b.m36198D(C4423b.this.f35405a.getEditText())) {
                C4423b.this.mo34015H(e);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.b$e */
    /* compiled from: DropdownMenuEndIconDelegate */
    public class C4429e implements TextInputLayout.C4410f {
        public C4429e() {
        }

        /* renamed from: a */
        public void mo33991a(TextInputLayout textInputLayout) {
            AutoCompleteTextView e = C4423b.m36216y(textInputLayout.getEditText());
            C4423b.this.mo34013F(e);
            C4423b.this.mo34018v(e);
            C4423b.this.mo34014G(e);
            e.setThreshold(0);
            e.removeTextChangedListener(C4423b.this.f24559d);
            e.addTextChangedListener(C4423b.this.f24559d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!C4423b.m36198D(e)) {
                ga7.m17714A0(C4423b.this.f35407c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(C4423b.this.f24561f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.b$f */
    /* compiled from: DropdownMenuEndIconDelegate */
    public class C4430f implements TextInputLayout.C4411g {

        /* renamed from: com.google.android.material.textfield.b$f$a */
        /* compiled from: DropdownMenuEndIconDelegate */
        public class C4431a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ AutoCompleteTextView f24580a;

            public C4431a(AutoCompleteTextView autoCompleteTextView) {
                this.f24580a = autoCompleteTextView;
            }

            public void run() {
                this.f24580a.removeTextChangedListener(C4423b.this.f24559d);
            }
        }

        public C4430f() {
        }

        /* renamed from: a */
        public void mo33992a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new C4431a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == C4423b.this.f24560e) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                if (C4423b.f24558q) {
                    autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.b$g */
    /* compiled from: DropdownMenuEndIconDelegate */
    public class C4432g implements View.OnClickListener {
        public C4432g() {
        }

        public void onClick(View view) {
            C4423b.this.mo34015H((AutoCompleteTextView) C4423b.this.f35405a.getEditText());
        }
    }

    /* renamed from: com.google.android.material.textfield.b$h */
    /* compiled from: DropdownMenuEndIconDelegate */
    public class C4433h implements View.OnTouchListener {

        /* renamed from: a */
        public final /* synthetic */ AutoCompleteTextView f24583a;

        public C4433h(AutoCompleteTextView autoCompleteTextView) {
            this.f24583a = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C4423b.this.mo34011C()) {
                    boolean unused = C4423b.this.f24564i = false;
                }
                C4423b.this.mo34015H(this.f24583a);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.textfield.b$i */
    /* compiled from: DropdownMenuEndIconDelegate */
    public class C4434i implements AutoCompleteTextView.OnDismissListener {
        public C4434i() {
        }

        public void onDismiss() {
            boolean unused = C4423b.this.f24564i = true;
            long unused2 = C4423b.this.f24566k = System.currentTimeMillis();
            C4423b.this.mo34012E(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.b$j */
    /* compiled from: DropdownMenuEndIconDelegate */
    public class C4435j extends AnimatorListenerAdapter {
        public C4435j() {
        }

        public void onAnimationEnd(Animator animator) {
            C4423b bVar = C4423b.this;
            bVar.f35407c.setChecked(bVar.f24565j);
            C4423b.this.f24571p.start();
        }
    }

    public C4423b(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: D */
    public static boolean m36198D(EditText editText) {
        if (editText.getKeyListener() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public static AutoCompleteTextView m36216y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: A */
    public final uo3 mo34009A(float f, float f2, float f3, int i) {
        rz5 m = rz5.m51446a().mo47593E(f).mo47597I(f).mo47607v(f2).mo47611z(f2).mo47599m();
        uo3 m2 = uo3.m52892m(this.f35406b, f3);
        m2.setShapeAppearanceModel(m);
        m2.mo48442c0(0, i, 0, i);
        return m2;
    }

    /* renamed from: B */
    public final void mo34010B() {
        this.f24571p = mo34021z(67, Utils.FLOAT_EPSILON, 1.0f);
        ValueAnimator z = mo34021z(50, 1.0f, Utils.FLOAT_EPSILON);
        this.f24570o = z;
        z.addListener(new C4435j());
    }

    /* renamed from: C */
    public final boolean mo34011C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f24566k;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final void mo34012E(boolean z) {
        if (this.f24565j != z) {
            this.f24565j = z;
            this.f24571p.cancel();
            this.f24570o.start();
        }
    }

    /* renamed from: F */
    public final void mo34013F(AutoCompleteTextView autoCompleteTextView) {
        if (f24558q) {
            int boxBackgroundMode = this.f35405a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f24568m);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f24567l);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: G */
    public final void mo34014G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new C4433h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f24560e);
        if (f24558q) {
            autoCompleteTextView.setOnDismissListener(new C4434i());
        }
    }

    /* renamed from: H */
    public final void mo34015H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (mo34011C()) {
                this.f24564i = false;
            }
            if (!this.f24564i) {
                if (f24558q) {
                    mo34012E(!this.f24565j);
                } else {
                    this.f24565j = !this.f24565j;
                    this.f35407c.toggle();
                }
                if (this.f24565j) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f24564i = false;
        }
    }

    /* renamed from: a */
    public void mo33993a() {
        int i;
        float dimensionPixelOffset = (float) this.f35406b.getResources().getDimensionPixelOffset(k25.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f35406b.getResources().getDimensionPixelOffset(k25.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f35406b.getResources().getDimensionPixelOffset(k25.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        uo3 A = mo34009A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        uo3 A2 = mo34009A(Utils.FLOAT_EPSILON, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f24568m = A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f24567l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, A);
        this.f24567l.addState(new int[0], A2);
        if (f24558q) {
            i = s25.mtrl_dropdown_arrow;
        } else {
            i = s25.mtrl_ic_arrow_drop_down;
        }
        this.f35405a.setEndIconDrawable(C2554in.m19714b(this.f35406b, i));
        TextInputLayout textInputLayout = this.f35405a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(y45.exposed_dropdown_menu_content_description));
        this.f35405a.setEndIconOnClickListener(new C4432g());
        this.f35405a.mo33795e(this.f24562g);
        this.f35405a.mo33797f(this.f24563h);
        mo34010B();
        this.f24569n = (AccessibilityManager) this.f35406b.getSystemService("accessibility");
    }

    /* renamed from: b */
    public boolean mo34016b(int i) {
        return i != 0;
    }

    /* renamed from: d */
    public boolean mo34017d() {
        return true;
    }

    /* renamed from: v */
    public final void mo34018v(AutoCompleteTextView autoCompleteTextView) {
        if (!m36198D(autoCompleteTextView)) {
            int boxBackgroundMode = this.f35405a.getBoxBackgroundMode();
            uo3 boxBackground = this.f35405a.getBoxBackground();
            int d = ro3.m51198d(autoCompleteTextView, j15.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                mo34020x(autoCompleteTextView, d, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                mo34019w(autoCompleteTextView, d, iArr, boxBackground);
            }
        }
    }

    /* renamed from: w */
    public final void mo34019w(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, uo3 uo3) {
        int boxBackgroundColor = this.f35405a.getBoxBackgroundColor();
        int[] iArr2 = {ro3.m51202h(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f24558q) {
            ga7.m17793t0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), uo3, uo3));
            return;
        }
        uo3 uo32 = new uo3(uo3.mo48418D());
        uo32.mo48440a0(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{uo3, uo32});
        int G = ga7.m17725G(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int F = ga7.m17723F(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        ga7.m17793t0(autoCompleteTextView, layerDrawable);
        ga7.m17722E0(autoCompleteTextView, G, paddingTop, F, paddingBottom);
    }

    /* renamed from: x */
    public final void mo34020x(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, uo3 uo3) {
        LayerDrawable layerDrawable;
        int d = ro3.m51198d(autoCompleteTextView, j15.colorSurface);
        uo3 uo32 = new uo3(uo3.mo48418D());
        int h = ro3.m51202h(i, d, 0.1f);
        uo32.mo48440a0(new ColorStateList(iArr, new int[]{h, 0}));
        if (f24558q) {
            uo32.setTint(d);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h, d});
            uo3 uo33 = new uo3(uo3.mo48418D());
            uo33.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, uo32, uo33), uo3});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{uo32, uo3});
        }
        ga7.m17793t0(autoCompleteTextView, layerDrawable);
    }

    /* renamed from: z */
    public final ValueAnimator mo34021z(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C5807el.f28628a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new C4426b());
        return ofFloat;
    }
}

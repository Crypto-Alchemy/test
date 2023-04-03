package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.material.textfield.a */
/* compiled from: ClearTextEndIconDelegate */
public class C4412a extends wp1 {

    /* renamed from: d */
    public final TextWatcher f24541d = new C4413a();

    /* renamed from: e */
    public final View.OnFocusChangeListener f24542e = new C4414b();

    /* renamed from: f */
    public final TextInputLayout.C4410f f24543f = new C4415c();

    /* renamed from: g */
    public final TextInputLayout.C4411g f24544g = new C4416d();

    /* renamed from: h */
    public AnimatorSet f24545h;

    /* renamed from: i */
    public ValueAnimator f24546i;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* compiled from: ClearTextEndIconDelegate */
    public class C4413a implements TextWatcher {
        public C4413a() {
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            if (C4412a.this.f35405a.getSuffixText() == null) {
                C4412a aVar = C4412a.this;
                if (!aVar.f35405a.hasFocus() || !C4412a.m36189l(editable)) {
                    z = false;
                } else {
                    z = true;
                }
                aVar.mo33995i(z);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    /* compiled from: ClearTextEndIconDelegate */
    public class C4414b implements View.OnFocusChangeListener {
        public C4414b() {
        }

        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
            C4412a aVar = C4412a.this;
            if (!z3 || !z) {
                z2 = false;
            }
            aVar.mo33995i(z2);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    /* compiled from: ClearTextEndIconDelegate */
    public class C4415c implements TextInputLayout.C4410f {
        public C4415c() {
        }

        /* renamed from: a */
        public void mo33991a(TextInputLayout textInputLayout) {
            boolean z;
            EditText editText = textInputLayout.getEditText();
            if (!editText.hasFocus() || !C4412a.m36189l(editText.getText())) {
                z = false;
            } else {
                z = true;
            }
            textInputLayout.setEndIconVisible(z);
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(C4412a.this.f24542e);
            editText.removeTextChangedListener(C4412a.this.f24541d);
            editText.addTextChangedListener(C4412a.this.f24541d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    /* compiled from: ClearTextEndIconDelegate */
    public class C4416d implements TextInputLayout.C4411g {

        /* renamed from: com.google.android.material.textfield.a$d$a */
        /* compiled from: ClearTextEndIconDelegate */
        public class C4417a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ EditText f24551a;

            public C4417a(EditText editText) {
                this.f24551a = editText;
            }

            public void run() {
                this.f24551a.removeTextChangedListener(C4412a.this.f24541d);
            }
        }

        public C4416d() {
        }

        /* renamed from: a */
        public void mo33992a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.post(new C4417a(editText));
                if (editText.getOnFocusChangeListener() == C4412a.this.f24542e) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    /* compiled from: ClearTextEndIconDelegate */
    public class C4418e implements View.OnClickListener {
        public C4418e() {
        }

        public void onClick(View view) {
            Editable text = C4412a.this.f35405a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            C4412a.this.f35405a.mo33784V();
        }
    }

    /* renamed from: com.google.android.material.textfield.a$f */
    /* compiled from: ClearTextEndIconDelegate */
    public class C4419f extends AnimatorListenerAdapter {
        public C4419f() {
        }

        public void onAnimationStart(Animator animator) {
            C4412a.this.f35405a.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$g */
    /* compiled from: ClearTextEndIconDelegate */
    public class C4420g extends AnimatorListenerAdapter {
        public C4420g() {
        }

        public void onAnimationEnd(Animator animator) {
            C4412a.this.f35405a.setEndIconVisible(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$h */
    /* compiled from: ClearTextEndIconDelegate */
    public class C4421h implements ValueAnimator.AnimatorUpdateListener {
        public C4421h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C4412a.this.f35407c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$i */
    /* compiled from: ClearTextEndIconDelegate */
    public class C4422i implements ValueAnimator.AnimatorUpdateListener {
        public C4422i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C4412a.this.f35407c.setScaleX(floatValue);
            C4412a.this.f35407c.setScaleY(floatValue);
        }
    }

    public C4412a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: l */
    public static boolean m36189l(Editable editable) {
        if (editable.length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo33993a() {
        this.f35405a.setEndIconDrawable(C2554in.m19714b(this.f35406b, s25.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f35405a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(y45.clear_text_end_icon_content_description));
        this.f35405a.setEndIconOnClickListener(new C4418e());
        this.f35405a.mo33795e(this.f24543f);
        this.f35405a.mo33797f(this.f24544g);
        mo33998m();
    }

    /* renamed from: c */
    public void mo33994c(boolean z) {
        if (this.f35405a.getSuffixText() != null) {
            mo33995i(z);
        }
    }

    /* renamed from: i */
    public final void mo33995i(boolean z) {
        boolean z2;
        if (this.f35405a.mo33774K() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.f24545h.isRunning()) {
            this.f24546i.cancel();
            this.f24545h.start();
            if (z2) {
                this.f24545h.end();
            }
        } else if (!z) {
            this.f24545h.cancel();
            this.f24546i.start();
            if (z2) {
                this.f24546i.end();
            }
        }
    }

    /* renamed from: j */
    public final ValueAnimator mo33996j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C5807el.f28628a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new C4421h());
        return ofFloat;
    }

    /* renamed from: k */
    public final ValueAnimator mo33997k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C5807el.f28631d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C4422i());
        return ofFloat;
    }

    /* renamed from: m */
    public final void mo33998m() {
        ValueAnimator k = mo33997k();
        ValueAnimator j = mo33996j(Utils.FLOAT_EPSILON, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f24545h = animatorSet;
        animatorSet.playTogether(new Animator[]{k, j});
        this.f24545h.addListener(new C4419f());
        ValueAnimator j2 = mo33996j(1.0f, Utils.FLOAT_EPSILON);
        this.f24546i = j2;
        j2.addListener(new C4420g());
    }
}

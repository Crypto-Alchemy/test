package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: au2 */
/* compiled from: IndicatorViewController */
public final class au2 {

    /* renamed from: a */
    public final Context f21017a;

    /* renamed from: b */
    public final TextInputLayout f21018b;

    /* renamed from: c */
    public LinearLayout f21019c;

    /* renamed from: d */
    public int f21020d;

    /* renamed from: e */
    public FrameLayout f21021e;

    /* renamed from: f */
    public Animator f21022f;

    /* renamed from: g */
    public final float f21023g;

    /* renamed from: h */
    public int f21024h;

    /* renamed from: i */
    public int f21025i;

    /* renamed from: j */
    public CharSequence f21026j;

    /* renamed from: k */
    public boolean f21027k;

    /* renamed from: l */
    public TextView f21028l;

    /* renamed from: m */
    public CharSequence f21029m;

    /* renamed from: n */
    public int f21030n;

    /* renamed from: o */
    public ColorStateList f21031o;

    /* renamed from: p */
    public CharSequence f21032p;

    /* renamed from: q */
    public boolean f21033q;

    /* renamed from: r */
    public TextView f21034r;

    /* renamed from: s */
    public int f21035s;

    /* renamed from: t */
    public ColorStateList f21036t;

    /* renamed from: u */
    public Typeface f21037u;

    /* renamed from: au2$a */
    /* compiled from: IndicatorViewController */
    public class C3823a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f21038a;

        /* renamed from: d */
        public final /* synthetic */ TextView f21039d;

        /* renamed from: e */
        public final /* synthetic */ int f21040e;

        /* renamed from: g */
        public final /* synthetic */ TextView f21041g;

        public C3823a(int i, TextView textView, int i2, TextView textView2) {
            this.f21038a = i;
            this.f21039d = textView;
            this.f21040e = i2;
            this.f21041g = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = au2.this.f21024h = this.f21038a;
            Animator unused2 = au2.this.f21022f = null;
            TextView textView = this.f21039d;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f21040e == 1 && au2.this.f21028l != null) {
                    au2.this.f21028l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f21041g;
            if (textView2 != null) {
                textView2.setTranslationY(Utils.FLOAT_EPSILON);
                this.f21041g.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f21041g;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public au2(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f21017a = context;
        this.f21018b = textInputLayout;
        this.f21023g = (float) context.getResources().getDimensionPixelSize(k25.design_textinput_caption_translate_y);
    }

    /* renamed from: A */
    public final void mo29094A(int i, int i2) {
        TextView l;
        TextView l2;
        if (i != i2) {
            if (!(i2 == 0 || (l2 = mo29117l(i2)) == null)) {
                l2.setVisibility(0);
                l2.setAlpha(1.0f);
            }
            if (!(i == 0 || (l = mo29117l(i)) == null)) {
                l.setVisibility(4);
                if (i == 1) {
                    l.setText((CharSequence) null);
                }
            }
            this.f21024h = i2;
        }
    }

    /* renamed from: B */
    public void mo29095B(CharSequence charSequence) {
        this.f21029m = charSequence;
        TextView textView = this.f21028l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* renamed from: C */
    public void mo29096C(boolean z) {
        if (this.f21027k != z) {
            mo29112g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f21017a);
                this.f21028l = appCompatTextView;
                appCompatTextView.setId(g35.textinput_error);
                this.f21028l.setTextAlignment(5);
                Typeface typeface = this.f21037u;
                if (typeface != null) {
                    this.f21028l.setTypeface(typeface);
                }
                mo29097D(this.f21030n);
                mo29098E(this.f21031o);
                mo29095B(this.f21029m);
                this.f21028l.setVisibility(4);
                ga7.m17789r0(this.f21028l, 1);
                mo29109d(this.f21028l, 0);
            } else {
                mo29125t();
                mo29131z(this.f21028l, 0);
                this.f21028l = null;
                this.f21018b.mo33876s0();
                this.f21018b.mo33769F0();
            }
            this.f21027k = z;
        }
    }

    /* renamed from: D */
    public void mo29097D(int i) {
        this.f21030n = i;
        TextView textView = this.f21028l;
        if (textView != null) {
            this.f21018b.mo33796e0(textView, i);
        }
    }

    /* renamed from: E */
    public void mo29098E(ColorStateList colorStateList) {
        this.f21031o = colorStateList;
        TextView textView = this.f21028l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: F */
    public void mo29099F(int i) {
        this.f21035s = i;
        TextView textView = this.f21034r;
        if (textView != null) {
            lo6.m21661o(textView, i);
        }
    }

    /* renamed from: G */
    public void mo29100G(boolean z) {
        if (this.f21033q != z) {
            mo29112g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f21017a);
                this.f21034r = appCompatTextView;
                appCompatTextView.setId(g35.textinput_helper_text);
                this.f21034r.setTextAlignment(5);
                Typeface typeface = this.f21037u;
                if (typeface != null) {
                    this.f21034r.setTypeface(typeface);
                }
                this.f21034r.setVisibility(4);
                ga7.m17789r0(this.f21034r, 1);
                mo29099F(this.f21035s);
                mo29101H(this.f21036t);
                mo29109d(this.f21034r, 1);
            } else {
                mo29126u();
                mo29131z(this.f21034r, 1);
                this.f21034r = null;
                this.f21018b.mo33876s0();
                this.f21018b.mo33769F0();
            }
            this.f21033q = z;
        }
    }

    /* renamed from: H */
    public void mo29101H(ColorStateList colorStateList) {
        this.f21036t = colorStateList;
        TextView textView = this.f21034r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: I */
    public final void mo29102I(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: J */
    public void mo29103J(Typeface typeface) {
        if (typeface != this.f21037u) {
            this.f21037u = typeface;
            mo29102I(this.f21028l, typeface);
            mo29102I(this.f21034r, typeface);
        }
    }

    /* renamed from: K */
    public final void mo29104K(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: L */
    public final boolean mo29105L(TextView textView, CharSequence charSequence) {
        if (!ga7.m17747T(this.f21018b) || !this.f21018b.isEnabled() || (this.f21025i == this.f21024h && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public void mo29106M(CharSequence charSequence) {
        mo29112g();
        this.f21026j = charSequence;
        this.f21028l.setText(charSequence);
        int i = this.f21024h;
        if (i != 1) {
            this.f21025i = 1;
        }
        mo29108O(i, this.f21025i, mo29105L(this.f21028l, charSequence));
    }

    /* renamed from: N */
    public void mo29107N(CharSequence charSequence) {
        mo29112g();
        this.f21032p = charSequence;
        this.f21034r.setText(charSequence);
        int i = this.f21024h;
        if (i != 2) {
            this.f21025i = 2;
        }
        mo29108O(i, this.f21025i, mo29105L(this.f21034r, charSequence));
    }

    /* renamed from: O */
    public final void mo29108O(int i, int i2, boolean z) {
        boolean z2 = z;
        if (i != i2) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f21022f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                int i4 = i2;
                mo29113h(arrayList2, this.f21033q, this.f21034r, 2, i3, i4);
                mo29113h(arrayList2, this.f21027k, this.f21028l, 1, i3, i4);
                C5968il.m45767a(animatorSet, arrayList);
                animatorSet.addListener(new C3823a(i2, mo29117l(i), i, mo29117l(i2)));
                animatorSet.start();
            } else {
                mo29094A(i, i2);
            }
            this.f21018b.mo33876s0();
            this.f21018b.mo33969v0(z2);
            this.f21018b.mo33769F0();
        }
    }

    /* renamed from: d */
    public void mo29109d(TextView textView, int i) {
        if (this.f21019c == null && this.f21021e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f21017a);
            this.f21019c = linearLayout;
            linearLayout.setOrientation(0);
            this.f21018b.addView(this.f21019c, -1, -2);
            this.f21021e = new FrameLayout(this.f21017a);
            this.f21019c.addView(this.f21021e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f21018b.getEditText() != null) {
                mo29110e();
            }
        }
        if (mo29128w(i)) {
            this.f21021e.setVisibility(0);
            this.f21021e.addView(textView);
        } else {
            this.f21019c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f21019c.setVisibility(0);
        this.f21020d++;
    }

    /* renamed from: e */
    public void mo29110e() {
        if (mo29111f()) {
            EditText editText = this.f21018b.getEditText();
            boolean g = to3.m52396g(this.f21017a);
            LinearLayout linearLayout = this.f21019c;
            int i = k25.material_helper_text_font_1_3_padding_horizontal;
            ga7.m17722E0(linearLayout, mo29124s(g, i, ga7.m17725G(editText)), mo29124s(g, k25.material_helper_text_font_1_3_padding_top, this.f21017a.getResources().getDimensionPixelSize(k25.material_helper_text_default_padding_top)), mo29124s(g, i, ga7.m17723F(editText)), 0);
        }
    }

    /* renamed from: f */
    public final boolean mo29111f() {
        if (this.f21019c == null || this.f21018b.getEditText() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo29112g() {
        Animator animator = this.f21022f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: h */
    public final void mo29113h(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                list.add(mo29114i(textView, z2));
                if (i3 == i) {
                    list.add(mo29115j(textView));
                }
            }
        }
    }

    /* renamed from: i */
    public final ObjectAnimator mo29114i(TextView textView, boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C5807el.f28628a);
        return ofFloat;
    }

    /* renamed from: j */
    public final ObjectAnimator mo29115j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f21023g, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C5807el.f28631d);
        return ofFloat;
    }

    /* renamed from: k */
    public boolean mo29116k() {
        return mo29127v(this.f21025i);
    }

    /* renamed from: l */
    public final TextView mo29117l(int i) {
        if (i == 1) {
            return this.f21028l;
        }
        if (i != 2) {
            return null;
        }
        return this.f21034r;
    }

    /* renamed from: m */
    public CharSequence mo29118m() {
        return this.f21029m;
    }

    /* renamed from: n */
    public CharSequence mo29119n() {
        return this.f21026j;
    }

    /* renamed from: o */
    public int mo29120o() {
        TextView textView = this.f21028l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: p */
    public ColorStateList mo29121p() {
        TextView textView = this.f21028l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* renamed from: q */
    public CharSequence mo29122q() {
        return this.f21032p;
    }

    /* renamed from: r */
    public int mo29123r() {
        TextView textView = this.f21034r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: s */
    public final int mo29124s(boolean z, int i, int i2) {
        if (z) {
            return this.f21017a.getResources().getDimensionPixelSize(i);
        }
        return i2;
    }

    /* renamed from: t */
    public void mo29125t() {
        this.f21026j = null;
        mo29112g();
        if (this.f21024h == 1) {
            if (!this.f21033q || TextUtils.isEmpty(this.f21032p)) {
                this.f21025i = 0;
            } else {
                this.f21025i = 2;
            }
        }
        mo29108O(this.f21024h, this.f21025i, mo29105L(this.f21028l, (CharSequence) null));
    }

    /* renamed from: u */
    public void mo29126u() {
        mo29112g();
        int i = this.f21024h;
        if (i == 2) {
            this.f21025i = 0;
        }
        mo29108O(i, this.f21025i, mo29105L(this.f21034r, (CharSequence) null));
    }

    /* renamed from: v */
    public final boolean mo29127v(int i) {
        if (i != 1 || this.f21028l == null || TextUtils.isEmpty(this.f21026j)) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public boolean mo29128w(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: x */
    public boolean mo29129x() {
        return this.f21027k;
    }

    /* renamed from: y */
    public boolean mo29130y() {
        return this.f21033q;
    }

    /* renamed from: z */
    public void mo29131z(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f21019c != null) {
            if (!mo29128w(i) || (frameLayout = this.f21021e) == null) {
                this.f21019c.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i2 = this.f21020d - 1;
            this.f21020d = i2;
            mo29104K(this.f21019c, i2);
        }
    }
}

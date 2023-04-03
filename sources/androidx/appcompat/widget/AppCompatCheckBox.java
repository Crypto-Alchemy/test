package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class AppCompatCheckBox extends CheckBox implements zq6 {

    /* renamed from: a */
    public final C3375tm f1012a;

    /* renamed from: d */
    public final C3155qm f1013d;

    /* renamed from: e */
    public final C2765ln f1014e;

    /* renamed from: g */
    public C1640bn f1015g;

    public AppCompatCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }

    private C1640bn getEmojiTextViewHelper() {
        if (this.f1015g == null) {
            this.f1015g = new C1640bn(this);
        }
        return this.f1015g;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3155qm qmVar = this.f1013d;
        if (qmVar != null) {
            qmVar.mo25144b();
        }
        C2765ln lnVar = this.f1014e;
        if (lnVar != null) {
            lnVar.mo22857b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C3375tm tmVar = this.f1012a;
        if (tmVar != null) {
            return tmVar.mo26506b(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3155qm qmVar = this.f1013d;
        if (qmVar != null) {
            return qmVar.mo25145c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3155qm qmVar = this.f1013d;
        if (qmVar != null) {
            return qmVar.mo25146d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C3375tm tmVar = this.f1012a;
        if (tmVar != null) {
            return tmVar.mo26507c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C3375tm tmVar = this.f1012a;
        if (tmVar != null) {
            return tmVar.mo26508d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1014e.mo22864j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1014e.mo22865k();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo11705d(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3155qm qmVar = this.f1013d;
        if (qmVar != null) {
            qmVar.mo25148f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3155qm qmVar = this.f1013d;
        if (qmVar != null) {
            qmVar.mo25149g(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C3375tm tmVar = this.f1012a;
        if (tmVar != null) {
            tmVar.mo26510f();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2765ln lnVar = this.f1014e;
        if (lnVar != null) {
            lnVar.mo22870p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2765ln lnVar = this.f1014e;
        if (lnVar != null) {
            lnVar.mo22870p();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo11706e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo11702a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3155qm qmVar = this.f1013d;
        if (qmVar != null) {
            qmVar.mo25151i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3155qm qmVar = this.f1013d;
        if (qmVar != null) {
            qmVar.mo25152j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C3375tm tmVar = this.f1012a;
        if (tmVar != null) {
            tmVar.mo26511g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C3375tm tmVar = this.f1012a;
        if (tmVar != null) {
            tmVar.mo26512h(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1014e.mo22877w(colorStateList);
        this.f1014e.mo22857b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1014e.mo22878x(mode);
        this.f1014e.mo22857b();
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m15.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(vq6.m29075b(context), attributeSet, i);
        xo6.m30262a(this, getContext());
        C3375tm tmVar = new C3375tm(this);
        this.f1012a = tmVar;
        tmVar.mo26509e(attributeSet, i);
        C3155qm qmVar = new C3155qm(this);
        this.f1013d = qmVar;
        qmVar.mo25147e(attributeSet, i);
        C2765ln lnVar = new C2765ln(this);
        this.f1014e = lnVar;
        lnVar.mo22867m(attributeSet, i);
        getEmojiTextViewHelper().mo11704c(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C2554in.m19714b(getContext(), i));
    }
}

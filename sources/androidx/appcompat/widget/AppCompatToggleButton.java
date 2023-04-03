package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public class AppCompatToggleButton extends ToggleButton implements zq6 {

    /* renamed from: a */
    public final C3155qm f1067a;

    /* renamed from: d */
    public final C2765ln f1068d;

    /* renamed from: e */
    public C1640bn f1069e;

    public AppCompatToggleButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private C1640bn getEmojiTextViewHelper() {
        if (this.f1069e == null) {
            this.f1069e = new C1640bn(this);
        }
        return this.f1069e;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3155qm qmVar = this.f1067a;
        if (qmVar != null) {
            qmVar.mo25144b();
        }
        C2765ln lnVar = this.f1068d;
        if (lnVar != null) {
            lnVar.mo22857b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3155qm qmVar = this.f1067a;
        if (qmVar != null) {
            return qmVar.mo25145c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3155qm qmVar = this.f1067a;
        if (qmVar != null) {
            return qmVar.mo25146d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1068d.mo22864j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1068d.mo22865k();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo11705d(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3155qm qmVar = this.f1067a;
        if (qmVar != null) {
            qmVar.mo25148f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3155qm qmVar = this.f1067a;
        if (qmVar != null) {
            qmVar.mo25149g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2765ln lnVar = this.f1068d;
        if (lnVar != null) {
            lnVar.mo22870p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2765ln lnVar = this.f1068d;
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
        C3155qm qmVar = this.f1067a;
        if (qmVar != null) {
            qmVar.mo25151i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3155qm qmVar = this.f1067a;
        if (qmVar != null) {
            qmVar.mo25152j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1068d.mo22877w(colorStateList);
        this.f1068d.mo22857b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1068d.mo22878x(mode);
        this.f1068d.mo22857b();
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        xo6.m30262a(this, getContext());
        C3155qm qmVar = new C3155qm(this);
        this.f1067a = qmVar;
        qmVar.mo25147e(attributeSet, i);
        C2765ln lnVar = new C2765ln(this);
        this.f1068d = lnVar;
        lnVar.mo22867m(attributeSet, i);
        getEmojiTextViewHelper().mo11704c(attributeSet, i);
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements zq6 {

    /* renamed from: g */
    public static final int[] f1028g = {16843126};

    /* renamed from: a */
    public final C3155qm f1029a;

    /* renamed from: d */
    public final C2765ln f1030d;

    /* renamed from: e */
    public final C0038an f1031e;

    public AppCompatMultiAutoCompleteTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo1943a(C0038an anVar) {
        KeyListener keyListener = getKeyListener();
        if (anVar.mo420b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a = anVar.mo419a(keyListener);
            if (a != keyListener) {
                super.setKeyListener(a);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3155qm qmVar = this.f1029a;
        if (qmVar != null) {
            qmVar.mo25144b();
        }
        C2765ln lnVar = this.f1030d;
        if (lnVar != null) {
            lnVar.mo22857b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3155qm qmVar = this.f1029a;
        if (qmVar != null) {
            return qmVar.mo25145c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3155qm qmVar = this.f1029a;
        if (qmVar != null) {
            return qmVar.mo25146d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1030d.mo22864j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1030d.mo22865k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f1031e.mo422d(C1688cn.m11967a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3155qm qmVar = this.f1029a;
        if (qmVar != null) {
            qmVar.mo25148f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3155qm qmVar = this.f1029a;
        if (qmVar != null) {
            qmVar.mo25149g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2765ln lnVar = this.f1030d;
        if (lnVar != null) {
            lnVar.mo22870p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2765ln lnVar = this.f1030d;
        if (lnVar != null) {
            lnVar.mo22870p();
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C2554in.m19714b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1031e.mo423e(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1031e.mo419a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3155qm qmVar = this.f1029a;
        if (qmVar != null) {
            qmVar.mo25151i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3155qm qmVar = this.f1029a;
        if (qmVar != null) {
            qmVar.mo25152j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1030d.mo22877w(colorStateList);
        this.f1030d.mo22857b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1030d.mo22878x(mode);
        this.f1030d.mo22857b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2765ln lnVar = this.f1030d;
        if (lnVar != null) {
            lnVar.mo22871q(context, i);
        }
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m15.autoCompleteTextViewStyle);
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(vq6.m29075b(context), attributeSet, i);
        xo6.m30262a(this, getContext());
        yq6 v = yq6.m30733v(getContext(), attributeSet, f1028g, i, 0);
        if (v.mo28193s(0)) {
            setDropDownBackgroundDrawable(v.mo28181g(0));
        }
        v.mo28194w();
        C3155qm qmVar = new C3155qm(this);
        this.f1029a = qmVar;
        qmVar.mo25147e(attributeSet, i);
        C2765ln lnVar = new C2765ln(this);
        this.f1030d = lnVar;
        lnVar.mo22867m(attributeSet, i);
        lnVar.mo22857b();
        C0038an anVar = new C0038an(this);
        this.f1031e = anVar;
        anVar.mo421c(attributeSet, i);
        mo1943a(anVar);
    }
}

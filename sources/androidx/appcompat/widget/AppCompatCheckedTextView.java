package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

public class AppCompatCheckedTextView extends CheckedTextView implements zq6 {

    /* renamed from: a */
    public final C3283sm f1016a;

    /* renamed from: d */
    public final C3155qm f1017d;

    /* renamed from: e */
    public final C2765ln f1018e;

    /* renamed from: g */
    public C1640bn f1019g;

    public AppCompatCheckedTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private C1640bn getEmojiTextViewHelper() {
        if (this.f1019g == null) {
            this.f1019g = new C1640bn(this);
        }
        return this.f1019g;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2765ln lnVar = this.f1018e;
        if (lnVar != null) {
            lnVar.mo22857b();
        }
        C3155qm qmVar = this.f1017d;
        if (qmVar != null) {
            qmVar.mo25144b();
        }
        C3283sm smVar = this.f1016a;
        if (smVar != null) {
            smVar.mo25869a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return lo6.m21663q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3155qm qmVar = this.f1017d;
        if (qmVar != null) {
            return qmVar.mo25145c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3155qm qmVar = this.f1017d;
        if (qmVar != null) {
            return qmVar.mo25146d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C3283sm smVar = this.f1016a;
        if (smVar != null) {
            return smVar.mo25870b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C3283sm smVar = this.f1016a;
        if (smVar != null) {
            return smVar.mo25871c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1018e.mo22864j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1018e.mo22865k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1688cn.m11967a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo11705d(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3155qm qmVar = this.f1017d;
        if (qmVar != null) {
            qmVar.mo25148f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3155qm qmVar = this.f1017d;
        if (qmVar != null) {
            qmVar.mo25149g(i);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C3283sm smVar = this.f1016a;
        if (smVar != null) {
            smVar.mo25873e();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2765ln lnVar = this.f1018e;
        if (lnVar != null) {
            lnVar.mo22870p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2765ln lnVar = this.f1018e;
        if (lnVar != null) {
            lnVar.mo22870p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(lo6.m21664r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo11706e(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3155qm qmVar = this.f1017d;
        if (qmVar != null) {
            qmVar.mo25151i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3155qm qmVar = this.f1017d;
        if (qmVar != null) {
            qmVar.mo25152j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C3283sm smVar = this.f1016a;
        if (smVar != null) {
            smVar.mo25874f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C3283sm smVar = this.f1016a;
        if (smVar != null) {
            smVar.mo25875g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1018e.mo22877w(colorStateList);
        this.f1018e.mo22857b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1018e.mo22878x(mode);
        this.f1018e.mo22857b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2765ln lnVar = this.f1018e;
        if (lnVar != null) {
            lnVar.mo22871q(context, i);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m15.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(vq6.m29075b(context), attributeSet, i);
        xo6.m30262a(this, getContext());
        C2765ln lnVar = new C2765ln(this);
        this.f1018e = lnVar;
        lnVar.mo22867m(attributeSet, i);
        lnVar.mo22857b();
        C3155qm qmVar = new C3155qm(this);
        this.f1017d = qmVar;
        qmVar.mo25147e(attributeSet, i);
        C3283sm smVar = new C3283sm(this);
        this.f1016a = smVar;
        smVar.mo25872d(attributeSet, i);
        getEmojiTextViewHelper().mo11704c(attributeSet, i);
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C2554in.m19714b(getContext(), i));
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

public class AppCompatEditText extends EditText implements qh4, zq6 {

    /* renamed from: a */
    public final C3155qm f1020a;

    /* renamed from: d */
    public final C2765ln f1021d;

    /* renamed from: e */
    public final C2715kn f1022e;

    /* renamed from: g */
    public final qo6 f1023g;

    /* renamed from: k */
    public final C0038an f1024k;

    public AppCompatEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public rr0 mo1885a(rr0 rr0) {
        return this.f1023g.mo24602a(this, rr0);
    }

    /* renamed from: c */
    public void mo1886c(C0038an anVar) {
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
        C3155qm qmVar = this.f1020a;
        if (qmVar != null) {
            qmVar.mo25144b();
        }
        C2765ln lnVar = this.f1021d;
        if (lnVar != null) {
            lnVar.mo22857b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return lo6.m21663q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3155qm qmVar = this.f1020a;
        if (qmVar != null) {
            return qmVar.mo25145c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3155qm qmVar = this.f1020a;
        if (qmVar != null) {
            return qmVar.mo25146d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1021d.mo22864j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1021d.mo22865k();
    }

    public TextClassifier getTextClassifier() {
        C2715kn knVar;
        if (Build.VERSION.SDK_INT >= 28 || (knVar = this.f1022e) == null) {
            return super.getTextClassifier();
        }
        return knVar.mo22411a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] E;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1021d.mo22872r(this, onCreateInputConnection, editorInfo);
        InputConnection a = C1688cn.m11967a(onCreateInputConnection, editorInfo, this);
        if (!(a == null || Build.VERSION.SDK_INT > 30 || (E = ga7.m17721E(this)) == null)) {
            un1.m28362d(editorInfo, E);
            a = uu2.m28426c(this, a, editorInfo);
        }
        return this.f1024k.mo422d(a, editorInfo);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (C2496hn.m19100a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        if (C2496hn.m19101b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3155qm qmVar = this.f1020a;
        if (qmVar != null) {
            qmVar.mo25148f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3155qm qmVar = this.f1020a;
        if (qmVar != null) {
            qmVar.mo25149g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2765ln lnVar = this.f1021d;
        if (lnVar != null) {
            lnVar.mo22870p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2765ln lnVar = this.f1021d;
        if (lnVar != null) {
            lnVar.mo22870p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(lo6.m21664r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1024k.mo423e(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1024k.mo419a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3155qm qmVar = this.f1020a;
        if (qmVar != null) {
            qmVar.mo25151i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3155qm qmVar = this.f1020a;
        if (qmVar != null) {
            qmVar.mo25152j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1021d.mo22877w(colorStateList);
        this.f1021d.mo22857b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1021d.mo22878x(mode);
        this.f1021d.mo22857b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2765ln lnVar = this.f1021d;
        if (lnVar != null) {
            lnVar.mo22871q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C2715kn knVar;
        if (Build.VERSION.SDK_INT >= 28 || (knVar = this.f1022e) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            knVar.mo22412b(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m15.editTextStyle);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(vq6.m29075b(context), attributeSet, i);
        xo6.m30262a(this, getContext());
        C3155qm qmVar = new C3155qm(this);
        this.f1020a = qmVar;
        qmVar.mo25147e(attributeSet, i);
        C2765ln lnVar = new C2765ln(this);
        this.f1021d = lnVar;
        lnVar.mo22867m(attributeSet, i);
        lnVar.mo22857b();
        this.f1022e = new C2715kn(this);
        this.f1023g = new qo6();
        C0038an anVar = new C0038an(this);
        this.f1024k = anVar;
        anVar.mo421c(attributeSet, i);
        mo1886c(anVar);
    }
}

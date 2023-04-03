package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

public class AppCompatButton extends Button implements C3759zt, zq6 {

    /* renamed from: a */
    public final C3155qm f1009a;

    /* renamed from: d */
    public final C2765ln f1010d;

    /* renamed from: e */
    public C1640bn f1011e;

    public AppCompatButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private C1640bn getEmojiTextViewHelper() {
        if (this.f1011e == null) {
            this.f1011e = new C1640bn(this);
        }
        return this.f1011e;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3155qm qmVar = this.f1009a;
        if (qmVar != null) {
            qmVar.mo25144b();
        }
        C2765ln lnVar = this.f1010d;
        if (lnVar != null) {
            lnVar.mo22857b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C3759zt.f20681c) {
            return super.getAutoSizeMaxTextSize();
        }
        C2765ln lnVar = this.f1010d;
        if (lnVar != null) {
            return lnVar.mo22859e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C3759zt.f20681c) {
            return super.getAutoSizeMinTextSize();
        }
        C2765ln lnVar = this.f1010d;
        if (lnVar != null) {
            return lnVar.mo22860f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C3759zt.f20681c) {
            return super.getAutoSizeStepGranularity();
        }
        C2765ln lnVar = this.f1010d;
        if (lnVar != null) {
            return lnVar.mo22861g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C3759zt.f20681c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C2765ln lnVar = this.f1010d;
        if (lnVar != null) {
            return lnVar.mo22862h();
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!C3759zt.f20681c) {
            C2765ln lnVar = this.f1010d;
            if (lnVar != null) {
                return lnVar.mo22863i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return lo6.m21663q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3155qm qmVar = this.f1009a;
        if (qmVar != null) {
            return qmVar.mo25145c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3155qm qmVar = this.f1009a;
        if (qmVar != null) {
            return qmVar.mo25146d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1010d.mo22864j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1010d.mo22865k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C2765ln lnVar = this.f1010d;
        if (lnVar != null) {
            lnVar.mo22869o(z, i, i2, i3, i4);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C2765ln lnVar = this.f1010d;
        if (lnVar != null && !C3759zt.f20681c && lnVar.mo22866l()) {
            this.f1010d.mo22858c();
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo11705d(z);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C3759zt.f20681c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C2765ln lnVar = this.f1010d;
        if (lnVar != null) {
            lnVar.mo22874t(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C3759zt.f20681c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C2765ln lnVar = this.f1010d;
        if (lnVar != null) {
            lnVar.mo22875u(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C3759zt.f20681c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C2765ln lnVar = this.f1010d;
        if (lnVar != null) {
            lnVar.mo22876v(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3155qm qmVar = this.f1009a;
        if (qmVar != null) {
            qmVar.mo25148f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3155qm qmVar = this.f1009a;
        if (qmVar != null) {
            qmVar.mo25149g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(lo6.m21664r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo11706e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo11702a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C2765ln lnVar = this.f1010d;
        if (lnVar != null) {
            lnVar.mo22873s(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3155qm qmVar = this.f1009a;
        if (qmVar != null) {
            qmVar.mo25151i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3155qm qmVar = this.f1009a;
        if (qmVar != null) {
            qmVar.mo25152j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1010d.mo22877w(colorStateList);
        this.f1010d.mo22857b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1010d.mo22878x(mode);
        this.f1010d.mo22857b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2765ln lnVar = this.f1010d;
        if (lnVar != null) {
            lnVar.mo22871q(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C3759zt.f20681c) {
            super.setTextSize(i, f);
            return;
        }
        C2765ln lnVar = this.f1010d;
        if (lnVar != null) {
            lnVar.mo22853A(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m15.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(vq6.m29075b(context), attributeSet, i);
        xo6.m30262a(this, getContext());
        C3155qm qmVar = new C3155qm(this);
        this.f1009a = qmVar;
        qmVar.mo25147e(attributeSet, i);
        C2765ln lnVar = new C2765ln(this);
        this.f1010d = lnVar;
        lnVar.mo22867m(attributeSet, i);
        lnVar.mo22857b();
        getEmojiTextViewHelper().mo11704c(attributeSet, i);
    }
}

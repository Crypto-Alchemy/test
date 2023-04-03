package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p000.yt4;

public class AppCompatTextView extends TextView implements zq6, C3759zt {
    private final C3155qm mBackgroundTintHelper;
    private C1640bn mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<yt4> mPrecomputedTextFuture;
    private final C2715kn mTextClassifierHelper;
    private final C2765ln mTextHelper;

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<yt4> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                lo6.m21660n(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private C1640bn getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C1640bn(this);
        }
        return this.mEmojiTextViewHelper;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3155qm qmVar = this.mBackgroundTintHelper;
        if (qmVar != null) {
            qmVar.mo25144b();
        }
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null) {
            lnVar.mo22857b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C3759zt.f20681c) {
            return super.getAutoSizeMaxTextSize();
        }
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null) {
            return lnVar.mo22859e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C3759zt.f20681c) {
            return super.getAutoSizeMinTextSize();
        }
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null) {
            return lnVar.mo22860f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C3759zt.f20681c) {
            return super.getAutoSizeStepGranularity();
        }
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null) {
            return lnVar.mo22861g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C3759zt.f20681c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null) {
            return lnVar.mo22862h();
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!C3759zt.f20681c) {
            C2765ln lnVar = this.mTextHelper;
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

    public int getFirstBaselineToTopHeight() {
        return lo6.m21648b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return lo6.m21649c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3155qm qmVar = this.mBackgroundTintHelper;
        if (qmVar != null) {
            return qmVar.mo25145c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3155qm qmVar = this.mBackgroundTintHelper;
        if (qmVar != null) {
            return qmVar.mo25146d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.mo22864j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.mo22865k();
    }

    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        C2715kn knVar;
        if (Build.VERSION.SDK_INT >= 28 || (knVar = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        return knVar.mo22411a();
    }

    public yt4.C3695a getTextMetricsParamsCompat() {
        return lo6.m21653g(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().mo11703b();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.mo22872r(this, onCreateInputConnection, editorInfo);
        return C1688cn.m11967a(onCreateInputConnection, editorInfo, this);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null) {
            lnVar.mo22869o(z, i, i2, i3, i4);
        }
    }

    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null && !C3759zt.f20681c && lnVar.mo22866l()) {
            this.mTextHelper.mo22858c();
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
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null) {
            lnVar.mo22874t(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C3759zt.f20681c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null) {
            lnVar.mo22875u(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C3759zt.f20681c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null) {
            lnVar.mo22876v(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3155qm qmVar = this.mBackgroundTintHelper;
        if (qmVar != null) {
            qmVar.mo25148f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3155qm qmVar = this.mBackgroundTintHelper;
        if (qmVar != null) {
            qmVar.mo25149g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null) {
            lnVar.mo22870p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null) {
            lnVar.mo22870p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null) {
            lnVar.mo22870p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2765ln lnVar = this.mTextHelper;
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

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo11702a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            lo6.m21657k(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            lo6.m21658l(this, i);
        }
    }

    public void setLineHeight(int i) {
        lo6.m21659m(this, i);
    }

    public void setPrecomputedText(yt4 yt4) {
        lo6.m21660n(this, yt4);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3155qm qmVar = this.mBackgroundTintHelper;
        if (qmVar != null) {
            qmVar.mo25151i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3155qm qmVar = this.mBackgroundTintHelper;
        if (qmVar != null) {
            qmVar.mo25152j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.mo22877w(colorStateList);
        this.mTextHelper.mo22857b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.mo22878x(mode);
        this.mTextHelper.mo22857b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null) {
            lnVar.mo22871q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C2715kn knVar;
        if (Build.VERSION.SDK_INT >= 28 || (knVar = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            knVar.mo22412b(textClassifier);
        }
    }

    public void setTextFuture(Future<yt4> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(yt4.C3695a aVar) {
        lo6.m21662p(this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (C3759zt.f20681c) {
            super.setTextSize(i, f);
            return;
        }
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null) {
            lnVar.mo22853A(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        if (!this.mIsSetTypefaceProcessing) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                typeface2 = g27.m17571a(getContext(), typeface, i);
            }
            this.mIsSetTypefaceProcessing = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.mIsSetTypefaceProcessing = false;
            }
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(vq6.m29075b(context), attributeSet, i);
        this.mIsSetTypefaceProcessing = false;
        xo6.m30262a(this, getContext());
        C3155qm qmVar = new C3155qm(this);
        this.mBackgroundTintHelper = qmVar;
        qmVar.mo25147e(attributeSet, i);
        C2765ln lnVar = new C2765ln(this);
        this.mTextHelper = lnVar;
        lnVar.mo22867m(attributeSet, i);
        lnVar.mo22857b();
        this.mTextClassifierHelper = new C2715kn(this);
        getEmojiTextViewHelper().mo11704c(attributeSet, i);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C2554in.m19714b(context, i) : null;
        Drawable b2 = i2 != 0 ? C2554in.m19714b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C2554in.m19714b(context, i3) : null;
        if (i4 != 0) {
            drawable = C2554in.m19714b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b, b2, b3, drawable);
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null) {
            lnVar.mo22870p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C2554in.m19714b(context, i) : null;
        Drawable b2 = i2 != 0 ? C2554in.m19714b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C2554in.m19714b(context, i3) : null;
        if (i4 != 0) {
            drawable = C2554in.m19714b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, drawable);
        C2765ln lnVar = this.mTextHelper;
        if (lnVar != null) {
            lnVar.mo22870p();
        }
    }
}

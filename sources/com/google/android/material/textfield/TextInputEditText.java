package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;

public class TextInputEditText extends AppCompatEditText {

    /* renamed from: r */
    public final Rect f24441r;

    /* renamed from: s */
    public boolean f24442s;

    public TextInputEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f24442s && rect != null) {
            textInputLayout.getFocusedRect(this.f24441r);
            rect.bottom = this.f24441r.bottom;
        }
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!(textInputLayout == null || !this.f24442s || rect == null)) {
            textInputLayout.getGlobalVisibleRect(this.f24441r, point);
            rect.bottom = this.f24441r.bottom;
        }
        return globalVisibleRect;
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.mo33778O()) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.mo33778O() && super.getHint() == null && ln3.m47863c()) {
            setHint("");
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f24442s) {
            this.f24441r.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(k25.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f24441r, true);
        }
        return requestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f24442s = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(xo3.m54461c(context, attributeSet, i, 0), attributeSet, i);
        this.f24441r = new Rect();
        TypedArray h = wo6.m54004h(context, attributeSet, u55.TextInputEditText, i, e55.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(h.getBoolean(u55.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        h.recycle();
    }
}

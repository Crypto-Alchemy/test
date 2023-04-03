package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: a */
    public int f24026a;

    public VisibilityAwareImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public final void mo33013b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f24026a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f24026a;
    }

    public void setVisibility(int i) {
        mo33013b(i, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24026a = getVisibility();
    }
}

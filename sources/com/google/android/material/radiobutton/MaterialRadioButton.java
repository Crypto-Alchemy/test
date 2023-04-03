package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;

public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: s */
    public static final int f24191s = e55.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: x */
    public static final int[][] f24192x = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: k */
    public ColorStateList f24193k;

    /* renamed from: r */
    public boolean f24194r;

    public MaterialRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f24193k == null) {
            int d = ro3.m51198d(this, j15.colorControlActivated);
            int d2 = ro3.m51198d(this, j15.colorOnSurface);
            int d3 = ro3.m51198d(this, j15.colorSurface);
            int[][] iArr = f24192x;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = ro3.m51202h(d3, d, 1.0f);
            iArr2[1] = ro3.m51202h(d3, d2, 0.54f);
            iArr2[2] = ro3.m51202h(d3, d2, 0.38f);
            iArr2[3] = ro3.m51202h(d3, d2, 0.38f);
            this.f24193k = new ColorStateList(iArr, iArr2);
        }
        return this.f24193k;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24194r && fo0.m17153b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f24194r = z;
        if (z) {
            fo0.m17154c(this, getMaterialThemeColorsTintList());
        } else {
            fo0.m17154c(this, (ColorStateList) null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.radioButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialRadioButton(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f24191s
            android.content.Context r8 = p000.xo3.m54461c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p000.u55.MaterialRadioButton
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = p000.wo6.m54004h(r0, r1, r2, r3, r4, r5)
            int r10 = p000.u55.MaterialRadioButton_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = p000.to3.m52391b(r8, r9, r10)
            p000.fo0.m17154c(r7, r8)
        L_0x0028:
            int r8 = p000.u55.MaterialRadioButton_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f24194r = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.MaterialRadioButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

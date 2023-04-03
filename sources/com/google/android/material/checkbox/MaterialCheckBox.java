package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;

public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: s */
    public static final int f23582s = e55.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: x */
    public static final int[][] f23583x = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: k */
    public ColorStateList f23584k;

    /* renamed from: r */
    public boolean f23585r;

    public MaterialCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f23584k == null) {
            int[][] iArr = f23583x;
            int[] iArr2 = new int[iArr.length];
            int d = ro3.m51198d(this, j15.colorControlActivated);
            int d2 = ro3.m51198d(this, j15.colorSurface);
            int d3 = ro3.m51198d(this, j15.colorOnSurface);
            iArr2[0] = ro3.m51202h(d2, d, 1.0f);
            iArr2[1] = ro3.m51202h(d2, d3, 0.54f);
            iArr2[2] = ro3.m51202h(d2, d3, 0.38f);
            iArr2[3] = ro3.m51202h(d2, d3, 0.38f);
            this.f23584k = new ColorStateList(iArr, iArr2);
        }
        return this.f23584k;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23585r && fo0.m17153b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f23585r = z;
        if (z) {
            fo0.m17154c(this, getMaterialThemeColorsTintList());
        } else {
            fo0.m17154c(this, (ColorStateList) null);
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.checkboxStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCheckBox(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f23582s
            android.content.Context r8 = p000.xo3.m54461c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p000.u55.MaterialCheckBox
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = p000.wo6.m54004h(r0, r1, r2, r3, r4, r5)
            int r10 = p000.u55.MaterialCheckBox_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = p000.to3.m52391b(r8, r9, r10)
            p000.fo0.m17154c(r7, r8)
        L_0x0028:
            int r8 = p000.u55.MaterialCheckBox_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f23585r = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

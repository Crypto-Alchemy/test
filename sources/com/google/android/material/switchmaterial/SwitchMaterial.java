package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;

public class SwitchMaterial extends SwitchCompat {

    /* renamed from: O1 */
    public static final int f24343O1 = e55.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: P1 */
    public static final int[][] f24344P1 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: K1 */
    public final zn1 f24345K1;

    /* renamed from: L1 */
    public ColorStateList f24346L1;

    /* renamed from: M1 */
    public ColorStateList f24347M1;

    /* renamed from: N1 */
    public boolean f24348N1;

    public SwitchMaterial(Context context) {
        this(context, (AttributeSet) null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f24346L1 == null) {
            int d = ro3.m51198d(this, j15.colorSurface);
            int d2 = ro3.m51198d(this, j15.colorControlActivated);
            float dimension = getResources().getDimension(k25.mtrl_switch_thumb_elevation);
            if (this.f24345K1.mo49886e()) {
                dimension += pe7.m49901g(this);
            }
            int c = this.f24345K1.mo49884c(d, dimension);
            int[][] iArr = f24344P1;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = ro3.m51202h(d, d2, 1.0f);
            iArr2[1] = c;
            iArr2[2] = ro3.m51202h(d, d2, 0.38f);
            iArr2[3] = c;
            this.f24346L1 = new ColorStateList(iArr, iArr2);
        }
        return this.f24346L1;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f24347M1 == null) {
            int[][] iArr = f24344P1;
            int[] iArr2 = new int[iArr.length];
            int d = ro3.m51198d(this, j15.colorSurface);
            int d2 = ro3.m51198d(this, j15.colorControlActivated);
            int d3 = ro3.m51198d(this, j15.colorOnSurface);
            iArr2[0] = ro3.m51202h(d, d2, 0.54f);
            iArr2[1] = ro3.m51202h(d, d3, 0.32f);
            iArr2[2] = ro3.m51202h(d, d2, 0.12f);
            iArr2[3] = ro3.m51202h(d, d3, 0.12f);
            this.f24347M1 = new ColorStateList(iArr, iArr2);
        }
        return this.f24347M1;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24348N1 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f24348N1 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f24348N1 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList((ColorStateList) null);
        setTrackTintList((ColorStateList) null);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.switchStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchMaterial(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f24343O1
            android.content.Context r7 = p000.xo3.m54461c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            zn1 r7 = new zn1
            r7.<init>(r0)
            r6.f24345K1 = r7
            int[] r2 = p000.u55.SwitchMaterial
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = p000.wo6.m54004h(r0, r1, r2, r3, r4, r5)
            int r9 = p000.u55.SwitchMaterial_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f24348N1 = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

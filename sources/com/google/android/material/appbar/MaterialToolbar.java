package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

public class MaterialToolbar extends Toolbar {

    /* renamed from: K1 */
    public static final int f23337K1 = e55.Widget_MaterialComponents_Toolbar;

    /* renamed from: H1 */
    public Integer f23338H1;

    /* renamed from: I1 */
    public boolean f23339I1;

    /* renamed from: J1 */
    public boolean f23340J1;

    public MaterialToolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: M */
    public final Pair<Integer, Integer> mo31707M(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* renamed from: N */
    public final void mo31708N(Context context) {
        int i;
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            uo3 uo3 = new uo3();
            if (background != null) {
                i = ((ColorDrawable) background).getColor();
            } else {
                i = 0;
            }
            uo3.mo48440a0(ColorStateList.valueOf(i));
            uo3.mo48430P(context);
            uo3.mo48439Z(ga7.m17798w(this));
            ga7.m17793t0(this, uo3);
        }
    }

    /* renamed from: O */
    public final void mo31709O(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    /* renamed from: P */
    public final void mo31710P() {
        if (this.f23339I1 || this.f23340J1) {
            TextView c = sr6.m51891c(this);
            TextView a = sr6.m51889a(this);
            if (c != null || a != null) {
                Pair<Integer, Integer> M = mo31707M(c, a);
                if (this.f23339I1 && c != null) {
                    mo31709O(c, M);
                }
                if (this.f23340J1 && a != null) {
                    mo31709O(a, M);
                }
            }
        }
    }

    /* renamed from: Q */
    public final Drawable mo31711Q(Drawable drawable) {
        if (drawable == null || this.f23338H1 == null) {
            return drawable;
        }
        Drawable r = ij1.m19659r(drawable);
        ij1.m19655n(r, this.f23338H1.intValue());
        return r;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vo3.m53443e(this);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo31710P();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        vo3.m53442d(this, f);
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(mo31711Q(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.f23338H1 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f23340J1 != z) {
            this.f23340J1 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f23339I1 != z) {
            this.f23339I1 = z;
            requestLayout();
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.toolbarStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f23337K1
            android.content.Context r8 = p000.xo3.m54461c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p000.u55.MaterialToolbar
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = p000.wo6.m54004h(r0, r1, r2, r3, r4, r5)
            int r10 = p000.u55.MaterialToolbar_navigationIconTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0029
            r0 = -1
            int r10 = r9.getColor(r10, r0)
            r7.setNavigationIconTint(r10)
        L_0x0029:
            int r10 = p000.u55.MaterialToolbar_titleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f23339I1 = r10
            int r10 = p000.u55.MaterialToolbar_subtitleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f23340J1 = r10
            r9.recycle()
            r7.mo31708N(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

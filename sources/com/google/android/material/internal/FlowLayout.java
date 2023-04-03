package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class FlowLayout extends ViewGroup {

    /* renamed from: a */
    public int f23984a;

    /* renamed from: d */
    public int f23985d;

    /* renamed from: e */
    public boolean f23986e;

    /* renamed from: g */
    public int f23987g;

    public FlowLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public static int m35574a(int i, int i2, int i3) {
        if (i2 == Integer.MIN_VALUE) {
            return Math.min(i3, i);
        }
        if (i2 != 1073741824) {
            return i3;
        }
        return i;
    }

    /* renamed from: b */
    public int mo32940b(View view) {
        Object tag = view.getTag(g35.row_index_key);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    /* renamed from: c */
    public boolean mo32236c() {
        return this.f23986e;
    }

    /* renamed from: d */
    public final void mo32941d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, u55.FlowLayout, 0, 0);
        this.f23984a = obtainStyledAttributes.getDimensionPixelSize(u55.FlowLayout_lineSpacing, 0);
        this.f23985d = obtainStyledAttributes.getDimensionPixelSize(u55.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.f23985d;
    }

    public int getLineSpacing() {
        return this.f23984a;
    }

    public int getRowCount() {
        return this.f23987g;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (getChildCount() == 0) {
            this.f23987g = 0;
            return;
        }
        this.f23987g = 1;
        if (ga7.m17715B(this) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i5 = getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        if (z2) {
            i6 = getPaddingLeft();
        } else {
            i6 = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i9 = (i3 - i) - i6;
        int i10 = i5;
        int i11 = paddingTop;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(g35.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i7 = do3.m15248b(marginLayoutParams);
                    i8 = do3.m15247a(marginLayoutParams);
                } else {
                    i8 = 0;
                    i7 = 0;
                }
                int measuredWidth = i10 + i7 + childAt.getMeasuredWidth();
                if (!this.f23986e && measuredWidth > i9) {
                    i11 = this.f23984a + paddingTop;
                    this.f23987g++;
                    i10 = i5;
                }
                childAt.setTag(g35.row_index_key, Integer.valueOf(this.f23987g - 1));
                int i13 = i10 + i7;
                int measuredWidth2 = childAt.getMeasuredWidth() + i13;
                int measuredHeight = childAt.getMeasuredHeight() + i11;
                if (z2) {
                    childAt.layout(i9 - measuredWidth2, i11, (i9 - i10) - i7, measuredHeight);
                } else {
                    childAt.layout(i13, i11, measuredWidth2, measuredHeight);
                }
                i10 += i7 + i8 + childAt.getMeasuredWidth() + this.f23985d;
                paddingTop = measuredHeight;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i3 = size;
        } else {
            i3 = Integer.MAX_VALUE;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i;
                int i11 = i2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin + 0;
                    i4 = marginLayoutParams.rightMargin + 0;
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                int i12 = paddingLeft;
                if (paddingLeft + i5 + childAt.getMeasuredWidth() <= paddingRight || mo32236c()) {
                    i6 = i12;
                } else {
                    i6 = getPaddingLeft();
                    i7 = this.f23984a + paddingTop;
                }
                int measuredWidth = i6 + i5 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i6 + i5 + i4 + childAt.getMeasuredWidth() + this.f23985d;
                if (i9 == getChildCount() - 1) {
                    i8 += i4;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m35574a(size, mode, i8 + getPaddingRight()), m35574a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i) {
        this.f23985d = i;
    }

    public void setLineSpacing(int i) {
        this.f23984a = i;
    }

    public void setSingleLine(boolean z) {
        this.f23986e = z;
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23986e = false;
        mo32941d(context, attributeSet);
    }
}

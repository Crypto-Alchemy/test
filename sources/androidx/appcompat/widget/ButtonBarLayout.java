package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    public boolean f1070a;

    /* renamed from: d */
    public boolean f1071d;

    /* renamed from: e */
    public int f1072e = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = j65.ButtonBarLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ga7.m17781n0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1070a = obtainStyledAttributes.getBoolean(j65.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1070a);
        }
    }

    private void setStacked(boolean z) {
        int i;
        int i2;
        if (this.f1071d == z) {
            return;
        }
        if (!z || this.f1070a) {
            this.f1071d = z;
            setOrientation(z ? 1 : 0);
            if (z) {
                i = 8388613;
            } else {
                i = 80;
            }
            setGravity(i);
            View findViewById = findViewById(j35.spacer);
            if (findViewById != null) {
                if (z) {
                    i2 = 8;
                } else {
                    i2 = 4;
                }
                findViewById.setVisibility(i2);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    /* renamed from: a */
    public final int mo2115a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public final boolean mo2116b() {
        return this.f1071d;
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f1070a) {
            if (size > this.f1072e && mo2116b()) {
                setStacked(false);
            }
            this.f1072e = size;
        }
        if (mo2116b() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1070a && !mo2116b()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = mo2115a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (mo2116b()) {
                int a2 = mo2115a(a + 1);
                if (a2 >= 0) {
                    paddingTop += getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (ga7.m17717C(this) != i4) {
            setMinimumHeight(i4);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1070a != z) {
            this.f1070a = z;
            if (!z && mo2116b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}

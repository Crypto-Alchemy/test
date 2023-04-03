package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0173e;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

public class BottomNavigationMenuView extends NavigationBarMenuView {

    /* renamed from: b1 */
    public final int f23446b1;

    /* renamed from: e1 */
    public final int f23447e1;

    /* renamed from: o1 */
    public final int f23448o1;

    /* renamed from: p1 */
    public final int f23449p1;

    /* renamed from: q1 */
    public boolean f23450q1;

    /* renamed from: r1 */
    public int[] f23451r1 = new int[5];

    /* renamed from: v0 */
    public final int f23452v0;

    public BottomNavigationMenuView(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f23452v0 = resources.getDimensionPixelSize(k25.design_bottom_navigation_item_max_width);
        this.f23446b1 = resources.getDimensionPixelSize(k25.design_bottom_navigation_item_min_width);
        this.f23447e1 = resources.getDimensionPixelSize(k25.design_bottom_navigation_active_item_max_width);
        this.f23448o1 = resources.getDimensionPixelSize(k25.design_bottom_navigation_active_item_min_width);
        this.f23449p1 = resources.getDimensionPixelSize(k25.design_bottom_navigation_height);
    }

    /* renamed from: f */
    public NavigationBarItemView mo31843f(Context context) {
        return new BottomNavigationItemView(context);
    }

    /* renamed from: l */
    public boolean mo31844l() {
        return this.f23450q1;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (ga7.m17715B(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        C0173e menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.mo1379G().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f23449p1, 1073741824);
        int i6 = 1;
        if (!mo33128g(getLabelVisibilityMode(), size2) || !mo31844l()) {
            if (size2 != 0) {
                i6 = size2;
            }
            int min = Math.min(size / i6, this.f23447e1);
            int i7 = size - (size2 * min);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    int[] iArr = this.f23451r1;
                    iArr[i8] = min;
                    if (i7 > 0) {
                        iArr[i8] = min + 1;
                        i7--;
                    }
                } else {
                    this.f23451r1[i8] = 0;
                }
            }
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            int i9 = this.f23448o1;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f23447e1, Integer.MIN_VALUE), makeMeasureSpec);
                i9 = Math.max(i9, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i10 = size2 - i3;
            int min2 = Math.min(size - (this.f23446b1 * i10), Math.min(i9, this.f23447e1));
            int i11 = size - min2;
            if (i10 == 0) {
                i4 = 1;
            } else {
                i4 = i10;
            }
            int min3 = Math.min(i11 / i4, this.f23452v0);
            int i12 = i11 - (i10 * min3);
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).getVisibility() != 8) {
                    int[] iArr2 = this.f23451r1;
                    if (i13 == getSelectedItemPosition()) {
                        i5 = min2;
                    } else {
                        i5 = min3;
                    }
                    iArr2[i13] = i5;
                    if (i12 > 0) {
                        int[] iArr3 = this.f23451r1;
                        iArr3[i13] = iArr3[i13] + 1;
                        i12--;
                    }
                } else {
                    this.f23451r1[i13] = 0;
                }
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f23451r1[i15], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i14 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i14, View.MeasureSpec.makeMeasureSpec(i14, 1073741824), 0), View.resolveSizeAndState(this.f23449p1, makeMeasureSpec, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f23450q1 = z;
    }
}

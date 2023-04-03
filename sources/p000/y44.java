package p000;

import android.content.Context;
import android.view.View;
import com.google.android.material.navigation.NavigationBarItemView;

/* renamed from: y44 */
/* compiled from: NavigationRailItemView */
public final class y44 extends NavigationBarItemView {
    public y44(Context context) {
        super(context);
    }

    public int getItemDefaultMarginResId() {
        return k25.mtrl_navigation_rail_icon_margin;
    }

    public int getItemLayoutResId() {
        return c45.mtrl_navigation_rail_item;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState(Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)), i2, 0));
        }
    }
}

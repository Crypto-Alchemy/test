package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a */
    public final int f1389a = getResources().getDimensionPixelOffset(e25.browser_actions_context_menu_min_padding);

    /* renamed from: d */
    public final int f1390d = getResources().getDimensionPixelOffset(e25.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1389a * 2), this.f1390d), 1073741824), i2);
    }
}

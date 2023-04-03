package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: a */
    public h32 f1082a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public boolean fitSystemWindows(Rect rect) {
        h32 h32 = this.f1082a;
        if (h32 != null) {
            h32.mo20931a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(h32 h32) {
        this.f1082a = h32;
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

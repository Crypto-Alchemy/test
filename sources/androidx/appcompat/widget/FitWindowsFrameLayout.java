package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class FitWindowsFrameLayout extends FrameLayout {

    /* renamed from: a */
    public h32 f1081a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public boolean fitSystemWindows(Rect rect) {
        h32 h32 = this.f1081a;
        if (h32 != null) {
            h32.mo20931a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(h32 h32) {
        this.f1081a = h32;
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

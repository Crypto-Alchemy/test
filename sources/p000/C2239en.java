package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: en */
/* compiled from: AppCompatPopupWindow */
public class C2239en extends PopupWindow {

    /* renamed from: b */
    public static final boolean f11282b = false;

    /* renamed from: a */
    public boolean f11283a;

    public C2239en(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo19390a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final void mo19390a(Context context, AttributeSet attributeSet, int i, int i2) {
        yq6 v = yq6.m30733v(context, attributeSet, j65.PopupWindow, i, i2);
        int i3 = j65.PopupWindow_overlapAnchor;
        if (v.mo28193s(i3)) {
            mo19391b(v.mo28175a(i3, false));
        }
        setBackgroundDrawable(v.mo28181g(j65.PopupWindow_android_popupBackground));
        v.mo28194w();
    }

    /* renamed from: b */
    public final void mo19391b(boolean z) {
        if (f11282b) {
            this.f11283a = z;
        } else {
            kt4.m21072a(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f11282b && this.f11283a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f11282b && this.f11283a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f11282b && this.f11283a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}

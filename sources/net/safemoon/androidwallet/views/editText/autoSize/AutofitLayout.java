package net.safemoon.androidwallet.views.editText.autoSize;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import java.util.WeakHashMap;

public class AutofitLayout extends FrameLayout {

    /* renamed from: a */
    public boolean f43290a;

    /* renamed from: d */
    public float f43291d;

    /* renamed from: e */
    public float f43292e;

    /* renamed from: g */
    public WeakHashMap<View, C8951a> f43293g = new WeakHashMap<>();

    public AutofitLayout(Context context) {
        super(context);
        mo62184a(context, (AttributeSet) null, 0);
    }

    /* renamed from: a */
    public final void mo62184a(Context context, AttributeSet attributeSet, int i) {
        boolean z = true;
        int i2 = -1;
        float f = -1.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y55.AutofitEditText, i, 0);
            boolean z2 = obtainStyledAttributes.getBoolean(2, true);
            i2 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            f = obtainStyledAttributes.getFloat(1, -1.0f);
            obtainStyledAttributes.recycle();
            z = z2;
        }
        this.f43290a = z;
        this.f43291d = (float) i2;
        this.f43292e = f;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        TextView textView = (TextView) view;
        C8951a n = C8951a.m69599e(textView).mo62192n(this.f43290a);
        float f = this.f43292e;
        if (f > Utils.FLOAT_EPSILON) {
            n.mo62197s(f);
        }
        float f2 = this.f43291d;
        if (f2 > Utils.FLOAT_EPSILON) {
            n.mo62196r(0, f2);
        }
        this.f43293g.put(textView, n);
    }

    public AutofitLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo62184a(context, attributeSet, 0);
    }

    public AutofitLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo62184a(context, attributeSet, i);
    }
}

package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0532a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.utils.Utils;

class RadialViewGroup extends ConstraintLayout {

    /* renamed from: o1 */
    public final Runnable f24637o1;

    /* renamed from: p1 */
    public int f24638p1;

    /* renamed from: q1 */
    public uo3 f24639q1;

    /* renamed from: com.google.android.material.timepicker.RadialViewGroup$a */
    public class C4450a implements Runnable {
        public C4450a() {
        }

        public void run() {
            RadialViewGroup.this.mo34075y();
        }
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: x */
    public static boolean m36282x(View view) {
        return "skip".equals(view.getTag());
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(ga7.m17774k());
        }
        mo34076z();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        mo34075y();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        mo34076z();
    }

    public void setBackgroundColor(int i) {
        this.f24639q1.mo48440a0(ColorStateList.valueOf(i));
    }

    /* renamed from: u */
    public final Drawable mo34073u() {
        uo3 uo3 = new uo3();
        this.f24639q1 = uo3;
        uo3.mo48438Y(new dc5(0.5f));
        this.f24639q1.mo48440a0(ColorStateList.valueOf(-1));
        return this.f24639q1;
    }

    /* renamed from: v */
    public int mo34074v() {
        return this.f24638p1;
    }

    /* renamed from: w */
    public void mo34050w(int i) {
        this.f24638p1 = i;
        mo34075y();
    }

    /* renamed from: y */
    public void mo34075y() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m36282x(getChildAt(i2))) {
                i++;
            }
        }
        C0532a aVar = new C0532a();
        aVar.mo5161p(this);
        float f = Utils.FLOAT_EPSILON;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = g35.circle_center;
            if (id != i4 && !m36282x(childAt)) {
                aVar.mo5164s(childAt.getId(), i4, this.f24638p1, f);
                f += 360.0f / ((float) (childCount - i));
            }
        }
        aVar.mo5155i(this);
    }

    /* renamed from: z */
    public final void mo34076z() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f24637o1);
            handler.post(this.f24637o1);
        }
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(c45.material_radial_view_group, this);
        ga7.m17793t0(this, mo34073u());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u55.RadialViewGroup, i, 0);
        this.f24638p1 = obtainStyledAttributes.getDimensionPixelSize(u55.RadialViewGroup_materialCircleRadius, 0);
        this.f24637o1 = new C4450a();
        obtainStyledAttributes.recycle();
    }
}

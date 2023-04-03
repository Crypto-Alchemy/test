package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    public Map<View, Integer> f24693i;

    public FabTransformationSheetBehavior() {
    }

    /* renamed from: A */
    public FabTransformationBehavior.C4465e mo34103A(Context context, boolean z) {
        int i;
        if (z) {
            i = y05.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = y05.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.C4465e eVar = new FabTransformationBehavior.C4465e();
        eVar.f24686a = vy3.m53611d(context, i);
        eVar.f24687b = new nt4(17, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        return eVar;
    }

    /* renamed from: C */
    public final void mo34134C(View view, boolean z) {
        boolean z2;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f24693i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (!(childAt.getLayoutParams() instanceof CoordinatorLayout.C0546e) || !(((CoordinatorLayout.C0546e) childAt.getLayoutParams()).mo5294f() instanceof FabTransformationScrimBehavior)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f24693i;
                        if (map != null && map.containsKey(childAt)) {
                            ga7.m17714A0(childAt, this.f24693i.get(childAt).intValue());
                        }
                    } else {
                        this.f24693i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        ga7.m17714A0(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f24693i = null;
            }
        }
    }

    /* renamed from: d */
    public boolean mo34099d(View view, View view2, boolean z, boolean z2) {
        mo34134C(view2, z);
        return super.mo34099d(view, view2, z, z2);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

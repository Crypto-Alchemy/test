package p000;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: mz2 */
/* compiled from: ItemTouchUIUtilImpl */
public class mz2 implements lz2 {

    /* renamed from: a */
    public static final lz2 f15293a = new mz2();

    /* renamed from: e */
    public static float m22692e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = Utils.FLOAT_EPSILON;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float w = ga7.m17798w(childAt);
                if (w > f) {
                    f = w;
                }
            }
        }
        return f;
    }

    /* renamed from: a */
    public void mo22987a(View view) {
        int i = c35.item_touch_helper_previous_elevation;
        Object tag = view.getTag(i);
        if (tag instanceof Float) {
            ga7.m17801x0(view, ((Float) tag).floatValue());
        }
        view.setTag(i, (Object) null);
        view.setTranslationX(Utils.FLOAT_EPSILON);
        view.setTranslationY(Utils.FLOAT_EPSILON);
    }

    /* renamed from: b */
    public void mo22988b(View view) {
    }

    /* renamed from: c */
    public void mo22989c(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (z) {
            int i2 = c35.item_touch_helper_previous_elevation;
            if (view.getTag(i2) == null) {
                Float valueOf = Float.valueOf(ga7.m17798w(view));
                ga7.m17801x0(view, m22692e(recyclerView, view) + 1.0f);
                view.setTag(i2, valueOf);
            }
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    /* renamed from: d */
    public void mo22990d(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }
}

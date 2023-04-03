package p000;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: x37 */
/* compiled from: UnitsUtils */
public class x37 {
    /* renamed from: a */
    public static float m29870a(Context context, float f) {
        return m29871b(context, 1, f);
    }

    /* renamed from: b */
    public static float m29871b(Context context, int i, float f) {
        return TypedValue.applyDimension(i, f, context.getResources().getDisplayMetrics());
    }
}

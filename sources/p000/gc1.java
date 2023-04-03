package p000;

import android.content.res.Resources;
import android.util.TypedValue;

/* renamed from: gc1 */
/* compiled from: DensityUtils */
public class gc1 {
    /* renamed from: a */
    public static int m44677a(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, Resources.getSystem().getDisplayMetrics());
    }
}

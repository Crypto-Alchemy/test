package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: xo3 */
/* compiled from: MaterialThemeOverlay */
public class xo3 {

    /* renamed from: a */
    public static final int[] f35663a = {16842752, j15.theme};

    /* renamed from: b */
    public static final int[] f35664b = {j15.materialThemeOverlay};

    /* renamed from: a */
    public static int m54459a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f35663a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return resourceId;
        }
        return resourceId2;
    }

    /* renamed from: b */
    public static int m54460b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f35664b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m54461c(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z;
        int b = m54460b(context, attributeSet, i, i2);
        if (!(context instanceof hs0) || ((hs0) context).mo21372c() != b) {
            z = false;
        } else {
            z = true;
        }
        if (b == 0 || z) {
            return context;
        }
        hs0 hs0 = new hs0(context, b);
        int a = m54459a(context, attributeSet);
        if (a != 0) {
            hs0.getTheme().applyStyle(a, true);
        }
        return hs0;
    }
}

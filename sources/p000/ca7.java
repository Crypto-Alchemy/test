package p000;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: ca7 */
/* compiled from: ViewBindings */
public class ca7 {
    /* renamed from: a */
    public static <T extends View> T m11819a(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            T findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }
}

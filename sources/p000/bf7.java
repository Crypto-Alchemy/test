package p000;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: bf7 */
/* compiled from: ViewUtilsApi23 */
public class bf7 extends ze7 {

    /* renamed from: h */
    public static boolean f8131h = true;

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo11638g(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo11638g(view, i);
        } else if (f8131h) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f8131h = false;
            }
        }
    }
}

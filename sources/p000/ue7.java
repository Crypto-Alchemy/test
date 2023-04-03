package p000;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: ue7 */
/* compiled from: ViewUtilsApi19 */
public class ue7 extends df7 {

    /* renamed from: c */
    public static boolean f18467c = true;

    /* renamed from: a */
    public void mo18759a(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public float mo12053b(View view) {
        if (f18467c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f18467c = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: c */
    public void mo18760c(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo12056f(View view, float f) {
        if (f18467c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f18467c = false;
            }
        }
        view.setAlpha(f);
    }
}

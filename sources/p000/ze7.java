package p000;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: ze7 */
/* compiled from: ViewUtilsApi22 */
public class ze7 extends xe7 {

    /* renamed from: g */
    public static boolean f20530g = true;

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo12055e(View view, int i, int i2, int i3, int i4) {
        if (f20530g) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f20530g = false;
            }
        }
    }
}

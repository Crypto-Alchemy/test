package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: gg2 */
/* compiled from: GhostViewUtils */
public class gg2 {
    /* renamed from: a */
    public static cg2 m18063a(View view, ViewGroup viewGroup, Matrix matrix) {
        if (Build.VERSION.SDK_INT == 28) {
            return eg2.m16088b(view, viewGroup, matrix);
        }
        return fg2.m16982b(view, viewGroup, matrix);
    }

    /* renamed from: b */
    public static void m18064b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            eg2.m16092f(view);
        } else {
            fg2.m16986f(view);
        }
    }
}

package p000;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: cf7 */
/* compiled from: ViewUtilsApi29 */
public class cf7 extends bf7 {
    /* renamed from: b */
    public float mo12053b(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: d */
    public void mo12054d(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* renamed from: e */
    public void mo12055e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: f */
    public void mo12056f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: g */
    public void mo11638g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: h */
    public void mo12057h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: i */
    public void mo12058i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}

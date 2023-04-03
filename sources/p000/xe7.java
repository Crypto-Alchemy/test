package p000;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: xe7 */
/* compiled from: ViewUtilsApi21 */
public class xe7 extends ue7 {

    /* renamed from: d */
    public static boolean f19824d = true;

    /* renamed from: e */
    public static boolean f19825e = true;

    /* renamed from: f */
    public static boolean f19826f = true;

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo12054d(View view, Matrix matrix) {
        if (f19824d) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f19824d = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo12057h(View view, Matrix matrix) {
        if (f19825e) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f19825e = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo12058i(View view, Matrix matrix) {
        if (f19826f) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f19826f = false;
            }
        }
    }
}

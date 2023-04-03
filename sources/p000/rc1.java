package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: rc1 */
/* compiled from: DescendantOffsetUtils */
public class rc1 {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f33397a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f33398b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m51059a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m51061c(viewGroup, view, rect);
    }

    /* renamed from: b */
    public static void m51060b(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m51060b(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: c */
    public static void m51061c(ViewGroup viewGroup, View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = f33397a;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m51060b(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = f33398b;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}

package p000;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p004ui.platform.AndroidComposeView_androidKt;
import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\bJ!\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001d\u0010\u0017\u001a\u00020\u00048\u0002X\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0016\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001a"}, mo44877d2 = {"Ln80;", "Lm80;", "Landroid/view/View;", "view", "Lfp3;", "matrix", "Lr37;", "a", "(Landroid/view/View;[F)V", "d", "Landroid/graphics/Matrix;", "other", "b", "([FLandroid/graphics/Matrix;)V", "", "x", "y", "c", "([FFF)V", "", "[I", "tmpLocation", "[F", "tmpMatrix", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: n80 */
/* compiled from: AndroidComposeView.android.kt */
public final class n80 implements m80 {

    /* renamed from: a */
    public final int[] f15371a = new int[2];

    /* renamed from: b */
    public final float[] f15372b = fp3.m17170b((float[]) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: a */
    public void mo23071a(View view, float[] fArr) {
        vx2.m53591g(view, "view");
        vx2.m53591g(fArr, "matrix");
        fp3.m17173e(fArr);
        mo23536d(view, fArr);
    }

    /* renamed from: b */
    public final void mo23534b(float[] fArr, Matrix matrix) {
        C3601xi.m30111b(this.f15372b, matrix);
        AndroidComposeView_androidKt.m3041g(fArr, this.f15372b);
    }

    /* renamed from: c */
    public final void mo23535c(float[] fArr, float f, float f2) {
        fp3.m17173e(this.f15372b);
        fp3.m17175g(this.f15372b, f, f2, Utils.FLOAT_EPSILON, 4, (Object) null);
        AndroidComposeView_androidKt.m3041g(fArr, this.f15372b);
    }

    /* renamed from: d */
    public final void mo23536d(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            mo23536d((View) parent, fArr);
            mo23535c(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            mo23535c(fArr, (float) view.getLeft(), (float) view.getTop());
        } else {
            int[] iArr = this.f15371a;
            view.getLocationInWindow(iArr);
            mo23535c(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            mo23535c(fArr, (float) iArr[0], (float) iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            vx2.m53590f(matrix, "viewMatrix");
            mo23534b(fArr, matrix);
        }
    }
}

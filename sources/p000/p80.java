package p000;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, mo44877d2 = {"Lp80;", "Lm80;", "Landroid/view/View;", "view", "Lfp3;", "matrix", "Lr37;", "a", "(Landroid/view/View;[F)V", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "tmpMatrix", "", "b", "[I", "tmpPosition", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: p80 */
/* compiled from: AndroidComposeView.android.kt */
public final class p80 implements m80 {

    /* renamed from: a */
    public final Matrix f16346a = new Matrix();

    /* renamed from: b */
    public final int[] f16347b = new int[2];

    /* renamed from: a */
    public void mo23071a(View view, float[] fArr) {
        vx2.m53591g(view, "view");
        vx2.m53591g(fArr, "matrix");
        this.f16346a.reset();
        view.transformMatrixToGlobal(this.f16346a);
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof View) {
            view = (View) viewParent;
            viewParent = view.getParent();
        }
        view.getLocationOnScreen(this.f16347b);
        int[] iArr = this.f16347b;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f16347b;
        this.f16346a.postTranslate((float) (iArr2[0] - i), (float) (iArr2[1] - i2));
        C3601xi.m30111b(fArr, this.f16346a);
    }
}

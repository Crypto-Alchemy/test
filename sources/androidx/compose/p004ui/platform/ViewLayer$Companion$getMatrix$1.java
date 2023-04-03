package androidx.compose.p004ui.platform;

import android.graphics.Matrix;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"Landroid/view/View;", "view", "Landroid/graphics/Matrix;", "matrix", "Lr37;", "invoke", "(Landroid/view/View;Landroid/graphics/Matrix;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1 */
/* compiled from: ViewLayer.android.kt */
public final class ViewLayer$Companion$getMatrix$1 extends Lambda implements fd2<View, Matrix, r37> {
    public static final ViewLayer$Companion$getMatrix$1 INSTANCE = new ViewLayer$Companion$getMatrix$1();

    public ViewLayer$Companion$getMatrix$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((View) obj, (Matrix) obj2);
        return r37.f33317a;
    }

    public final void invoke(View view, Matrix matrix) {
        vx2.m53591g(view, "view");
        vx2.m53591g(matrix, "matrix");
        matrix.set(view.getMatrix());
    }
}

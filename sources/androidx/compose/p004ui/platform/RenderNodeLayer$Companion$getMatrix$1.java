package androidx.compose.p004ui.platform;

import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"Lme1;", "rn", "Landroid/graphics/Matrix;", "matrix", "Lr37;", "invoke", "(Lme1;Landroid/graphics/Matrix;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1 */
/* compiled from: RenderNodeLayer.android.kt */
public final class RenderNodeLayer$Companion$getMatrix$1 extends Lambda implements fd2<me1, Matrix, r37> {
    public static final RenderNodeLayer$Companion$getMatrix$1 INSTANCE = new RenderNodeLayer$Companion$getMatrix$1();

    public RenderNodeLayer$Companion$getMatrix$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((me1) obj, (Matrix) obj2);
        return r37.f33317a;
    }

    public final void invoke(me1 me1, Matrix matrix) {
        vx2.m53591g(me1, "rn");
        vx2.m53591g(matrix, "matrix");
        me1.mo18725v(matrix);
    }
}

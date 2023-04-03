package androidx.compose.p004ui.layout;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.vo4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lvo4$a;", "Lr37;", "invoke", "(Lvo4$a;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.layout.RootMeasurePolicy$measure$2 */
/* compiled from: RootMeasurePolicy.kt */
public final class RootMeasurePolicy$measure$2 extends Lambda implements rc2<vo4.C3501a, r37> {
    public final /* synthetic */ vo4 $placeable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RootMeasurePolicy$measure$2(vo4 vo4) {
        super(1);
        this.$placeable = vo4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((vo4.C3501a) obj);
        return r37.f33317a;
    }

    public final void invoke(vo4.C3501a aVar) {
        vx2.m53591g(aVar, "$this$layout");
        vo4.C3501a.m29014t(aVar, this.$placeable, 0, 0, Utils.FLOAT_EPSILON, (rc2) null, 12, (Object) null);
    }
}

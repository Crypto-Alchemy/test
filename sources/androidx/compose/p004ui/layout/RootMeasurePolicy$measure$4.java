package androidx.compose.p004ui.layout;

import com.github.mikephil.charting.utils.Utils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.vo4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lvo4$a;", "Lr37;", "invoke", "(Lvo4$a;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.layout.RootMeasurePolicy$measure$4 */
/* compiled from: RootMeasurePolicy.kt */
public final class RootMeasurePolicy$measure$4 extends Lambda implements rc2<vo4.C3501a, r37> {
    public final /* synthetic */ List<vo4> $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RootMeasurePolicy$measure$4(List<? extends vo4> list) {
        super(1);
        this.$placeables = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((vo4.C3501a) obj);
        return r37.f33317a;
    }

    public final void invoke(vo4.C3501a aVar) {
        vx2.m53591g(aVar, "$this$layout");
        List<vo4> list = this.$placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            vo4.C3501a.m29014t(aVar, list.get(i), 0, 0, Utils.FLOAT_EPSILON, (rc2) null, 12, (Object) null);
        }
    }
}

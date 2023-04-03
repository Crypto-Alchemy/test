package androidx.compose.p004ui.node;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Ldf;", "childOwner", "Lr37;", "invoke", "(Ldf;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.AlignmentLines$recalculate$1 */
/* compiled from: LayoutNodeAlignmentLines.kt */
public final class AlignmentLines$recalculate$1 extends Lambda implements rc2<C2164df, r37> {
    public final /* synthetic */ AlignmentLines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlignmentLines$recalculate$1(AlignmentLines alignmentLines) {
        super(1);
        this.this$0 = alignmentLines;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C2164df) obj);
        return r37.f33317a;
    }

    public final void invoke(C2164df dfVar) {
        vx2.m53591g(dfVar, "childOwner");
        if (dfVar.mo3527a()) {
            if (dfVar.mo3529b().mo3334g()) {
                dfVar.mo3540l();
            }
            Map b = dfVar.mo3529b().f1724i;
            AlignmentLines alignmentLines = this.this$0;
            for (Map.Entry entry : b.entrySet()) {
                alignmentLines.mo3330c((C1677cf) entry.getKey(), ((Number) entry.getValue()).intValue(), dfVar.mo3543s());
            }
            NodeCoordinator R0 = dfVar.mo3543s().mo3587R0();
            vx2.m53588d(R0);
            while (!vx2.m53586b(R0, this.this$0.mo3333f().mo3543s())) {
                Set<C1677cf> keySet = this.this$0.mo3332e(R0).keySet();
                AlignmentLines alignmentLines2 = this.this$0;
                for (C1677cf cfVar : keySet) {
                    alignmentLines2.mo3330c(cfVar, alignmentLines2.mo3336i(R0, cfVar), R0);
                }
                R0 = R0.mo3587R0();
                vx2.m53588d(R0);
            }
        }
    }
}

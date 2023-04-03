package p000;

import androidx.compose.p004ui.node.AlignmentLines;
import androidx.compose.p004ui.node.NodeCoordinator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J!\u0010\t\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000b*\u00020\u00028TX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, mo44877d2 = {"Lml3;", "Landroidx/compose/ui/node/AlignmentLines;", "Landroidx/compose/ui/node/NodeCoordinator;", "Lcf;", "alignmentLine", "", "i", "Ltf4;", "position", "d", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "", "e", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "Ldf;", "alignmentLinesOwner", "<init>", "(Ldf;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ml3 */
/* compiled from: LayoutNodeAlignmentLines.kt */
public final class ml3 extends AlignmentLines {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ml3(C2164df dfVar) {
        super(dfVar, (DefaultConstructorMarker) null);
        vx2.m53591g(dfVar, "alignmentLinesOwner");
    }

    /* renamed from: d */
    public long mo3331d(NodeCoordinator nodeCoordinator, long j) {
        vx2.m53591g(nodeCoordinator, "$this$calculatePositionInParent");
        ol3 K0 = nodeCoordinator.mo3580K0();
        vx2.m53588d(K0);
        long a0 = K0.mo3602a0();
        return tf4.m27739p(wf4.m29550a((float) nw2.m23481f(a0), (float) nw2.m23482g(a0)), j);
    }

    /* renamed from: e */
    public Map<C1677cf, Integer> mo3332e(NodeCoordinator nodeCoordinator) {
        vx2.m53591g(nodeCoordinator, "<this>");
        ol3 K0 = nodeCoordinator.mo3580K0();
        vx2.m53588d(K0);
        return K0.mo3598Y().mo23300b();
    }

    /* renamed from: i */
    public int mo3336i(NodeCoordinator nodeCoordinator, C1677cf cfVar) {
        vx2.m53591g(nodeCoordinator, "<this>");
        vx2.m53591g(cfVar, "alignmentLine");
        ol3 K0 = nodeCoordinator.mo3580K0();
        vx2.m53588d(K0);
        return K0.mo23723T(cfVar);
    }
}

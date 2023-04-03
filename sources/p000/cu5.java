package p000;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.semantics.SemanticsNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0007¨\u0006\u000b"}, mo44877d2 = {"Lcu5;", "", "Landroidx/compose/ui/node/LayoutNode;", "a", "Landroidx/compose/ui/node/LayoutNode;", "rootNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "()Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedRootSemanticsNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: cu5 */
/* compiled from: SemanticsOwner.kt */
public final class cu5 {

    /* renamed from: a */
    public final LayoutNode f10296a;

    public cu5(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "rootNode");
        this.f10296a = layoutNode;
    }

    /* renamed from: a */
    public final SemanticsNode mo18291a() {
        yt5 j = au5.m10806j(this.f10296a);
        vx2.m53588d(j);
        return new SemanticsNode(j, false, (LayoutNode) null, 4, (DefaultConstructorMarker) null);
    }
}

package p000;

import androidx.compose.p004ui.node.DepthSortedSet;
import androidx.compose.p004ui.node.LayoutNode;
import java.util.List;
import kotlin.Metadata;
import p000.jq3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\b\u001a\u00020\u0006*\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Ldf3;", "", "Lr37;", "a", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "c", "b", "", "f", "d", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/DepthSortedSet;", "Landroidx/compose/ui/node/DepthSortedSet;", "relayoutNodes", "", "Ljq3$a;", "Ljava/util/List;", "postponedMeasureRequests", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSet;Ljava/util/List;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: df3 */
/* compiled from: LayoutTreeConsistencyChecker.kt */
public final class df3 {

    /* renamed from: a */
    public final LayoutNode f10691a;

    /* renamed from: b */
    public final DepthSortedSet f10692b;

    /* renamed from: c */
    public final List<jq3.C2630a> f10693c;

    public df3(LayoutNode layoutNode, DepthSortedSet depthSortedSet, List<jq3.C2630a> list) {
        vx2.m53591g(layoutNode, "root");
        vx2.m53591g(depthSortedSet, "relayoutNodes");
        vx2.m53591g(list, "postponedMeasureRequests");
        this.f10691a = layoutNode;
        this.f10692b = depthSortedSet;
        this.f10693c = list;
    }

    /* renamed from: e */
    public static final void m15083e(df3 df3, StringBuilder sb, LayoutNode layoutNode, int i) {
        boolean z;
        String f = df3.mo18752f(layoutNode);
        if (f.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("..");
            }
            sb.append(f);
            vx2.m53590f(sb, "append(value)");
            sb.append(10);
            vx2.m53590f(sb, "append('\\n')");
            i++;
        }
        List<LayoutNode> w = layoutNode.mo3479w();
        int size = w.size();
        for (int i3 = 0; i3 < size; i3++) {
            m15083e(df3, sb, w.get(i3), i);
        }
    }

    /* renamed from: a */
    public final void mo18748a() {
        if (!mo18750c(this.f10691a)) {
            System.out.println(mo18751d());
            throw new IllegalStateException("Inconsistency found!");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r3 != false) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18749b(androidx.compose.p004ui.node.LayoutNode r12) {
        /*
            r11 = this;
            androidx.compose.ui.node.LayoutNode r0 = r12.mo3430V()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            androidx.compose.ui.node.LayoutNode$LayoutState r2 = r0.mo3402F()
            goto L_0x000d
        L_0x000c:
            r2 = r1
        L_0x000d:
            boolean r3 = r12.mo3440a()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x002b
            int r3 = r12.mo3432W()
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r6) goto L_0x00a5
            if (r0 == 0) goto L_0x0028
            boolean r3 = r0.mo3440a()
            if (r3 != r5) goto L_0x0028
            r3 = r5
            goto L_0x0029
        L_0x0028:
            r3 = r4
        L_0x0029:
            if (r3 == 0) goto L_0x00a5
        L_0x002b:
            boolean r3 = r12.mo3414M()
            if (r3 == 0) goto L_0x005e
            java.util.List<jq3$a> r3 = r11.f10693c
            int r6 = r3.size()
            r7 = r4
        L_0x0038:
            if (r7 >= r6) goto L_0x005a
            java.lang.Object r8 = r3.get(r7)
            r9 = r8
            jq3$a r9 = (p000.jq3.C2630a) r9
            androidx.compose.ui.node.LayoutNode r10 = r9.mo22070a()
            boolean r10 = p000.vx2.m53586b(r10, r12)
            if (r10 == 0) goto L_0x0053
            boolean r9 = r9.mo22072c()
            if (r9 != 0) goto L_0x0053
            r9 = r5
            goto L_0x0054
        L_0x0053:
            r9 = r4
        L_0x0054:
            if (r9 == 0) goto L_0x0057
            goto L_0x005b
        L_0x0057:
            int r7 = r7 + 1
            goto L_0x0038
        L_0x005a:
            r8 = r1
        L_0x005b:
            if (r8 == 0) goto L_0x005e
            return r5
        L_0x005e:
            boolean r3 = r12.mo3414M()
            if (r3 == 0) goto L_0x007f
            androidx.compose.ui.node.DepthSortedSet r1 = r11.f10692b
            boolean r12 = r1.mo3385b(r12)
            if (r12 != 0) goto L_0x007d
            if (r0 == 0) goto L_0x0076
            boolean r12 = r0.mo3414M()
            if (r12 != r5) goto L_0x0076
            r12 = r5
            goto L_0x0077
        L_0x0076:
            r12 = r4
        L_0x0077:
            if (r12 != 0) goto L_0x007d
            androidx.compose.ui.node.LayoutNode$LayoutState r12 = androidx.compose.p004ui.node.LayoutNode.LayoutState.Measuring
            if (r2 != r12) goto L_0x007e
        L_0x007d:
            r4 = r5
        L_0x007e:
            return r4
        L_0x007f:
            boolean r3 = r12.mo3401E()
            if (r3 == 0) goto L_0x00a5
            androidx.compose.ui.node.DepthSortedSet r1 = r11.f10692b
            boolean r12 = r1.mo3385b(r12)
            if (r12 != 0) goto L_0x00a3
            if (r0 == 0) goto L_0x00a3
            boolean r12 = r0.mo3414M()
            if (r12 != 0) goto L_0x00a3
            boolean r12 = r0.mo3401E()
            if (r12 != 0) goto L_0x00a3
            androidx.compose.ui.node.LayoutNode$LayoutState r12 = androidx.compose.p004ui.node.LayoutNode.LayoutState.Measuring
            if (r2 == r12) goto L_0x00a3
            androidx.compose.ui.node.LayoutNode$LayoutState r12 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LayingOut
            if (r2 != r12) goto L_0x00a4
        L_0x00a3:
            r4 = r5
        L_0x00a4:
            return r4
        L_0x00a5:
            java.lang.Boolean r3 = r12.mo3461m0()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r3 = p000.vx2.m53586b(r3, r6)
            if (r3 == 0) goto L_0x0160
            boolean r3 = r12.mo3406H()
            if (r3 == 0) goto L_0x00e4
            java.util.List<jq3$a> r3 = r11.f10693c
            int r6 = r3.size()
            r7 = r4
        L_0x00be:
            if (r7 >= r6) goto L_0x00e1
            java.lang.Object r8 = r3.get(r7)
            r9 = r8
            jq3$a r9 = (p000.jq3.C2630a) r9
            androidx.compose.ui.node.LayoutNode r10 = r9.mo22070a()
            boolean r10 = p000.vx2.m53586b(r10, r12)
            if (r10 == 0) goto L_0x00d9
            boolean r9 = r9.mo22072c()
            if (r9 == 0) goto L_0x00d9
            r9 = r5
            goto L_0x00da
        L_0x00d9:
            r9 = r4
        L_0x00da:
            if (r9 == 0) goto L_0x00de
            r1 = r8
            goto L_0x00e1
        L_0x00de:
            int r7 = r7 + 1
            goto L_0x00be
        L_0x00e1:
            if (r1 == 0) goto L_0x00e4
            return r5
        L_0x00e4:
            boolean r1 = r12.mo3406H()
            if (r1 == 0) goto L_0x0123
            androidx.compose.ui.node.DepthSortedSet r1 = r11.f10692b
            boolean r1 = r1.mo3385b(r12)
            if (r1 != 0) goto L_0x0121
            if (r0 == 0) goto L_0x00fc
            boolean r1 = r0.mo3406H()
            if (r1 != r5) goto L_0x00fc
            r1 = r5
            goto L_0x00fd
        L_0x00fc:
            r1 = r4
        L_0x00fd:
            if (r1 != 0) goto L_0x0121
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LookaheadMeasuring
            if (r2 == r1) goto L_0x0121
            if (r0 == 0) goto L_0x010d
            boolean r0 = r0.mo3414M()
            if (r0 != r5) goto L_0x010d
            r0 = r5
            goto L_0x010e
        L_0x010d:
            r0 = r4
        L_0x010e:
            if (r0 == 0) goto L_0x0122
            sl3 r0 = r12.mo3411K()
            p000.vx2.m53588d(r0)
            androidx.compose.ui.node.LayoutNode r0 = r0.mo25853a()
            boolean r12 = p000.vx2.m53586b(r0, r12)
            if (r12 == 0) goto L_0x0122
        L_0x0121:
            r4 = r5
        L_0x0122:
            return r4
        L_0x0123:
            boolean r1 = r12.mo3404G()
            if (r1 == 0) goto L_0x0160
            androidx.compose.ui.node.DepthSortedSet r1 = r11.f10692b
            boolean r1 = r1.mo3385b(r12)
            if (r1 != 0) goto L_0x015e
            if (r0 == 0) goto L_0x015e
            boolean r1 = r0.mo3406H()
            if (r1 != 0) goto L_0x015e
            boolean r1 = r0.mo3404G()
            if (r1 != 0) goto L_0x015e
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LookaheadMeasuring
            if (r2 == r1) goto L_0x015e
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LookaheadLayingOut
            if (r2 == r1) goto L_0x015e
            boolean r0 = r0.mo3401E()
            if (r0 == 0) goto L_0x015f
            sl3 r0 = r12.mo3411K()
            p000.vx2.m53588d(r0)
            androidx.compose.ui.node.LayoutNode r0 = r0.mo25853a()
            boolean r12 = p000.vx2.m53586b(r0, r12)
            if (r12 == 0) goto L_0x015f
        L_0x015e:
            r4 = r5
        L_0x015f:
            return r4
        L_0x0160:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.df3.mo18749b(androidx.compose.ui.node.LayoutNode):boolean");
    }

    /* renamed from: c */
    public final boolean mo18750c(LayoutNode layoutNode) {
        if (!mo18749b(layoutNode)) {
            return false;
        }
        List<LayoutNode> w = layoutNode.mo3479w();
        int size = w.size();
        for (int i = 0; i < size; i++) {
            if (!mo18750c(w.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final String mo18751d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        vx2.m53590f(sb, "append(value)");
        sb.append(10);
        vx2.m53590f(sb, "append('\\n')");
        m15083e(this, sb, this.f10691a, 0);
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "stringBuilder.toString()");
        return sb2;
    }

    /* renamed from: f */
    public final String mo18752f(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder();
        sb.append(layoutNode);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(layoutNode.mo3402F());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!layoutNode.mo3440a()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + layoutNode.mo3417O() + ']');
        if (!mo18749b(layoutNode)) {
            sb.append("[INCONSISTENT]");
        }
        String sb3 = sb.toString();
        vx2.m53590f(sb3, "with(StringBuilder()) {\n…     toString()\n        }");
        return sb3;
    }
}

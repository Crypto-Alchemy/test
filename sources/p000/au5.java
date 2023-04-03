package p000;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p004ui.semantics.SemanticsNode;
import androidx.compose.p004ui.semantics.SemanticsProperties;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2Connection;
import p000.sw3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\"\u0010\t\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002\u001a\f\u0010\r\u001a\u00020\u000b*\u00020\nH\u0002\" \u0010\u0012\u001a\u0004\u0018\u00010\u0002*\u00020\u00008@X\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\" \u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00020\u00008@X\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000f\"\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u00020\n8BX\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo44877d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", "Lyt5;", "list", "", "g", "Lkotlin/Function1;", "", "selector", "f", "Landroidx/compose/ui/semantics/SemanticsNode;", "", "e", "l", "j", "(Landroidx/compose/ui/node/LayoutNode;)Lyt5;", "getOuterSemantics$annotations", "(Landroidx/compose/ui/node/LayoutNode;)V", "outerSemantics", "i", "getOuterMergingSemantics$annotations", "outerMergingSemantics", "Lhh5;", "k", "(Landroidx/compose/ui/semantics/SemanticsNode;)Lhh5;", "role", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: au5 */
/* compiled from: SemanticsNode.kt */
public final class au5 {
    /* renamed from: e */
    public static final int m10801e(SemanticsNode semanticsNode) {
        return semanticsNode.mo4003i() + 2000000000;
    }

    /* renamed from: f */
    public static final LayoutNode m10802f(LayoutNode layoutNode, rc2<? super LayoutNode, Boolean> rc2) {
        for (LayoutNode V = layoutNode.mo3430V(); V != null; V = V.mo3430V()) {
            if (rc2.invoke(V).booleanValue()) {
                return V;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final List<yt5> m10803g(LayoutNode layoutNode, List<yt5> list) {
        v04<LayoutNode> a0 = layoutNode.mo3441a0();
        int n = a0.mo26963n();
        if (n > 0) {
            int i = 0;
            Object[] m = a0.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode2 = (LayoutNode) m[i];
                yt5 j = m10806j(layoutNode2);
                if (j != null) {
                    list.add(j);
                } else {
                    m10803g(layoutNode2, list);
                }
                i++;
            } while (i < n);
        }
        return list;
    }

    /* renamed from: h */
    public static /* synthetic */ List m10804h(LayoutNode layoutNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return m10803g(layoutNode, list);
    }

    /* renamed from: i */
    public static final yt5 m10805i(LayoutNode layoutNode) {
        sw3.C3310c cVar;
        vx2.m53591g(layoutNode, "<this>");
        z74 S = layoutNode.mo3424S();
        int j = g84.f12195a.mo20434j();
        if ((S.mo28347j() & j) != 0) {
            cVar = S.mo28349l();
            while (true) {
                if (cVar != null) {
                    if ((cVar.mo25988w() & j) == 0 || !(cVar instanceof yt5) || !((yt5) cVar).mo3368h().mo27326u()) {
                        if ((cVar.mo25985t() & j) == 0) {
                            break;
                        }
                        cVar = cVar.mo25986u();
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        cVar = null;
        return (yt5) cVar;
    }

    /* renamed from: j */
    public static final yt5 m10806j(LayoutNode layoutNode) {
        sw3.C3310c cVar;
        vx2.m53591g(layoutNode, "<this>");
        z74 S = layoutNode.mo3424S();
        int j = g84.f12195a.mo20434j();
        if ((S.mo28347j() & j) != 0) {
            cVar = S.mo28349l();
            while (true) {
                if (cVar != null) {
                    if ((cVar.mo25988w() & j) == 0 || !(cVar instanceof yt5)) {
                        if ((cVar.mo25985t() & j) == 0) {
                            break;
                        }
                        cVar = cVar.mo25986u();
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        cVar = null;
        return (yt5) cVar;
    }

    /* renamed from: k */
    public static final hh5 m10807k(SemanticsNode semanticsNode) {
        return (hh5) SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), SemanticsProperties.f2125a.mo4037p());
    }

    /* renamed from: l */
    public static final int m10808l(SemanticsNode semanticsNode) {
        return semanticsNode.mo4003i() + Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
    }
}

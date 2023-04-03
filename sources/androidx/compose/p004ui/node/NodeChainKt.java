package androidx.compose.p004ui.node;

import androidx.compose.p004ui.CombinedModifier;
import kotlin.Metadata;
import p000.sw3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u000e\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a$\u0010\t\u001a\u00020\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002\u001a \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0002\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, mo44877d2 = {"Lsw3$b;", "prev", "next", "", "e", "Lsw3$c;", "T", "Lcx3;", "node", "f", "Lsw3;", "Lv04;", "result", "d", "androidx/compose/ui/node/NodeChainKt$a", "a", "Landroidx/compose/ui/node/NodeChainKt$a;", "SentinelHead", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.NodeChainKt */
/* compiled from: NodeChain.kt */
public final class NodeChainKt {

    /* renamed from: a */
    public static final C0389a f1827a = new C0389a();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, mo44877d2 = {"androidx/compose/ui/node/NodeChainKt$a", "Lsw3$c;", "", "toString", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.node.NodeChainKt$a */
    /* compiled from: NodeChain.kt */
    public static final class C0389a extends sw3.C3310c {
        public String toString() {
            return "<Head>";
        }
    }

    /* renamed from: d */
    public static final v04<sw3.C3309b> m2742d(sw3 sw3, v04<sw3.C3309b> v04) {
        v04 v042 = new v04(new sw3[v04.mo26963n()], 0);
        v042.mo26953c(sw3);
        while (v042.mo26966r()) {
            sw3 sw32 = (sw3) v042.mo26971x(v042.mo26963n() - 1);
            if (sw32 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) sw32;
                v042.mo26953c(combinedModifier.mo3196q());
                v042.mo26953c(combinedModifier.mo3197r());
            } else if (sw32 instanceof sw3.C3309b) {
                v04.mo26953c(sw32);
            } else {
                sw32.mo3194l(new NodeChainKt$fillVector$1(v04));
            }
        }
        return v04;
    }

    /* renamed from: e */
    public static final int m2743e(sw3.C3309b bVar, sw3.C3309b bVar2) {
        vx2.m53591g(bVar, "prev");
        vx2.m53591g(bVar2, "next");
        if (vx2.m53586b(bVar, bVar2)) {
            return 2;
        }
        if (C2375gb.m17963a(bVar, bVar2)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: f */
    public static final <T extends sw3.C3310c> sw3.C3310c m2744f(cx3<T> cx3, sw3.C3310c cVar) {
        vx2.m53589e(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        return cx3.mo18368r(cVar);
    }
}

package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, mo44877d2 = {"Landroidx/compose/ui/layout/RootMeasurePolicy;", "Landroidx/compose/ui/node/LayoutNode$d;", "Loq3;", "", "Liq3;", "measurables", "Lmq0;", "constraints", "Lmq3;", "a", "(Loq3;Ljava/util/List;J)Lmq3;", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.layout.RootMeasurePolicy */
/* compiled from: RootMeasurePolicy.kt */
public final class RootMeasurePolicy extends LayoutNode.C0379d {

    /* renamed from: b */
    public static final RootMeasurePolicy f1710b = new RootMeasurePolicy();

    public RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    /* renamed from: a */
    public mq3 mo3320a(oq3 oq3, List<? extends iq3> list, long j) {
        vx2.m53591g(oq3, "$this$measure");
        vx2.m53591g(list, "measurables");
        if (list.isEmpty()) {
            return nq3.m23395b(oq3, mq0.m22479j(j), mq0.m22478i(j), (Map) null, RootMeasurePolicy$measure$1.INSTANCE, 4, (Object) null);
        }
        if (list.size() == 1) {
            vo4 t = ((iq3) list.get(0)).mo3544t(j);
            return nq3.m23395b(oq3, pq0.m25133d(j, t.mo27277N()), pq0.m25132c(j, t.mo27273I()), (Map) null, new RootMeasurePolicy$measure$2(t), 4, (Object) null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((iq3) list.get(i)).mo3544t(j));
        }
        int size2 = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            vo4 vo4 = (vo4) arrayList.get(i4);
            i2 = Math.max(vo4.mo27277N(), i2);
            i3 = Math.max(vo4.mo27273I(), i3);
        }
        return nq3.m23395b(oq3, pq0.m25133d(j, i2), pq0.m25132c(j, i3), (Map) null, new RootMeasurePolicy$measure$4(arrayList), 4, (Object) null);
    }
}

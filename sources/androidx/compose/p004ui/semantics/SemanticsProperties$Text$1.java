package androidx.compose.p004ui.semantics;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lrl;", "parentValue", "childValue", "invoke", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.semantics.SemanticsProperties$Text$1 */
/* compiled from: SemanticsProperties.kt */
public final class SemanticsProperties$Text$1 extends Lambda implements fd2<List<? extends C3205rl>, List<? extends C3205rl>, List<? extends C3205rl>> {
    public static final SemanticsProperties$Text$1 INSTANCE = new SemanticsProperties$Text$1();

    public SemanticsProperties$Text$1() {
        super(2);
    }

    public final List<C3205rl> invoke(List<C3205rl> list, List<C3205rl> list2) {
        List<C3205rl> M0;
        vx2.m53591g(list2, "childValue");
        if (list == null || (M0 = CollectionsKt___CollectionsKt.m47313M0(list)) == null) {
            return list2;
        }
        M0.addAll(list2);
        return M0;
    }
}

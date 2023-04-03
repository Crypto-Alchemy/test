package androidx.compose.p004ui.semantics;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo44877d2 = {"<anonymous>", "", "", "parentValue", "childValue", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1 */
/* compiled from: SemanticsProperties.kt */
public final class SemanticsProperties$ContentDescription$1 extends Lambda implements fd2<List<? extends String>, List<? extends String>, List<? extends String>> {
    public static final SemanticsProperties$ContentDescription$1 INSTANCE = new SemanticsProperties$ContentDescription$1();

    public SemanticsProperties$ContentDescription$1() {
        super(2);
    }

    public final List<String> invoke(List<String> list, List<String> list2) {
        List<String> M0;
        vx2.m53591g(list2, "childValue");
        if (list == null || (M0 = CollectionsKt___CollectionsKt.m47313M0(list)) == null) {
            return list2;
        }
        M0.addAll(list2);
        return M0;
    }
}

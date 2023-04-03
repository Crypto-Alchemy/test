package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* compiled from: Annotations.kt */
public final class CompositeAnnotations implements C6983dm {

    /* renamed from: a */
    public final List<C6983dm> f39270a;

    public CompositeAnnotations(List<? extends C6983dm> list) {
        vx2.m53591g(list, "delegates");
        this.f39270a = list;
    }

    /* renamed from: C0 */
    public boolean mo51224C0(u82 u82) {
        vx2.m53591g(u82, "fqName");
        for (T C0 : CollectionsKt___CollectionsKt.m47318Q(this.f39270a)) {
            if (C0.mo51224C0(u82)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        List<C6983dm> list = this.f39270a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (C6983dm isEmpty : list) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public Iterator<C9460vl> iterator() {
        return SequencesKt___SequencesKt.m63029s(CollectionsKt___CollectionsKt.m47318Q(this.f39270a), CompositeAnnotations$iterator$1.INSTANCE).iterator();
    }

    /* renamed from: x */
    public C9460vl mo51226x(u82 u82) {
        vx2.m53591g(u82, "fqName");
        return (C9460vl) SequencesKt___SequencesKt.m63028r(SequencesKt___SequencesKt.m63035y(CollectionsKt___CollectionsKt.m47318Q(this.f39270a), new CompositeAnnotations$findAnnotation$1(u82)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(C6983dm... dmVarArr) {
        this((List<? extends C6983dm>) ArraysKt___ArraysKt.m47291q0(dmVarArr));
        vx2.m53591g(dmVarArr, "delegates");
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* compiled from: PackageFragmentProviderImpl.kt */
public final class PackageFragmentProviderImpl implements jk4 {

    /* renamed from: a */
    public final Collection<fk4> f39253a;

    public PackageFragmentProviderImpl(Collection<? extends fk4> collection) {
        vx2.m53591g(collection, "packageFragments");
        this.f39253a = collection;
    }

    /* renamed from: a */
    public void mo52736a(u82 u82, Collection<fk4> collection) {
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(collection, "packageFragments");
        for (T next : this.f39253a) {
            if (vx2.m53586b(((fk4) next).mo51711e(), u82)) {
                collection.add(next);
            }
        }
    }

    /* renamed from: b */
    public boolean mo52737b(u82 u82) {
        vx2.m53591g(u82, "fqName");
        Collection<fk4> collection = this.f39253a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        for (fk4 e : collection) {
            if (vx2.m53586b(e.mo51711e(), u82)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public List<fk4> mo52234c(u82 u82) {
        vx2.m53591g(u82, "fqName");
        Collection<fk4> collection = this.f39253a;
        ArrayList arrayList = new ArrayList();
        for (T next : collection) {
            if (vx2.m53586b(((fk4) next).mo51711e(), u82)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public Collection<u82> mo52235l(u82 u82, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(rc2, "nameFilter");
        return SequencesKt___SequencesKt.m63020D(SequencesKt___SequencesKt.m63025o(SequencesKt___SequencesKt.m63034x(CollectionsKt___CollectionsKt.m47318Q(this.f39253a), PackageFragmentProviderImpl$getSubPackagesOf$1.INSTANCE), new PackageFragmentProviderImpl$getSubPackagesOf$2(u82)));
    }
}

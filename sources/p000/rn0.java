package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* renamed from: rn0 */
/* compiled from: CompositePackageFragmentProvider.kt */
public final class rn0 implements jk4 {

    /* renamed from: a */
    public final List<hk4> f44433a;

    /* renamed from: b */
    public final String f44434b;

    public rn0(List<? extends hk4> list, String str) {
        vx2.m53591g(list, "providers");
        vx2.m53591g(str, "debugName");
        this.f44433a = list;
        this.f44434b = str;
        list.size();
        CollectionsKt___CollectionsKt.m47315O0(list).size();
    }

    /* renamed from: a */
    public void mo52736a(u82 u82, Collection<fk4> collection) {
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(collection, "packageFragments");
        for (hk4 a : this.f44433a) {
            ik4.m58995a(a, u82, collection);
        }
    }

    /* renamed from: b */
    public boolean mo52737b(u82 u82) {
        vx2.m53591g(u82, "fqName");
        List<hk4> list = this.f44433a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (hk4 b : list) {
            if (!ik4.m58996b(b, u82)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public List<fk4> mo52234c(u82 u82) {
        vx2.m53591g(u82, "fqName");
        ArrayList arrayList = new ArrayList();
        for (hk4 a : this.f44433a) {
            ik4.m58995a(a, u82, arrayList);
        }
        return CollectionsKt___CollectionsKt.m47311K0(arrayList);
    }

    /* renamed from: l */
    public Collection<u82> mo52235l(u82 u82, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(rc2, "nameFilter");
        HashSet hashSet = new HashSet();
        for (hk4 l : this.f44433a) {
            hashSet.addAll(l.mo52235l(u82, rc2));
        }
        return hashSet;
    }

    public String toString() {
        return this.f44434b;
    }
}

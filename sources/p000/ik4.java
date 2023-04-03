package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: ik4 */
/* compiled from: PackageFragmentProvider.kt */
public final class ik4 {
    /* renamed from: a */
    public static final void m58995a(hk4 hk4, u82 u82, Collection<fk4> collection) {
        vx2.m53591g(hk4, "<this>");
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(collection, "packageFragments");
        if (hk4 instanceof jk4) {
            ((jk4) hk4).mo52736a(u82, collection);
        } else {
            collection.addAll(hk4.mo52234c(u82));
        }
    }

    /* renamed from: b */
    public static final boolean m58996b(hk4 hk4, u82 u82) {
        vx2.m53591g(hk4, "<this>");
        vx2.m53591g(u82, "fqName");
        if (hk4 instanceof jk4) {
            return ((jk4) hk4).mo52737b(u82);
        }
        return m58997c(hk4, u82).isEmpty();
    }

    /* renamed from: c */
    public static final List<fk4> m58997c(hk4 hk4, u82 u82) {
        vx2.m53591g(hk4, "<this>");
        vx2.m53591g(u82, "fqName");
        ArrayList arrayList = new ArrayList();
        m58995a(hk4, u82, arrayList);
        return arrayList;
    }
}

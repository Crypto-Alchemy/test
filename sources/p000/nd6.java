package p000;

import java.util.Collection;

/* renamed from: nd6 */
/* compiled from: SupertypeLoopChecker.kt */
public interface nd6 {

    /* renamed from: nd6$a */
    /* compiled from: SupertypeLoopChecker.kt */
    public static final class C7936a implements nd6 {

        /* renamed from: a */
        public static final C7936a f41155a = new C7936a();

        /* renamed from: a */
        public Collection<xc3> mo56461a(yz6 yz6, Collection<? extends xc3> collection, rc2<? super yz6, ? extends Iterable<? extends xc3>> rc2, rc2<? super xc3, r37> rc22) {
            vx2.m53591g(yz6, "currentTypeConstructor");
            vx2.m53591g(collection, "superTypes");
            vx2.m53591g(rc2, "neighbors");
            vx2.m53591g(rc22, "reportLoop");
            return collection;
        }
    }

    /* renamed from: a */
    Collection<xc3> mo56461a(yz6 yz6, Collection<? extends xc3> collection, rc2<? super yz6, ? extends Iterable<? extends xc3>> rc2, rc2<? super xc3, r37> rc22);
}

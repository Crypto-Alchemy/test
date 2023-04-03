package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: k01 */
/* compiled from: DFS */
public class k01 {

    /* renamed from: k01$a */
    /* compiled from: DFS */
    public static class C7323a extends C7324b<N, Boolean> {

        /* renamed from: a */
        public final /* synthetic */ rc2 f38825a;

        /* renamed from: b */
        public final /* synthetic */ boolean[] f38826b;

        public C7323a(rc2 rc2, boolean[] zArr) {
            this.f38825a = rc2;
            this.f38826b = zArr;
        }

        /* renamed from: c */
        public boolean mo52831c(N n) {
            if (((Boolean) this.f38825a.invoke(n)).booleanValue()) {
                this.f38826b[0] = true;
            }
            return !this.f38826b[0];
        }

        /* renamed from: d */
        public Boolean mo52830a() {
            return Boolean.valueOf(this.f38826b[0]);
        }
    }

    /* renamed from: k01$b */
    /* compiled from: DFS */
    public static abstract class C7324b<N, R> implements C7326d<N, R> {
        /* renamed from: b */
        public void mo52833b(N n) {
        }
    }

    /* renamed from: k01$c */
    /* compiled from: DFS */
    public interface C7325c<N> {
        /* renamed from: a */
        Iterable<? extends N> mo52834a(N n);
    }

    /* renamed from: k01$d */
    /* compiled from: DFS */
    public interface C7326d<N, R> {
        /* renamed from: a */
        R mo52830a();

        /* renamed from: b */
        void mo52833b(N n);

        /* renamed from: c */
        boolean mo52831c(N n);
    }

    /* renamed from: k01$e */
    /* compiled from: DFS */
    public interface C7327e<N> {
        /* renamed from: a */
        boolean mo52835a(N n);
    }

    /* renamed from: k01$f */
    /* compiled from: DFS */
    public static class C7328f<N> implements C7327e<N> {

        /* renamed from: a */
        public final Set<N> f38827a;

        public C7328f() {
            this(new HashSet());
        }

        /* renamed from: b */
        public static /* synthetic */ void m59642b(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"}));
        }

        /* renamed from: a */
        public boolean mo52835a(N n) {
            return this.f38827a.add(n);
        }

        public C7328f(Set<N> set) {
            if (set == null) {
                m59642b(0);
            }
            this.f38827a = set;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m59628a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
            default:
                objArr[0] = "nodes";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static <N, R> R m59629b(Collection<N> collection, C7325c<N> cVar, C7326d<N, R> dVar) {
        if (collection == null) {
            m59628a(4);
        }
        if (cVar == null) {
            m59628a(5);
        }
        if (dVar == null) {
            m59628a(6);
        }
        return m59630c(collection, cVar, new C7328f(), dVar);
    }

    /* renamed from: c */
    public static <N, R> R m59630c(Collection<N> collection, C7325c<N> cVar, C7327e<N> eVar, C7326d<N, R> dVar) {
        if (collection == null) {
            m59628a(0);
        }
        if (cVar == null) {
            m59628a(1);
        }
        if (eVar == null) {
            m59628a(2);
        }
        if (dVar == null) {
            m59628a(3);
        }
        for (N d : collection) {
            m59631d(d, cVar, eVar, dVar);
        }
        return dVar.mo52830a();
    }

    /* renamed from: d */
    public static <N> void m59631d(N n, C7325c<N> cVar, C7327e<N> eVar, C7326d<N, ?> dVar) {
        if (n == null) {
            m59628a(22);
        }
        if (cVar == null) {
            m59628a(23);
        }
        if (eVar == null) {
            m59628a(24);
        }
        if (dVar == null) {
            m59628a(25);
        }
        if (eVar.mo52835a(n) && dVar.mo52831c(n)) {
            for (Object d : cVar.mo52834a(n)) {
                m59631d(d, cVar, eVar, dVar);
            }
            dVar.mo52833b(n);
        }
    }

    /* renamed from: e */
    public static <N> Boolean m59632e(Collection<N> collection, C7325c<N> cVar, rc2<N, Boolean> rc2) {
        if (collection == null) {
            m59628a(7);
        }
        if (cVar == null) {
            m59628a(8);
        }
        if (rc2 == null) {
            m59628a(9);
        }
        return (Boolean) m59629b(collection, cVar, new C7323a(rc2, new boolean[1]));
    }
}

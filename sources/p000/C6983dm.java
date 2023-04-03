package p000;

import java.util.Iterator;
import java.util.List;

/* renamed from: dm */
/* compiled from: Annotations.kt */
public interface C6983dm extends Iterable<C9460vl>, a93 {

    /* renamed from: b */
    public static final C6984a f37317b = C6984a.f37318a;

    /* renamed from: dm$a */
    /* compiled from: Annotations.kt */
    public static final class C6984a {

        /* renamed from: a */
        public static final /* synthetic */ C6984a f37318a = new C6984a();

        /* renamed from: b */
        public static final C6983dm f37319b = new C6985a();

        /* renamed from: dm$a$a */
        /* compiled from: Annotations.kt */
        public static final class C6985a implements C6983dm {
            /* renamed from: C0 */
            public boolean mo51224C0(u82 u82) {
                return C6986b.m56911b(this, u82);
            }

            /* renamed from: e */
            public Void mo51229e(u82 u82) {
                vx2.m53591g(u82, "fqName");
                return null;
            }

            public boolean isEmpty() {
                return true;
            }

            public Iterator<C9460vl> iterator() {
                return ck0.m33062j().iterator();
            }

            public String toString() {
                return "EMPTY";
            }

            /* renamed from: x */
            public /* bridge */ /* synthetic */ C9460vl mo51226x(u82 u82) {
                return (C9460vl) mo51229e(u82);
            }
        }

        /* renamed from: a */
        public final C6983dm mo51227a(List<? extends C9460vl> list) {
            vx2.m53591g(list, "annotations");
            if (list.isEmpty()) {
                return f37319b;
            }
            return new C7090fm(list);
        }

        /* renamed from: b */
        public final C6983dm mo51228b() {
            return f37319b;
        }
    }

    /* renamed from: dm$b */
    /* compiled from: Annotations.kt */
    public static final class C6986b {
        /* renamed from: a */
        public static C9460vl m56910a(C6983dm dmVar, u82 u82) {
            Object obj;
            vx2.m53591g(u82, "fqName");
            Iterator it = dmVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (vx2.m53586b(((C9460vl) obj).mo53263e(), u82)) {
                    break;
                }
            }
            return (C9460vl) obj;
        }

        /* renamed from: b */
        public static boolean m56911b(C6983dm dmVar, u82 u82) {
            vx2.m53591g(u82, "fqName");
            if (dmVar.mo51226x(u82) != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: C0 */
    boolean mo51224C0(u82 u82);

    boolean isEmpty();

    /* renamed from: x */
    C9460vl mo51226x(u82 u82);
}

package p000;

import java.util.Iterator;

/* renamed from: vh3 */
/* compiled from: javaElements.kt */
public interface vh3 extends l03 {

    /* renamed from: vh3$a */
    /* compiled from: javaElements.kt */
    public static final class C9456a {
        /* renamed from: a */
        public static h03 m73239a(vh3 vh3, u82 u82) {
            T t;
            vx2.m53591g(u82, "fqName");
            Iterator<T> it = vh3.getAnnotations().iterator();
            while (true) {
                t = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                nf0 i = ((h03) next).mo52089i();
                if (i != null) {
                    t = i.mo62673b();
                }
                if (vx2.m53586b(t, u82)) {
                    t = next;
                    break;
                }
            }
            return (h03) t;
        }
    }
}

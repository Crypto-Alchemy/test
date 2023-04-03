package p000;

/* renamed from: mi8 */
public final class mi8 extends gh8 {
    public mi8() {
        super();
    }

    /* renamed from: e */
    public static <E> hg8<E> m48318e(Object obj, long j) {
        return (hg8) qp8.m50740M(obj, j);
    }

    /* renamed from: a */
    public final void mo42894a(Object obj, long j) {
        m48318e(obj, j).mo43294z();
    }

    /* renamed from: b */
    public final <E> void mo42895b(Object obj, Object obj2, long j) {
        hg8 e = m48318e(obj, j);
        hg8 e2 = m48318e(obj2, j);
        int size = e.size();
        int size2 = e2.size();
        if (size > 0 && size2 > 0) {
            if (!e.mo43293y()) {
                e = e.mo43292h0(size2 + size);
            }
            e.addAll(e2);
        }
        if (size > 0) {
            e2 = e;
        }
        qp8.m50757i(obj, j, e2);
    }
}

package p000;

/* renamed from: u39 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class u39 extends g39 {
    public u39() {
        super();
    }

    /* renamed from: e */
    public static <E> h29<E> m52614e(Object obj, long j) {
        return (h29) l99.m47673F(obj, j);
    }

    /* renamed from: b */
    public final <E> void mo42738b(Object obj, Object obj2, long j) {
        h29 e = m52614e(obj, j);
        h29 e2 = m52614e(obj2, j);
        int size = e.size();
        int size2 = e2.size();
        if (size > 0 && size2 > 0) {
            if (!e.zza()) {
                e = e.mo28813d(size2 + size);
            }
            e.addAll(e2);
        }
        if (size > 0) {
            e2 = e;
        }
        l99.m47692j(obj, j, e2);
    }

    /* renamed from: d */
    public final void mo42739d(Object obj, long j) {
        m52614e(obj, j).zzb();
    }
}

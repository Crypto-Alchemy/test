package p000;

/* renamed from: nu0 */
/* compiled from: CountingMemoryCache */
public interface nu0<K, V> extends ys3<K, V>, gt3 {

    /* renamed from: nu0$a */
    /* compiled from: CountingMemoryCache */
    public static class C2920a<K, V> {

        /* renamed from: a */
        public final K f15680a;

        /* renamed from: b */
        public final nh0<V> f15681b;

        /* renamed from: c */
        public int f15682c = 0;

        /* renamed from: d */
        public boolean f15683d = false;

        /* renamed from: e */
        public final C2921b<K> f15684e;

        /* renamed from: f */
        public int f15685f;

        /* renamed from: g */
        public int f15686g;

        public C2920a(K k, nh0<V> nh0, C2921b<K> bVar, int i) {
            this.f15680a = au4.m10792g(k);
            this.f15681b = (nh0) au4.m10792g(nh0.m23176f(nh0));
            this.f15684e = bVar;
            this.f15685f = 0;
            this.f15686g = i;
        }

        /* renamed from: a */
        public static <K, V> C2920a<K, V> m23466a(K k, nh0<V> nh0, int i, C2921b<K> bVar) {
            return new C2920a<>(k, nh0, bVar, i);
        }

        /* renamed from: b */
        public static <K, V> C2920a<K, V> m23467b(K k, nh0<V> nh0, C2921b<K> bVar) {
            return m23466a(k, nh0, -1, bVar);
        }
    }

    /* renamed from: nu0$b */
    /* compiled from: CountingMemoryCache */
    public interface C2921b<K> {
        /* renamed from: a */
        void mo21947a(K k, boolean z);
    }

    /* renamed from: d */
    nh0<V> mo19976d(K k, nh0<V> nh0, C2921b<K> bVar);

    /* renamed from: e */
    nh0<V> mo19977e(K k);
}

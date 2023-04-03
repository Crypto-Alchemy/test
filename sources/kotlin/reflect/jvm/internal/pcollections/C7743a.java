package kotlin.reflect.jvm.internal.pcollections;

/* renamed from: kotlin.reflect.jvm.internal.pcollections.a */
/* compiled from: HashPMap */
public final class C7743a<K, V> {

    /* renamed from: c */
    public static final C7743a<Object, Object> f40331c = new C7743a<>(yw2.m74667a(), 0);

    /* renamed from: a */
    public final yw2<aq0<MapEntry<K, V>>> f40332a;

    /* renamed from: b */
    public final int f40333b;

    public C7743a(yw2<aq0<MapEntry<K, V>>> yw2, int i) {
        this.f40332a = yw2;
        this.f40333b = i;
    }

    /* renamed from: a */
    public static /* synthetic */ void m63002a(int i) {
        Object[] objArr = new Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/pcollections/HashPMap";
        if (i != 1) {
            objArr[1] = "empty";
        } else {
            objArr[1] = "minus";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
    }

    /* renamed from: b */
    public static <K, V> C7743a<K, V> m63003b() {
        C7743a<Object, Object> aVar = f40331c;
        if (aVar == null) {
            m63002a(0);
        }
        return aVar;
    }

    /* renamed from: e */
    public static <K, V> int m63004e(aq0<MapEntry<K, V>> aq0, Object obj) {
        int i = 0;
        aq0<E> aq02 = aq0;
        while (aq02 != null && aq02.size() > 0) {
            if (((MapEntry) aq02.f36539a).key.equals(obj)) {
                return i;
            }
            i++;
            aq02 = aq02.f36540d;
        }
        return -1;
    }

    /* renamed from: c */
    public V mo55409c(Object obj) {
        aq0<E> d = mo55410d(obj.hashCode());
        while (d != null && d.size() > 0) {
            MapEntry mapEntry = (MapEntry) d.f36539a;
            if (mapEntry.key.equals(obj)) {
                return mapEntry.value;
            }
            d = d.f36540d;
        }
        return null;
    }

    /* renamed from: d */
    public final aq0<MapEntry<K, V>> mo55410d(int i) {
        aq0<MapEntry<K, V>> b = this.f40332a.mo67180b(i);
        if (b == null) {
            return aq0.m55631j();
        }
        return b;
    }

    /* renamed from: f */
    public C7743a<K, V> mo55411f(K k, V v) {
        aq0 d = mo55410d(k.hashCode());
        int size = d.size();
        int e = m63004e(d, k);
        if (e != -1) {
            d = d.mo50297n(e);
        }
        aq0 q = d.mo50299q(new MapEntry(k, v));
        return new C7743a<>(this.f40332a.mo67181c(k.hashCode(), q), (this.f40333b - size) + q.size());
    }
}

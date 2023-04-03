package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import sun.misc.Unsafe;

/* renamed from: kk2 */
/* compiled from: HMSpliterators */
public final class kk2 {

    /* renamed from: a */
    public static final Unsafe f30889a;

    /* renamed from: b */
    public static final long f30890b;

    /* renamed from: c */
    public static final long f30891c;

    /* renamed from: d */
    public static final long f30892d;

    /* renamed from: e */
    public static final long f30893e;

    /* renamed from: kk2$a */
    /* compiled from: HMSpliterators */
    public static final class C6157a<K, V> extends C6158b<K, V> implements z66<Map.Entry<K, V>> {
        public C6157a(HashMap<K, V> hashMap, int i, int i2, int i3, int i4) {
            super(hashMap, i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo29473a(xq0<? super Map.Entry<K, V>> xq0) {
            int i;
            int i2;
            int i3;
            kf4.m47057e(xq0);
            HashMap<K, V> hashMap = this.f30900a;
            Object[] n = C6158b.m47145n(hashMap);
            int i4 = this.f30903d;
            if (i4 < 0) {
                int j = C6158b.m47141j(hashMap);
                this.f30905f = j;
                if (n == null) {
                    i3 = 0;
                } else {
                    i3 = n.length;
                }
                this.f30903d = i3;
                int i5 = i3;
                i = j;
                i4 = i5;
            } else {
                i = this.f30905f;
            }
            if (n != null && n.length >= i4 && (i2 = this.f30902c) >= 0) {
                this.f30902c = i4;
                if (i2 < i4 || this.f30901b != null) {
                    Object obj = this.f30901b;
                    this.f30901b = null;
                    while (true) {
                        if (obj == null) {
                            int i6 = i2 + 1;
                            obj = n[i2];
                            i2 = i6;
                        } else {
                            xq0.accept((Map.Entry) obj);
                            obj = C6158b.m47142k(obj);
                        }
                        if (obj == null && i2 >= i4) {
                            break;
                        }
                    }
                    if (i != C6158b.m47141j(hashMap)) {
                        throw new ConcurrentModificationException();
                    }
                }
            }
        }

        /* renamed from: c */
        public boolean mo29474c(xq0<? super Map.Entry<K, V>> xq0) {
            int i;
            kf4.m47057e(xq0);
            Object[] n = C6158b.m47145n(this.f30900a);
            if (n == null || n.length < (i = mo44815i()) || this.f30902c < 0) {
                return false;
            }
            while (true) {
                Object obj = this.f30901b;
                if (obj == null && this.f30902c >= i) {
                    return false;
                }
                if (obj == null) {
                    int i2 = this.f30902c;
                    this.f30902c = i2 + 1;
                    this.f30901b = n[i2];
                } else {
                    this.f30901b = C6158b.m47142k(obj);
                    xq0.accept((Map.Entry) obj);
                    if (this.f30905f == C6158b.m47141j(this.f30900a)) {
                        return true;
                    }
                    throw new ConcurrentModificationException();
                }
            }
        }

        public int characteristics() {
            int i;
            if (this.f30903d < 0 || this.f30904e == this.f30900a.size()) {
                i = 64;
            } else {
                i = 0;
            }
            return i | 1;
        }

        public Comparator<? super Map.Entry<K, V>> getComparator() {
            return b76.m32376h((z66) null);
        }

        /* renamed from: p */
        public C6157a<K, V> trySplit() {
            int i = mo44815i();
            int i2 = this.f30902c;
            int i3 = (i + i2) >>> 1;
            if (i2 >= i3 || this.f30901b != null) {
                return null;
            }
            HashMap<K, V> hashMap = this.f30900a;
            this.f30902c = i3;
            int i4 = this.f30904e >>> 1;
            this.f30904e = i4;
            return new C6157a(hashMap, i2, i3, i4, this.f30905f);
        }
    }

    /* renamed from: kk2$b */
    /* compiled from: HMSpliterators */
    public static abstract class C6158b<K, V> {

        /* renamed from: g */
        public static final Unsafe f30894g;

        /* renamed from: h */
        public static final long f30895h;

        /* renamed from: i */
        public static final long f30896i;

        /* renamed from: j */
        public static final long f30897j;

        /* renamed from: k */
        public static final long f30898k;

        /* renamed from: l */
        public static final long f30899l;

        /* renamed from: a */
        public final HashMap<K, V> f30900a;

        /* renamed from: b */
        public Object f30901b;

        /* renamed from: c */
        public int f30902c;

        /* renamed from: d */
        public int f30903d;

        /* renamed from: e */
        public int f30904e;

        /* renamed from: f */
        public int f30905f;

        static {
            Unsafe unsafe = o47.f32276a;
            f30894g = unsafe;
            try {
                f30895h = unsafe.objectFieldOffset(HashMap.class.getDeclaredField("table"));
                f30896i = unsafe.objectFieldOffset(HashMap.class.getDeclaredField("modCount"));
                Class<?> o = m47146o();
                f30897j = unsafe.objectFieldOffset(o.getDeclaredField("key"));
                f30898k = unsafe.objectFieldOffset(o.getDeclaredField("value"));
                f30899l = unsafe.objectFieldOffset(o.getDeclaredField("next"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        public C6158b(HashMap<K, V> hashMap, int i, int i2, int i3, int i4) {
            this.f30900a = hashMap;
            this.f30902c = i;
            this.f30903d = i2;
            this.f30904e = i3;
            this.f30905f = i4;
        }

        /* renamed from: j */
        public static int m47141j(HashMap<?, ?> hashMap) {
            return f30894g.getInt(hashMap, f30896i);
        }

        /* renamed from: k */
        public static Object m47142k(Object obj) {
            return f30894g.getObject(obj, f30899l);
        }

        /* renamed from: l */
        public static <K> K m47143l(Object obj) {
            return f30894g.getObject(obj, f30897j);
        }

        /* renamed from: m */
        public static <T> T m47144m(Object obj) {
            return f30894g.getObject(obj, f30898k);
        }

        /* renamed from: n */
        public static Object[] m47145n(HashMap<?, ?> hashMap) {
            return (Object[]) f30894g.getObject(hashMap, f30895h);
        }

        /* renamed from: o */
        public static Class<?> m47146o() throws ClassNotFoundException {
            String str;
            StringBuilder sb = new StringBuilder("java.util.HashMap$");
            if (b76.f21141h || b76.f21145l) {
                str = "Node";
            } else {
                str = "Entry";
            }
            sb.append(str);
            try {
                return Class.forName(sb.toString());
            } catch (ClassNotFoundException e) {
                if (b76.f21141h) {
                    return Class.forName("java.util.HashMap$HashMapEntry");
                }
                throw e;
            }
        }

        public final long estimateSize() {
            mo44815i();
            return (long) this.f30904e;
        }

        public final long getExactSizeIfKnown() {
            return b76.m32377i((z66) this);
        }

        public final boolean hasCharacteristics(int i) {
            return b76.m32379k((z66) this, i);
        }

        /* renamed from: i */
        public final int mo44815i() {
            int i = this.f30903d;
            if (i < 0) {
                HashMap<K, V> hashMap = this.f30900a;
                this.f30904e = hashMap.size();
                this.f30905f = m47141j(hashMap);
                Object[] n = m47145n(hashMap);
                if (n == null) {
                    i = 0;
                } else {
                    i = n.length;
                }
                this.f30903d = i;
            }
            return i;
        }
    }

    /* renamed from: kk2$c */
    /* compiled from: HMSpliterators */
    public static final class C6159c<K, V> extends C6158b<K, V> implements z66<K> {
        public C6159c(HashMap<K, V> hashMap, int i, int i2, int i3, int i4) {
            super(hashMap, i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo29473a(xq0<? super K> xq0) {
            int i;
            int i2;
            int i3;
            kf4.m47057e(xq0);
            HashMap<K, V> hashMap = this.f30900a;
            Object[] n = C6158b.m47145n(hashMap);
            int i4 = this.f30903d;
            if (i4 < 0) {
                int j = C6158b.m47141j(hashMap);
                this.f30905f = j;
                if (n == null) {
                    i3 = 0;
                } else {
                    i3 = n.length;
                }
                this.f30903d = i3;
                int i5 = i3;
                i = j;
                i4 = i5;
            } else {
                i = this.f30905f;
            }
            if (n != null && n.length >= i4 && (i2 = this.f30902c) >= 0) {
                this.f30902c = i4;
                if (i2 < i4 || this.f30901b != null) {
                    Object obj = this.f30901b;
                    this.f30901b = null;
                    while (true) {
                        if (obj == null) {
                            int i6 = i2 + 1;
                            obj = n[i2];
                            i2 = i6;
                        } else {
                            xq0.accept(C6158b.m47143l(obj));
                            obj = C6158b.m47142k(obj);
                        }
                        if (obj == null && i2 >= i4) {
                            break;
                        }
                    }
                    if (i != C6158b.m47141j(hashMap)) {
                        throw new ConcurrentModificationException();
                    }
                }
            }
        }

        /* renamed from: c */
        public boolean mo29474c(xq0<? super K> xq0) {
            int i;
            kf4.m47057e(xq0);
            Object[] n = C6158b.m47145n(this.f30900a);
            if (n == null || n.length < (i = mo44815i()) || this.f30902c < 0) {
                return false;
            }
            while (true) {
                Object obj = this.f30901b;
                if (obj == null && this.f30902c >= i) {
                    return false;
                }
                if (obj == null) {
                    int i2 = this.f30902c;
                    this.f30902c = i2 + 1;
                    this.f30901b = n[i2];
                } else {
                    Object l = C6158b.m47143l(obj);
                    this.f30901b = C6158b.m47142k(this.f30901b);
                    xq0.accept(l);
                    if (this.f30905f == C6158b.m47141j(this.f30900a)) {
                        return true;
                    }
                    throw new ConcurrentModificationException();
                }
            }
        }

        public int characteristics() {
            int i;
            if (this.f30903d < 0 || this.f30904e == this.f30900a.size()) {
                i = 64;
            } else {
                i = 0;
            }
            return i | 1;
        }

        public Comparator<? super K> getComparator() {
            return b76.m32376h((z66) null);
        }

        /* renamed from: p */
        public C6159c<K, V> trySplit() {
            int i = mo44815i();
            int i2 = this.f30902c;
            int i3 = (i + i2) >>> 1;
            if (i2 >= i3 || this.f30901b != null) {
                return null;
            }
            HashMap<K, V> hashMap = this.f30900a;
            this.f30902c = i3;
            int i4 = this.f30904e >>> 1;
            this.f30904e = i4;
            return new C6159c(hashMap, i2, i3, i4, this.f30905f);
        }
    }

    /* renamed from: kk2$d */
    /* compiled from: HMSpliterators */
    public static final class C6160d<K, V> extends C6158b<K, V> implements z66<V> {
        public C6160d(HashMap<K, V> hashMap, int i, int i2, int i3, int i4) {
            super(hashMap, i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo29473a(xq0<? super V> xq0) {
            int i;
            int i2;
            int i3;
            kf4.m47057e(xq0);
            HashMap<K, V> hashMap = this.f30900a;
            Object[] n = C6158b.m47145n(hashMap);
            int i4 = this.f30903d;
            if (i4 < 0) {
                int j = C6158b.m47141j(hashMap);
                this.f30905f = j;
                if (n == null) {
                    i3 = 0;
                } else {
                    i3 = n.length;
                }
                this.f30903d = i3;
                int i5 = i3;
                i = j;
                i4 = i5;
            } else {
                i = this.f30905f;
            }
            if (n != null && n.length >= i4 && (i2 = this.f30902c) >= 0) {
                this.f30902c = i4;
                if (i2 < i4 || this.f30901b != null) {
                    Object obj = this.f30901b;
                    this.f30901b = null;
                    while (true) {
                        if (obj == null) {
                            int i6 = i2 + 1;
                            obj = n[i2];
                            i2 = i6;
                        } else {
                            xq0.accept(C6158b.m47144m(obj));
                            obj = C6158b.m47142k(obj);
                        }
                        if (obj == null && i2 >= i4) {
                            break;
                        }
                    }
                    if (i != C6158b.m47141j(hashMap)) {
                        throw new ConcurrentModificationException();
                    }
                }
            }
        }

        /* renamed from: c */
        public boolean mo29474c(xq0<? super V> xq0) {
            int i;
            kf4.m47057e(xq0);
            Object[] n = C6158b.m47145n(this.f30900a);
            if (n == null || n.length < (i = mo44815i()) || this.f30902c < 0) {
                return false;
            }
            while (true) {
                Object obj = this.f30901b;
                if (obj == null && this.f30902c >= i) {
                    return false;
                }
                if (obj == null) {
                    int i2 = this.f30902c;
                    this.f30902c = i2 + 1;
                    this.f30901b = n[i2];
                } else {
                    Object m = C6158b.m47144m(obj);
                    this.f30901b = C6158b.m47142k(this.f30901b);
                    xq0.accept(m);
                    if (this.f30905f == C6158b.m47141j(this.f30900a)) {
                        return true;
                    }
                    throw new ConcurrentModificationException();
                }
            }
        }

        public int characteristics() {
            if (this.f30903d < 0 || this.f30904e == this.f30900a.size()) {
                return 64;
            }
            return 0;
        }

        public Comparator<? super V> getComparator() {
            return b76.m32376h((z66) null);
        }

        /* renamed from: p */
        public C6160d<K, V> trySplit() {
            int i = mo44815i();
            int i2 = this.f30902c;
            int i3 = (i + i2) >>> 1;
            if (i2 >= i3 || this.f30901b != null) {
                return null;
            }
            HashMap<K, V> hashMap = this.f30900a;
            this.f30902c = i3;
            int i4 = this.f30904e >>> 1;
            this.f30904e = i4;
            return new C6160d(hashMap, i2, i3, i4, this.f30905f);
        }
    }

    static {
        Unsafe unsafe = o47.f32276a;
        f30889a = unsafe;
        try {
            Class<?> cls = Class.forName("java.util.HashMap$Values");
            Class<?> cls2 = Class.forName("java.util.HashMap$KeySet");
            Class<?> cls3 = Class.forName("java.util.HashMap$EntrySet");
            f30890b = unsafe.objectFieldOffset(cls.getDeclaredField("this$0"));
            f30891c = unsafe.objectFieldOffset(cls2.getDeclaredField("this$0"));
            f30892d = unsafe.objectFieldOffset(cls3.getDeclaredField("this$0"));
            f30893e = unsafe.objectFieldOffset(HashSet.class.getDeclaredField("map"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* renamed from: a */
    public static <K, V> z66<Map.Entry<K, V>> m47130a(Set<Map.Entry<K, V>> set) {
        return new C6157a(m47131b(set), 0, -1, 0, 0);
    }

    /* renamed from: b */
    public static <K, V> HashMap<K, V> m47131b(Set<Map.Entry<K, V>> set) {
        return (HashMap) f30889a.getObject(set, f30892d);
    }

    /* renamed from: c */
    public static <K, V> HashMap<K, V> m47132c(HashSet<K> hashSet) {
        return (HashMap) f30889a.getObject(hashSet, f30893e);
    }

    /* renamed from: d */
    public static <K, V> HashMap<K, V> m47133d(Set<K> set) {
        return (HashMap) f30889a.getObject(set, f30891c);
    }

    /* renamed from: e */
    public static <K, V> HashMap<K, V> m47134e(Collection<V> collection) {
        return (HashMap) f30889a.getObject(collection, f30890b);
    }

    /* renamed from: f */
    public static <E> z66<E> m47135f(HashSet<E> hashSet) {
        return new C6159c(m47132c(hashSet), 0, -1, 0, 0);
    }

    /* renamed from: g */
    public static <K> z66<K> m47136g(Set<K> set) {
        return new C6159c(m47133d(set), 0, -1, 0, 0);
    }

    /* renamed from: h */
    public static <V> z66<V> m47137h(Collection<V> collection) {
        return new C6160d(m47134e(collection), 0, -1, 0, 0);
    }
}

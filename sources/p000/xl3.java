package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: xl3 */
/* compiled from: LruArrayPool */
public final class xl3 implements C2982oq {

    /* renamed from: a */
    public final uj2<C3613a, Object> f19884a = new uj2<>();

    /* renamed from: b */
    public final C3614b f19885b = new C3614b();

    /* renamed from: c */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f19886c = new HashMap();

    /* renamed from: d */
    public final Map<Class<?>, C1565aq<?>> f19887d = new HashMap();

    /* renamed from: e */
    public final int f19888e;

    /* renamed from: f */
    public int f19889f;

    /* renamed from: xl3$a */
    /* compiled from: LruArrayPool */
    public static final class C3613a implements os4 {

        /* renamed from: a */
        public final C3614b f19890a;

        /* renamed from: b */
        public int f19891b;

        /* renamed from: c */
        public Class<?> f19892c;

        public C3613a(C3614b bVar) {
            this.f19890a = bVar;
        }

        /* renamed from: a */
        public void mo24101a() {
            this.f19890a.mo26940c(this);
        }

        /* renamed from: b */
        public void mo27798b(int i, Class<?> cls) {
            this.f19891b = i;
            this.f19892c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3613a)) {
                return false;
            }
            C3613a aVar = (C3613a) obj;
            if (this.f19891b == aVar.f19891b && this.f19892c == aVar.f19892c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = this.f19891b * 31;
            Class<?> cls = this.f19892c;
            if (cls != null) {
                i = cls.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return "Key{size=" + this.f19891b + "array=" + this.f19892c + '}';
        }
    }

    /* renamed from: xl3$b */
    /* compiled from: LruArrayPool */
    public static final class C3614b extends C3440uy<C3613a> {
        /* renamed from: d */
        public C3613a mo26938a() {
            return new C3613a(this);
        }

        /* renamed from: e */
        public C3613a mo27803e(int i, Class<?> cls) {
            C3613a aVar = (C3613a) mo26939b();
            aVar.mo27798b(i, cls);
            return aVar;
        }
    }

    public xl3(int i) {
        this.f19888e = i;
    }

    /* renamed from: a */
    public synchronized void mo24039a(int i) {
        if (i >= 40) {
            try {
                mo24040b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            mo27789g(this.f19888e / 2);
        }
    }

    /* renamed from: b */
    public synchronized void mo24040b() {
        mo27789g(0);
    }

    /* renamed from: c */
    public synchronized <T> T mo24041c(int i, Class<T> cls) {
        C3613a aVar;
        Integer ceilingKey = mo27794l(cls).ceilingKey(Integer.valueOf(i));
        if (mo27797o(i, ceilingKey)) {
            aVar = this.f19885b.mo27803e(ceilingKey.intValue(), cls);
        } else {
            aVar = this.f19885b.mo27803e(i, cls);
        }
        return mo27793k(aVar, cls);
    }

    /* renamed from: d */
    public synchronized <T> T mo24042d(int i, Class<T> cls) {
        return mo27793k(this.f19885b.mo27803e(i, cls), cls);
    }

    /* renamed from: e */
    public final void mo27787e(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> l = mo27794l(cls);
        Integer num = l.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            l.remove(Integer.valueOf(i));
        } else {
            l.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: f */
    public final void mo27788f() {
        mo27789g(this.f19888e);
    }

    /* renamed from: g */
    public final void mo27789g(int i) {
        while (this.f19889f > i) {
            Object f = this.f19884a.mo26800f();
            zt4.m31500d(f);
            C1565aq h = mo27790h(f);
            this.f19889f -= h.mo11076c(f) * h.mo11075b();
            mo27787e(h.mo11076c(f), f.getClass());
            if (Log.isLoggable(h.mo11074a(), 2)) {
                h.mo11074a();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(h.mo11076c(f));
            }
        }
    }

    /* renamed from: h */
    public final <T> C1565aq<T> mo27790h(T t) {
        return mo27791i(t.getClass());
    }

    /* renamed from: i */
    public final <T> C1565aq<T> mo27791i(Class<T> cls) {
        C1565aq<T> aqVar = this.f19887d.get(cls);
        if (aqVar == null) {
            if (cls.equals(int[].class)) {
                aqVar = new bx2();
            } else if (cls.equals(byte[].class)) {
                aqVar = new f60();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f19887d.put(cls, aqVar);
        }
        return aqVar;
    }

    /* renamed from: j */
    public final <T> T mo27792j(C3613a aVar) {
        return this.f19884a.mo26796a(aVar);
    }

    /* renamed from: k */
    public final <T> T mo27793k(C3613a aVar, Class<T> cls) {
        C1565aq<T> i = mo27791i(cls);
        T j = mo27792j(aVar);
        if (j != null) {
            this.f19889f -= i.mo11076c(j) * i.mo11075b();
            mo27787e(i.mo11076c(j), cls);
        }
        if (j != null) {
            return j;
        }
        if (Log.isLoggable(i.mo11074a(), 2)) {
            i.mo11074a();
            StringBuilder sb = new StringBuilder();
            sb.append("Allocated ");
            sb.append(aVar.f19891b);
            sb.append(" bytes");
        }
        return i.newArray(aVar.f19891b);
    }

    /* renamed from: l */
    public final NavigableMap<Integer, Integer> mo27794l(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f19886c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f19886c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: m */
    public final boolean mo27795m() {
        int i = this.f19889f;
        if (i == 0 || this.f19888e / i >= 2) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo27796n(int i) {
        if (i <= this.f19888e / 2) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo27797o(int i, Integer num) {
        if (num == null || (!mo27795m() && num.intValue() > i * 8)) {
            return false;
        }
        return true;
    }

    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        C1565aq<?> i = mo27791i(cls);
        int c = i.mo11076c(t);
        int b = i.mo11075b() * c;
        if (mo27796n(b)) {
            C3613a e = this.f19885b.mo27803e(c, cls);
            this.f19884a.mo26799d(e, t);
            NavigableMap<Integer, Integer> l = mo27794l(cls);
            Integer num = l.get(Integer.valueOf(e.f19891b));
            Integer valueOf = Integer.valueOf(e.f19891b);
            int i2 = 1;
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            l.put(valueOf, Integer.valueOf(i2));
            this.f19889f += b;
            mo27788f();
        }
    }
}

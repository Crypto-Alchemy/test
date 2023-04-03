package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: qq */
/* compiled from: ArraySet */
public final class C3162qq<E> implements Collection<E>, Set<E> {

    /* renamed from: A */
    public static int f17005A;

    /* renamed from: k */
    public static final int[] f17006k = new int[0];

    /* renamed from: r */
    public static final Object[] f17007r = new Object[0];

    /* renamed from: s */
    public static Object[] f17008s;

    /* renamed from: x */
    public static int f17009x;

    /* renamed from: y */
    public static Object[] f17010y;

    /* renamed from: a */
    public int[] f17011a;

    /* renamed from: d */
    public Object[] f17012d;

    /* renamed from: e */
    public int f17013e;

    /* renamed from: g */
    public pn3<E, E> f17014g;

    /* renamed from: qq$a */
    /* compiled from: ArraySet */
    public class C3163a extends pn3<E, E> {
        public C3163a() {
        }

        /* renamed from: a */
        public void mo22912a() {
            C3162qq.this.clear();
        }

        /* renamed from: b */
        public Object mo22913b(int i, int i2) {
            return C3162qq.this.f17012d[i];
        }

        /* renamed from: c */
        public Map<E, E> mo22914c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* renamed from: d */
        public int mo22915d() {
            return C3162qq.this.f17013e;
        }

        /* renamed from: e */
        public int mo22916e(Object obj) {
            return C3162qq.this.indexOf(obj);
        }

        /* renamed from: f */
        public int mo22917f(Object obj) {
            return C3162qq.this.indexOf(obj);
        }

        /* renamed from: g */
        public void mo22918g(E e, E e2) {
            C3162qq.this.add(e);
        }

        /* renamed from: h */
        public void mo22919h(int i) {
            C3162qq.this.mo25206r(i);
        }

        /* renamed from: i */
        public E mo22920i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C3162qq() {
        this(0);
    }

    /* renamed from: k */
    public static void m25830k(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C3162qq.class) {
                if (f17005A < 10) {
                    objArr[0] = f17010y;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f17010y = objArr;
                    f17005A++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C3162qq.class) {
                if (f17009x < 10) {
                    objArr[0] = f17008s;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f17008s = objArr;
                    f17009x++;
                }
            }
        }
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = mo25205q();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = mo25204o(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f17013e;
        int[] iArr = this.f17011a;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f17012d;
            mo25196e(i5);
            int[] iArr2 = this.f17011a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f17012d, 0, objArr.length);
            }
            m25830k(iArr, objArr, this.f17013e);
        }
        int i6 = this.f17013e;
        if (i3 < i6) {
            int[] iArr3 = this.f17011a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f17012d;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f17013e - i3);
        }
        this.f17011a[i3] = i;
        this.f17012d[i3] = e;
        this.f17013e++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo25202j(this.f17013e + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void clear() {
        int i = this.f17013e;
        if (i != 0) {
            m25830k(this.f17011a, this.f17012d, i);
            this.f17011a = f17006k;
            this.f17012d = f17007r;
            this.f17013e = 0;
        }
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final void mo25196e(int i) {
        if (i == 8) {
            synchronized (C3162qq.class) {
                Object[] objArr = f17010y;
                if (objArr != null) {
                    this.f17012d = objArr;
                    f17010y = (Object[]) objArr[0];
                    this.f17011a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f17005A--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C3162qq.class) {
                Object[] objArr2 = f17008s;
                if (objArr2 != null) {
                    this.f17012d = objArr2;
                    f17008s = (Object[]) objArr2[0];
                    this.f17011a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f17009x--;
                    return;
                }
            }
        }
        this.f17011a = new int[i];
        this.f17012d = new Object[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f17013e) {
                try {
                    if (!set.contains(mo25210s(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f17011a;
        int i = this.f17013e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return mo25205q();
        }
        return mo25204o(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        if (this.f17013e <= 0) {
            return true;
        }
        return false;
    }

    public Iterator<E> iterator() {
        return mo25203n().mo24661m().iterator();
    }

    /* renamed from: j */
    public void mo25202j(int i) {
        int[] iArr = this.f17011a;
        if (iArr.length < i) {
            Object[] objArr = this.f17012d;
            mo25196e(i);
            int i2 = this.f17013e;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f17011a, 0, i2);
                System.arraycopy(objArr, 0, this.f17012d, 0, this.f17013e);
            }
            m25830k(iArr, objArr, this.f17013e);
        }
    }

    /* renamed from: n */
    public final pn3<E, E> mo25203n() {
        if (this.f17014g == null) {
            this.f17014g = new C3163a();
        }
        return this.f17014g;
    }

    /* renamed from: o */
    public final int mo25204o(Object obj, int i) {
        int i2 = this.f17013e;
        if (i2 == 0) {
            return -1;
        }
        int a = nr0.m23399a(this.f17011a, i2, i);
        if (a < 0 || obj.equals(this.f17012d[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f17011a[i3] == i) {
            if (obj.equals(this.f17012d[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f17011a[i4] == i) {
            if (obj.equals(this.f17012d[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: q */
    public final int mo25205q() {
        int i = this.f17013e;
        if (i == 0) {
            return -1;
        }
        int a = nr0.m23399a(this.f17011a, i, 0);
        if (a < 0 || this.f17012d[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f17011a[i2] == 0) {
            if (this.f17012d[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f17011a[i3] == 0) {
            if (this.f17012d[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: r */
    public E mo25206r(int i) {
        E[] eArr = this.f17012d;
        E e = eArr[i];
        int i2 = this.f17013e;
        if (i2 <= 1) {
            m25830k(this.f17011a, eArr, i2);
            this.f17011a = f17006k;
            this.f17012d = f17007r;
            this.f17013e = 0;
        } else {
            int[] iArr = this.f17011a;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f17013e = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr = this.f17012d;
                    System.arraycopy(objArr, i5, objArr, i, this.f17013e - i);
                }
                this.f17012d[this.f17013e] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                mo25196e(i3);
                this.f17013e--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f17011a, 0, i);
                    System.arraycopy(eArr, 0, this.f17012d, 0, i);
                }
                int i6 = this.f17013e;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f17011a, i, i6 - i);
                    System.arraycopy(eArr, i7, this.f17012d, i, this.f17013e - i);
                }
            }
        }
        return e;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo25206r(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f17013e - 1; i >= 0; i--) {
            if (!collection.contains(this.f17012d[i])) {
                mo25206r(i);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: s */
    public E mo25210s(int i) {
        return this.f17012d[i];
    }

    public int size() {
        return this.f17013e;
    }

    public Object[] toArray() {
        int i = this.f17013e;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f17012d, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f17013e * 14);
        sb.append('{');
        for (int i = 0; i < this.f17013e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object s = mo25210s(i);
            if (s != this) {
                sb.append(s);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C3162qq(int i) {
        if (i == 0) {
            this.f17011a = f17006k;
            this.f17012d = f17007r;
        } else {
            mo25196e(i);
        }
        this.f17013e = 0;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f17013e) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f17013e);
        }
        System.arraycopy(this.f17012d, 0, tArr, 0, this.f17013e);
        int length = tArr.length;
        int i = this.f17013e;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}

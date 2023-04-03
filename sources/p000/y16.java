package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: y16 */
/* compiled from: SimpleArrayMap */
public class y16<K, V> {

    /* renamed from: g */
    public static Object[] f20013g;

    /* renamed from: k */
    public static int f20014k;

    /* renamed from: r */
    public static Object[] f20015r;

    /* renamed from: s */
    public static int f20016s;

    /* renamed from: a */
    public int[] f20017a;

    /* renamed from: d */
    public Object[] f20018d;

    /* renamed from: e */
    public int f20019e;

    public y16() {
        this.f20017a = nr0.f15656a;
        this.f20018d = nr0.f15658c;
        this.f20019e = 0;
    }

    /* renamed from: a */
    private void m30360a(int i) {
        Class<y16> cls = y16.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = f20015r;
                if (objArr != null) {
                    this.f20018d = objArr;
                    f20015r = (Object[]) objArr[0];
                    this.f20017a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f20016s--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = f20013g;
                if (objArr2 != null) {
                    this.f20018d = objArr2;
                    f20013g = (Object[]) objArr2[0];
                    this.f20017a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f20014k--;
                    return;
                }
            }
        }
        this.f20017a = new int[i];
        this.f20018d = new Object[(i << 1)];
    }

    /* renamed from: b */
    public static int m30361b(int[] iArr, int i, int i2) {
        try {
            return nr0.m23399a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    public static void m30362d(int[] iArr, Object[] objArr, int i) {
        Class<y16> cls = y16.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f20016s < 10) {
                    objArr[0] = f20015r;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f20015r = objArr;
                    f20016s++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f20014k < 10) {
                    objArr[0] = f20013g;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f20013g = objArr;
                    f20014k++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo27909c(int i) {
        int i2 = this.f20019e;
        int[] iArr = this.f20017a;
        if (iArr.length < i) {
            Object[] objArr = this.f20018d;
            m30360a(i);
            if (this.f20019e > 0) {
                System.arraycopy(iArr, 0, this.f20017a, 0, i2);
                System.arraycopy(objArr, 0, this.f20018d, 0, i2 << 1);
            }
            m30362d(iArr, objArr, i2);
        }
        if (this.f20019e != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f20019e;
        if (i > 0) {
            int[] iArr = this.f20017a;
            Object[] objArr = this.f20018d;
            this.f20017a = nr0.f15656a;
            this.f20018d = nr0.f15658c;
            this.f20019e = 0;
            m30362d(iArr, objArr, i);
        }
        if (this.f20019e > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (mo27914f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (mo27918h(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public int mo27912e(Object obj, int i) {
        int i2 = this.f20019e;
        if (i2 == 0) {
            return -1;
        }
        int b = m30361b(this.f20017a, i2, i);
        if (b < 0 || obj.equals(this.f20018d[b << 1])) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.f20017a[i3] == i) {
            if (obj.equals(this.f20018d[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = b - 1;
        while (i4 >= 0 && this.f20017a[i4] == i) {
            if (obj.equals(this.f20018d[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y16) {
            y16 y16 = (y16) obj;
            if (size() != y16.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f20019e) {
                try {
                    Object i2 = mo27919i(i);
                    Object m = mo27921m(i);
                    Object obj2 = y16.get(i2);
                    if (m == null) {
                        if (obj2 != null || !y16.containsKey(i2)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f20019e) {
                try {
                    Object i4 = mo27919i(i3);
                    Object m2 = mo27921m(i3);
                    Object obj3 = map.get(i4);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo27914f(Object obj) {
        if (obj == null) {
            return mo27915g();
        }
        return mo27912e(obj, obj.hashCode());
    }

    /* renamed from: g */
    public int mo27915g() {
        int i = this.f20019e;
        if (i == 0) {
            return -1;
        }
        int b = m30361b(this.f20017a, i, 0);
        if (b < 0 || this.f20018d[b << 1] == null) {
            return b;
        }
        int i2 = b + 1;
        while (i2 < i && this.f20017a[i2] == 0) {
            if (this.f20018d[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = b - 1;
        while (i3 >= 0 && this.f20017a[i3] == 0) {
            if (this.f20018d[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int f = mo27914f(obj);
        if (f >= 0) {
            return this.f20018d[(f << 1) + 1];
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo27918h(Object obj) {
        int i = this.f20019e * 2;
        Object[] objArr = this.f20018d;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int i;
        int[] iArr = this.f20017a;
        Object[] objArr = this.f20018d;
        int i2 = this.f20019e;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    /* renamed from: i */
    public K mo27919i(int i) {
        return this.f20018d[i << 1];
    }

    public boolean isEmpty() {
        if (this.f20019e <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void mo22210j(y16<? extends K, ? extends V> y16) {
        int i = y16.f20019e;
        mo27909c(this.f20019e + i);
        if (this.f20019e != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(y16.mo27919i(i2), y16.mo27921m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(y16.f20017a, 0, this.f20017a, 0, i);
            System.arraycopy(y16.f20018d, 0, this.f20018d, 0, i << 1);
            this.f20019e = i;
        }
    }

    /* renamed from: k */
    public V mo22211k(int i) {
        V[] vArr = this.f20018d;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f20019e;
        int i4 = 0;
        if (i3 <= 1) {
            m30362d(this.f20017a, vArr, i3);
            this.f20017a = nr0.f15656a;
            this.f20018d = nr0.f15658c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f20017a;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.f20018d;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f20018d;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m30360a(i6);
                if (i3 == this.f20019e) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f20017a, 0, i);
                        System.arraycopy(vArr, 0, this.f20018d, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f20017a, i, i11);
                        System.arraycopy(vArr, i10 << 1, this.f20018d, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f20019e) {
            this.f20019e = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: l */
    public V mo22212l(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f20018d;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: m */
    public V mo27921m(int i) {
        return this.f20018d[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f20019e;
        if (k == null) {
            i2 = mo27915g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo27912e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f20018d;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f20017a;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f20018d;
            m30360a(i6);
            if (i3 == this.f20019e) {
                int[] iArr2 = this.f20017a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f20018d, 0, objArr.length);
                }
                m30362d(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f20017a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f20018d;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f20019e - i5) << 1);
        }
        int i8 = this.f20019e;
        if (i3 == i8) {
            int[] iArr4 = this.f20017a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f20018d;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f20019e = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        if (v2 == null) {
            return put(k, v);
        }
        return v2;
    }

    public V remove(Object obj) {
        int f = mo27914f(obj);
        if (f >= 0) {
            return mo22211k(f);
        }
        return null;
    }

    public V replace(K k, V v) {
        int f = mo27914f(k);
        if (f >= 0) {
            return mo22212l(f, v);
        }
        return null;
    }

    public int size() {
        return this.f20019e;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f20019e * 28);
        sb.append('{');
        for (int i = 0; i < this.f20019e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object i2 = mo27919i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m = mo27921m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f = mo27914f(obj);
        if (f < 0) {
            return false;
        }
        Object m = mo27921m(f);
        if (obj2 != m && (obj2 == null || !obj2.equals(m))) {
            return false;
        }
        mo22211k(f);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int f = mo27914f(k);
        if (f < 0) {
            return false;
        }
        V m = mo27921m(f);
        if (m != v && (v == null || !v.equals(m))) {
            return false;
        }
        mo22212l(f, v2);
        return true;
    }

    public y16(int i) {
        if (i == 0) {
            this.f20017a = nr0.f15656a;
            this.f20018d = nr0.f15658c;
        } else {
            m30360a(i);
        }
        this.f20019e = 0;
    }

    public y16(y16<K, V> y16) {
        this();
        if (y16 != null) {
            mo22210j(y16);
        }
    }
}

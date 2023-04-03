package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.AbstractList;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import sun.misc.Unsafe;

/* renamed from: sh3 */
/* compiled from: LinkedListSpliterator */
public final class sh3<T> implements z66<T> {

    /* renamed from: g */
    public static final boolean f33894g;

    /* renamed from: h */
    public static final boolean f33895h;

    /* renamed from: i */
    public static final Unsafe f33896i;

    /* renamed from: j */
    public static final long f33897j;

    /* renamed from: k */
    public static final long f33898k;

    /* renamed from: l */
    public static final long f33899l;

    /* renamed from: m */
    public static final long f33900m;

    /* renamed from: n */
    public static final long f33901n;

    /* renamed from: a */
    public final LinkedList<T> f33902a;

    /* renamed from: b */
    public final Object f33903b;

    /* renamed from: c */
    public Object f33904c;

    /* renamed from: d */
    public int f33905d;

    /* renamed from: e */
    public int f33906e;

    /* renamed from: f */
    public int f33907f;

    static {
        String str;
        String str2;
        String str3;
        boolean z = b76.f21142i;
        f33894g = z;
        boolean z2 = b76.f21144k;
        f33895h = z2;
        Unsafe unsafe = o47.f32276a;
        f33896i = unsafe;
        try {
            f33898k = unsafe.objectFieldOffset(AbstractList.class.getDeclaredField("modCount"));
            if (z) {
                str = "voidLink";
            } else if (z2) {
                str = "header";
            } else {
                str = "first";
            }
            if (z) {
                str2 = "java.util.LinkedList$Link";
            } else if (z2) {
                str2 = "java.util.LinkedList$Entry";
            } else {
                str2 = "java.util.LinkedList$Node";
            }
            if (z) {
                str3 = "data";
            } else if (z2) {
                str3 = "element";
            } else {
                str3 = "item";
            }
            Class<?> cls = Class.forName(str2);
            f33897j = unsafe.objectFieldOffset(LinkedList.class.getDeclaredField("size"));
            f33899l = unsafe.objectFieldOffset(LinkedList.class.getDeclaredField(str));
            f33900m = unsafe.objectFieldOffset(cls.getDeclaredField(str3));
            f33901n = unsafe.objectFieldOffset(cls.getDeclaredField("next"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public sh3(LinkedList<T> linkedList, int i, int i2) {
        Object obj;
        this.f33902a = linkedList;
        this.f33905d = i;
        this.f33906e = i2;
        if (f33895h || f33894g) {
            obj = m51785k(linkedList);
        } else {
            obj = null;
        }
        this.f33903b = obj;
    }

    /* renamed from: k */
    public static Object m51785k(LinkedList<?> linkedList) {
        if (linkedList == null) {
            return null;
        }
        return f33896i.getObject(linkedList, f33899l);
    }

    /* renamed from: l */
    public static int m51786l(LinkedList<?> linkedList) {
        return f33896i.getInt(linkedList, f33898k);
    }

    /* renamed from: m */
    public static Object m51787m(Object obj) {
        if (obj != null) {
            return f33896i.getObject(obj, f33901n);
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: n */
    public static <E> E m51788n(Object obj) {
        if (obj != null) {
            return f33896i.getObject(obj, f33900m);
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: o */
    public static int m51789o(LinkedList<?> linkedList) {
        return f33896i.getInt(linkedList, f33897j);
    }

    /* renamed from: p */
    public static <E> z66<E> m51790p(LinkedList<E> linkedList) {
        return new sh3(linkedList, -1, 0);
    }

    /* renamed from: a */
    public void mo29473a(xq0<? super T> xq0) {
        kf4.m47057e(xq0);
        Object obj = this.f33903b;
        int i = mo47793i();
        if (i > 0 && (r2 = this.f33904c) != obj) {
            this.f33904c = obj;
            this.f33905d = 0;
            do {
                Object n = m51788n(r2);
                Object obj2 = m51787m(obj2);
                xq0.accept(n);
                if (obj2 == obj) {
                    break;
                }
                i--;
            } while (i <= 0);
        }
        if (this.f33906e != m51786l(this.f33902a)) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public boolean mo29474c(xq0<? super T> xq0) {
        Object obj;
        kf4.m47057e(xq0);
        Object obj2 = this.f33903b;
        if (mo47793i() <= 0 || (obj = this.f33904c) == obj2) {
            return false;
        }
        this.f33905d--;
        Object n = m51788n(obj);
        this.f33904c = m51787m(obj);
        xq0.accept(n);
        if (this.f33906e == m51786l(this.f33902a)) {
            return true;
        }
        throw new ConcurrentModificationException();
    }

    public int characteristics() {
        return 16464;
    }

    public long estimateSize() {
        return (long) mo47793i();
    }

    public Comparator<? super T> getComparator() {
        return b76.m32376h(this);
    }

    public long getExactSizeIfKnown() {
        return b76.m32377i(this);
    }

    public boolean hasCharacteristics(int i) {
        return b76.m32379k(this, i);
    }

    /* renamed from: i */
    public final int mo47793i() {
        int i = this.f33905d;
        if (i >= 0) {
            return i;
        }
        LinkedList<T> linkedList = this.f33902a;
        if (linkedList == null) {
            this.f33905d = 0;
            return 0;
        }
        this.f33906e = m51786l(linkedList);
        this.f33904c = mo47794j(linkedList);
        int o = m51789o(linkedList);
        this.f33905d = o;
        return o;
    }

    /* renamed from: j */
    public final Object mo47794j(LinkedList<?> linkedList) {
        if (f33895h || f33894g) {
            return m51787m(this.f33903b);
        }
        return f33896i.getObject(linkedList, f33899l);
    }

    public z66<T> trySplit() {
        Object obj;
        int i;
        Object obj2 = this.f33903b;
        int i2 = mo47793i();
        if (i2 <= 1 || (obj = this.f33904c) == obj2) {
            return null;
        }
        int i3 = this.f33907f + RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
        if (i3 > i2) {
            i3 = i2;
        }
        if (i3 > 33554432) {
            i3 = 33554432;
        }
        Object[] objArr = new Object[i3];
        int i4 = 0;
        while (true) {
            i = i4 + 1;
            objArr[i4] = m51788n(obj);
            obj = m51787m(obj);
            if (obj == obj2 || i >= i3) {
                this.f33904c = obj;
                this.f33907f = i;
                this.f33905d = i2 - i;
            } else {
                i4 = i;
            }
        }
        this.f33904c = obj;
        this.f33907f = i;
        this.f33905d = i2 - i;
        return b76.m32393y(objArr, 0, i, 16);
    }
}

package p000;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: v46 */
/* compiled from: SmartList */
public class v46<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: a */
    public int f45217a;

    /* renamed from: d */
    public Object f45218d;

    /* renamed from: v46$b */
    /* compiled from: SmartList */
    public static class C9439b<T> implements Iterator<T> {

        /* renamed from: a */
        public static final C9439b f45219a = new C9439b();

        /* renamed from: a */
        public static <T> C9439b<T> m73081a() {
            return f45219a;
        }

        public boolean hasNext() {
            return false;
        }

        public T next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* renamed from: v46$c */
    /* compiled from: SmartList */
    public class C9440c extends C9441d<E> {

        /* renamed from: d */
        public final int f45220d;

        public C9440c() {
            super();
            this.f45220d = v46.this.modCount;
        }

        /* renamed from: a */
        public void mo66416a() {
            if (v46.this.modCount != this.f45220d) {
                throw new ConcurrentModificationException("ModCount: " + v46.this.modCount + "; expected: " + this.f45220d);
            }
        }

        /* renamed from: b */
        public E mo66417b() {
            return v46.this.f45218d;
        }

        public void remove() {
            mo66416a();
            v46.this.clear();
        }
    }

    /* renamed from: v46$d */
    /* compiled from: SmartList */
    public static abstract class C9441d<T> implements Iterator<T> {

        /* renamed from: a */
        public boolean f45222a;

        public C9441d() {
        }

        /* renamed from: a */
        public abstract void mo66416a();

        /* renamed from: b */
        public abstract T mo66417b();

        public final boolean hasNext() {
            return !this.f45222a;
        }

        public final T next() {
            if (!this.f45222a) {
                this.f45222a = true;
                mo66416a();
                return mo66417b();
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m73076e(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public boolean add(E e) {
        int i = this.f45217a;
        if (i == 0) {
            this.f45218d = e;
        } else if (i == 1) {
            this.f45218d = new Object[]{this.f45218d, e};
        } else {
            Object[] objArr = (Object[]) this.f45218d;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                Object[] objArr2 = new Object[i2];
                this.f45218d = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f45217a] = e;
        }
        this.f45217a++;
        this.modCount++;
        return true;
    }

    public void clear() {
        this.f45218d = null;
        this.f45217a = 0;
        this.modCount++;
    }

    public E get(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f45217a)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f45217a);
        } else if (i2 == 1) {
            return this.f45218d;
        } else {
            return ((Object[]) this.f45218d)[i];
        }
    }

    public Iterator<E> iterator() {
        int i = this.f45217a;
        if (i == 0) {
            C9439b a = C9439b.m73081a();
            if (a == null) {
                m73076e(2);
            }
            return a;
        } else if (i == 1) {
            return new C9440c();
        } else {
            Iterator<E> it = super.iterator();
            if (it == null) {
                m73076e(3);
            }
            return it;
        }
    }

    public E remove(int i) {
        int i2;
        E e;
        if (i < 0 || i >= (i2 = this.f45217a)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f45217a);
        }
        if (i2 == 1) {
            e = this.f45218d;
            this.f45218d = null;
        } else {
            E[] eArr = (Object[]) this.f45218d;
            E e2 = eArr[i];
            if (i2 == 2) {
                this.f45218d = eArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(eArr, i + 1, eArr, i, i3);
                }
                eArr[this.f45217a - 1] = null;
            }
            e = e2;
        }
        this.f45217a--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.f45217a)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f45217a);
        } else if (i2 == 1) {
            E e2 = this.f45218d;
            this.f45218d = e;
            return e2;
        } else {
            E[] eArr = (Object[]) this.f45218d;
            E e3 = eArr[i];
            eArr[i] = e;
            return e3;
        }
    }

    public int size() {
        return this.f45217a;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr == null) {
            m73076e(4);
        }
        int length = tArr.length;
        int i = this.f45217a;
        if (i == 1) {
            if (length != 0) {
                tArr[0] = this.f45218d;
            } else {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1);
                tArr2[0] = this.f45218d;
                return tArr2;
            }
        } else if (length < i) {
            T[] copyOf = Arrays.copyOf((Object[]) this.f45218d, i, tArr.getClass());
            if (copyOf == null) {
                m73076e(6);
            }
            return copyOf;
        } else if (i != 0) {
            System.arraycopy(this.f45218d, 0, tArr, 0, i);
        }
        int i2 = this.f45217a;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public void add(int i, E e) {
        int i2;
        if (i < 0 || i > (i2 = this.f45217a)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f45217a);
        }
        if (i2 == 0) {
            this.f45218d = e;
        } else if (i2 == 1 && i == 0) {
            this.f45218d = new Object[]{e, this.f45218d};
        } else {
            Object[] objArr = new Object[(i2 + 1)];
            if (i2 == 1) {
                objArr[0] = this.f45218d;
            } else {
                Object[] objArr2 = (Object[]) this.f45218d;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.f45217a - i);
            }
            objArr[i] = e;
            this.f45218d = objArr;
        }
        this.f45217a++;
        this.modCount++;
    }
}

package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: e47 */
/* compiled from: UnmodifiableLazyStringList */
public class e47 extends AbstractList<String> implements RandomAccess, xf3 {

    /* renamed from: a */
    public final xf3 f37468a;

    /* renamed from: e47$a */
    /* compiled from: UnmodifiableLazyStringList */
    public class C7016a implements ListIterator<String> {

        /* renamed from: a */
        public ListIterator<String> f37469a;

        /* renamed from: d */
        public final /* synthetic */ int f37470d;

        public C7016a(int i) {
            this.f37470d = i;
            this.f37469a = e47.this.f37468a.listIterator(i);
        }

        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public String next() {
            return this.f37469a.next();
        }

        /* renamed from: c */
        public String previous() {
            return this.f37469a.previous();
        }

        /* renamed from: d */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f37469a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f37469a.hasPrevious();
        }

        public int nextIndex() {
            return this.f37469a.nextIndex();
        }

        public int previousIndex() {
            return this.f37469a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e47$b */
    /* compiled from: UnmodifiableLazyStringList */
    public class C7017b implements Iterator<String> {

        /* renamed from: a */
        public Iterator<String> f37472a;

        public C7017b() {
            this.f37472a = e47.this.f37468a.iterator();
        }

        /* renamed from: a */
        public String next() {
            return this.f37472a.next();
        }

        public boolean hasNext() {
            return this.f37472a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public e47(xf3 xf3) {
        this.f37468a = xf3;
    }

    /* renamed from: i */
    public List<?> mo51368i() {
        return this.f37468a.mo51368i();
    }

    public Iterator<String> iterator() {
        return new C7017b();
    }

    /* renamed from: j */
    public String get(int i) {
        return (String) this.f37468a.get(i);
    }

    /* renamed from: j0 */
    public void mo51371j0(c70 c70) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: l */
    public xf3 mo51372l() {
        return this;
    }

    public ListIterator<String> listIterator(int i) {
        return new C7016a(i);
    }

    /* renamed from: o0 */
    public c70 mo51374o0(int i) {
        return this.f37468a.mo51374o0(i);
    }

    public int size() {
        return this.f37468a.size();
    }
}

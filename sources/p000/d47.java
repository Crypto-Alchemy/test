package p000;

import com.google.protobuf.ByteString;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: d47 */
/* compiled from: UnmodifiableLazyStringList */
public class d47 extends AbstractList<String> implements wf3, RandomAccess {

    /* renamed from: a */
    public final wf3 f28022a;

    /* renamed from: d47$a */
    /* compiled from: UnmodifiableLazyStringList */
    public class C5726a implements ListIterator<String> {

        /* renamed from: a */
        public ListIterator<String> f28023a;

        /* renamed from: d */
        public final /* synthetic */ int f28024d;

        public C5726a(int i) {
            this.f28024d = i;
            this.f28023a = d47.this.f28022a.listIterator(i);
        }

        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public String next() {
            return this.f28023a.next();
        }

        /* renamed from: c */
        public String previous() {
            return this.f28023a.previous();
        }

        /* renamed from: d */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f28023a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f28023a.hasPrevious();
        }

        public int nextIndex() {
            return this.f28023a.nextIndex();
        }

        public int previousIndex() {
            return this.f28023a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: d47$b */
    /* compiled from: UnmodifiableLazyStringList */
    public class C5727b implements Iterator<String> {

        /* renamed from: a */
        public Iterator<String> f28026a;

        public C5727b() {
            this.f28026a = d47.this.f28022a.iterator();
        }

        /* renamed from: a */
        public String next() {
            return this.f28026a.next();
        }

        public boolean hasNext() {
            return this.f28026a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public d47(wf3 wf3) {
        this.f28022a = wf3;
    }

    /* renamed from: K */
    public void mo37544K(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public List<?> mo37547i() {
        return this.f28022a.mo37547i();
    }

    public Iterator<String> iterator() {
        return new C5727b();
    }

    /* renamed from: j */
    public String get(int i) {
        return (String) this.f28022a.get(i);
    }

    /* renamed from: l */
    public wf3 mo37549l() {
        return this;
    }

    public ListIterator<String> listIterator(int i) {
        return new C5726a(i);
    }

    /* renamed from: m */
    public Object mo37550m(int i) {
        return this.f28022a.mo37550m(i);
    }

    public int size() {
        return this.f28022a.size();
    }
}

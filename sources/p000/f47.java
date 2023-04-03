package p000;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: f47 */
/* compiled from: UnmodifiableLazyStringList */
public class f47 extends AbstractList<String> implements yf3, RandomAccess {

    /* renamed from: a */
    public final yf3 f28744a;

    /* renamed from: f47$a */
    /* compiled from: UnmodifiableLazyStringList */
    public class C5830a implements ListIterator<String> {

        /* renamed from: a */
        public ListIterator<String> f28745a;

        /* renamed from: d */
        public final /* synthetic */ int f28746d;

        public C5830a(int i) {
            this.f28746d = i;
            this.f28745a = f47.this.f28744a.listIterator(i);
        }

        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public String next() {
            return this.f28745a.next();
        }

        /* renamed from: c */
        public String previous() {
            return this.f28745a.previous();
        }

        /* renamed from: d */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f28745a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f28745a.hasPrevious();
        }

        public int nextIndex() {
            return this.f28745a.nextIndex();
        }

        public int previousIndex() {
            return this.f28745a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f47$b */
    /* compiled from: UnmodifiableLazyStringList */
    public class C5831b implements Iterator<String> {

        /* renamed from: a */
        public Iterator<String> f28748a;

        public C5831b() {
            this.f28748a = f47.this.f28744a.iterator();
        }

        /* renamed from: a */
        public String next() {
            return this.f28748a.next();
        }

        public boolean hasNext() {
            return this.f28748a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public f47(yf3 yf3) {
        this.f28744a = yf3;
    }

    /* renamed from: a1 */
    public void mo36058a1(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public List<?> mo36061i() {
        return this.f28744a.mo36061i();
    }

    public Iterator<String> iterator() {
        return new C5831b();
    }

    /* renamed from: j */
    public String get(int i) {
        return (String) this.f28744a.get(i);
    }

    /* renamed from: l */
    public yf3 mo36063l() {
        return this;
    }

    public ListIterator<String> listIterator(int i) {
        return new C5830a(i);
    }

    /* renamed from: m */
    public Object mo36064m(int i) {
        return this.f28744a.mo36064m(i);
    }

    public int size() {
        return this.f28744a.size();
    }
}

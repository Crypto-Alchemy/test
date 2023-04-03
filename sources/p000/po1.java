package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: po1 */
/* compiled from: ArrayMap.kt */
public final class po1 extends C7913mq {

    /* renamed from: a */
    public static final po1 f44076a = new po1();

    /* renamed from: po1$a */
    /* compiled from: ArrayMap.kt */
    public static final class C9182a implements Iterator, a93 {
        /* renamed from: a */
        public Void next() {
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public po1() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public int mo56310e() {
        return 0;
    }

    public Iterator iterator() {
        return new C9182a();
    }

    /* renamed from: k */
    public Void get(int i) {
        return null;
    }

    /* renamed from: n */
    public void mo56313j(int i, Void voidR) {
        vx2.m53591g(voidR, "value");
        throw new IllegalStateException();
    }
}

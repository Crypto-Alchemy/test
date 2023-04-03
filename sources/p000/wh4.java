package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: wh4 */
/* compiled from: ArrayMap.kt */
public final class wh4<T> extends C7913mq<T> {

    /* renamed from: a */
    public final T f45522a;

    /* renamed from: d */
    public final int f45523d;

    /* renamed from: wh4$a */
    /* compiled from: ArrayMap.kt */
    public static final class C9518a implements Iterator<T>, a93 {

        /* renamed from: a */
        public boolean f45524a = true;

        /* renamed from: d */
        public final /* synthetic */ wh4<T> f45525d;

        public C9518a(wh4<T> wh4) {
            this.f45525d = wh4;
        }

        public boolean hasNext() {
            return this.f45524a;
        }

        public T next() {
            if (this.f45524a) {
                this.f45524a = false;
                return this.f45525d.mo66706n();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wh4(T t, int i) {
        super((DefaultConstructorMarker) null);
        vx2.m53591g(t, "value");
        this.f45522a = t;
        this.f45523d = i;
    }

    /* renamed from: e */
    public int mo56310e() {
        return 1;
    }

    public T get(int i) {
        if (i == this.f45523d) {
            return this.f45522a;
        }
        return null;
    }

    public Iterator<T> iterator() {
        return new C9518a(this);
    }

    /* renamed from: j */
    public void mo56313j(int i, T t) {
        vx2.m53591g(t, "value");
        throw new IllegalStateException();
    }

    /* renamed from: k */
    public final int mo66705k() {
        return this.f45523d;
    }

    /* renamed from: n */
    public final T mo66706n() {
        return this.f45522a;
    }
}

package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H$J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0004J\b\u0010\r\u001a\u00020\u0003H\u0002R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lkotlin/collections/a;", "T", "", "", "hasNext", "next", "()Ljava/lang/Object;", "Lr37;", "a", "value", "c", "(Ljava/lang/Object;)V", "b", "d", "Lkotlin/collections/State;", "Lkotlin/collections/State;", "state", "Ljava/lang/Object;", "nextValue", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: kotlin.collections.a */
/* compiled from: AbstractIterator.kt */
public abstract class C6175a<T> implements Iterator<T>, a93 {

    /* renamed from: a */
    public State f30966a = State.NotReady;

    /* renamed from: d */
    public T f30967d;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: kotlin.collections.a$a */
    /* compiled from: AbstractIterator.kt */
    public /* synthetic */ class C6176a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30968a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                kotlin.collections.State[] r0 = kotlin.collections.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.collections.State r1 = kotlin.collections.State.Done     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlin.collections.State r1 = kotlin.collections.State.Ready     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f30968a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C6175a.C6176a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public abstract void mo29842a();

    /* renamed from: b */
    public final void mo45012b() {
        this.f30966a = State.Done;
    }

    /* renamed from: c */
    public final void mo45013c(T t) {
        this.f30967d = t;
        this.f30966a = State.Ready;
    }

    /* renamed from: d */
    public final boolean mo45014d() {
        this.f30966a = State.Failed;
        mo29842a();
        if (this.f30966a == State.Ready) {
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        boolean z;
        State state = this.f30966a;
        if (state != State.Failed) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = C6176a.f30968a[state.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return mo45014d();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public T next() {
        if (hasNext()) {
            this.f30966a = State.NotReady;
            return this.f30967d;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

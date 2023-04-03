package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b(\u0010)J\t\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\tJ\b\u0010\u0013\u001a\u00020\u0012H\u0002R\u001a\u0010\u0017\u001a\u00060\u0014j\u0002`\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u0018\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, mo44877d2 = {"Liw5;", "T", "Ljw5;", "", "Lns0;", "Lr37;", "", "hasNext", "next", "()Ljava/lang/Object;", "value", "a", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "c", "", "b", "", "Lkotlin/sequences/State;", "I", "state", "d", "Ljava/lang/Object;", "nextValue", "e", "Ljava/util/Iterator;", "nextIterator", "g", "Lns0;", "getNextStep", "()Lns0;", "(Lns0;)V", "nextStep", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: iw5 */
/* compiled from: SequenceBuilder.kt */
public final class iw5<T> extends jw5<T> implements Iterator<T>, ns0<r37>, a93 {

    /* renamed from: a */
    public int f38525a;

    /* renamed from: d */
    public T f38526d;

    /* renamed from: e */
    public Iterator<? extends T> f38527e;

    /* renamed from: g */
    public ns0<? super r37> f38528g;

    /* renamed from: a */
    public Object mo52541a(T t, ns0<? super r37> ns0) {
        this.f38526d = t;
        this.f38525a = 3;
        this.f38528g = ns0;
        Object d = wx2.m54101d();
        if (d == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        if (d == wx2.m54101d()) {
            return d;
        }
        return r37.f33317a;
    }

    /* renamed from: b */
    public final Throwable mo52542b() {
        int i = this.f38525a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f38525a);
    }

    /* renamed from: c */
    public final T mo52543c() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    public final void mo52544d(ns0<? super r37> ns0) {
        this.f38528g = ns0;
    }

    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.f38525a;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.f38527e;
                    vx2.m53588d(it);
                    if (it.hasNext()) {
                        this.f38525a = 2;
                        return true;
                    }
                    this.f38527e = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw mo52542b();
                }
            }
            this.f38525a = 5;
            ns0<? super r37> ns0 = this.f38528g;
            vx2.m53588d(ns0);
            this.f38528g = null;
            Result.C6167a aVar = Result.Companion;
            ns0.resumeWith(Result.m75635constructorimpl(r37.f33317a));
        }
    }

    public T next() {
        int i = this.f38525a;
        if (i == 0 || i == 1) {
            return mo52543c();
        }
        if (i == 2) {
            this.f38525a = 1;
            Iterator<? extends T> it = this.f38527e;
            vx2.m53588d(it);
            return it.next();
        } else if (i == 3) {
            this.f38525a = 0;
            T t = this.f38526d;
            this.f38526d = null;
            return t;
        } else {
            throw mo52542b();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void resumeWith(Object obj) {
        hg5.m45199b(obj);
        this.f38525a = 4;
    }
}

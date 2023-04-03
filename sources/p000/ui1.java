package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0003¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0001J\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0003R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, mo44877d2 = {"Lui1;", "Lkotlin/coroutines/CoroutineContext;", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$a;", "operation", "fold", "(Ljava/lang/Object;Lfd2;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/CoroutineContext$b;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$a;", "minusKey", "context", "plus", "", "a", "Ljava/lang/Throwable;", "e", "originalContext", "<init>", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: ui1 */
/* compiled from: SafeCollector.kt */
public final class ui1 implements CoroutineContext {

    /* renamed from: a */
    public final Throwable f45078a;

    /* renamed from: d */
    public final /* synthetic */ CoroutineContext f45079d;

    public ui1(Throwable th, CoroutineContext coroutineContext) {
        this.f45078a = th;
        this.f45079d = coroutineContext;
    }

    public <R> R fold(R r, fd2<? super R, ? super CoroutineContext.C6188a, ? extends R> fd2) {
        return this.f45079d.fold(r, fd2);
    }

    public <E extends CoroutineContext.C6188a> E get(CoroutineContext.C6190b<E> bVar) {
        return this.f45079d.get(bVar);
    }

    public CoroutineContext minusKey(CoroutineContext.C6190b<?> bVar) {
        return this.f45079d.minusKey(bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f45079d.plus(coroutineContext);
    }
}

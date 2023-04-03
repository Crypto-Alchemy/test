package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, mo44877d2 = {"Lz5;", "Lkotlin/coroutines/CoroutineContext$a;", "Lkotlin/coroutines/CoroutineContext$b;", "a", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "<init>", "(Lkotlin/coroutines/CoroutineContext$b;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: z5 */
/* compiled from: CoroutineContextImpl.kt */
public abstract class C6754z5 implements CoroutineContext.C6188a {

    /* renamed from: a */
    public final CoroutineContext.C6190b<?> f35993a;

    public C6754z5(CoroutineContext.C6190b<?> bVar) {
        vx2.m53591g(bVar, "key");
        this.f35993a = bVar;
    }

    public <R> R fold(R r, fd2<? super R, ? super CoroutineContext.C6188a, ? extends R> fd2) {
        return CoroutineContext.C6188a.C6189a.m47418a(this, r, fd2);
    }

    public <E extends CoroutineContext.C6188a> E get(CoroutineContext.C6190b<E> bVar) {
        return CoroutineContext.C6188a.C6189a.m47419b(this, bVar);
    }

    public CoroutineContext.C6190b<?> getKey() {
        return this.f35993a;
    }

    public CoroutineContext minusKey(CoroutineContext.C6190b<?> bVar) {
        return CoroutineContext.C6188a.C6189a.m47420c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.C6188a.C6189a.m47421d(this, coroutineContext);
    }
}

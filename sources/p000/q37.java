package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, mo44877d2 = {"Lq37;", "Lkotlin/coroutines/CoroutineContext$a;", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: q37 */
/* compiled from: CoroutineContext.kt */
public final class q37 implements CoroutineContext.C6188a, CoroutineContext.C6190b<q37> {

    /* renamed from: a */
    public static final q37 f44150a = new q37();

    public <R> R fold(R r, fd2<? super R, ? super CoroutineContext.C6188a, ? extends R> fd2) {
        return CoroutineContext.C6188a.C6189a.m47418a(this, r, fd2);
    }

    public <E extends CoroutineContext.C6188a> E get(CoroutineContext.C6190b<E> bVar) {
        return CoroutineContext.C6188a.C6189a.m47419b(this, bVar);
    }

    public CoroutineContext.C6190b<?> getKey() {
        return this;
    }

    public CoroutineContext minusKey(CoroutineContext.C6190b<?> bVar) {
        return CoroutineContext.C6188a.C6189a.m47420c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.C6188a.C6189a.m47421d(this, coroutineContext);
    }
}

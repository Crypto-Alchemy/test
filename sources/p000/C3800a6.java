package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.C6188a;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0018\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, mo44877d2 = {"La6;", "Lkotlin/coroutines/CoroutineContext$a;", "B", "E", "Lkotlin/coroutines/CoroutineContext$b;", "element", "b", "(Lkotlin/coroutines/CoroutineContext$a;)Lkotlin/coroutines/CoroutineContext$a;", "key", "", "a", "(Lkotlin/coroutines/CoroutineContext$b;)Z", "Lkotlin/Function1;", "Lrc2;", "safeCast", "d", "Lkotlin/coroutines/CoroutineContext$b;", "topmostKey", "baseKey", "<init>", "(Lkotlin/coroutines/CoroutineContext$b;Lrc2;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: a6 */
/* compiled from: CoroutineContextImpl.kt */
public abstract class C3800a6<B extends CoroutineContext.C6188a, E extends B> implements CoroutineContext.C6190b<E> {

    /* renamed from: a */
    public final rc2<CoroutineContext.C6188a, E> f20818a;

    /* renamed from: d */
    public final CoroutineContext.C6190b<?> f20819d;

    public C3800a6(CoroutineContext.C6190b<B> bVar, rc2<? super CoroutineContext.C6188a, ? extends E> rc2) {
        vx2.m53591g(bVar, "baseKey");
        vx2.m53591g(rc2, "safeCast");
        this.f20818a = rc2;
        this.f20819d = bVar instanceof C3800a6 ? ((C3800a6) bVar).f20819d : bVar;
    }

    /* renamed from: a */
    public final boolean mo28881a(CoroutineContext.C6190b<?> bVar) {
        vx2.m53591g(bVar, "key");
        if (bVar == this || this.f20819d == bVar) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final E mo28882b(CoroutineContext.C6188a aVar) {
        vx2.m53591g(aVar, "element");
        return (CoroutineContext.C6188a) this.f20818a.invoke(aVar);
    }
}

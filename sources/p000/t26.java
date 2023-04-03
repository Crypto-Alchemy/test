package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001d\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, mo44877d2 = {"Lt26;", "T", "Ls26;", "Lhu0;", "Liu5;", "", "cause", "", "z", "element", "Lr37;", "u", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "a", "Liu5;", "getChannel", "()Liu5;", "channel", "Lkotlin/coroutines/CoroutineContext;", "A", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "scope", "<init>", "(Lhu0;Liu5;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: t26 */
/* compiled from: SimpleChannelFlow.kt */
public final class t26<T> implements s26<T>, hu0, iu5<T> {

    /* renamed from: a */
    public final iu5<T> f17876a;

    /* renamed from: d */
    public final /* synthetic */ hu0 f17877d;

    public t26(hu0 hu0, iu5<? super T> iu5) {
        vx2.m53591g(hu0, "scope");
        vx2.m53591g(iu5, "channel");
        this.f17877d = hu0;
        this.f17876a = iu5;
    }

    /* renamed from: A */
    public CoroutineContext mo6303A() {
        return this.f17877d.mo6303A();
    }

    /* renamed from: u */
    public Object mo26027u(T t, ns0<? super r37> ns0) {
        return this.f17876a.mo26027u(t, ns0);
    }

    /* renamed from: z */
    public boolean mo26028z(Throwable th) {
        return this.f17876a.mo26028z(th);
    }
}

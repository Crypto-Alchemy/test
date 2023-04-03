package p000;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001aJ\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H@ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t\u001a\u001c\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo44877d2 = {"Lhu0;", "b", "R", "Lkotlin/Function2;", "Lns0;", "", "block", "e", "(Lfd2;Lns0;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lr37;", "c", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: iu0 */
/* compiled from: CoroutineScope.kt */
public final class iu0 {
    /* renamed from: a */
    public static final hu0 m59111a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(y23.f46117l) == null) {
            coroutineContext = coroutineContext.plus(i33.m58814b((y23) null, 1, (Object) null));
        }
        return new gs0(coroutineContext);
    }

    /* renamed from: b */
    public static final hu0 m59112b() {
        return new gs0(qd6.m71250b((y23) null, 1, (Object) null).plus(qh1.m71266c()));
    }

    /* renamed from: c */
    public static final void m59113c(hu0 hu0, CancellationException cancellationException) {
        y23 y23 = (y23) hu0.mo6303A().get(y23.f46117l);
        if (y23 != null) {
            y23.mo52179c(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + hu0).toString());
    }

    /* renamed from: d */
    public static /* synthetic */ void m59114d(hu0 hu0, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m59113c(hu0, cancellationException);
    }

    /* renamed from: e */
    public static final <R> Object m59115e(fd2<? super hu0, ? super ns0<? super R>, ? extends Object> fd2, ns0<? super R> ns0) {
        jn5 jn5 = new jn5(ns0.getContext(), ns0);
        Object c = p37.m70907c(jn5, jn5, fd2);
        if (c == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        return c;
    }
}

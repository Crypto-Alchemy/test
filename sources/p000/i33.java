package p000;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import p000.y23;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0017\u0010\b\u001a\u00020\u0007*\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000e\u001a\u00020\u0007*\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u001a\n\u0010\u000f\u001a\u00020\u0007*\u00020\u0000\u001a\n\u0010\u0010\u001a\u00020\u0007*\u00020\n\u001a\u001e\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0013\"\u0015\u0010\u0018\u001a\u00020\u0015*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u001b\u001a\u00020\u0000*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo44877d2 = {"Ly23;", "parent", "Lhm0;", "a", "Lzh1;", "handle", "h", "Lr37;", "g", "(Ly23;Lns0;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "d", "i", "j", "", "message", "", "c", "", "l", "(Lkotlin/coroutines/CoroutineContext;)Z", "isActive", "k", "(Lkotlin/coroutines/CoroutineContext;)Ly23;", "job", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/JobKt")
/* renamed from: i33 */
/* compiled from: Job.kt */
public final /* synthetic */ class i33 {
    /* renamed from: a */
    public static final hm0 m58813a(y23 y23) {
        return new a33(y23);
    }

    /* renamed from: b */
    public static /* synthetic */ hm0 m58814b(y23 y23, int i, Object obj) {
        if ((i & 1) != 0) {
            y23 = null;
        }
        return g33.m58004a(y23);
    }

    /* renamed from: c */
    public static final void m58815c(y23 y23, String str, Throwable th) {
        y23.mo52179c(pu1.m71118a(str, th));
    }

    /* renamed from: d */
    public static final void m58816d(CoroutineContext coroutineContext, CancellationException cancellationException) {
        y23 y23 = (y23) coroutineContext.get(y23.f46117l);
        if (y23 != null) {
            y23.mo52179c(cancellationException);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m58817e(y23 y23, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        g33.m58006c(y23, str, th);
    }

    /* renamed from: f */
    public static /* synthetic */ void m58818f(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        g33.m58007d(coroutineContext, cancellationException);
    }

    /* renamed from: g */
    public static final Object m58819g(y23 y23, ns0<? super r37> ns0) {
        y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        Object g = y23.mo55508g(ns0);
        if (g == wx2.m54101d()) {
            return g;
        }
        return r37.f33317a;
    }

    /* renamed from: h */
    public static final zh1 m58820h(y23 y23, zh1 zh1) {
        return y23.mo55519p(new ei1(zh1));
    }

    /* renamed from: i */
    public static final void m58821i(y23 y23) {
        if (!y23.mo55502a()) {
            throw y23.mo55510h();
        }
    }

    /* renamed from: j */
    public static final void m58822j(CoroutineContext coroutineContext) {
        y23 y23 = (y23) coroutineContext.get(y23.f46117l);
        if (y23 != null) {
            g33.m58013j(y23);
        }
    }

    /* renamed from: k */
    public static final y23 m58823k(CoroutineContext coroutineContext) {
        y23 y23 = (y23) coroutineContext.get(y23.f46117l);
        if (y23 != null) {
            return y23;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    /* renamed from: l */
    public static final boolean m58824l(CoroutineContext coroutineContext) {
        y23 y23 = (y23) coroutineContext.get(y23.f46117l);
        if (y23 == null || !y23.mo55502a()) {
            return false;
        }
        return true;
    }
}

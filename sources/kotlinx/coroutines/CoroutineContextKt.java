package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0002\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0002\u001a(\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0013\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u00020\u0011H\u0010\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, mo44877d2 = {"Lhu0;", "Lkotlin/coroutines/CoroutineContext;", "context", "d", "addedContext", "e", "", "c", "originalContext", "appendContext", "isNewCoroutine", "a", "Lns0;", "", "oldValue", "Lo37;", "g", "Lju0;", "f", "", "b", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* compiled from: CoroutineContext.kt */
public final class CoroutineContextKt {
    /* renamed from: a */
    public static final CoroutineContext m63130a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        boolean c = m63132c(coroutineContext);
        boolean c2 = m63132c(coroutineContext2);
        if (!c && !c2) {
            return coroutineContext.plus(coroutineContext2);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new CoroutineContextKt$foldCopies$folded$1(ref$ObjectRef, z));
        if (c2) {
            ref$ObjectRef.element = ((CoroutineContext) ref$ObjectRef.element).fold(emptyCoroutineContext, CoroutineContextKt$foldCopies$1.INSTANCE);
        }
        return coroutineContext3.plus((CoroutineContext) ref$ObjectRef.element);
    }

    /* renamed from: b */
    public static final String m63131b(CoroutineContext coroutineContext) {
        return null;
    }

    /* renamed from: c */
    public static final boolean m63132c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, CoroutineContextKt$hasCopyableElements$1.INSTANCE)).booleanValue();
    }

    /* renamed from: d */
    public static final CoroutineContext m63133d(hu0 hu0, CoroutineContext coroutineContext) {
        CoroutineContext a = m63130a(hu0.mo6303A(), coroutineContext, true);
        if (a == qh1.m71264a() || a.get(ps0.f32794h) != null) {
            return a;
        }
        return a.plus(qh1.m71264a());
    }

    /* renamed from: e */
    public static final CoroutineContext m63134e(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        if (!m63132c(coroutineContext2)) {
            return coroutineContext.plus(coroutineContext2);
        }
        return m63130a(coroutineContext, coroutineContext2, false);
    }

    /* renamed from: f */
    public static final o37<?> m63135f(ju0 ju0) {
        while (!(ju0 instanceof C7759c) && (ju0 = ju0.getCallerFrame()) != null) {
            if (ju0 instanceof o37) {
                return (o37) ju0;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final o37<?> m63136g(ns0<?> ns0, CoroutineContext coroutineContext, Object obj) {
        boolean z;
        if (!(ns0 instanceof ju0)) {
            return null;
        }
        if (coroutineContext.get(q37.f44150a) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        o37<?> f = m63135f((ju0) ns0);
        if (f != null) {
            f.mo62832V0(coroutineContext, obj);
        }
        return f;
    }
}

package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.internal.UndispatchedContextCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a]\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo44877d2 = {"T", "La52;", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "d", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lns0;", "block", "b", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lfd2;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: kd0 */
/* compiled from: ChannelFlow.kt */
public final class kd0 {
    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static final <T, V> Object m59740b(CoroutineContext coroutineContext, V v, Object obj, fd2<? super V, ? super ns0<? super T>, ? extends Object> fd2, ns0<? super T> ns0) {
        Object c = ThreadContextKt.m63497c(coroutineContext, obj);
        try {
            Object invoke = ((fd2) t07.m52027f(fd2, 2)).invoke(v, new u76(ns0, coroutineContext));
            ThreadContextKt.m63495a(coroutineContext, c);
            if (invoke == wx2.m54101d()) {
                a31.m31656c(ns0);
            }
            return invoke;
        } catch (Throwable th) {
            ThreadContextKt.m63495a(coroutineContext, c);
            throw th;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Object m59741c(CoroutineContext coroutineContext, Object obj, Object obj2, fd2 fd2, ns0 ns0, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = ThreadContextKt.m63496b(coroutineContext);
        }
        return m59740b(coroutineContext, obj, obj2, fd2, ns0);
    }

    /* renamed from: d */
    public static final <T> a52<T> m59742d(a52<? super T> a52, CoroutineContext coroutineContext) {
        boolean z;
        if (a52 instanceof gv5) {
            z = true;
        } else {
            z = a52 instanceof o84;
        }
        if (z) {
            return a52;
        }
        return new UndispatchedContextCollector(a52, coroutineContext);
    }
}

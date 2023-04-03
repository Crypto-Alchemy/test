package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f**\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0011"}, mo44877d2 = {"E", "Lkotlin/Function1;", "Lr37;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "undeliveredElementException", "c", "(Lrc2;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException;", "Lkotlin/coroutines/CoroutineContext;", "context", "b", "(Lrc2;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "", "a", "(Lrc2;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)Lrc2;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* compiled from: OnUndeliveredElement.kt */
public final class OnUndeliveredElementKt {
    /* renamed from: a */
    public static final <E> rc2<Throwable, r37> m63491a(rc2<? super E, r37> rc2, E e, CoroutineContext coroutineContext) {
        return new OnUndeliveredElementKt$bindCancellationFun$1(rc2, e, coroutineContext);
    }

    /* renamed from: b */
    public static final <E> void m63492b(rc2<? super E, r37> rc2, E e, CoroutineContext coroutineContext) {
        UndeliveredElementException c = m63493c(rc2, e, (UndeliveredElementException) null);
        if (c != null) {
            gu0.m58254a(coroutineContext, c);
        }
    }

    /* renamed from: c */
    public static final <E> UndeliveredElementException m63493c(rc2<? super E, r37> rc2, E e, UndeliveredElementException undeliveredElementException) {
        try {
            rc2.invoke(e);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e, th);
            }
            ru1.m51326a(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    /* renamed from: d */
    public static /* synthetic */ UndeliveredElementException m63494d(rc2 rc2, Object obj, UndeliveredElementException undeliveredElementException, int i, Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return m63493c(rc2, obj, undeliveredElementException);
    }
}

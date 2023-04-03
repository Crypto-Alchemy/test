package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aF\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aZ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, mo44877d2 = {"T", "Lkotlin/Function1;", "Lns0;", "", "completion", "Lr37;", "a", "(Lrc2;Lns0;)Lns0;", "R", "Lkotlin/Function2;", "receiver", "b", "(Lfd2;Ljava/lang/Object;Lns0;)Lns0;", "c", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
/* compiled from: IntrinsicsJvm.kt */
public class IntrinsicsKt__IntrinsicsJvmKt {
    /* renamed from: a */
    public static final <T> ns0<r37> m47423a(rc2<? super ns0<? super T>, ? extends Object> rc2, ns0<? super T> ns0) {
        vx2.m53591g(rc2, "<this>");
        vx2.m53591g(ns0, "completion");
        ns0<? super T> a = a31.m31654a(ns0);
        if (rc2 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) rc2).create(a);
        }
        CoroutineContext context = a.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new C6191xa50de660(a, rc2);
        }
        return new C6192xa50de661(a, context, rc2);
    }

    /* renamed from: b */
    public static final <R, T> ns0<r37> m47424b(fd2<? super R, ? super ns0<? super T>, ? extends Object> fd2, R r, ns0<? super T> ns0) {
        vx2.m53591g(fd2, "<this>");
        vx2.m53591g(ns0, "completion");
        ns0<? super T> a = a31.m31654a(ns0);
        if (fd2 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) fd2).create(r, a);
        }
        CoroutineContext context = a.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new C6193xa50de662(a, fd2, r);
        }
        return new C6194xa50de663(a, context, fd2, r);
    }

    /* renamed from: c */
    public static final <T> ns0<T> m47425c(ns0<? super T> ns0) {
        ContinuationImpl continuationImpl;
        ns0<Object> intercepted;
        vx2.m53591g(ns0, "<this>");
        if (ns0 instanceof ContinuationImpl) {
            continuationImpl = (ContinuationImpl) ns0;
        } else {
            continuationImpl = null;
        }
        if (continuationImpl == null || (intercepted = continuationImpl.intercepted()) == null) {
            return ns0;
        }
        return intercepted;
    }
}

package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0018\u0010\t\u001a\u00020\u0006*\u00020\u00058@X\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, mo44877d2 = {"", "timeMillis", "Lr37;", "a", "(JLns0;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "Lib1;", "b", "(Lkotlin/coroutines/CoroutineContext;)Lib1;", "delay", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: jb1 */
/* compiled from: Delay.kt */
public final class jb1 {
    /* renamed from: a */
    public static final Object m59336a(long j, ns0<? super r37> ns0) {
        if (j <= 0) {
            return r37.f33317a;
        }
        na0 na0 = new na0(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0), 1);
        na0.mo56425x();
        if (j < Long.MAX_VALUE) {
            m59337b(na0.getContext()).mo51194f(j, na0);
        }
        Object s = na0.mo56421s();
        if (s == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        if (s == wx2.m54101d()) {
            return s;
        }
        return r37.f33317a;
    }

    /* renamed from: b */
    public static final ib1 m59337b(CoroutineContext coroutineContext) {
        ib1 ib1;
        CoroutineContext.C6188a aVar = coroutineContext.get(ps0.f32794h);
        if (aVar instanceof ib1) {
            ib1 = (ib1) aVar;
        } else {
            ib1 = null;
        }
        if (ib1 == null) {
            return x71.m73886a();
        }
        return ib1;
    }
}

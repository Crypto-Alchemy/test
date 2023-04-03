package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR9\u0010\u0010\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo44877d2 = {"Lkotlinx/coroutines/flow/SubscribedFlowCollector;", "T", "La52;", "value", "Lr37;", "emit", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "a", "(Lns0;)Ljava/lang/Object;", "La52;", "collector", "Lkotlin/Function2;", "Lns0;", "", "d", "Lfd2;", "action", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Share.kt */
public final class SubscribedFlowCollector<T> implements a52<T> {

    /* renamed from: a */
    public final a52<T> f40450a;

    /* renamed from: d */
    public final fd2<a52<? super T>, ns0<? super r37>, Object> f40451d;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo55663a(p000.ns0<? super p000.r37> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p000.hg5.m45199b(r7)
            goto L_0x0077
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.internal.SafeCollector r2 = (kotlinx.coroutines.flow.internal.SafeCollector) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.SubscribedFlowCollector r4 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r4
            p000.hg5.m45199b(r7)     // Catch:{ all -> 0x007d }
            goto L_0x005e
        L_0x0040:
            p000.hg5.m45199b(r7)
            kotlinx.coroutines.flow.internal.SafeCollector r2 = new kotlinx.coroutines.flow.internal.SafeCollector
            a52<T> r7 = r6.f40450a
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r2.<init>(r7, r5)
            fd2<a52<? super T>, ns0<? super r37>, java.lang.Object> r7 = r6.f40451d     // Catch:{ all -> 0x007d }
            r0.L$0 = r6     // Catch:{ all -> 0x007d }
            r0.L$1 = r2     // Catch:{ all -> 0x007d }
            r0.label = r4     // Catch:{ all -> 0x007d }
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch:{ all -> 0x007d }
            if (r7 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r4 = r6
        L_0x005e:
            r2.releaseIntercepted()
            a52<T> r7 = r4.f40450a
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector
            if (r2 == 0) goto L_0x007a
            kotlinx.coroutines.flow.SubscribedFlowCollector r7 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r7
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r7.mo55663a(r0)
            if (r7 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r37 r7 = p000.r37.f33317a
            return r7
        L_0x007a:
            r37 r7 = p000.r37.f33317a
            return r7
        L_0x007d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedFlowCollector.mo55663a(ns0):java.lang.Object");
    }

    public Object emit(T t, ns0<? super r37> ns0) {
        return this.f40450a.emit(t, ns0);
    }
}

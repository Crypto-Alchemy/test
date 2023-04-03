package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aH\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0012\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00060\nH\u0000\"\u001a\u0010\u0012\u001a\u00020\r8\u0002X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0014\u001a\u00020\r8\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u0012\u0004\b\u0013\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo44877d2 = {"T", "Lns0;", "Lkotlin/Result;", "result", "Lkotlin/Function1;", "", "Lr37;", "onCancellation", "b", "(Lns0;Ljava/lang/Object;Lrc2;)V", "Llh1;", "", "d", "Lxj6;", "a", "Lxj6;", "getUNDEFINED$annotations", "()V", "UNDEFINED", "getREUSABLE_CLAIMED$annotations", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: mh1 */
/* compiled from: DispatchedContinuation.kt */
public final class mh1 {

    /* renamed from: a */
    public static final xj6 f40918a = new xj6("UNDEFINED");

    /* renamed from: b */
    public static final xj6 f40919b = new xj6("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (r8.mo62831U0() != false) goto L_0x0091;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m64329b(p000.ns0<? super T> r6, java.lang.Object r7, p000.rc2<? super java.lang.Throwable, p000.r37> r8) {
        /*
            boolean r0 = r6 instanceof p000.lh1
            if (r0 == 0) goto L_0x00b6
            lh1 r6 = (p000.lh1) r6
            java.lang.Object r8 = p000.om0.m70401c(r7, r8)
            kotlinx.coroutines.CoroutineDispatcher r0 = r6.f40619g
            kotlin.coroutines.CoroutineContext r1 = r6.getContext()
            boolean r0 = r0.mo28541z(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f40621r = r8
            r6.f43474e = r1
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.f40619g
            kotlin.coroutines.CoroutineContext r8 = r6.getContext()
            r7.mo3894m(r8, r6)
            goto L_0x00b9
        L_0x0026:
            ip6 r0 = p000.ip6.f38501a
            nt1 r0 = r0.mo52519b()
            boolean r2 = r0.mo62803W()
            if (r2 == 0) goto L_0x003b
            r6.f40621r = r8
            r6.f43474e = r1
            r0.mo62801O(r6)
            goto L_0x00b9
        L_0x003b:
            r0.mo62802Q(r1)
            r2 = 0
            kotlin.coroutines.CoroutineContext r3 = r6.getContext()     // Catch:{ all -> 0x00a9 }
            y23$b r4 = p000.y23.f46117l     // Catch:{ all -> 0x00a9 }
            kotlin.coroutines.CoroutineContext$a r3 = r3.get(r4)     // Catch:{ all -> 0x00a9 }
            y23 r3 = (p000.y23) r3     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x0069
            boolean r4 = r3.mo55502a()     // Catch:{ all -> 0x00a9 }
            if (r4 != 0) goto L_0x0069
            java.util.concurrent.CancellationException r3 = r3.mo55510h()     // Catch:{ all -> 0x00a9 }
            r6.mo55894a(r8, r3)     // Catch:{ all -> 0x00a9 }
            kotlin.Result$a r8 = kotlin.Result.Companion     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = p000.hg5.m45198a(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = kotlin.Result.m75635constructorimpl(r8)     // Catch:{ all -> 0x00a9 }
            r6.resumeWith(r8)     // Catch:{ all -> 0x00a9 }
            r8 = r1
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            if (r8 != 0) goto L_0x00a2
            ns0<T> r8 = r6.f40620k     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = r6.f40622s     // Catch:{ all -> 0x00a9 }
            kotlin.coroutines.CoroutineContext r4 = r8.getContext()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.m63497c(r4, r3)     // Catch:{ all -> 0x00a9 }
            xj6 r5 = kotlinx.coroutines.internal.ThreadContextKt.f40474a     // Catch:{ all -> 0x00a9 }
            if (r3 == r5) goto L_0x0081
            o37 r8 = kotlinx.coroutines.CoroutineContextKt.m63136g(r8, r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x0082
        L_0x0081:
            r8 = r2
        L_0x0082:
            ns0<T> r5 = r6.f40620k     // Catch:{ all -> 0x0095 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x0095 }
            r37 r7 = p000.r37.f33317a     // Catch:{ all -> 0x0095 }
            if (r8 == 0) goto L_0x0091
            boolean r7 = r8.mo62831U0()     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x00a2
        L_0x0091:
            kotlinx.coroutines.internal.ThreadContextKt.m63495a(r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a2
        L_0x0095:
            r7 = move-exception
            if (r8 == 0) goto L_0x009e
            boolean r8 = r8.mo62831U0()     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x00a1
        L_0x009e:
            kotlinx.coroutines.internal.ThreadContextKt.m63495a(r4, r3)     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            boolean r7 = r0.mo62805b0()     // Catch:{ all -> 0x00a9 }
            if (r7 != 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a9:
            r7 = move-exception
            r6.mo62687e(r7, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r0.mo62799K(r1)
            goto L_0x00b9
        L_0x00b1:
            r6 = move-exception
            r0.mo62799K(r1)
            throw r6
        L_0x00b6:
            r6.resumeWith(r7)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mh1.m64329b(ns0, java.lang.Object, rc2):void");
    }

    /* renamed from: c */
    public static /* synthetic */ void m64330c(ns0 ns0, Object obj, rc2 rc2, int i, Object obj2) {
        if ((i & 2) != 0) {
            rc2 = null;
        }
        m64329b(ns0, obj, rc2);
    }

    /* renamed from: d */
    public static final boolean m64331d(lh1<? super r37> lh1) {
        r37 r37 = r37.f33317a;
        nt1 b = ip6.f38501a.mo52519b();
        if (b.mo62804X()) {
            return false;
        }
        if (b.mo62803W()) {
            lh1.f40621r = r37;
            lh1.f43474e = 1;
            b.mo62801O(lh1);
            return true;
        }
        b.mo62802Q(true);
        try {
            lh1.run();
            do {
            } while (b.mo62805b0());
        } catch (Throwable th) {
            b.mo62799K(true);
            throw th;
        }
        b.mo62799K(true);
        return false;
    }
}

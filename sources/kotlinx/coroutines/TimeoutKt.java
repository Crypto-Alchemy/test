package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H@ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a\\\u0010\u000e\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0011H\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, mo44877d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "Lhu0;", "Lns0;", "", "block", "c", "(JLfd2;Lns0;)Ljava/lang/Object;", "d", "U", "Lrq6;", "coroutine", "b", "(Lrq6;Lfd2;)Ljava/lang/Object;", "time", "Ly23;", "Lkotlinx/coroutines/TimeoutCancellationException;", "a", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* compiled from: Timeout.kt */
public final class TimeoutKt {
    /* renamed from: a */
    public static final TimeoutCancellationException m63230a(long j, y23 y23) {
        return new TimeoutCancellationException("Timed out waiting for " + j + " ms", y23);
    }

    /* renamed from: b */
    public static final <U, T extends U> Object m63231b(rq6<U, ? super T> rq6, fd2<? super hu0, ? super ns0<? super T>, ? extends Object> fd2) {
        g33.m58012i(rq6, jb1.m59337b(rq6.f38749e.getContext()).mo51195i(rq6.f44445g, rq6, rq6.getContext()));
        return p37.m70908d(rq6, rq6, fd2);
    }

    /* renamed from: c */
    public static final <T> Object m63232c(long j, fd2<? super hu0, ? super ns0<? super T>, ? extends Object> fd2, ns0<? super T> ns0) {
        if (j > 0) {
            Object b = m63231b(new rq6(j, ns0), fd2);
            if (b == wx2.m54101d()) {
                a31.m31656c(ns0);
            }
            return b;
        }
        throw new TimeoutCancellationException("Timed out immediately");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m63233d(long r7, p000.fd2<? super p000.hu0, ? super p000.ns0<? super T>, ? extends java.lang.Object> r9, p000.ns0<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            java.lang.Object r8 = r0.L$0
            fd2 r8 = (p000.fd2) r8
            p000.hg5.m45199b(r10)     // Catch:{ TimeoutCancellationException -> 0x0032 }
            goto L_0x006b
        L_0x0032:
            r8 = move-exception
            goto L_0x006e
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            p000.hg5.m45199b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x0046
            return r3
        L_0x0046:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.L$0 = r9     // Catch:{ TimeoutCancellationException -> 0x006c }
            r0.L$1 = r10     // Catch:{ TimeoutCancellationException -> 0x006c }
            r0.J$0 = r7     // Catch:{ TimeoutCancellationException -> 0x006c }
            r0.label = r4     // Catch:{ TimeoutCancellationException -> 0x006c }
            rq6 r2 = new rq6     // Catch:{ TimeoutCancellationException -> 0x006c }
            r2.<init>(r7, r0)     // Catch:{ TimeoutCancellationException -> 0x006c }
            r10.element = r2     // Catch:{ TimeoutCancellationException -> 0x006c }
            java.lang.Object r7 = m63231b(r2, r9)     // Catch:{ TimeoutCancellationException -> 0x006c }
            java.lang.Object r8 = p000.wx2.m54101d()     // Catch:{ TimeoutCancellationException -> 0x006c }
            if (r7 != r8) goto L_0x0067
            p000.a31.m31656c(r0)     // Catch:{ TimeoutCancellationException -> 0x006c }
        L_0x0067:
            if (r7 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r10 = r7
        L_0x006b:
            return r10
        L_0x006c:
            r8 = move-exception
            r7 = r10
        L_0x006e:
            y23 r9 = r8.coroutine
            T r7 = r7.element
            if (r9 != r7) goto L_0x0075
            return r3
        L_0x0075:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.m63233d(long, fd2, ns0):java.lang.Object");
    }
}

package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aV\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012.\u0010\b\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0014\u001a\u00020\u0010*\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, mo44877d2 = {"T", "Lz42;", "Lkotlin/Function3;", "La52;", "", "Lns0;", "Lr37;", "", "action", "a", "(Lz42;Lid2;)Lz42;", "collector", "b", "(Lz42;La52;Lns0;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "c", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)Z", "other", "d", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/flow/FlowKt")
/* compiled from: Errors.kt */
public final /* synthetic */ class FlowKt__ErrorsKt {
    /* renamed from: a */
    public static final <T> z42<T> m63350a(z42<? extends T> z42, id2<? super a52<? super T>, ? super Throwable, ? super ns0<? super r37>, ? extends Object> id2) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(z42, id2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m63351b(p000.z42<? extends T> r4, p000.a52<? super T> r5, p000.ns0<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            p000.hg5.m45199b(r6)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r5 = move-exception
            goto L_0x0053
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            p000.hg5.m45199b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2     // Catch:{ all -> 0x0051 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x0051 }
            r0.L$0 = r6     // Catch:{ all -> 0x0051 }
            r0.label = r3     // Catch:{ all -> 0x0051 }
            java.lang.Object r4 = r4.mo8646a(r2, r0)     // Catch:{ all -> 0x0051 }
            if (r4 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4 = 0
            return r4
        L_0x0051:
            r5 = move-exception
            r4 = r6
        L_0x0053:
            T r4 = r4.element
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = m63353d(r5, r4)
            if (r6 != 0) goto L_0x0076
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            boolean r6 = m63352c(r5, r6)
            if (r6 != 0) goto L_0x0076
            if (r4 != 0) goto L_0x006a
            return r5
        L_0x006a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L_0x0072
            p000.ru1.m51326a(r4, r5)
            throw r4
        L_0x0072:
            p000.ru1.m51326a(r5, r4)
            throw r5
        L_0x0076:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.m63351b(z42, a52, ns0):java.lang.Object");
    }

    /* renamed from: c */
    public static final boolean m63352c(Throwable th, CoroutineContext coroutineContext) {
        y23 y23 = (y23) coroutineContext.get(y23.f46117l);
        if (y23 == null || !y23.isCancelled()) {
            return false;
        }
        return m63353d(th, y23.mo55510h());
    }

    /* renamed from: d */
    public static final boolean m63353d(Throwable th, Throwable th2) {
        if (th2 == null || !vx2.m53586b(th2, th)) {
            return false;
        }
        return true;
    }
}

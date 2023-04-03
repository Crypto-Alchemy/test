package p000;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.internal.ThreadContextKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014R*\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e0\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, mo44877d2 = {"Lo37;", "T", "Ljn5;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "oldValue", "Lr37;", "V0", "", "U0", "state", "P0", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "g", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "Lns0;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lns0;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: o37 */
/* compiled from: CoroutineContext.kt */
public final class o37<T> extends jn5<T> {

    /* renamed from: g */
    public ThreadLocal<Pair<CoroutineContext, Object>> f43583g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o37(kotlin.coroutines.CoroutineContext r3, p000.ns0<? super T> r4) {
        /*
            r2 = this;
            q37 r0 = p000.q37.f44150a
            kotlin.coroutines.CoroutineContext$a r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000d
            kotlin.coroutines.CoroutineContext r0 = r3.plus(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f43583g = r0
            kotlin.coroutines.CoroutineContext r4 = r4.getContext()
            ps0$b r0 = p000.ps0.f32794h
            kotlin.coroutines.CoroutineContext$a r4 = r4.get(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.CoroutineDispatcher
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.ThreadContextKt.m63497c(r3, r4)
            kotlinx.coroutines.internal.ThreadContextKt.m63495a(r3, r4)
            r2.mo62832V0(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.o37.<init>(kotlin.coroutines.CoroutineContext, ns0):void");
    }

    /* renamed from: P0 */
    public void mo52756P0(Object obj) {
        Pair pair = this.f43583g.get();
        o37<?> o37 = null;
        if (pair != null) {
            ThreadContextKt.m63495a((CoroutineContext) pair.component1(), pair.component2());
            this.f43583g.set(o37);
        }
        Object a = om0.m70399a(obj, this.f38749e);
        ns0<T> ns0 = this.f38749e;
        CoroutineContext context = ns0.getContext();
        Object c = ThreadContextKt.m63497c(context, o37);
        if (c != ThreadContextKt.f40474a) {
            o37 = CoroutineContextKt.m63136g(ns0, context, c);
        }
        try {
            this.f38749e.resumeWith(a);
            r37 r37 = r37.f33317a;
        } finally {
            if (o37 == null || o37.mo62831U0()) {
                ThreadContextKt.m63495a(context, c);
            }
        }
    }

    /* renamed from: U0 */
    public final boolean mo62831U0() {
        if (this.f43583g.get() == null) {
            return false;
        }
        this.f43583g.set((Object) null);
        return true;
    }

    /* renamed from: V0 */
    public final void mo62832V0(CoroutineContext coroutineContext, Object obj) {
        this.f43583g.set(wy6.m54142a(coroutineContext, obj));
    }
}

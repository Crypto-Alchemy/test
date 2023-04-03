package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aQ\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, mo44877d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lhu0;", "Lns0;", "", "block", "a", "(Lkotlin/coroutines/CoroutineContext;Lfd2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: c50 */
/* compiled from: Builders.kt */
public final /* synthetic */ class c50 {
    /* renamed from: a */
    public static final <T> T m56306a(CoroutineContext coroutineContext, fd2<? super hu0, ? super ns0<? super T>, ? extends Object> fd2) throws InterruptedException {
        CoroutineContext coroutineContext2;
        nt1 nt1;
        nt1 nt12;
        Thread currentThread = Thread.currentThread();
        ps0 ps0 = (ps0) coroutineContext.get(ps0.f32794h);
        if (ps0 == null) {
            nt1 = ip6.f38501a.mo52519b();
            coroutineContext2 = CoroutineContextKt.m63133d(ih2.f38385a, coroutineContext.plus(nt1));
        } else {
            nt1 nt13 = null;
            if (ps0 instanceof nt1) {
                nt12 = (nt1) ps0;
            } else {
                nt12 = null;
            }
            if (nt12 != null) {
                if (nt12.mo62806c0()) {
                    nt13 = nt12;
                }
                if (nt13 != null) {
                    nt1 = nt13;
                    coroutineContext2 = CoroutineContextKt.m63133d(ih2.f38385a, coroutineContext);
                }
            }
            nt1 = ip6.f38501a.mo52518a();
            coroutineContext2 = CoroutineContextKt.m63133d(ih2.f38385a, coroutineContext);
        }
        m30 m30 = new m30(coroutineContext2, currentThread, nt1);
        m30.mo67038S0(CoroutineStart.DEFAULT, m30, fd2);
        return m30.mo56011T0();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m56307b(CoroutineContext coroutineContext, fd2 fd2, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return b50.m55766c(coroutineContext, fd2);
    }
}

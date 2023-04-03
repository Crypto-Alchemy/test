package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001b\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001e\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001aG\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo44877d2 = {"Lz42;", "Lr37;", "a", "(Lz42;Lns0;)Ljava/lang/Object;", "T", "Lhu0;", "scope", "Ly23;", "c", "Lkotlin/Function2;", "Lns0;", "", "action", "b", "(Lz42;Lfd2;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/flow/FlowKt")
/* compiled from: Collect.kt */
public final /* synthetic */ class FlowKt__CollectKt {
    /* renamed from: a */
    public static final Object m63338a(z42<?> z42, ns0<? super r37> ns0) {
        Object a = z42.mo8646a(o84.f43591a, ns0);
        if (a == wx2.m54101d()) {
            return a;
        }
        return r37.f33317a;
    }

    /* renamed from: b */
    public static final <T> Object m63339b(z42<? extends T> z42, fd2<? super T, ? super ns0<? super r37>, ? extends Object> fd2, ns0<? super r37> ns0) {
        Object h = e52.m57216h(f52.m57617b(e52.m57233y(z42, fd2), 0, (BufferOverflow) null, 2, (Object) null), ns0);
        if (h == wx2.m54101d()) {
            return h;
        }
        return r37.f33317a;
    }

    /* renamed from: c */
    public static final <T> y23 m63340c(z42<? extends T> z42, hu0 hu0) {
        return d50.m56748b(hu0, (CoroutineContext) null, (CoroutineStart) null, new FlowKt__CollectKt$launchIn$1(z42, (ns0<? super FlowKt__CollectKt$launchIn$1>) null), 3, (Object) null);
    }
}

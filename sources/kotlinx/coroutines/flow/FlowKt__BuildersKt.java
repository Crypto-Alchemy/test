package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aH\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aH\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo44877d2 = {"T", "Lkotlin/Function2;", "La52;", "Lns0;", "Lr37;", "", "block", "Lz42;", "b", "(Lfd2;)Lz42;", "", "elements", "d", "([Ljava/lang/Object;)Lz42;", "value", "c", "(Ljava/lang/Object;)Lz42;", "Lcw4;", "a", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/flow/FlowKt")
/* compiled from: Builders.kt */
public final /* synthetic */ class FlowKt__BuildersKt {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt$a", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$a */
    /* compiled from: SafeCollector.common.kt */
    public static final class C7772a implements z42<T> {

        /* renamed from: a */
        public final /* synthetic */ Object f40393a;

        public C7772a(Object obj) {
            this.f40393a = obj;
        }

        /* renamed from: a */
        public Object mo8646a(a52<? super T> a52, ns0<? super r37> ns0) {
            Object emit = a52.emit(this.f40393a, ns0);
            if (emit == wx2.m54101d()) {
                return emit;
            }
            return r37.f33317a;
        }
    }

    /* renamed from: a */
    public static final <T> z42<T> m63328a(fd2<? super cw4<? super T>, ? super ns0<? super r37>, ? extends Object> fd2) {
        return new CallbackFlowBuilder(fd2, (CoroutineContext) null, 0, (BufferOverflow) null, 14, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static final <T> z42<T> m63329b(fd2<? super a52<? super T>, ? super ns0<? super r37>, ? extends Object> fd2) {
        return new nk5(fd2);
    }

    /* renamed from: c */
    public static final <T> z42<T> m63330c(T t) {
        return new C7772a(t);
    }

    /* renamed from: d */
    public static final <T> z42<T> m63331d(T... tArr) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(tArr);
    }
}

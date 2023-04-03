package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, mo44877d2 = {"T", "Lz42;", "", "count", "a", "Lkotlin/Function2;", "Lns0;", "", "", "predicate", "b", "(Lz42;Lfd2;)Lz42;", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/flow/FlowKt")
/* compiled from: Limit.kt */
public final /* synthetic */ class FlowKt__LimitKt {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$a", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$a */
    /* compiled from: SafeCollector.common.kt */
    public static final class C7777a implements z42<T> {

        /* renamed from: a */
        public final /* synthetic */ z42 f40405a;

        /* renamed from: d */
        public final /* synthetic */ int f40406d;

        public C7777a(z42 z42, int i) {
            this.f40405a = z42;
            this.f40406d = i;
        }

        /* renamed from: a */
        public Object mo8646a(a52<? super T> a52, ns0<? super r37> ns0) {
            Object a = this.f40405a.mo8646a(new FlowKt__LimitKt$drop$2$1(new Ref$IntRef(), this.f40406d, a52), ns0);
            if (a == wx2.m54101d()) {
                return a;
            }
            return r37.f33317a;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$b", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$b */
    /* compiled from: SafeCollector.common.kt */
    public static final class C7778b implements z42<T> {

        /* renamed from: a */
        public final /* synthetic */ z42 f40407a;

        /* renamed from: d */
        public final /* synthetic */ fd2 f40408d;

        public C7778b(z42 z42, fd2 fd2) {
            this.f40407a = z42;
            this.f40408d = fd2;
        }

        /* renamed from: a */
        public Object mo8646a(a52<? super T> a52, ns0<? super r37> ns0) {
            Object a = this.f40407a.mo8646a(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), a52, this.f40408d), ns0);
            if (a == wx2.m54101d()) {
                return a;
            }
            return r37.f33317a;
        }
    }

    /* renamed from: a */
    public static final <T> z42<T> m63355a(z42<? extends T> z42, int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C7777a(z42, i);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i).toString());
    }

    /* renamed from: b */
    public static final <T> z42<T> m63356b(z42<? extends T> z42, fd2<? super T, ? super ns0<? super Boolean>, ? extends Object> fd2) {
        return new C7778b(z42, fd2);
    }
}

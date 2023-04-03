package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\u001a\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, mo44877d2 = {"", "T", "Lz42;", "a", "Lwt2;", "c", "Lkotlin/Function2;", "Lns0;", "Lr37;", "action", "b", "(Lz42;Lfd2;)Lz42;", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/flow/FlowKt")
/* compiled from: Transform.kt */
public final /* synthetic */ class FlowKt__TransformKt {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/flow/FlowKt__TransformKt$a", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$a */
    /* compiled from: SafeCollector.common.kt */
    public static final class C7783a implements z42<wt2<? extends T>> {

        /* renamed from: a */
        public final /* synthetic */ z42 f40419a;

        public C7783a(z42 z42) {
            this.f40419a = z42;
        }

        /* renamed from: a */
        public Object mo8646a(a52<? super wt2<? extends T>> a52, ns0<? super r37> ns0) {
            Object a = this.f40419a.mo8646a(new FlowKt__TransformKt$withIndex$1$1(a52, new Ref$IntRef()), ns0);
            if (a == wx2.m54101d()) {
                return a;
            }
            return r37.f33317a;
        }
    }

    /* renamed from: a */
    public static final <T> z42<T> m63371a(z42<? extends T> z42) {
        return new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(z42);
    }

    /* renamed from: b */
    public static final <T> z42<T> m63372b(z42<? extends T> z42, fd2<? super T, ? super ns0<? super r37>, ? extends Object> fd2) {
        return new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(z42, fd2);
    }

    /* renamed from: c */
    public static final <T> z42<wt2<T>> m63373c(z42<? extends T> z42) {
        return new C7783a(z42);
    }
}

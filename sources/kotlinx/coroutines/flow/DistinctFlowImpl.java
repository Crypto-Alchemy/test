package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BI\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR*\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, mo44877d2 = {"Lkotlinx/coroutines/flow/DistinctFlowImpl;", "T", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "Lz42;", "upstream", "Lkotlin/Function1;", "", "d", "Lrc2;", "keySelector", "Lkotlin/Function2;", "", "e", "Lfd2;", "areEquivalent", "<init>", "(Lz42;Lrc2;Lfd2;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Distinct.kt */
public final class DistinctFlowImpl<T> implements z42<T> {

    /* renamed from: a */
    public final z42<T> f40387a;

    /* renamed from: d */
    public final rc2<T, Object> f40388d;

    /* renamed from: e */
    public final fd2<Object, Object, Boolean> f40389e;

    public DistinctFlowImpl(z42<? extends T> z42, rc2<? super T, ? extends Object> rc2, fd2<Object, Object, Boolean> fd2) {
        this.f40387a = z42;
        this.f40388d = rc2;
        this.f40389e = fd2;
    }

    /* renamed from: a */
    public Object mo8646a(a52<? super T> a52, ns0<? super r37> ns0) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = yb4.f46149a;
        Object a = this.f40387a.mo8646a(new DistinctFlowImpl$collect$2(this, ref$ObjectRef, a52), ns0);
        if (a == wx2.m54101d()) {
            return a;
        }
        return r37.f33317a;
    }
}

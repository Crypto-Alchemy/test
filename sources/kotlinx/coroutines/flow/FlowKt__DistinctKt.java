package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aY\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\"*\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u000b\u0012\u0004\b\f\u0010\r\"0\u0010\u0011\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u0012\u0004\b\u0010\u0010\r¨\u0006\u0012"}, mo44877d2 = {"T", "Lz42;", "a", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "", "areEquivalent", "b", "(Lz42;Lrc2;Lfd2;)Lz42;", "Lrc2;", "getDefaultKeySelector$annotations$FlowKt__DistinctKt", "()V", "defaultKeySelector", "Lfd2;", "getDefaultAreEquivalent$annotations$FlowKt__DistinctKt", "defaultAreEquivalent", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/flow/FlowKt")
/* compiled from: Distinct.kt */
public final /* synthetic */ class FlowKt__DistinctKt {

    /* renamed from: a */
    public static final rc2<Object, Object> f40395a = FlowKt__DistinctKt$defaultKeySelector$1.INSTANCE;

    /* renamed from: b */
    public static final fd2<Object, Object, Boolean> f40396b = FlowKt__DistinctKt$defaultAreEquivalent$1.INSTANCE;

    /* renamed from: a */
    public static final <T> z42<T> m63341a(z42<? extends T> z42) {
        if (z42 instanceof t86) {
            return z42;
        }
        return m63342b(z42, f40395a, f40396b);
    }

    /* renamed from: b */
    public static final <T> z42<T> m63342b(z42<? extends T> z42, rc2<? super T, ? extends Object> rc2, fd2<Object, Object, Boolean> fd2) {
        if (z42 instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) z42;
            if (distinctFlowImpl.f40388d == rc2 && distinctFlowImpl.f40389e == fd2) {
                return z42;
            }
        }
        return new DistinctFlowImpl(z42, rc2, fd2);
    }
}

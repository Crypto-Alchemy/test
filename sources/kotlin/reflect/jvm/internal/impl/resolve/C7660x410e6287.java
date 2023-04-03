package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Lambda;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1 */
/* compiled from: overridingUtils.kt */
public final class C7660x410e6287 extends Lambda implements rc2<H, r37> {
    public final /* synthetic */ w46<H> $conflictedHandles;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7660x410e6287(w46<H> w46) {
        super(1);
        this.$conflictedHandles = w46;
    }

    public final void invoke(H h) {
        w46<H> w46 = this.$conflictedHandles;
        vx2.m53590f(h, "it");
        w46.add(h);
    }
}

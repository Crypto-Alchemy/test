package androidx.compose.runtime;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo44877d2 = {"Ltp;", "<anonymous parameter 0>", "Lt46;", "slots", "Lmc5;", "<anonymous parameter 2>", "Lr37;", "invoke", "(Ltp;Lt46;Lmc5;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Composer.kt */
public final class ComposerImpl$insertMovableContentGuarded$1$1$4 extends Lambda implements id2<C3379tp<?>, t46, mc5, r37> {
    public final /* synthetic */ zy3 $from;
    public final /* synthetic */ yy3 $resolvedState;
    public final /* synthetic */ zy3 $to;
    public final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentGuarded$1$1$4(yy3 yy3, ComposerImpl composerImpl, zy3 zy3, zy3 zy32) {
        super(3);
        this.$resolvedState = yy3;
        this.this$0 = composerImpl;
        this.$from = zy3;
        this.$to = zy32;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C3379tp<?>) (C3379tp) obj, (t46) obj2, (mc5) obj3);
        return r37.f33317a;
    }

    public final void invoke(C3379tp<?> tpVar, t46 t46, mc5 mc5) {
        vx2.m53591g(tpVar, "<anonymous parameter 0>");
        vx2.m53591g(t46, "slots");
        vx2.m53591g(mc5, "<anonymous parameter 2>");
        yy3 yy3 = this.$resolvedState;
        if (yy3 == null && (yy3 = this.this$0.f1474c.mo3113k(this.$from)) == null) {
            ComposerKt.m2032x("Could not resolve state for movable content");
            throw new KotlinNothingValueException();
        }
        List<C1628bg> r0 = t46.mo26134r0(1, yy3.mo28274a(), 2);
        if (!r0.isEmpty()) {
            kt0 b = this.$to.mo28673b();
            vx2.m53589e(b, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            bo0 bo0 = (bo0) b;
            int size = r0.size();
            for (int i = 0; i < size; i++) {
                Object P0 = t46.mo26093P0(r0.get(i), 0);
                RecomposeScopeImpl recomposeScopeImpl = P0 instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) P0 : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.mo3066g(bo0);
                }
            }
        }
    }
}

package androidx.compose.p004ui.node;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.vo4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1 */
/* compiled from: LayoutNodeLayoutDelegate.kt */
public final class LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ long $position;
    public final /* synthetic */ LayoutNodeLayoutDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, long j) {
        super(0);
        this.this$0 = layoutNodeLayoutDelegate;
        this.$position = j;
    }

    public final void invoke() {
        vo4.C3501a.C3502a aVar = vo4.C3501a.f18872a;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.this$0;
        long j = this.$position;
        ol3 K0 = layoutNodeLayoutDelegate.mo3518z().mo3580K0();
        vx2.m53588d(K0);
        vo4.C3501a.m29012p(aVar, K0, j, Utils.FLOAT_EPSILON, 2, (Object) null);
    }
}

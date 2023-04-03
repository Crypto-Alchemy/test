package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1 */
/* compiled from: ViewCompositionStrategy.android.kt */
public final class C0433x11b1833b extends Lambda implements pc2<r37> {
    public final /* synthetic */ ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.C0430a $listener;
    public final /* synthetic */ ws4 $poolingContainerListener;
    public final /* synthetic */ AbstractComposeView $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0433x11b1833b(AbstractComposeView abstractComposeView, ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.C0430a aVar, ws4 ws4) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = aVar;
        this.$poolingContainerListener = ws4;
    }

    public final void invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
        vs4.m29094e(this.$view, this.$poolingContainerListener);
    }
}

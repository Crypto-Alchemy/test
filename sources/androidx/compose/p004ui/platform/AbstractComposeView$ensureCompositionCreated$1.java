package androidx.compose.p004ui.platform;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "(Lnn0;I)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1 */
/* compiled from: ComposeView.android.kt */
public final class AbstractComposeView$ensureCompositionCreated$1 extends Lambda implements fd2<nn0, Integer, r37> {
    public final /* synthetic */ AbstractComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractComposeView$ensureCompositionCreated$1(AbstractComposeView abstractComposeView) {
        super(2);
        this.this$0 = abstractComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((nn0) obj, ((Number) obj2).intValue());
        return r37.f33317a;
    }

    public final void invoke(nn0 nn0, int i) {
        if ((i & 11) != 2 || !nn0.mo2932b()) {
            if (ComposerKt.m1997O()) {
                ComposerKt.m2008Z(-656146368, i, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:248)");
            }
            this.this$0.mo3668a(nn0, 8);
            if (ComposerKt.m1997O()) {
                ComposerKt.m2007Y();
                return;
            }
            return;
        }
        nn0.mo2963m();
    }
}

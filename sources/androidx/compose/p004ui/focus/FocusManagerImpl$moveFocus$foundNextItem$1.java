package androidx.compose.p004ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"<anonymous>", "", "destination", "Landroidx/compose/ui/focus/FocusModifier;", "invoke", "(Landroidx/compose/ui/focus/FocusModifier;)Ljava/lang/Boolean;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.focus.FocusManagerImpl$moveFocus$foundNextItem$1 */
/* compiled from: FocusManager.kt */
public final class FocusManagerImpl$moveFocus$foundNextItem$1 extends Lambda implements rc2<FocusModifier, Boolean> {
    public final /* synthetic */ FocusModifier $source;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusManagerImpl$moveFocus$foundNextItem$1(FocusModifier focusModifier) {
        super(1);
        this.$source = focusModifier;
    }

    public final Boolean invoke(FocusModifier focusModifier) {
        vx2.m53591g(focusModifier, "destination");
        if (vx2.m53586b(focusModifier, this.$source)) {
            return Boolean.FALSE;
        }
        if (focusModifier.mo3212B() != null) {
            FocusTransactionsKt.m2395h(focusModifier);
            return Boolean.TRUE;
        }
        throw new IllegalStateException("Focus search landed at the root.".toString());
    }
}

package androidx.compose.p004ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/focus/FocusModifier;", "invoke", "(Landroidx/compose/ui/focus/FocusModifier;)Ljava/lang/Boolean;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.focus.FocusTransactionsKt$requestFocus$1 */
/* compiled from: FocusTransactions.kt */
public final class FocusTransactionsKt$requestFocus$1 extends Lambda implements rc2<FocusModifier, Boolean> {
    public static final FocusTransactionsKt$requestFocus$1 INSTANCE = new FocusTransactionsKt$requestFocus$1();

    public FocusTransactionsKt$requestFocus$1() {
        super(1);
    }

    public final Boolean invoke(FocusModifier focusModifier) {
        vx2.m53591g(focusModifier, "it");
        FocusTransactionsKt.m2395h(focusModifier);
        return Boolean.TRUE;
    }
}

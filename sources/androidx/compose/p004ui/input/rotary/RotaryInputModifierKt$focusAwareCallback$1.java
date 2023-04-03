package androidx.compose.p004ui.input.rotary;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Li62;", "e", "", "invoke", "(Li62;)Ljava/lang/Boolean;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.input.rotary.RotaryInputModifierKt$focusAwareCallback$1 */
/* compiled from: RotaryInputModifier.kt */
public final class RotaryInputModifierKt$focusAwareCallback$1 extends Lambda implements rc2<i62, Boolean> {
    public final /* synthetic */ rc2<vh5, Boolean> $this_focusAwareCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RotaryInputModifierKt$focusAwareCallback$1(rc2<? super vh5, Boolean> rc2) {
        super(1);
        this.$this_focusAwareCallback = rc2;
    }

    public final Boolean invoke(i62 i62) {
        vx2.m53591g(i62, "e");
        if (i62 instanceof vh5) {
            return this.$this_focusAwareCallback.invoke(i62);
        }
        throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
    }
}

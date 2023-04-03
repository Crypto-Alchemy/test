package androidx.compose.p004ui.window;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.window.PopupLayout$Content$4 */
/* compiled from: AndroidPopup.android.kt */
public final class PopupLayout$Content$4 extends Lambda implements fd2<nn0, Integer, r37> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ PopupLayout $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PopupLayout$Content$4(PopupLayout popupLayout, int i) {
        super(2);
        this.$tmp0_rcvr = popupLayout;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((nn0) obj, ((Number) obj2).intValue());
        return r37.f33317a;
    }

    public final void invoke(nn0 nn0, int i) {
        this.$tmp0_rcvr.mo3668a(nn0, this.$$changed | 1);
    }
}

package androidx.compose.p004ui.platform;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lja3;", "it", "", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1 */
/* compiled from: AndroidComposeView.android.kt */
public final class AndroidComposeView$keyInputModifier$1 extends Lambda implements rc2<ja3, Boolean> {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$keyInputModifier$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m75617invokeZmokQxo(((ja3) obj).mo21797f());
    }

    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m75617invokeZmokQxo(KeyEvent keyEvent) {
        vx2.m53591g(keyEvent, "it");
        j62 O = this.this$0.mo3702O(keyEvent);
        if (O == null || !la3.m21345e(ma3.m22108b(keyEvent), la3.f14459a.mo22710a())) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(this.this$0.getFocusManager().mo3200a(O.mo21739o()));
    }
}

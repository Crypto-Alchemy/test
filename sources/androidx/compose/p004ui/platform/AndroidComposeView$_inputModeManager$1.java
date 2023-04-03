package androidx.compose.p004ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.bv2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lbv2;", "it", "", "invoke-iuPiT84", "(I)Ljava/lang/Boolean;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1 */
/* compiled from: AndroidComposeView.android.kt */
public final class AndroidComposeView$_inputModeManager$1 extends Lambda implements rc2<bv2, Boolean> {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$_inputModeManager$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m75616invokeiuPiT84(((bv2) obj).mo11889i());
    }

    /* renamed from: invoke-iuPiT84  reason: not valid java name */
    public final Boolean m75616invokeiuPiT84(int i) {
        boolean z;
        bv2.C1656a aVar = bv2.f8265b;
        if (bv2.m11598f(i, aVar.mo11892b())) {
            z = this.this$0.isInTouchMode();
        } else if (!bv2.m11598f(i, aVar.mo11891a())) {
            z = false;
        } else if (this.this$0.isInTouchMode()) {
            z = this.this$0.requestFocusFromTouch();
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

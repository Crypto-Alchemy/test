package androidx.compose.p004ui.platform;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1 */
/* compiled from: AndroidComposeView.android.kt */
public final class AndroidComposeView$resendMotionEventOnLayout$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$resendMotionEventOnLayout$1(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    public final void invoke() {
        MotionEvent B = this.this$0.f1901U1;
        if (B != null) {
            int actionMasked = B.getActionMasked();
            if (actionMasked == 7 || actionMasked == 9) {
                this.this$0.f1902V1 = SystemClock.uptimeMillis();
                AndroidComposeView androidComposeView = this.this$0;
                androidComposeView.post(androidComposeView.f1905Y1);
            }
        }
    }
}

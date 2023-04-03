package androidx.compose.p004ui.platform;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"R", "", "it", "Lr37;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1 */
/* compiled from: AndroidUiFrameClock.android.kt */
public final class AndroidUiFrameClock$withFrameNanos$2$1 extends Lambda implements rc2<Throwable, r37> {
    public final /* synthetic */ Choreographer.FrameCallback $callback;
    public final /* synthetic */ AndroidUiDispatcher $uiDispatcher;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidUiFrameClock$withFrameNanos$2$1(AndroidUiDispatcher androidUiDispatcher, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.$uiDispatcher = androidUiDispatcher;
        this.$callback = frameCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return r37.f33317a;
    }

    public final void invoke(Throwable th) {
        this.$uiDispatcher.mo3893h0(this.$callback);
    }
}

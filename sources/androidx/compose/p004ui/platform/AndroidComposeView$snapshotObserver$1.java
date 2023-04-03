package androidx.compose.p004ui.platform;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lkotlin/Function0;", "Lr37;", "command", "invoke", "(Lpc2;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1 */
/* compiled from: AndroidComposeView.android.kt */
public final class AndroidComposeView$snapshotObserver$1 extends Lambda implements rc2<pc2<? extends r37>, r37> {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    /* renamed from: b */
    public static final void m2943b(pc2 pc2) {
        vx2.m53591g(pc2, "$tmp0");
        pc2.invoke();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((pc2<r37>) (pc2) obj);
        return r37.f33317a;
    }

    public final void invoke(pc2<r37> pc2) {
        vx2.m53591g(pc2, "command");
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            pc2.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new C0450a(pc2));
        }
    }
}

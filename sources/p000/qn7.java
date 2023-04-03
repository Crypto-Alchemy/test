package p000;

import android.view.ViewParent;
import androidx.compose.p004ui.platform.AndroidComposeView;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, mo44877d2 = {"Lqn7;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lr37;", "a", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: qn7 */
/* compiled from: RenderNodeLayer.android.kt */
public final class qn7 {

    /* renamed from: a */
    public static final qn7 f16995a = new qn7();

    /* renamed from: a */
    public final void mo25186a(AndroidComposeView androidComposeView) {
        vx2.m53591g(androidComposeView, "ownerView");
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}

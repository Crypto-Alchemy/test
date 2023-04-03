package androidx.compose.p004ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0004¨\u0006\u000b"}, mo44877d2 = {"Landroidx/compose/ui/platform/ViewLayerContainer;", "Landroidx/compose/ui/platform/DrawChildContainer;", "Landroid/graphics/Canvas;", "canvas", "Lr37;", "dispatchDraw", "dispatchGetDisplayList", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.ViewLayerContainer */
/* compiled from: ViewLayerContainer.android.kt */
public final class ViewLayerContainer extends DrawChildContainer {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewLayerContainer(Context context) {
        super(context);
        vx2.m53591g(context, "context");
    }

    public void dispatchDraw(Canvas canvas) {
        vx2.m53591g(canvas, "canvas");
    }

    public final void dispatchGetDisplayList() {
    }
}

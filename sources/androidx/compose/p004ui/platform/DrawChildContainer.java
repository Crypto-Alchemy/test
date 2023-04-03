package androidx.compose.p004ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0014J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0011\u001a\u00020\u0004H\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019¨\u0006\u001f"}, mo44877d2 = {"Landroidx/compose/ui/platform/DrawChildContainer;", "Landroid/view/ViewGroup;", "", "changed", "", "l", "t", "r", "b", "Lr37;", "onLayout", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "getChildCount", "Lxa0;", "Landroid/view/View;", "view", "", "drawingTime", "a", "(Lxa0;Landroid/view/View;J)V", "Z", "isDrawing", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.DrawChildContainer */
/* compiled from: ViewLayerContainer.android.kt */
public class DrawChildContainer extends ViewGroup {

    /* renamed from: a */
    public boolean f2041a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawChildContainer(Context context) {
        super(context);
        vx2.m53591g(context, "context");
        setClipChildren(false);
        setTag(o35.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* renamed from: a */
    public final void mo3922a(xa0 xa0, View view, long j) {
        vx2.m53591g(xa0, "canvas");
        vx2.m53591g(view, "view");
        super.drawChild(C2601jh.m20133b(xa0), view, j);
    }

    public void dispatchDraw(Canvas canvas) {
        boolean z;
        vx2.m53591g(canvas, "canvas");
        int childCount = super.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i);
            vx2.m53589e(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).mo3957s()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            this.f2041a = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.f2041a = false;
            }
        }
    }

    public int getChildCount() {
        if (this.f2041a) {
            return super.getChildCount();
        }
        return 0;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}

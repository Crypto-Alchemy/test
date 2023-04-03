package androidx.compose.p004ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.viewinterop.AndroidViewHolder;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J0\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0017J\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0017J\b\u0010\u001c\u001a\u00020\u0007H\u0016R3\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dj\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f` 8\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010#R3\u0010'\u001a\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001e0\u001dj\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001e` 8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#¨\u0006,"}, mo44877d2 = {"Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/ViewGroup;", "", "widthMeasureSpec", "heightMeasureSpec", "Lr37;", "onMeasure", "", "changed", "l", "t", "r", "b", "onLayout", "Landroid/view/View;", "child", "target", "onDescendantInvalidated", "", "location", "Landroid/graphics/Rect;", "dirty", "", "a", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "requestLayout", "shouldDelayChildPressedState", "Ljava/util/HashMap;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "getHolderToLayoutNode", "()Ljava/util/HashMap;", "holderToLayoutNode", "d", "getLayoutNodeToHolder", "layoutNodeToHolder", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AndroidViewsHandler */
/* compiled from: AndroidViewsHandler.android.kt */
public final class AndroidViewsHandler extends ViewGroup {

    /* renamed from: a */
    public final HashMap<AndroidViewHolder, LayoutNode> f2016a = new HashMap<>();

    /* renamed from: d */
    public final HashMap<LayoutNode, AndroidViewHolder> f2017d = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewsHandler(Context context) {
        super(context);
        vx2.m53591g(context, "context");
        setClipChildren(false);
    }

    /* renamed from: a */
    public Void mo3906a(int[] iArr, Rect rect) {
        return null;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AndroidViewHolder, LayoutNode> getHolderToLayoutNode() {
        return this.f2016a;
    }

    public final HashMap<LayoutNode, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.f2017d;
    }

    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) mo3906a(iArr, rect);
    }

    @SuppressLint({"MissingSuperCall"})
    public void onDescendantInvalidated(View view, View view2) {
        vx2.m53591g(view, "child");
        vx2.m53591g(view2, "target");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Set<AndroidViewHolder> keySet = this.f2016a.keySet();
        vx2.m53590f(keySet, "holderToLayoutNode.keys");
        for (AndroidViewHolder androidViewHolder : keySet) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                z2 = false;
            }
            if (z2) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                Set<AndroidViewHolder> keySet = this.f2016a.keySet();
                vx2.m53590f(keySet, "holderToLayoutNode.keys");
                for (AndroidViewHolder a : keySet) {
                    a.mo4142a();
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutNode layoutNode = this.f2016a.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.m2542P0(layoutNode, false, 1, (Object) null);
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

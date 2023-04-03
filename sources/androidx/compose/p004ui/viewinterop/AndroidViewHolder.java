package androidx.compose.p004ui.viewinterop;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0014J\u0006\u0010\b\u001a\u00020\u0006J0\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0014J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0014J\b\u0010\u0015\u001a\u00020\u0006H\u0014J\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0003H\u0014J\u0012\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010%\u001a\u00020\tH\u0016J(\u0010(\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0016J\b\u0010)\u001a\u00020\u0003H\u0016J(\u0010*\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0016J\u0018\u0010+\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0003H\u0016J@\u00101\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0016H\u0016J8\u00101\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0016J0\u00104\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0003H\u0016J(\u00108\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\u0006\u00100\u001a\u00020\tH\u0016J \u00109\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000205H\u0016J\b\u0010:\u001a\u00020\tH\u0016R.\u0010A\u001a\u0004\u0018\u00010\u001c2\b\u0010;\u001a\u0004\u0018\u00010\u001c8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R6\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060B2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060B8\u0006@DX\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR*\u0010T\u001a\u00020M2\u0006\u0010;\u001a\u00020M8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR0\u0010\\\u001a\u0010\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u0006\u0018\u00010U8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R*\u0010c\u001a\u00020]2\u0006\u0010;\u001a\u00020]8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\r\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR0\u0010g\u001a\u0010\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u0006\u0018\u00010U8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bd\u0010W\u001a\u0004\be\u0010Y\"\u0004\bf\u0010[R.\u0010o\u001a\u0004\u0018\u00010h2\b\u0010;\u001a\u0004\u0018\u00010h8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR.\u0010w\u001a\u0004\u0018\u00010p2\b\u0010;\u001a\u0004\u0018\u00010p8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8\u0002X\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00060B8\u0002X\u0004¢\u0006\u0006\n\u0004\b|\u0010DR2\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010U8\u0000@\u0000X\u000e¢\u0006\u0013\n\u0004\b~\u0010W\u001a\u0004\b\u0010Y\"\u0005\b\u0001\u0010[R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00030\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, mo44877d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Li54;", "", "widthMeasureSpec", "heightMeasureSpec", "Lr37;", "onMeasure", "a", "", "changed", "l", "t", "r", "b", "onLayout", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "disallowIntercept", "requestDisallowInterceptTouchEvent", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "Landroid/view/View;", "child", "target", "onDescendantInvalidated", "visibility", "onWindowVisibilityChanged", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "shouldDelayChildPressedState", "axes", "type", "onStartNestedScroll", "getNestedScrollAxes", "onNestedScrollAccepted", "onStopNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "onNestedScroll", "dx", "dy", "onNestedPreScroll", "", "velocityX", "velocityY", "onNestedFling", "onNestedPreFling", "isNestedScrollingEnabled", "value", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView$ui_release", "(Landroid/view/View;)V", "view", "Lkotlin/Function0;", "d", "Lpc2;", "getUpdate", "()Lpc2;", "setUpdate", "(Lpc2;)V", "update", "e", "Z", "hasUpdateBlock", "Lsw3;", "g", "Lsw3;", "getModifier", "()Lsw3;", "setModifier", "(Lsw3;)V", "modifier", "Lkotlin/Function1;", "k", "Lrc2;", "getOnModifierChanged$ui_release", "()Lrc2;", "setOnModifierChanged$ui_release", "(Lrc2;)V", "onModifierChanged", "Ldc1;", "Ldc1;", "getDensity", "()Ldc1;", "setDensity", "(Ldc1;)V", "density", "s", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Lug3;", "x", "Lug3;", "getLifecycleOwner", "()Lug3;", "setLifecycleOwner", "(Lug3;)V", "lifecycleOwner", "Lil5;", "y", "Lil5;", "getSavedStateRegistryOwner", "()Lil5;", "setSavedStateRegistryOwner", "(Lil5;)V", "savedStateRegistryOwner", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "A", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "snapshotObserver", "B", "runUpdate", "C", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "H", "[I", "I", "lastWidthMeasureSpec", "L", "lastHeightMeasureSpec", "Lj54;", "M", "Lj54;", "nestedScrollingParentHelper", "Landroidx/compose/ui/node/LayoutNode;", "P", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder */
/* compiled from: AndroidViewHolder.android.kt */
public abstract class AndroidViewHolder extends ViewGroup implements i54 {

    /* renamed from: A */
    public final SnapshotStateObserver f2229A;

    /* renamed from: B */
    public final pc2<r37> f2230B;

    /* renamed from: C */
    public rc2<? super Boolean, r37> f2231C;

    /* renamed from: H */
    public final int[] f2232H;

    /* renamed from: I */
    public int f2233I;

    /* renamed from: L */
    public int f2234L;

    /* renamed from: M */
    public final j54 f2235M;

    /* renamed from: P */
    public final LayoutNode f2236P;

    /* renamed from: a */
    public View f2237a;

    /* renamed from: d */
    public pc2<r37> f2238d;

    /* renamed from: e */
    public boolean f2239e;

    /* renamed from: g */
    public sw3 f2240g;

    /* renamed from: k */
    public rc2<? super sw3, r37> f2241k;

    /* renamed from: r */
    public dc1 f2242r;

    /* renamed from: s */
    public rc2<? super dc1, r37> f2243s;

    /* renamed from: x */
    public ug3 f2244x;

    /* renamed from: y */
    public il5 f2245y;

    /* renamed from: a */
    public final void mo4142a() {
        int i;
        int i2 = this.f2233I;
        if (i2 != Integer.MIN_VALUE && (i = this.f2234L) != Integer.MIN_VALUE) {
            measure(i2, i);
        }
    }

    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f2232H);
        int[] iArr = this.f2232H;
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), this.f2232H[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public final dc1 getDensity() {
        return this.f2242r;
    }

    public final LayoutNode getLayoutNode() {
        return this.f2236P;
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f2237a;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    public final ug3 getLifecycleOwner() {
        return this.f2244x;
    }

    public final sw3 getModifier() {
        return this.f2240g;
    }

    public int getNestedScrollAxes() {
        return this.f2235M.mo21726a();
    }

    public final rc2<dc1, r37> getOnDensityChanged$ui_release() {
        return this.f2243s;
    }

    public final rc2<sw3, r37> getOnModifierChanged$ui_release() {
        return this.f2241k;
    }

    public final rc2<Boolean, r37> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f2231C;
    }

    public final il5 getSavedStateRegistryOwner() {
        return this.f2245y;
    }

    public final pc2<r37> getUpdate() {
        return this.f2238d;
    }

    public final View getView() {
        return this.f2237a;
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.f2236P.mo3451h0();
        return null;
    }

    public boolean isNestedScrollingEnabled() {
        View view = this.f2237a;
        if (view != null) {
            return view.isNestedScrollingEnabled();
        }
        return super.isNestedScrollingEnabled();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2229A.mo3176j();
    }

    public void onDescendantInvalidated(View view, View view2) {
        vx2.m53591g(view, "child");
        vx2.m53591g(view2, "target");
        super.onDescendantInvalidated(view, view2);
        this.f2236P.mo3451h0();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2229A.mo3177k();
        this.f2229A.mo3172f();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.f2237a;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        View view = this.f2237a;
        if (view != null) {
            view.measure(i, i2);
        }
        View view2 = this.f2237a;
        int i4 = 0;
        if (view2 != null) {
            i3 = view2.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        View view3 = this.f2237a;
        if (view3 != null) {
            i4 = view3.getMeasuredHeight();
        }
        setMeasuredDimension(i3, i4);
        this.f2233I = i;
        this.f2234L = i2;
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        vx2.m53591g(view, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        x87.m29954a(C3490vj.m28823e(f), C3490vj.m28823e(f2));
        throw null;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        vx2.m53591g(view, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        x87.m29954a(C3490vj.m28823e(f), C3490vj.m28823e(f2));
        throw null;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        vx2.m53591g(view, "target");
        vx2.m53591g(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            wf4.m29550a(C3490vj.m28822d(i), C3490vj.m28822d(i2));
            int unused = C3490vj.m28824f(i3);
            throw null;
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        vx2.m53591g(view, "target");
        vx2.m53591g(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            wf4.m29550a(C3490vj.m28822d(i), C3490vj.m28822d(i2));
            wf4.m29550a(C3490vj.m28822d(i3), C3490vj.m28822d(i4));
            int unused = C3490vj.m28824f(i5);
            throw null;
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        vx2.m53591g(view, "child");
        vx2.m53591g(view2, "target");
        this.f2235M.mo21728c(view, view2, i, i2);
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        vx2.m53591g(view, "child");
        vx2.m53591g(view2, "target");
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    public void onStopNestedScroll(View view, int i) {
        vx2.m53591g(view, "target");
        this.f2235M.mo21730e(view, i);
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        rc2<? super Boolean, r37> rc2 = this.f2231C;
        if (rc2 != null) {
            rc2.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(dc1 dc1) {
        vx2.m53591g(dc1, "value");
        if (dc1 != this.f2242r) {
            this.f2242r = dc1;
            rc2<? super dc1, r37> rc2 = this.f2243s;
            if (rc2 != null) {
                rc2.invoke(dc1);
            }
        }
    }

    public final void setLifecycleOwner(ug3 ug3) {
        if (ug3 != this.f2244x) {
            this.f2244x = ug3;
            me7.m22275b(this, ug3);
        }
    }

    public final void setModifier(sw3 sw3) {
        vx2.m53591g(sw3, "value");
        if (sw3 != this.f2240g) {
            this.f2240g = sw3;
            rc2<? super sw3, r37> rc2 = this.f2241k;
            if (rc2 != null) {
                rc2.invoke(sw3);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(rc2<? super dc1, r37> rc2) {
        this.f2243s = rc2;
    }

    public final void setOnModifierChanged$ui_release(rc2<? super sw3, r37> rc2) {
        this.f2241k = rc2;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(rc2<? super Boolean, r37> rc2) {
        this.f2231C = rc2;
    }

    public final void setSavedStateRegistryOwner(il5 il5) {
        if (il5 != this.f2245y) {
            this.f2245y = il5;
            ViewTreeSavedStateRegistryOwner.m9848b(this, il5);
        }
    }

    public final void setUpdate(pc2<r37> pc2) {
        vx2.m53591g(pc2, "value");
        this.f2238d = pc2;
        this.f2239e = true;
        this.f2230B.invoke();
    }

    public final void setView$ui_release(View view) {
        if (view != this.f2237a) {
            this.f2237a = view;
            removeAllViewsInLayout();
            if (view != null) {
                addView(view);
                this.f2230B.invoke();
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        vx2.m53591g(view, "target");
        if (isNestedScrollingEnabled()) {
            wf4.m29550a(C3490vj.m28822d(i), C3490vj.m28822d(i2));
            wf4.m29550a(C3490vj.m28822d(i3), C3490vj.m28822d(i4));
            int unused = C3490vj.m28824f(i5);
            throw null;
        }
    }
}

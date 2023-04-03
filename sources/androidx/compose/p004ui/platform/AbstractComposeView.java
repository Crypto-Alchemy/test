package androidx.compose.p004ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Recomposer;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010V\u001a\u00020U\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010W\u0012\b\b\u0002\u0010Y\u001a\u00020\u0012¢\u0006\u0004\bZ\u0010[J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000f\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0014J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0004J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0004J7\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0012H\u0016J\u0012\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\u0012H\u0016J\"\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0012H\u0016J\u001c\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016J$\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010)H\u0016J$\u0010+\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010)H\u0014J,\u0010+\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020\u0018H\u0014J\b\u0010-\u001a\u00020\u0018H\u0016R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010/R(\u00106\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001018\u0002@BX\u000e¢\u0006\f\n\u0004\b\u000f\u00103\"\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u0001078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u00108R(\u0010=\u001a\u0004\u0018\u00010\u00042\b\u00102\u001a\u0004\u0018\u00010\u00048\u0002@BX\u000e¢\u0006\f\n\u0004\b\u001f\u0010:\"\u0004\b;\u0010<R$\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010>8\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b?\u0010@\u0012\u0004\bA\u0010BR0\u0010K\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00188F@FX\u000e¢\u0006\u0018\n\u0004\bD\u0010E\u0012\u0004\bJ\u0010B\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010ER\u0018\u0010P\u001a\u00020\u0018*\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\u00188TX\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010GR\u0011\u0010T\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bS\u0010G¨\u0006\\"}, mo44877d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Lr37;", "c", "Lwn0;", "b", "j", "f", "parent", "setParentCompositionContext", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "strategy", "setViewCompositionStrategy", "a", "(Lnn0;I)V", "d", "e", "onAttachedToWindow", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "h", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "g", "(ZIIII)V", "layoutDirection", "onRtlPropertiesChanged", "Landroid/view/View;", "child", "addView", "index", "width", "height", "Landroid/view/ViewGroup$LayoutParams;", "params", "addViewInLayout", "preventRequestLayout", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Landroid/os/IBinder;", "value", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "Lvn0;", "Lvn0;", "composition", "Lwn0;", "setParentContext", "(Lwn0;)V", "parentContext", "Lkotlin/Function0;", "k", "Lpc2;", "getDisposeViewCompositionStrategy$annotations", "()V", "disposeViewCompositionStrategy", "r", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "showLayoutBounds", "s", "creatingComposition", "i", "(Lwn0;)Z", "isAlive", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AbstractComposeView */
/* compiled from: ComposeView.android.kt */
public abstract class AbstractComposeView extends ViewGroup {

    /* renamed from: a */
    public WeakReference<wn0> f1861a;

    /* renamed from: d */
    public IBinder f1862d;

    /* renamed from: e */
    public vn0 f1863e;

    /* renamed from: g */
    public wn0 f1864g;

    /* renamed from: k */
    public pc2<r37> f1865k;

    /* renamed from: r */
    public boolean f1866r;

    /* renamed from: s */
    public boolean f1867s;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AbstractComposeView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        vx2.m53591g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        vx2.m53591g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(wn0 wn0) {
        if (this.f1864g != wn0) {
            this.f1864g = wn0;
            if (wn0 != null) {
                this.f1861a = null;
            }
            vn0 vn0 = this.f1863e;
            if (vn0 != null) {
                vn0.dispose();
                this.f1863e = null;
                if (isAttachedToWindow()) {
                    mo3680f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f1862d != iBinder) {
            this.f1862d = iBinder;
            this.f1861a = null;
        }
    }

    /* renamed from: a */
    public abstract void mo3668a(nn0 nn0, int i);

    public void addView(View view) {
        mo3677c();
        super.addView(view);
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        mo3677c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* renamed from: b */
    public final wn0 mo3676b(wn0 wn0) {
        wn0 wn02;
        if (mo3686i(wn0)) {
            wn02 = wn0;
        } else {
            wn02 = null;
        }
        if (wn02 != null) {
            this.f1861a = new WeakReference<>(wn02);
        }
        return wn0;
    }

    /* renamed from: c */
    public final void mo3677c() {
        if (!this.f1867s) {
            throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
        }
    }

    /* renamed from: d */
    public final void mo3678d() {
        boolean z;
        if (this.f1864g != null || isAttachedToWindow()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo3680f();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
    }

    /* renamed from: e */
    public final void mo3679e() {
        vn0 vn0 = this.f1863e;
        if (vn0 != null) {
            vn0.dispose();
        }
        this.f1863e = null;
        requestLayout();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public final void mo3680f() {
        if (this.f1863e == null) {
            try {
                this.f1867s = true;
                this.f1863e = C0451b.m3162d(this, mo3687j(), mn0.m22399c(-656146368, true, new AbstractComposeView$ensureCompositionCreated$1(this)));
                this.f1867s = false;
            } catch (Throwable th) {
                this.f1867s = false;
                throw th;
            }
        }
    }

    /* renamed from: g */
    public void mo3681g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        if (this.f1863e != null) {
            return true;
        }
        return false;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f1866r;
    }

    /* renamed from: h */
    public void mo3685h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    /* renamed from: i */
    public final boolean mo3686i(wn0 wn0) {
        if (!(wn0 instanceof Recomposer) || ((Recomposer) wn0).mo3094X().getValue().compareTo(Recomposer.State.ShuttingDown) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final wn0 mo3687j() {
        wn0 wn0;
        wn0 wn02;
        wn0 wn03 = this.f1864g;
        if (wn03 != null) {
            return wn03;
        }
        wn0 d = WindowRecomposer_androidKt.m3136d(this);
        wn0 wn04 = null;
        if (d != null) {
            wn0 = mo3676b(d);
        } else {
            wn0 = null;
        }
        if (wn0 != null) {
            return wn0;
        }
        WeakReference<wn0> weakReference = this.f1861a;
        if (!(weakReference == null || (wn02 = weakReference.get()) == null || !mo3686i(wn02))) {
            wn04 = wn02;
        }
        wn0 wn05 = wn04;
        if (wn05 == null) {
            return mo3676b(WindowRecomposer_androidKt.m3140h(this));
        }
        return wn05;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            mo3680f();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo3681g(z, i, i2, i3, i4);
    }

    public final void onMeasure(int i, int i2) {
        mo3680f();
        mo3685h(i, i2);
    }

    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(wn0 wn0) {
        setParentContext(wn0);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f1866r = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((nj4) childAt).setShowLayoutBounds(z);
        }
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy viewCompositionStrategy) {
        vx2.m53591g(viewCompositionStrategy, "strategy");
        pc2<r37> pc2 = this.f1865k;
        if (pc2 != null) {
            pc2.invoke();
        }
        this.f1865k = viewCompositionStrategy.mo3945a(this);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vx2.m53591g(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        this.f1865k = ViewCompositionStrategy.f2061a.mo3948a().mo3945a(this);
    }

    public void addView(View view, int i) {
        mo3677c();
        super.addView(view, i);
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        mo3677c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public void addView(View view, int i, int i2) {
        mo3677c();
        super.addView(view, i, i2);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        mo3677c();
        super.addView(view, layoutParams);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        mo3677c();
        super.addView(view, i, layoutParams);
    }
}

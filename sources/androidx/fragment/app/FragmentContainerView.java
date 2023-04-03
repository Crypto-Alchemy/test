package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.fasterxml.jackson.core.JsonFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001-B\u0011\b\u0016\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;B%\b\u0017\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\b\b\u0002\u0010>\u001a\u00020\u001b¢\u0006\u0004\b:\u0010?B!\b\u0010\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\b:\u0010BJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0014J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0014H\u0001J\"\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001bH\u0016J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001bH\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\u0019\u0010*\u001a\u00028\u0000\"\n\b\u0000\u0010)*\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0010H\u0002R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100.8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u00105\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006C"}, mo44877d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Lr37;", "setLayoutTransition", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "dispatchApplyWindowInsets", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "Landroid/view/View;", "child", "", "drawingTime", "", "drawChild", "view", "startViewTransition", "endViewTransition", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "removeViewAt", "removeViewInLayout", "removeView", "start", "count", "removeViews", "removeViewsInLayout", "removeAllViewsInLayout", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "v", "a", "", "Ljava/util/List;", "disappearingFragmentChildren", "d", "transitioningFragmentViews", "e", "Landroid/view/View$OnApplyWindowInsetsListener;", "applyWindowInsetsListener", "g", "Z", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/FragmentManager;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "fragment_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: FragmentContainerView.kt */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a */
    public final List<View> f3648a;

    /* renamed from: d */
    public final List<View> f3649d;

    /* renamed from: e */
    public View.OnApplyWindowInsetsListener f3650e;

    /* renamed from: g */
    public boolean f3651g;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000b"}, mo44877d2 = {"Landroidx/fragment/app/FragmentContainerView$a;", "", "Landroid/view/View$OnApplyWindowInsetsListener;", "onApplyWindowInsetsListener", "Landroid/view/View;", "v", "Landroid/view/WindowInsets;", "insets", "a", "<init>", "()V", "fragment_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.fragment.app.FragmentContainerView$a */
    /* compiled from: FragmentContainerView.kt */
    public static final class C0629a {

        /* renamed from: a */
        public static final C0629a f3652a = new C0629a();

        /* renamed from: a */
        public final WindowInsets mo5911a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            vx2.m53591g(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            vx2.m53591g(view, "v");
            vx2.m53591g(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            vx2.m53590f(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        vx2.m53591g(context, "context");
        this.f3648a = new ArrayList();
        this.f3649d = new ArrayList();
        this.f3651g = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        vx2.m53591g(context, "context");
    }

    /* renamed from: a */
    public final void mo5893a(View view) {
        if (this.f3649d.contains(view)) {
            this.f3648a.add(view);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        vx2.m53591g(view, "child");
        if (FragmentManager.m4629E0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        hl7 hl7;
        vx2.m53591g(windowInsets, "insets");
        hl7 x = hl7.m18975x(windowInsets);
        vx2.m53590f(x, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3650e;
        if (onApplyWindowInsetsListener != null) {
            C0629a aVar = C0629a.f3652a;
            vx2.m53588d(onApplyWindowInsetsListener);
            hl7 = hl7.m18975x(aVar.mo5911a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            hl7 = ga7.m17757b0(this, x);
        }
        vx2.m53590f(hl7, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!hl7.mo21243q()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ga7.m17766g(getChildAt(i), hl7);
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(Canvas canvas) {
        vx2.m53591g(canvas, "canvas");
        if (this.f3651g) {
            for (View drawChild : this.f3648a) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        vx2.m53591g(canvas, "canvas");
        vx2.m53591g(view, "child");
        if (!this.f3651g || !(!this.f3648a.isEmpty()) || !this.f3648a.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        vx2.m53591g(view, "view");
        this.f3649d.remove(view);
        if (this.f3648a.remove(view)) {
            this.f3651g = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return FragmentManager.m4645n0(this).mo5981k0(getId());
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        vx2.m53591g(windowInsets, "insets");
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                vx2.m53590f(childAt, "view");
                mo5893a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public void removeView(View view) {
        vx2.m53591g(view, "view");
        mo5893a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        vx2.m53590f(childAt, "view");
        mo5893a(childAt);
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        vx2.m53591g(view, "view");
        mo5893a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            vx2.m53590f(childAt, "view");
            mo5893a(childAt);
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            vx2.m53590f(childAt, "view");
            mo5893a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f3651g = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        vx2.m53591g(onApplyWindowInsetsListener, "listener");
        this.f3650e = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        vx2.m53591g(view, "view");
        if (view.getParent() == this) {
            this.f3649d.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        vx2.m53591g(context, "context");
        this.f3648a = new ArrayList();
        this.f3649d = new ArrayList();
        this.f3651g = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = g65.FragmentContainerView;
            vx2.m53590f(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(g65.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + JsonFactory.DEFAULT_QUOTE_CHAR);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        vx2.m53591g(context, "context");
        vx2.m53591g(attributeSet, "attrs");
        vx2.m53591g(fragmentManager, "fm");
        this.f3648a = new ArrayList();
        this.f3649d = new ArrayList();
        this.f3651g = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = g65.FragmentContainerView;
        vx2.m53590f(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(g65.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(g65.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment k0 = fragmentManager.mo5981k0(id);
        if (classAttribute != null && k0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a = fragmentManager.mo6012v0().mo6039a(context.getClassLoader(), classAttribute);
            vx2.m53590f(a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.mo5996q().mo6273w(true).mo6263d(this, a, string).mo6142m();
        }
        fragmentManager.mo5964c1(this);
    }
}

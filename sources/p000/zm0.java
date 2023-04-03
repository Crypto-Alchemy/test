package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.C0716f;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0003\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0015J\b\u0010\u000b\u001a\u00020\u0004H\u0015J\b\u0010\f\u001a\u00020\u0004H\u0015J\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u00020\u0004H\u0017J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006%"}, mo44877d2 = {"Lzm0;", "Landroid/app/Dialog;", "Lug3;", "Lzg4;", "Lr37;", "initViewTreeOwners", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "onStop", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher", "onBackPressed", "", "layoutResID", "setContentView", "Landroid/view/View;", "view", "Landroid/view/ViewGroup$LayoutParams;", "params", "addContentView", "Landroidx/lifecycle/f;", "_lifecycleRegistry", "Landroidx/lifecycle/f;", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "getLifecycleRegistry", "()Landroidx/lifecycle/f;", "lifecycleRegistry", "Landroid/content/Context;", "context", "themeResId", "<init>", "(Landroid/content/Context;I)V", "activity_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: zm0 */
/* compiled from: ComponentDialog.kt */
public class zm0 extends Dialog implements ug3, zg4 {
    private C0716f _lifecycleRegistry;
    private final OnBackPressedDispatcher onBackPressedDispatcher;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zm0(Context context) {
        this(context, 0, 2, (DefaultConstructorMarker) null);
        vx2.m53591g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zm0(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    private final C0716f getLifecycleRegistry() {
        C0716f fVar = this._lifecycleRegistry;
        if (fVar != null) {
            return fVar;
        }
        C0716f fVar2 = new C0716f(this);
        this._lifecycleRegistry = fVar2;
        return fVar2;
    }

    private final void initViewTreeOwners() {
        Window window = getWindow();
        vx2.m53588d(window);
        me7.m22275b(window.getDecorView(), this);
        Window window2 = getWindow();
        vx2.m53588d(window2);
        View decorView = window2.getDecorView();
        vx2.m53590f(decorView, "window!!.decorView");
        ne7.m23133a(decorView, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: onBackPressedDispatcher$lambda-1  reason: not valid java name */
    public static final void m75632onBackPressedDispatcher$lambda1(zm0 zm0) {
        vx2.m53591g(zm0, "this$0");
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        vx2.m53591g(view, "view");
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    public void onBackPressed() {
        this.onBackPressedDispatcher.mo915d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycleRegistry().mo6389h(Lifecycle.Event.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        getLifecycleRegistry().mo6389h(Lifecycle.Event.ON_RESUME);
    }

    public void onStop() {
        getLifecycleRegistry().mo6389h(Lifecycle.Event.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zm0(Context context, int i) {
        super(context, i);
        vx2.m53591g(context, "context");
        this.onBackPressedDispatcher = new OnBackPressedDispatcher(new ym0(this));
    }

    public void setContentView(View view) {
        vx2.m53591g(view, "view");
        initViewTreeOwners();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        vx2.m53591g(view, "view");
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }
}

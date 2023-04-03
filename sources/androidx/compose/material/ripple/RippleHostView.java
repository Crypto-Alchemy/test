package androidx.compose.material.ripple;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014J0\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006%"}, mo44877d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "", "pressed", "Lr37;", "setRippleState", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "l", "t", "r", "b", "onLayout", "refreshDrawableState", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "", "a", "Ljava/lang/Long;", "lastRippleStateChangeTimeMillis", "Ljava/lang/Runnable;", "d", "Ljava/lang/Runnable;", "resetRippleRunnable", "Lkotlin/Function0;", "e", "Lpc2;", "onInvalidateRipple", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "g", "material-ripple_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: RippleHostView.android.kt */
public final class RippleHostView extends View {

    /* renamed from: g */
    public static final C0335a f1428g = new C0335a((DefaultConstructorMarker) null);

    /* renamed from: k */
    public static final int[] f1429k = {16842919, 16842910};

    /* renamed from: r */
    public static final int[] f1430r = new int[0];

    /* renamed from: a */
    public Long f1431a;

    /* renamed from: d */
    public Runnable f1432d;

    /* renamed from: e */
    public pc2<r37> f1433e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\f"}, mo44877d2 = {"Landroidx/compose/material/ripple/RippleHostView$a;", "", "", "MinimumRippleStateChangeTime", "J", "", "PressedState", "[I", "ResetRippleDelayDuration", "RestingState", "<init>", "()V", "material-ripple_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.material.ripple.RippleHostView$a */
    /* compiled from: RippleHostView.android.kt */
    public static final class C0335a {
        public C0335a() {
        }

        public /* synthetic */ C0335a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RippleHostView(Context context) {
        super(context);
        vx2.m53591g(context, "context");
    }

    private final void setRippleState(boolean z) {
        long j;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f1432d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f1431a;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long j2 = currentAnimationTimeMillis - j;
        if (!z && j2 < 5) {
            ah5 ah5 = new ah5(this);
            this.f1432d = ah5;
            postDelayed(ah5, 50);
        }
        this.f1431a = Long.valueOf(currentAnimationTimeMillis);
    }

    /* access modifiers changed from: private */
    /* renamed from: setRippleState$lambda-2  reason: not valid java name */
    public static final void m75611setRippleState$lambda2(RippleHostView rippleHostView) {
        vx2.m53591g(rippleHostView, "this$0");
        rippleHostView.getClass();
        rippleHostView.f1432d = null;
    }

    public void invalidateDrawable(Drawable drawable) {
        vx2.m53591g(drawable, "who");
        pc2<r37> pc2 = this.f1433e;
        if (pc2 != null) {
            pc2.invoke();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void refreshDrawableState() {
    }
}

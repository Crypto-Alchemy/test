package androidx.compose.p004ui.window;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.p004ui.platform.AbstractComposeView;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.ComposerKt;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J#\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010 \u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\fH\u0010¢\u0006\u0004\b \u0010!J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"H\u0016J\u0012\u0010&\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\fH\u0016R\"\u00100\u001a\u00020)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010D\u001a\u00020=8\u0000X\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010AR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR8\u0010]\u001a\u0004\u0018\u00010U2\b\u0010V\u001a\u0004\u0018\u00010U8F@FX\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R/\u0010d\u001a\u0004\u0018\u00010^2\b\u0010V\u001a\u0004\u0018\u00010^8B@BX\u0002¢\u0006\u0012\n\u0004\b_\u0010X\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001b\u0010i\u001a\u00020\u00038FX\u0002¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR7\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118B@BX\u0002¢\u0006\u0012\n\u0004\bj\u0010X\u001a\u0004\bk\u0010l\"\u0004\b\u0013\u0010mR$\u0010q\u001a\u00020\u00032\u0006\u0010V\u001a\u00020\u00038\u0014@RX\u000e¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010hR\u0014\u0010t\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0014\u0010v\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\bu\u0010sR\u0014\u0010y\u001a\u00020\u00018VX\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006z"}, mo44877d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lbe7;", "", "isFocusable", "Lr37;", "setIsFocusable", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "setSecurePolicy", "clippingEnabled", "setClippingEnabled", "", "flags", "k", "Lwn0;", "parent", "Lkotlin/Function0;", "content", "setContent", "(Lwn0;Lfd2;)V", "a", "(Lnn0;I)V", "widthMeasureSpec", "heightMeasureSpec", "h", "(II)V", "changed", "left", "top", "right", "bottom", "g", "(ZIIII)V", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "Landroid/view/MotionEvent;", "onTouchEvent", "layoutDirection", "setLayoutDirection", "", "x", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "testTag", "Landroid/view/View;", "y", "Landroid/view/View;", "composeView", "Lht4;", "A", "Lht4;", "popupLayoutHelper", "Landroid/view/WindowManager;", "B", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager$LayoutParams;", "C", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "()Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release$annotations", "()V", "params", "Ljt4;", "H", "Ljt4;", "getPositionProvider", "()Ljt4;", "setPositionProvider", "(Ljt4;)V", "positionProvider", "Landroidx/compose/ui/unit/LayoutDirection;", "I", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "parentLayoutDirection", "Lsw2;", "<set-?>", "L", "Lt04;", "getPopupContentSize-bOM6tXw", "()Lsw2;", "setPopupContentSize-fhxjrPA", "(Lsw2;)V", "popupContentSize", "Lme3;", "M", "getParentLayoutCoordinates", "()Lme3;", "setParentLayoutCoordinates", "(Lme3;)V", "parentLayoutCoordinates", "P", "Lr86;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Q", "getContent", "()Lfd2;", "(Lfd2;)V", "U", "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.compose.ui.window.PopupLayout */
/* compiled from: AndroidPopup.android.kt */
public final class PopupLayout extends AbstractComposeView implements be7 {

    /* renamed from: A */
    public final ht4 f2250A;

    /* renamed from: B */
    public final WindowManager f2251B;

    /* renamed from: C */
    public final WindowManager.LayoutParams f2252C;

    /* renamed from: H */
    public jt4 f2253H;

    /* renamed from: I */
    public LayoutDirection f2254I;

    /* renamed from: L */
    public final t04 f2255L;

    /* renamed from: M */
    public final t04 f2256M;

    /* renamed from: P */
    public final r86 f2257P;

    /* renamed from: Q */
    public final t04 f2258Q;

    /* renamed from: U */
    public boolean f2259U;

    /* renamed from: x */
    public String f2260x;

    /* renamed from: y */
    public final View f2261y;

    private final fd2<nn0, Integer, r37> getContent() {
        return (fd2) this.f2258Q.getValue();
    }

    private final int getDisplayHeight() {
        return ap3.m31899b(((float) getContext().getResources().getConfiguration().screenHeightDp) * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return ap3.m31899b(((float) getContext().getResources().getConfiguration().screenWidthDp) * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    private final me3 getParentLayoutCoordinates() {
        return (me3) this.f2256M.getValue();
    }

    private final void setClippingEnabled(boolean z) {
        int i;
        if (z) {
            i = this.f2252C.flags & -513;
        } else {
            i = this.f2252C.flags | RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
        }
        mo4194k(i);
    }

    private final void setContent(fd2<? super nn0, ? super Integer, r37> fd2) {
        this.f2258Q.setValue(fd2);
    }

    private final void setIsFocusable(boolean z) {
        int i;
        if (!z) {
            i = this.f2252C.flags | 8;
        } else {
            i = this.f2252C.flags & -9;
        }
        mo4194k(i);
    }

    private final void setParentLayoutCoordinates(me3 me3) {
        this.f2256M.setValue(me3);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        int i;
        if (xr5.m30293a(secureFlagPolicy, AndroidPopup_androidKt.m3310a(this.f2261y))) {
            i = this.f2252C.flags | 8192;
        } else {
            i = this.f2252C.flags & -8193;
        }
        mo4194k(i);
    }

    /* renamed from: a */
    public void mo3668a(nn0 nn0, int i) {
        nn0 a = nn0.mo2929a(-857613600);
        if (ComposerKt.m1997O()) {
            ComposerKt.m2008Z(-857613600, i, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:461)");
        }
        getContent().invoke(a, 0);
        if (ComposerKt.m1997O()) {
            ComposerKt.m2007Y();
        }
        nn5 c = a.mo2935c();
        if (c != null) {
            c.mo3065a(new PopupLayout$Content$4(this, i));
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        vx2.m53591g(keyEvent, "event");
        if (keyEvent.getKeyCode() != 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        throw null;
    }

    /* renamed from: g */
    public void mo3681g(boolean z, int i, int i2, int i3, int i4) {
        super.mo3681g(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.f2252C.width = childAt.getMeasuredWidth();
            this.f2252C.height = childAt.getMeasuredHeight();
            this.f2250A.mo21383a(this.f2251B, this, this.f2252C);
        }
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f2257P.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f2252C;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.f2254I;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final sw2 m75630getPopupContentSizebOM6tXw() {
        return (sw2) this.f2255L.getValue();
    }

    public final jt4 getPositionProvider() {
        return this.f2253H;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f2259U;
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f2260x;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return ae7.m225b(this);
    }

    /* renamed from: h */
    public void mo3685h(int i, int i2) {
        throw null;
    }

    /* renamed from: k */
    public final void mo4194k(int i) {
        WindowManager.LayoutParams layoutParams = this.f2252C;
        layoutParams.flags = i;
        this.f2250A.mo21383a(this.f2251B, this, layoutParams);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        vx2.m53591g(layoutDirection, "<set-?>");
        this.f2254I = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m75631setPopupContentSizefhxjrPA(sw2 sw2) {
        this.f2255L.setValue(sw2);
    }

    public final void setPositionProvider(jt4 jt4) {
        vx2.m53591g(jt4, "<set-?>");
        this.f2253H = jt4;
    }

    public final void setTestTag(String str) {
        vx2.m53591g(str, "<set-?>");
        this.f2260x = str;
    }

    public final void setContent(wn0 wn0, fd2<? super nn0, ? super Integer, r37> fd2) {
        vx2.m53591g(wn0, "parent");
        vx2.m53591g(fd2, PublicResolver.FUNC_CONTENT);
        setParentCompositionContext(wn0);
        setContent(fd2);
        this.f2259U = true;
    }
}

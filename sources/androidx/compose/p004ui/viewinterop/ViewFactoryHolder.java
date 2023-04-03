package androidx.compose.p004ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.p004ui.platform.AbstractComposeView;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004R$\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nRF\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014RB\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\f8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00018VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\b¨\u0006\u001d"}, mo44877d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Lbe7;", "Q", "Landroid/view/View;", "getTypedView$ui_release", "()Landroid/view/View;", "setTypedView$ui_release", "(Landroid/view/View;)V", "typedView", "Lkotlin/Function1;", "Landroid/content/Context;", "value", "U", "Lrc2;", "getFactory", "()Lrc2;", "setFactory", "(Lrc2;)V", "factory", "Lr37;", "e0", "getUpdateBlock", "setUpdateBlock", "updateBlock", "getViewRoot", "viewRoot", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder */
/* compiled from: AndroidView.android.kt */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements be7 {

    /* renamed from: Q */
    public T f2246Q;

    /* renamed from: U */
    public rc2<? super Context, ? extends T> f2247U;

    /* renamed from: e0 */
    public rc2<? super T, r37> f2248e0;

    public final rc2<Context, T> getFactory() {
        return this.f2247U;
    }

    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return ae7.m224a(this);
    }

    public final T getTypedView$ui_release() {
        return this.f2246Q;
    }

    public final rc2<T, r37> getUpdateBlock() {
        return this.f2248e0;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setFactory(rc2<? super Context, ? extends T> rc2) {
        this.f2247U = rc2;
        if (rc2 != null) {
            Context context = getContext();
            vx2.m53590f(context, "context");
            T t = (View) rc2.invoke(context);
            this.f2246Q = t;
            setView$ui_release(t);
        }
    }

    public final void setTypedView$ui_release(T t) {
        this.f2246Q = t;
    }

    public final void setUpdateBlock(rc2<? super T, r37> rc2) {
        vx2.m53591g(rc2, "value");
        this.f2248e0 = rc2;
        setUpdate(new ViewFactoryHolder$updateBlock$1(this));
    }
}

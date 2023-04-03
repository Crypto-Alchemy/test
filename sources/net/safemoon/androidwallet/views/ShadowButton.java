package net.safemoon.androidwallet.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import kotlin.C6169a;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000f\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u000f\u0010\u0016R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/ShadowButton;", "Landroidx/cardview/widget/CardView;", "Landroid/view/View;", "A", "Lef3;", "getCustomEnd", "()Landroid/view/View;", "customEnd", "Lda7;", "B", "getBinding", "()Lda7;", "binding", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ShadowButton.kt */
public final class ShadowButton extends CardView {

    /* renamed from: A */
    public final ef3 f43262A = C6169a.m47232a(new ShadowButton$customEnd$2(this));

    /* renamed from: B */
    public final ef3 f43263B = C6169a.m47232a(new ShadowButton$binding$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShadowButton(Context context) {
        super(context);
        vx2.m53591g(context, "context");
        getBinding();
    }

    private final da7 getBinding() {
        return (da7) this.f43263B.getValue();
    }

    /* access modifiers changed from: private */
    public final View getCustomEnd() {
        Object value = this.f43262A.getValue();
        vx2.m53590f(value, "<get-customEnd>(...)");
        return (View) value;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        vx2.m53591g(context, "context");
        getBinding();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShadowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vx2.m53591g(context, "context");
        getBinding();
    }
}

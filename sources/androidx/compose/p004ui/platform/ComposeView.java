package androidx.compose.p004ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u001b\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00070\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR*\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0014@RX\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, mo44877d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lr37;", "a", "(Lnn0;I)V", "", "getAccessibilityClassName", "Lkotlin/Function0;", "content", "setContent", "(Lfd2;)V", "Lt04;", "x", "Lt04;", "", "<set-?>", "y", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.ComposeView */
/* compiled from: ComposeView.android.kt */
public final class ComposeView extends AbstractComposeView {

    /* renamed from: x */
    public final t04<fd2<nn0, Integer, r37>> f2020x;

    /* renamed from: y */
    public boolean f2021y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        vx2.m53591g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        vx2.m53591g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    /* renamed from: a */
    public void mo3668a(nn0 nn0, int i) {
        nn0 a = nn0.mo2929a(420213850);
        if (ComposerKt.m1997O()) {
            ComposerKt.m2008Z(420213850, i, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:402)");
        }
        fd2 value = this.f2020x.getValue();
        if (value != null) {
            value.invoke(a, 0);
        }
        if (ComposerKt.m1997O()) {
            ComposerKt.m2007Y();
        }
        nn5 c = a.mo2935c();
        if (c != null) {
            c.mo3065a(new ComposeView$Content$1(this, i));
        }
    }

    public CharSequence getAccessibilityClassName() {
        String name = ComposeView.class.getName();
        vx2.m53590f(name, "javaClass.name");
        return name;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f2021y;
    }

    public final void setContent(fd2<? super nn0, ? super Integer, r37> fd2) {
        vx2.m53591g(fd2, PublicResolver.FUNC_CONTENT);
        this.f2021y = true;
        this.f2020x.setValue(fd2);
        if (isAttachedToWindow()) {
            mo3678d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vx2.m53591g(context, "context");
        this.f2020x = l56.m21292b((Object) null, (h56) null, 2, (Object) null);
    }
}

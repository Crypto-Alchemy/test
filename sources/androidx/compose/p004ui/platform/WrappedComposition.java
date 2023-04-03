package androidx.compose.p004ui.platform;

import androidx.lifecycle.C0715e;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.ENS;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b#\u0010$J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, mo44877d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Lvn0;", "Landroidx/lifecycle/e;", "Lkotlin/Function0;", "Lr37;", "content", "d", "(Lfd2;)V", "dispose", "Lug3;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "f", "Landroidx/compose/ui/platform/AndroidComposeView;", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "D", "()Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lvn0;", "C", "()Lvn0;", "original", "", "e", "Z", "disposed", "Landroidx/lifecycle/Lifecycle;", "g", "Landroidx/lifecycle/Lifecycle;", "addedToLifecycle", "k", "Lfd2;", "lastContent", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lvn0;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.WrappedComposition */
/* compiled from: Wrapper.android.kt */
final class WrappedComposition implements vn0, C0715e {

    /* renamed from: a */
    public final AndroidComposeView f2101a;

    /* renamed from: d */
    public final vn0 f2102d;

    /* renamed from: e */
    public boolean f2103e;

    /* renamed from: g */
    public Lifecycle f2104g;

    /* renamed from: k */
    public fd2<? super nn0, ? super Integer, r37> f2105k = ComposableSingletons$Wrapper_androidKt.f2018a.mo3916a();

    public WrappedComposition(AndroidComposeView androidComposeView, vn0 vn0) {
        vx2.m53591g(androidComposeView, ENS.FUNC_OWNER);
        vx2.m53591g(vn0, "original");
        this.f2101a = androidComposeView;
        this.f2102d = vn0;
    }

    /* renamed from: C */
    public final vn0 mo3980C() {
        return this.f2102d;
    }

    /* renamed from: D */
    public final AndroidComposeView mo3981D() {
        return this.f2101a;
    }

    /* renamed from: d */
    public void mo3982d(fd2<? super nn0, ? super Integer, r37> fd2) {
        vx2.m53591g(fd2, PublicResolver.FUNC_CONTENT);
        this.f2101a.setOnViewTreeOwnersAvailable(new WrappedComposition$setContent$1(this, fd2));
    }

    public void dispose() {
        if (!this.f2103e) {
            this.f2103e = true;
            this.f2101a.getView().setTag(o35.wrapped_composition_tag, (Object) null);
            Lifecycle lifecycle = this.f2104g;
            if (lifecycle != null) {
                lifecycle.mo6297c(this);
            }
        }
        this.f2102d.dispose();
    }

    /* renamed from: f */
    public void mo907f(ug3 ug3, Lifecycle.Event event) {
        vx2.m53591g(ug3, "source");
        vx2.m53591g(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else if (event == Lifecycle.Event.ON_CREATE && !this.f2103e) {
            mo3982d(this.f2105k);
        }
    }
}

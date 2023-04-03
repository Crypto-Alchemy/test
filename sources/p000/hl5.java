package p000;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.Recreator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.ENS;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Lhl5;", "", "Lr37;", "c", "Landroid/os/Bundle;", "savedState", "d", "outBundle", "e", "Lil5;", "a", "Lil5;", "owner", "Lgl5;", "b", "Lgl5;", "()Lgl5;", "savedStateRegistry", "", "Z", "attached", "<init>", "(Lil5;)V", "savedstate_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: hl5 */
/* compiled from: SavedStateRegistryController.kt */
public final class hl5 {

    /* renamed from: d */
    public static final C2479a f12923d = new C2479a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final il5 f12924a;

    /* renamed from: b */
    public final gl5 f12925b;

    /* renamed from: c */
    public boolean f12926c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, mo44877d2 = {"Lhl5$a;", "", "Lil5;", "owner", "Lhl5;", "a", "<init>", "()V", "savedstate_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: hl5$a */
    /* compiled from: SavedStateRegistryController.kt */
    public static final class C2479a {
        public C2479a() {
        }

        public /* synthetic */ C2479a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final hl5 mo21225a(il5 il5) {
            vx2.m53591g(il5, ENS.FUNC_OWNER);
            return new hl5(il5, (DefaultConstructorMarker) null);
        }
    }

    public hl5(il5 il5) {
        this.f12924a = il5;
        this.f12925b = new gl5();
    }

    public /* synthetic */ hl5(il5 il5, DefaultConstructorMarker defaultConstructorMarker) {
        this(il5);
    }

    /* renamed from: a */
    public static final hl5 m18968a(il5 il5) {
        return f12923d.mo21225a(il5);
    }

    /* renamed from: b */
    public final gl5 mo21221b() {
        return this.f12925b;
    }

    /* renamed from: c */
    public final void mo21222c() {
        boolean z;
        Lifecycle lifecycle = this.f12924a.getLifecycle();
        vx2.m53590f(lifecycle, "owner.lifecycle");
        if (lifecycle.mo6296b() == Lifecycle.State.INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lifecycle.mo6295a(new Recreator(this.f12924a));
            this.f12925b.mo20645e(lifecycle);
            this.f12926c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    /* renamed from: d */
    public final void mo21223d(Bundle bundle) {
        if (!this.f12926c) {
            mo21222c();
        }
        Lifecycle lifecycle = this.f12924a.getLifecycle();
        vx2.m53590f(lifecycle, "owner.lifecycle");
        if (!lifecycle.mo6296b().isAtLeast(Lifecycle.State.STARTED)) {
            this.f12925b.mo20646f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo6296b()).toString());
    }

    /* renamed from: e */
    public final void mo21224e(Bundle bundle) {
        vx2.m53591g(bundle, "outBundle");
        this.f12925b.mo20647g(bundle);
    }
}

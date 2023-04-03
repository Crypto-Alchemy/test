package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import kotlin.C6169a;
import kotlin.Metadata;
import p000.gl5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u001a"}, mo44877d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Lgl5$c;", "Landroid/os/Bundle;", "a", "Lr37;", "d", "", "key", "b", "Lgl5;", "Lgl5;", "savedStateRegistry", "", "Z", "restored", "c", "Landroid/os/Bundle;", "restoredState", "Lel5;", "Lef3;", "()Lel5;", "viewModel", "Lhd7;", "viewModelStoreOwner", "<init>", "(Lgl5;Lhd7;)V", "lifecycle-viewmodel-savedstate_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: SavedStateHandleSupport.kt */
public final class SavedStateHandlesProvider implements gl5.C2404c {

    /* renamed from: a */
    public final gl5 f3935a;

    /* renamed from: b */
    public boolean f3936b;

    /* renamed from: c */
    public Bundle f3937c;

    /* renamed from: d */
    public final ef3 f3938d;

    public SavedStateHandlesProvider(gl5 gl5, hd7 hd7) {
        vx2.m53591g(gl5, "savedStateRegistry");
        vx2.m53591g(hd7, "viewModelStoreOwner");
        this.f3935a = gl5;
        this.f3938d = C6169a.m47232a(new SavedStateHandlesProvider$viewModel$2(hd7));
    }

    /* renamed from: a */
    public Bundle mo1056a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3937c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry next : mo6368c().mo19299b().entrySet()) {
            String str = (String) next.getKey();
            Bundle a = ((dl5) next.getValue()).mo18832h().mo1056a();
            if (!vx2.m53586b(a, Bundle.EMPTY)) {
                bundle.putBundle(str, a);
            }
        }
        this.f3936b = false;
        return bundle;
    }

    /* renamed from: b */
    public final Bundle mo6367b(String str) {
        Bundle bundle;
        vx2.m53591g(str, "key");
        mo6369d();
        Bundle bundle2 = this.f3937c;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(str);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.f3937c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f3937c;
        boolean z = true;
        if (bundle4 == null || !bundle4.isEmpty()) {
            z = false;
        }
        if (z) {
            this.f3937c = null;
        }
        return bundle;
    }

    /* renamed from: c */
    public final el5 mo6368c() {
        return (el5) this.f3938d.getValue();
    }

    /* renamed from: d */
    public final void mo6369d() {
        if (!this.f3936b) {
            this.f3937c = this.f3935a.mo20643b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f3936b = true;
            mo6368c();
        }
    }
}

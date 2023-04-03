package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: i9 */
/* compiled from: ActionProvider */
public abstract class C2532i9 {

    /* renamed from: a */
    public final Context f13208a;

    /* renamed from: b */
    public C2533a f13209b;

    /* renamed from: c */
    public C2534b f13210c;

    /* renamed from: i9$a */
    /* compiled from: ActionProvider */
    public interface C2533a {
        /* renamed from: a */
        void mo1703a(boolean z);
    }

    /* renamed from: i9$b */
    /* compiled from: ActionProvider */
    public interface C2534b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C2532i9(Context context) {
        this.f13208a = context;
    }

    /* renamed from: a */
    public boolean mo11872a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo11876b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo11873c();

    /* renamed from: d */
    public View mo11877d(MenuItem menuItem) {
        return mo11873c();
    }

    /* renamed from: e */
    public boolean mo11874e() {
        return false;
    }

    /* renamed from: f */
    public void mo11875f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo11878g() {
        return false;
    }

    /* renamed from: h */
    public void mo21503h() {
        this.f13210c = null;
        this.f13209b = null;
    }

    /* renamed from: i */
    public void mo21504i(C2533a aVar) {
        this.f13209b = aVar;
    }

    /* renamed from: j */
    public void mo11879j(C2534b bVar) {
        if (!(this.f13210c == null || bVar == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
        }
        this.f13210c = bVar;
    }

    /* renamed from: k */
    public void mo21505k(boolean z) {
        C2533a aVar = this.f13209b;
        if (aVar != null) {
            aVar.mo1703a(z);
        }
    }
}

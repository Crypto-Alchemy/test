package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p000.C2346g9;

/* renamed from: vd6 */
/* compiled from: SupportActionModeWrapper */
public class vd6 extends ActionMode {

    /* renamed from: a */
    public final Context f18729a;

    /* renamed from: b */
    public final C2346g9 f18730b;

    /* renamed from: vd6$a */
    /* compiled from: SupportActionModeWrapper */
    public static class C3479a implements C2346g9.C2347a {

        /* renamed from: a */
        public final ActionMode.Callback f18731a;

        /* renamed from: b */
        public final Context f18732b;

        /* renamed from: c */
        public final ArrayList<vd6> f18733c = new ArrayList<>();

        /* renamed from: d */
        public final y16<Menu, Menu> f18734d = new y16<>();

        public C3479a(Context context, ActionMode.Callback callback) {
            this.f18732b = context;
            this.f18731a = callback;
        }

        /* renamed from: a */
        public boolean mo1170a(C2346g9 g9Var, MenuItem menuItem) {
            return this.f18731a.onActionItemClicked(mo27113e(g9Var), new bu3(this.f18732b, (zd6) menuItem));
        }

        /* renamed from: b */
        public void mo1171b(C2346g9 g9Var) {
            this.f18731a.onDestroyActionMode(mo27113e(g9Var));
        }

        /* renamed from: c */
        public boolean mo1172c(C2346g9 g9Var, Menu menu) {
            return this.f18731a.onCreateActionMode(mo27113e(g9Var), mo27114f(menu));
        }

        /* renamed from: d */
        public boolean mo1173d(C2346g9 g9Var, Menu menu) {
            return this.f18731a.onPrepareActionMode(mo27113e(g9Var), mo27114f(menu));
        }

        /* renamed from: e */
        public ActionMode mo27113e(C2346g9 g9Var) {
            int size = this.f18733c.size();
            for (int i = 0; i < size; i++) {
                vd6 vd6 = this.f18733c.get(i);
                if (vd6 != null && vd6.f18730b == g9Var) {
                    return vd6;
                }
            }
            vd6 vd62 = new vd6(this.f18732b, g9Var);
            this.f18733c.add(vd62);
            return vd62;
        }

        /* renamed from: f */
        public final Menu mo27114f(Menu menu) {
            Menu menu2 = this.f18734d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            fu3 fu3 = new fu3(this.f18732b, (xd6) menu);
            this.f18734d.put(menu, fu3);
            return fu3;
        }
    }

    public vd6(Context context, C2346g9 g9Var) {
        this.f18729a = context;
        this.f18730b = g9Var;
    }

    public void finish() {
        this.f18730b.mo1243c();
    }

    public View getCustomView() {
        return this.f18730b.mo1244d();
    }

    public Menu getMenu() {
        return new fu3(this.f18729a, (xd6) this.f18730b.mo1245e());
    }

    public MenuInflater getMenuInflater() {
        return this.f18730b.mo1246f();
    }

    public CharSequence getSubtitle() {
        return this.f18730b.mo1247g();
    }

    public Object getTag() {
        return this.f18730b.mo20435h();
    }

    public CharSequence getTitle() {
        return this.f18730b.mo1248i();
    }

    public boolean getTitleOptionalHint() {
        return this.f18730b.mo20436j();
    }

    public void invalidate() {
        this.f18730b.mo1249k();
    }

    public boolean isTitleOptional() {
        return this.f18730b.mo1250l();
    }

    public void setCustomView(View view) {
        this.f18730b.mo1251m(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f18730b.mo1253o(charSequence);
    }

    public void setTag(Object obj) {
        this.f18730b.mo20437p(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f18730b.mo1255r(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f18730b.mo1256s(z);
    }

    public void setSubtitle(int i) {
        this.f18730b.mo1252n(i);
    }

    public void setTitle(int i) {
        this.f18730b.mo1254q(i);
    }
}

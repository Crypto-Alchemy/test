package p000;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: g9 */
/* compiled from: ActionMode */
public abstract class C2346g9 {

    /* renamed from: a */
    public Object f12206a;

    /* renamed from: d */
    public boolean f12207d;

    /* renamed from: g9$a */
    /* compiled from: ActionMode */
    public interface C2347a {
        /* renamed from: a */
        boolean mo1170a(C2346g9 g9Var, MenuItem menuItem);

        /* renamed from: b */
        void mo1171b(C2346g9 g9Var);

        /* renamed from: c */
        boolean mo1172c(C2346g9 g9Var, Menu menu);

        /* renamed from: d */
        boolean mo1173d(C2346g9 g9Var, Menu menu);
    }

    /* renamed from: c */
    public abstract void mo1243c();

    /* renamed from: d */
    public abstract View mo1244d();

    /* renamed from: e */
    public abstract Menu mo1245e();

    /* renamed from: f */
    public abstract MenuInflater mo1246f();

    /* renamed from: g */
    public abstract CharSequence mo1247g();

    /* renamed from: h */
    public Object mo20435h() {
        return this.f12206a;
    }

    /* renamed from: i */
    public abstract CharSequence mo1248i();

    /* renamed from: j */
    public boolean mo20436j() {
        return this.f12207d;
    }

    /* renamed from: k */
    public abstract void mo1249k();

    /* renamed from: l */
    public abstract boolean mo1250l();

    /* renamed from: m */
    public abstract void mo1251m(View view);

    /* renamed from: n */
    public abstract void mo1252n(int i);

    /* renamed from: o */
    public abstract void mo1253o(CharSequence charSequence);

    /* renamed from: p */
    public void mo20437p(Object obj) {
        this.f12206a = obj;
    }

    /* renamed from: q */
    public abstract void mo1254q(int i);

    /* renamed from: r */
    public abstract void mo1255r(CharSequence charSequence);

    /* renamed from: s */
    public void mo1256s(boolean z) {
        this.f12207d = z;
    }
}

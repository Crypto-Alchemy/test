package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0182i;
import androidx.appcompat.widget.C0274a;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.app.c */
/* compiled from: ToolbarActionBar */
public class C0150c extends ActionBar {

    /* renamed from: a */
    public final r31 f614a;

    /* renamed from: b */
    public final Window.Callback f615b;

    /* renamed from: c */
    public final AppCompatDelegateImpl.C0131g f616c;

    /* renamed from: d */
    public boolean f617d;

    /* renamed from: e */
    public boolean f618e;

    /* renamed from: f */
    public boolean f619f;

    /* renamed from: g */
    public ArrayList<ActionBar.C0110a> f620g = new ArrayList<>();

    /* renamed from: h */
    public final Runnable f621h = new C0151a();

    /* renamed from: i */
    public final Toolbar.C0272e f622i;

    /* renamed from: androidx.appcompat.app.c$a */
    /* compiled from: ToolbarActionBar */
    public class C0151a implements Runnable {
        public C0151a() {
        }

        public void run() {
            C0150c.this.mo1216B();
        }
    }

    /* renamed from: androidx.appcompat.app.c$b */
    /* compiled from: ToolbarActionBar */
    public class C0152b implements Toolbar.C0272e {
        public C0152b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0150c.this.f615b.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.c$c */
    /* compiled from: ToolbarActionBar */
    public final class C0153c implements C0182i.C0183a {

        /* renamed from: a */
        public boolean f625a;

        public C0153c() {
        }

        /* renamed from: b */
        public void mo1168b(C0173e eVar, boolean z) {
            if (!this.f625a) {
                this.f625a = true;
                C0150c.this.f614a.mo2603p();
                C0150c.this.f615b.onPanelClosed(108, eVar);
                this.f625a = false;
            }
        }

        /* renamed from: c */
        public boolean mo1169c(C0173e eVar) {
            C0150c.this.f615b.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.c$d */
    /* compiled from: ToolbarActionBar */
    public final class C0154d implements C0173e.C0174a {
        public C0154d() {
        }

        /* renamed from: a */
        public boolean mo1098a(C0173e eVar, MenuItem menuItem) {
            return false;
        }

        /* renamed from: b */
        public void mo1100b(C0173e eVar) {
            if (C0150c.this.f614a.mo2589d()) {
                C0150c.this.f615b.onPanelClosed(108, eVar);
            } else if (C0150c.this.f615b.onPreparePanel(0, (View) null, eVar)) {
                C0150c.this.f615b.onMenuOpened(108, eVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.c$e */
    /* compiled from: ToolbarActionBar */
    public class C0155e implements AppCompatDelegateImpl.C0131g {
        public C0155e() {
        }

        /* renamed from: a */
        public boolean mo1166a(int i) {
            if (i != 0) {
                return false;
            }
            C0150c cVar = C0150c.this;
            if (cVar.f617d) {
                return false;
            }
            cVar.f614a.setMenuPrepared();
            C0150c.this.f617d = true;
            return false;
        }

        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C0150c.this.f614a.getContext());
            }
            return null;
        }
    }

    public C0150c(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C0152b bVar = new C0152b();
        this.f622i = bVar;
        gu4.m18428f(toolbar);
        C0274a aVar = new C0274a(toolbar, false);
        this.f614a = aVar;
        this.f615b = (Window.Callback) gu4.m18428f(callback);
        aVar.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        aVar.setWindowTitle(charSequence);
        this.f616c = new C0155e();
    }

    /* renamed from: A */
    public final Menu mo1215A() {
        if (!this.f618e) {
            this.f614a.mo2606s(new C0153c(), new C0154d());
            this.f618e = true;
        }
        return this.f614a.mo2595h();
    }

    /* renamed from: B */
    public void mo1216B() {
        C0173e eVar;
        Menu A = mo1215A();
        if (A instanceof C0173e) {
            eVar = (C0173e) A;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            eVar.mo1428h0();
        }
        try {
            A.clear();
            if (!this.f615b.onCreatePanelMenu(0, A) || !this.f615b.onPreparePanel(0, (View) null, A)) {
                A.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.mo1425g0();
            }
        }
    }

    /* renamed from: C */
    public void mo1217C(int i, int i2) {
        this.f614a.mo2592g((i & i2) | ((~i2) & this.f614a.mo2615t()));
    }

    /* renamed from: g */
    public boolean mo954g() {
        return this.f614a.mo2586b();
    }

    /* renamed from: h */
    public boolean mo955h() {
        if (!this.f614a.mo2591f()) {
            return false;
        }
        this.f614a.collapseActionView();
        return true;
    }

    /* renamed from: i */
    public void mo956i(boolean z) {
        if (z != this.f619f) {
            this.f619f = z;
            int size = this.f620g.size();
            for (int i = 0; i < size; i++) {
                this.f620g.get(i).onMenuVisibilityChanged(z);
            }
        }
    }

    /* renamed from: j */
    public int mo957j() {
        return this.f614a.mo2615t();
    }

    /* renamed from: k */
    public Context mo958k() {
        return this.f614a.getContext();
    }

    /* renamed from: l */
    public void mo959l() {
        this.f614a.setVisibility(8);
    }

    /* renamed from: m */
    public boolean mo960m() {
        this.f614a.mo2598k().removeCallbacks(this.f621h);
        ga7.m17769h0(this.f614a.mo2598k(), this.f621h);
        return true;
    }

    /* renamed from: n */
    public void mo961n(Configuration configuration) {
        super.mo961n(configuration);
    }

    /* renamed from: o */
    public void mo962o() {
        this.f614a.mo2598k().removeCallbacks(this.f621h);
    }

    /* renamed from: p */
    public boolean mo963p(int i, KeyEvent keyEvent) {
        int i2;
        Menu A = mo1215A();
        if (A == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        A.setQwertyMode(z);
        return A.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: q */
    public boolean mo964q(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo965r();
        }
        return true;
    }

    /* renamed from: r */
    public boolean mo965r() {
        return this.f614a.mo2587c();
    }

    /* renamed from: s */
    public void mo966s(boolean z) {
    }

    /* renamed from: t */
    public void mo967t(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        mo1217C(i, 4);
    }

    /* renamed from: u */
    public void mo968u(int i) {
        this.f614a.mo2600m(i);
    }

    /* renamed from: v */
    public void mo969v(Drawable drawable) {
        this.f614a.mo2617v(drawable);
    }

    /* renamed from: w */
    public void mo970w(boolean z) {
    }

    /* renamed from: x */
    public void mo971x(CharSequence charSequence) {
        this.f614a.setTitle(charSequence);
    }

    /* renamed from: y */
    public void mo972y(CharSequence charSequence) {
        this.f614a.setWindowTitle(charSequence);
    }
}

package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: yy */
/* compiled from: BaseMenuWrapper */
public abstract class C3702yy {

    /* renamed from: a */
    public final Context f20402a;

    /* renamed from: b */
    public y16<zd6, MenuItem> f20403b;

    /* renamed from: c */
    public y16<ke6, SubMenu> f20404c;

    public C3702yy(Context context) {
        this.f20402a = context;
    }

    /* renamed from: c */
    public final MenuItem mo28269c(MenuItem menuItem) {
        if (!(menuItem instanceof zd6)) {
            return menuItem;
        }
        zd6 zd6 = (zd6) menuItem;
        if (this.f20403b == null) {
            this.f20403b = new y16<>();
        }
        MenuItem menuItem2 = this.f20403b.get(zd6);
        if (menuItem2 != null) {
            return menuItem2;
        }
        bu3 bu3 = new bu3(this.f20402a, zd6);
        this.f20403b.put(zd6, bu3);
        return bu3;
    }

    /* renamed from: d */
    public final SubMenu mo28270d(SubMenu subMenu) {
        if (!(subMenu instanceof ke6)) {
            return subMenu;
        }
        ke6 ke6 = (ke6) subMenu;
        if (this.f20404c == null) {
            this.f20404c = new y16<>();
        }
        SubMenu subMenu2 = this.f20404c.get(ke6);
        if (subMenu2 != null) {
            return subMenu2;
        }
        gc6 gc6 = new gc6(this.f20402a, ke6);
        this.f20404c.put(ke6, gc6);
        return gc6;
    }

    /* renamed from: e */
    public final void mo28271e() {
        y16<zd6, MenuItem> y16 = this.f20403b;
        if (y16 != null) {
            y16.clear();
        }
        y16<ke6, SubMenu> y162 = this.f20404c;
        if (y162 != null) {
            y162.clear();
        }
    }

    /* renamed from: f */
    public final void mo28272f(int i) {
        if (this.f20403b != null) {
            int i2 = 0;
            while (i2 < this.f20403b.size()) {
                if (this.f20403b.mo27919i(i2).getGroupId() == i) {
                    this.f20403b.mo22211k(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    /* renamed from: g */
    public final void mo28273g(int i) {
        if (this.f20403b != null) {
            for (int i2 = 0; i2 < this.f20403b.size(); i2++) {
                if (this.f20403b.mo27919i(i2).getItemId() == i) {
                    this.f20403b.mo22211k(i2);
                    return;
                }
            }
        }
    }
}

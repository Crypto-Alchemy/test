package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0173e;

/* renamed from: androidx.appcompat.view.menu.l */
/* compiled from: SubMenuBuilder */
public class C0189l extends C0173e implements SubMenu {

    /* renamed from: B */
    public C0173e f865B;

    /* renamed from: C */
    public C0177g f866C;

    public C0189l(Context context, C0173e eVar, C0177g gVar) {
        super(context);
        this.f865B = eVar;
        this.f866C = gVar;
    }

    /* renamed from: F */
    public C0173e mo1378F() {
        return this.f865B.mo1378F();
    }

    /* renamed from: H */
    public boolean mo1380H() {
        return this.f865B.mo1380H();
    }

    /* renamed from: I */
    public boolean mo1381I() {
        return this.f865B.mo1381I();
    }

    /* renamed from: J */
    public boolean mo1382J() {
        return this.f865B.mo1382J();
    }

    /* renamed from: V */
    public void mo1394V(C0173e.C0174a aVar) {
        this.f865B.mo1394V(aVar);
    }

    /* renamed from: f */
    public boolean mo1421f(C0177g gVar) {
        return this.f865B.mo1421f(gVar);
    }

    public MenuItem getItem() {
        return this.f866C;
    }

    /* renamed from: h */
    public boolean mo1427h(C0173e eVar, MenuItem menuItem) {
        if (super.mo1427h(eVar, menuItem) || this.f865B.mo1427h(eVar, menuItem)) {
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    public Menu mo1568i0() {
        return this.f865B;
    }

    /* renamed from: m */
    public boolean mo1435m(C0177g gVar) {
        return this.f865B.mo1435m(gVar);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f865B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo1398Z(drawable);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo1413c0(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo1418d0(view);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f866C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f865B.setQwertyMode(z);
    }

    /* renamed from: v */
    public String mo1453v() {
        int i;
        C0177g gVar = this.f866C;
        if (gVar != null) {
            i = gVar.getItemId();
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return super.mo1453v() + ":" + i;
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo1397Y(i);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo1411b0(i);
    }

    public SubMenu setIcon(int i) {
        this.f866C.setIcon(i);
        return this;
    }
}

package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: f9 */
/* compiled from: ActionMenuItem */
public class C2269f9 implements zd6 {

    /* renamed from: a */
    public final int f11563a;

    /* renamed from: b */
    public final int f11564b;

    /* renamed from: c */
    public final int f11565c;

    /* renamed from: d */
    public CharSequence f11566d;

    /* renamed from: e */
    public CharSequence f11567e;

    /* renamed from: f */
    public Intent f11568f;

    /* renamed from: g */
    public char f11569g;

    /* renamed from: h */
    public int f11570h = 4096;

    /* renamed from: i */
    public char f11571i;

    /* renamed from: j */
    public int f11572j = 4096;

    /* renamed from: k */
    public Drawable f11573k;

    /* renamed from: l */
    public Context f11574l;

    /* renamed from: m */
    public MenuItem.OnMenuItemClickListener f11575m;

    /* renamed from: n */
    public CharSequence f11576n;

    /* renamed from: o */
    public CharSequence f11577o;

    /* renamed from: p */
    public ColorStateList f11578p = null;

    /* renamed from: q */
    public PorterDuff.Mode f11579q = null;

    /* renamed from: r */
    public boolean f11580r = false;

    /* renamed from: s */
    public boolean f11581s = false;

    /* renamed from: t */
    public int f11582t = 16;

    public C2269f9(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f11574l = context;
        this.f11563a = i2;
        this.f11564b = i;
        this.f11565c = i4;
        this.f11566d = charSequence;
    }

    /* renamed from: a */
    public zd6 mo1465a(C2532i9 i9Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public C2532i9 mo1466b() {
        return null;
    }

    /* renamed from: c */
    public final void mo19728c() {
        Drawable drawable = this.f11573k;
        if (drawable == null) {
            return;
        }
        if (this.f11580r || this.f11581s) {
            Drawable r = ij1.m19659r(drawable);
            this.f11573k = r;
            Drawable mutate = r.mutate();
            this.f11573k = mutate;
            if (this.f11580r) {
                ij1.m19656o(mutate, this.f11578p);
            }
            if (this.f11581s) {
                ij1.m19657p(this.f11573k, this.f11579q);
            }
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public zd6 setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public zd6 setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public zd6 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f11572j;
    }

    public char getAlphabeticShortcut() {
        return this.f11571i;
    }

    public CharSequence getContentDescription() {
        return this.f11576n;
    }

    public int getGroupId() {
        return this.f11564b;
    }

    public Drawable getIcon() {
        return this.f11573k;
    }

    public ColorStateList getIconTintList() {
        return this.f11578p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f11579q;
    }

    public Intent getIntent() {
        return this.f11568f;
    }

    public int getItemId() {
        return this.f11563a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f11570h;
    }

    public char getNumericShortcut() {
        return this.f11569g;
    }

    public int getOrder() {
        return this.f11565c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f11566d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11567e;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f11566d;
    }

    public CharSequence getTooltipText() {
        return this.f11577o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        if ((this.f11582t & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isChecked() {
        if ((this.f11582t & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isEnabled() {
        if ((this.f11582t & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        if ((this.f11582t & 8) == 0) {
            return true;
        }
        return false;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f11571i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f11582t = z | (this.f11582t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        int i;
        int i2 = this.f11582t & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f11582t = i | i2;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        int i;
        int i2 = this.f11582t & -17;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        this.f11582t = i | i2;
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f11573k = drawable;
        mo19728c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11578p = colorStateList;
        this.f11580r = true;
        mo19728c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11579q = mode;
        this.f11581s = true;
        mo19728c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f11568f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f11569g = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11575m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f11569g = c;
        this.f11571i = Character.toLowerCase(c2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f11566d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11567e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f11582t & 8;
        if (z) {
            i = 0;
        }
        this.f11582t = i2 | i;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f11571i = Character.toLowerCase(c);
        this.f11572j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public zd6 setContentDescription(CharSequence charSequence) {
        this.f11576n = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f11569g = c;
        this.f11570h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f11566d = this.f11574l.getResources().getString(i);
        return this;
    }

    public zd6 setTooltipText(CharSequence charSequence) {
        this.f11577o = charSequence;
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f11573k = zr0.m31442e(this.f11574l, i);
        mo19728c();
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f11569g = c;
        this.f11570h = KeyEvent.normalizeMetaState(i);
        this.f11571i = Character.toLowerCase(c2);
        this.f11572j = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}

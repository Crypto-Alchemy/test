package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0184j;
import p000.C2532i9;

/* renamed from: androidx.appcompat.view.menu.g */
/* compiled from: MenuItemImpl */
public final class C0177g implements zd6 {

    /* renamed from: A */
    public View f797A;

    /* renamed from: B */
    public C2532i9 f798B;

    /* renamed from: C */
    public MenuItem.OnActionExpandListener f799C;

    /* renamed from: D */
    public boolean f800D = false;

    /* renamed from: E */
    public ContextMenu.ContextMenuInfo f801E;

    /* renamed from: a */
    public final int f802a;

    /* renamed from: b */
    public final int f803b;

    /* renamed from: c */
    public final int f804c;

    /* renamed from: d */
    public final int f805d;

    /* renamed from: e */
    public CharSequence f806e;

    /* renamed from: f */
    public CharSequence f807f;

    /* renamed from: g */
    public Intent f808g;

    /* renamed from: h */
    public char f809h;

    /* renamed from: i */
    public int f810i = 4096;

    /* renamed from: j */
    public char f811j;

    /* renamed from: k */
    public int f812k = 4096;

    /* renamed from: l */
    public Drawable f813l;

    /* renamed from: m */
    public int f814m = 0;

    /* renamed from: n */
    public C0173e f815n;

    /* renamed from: o */
    public C0189l f816o;

    /* renamed from: p */
    public Runnable f817p;

    /* renamed from: q */
    public MenuItem.OnMenuItemClickListener f818q;

    /* renamed from: r */
    public CharSequence f819r;

    /* renamed from: s */
    public CharSequence f820s;

    /* renamed from: t */
    public ColorStateList f821t = null;

    /* renamed from: u */
    public PorterDuff.Mode f822u = null;

    /* renamed from: v */
    public boolean f823v = false;

    /* renamed from: w */
    public boolean f824w = false;

    /* renamed from: x */
    public boolean f825x = false;

    /* renamed from: y */
    public int f826y = 16;

    /* renamed from: z */
    public int f827z;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* compiled from: MenuItemImpl */
    public class C0178a implements C2532i9.C2534b {
        public C0178a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0177g gVar = C0177g.this;
            gVar.f815n.mo1384L(gVar);
        }
    }

    public C0177g(C0173e eVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f815n = eVar;
        this.f802a = i2;
        this.f803b = i;
        this.f804c = i3;
        this.f805d = i4;
        this.f806e = charSequence;
        this.f827z = i5;
    }

    /* renamed from: d */
    public static void m1138d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: A */
    public boolean mo1463A() {
        if (!this.f815n.mo1382J() || mo1472g() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public boolean mo1464B() {
        if ((this.f827z & 4) == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public zd6 mo1465a(C2532i9 i9Var) {
        C2532i9 i9Var2 = this.f798B;
        if (i9Var2 != null) {
            i9Var2.mo21503h();
        }
        this.f797A = null;
        this.f798B = i9Var;
        this.f815n.mo1385M(true);
        C2532i9 i9Var3 = this.f798B;
        if (i9Var3 != null) {
            i9Var3.mo11879j(new C0178a());
        }
        return this;
    }

    /* renamed from: b */
    public C2532i9 mo1466b() {
        return this.f798B;
    }

    /* renamed from: c */
    public void mo1467c() {
        this.f815n.mo1383K(this);
    }

    public boolean collapseActionView() {
        if ((this.f827z & 8) == 0) {
            return false;
        }
        if (this.f797A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f799C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f815n.mo1421f(this);
        }
        return false;
    }

    /* renamed from: e */
    public final Drawable mo1469e(Drawable drawable) {
        if (drawable != null && this.f825x && (this.f823v || this.f824w)) {
            drawable = ij1.m19659r(drawable).mutate();
            if (this.f823v) {
                ij1.m19656o(drawable, this.f821t);
            }
            if (this.f824w) {
                ij1.m19657p(drawable, this.f822u);
            }
            this.f825x = false;
        }
        return drawable;
    }

    public boolean expandActionView() {
        if (!mo1500j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f799C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f815n.mo1435m(this);
        }
        return false;
    }

    /* renamed from: f */
    public int mo1471f() {
        return this.f805d;
    }

    /* renamed from: g */
    public char mo1472g() {
        if (this.f815n.mo1381I()) {
            return this.f811j;
        }
        return this.f809h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f797A;
        if (view != null) {
            return view;
        }
        C2532i9 i9Var = this.f798B;
        if (i9Var == null) {
            return null;
        }
        View d = i9Var.mo11877d(this);
        this.f797A = d;
        return d;
    }

    public int getAlphabeticModifiers() {
        return this.f812k;
    }

    public char getAlphabeticShortcut() {
        return this.f811j;
    }

    public CharSequence getContentDescription() {
        return this.f819r;
    }

    public int getGroupId() {
        return this.f803b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f813l;
        if (drawable != null) {
            return mo1469e(drawable);
        }
        if (this.f814m == 0) {
            return null;
        }
        Drawable b = C2554in.m19714b(this.f815n.mo1454w(), this.f814m);
        this.f814m = 0;
        this.f813l = b;
        return mo1469e(b);
    }

    public ColorStateList getIconTintList() {
        return this.f821t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f822u;
    }

    public Intent getIntent() {
        return this.f808g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f802a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f801E;
    }

    public int getNumericModifiers() {
        return this.f810i;
    }

    public char getNumericShortcut() {
        return this.f809h;
    }

    public int getOrder() {
        return this.f804c;
    }

    public SubMenu getSubMenu() {
        return this.f816o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f806e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f807f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f806e;
    }

    public CharSequence getTooltipText() {
        return this.f820s;
    }

    /* renamed from: h */
    public String mo1492h() {
        int i;
        char g = mo1472g();
        if (g == 0) {
            return "";
        }
        Resources resources = this.f815n.mo1454w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f815n.mo1454w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(a55.abc_prepend_shortcut_label));
        }
        if (this.f815n.mo1381I()) {
            i = this.f812k;
        } else {
            i = this.f810i;
        }
        m1138d(sb, i, 65536, resources.getString(a55.abc_menu_meta_shortcut_label));
        m1138d(sb, i, 4096, resources.getString(a55.abc_menu_ctrl_shortcut_label));
        m1138d(sb, i, 2, resources.getString(a55.abc_menu_alt_shortcut_label));
        m1138d(sb, i, 1, resources.getString(a55.abc_menu_shift_shortcut_label));
        m1138d(sb, i, 4, resources.getString(a55.abc_menu_sym_shortcut_label));
        m1138d(sb, i, 8, resources.getString(a55.abc_menu_function_shortcut_label));
        if (g == 8) {
            sb.append(resources.getString(a55.abc_menu_delete_shortcut_label));
        } else if (g == 10) {
            sb.append(resources.getString(a55.abc_menu_enter_shortcut_label));
        } else if (g != ' ') {
            sb.append(g);
        } else {
            sb.append(resources.getString(a55.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    public boolean hasSubMenu() {
        if (this.f816o != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public CharSequence mo1494i(C0184j.C0185a aVar) {
        if (aVar == null || !aVar.mo1261d()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.f800D;
    }

    public boolean isCheckable() {
        if ((this.f826y & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean isChecked() {
        if ((this.f826y & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean isEnabled() {
        if ((this.f826y & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        C2532i9 i9Var = this.f798B;
        if (i9Var == null || !i9Var.mo11878g()) {
            if ((this.f826y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f826y & 8) != 0 || !this.f798B.mo11876b()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: j */
    public boolean mo1500j() {
        C2532i9 i9Var;
        if ((this.f827z & 8) == 0) {
            return false;
        }
        if (this.f797A == null && (i9Var = this.f798B) != null) {
            this.f797A = i9Var.mo11877d(this);
        }
        if (this.f797A != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo1501k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f818q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0173e eVar = this.f815n;
        if (eVar.mo1427h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f817p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f808g != null) {
            try {
                this.f815n.mo1454w().startActivity(this.f808g);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        C2532i9 i9Var = this.f798B;
        if (i9Var == null || !i9Var.mo11874e()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean mo1502l() {
        if ((this.f826y & 32) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo1503m() {
        if ((this.f826y & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo1504n() {
        if ((this.f827z & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public boolean mo1505o() {
        if ((this.f827z & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public zd6 setActionView(int i) {
        Context w = this.f815n.mo1454w();
        setActionView(LayoutInflater.from(w).inflate(i, new LinearLayout(w), false));
        return this;
    }

    /* renamed from: q */
    public zd6 setActionView(View view) {
        int i;
        this.f797A = view;
        this.f798B = null;
        if (view != null && view.getId() == -1 && (i = this.f802a) > 0) {
            view.setId(i);
        }
        this.f815n.mo1383K(this);
        return this;
    }

    /* renamed from: r */
    public void mo1508r(boolean z) {
        this.f800D = z;
        this.f815n.mo1385M(false);
    }

    /* renamed from: s */
    public void mo1509s(boolean z) {
        int i;
        int i2 = this.f826y;
        int i3 = i2 & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        int i4 = i | i3;
        this.f826y = i4;
        if (i2 != i4) {
            this.f815n.mo1385M(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f811j == c) {
            return this;
        }
        this.f811j = Character.toLowerCase(c);
        this.f815n.mo1385M(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f826y;
        boolean z2 = z | (i & true);
        this.f826y = z2 ? 1 : 0;
        if (i != z2) {
            this.f815n.mo1385M(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f826y & 4) != 0) {
            this.f815n.mo1396X(this);
        } else {
            mo1509s(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f826y |= 16;
        } else {
            this.f826y &= -17;
        }
        this.f815n.mo1385M(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f814m = 0;
        this.f813l = drawable;
        this.f825x = true;
        this.f815n.mo1385M(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f821t = colorStateList;
        this.f823v = true;
        this.f825x = true;
        this.f815n.mo1385M(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f822u = mode;
        this.f824w = true;
        this.f825x = true;
        this.f815n.mo1385M(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f808g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f809h == c) {
            return this;
        }
        this.f809h = c;
        this.f815n.mo1385M(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f799C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f818q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f809h = c;
        this.f811j = Character.toLowerCase(c2);
        this.f815n.mo1385M(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f827z = i;
            this.f815n.mo1383K(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f806e = charSequence;
        this.f815n.mo1385M(false);
        C0189l lVar = this.f816o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f807f = charSequence;
        this.f815n.mo1385M(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo1543y(z)) {
            this.f815n.mo1384L(this);
        }
        return this;
    }

    /* renamed from: t */
    public void mo1537t(boolean z) {
        int i;
        int i2 = this.f826y & -5;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.f826y = i | i2;
    }

    public String toString() {
        CharSequence charSequence = this.f806e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void mo1539u(boolean z) {
        if (z) {
            this.f826y |= 32;
        } else {
            this.f826y &= -33;
        }
    }

    /* renamed from: v */
    public void mo1540v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f801E = contextMenuInfo;
    }

    /* renamed from: w */
    public zd6 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void mo1542x(C0189l lVar) {
        this.f816o = lVar;
        lVar.setHeaderTitle(getTitle());
    }

    /* renamed from: y */
    public boolean mo1543y(boolean z) {
        int i;
        int i2 = this.f826y;
        int i3 = i2 & -9;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.f826y = i4;
        if (i2 != i4) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean mo1544z() {
        return this.f815n.mo1376C();
    }

    public zd6 setContentDescription(CharSequence charSequence) {
        this.f819r = charSequence;
        this.f815n.mo1385M(false);
        return this;
    }

    public zd6 setTooltipText(CharSequence charSequence) {
        this.f820s = charSequence;
        this.f815n.mo1385M(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f811j == c && this.f812k == i) {
            return this;
        }
        this.f811j = Character.toLowerCase(c);
        this.f812k = KeyEvent.normalizeMetaState(i);
        this.f815n.mo1385M(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f809h == c && this.f810i == i) {
            return this;
        }
        this.f809h = c;
        this.f810i = KeyEvent.normalizeMetaState(i);
        this.f815n.mo1385M(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f809h = c;
        this.f810i = KeyEvent.normalizeMetaState(i);
        this.f811j = Character.toLowerCase(c2);
        this.f812k = KeyEvent.normalizeMetaState(i2);
        this.f815n.mo1385M(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f813l = null;
        this.f814m = i;
        this.f825x = true;
        this.f815n.mo1385M(false);
        return this;
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f815n.mo1454w().getString(i));
    }
}

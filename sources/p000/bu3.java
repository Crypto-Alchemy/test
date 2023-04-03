package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p000.C2532i9;

/* renamed from: bu3 */
/* compiled from: MenuItemWrapperICS */
public class bu3 extends C3702yy implements MenuItem {

    /* renamed from: d */
    public final zd6 f8252d;

    /* renamed from: e */
    public Method f8253e;

    /* renamed from: bu3$a */
    /* compiled from: MenuItemWrapperICS */
    public class C1651a extends C2532i9 {

        /* renamed from: d */
        public final ActionProvider f8254d;

        public C1651a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f8254d = actionProvider;
        }

        /* renamed from: a */
        public boolean mo11872a() {
            return this.f8254d.hasSubMenu();
        }

        /* renamed from: c */
        public View mo11873c() {
            return this.f8254d.onCreateActionView();
        }

        /* renamed from: e */
        public boolean mo11874e() {
            return this.f8254d.onPerformDefaultAction();
        }

        /* renamed from: f */
        public void mo11875f(SubMenu subMenu) {
            this.f8254d.onPrepareSubMenu(bu3.this.mo28270d(subMenu));
        }
    }

    /* renamed from: bu3$b */
    /* compiled from: MenuItemWrapperICS */
    public class C1652b extends C1651a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        public C2532i9.C2534b f8256f;

        public C1652b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: b */
        public boolean mo11876b() {
            return this.f8254d.isVisible();
        }

        /* renamed from: d */
        public View mo11877d(MenuItem menuItem) {
            return this.f8254d.onCreateActionView(menuItem);
        }

        /* renamed from: g */
        public boolean mo11878g() {
            return this.f8254d.overridesItemVisibility();
        }

        /* renamed from: j */
        public void mo11879j(C2532i9.C2534b bVar) {
            C1652b bVar2;
            this.f8256f = bVar;
            ActionProvider actionProvider = this.f8254d;
            if (bVar != null) {
                bVar2 = this;
            } else {
                bVar2 = null;
            }
            actionProvider.setVisibilityListener(bVar2);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C2532i9.C2534b bVar = this.f8256f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: bu3$c */
    /* compiled from: MenuItemWrapperICS */
    public static class C1653c extends FrameLayout implements fi0 {

        /* renamed from: a */
        public final CollapsibleActionView f8258a;

        public C1653c(View view) {
            super(view.getContext());
            this.f8258a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public View mo11881a() {
            return (View) this.f8258a;
        }

        public void onActionViewCollapsed() {
            this.f8258a.onActionViewCollapsed();
        }

        public void onActionViewExpanded() {
            this.f8258a.onActionViewExpanded();
        }
    }

    /* renamed from: bu3$d */
    /* compiled from: MenuItemWrapperICS */
    public class C1654d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f8259a;

        public C1654d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f8259a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f8259a.onMenuItemActionCollapse(bu3.this.mo28269c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f8259a.onMenuItemActionExpand(bu3.this.mo28269c(menuItem));
        }
    }

    /* renamed from: bu3$e */
    /* compiled from: MenuItemWrapperICS */
    public class C1655e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final MenuItem.OnMenuItemClickListener f8261a;

        public C1655e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f8261a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f8261a.onMenuItemClick(bu3.this.mo28269c(menuItem));
        }
    }

    public bu3(Context context, zd6 zd6) {
        super(context);
        if (zd6 != null) {
            this.f8252d = zd6;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f8252d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f8252d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C2532i9 b = this.f8252d.mo1466b();
        if (b instanceof C1651a) {
            return ((C1651a) b).f8254d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f8252d.getActionView();
        if (actionView instanceof C1653c) {
            return ((C1653c) actionView).mo11881a();
        }
        return actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f8252d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f8252d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f8252d.getContentDescription();
    }

    public int getGroupId() {
        return this.f8252d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f8252d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f8252d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f8252d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f8252d.getIntent();
    }

    public int getItemId() {
        return this.f8252d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f8252d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f8252d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f8252d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f8252d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo28270d(this.f8252d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f8252d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f8252d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f8252d.getTooltipText();
    }

    /* renamed from: h */
    public void mo11838h(boolean z) {
        try {
            if (this.f8253e == null) {
                this.f8253e = this.f8252d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f8253e.invoke(this.f8252d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception unused) {
        }
    }

    public boolean hasSubMenu() {
        return this.f8252d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f8252d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f8252d.isCheckable();
    }

    public boolean isChecked() {
        return this.f8252d.isChecked();
    }

    public boolean isEnabled() {
        return this.f8252d.isEnabled();
    }

    public boolean isVisible() {
        return this.f8252d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C1652b bVar = new C1652b(this.f20402a, actionProvider);
        zd6 zd6 = this.f8252d;
        if (actionProvider == null) {
            bVar = null;
        }
        zd6.mo1465a(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C1653c(view);
        }
        this.f8252d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f8252d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f8252d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f8252d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f8252d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f8252d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f8252d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8252d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8252d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f8252d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f8252d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        C1654d dVar;
        zd6 zd6 = this.f8252d;
        if (onActionExpandListener != null) {
            dVar = new C1654d(onActionExpandListener);
        } else {
            dVar = null;
        }
        zd6.setOnActionExpandListener(dVar);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        C1655e eVar;
        zd6 zd6 = this.f8252d;
        if (onMenuItemClickListener != null) {
            eVar = new C1655e(onMenuItemClickListener);
        } else {
            eVar = null;
        }
        zd6.setOnMenuItemClickListener(eVar);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f8252d.setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f8252d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f8252d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f8252d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8252d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f8252d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f8252d.setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f8252d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f8252d.setIcon(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f8252d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f8252d.setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f8252d.setTitle(i);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f8252d.setActionView(i);
        View actionView = this.f8252d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f8252d.setActionView((View) new C1653c(actionView));
        }
        return this;
    }
}

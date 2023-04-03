package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0182i;
import androidx.appcompat.widget.Toolbar;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.appcompat.widget.a */
/* compiled from: ToolbarWidgetWrapper */
public class C0274a implements r31 {

    /* renamed from: a */
    public Toolbar f1285a;

    /* renamed from: b */
    public int f1286b;

    /* renamed from: c */
    public View f1287c;

    /* renamed from: d */
    public View f1288d;

    /* renamed from: e */
    public Drawable f1289e;

    /* renamed from: f */
    public Drawable f1290f;

    /* renamed from: g */
    public Drawable f1291g;

    /* renamed from: h */
    public boolean f1292h;

    /* renamed from: i */
    public CharSequence f1293i;

    /* renamed from: j */
    public CharSequence f1294j;

    /* renamed from: k */
    public CharSequence f1295k;

    /* renamed from: l */
    public Window.Callback f1296l;

    /* renamed from: m */
    public boolean f1297m;

    /* renamed from: n */
    public ActionMenuPresenter f1298n;

    /* renamed from: o */
    public int f1299o;

    /* renamed from: p */
    public int f1300p;

    /* renamed from: q */
    public Drawable f1301q;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* compiled from: ToolbarWidgetWrapper */
    public class C0275a implements View.OnClickListener {

        /* renamed from: a */
        public final C2269f9 f1302a;

        public C0275a() {
            this.f1302a = new C2269f9(C0274a.this.f1285a.getContext(), 0, 16908332, 0, 0, C0274a.this.f1293i);
        }

        public void onClick(View view) {
            C0274a aVar = C0274a.this;
            Window.Callback callback = aVar.f1296l;
            if (callback != null && aVar.f1297m) {
                callback.onMenuItemSelected(0, this.f1302a);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.a$b */
    /* compiled from: ToolbarWidgetWrapper */
    public class C0276b extends yd7 {

        /* renamed from: a */
        public boolean f1304a = false;

        /* renamed from: b */
        public final /* synthetic */ int f1305b;

        public C0276b(int i) {
            this.f1305b = i;
        }

        /* renamed from: a */
        public void mo2623a(View view) {
            this.f1304a = true;
        }

        /* renamed from: b */
        public void mo1162b(View view) {
            if (!this.f1304a) {
                C0274a.this.f1285a.setVisibility(this.f1305b);
            }
        }

        /* renamed from: c */
        public void mo1163c(View view) {
            C0274a.this.f1285a.setVisibility(0);
        }
    }

    public C0274a(Toolbar toolbar, boolean z) {
        this(toolbar, z, a55.abc_action_bar_up_description, x25.abc_ic_ab_back_material);
    }

    /* renamed from: A */
    public void mo2579A(CharSequence charSequence) {
        this.f1295k = charSequence;
        mo2582D();
    }

    /* renamed from: B */
    public void mo2580B(CharSequence charSequence) {
        this.f1294j = charSequence;
        if ((this.f1286b & 8) != 0) {
            this.f1285a.setSubtitle(charSequence);
        }
    }

    /* renamed from: C */
    public final void mo2581C(CharSequence charSequence) {
        this.f1293i = charSequence;
        if ((this.f1286b & 8) != 0) {
            this.f1285a.setTitle(charSequence);
            if (this.f1292h) {
                ga7.m17791s0(this.f1285a.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: D */
    public final void mo2582D() {
        if ((this.f1286b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1295k)) {
            this.f1285a.setNavigationContentDescription(this.f1300p);
        } else {
            this.f1285a.setNavigationContentDescription(this.f1295k);
        }
    }

    /* renamed from: E */
    public final void mo2583E() {
        if ((this.f1286b & 4) != 0) {
            Toolbar toolbar = this.f1285a;
            Drawable drawable = this.f1291g;
            if (drawable == null) {
                drawable = this.f1301q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1285a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: F */
    public final void mo2584F() {
        Drawable drawable;
        int i = this.f1286b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f1290f;
            if (drawable == null) {
                drawable = this.f1289e;
            }
        } else {
            drawable = this.f1289e;
        }
        this.f1285a.setLogo(drawable);
    }

    /* renamed from: a */
    public boolean mo2585a() {
        return this.f1285a.mo2454d();
    }

    /* renamed from: b */
    public boolean mo2586b() {
        return this.f1285a.mo2553w();
    }

    /* renamed from: c */
    public boolean mo2587c() {
        return this.f1285a.mo2449L();
    }

    public void collapseActionView() {
        this.f1285a.mo2455e();
    }

    /* renamed from: d */
    public boolean mo2589d() {
        return this.f1285a.mo2439B();
    }

    /* renamed from: e */
    public boolean mo2590e() {
        return this.f1285a.mo2438A();
    }

    /* renamed from: f */
    public boolean mo2591f() {
        return this.f1285a.mo2552v();
    }

    /* renamed from: g */
    public void mo2592g(int i) {
        View view;
        int i2 = this.f1286b ^ i;
        this.f1286b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    mo2582D();
                }
                mo2583E();
            }
            if ((i2 & 3) != 0) {
                mo2584F();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1285a.setTitle(this.f1293i);
                    this.f1285a.setSubtitle(this.f1294j);
                } else {
                    this.f1285a.setTitle((CharSequence) null);
                    this.f1285a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f1288d) != null) {
                if ((i & 16) != 0) {
                    this.f1285a.addView(view);
                } else {
                    this.f1285a.removeView(view);
                }
            }
        }
    }

    public Context getContext() {
        return this.f1285a.getContext();
    }

    public CharSequence getTitle() {
        return this.f1285a.getTitle();
    }

    /* renamed from: h */
    public Menu mo2595h() {
        return this.f1285a.getMenu();
    }

    /* renamed from: i */
    public int mo2596i() {
        return this.f1299o;
    }

    /* renamed from: j */
    public vd7 mo2597j(int i, long j) {
        float f;
        vd7 e = ga7.m17762e(this.f1285a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        return e.mo27115b(f).mo27118f(j).mo27120h(new C0276b(i));
    }

    /* renamed from: k */
    public ViewGroup mo2598k() {
        return this.f1285a;
    }

    /* renamed from: l */
    public void mo2599l(boolean z) {
    }

    /* renamed from: m */
    public void mo2600m(int i) {
        String str;
        if (i == 0) {
            str = null;
        } else {
            str = getContext().getString(i);
        }
        mo2579A(str);
    }

    /* renamed from: n */
    public void mo2601n() {
    }

    /* renamed from: o */
    public void mo2602o(boolean z) {
        this.f1285a.setCollapsible(z);
    }

    /* renamed from: p */
    public void mo2603p() {
        this.f1285a.mo2456f();
    }

    /* renamed from: q */
    public void mo2604q(ScrollingTabContainerView scrollingTabContainerView) {
        Toolbar toolbar;
        View view = this.f1287c;
        if (view != null && view.getParent() == (toolbar = this.f1285a)) {
            toolbar.removeView(this.f1287c);
        }
        this.f1287c = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.f1299o == 2) {
            this.f1285a.addView(scrollingTabContainerView, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f1287c.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.f400a = 8388691;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    /* renamed from: r */
    public void mo2605r(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C2554in.m19714b(getContext(), i);
        } else {
            drawable = null;
        }
        mo2621z(drawable);
    }

    /* renamed from: s */
    public void mo2606s(C0182i.C0183a aVar, C0173e.C0174a aVar2) {
        this.f1285a.setMenuCallbacks(aVar, aVar2);
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C2554in.m19714b(getContext(), i) : null);
    }

    public void setMenu(Menu menu, C0182i.C0183a aVar) {
        if (this.f1298n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1285a.getContext());
            this.f1298n = actionMenuPresenter;
            actionMenuPresenter.mo1319s(j35.action_menu_presenter);
        }
        this.f1298n.mo1307e(aVar);
        this.f1285a.setMenu((C0173e) menu, this.f1298n);
    }

    public void setMenuPrepared() {
        this.f1297m = true;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1292h = true;
        mo2581C(charSequence);
    }

    public void setVisibility(int i) {
        this.f1285a.setVisibility(i);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1296l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1292h) {
            mo2581C(charSequence);
        }
    }

    /* renamed from: t */
    public int mo2615t() {
        return this.f1286b;
    }

    /* renamed from: u */
    public void mo2616u() {
    }

    /* renamed from: v */
    public void mo2617v(Drawable drawable) {
        this.f1291g = drawable;
        mo2583E();
    }

    /* renamed from: w */
    public final int mo2618w() {
        if (this.f1285a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1301q = this.f1285a.getNavigationIcon();
        return 15;
    }

    /* renamed from: x */
    public void mo2619x(View view) {
        View view2 = this.f1288d;
        if (!(view2 == null || (this.f1286b & 16) == 0)) {
            this.f1285a.removeView(view2);
        }
        this.f1288d = view;
        if (view != null && (this.f1286b & 16) != 0) {
            this.f1285a.addView(view);
        }
    }

    /* renamed from: y */
    public void mo2620y(int i) {
        if (i != this.f1300p) {
            this.f1300p = i;
            if (TextUtils.isEmpty(this.f1285a.getNavigationContentDescription())) {
                mo2600m(this.f1300p);
            }
        }
    }

    /* renamed from: z */
    public void mo2621z(Drawable drawable) {
        this.f1290f = drawable;
        mo2584F();
    }

    public C0274a(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1299o = 0;
        this.f1300p = 0;
        this.f1285a = toolbar;
        this.f1293i = toolbar.getTitle();
        this.f1294j = toolbar.getSubtitle();
        this.f1292h = this.f1293i != null;
        this.f1291g = toolbar.getNavigationIcon();
        yq6 v = yq6.m30733v(toolbar.getContext(), (AttributeSet) null, j65.ActionBar, m15.actionBarStyle, 0);
        this.f1301q = v.mo28181g(j65.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence p = v.mo28190p(j65.ActionBar_title);
            if (!TextUtils.isEmpty(p)) {
                setTitle(p);
            }
            CharSequence p2 = v.mo28190p(j65.ActionBar_subtitle);
            if (!TextUtils.isEmpty(p2)) {
                mo2580B(p2);
            }
            Drawable g = v.mo28181g(j65.ActionBar_logo);
            if (g != null) {
                mo2621z(g);
            }
            Drawable g2 = v.mo28181g(j65.ActionBar_icon);
            if (g2 != null) {
                setIcon(g2);
            }
            if (this.f1291g == null && (drawable = this.f1301q) != null) {
                mo2617v(drawable);
            }
            mo2592g(v.mo28185k(j65.ActionBar_displayOptions, 0));
            int n = v.mo28188n(j65.ActionBar_customNavigationLayout, 0);
            if (n != 0) {
                mo2619x(LayoutInflater.from(this.f1285a.getContext()).inflate(n, this.f1285a, false));
                mo2592g(this.f1286b | 16);
            }
            int m = v.mo28187m(j65.ActionBar_height, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1285a.getLayoutParams();
                layoutParams.height = m;
                this.f1285a.setLayoutParams(layoutParams);
            }
            int e = v.mo28179e(j65.ActionBar_contentInsetStart, -1);
            int e2 = v.mo28179e(j65.ActionBar_contentInsetEnd, -1);
            if (e >= 0 || e2 >= 0) {
                this.f1285a.setContentInsetsRelative(Math.max(e, 0), Math.max(e2, 0));
            }
            int n2 = v.mo28188n(j65.ActionBar_titleTextStyle, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.f1285a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), n2);
            }
            int n3 = v.mo28188n(j65.ActionBar_subtitleTextStyle, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.f1285a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), n3);
            }
            int n4 = v.mo28188n(j65.ActionBar_popupTheme, 0);
            if (n4 != 0) {
                this.f1285a.setPopupTheme(n4);
            }
        } else {
            this.f1286b = mo2618w();
        }
        v.mo28194w();
        mo2620y(i);
        this.f1295k = this.f1285a.getNavigationContentDescription();
        this.f1285a.setNavigationOnClickListener(new C0275a());
    }

    public void setIcon(Drawable drawable) {
        this.f1289e = drawable;
        mo2584F();
    }
}

package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000.C2346g9;

/* renamed from: androidx.appcompat.app.d */
/* compiled from: WindowDecorActionBar */
public class C0156d extends ActionBar implements ActionBarOverlayLayout.C0195d {

    /* renamed from: E */
    public static final Interpolator f629E = new AccelerateInterpolator();

    /* renamed from: F */
    public static final Interpolator f630F = new DecelerateInterpolator();

    /* renamed from: A */
    public boolean f631A;

    /* renamed from: B */
    public final xd7 f632B = new C0157a();

    /* renamed from: C */
    public final xd7 f633C = new C0158b();

    /* renamed from: D */
    public final zd7 f634D = new C0159c();

    /* renamed from: a */
    public Context f635a;

    /* renamed from: b */
    public Context f636b;

    /* renamed from: c */
    public Activity f637c;

    /* renamed from: d */
    public ActionBarOverlayLayout f638d;

    /* renamed from: e */
    public ActionBarContainer f639e;

    /* renamed from: f */
    public r31 f640f;

    /* renamed from: g */
    public ActionBarContextView f641g;

    /* renamed from: h */
    public View f642h;

    /* renamed from: i */
    public ScrollingTabContainerView f643i;

    /* renamed from: j */
    public ArrayList<Object> f644j = new ArrayList<>();

    /* renamed from: k */
    public int f645k = -1;

    /* renamed from: l */
    public boolean f646l;

    /* renamed from: m */
    public C0160d f647m;

    /* renamed from: n */
    public C2346g9 f648n;

    /* renamed from: o */
    public C2346g9.C2347a f649o;

    /* renamed from: p */
    public boolean f650p;

    /* renamed from: q */
    public ArrayList<ActionBar.C0110a> f651q = new ArrayList<>();

    /* renamed from: r */
    public boolean f652r;

    /* renamed from: s */
    public int f653s = 0;

    /* renamed from: t */
    public boolean f654t = true;

    /* renamed from: u */
    public boolean f655u;

    /* renamed from: v */
    public boolean f656v;

    /* renamed from: w */
    public boolean f657w;

    /* renamed from: x */
    public boolean f658x = true;

    /* renamed from: y */
    public wd7 f659y;

    /* renamed from: z */
    public boolean f660z;

    /* renamed from: androidx.appcompat.app.d$a */
    /* compiled from: WindowDecorActionBar */
    public class C0157a extends yd7 {
        public C0157a() {
        }

        /* renamed from: b */
        public void mo1162b(View view) {
            View view2;
            C0156d dVar = C0156d.this;
            if (dVar.f654t && (view2 = dVar.f642h) != null) {
                view2.setTranslationY(Utils.FLOAT_EPSILON);
                C0156d.this.f639e.setTranslationY(Utils.FLOAT_EPSILON);
            }
            C0156d.this.f639e.setVisibility(8);
            C0156d.this.f639e.setTransitioning(false);
            C0156d dVar2 = C0156d.this;
            dVar2.f659y = null;
            dVar2.mo1221C();
            ActionBarOverlayLayout actionBarOverlayLayout = C0156d.this.f638d;
            if (actionBarOverlayLayout != null) {
                ga7.m17779m0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.d$b */
    /* compiled from: WindowDecorActionBar */
    public class C0158b extends yd7 {
        public C0158b() {
        }

        /* renamed from: b */
        public void mo1162b(View view) {
            C0156d dVar = C0156d.this;
            dVar.f659y = null;
            dVar.f639e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.d$c */
    /* compiled from: WindowDecorActionBar */
    public class C0159c implements zd7 {
        public C0159c() {
        }

        /* renamed from: a */
        public void mo1242a(View view) {
            ((View) C0156d.this.f639e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.d$d */
    /* compiled from: WindowDecorActionBar */
    public class C0160d extends C2346g9 implements C0173e.C0174a {

        /* renamed from: e */
        public final Context f664e;

        /* renamed from: g */
        public final C0173e f665g;

        /* renamed from: k */
        public C2346g9.C2347a f666k;

        /* renamed from: r */
        public WeakReference<View> f667r;

        public C0160d(Context context, C2346g9.C2347a aVar) {
            this.f664e = context;
            this.f666k = aVar;
            C0173e W = new C0173e(context).mo1395W(1);
            this.f665g = W;
            W.mo1394V(this);
        }

        /* renamed from: a */
        public boolean mo1098a(C0173e eVar, MenuItem menuItem) {
            C2346g9.C2347a aVar = this.f666k;
            if (aVar != null) {
                return aVar.mo1170a(this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public void mo1100b(C0173e eVar) {
            if (this.f666k != null) {
                mo1249k();
                C0156d.this.f641g.mo1608l();
            }
        }

        /* renamed from: c */
        public void mo1243c() {
            C0156d dVar = C0156d.this;
            if (dVar.f647m == this) {
                if (!C0156d.m929B(dVar.f655u, dVar.f656v, false)) {
                    C0156d dVar2 = C0156d.this;
                    dVar2.f648n = this;
                    dVar2.f649o = this.f666k;
                } else {
                    this.f666k.mo1171b(this);
                }
                this.f666k = null;
                C0156d.this.mo1220A(false);
                C0156d.this.f641g.mo1597g();
                C0156d dVar3 = C0156d.this;
                dVar3.f638d.setHideOnContentScrollEnabled(dVar3.f631A);
                C0156d.this.f647m = null;
            }
        }

        /* renamed from: d */
        public View mo1244d() {
            WeakReference<View> weakReference = this.f667r;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public Menu mo1245e() {
            return this.f665g;
        }

        /* renamed from: f */
        public MenuInflater mo1246f() {
            return new yd6(this.f664e);
        }

        /* renamed from: g */
        public CharSequence mo1247g() {
            return C0156d.this.f641g.getSubtitle();
        }

        /* renamed from: i */
        public CharSequence mo1248i() {
            return C0156d.this.f641g.getTitle();
        }

        /* renamed from: k */
        public void mo1249k() {
            if (C0156d.this.f647m == this) {
                this.f665g.mo1428h0();
                try {
                    this.f666k.mo1173d(this, this.f665g);
                } finally {
                    this.f665g.mo1425g0();
                }
            }
        }

        /* renamed from: l */
        public boolean mo1250l() {
            return C0156d.this.f641g.mo1606j();
        }

        /* renamed from: m */
        public void mo1251m(View view) {
            C0156d.this.f641g.setCustomView(view);
            this.f667r = new WeakReference<>(view);
        }

        /* renamed from: n */
        public void mo1252n(int i) {
            mo1253o(C0156d.this.f635a.getResources().getString(i));
        }

        /* renamed from: o */
        public void mo1253o(CharSequence charSequence) {
            C0156d.this.f641g.setSubtitle(charSequence);
        }

        /* renamed from: q */
        public void mo1254q(int i) {
            mo1255r(C0156d.this.f635a.getResources().getString(i));
        }

        /* renamed from: r */
        public void mo1255r(CharSequence charSequence) {
            C0156d.this.f641g.setTitle(charSequence);
        }

        /* renamed from: s */
        public void mo1256s(boolean z) {
            super.mo1256s(z);
            C0156d.this.f641g.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean mo1257t() {
            this.f665g.mo1428h0();
            try {
                return this.f666k.mo1172c(this, this.f665g);
            } finally {
                this.f665g.mo1425g0();
            }
        }
    }

    public C0156d(Activity activity, boolean z) {
        this.f637c = activity;
        View decorView = activity.getWindow().getDecorView();
        mo1227I(decorView);
        if (!z) {
            this.f642h = decorView.findViewById(16908290);
        }
    }

    /* renamed from: B */
    public static boolean m929B(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: A */
    public void mo1220A(boolean z) {
        vd7 vd7;
        vd7 vd72;
        if (z) {
            mo1234P();
        } else {
            mo1226H();
        }
        if (mo1233O()) {
            if (z) {
                vd7 = this.f640f.mo2597j(4, 100);
                vd72 = this.f641g.mo1596f(0, 200);
            } else {
                vd72 = this.f640f.mo2597j(0, 200);
                vd7 = this.f641g.mo1596f(8, 100);
            }
            wd7 wd7 = new wd7();
            wd7.mo27479d(vd7, vd72);
            wd7.mo27483h();
        } else if (z) {
            this.f640f.setVisibility(4);
            this.f641g.setVisibility(0);
        } else {
            this.f640f.setVisibility(0);
            this.f641g.setVisibility(8);
        }
    }

    /* renamed from: C */
    public void mo1221C() {
        C2346g9.C2347a aVar = this.f649o;
        if (aVar != null) {
            aVar.mo1171b(this.f648n);
            this.f648n = null;
            this.f649o = null;
        }
    }

    /* renamed from: D */
    public void mo1222D(boolean z) {
        View view;
        wd7 wd7 = this.f659y;
        if (wd7 != null) {
            wd7.mo27476a();
        }
        if (this.f653s != 0 || (!this.f660z && !z)) {
            this.f632B.mo1162b((View) null);
            return;
        }
        this.f639e.setAlpha(1.0f);
        this.f639e.setTransitioning(true);
        wd7 wd72 = new wd7();
        float f = (float) (-this.f639e.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f639e.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        vd7 m = ga7.m17762e(this.f639e).mo27125m(f);
        m.mo27123k(this.f634D);
        wd72.mo27478c(m);
        if (this.f654t && (view = this.f642h) != null) {
            wd72.mo27478c(ga7.m17762e(view).mo27125m(f));
        }
        wd72.mo27481f(f629E);
        wd72.mo27480e(250);
        wd72.mo27482g(this.f632B);
        this.f659y = wd72;
        wd72.mo27483h();
    }

    /* renamed from: E */
    public void mo1223E(boolean z) {
        View view;
        View view2;
        wd7 wd7 = this.f659y;
        if (wd7 != null) {
            wd7.mo27476a();
        }
        this.f639e.setVisibility(0);
        if (this.f653s != 0 || (!this.f660z && !z)) {
            this.f639e.setAlpha(1.0f);
            this.f639e.setTranslationY(Utils.FLOAT_EPSILON);
            if (this.f654t && (view = this.f642h) != null) {
                view.setTranslationY(Utils.FLOAT_EPSILON);
            }
            this.f633C.mo1162b((View) null);
        } else {
            this.f639e.setTranslationY(Utils.FLOAT_EPSILON);
            float f = (float) (-this.f639e.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f639e.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f639e.setTranslationY(f);
            wd7 wd72 = new wd7();
            vd7 m = ga7.m17762e(this.f639e).mo27125m(Utils.FLOAT_EPSILON);
            m.mo27123k(this.f634D);
            wd72.mo27478c(m);
            if (this.f654t && (view2 = this.f642h) != null) {
                view2.setTranslationY(f);
                wd72.mo27478c(ga7.m17762e(this.f642h).mo27125m(Utils.FLOAT_EPSILON));
            }
            wd72.mo27481f(f630F);
            wd72.mo27480e(250);
            wd72.mo27482g(this.f633C);
            this.f659y = wd72;
            wd72.mo27483h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f638d;
        if (actionBarOverlayLayout != null) {
            ga7.m17779m0(actionBarOverlayLayout);
        }
    }

    /* renamed from: F */
    public final r31 mo1224F(View view) {
        String str;
        if (view instanceof r31) {
            return (r31) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: G */
    public int mo1225G() {
        return this.f640f.mo2596i();
    }

    /* renamed from: H */
    public final void mo1226H() {
        if (this.f657w) {
            this.f657w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f638d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            mo1235Q(false);
        }
    }

    /* renamed from: I */
    public final void mo1227I(View view) {
        boolean z;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(j35.decor_content_parent);
        this.f638d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f640f = mo1224F(view.findViewById(j35.action_bar));
        this.f641g = (ActionBarContextView) view.findViewById(j35.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(j35.action_bar_container);
        this.f639e = actionBarContainer;
        r31 r31 = this.f640f;
        if (r31 == null || this.f641g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f635a = r31.getContext();
        if ((this.f640f.mo2615t() & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f646l = true;
        }
        C2215e9 b = C2215e9.m15978b(this.f635a);
        if (b.mo19208a() || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        mo1232N(z2);
        mo1230L(b.mo19213g());
        TypedArray obtainStyledAttributes = this.f635a.obtainStyledAttributes((AttributeSet) null, j65.ActionBar, m15.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(j65.ActionBar_hideOnContentScroll, false)) {
            mo1231M(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j65.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo1229K((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: J */
    public void mo1228J(int i, int i2) {
        int t = this.f640f.mo2615t();
        if ((i2 & 4) != 0) {
            this.f646l = true;
        }
        this.f640f.mo2592g((i & i2) | ((~i2) & t));
    }

    /* renamed from: K */
    public void mo1229K(float f) {
        ga7.m17801x0(this.f639e, f);
    }

    /* renamed from: L */
    public final void mo1230L(boolean z) {
        boolean z2;
        boolean z3;
        this.f652r = z;
        if (!z) {
            this.f640f.mo2604q((ScrollingTabContainerView) null);
            this.f639e.setTabContainer(this.f643i);
        } else {
            this.f639e.setTabContainer((ScrollingTabContainerView) null);
            this.f640f.mo2604q(this.f643i);
        }
        boolean z4 = true;
        if (mo1225G() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        ScrollingTabContainerView scrollingTabContainerView = this.f643i;
        if (scrollingTabContainerView != null) {
            if (z2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f638d;
                if (actionBarOverlayLayout != null) {
                    ga7.m17779m0(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        r31 r31 = this.f640f;
        if (this.f652r || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        r31.mo2602o(z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f638d;
        if (this.f652r || !z2) {
            z4 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z4);
    }

    /* renamed from: M */
    public void mo1231M(boolean z) {
        if (!z || this.f638d.mo1645o()) {
            this.f631A = z;
            this.f638d.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: N */
    public void mo1232N(boolean z) {
        this.f640f.mo2599l(z);
    }

    /* renamed from: O */
    public final boolean mo1233O() {
        return ga7.m17747T(this.f639e);
    }

    /* renamed from: P */
    public final void mo1234P() {
        if (!this.f657w) {
            this.f657w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f638d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            mo1235Q(false);
        }
    }

    /* renamed from: Q */
    public final void mo1235Q(boolean z) {
        if (m929B(this.f655u, this.f656v, this.f657w)) {
            if (!this.f658x) {
                this.f658x = true;
                mo1223E(z);
            }
        } else if (this.f658x) {
            this.f658x = false;
            mo1222D(z);
        }
    }

    /* renamed from: a */
    public void mo1236a() {
        if (this.f656v) {
            this.f656v = false;
            mo1235Q(true);
        }
    }

    /* renamed from: b */
    public void mo1237b(int i) {
        this.f653s = i;
    }

    /* renamed from: c */
    public void mo1238c() {
    }

    /* renamed from: d */
    public void mo1239d(boolean z) {
        this.f654t = z;
    }

    /* renamed from: e */
    public void mo1240e() {
        if (!this.f656v) {
            this.f656v = true;
            mo1235Q(true);
        }
    }

    /* renamed from: f */
    public void mo1241f() {
        wd7 wd7 = this.f659y;
        if (wd7 != null) {
            wd7.mo27476a();
            this.f659y = null;
        }
    }

    /* renamed from: h */
    public boolean mo955h() {
        r31 r31 = this.f640f;
        if (r31 == null || !r31.mo2591f()) {
            return false;
        }
        this.f640f.collapseActionView();
        return true;
    }

    /* renamed from: i */
    public void mo956i(boolean z) {
        if (z != this.f650p) {
            this.f650p = z;
            int size = this.f651q.size();
            for (int i = 0; i < size; i++) {
                this.f651q.get(i).onMenuVisibilityChanged(z);
            }
        }
    }

    /* renamed from: j */
    public int mo957j() {
        return this.f640f.mo2615t();
    }

    /* renamed from: k */
    public Context mo958k() {
        if (this.f636b == null) {
            TypedValue typedValue = new TypedValue();
            this.f635a.getTheme().resolveAttribute(m15.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f636b = new ContextThemeWrapper(this.f635a, i);
            } else {
                this.f636b = this.f635a;
            }
        }
        return this.f636b;
    }

    /* renamed from: l */
    public void mo959l() {
        if (!this.f655u) {
            this.f655u = true;
            mo1235Q(false);
        }
    }

    /* renamed from: n */
    public void mo961n(Configuration configuration) {
        mo1230L(C2215e9.m15978b(this.f635a).mo19213g());
    }

    /* renamed from: p */
    public boolean mo963p(int i, KeyEvent keyEvent) {
        Menu e;
        int i2;
        C0160d dVar = this.f647m;
        if (dVar == null || (e = dVar.mo1245e()) == null) {
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
        e.setQwertyMode(z);
        return e.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: s */
    public void mo966s(boolean z) {
        if (!this.f646l) {
            mo967t(z);
        }
    }

    /* renamed from: t */
    public void mo967t(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        mo1228J(i, 4);
    }

    /* renamed from: u */
    public void mo968u(int i) {
        this.f640f.mo2600m(i);
    }

    /* renamed from: v */
    public void mo969v(Drawable drawable) {
        this.f640f.mo2617v(drawable);
    }

    /* renamed from: w */
    public void mo970w(boolean z) {
        wd7 wd7;
        this.f660z = z;
        if (!z && (wd7 = this.f659y) != null) {
            wd7.mo27476a();
        }
    }

    /* renamed from: x */
    public void mo971x(CharSequence charSequence) {
        this.f640f.setTitle(charSequence);
    }

    /* renamed from: y */
    public void mo972y(CharSequence charSequence) {
        this.f640f.setWindowTitle(charSequence);
    }

    /* renamed from: z */
    public C2346g9 mo973z(C2346g9.C2347a aVar) {
        C0160d dVar = this.f647m;
        if (dVar != null) {
            dVar.mo1243c();
        }
        this.f638d.setHideOnContentScrollEnabled(false);
        this.f641g.mo1607k();
        C0160d dVar2 = new C0160d(this.f641g.getContext(), aVar);
        if (!dVar2.mo1257t()) {
            return null;
        }
        this.f647m = dVar2;
        dVar2.mo1249k();
        this.f641g.mo1604h(dVar2);
        mo1220A(true);
        return dVar2;
    }

    public C0156d(Dialog dialog) {
        mo1227I(dialog.getWindow().getDecorView());
    }
}

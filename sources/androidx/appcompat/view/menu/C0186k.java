package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0182i;
import androidx.appcompat.widget.MenuPopupWindow;

/* renamed from: androidx.appcompat.view.menu.k */
/* compiled from: StandardMenuPopup */
public final class C0186k extends cu3 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: Z */
    public static final int f842Z = i45.abc_popup_menu_item_layout;

    /* renamed from: A */
    public final ViewTreeObserver.OnGlobalLayoutListener f843A = new C0187a();

    /* renamed from: B */
    public final View.OnAttachStateChangeListener f844B = new C0188b();

    /* renamed from: C */
    public PopupWindow.OnDismissListener f845C;

    /* renamed from: H */
    public View f846H;

    /* renamed from: I */
    public View f847I;

    /* renamed from: L */
    public C0182i.C0183a f848L;

    /* renamed from: M */
    public ViewTreeObserver f849M;

    /* renamed from: P */
    public boolean f850P;

    /* renamed from: Q */
    public boolean f851Q;

    /* renamed from: U */
    public int f852U;

    /* renamed from: X */
    public int f853X = 0;

    /* renamed from: Y */
    public boolean f854Y;

    /* renamed from: d */
    public final Context f855d;

    /* renamed from: e */
    public final C0173e f856e;

    /* renamed from: g */
    public final C0172d f857g;

    /* renamed from: k */
    public final boolean f858k;

    /* renamed from: r */
    public final int f859r;

    /* renamed from: s */
    public final int f860s;

    /* renamed from: x */
    public final int f861x;

    /* renamed from: y */
    public final MenuPopupWindow f862y;

    /* renamed from: androidx.appcompat.view.menu.k$a */
    /* compiled from: StandardMenuPopup */
    public class C0187a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0187a() {
        }

        public void onGlobalLayout() {
            if (C0186k.this.mo1328a() && !C0186k.this.f862y.mo2177B()) {
                View view = C0186k.this.f847I;
                if (view == null || !view.isShown()) {
                    C0186k.this.dismiss();
                } else {
                    C0186k.this.f862y.mo1329c();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$b */
    /* compiled from: StandardMenuPopup */
    public class C0188b implements View.OnAttachStateChangeListener {
        public C0188b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0186k.this.f849M;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0186k.this.f849M = view.getViewTreeObserver();
                }
                C0186k kVar = C0186k.this;
                kVar.f849M.removeGlobalOnLayoutListener(kVar.f843A);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0186k(Context context, C0173e eVar, View view, int i, int i2, boolean z) {
        this.f855d = context;
        this.f856e = eVar;
        this.f858k = z;
        this.f857g = new C0172d(eVar, LayoutInflater.from(context), z, f842Z);
        this.f860s = i;
        this.f861x = i2;
        Resources resources = context.getResources();
        this.f859r = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(n25.abc_config_prefDialogWidth));
        this.f846H = view;
        this.f862y = new MenuPopupWindow(context, (AttributeSet) null, i, i2);
        eVar.mo1412c(this, context);
    }

    /* renamed from: B */
    public final boolean mo1561B() {
        View view;
        boolean z;
        if (mo1328a()) {
            return true;
        }
        if (this.f850P || (view = this.f846H) == null) {
            return false;
        }
        this.f847I = view;
        this.f862y.mo2186K(this);
        this.f862y.mo2187L(this);
        this.f862y.mo2185J(true);
        View view2 = this.f847I;
        if (this.f849M == null) {
            z = true;
        } else {
            z = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f849M = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f843A);
        }
        view2.addOnAttachStateChangeListener(this.f844B);
        this.f862y.mo2179D(view2);
        this.f862y.mo2182G(this.f853X);
        if (!this.f851Q) {
            this.f852U = cu3.m14507q(this.f857g, (ViewGroup) null, this.f855d, this.f859r);
            this.f851Q = true;
        }
        this.f862y.mo2181F(this.f852U);
        this.f862y.mo2184I(2);
        this.f862y.mo2183H(mo18288o());
        this.f862y.mo1329c();
        ListView p = this.f862y.mo1338p();
        p.setOnKeyListener(this);
        if (this.f854Y && this.f856e.mo1457z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f855d).inflate(i45.abc_popup_menu_header_item_layout, p, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f856e.mo1457z());
            }
            frameLayout.setEnabled(false);
            p.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f862y.mo2033n(this.f857g);
        this.f862y.mo1329c();
        return true;
    }

    /* renamed from: a */
    public boolean mo1328a() {
        if (this.f850P || !this.f862y.mo1328a()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo1304b(C0173e eVar, boolean z) {
        if (eVar == this.f856e) {
            dismiss();
            C0182i.C0183a aVar = this.f848L;
            if (aVar != null) {
                aVar.mo1168b(eVar, z);
            }
        }
    }

    /* renamed from: c */
    public void mo1329c() {
        if (!mo1561B()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void dismiss() {
        if (mo1328a()) {
            this.f862y.dismiss();
        }
    }

    /* renamed from: e */
    public void mo1307e(C0182i.C0183a aVar) {
        this.f848L = aVar;
    }

    /* renamed from: f */
    public void mo1331f(Parcelable parcelable) {
    }

    /* renamed from: g */
    public boolean mo1308g(C0189l lVar) {
        if (lVar.hasVisibleItems()) {
            C0179h hVar = new C0179h(this.f855d, lVar, this.f847I, this.f858k, this.f860s, this.f861x);
            hVar.mo1555j(this.f848L);
            hVar.mo1552g(cu3.m14508z(lVar));
            hVar.mo1554i(this.f845C);
            this.f845C = null;
            this.f856e.mo1419e(false);
            int d = this.f862y.mo2194d();
            int m = this.f862y.mo2198m();
            if ((Gravity.getAbsoluteGravity(this.f853X, ga7.m17715B(this.f846H)) & 7) == 5) {
                d += this.f846H.getWidth();
            }
            if (hVar.mo1559n(d, m)) {
                C0182i.C0183a aVar = this.f848L;
                if (aVar == null) {
                    return true;
                }
                aVar.mo1169c(lVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public Parcelable mo1332h() {
        return null;
    }

    /* renamed from: i */
    public void mo1310i(boolean z) {
        this.f851Q = false;
        C0172d dVar = this.f857g;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    /* renamed from: j */
    public boolean mo1333j() {
        return false;
    }

    /* renamed from: m */
    public void mo1334m(C0173e eVar) {
    }

    public void onDismiss() {
        this.f850P = true;
        this.f856e.close();
        ViewTreeObserver viewTreeObserver = this.f849M;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f849M = this.f847I.getViewTreeObserver();
            }
            this.f849M.removeGlobalOnLayoutListener(this.f843A);
            this.f849M = null;
        }
        this.f847I.removeOnAttachStateChangeListener(this.f844B);
        PopupWindow.OnDismissListener onDismissListener = this.f845C;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: p */
    public ListView mo1338p() {
        return this.f862y.mo1338p();
    }

    /* renamed from: r */
    public void mo1339r(View view) {
        this.f846H = view;
    }

    /* renamed from: t */
    public void mo1340t(boolean z) {
        this.f857g.mo1368d(z);
    }

    /* renamed from: u */
    public void mo1341u(int i) {
        this.f853X = i;
    }

    /* renamed from: v */
    public void mo1342v(int i) {
        this.f862y.mo2195f(i);
    }

    /* renamed from: w */
    public void mo1343w(PopupWindow.OnDismissListener onDismissListener) {
        this.f845C = onDismissListener;
    }

    /* renamed from: x */
    public void mo1344x(boolean z) {
        this.f854Y = z;
    }

    /* renamed from: y */
    public void mo1345y(int i) {
        this.f862y.mo2197j(i);
    }
}

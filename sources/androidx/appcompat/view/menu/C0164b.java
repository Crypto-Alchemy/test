package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0182i;
import androidx.appcompat.widget.MenuPopupWindow;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.appcompat.view.menu.b */
/* compiled from: CascadingMenuPopup */
public final class C0164b extends cu3 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: o1 */
    public static final int f711o1 = i45.abc_cascading_menu_item_layout;

    /* renamed from: A */
    public final ViewTreeObserver.OnGlobalLayoutListener f712A = new C0165a();

    /* renamed from: B */
    public final View.OnAttachStateChangeListener f713B = new C0166b();

    /* renamed from: C */
    public final au3 f714C = new C0167c();

    /* renamed from: H */
    public int f715H = 0;

    /* renamed from: I */
    public int f716I = 0;

    /* renamed from: L */
    public View f717L;

    /* renamed from: M */
    public View f718M;

    /* renamed from: P */
    public int f719P;

    /* renamed from: Q */
    public boolean f720Q;

    /* renamed from: U */
    public boolean f721U;

    /* renamed from: X */
    public int f722X;

    /* renamed from: Y */
    public int f723Y;

    /* renamed from: Z */
    public boolean f724Z;

    /* renamed from: b1 */
    public PopupWindow.OnDismissListener f725b1;

    /* renamed from: d */
    public final Context f726d;

    /* renamed from: e */
    public final int f727e;

    /* renamed from: e0 */
    public boolean f728e0;

    /* renamed from: e1 */
    public boolean f729e1;

    /* renamed from: g */
    public final int f730g;

    /* renamed from: k */
    public final int f731k;

    /* renamed from: k0 */
    public C0182i.C0183a f732k0;

    /* renamed from: r */
    public final boolean f733r;

    /* renamed from: s */
    public final Handler f734s;

    /* renamed from: v0 */
    public ViewTreeObserver f735v0;

    /* renamed from: x */
    public final List<C0173e> f736x = new ArrayList();

    /* renamed from: y */
    public final List<C0169d> f737y = new ArrayList();

    /* renamed from: androidx.appcompat.view.menu.b$a */
    /* compiled from: CascadingMenuPopup */
    public class C0165a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0165a() {
        }

        public void onGlobalLayout() {
            if (C0164b.this.mo1328a() && C0164b.this.f737y.size() > 0 && !C0164b.this.f737y.get(0).f745a.mo2177B()) {
                View view = C0164b.this.f718M;
                if (view == null || !view.isShown()) {
                    C0164b.this.dismiss();
                    return;
                }
                for (C0169d dVar : C0164b.this.f737y) {
                    dVar.f745a.mo1329c();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    /* compiled from: CascadingMenuPopup */
    public class C0166b implements View.OnAttachStateChangeListener {
        public C0166b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0164b.this.f735v0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0164b.this.f735v0 = view.getViewTreeObserver();
                }
                C0164b bVar = C0164b.this;
                bVar.f735v0.removeGlobalOnLayoutListener(bVar.f712A);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    /* compiled from: CascadingMenuPopup */
    public class C0167c implements au3 {

        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        /* compiled from: CascadingMenuPopup */
        public class C0168a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C0169d f741a;

            /* renamed from: d */
            public final /* synthetic */ MenuItem f742d;

            /* renamed from: e */
            public final /* synthetic */ C0173e f743e;

            public C0168a(C0169d dVar, MenuItem menuItem, C0173e eVar) {
                this.f741a = dVar;
                this.f742d = menuItem;
                this.f743e = eVar;
            }

            public void run() {
                C0169d dVar = this.f741a;
                if (dVar != null) {
                    C0164b.this.f729e1 = true;
                    dVar.f746b.mo1419e(false);
                    C0164b.this.f729e1 = false;
                }
                if (this.f742d.isEnabled() && this.f742d.hasSubMenu()) {
                    this.f743e.mo1386N(this.f742d, 4);
                }
            }
        }

        public C0167c() {
        }

        /* renamed from: e */
        public void mo1349e(C0173e eVar, MenuItem menuItem) {
            C0169d dVar = null;
            C0164b.this.f734s.removeCallbacksAndMessages((Object) null);
            int size = C0164b.this.f737y.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (eVar == C0164b.this.f737y.get(i).f746b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0164b.this.f737y.size()) {
                    dVar = C0164b.this.f737y.get(i2);
                }
                C0164b.this.f734s.postAtTime(new C0168a(dVar, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: o */
        public void mo1350o(C0173e eVar, MenuItem menuItem) {
            C0164b.this.f734s.removeCallbacksAndMessages(eVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$d */
    /* compiled from: CascadingMenuPopup */
    public static class C0169d {

        /* renamed from: a */
        public final MenuPopupWindow f745a;

        /* renamed from: b */
        public final C0173e f746b;

        /* renamed from: c */
        public final int f747c;

        public C0169d(MenuPopupWindow menuPopupWindow, C0173e eVar, int i) {
            this.f745a = menuPopupWindow;
            this.f746b = eVar;
            this.f747c = i;
        }

        /* renamed from: a */
        public ListView mo1352a() {
            return this.f745a.mo1338p();
        }
    }

    public C0164b(Context context, View view, int i, int i2, boolean z) {
        this.f726d = context;
        this.f717L = view;
        this.f730g = i;
        this.f731k = i2;
        this.f733r = z;
        this.f724Z = false;
        this.f719P = mo1325F();
        Resources resources = context.getResources();
        this.f727e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(n25.abc_config_prefDialogWidth));
        this.f734s = new Handler();
    }

    /* renamed from: B */
    public final MenuPopupWindow mo1321B() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f726d, (AttributeSet) null, this.f730g, this.f731k);
        menuPopupWindow.mo2221T(this.f714C);
        menuPopupWindow.mo2187L(this);
        menuPopupWindow.mo2186K(this);
        menuPopupWindow.mo2179D(this.f717L);
        menuPopupWindow.mo2182G(this.f716I);
        menuPopupWindow.mo2185J(true);
        menuPopupWindow.mo2184I(2);
        return menuPopupWindow;
    }

    /* renamed from: C */
    public final int mo1322C(C0173e eVar) {
        int size = this.f737y.size();
        for (int i = 0; i < size; i++) {
            if (eVar == this.f737y.get(i).f746b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: D */
    public final MenuItem mo1323D(C0173e eVar, C0173e eVar2) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: E */
    public final View mo1324E(C0169d dVar, C0173e eVar) {
        int i;
        C0172d dVar2;
        int firstVisiblePosition;
        MenuItem D = mo1323D(dVar.f746b, eVar);
        if (D == null) {
            return null;
        }
        ListView a = dVar.mo1352a();
        ListAdapter adapter = a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            dVar2 = (C0172d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (C0172d) adapter;
            i = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (D == dVar2.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a.getChildCount()) {
            return a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: F */
    public final int mo1325F() {
        if (ga7.m17715B(this.f717L) == 1) {
            return 0;
        }
        return 1;
    }

    /* renamed from: G */
    public final int mo1326G(int i) {
        List<C0169d> list = this.f737y;
        ListView a = list.get(list.size() - 1).mo1352a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f718M.getWindowVisibleDisplayFrame(rect);
        if (this.f719P == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: H */
    public final void mo1327H(C0173e eVar) {
        View view;
        C0169d dVar;
        boolean z;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f726d);
        C0172d dVar2 = new C0172d(eVar, from, this.f733r, f711o1);
        if (!mo1328a() && this.f724Z) {
            dVar2.mo1368d(true);
        } else if (mo1328a()) {
            dVar2.mo1368d(cu3.m14508z(eVar));
        }
        int q = cu3.m14507q(dVar2, (ViewGroup) null, this.f726d, this.f727e);
        MenuPopupWindow B = mo1321B();
        B.mo2033n(dVar2);
        B.mo2181F(q);
        B.mo2182G(this.f716I);
        if (this.f737y.size() > 0) {
            List<C0169d> list = this.f737y;
            dVar = list.get(list.size() - 1);
            view = mo1324E(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            B.mo2222U(false);
            B.mo2219R((Object) null);
            int G = mo1326G(q);
            if (G == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f719P = G;
            if (Build.VERSION.SDK_INT >= 26) {
                B.mo2179D(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f717L.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f716I & 7) == 5) {
                    iArr[0] = iArr[0] + this.f717L.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f716I & 5) != 5) {
                if (z) {
                    q = view.getWidth();
                }
                i3 = i - q;
                B.mo2195f(i3);
                B.mo2188M(true);
                B.mo2197j(i2);
            } else if (!z) {
                q = view.getWidth();
                i3 = i - q;
                B.mo2195f(i3);
                B.mo2188M(true);
                B.mo2197j(i2);
            }
            i3 = i + q;
            B.mo2195f(i3);
            B.mo2188M(true);
            B.mo2197j(i2);
        } else {
            if (this.f720Q) {
                B.mo2195f(this.f722X);
            }
            if (this.f721U) {
                B.mo2197j(this.f723Y);
            }
            B.mo2183H(mo18288o());
        }
        this.f737y.add(new C0169d(B, eVar, this.f719P));
        B.mo1329c();
        ListView p = B.mo1338p();
        p.setOnKeyListener(this);
        if (dVar == null && this.f728e0 && eVar.mo1457z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(i45.abc_popup_menu_header_item_layout, p, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.mo1457z());
            p.addHeaderView(frameLayout, (Object) null, false);
            B.mo1329c();
        }
    }

    /* renamed from: a */
    public boolean mo1328a() {
        if (this.f737y.size() <= 0 || !this.f737y.get(0).f745a.mo1328a()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo1304b(C0173e eVar, boolean z) {
        int C = mo1322C(eVar);
        if (C >= 0) {
            int i = C + 1;
            if (i < this.f737y.size()) {
                this.f737y.get(i).f746b.mo1419e(false);
            }
            C0169d remove = this.f737y.remove(C);
            remove.f746b.mo1389Q(this);
            if (this.f729e1) {
                remove.f745a.mo2220S((Object) null);
                remove.f745a.mo2180E(0);
            }
            remove.f745a.dismiss();
            int size = this.f737y.size();
            if (size > 0) {
                this.f719P = this.f737y.get(size - 1).f747c;
            } else {
                this.f719P = mo1325F();
            }
            if (size == 0) {
                dismiss();
                C0182i.C0183a aVar = this.f732k0;
                if (aVar != null) {
                    aVar.mo1168b(eVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f735v0;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f735v0.removeGlobalOnLayoutListener(this.f712A);
                    }
                    this.f735v0 = null;
                }
                this.f718M.removeOnAttachStateChangeListener(this.f713B);
                this.f725b1.onDismiss();
            } else if (z) {
                this.f737y.get(0).f746b.mo1419e(false);
            }
        }
    }

    /* renamed from: c */
    public void mo1329c() {
        boolean z;
        if (!mo1328a()) {
            for (C0173e H : this.f736x) {
                mo1327H(H);
            }
            this.f736x.clear();
            View view = this.f717L;
            this.f718M = view;
            if (view != null) {
                if (this.f735v0 == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f735v0 = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f712A);
                }
                this.f718M.addOnAttachStateChangeListener(this.f713B);
            }
        }
    }

    public void dismiss() {
        int size = this.f737y.size();
        if (size > 0) {
            C0169d[] dVarArr = (C0169d[]) this.f737y.toArray(new C0169d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0169d dVar = dVarArr[i];
                if (dVar.f745a.mo1328a()) {
                    dVar.f745a.dismiss();
                }
            }
        }
    }

    /* renamed from: e */
    public void mo1307e(C0182i.C0183a aVar) {
        this.f732k0 = aVar;
    }

    /* renamed from: f */
    public void mo1331f(Parcelable parcelable) {
    }

    /* renamed from: g */
    public boolean mo1308g(C0189l lVar) {
        for (C0169d next : this.f737y) {
            if (lVar == next.f746b) {
                next.mo1352a().requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        mo1334m(lVar);
        C0182i.C0183a aVar = this.f732k0;
        if (aVar != null) {
            aVar.mo1169c(lVar);
        }
        return true;
    }

    /* renamed from: h */
    public Parcelable mo1332h() {
        return null;
    }

    /* renamed from: i */
    public void mo1310i(boolean z) {
        for (C0169d a : this.f737y) {
            cu3.m14506A(a.mo1352a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: j */
    public boolean mo1333j() {
        return false;
    }

    /* renamed from: m */
    public void mo1334m(C0173e eVar) {
        eVar.mo1412c(this, this.f726d);
        if (mo1328a()) {
            mo1327H(eVar);
        } else {
            this.f736x.add(eVar);
        }
    }

    /* renamed from: n */
    public boolean mo1335n() {
        return false;
    }

    public void onDismiss() {
        C0169d dVar;
        int size = this.f737y.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f737y.get(i);
            if (!dVar.f745a.mo1328a()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f746b.mo1419e(false);
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
        if (this.f737y.isEmpty()) {
            return null;
        }
        List<C0169d> list = this.f737y;
        return list.get(list.size() - 1).mo1352a();
    }

    /* renamed from: r */
    public void mo1339r(View view) {
        if (this.f717L != view) {
            this.f717L = view;
            this.f716I = pj2.m24971b(this.f715H, ga7.m17715B(view));
        }
    }

    /* renamed from: t */
    public void mo1340t(boolean z) {
        this.f724Z = z;
    }

    /* renamed from: u */
    public void mo1341u(int i) {
        if (this.f715H != i) {
            this.f715H = i;
            this.f716I = pj2.m24971b(i, ga7.m17715B(this.f717L));
        }
    }

    /* renamed from: v */
    public void mo1342v(int i) {
        this.f720Q = true;
        this.f722X = i;
    }

    /* renamed from: w */
    public void mo1343w(PopupWindow.OnDismissListener onDismissListener) {
        this.f725b1 = onDismissListener;
    }

    /* renamed from: x */
    public void mo1344x(boolean z) {
        this.f728e0 = z;
    }

    /* renamed from: y */
    public void mo1345y(int i) {
        this.f721U = true;
        this.f723Y = i;
    }
}

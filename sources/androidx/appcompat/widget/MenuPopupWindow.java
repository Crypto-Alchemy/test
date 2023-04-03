package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0172d;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0177g;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

public class MenuPopupWindow extends ListPopupWindow implements au3 {

    /* renamed from: x1 */
    public static Method f1125x1;

    /* renamed from: w1 */
    public au3 f1126w1;

    public static class MenuDropDownListView extends tk1 {

        /* renamed from: L */
        public final int f1127L;

        /* renamed from: M */
        public final int f1128M;

        /* renamed from: P */
        public au3 f1129P;

        /* renamed from: Q */
        public MenuItem f1130Q;

        /* renamed from: androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView$a */
        public static class C0238a {
            /* renamed from: a */
            public static int m1446a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            if (1 == C0238a.m1446a(context.getResources().getConfiguration())) {
                this.f1127L = 21;
                this.f1128M = 22;
                return;
            }
            this.f1127L = 22;
            this.f1128M = 21;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo2223d(int i, int i2, int i3, int i4, int i5) {
            return super.mo2223d(i, i2, i3, i4, i5);
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo2224e(MotionEvent motionEvent, int i) {
            return super.mo2224e(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0172d dVar;
            int pointToPosition;
            int i2;
            if (this.f1129P != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    dVar = (C0172d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    dVar = (C0172d) adapter;
                }
                C0177g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < dVar.getCount()) {
                    gVar = dVar.getItem(i2);
                }
                MenuItem menuItem = this.f1130Q;
                if (menuItem != gVar) {
                    C0173e b = dVar.mo1366b();
                    if (menuItem != null) {
                        this.f1129P.mo1350o(b, menuItem);
                    }
                    this.f1130Q = gVar;
                    if (gVar != null) {
                        this.f1129P.mo1349e(b, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            C0172d dVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1127L) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1128M) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    dVar = (C0172d) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    dVar = (C0172d) adapter;
                }
                dVar.mo1366b().mo1419e(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(au3 au3) {
            this.f1129P = au3;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    /* renamed from: androidx.appcompat.widget.MenuPopupWindow$a */
    public static class C0239a {
        /* renamed from: a */
        public static void m1447a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* renamed from: b */
        public static void m1448b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* renamed from: androidx.appcompat.widget.MenuPopupWindow$b */
    public static class C0240b {
        /* renamed from: a */
        public static void m1449a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1125x1 = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: R */
    public void mo2219R(Object obj) {
        C0239a.m1447a(this.f1114s1, (Transition) obj);
    }

    /* renamed from: S */
    public void mo2220S(Object obj) {
        C0239a.m1448b(this.f1114s1, (Transition) obj);
    }

    /* renamed from: T */
    public void mo2221T(au3 au3) {
        this.f1126w1 = au3;
    }

    /* renamed from: U */
    public void mo2222U(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1125x1;
            if (method != null) {
                try {
                    method.invoke(this.f1114s1, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        } else {
            C0240b.m1449a(this.f1114s1, z);
        }
    }

    /* renamed from: e */
    public void mo1349e(C0173e eVar, MenuItem menuItem) {
        au3 au3 = this.f1126w1;
        if (au3 != null) {
            au3.mo1349e(eVar, menuItem);
        }
    }

    /* renamed from: o */
    public void mo1350o(C0173e eVar, MenuItem menuItem) {
        au3 au3 = this.f1126w1;
        if (au3 != null) {
            au3.mo1350o(eVar, menuItem);
        }
    }

    /* renamed from: s */
    public tk1 mo2201s(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}

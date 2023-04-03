package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.p001os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0170c;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0182i;
import androidx.appcompat.view.menu.C0184j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Lifecycle;
import androidx.media3.common.PlaybackException;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;
import p000.C2346g9;
import p000.ka3;
import p000.uf5;
import p000.vd6;

public class AppCompatDelegateImpl extends C0149b implements C0173e.C0174a, LayoutInflater.Factory2 {

    /* renamed from: O1 */
    public static final y16<String, Integer> f506O1 = new y16<>();

    /* renamed from: P1 */
    public static final boolean f507P1 = false;

    /* renamed from: Q1 */
    public static final int[] f508Q1 = {16842836};

    /* renamed from: R1 */
    public static final boolean f509R1 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: S1 */
    public static final boolean f510S1 = true;

    /* renamed from: A */
    public MenuInflater f511A;

    /* renamed from: A1 */
    public int f512A1;

    /* renamed from: B */
    public CharSequence f513B;

    /* renamed from: B1 */
    public int f514B1;

    /* renamed from: C */
    public q31 f515C;

    /* renamed from: C1 */
    public boolean f516C1;

    /* renamed from: D1 */
    public boolean f517D1;

    /* renamed from: E1 */
    public C0141p f518E1;

    /* renamed from: F1 */
    public C0141p f519F1;

    /* renamed from: G1 */
    public boolean f520G1;

    /* renamed from: H */
    public C0132h f521H;

    /* renamed from: H1 */
    public int f522H1;

    /* renamed from: I */
    public C0146t f523I;

    /* renamed from: I1 */
    public final Runnable f524I1;

    /* renamed from: J1 */
    public boolean f525J1;

    /* renamed from: K1 */
    public Rect f526K1;

    /* renamed from: L */
    public C2346g9 f527L;

    /* renamed from: L1 */
    public Rect f528L1;

    /* renamed from: M */
    public ActionBarContextView f529M;

    /* renamed from: M1 */
    public C3499vn f530M1;

    /* renamed from: N1 */
    public oe3 f531N1;

    /* renamed from: P */
    public PopupWindow f532P;

    /* renamed from: Q */
    public Runnable f533Q;

    /* renamed from: U */
    public vd7 f534U;

    /* renamed from: X */
    public boolean f535X;

    /* renamed from: Y */
    public boolean f536Y;

    /* renamed from: Z */
    public ViewGroup f537Z;

    /* renamed from: b1 */
    public boolean f538b1;

    /* renamed from: e0 */
    public TextView f539e0;

    /* renamed from: e1 */
    public boolean f540e1;

    /* renamed from: g */
    public final Object f541g;

    /* renamed from: k */
    public final Context f542k;

    /* renamed from: k0 */
    public View f543k0;

    /* renamed from: o1 */
    public boolean f544o1;

    /* renamed from: p1 */
    public boolean f545p1;

    /* renamed from: q1 */
    public boolean f546q1;

    /* renamed from: r */
    public Window f547r;

    /* renamed from: r1 */
    public boolean f548r1;

    /* renamed from: s */
    public C0139n f549s;

    /* renamed from: s1 */
    public boolean f550s1;

    /* renamed from: t1 */
    public PanelFeatureState[] f551t1;

    /* renamed from: u1 */
    public PanelFeatureState f552u1;

    /* renamed from: v0 */
    public boolean f553v0;

    /* renamed from: v1 */
    public boolean f554v1;

    /* renamed from: w1 */
    public boolean f555w1;

    /* renamed from: x */
    public final C3208rm f556x;

    /* renamed from: x1 */
    public boolean f557x1;

    /* renamed from: y */
    public ActionBar f558y;

    /* renamed from: y1 */
    public boolean f559y1;

    /* renamed from: z1 */
    public Configuration f560z1;

    public static final class PanelFeatureState {

        /* renamed from: a */
        public int f561a;

        /* renamed from: b */
        public int f562b;

        /* renamed from: c */
        public int f563c;

        /* renamed from: d */
        public int f564d;

        /* renamed from: e */
        public int f565e;

        /* renamed from: f */
        public int f566f;

        /* renamed from: g */
        public ViewGroup f567g;

        /* renamed from: h */
        public View f568h;

        /* renamed from: i */
        public View f569i;

        /* renamed from: j */
        public C0173e f570j;

        /* renamed from: k */
        public C0170c f571k;

        /* renamed from: l */
        public Context f572l;

        /* renamed from: m */
        public boolean f573m;

        /* renamed from: n */
        public boolean f574n;

        /* renamed from: o */
        public boolean f575o;

        /* renamed from: p */
        public boolean f576p;

        /* renamed from: q */
        public boolean f577q = false;

        /* renamed from: r */
        public boolean f578r;

        /* renamed from: s */
        public Bundle f579s;

        @SuppressLint({"BanParcelableUsage"})
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new C0123a();

            /* renamed from: a */
            public int f580a;

            /* renamed from: d */
            public boolean f581d;

            /* renamed from: e */
            public Bundle f582e;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a */
            public class C0123a implements Parcelable.ClassLoaderCreator<SavedState> {
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.m808a(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m808a(parcel, classLoader);
                }

                /* renamed from: c */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            /* renamed from: a */
            public static SavedState m808a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f580a = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f581d = z;
                if (z) {
                    savedState.f582e = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f580a);
                parcel.writeInt(this.f581d ? 1 : 0);
                if (this.f581d) {
                    parcel.writeBundle(this.f582e);
                }
            }
        }

        public PanelFeatureState(int i) {
            this.f561a = i;
        }

        /* renamed from: a */
        public C0184j mo1145a(C0182i.C0183a aVar) {
            if (this.f570j == null) {
                return null;
            }
            if (this.f571k == null) {
                C0170c cVar = new C0170c(this.f572l, i45.abc_list_menu_item_layout);
                this.f571k = cVar;
                cVar.mo1307e(aVar);
                this.f570j.mo1410b(this.f571k);
            }
            return this.f571k.mo1354c(this.f567g);
        }

        /* renamed from: b */
        public boolean mo1146b() {
            if (this.f568h == null) {
                return false;
            }
            if (this.f569i != null) {
                return true;
            }
            if (this.f571k.mo1353a().getCount() > 0) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void mo1147c(C0173e eVar) {
            C0170c cVar;
            C0173e eVar2 = this.f570j;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.mo1389Q(this.f571k);
                }
                this.f570j = eVar;
                if (eVar != null && (cVar = this.f571k) != null) {
                    eVar.mo1410b(cVar);
                }
            }
        }

        /* renamed from: d */
        public void mo1148d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(m15.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(m15.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(h55.Theme_AppCompat_CompactMenu, true);
            }
            hs0 hs0 = new hs0(context, 0);
            hs0.getTheme().setTo(newTheme);
            this.f572l = hs0;
            TypedArray obtainStyledAttributes = hs0.obtainStyledAttributes(j65.AppCompatTheme);
            this.f562b = obtainStyledAttributes.getResourceId(j65.AppCompatTheme_panelBackground, 0);
            this.f566f = obtainStyledAttributes.getResourceId(j65.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    public class C0124a implements Runnable {
        public C0124a() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f522H1 & 1) != 0) {
                appCompatDelegateImpl.mo1097Z(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f522H1 & 4096) != 0) {
                appCompatDelegateImpl2.mo1097Z(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f520G1 = false;
            appCompatDelegateImpl3.f522H1 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    public class C0125b implements xg4 {
        public C0125b() {
        }

        /* renamed from: a */
        public hl7 mo1158a(View view, hl7 hl7) {
            int m = hl7.mo21240m();
            int P0 = AppCompatDelegateImpl.this.mo1086P0(hl7, (Rect) null);
            if (m != P0) {
                hl7 = hl7.mo21244r(hl7.mo21238k(), P0, hl7.mo21239l(), hl7.mo21237j());
            }
            return ga7.m17757b0(view, hl7);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    public class C0126c implements ContentFrameLayout.C0228a {
        public C0126c() {
        }

        /* renamed from: a */
        public void mo1159a() {
        }

        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.mo1095X();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    public class C0127d implements Runnable {

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d$a */
        public class C0128a extends yd7 {
            public C0128a() {
            }

            /* renamed from: b */
            public void mo1162b(View view) {
                AppCompatDelegateImpl.this.f529M.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f534U.mo27120h((xd7) null);
                AppCompatDelegateImpl.this.f534U = null;
            }

            /* renamed from: c */
            public void mo1163c(View view) {
                AppCompatDelegateImpl.this.f529M.setVisibility(0);
            }
        }

        public C0127d() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f532P.showAtLocation(appCompatDelegateImpl.f529M, 55, 0, 0);
            AppCompatDelegateImpl.this.mo1099a0();
            if (AppCompatDelegateImpl.this.mo1072I0()) {
                AppCompatDelegateImpl.this.f529M.setAlpha(Utils.FLOAT_EPSILON);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f534U = ga7.m17762e(appCompatDelegateImpl2.f529M).mo27115b(1.0f);
                AppCompatDelegateImpl.this.f534U.mo27120h(new C0128a());
                return;
            }
            AppCompatDelegateImpl.this.f529M.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f529M.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    public class C0129e extends yd7 {
        public C0129e() {
        }

        /* renamed from: b */
        public void mo1162b(View view) {
            AppCompatDelegateImpl.this.f529M.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f534U.mo27120h((xd7) null);
            AppCompatDelegateImpl.this.f534U = null;
        }

        /* renamed from: c */
        public void mo1163c(View view) {
            AppCompatDelegateImpl.this.f529M.setVisibility(0);
            if (AppCompatDelegateImpl.this.f529M.getParent() instanceof View) {
                ga7.m17779m0((View) AppCompatDelegateImpl.this.f529M.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    public class C0130f implements C1671c9 {
        public C0130f() {
        }

        /* renamed from: a */
        public Context mo1164a() {
            return AppCompatDelegateImpl.this.mo1106f0();
        }

        /* renamed from: b */
        public void mo1165b(Drawable drawable, int i) {
            ActionBar p = AppCompatDelegateImpl.this.mo1123p();
            if (p != null) {
                p.mo969v(drawable);
                p.mo968u(i);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    public interface C0131g {
        /* renamed from: a */
        boolean mo1166a(int i);

        View onCreatePanelView(int i);
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    public final class C0132h implements C0182i.C0183a {
        public C0132h() {
        }

        /* renamed from: b */
        public void mo1168b(C0173e eVar, boolean z) {
            AppCompatDelegateImpl.this.mo1087Q(eVar);
        }

        /* renamed from: c */
        public boolean mo1169c(C0173e eVar) {
            Window.Callback k0 = AppCompatDelegateImpl.this.mo1113k0();
            if (k0 == null) {
                return true;
            }
            k0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    public class C0133i implements C2346g9.C2347a {

        /* renamed from: a */
        public C2346g9.C2347a f591a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i$a */
        public class C0134a extends yd7 {
            public C0134a() {
            }

            /* renamed from: b */
            public void mo1162b(View view) {
                AppCompatDelegateImpl.this.f529M.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f532P;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f529M.getParent() instanceof View) {
                    ga7.m17779m0((View) AppCompatDelegateImpl.this.f529M.getParent());
                }
                AppCompatDelegateImpl.this.f529M.mo1607k();
                AppCompatDelegateImpl.this.f534U.mo27120h((xd7) null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f534U = null;
                ga7.m17779m0(appCompatDelegateImpl2.f537Z);
            }
        }

        public C0133i(C2346g9.C2347a aVar) {
            this.f591a = aVar;
        }

        /* renamed from: a */
        public boolean mo1170a(C2346g9 g9Var, MenuItem menuItem) {
            return this.f591a.mo1170a(g9Var, menuItem);
        }

        /* renamed from: b */
        public void mo1171b(C2346g9 g9Var) {
            this.f591a.mo1171b(g9Var);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f532P != null) {
                appCompatDelegateImpl.f547r.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f533Q);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f529M != null) {
                appCompatDelegateImpl2.mo1099a0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f534U = ga7.m17762e(appCompatDelegateImpl3.f529M).mo27115b(Utils.FLOAT_EPSILON);
                AppCompatDelegateImpl.this.f534U.mo27120h(new C0134a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            C3208rm rmVar = appCompatDelegateImpl4.f556x;
            if (rmVar != null) {
                rmVar.onSupportActionModeFinished(appCompatDelegateImpl4.f527L);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f527L = null;
            ga7.m17779m0(appCompatDelegateImpl5.f537Z);
        }

        /* renamed from: c */
        public boolean mo1172c(C2346g9 g9Var, Menu menu) {
            return this.f591a.mo1172c(g9Var, menu);
        }

        /* renamed from: d */
        public boolean mo1173d(C2346g9 g9Var, Menu menu) {
            ga7.m17779m0(AppCompatDelegateImpl.this.f537Z);
            return this.f591a.mo1173d(g9Var, menu);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    public static class C0135j {
        /* renamed from: a */
        public static Context m828a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        public static void m829b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    public static class C0136k {
        /* renamed from: a */
        public static boolean m830a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    public static class C0137l {
        /* renamed from: a */
        public static void m831a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList a = configuration.getLocales();
            LocaleList a2 = configuration2.getLocales();
            if (!a.equals(a2)) {
                configuration3.setLocales(a2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    public static class C0138m {
        /* renamed from: a */
        public static void m832a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$n */
    public class C0139n extends al7 {

        /* renamed from: d */
        public C0131g f594d;

        /* renamed from: e */
        public boolean f595e;

        /* renamed from: g */
        public boolean f596g;

        /* renamed from: k */
        public boolean f597k;

        public C0139n(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        public boolean mo1174b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f596g = true;
                boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                this.f596g = false;
                return dispatchKeyEvent;
            } catch (Throwable th) {
                this.f596g = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: c */
        public void mo1175c(Window.Callback callback) {
            try {
                this.f595e = true;
                callback.onContentChanged();
                this.f595e = false;
            } catch (Throwable th) {
                this.f595e = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: d */
        public void mo1176d(Window.Callback callback, int i, Menu menu) {
            try {
                this.f597k = true;
                callback.onPanelClosed(i, menu);
                this.f597k = false;
            } catch (Throwable th) {
                this.f597k = false;
                throw th;
            }
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f596g) {
                return mo386a().dispatchKeyEvent(keyEvent);
            }
            if (AppCompatDelegateImpl.this.mo1096Y(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.mo1138w0(keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public void mo1177e(C0131g gVar) {
            this.f594d = gVar;
        }

        /* renamed from: f */
        public final ActionMode mo1178f(ActionMode.Callback callback) {
            vd6.C3479a aVar = new vd6.C3479a(AppCompatDelegateImpl.this.f542k, callback);
            C2346g9 K = AppCompatDelegateImpl.this.mo1075K(aVar);
            if (K != null) {
                return aVar.mo27113e(K);
            }
            return null;
        }

        public void onContentChanged() {
            if (this.f595e) {
                mo386a().onContentChanged();
            }
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0173e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            C0131g gVar = this.f594d;
            if (gVar == null || (onCreatePanelView = gVar.onCreatePanelView(i)) == null) {
                return super.onCreatePanelView(i);
            }
            return onCreatePanelView;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.mo1144z0(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            if (this.f597k) {
                mo386a().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.mo1058A0(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0173e eVar;
            if (menu instanceof C0173e) {
                eVar = (C0173e) menu;
            } else {
                eVar = null;
            }
            if (i == 0 && eVar == null) {
                return false;
            }
            boolean z = true;
            if (eVar != null) {
                eVar.mo1420e0(true);
            }
            C0131g gVar = this.f594d;
            if (gVar == null || !gVar.mo1166a(i)) {
                z = false;
            }
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (eVar != null) {
                eVar.mo1420e0(false);
            }
            return z;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0173e eVar;
            PanelFeatureState i0 = AppCompatDelegateImpl.this.mo1110i0(0, true);
            if (i0 == null || (eVar = i0.f570j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!AppCompatDelegateImpl.this.mo1128r0() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return mo1178f(callback);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$o */
    public class C0140o extends C0141p {

        /* renamed from: c */
        public final PowerManager f599c;

        public C0140o(Context context) {
            super();
            this.f599c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* renamed from: b */
        public IntentFilter mo1181b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo1182c() {
            if (C0136k.m830a(this.f599c)) {
                return 2;
            }
            return 1;
        }

        /* renamed from: d */
        public void mo1183d() {
            AppCompatDelegateImpl.this.mo1105e();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$p */
    public abstract class C0141p {

        /* renamed from: a */
        public BroadcastReceiver f601a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$p$a */
        public class C0142a extends BroadcastReceiver {
            public C0142a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0141p.this.mo1183d();
            }
        }

        public C0141p() {
        }

        /* renamed from: a */
        public void mo1184a() {
            BroadcastReceiver broadcastReceiver = this.f601a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f542k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f601a = null;
            }
        }

        /* renamed from: b */
        public abstract IntentFilter mo1181b();

        /* renamed from: c */
        public abstract int mo1182c();

        /* renamed from: d */
        public abstract void mo1183d();

        /* renamed from: e */
        public void mo1185e() {
            mo1184a();
            IntentFilter b = mo1181b();
            if (b != null && b.countActions() != 0) {
                if (this.f601a == null) {
                    this.f601a = new C0142a();
                }
                AppCompatDelegateImpl.this.f542k.registerReceiver(this.f601a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$q */
    public class C0143q extends C0141p {

        /* renamed from: c */
        public final zy6 f604c;

        public C0143q(zy6 zy6) {
            super();
            this.f604c = zy6;
        }

        /* renamed from: b */
        public IntentFilter mo1181b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo1182c() {
            if (this.f604c.mo28681d()) {
                return 2;
            }
            return 1;
        }

        /* renamed from: d */
        public void mo1183d() {
            AppCompatDelegateImpl.this.mo1105e();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$r */
    public static class C0144r {
        /* renamed from: a */
        public static void m849a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$s */
    public class C0145s extends ContentFrameLayout {
        public C0145s(Context context) {
            super(context);
        }

        /* renamed from: a */
        public final boolean mo1187a(int i, int i2) {
            if (i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5) {
                return true;
            }
            return false;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (AppCompatDelegateImpl.this.mo1096Y(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !mo1187a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.mo1090S(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C2554in.m19714b(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$t */
    public final class C0146t implements C0182i.C0183a {
        public C0146t() {
        }

        /* renamed from: b */
        public void mo1168b(C0173e eVar, boolean z) {
            boolean z2;
            C0173e F = eVar.mo1378F();
            if (F != eVar) {
                z2 = true;
            } else {
                z2 = false;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                eVar = F;
            }
            PanelFeatureState d0 = appCompatDelegateImpl.mo1104d0(eVar);
            if (d0 == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.mo1085P(d0.f561a, d0, F);
                AppCompatDelegateImpl.this.mo1091T(d0, true);
                return;
            }
            AppCompatDelegateImpl.this.mo1091T(d0, z);
        }

        /* renamed from: c */
        public boolean mo1169c(C0173e eVar) {
            Window.Callback k0;
            if (eVar != eVar.mo1378F()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f540e1 || (k0 = appCompatDelegateImpl.mo1113k0()) == null || AppCompatDelegateImpl.this.f559y1) {
                return true;
            }
            k0.onMenuOpened(108, eVar);
            return true;
        }
    }

    public AppCompatDelegateImpl(Activity activity, C3208rm rmVar) {
        this(activity, (Window) null, rmVar, activity);
    }

    /* renamed from: e0 */
    public static Configuration m718e0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = Utils.FLOAT_EPSILON;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                C0137l.m831a(configuration, configuration2, configuration3);
            } else if (!mf4.m22283a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (i5 >= 26) {
                C0138m.m832a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            C0135j.m829b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* renamed from: A0 */
    public void mo1058A0(int i) {
        if (i == 108) {
            ActionBar p = mo1123p();
            if (p != null) {
                p.mo956i(false);
            }
        } else if (i == 0) {
            PanelFeatureState i0 = mo1110i0(i, true);
            if (i0.f575o) {
                mo1091T(i0, false);
            }
        }
    }

    /* renamed from: B0 */
    public void mo1059B0(ViewGroup viewGroup) {
    }

    /* renamed from: C */
    public boolean mo1060C(int i) {
        int H0 = mo1070H0(i);
        if (this.f548r1 && H0 == 108) {
            return false;
        }
        if (this.f540e1 && H0 == 1) {
            this.f540e1 = false;
        }
        if (H0 == 1) {
            mo1078L0();
            this.f548r1 = true;
            return true;
        } else if (H0 == 2) {
            mo1078L0();
            this.f553v0 = true;
            return true;
        } else if (H0 == 5) {
            mo1078L0();
            this.f538b1 = true;
            return true;
        } else if (H0 == 10) {
            mo1078L0();
            this.f545p1 = true;
            return true;
        } else if (H0 == 108) {
            mo1078L0();
            this.f540e1 = true;
            return true;
        } else if (H0 != 109) {
            return this.f547r.requestFeature(H0);
        } else {
            mo1078L0();
            this.f544o1 = true;
            return true;
        }
    }

    /* renamed from: C0 */
    public final void mo1061C0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z;
        if (!panelFeatureState.f575o && !this.f559y1) {
            if (panelFeatureState.f561a == 0) {
                if ((this.f542k.getResources().getConfiguration().screenLayout & 15) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            Window.Callback k0 = mo1113k0();
            if (k0 == null || k0.onMenuOpened(panelFeatureState.f561a, panelFeatureState.f570j)) {
                WindowManager windowManager = (WindowManager) this.f542k.getSystemService("window");
                if (windowManager != null && mo1067F0(panelFeatureState, keyEvent)) {
                    ViewGroup viewGroup = panelFeatureState.f567g;
                    if (viewGroup == null || panelFeatureState.f577q) {
                        if (viewGroup == null) {
                            if (!mo1118n0(panelFeatureState) || panelFeatureState.f567g == null) {
                                return;
                            }
                        } else if (panelFeatureState.f577q && viewGroup.getChildCount() > 0) {
                            panelFeatureState.f567g.removeAllViews();
                        }
                        if (!mo1116m0(panelFeatureState) || !panelFeatureState.mo1146b()) {
                            panelFeatureState.f577q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = panelFeatureState.f568h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        panelFeatureState.f567g.setBackgroundResource(panelFeatureState.f562b);
                        ViewParent parent = panelFeatureState.f568h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(panelFeatureState.f568h);
                        }
                        panelFeatureState.f567g.addView(panelFeatureState.f568h, layoutParams2);
                        if (!panelFeatureState.f568h.hasFocus()) {
                            panelFeatureState.f568h.requestFocus();
                        }
                    } else {
                        View view = panelFeatureState.f569i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            panelFeatureState.f574n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f564d, panelFeatureState.f565e, PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, 8519680, -3);
                            layoutParams3.gravity = panelFeatureState.f563c;
                            layoutParams3.windowAnimations = panelFeatureState.f566f;
                            windowManager.addView(panelFeatureState.f567g, layoutParams3);
                            panelFeatureState.f575o = true;
                            return;
                        }
                    }
                    i = -2;
                    panelFeatureState.f574n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f564d, panelFeatureState.f565e, PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, 8519680, -3);
                    layoutParams32.gravity = panelFeatureState.f563c;
                    layoutParams32.windowAnimations = panelFeatureState.f566f;
                    windowManager.addView(panelFeatureState.f567g, layoutParams32);
                    panelFeatureState.f575o = true;
                    return;
                }
                return;
            }
            mo1091T(panelFeatureState, true);
        }
    }

    /* renamed from: D */
    public void mo1062D(int i) {
        mo1101b0();
        ViewGroup viewGroup = (ViewGroup) this.f537Z.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f542k).inflate(i, viewGroup);
        this.f549s.mo1175c(this.f547r.getCallback());
    }

    /* renamed from: D0 */
    public final ActionBar mo1063D0() {
        return this.f558y;
    }

    /* renamed from: E */
    public void mo1064E(View view) {
        mo1101b0();
        ViewGroup viewGroup = (ViewGroup) this.f537Z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f549s.mo1175c(this.f547r.getCallback());
    }

    /* renamed from: E0 */
    public final boolean mo1065E0(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        C0173e eVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f573m || mo1067F0(panelFeatureState, keyEvent)) && (eVar = panelFeatureState.f570j) != null) {
            z = eVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f515C == null) {
            mo1091T(panelFeatureState, true);
        }
        return z;
    }

    /* renamed from: F */
    public void mo1066F(View view, ViewGroup.LayoutParams layoutParams) {
        mo1101b0();
        ViewGroup viewGroup = (ViewGroup) this.f537Z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f549s.mo1175c(this.f547r.getCallback());
    }

    /* renamed from: F0 */
    public final boolean mo1067F0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z;
        int i;
        boolean z2;
        q31 q31;
        q31 q312;
        q31 q313;
        if (this.f559y1) {
            return false;
        }
        if (panelFeatureState.f573m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f552u1;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            mo1091T(panelFeatureState2, false);
        }
        Window.Callback k0 = mo1113k0();
        if (k0 != null) {
            panelFeatureState.f569i = k0.onCreatePanelView(panelFeatureState.f561a);
        }
        int i2 = panelFeatureState.f561a;
        if (i2 == 0 || i2 == 108) {
            z = true;
        } else {
            z = false;
        }
        if (z && (q313 = this.f515C) != null) {
            q313.setMenuPrepared();
        }
        if (panelFeatureState.f569i == null && (!z || !(mo1063D0() instanceof C0150c))) {
            C0173e eVar = panelFeatureState.f570j;
            if (eVar == null || panelFeatureState.f578r) {
                if (eVar == null && (!mo1120o0(panelFeatureState) || panelFeatureState.f570j == null)) {
                    return false;
                }
                if (z && this.f515C != null) {
                    if (this.f521H == null) {
                        this.f521H = new C0132h();
                    }
                    this.f515C.setMenu(panelFeatureState.f570j, this.f521H);
                }
                panelFeatureState.f570j.mo1428h0();
                if (!k0.onCreatePanelMenu(panelFeatureState.f561a, panelFeatureState.f570j)) {
                    panelFeatureState.mo1147c((C0173e) null);
                    if (z && (q312 = this.f515C) != null) {
                        q312.setMenu((Menu) null, this.f521H);
                    }
                    return false;
                }
                panelFeatureState.f578r = false;
            }
            panelFeatureState.f570j.mo1428h0();
            Bundle bundle = panelFeatureState.f579s;
            if (bundle != null) {
                panelFeatureState.f570j.mo1390R(bundle);
                panelFeatureState.f579s = null;
            }
            if (!k0.onPreparePanel(0, panelFeatureState.f569i, panelFeatureState.f570j)) {
                if (z && (q31 = this.f515C) != null) {
                    q31.setMenu((Menu) null, this.f521H);
                }
                panelFeatureState.f570j.mo1425g0();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            panelFeatureState.f576p = z2;
            panelFeatureState.f570j.setQwertyMode(z2);
            panelFeatureState.f570j.mo1425g0();
        }
        panelFeatureState.f573m = true;
        panelFeatureState.f574n = false;
        this.f552u1 = panelFeatureState;
        return true;
    }

    /* renamed from: G0 */
    public final void mo1068G0(boolean z) {
        q31 q31 = this.f515C;
        if (q31 == null || !q31.mo1622a() || (ViewConfiguration.get(this.f542k).hasPermanentMenuKey() && !this.f515C.mo1628e())) {
            PanelFeatureState i0 = mo1110i0(0, true);
            i0.f577q = true;
            mo1091T(i0, false);
            mo1061C0(i0, (KeyEvent) null);
            return;
        }
        Window.Callback k0 = mo1113k0();
        if (this.f515C.mo1626d() && z) {
            this.f515C.mo1623b();
            if (!this.f559y1) {
                k0.onPanelClosed(108, mo1110i0(0, true).f570j);
            }
        } else if (k0 != null && !this.f559y1) {
            if (this.f520G1 && (this.f522H1 & 1) != 0) {
                this.f547r.getDecorView().removeCallbacks(this.f524I1);
                this.f524I1.run();
            }
            PanelFeatureState i02 = mo1110i0(0, true);
            C0173e eVar = i02.f570j;
            if (eVar != null && !i02.f578r && k0.onPreparePanel(0, i02.f569i, eVar)) {
                k0.onMenuOpened(108, i02.f570j);
                this.f515C.mo1624c();
            }
        }
    }

    /* renamed from: H */
    public void mo1069H(Toolbar toolbar) {
        if (this.f541g instanceof Activity) {
            ActionBar p = mo1123p();
            if (!(p instanceof C0156d)) {
                this.f511A = null;
                if (p != null) {
                    p.mo962o();
                }
                this.f558y = null;
                if (toolbar != null) {
                    C0150c cVar = new C0150c(toolbar, mo1111j0(), this.f549s);
                    this.f558y = cVar;
                    this.f549s.mo1177e(cVar.f616c);
                } else {
                    this.f549s.mo1177e((C0131g) null);
                }
                mo1127r();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: H0 */
    public final int mo1070H0(int i) {
        if (i == 8) {
            return 108;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    /* renamed from: I */
    public void mo1071I(int i) {
        this.f514B1 = i;
    }

    /* renamed from: I0 */
    public final boolean mo1072I0() {
        ViewGroup viewGroup;
        if (!this.f536Y || (viewGroup = this.f537Z) == null || !ga7.m17747T(viewGroup)) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public final void mo1073J(CharSequence charSequence) {
        this.f513B = charSequence;
        q31 q31 = this.f515C;
        if (q31 != null) {
            q31.setWindowTitle(charSequence);
        } else if (mo1063D0() != null) {
            mo1063D0().mo972y(charSequence);
        } else {
            TextView textView = this.f539e0;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: J0 */
    public final boolean mo1074J0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f547r.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ga7.m17746S((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: K */
    public C2346g9 mo1075K(C2346g9.C2347a aVar) {
        C3208rm rmVar;
        if (aVar != null) {
            C2346g9 g9Var = this.f527L;
            if (g9Var != null) {
                g9Var.mo1243c();
            }
            C0133i iVar = new C0133i(aVar);
            ActionBar p = mo1123p();
            if (p != null) {
                C2346g9 z = p.mo973z(iVar);
                this.f527L = z;
                if (!(z == null || (rmVar = this.f556x) == null)) {
                    rmVar.onSupportActionModeStarted(z);
                }
            }
            if (this.f527L == null) {
                this.f527L = mo1076K0(iVar);
            }
            return this.f527L;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.C2346g9 mo1076K0(p000.C2346g9.C2347a r8) {
        /*
            r7 = this;
            r7.mo1099a0()
            g9 r0 = r7.f527L
            if (r0 == 0) goto L_0x000a
            r0.mo1243c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatDelegateImpl.C0133i
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.AppCompatDelegateImpl$i r0 = new androidx.appcompat.app.AppCompatDelegateImpl$i
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            rm r0 = r7.f556x
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f559y1
            if (r2 != 0) goto L_0x0022
            g9 r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f527L = r0
            goto L_0x015b
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f529M
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f546q1
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f542k
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p000.m15.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f542k
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            hs0 r4 = new hs0
            android.content.Context r6 = r7.f542k
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f542k
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f529M = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p000.m15.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f532P = r5
            r6 = 2
            p000.kt4.m21073b(r5, r6)
            android.widget.PopupWindow r5 = r7.f532P
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f529M
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f532P
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p000.m15.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f529M
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f532P
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.AppCompatDelegateImpl$d r0 = new androidx.appcompat.app.AppCompatDelegateImpl$d
            r0.<init>()
            r7.f533Q = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f537Z
            int r4 = p000.j35.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.mo1106f0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo2566a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f529M = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f529M
            if (r0 == 0) goto L_0x015b
            r7.mo1099a0()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f529M
            r0.mo1607k()
            y76 r0 = new y76
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f529M
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f529M
            android.widget.PopupWindow r6 = r7.f532P
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = r2
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo1245e()
            boolean r8 = r8.mo1172c(r0, r3)
            if (r8 == 0) goto L_0x0159
            r0.mo1249k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f529M
            r8.mo1604h(r0)
            r7.f527L = r0
            boolean r8 = r7.mo1072I0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f529M
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f529M
            vd7 r8 = p000.ga7.m17762e(r8)
            vd7 r8 = r8.mo27115b(r0)
            r7.f534U = r8
            androidx.appcompat.app.AppCompatDelegateImpl$e r0 = new androidx.appcompat.app.AppCompatDelegateImpl$e
            r0.<init>()
            r8.mo27120h(r0)
            goto L_0x0149
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f529M
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f529M
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f529M
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0149
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f529M
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            p000.ga7.m17779m0(r8)
        L_0x0149:
            android.widget.PopupWindow r8 = r7.f532P
            if (r8 == 0) goto L_0x015b
            android.view.Window r8 = r7.f547r
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f533Q
            r8.post(r0)
            goto L_0x015b
        L_0x0159:
            r7.f527L = r1
        L_0x015b:
            g9 r8 = r7.f527L
            if (r8 == 0) goto L_0x0166
            rm r0 = r7.f556x
            if (r0 == 0) goto L_0x0166
            r0.onSupportActionModeStarted(r8)
        L_0x0166:
            g9 r8 = r7.f527L
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo1076K0(g9$a):g9");
    }

    /* renamed from: L */
    public final boolean mo1077L(boolean z) {
        if (this.f559y1) {
            return false;
        }
        int O = mo1083O();
        boolean N0 = mo1082N0(mo1130s0(this.f542k, O), z);
        if (O == 0) {
            mo1109h0(this.f542k).mo1185e();
        } else {
            C0141p pVar = this.f518E1;
            if (pVar != null) {
                pVar.mo1184a();
            }
        }
        if (O == 3) {
            mo1107g0(this.f542k).mo1185e();
        } else {
            C0141p pVar2 = this.f519F1;
            if (pVar2 != null) {
                pVar2.mo1184a();
            }
        }
        return N0;
    }

    /* renamed from: L0 */
    public final void mo1078L0() {
        if (this.f536Y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: M */
    public final void mo1079M() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f537Z.findViewById(16908290);
        View decorView = this.f547r.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f542k.obtainStyledAttributes(j65.AppCompatTheme);
        obtainStyledAttributes.getValue(j65.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(j65.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        int i = j65.AppCompatTheme_windowFixedWidthMajor;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = j65.AppCompatTheme_windowFixedWidthMinor;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = j65.AppCompatTheme_windowFixedHeightMajor;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = j65.AppCompatTheme_windowFixedHeightMinor;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: M0 */
    public final AppCompatActivity mo1080M0() {
        Context context = this.f542k;
        while (context != null) {
            if (!(context instanceof AppCompatActivity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (AppCompatActivity) context;
            }
        }
        return null;
    }

    /* renamed from: N */
    public final void mo1081N(Window window) {
        if (this.f547r == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0139n)) {
                C0139n nVar = new C0139n(callback);
                this.f549s = nVar;
                window.setCallback(nVar);
                yq6 u = yq6.m30732u(this.f542k, (AttributeSet) null, f508Q1);
                Drawable h = u.mo28182h(0);
                if (h != null) {
                    window.setBackgroundDrawable(h);
                }
                u.mo28194w();
                this.f547r = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: N0 */
    public final boolean mo1082N0(int i, boolean z) {
        boolean z2 = false;
        Configuration U = mo1092U(this.f542k, i, (Configuration) null, false);
        boolean q0 = mo1126q0(this.f542k);
        Configuration configuration = this.f560z1;
        if (configuration == null) {
            configuration = this.f542k.getResources().getConfiguration();
        }
        int i2 = configuration.uiMode & 48;
        int i3 = U.uiMode & 48;
        boolean z3 = true;
        if (i2 != i3 && z && !q0 && this.f555w1 && (f509R1 || this.f557x1)) {
            Object obj = this.f541g;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                C3582x9.m29960r((Activity) this.f541g);
                z2 = true;
            }
        }
        if (z2 || i2 == i3) {
            z3 = z2;
        } else {
            mo1084O0(i3, q0, (Configuration) null);
        }
        if (z3) {
            Object obj2 = this.f541g;
            if (obj2 instanceof AppCompatActivity) {
                ((AppCompatActivity) obj2).onNightModeChanged(i);
            }
        }
        return z3;
    }

    /* renamed from: O */
    public final int mo1083O() {
        int i = this.f512A1;
        if (i != -100) {
            return i;
        }
        return C0149b.m874l();
    }

    /* renamed from: O0 */
    public final void mo1084O0(int i, boolean z, Configuration configuration) {
        Resources resources = this.f542k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            yf5.m30568a(resources);
        }
        int i2 = this.f514B1;
        if (i2 != 0) {
            this.f542k.setTheme(i2);
            this.f542k.getTheme().applyStyle(this.f514B1, true);
        }
        if (z) {
            Object obj = this.f541g;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof ug3) {
                    if (((ug3) activity).getLifecycle().mo6296b().isAtLeast(Lifecycle.State.CREATED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f557x1 && !this.f559y1) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    /* renamed from: P */
    public void mo1085P(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f551t1;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f570j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f575o) && !this.f559y1) {
            this.f549s.mo1176d(this.f547r.getCallback(), i, menu);
        }
    }

    /* renamed from: P0 */
    public final int mo1086P0(hl7 hl7, Rect rect) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        int i5 = 0;
        if (hl7 != null) {
            i = hl7.mo21240m();
        } else if (rect != null) {
            i = rect.top;
        } else {
            i = 0;
        }
        ActionBarContextView actionBarContextView = this.f529M;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f529M.getLayoutParams();
            boolean z3 = true;
            if (this.f529M.isShown()) {
                if (this.f526K1 == null) {
                    this.f526K1 = new Rect();
                    this.f528L1 = new Rect();
                }
                Rect rect2 = this.f526K1;
                Rect rect3 = this.f528L1;
                if (hl7 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(hl7.mo21238k(), hl7.mo21240m(), hl7.mo21239l(), hl7.mo21237j());
                }
                re7.m26175a(this.f537Z, rect2, rect3);
                int i6 = rect2.top;
                int i7 = rect2.left;
                int i8 = rect2.right;
                hl7 I = ga7.m17729I(this.f537Z);
                if (I == null) {
                    i2 = 0;
                } else {
                    i2 = I.mo21238k();
                }
                if (I == null) {
                    i3 = 0;
                } else {
                    i3 = I.mo21239l();
                }
                if (marginLayoutParams2.topMargin == i6 && marginLayoutParams2.leftMargin == i7 && marginLayoutParams2.rightMargin == i8) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i6;
                    marginLayoutParams2.leftMargin = i7;
                    marginLayoutParams2.rightMargin = i8;
                    z2 = true;
                }
                if (i6 <= 0 || this.f543k0 != null) {
                    View view = this.f543k0;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i4 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3))) {
                        marginLayoutParams.height = i4;
                        marginLayoutParams.leftMargin = i2;
                        marginLayoutParams.rightMargin = i3;
                        this.f543k0.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f542k);
                    this.f543k0 = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i2;
                    layoutParams.rightMargin = i3;
                    this.f537Z.addView(this.f543k0, -1, layoutParams);
                }
                View view3 = this.f543k0;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    mo1088Q0(this.f543k0);
                }
                if (!this.f545p1 && z3) {
                    i = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f529M.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f543k0;
        if (view4 != null) {
            if (!z) {
                i5 = 8;
            }
            view4.setVisibility(i5);
        }
        return i;
    }

    /* renamed from: Q */
    public void mo1087Q(C0173e eVar) {
        if (!this.f550s1) {
            this.f550s1 = true;
            this.f515C.mo1631g();
            Window.Callback k0 = mo1113k0();
            if (k0 != null && !this.f559y1) {
                k0.onPanelClosed(108, eVar);
            }
            this.f550s1 = false;
        }
    }

    /* renamed from: Q0 */
    public final void mo1088Q0(View view) {
        boolean z;
        int i;
        if ((ga7.m17737M(view) & 8192) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = zr0.m31440c(this.f542k, a25.abc_decor_view_status_guard_light);
        } else {
            i = zr0.m31440c(this.f542k, a25.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(i);
    }

    /* renamed from: R */
    public final void mo1089R() {
        C0141p pVar = this.f518E1;
        if (pVar != null) {
            pVar.mo1184a();
        }
        C0141p pVar2 = this.f519F1;
        if (pVar2 != null) {
            pVar2.mo1184a();
        }
    }

    /* renamed from: S */
    public void mo1090S(int i) {
        mo1091T(mo1110i0(i, true), true);
    }

    /* renamed from: T */
    public void mo1091T(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        q31 q31;
        if (!z || panelFeatureState.f561a != 0 || (q31 = this.f515C) == null || !q31.mo1626d()) {
            WindowManager windowManager = (WindowManager) this.f542k.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f575o || (viewGroup = panelFeatureState.f567g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo1085P(panelFeatureState.f561a, panelFeatureState, (Menu) null);
                }
            }
            panelFeatureState.f573m = false;
            panelFeatureState.f574n = false;
            panelFeatureState.f575o = false;
            panelFeatureState.f568h = null;
            panelFeatureState.f577q = true;
            if (this.f552u1 == panelFeatureState) {
                this.f552u1 = null;
                return;
            }
            return;
        }
        mo1087Q(panelFeatureState.f570j);
    }

    /* renamed from: U */
    public final Configuration mo1092U(Context context, int i, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i == 2) {
            i2 = 32;
        } else if (z) {
            i2 = 0;
        } else {
            i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = Utils.FLOAT_EPSILON;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* renamed from: V */
    public final ViewGroup mo1093V() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f542k.obtainStyledAttributes(j65.AppCompatTheme);
        int i = j65.AppCompatTheme_windowActionBar;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(j65.AppCompatTheme_windowNoTitle, false)) {
                mo1060C(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo1060C(108);
            }
            if (obtainStyledAttributes.getBoolean(j65.AppCompatTheme_windowActionBarOverlay, false)) {
                mo1060C(109);
            }
            if (obtainStyledAttributes.getBoolean(j65.AppCompatTheme_windowActionModeOverlay, false)) {
                mo1060C(10);
            }
            this.f546q1 = obtainStyledAttributes.getBoolean(j65.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            mo1102c0();
            this.f547r.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f542k);
            if (this.f548r1) {
                viewGroup = this.f545p1 ? (ViewGroup) from.inflate(i45.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(i45.abc_screen_simple, (ViewGroup) null);
            } else if (this.f546q1) {
                viewGroup = (ViewGroup) from.inflate(i45.abc_dialog_title_material, (ViewGroup) null);
                this.f544o1 = false;
                this.f540e1 = false;
            } else if (this.f540e1) {
                TypedValue typedValue = new TypedValue();
                this.f542k.getTheme().resolveAttribute(m15.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new hs0(this.f542k, typedValue.resourceId);
                } else {
                    context = this.f542k;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(i45.abc_screen_toolbar, (ViewGroup) null);
                q31 q31 = (q31) viewGroup.findViewById(j35.decor_content_parent);
                this.f515C = q31;
                q31.setWindowCallback(mo1113k0());
                if (this.f544o1) {
                    this.f515C.mo1629f(109);
                }
                if (this.f553v0) {
                    this.f515C.mo1629f(2);
                }
                if (this.f538b1) {
                    this.f515C.mo1629f(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                ga7.m17720D0(viewGroup, new C0125b());
                if (this.f515C == null) {
                    this.f539e0 = (TextView) viewGroup.findViewById(j35.title);
                }
                re7.m26177c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(j35.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f547r.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f547r.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0126c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f540e1 + ", windowActionBarOverlay: " + this.f544o1 + ", android:windowIsFloating: " + this.f546q1 + ", windowActionModeOverlay: " + this.f545p1 + ", windowNoTitle: " + this.f548r1 + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L_0x0080;
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo1094W(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            vn r0 = r11.f530M1
            r1 = 0
            if (r0 != 0) goto L_0x0051
            android.content.Context r0 = r11.f542k
            int[] r2 = p000.j65.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = p000.j65.AppCompatTheme_viewInflaterClass
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x001d
            vn r0 = new vn
            r0.<init>()
            r11.f530M1 = r0
            goto L_0x0051
        L_0x001d:
            android.content.Context r2 = r11.f542k     // Catch:{ all -> 0x0038 }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ all -> 0x0038 }
            java.lang.Class r2 = r2.loadClass(r0)     // Catch:{ all -> 0x0038 }
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0038 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ all -> 0x0038 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0038 }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ all -> 0x0038 }
            vn r2 = (p000.C3499vn) r2     // Catch:{ all -> 0x0038 }
            r11.f530M1 = r2     // Catch:{ all -> 0x0038 }
            goto L_0x0051
        L_0x0038:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to instantiate custom view inflater "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r2.append(r0)
            vn r0 = new vn
            r0.<init>()
            r11.f530M1 = r0
        L_0x0051:
            boolean r8 = f507P1
            r0 = 1
            if (r8 == 0) goto L_0x0081
            oe3 r2 = r11.f531N1
            if (r2 != 0) goto L_0x0061
            oe3 r2 = new oe3
            r2.<init>()
            r11.f531N1 = r2
        L_0x0061:
            oe3 r2 = r11.f531N1
            boolean r2 = r2.mo23919a(r15)
            if (r2 == 0) goto L_0x006b
            r7 = r0
            goto L_0x0082
        L_0x006b:
            boolean r2 = r15 instanceof org.xmlpull.v1.XmlPullParser
            if (r2 == 0) goto L_0x0079
            r2 = r15
            org.xmlpull.v1.XmlPullParser r2 = (org.xmlpull.v1.XmlPullParser) r2
            int r2 = r2.getDepth()
            if (r2 <= r0) goto L_0x0081
            goto L_0x0080
        L_0x0079:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r11.mo1074J0(r0)
        L_0x0080:
            r1 = r0
        L_0x0081:
            r7 = r1
        L_0x0082:
            vn r2 = r11.f530M1
            r9 = 1
            boolean r10 = p000.u87.m28120c()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.mo27233r(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo1094W(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* renamed from: X */
    public void mo1095X() {
        C0173e eVar;
        q31 q31 = this.f515C;
        if (q31 != null) {
            q31.mo1631g();
        }
        if (this.f532P != null) {
            this.f547r.getDecorView().removeCallbacks(this.f533Q);
            if (this.f532P.isShowing()) {
                try {
                    this.f532P.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f532P = null;
        }
        mo1099a0();
        PanelFeatureState i0 = mo1110i0(0, false);
        if (i0 != null && (eVar = i0.f570j) != null) {
            eVar.close();
        }
    }

    /* renamed from: Y */
    public boolean mo1096Y(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f541g;
        boolean z = true;
        if (((obj instanceof ka3.C2650a) || (obj instanceof C3629xm)) && (decorView = this.f547r.getDecorView()) != null && ka3.m20607d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f549s.mo1174b(this.f547r.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        if (z) {
            return mo1134u0(keyCode, keyEvent);
        }
        return mo1140x0(keyCode, keyEvent);
    }

    /* renamed from: Z */
    public void mo1097Z(int i) {
        PanelFeatureState i0;
        PanelFeatureState i02 = mo1110i0(i, true);
        if (i02.f570j != null) {
            Bundle bundle = new Bundle();
            i02.f570j.mo1392T(bundle);
            if (bundle.size() > 0) {
                i02.f579s = bundle;
            }
            i02.f570j.mo1428h0();
            i02.f570j.clear();
        }
        i02.f578r = true;
        i02.f577q = true;
        if ((i == 108 || i == 0) && this.f515C != null && (i0 = mo1110i0(0, false)) != null) {
            i0.f573m = false;
            mo1067F0(i0, (KeyEvent) null);
        }
    }

    /* renamed from: a */
    public boolean mo1098a(C0173e eVar, MenuItem menuItem) {
        PanelFeatureState d0;
        Window.Callback k0 = mo1113k0();
        if (k0 == null || this.f559y1 || (d0 = mo1104d0(eVar.mo1378F())) == null) {
            return false;
        }
        return k0.onMenuItemSelected(d0.f561a, menuItem);
    }

    /* renamed from: a0 */
    public void mo1099a0() {
        vd7 vd7 = this.f534U;
        if (vd7 != null) {
            vd7.mo27116c();
        }
    }

    /* renamed from: b */
    public void mo1100b(C0173e eVar) {
        mo1068G0(true);
    }

    /* renamed from: b0 */
    public final void mo1101b0() {
        if (!this.f536Y) {
            this.f537Z = mo1093V();
            CharSequence j0 = mo1111j0();
            if (!TextUtils.isEmpty(j0)) {
                q31 q31 = this.f515C;
                if (q31 != null) {
                    q31.setWindowTitle(j0);
                } else if (mo1063D0() != null) {
                    mo1063D0().mo972y(j0);
                } else {
                    TextView textView = this.f539e0;
                    if (textView != null) {
                        textView.setText(j0);
                    }
                }
            }
            mo1079M();
            mo1059B0(this.f537Z);
            this.f536Y = true;
            PanelFeatureState i0 = mo1110i0(0, false);
            if (this.f559y1) {
                return;
            }
            if (i0 == null || i0.f570j == null) {
                mo1124p0(108);
            }
        }
    }

    /* renamed from: c0 */
    public final void mo1102c0() {
        if (this.f547r == null) {
            Object obj = this.f541g;
            if (obj instanceof Activity) {
                mo1081N(((Activity) obj).getWindow());
            }
        }
        if (this.f547r == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: d */
    public void mo1103d(View view, ViewGroup.LayoutParams layoutParams) {
        mo1101b0();
        ((ViewGroup) this.f537Z.findViewById(16908290)).addView(view, layoutParams);
        this.f549s.mo1175c(this.f547r.getCallback());
    }

    /* renamed from: d0 */
    public PanelFeatureState mo1104d0(Menu menu) {
        int i;
        PanelFeatureState[] panelFeatureStateArr = this.f551t1;
        if (panelFeatureStateArr != null) {
            i = panelFeatureStateArr.length;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
            if (panelFeatureState != null && panelFeatureState.f570j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo1105e() {
        return mo1077L(true);
    }

    /* renamed from: f0 */
    public final Context mo1106f0() {
        Context context;
        ActionBar p = mo1123p();
        if (p != null) {
            context = p.mo958k();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f542k;
        }
        return context;
    }

    /* renamed from: g0 */
    public final C0141p mo1107g0(Context context) {
        if (this.f519F1 == null) {
            this.f519F1 = new C0140o(context);
        }
        return this.f519F1;
    }

    /* renamed from: h */
    public Context mo1108h(Context context) {
        boolean z = true;
        this.f555w1 = true;
        int s0 = mo1130s0(context, mo1083O());
        Configuration configuration = null;
        boolean z2 = false;
        if (f510S1 && (context instanceof ContextThemeWrapper)) {
            try {
                C0144r.m849a((ContextThemeWrapper) context, mo1092U(context, s0, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof hs0) {
            try {
                ((hs0) context).mo21369a(mo1092U(context, s0, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f509R1) {
            return super.mo1108h(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = Utils.FLOAT_EPSILON;
        Configuration configuration3 = C0135j.m828a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = m718e0(configuration3, configuration4);
        }
        Configuration U = mo1092U(context, s0, configuration, true);
        hs0 hs0 = new hs0(context, h55.Theme_AppCompat_Empty);
        hs0.mo21369a(U);
        try {
            if (context.getTheme() == null) {
                z = false;
            }
            z2 = z;
        } catch (NullPointerException unused3) {
        }
        if (z2) {
            uf5.C3411f.m28246a(hs0.getTheme());
        }
        return super.mo1108h(hs0);
    }

    /* renamed from: h0 */
    public final C0141p mo1109h0(Context context) {
        if (this.f518E1 == null) {
            this.f518E1 = new C0143q(zy6.m31590a(context));
        }
        return this.f518E1;
    }

    /* renamed from: i0 */
    public PanelFeatureState mo1110i0(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f551t1;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f551t1 = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* renamed from: j0 */
    public final CharSequence mo1111j0() {
        Object obj = this.f541g;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f513B;
    }

    /* renamed from: k */
    public <T extends View> T mo1112k(int i) {
        mo1101b0();
        return this.f547r.findViewById(i);
    }

    /* renamed from: k0 */
    public final Window.Callback mo1113k0() {
        return this.f547r.getCallback();
    }

    /* renamed from: l0 */
    public final void mo1114l0() {
        mo1101b0();
        if (this.f540e1 && this.f558y == null) {
            Object obj = this.f541g;
            if (obj instanceof Activity) {
                this.f558y = new C0156d((Activity) this.f541g, this.f544o1);
            } else if (obj instanceof Dialog) {
                this.f558y = new C0156d((Dialog) this.f541g);
            }
            ActionBar actionBar = this.f558y;
            if (actionBar != null) {
                actionBar.mo966s(this.f525J1);
            }
        }
    }

    /* renamed from: m */
    public final C1671c9 mo1115m() {
        return new C0130f();
    }

    /* renamed from: m0 */
    public final boolean mo1116m0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f569i;
        if (view != null) {
            panelFeatureState.f568h = view;
            return true;
        } else if (panelFeatureState.f570j == null) {
            return false;
        } else {
            if (this.f523I == null) {
                this.f523I = new C0146t();
            }
            View view2 = (View) panelFeatureState.mo1145a(this.f523I);
            panelFeatureState.f568h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: n */
    public int mo1117n() {
        return this.f512A1;
    }

    /* renamed from: n0 */
    public final boolean mo1118n0(PanelFeatureState panelFeatureState) {
        panelFeatureState.mo1148d(mo1106f0());
        panelFeatureState.f567g = new C0145s(panelFeatureState.f572l);
        panelFeatureState.f563c = 81;
        return true;
    }

    /* renamed from: o */
    public MenuInflater mo1119o() {
        Context context;
        if (this.f511A == null) {
            mo1114l0();
            ActionBar actionBar = this.f558y;
            if (actionBar != null) {
                context = actionBar.mo958k();
            } else {
                context = this.f542k;
            }
            this.f511A = new yd6(context);
        }
        return this.f511A;
    }

    /* renamed from: o0 */
    public final boolean mo1120o0(PanelFeatureState panelFeatureState) {
        Context context = this.f542k;
        int i = panelFeatureState.f561a;
        if ((i == 0 || i == 108) && this.f515C != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(m15.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(m15.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(m15.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                hs0 hs0 = new hs0(context, 0);
                hs0.getTheme().setTo(theme2);
                context = hs0;
            }
        }
        C0173e eVar = new C0173e(context);
        eVar.mo1394V(this);
        panelFeatureState.mo1147c(eVar);
        return true;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo1094W(view, str, context, attributeSet);
    }

    /* renamed from: p */
    public ActionBar mo1123p() {
        mo1114l0();
        return this.f558y;
    }

    /* renamed from: p0 */
    public final void mo1124p0(int i) {
        this.f522H1 = (1 << i) | this.f522H1;
        if (!this.f520G1) {
            ga7.m17769h0(this.f547r.getDecorView(), this.f524I1);
            this.f520G1 = true;
        }
    }

    /* renamed from: q */
    public void mo1125q() {
        LayoutInflater from = LayoutInflater.from(this.f542k);
        if (from.getFactory() == null) {
            pe3.m24836a(from, this);
        } else {
            boolean z = from.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    /* renamed from: q0 */
    public final boolean mo1126q0(Context context) {
        int i;
        boolean z;
        if (!this.f517D1 && (this.f541g instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    i = 269221888;
                } else if (i2 >= 24) {
                    i = 786432;
                } else {
                    i = 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f541g.getClass()), i);
                if (activityInfo == null || (activityInfo.configChanges & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 0) {
                    z = false;
                } else {
                    z = true;
                }
                this.f516C1 = z;
            } catch (PackageManager.NameNotFoundException unused) {
                this.f516C1 = false;
            }
        }
        this.f517D1 = true;
        return this.f516C1;
    }

    /* renamed from: r */
    public void mo1127r() {
        if (mo1063D0() != null && !mo1123p().mo960m()) {
            mo1124p0(0);
        }
    }

    /* renamed from: r0 */
    public boolean mo1128r0() {
        return this.f535X;
    }

    /* renamed from: s */
    public void mo1129s(Configuration configuration) {
        ActionBar p;
        if (this.f540e1 && this.f536Y && (p = mo1123p()) != null) {
            p.mo961n(configuration);
        }
        C3743zm.m31368b().mo28530g(this.f542k);
        this.f560z1 = new Configuration(this.f542k.getResources().getConfiguration());
        mo1077L(false);
        configuration.updateFrom(this.f542k.getResources().getConfiguration());
    }

    /* renamed from: s0 */
    public int mo1130s0(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        return mo1107g0(context).mo1182c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return mo1109h0(context).mo1182c();
            }
        }
        return i;
    }

    /* renamed from: t */
    public void mo1131t(Bundle bundle) {
        this.f555w1 = true;
        mo1077L(false);
        mo1102c0();
        Object obj = this.f541g;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = q44.m25388c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar D0 = mo1063D0();
                if (D0 == null) {
                    this.f525J1 = true;
                } else {
                    D0.mo966s(true);
                }
            }
            C0149b.m870c(this);
        }
        this.f560z1 = new Configuration(this.f542k.getResources().getConfiguration());
        this.f557x1 = true;
    }

    /* renamed from: t0 */
    public boolean mo1132t0() {
        C2346g9 g9Var = this.f527L;
        if (g9Var != null) {
            g9Var.mo1243c();
            return true;
        }
        ActionBar p = mo1123p();
        if (p == null || !p.mo955h()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1133u() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f541g
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.C0149b.m867A(r3)
        L_0x0009:
            boolean r0 = r3.f520G1
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f547r
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f524I1
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 1
            r3.f559y1 = r0
            int r0 = r3.f512A1
            r1 = -100
            if (r0 == r1) goto L_0x0045
            java.lang.Object r0 = r3.f541g
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0045
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0045
            y16<java.lang.String, java.lang.Integer> r0 = f506O1
            java.lang.Object r1 = r3.f541g
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f512A1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0054
        L_0x0045:
            y16<java.lang.String, java.lang.Integer> r0 = f506O1
            java.lang.Object r1 = r3.f541g
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0054:
            androidx.appcompat.app.ActionBar r0 = r3.f558y
            if (r0 == 0) goto L_0x005b
            r0.mo962o()
        L_0x005b:
            r3.mo1089R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo1133u():void");
    }

    /* renamed from: u0 */
    public boolean mo1134u0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f554v1 = z;
        } else if (i == 82) {
            mo1136v0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public void mo1135v(Bundle bundle) {
        mo1101b0();
    }

    /* renamed from: v0 */
    public final boolean mo1136v0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState i0 = mo1110i0(i, true);
        if (!i0.f575o) {
            return mo1067F0(i0, keyEvent);
        }
        return false;
    }

    /* renamed from: w */
    public void mo1137w() {
        ActionBar p = mo1123p();
        if (p != null) {
            p.mo970w(true);
        }
    }

    /* renamed from: w0 */
    public boolean mo1138w0(int i, KeyEvent keyEvent) {
        ActionBar p = mo1123p();
        if (p != null && p.mo963p(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f552u1;
        if (panelFeatureState == null || !mo1065E0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f552u1 == null) {
                PanelFeatureState i0 = mo1110i0(0, true);
                mo1067F0(i0, keyEvent);
                boolean E0 = mo1065E0(i0, keyEvent.getKeyCode(), keyEvent, 1);
                i0.f573m = false;
                if (E0) {
                    return true;
                }
            }
            return false;
        }
        PanelFeatureState panelFeatureState2 = this.f552u1;
        if (panelFeatureState2 != null) {
            panelFeatureState2.f574n = true;
        }
        return true;
    }

    /* renamed from: x */
    public void mo1139x(Bundle bundle) {
    }

    /* renamed from: x0 */
    public boolean mo1140x0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f554v1;
            this.f554v1 = false;
            PanelFeatureState i0 = mo1110i0(0, false);
            if (i0 != null && i0.f575o) {
                if (!z) {
                    mo1091T(i0, true);
                }
                return true;
            } else if (mo1132t0()) {
                return true;
            }
        } else if (i == 82) {
            mo1142y0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public void mo1141y() {
        mo1105e();
    }

    /* renamed from: y0 */
    public final boolean mo1142y0(int i, KeyEvent keyEvent) {
        AudioManager audioManager;
        boolean z;
        q31 q31;
        if (this.f527L != null) {
            return false;
        }
        boolean z2 = true;
        PanelFeatureState i0 = mo1110i0(i, true);
        if (i != 0 || (q31 = this.f515C) == null || !q31.mo1622a() || ViewConfiguration.get(this.f542k).hasPermanentMenuKey()) {
            boolean z3 = i0.f575o;
            if (z3 || i0.f574n) {
                mo1091T(i0, true);
                z2 = z3;
                if (z2 && (audioManager = (AudioManager) this.f542k.getApplicationContext().getSystemService("audio")) != null) {
                    audioManager.playSoundEffect(0);
                }
                return z2;
            } else if (i0.f573m) {
                if (i0.f578r) {
                    i0.f573m = false;
                    z = mo1067F0(i0, keyEvent);
                } else {
                    z = true;
                }
                if (z) {
                    mo1061C0(i0, keyEvent);
                    audioManager.playSoundEffect(0);
                    return z2;
                }
            }
        } else {
            if (this.f515C.mo1626d()) {
                z2 = this.f515C.mo1623b();
            } else if (!this.f559y1 && mo1067F0(i0, keyEvent)) {
                z2 = this.f515C.mo1624c();
            }
            audioManager.playSoundEffect(0);
            return z2;
        }
        z2 = false;
        audioManager.playSoundEffect(0);
        return z2;
    }

    /* renamed from: z */
    public void mo1143z() {
        ActionBar p = mo1123p();
        if (p != null) {
            p.mo970w(false);
        }
    }

    /* renamed from: z0 */
    public void mo1144z0(int i) {
        ActionBar p;
        if (i == 108 && (p = mo1123p()) != null) {
            p.mo956i(true);
        }
    }

    public AppCompatDelegateImpl(Dialog dialog, C3208rm rmVar) {
        this(dialog.getContext(), dialog.getWindow(), rmVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = f506O1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatDelegateImpl(android.content.Context r3, android.view.Window r4, p000.C3208rm r5, java.lang.Object r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f534U = r0
            r0 = 1
            r2.f535X = r0
            r0 = -100
            r2.f512A1 = r0
            androidx.appcompat.app.AppCompatDelegateImpl$a r1 = new androidx.appcompat.app.AppCompatDelegateImpl$a
            r1.<init>()
            r2.f524I1 = r1
            r2.f542k = r3
            r2.f556x = r5
            r2.f541g = r6
            int r3 = r2.f512A1
            if (r3 != r0) goto L_0x0032
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.AppCompatActivity r3 = r2.mo1080M0()
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.b r3 = r3.getDelegate()
            int r3 = r3.mo1117n()
            r2.f512A1 = r3
        L_0x0032:
            int r3 = r2.f512A1
            if (r3 != r0) goto L_0x0059
            y16<java.lang.String, java.lang.Integer> r3 = f506O1
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0059
            int r5 = r5.intValue()
            r2.f512A1 = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r2.mo1081N(r4)
        L_0x005e:
            p000.C3743zm.m31370h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.<init>(android.content.Context, android.view.Window, rm, java.lang.Object):void");
    }
}

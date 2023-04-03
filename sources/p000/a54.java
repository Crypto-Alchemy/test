package p000;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.ref.WeakReference;
import java.util.Set;
import p000.m44;

/* renamed from: a54 */
/* compiled from: NavigationUI */
public final class a54 {

    /* renamed from: a54$a */
    /* compiled from: NavigationUI */
    public class C0007a implements BottomNavigationView.C4204b {

        /* renamed from: a */
        public final /* synthetic */ NavController f38a;

        public C0007a(NavController navController) {
            this.f38a = navController;
        }

        /* renamed from: a */
        public boolean mo37a(MenuItem menuItem) {
            return a54.m43d(menuItem, this.f38a);
        }
    }

    /* renamed from: a54$b */
    /* compiled from: NavigationUI */
    public class C0008b implements NavController.C1115b {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f39a;

        /* renamed from: b */
        public final /* synthetic */ NavController f40b;

        public C0008b(WeakReference weakReference, NavController navController) {
            this.f39a = weakReference;
            this.f40b = navController;
        }

        /* renamed from: a */
        public void mo38a(NavController navController, NavDestination navDestination, Bundle bundle) {
            BottomNavigationView bottomNavigationView = (BottomNavigationView) this.f39a.get();
            if (bottomNavigationView == null) {
                this.f40b.mo8474g0(this);
                return;
            }
            Menu menu = bottomNavigationView.getMenu();
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                if (a54.m41b(navDestination, item.getItemId())) {
                    item.setChecked(true);
                }
            }
        }
    }

    /* renamed from: a */
    public static NavDestination m40a(NavGraph navGraph) {
        while (true) {
            boolean z = r1 instanceof NavGraph;
            NavDestination navDestination = navGraph;
            if (!z) {
                return navDestination;
            }
            NavGraph navGraph2 = (NavGraph) navDestination;
            navDestination = navGraph2.mo8573R(navGraph2.mo8579X());
        }
    }

    /* renamed from: b */
    public static boolean m41b(NavDestination navDestination, int i) {
        while (navDestination.mo8563w() != i && navDestination.mo8548D() != null) {
            navDestination = navDestination.mo8548D();
        }
        if (navDestination.mo8563w() == i) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m42c(NavDestination navDestination, Set<Integer> set) {
        while (!set.contains(Integer.valueOf(navDestination.mo8563w()))) {
            navDestination = navDestination.mo8548D();
            if (navDestination == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m43d(MenuItem menuItem, NavController navController) {
        m44.C2804a d = new m44.C2804a().mo23037d(true);
        if (navController.mo8446B().mo8548D().mo8573R(menuItem.getItemId()) instanceof ActivityNavigator.C1107b) {
            d.mo23035b(w05.nav_default_enter_anim).mo23036c(w05.nav_default_exit_anim).mo23038e(w05.nav_default_pop_enter_anim).mo23039f(w05.nav_default_pop_exit_anim);
        } else {
            d.mo23035b(x05.nav_default_enter_anim).mo23036c(x05.nav_default_exit_anim).mo23038e(x05.nav_default_pop_enter_anim).mo23039f(x05.nav_default_pop_exit_anim);
        }
        if ((menuItem.getOrder() & 196608) == 0) {
            d.mo23040g(m40a(navController.mo8448D()).mo8563w(), false);
        }
        try {
            navController.mo8458O(menuItem.getItemId(), (Bundle) null, d.mo23034a());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static void m44e(AppCompatActivity appCompatActivity, NavController navController, C3083pm pmVar) {
        navController.mo8484p(new C2141d9(appCompatActivity, pmVar));
    }

    /* renamed from: f */
    public static void m45f(BottomNavigationView bottomNavigationView, NavController navController) {
        bottomNavigationView.setOnNavigationItemSelectedListener(new C0007a(navController));
        navController.mo8484p(new C0008b(new WeakReference(bottomNavigationView), navController));
    }
}

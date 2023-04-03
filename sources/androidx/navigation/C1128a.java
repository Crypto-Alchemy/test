package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.Navigator;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J*\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Landroidx/navigation/a;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavGraph;", "l", "", "Landroidx/navigation/NavBackStackEntry;", "entries", "Lm44;", "navOptions", "Landroidx/navigation/Navigator$a;", "navigatorExtras", "Lr37;", "e", "entry", "m", "Lb54;", "c", "Lb54;", "navigatorProvider", "<init>", "(Lb54;)V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
@Navigator.C1127b("navigation")
/* renamed from: androidx.navigation.a */
/* compiled from: NavGraphNavigator.kt */
public class C1128a extends Navigator<NavGraph> {

    /* renamed from: c */
    public final b54 f6078c;

    public C1128a(b54 b54) {
        vx2.m53591g(b54, "navigatorProvider");
        this.f6078c = b54;
    }

    /* renamed from: e */
    public void mo8598e(List<NavBackStackEntry> list, m44 m44, Navigator.C1126a aVar) {
        vx2.m53591g(list, "entries");
        for (NavBackStackEntry m : list) {
            mo8608m(m, m44, aVar);
        }
    }

    /* renamed from: l */
    public NavGraph mo8399a() {
        return new NavGraph(this);
    }

    /* renamed from: m */
    public final void mo8608m(NavBackStackEntry navBackStackEntry, m44 m44, Navigator.C1126a aVar) {
        boolean z;
        NavDestination navDestination;
        NavGraph navGraph = (NavGraph) navBackStackEntry.mo8424f();
        Bundle d = navBackStackEntry.mo8421d();
        int Z = navGraph.mo8580Z();
        String a0 = navGraph.mo8581a0();
        if (Z == 0 && a0 == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (a0 != null) {
                navDestination = navGraph.mo8576U(a0, false);
            } else {
                navDestination = navGraph.mo8574S(Z, false);
            }
            if (navDestination != null) {
                this.f6078c.mo11359e(navDestination.mo8547B()).mo8598e(bk0.m32598e(mo8596b().mo8502a(navDestination, navDestination.mo8558n(d))), m44, aVar);
                return;
            }
            throw new IllegalArgumentException("navigation destination " + navGraph.mo8578W() + " is not a direct child of this NavGraph");
        }
        throw new IllegalStateException(("no start destination defined via app:startDestination for " + navGraph.mo8562u()).toString());
    }
}

package androidx.navigation;

import androidx.navigation.Navigator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo44877d2 = {"<anonymous>", "Landroidx/navigation/NavBackStackEntry;", "D", "Landroidx/navigation/NavDestination;", "backStackEntry", "invoke"}, mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: Navigator.kt */
public final class Navigator$navigate$1 extends Lambda implements rc2<NavBackStackEntry, NavBackStackEntry> {
    public final /* synthetic */ m44 $navOptions;
    public final /* synthetic */ Navigator.C1126a $navigatorExtras;
    public final /* synthetic */ Navigator<D> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Navigator$navigate$1(Navigator<D> navigator, m44 m44, Navigator.C1126a aVar) {
        super(1);
        this.this$0 = navigator;
        this.$navOptions = m44;
        this.$navigatorExtras = aVar;
    }

    public final NavBackStackEntry invoke(NavBackStackEntry navBackStackEntry) {
        vx2.m53591g(navBackStackEntry, "backStackEntry");
        NavDestination f = navBackStackEntry.mo8424f();
        if (!(f instanceof NavDestination)) {
            f = null;
        }
        if (f == null) {
            return null;
        }
        NavDestination d = this.this$0.mo8400d(f, navBackStackEntry.mo8421d(), this.$navOptions, this.$navigatorExtras);
        if (d == null) {
            return null;
        }
        return vx2.m53586b(d, f) ? navBackStackEntry : this.this$0.mo8596b().mo8502a(d, d.mo8558n(navBackStackEntry.mo8421d()));
    }
}

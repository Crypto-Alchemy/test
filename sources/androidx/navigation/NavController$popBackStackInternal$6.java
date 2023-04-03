package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "Landroidx/navigation/NavDestination;", "destination", "invoke"}, mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: NavController.kt */
public final class NavController$popBackStackInternal$6 extends Lambda implements rc2<NavDestination, NavDestination> {
    public static final NavController$popBackStackInternal$6 INSTANCE = new NavController$popBackStackInternal$6();

    public NavController$popBackStackInternal$6() {
        super(1);
    }

    public final NavDestination invoke(NavDestination navDestination) {
        vx2.m53591g(navDestination, "destination");
        NavGraph D = navDestination.mo8548D();
        boolean z = false;
        if (D != null && D.mo8580Z() == navDestination.mo8563w()) {
            z = true;
        }
        if (z) {
            return navDestination.mo8548D();
        }
        return null;
    }
}

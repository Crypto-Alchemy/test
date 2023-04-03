package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "Landroidx/navigation/NavDestination;", "it", "invoke"}, mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: NavGraph.kt */
public final class NavGraph$Companion$findStartDestination$1 extends Lambda implements rc2<NavDestination, NavDestination> {
    public static final NavGraph$Companion$findStartDestination$1 INSTANCE = new NavGraph$Companion$findStartDestination$1();

    public NavGraph$Companion$findStartDestination$1() {
        super(1);
    }

    public final NavDestination invoke(NavDestination navDestination) {
        vx2.m53591g(navDestination, "it");
        if (!(navDestination instanceof NavGraph)) {
            return null;
        }
        NavGraph navGraph = (NavGraph) navDestination;
        return navGraph.mo8573R(navGraph.mo8580Z());
    }
}

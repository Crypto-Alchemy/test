package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"<anonymous>", "", "destination", "Landroidx/navigation/NavDestination;", "invoke", "(Landroidx/navigation/NavDestination;)Ljava/lang/Boolean;"}, mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: NavController.kt */
public final class NavController$popBackStackInternal$4 extends Lambda implements rc2<NavDestination, Boolean> {
    public final /* synthetic */ NavController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$popBackStackInternal$4(NavController navController) {
        super(1);
        this.this$0 = navController;
    }

    public final Boolean invoke(NavDestination navDestination) {
        vx2.m53591g(navDestination, "destination");
        return Boolean.valueOf(!this.this$0.f6012m.containsKey(Integer.valueOf(navDestination.mo8563w())));
    }
}

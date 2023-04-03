package androidx.navigation;

import android.os.Bundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroidx/navigation/NavBackStackEntry;", "it", "Lr37;", "invoke", "(Landroidx/navigation/NavBackStackEntry;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: NavController.kt */
public final class NavController$navigate$4 extends Lambda implements rc2<NavBackStackEntry, r37> {
    public final /* synthetic */ Bundle $finalArgs;
    public final /* synthetic */ Ref$BooleanRef $navigated;
    public final /* synthetic */ NavDestination $node;
    public final /* synthetic */ NavController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$navigate$4(Ref$BooleanRef ref$BooleanRef, NavController navController, NavDestination navDestination, Bundle bundle) {
        super(1);
        this.$navigated = ref$BooleanRef;
        this.this$0 = navController;
        this.$node = navDestination;
        this.$finalArgs = bundle;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavBackStackEntry) obj);
        return r37.f33317a;
    }

    public final void invoke(NavBackStackEntry navBackStackEntry) {
        vx2.m53591g(navBackStackEntry, "it");
        this.$navigated.element = true;
        NavController.m8189o(this.this$0, this.$node, this.$finalArgs, navBackStackEntry, (List) null, 8, (Object) null);
    }
}

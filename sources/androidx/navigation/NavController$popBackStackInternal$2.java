package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroidx/navigation/NavBackStackEntry;", "entry", "Lr37;", "invoke", "(Landroidx/navigation/NavBackStackEntry;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: NavController.kt */
public final class NavController$popBackStackInternal$2 extends Lambda implements rc2<NavBackStackEntry, r37> {
    public final /* synthetic */ Ref$BooleanRef $popped;
    public final /* synthetic */ Ref$BooleanRef $receivedPop;
    public final /* synthetic */ boolean $saveState;
    public final /* synthetic */ C5808eq<NavBackStackEntryState> $savedState;
    public final /* synthetic */ NavController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$popBackStackInternal$2(Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, NavController navController, boolean z, C5808eq<NavBackStackEntryState> eqVar) {
        super(1);
        this.$receivedPop = ref$BooleanRef;
        this.$popped = ref$BooleanRef2;
        this.this$0 = navController;
        this.$saveState = z;
        this.$savedState = eqVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavBackStackEntry) obj);
        return r37.f33317a;
    }

    public final void invoke(NavBackStackEntry navBackStackEntry) {
        vx2.m53591g(navBackStackEntry, "entry");
        this.$receivedPop.element = true;
        this.$popped.element = true;
        this.this$0.mo8472d0(navBackStackEntry, this.$saveState, this.$savedState);
    }
}

package androidx.navigation;

import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: NavController.kt */
public final class NavController$NavControllerNavigatorState$pop$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ NavBackStackEntry $popUpTo;
    public final /* synthetic */ boolean $saveState;
    public final /* synthetic */ NavController.NavControllerNavigatorState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$NavControllerNavigatorState$pop$1(NavController.NavControllerNavigatorState navControllerNavigatorState, NavBackStackEntry navBackStackEntry, boolean z) {
        super(0);
        this.this$0 = navControllerNavigatorState;
        this.$popUpTo = navBackStackEntry;
        this.$saveState = z;
    }

    public final void invoke() {
        NavController$NavControllerNavigatorState$pop$1.super.mo8504g(this.$popUpTo, this.$saveState);
    }
}

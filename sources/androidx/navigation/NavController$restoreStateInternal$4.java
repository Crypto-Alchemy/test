package androidx.navigation;

import android.os.Bundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroidx/navigation/NavBackStackEntry;", "entry", "Lr37;", "invoke", "(Landroidx/navigation/NavBackStackEntry;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: NavController.kt */
public final class NavController$restoreStateInternal$4 extends Lambda implements rc2<NavBackStackEntry, r37> {
    public final /* synthetic */ Bundle $args;
    public final /* synthetic */ List<NavBackStackEntry> $entries;
    public final /* synthetic */ Ref$IntRef $lastNavigatedIndex;
    public final /* synthetic */ Ref$BooleanRef $navigated;
    public final /* synthetic */ NavController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavController$restoreStateInternal$4(Ref$BooleanRef ref$BooleanRef, List<NavBackStackEntry> list, Ref$IntRef ref$IntRef, NavController navController, Bundle bundle) {
        super(1);
        this.$navigated = ref$BooleanRef;
        this.$entries = list;
        this.$lastNavigatedIndex = ref$IntRef;
        this.this$0 = navController;
        this.$args = bundle;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavBackStackEntry) obj);
        return r37.f33317a;
    }

    public final void invoke(NavBackStackEntry navBackStackEntry) {
        List<NavBackStackEntry> list;
        vx2.m53591g(navBackStackEntry, "entry");
        this.$navigated.element = true;
        int indexOf = this.$entries.indexOf(navBackStackEntry);
        if (indexOf != -1) {
            int i = indexOf + 1;
            list = this.$entries.subList(this.$lastNavigatedIndex.element, i);
            this.$lastNavigatedIndex.element = i;
        } else {
            list = ck0.m33062j();
        }
        this.this$0.mo8481n(navBackStackEntry.mo8424f(), this.$args, navBackStackEntry, list);
    }
}

package androidx.navigation;

import androidx.lifecycle.C0729l;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Ldl5;", "invoke", "()Ldl5;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: NavBackStackEntry.kt */
public final class NavBackStackEntry$savedStateHandle$2 extends Lambda implements pc2<dl5> {
    public final /* synthetic */ NavBackStackEntry this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavBackStackEntry$savedStateHandle$2(NavBackStackEntry navBackStackEntry) {
        super(0);
        this.this$0 = navBackStackEntry;
    }

    public final dl5 invoke() {
        if (this.this$0.f5973A) {
            if (this.this$0.f5984x.mo6296b() != Lifecycle.State.DESTROYED) {
                NavBackStackEntry navBackStackEntry = this.this$0;
                return ((NavBackStackEntry.C1111c) new C0729l((hd7) navBackStackEntry, (C0729l.C0733b) new NavBackStackEntry.C1110b(navBackStackEntry)).mo6421a(NavBackStackEntry.C1111c.class)).mo8435b();
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }
}

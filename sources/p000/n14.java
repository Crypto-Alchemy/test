package p000;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import net.safemoon.androidwallet.fragments.MyTokensListFragment;

/* renamed from: n14 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n14 implements SwipeRefreshLayout.C1408j {

    /* renamed from: a */
    public final /* synthetic */ bb2 f41024a;

    /* renamed from: b */
    public final /* synthetic */ MyTokensListFragment f41025b;

    public /* synthetic */ n14(bb2 bb2, MyTokensListFragment myTokensListFragment) {
        this.f41024a = bb2;
        this.f41025b = myTokensListFragment;
    }

    public final void onRefresh() {
        MyTokensListFragment.m66623Y(this.f41024a, this.f41025b);
    }
}

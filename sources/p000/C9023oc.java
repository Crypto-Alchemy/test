package p000;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import net.safemoon.androidwallet.fragments.AddNewTokenFragment;

/* renamed from: oc */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C9023oc implements SwipeRefreshLayout.C1408j {

    /* renamed from: a */
    public final /* synthetic */ c92 f43622a;

    /* renamed from: b */
    public final /* synthetic */ AddNewTokenFragment f43623b;

    public /* synthetic */ C9023oc(c92 c92, AddNewTokenFragment addNewTokenFragment) {
        this.f43622a = c92;
        this.f43623b = addNewTokenFragment;
    }

    public final void onRefresh() {
        AddNewTokenFragment.m66414X(this.f43622a, this.f43623b);
    }
}

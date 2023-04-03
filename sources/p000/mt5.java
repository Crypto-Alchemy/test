package p000;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import net.safemoon.androidwallet.fragments.SelectCurrencyFragment;

/* renamed from: mt5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class mt5 implements SwipeRefreshLayout.C1408j {

    /* renamed from: a */
    public final /* synthetic */ pa2 f41010a;

    /* renamed from: b */
    public final /* synthetic */ SelectCurrencyFragment f41011b;

    public /* synthetic */ mt5(pa2 pa2, SelectCurrencyFragment selectCurrencyFragment) {
        this.f41010a = pa2;
        this.f41011b = selectCurrencyFragment;
    }

    public final void onRefresh() {
        SelectCurrencyFragment.m66969I(this.f41010a, this.f41011b);
    }
}

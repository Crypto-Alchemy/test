package p000;

import android.widget.CompoundButton;
import net.safemoon.androidwallet.dialogs.GraphTradingViewFragment;

/* renamed from: kj2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class kj2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ v92 f38912a;

    /* renamed from: b */
    public final /* synthetic */ GraphTradingViewFragment f38913b;

    public /* synthetic */ kj2(v92 v92, GraphTradingViewFragment graphTradingViewFragment) {
        this.f38912a = v92;
        this.f38913b = graphTradingViewFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        GraphTradingViewFragment.m66174F(this.f38912a, this.f38913b, compoundButton, z);
    }
}

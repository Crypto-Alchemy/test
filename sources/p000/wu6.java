package p000;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import net.safemoon.androidwallet.fragments.TransferHistoryFragment;

/* renamed from: wu6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class wu6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Ref$IntRef f45767a;

    /* renamed from: d */
    public final /* synthetic */ TransferHistoryFragment f45768d;

    /* renamed from: e */
    public final /* synthetic */ List f45769e;

    /* renamed from: g */
    public final /* synthetic */ List f45770g;

    public /* synthetic */ wu6(Ref$IntRef ref$IntRef, TransferHistoryFragment transferHistoryFragment, List list, List list2) {
        this.f45767a = ref$IntRef;
        this.f45768d = transferHistoryFragment;
        this.f45769e = list;
        this.f45770g = list2;
    }

    public final void onClick(View view) {
        TransferHistoryFragment.m67559S0(this.f45767a, this.f45768d, this.f45769e, this.f45770g, view);
    }
}

package p000;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import net.safemoon.androidwallet.fragments.TransferHistoryFragment;

/* renamed from: vu6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class vu6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Ref$IntRef f45386a;

    /* renamed from: d */
    public final /* synthetic */ TransferHistoryFragment f45387d;

    /* renamed from: e */
    public final /* synthetic */ List f45388e;

    /* renamed from: g */
    public final /* synthetic */ List f45389g;

    public /* synthetic */ vu6(Ref$IntRef ref$IntRef, TransferHistoryFragment transferHistoryFragment, List list, List list2) {
        this.f45386a = ref$IntRef;
        this.f45387d = transferHistoryFragment;
        this.f45388e = list;
        this.f45389g = list2;
    }

    public final void onClick(View view) {
        TransferHistoryFragment.m67557R0(this.f45386a, this.f45387d, this.f45388e, this.f45389g, view);
    }
}

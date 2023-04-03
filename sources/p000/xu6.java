package p000;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import net.safemoon.androidwallet.fragments.TransferHistoryFragment;

/* renamed from: xu6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class xu6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Ref$IntRef f46015a;

    /* renamed from: d */
    public final /* synthetic */ TransferHistoryFragment f46016d;

    /* renamed from: e */
    public final /* synthetic */ List f46017e;

    /* renamed from: g */
    public final /* synthetic */ List f46018g;

    public /* synthetic */ xu6(Ref$IntRef ref$IntRef, TransferHistoryFragment transferHistoryFragment, List list, List list2) {
        this.f46015a = ref$IntRef;
        this.f46016d = transferHistoryFragment;
        this.f46017e = list;
        this.f46018g = list2;
    }

    public final void onClick(View view) {
        TransferHistoryFragment.m67561T0(this.f46015a, this.f46016d, this.f46017e, this.f46018g, view);
    }
}

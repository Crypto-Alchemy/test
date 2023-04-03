package p000;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import net.safemoon.androidwallet.fragments.TransferHistoryFragment;

/* renamed from: yu6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class yu6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Ref$IntRef f46271a;

    /* renamed from: d */
    public final /* synthetic */ TransferHistoryFragment f46272d;

    /* renamed from: e */
    public final /* synthetic */ List f46273e;

    /* renamed from: g */
    public final /* synthetic */ List f46274g;

    public /* synthetic */ yu6(Ref$IntRef ref$IntRef, TransferHistoryFragment transferHistoryFragment, List list, List list2) {
        this.f46271a = ref$IntRef;
        this.f46272d = transferHistoryFragment;
        this.f46273e = list;
        this.f46274g = list2;
    }

    public final void onClick(View view) {
        TransferHistoryFragment.m67563U0(this.f46271a, this.f46272d, this.f46273e, this.f46274g, view);
    }
}

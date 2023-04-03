package p000;

import java.util.List;
import net.safemoon.androidwallet.fragments.TransferHistoryFragment;

/* renamed from: zu6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class zu6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List f46497a;

    /* renamed from: d */
    public final /* synthetic */ int f46498d;

    /* renamed from: e */
    public final /* synthetic */ TransferHistoryFragment f46499e;

    public /* synthetic */ zu6(List list, int i, TransferHistoryFragment transferHistoryFragment) {
        this.f46497a = list;
        this.f46498d = i;
        this.f46499e = transferHistoryFragment;
    }

    public final void run() {
        TransferHistoryFragment.m67572a1(this.f46497a, this.f46498d, this.f46499e);
    }
}

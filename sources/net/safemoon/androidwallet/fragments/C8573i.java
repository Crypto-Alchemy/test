package net.safemoon.androidwallet.fragments;

import net.safemoon.androidwallet.model.common.LoadingState;

/* renamed from: net.safemoon.androidwallet.fragments.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C8573i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TransferHistoryFragment f42395a;

    /* renamed from: d */
    public final /* synthetic */ LoadingState f42396d;

    public /* synthetic */ C8573i(TransferHistoryFragment transferHistoryFragment, LoadingState loadingState) {
        this.f42395a = transferHistoryFragment;
        this.f42396d = loadingState;
    }

    public final void run() {
        TransferHistoryFragment$initRecyclerView$3.m67616b(this.f42395a, this.f42396d);
    }
}

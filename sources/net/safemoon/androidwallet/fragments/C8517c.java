package net.safemoon.androidwallet.fragments;

import android.view.View;
import net.safemoon.androidwallet.model.priceAlert.PAToken;

/* renamed from: net.safemoon.androidwallet.fragments.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C8517c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ NotificationFragment f42291a;

    /* renamed from: d */
    public final /* synthetic */ PAToken f42292d;

    /* renamed from: e */
    public final /* synthetic */ ga2 f42293e;

    public /* synthetic */ C8517c(NotificationFragment notificationFragment, PAToken pAToken, ga2 ga2) {
        this.f42291a = notificationFragment;
        this.f42292d = pAToken;
        this.f42293e = ga2;
    }

    public final void onClick(View view) {
        NotificationFragment$initPriceAlert$1$1$5.m66699b(this.f42291a, this.f42292d, this.f42293e, view);
    }
}

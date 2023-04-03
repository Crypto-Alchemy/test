package net.safemoon.androidwallet.dialogs;

import android.content.Context;
import android.view.View;
import net.safemoon.androidwallet.model.wallets.Wallet;

/* renamed from: net.safemoon.androidwallet.dialogs.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C8342a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AnchorSwitchWallet f41839a;

    /* renamed from: d */
    public final /* synthetic */ Wallet f41840d;

    /* renamed from: e */
    public final /* synthetic */ Context f41841e;

    public /* synthetic */ C8342a(AnchorSwitchWallet anchorSwitchWallet, Wallet wallet2, Context context) {
        this.f41839a = anchorSwitchWallet;
        this.f41840d = wallet2;
        this.f41841e = context;
    }

    public final void onClick(View view) {
        AnchorSwitchWallet$show$1$1.m65933b(this.f41839a, this.f41840d, this.f41841e, view);
    }
}

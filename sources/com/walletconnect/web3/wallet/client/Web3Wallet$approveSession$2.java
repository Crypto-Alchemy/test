package com.walletconnect.web3.wallet.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.b16;
import p000.ig7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lb16$a;", "it", "Lr37;", "invoke", "(Lb16$a;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Web3Wallet.kt */
public final class Web3Wallet$approveSession$2 extends Lambda implements rc2<b16.C3871a, r37> {
    public final /* synthetic */ rc2<ig7.C5963d, r37> $onSuccess;
    public final /* synthetic */ ig7.C5963d $params;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Web3Wallet$approveSession$2(rc2<? super ig7.C5963d, r37> rc2, ig7.C5963d dVar) {
        super(1);
        this.$onSuccess = rc2;
        this.$params = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((b16.C3871a) obj);
        return r37.f33317a;
    }

    public final void invoke(b16.C3871a aVar) {
        vx2.m53591g(aVar, "it");
        this.$onSuccess.invoke(this.$params);
    }
}

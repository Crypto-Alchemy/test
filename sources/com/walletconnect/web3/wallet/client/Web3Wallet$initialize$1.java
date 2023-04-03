package com.walletconnect.web3.wallet.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.a16;
import p000.hg7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"La16$c;", "error", "Lr37;", "invoke", "(La16$c;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Web3Wallet.kt */
public final class Web3Wallet$initialize$1 extends Lambda implements rc2<a16.C3780c, r37> {
    public final /* synthetic */ rc2<hg7.C5900c, r37> $onError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Web3Wallet$initialize$1(rc2<? super hg7.C5900c, r37> rc2) {
        super(1);
        this.$onError = rc2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((a16.C3780c) obj);
        return r37.f33317a;
    }

    public final void invoke(a16.C3780c cVar) {
        vx2.m53591g(cVar, "error");
        this.$onError.invoke(new hg7.C5900c(cVar.mo28703a()));
    }
}

package net.safemoon.androidwallet.activity;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lr37;", "invoke", "(Ljava/lang/Long;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: StartWalletActivity.kt */
public final class StartWalletActivity$addWalletToDatabase$1 extends Lambda implements rc2<Long, r37> {
    public final /* synthetic */ StartWalletActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartWalletActivity$addWalletToDatabase$1(StartWalletActivity startWalletActivity) {
        super(1);
        this.this$0 = startWalletActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Long) obj);
        return r37.f33317a;
    }

    public final void invoke(Long l) {
        StartWalletActivity startWalletActivity = this.this$0;
        startWalletActivity.f41495Z = startWalletActivity.f41495Z + 1;
        if (this.this$0.f41495Z >= this.this$0.f41494Y.size()) {
            this.this$0.mo56889R0();
            return;
        }
        StartWalletActivity startWalletActivity2 = this.this$0;
        startWalletActivity2.mo56886M0((String) startWalletActivity2.f41494Y.get(this.this$0.f41495Z));
    }
}

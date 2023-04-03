package net.safemoon.androidwallet.dialogs;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lz57;", "invoke", "()Lz57;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: WalletConnectSmartContractCall.kt */
public final class WalletConnectSmartContractCall$userTokenListDao$2 extends Lambda implements pc2<z57> {
    public final /* synthetic */ WalletConnectSmartContractCall this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectSmartContractCall$userTokenListDao$2(WalletConnectSmartContractCall walletConnectSmartContractCall) {
        super(0);
        this.this$0 = walletConnectSmartContractCall;
    }

    public final z57 invoke() {
        ApplicationRoomDatabase.C8270m mVar = ApplicationRoomDatabase.f41664p;
        Context requireContext = this.this$0.requireContext();
        vx2.m53590f(requireContext, "requireContext()");
        return ApplicationRoomDatabase.C8270m.m65847c(mVar, requireContext, (String) null, 2, (Object) null).mo57118Z();
    }
}

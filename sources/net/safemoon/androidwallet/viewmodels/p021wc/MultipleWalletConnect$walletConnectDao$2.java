package net.safemoon.androidwallet.viewmodels.p021wc;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Llp0;", "invoke", "()Llp0;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$walletConnectDao$2 */
/* compiled from: MultipleWalletConnect.kt */
public final class MultipleWalletConnect$walletConnectDao$2 extends Lambda implements pc2<lp0> {
    public final /* synthetic */ MultipleWalletConnect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultipleWalletConnect$walletConnectDao$2(MultipleWalletConnect multipleWalletConnect) {
        super(0);
        this.this$0 = multipleWalletConnect;
    }

    public final lp0 invoke() {
        return MainRoomDatabase.f41647p.mo57110b(this.this$0.mo61931z()).mo57106O();
    }
}

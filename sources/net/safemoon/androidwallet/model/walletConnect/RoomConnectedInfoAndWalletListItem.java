package net.safemoon.androidwallet.model.walletConnect;

import kotlin.Metadata;
import net.safemoon.androidwallet.model.common.HistoryListItem;

@Metadata(mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfoAndWalletListItem;", "Lnet/safemoon/androidwallet/model/common/HistoryListItem;", "()V", "result", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfoAndWallet;", "getResult", "()Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfoAndWallet;", "setResult", "(Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfoAndWallet;)V", "getType", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomConnectedInfoAndWalletListItem.kt */
public final class RoomConnectedInfoAndWalletListItem extends HistoryListItem {
    private RoomConnectedInfoAndWallet result;

    public final RoomConnectedInfoAndWallet getResult() {
        return this.result;
    }

    public int getType() {
        return 2;
    }

    public final void setResult(RoomConnectedInfoAndWallet roomConnectedInfoAndWallet) {
        this.result = roomConnectedInfoAndWallet;
    }
}

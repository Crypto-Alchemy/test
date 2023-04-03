package net.safemoon.androidwallet.model.walletConnect;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfoAndWallet;", "", "dApp", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "wallet", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "(Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;Lnet/safemoon/androidwallet/model/wallets/Wallet;)V", "getDApp", "()Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "getWallet", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomConnectedInfoAndWallet.kt */
public final class RoomConnectedInfoAndWallet {
    private final RoomConnectedInfo dApp;

    /* renamed from: wallet  reason: collision with root package name */
    private final Wallet f46905wallet;

    public RoomConnectedInfoAndWallet(RoomConnectedInfo roomConnectedInfo, Wallet wallet2) {
        vx2.m53591g(roomConnectedInfo, "dApp");
        this.dApp = roomConnectedInfo;
        this.f46905wallet = wallet2;
    }

    public static /* synthetic */ RoomConnectedInfoAndWallet copy$default(RoomConnectedInfoAndWallet roomConnectedInfoAndWallet, RoomConnectedInfo roomConnectedInfo, Wallet wallet2, int i, Object obj) {
        if ((i & 1) != 0) {
            roomConnectedInfo = roomConnectedInfoAndWallet.dApp;
        }
        if ((i & 2) != 0) {
            wallet2 = roomConnectedInfoAndWallet.f46905wallet;
        }
        return roomConnectedInfoAndWallet.copy(roomConnectedInfo, wallet2);
    }

    public final RoomConnectedInfo component1() {
        return this.dApp;
    }

    public final Wallet component2() {
        return this.f46905wallet;
    }

    public final RoomConnectedInfoAndWallet copy(RoomConnectedInfo roomConnectedInfo, Wallet wallet2) {
        vx2.m53591g(roomConnectedInfo, "dApp");
        return new RoomConnectedInfoAndWallet(roomConnectedInfo, wallet2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomConnectedInfoAndWallet)) {
            return false;
        }
        RoomConnectedInfoAndWallet roomConnectedInfoAndWallet = (RoomConnectedInfoAndWallet) obj;
        return vx2.m53586b(this.dApp, roomConnectedInfoAndWallet.dApp) && vx2.m53586b(this.f46905wallet, roomConnectedInfoAndWallet.f46905wallet);
    }

    public final RoomConnectedInfo getDApp() {
        return this.dApp;
    }

    public final Wallet getWallet() {
        return this.f46905wallet;
    }

    public int hashCode() {
        int hashCode = this.dApp.hashCode() * 31;
        Wallet wallet2 = this.f46905wallet;
        return hashCode + (wallet2 == null ? 0 : wallet2.hashCode());
    }

    public String toString() {
        RoomConnectedInfo roomConnectedInfo = this.dApp;
        Wallet wallet2 = this.f46905wallet;
        return "RoomConnectedInfoAndWallet(dApp=" + roomConnectedInfo + ", wallet=" + wallet2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomConnectedInfoAndWallet(RoomConnectedInfo roomConnectedInfo, Wallet wallet2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(roomConnectedInfo, (i & 2) != 0 ? null : wallet2);
    }
}

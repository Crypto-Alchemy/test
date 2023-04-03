package net.safemoon.androidwallet.model.walletConnect;

import com.google.gson.Gson;
import com.trustwallet.walletconnect.models.WCPeerMeta;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u0004\u0018\u00010\u0003\u001a\u0014\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u0004\u0018\u00010\u0004\u001a\u0012\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00030\u0003*\u00020\u0001\u001a\u0014\u0010\u0006\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004*\u0004\u0018\u00010\u0001¨\u0006\u0007"}, mo44877d2 = {"changeToString", "", "kotlin.jvm.PlatformType", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "Lnet/safemoon/androidwallet/model/walletConnect/RoomConnectedInfo;", "toPeerMeta", "toRoomConnectedInfo", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomExtension.kt */
public final class RoomExtensionKt {
    public static final String changeToString(WCPeerMeta wCPeerMeta) {
        return new Gson().toJson((Object) wCPeerMeta);
    }

    public static final WCPeerMeta toPeerMeta(String str) {
        vx2.m53591g(str, "<this>");
        return (WCPeerMeta) new Gson().fromJson(str, WCPeerMeta.class);
    }

    public static final RoomConnectedInfo toRoomConnectedInfo(String str) {
        return (RoomConnectedInfo) new Gson().fromJson(str, RoomConnectedInfo.class);
    }

    public static final String changeToString(RoomConnectedInfo roomConnectedInfo) {
        return new Gson().toJson((Object) roomConnectedInfo);
    }
}

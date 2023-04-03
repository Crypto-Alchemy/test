package com.trustwallet.walletconnect.models.session;

import com.trustwallet.walletconnect.models.WCPeerMeta;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/session/WCSessionRequest;", "", "peerId", "", "peerMeta", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "chainId", "(Ljava/lang/String;Lcom/trustwallet/walletconnect/models/WCPeerMeta;Ljava/lang/String;)V", "getChainId", "()Ljava/lang/String;", "getPeerId", "getPeerMeta", "()Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCSessionRequest.kt */
public final class WCSessionRequest {
    private final String chainId;
    private final String peerId;
    private final WCPeerMeta peerMeta;

    public WCSessionRequest(String str, WCPeerMeta wCPeerMeta, String str2) {
        vx2.m53591g(str, "peerId");
        vx2.m53591g(wCPeerMeta, "peerMeta");
        this.peerId = str;
        this.peerMeta = wCPeerMeta;
        this.chainId = str2;
    }

    public static /* synthetic */ WCSessionRequest copy$default(WCSessionRequest wCSessionRequest, String str, WCPeerMeta wCPeerMeta, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wCSessionRequest.peerId;
        }
        if ((i & 2) != 0) {
            wCPeerMeta = wCSessionRequest.peerMeta;
        }
        if ((i & 4) != 0) {
            str2 = wCSessionRequest.chainId;
        }
        return wCSessionRequest.copy(str, wCPeerMeta, str2);
    }

    public final String component1() {
        return this.peerId;
    }

    public final WCPeerMeta component2() {
        return this.peerMeta;
    }

    public final String component3() {
        return this.chainId;
    }

    public final WCSessionRequest copy(String str, WCPeerMeta wCPeerMeta, String str2) {
        vx2.m53591g(str, "peerId");
        vx2.m53591g(wCPeerMeta, "peerMeta");
        return new WCSessionRequest(str, wCPeerMeta, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCSessionRequest)) {
            return false;
        }
        WCSessionRequest wCSessionRequest = (WCSessionRequest) obj;
        return vx2.m53586b(this.peerId, wCSessionRequest.peerId) && vx2.m53586b(this.peerMeta, wCSessionRequest.peerMeta) && vx2.m53586b(this.chainId, wCSessionRequest.chainId);
    }

    public final String getChainId() {
        return this.chainId;
    }

    public final String getPeerId() {
        return this.peerId;
    }

    public final WCPeerMeta getPeerMeta() {
        return this.peerMeta;
    }

    public int hashCode() {
        int hashCode = ((this.peerId.hashCode() * 31) + this.peerMeta.hashCode()) * 31;
        String str = this.chainId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "WCSessionRequest(peerId=" + this.peerId + ", peerMeta=" + this.peerMeta + ", chainId=" + this.chainId + ')';
    }
}

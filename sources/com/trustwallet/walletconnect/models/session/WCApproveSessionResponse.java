package com.trustwallet.walletconnect.models.session;

import com.trustwallet.walletconnect.models.WCPeerMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/session/WCApproveSessionResponse;", "", "approved", "", "chainId", "", "accounts", "", "", "peerId", "peerMeta", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "(ZILjava/util/List;Ljava/lang/String;Lcom/trustwallet/walletconnect/models/WCPeerMeta;)V", "getAccounts", "()Ljava/util/List;", "getApproved", "()Z", "getChainId", "()I", "getPeerId", "()Ljava/lang/String;", "getPeerMeta", "()Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCApproveSessionResponse.kt */
public final class WCApproveSessionResponse {
    private final List<String> accounts;
    private final boolean approved;
    private final int chainId;
    private final String peerId;
    private final WCPeerMeta peerMeta;

    public WCApproveSessionResponse(boolean z, int i, List<String> list, String str, WCPeerMeta wCPeerMeta) {
        vx2.m53591g(list, "accounts");
        this.approved = z;
        this.chainId = i;
        this.accounts = list;
        this.peerId = str;
        this.peerMeta = wCPeerMeta;
    }

    public static /* synthetic */ WCApproveSessionResponse copy$default(WCApproveSessionResponse wCApproveSessionResponse, boolean z, int i, List<String> list, String str, WCPeerMeta wCPeerMeta, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = wCApproveSessionResponse.approved;
        }
        if ((i2 & 2) != 0) {
            i = wCApproveSessionResponse.chainId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            list = wCApproveSessionResponse.accounts;
        }
        List<String> list2 = list;
        if ((i2 & 8) != 0) {
            str = wCApproveSessionResponse.peerId;
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            wCPeerMeta = wCApproveSessionResponse.peerMeta;
        }
        return wCApproveSessionResponse.copy(z, i3, list2, str2, wCPeerMeta);
    }

    public final boolean component1() {
        return this.approved;
    }

    public final int component2() {
        return this.chainId;
    }

    public final List<String> component3() {
        return this.accounts;
    }

    public final String component4() {
        return this.peerId;
    }

    public final WCPeerMeta component5() {
        return this.peerMeta;
    }

    public final WCApproveSessionResponse copy(boolean z, int i, List<String> list, String str, WCPeerMeta wCPeerMeta) {
        vx2.m53591g(list, "accounts");
        return new WCApproveSessionResponse(z, i, list, str, wCPeerMeta);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCApproveSessionResponse)) {
            return false;
        }
        WCApproveSessionResponse wCApproveSessionResponse = (WCApproveSessionResponse) obj;
        return this.approved == wCApproveSessionResponse.approved && this.chainId == wCApproveSessionResponse.chainId && vx2.m53586b(this.accounts, wCApproveSessionResponse.accounts) && vx2.m53586b(this.peerId, wCApproveSessionResponse.peerId) && vx2.m53586b(this.peerMeta, wCApproveSessionResponse.peerMeta);
    }

    public final List<String> getAccounts() {
        return this.accounts;
    }

    public final boolean getApproved() {
        return this.approved;
    }

    public final int getChainId() {
        return this.chainId;
    }

    public final String getPeerId() {
        return this.peerId;
    }

    public final WCPeerMeta getPeerMeta() {
        return this.peerMeta;
    }

    public int hashCode() {
        boolean z = this.approved;
        if (z) {
            z = true;
        }
        int hashCode = (((((z ? 1 : 0) * true) + this.chainId) * 31) + this.accounts.hashCode()) * 31;
        String str = this.peerId;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        WCPeerMeta wCPeerMeta = this.peerMeta;
        if (wCPeerMeta != null) {
            i = wCPeerMeta.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "WCApproveSessionResponse(approved=" + this.approved + ", chainId=" + this.chainId + ", accounts=" + this.accounts + ", peerId=" + this.peerId + ", peerMeta=" + this.peerMeta + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WCApproveSessionResponse(boolean z, int i, List list, String str, WCPeerMeta wCPeerMeta, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, i, list, str, wCPeerMeta);
    }
}

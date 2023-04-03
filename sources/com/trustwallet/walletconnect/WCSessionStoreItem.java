package com.trustwallet.walletconnect;

import com.trustwallet.walletconnect.models.WCPeerMeta;
import com.trustwallet.walletconnect.models.session.WCSession;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\u000eHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, mo44877d2 = {"Lcom/trustwallet/walletconnect/WCSessionStoreItem;", "", "session", "Lcom/trustwallet/walletconnect/models/session/WCSession;", "chainId", "", "peerId", "", "remotePeerId", "remotePeerMeta", "Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "isAutoSign", "", "date", "Ljava/util/Date;", "(Lcom/trustwallet/walletconnect/models/session/WCSession;ILjava/lang/String;Ljava/lang/String;Lcom/trustwallet/walletconnect/models/WCPeerMeta;ZLjava/util/Date;)V", "getChainId", "()I", "getDate", "()Ljava/util/Date;", "()Z", "getPeerId", "()Ljava/lang/String;", "getRemotePeerId", "getRemotePeerMeta", "()Lcom/trustwallet/walletconnect/models/WCPeerMeta;", "getSession", "()Lcom/trustwallet/walletconnect/models/session/WCSession;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCSessionStore.kt */
public final class WCSessionStoreItem {
    private final int chainId;
    private final Date date;
    private final boolean isAutoSign;
    private final String peerId;
    private final String remotePeerId;
    private final WCPeerMeta remotePeerMeta;
    private final WCSession session;

    public WCSessionStoreItem(WCSession wCSession, int i, String str, String str2, WCPeerMeta wCPeerMeta, boolean z, Date date2) {
        vx2.m53591g(wCSession, "session");
        vx2.m53591g(str, "peerId");
        vx2.m53591g(str2, "remotePeerId");
        vx2.m53591g(wCPeerMeta, "remotePeerMeta");
        vx2.m53591g(date2, "date");
        this.session = wCSession;
        this.chainId = i;
        this.peerId = str;
        this.remotePeerId = str2;
        this.remotePeerMeta = wCPeerMeta;
        this.isAutoSign = z;
        this.date = date2;
    }

    public static /* synthetic */ WCSessionStoreItem copy$default(WCSessionStoreItem wCSessionStoreItem, WCSession wCSession, int i, String str, String str2, WCPeerMeta wCPeerMeta, boolean z, Date date2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            wCSession = wCSessionStoreItem.session;
        }
        if ((i2 & 2) != 0) {
            i = wCSessionStoreItem.chainId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = wCSessionStoreItem.peerId;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = wCSessionStoreItem.remotePeerId;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            wCPeerMeta = wCSessionStoreItem.remotePeerMeta;
        }
        WCPeerMeta wCPeerMeta2 = wCPeerMeta;
        if ((i2 & 32) != 0) {
            z = wCSessionStoreItem.isAutoSign;
        }
        boolean z2 = z;
        if ((i2 & 64) != 0) {
            date2 = wCSessionStoreItem.date;
        }
        return wCSessionStoreItem.copy(wCSession, i3, str3, str4, wCPeerMeta2, z2, date2);
    }

    public final WCSession component1() {
        return this.session;
    }

    public final int component2() {
        return this.chainId;
    }

    public final String component3() {
        return this.peerId;
    }

    public final String component4() {
        return this.remotePeerId;
    }

    public final WCPeerMeta component5() {
        return this.remotePeerMeta;
    }

    public final boolean component6() {
        return this.isAutoSign;
    }

    public final Date component7() {
        return this.date;
    }

    public final WCSessionStoreItem copy(WCSession wCSession, int i, String str, String str2, WCPeerMeta wCPeerMeta, boolean z, Date date2) {
        vx2.m53591g(wCSession, "session");
        vx2.m53591g(str, "peerId");
        vx2.m53591g(str2, "remotePeerId");
        vx2.m53591g(wCPeerMeta, "remotePeerMeta");
        Date date3 = date2;
        vx2.m53591g(date3, "date");
        return new WCSessionStoreItem(wCSession, i, str, str2, wCPeerMeta, z, date3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCSessionStoreItem)) {
            return false;
        }
        WCSessionStoreItem wCSessionStoreItem = (WCSessionStoreItem) obj;
        return vx2.m53586b(this.session, wCSessionStoreItem.session) && this.chainId == wCSessionStoreItem.chainId && vx2.m53586b(this.peerId, wCSessionStoreItem.peerId) && vx2.m53586b(this.remotePeerId, wCSessionStoreItem.remotePeerId) && vx2.m53586b(this.remotePeerMeta, wCSessionStoreItem.remotePeerMeta) && this.isAutoSign == wCSessionStoreItem.isAutoSign && vx2.m53586b(this.date, wCSessionStoreItem.date);
    }

    public final int getChainId() {
        return this.chainId;
    }

    public final Date getDate() {
        return this.date;
    }

    public final String getPeerId() {
        return this.peerId;
    }

    public final String getRemotePeerId() {
        return this.remotePeerId;
    }

    public final WCPeerMeta getRemotePeerMeta() {
        return this.remotePeerMeta;
    }

    public final WCSession getSession() {
        return this.session;
    }

    public int hashCode() {
        int hashCode = ((((((((this.session.hashCode() * 31) + this.chainId) * 31) + this.peerId.hashCode()) * 31) + this.remotePeerId.hashCode()) * 31) + this.remotePeerMeta.hashCode()) * 31;
        boolean z = this.isAutoSign;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.date.hashCode();
    }

    public final boolean isAutoSign() {
        return this.isAutoSign;
    }

    public String toString() {
        return "WCSessionStoreItem(session=" + this.session + ", chainId=" + this.chainId + ", peerId=" + this.peerId + ", remotePeerId=" + this.remotePeerId + ", remotePeerMeta=" + this.remotePeerMeta + ", isAutoSign=" + this.isAutoSign + ", date=" + this.date + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WCSessionStoreItem(WCSession wCSession, int i, String str, String str2, WCPeerMeta wCPeerMeta, boolean z, Date date2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(wCSession, i, str, str2, wCPeerMeta, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? new Date() : date2);
    }
}

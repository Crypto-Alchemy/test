package com.trustwallet.walletconnect.models.session;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J6\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/models/session/WCSessionUpdate;", "", "approved", "", "chainId", "", "accounts", "", "", "(ZLjava/lang/Integer;Ljava/util/List;)V", "getAccounts", "()Ljava/util/List;", "getApproved", "()Z", "getChainId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(ZLjava/lang/Integer;Ljava/util/List;)Lcom/trustwallet/walletconnect/models/session/WCSessionUpdate;", "equals", "other", "hashCode", "toString", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCSessionUpdate.kt */
public final class WCSessionUpdate {
    private final List<String> accounts;
    private final boolean approved;
    private final Integer chainId;

    public WCSessionUpdate(boolean z, Integer num, List<String> list) {
        this.approved = z;
        this.chainId = num;
        this.accounts = list;
    }

    public static /* synthetic */ WCSessionUpdate copy$default(WCSessionUpdate wCSessionUpdate, boolean z, Integer num, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wCSessionUpdate.approved;
        }
        if ((i & 2) != 0) {
            num = wCSessionUpdate.chainId;
        }
        if ((i & 4) != 0) {
            list = wCSessionUpdate.accounts;
        }
        return wCSessionUpdate.copy(z, num, list);
    }

    public final boolean component1() {
        return this.approved;
    }

    public final Integer component2() {
        return this.chainId;
    }

    public final List<String> component3() {
        return this.accounts;
    }

    public final WCSessionUpdate copy(boolean z, Integer num, List<String> list) {
        return new WCSessionUpdate(z, num, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCSessionUpdate)) {
            return false;
        }
        WCSessionUpdate wCSessionUpdate = (WCSessionUpdate) obj;
        return this.approved == wCSessionUpdate.approved && vx2.m53586b(this.chainId, wCSessionUpdate.chainId) && vx2.m53586b(this.accounts, wCSessionUpdate.accounts);
    }

    public final List<String> getAccounts() {
        return this.accounts;
    }

    public final boolean getApproved() {
        return this.approved;
    }

    public final Integer getChainId() {
        return this.chainId;
    }

    public int hashCode() {
        boolean z = this.approved;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        Integer num = this.chainId;
        int i2 = 0;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.accounts;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "WCSessionUpdate(approved=" + this.approved + ", chainId=" + this.chainId + ", accounts=" + this.accounts + ')';
    }
}

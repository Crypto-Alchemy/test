package com.trustwallet.walletconnect;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/WCSessionStore;", "", "session", "Lcom/trustwallet/walletconnect/WCSessionStoreItem;", "getSession", "()Lcom/trustwallet/walletconnect/WCSessionStoreItem;", "setSession", "(Lcom/trustwallet/walletconnect/WCSessionStoreItem;)V", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCSessionStore.kt */
public interface WCSessionStore {
    WCSessionStoreItem getSession();

    void setSession(WCSessionStoreItem wCSessionStoreItem);
}

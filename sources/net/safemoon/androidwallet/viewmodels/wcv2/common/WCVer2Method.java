package net.safemoon.androidwallet.viewmodels.wcv2.common;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wcv2/common/WCVer2Method;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ETH_SIGN", "ETH_PERSONAL_SIGN", "ETH_SIGN_TYPE_DATA", "ETH_SIGN_TYPE_DATA_V4", "ETH_SIGN_TRANSACTION", "ETH_SEND_TRANSACTION", "SOLANA_SIGN_TRANSACTION", "SOLANA_SIGN_MESSAGE", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WCCommon.kt */
public enum WCVer2Method {
    ETH_SIGN("eth_sign"),
    ETH_PERSONAL_SIGN("personal_sign"),
    ETH_SIGN_TYPE_DATA("eth_signTypedData"),
    ETH_SIGN_TYPE_DATA_V4("eth_signTypedData_v4"),
    ETH_SIGN_TRANSACTION("eth_signTransaction"),
    ETH_SEND_TRANSACTION("eth_sendTransaction"),
    SOLANA_SIGN_TRANSACTION("solana_signTransaction"),
    SOLANA_SIGN_MESSAGE("solana_signMessage");
    
    private final String value;

    /* access modifiers changed from: public */
    WCVer2Method(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}

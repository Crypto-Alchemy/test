package com.trustwallet.walletconnect.exceptions;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/exceptions/InvalidJsonRpcParamsException;", "Ljava/lang/Exception;", "requestId", "", "(J)V", "getRequestId", "()J", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: InvalidJsonRpcParamsException.kt */
public final class InvalidJsonRpcParamsException extends Exception {
    private final long requestId;

    public InvalidJsonRpcParamsException(long j) {
        super("Invalid JSON RPC Request");
        this.requestId = j;
    }

    public final long getRequestId() {
        return this.requestId;
    }
}

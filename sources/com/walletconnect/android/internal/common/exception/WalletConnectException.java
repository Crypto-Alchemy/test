package com.walletconnect.android.internal.common.exception;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/exception/WalletConnectException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: WalletConnectException.kt */
public abstract class WalletConnectException extends Exception {
    public final String message;

    public WalletConnectException(String str) {
        super(str);
        this.message = str;
    }

    public String getMessage() {
        return this.message;
    }
}

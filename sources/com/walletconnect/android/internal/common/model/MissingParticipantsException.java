package com.walletconnect.android.internal.common.model;

import com.walletconnect.android.internal.common.exception.WalletConnectException;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/MissingParticipantsException;", "Lcom/walletconnect/android/internal/common/exception/WalletConnectException;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CryptoException.kt */
public final class MissingParticipantsException extends WalletConnectException {
    public final String message;

    public MissingParticipantsException(String str) {
        super(str);
        this.message = str;
    }

    public String getMessage() {
        return this.message;
    }
}

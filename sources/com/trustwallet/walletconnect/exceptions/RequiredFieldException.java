package com.trustwallet.walletconnect.exceptions;

import com.google.gson.JsonParseException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/exceptions/RequiredFieldException;", "Lcom/google/gson/JsonParseException;", "field", "", "(Ljava/lang/String;)V", "getField", "()Ljava/lang/String;", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RequiredFieldException.kt */
public final class RequiredFieldException extends JsonParseException {
    private final String field;

    public RequiredFieldException() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RequiredFieldException(String str) {
        super('\'' + str + "' is required");
        vx2.m53591g(str, "field");
        this.field = str;
    }

    public final String getField() {
        return this.field;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RequiredFieldException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}

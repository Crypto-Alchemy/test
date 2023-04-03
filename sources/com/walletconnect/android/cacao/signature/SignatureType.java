package com.walletconnect.android.cacao.signature;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo44877d2 = {"Lcom/walletconnect/android/cacao/signature/SignatureType;", "", "", "", "header", "Ljava/lang/String;", "getHeader", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "EIP191", "EIP1271", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SignatureType.kt */
public enum SignatureType {
    EIP191("eip191"),
    EIP1271("eip1271");
    
    public final String header;

    /* access modifiers changed from: public */
    SignatureType(String str) {
        this.header = str;
    }

    public String getHeader() {
        return this.header;
    }
}

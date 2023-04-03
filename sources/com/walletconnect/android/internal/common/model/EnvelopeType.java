package com.walletconnect.android.internal.common.model;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/EnvelopeType;", "", "id", "", "(Ljava/lang/String;IB)V", "getId", "()B", "ZERO", "ONE", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: EnvelopeType.kt */
public enum EnvelopeType {
    ZERO((byte) 0),
    ONE((byte) 1);
    

    /* renamed from: id */
    public final byte f27128id;

    /* access modifiers changed from: public */
    EnvelopeType(byte b) {
        this.f27128id = b;
    }

    public final byte getId() {
        return this.f27128id;
    }
}

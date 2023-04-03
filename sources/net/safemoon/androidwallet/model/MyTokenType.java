package net.safemoon.androidwallet.model;

import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/MyTokenType;", "", "tokenType", "Lnet/safemoon/androidwallet/common/TokenType;", "isSelect", "", "(Lnet/safemoon/androidwallet/common/TokenType;Z)V", "()Z", "setSelect", "(Z)V", "getTokenType", "()Lnet/safemoon/androidwallet/common/TokenType;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: MyTokenType.kt */
public final class MyTokenType {
    private boolean isSelect;
    private final TokenType tokenType;

    public MyTokenType(TokenType tokenType2, boolean z) {
        vx2.m53591g(tokenType2, "tokenType");
        this.tokenType = tokenType2;
        this.isSelect = z;
    }

    public static /* synthetic */ MyTokenType copy$default(MyTokenType myTokenType, TokenType tokenType2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            tokenType2 = myTokenType.tokenType;
        }
        if ((i & 2) != 0) {
            z = myTokenType.isSelect;
        }
        return myTokenType.copy(tokenType2, z);
    }

    public final TokenType component1() {
        return this.tokenType;
    }

    public final boolean component2() {
        return this.isSelect;
    }

    public final MyTokenType copy(TokenType tokenType2, boolean z) {
        vx2.m53591g(tokenType2, "tokenType");
        return new MyTokenType(tokenType2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyTokenType)) {
            return false;
        }
        MyTokenType myTokenType = (MyTokenType) obj;
        return this.tokenType == myTokenType.tokenType && this.isSelect == myTokenType.isSelect;
    }

    public final TokenType getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        int hashCode = this.tokenType.hashCode() * 31;
        boolean z = this.isSelect;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    public String toString() {
        TokenType tokenType2 = this.tokenType;
        boolean z = this.isSelect;
        return "MyTokenType(tokenType=" + tokenType2 + ", isSelect=" + z + ")";
    }
}

package com.walletconnect.foundation.crypto.data.repository.model;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0005\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lcom/walletconnect/foundation/crypto/data/repository/model/IrnJWTHeader;", "", "", "algorithm", "type", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@h43(generateAdapter = true)
/* compiled from: IrnJWTHeader.kt */
public final class IrnJWTHeader {

    /* renamed from: a */
    public final String f27350a;

    /* renamed from: b */
    public final String f27351b;

    public IrnJWTHeader(@y33(name = "alg") String str, @y33(name = "typ") String str2) {
        vx2.m53591g(str, "algorithm");
        vx2.m53591g(str2, "type");
        this.f27350a = str;
        this.f27351b = str2;
    }

    /* renamed from: a */
    public final String mo40705a() {
        return this.f27350a;
    }

    /* renamed from: b */
    public final String mo40706b() {
        return this.f27351b;
    }

    public final IrnJWTHeader copy(@y33(name = "alg") String str, @y33(name = "typ") String str2) {
        vx2.m53591g(str, "algorithm");
        vx2.m53591g(str2, "type");
        return new IrnJWTHeader(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IrnJWTHeader)) {
            return false;
        }
        IrnJWTHeader irnJWTHeader = (IrnJWTHeader) obj;
        return vx2.m53586b(this.f27350a, irnJWTHeader.f27350a) && vx2.m53586b(this.f27351b, irnJWTHeader.f27351b);
    }

    public int hashCode() {
        return (this.f27350a.hashCode() * 31) + this.f27351b.hashCode();
    }

    public String toString() {
        String str = this.f27350a;
        String str2 = this.f27351b;
        return "IrnJWTHeader(algorithm=" + str + ", type=" + str2 + ")";
    }
}

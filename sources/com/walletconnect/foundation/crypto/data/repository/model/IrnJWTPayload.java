package com.walletconnect.foundation.crypto.data.repository.model;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u001b"}, mo44877d2 = {"Lcom/walletconnect/foundation/crypto/data/repository/model/IrnJWTPayload;", "", "", "issuer", "subject", "audience", "", "issuedAt", "expiration", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "e", "c", "J", "()J", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@h43(generateAdapter = true)
/* compiled from: IrnJWTPayload.kt */
public final class IrnJWTPayload {

    /* renamed from: a */
    public final String f27354a;

    /* renamed from: b */
    public final String f27355b;

    /* renamed from: c */
    public final String f27356c;

    /* renamed from: d */
    public final long f27357d;

    /* renamed from: e */
    public final long f27358e;

    public IrnJWTPayload(@y33(name = "iss") String str, @y33(name = "sub") String str2, @y33(name = "aud") String str3, @y33(name = "iat") long j, @y33(name = "exp") long j2) {
        vx2.m53591g(str, "issuer");
        vx2.m53591g(str2, "subject");
        vx2.m53591g(str3, "audience");
        this.f27354a = str;
        this.f27355b = str2;
        this.f27356c = str3;
        this.f27357d = j;
        this.f27358e = j2;
    }

    /* renamed from: a */
    public final String mo40714a() {
        return this.f27356c;
    }

    /* renamed from: b */
    public final long mo40715b() {
        return this.f27358e;
    }

    /* renamed from: c */
    public final long mo40716c() {
        return this.f27357d;
    }

    public final IrnJWTPayload copy(@y33(name = "iss") String str, @y33(name = "sub") String str2, @y33(name = "aud") String str3, @y33(name = "iat") long j, @y33(name = "exp") long j2) {
        vx2.m53591g(str, "issuer");
        vx2.m53591g(str2, "subject");
        vx2.m53591g(str3, "audience");
        return new IrnJWTPayload(str, str2, str3, j, j2);
    }

    /* renamed from: d */
    public final String mo40718d() {
        return this.f27354a;
    }

    /* renamed from: e */
    public final String mo40719e() {
        return this.f27355b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IrnJWTPayload)) {
            return false;
        }
        IrnJWTPayload irnJWTPayload = (IrnJWTPayload) obj;
        return vx2.m53586b(this.f27354a, irnJWTPayload.f27354a) && vx2.m53586b(this.f27355b, irnJWTPayload.f27355b) && vx2.m53586b(this.f27356c, irnJWTPayload.f27356c) && this.f27357d == irnJWTPayload.f27357d && this.f27358e == irnJWTPayload.f27358e;
    }

    public int hashCode() {
        return (((((((this.f27354a.hashCode() * 31) + this.f27355b.hashCode()) * 31) + this.f27356c.hashCode()) * 31) + au0.m10781a(this.f27357d)) * 31) + au0.m10781a(this.f27358e);
    }

    public String toString() {
        String str = this.f27354a;
        String str2 = this.f27355b;
        String str3 = this.f27356c;
        long j = this.f27357d;
        long j2 = this.f27358e;
        return "IrnJWTPayload(issuer=" + str + ", subject=" + str2 + ", audience=" + str3 + ", issuedAt=" + j + ", expiration=" + j2 + ")";
    }
}

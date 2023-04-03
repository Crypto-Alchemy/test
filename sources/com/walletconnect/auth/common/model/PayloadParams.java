package com.walletconnect.auth.common.model;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e¢\u0006\u0004\b'\u0010(J\u0001\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b#\u0010&¨\u0006)"}, mo44877d2 = {"Lcom/walletconnect/auth/common/model/PayloadParams;", "", "", "type", "chainId", "domain", "aud", "version", "nonce", "iat", "nbf", "exp", "statement", "requestId", "", "resources", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "b", "c", "d", "e", "l", "f", "g", "h", "i", "j", "Ljava/util/List;", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@h43(generateAdapter = true)
/* compiled from: PayloadParams.kt */
public final class PayloadParams {

    /* renamed from: a */
    public final String f27303a;

    /* renamed from: b */
    public final String f27304b;

    /* renamed from: c */
    public final String f27305c;

    /* renamed from: d */
    public final String f27306d;

    /* renamed from: e */
    public final String f27307e;

    /* renamed from: f */
    public final String f27308f;

    /* renamed from: g */
    public final String f27309g;

    /* renamed from: h */
    public final String f27310h;

    /* renamed from: i */
    public final String f27311i;

    /* renamed from: j */
    public final String f27312j;

    /* renamed from: k */
    public final String f27313k;

    /* renamed from: l */
    public final List<String> f27314l;

    public PayloadParams(@y33(name = "type") String str, @y33(name = "chainId") String str2, @y33(name = "domain") String str3, @y33(name = "aud") String str4, @y33(name = "version") String str5, @y33(name = "nonce") String str6, @y33(name = "iat") String str7, @y33(name = "nbf") String str8, @y33(name = "exp") String str9, @y33(name = "statement") String str10, @y33(name = "requestId") String str11, @y33(name = "resources") List<String> list) {
        vx2.m53591g(str, "type");
        vx2.m53591g(str2, "chainId");
        vx2.m53591g(str3, "domain");
        vx2.m53591g(str4, "aud");
        vx2.m53591g(str5, "version");
        vx2.m53591g(str6, "nonce");
        vx2.m53591g(str7, "iat");
        this.f27303a = str;
        this.f27304b = str2;
        this.f27305c = str3;
        this.f27306d = str4;
        this.f27307e = str5;
        this.f27308f = str6;
        this.f27309g = str7;
        this.f27310h = str8;
        this.f27311i = str9;
        this.f27312j = str10;
        this.f27313k = str11;
        this.f27314l = list;
    }

    /* renamed from: a */
    public final String mo40637a() {
        return this.f27306d;
    }

    /* renamed from: b */
    public final String mo40638b() {
        return this.f27304b;
    }

    /* renamed from: c */
    public final String mo40639c() {
        return this.f27305c;
    }

    public final PayloadParams copy(@y33(name = "type") String str, @y33(name = "chainId") String str2, @y33(name = "domain") String str3, @y33(name = "aud") String str4, @y33(name = "version") String str5, @y33(name = "nonce") String str6, @y33(name = "iat") String str7, @y33(name = "nbf") String str8, @y33(name = "exp") String str9, @y33(name = "statement") String str10, @y33(name = "requestId") String str11, @y33(name = "resources") List<String> list) {
        vx2.m53591g(str, "type");
        String str12 = str2;
        vx2.m53591g(str12, "chainId");
        String str13 = str3;
        vx2.m53591g(str13, "domain");
        String str14 = str4;
        vx2.m53591g(str14, "aud");
        String str15 = str5;
        vx2.m53591g(str15, "version");
        String str16 = str6;
        vx2.m53591g(str16, "nonce");
        String str17 = str7;
        vx2.m53591g(str17, "iat");
        return new PayloadParams(str, str12, str13, str14, str15, str16, str17, str8, str9, str10, str11, list);
    }

    /* renamed from: d */
    public final String mo40641d() {
        return this.f27311i;
    }

    /* renamed from: e */
    public final String mo40642e() {
        return this.f27309g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayloadParams)) {
            return false;
        }
        PayloadParams payloadParams = (PayloadParams) obj;
        return vx2.m53586b(this.f27303a, payloadParams.f27303a) && vx2.m53586b(this.f27304b, payloadParams.f27304b) && vx2.m53586b(this.f27305c, payloadParams.f27305c) && vx2.m53586b(this.f27306d, payloadParams.f27306d) && vx2.m53586b(this.f27307e, payloadParams.f27307e) && vx2.m53586b(this.f27308f, payloadParams.f27308f) && vx2.m53586b(this.f27309g, payloadParams.f27309g) && vx2.m53586b(this.f27310h, payloadParams.f27310h) && vx2.m53586b(this.f27311i, payloadParams.f27311i) && vx2.m53586b(this.f27312j, payloadParams.f27312j) && vx2.m53586b(this.f27313k, payloadParams.f27313k) && vx2.m53586b(this.f27314l, payloadParams.f27314l);
    }

    /* renamed from: f */
    public final String mo40644f() {
        return this.f27310h;
    }

    /* renamed from: g */
    public final String mo40645g() {
        return this.f27308f;
    }

    /* renamed from: h */
    public final String mo40646h() {
        return this.f27313k;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f27303a.hashCode() * 31) + this.f27304b.hashCode()) * 31) + this.f27305c.hashCode()) * 31) + this.f27306d.hashCode()) * 31) + this.f27307e.hashCode()) * 31) + this.f27308f.hashCode()) * 31) + this.f27309g.hashCode()) * 31;
        String str = this.f27310h;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27311i;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27312j;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f27313k;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.f27314l;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: i */
    public final List<String> mo40648i() {
        return this.f27314l;
    }

    /* renamed from: j */
    public final String mo40649j() {
        return this.f27312j;
    }

    /* renamed from: k */
    public final String mo40650k() {
        return this.f27303a;
    }

    /* renamed from: l */
    public final String mo40651l() {
        return this.f27307e;
    }

    public String toString() {
        String str = this.f27303a;
        String str2 = this.f27304b;
        String str3 = this.f27305c;
        String str4 = this.f27306d;
        String str5 = this.f27307e;
        String str6 = this.f27308f;
        String str7 = this.f27309g;
        String str8 = this.f27310h;
        String str9 = this.f27311i;
        String str10 = this.f27312j;
        String str11 = this.f27313k;
        List<String> list = this.f27314l;
        return "PayloadParams(type=" + str + ", chainId=" + str2 + ", domain=" + str3 + ", aud=" + str4 + ", version=" + str5 + ", nonce=" + str6 + ", iat=" + str7 + ", nbf=" + str8 + ", exp=" + str9 + ", statement=" + str10 + ", requestId=" + str11 + ", resources=" + list + ")";
    }
}

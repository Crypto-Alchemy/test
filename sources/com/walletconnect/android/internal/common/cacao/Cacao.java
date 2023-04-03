package com.walletconnect.android.internal.common.cacao;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001e"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/cacao/Cacao;", "", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Header;", "header", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Payload;", "payload", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Signature;", "signature", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Header;", "()Lcom/walletconnect/android/internal/common/cacao/Cacao$Header;", "b", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Payload;", "()Lcom/walletconnect/android/internal/common/cacao/Cacao$Payload;", "c", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Signature;", "()Lcom/walletconnect/android/internal/common/cacao/Cacao$Signature;", "<init>", "(Lcom/walletconnect/android/internal/common/cacao/Cacao$Header;Lcom/walletconnect/android/internal/common/cacao/Cacao$Payload;Lcom/walletconnect/android/internal/common/cacao/Cacao$Signature;)V", "Header", "Payload", "Signature", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@h43(generateAdapter = true)
/* compiled from: Cacao.kt */
public final class Cacao {

    /* renamed from: a */
    public final Header f27068a;

    /* renamed from: b */
    public final Payload f27069b;

    /* renamed from: c */
    public final Signature f27070c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0010"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/cacao/Cacao$Header;", "", "", "t", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: Cacao.kt */
    public static final class Header {

        /* renamed from: a */
        public final String f27071a;

        public Header(@y33(name = "t") String str) {
            vx2.m53591g(str, "t");
            this.f27071a = str;
        }

        /* renamed from: a */
        public final String mo40190a() {
            return this.f27071a;
        }

        public final Header copy(@y33(name = "t") String str) {
            vx2.m53591g(str, "t");
            return new Header(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Header) && vx2.m53586b(this.f27071a, ((Header) obj).f27071a);
        }

        public int hashCode() {
            return this.f27071a.hashCode();
        }

        public String toString() {
            String str = this.f27071a;
            return "Header(t=" + str + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r¢\u0006\u0004\b%\u0010&J\u0001\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b \u0010\u0019R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b!\u0010$¨\u0006'"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/cacao/Cacao$Payload;", "", "", "iss", "domain", "aud", "version", "nonce", "iat", "nbf", "exp", "statement", "requestId", "", "resources", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "c", "d", "k", "g", "f", "h", "i", "j", "Ljava/util/List;", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: Cacao.kt */
    public static final class Payload {

        /* renamed from: a */
        public final String f27072a;

        /* renamed from: b */
        public final String f27073b;

        /* renamed from: c */
        public final String f27074c;

        /* renamed from: d */
        public final String f27075d;

        /* renamed from: e */
        public final String f27076e;

        /* renamed from: f */
        public final String f27077f;

        /* renamed from: g */
        public final String f27078g;

        /* renamed from: h */
        public final String f27079h;

        /* renamed from: i */
        public final String f27080i;

        /* renamed from: j */
        public final String f27081j;

        /* renamed from: k */
        public final List<String> f27082k;

        public Payload(@y33(name = "iss") String str, @y33(name = "domain") String str2, @y33(name = "aud") String str3, @y33(name = "version") String str4, @y33(name = "nonce") String str5, @y33(name = "iat") String str6, @y33(name = "nbf") String str7, @y33(name = "exp") String str8, @y33(name = "statement") String str9, @y33(name = "requestId") String str10, @y33(name = "resources") List<String> list) {
            vx2.m53591g(str, "iss");
            vx2.m53591g(str2, "domain");
            vx2.m53591g(str3, "aud");
            vx2.m53591g(str4, "version");
            vx2.m53591g(str5, "nonce");
            vx2.m53591g(str6, "iat");
            this.f27072a = str;
            this.f27073b = str2;
            this.f27074c = str3;
            this.f27075d = str4;
            this.f27076e = str5;
            this.f27077f = str6;
            this.f27078g = str7;
            this.f27079h = str8;
            this.f27080i = str9;
            this.f27081j = str10;
            this.f27082k = list;
        }

        /* renamed from: a */
        public final String mo40195a() {
            return this.f27074c;
        }

        /* renamed from: b */
        public final String mo40196b() {
            return this.f27073b;
        }

        /* renamed from: c */
        public final String mo40197c() {
            return this.f27079h;
        }

        public final Payload copy(@y33(name = "iss") String str, @y33(name = "domain") String str2, @y33(name = "aud") String str3, @y33(name = "version") String str4, @y33(name = "nonce") String str5, @y33(name = "iat") String str6, @y33(name = "nbf") String str7, @y33(name = "exp") String str8, @y33(name = "statement") String str9, @y33(name = "requestId") String str10, @y33(name = "resources") List<String> list) {
            vx2.m53591g(str, "iss");
            vx2.m53591g(str2, "domain");
            String str11 = str3;
            vx2.m53591g(str11, "aud");
            String str12 = str4;
            vx2.m53591g(str12, "version");
            String str13 = str5;
            vx2.m53591g(str13, "nonce");
            String str14 = str6;
            vx2.m53591g(str14, "iat");
            return new Payload(str, str2, str11, str12, str13, str14, str7, str8, str9, str10, list);
        }

        /* renamed from: d */
        public final String mo40199d() {
            return this.f27077f;
        }

        /* renamed from: e */
        public final String mo40200e() {
            return this.f27072a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return vx2.m53586b(this.f27072a, payload.f27072a) && vx2.m53586b(this.f27073b, payload.f27073b) && vx2.m53586b(this.f27074c, payload.f27074c) && vx2.m53586b(this.f27075d, payload.f27075d) && vx2.m53586b(this.f27076e, payload.f27076e) && vx2.m53586b(this.f27077f, payload.f27077f) && vx2.m53586b(this.f27078g, payload.f27078g) && vx2.m53586b(this.f27079h, payload.f27079h) && vx2.m53586b(this.f27080i, payload.f27080i) && vx2.m53586b(this.f27081j, payload.f27081j) && vx2.m53586b(this.f27082k, payload.f27082k);
        }

        /* renamed from: f */
        public final String mo40202f() {
            return this.f27078g;
        }

        /* renamed from: g */
        public final String mo40203g() {
            return this.f27076e;
        }

        /* renamed from: h */
        public final String mo40204h() {
            return this.f27081j;
        }

        public int hashCode() {
            int hashCode = ((((((((((this.f27072a.hashCode() * 31) + this.f27073b.hashCode()) * 31) + this.f27074c.hashCode()) * 31) + this.f27075d.hashCode()) * 31) + this.f27076e.hashCode()) * 31) + this.f27077f.hashCode()) * 31;
            String str = this.f27078g;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f27079h;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f27080i;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f27081j;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<String> list = this.f27082k;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode5 + i;
        }

        /* renamed from: i */
        public final List<String> mo40206i() {
            return this.f27082k;
        }

        /* renamed from: j */
        public final String mo40207j() {
            return this.f27080i;
        }

        /* renamed from: k */
        public final String mo40208k() {
            return this.f27075d;
        }

        public String toString() {
            String str = this.f27072a;
            String str2 = this.f27073b;
            String str3 = this.f27074c;
            String str4 = this.f27075d;
            String str5 = this.f27076e;
            String str6 = this.f27077f;
            String str7 = this.f27078g;
            String str8 = this.f27079h;
            String str9 = this.f27080i;
            String str10 = this.f27081j;
            List<String> list = this.f27082k;
            return "Payload(iss=" + str + ", domain=" + str2 + ", aud=" + str3 + ", version=" + str4 + ", nonce=" + str5 + ", iat=" + str6 + ", nbf=" + str7 + ", exp=" + str8 + ", statement=" + str9 + ", requestId=" + str10 + ", resources=" + list + ")";
        }
    }

    public Cacao(@y33(name = "h") Header header, @y33(name = "p") Payload payload, @y33(name = "s") Signature signature) {
        vx2.m53591g(header, "header");
        vx2.m53591g(payload, "payload");
        vx2.m53591g(signature, "signature");
        this.f27068a = header;
        this.f27069b = payload;
        this.f27070c = signature;
    }

    /* renamed from: a */
    public final Header mo40183a() {
        return this.f27068a;
    }

    /* renamed from: b */
    public final Payload mo40184b() {
        return this.f27069b;
    }

    /* renamed from: c */
    public final Signature mo40185c() {
        return this.f27070c;
    }

    public final Cacao copy(@y33(name = "h") Header header, @y33(name = "p") Payload payload, @y33(name = "s") Signature signature) {
        vx2.m53591g(header, "header");
        vx2.m53591g(payload, "payload");
        vx2.m53591g(signature, "signature");
        return new Cacao(header, payload, signature);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cacao)) {
            return false;
        }
        Cacao cacao = (Cacao) obj;
        return vx2.m53586b(this.f27068a, cacao.f27068a) && vx2.m53586b(this.f27069b, cacao.f27069b) && vx2.m53586b(this.f27070c, cacao.f27070c);
    }

    public int hashCode() {
        return (((this.f27068a.hashCode() * 31) + this.f27069b.hashCode()) * 31) + this.f27070c.hashCode();
    }

    public String toString() {
        Header header = this.f27068a;
        Payload payload = this.f27069b;
        Signature signature = this.f27070c;
        return "Cacao(header=" + header + ", payload=" + payload + ", signature=" + signature + ")";
    }

    @Keep
    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J)\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/cacao/Cacao$Signature;", "", "", "component1", "component2", "component3", "t", "s", "m", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getT", "()Ljava/lang/String;", "getS", "getM", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: Cacao.kt */
    public static final class Signature {

        /* renamed from: m */
        private final String f27083m;

        /* renamed from: s */
        private final String f27084s;

        /* renamed from: t */
        private final String f27085t;

        public Signature(@y33(name = "t") String str, @y33(name = "s") String str2, @y33(name = "m") String str3) {
            vx2.m53591g(str, "t");
            vx2.m53591g(str2, "s");
            this.f27085t = str;
            this.f27084s = str2;
            this.f27083m = str3;
        }

        public static /* synthetic */ Signature copy$default(Signature signature, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signature.getT();
            }
            if ((i & 2) != 0) {
                str2 = signature.getS();
            }
            if ((i & 4) != 0) {
                str3 = signature.getM();
            }
            return signature.copy(str, str2, str3);
        }

        public final String component1() {
            return getT();
        }

        public final String component2() {
            return getS();
        }

        public final String component3() {
            return getM();
        }

        public final Signature copy(@y33(name = "t") String str, @y33(name = "s") String str2, @y33(name = "m") String str3) {
            vx2.m53591g(str, "t");
            vx2.m53591g(str2, "s");
            return new Signature(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Signature)) {
                return false;
            }
            Signature signature = (Signature) obj;
            return vx2.m53586b(getT(), signature.getT()) && vx2.m53586b(getS(), signature.getS()) && vx2.m53586b(getM(), signature.getM());
        }

        public String getM() {
            return this.f27083m;
        }

        public String getS() {
            return this.f27084s;
        }

        public String getT() {
            return this.f27085t;
        }

        public int hashCode() {
            return (((getT().hashCode() * 31) + getS().hashCode()) * 31) + (getM() == null ? 0 : getM().hashCode());
        }

        public String toString() {
            String t = getT();
            String s = getS();
            String m = getM();
            return "Signature(t=" + t + ", s=" + s + ", m=" + m + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Signature(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }
    }
}

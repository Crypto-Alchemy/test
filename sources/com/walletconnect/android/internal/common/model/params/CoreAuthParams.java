package com.walletconnect.android.internal.common.model.params;

import com.walletconnect.android.internal.common.cacao.Cacao;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/CoreAuthParams;", "Lrg0;", "<init>", "()V", "ResponseParams", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CoreAuthParams.kt */
public class CoreAuthParams implements rg0 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/CoreAuthParams$ResponseParams;", "Lcom/walletconnect/android/internal/common/model/params/CoreAuthParams;", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Header;", "a", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Payload;", "b", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Signature;", "c", "header", "payload", "signature", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Header;", "d", "()Lcom/walletconnect/android/internal/common/cacao/Cacao$Header;", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Payload;", "e", "()Lcom/walletconnect/android/internal/common/cacao/Cacao$Payload;", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Signature;", "f", "()Lcom/walletconnect/android/internal/common/cacao/Cacao$Signature;", "<init>", "(Lcom/walletconnect/android/internal/common/cacao/Cacao$Header;Lcom/walletconnect/android/internal/common/cacao/Cacao$Payload;Lcom/walletconnect/android/internal/common/cacao/Cacao$Signature;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: CoreAuthParams.kt */
    public static final class ResponseParams extends CoreAuthParams {

        /* renamed from: a */
        public final Cacao.Header f27143a;

        /* renamed from: b */
        public final Cacao.Payload f27144b;

        /* renamed from: c */
        public final Cacao.Signature f27145c;

        public ResponseParams(@y33(name = "h") Cacao.Header header, @y33(name = "p") Cacao.Payload payload, @y33(name = "s") Cacao.Signature signature) {
            vx2.m53591g(header, "header");
            vx2.m53591g(payload, "payload");
            vx2.m53591g(signature, "signature");
            this.f27143a = header;
            this.f27144b = payload;
            this.f27145c = signature;
        }

        /* renamed from: a */
        public final Cacao.Header mo40345a() {
            return this.f27143a;
        }

        /* renamed from: b */
        public final Cacao.Payload mo40346b() {
            return this.f27144b;
        }

        /* renamed from: c */
        public final Cacao.Signature mo40347c() {
            return this.f27145c;
        }

        public final ResponseParams copy(@y33(name = "h") Cacao.Header header, @y33(name = "p") Cacao.Payload payload, @y33(name = "s") Cacao.Signature signature) {
            vx2.m53591g(header, "header");
            vx2.m53591g(payload, "payload");
            vx2.m53591g(signature, "signature");
            return new ResponseParams(header, payload, signature);
        }

        /* renamed from: d */
        public final Cacao.Header mo40349d() {
            return this.f27143a;
        }

        /* renamed from: e */
        public final Cacao.Payload mo40350e() {
            return this.f27144b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResponseParams)) {
                return false;
            }
            ResponseParams responseParams = (ResponseParams) obj;
            return vx2.m53586b(this.f27143a, responseParams.f27143a) && vx2.m53586b(this.f27144b, responseParams.f27144b) && vx2.m53586b(this.f27145c, responseParams.f27145c);
        }

        /* renamed from: f */
        public final Cacao.Signature mo40352f() {
            return this.f27145c;
        }

        public int hashCode() {
            return (((this.f27143a.hashCode() * 31) + this.f27144b.hashCode()) * 31) + this.f27145c.hashCode();
        }

        public String toString() {
            Cacao.Header header = this.f27143a;
            Cacao.Payload payload = this.f27144b;
            Cacao.Signature signature = this.f27145c;
            return "ResponseParams(header=" + header + ", payload=" + payload + ", signature=" + signature + ")";
        }
    }
}

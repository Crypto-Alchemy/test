package p000;

import com.walletconnect.android.internal.common.JsonRpcResponse;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\n\u0010\u001b¨\u0006\u001f"}, mo44877d2 = {"Lsf7;", "", "", "toString", "", "hashCode", "other", "", "equals", "Les6;", "a", "Les6;", "c", "()Les6;", "topic", "b", "Ljava/lang/String;", "getMethod", "()Ljava/lang/String;", "method", "Lcom/walletconnect/android/internal/common/JsonRpcResponse;", "Lcom/walletconnect/android/internal/common/JsonRpcResponse;", "()Lcom/walletconnect/android/internal/common/JsonRpcResponse;", "response", "Lrg0;", "d", "Lrg0;", "()Lrg0;", "params", "<init>", "(Les6;Ljava/lang/String;Lcom/walletconnect/android/internal/common/JsonRpcResponse;Lrg0;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: sf7 */
/* compiled from: WCResponse.kt */
public final class sf7 {

    /* renamed from: a */
    public final es6 f33866a;

    /* renamed from: b */
    public final String f33867b;

    /* renamed from: c */
    public final JsonRpcResponse f33868c;

    /* renamed from: d */
    public final rg0 f33869d;

    public sf7(es6 es6, String str, JsonRpcResponse jsonRpcResponse, rg0 rg0) {
        vx2.m53591g(es6, "topic");
        vx2.m53591g(str, "method");
        vx2.m53591g(jsonRpcResponse, "response");
        vx2.m53591g(rg0, "params");
        this.f33866a = es6;
        this.f33867b = str;
        this.f33868c = jsonRpcResponse;
        this.f33869d = rg0;
    }

    /* renamed from: a */
    public final rg0 mo47755a() {
        return this.f33869d;
    }

    /* renamed from: b */
    public final JsonRpcResponse mo47756b() {
        return this.f33868c;
    }

    /* renamed from: c */
    public final es6 mo47757c() {
        return this.f33866a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf7)) {
            return false;
        }
        sf7 sf7 = (sf7) obj;
        return vx2.m53586b(this.f33866a, sf7.f33866a) && vx2.m53586b(this.f33867b, sf7.f33867b) && vx2.m53586b(this.f33868c, sf7.f33868c) && vx2.m53586b(this.f33869d, sf7.f33869d);
    }

    public int hashCode() {
        return (((((this.f33866a.hashCode() * 31) + this.f33867b.hashCode()) * 31) + this.f33868c.hashCode()) * 31) + this.f33869d.hashCode();
    }

    public String toString() {
        es6 es6 = this.f33866a;
        String str = this.f33867b;
        JsonRpcResponse jsonRpcResponse = this.f33868c;
        rg0 rg0 = this.f33869d;
        return "WCResponse(topic=" + es6 + ", method=" + str + ", response=" + jsonRpcResponse + ", params=" + rg0 + ")";
    }
}

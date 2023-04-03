package net.safemoon.androidwallet.model.request;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepName;
import com.google.gson.Gson;
import kotlin.Metadata;

@KeepName
@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/request/RequestTransfer;", "", "from", "", "to", "amount", "privateKey", "requestTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getFrom", "getPrivateKey", "getRequestTime", "getTo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@Keep
/* compiled from: RequestTransfer.kt */
public final class RequestTransfer {
    private final String amount;
    private final String from;
    private final String privateKey;
    private final String requestTime;

    /* renamed from: to */
    private final String f42464to;

    public RequestTransfer(String str, String str2, String str3, String str4, String str5) {
        vx2.m53591g(str, "from");
        vx2.m53591g(str2, "to");
        vx2.m53591g(str3, "amount");
        vx2.m53591g(str4, "privateKey");
        vx2.m53591g(str5, "requestTime");
        this.from = str;
        this.f42464to = str2;
        this.amount = str3;
        this.privateKey = str4;
        this.requestTime = str5;
    }

    public static /* synthetic */ RequestTransfer copy$default(RequestTransfer requestTransfer, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestTransfer.from;
        }
        if ((i & 2) != 0) {
            str2 = requestTransfer.f42464to;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = requestTransfer.amount;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = requestTransfer.privateKey;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = requestTransfer.requestTime;
        }
        return requestTransfer.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.from;
    }

    public final String component2() {
        return this.f42464to;
    }

    public final String component3() {
        return this.amount;
    }

    public final String component4() {
        return this.privateKey;
    }

    public final String component5() {
        return this.requestTime;
    }

    public final RequestTransfer copy(String str, String str2, String str3, String str4, String str5) {
        vx2.m53591g(str, "from");
        vx2.m53591g(str2, "to");
        vx2.m53591g(str3, "amount");
        vx2.m53591g(str4, "privateKey");
        vx2.m53591g(str5, "requestTime");
        return new RequestTransfer(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestTransfer)) {
            return false;
        }
        RequestTransfer requestTransfer = (RequestTransfer) obj;
        return vx2.m53586b(this.from, requestTransfer.from) && vx2.m53586b(this.f42464to, requestTransfer.f42464to) && vx2.m53586b(this.amount, requestTransfer.amount) && vx2.m53586b(this.privateKey, requestTransfer.privateKey) && vx2.m53586b(this.requestTime, requestTransfer.requestTime);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getPrivateKey() {
        return this.privateKey;
    }

    public final String getRequestTime() {
        return this.requestTime;
    }

    public final String getTo() {
        return this.f42464to;
    }

    public int hashCode() {
        return (((((((this.from.hashCode() * 31) + this.f42464to.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.privateKey.hashCode()) * 31) + this.requestTime.hashCode();
    }

    public String toString() {
        String json = new Gson().toJson((Object) this);
        vx2.m53590f(json, "Gson().toJson(this)");
        return json;
    }
}

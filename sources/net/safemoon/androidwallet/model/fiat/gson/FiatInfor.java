package net.safemoon.androidwallet.model.fiat.gson;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/fiat/gson/FiatInfor;", "Ljava/io/Serializable;", "()V", "code", "", "getCode", "()Ljava/lang/String;", "success", "", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "symbols", "Lcom/google/gson/JsonObject;", "allFiatDetail", "", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: FiatInfor.kt */
public final class FiatInfor implements Serializable {
    @SerializedName("code")
    @Expose
    private final String code;
    @SerializedName("success")
    @Expose
    private final Boolean success;
    @SerializedName("symbols")
    @Expose
    private JsonObject symbols;

    public final List<Fiat> allFiatDetail() {
        ArrayList arrayList = new ArrayList();
        JsonObject jsonObject = this.symbols;
        if (jsonObject != null) {
            Set<String> keySet = jsonObject.keySet();
            vx2.m53590f(keySet, "symbol.keySet()");
            for (String str : keySet) {
                try {
                    String asString = jsonObject.get(str).getAsString();
                    vx2.m53590f(str, "it");
                    vx2.m53590f(asString, PublicResolver.FUNC_NAME);
                    arrayList.add(new Fiat(str, asString));
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    public final String getCode() {
        return this.code;
    }

    public final Boolean getSuccess() {
        return this.success;
    }
}

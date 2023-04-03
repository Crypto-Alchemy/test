package net.safemoon.androidwallet.model.fiat.gson;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0002X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/fiat/gson/FiatLatest;", "Ljava/io/Serializable;", "()V", "base", "", "getBase", "()Ljava/lang/String;", "date", "getDate", "rates", "Lcom/google/gson/JsonObject;", "success", "", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "timestamp", "", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "allFiatRates", "", "Lnet/safemoon/androidwallet/model/fiat/gson/Fiat;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: FiatLatest.kt */
public final class FiatLatest implements Serializable {
    @SerializedName("base")
    @Expose
    private final String base;
    @SerializedName("date")
    @Expose
    private final String date;
    @SerializedName("rates")
    @Expose
    private final JsonObject rates;
    @SerializedName("success")
    @Expose
    private final Boolean success;
    @SerializedName("timestamp")
    @Expose
    private final Long timestamp;

    public final List<Fiat> allFiatRates() {
        ArrayList arrayList = new ArrayList();
        JsonObject jsonObject = this.rates;
        if (jsonObject != null) {
            Set<String> keySet = jsonObject.keySet();
            vx2.m53590f(keySet, "symbol.keySet()");
            for (String str : keySet) {
                try {
                    double asDouble = jsonObject.get(str).getAsDouble();
                    vx2.m53590f(str, "it");
                    arrayList.add(new Fiat(str, asDouble));
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    public final String getBase() {
        return this.base;
    }

    public final String getDate() {
        return this.date;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }
}

package net.safemoon.androidwallet.model.cmcTokenInfo;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CmcTokenInfo implements Serializable {
    private static final long serialVersionUID = -2792939375468897389L;
    @SerializedName("data")
    @Expose
    private JsonObject data;
    @SerializedName("status")
    @Expose
    public Status status;

    public JsonObject getData() {
        return this.data;
    }

    public List<TokenDetail> getTokenDetails() {
        ArrayList arrayList = new ArrayList();
        for (String asJsonObject : getData().keySet()) {
            arrayList.add((TokenDetail) new Gson().fromJson((JsonElement) getData().getAsJsonObject(asJsonObject), TokenDetail.class));
        }
        return arrayList;
    }
}

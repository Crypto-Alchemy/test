package net.safemoon.androidwallet.model.collectible;

import com.google.gson.Gson;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R$\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/collectible/Assets;", "", "()V", "assets", "", "Lnet/safemoon/androidwallet/model/collectible/Asset;", "getAssets", "()Ljava/util/List;", "setAssets", "(Ljava/util/List;)V", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Assets.kt */
public final class Assets {
    private List<Asset> assets;

    public final List<Asset> getAssets() {
        return this.assets;
    }

    public final void setAssets(List<Asset> list) {
        this.assets = list;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this);
        vx2.m53590f(json, "Gson().toJson(this)");
        return json;
    }
}

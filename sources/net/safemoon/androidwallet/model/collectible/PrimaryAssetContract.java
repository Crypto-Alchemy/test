package net.safemoon.androidwallet.model.collectible;

import com.google.gson.Gson;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001c"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/collectible/PrimaryAssetContract;", "", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "description", "getDescription", "setDescription", "image_url", "getImage_url", "setImage_url", "injectSlug", "getInjectSlug", "setInjectSlug", "name", "getName", "setName", "schema_name", "getSchema_name", "setSchema_name", "symbol", "getSymbol", "setSymbol", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: PrimaryAssetContract.kt */
public final class PrimaryAssetContract {
    private String address;
    private String description;
    private String image_url;
    private String injectSlug;
    private String name;
    private String schema_name;
    private String symbol;

    public final String getAddress() {
        return this.address;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getInjectSlug() {
        return this.injectSlug;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSchema_name() {
        return this.schema_name;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setImage_url(String str) {
        this.image_url = str;
    }

    public final void setInjectSlug(String str) {
        this.injectSlug = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSchema_name(String str) {
        this.schema_name = str;
    }

    public final void setSymbol(String str) {
        this.symbol = str;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this);
        vx2.m53590f(json, "Gson().toJson(this)");
        return json;
    }
}

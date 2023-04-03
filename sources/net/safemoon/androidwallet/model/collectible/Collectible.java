package net.safemoon.androidwallet.model.collectible;

import com.google.gson.Gson;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010+\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\b¨\u0006,"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/collectible/Collectible;", "", "()V", "banner_image_url", "", "getBanner_image_url", "()Ljava/lang/String;", "setBanner_image_url", "(Ljava/lang/String;)V", "created_date", "getCreated_date", "setCreated_date", "description", "getDescription", "setDescription", "dev_buyer_fee_basis_points", "getDev_buyer_fee_basis_points", "setDev_buyer_fee_basis_points", "dev_seller_fee_basis_points", "getDev_seller_fee_basis_points", "setDev_seller_fee_basis_points", "external_url", "getExternal_url", "setExternal_url", "image_url", "getImage_url", "setImage_url", "name", "getName", "setName", "payout_address", "getPayout_address", "setPayout_address", "primary_asset_contracts", "", "Lnet/safemoon/androidwallet/model/collectible/PrimaryAssetContract;", "getPrimary_asset_contracts", "()Ljava/util/List;", "setPrimary_asset_contracts", "(Ljava/util/List;)V", "slug", "getSlug", "setSlug", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Collectible.kt */
public final class Collectible {
    private String banner_image_url;
    private String created_date;
    private String description;
    private String dev_buyer_fee_basis_points;
    private String dev_seller_fee_basis_points;
    private String external_url;
    private String image_url;
    private String name;
    private String payout_address;
    private List<PrimaryAssetContract> primary_asset_contracts;
    private String slug;

    public final String getBanner_image_url() {
        return this.banner_image_url;
    }

    public final String getCreated_date() {
        return this.created_date;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDev_buyer_fee_basis_points() {
        return this.dev_buyer_fee_basis_points;
    }

    public final String getDev_seller_fee_basis_points() {
        return this.dev_seller_fee_basis_points;
    }

    public final String getExternal_url() {
        return this.external_url;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPayout_address() {
        return this.payout_address;
    }

    public final List<PrimaryAssetContract> getPrimary_asset_contracts() {
        return this.primary_asset_contracts;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final void setBanner_image_url(String str) {
        this.banner_image_url = str;
    }

    public final void setCreated_date(String str) {
        this.created_date = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDev_buyer_fee_basis_points(String str) {
        this.dev_buyer_fee_basis_points = str;
    }

    public final void setDev_seller_fee_basis_points(String str) {
        this.dev_seller_fee_basis_points = str;
    }

    public final void setExternal_url(String str) {
        this.external_url = str;
    }

    public final void setImage_url(String str) {
        this.image_url = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPayout_address(String str) {
        this.payout_address = str;
    }

    public final void setPrimary_asset_contracts(List<PrimaryAssetContract> list) {
        this.primary_asset_contracts = list;
    }

    public final void setSlug(String str) {
        this.slug = str;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this);
        vx2.m53590f(json, "Gson().toJson(this)");
        return json;
    }
}

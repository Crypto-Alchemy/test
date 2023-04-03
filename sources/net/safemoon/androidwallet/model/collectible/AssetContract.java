package net.safemoon.androidwallet.model.collectible;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b$\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001c\u0010%\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\u001c\u0010(\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001c\u0010+\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR\u001c\u0010.\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\b¨\u00061"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/collectible/AssetContract;", "Ljava/io/Serializable;", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "asset_contract_type", "getAsset_contract_type", "setAsset_contract_type", "dev_buyer_fee_basis_points", "", "getDev_buyer_fee_basis_points", "()Ljava/lang/Integer;", "setDev_buyer_fee_basis_points", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "dev_seller_fee_basis_points", "getDev_seller_fee_basis_points", "setDev_seller_fee_basis_points", "name", "getName", "setName", "nft_version", "getNft_version", "setNft_version", "opensea_buyer_fee_basis_points", "getOpensea_buyer_fee_basis_points", "setOpensea_buyer_fee_basis_points", "opensea_version", "getOpensea_version", "setOpensea_version", "owner", "getOwner", "setOwner", "payout_address", "getPayout_address", "setPayout_address", "schema_name", "getSchema_name", "setSchema_name", "symbol", "getSymbol", "setSymbol", "total_supply", "getTotal_supply", "setTotal_supply", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: AssetContract.kt */
public final class AssetContract implements Serializable {
    private String address;
    private String asset_contract_type;
    private Integer dev_buyer_fee_basis_points;
    private Integer dev_seller_fee_basis_points;
    private String name;
    private String nft_version;
    private Integer opensea_buyer_fee_basis_points;
    private String opensea_version;
    private String owner;
    private String payout_address;
    private String schema_name;
    private String symbol;
    private String total_supply;

    public final String getAddress() {
        return this.address;
    }

    public final String getAsset_contract_type() {
        return this.asset_contract_type;
    }

    public final Integer getDev_buyer_fee_basis_points() {
        return this.dev_buyer_fee_basis_points;
    }

    public final Integer getDev_seller_fee_basis_points() {
        return this.dev_seller_fee_basis_points;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNft_version() {
        return this.nft_version;
    }

    public final Integer getOpensea_buyer_fee_basis_points() {
        return this.opensea_buyer_fee_basis_points;
    }

    public final String getOpensea_version() {
        return this.opensea_version;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final String getPayout_address() {
        return this.payout_address;
    }

    public final String getSchema_name() {
        return this.schema_name;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getTotal_supply() {
        return this.total_supply;
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    public final void setAsset_contract_type(String str) {
        this.asset_contract_type = str;
    }

    public final void setDev_buyer_fee_basis_points(Integer num) {
        this.dev_buyer_fee_basis_points = num;
    }

    public final void setDev_seller_fee_basis_points(Integer num) {
        this.dev_seller_fee_basis_points = num;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNft_version(String str) {
        this.nft_version = str;
    }

    public final void setOpensea_buyer_fee_basis_points(Integer num) {
        this.opensea_buyer_fee_basis_points = num;
    }

    public final void setOpensea_version(String str) {
        this.opensea_version = str;
    }

    public final void setOwner(String str) {
        this.owner = str;
    }

    public final void setPayout_address(String str) {
        this.payout_address = str;
    }

    public final void setSchema_name(String str) {
        this.schema_name = str;
    }

    public final void setSymbol(String str) {
        this.symbol = str;
    }

    public final void setTotal_supply(String str) {
        this.total_supply = str;
    }
}

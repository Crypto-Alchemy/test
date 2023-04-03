package net.safemoon.androidwallet.model.collectible;

import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b@\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J½\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\b\u0010H\u001a\u00020\u0003H\u0016R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016¨\u0006I"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/collectible/MoralisNft;", "", "tokenAddress", "", "tokenId", "ownerOf", "blockNumber", "blockNumberMinted", "tokenHash", "amount", "contractType", "name", "symbol", "tokenUri", "metadata", "syncedAt", "lastTokenUriSync", "lastMetadataSync", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "getBlockNumber", "setBlockNumber", "getBlockNumberMinted", "setBlockNumberMinted", "getContractType", "setContractType", "getLastMetadataSync", "setLastMetadataSync", "getLastTokenUriSync", "setLastTokenUriSync", "getMetadata", "setMetadata", "getName", "setName", "getOwnerOf", "setOwnerOf", "getSymbol", "setSymbol", "getSyncedAt", "setSyncedAt", "getTokenAddress", "setTokenAddress", "getTokenHash", "setTokenHash", "getTokenId", "setTokenId", "getTokenUri", "setTokenUri", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: MoralisNft.kt */
public final class MoralisNft {
    @SerializedName("amount")
    private String amount;
    @SerializedName("block_number")
    private String blockNumber;
    @SerializedName("block_number_minted")
    private String blockNumberMinted;
    @SerializedName("contract_type")
    private String contractType;
    @SerializedName("last_metadata_sync")
    private String lastMetadataSync;
    @SerializedName("last_token_uri_sync")
    private String lastTokenUriSync;
    @SerializedName("metadata")
    private String metadata;
    @SerializedName("name")
    private String name;
    @SerializedName("owner_of")
    private String ownerOf;
    @SerializedName("symbol")
    private String symbol;
    @SerializedName("synced_at")
    private String syncedAt;
    @SerializedName("token_address")
    private String tokenAddress;
    @SerializedName("token_hash")
    private String tokenHash;
    @SerializedName("token_id")
    private String tokenId;
    @SerializedName("token_uri")
    private String tokenUri;

    public MoralisNft() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    public MoralisNft(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.tokenAddress = str;
        this.tokenId = str2;
        this.ownerOf = str3;
        this.blockNumber = str4;
        this.blockNumberMinted = str5;
        this.tokenHash = str6;
        this.amount = str7;
        this.contractType = str8;
        this.name = str9;
        this.symbol = str10;
        this.tokenUri = str11;
        this.metadata = str12;
        this.syncedAt = str13;
        this.lastTokenUriSync = str14;
        this.lastMetadataSync = str15;
    }

    public static /* synthetic */ MoralisNft copy$default(MoralisNft moralisNft, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, Object obj) {
        MoralisNft moralisNft2 = moralisNft;
        int i2 = i;
        return moralisNft.copy((i2 & 1) != 0 ? moralisNft2.tokenAddress : str, (i2 & 2) != 0 ? moralisNft2.tokenId : str2, (i2 & 4) != 0 ? moralisNft2.ownerOf : str3, (i2 & 8) != 0 ? moralisNft2.blockNumber : str4, (i2 & 16) != 0 ? moralisNft2.blockNumberMinted : str5, (i2 & 32) != 0 ? moralisNft2.tokenHash : str6, (i2 & 64) != 0 ? moralisNft2.amount : str7, (i2 & 128) != 0 ? moralisNft2.contractType : str8, (i2 & 256) != 0 ? moralisNft2.name : str9, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? moralisNft2.symbol : str10, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? moralisNft2.tokenUri : str11, (i2 & 2048) != 0 ? moralisNft2.metadata : str12, (i2 & 4096) != 0 ? moralisNft2.syncedAt : str13, (i2 & 8192) != 0 ? moralisNft2.lastTokenUriSync : str14, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? moralisNft2.lastMetadataSync : str15);
    }

    public final String component1() {
        return this.tokenAddress;
    }

    public final String component10() {
        return this.symbol;
    }

    public final String component11() {
        return this.tokenUri;
    }

    public final String component12() {
        return this.metadata;
    }

    public final String component13() {
        return this.syncedAt;
    }

    public final String component14() {
        return this.lastTokenUriSync;
    }

    public final String component15() {
        return this.lastMetadataSync;
    }

    public final String component2() {
        return this.tokenId;
    }

    public final String component3() {
        return this.ownerOf;
    }

    public final String component4() {
        return this.blockNumber;
    }

    public final String component5() {
        return this.blockNumberMinted;
    }

    public final String component6() {
        return this.tokenHash;
    }

    public final String component7() {
        return this.amount;
    }

    public final String component8() {
        return this.contractType;
    }

    public final String component9() {
        return this.name;
    }

    public final MoralisNft copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        return new MoralisNft(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoralisNft)) {
            return false;
        }
        MoralisNft moralisNft = (MoralisNft) obj;
        return vx2.m53586b(this.tokenAddress, moralisNft.tokenAddress) && vx2.m53586b(this.tokenId, moralisNft.tokenId) && vx2.m53586b(this.ownerOf, moralisNft.ownerOf) && vx2.m53586b(this.blockNumber, moralisNft.blockNumber) && vx2.m53586b(this.blockNumberMinted, moralisNft.blockNumberMinted) && vx2.m53586b(this.tokenHash, moralisNft.tokenHash) && vx2.m53586b(this.amount, moralisNft.amount) && vx2.m53586b(this.contractType, moralisNft.contractType) && vx2.m53586b(this.name, moralisNft.name) && vx2.m53586b(this.symbol, moralisNft.symbol) && vx2.m53586b(this.tokenUri, moralisNft.tokenUri) && vx2.m53586b(this.metadata, moralisNft.metadata) && vx2.m53586b(this.syncedAt, moralisNft.syncedAt) && vx2.m53586b(this.lastTokenUriSync, moralisNft.lastTokenUriSync) && vx2.m53586b(this.lastMetadataSync, moralisNft.lastMetadataSync);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getBlockNumber() {
        return this.blockNumber;
    }

    public final String getBlockNumberMinted() {
        return this.blockNumberMinted;
    }

    public final String getContractType() {
        return this.contractType;
    }

    public final String getLastMetadataSync() {
        return this.lastMetadataSync;
    }

    public final String getLastTokenUriSync() {
        return this.lastTokenUriSync;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwnerOf() {
        return this.ownerOf;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getSyncedAt() {
        return this.syncedAt;
    }

    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    public final String getTokenHash() {
        return this.tokenHash;
    }

    public final String getTokenId() {
        return this.tokenId;
    }

    public final String getTokenUri() {
        return this.tokenUri;
    }

    public int hashCode() {
        String str = this.tokenAddress;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tokenId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ownerOf;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.blockNumber;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.blockNumberMinted;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tokenHash;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.amount;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.contractType;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.name;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.symbol;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.tokenUri;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.metadata;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.syncedAt;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.lastTokenUriSync;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.lastMetadataSync;
        if (str15 != null) {
            i = str15.hashCode();
        }
        return hashCode14 + i;
    }

    public final void setAmount(String str) {
        this.amount = str;
    }

    public final void setBlockNumber(String str) {
        this.blockNumber = str;
    }

    public final void setBlockNumberMinted(String str) {
        this.blockNumberMinted = str;
    }

    public final void setContractType(String str) {
        this.contractType = str;
    }

    public final void setLastMetadataSync(String str) {
        this.lastMetadataSync = str;
    }

    public final void setLastTokenUriSync(String str) {
        this.lastTokenUriSync = str;
    }

    public final void setMetadata(String str) {
        this.metadata = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOwnerOf(String str) {
        this.ownerOf = str;
    }

    public final void setSymbol(String str) {
        this.symbol = str;
    }

    public final void setSyncedAt(String str) {
        this.syncedAt = str;
    }

    public final void setTokenAddress(String str) {
        this.tokenAddress = str;
    }

    public final void setTokenHash(String str) {
        this.tokenHash = str;
    }

    public final void setTokenId(String str) {
        this.tokenId = str;
    }

    public final void setTokenUri(String str) {
        this.tokenUri = str;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this, (Type) MoralisNft.class);
        vx2.m53590f(json, "Gson().toJson(this, MoralisNft::class.java)");
        return json;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MoralisNft(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r18
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r19
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r20
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r21
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0033
        L_0x0031:
            r7 = r22
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r2
            goto L_0x003b
        L_0x0039:
            r8 = r23
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r2
            goto L_0x0043
        L_0x0041:
            r9 = r24
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r2
            goto L_0x004b
        L_0x0049:
            r10 = r25
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = r2
            goto L_0x0053
        L_0x0051:
            r11 = r26
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = r2
            goto L_0x005b
        L_0x0059:
            r12 = r27
        L_0x005b:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            r13 = r2
            goto L_0x0063
        L_0x0061:
            r13 = r28
        L_0x0063:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0069
            r14 = r2
            goto L_0x006b
        L_0x0069:
            r14 = r29
        L_0x006b:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0071
            r15 = r2
            goto L_0x0073
        L_0x0071:
            r15 = r30
        L_0x0073:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r2 = r31
        L_0x007a:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            r32 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.collectible.MoralisNft.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

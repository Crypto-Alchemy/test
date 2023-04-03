package net.safemoon.androidwallet.model.nft;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.collectible.AssetContract;

@Metadata(mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001AB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B[\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R\u001e\u0010+\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR.\u0010.\u001a\u0016\u0012\u0004\u0012\u000200\u0018\u00010/j\n\u0012\u0004\u0012\u000200\u0018\u0001`1X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u0010\n\u0002\u0010<\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0010\"\u0004\b>\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0010\"\u0004\b@\u0010\u0012¨\u0006B"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/nft/NFTData;", "Ljava/io/Serializable;", "()V", "name", "", "imageUrl", "description", "permalink", "slug", "openSeaUrl", "tokenId", "assetContract", "Lnet/safemoon/androidwallet/model/collectible/AssetContract;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/safemoon/androidwallet/model/collectible/AssetContract;)V", "animationUrl", "getAnimationUrl", "()Ljava/lang/String;", "setAnimationUrl", "(Ljava/lang/String;)V", "getAssetContract", "()Lnet/safemoon/androidwallet/model/collectible/AssetContract;", "setAssetContract", "(Lnet/safemoon/androidwallet/model/collectible/AssetContract;)V", "chainID", "", "getChainID", "()Ljava/lang/Integer;", "setChainID", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDescription", "setDescription", "imageData", "getImageData", "setImageData", "getImageUrl", "setImageUrl", "getName", "setName", "getOpenSeaUrl", "setOpenSeaUrl", "getPermalink", "setPermalink", "position", "getPosition", "setPosition", "properties", "Ljava/util/ArrayList;", "Lnet/safemoon/androidwallet/model/nft/NFTData$Property;", "Lkotlin/collections/ArrayList;", "getProperties", "()Ljava/util/ArrayList;", "setProperties", "(Ljava/util/ArrayList;)V", "roomId", "", "getRoomId", "()Ljava/lang/Long;", "setRoomId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSlug", "setSlug", "getTokenId", "setTokenId", "Property", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: NFTData.kt */
public final class NFTData implements Serializable {
    private String animationUrl;
    private AssetContract assetContract;
    private Integer chainID;
    private String description;
    private String imageData;
    private String imageUrl;
    private String name;
    private String openSeaUrl;
    private String permalink;
    private Integer position;
    private ArrayList<Property> properties;
    private Long roomId;
    private String slug;
    private String tokenId;

    @Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/nft/NFTData$Property;", "Ljava/io/Serializable;", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getValue", "setValue", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: NFTData.kt */
    public static final class Property implements Serializable {
        private String name;
        private String value;

        public Property(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        public final String getName() {
            return this.name;
        }

        public final String getValue() {
            return this.value;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setValue(String str) {
            this.value = str;
        }
    }

    public NFTData() {
        this.properties = new ArrayList<>();
    }

    public final String getAnimationUrl() {
        return this.animationUrl;
    }

    public final AssetContract getAssetContract() {
        return this.assetContract;
    }

    public final Integer getChainID() {
        return this.chainID;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageData() {
        return this.imageData;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOpenSeaUrl() {
        return this.openSeaUrl;
    }

    public final String getPermalink() {
        return this.permalink;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final ArrayList<Property> getProperties() {
        return this.properties;
    }

    public final Long getRoomId() {
        return this.roomId;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getTokenId() {
        return this.tokenId;
    }

    public final void setAnimationUrl(String str) {
        this.animationUrl = str;
    }

    public final void setAssetContract(AssetContract assetContract2) {
        this.assetContract = assetContract2;
    }

    public final void setChainID(Integer num) {
        this.chainID = num;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setImageData(String str) {
        this.imageData = str;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOpenSeaUrl(String str) {
        this.openSeaUrl = str;
    }

    public final void setPermalink(String str) {
        this.permalink = str;
    }

    public final void setPosition(Integer num) {
        this.position = num;
    }

    public final void setProperties(ArrayList<Property> arrayList) {
        this.properties = arrayList;
    }

    public final void setRoomId(Long l) {
        this.roomId = l;
    }

    public final void setSlug(String str) {
        this.slug = str;
    }

    public final void setTokenId(String str) {
        this.tokenId = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NFTData(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, net.safemoon.androidwallet.model.collectible.AssetContract r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r10 = r2
            goto L_0x000b
        L_0x0009:
            r10 = r19
        L_0x000b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0011
            r11 = r2
            goto L_0x0013
        L_0x0011:
            r11 = r20
        L_0x0013:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.nft.NFTData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, net.safemoon.androidwallet.model.collectible.AssetContract, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public NFTData(String str, String str2, String str3, String str4, String str5, String str6, String str7, AssetContract assetContract2) {
        this.properties = new ArrayList<>();
        this.name = str;
        this.imageUrl = str2;
        this.description = str3;
        this.permalink = str4;
        this.slug = str5;
        this.openSeaUrl = str6;
        this.tokenId = str7;
        this.assetContract = assetContract2;
    }
}

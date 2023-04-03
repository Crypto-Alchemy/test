package net.safemoon.androidwallet.model.collectible;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;

@Metadata(mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bC\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005¢\u0006\u0002\u0010\u0015J\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\bHÆ\u0003JÆ\u0001\u0010I\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020\u0005HÖ\u0001J\t\u0010P\u001a\u00020\bHÖ\u0001R \u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR \u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R \u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R \u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R \u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019R\u001e\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u00102R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0017R\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u00108¨\u0006Q"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/collectible/RoomNFT;", "Ljava/io/Serializable;", "id", "", "chain", "", "collectionId", "token_id", "", "name", "description", "animation_url", "image_preview_url", "image_data", "token_uri", "attributes", "fullData", "permalink", "openSeaUrl", "updatedTime", "order", "(Ljava/lang/Long;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "getAnimation_url", "()Ljava/lang/String;", "setAnimation_url", "(Ljava/lang/String;)V", "getAttributes", "setAttributes", "getChain", "()I", "getCollectionId", "()J", "getDescription", "setDescription", "getFullData", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getImage_data", "setImage_data", "getImage_preview_url", "setImage_preview_url", "getName", "setName", "getOpenSeaUrl", "setOpenSeaUrl", "getOrder", "setOrder", "(I)V", "getPermalink", "getToken_id", "getToken_uri", "getUpdatedTime", "setUpdatedTime", "(J)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)Lnet/safemoon/androidwallet/model/collectible/RoomNFT;", "equals", "", "other", "", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomNFT.kt */
public final class RoomNFT implements Serializable {
    private String animation_url;
    private String attributes;
    private final int chain;
    private final long collectionId;
    private String description;
    private final String fullData;

    /* renamed from: id */
    private Long f42455id;
    private String image_data;
    private String image_preview_url;
    private String name;
    private String openSeaUrl;
    private int order;
    private final String permalink;
    private final String token_id;
    private final String token_uri;
    private long updatedTime;

    public RoomNFT(Long l, int i, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j2, int i2) {
        this.f42455id = l;
        this.chain = i;
        this.collectionId = j;
        this.token_id = str;
        this.name = str2;
        this.description = str3;
        this.animation_url = str4;
        this.image_preview_url = str5;
        this.image_data = str6;
        this.token_uri = str7;
        this.attributes = str8;
        this.fullData = str9;
        this.permalink = str10;
        this.openSeaUrl = str11;
        this.updatedTime = j2;
        this.order = i2;
    }

    public static /* synthetic */ RoomNFT copy$default(RoomNFT roomNFT, Long l, int i, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j2, int i2, int i3, Object obj) {
        RoomNFT roomNFT2 = roomNFT;
        int i4 = i3;
        return roomNFT.copy((i4 & 1) != 0 ? roomNFT2.f42455id : l, (i4 & 2) != 0 ? roomNFT2.chain : i, (i4 & 4) != 0 ? roomNFT2.collectionId : j, (i4 & 8) != 0 ? roomNFT2.token_id : str, (i4 & 16) != 0 ? roomNFT2.name : str2, (i4 & 32) != 0 ? roomNFT2.description : str3, (i4 & 64) != 0 ? roomNFT2.animation_url : str4, (i4 & 128) != 0 ? roomNFT2.image_preview_url : str5, (i4 & 256) != 0 ? roomNFT2.image_data : str6, (i4 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? roomNFT2.token_uri : str7, (i4 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? roomNFT2.attributes : str8, (i4 & 2048) != 0 ? roomNFT2.fullData : str9, (i4 & 4096) != 0 ? roomNFT2.permalink : str10, (i4 & 8192) != 0 ? roomNFT2.openSeaUrl : str11, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? roomNFT2.updatedTime : j2, (i4 & 32768) != 0 ? roomNFT2.order : i2);
    }

    public final Long component1() {
        return this.f42455id;
    }

    public final String component10() {
        return this.token_uri;
    }

    public final String component11() {
        return this.attributes;
    }

    public final String component12() {
        return this.fullData;
    }

    public final String component13() {
        return this.permalink;
    }

    public final String component14() {
        return this.openSeaUrl;
    }

    public final long component15() {
        return this.updatedTime;
    }

    public final int component16() {
        return this.order;
    }

    public final int component2() {
        return this.chain;
    }

    public final long component3() {
        return this.collectionId;
    }

    public final String component4() {
        return this.token_id;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.description;
    }

    public final String component7() {
        return this.animation_url;
    }

    public final String component8() {
        return this.image_preview_url;
    }

    public final String component9() {
        return this.image_data;
    }

    public final RoomNFT copy(Long l, int i, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j2, int i2) {
        return new RoomNFT(l, i, j, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, j2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomNFT)) {
            return false;
        }
        RoomNFT roomNFT = (RoomNFT) obj;
        return vx2.m53586b(this.f42455id, roomNFT.f42455id) && this.chain == roomNFT.chain && this.collectionId == roomNFT.collectionId && vx2.m53586b(this.token_id, roomNFT.token_id) && vx2.m53586b(this.name, roomNFT.name) && vx2.m53586b(this.description, roomNFT.description) && vx2.m53586b(this.animation_url, roomNFT.animation_url) && vx2.m53586b(this.image_preview_url, roomNFT.image_preview_url) && vx2.m53586b(this.image_data, roomNFT.image_data) && vx2.m53586b(this.token_uri, roomNFT.token_uri) && vx2.m53586b(this.attributes, roomNFT.attributes) && vx2.m53586b(this.fullData, roomNFT.fullData) && vx2.m53586b(this.permalink, roomNFT.permalink) && vx2.m53586b(this.openSeaUrl, roomNFT.openSeaUrl) && this.updatedTime == roomNFT.updatedTime && this.order == roomNFT.order;
    }

    public final String getAnimation_url() {
        return this.animation_url;
    }

    public final String getAttributes() {
        return this.attributes;
    }

    public final int getChain() {
        return this.chain;
    }

    public final long getCollectionId() {
        return this.collectionId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFullData() {
        return this.fullData;
    }

    public final Long getId() {
        return this.f42455id;
    }

    public final String getImage_data() {
        return this.image_data;
    }

    public final String getImage_preview_url() {
        return this.image_preview_url;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOpenSeaUrl() {
        return this.openSeaUrl;
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getPermalink() {
        return this.permalink;
    }

    public final String getToken_id() {
        return this.token_id;
    }

    public final String getToken_uri() {
        return this.token_uri;
    }

    public final long getUpdatedTime() {
        return this.updatedTime;
    }

    public int hashCode() {
        Long l = this.f42455id;
        int i = 0;
        int hashCode = (((((l == null ? 0 : l.hashCode()) * 31) + this.chain) * 31) + au0.m10781a(this.collectionId)) * 31;
        String str = this.token_id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.animation_url;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.image_preview_url;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.image_data;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.token_uri;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.attributes;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fullData;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.permalink;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.openSeaUrl;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return ((((hashCode11 + i) * 31) + au0.m10781a(this.updatedTime)) * 31) + this.order;
    }

    public final void setAnimation_url(String str) {
        this.animation_url = str;
    }

    public final void setAttributes(String str) {
        this.attributes = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setId(Long l) {
        this.f42455id = l;
    }

    public final void setImage_data(String str) {
        this.image_data = str;
    }

    public final void setImage_preview_url(String str) {
        this.image_preview_url = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOpenSeaUrl(String str) {
        this.openSeaUrl = str;
    }

    public final void setOrder(int i) {
        this.order = i;
    }

    public final void setUpdatedTime(long j) {
        this.updatedTime = j;
    }

    public String toString() {
        Long l = this.f42455id;
        int i = this.chain;
        long j = this.collectionId;
        String str = this.token_id;
        String str2 = this.name;
        String str3 = this.description;
        String str4 = this.animation_url;
        String str5 = this.image_preview_url;
        String str6 = this.image_data;
        String str7 = this.token_uri;
        String str8 = this.attributes;
        String str9 = this.fullData;
        String str10 = this.permalink;
        String str11 = this.openSeaUrl;
        long j2 = this.updatedTime;
        int i2 = this.order;
        return "RoomNFT(id=" + l + ", chain=" + i + ", collectionId=" + j + ", token_id=" + str + ", name=" + str2 + ", description=" + str3 + ", animation_url=" + str4 + ", image_preview_url=" + str5 + ", image_data=" + str6 + ", token_uri=" + str7 + ", attributes=" + str8 + ", fullData=" + str9 + ", permalink=" + str10 + ", openSeaUrl=" + str11 + ", updatedTime=" + j2 + ", order=" + i2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RoomNFT(java.lang.Long r23, int r24, long r25, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, long r38, int r40, int r41, kotlin.jvm.internal.DefaultConstructorMarker r42) {
        /*
            r22 = this;
            r0 = r41
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r23
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r27
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r28
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r10 = r2
            goto L_0x0023
        L_0x0021:
            r10 = r29
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r11 = r2
            goto L_0x002b
        L_0x0029:
            r11 = r30
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r12 = r2
            goto L_0x0033
        L_0x0031:
            r12 = r31
        L_0x0033:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0039
            r13 = r2
            goto L_0x003b
        L_0x0039:
            r13 = r32
        L_0x003b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0041
            r14 = r2
            goto L_0x0043
        L_0x0041:
            r14 = r33
        L_0x0043:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0049
            r15 = r2
            goto L_0x004b
        L_0x0049:
            r15 = r34
        L_0x004b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0052
            r16 = r2
            goto L_0x0054
        L_0x0052:
            r16 = r35
        L_0x0054:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x005b
            r17 = r2
            goto L_0x005d
        L_0x005b:
            r17 = r36
        L_0x005d:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0064
            r18 = r2
            goto L_0x0066
        L_0x0064:
            r18 = r37
        L_0x0066:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0070
            r0 = 0
            r21 = r0
            goto L_0x0072
        L_0x0070:
            r21 = r40
        L_0x0072:
            r3 = r22
            r5 = r24
            r6 = r25
            r19 = r38
            r3.<init>(r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.collectible.RoomNFT.<init>(java.lang.Long, int, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

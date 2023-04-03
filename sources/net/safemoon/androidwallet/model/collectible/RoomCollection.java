package net.safemoon.androidwallet.model.collectible;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b8\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0013J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jª\u0001\u0010=\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0003\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020\u0005HÖ\u0001J\t\u0010D\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010'R \u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0017R\u001e\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010'R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006E"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/collectible/RoomCollection;", "Ljava/io/Serializable;", "id", "", "chain", "", "contractAddress", "", "contract_type", "name", "description", "imageUrl", "symbol", "marketPlace", "slug", "updatedTime", "order", "typeDeleteNft", "fullData", "(Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIILjava/lang/String;)V", "getChain", "()I", "getContractAddress", "()Ljava/lang/String;", "getContract_type", "getDescription", "getFullData", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getImageUrl", "setImageUrl", "(Ljava/lang/String;)V", "getMarketPlace", "getName", "getOrder", "setOrder", "(I)V", "getSlug", "setSlug", "getSymbol", "getTypeDeleteNft", "setTypeDeleteNft", "getUpdatedTime", "()J", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIILjava/lang/String;)Lnet/safemoon/androidwallet/model/collectible/RoomCollection;", "equals", "", "other", "", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomCollection.kt */
public final class RoomCollection implements Serializable {
    private final int chain;
    private final String contractAddress;
    private final String contract_type;
    private final String description;
    private final String fullData;

    /* renamed from: id */
    private Long f42454id;
    private String imageUrl;
    private final String marketPlace;
    private final String name;
    private int order;
    private String slug;
    private final String symbol;
    private int typeDeleteNft;
    private final long updatedTime;

    public RoomCollection(Long l, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, int i2, int i3, String str9) {
        vx2.m53591g(str, "contractAddress");
        vx2.m53591g(str2, "contract_type");
        this.f42454id = l;
        this.chain = i;
        this.contractAddress = str;
        this.contract_type = str2;
        this.name = str3;
        this.description = str4;
        this.imageUrl = str5;
        this.symbol = str6;
        this.marketPlace = str7;
        this.slug = str8;
        this.updatedTime = j;
        this.order = i2;
        this.typeDeleteNft = i3;
        this.fullData = str9;
    }

    public static /* synthetic */ RoomCollection copy$default(RoomCollection roomCollection, Long l, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, int i2, int i3, String str9, int i4, Object obj) {
        RoomCollection roomCollection2 = roomCollection;
        int i5 = i4;
        return roomCollection.copy((i5 & 1) != 0 ? roomCollection2.f42454id : l, (i5 & 2) != 0 ? roomCollection2.chain : i, (i5 & 4) != 0 ? roomCollection2.contractAddress : str, (i5 & 8) != 0 ? roomCollection2.contract_type : str2, (i5 & 16) != 0 ? roomCollection2.name : str3, (i5 & 32) != 0 ? roomCollection2.description : str4, (i5 & 64) != 0 ? roomCollection2.imageUrl : str5, (i5 & 128) != 0 ? roomCollection2.symbol : str6, (i5 & 256) != 0 ? roomCollection2.marketPlace : str7, (i5 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? roomCollection2.slug : str8, (i5 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? roomCollection2.updatedTime : j, (i5 & 2048) != 0 ? roomCollection2.order : i2, (i5 & 4096) != 0 ? roomCollection2.typeDeleteNft : i3, (i5 & 8192) != 0 ? roomCollection2.fullData : str9);
    }

    public final Long component1() {
        return this.f42454id;
    }

    public final String component10() {
        return this.slug;
    }

    public final long component11() {
        return this.updatedTime;
    }

    public final int component12() {
        return this.order;
    }

    public final int component13() {
        return this.typeDeleteNft;
    }

    public final String component14() {
        return this.fullData;
    }

    public final int component2() {
        return this.chain;
    }

    public final String component3() {
        return this.contractAddress;
    }

    public final String component4() {
        return this.contract_type;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.description;
    }

    public final String component7() {
        return this.imageUrl;
    }

    public final String component8() {
        return this.symbol;
    }

    public final String component9() {
        return this.marketPlace;
    }

    public final RoomCollection copy(Long l, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, int i2, int i3, String str9) {
        String str10 = str;
        vx2.m53591g(str10, "contractAddress");
        String str11 = str2;
        vx2.m53591g(str11, "contract_type");
        return new RoomCollection(l, i, str10, str11, str3, str4, str5, str6, str7, str8, j, i2, i3, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomCollection)) {
            return false;
        }
        RoomCollection roomCollection = (RoomCollection) obj;
        return vx2.m53586b(this.f42454id, roomCollection.f42454id) && this.chain == roomCollection.chain && vx2.m53586b(this.contractAddress, roomCollection.contractAddress) && vx2.m53586b(this.contract_type, roomCollection.contract_type) && vx2.m53586b(this.name, roomCollection.name) && vx2.m53586b(this.description, roomCollection.description) && vx2.m53586b(this.imageUrl, roomCollection.imageUrl) && vx2.m53586b(this.symbol, roomCollection.symbol) && vx2.m53586b(this.marketPlace, roomCollection.marketPlace) && vx2.m53586b(this.slug, roomCollection.slug) && this.updatedTime == roomCollection.updatedTime && this.order == roomCollection.order && this.typeDeleteNft == roomCollection.typeDeleteNft && vx2.m53586b(this.fullData, roomCollection.fullData);
    }

    public final int getChain() {
        return this.chain;
    }

    public final String getContractAddress() {
        return this.contractAddress;
    }

    public final String getContract_type() {
        return this.contract_type;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFullData() {
        return this.fullData;
    }

    public final Long getId() {
        return this.f42454id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMarketPlace() {
        return this.marketPlace;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final int getTypeDeleteNft() {
        return this.typeDeleteNft;
    }

    public final long getUpdatedTime() {
        return this.updatedTime;
    }

    public int hashCode() {
        Long l = this.f42454id;
        int i = 0;
        int hashCode = (((((((l == null ? 0 : l.hashCode()) * 31) + this.chain) * 31) + this.contractAddress.hashCode()) * 31) + this.contract_type.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.symbol;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.marketPlace;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.slug;
        int hashCode7 = (((((((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + au0.m10781a(this.updatedTime)) * 31) + this.order) * 31) + this.typeDeleteNft) * 31;
        String str7 = this.fullData;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 + i;
    }

    public final void setId(Long l) {
        this.f42454id = l;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setOrder(int i) {
        this.order = i;
    }

    public final void setSlug(String str) {
        this.slug = str;
    }

    public final void setTypeDeleteNft(int i) {
        this.typeDeleteNft = i;
    }

    public String toString() {
        Long l = this.f42454id;
        int i = this.chain;
        String str = this.contractAddress;
        String str2 = this.contract_type;
        String str3 = this.name;
        String str4 = this.description;
        String str5 = this.imageUrl;
        String str6 = this.symbol;
        String str7 = this.marketPlace;
        String str8 = this.slug;
        long j = this.updatedTime;
        int i2 = this.order;
        int i3 = this.typeDeleteNft;
        String str9 = this.fullData;
        return "RoomCollection(id=" + l + ", chain=" + i + ", contractAddress=" + str + ", contract_type=" + str2 + ", name=" + str3 + ", description=" + str4 + ", imageUrl=" + str5 + ", symbol=" + str6 + ", marketPlace=" + str7 + ", slug=" + str8 + ", updatedTime=" + j + ", order=" + i2 + ", typeDeleteNft=" + i3 + ", fullData=" + str9 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RoomCollection(java.lang.Long r20, int r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, long r30, int r32, int r33, java.lang.String r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r20
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r24
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0019
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r25
        L_0x001b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0021
            r10 = r2
            goto L_0x0023
        L_0x0021:
            r10 = r26
        L_0x0023:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0029
            r11 = r2
            goto L_0x002b
        L_0x0029:
            r11 = r27
        L_0x002b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0031
            r12 = r2
            goto L_0x0033
        L_0x0031:
            r12 = r28
        L_0x0033:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0039
            r13 = r2
            goto L_0x003b
        L_0x0039:
            r13 = r29
        L_0x003b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r3 = 0
            if (r1 == 0) goto L_0x0043
            r16 = r3
            goto L_0x0045
        L_0x0043:
            r16 = r32
        L_0x0045:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x004c
            r17 = r3
            goto L_0x004e
        L_0x004c:
            r17 = r33
        L_0x004e:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0055
            r18 = r2
            goto L_0x0057
        L_0x0055:
            r18 = r34
        L_0x0057:
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r14 = r30
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.collectible.RoomCollection.<init>(java.lang.Long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

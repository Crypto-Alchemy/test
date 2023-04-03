package net.safemoon.androidwallet.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJF\u0010\u001d\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006$"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/RoomTokenInfo;", "", "id", "", "symbolWithType", "", "chainId", "", "slug", "cmcId", "(Ljava/lang/Long;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "getChainId", "()I", "getCmcId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSlug", "()Ljava/lang/String;", "getSymbolWithType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/RoomTokenInfo;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomTokenInfo.kt */
public final class RoomTokenInfo {
    private final int chainId;
    private final Integer cmcId;

    /* renamed from: id */
    private Long f42447id;
    private final String slug;
    private final String symbolWithType;

    public RoomTokenInfo(Long l, String str, int i, String str2, Integer num) {
        vx2.m53591g(str, "symbolWithType");
        this.f42447id = l;
        this.symbolWithType = str;
        this.chainId = i;
        this.slug = str2;
        this.cmcId = num;
    }

    public static /* synthetic */ RoomTokenInfo copy$default(RoomTokenInfo roomTokenInfo, Long l, String str, int i, String str2, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = roomTokenInfo.f42447id;
        }
        if ((i2 & 2) != 0) {
            str = roomTokenInfo.symbolWithType;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            i = roomTokenInfo.chainId;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = roomTokenInfo.slug;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            num = roomTokenInfo.cmcId;
        }
        return roomTokenInfo.copy(l, str3, i3, str4, num);
    }

    public final Long component1() {
        return this.f42447id;
    }

    public final String component2() {
        return this.symbolWithType;
    }

    public final int component3() {
        return this.chainId;
    }

    public final String component4() {
        return this.slug;
    }

    public final Integer component5() {
        return this.cmcId;
    }

    public final RoomTokenInfo copy(Long l, String str, int i, String str2, Integer num) {
        vx2.m53591g(str, "symbolWithType");
        return new RoomTokenInfo(l, str, i, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomTokenInfo)) {
            return false;
        }
        RoomTokenInfo roomTokenInfo = (RoomTokenInfo) obj;
        return vx2.m53586b(this.f42447id, roomTokenInfo.f42447id) && vx2.m53586b(this.symbolWithType, roomTokenInfo.symbolWithType) && this.chainId == roomTokenInfo.chainId && vx2.m53586b(this.slug, roomTokenInfo.slug) && vx2.m53586b(this.cmcId, roomTokenInfo.cmcId);
    }

    public final int getChainId() {
        return this.chainId;
    }

    public final Integer getCmcId() {
        return this.cmcId;
    }

    public final Long getId() {
        return this.f42447id;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getSymbolWithType() {
        return this.symbolWithType;
    }

    public int hashCode() {
        Long l = this.f42447id;
        int i = 0;
        int hashCode = (((((l == null ? 0 : l.hashCode()) * 31) + this.symbolWithType.hashCode()) * 31) + this.chainId) * 31;
        String str = this.slug;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.cmcId;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setId(Long l) {
        this.f42447id = l;
    }

    public String toString() {
        Long l = this.f42447id;
        String str = this.symbolWithType;
        int i = this.chainId;
        String str2 = this.slug;
        Integer num = this.cmcId;
        return "RoomTokenInfo(id=" + l + ", symbolWithType=" + str + ", chainId=" + i + ", slug=" + str2 + ", cmcId=" + num + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomTokenInfo(Long l, String str, int i, String str2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : l, str, i, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : num);
    }
}

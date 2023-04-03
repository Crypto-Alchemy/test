package net.safemoon.androidwallet.model.reflections;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JL\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\fR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018¨\u0006*"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsData;", "", "id", "", "symbolWithType", "", "nativeBalance", "blockBalance", "block", "timeStamp", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getBlock", "()Ljava/lang/String;", "getBlockBalance", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getNativeBalance", "startTime", "getStartTime", "()J", "setStartTime", "(J)V", "getSymbolWithType", "getTimeStamp", "setTimeStamp", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsData;", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomReflectionsData.kt */
public final class RoomReflectionsData {
    private final String block;
    private final String blockBalance;

    /* renamed from: id */
    private Long f42461id;
    private final String nativeBalance;
    private long startTime;
    private final String symbolWithType;
    private long timeStamp;

    public RoomReflectionsData(Long l, String str, String str2, String str3, String str4, long j) {
        vx2.m53591g(str, "symbolWithType");
        vx2.m53591g(str2, "nativeBalance");
        vx2.m53591g(str3, "blockBalance");
        vx2.m53591g(str4, "block");
        this.f42461id = l;
        this.symbolWithType = str;
        this.nativeBalance = str2;
        this.blockBalance = str3;
        this.block = str4;
        this.timeStamp = j;
    }

    public static /* synthetic */ RoomReflectionsData copy$default(RoomReflectionsData roomReflectionsData, Long l, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            l = roomReflectionsData.f42461id;
        }
        if ((i & 2) != 0) {
            str = roomReflectionsData.symbolWithType;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = roomReflectionsData.nativeBalance;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = roomReflectionsData.blockBalance;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = roomReflectionsData.block;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            j = roomReflectionsData.timeStamp;
        }
        return roomReflectionsData.copy(l, str5, str6, str7, str8, j);
    }

    public final Long component1() {
        return this.f42461id;
    }

    public final String component2() {
        return this.symbolWithType;
    }

    public final String component3() {
        return this.nativeBalance;
    }

    public final String component4() {
        return this.blockBalance;
    }

    public final String component5() {
        return this.block;
    }

    public final long component6() {
        return this.timeStamp;
    }

    public final RoomReflectionsData copy(Long l, String str, String str2, String str3, String str4, long j) {
        vx2.m53591g(str, "symbolWithType");
        vx2.m53591g(str2, "nativeBalance");
        vx2.m53591g(str3, "blockBalance");
        vx2.m53591g(str4, "block");
        return new RoomReflectionsData(l, str, str2, str3, str4, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomReflectionsData)) {
            return false;
        }
        RoomReflectionsData roomReflectionsData = (RoomReflectionsData) obj;
        return vx2.m53586b(this.f42461id, roomReflectionsData.f42461id) && vx2.m53586b(this.symbolWithType, roomReflectionsData.symbolWithType) && vx2.m53586b(this.nativeBalance, roomReflectionsData.nativeBalance) && vx2.m53586b(this.blockBalance, roomReflectionsData.blockBalance) && vx2.m53586b(this.block, roomReflectionsData.block) && this.timeStamp == roomReflectionsData.timeStamp;
    }

    public final String getBlock() {
        return this.block;
    }

    public final String getBlockBalance() {
        return this.blockBalance;
    }

    public final Long getId() {
        return this.f42461id;
    }

    public final String getNativeBalance() {
        return this.nativeBalance;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getSymbolWithType() {
        return this.symbolWithType;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        Long l = this.f42461id;
        return ((((((((((l == null ? 0 : l.hashCode()) * 31) + this.symbolWithType.hashCode()) * 31) + this.nativeBalance.hashCode()) * 31) + this.blockBalance.hashCode()) * 31) + this.block.hashCode()) * 31) + au0.m10781a(this.timeStamp);
    }

    public final void setId(Long l) {
        this.f42461id = l;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public String toString() {
        Long l = this.f42461id;
        String str = this.symbolWithType;
        String str2 = this.nativeBalance;
        String str3 = this.blockBalance;
        String str4 = this.block;
        long j = this.timeStamp;
        return "RoomReflectionsData(id=" + l + ", symbolWithType=" + str + ", nativeBalance=" + str2 + ", blockBalance=" + str3 + ", block=" + str4 + ", timeStamp=" + j + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomReflectionsData(Long l, String str, String str2, String str3, String str4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, str, str2, str3, str4, j);
    }
}

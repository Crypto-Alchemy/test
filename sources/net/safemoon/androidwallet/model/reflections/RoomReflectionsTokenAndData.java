package net.safemoon.androidwallet.model.reflections;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsTokenAndData;", "", "token", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "data", "", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsData;", "(Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "getToken", "()Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomReflectionsTokenAndData.kt */
public final class RoomReflectionsTokenAndData {
    private final List<RoomReflectionsData> data;
    private final RoomReflectionsToken token;

    public RoomReflectionsTokenAndData(RoomReflectionsToken roomReflectionsToken, List<RoomReflectionsData> list) {
        vx2.m53591g(roomReflectionsToken, "token");
        vx2.m53591g(list, "data");
        this.token = roomReflectionsToken;
        this.data = list;
    }

    public static /* synthetic */ RoomReflectionsTokenAndData copy$default(RoomReflectionsTokenAndData roomReflectionsTokenAndData, RoomReflectionsToken roomReflectionsToken, List<RoomReflectionsData> list, int i, Object obj) {
        if ((i & 1) != 0) {
            roomReflectionsToken = roomReflectionsTokenAndData.token;
        }
        if ((i & 2) != 0) {
            list = roomReflectionsTokenAndData.data;
        }
        return roomReflectionsTokenAndData.copy(roomReflectionsToken, list);
    }

    public final RoomReflectionsToken component1() {
        return this.token;
    }

    public final List<RoomReflectionsData> component2() {
        return this.data;
    }

    public final RoomReflectionsTokenAndData copy(RoomReflectionsToken roomReflectionsToken, List<RoomReflectionsData> list) {
        vx2.m53591g(roomReflectionsToken, "token");
        vx2.m53591g(list, "data");
        return new RoomReflectionsTokenAndData(roomReflectionsToken, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomReflectionsTokenAndData)) {
            return false;
        }
        RoomReflectionsTokenAndData roomReflectionsTokenAndData = (RoomReflectionsTokenAndData) obj;
        return vx2.m53586b(this.token, roomReflectionsTokenAndData.token) && vx2.m53586b(this.data, roomReflectionsTokenAndData.data);
    }

    public final List<RoomReflectionsData> getData() {
        return this.data;
    }

    public final RoomReflectionsToken getToken() {
        return this.token;
    }

    public int hashCode() {
        return (this.token.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        RoomReflectionsToken roomReflectionsToken = this.token;
        List<RoomReflectionsData> list = this.data;
        return "RoomReflectionsTokenAndData(token=" + roomReflectionsToken + ", data=" + list + ")";
    }
}

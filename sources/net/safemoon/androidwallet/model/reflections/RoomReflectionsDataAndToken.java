package net.safemoon.androidwallet.model.reflections;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0019HÖ\u0001R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsDataAndToken;", "", "data", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsData;", "token", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "(Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsData;Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;)V", "balance", "", "getBalance", "()Ljava/lang/Float;", "setBalance", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "blockBalance", "getBlockBalance", "()F", "setBlockBalance", "(F)V", "getData", "()Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsData;", "diffBalance", "getDiffBalance", "setDiffBalance", "displayDate", "", "getDisplayDate", "()Ljava/lang/String;", "setDisplayDate", "(Ljava/lang/String;)V", "getToken", "()Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomReflectionsDataAndToken.kt */
public final class RoomReflectionsDataAndToken {
    private Float balance;
    private float blockBalance;
    private final RoomReflectionsData data;
    private Float diffBalance;
    private String displayDate = "";
    private final RoomReflectionsToken token;

    public RoomReflectionsDataAndToken(RoomReflectionsData roomReflectionsData, RoomReflectionsToken roomReflectionsToken) {
        vx2.m53591g(roomReflectionsData, "data");
        vx2.m53591g(roomReflectionsToken, "token");
        this.data = roomReflectionsData;
        this.token = roomReflectionsToken;
        Float valueOf = Float.valueOf(Utils.FLOAT_EPSILON);
        this.balance = valueOf;
        this.diffBalance = valueOf;
    }

    public static /* synthetic */ RoomReflectionsDataAndToken copy$default(RoomReflectionsDataAndToken roomReflectionsDataAndToken, RoomReflectionsData roomReflectionsData, RoomReflectionsToken roomReflectionsToken, int i, Object obj) {
        if ((i & 1) != 0) {
            roomReflectionsData = roomReflectionsDataAndToken.data;
        }
        if ((i & 2) != 0) {
            roomReflectionsToken = roomReflectionsDataAndToken.token;
        }
        return roomReflectionsDataAndToken.copy(roomReflectionsData, roomReflectionsToken);
    }

    public final RoomReflectionsData component1() {
        return this.data;
    }

    public final RoomReflectionsToken component2() {
        return this.token;
    }

    public final RoomReflectionsDataAndToken copy(RoomReflectionsData roomReflectionsData, RoomReflectionsToken roomReflectionsToken) {
        vx2.m53591g(roomReflectionsData, "data");
        vx2.m53591g(roomReflectionsToken, "token");
        return new RoomReflectionsDataAndToken(roomReflectionsData, roomReflectionsToken);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomReflectionsDataAndToken)) {
            return false;
        }
        RoomReflectionsDataAndToken roomReflectionsDataAndToken = (RoomReflectionsDataAndToken) obj;
        return vx2.m53586b(this.data, roomReflectionsDataAndToken.data) && vx2.m53586b(this.token, roomReflectionsDataAndToken.token);
    }

    public final Float getBalance() {
        return this.balance;
    }

    public final float getBlockBalance() {
        return this.blockBalance;
    }

    public final RoomReflectionsData getData() {
        return this.data;
    }

    public final Float getDiffBalance() {
        return this.diffBalance;
    }

    public final String getDisplayDate() {
        return this.displayDate;
    }

    public final RoomReflectionsToken getToken() {
        return this.token;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.token.hashCode();
    }

    public final void setBalance(Float f) {
        this.balance = f;
    }

    public final void setBlockBalance(float f) {
        this.blockBalance = f;
    }

    public final void setDiffBalance(Float f) {
        this.diffBalance = f;
    }

    public final void setDisplayDate(String str) {
        this.displayDate = str;
    }

    public String toString() {
        RoomReflectionsData roomReflectionsData = this.data;
        RoomReflectionsToken roomReflectionsToken = this.token;
        return "RoomReflectionsDataAndToken(data=" + roomReflectionsData + ", token=" + roomReflectionsToken + ")";
    }
}

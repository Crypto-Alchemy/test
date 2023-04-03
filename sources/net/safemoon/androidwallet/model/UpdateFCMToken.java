package net.safemoon.androidwallet.model;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J2\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/UpdateFCMToken;", "", "walletAddresses", "", "", "oldFcmToken", "newFcmToken", "([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNewFcmToken", "()Ljava/lang/String;", "setNewFcmToken", "(Ljava/lang/String;)V", "getOldFcmToken", "setOldFcmToken", "getWalletAddresses", "()[Ljava/lang/String;", "setWalletAddresses", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "component1", "component2", "component3", "copy", "([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/safemoon/androidwallet/model/UpdateFCMToken;", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Setting.kt */
public final class UpdateFCMToken {
    @SerializedName("newFcmToken")
    private String newFcmToken;
    @SerializedName("oldFcmToken")
    private String oldFcmToken;
    @SerializedName("walletAddresses")
    private String[] walletAddresses;

    public UpdateFCMToken(String[] strArr, String str, String str2) {
        vx2.m53591g(strArr, "walletAddresses");
        vx2.m53591g(str, "oldFcmToken");
        vx2.m53591g(str2, "newFcmToken");
        this.walletAddresses = strArr;
        this.oldFcmToken = str;
        this.newFcmToken = str2;
    }

    public static /* synthetic */ UpdateFCMToken copy$default(UpdateFCMToken updateFCMToken, String[] strArr, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = updateFCMToken.walletAddresses;
        }
        if ((i & 2) != 0) {
            str = updateFCMToken.oldFcmToken;
        }
        if ((i & 4) != 0) {
            str2 = updateFCMToken.newFcmToken;
        }
        return updateFCMToken.copy(strArr, str, str2);
    }

    public final String[] component1() {
        return this.walletAddresses;
    }

    public final String component2() {
        return this.oldFcmToken;
    }

    public final String component3() {
        return this.newFcmToken;
    }

    public final UpdateFCMToken copy(String[] strArr, String str, String str2) {
        vx2.m53591g(strArr, "walletAddresses");
        vx2.m53591g(str, "oldFcmToken");
        vx2.m53591g(str2, "newFcmToken");
        return new UpdateFCMToken(strArr, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateFCMToken)) {
            return false;
        }
        UpdateFCMToken updateFCMToken = (UpdateFCMToken) obj;
        if (Arrays.equals(this.walletAddresses, updateFCMToken.walletAddresses) && vx2.m53586b(this.oldFcmToken, updateFCMToken.oldFcmToken) && vx2.m53586b(this.newFcmToken, updateFCMToken.newFcmToken)) {
            return true;
        }
        return false;
    }

    public final String getNewFcmToken() {
        return this.newFcmToken;
    }

    public final String getOldFcmToken() {
        return this.oldFcmToken;
    }

    public final String[] getWalletAddresses() {
        return this.walletAddresses;
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.walletAddresses) * 31) + this.oldFcmToken.hashCode()) * 31) + this.newFcmToken.hashCode();
    }

    public final void setNewFcmToken(String str) {
        vx2.m53591g(str, "<set-?>");
        this.newFcmToken = str;
    }

    public final void setOldFcmToken(String str) {
        vx2.m53591g(str, "<set-?>");
        this.oldFcmToken = str;
    }

    public final void setWalletAddresses(String[] strArr) {
        vx2.m53591g(strArr, "<set-?>");
        this.walletAddresses = strArr;
    }

    public String toString() {
        String arrays = Arrays.toString(this.walletAddresses);
        String str = this.oldFcmToken;
        String str2 = this.newFcmToken;
        return "UpdateFCMToken(walletAddresses=" + arrays + ", oldFcmToken=" + str + ", newFcmToken=" + str2 + ")";
    }
}

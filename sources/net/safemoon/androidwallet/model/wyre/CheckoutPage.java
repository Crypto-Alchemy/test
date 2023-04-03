package net.safemoon.androidwallet.model.wyre;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/wyre/CheckoutPage;", "", "()V", "reservation", "", "getReservation", "()Ljava/lang/String;", "setReservation", "(Ljava/lang/String;)V", "url", "getUrl", "setUrl", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CheckoutPage.kt */
public final class CheckoutPage {
    @SerializedName("reservation")
    @Expose
    private String reservation;
    @SerializedName("url")
    @Expose
    private String url;

    public final String getReservation() {
        return this.reservation;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setReservation(String str) {
        this.reservation = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}

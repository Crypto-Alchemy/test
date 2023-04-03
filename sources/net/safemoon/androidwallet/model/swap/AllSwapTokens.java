package net.safemoon.androidwallet.model.swap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/swap/AllSwapTokens;", "Ljava/io/Serializable;", "()V", "data", "Lnet/safemoon/androidwallet/model/swap/Data;", "getData", "()Lnet/safemoon/androidwallet/model/swap/Data;", "setData", "(Lnet/safemoon/androidwallet/model/swap/Data;)V", "serialVersionUID", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: AllSwapTokens.kt */
public final class AllSwapTokens implements Serializable {
    @SerializedName("data")
    @Expose
    private Data data;
    private final long serialVersionUID = -844986117407541445L;

    public final Data getData() {
        return this.data;
    }

    public final void setData(Data data2) {
        this.data = data2;
    }
}

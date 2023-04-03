package net.safemoon.androidwallet.model.priceAlert;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/priceAlert/PriceAlertTokenListData;", "", "()V", "result", "Ljava/util/ArrayList;", "Lnet/safemoon/androidwallet/model/priceAlert/PriceAlertToken;", "Lkotlin/collections/ArrayList;", "getResult", "()Ljava/util/ArrayList;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: PriceAlertTokenListData.kt */
public final class PriceAlertTokenListData {
    @SerializedName("data")
    private final ArrayList<PriceAlertToken> result;

    public final ArrayList<PriceAlertToken> getResult() {
        return this.result;
    }
}

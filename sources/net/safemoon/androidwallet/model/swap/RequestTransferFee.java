package net.safemoon.androidwallet.model.swap;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/swap/RequestTransferFee;", "", "tokenAddress", "", "amount", "", "chainId", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAmount", "()Ljava/lang/Integer;", "setAmount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getChainId", "setChainId", "getTokenAddress", "()Ljava/lang/String;", "setTokenAddress", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/swap/RequestTransferFee;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RequestTransferFee.kt */
public final class RequestTransferFee {
    @SerializedName("amount")
    private Integer amount;
    @SerializedName("chainId")
    private Integer chainId;
    @SerializedName("tokenAddress")
    private String tokenAddress;

    public RequestTransferFee() {
        this((String) null, (Integer) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    public RequestTransferFee(String str, Integer num, Integer num2) {
        this.tokenAddress = str;
        this.amount = num;
        this.chainId = num2;
    }

    public static /* synthetic */ RequestTransferFee copy$default(RequestTransferFee requestTransferFee, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestTransferFee.tokenAddress;
        }
        if ((i & 2) != 0) {
            num = requestTransferFee.amount;
        }
        if ((i & 4) != 0) {
            num2 = requestTransferFee.chainId;
        }
        return requestTransferFee.copy(str, num, num2);
    }

    public final String component1() {
        return this.tokenAddress;
    }

    public final Integer component2() {
        return this.amount;
    }

    public final Integer component3() {
        return this.chainId;
    }

    public final RequestTransferFee copy(String str, Integer num, Integer num2) {
        return new RequestTransferFee(str, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestTransferFee)) {
            return false;
        }
        RequestTransferFee requestTransferFee = (RequestTransferFee) obj;
        return vx2.m53586b(this.tokenAddress, requestTransferFee.tokenAddress) && vx2.m53586b(this.amount, requestTransferFee.amount) && vx2.m53586b(this.chainId, requestTransferFee.chainId);
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final Integer getChainId() {
        return this.chainId;
    }

    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    public int hashCode() {
        String str = this.tokenAddress;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.amount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.chainId;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setAmount(Integer num) {
        this.amount = num;
    }

    public final void setChainId(Integer num) {
        this.chainId = num;
    }

    public final void setTokenAddress(String str) {
        this.tokenAddress = str;
    }

    public String toString() {
        String str = this.tokenAddress;
        Integer num = this.amount;
        Integer num2 = this.chainId;
        return "RequestTransferFee(tokenAddress=" + str + ", amount=" + num + ", chainId=" + num2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RequestTransferFee(String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}

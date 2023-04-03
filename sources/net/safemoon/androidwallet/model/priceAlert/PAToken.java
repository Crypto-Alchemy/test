package net.safemoon.androidwallet.model.priceAlert;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\\\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014¨\u0006*"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/priceAlert/PAToken;", "Ljava/io/Serializable;", "chainId", "", "name", "", "symbol", "contractAddress", "cmcId", "icon", "", "hasPriceAlert", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Z)V", "getChainId", "()I", "getCmcId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContractAddress", "()Ljava/lang/String;", "getHasPriceAlert", "()Z", "setHasPriceAlert", "(Z)V", "getIcon", "()Ljava/lang/Object;", "getName", "getSymbol", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Z)Lnet/safemoon/androidwallet/model/priceAlert/PAToken;", "equals", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: PAToken.kt */
public final class PAToken implements Serializable {
    private final int chainId;
    private final Integer cmcId;
    private final String contractAddress;
    private boolean hasPriceAlert;
    private final Object icon;
    private final String name;
    private final String symbol;

    public PAToken(int i, String str, String str2, String str3, Integer num, Object obj, boolean z) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        this.chainId = i;
        this.name = str;
        this.symbol = str2;
        this.contractAddress = str3;
        this.cmcId = num;
        this.icon = obj;
        this.hasPriceAlert = z;
    }

    public static /* synthetic */ PAToken copy$default(PAToken pAToken, int i, String str, String str2, String str3, Integer num, Object obj, boolean z, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = pAToken.chainId;
        }
        if ((i2 & 2) != 0) {
            str = pAToken.name;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = pAToken.symbol;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = pAToken.contractAddress;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            num = pAToken.cmcId;
        }
        Integer num2 = num;
        if ((i2 & 32) != 0) {
            obj = pAToken.icon;
        }
        Object obj3 = obj;
        if ((i2 & 64) != 0) {
            z = pAToken.hasPriceAlert;
        }
        return pAToken.copy(i, str4, str5, str6, num2, obj3, z);
    }

    public final int component1() {
        return this.chainId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.symbol;
    }

    public final String component4() {
        return this.contractAddress;
    }

    public final Integer component5() {
        return this.cmcId;
    }

    public final Object component6() {
        return this.icon;
    }

    public final boolean component7() {
        return this.hasPriceAlert;
    }

    public final PAToken copy(int i, String str, String str2, String str3, Integer num, Object obj, boolean z) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        return new PAToken(i, str, str2, str3, num, obj, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PAToken)) {
            return false;
        }
        PAToken pAToken = (PAToken) obj;
        return this.chainId == pAToken.chainId && vx2.m53586b(this.name, pAToken.name) && vx2.m53586b(this.symbol, pAToken.symbol) && vx2.m53586b(this.contractAddress, pAToken.contractAddress) && vx2.m53586b(this.cmcId, pAToken.cmcId) && vx2.m53586b(this.icon, pAToken.icon) && this.hasPriceAlert == pAToken.hasPriceAlert;
    }

    public final int getChainId() {
        return this.chainId;
    }

    public final Integer getCmcId() {
        return this.cmcId;
    }

    public final String getContractAddress() {
        return this.contractAddress;
    }

    public final boolean getHasPriceAlert() {
        return this.hasPriceAlert;
    }

    public final Object getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        int hashCode = ((this.chainId * 31) + this.name.hashCode()) * 31;
        String str = this.symbol;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contractAddress;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.cmcId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.icon;
        if (obj != null) {
            i = obj.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.hasPriceAlert;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final void setHasPriceAlert(boolean z) {
        this.hasPriceAlert = z;
    }

    public String toString() {
        int i = this.chainId;
        String str = this.name;
        String str2 = this.symbol;
        String str3 = this.contractAddress;
        Integer num = this.cmcId;
        Object obj = this.icon;
        boolean z = this.hasPriceAlert;
        return "PAToken(chainId=" + i + ", name=" + str + ", symbol=" + str2 + ", contractAddress=" + str3 + ", cmcId=" + num + ", icon=" + obj + ", hasPriceAlert=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PAToken(int i, String str, String str2, String str3, Integer num, Object obj, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : obj, (i2 & 64) != 0 ? false : z);
    }
}

package net.safemoon.androidwallet.p020ui.displayModel;

import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.google.gson.Gson;
import java.io.Serializable;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import net.safemoon.androidwallet.model.token.gson.GsonToken;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u001f\b\b\u0018\u0000 D2\u00020\u0001:\u0001EB{\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u0010\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\u0006\u0010!\u001a\u00020\u0010\u0012\b\b\u0002\u0010\"\u001a\u00020\u0010\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bB\u0010CJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0007HÆ\u0003J\t\u0010\r\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020\u00102\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010#\u001a\u00020\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\u0013\u0010)\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b0\u0010,R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b1\u0010,R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010*\u001a\u0004\b2\u0010,R\u0017\u0010\u001c\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010-\u001a\u0004\b3\u0010/R\u0017\u0010\u001d\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010-\u001a\u0004\b4\u0010/R\"\u0010\u001e\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0017\u0010\u001f\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010 \u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b \u0010:\u001a\u0004\b=\u0010<R\u0017\u0010!\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b!\u0010:\u001a\u0004\b>\u0010<R\u0017\u0010\"\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\"\u0010:\u001a\u0004\b?\u0010<R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b@\u0010,R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\bA\u0010,¨\u0006F"}, mo44877d2 = {"Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel;", "Ljava/io/Serializable;", "", "toString", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "toToken", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "", "component9", "component10", "component11", "component12", "component13", "component14", "symbolWithType", "iconResId", "name", "symbol", "contractAddress", "decimals", "chainId", "allowSwap", "priceInUsdt", "nativeBalance", "percentChange1h", "balanceInUSDT", "iconFile", "cmcId", "copy", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getSymbolWithType", "()Ljava/lang/String;", "I", "getIconResId", "()I", "getName", "getSymbol", "getContractAddress", "getDecimals", "getChainId", "Z", "getAllowSwap", "()Z", "setAllowSwap", "(Z)V", "D", "getPriceInUsdt", "()D", "getNativeBalance", "getPercentChange1h", "getBalanceInUSDT", "getIconFile", "getCmcId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZDDDDLjava/lang/String;Ljava/lang/String;)V", "Companion", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel */
/* compiled from: UserTokenItemDisplayModel.kt */
public final class UserTokenItemDisplayModel implements Serializable {
    public static final C8628a Companion = new C8628a((DefaultConstructorMarker) null);
    private boolean allowSwap;
    private final double balanceInUSDT;
    private final int chainId;
    private final String cmcId;
    private final String contractAddress;
    private final int decimals;
    private final String iconFile;
    private final int iconResId;
    private final String name;
    private final double nativeBalance;
    private final double percentChange1h;
    private final double priceInUsdt;
    private final String symbol;
    private final String symbolWithType;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/ui/displayModel/UserTokenItemDisplayModel$a;", "", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.ui.displayModel.UserTokenItemDisplayModel$a */
    /* compiled from: UserTokenItemDisplayModel.kt */
    public static final class C8628a {
        public C8628a() {
        }

        public /* synthetic */ C8628a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserTokenItemDisplayModel(String str, int i, String str2, String str3, String str4, int i2, int i3, boolean z, double d, double d2, double d3, double d4, String str5, String str6) {
        String str7 = str5;
        vx2.m53591g(str, "symbolWithType");
        vx2.m53591g(str2, PublicResolver.FUNC_NAME);
        vx2.m53591g(str3, "symbol");
        vx2.m53591g(str4, "contractAddress");
        vx2.m53591g(str7, "iconFile");
        this.symbolWithType = str;
        this.iconResId = i;
        this.name = str2;
        this.symbol = str3;
        this.contractAddress = str4;
        this.decimals = i2;
        this.chainId = i3;
        this.allowSwap = z;
        this.priceInUsdt = d;
        this.nativeBalance = d2;
        this.percentChange1h = d3;
        this.balanceInUSDT = d4;
        this.iconFile = str7;
        this.cmcId = str6;
    }

    public static /* synthetic */ UserTokenItemDisplayModel copy$default(UserTokenItemDisplayModel userTokenItemDisplayModel, String str, int i, String str2, String str3, String str4, int i2, int i3, boolean z, double d, double d2, double d3, double d4, String str5, String str6, int i4, Object obj) {
        UserTokenItemDisplayModel userTokenItemDisplayModel2 = userTokenItemDisplayModel;
        int i5 = i4;
        return userTokenItemDisplayModel.copy((i5 & 1) != 0 ? userTokenItemDisplayModel2.symbolWithType : str, (i5 & 2) != 0 ? userTokenItemDisplayModel2.iconResId : i, (i5 & 4) != 0 ? userTokenItemDisplayModel2.name : str2, (i5 & 8) != 0 ? userTokenItemDisplayModel2.symbol : str3, (i5 & 16) != 0 ? userTokenItemDisplayModel2.contractAddress : str4, (i5 & 32) != 0 ? userTokenItemDisplayModel2.decimals : i2, (i5 & 64) != 0 ? userTokenItemDisplayModel2.chainId : i3, (i5 & 128) != 0 ? userTokenItemDisplayModel2.allowSwap : z, (i5 & 256) != 0 ? userTokenItemDisplayModel2.priceInUsdt : d, (i5 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? userTokenItemDisplayModel2.nativeBalance : d2, (i5 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? userTokenItemDisplayModel2.percentChange1h : d3, (i5 & 2048) != 0 ? userTokenItemDisplayModel2.balanceInUSDT : d4, (i5 & 4096) != 0 ? userTokenItemDisplayModel2.iconFile : str5, (i5 & 8192) != 0 ? userTokenItemDisplayModel2.cmcId : str6);
    }

    public final String component1() {
        return this.symbolWithType;
    }

    public final double component10() {
        return this.nativeBalance;
    }

    public final double component11() {
        return this.percentChange1h;
    }

    public final double component12() {
        return this.balanceInUSDT;
    }

    public final String component13() {
        return this.iconFile;
    }

    public final String component14() {
        return this.cmcId;
    }

    public final int component2() {
        return this.iconResId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.symbol;
    }

    public final String component5() {
        return this.contractAddress;
    }

    public final int component6() {
        return this.decimals;
    }

    public final int component7() {
        return this.chainId;
    }

    public final boolean component8() {
        return this.allowSwap;
    }

    public final double component9() {
        return this.priceInUsdt;
    }

    public final UserTokenItemDisplayModel copy(String str, int i, String str2, String str3, String str4, int i2, int i3, boolean z, double d, double d2, double d3, double d4, String str5, String str6) {
        String str7 = str;
        vx2.m53591g(str7, "symbolWithType");
        vx2.m53591g(str2, PublicResolver.FUNC_NAME);
        vx2.m53591g(str3, "symbol");
        vx2.m53591g(str4, "contractAddress");
        vx2.m53591g(str5, "iconFile");
        return new UserTokenItemDisplayModel(str7, i, str2, str3, str4, i2, i3, z, d, d2, d3, d4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserTokenItemDisplayModel)) {
            return false;
        }
        UserTokenItemDisplayModel userTokenItemDisplayModel = (UserTokenItemDisplayModel) obj;
        return vx2.m53586b(this.symbolWithType, userTokenItemDisplayModel.symbolWithType) && this.iconResId == userTokenItemDisplayModel.iconResId && vx2.m53586b(this.name, userTokenItemDisplayModel.name) && vx2.m53586b(this.symbol, userTokenItemDisplayModel.symbol) && vx2.m53586b(this.contractAddress, userTokenItemDisplayModel.contractAddress) && this.decimals == userTokenItemDisplayModel.decimals && this.chainId == userTokenItemDisplayModel.chainId && this.allowSwap == userTokenItemDisplayModel.allowSwap && Double.compare(this.priceInUsdt, userTokenItemDisplayModel.priceInUsdt) == 0 && Double.compare(this.nativeBalance, userTokenItemDisplayModel.nativeBalance) == 0 && Double.compare(this.percentChange1h, userTokenItemDisplayModel.percentChange1h) == 0 && Double.compare(this.balanceInUSDT, userTokenItemDisplayModel.balanceInUSDT) == 0 && vx2.m53586b(this.iconFile, userTokenItemDisplayModel.iconFile) && vx2.m53586b(this.cmcId, userTokenItemDisplayModel.cmcId);
    }

    public final boolean getAllowSwap() {
        return this.allowSwap;
    }

    public final double getBalanceInUSDT() {
        return this.balanceInUSDT;
    }

    public final int getChainId() {
        return this.chainId;
    }

    public final String getCmcId() {
        return this.cmcId;
    }

    public final String getContractAddress() {
        return this.contractAddress;
    }

    public final int getDecimals() {
        return this.decimals;
    }

    public final String getIconFile() {
        return this.iconFile;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final String getName() {
        return this.name;
    }

    public final double getNativeBalance() {
        return this.nativeBalance;
    }

    public final double getPercentChange1h() {
        return this.percentChange1h;
    }

    public final double getPriceInUsdt() {
        return this.priceInUsdt;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getSymbolWithType() {
        return this.symbolWithType;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.symbolWithType.hashCode() * 31) + this.iconResId) * 31) + this.name.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.contractAddress.hashCode()) * 31) + this.decimals) * 31) + this.chainId) * 31;
        boolean z = this.allowSwap;
        if (z) {
            z = true;
        }
        int a = (((((((((((hashCode + (z ? 1 : 0)) * 31) + Double.doubleToLongBits(this.priceInUsdt)) * 31) + Double.doubleToLongBits(this.nativeBalance)) * 31) + Double.doubleToLongBits(this.percentChange1h)) * 31) + Double.doubleToLongBits(this.balanceInUSDT)) * 31) + this.iconFile.hashCode()) * 31;
        String str = this.cmcId;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final void setAllowSwap(boolean z) {
        this.allowSwap = z;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this, (Type) UserTokenItemDisplayModel.class);
        vx2.m53590f(json, "Gson().toJson(this, User…DisplayModel::class.java)");
        return json;
    }

    public final IToken toToken() {
        String str = this.symbolWithType;
        return new GsonToken(this.name, this.symbol, "", this.contractAddress, this.chainId, this.decimals, this.allowSwap, str, 0, (String) null, this.priceInUsdt, this.nativeBalance, Utils.DOUBLE_EPSILON, 4864, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserTokenItemDisplayModel(String str, int i, String str2, String str3, String str4, int i2, int i3, boolean z, double d, double d2, double d3, double d4, String str5, String str6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, str4, i2, i3, z, d, d2, d3, (i4 & 2048) != 0 ? 0.0d : d4, str5, str6);
    }
}

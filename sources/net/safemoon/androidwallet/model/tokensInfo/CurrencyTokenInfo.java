package net.safemoon.androidwallet.model.tokensInfo;

import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import org.web3j.abi.datatypes.Address;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001:\u0007KLMNOPQB\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010;\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00101J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003J\t\u0010A\u001a\u00020\u000bHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jº\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0019HÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006R"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo;", "", "tokenAddress", "", "pairAddress", "changeId", "dexId", "url", "baseToken", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$BaseToken;", "quoteToken", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$QuoteToken;", "priceNative", "priceUsd", "txns", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Txns;", "volume", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Volume;", "priceChange", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$PriceChange;", "liquidity", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Liquidity;", "fdv", "", "version", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$BaseToken;Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$QuoteToken;Ljava/lang/String;Ljava/lang/String;Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Txns;Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Volume;Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$PriceChange;Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Liquidity;Ljava/lang/Double;Ljava/lang/Integer;)V", "getBaseToken", "()Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$BaseToken;", "getChangeId", "()Ljava/lang/String;", "getDexId", "getFdv", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLiquidity", "()Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Liquidity;", "getPairAddress", "getPriceChange", "()Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$PriceChange;", "getPriceNative", "getPriceUsd", "getQuoteToken", "()Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$QuoteToken;", "getTokenAddress", "getTxns", "()Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Txns;", "getUrl", "getVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVolume", "()Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Volume;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$BaseToken;Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$QuoteToken;Ljava/lang/String;Ljava/lang/String;Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Txns;Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Volume;Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$PriceChange;Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Liquidity;Ljava/lang/Double;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo;", "equals", "", "other", "hashCode", "toString", "BaseToken", "Liquidity", "PriceChange", "QuoteToken", "Txns", "TxnsUnit", "Volume", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: CurrencyTokenInfo.kt */
public final class CurrencyTokenInfo {
    @SerializedName("baseToken")
    private final BaseToken baseToken;
    @SerializedName("changeId")
    private final String changeId;
    @SerializedName("dexId")
    private final String dexId;
    @SerializedName("fdv")
    private final Double fdv;
    @SerializedName("liquidity")
    private final Liquidity liquidity;
    @SerializedName("pairAddress")
    private final String pairAddress;
    @SerializedName("priceChange")
    private final PriceChange priceChange;
    @SerializedName("priceNative")
    private final String priceNative;
    @SerializedName("priceUsd")
    private final String priceUsd;
    @SerializedName("quoteToken")
    private final QuoteToken quoteToken;
    @SerializedName("tokenAddress")
    private final String tokenAddress;
    @SerializedName("txns")
    private final Txns txns;
    @SerializedName("url")
    private final String url;
    @SerializedName("version")
    private final Integer version;
    @SerializedName("volume")
    private final Volume volume;

    @Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$BaseToken;", "", "address", "", "name", "symbol", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getName", "getSymbol", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: CurrencyTokenInfo.kt */
    public static final class BaseToken {
        @SerializedName("address")
        private final String address;
        @SerializedName("name")
        private final String name;
        @SerializedName("symbol")
        private final String symbol;

        public BaseToken(String str, String str2, String str3) {
            vx2.m53591g(str, Address.TYPE_NAME);
            vx2.m53591g(str2, PublicResolver.FUNC_NAME);
            vx2.m53591g(str3, "symbol");
            this.address = str;
            this.name = str2;
            this.symbol = str3;
        }

        public static /* synthetic */ BaseToken copy$default(BaseToken baseToken, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = baseToken.address;
            }
            if ((i & 2) != 0) {
                str2 = baseToken.name;
            }
            if ((i & 4) != 0) {
                str3 = baseToken.symbol;
            }
            return baseToken.copy(str, str2, str3);
        }

        public final String component1() {
            return this.address;
        }

        public final String component2() {
            return this.name;
        }

        public final String component3() {
            return this.symbol;
        }

        public final BaseToken copy(String str, String str2, String str3) {
            vx2.m53591g(str, Address.TYPE_NAME);
            vx2.m53591g(str2, PublicResolver.FUNC_NAME);
            vx2.m53591g(str3, "symbol");
            return new BaseToken(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BaseToken)) {
                return false;
            }
            BaseToken baseToken = (BaseToken) obj;
            return vx2.m53586b(this.address, baseToken.address) && vx2.m53586b(this.name, baseToken.name) && vx2.m53586b(this.symbol, baseToken.symbol);
        }

        public final String getAddress() {
            return this.address;
        }

        public final String getName() {
            return this.name;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            return (((this.address.hashCode() * 31) + this.name.hashCode()) * 31) + this.symbol.hashCode();
        }

        public String toString() {
            String str = this.address;
            String str2 = this.name;
            String str3 = this.symbol;
            return "BaseToken(address=" + str + ", name=" + str2 + ", symbol=" + str3 + ")";
        }
    }

    @Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u0018"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Liquidity;", "", "usd", "", "base", "quote", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getBase", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getQuote", "getUsd", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Liquidity;", "equals", "", "other", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: CurrencyTokenInfo.kt */
    public static final class Liquidity {
        @SerializedName("base")
        private final Double base;
        @SerializedName("quote")
        private final Double quote;
        @SerializedName("usd")
        private final Double usd;

        public Liquidity(Double d, Double d2, Double d3) {
            this.usd = d;
            this.base = d2;
            this.quote = d3;
        }

        public static /* synthetic */ Liquidity copy$default(Liquidity liquidity, Double d, Double d2, Double d3, int i, Object obj) {
            if ((i & 1) != 0) {
                d = liquidity.usd;
            }
            if ((i & 2) != 0) {
                d2 = liquidity.base;
            }
            if ((i & 4) != 0) {
                d3 = liquidity.quote;
            }
            return liquidity.copy(d, d2, d3);
        }

        public final Double component1() {
            return this.usd;
        }

        public final Double component2() {
            return this.base;
        }

        public final Double component3() {
            return this.quote;
        }

        public final Liquidity copy(Double d, Double d2, Double d3) {
            return new Liquidity(d, d2, d3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Liquidity)) {
                return false;
            }
            Liquidity liquidity = (Liquidity) obj;
            return vx2.m53586b(this.usd, liquidity.usd) && vx2.m53586b(this.base, liquidity.base) && vx2.m53586b(this.quote, liquidity.quote);
        }

        public final Double getBase() {
            return this.base;
        }

        public final Double getQuote() {
            return this.quote;
        }

        public final Double getUsd() {
            return this.usd;
        }

        public int hashCode() {
            Double d = this.usd;
            int i = 0;
            int hashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d2 = this.base;
            int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
            Double d3 = this.quote;
            if (d3 != null) {
                i = d3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            Double d = this.usd;
            Double d2 = this.base;
            Double d3 = this.quote;
            return "Liquidity(usd=" + d + ", base=" + d2 + ", quote=" + d3 + ")";
        }
    }

    @Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ>\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t¨\u0006\u001b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$PriceChange;", "", "h24", "", "h6", "h1", "m5", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getH1", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getH24", "getH6", "getM5", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$PriceChange;", "equals", "", "other", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: CurrencyTokenInfo.kt */
    public static final class PriceChange {
        @SerializedName("h1")

        /* renamed from: h1 */
        private final Double f42474h1;
        @SerializedName("h24")
        private final Double h24;
        @SerializedName("h6")

        /* renamed from: h6 */
        private final Double f42475h6;
        @SerializedName("m5")

        /* renamed from: m5 */
        private final Double f42476m5;

        public PriceChange(Double d, Double d2, Double d3, Double d4) {
            this.h24 = d;
            this.f42475h6 = d2;
            this.f42474h1 = d3;
            this.f42476m5 = d4;
        }

        public static /* synthetic */ PriceChange copy$default(PriceChange priceChange, Double d, Double d2, Double d3, Double d4, int i, Object obj) {
            if ((i & 1) != 0) {
                d = priceChange.h24;
            }
            if ((i & 2) != 0) {
                d2 = priceChange.f42475h6;
            }
            if ((i & 4) != 0) {
                d3 = priceChange.f42474h1;
            }
            if ((i & 8) != 0) {
                d4 = priceChange.f42476m5;
            }
            return priceChange.copy(d, d2, d3, d4);
        }

        public final Double component1() {
            return this.h24;
        }

        public final Double component2() {
            return this.f42475h6;
        }

        public final Double component3() {
            return this.f42474h1;
        }

        public final Double component4() {
            return this.f42476m5;
        }

        public final PriceChange copy(Double d, Double d2, Double d3, Double d4) {
            return new PriceChange(d, d2, d3, d4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PriceChange)) {
                return false;
            }
            PriceChange priceChange = (PriceChange) obj;
            return vx2.m53586b(this.h24, priceChange.h24) && vx2.m53586b(this.f42475h6, priceChange.f42475h6) && vx2.m53586b(this.f42474h1, priceChange.f42474h1) && vx2.m53586b(this.f42476m5, priceChange.f42476m5);
        }

        public final Double getH1() {
            return this.f42474h1;
        }

        public final Double getH24() {
            return this.h24;
        }

        public final Double getH6() {
            return this.f42475h6;
        }

        public final Double getM5() {
            return this.f42476m5;
        }

        public int hashCode() {
            Double d = this.h24;
            int i = 0;
            int hashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d2 = this.f42475h6;
            int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
            Double d3 = this.f42474h1;
            int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
            Double d4 = this.f42476m5;
            if (d4 != null) {
                i = d4.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            Double d = this.h24;
            Double d2 = this.f42475h6;
            Double d3 = this.f42474h1;
            Double d4 = this.f42476m5;
            return "PriceChange(h24=" + d + ", h6=" + d2 + ", h1=" + d3 + ", m5=" + d4 + ")";
        }
    }

    @Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$QuoteToken;", "", "symbol", "", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: CurrencyTokenInfo.kt */
    public static final class QuoteToken {
        @SerializedName("symbol")
        private final String symbol;

        public QuoteToken(String str) {
            vx2.m53591g(str, "symbol");
            this.symbol = str;
        }

        public static /* synthetic */ QuoteToken copy$default(QuoteToken quoteToken, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = quoteToken.symbol;
            }
            return quoteToken.copy(str);
        }

        public final String component1() {
            return this.symbol;
        }

        public final QuoteToken copy(String str) {
            vx2.m53591g(str, "symbol");
            return new QuoteToken(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuoteToken) && vx2.m53586b(this.symbol, ((QuoteToken) obj).symbol);
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public int hashCode() {
            return this.symbol.hashCode();
        }

        public String toString() {
            String str = this.symbol;
            return "QuoteToken(symbol=" + str + ")";
        }
    }

    @Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Txns;", "", "h24", "Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$TxnsUnit;", "h6", "h1", "m5", "(Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$TxnsUnit;Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$TxnsUnit;Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$TxnsUnit;Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$TxnsUnit;)V", "getH1", "()Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$TxnsUnit;", "getH24", "getH6", "getM5", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: CurrencyTokenInfo.kt */
    public static final class Txns {
        @SerializedName("h1")

        /* renamed from: h1 */
        private final TxnsUnit f42477h1;
        @SerializedName("h24")
        private final TxnsUnit h24;
        @SerializedName("h6")

        /* renamed from: h6 */
        private final TxnsUnit f42478h6;
        @SerializedName("m5")

        /* renamed from: m5 */
        private final TxnsUnit f42479m5;

        public Txns(TxnsUnit txnsUnit, TxnsUnit txnsUnit2, TxnsUnit txnsUnit3, TxnsUnit txnsUnit4) {
            this.h24 = txnsUnit;
            this.f42478h6 = txnsUnit2;
            this.f42477h1 = txnsUnit3;
            this.f42479m5 = txnsUnit4;
        }

        public static /* synthetic */ Txns copy$default(Txns txns, TxnsUnit txnsUnit, TxnsUnit txnsUnit2, TxnsUnit txnsUnit3, TxnsUnit txnsUnit4, int i, Object obj) {
            if ((i & 1) != 0) {
                txnsUnit = txns.h24;
            }
            if ((i & 2) != 0) {
                txnsUnit2 = txns.f42478h6;
            }
            if ((i & 4) != 0) {
                txnsUnit3 = txns.f42477h1;
            }
            if ((i & 8) != 0) {
                txnsUnit4 = txns.f42479m5;
            }
            return txns.copy(txnsUnit, txnsUnit2, txnsUnit3, txnsUnit4);
        }

        public final TxnsUnit component1() {
            return this.h24;
        }

        public final TxnsUnit component2() {
            return this.f42478h6;
        }

        public final TxnsUnit component3() {
            return this.f42477h1;
        }

        public final TxnsUnit component4() {
            return this.f42479m5;
        }

        public final Txns copy(TxnsUnit txnsUnit, TxnsUnit txnsUnit2, TxnsUnit txnsUnit3, TxnsUnit txnsUnit4) {
            return new Txns(txnsUnit, txnsUnit2, txnsUnit3, txnsUnit4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Txns)) {
                return false;
            }
            Txns txns = (Txns) obj;
            return vx2.m53586b(this.h24, txns.h24) && vx2.m53586b(this.f42478h6, txns.f42478h6) && vx2.m53586b(this.f42477h1, txns.f42477h1) && vx2.m53586b(this.f42479m5, txns.f42479m5);
        }

        public final TxnsUnit getH1() {
            return this.f42477h1;
        }

        public final TxnsUnit getH24() {
            return this.h24;
        }

        public final TxnsUnit getH6() {
            return this.f42478h6;
        }

        public final TxnsUnit getM5() {
            return this.f42479m5;
        }

        public int hashCode() {
            TxnsUnit txnsUnit = this.h24;
            int i = 0;
            int hashCode = (txnsUnit == null ? 0 : txnsUnit.hashCode()) * 31;
            TxnsUnit txnsUnit2 = this.f42478h6;
            int hashCode2 = (hashCode + (txnsUnit2 == null ? 0 : txnsUnit2.hashCode())) * 31;
            TxnsUnit txnsUnit3 = this.f42477h1;
            int hashCode3 = (hashCode2 + (txnsUnit3 == null ? 0 : txnsUnit3.hashCode())) * 31;
            TxnsUnit txnsUnit4 = this.f42479m5;
            if (txnsUnit4 != null) {
                i = txnsUnit4.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            TxnsUnit txnsUnit = this.h24;
            TxnsUnit txnsUnit2 = this.f42478h6;
            TxnsUnit txnsUnit3 = this.f42477h1;
            TxnsUnit txnsUnit4 = this.f42479m5;
            return "Txns(h24=" + txnsUnit + ", h6=" + txnsUnit2 + ", h1=" + txnsUnit3 + ", m5=" + txnsUnit4 + ")";
        }
    }

    @Metadata(mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$TxnsUnit;", "", "buys", "", "sells", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBuys", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSells", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$TxnsUnit;", "equals", "", "other", "hashCode", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: CurrencyTokenInfo.kt */
    public static final class TxnsUnit {
        @SerializedName("buys")
        private final Integer buys;
        @SerializedName("sells")
        private final Integer sells;

        public TxnsUnit(Integer num, Integer num2) {
            this.buys = num;
            this.sells = num2;
        }

        public static /* synthetic */ TxnsUnit copy$default(TxnsUnit txnsUnit, Integer num, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = txnsUnit.buys;
            }
            if ((i & 2) != 0) {
                num2 = txnsUnit.sells;
            }
            return txnsUnit.copy(num, num2);
        }

        public final Integer component1() {
            return this.buys;
        }

        public final Integer component2() {
            return this.sells;
        }

        public final TxnsUnit copy(Integer num, Integer num2) {
            return new TxnsUnit(num, num2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TxnsUnit)) {
                return false;
            }
            TxnsUnit txnsUnit = (TxnsUnit) obj;
            return vx2.m53586b(this.buys, txnsUnit.buys) && vx2.m53586b(this.sells, txnsUnit.sells);
        }

        public final Integer getBuys() {
            return this.buys;
        }

        public final Integer getSells() {
            return this.sells;
        }

        public int hashCode() {
            Integer num = this.buys;
            int i = 0;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.sells;
            if (num2 != null) {
                i = num2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            Integer num = this.buys;
            Integer num2 = this.sells;
            return "TxnsUnit(buys=" + num + ", sells=" + num2 + ")";
        }
    }

    @Metadata(mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ>\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t¨\u0006\u001b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Volume;", "", "h24", "", "h6", "h1", "m5", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getH1", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getH24", "getH6", "getM5", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo$Volume;", "equals", "", "other", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: CurrencyTokenInfo.kt */
    public static final class Volume {
        @SerializedName("h1")

        /* renamed from: h1 */
        private final Double f42480h1;
        @SerializedName("h24")
        private final Double h24;
        @SerializedName("h6")

        /* renamed from: h6 */
        private final Double f42481h6;
        @SerializedName("m5")

        /* renamed from: m5 */
        private final Double f42482m5;

        public Volume(Double d, Double d2, Double d3, Double d4) {
            this.h24 = d;
            this.f42481h6 = d2;
            this.f42480h1 = d3;
            this.f42482m5 = d4;
        }

        public static /* synthetic */ Volume copy$default(Volume volume, Double d, Double d2, Double d3, Double d4, int i, Object obj) {
            if ((i & 1) != 0) {
                d = volume.h24;
            }
            if ((i & 2) != 0) {
                d2 = volume.f42481h6;
            }
            if ((i & 4) != 0) {
                d3 = volume.f42480h1;
            }
            if ((i & 8) != 0) {
                d4 = volume.f42482m5;
            }
            return volume.copy(d, d2, d3, d4);
        }

        public final Double component1() {
            return this.h24;
        }

        public final Double component2() {
            return this.f42481h6;
        }

        public final Double component3() {
            return this.f42480h1;
        }

        public final Double component4() {
            return this.f42482m5;
        }

        public final Volume copy(Double d, Double d2, Double d3, Double d4) {
            return new Volume(d, d2, d3, d4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Volume)) {
                return false;
            }
            Volume volume = (Volume) obj;
            return vx2.m53586b(this.h24, volume.h24) && vx2.m53586b(this.f42481h6, volume.f42481h6) && vx2.m53586b(this.f42480h1, volume.f42480h1) && vx2.m53586b(this.f42482m5, volume.f42482m5);
        }

        public final Double getH1() {
            return this.f42480h1;
        }

        public final Double getH24() {
            return this.h24;
        }

        public final Double getH6() {
            return this.f42481h6;
        }

        public final Double getM5() {
            return this.f42482m5;
        }

        public int hashCode() {
            Double d = this.h24;
            int i = 0;
            int hashCode = (d == null ? 0 : d.hashCode()) * 31;
            Double d2 = this.f42481h6;
            int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
            Double d3 = this.f42480h1;
            int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
            Double d4 = this.f42482m5;
            if (d4 != null) {
                i = d4.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            Double d = this.h24;
            Double d2 = this.f42481h6;
            Double d3 = this.f42480h1;
            Double d4 = this.f42482m5;
            return "Volume(h24=" + d + ", h6=" + d2 + ", h1=" + d3 + ", m5=" + d4 + ")";
        }
    }

    public CurrencyTokenInfo(String str, String str2, String str3, String str4, String str5, BaseToken baseToken2, QuoteToken quoteToken2, String str6, String str7, Txns txns2, Volume volume2, PriceChange priceChange2, Liquidity liquidity2, Double d, Integer num) {
        vx2.m53591g(str4, "dexId");
        vx2.m53591g(str5, "url");
        vx2.m53591g(baseToken2, "baseToken");
        vx2.m53591g(quoteToken2, "quoteToken");
        this.tokenAddress = str;
        this.pairAddress = str2;
        this.changeId = str3;
        this.dexId = str4;
        this.url = str5;
        this.baseToken = baseToken2;
        this.quoteToken = quoteToken2;
        this.priceNative = str6;
        this.priceUsd = str7;
        this.txns = txns2;
        this.volume = volume2;
        this.priceChange = priceChange2;
        this.liquidity = liquidity2;
        this.fdv = d;
        this.version = num;
    }

    public static /* synthetic */ CurrencyTokenInfo copy$default(CurrencyTokenInfo currencyTokenInfo, String str, String str2, String str3, String str4, String str5, BaseToken baseToken2, QuoteToken quoteToken2, String str6, String str7, Txns txns2, Volume volume2, PriceChange priceChange2, Liquidity liquidity2, Double d, Integer num, int i, Object obj) {
        CurrencyTokenInfo currencyTokenInfo2 = currencyTokenInfo;
        int i2 = i;
        return currencyTokenInfo.copy((i2 & 1) != 0 ? currencyTokenInfo2.tokenAddress : str, (i2 & 2) != 0 ? currencyTokenInfo2.pairAddress : str2, (i2 & 4) != 0 ? currencyTokenInfo2.changeId : str3, (i2 & 8) != 0 ? currencyTokenInfo2.dexId : str4, (i2 & 16) != 0 ? currencyTokenInfo2.url : str5, (i2 & 32) != 0 ? currencyTokenInfo2.baseToken : baseToken2, (i2 & 64) != 0 ? currencyTokenInfo2.quoteToken : quoteToken2, (i2 & 128) != 0 ? currencyTokenInfo2.priceNative : str6, (i2 & 256) != 0 ? currencyTokenInfo2.priceUsd : str7, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? currencyTokenInfo2.txns : txns2, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? currencyTokenInfo2.volume : volume2, (i2 & 2048) != 0 ? currencyTokenInfo2.priceChange : priceChange2, (i2 & 4096) != 0 ? currencyTokenInfo2.liquidity : liquidity2, (i2 & 8192) != 0 ? currencyTokenInfo2.fdv : d, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? currencyTokenInfo2.version : num);
    }

    public final String component1() {
        return this.tokenAddress;
    }

    public final Txns component10() {
        return this.txns;
    }

    public final Volume component11() {
        return this.volume;
    }

    public final PriceChange component12() {
        return this.priceChange;
    }

    public final Liquidity component13() {
        return this.liquidity;
    }

    public final Double component14() {
        return this.fdv;
    }

    public final Integer component15() {
        return this.version;
    }

    public final String component2() {
        return this.pairAddress;
    }

    public final String component3() {
        return this.changeId;
    }

    public final String component4() {
        return this.dexId;
    }

    public final String component5() {
        return this.url;
    }

    public final BaseToken component6() {
        return this.baseToken;
    }

    public final QuoteToken component7() {
        return this.quoteToken;
    }

    public final String component8() {
        return this.priceNative;
    }

    public final String component9() {
        return this.priceUsd;
    }

    public final CurrencyTokenInfo copy(String str, String str2, String str3, String str4, String str5, BaseToken baseToken2, QuoteToken quoteToken2, String str6, String str7, Txns txns2, Volume volume2, PriceChange priceChange2, Liquidity liquidity2, Double d, Integer num) {
        String str8 = str4;
        vx2.m53591g(str8, "dexId");
        String str9 = str5;
        vx2.m53591g(str9, "url");
        BaseToken baseToken3 = baseToken2;
        vx2.m53591g(baseToken3, "baseToken");
        QuoteToken quoteToken3 = quoteToken2;
        vx2.m53591g(quoteToken3, "quoteToken");
        return new CurrencyTokenInfo(str, str2, str3, str8, str9, baseToken3, quoteToken3, str6, str7, txns2, volume2, priceChange2, liquidity2, d, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrencyTokenInfo)) {
            return false;
        }
        CurrencyTokenInfo currencyTokenInfo = (CurrencyTokenInfo) obj;
        return vx2.m53586b(this.tokenAddress, currencyTokenInfo.tokenAddress) && vx2.m53586b(this.pairAddress, currencyTokenInfo.pairAddress) && vx2.m53586b(this.changeId, currencyTokenInfo.changeId) && vx2.m53586b(this.dexId, currencyTokenInfo.dexId) && vx2.m53586b(this.url, currencyTokenInfo.url) && vx2.m53586b(this.baseToken, currencyTokenInfo.baseToken) && vx2.m53586b(this.quoteToken, currencyTokenInfo.quoteToken) && vx2.m53586b(this.priceNative, currencyTokenInfo.priceNative) && vx2.m53586b(this.priceUsd, currencyTokenInfo.priceUsd) && vx2.m53586b(this.txns, currencyTokenInfo.txns) && vx2.m53586b(this.volume, currencyTokenInfo.volume) && vx2.m53586b(this.priceChange, currencyTokenInfo.priceChange) && vx2.m53586b(this.liquidity, currencyTokenInfo.liquidity) && vx2.m53586b(this.fdv, currencyTokenInfo.fdv) && vx2.m53586b(this.version, currencyTokenInfo.version);
    }

    public final BaseToken getBaseToken() {
        return this.baseToken;
    }

    public final String getChangeId() {
        return this.changeId;
    }

    public final String getDexId() {
        return this.dexId;
    }

    public final Double getFdv() {
        return this.fdv;
    }

    public final Liquidity getLiquidity() {
        return this.liquidity;
    }

    public final String getPairAddress() {
        return this.pairAddress;
    }

    public final PriceChange getPriceChange() {
        return this.priceChange;
    }

    public final String getPriceNative() {
        return this.priceNative;
    }

    public final String getPriceUsd() {
        return this.priceUsd;
    }

    public final QuoteToken getQuoteToken() {
        return this.quoteToken;
    }

    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    public final Txns getTxns() {
        return this.txns;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final Volume getVolume() {
        return this.volume;
    }

    public int hashCode() {
        String str = this.tokenAddress;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pairAddress;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.changeId;
        int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.dexId.hashCode()) * 31) + this.url.hashCode()) * 31) + this.baseToken.hashCode()) * 31) + this.quoteToken.hashCode()) * 31;
        String str4 = this.priceNative;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.priceUsd;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Txns txns2 = this.txns;
        int hashCode6 = (hashCode5 + (txns2 == null ? 0 : txns2.hashCode())) * 31;
        Volume volume2 = this.volume;
        int hashCode7 = (hashCode6 + (volume2 == null ? 0 : volume2.hashCode())) * 31;
        PriceChange priceChange2 = this.priceChange;
        int hashCode8 = (hashCode7 + (priceChange2 == null ? 0 : priceChange2.hashCode())) * 31;
        Liquidity liquidity2 = this.liquidity;
        int hashCode9 = (hashCode8 + (liquidity2 == null ? 0 : liquidity2.hashCode())) * 31;
        Double d = this.fdv;
        int hashCode10 = (hashCode9 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.version;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode10 + i;
    }

    public String toString() {
        String str = this.tokenAddress;
        String str2 = this.pairAddress;
        String str3 = this.changeId;
        String str4 = this.dexId;
        String str5 = this.url;
        BaseToken baseToken2 = this.baseToken;
        QuoteToken quoteToken2 = this.quoteToken;
        String str6 = this.priceNative;
        String str7 = this.priceUsd;
        Txns txns2 = this.txns;
        Volume volume2 = this.volume;
        PriceChange priceChange2 = this.priceChange;
        Liquidity liquidity2 = this.liquidity;
        Double d = this.fdv;
        Integer num = this.version;
        return "CurrencyTokenInfo(tokenAddress=" + str + ", pairAddress=" + str2 + ", changeId=" + str3 + ", dexId=" + str4 + ", url=" + str5 + ", baseToken=" + baseToken2 + ", quoteToken=" + quoteToken2 + ", priceNative=" + str6 + ", priceUsd=" + str7 + ", txns=" + txns2 + ", volume=" + volume2 + ", priceChange=" + priceChange2 + ", liquidity=" + liquidity2 + ", fdv=" + d + ", version=" + num + ")";
    }
}

package net.safemoon.androidwallet.model.priceAlert;

import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\bv\b\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010)\u001a\u00020\n\u0012\b\b\u0002\u0010*\u001a\u00020\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\u0002\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010-\u001a\u00020\u0002\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010/\u001a\u00020\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u00102\u001a\u00020\n\u0012\b\b\u0002\u00103\u001a\u00020\u0007\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b\u0001\u0010\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u0012\u001a\u00020\nHÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\t\u0010\u001a\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0012\u0010 \u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b \u0010\u0017Jþ\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010)\u001a\u00020\n2\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010-\u001a\u00020\u00022\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010/\u001a\u00020\u00022\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u00102\u001a\u00020\n2\b\b\u0002\u00103\u001a\u00020\u00072\n\b\u0002\u00104\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b6\u00107J\t\u00108\u001a\u00020\nHÖ\u0001J\t\u00109\u001a\u00020\u0007HÖ\u0001J\u0013\u0010;\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010!\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010<\u001a\u0004\b=\u0010\t\"\u0004\b>\u0010?R$\u0010\"\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010#\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010@\u001a\u0004\bE\u0010B\"\u0004\bF\u0010DR$\u0010$\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010@\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR$\u0010%\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR$\u0010&\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010<\u001a\u0004\bK\u0010\t\"\u0004\bL\u0010?R$\u0010'\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010@\u001a\u0004\bM\u0010B\"\u0004\bN\u0010DR$\u0010(\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010@\u001a\u0004\bO\u0010B\"\u0004\bP\u0010DR\"\u0010)\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010@\u001a\u0004\bQ\u0010B\"\u0004\b\u0005\u0010DR\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010+\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010R\u001a\u0004\bW\u0010T\"\u0004\bX\u0010VR$\u0010,\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010Y\u001a\u0004\bZ\u0010\u0017\"\u0004\b[\u0010\\R\"\u0010-\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010R\u001a\u0004\b]\u0010T\"\u0004\b^\u0010VR$\u0010.\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010Y\u001a\u0004\b_\u0010\u0017\"\u0004\b`\u0010\\R\"\u0010/\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u0010R\u001a\u0004\ba\u0010T\"\u0004\bb\u0010VR$\u00100\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u0010Y\u001a\u0004\bc\u0010\u0017\"\u0004\bd\u0010\\R$\u00101\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u0010Y\u001a\u0004\be\u0010\u0017\"\u0004\bf\u0010\\R\u001a\u00102\u001a\u00020\n8\u0006X\u0004¢\u0006\f\n\u0004\b2\u0010@\u001a\u0004\bg\u0010BR\"\u00103\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u00104\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u0010@\u001a\u0004\bm\u0010B\"\u0004\bn\u0010DR$\u00105\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u0010Y\u001a\u0004\bo\u0010\u0017\"\u0004\bp\u0010\\R\"\u0010q\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bq\u0010h\u001a\u0004\br\u0010j\"\u0004\bs\u0010lR*\u0010u\u001a\u00020\u00022\u0006\u0010t\u001a\u00020\u00028F@FX\u000e¢\u0006\u0012\n\u0004\bu\u0010R\u001a\u0004\bu\u0010T\"\u0004\bv\u0010VR$\u0010w\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bw\u0010@\u001a\u0004\bx\u0010B\"\u0004\by\u0010DR*\u0010z\u001a\u00020\n2\u0006\u0010t\u001a\u00020\n8F@FX\u000e¢\u0006\u0012\n\u0004\bz\u0010@\u001a\u0004\b{\u0010B\"\u0004\b|\u0010DR$\u0010}\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b}\u0010@\u001a\u0004\b~\u0010B\"\u0004\b\u0010DR.\u0010\u0001\u001a\u00020\n2\u0006\u0010t\u001a\u00020\n8F@FX\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010@\u001a\u0005\b\u0001\u0010B\"\u0005\b\u0001\u0010DR(\u0010\u0001\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010@\u001a\u0005\b\u0001\u0010B\"\u0005\b\u0001\u0010DR.\u0010\u0001\u001a\u00020\n2\u0006\u0010t\u001a\u00020\n8F@FX\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010@\u001a\u0005\b\u0001\u0010B\"\u0005\b\u0001\u0010D¨\u0006\u0001"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/priceAlert/PriceAlertToken;", "", "", "isEnable", "Lr37;", "setStatus", "isStatus", "", "component1", "()Ljava/lang/Integer;", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "", "component12", "()Ljava/lang/Double;", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "id", "walletAddress", "tokenSymbol", "tokenName", "tokenAddress", "chainId", "tokenId", "fcmToken", "status", "priceReachesOrHigher", "priceReachesOrLower", "priceReaches", "enableIncreasePercent", "increasePercent", "enableDecreasePercent", "decreasePercent", "price", "platform", "repeat", "currencySymbol", "currencyPrice", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Double;ZLjava/lang/Double;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;)Lnet/safemoon/androidwallet/model/priceAlert/PriceAlertToken;", "toString", "hashCode", "other", "equals", "Ljava/lang/Integer;", "getId", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getWalletAddress", "()Ljava/lang/String;", "setWalletAddress", "(Ljava/lang/String;)V", "getTokenSymbol", "setTokenSymbol", "getTokenName", "setTokenName", "getTokenAddress", "setTokenAddress", "getChainId", "setChainId", "getTokenId", "setTokenId", "getFcmToken", "setFcmToken", "getStatus", "Z", "getPriceReachesOrHigher", "()Z", "setPriceReachesOrHigher", "(Z)V", "getPriceReachesOrLower", "setPriceReachesOrLower", "Ljava/lang/Double;", "getPriceReaches", "setPriceReaches", "(Ljava/lang/Double;)V", "getEnableIncreasePercent", "setEnableIncreasePercent", "getIncreasePercent", "setIncreasePercent", "getEnableDecreasePercent", "setEnableDecreasePercent", "getDecreasePercent", "setDecreasePercent", "getPrice", "setPrice", "getPlatform", "I", "getRepeat", "()I", "setRepeat", "(I)V", "getCurrencySymbol", "setCurrencySymbol", "getCurrencyPrice", "setCurrencyPrice", "cacheRepeat", "getCacheRepeat", "setCacheRepeat", "value", "isPersistent", "setPersistent", "cachePriceReachesString", "getCachePriceReachesString", "setCachePriceReachesString", "priceReachesString", "getPriceReachesString", "setPriceReachesString", "cacheIncreasePercentString", "getCacheIncreasePercentString", "setCacheIncreasePercentString", "increasePercentString", "getIncreasePercentString", "setIncreasePercentString", "cacheDecreasePercentString", "getCacheDecreasePercentString", "setCacheDecreasePercentString", "decreasePercentString", "getDecreasePercentString", "setDecreasePercentString", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Double;ZLjava/lang/Double;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PriceAlertToken.kt */
public final class PriceAlertToken {
    private String cacheDecreasePercentString;
    private String cacheIncreasePercentString;
    private String cachePriceReachesString;
    private int cacheRepeat;
    @SerializedName("chainId")
    private Integer chainId;
    @SerializedName("currencyPrice")
    private Double currencyPrice;
    @SerializedName("currencySymbol")
    private String currencySymbol;
    @SerializedName("decreasePercent")
    private Double decreasePercent;
    private String decreasePercentString;
    @SerializedName("enableDecreasePercent")
    private boolean enableDecreasePercent;
    @SerializedName("enableIncreasePercent")
    private boolean enableIncreasePercent;
    @SerializedName("fcmToken")
    private String fcmToken;
    @SerializedName("id")

    /* renamed from: id */
    private Integer f42460id;
    @SerializedName("increasePercent")
    private Double increasePercent;
    private String increasePercentString;
    private boolean isPersistent;
    @SerializedName("platform")
    private final String platform;
    @SerializedName("price")
    private Double price;
    @SerializedName("priceReaches")
    private Double priceReaches;
    @SerializedName("priceReachesOrHigher")
    private boolean priceReachesOrHigher;
    @SerializedName("priceReachesOrLower")
    private boolean priceReachesOrLower;
    private String priceReachesString;
    @SerializedName("repeat")
    private int repeat;
    @SerializedName("status")
    private String status;
    @SerializedName(alternate = {"address"}, value = "tokenAddress")
    private String tokenAddress;
    @SerializedName(alternate = {"coinmarketid", "coinMarketId"}, value = "tokenId")
    private String tokenId;
    @SerializedName(alternate = {"name"}, value = "tokenName")
    private String tokenName;
    @SerializedName(alternate = {"symbol"}, value = "tokenSymbol")
    private String tokenSymbol;
    @SerializedName("walletAddress")
    private String walletAddress;

    public PriceAlertToken() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, false, false, (Double) null, false, (Double) null, false, (Double) null, (Double) null, (String) null, 0, (String) null, (Double) null, 2097151, (DefaultConstructorMarker) null);
    }

    public PriceAlertToken(Integer num, String str, String str2, String str3, String str4, Integer num2, String str5, String str6, String str7, boolean z, boolean z2, Double d, boolean z3, Double d2, boolean z4, Double d3, Double d4, String str8, int i, String str9, Double d5) {
        String str10 = str8;
        vx2.m53591g(str7, "status");
        vx2.m53591g(str10, "platform");
        this.f42460id = num;
        this.walletAddress = str;
        this.tokenSymbol = str2;
        this.tokenName = str3;
        this.tokenAddress = str4;
        this.chainId = num2;
        this.tokenId = str5;
        this.fcmToken = str6;
        this.status = str7;
        this.priceReachesOrHigher = z;
        this.priceReachesOrLower = z2;
        this.priceReaches = d;
        this.enableIncreasePercent = z3;
        this.increasePercent = d2;
        this.enableDecreasePercent = z4;
        this.decreasePercent = d3;
        this.price = d4;
        this.platform = str10;
        this.repeat = i;
        this.currencySymbol = str9;
        this.currencyPrice = d5;
        this.cacheRepeat = 1;
        this.priceReachesString = "  ";
        this.increasePercentString = "";
        this.decreasePercentString = "";
    }

    public static /* synthetic */ PriceAlertToken copy$default(PriceAlertToken priceAlertToken, Integer num, String str, String str2, String str3, String str4, Integer num2, String str5, String str6, String str7, boolean z, boolean z2, Double d, boolean z3, Double d2, boolean z4, Double d3, Double d4, String str8, int i, String str9, Double d5, int i2, Object obj) {
        PriceAlertToken priceAlertToken2 = priceAlertToken;
        int i3 = i2;
        return priceAlertToken.copy((i3 & 1) != 0 ? priceAlertToken2.f42460id : num, (i3 & 2) != 0 ? priceAlertToken2.walletAddress : str, (i3 & 4) != 0 ? priceAlertToken2.tokenSymbol : str2, (i3 & 8) != 0 ? priceAlertToken2.tokenName : str3, (i3 & 16) != 0 ? priceAlertToken2.tokenAddress : str4, (i3 & 32) != 0 ? priceAlertToken2.chainId : num2, (i3 & 64) != 0 ? priceAlertToken2.tokenId : str5, (i3 & 128) != 0 ? priceAlertToken2.fcmToken : str6, (i3 & 256) != 0 ? priceAlertToken2.status : str7, (i3 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? priceAlertToken2.priceReachesOrHigher : z, (i3 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? priceAlertToken2.priceReachesOrLower : z2, (i3 & 2048) != 0 ? priceAlertToken2.priceReaches : d, (i3 & 4096) != 0 ? priceAlertToken2.enableIncreasePercent : z3, (i3 & 8192) != 0 ? priceAlertToken2.increasePercent : d2, (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? priceAlertToken2.enableDecreasePercent : z4, (i3 & 32768) != 0 ? priceAlertToken2.decreasePercent : d3, (i3 & 65536) != 0 ? priceAlertToken2.price : d4, (i3 & 131072) != 0 ? priceAlertToken2.platform : str8, (i3 & 262144) != 0 ? priceAlertToken2.repeat : i, (i3 & 524288) != 0 ? priceAlertToken2.currencySymbol : str9, (i3 & 1048576) != 0 ? priceAlertToken2.currencyPrice : d5);
    }

    public final Integer component1() {
        return this.f42460id;
    }

    public final boolean component10() {
        return this.priceReachesOrHigher;
    }

    public final boolean component11() {
        return this.priceReachesOrLower;
    }

    public final Double component12() {
        return this.priceReaches;
    }

    public final boolean component13() {
        return this.enableIncreasePercent;
    }

    public final Double component14() {
        return this.increasePercent;
    }

    public final boolean component15() {
        return this.enableDecreasePercent;
    }

    public final Double component16() {
        return this.decreasePercent;
    }

    public final Double component17() {
        return this.price;
    }

    public final String component18() {
        return this.platform;
    }

    public final int component19() {
        return this.repeat;
    }

    public final String component2() {
        return this.walletAddress;
    }

    public final String component20() {
        return this.currencySymbol;
    }

    public final Double component21() {
        return this.currencyPrice;
    }

    public final String component3() {
        return this.tokenSymbol;
    }

    public final String component4() {
        return this.tokenName;
    }

    public final String component5() {
        return this.tokenAddress;
    }

    public final Integer component6() {
        return this.chainId;
    }

    public final String component7() {
        return this.tokenId;
    }

    public final String component8() {
        return this.fcmToken;
    }

    public final String component9() {
        return this.status;
    }

    public final PriceAlertToken copy(Integer num, String str, String str2, String str3, String str4, Integer num2, String str5, String str6, String str7, boolean z, boolean z2, Double d, boolean z3, Double d2, boolean z4, Double d3, Double d4, String str8, int i, String str9, Double d5) {
        Integer num3 = num;
        vx2.m53591g(str7, "status");
        vx2.m53591g(str8, "platform");
        return new PriceAlertToken(num, str, str2, str3, str4, num2, str5, str6, str7, z, z2, d, z3, d2, z4, d3, d4, str8, i, str9, d5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceAlertToken)) {
            return false;
        }
        PriceAlertToken priceAlertToken = (PriceAlertToken) obj;
        return vx2.m53586b(this.f42460id, priceAlertToken.f42460id) && vx2.m53586b(this.walletAddress, priceAlertToken.walletAddress) && vx2.m53586b(this.tokenSymbol, priceAlertToken.tokenSymbol) && vx2.m53586b(this.tokenName, priceAlertToken.tokenName) && vx2.m53586b(this.tokenAddress, priceAlertToken.tokenAddress) && vx2.m53586b(this.chainId, priceAlertToken.chainId) && vx2.m53586b(this.tokenId, priceAlertToken.tokenId) && vx2.m53586b(this.fcmToken, priceAlertToken.fcmToken) && vx2.m53586b(this.status, priceAlertToken.status) && this.priceReachesOrHigher == priceAlertToken.priceReachesOrHigher && this.priceReachesOrLower == priceAlertToken.priceReachesOrLower && vx2.m53586b(this.priceReaches, priceAlertToken.priceReaches) && this.enableIncreasePercent == priceAlertToken.enableIncreasePercent && vx2.m53586b(this.increasePercent, priceAlertToken.increasePercent) && this.enableDecreasePercent == priceAlertToken.enableDecreasePercent && vx2.m53586b(this.decreasePercent, priceAlertToken.decreasePercent) && vx2.m53586b(this.price, priceAlertToken.price) && vx2.m53586b(this.platform, priceAlertToken.platform) && this.repeat == priceAlertToken.repeat && vx2.m53586b(this.currencySymbol, priceAlertToken.currencySymbol) && vx2.m53586b(this.currencyPrice, priceAlertToken.currencyPrice);
    }

    public final String getCacheDecreasePercentString() {
        return this.cacheDecreasePercentString;
    }

    public final String getCacheIncreasePercentString() {
        return this.cacheIncreasePercentString;
    }

    public final String getCachePriceReachesString() {
        return this.cachePriceReachesString;
    }

    public final int getCacheRepeat() {
        return this.cacheRepeat;
    }

    public final Integer getChainId() {
        return this.chainId;
    }

    public final Double getCurrencyPrice() {
        return this.currencyPrice;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final Double getDecreasePercent() {
        return this.decreasePercent;
    }

    public final String getDecreasePercentString() {
        String str;
        String str2 = this.cacheDecreasePercentString;
        if (str2 != null) {
            return str2;
        }
        Double d = this.decreasePercent;
        if (d != null) {
            str = ol0.m70358f0(new BigDecimal(String.valueOf(d.doubleValue())), 18);
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final boolean getEnableDecreasePercent() {
        return this.enableDecreasePercent;
    }

    public final boolean getEnableIncreasePercent() {
        return this.enableIncreasePercent;
    }

    public final String getFcmToken() {
        return this.fcmToken;
    }

    public final Integer getId() {
        return this.f42460id;
    }

    public final Double getIncreasePercent() {
        return this.increasePercent;
    }

    public final String getIncreasePercentString() {
        String str;
        String str2 = this.cacheIncreasePercentString;
        if (str2 != null) {
            return str2;
        }
        Double d = this.increasePercent;
        if (d != null) {
            str = ol0.m70358f0(new BigDecimal(String.valueOf(d.doubleValue())), 18);
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final Double getPriceReaches() {
        return this.priceReaches;
    }

    public final boolean getPriceReachesOrHigher() {
        return this.priceReachesOrHigher;
    }

    public final boolean getPriceReachesOrLower() {
        return this.priceReachesOrLower;
    }

    public final String getPriceReachesString() {
        String str;
        String str2 = this.cachePriceReachesString;
        if (str2 != null) {
            return str2;
        }
        Double d = this.priceReaches;
        if (d != null) {
            str = ol0.m70358f0(new BigDecimal(String.valueOf(d.doubleValue())), 18);
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final int getRepeat() {
        return this.repeat;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    public final String getTokenId() {
        return this.tokenId;
    }

    public final String getTokenName() {
        return this.tokenName;
    }

    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public final String getWalletAddress() {
        return this.walletAddress;
    }

    public int hashCode() {
        Integer num = this.f42460id;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.walletAddress;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tokenSymbol;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tokenName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tokenAddress;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.chainId;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.tokenId;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fcmToken;
        int hashCode8 = (((hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.status.hashCode()) * 31;
        boolean z = this.priceReachesOrHigher;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode8 + (z ? 1 : 0)) * 31;
        boolean z3 = this.priceReachesOrLower;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        Double d = this.priceReaches;
        int hashCode9 = (i3 + (d == null ? 0 : d.hashCode())) * 31;
        boolean z4 = this.enableIncreasePercent;
        if (z4) {
            z4 = true;
        }
        int i4 = (hashCode9 + (z4 ? 1 : 0)) * 31;
        Double d2 = this.increasePercent;
        int hashCode10 = (i4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        boolean z5 = this.enableDecreasePercent;
        if (!z5) {
            z2 = z5;
        }
        int i5 = (hashCode10 + (z2 ? 1 : 0)) * 31;
        Double d3 = this.decreasePercent;
        int hashCode11 = (i5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.price;
        int hashCode12 = (((((hashCode11 + (d4 == null ? 0 : d4.hashCode())) * 31) + this.platform.hashCode()) * 31) + this.repeat) * 31;
        String str7 = this.currencySymbol;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d5 = this.currencyPrice;
        if (d5 != null) {
            i = d5.hashCode();
        }
        return hashCode13 + i;
    }

    public final boolean isPersistent() {
        if (this.repeat > 0) {
            return true;
        }
        return false;
    }

    public final boolean isStatus() {
        return vx2.m53586b(this.status, "OPEN");
    }

    public final void setCacheDecreasePercentString(String str) {
        this.cacheDecreasePercentString = str;
    }

    public final void setCacheIncreasePercentString(String str) {
        this.cacheIncreasePercentString = str;
    }

    public final void setCachePriceReachesString(String str) {
        this.cachePriceReachesString = str;
    }

    public final void setCacheRepeat(int i) {
        this.cacheRepeat = i;
    }

    public final void setChainId(Integer num) {
        this.chainId = num;
    }

    public final void setCurrencyPrice(Double d) {
        this.currencyPrice = d;
    }

    public final void setCurrencySymbol(String str) {
        this.currencySymbol = str;
    }

    public final void setDecreasePercent(Double d) {
        this.decreasePercent = d;
    }

    public final void setDecreasePercentString(String str) {
        Double d;
        vx2.m53591g(str, "value");
        this.cacheDecreasePercentString = str;
        BigDecimal K = ol0.m70331K(str);
        if (K != null) {
            d = Double.valueOf(K.doubleValue());
        } else {
            d = null;
        }
        this.decreasePercent = d;
        this.decreasePercentString = str;
    }

    public final void setEnableDecreasePercent(boolean z) {
        this.enableDecreasePercent = z;
    }

    public final void setEnableIncreasePercent(boolean z) {
        this.enableIncreasePercent = z;
    }

    public final void setFcmToken(String str) {
        this.fcmToken = str;
    }

    public final void setId(Integer num) {
        this.f42460id = num;
    }

    public final void setIncreasePercent(Double d) {
        this.increasePercent = d;
    }

    public final void setIncreasePercentString(String str) {
        Double d;
        vx2.m53591g(str, "value");
        this.cacheIncreasePercentString = str;
        BigDecimal K = ol0.m70331K(str);
        if (K != null) {
            d = Double.valueOf(K.doubleValue());
        } else {
            d = null;
        }
        this.increasePercent = d;
        this.increasePercentString = str;
    }

    public final void setPersistent(boolean z) {
        if (z) {
            this.repeat = this.cacheRepeat;
        } else {
            this.cacheRepeat = this.repeat;
            this.repeat = 0;
        }
        this.isPersistent = z;
    }

    public final void setPrice(Double d) {
        this.price = d;
    }

    public final void setPriceReaches(Double d) {
        this.priceReaches = d;
    }

    public final void setPriceReachesOrHigher(boolean z) {
        this.priceReachesOrHigher = z;
    }

    public final void setPriceReachesOrLower(boolean z) {
        this.priceReachesOrLower = z;
    }

    public final void setPriceReachesString(String str) {
        Double d;
        vx2.m53591g(str, "value");
        this.cachePriceReachesString = str;
        BigDecimal K = ol0.m70331K(str);
        if (K != null) {
            d = Double.valueOf(K.doubleValue());
        } else {
            d = null;
        }
        this.priceReaches = d;
        this.priceReachesString = str;
    }

    public final void setRepeat(int i) {
        this.repeat = i;
    }

    public final void setStatus(String str) {
        vx2.m53591g(str, "<set-?>");
        this.status = str;
    }

    public final void setTokenAddress(String str) {
        this.tokenAddress = str;
    }

    public final void setTokenId(String str) {
        this.tokenId = str;
    }

    public final void setTokenName(String str) {
        this.tokenName = str;
    }

    public final void setTokenSymbol(String str) {
        this.tokenSymbol = str;
    }

    public final void setWalletAddress(String str) {
        this.walletAddress = str;
    }

    public String toString() {
        Integer num = this.f42460id;
        String str = this.walletAddress;
        String str2 = this.tokenSymbol;
        String str3 = this.tokenName;
        String str4 = this.tokenAddress;
        Integer num2 = this.chainId;
        String str5 = this.tokenId;
        String str6 = this.fcmToken;
        String str7 = this.status;
        boolean z = this.priceReachesOrHigher;
        boolean z2 = this.priceReachesOrLower;
        Double d = this.priceReaches;
        boolean z3 = this.enableIncreasePercent;
        Double d2 = this.increasePercent;
        boolean z4 = this.enableDecreasePercent;
        Double d3 = this.decreasePercent;
        Double d4 = this.price;
        String str8 = this.platform;
        int i = this.repeat;
        String str9 = this.currencySymbol;
        Double d5 = this.currencyPrice;
        return "PriceAlertToken(id=" + num + ", walletAddress=" + str + ", tokenSymbol=" + str2 + ", tokenName=" + str3 + ", tokenAddress=" + str4 + ", chainId=" + num2 + ", tokenId=" + str5 + ", fcmToken=" + str6 + ", status=" + str7 + ", priceReachesOrHigher=" + z + ", priceReachesOrLower=" + z2 + ", priceReaches=" + d + ", enableIncreasePercent=" + z3 + ", increasePercent=" + d2 + ", enableDecreasePercent=" + z4 + ", decreasePercent=" + d3 + ", price=" + d4 + ", platform=" + str8 + ", repeat=" + i + ", currencySymbol=" + str9 + ", currencyPrice=" + d5 + ")";
    }

    public final void setStatus(boolean z) {
        this.status = z ? "OPEN" : "CLOSED";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PriceAlertToken(java.lang.Integer r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.Integer r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, boolean r32, boolean r33, java.lang.Double r34, boolean r35, java.lang.Double r36, boolean r37, java.lang.Double r38, java.lang.Double r39, java.lang.String r40, int r41, java.lang.String r42, java.lang.Double r43, int r44, kotlin.jvm.internal.DefaultConstructorMarker r45) {
        /*
            r22 = this;
            r0 = r44
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r23
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r24
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r25
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r26
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r27
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r28
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r29
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r30
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            java.lang.String r10 = "CLOSED"
            goto L_0x004b
        L_0x0049:
            r10 = r31
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = 0
            goto L_0x0053
        L_0x0051:
            r11 = r32
        L_0x0053:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0059
            r13 = 0
            goto L_0x005b
        L_0x0059:
            r13 = r33
        L_0x005b:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0061
            r14 = 0
            goto L_0x0063
        L_0x0061:
            r14 = r34
        L_0x0063:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0069
            r15 = 0
            goto L_0x006b
        L_0x0069:
            r15 = r35
        L_0x006b:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0071
            r2 = 0
            goto L_0x0073
        L_0x0071:
            r2 = r36
        L_0x0073:
            r12 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x0079
            r12 = 0
            goto L_0x007b
        L_0x0079:
            r12 = r37
        L_0x007b:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0085
            r16 = 0
            goto L_0x0087
        L_0x0085:
            r16 = r38
        L_0x0087:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0090
            r17 = 0
            goto L_0x0092
        L_0x0090:
            r17 = r39
        L_0x0092:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009b
            java.lang.String r18 = "ANDROID"
            goto L_0x009d
        L_0x009b:
            r18 = r40
        L_0x009d:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a6
            r19 = 0
            goto L_0x00a8
        L_0x00a6:
            r19 = r41
        L_0x00a8:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b1
            r20 = 0
            goto L_0x00b3
        L_0x00b1:
            r20 = r42
        L_0x00b3:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r21
            if (r0 == 0) goto L_0x00bb
            r0 = 0
            goto L_0x00bd
        L_0x00bb:
            r0 = r43
        L_0x00bd:
            r23 = r22
            r24 = r1
            r25 = r3
            r26 = r4
            r27 = r5
            r28 = r6
            r29 = r7
            r30 = r8
            r31 = r9
            r32 = r10
            r33 = r11
            r34 = r13
            r35 = r14
            r36 = r15
            r37 = r2
            r38 = r12
            r39 = r16
            r40 = r17
            r41 = r18
            r42 = r19
            r43 = r20
            r44 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.priceAlert.PriceAlertToken.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.Double, boolean, java.lang.Double, boolean, java.lang.Double, java.lang.Double, java.lang.String, int, java.lang.String, java.lang.Double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

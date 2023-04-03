package net.safemoon.androidwallet.model.reflections;

import androidx.recyclerview.widget.RecyclerView;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import okhttp3.internal.http2.Http2;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b<\b\b\u0018\u0000 ]2\u00020\u0001:\u0001]B£\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\u0010\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010J\u001a\u00020\u0010HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010N\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010BJ\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u000bHÆ\u0003J\t\u0010U\u001a\u00020\u000bHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003J²\u0001\u0010W\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u00020\u00102\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u00020\u000bHÖ\u0001J\t\u0010\\\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010'\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010*R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\"\u00101\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001fR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b8\u0010\u001a\"\u0004\b9\u0010\u001cR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u0010\u001cR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u001fR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001f\"\u0004\b@\u0010*R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\u001f¨\u0006^"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "", "id", "", "symbolWithType", "", "symbol", "name", "iconResName", "contractAddress", "chainId", "", "decimals", "nativeBalance", "firstTimeStamp", "enableAdvanceMode", "", "latestBalance", "latestTimeStamp", "cmcId", "priceUsd", "", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Long;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;)V", "getChainId", "()I", "getCmcId", "()Ljava/lang/Long;", "setCmcId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getContractAddress", "()Ljava/lang/String;", "getDecimals", "differenceBalance", "Ljava/math/BigDecimal;", "getDifferenceBalance", "()Ljava/math/BigDecimal;", "setDifferenceBalance", "(Ljava/math/BigDecimal;)V", "displayDate", "getDisplayDate", "setDisplayDate", "(Ljava/lang/String;)V", "getEnableAdvanceMode", "()Z", "setEnableAdvanceMode", "(Z)V", "getFirstTimeStamp", "setFirstTimeStamp", "iconResId", "getIconResId", "()Ljava/lang/Integer;", "setIconResId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIconResName", "getId", "setId", "getLatestBalance", "setLatestBalance", "getLatestTimeStamp", "setLatestTimeStamp", "getName", "getNativeBalance", "setNativeBalance", "getPriceUsd", "()Ljava/lang/Double;", "setPriceUsd", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getSymbol", "getSymbolWithType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Long;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;)Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "equals", "other", "hashCode", "toString", "Companion", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomReflectionsToken.kt */
public final class RoomReflectionsToken {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final int chainId;
    private Long cmcId;
    private final String contractAddress;
    private final int decimals;
    private BigDecimal differenceBalance;
    private String displayDate;
    private boolean enableAdvanceMode;
    private Long firstTimeStamp;
    private Integer iconResId;
    private final String iconResName;

    /* renamed from: id */
    private Long f42462id;
    private Long latestBalance;
    private Long latestTimeStamp;
    private final String name;
    private String nativeBalance;
    private Double priceUsd;
    private final String symbol;
    private final String symbolWithType;

    @Metadata(mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken$Companion;", "", "()V", "toIToken", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "roomReflectionsToken", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: RoomReflectionsToken.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IToken toIToken(RoomReflectionsToken roomReflectionsToken) {
            vx2.m53591g(roomReflectionsToken, "roomReflectionsToken");
            return new RoomReflectionsToken$Companion$toIToken$1(roomReflectionsToken);
        }
    }

    public RoomReflectionsToken(Long l, String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, Long l2, boolean z, Long l3, Long l4, Long l5, Double d) {
        vx2.m53591g(str, "symbolWithType");
        vx2.m53591g(str2, "symbol");
        vx2.m53591g(str3, PublicResolver.FUNC_NAME);
        vx2.m53591g(str4, "iconResName");
        vx2.m53591g(str5, "contractAddress");
        this.f42462id = l;
        this.symbolWithType = str;
        this.symbol = str2;
        this.name = str3;
        this.iconResName = str4;
        this.contractAddress = str5;
        this.chainId = i;
        this.decimals = i2;
        this.nativeBalance = str6;
        this.firstTimeStamp = l2;
        this.enableAdvanceMode = z;
        this.latestBalance = l3;
        this.latestTimeStamp = l4;
        this.cmcId = l5;
        this.priceUsd = d;
        this.iconResId = 0;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        vx2.m53590f(bigDecimal, "ZERO");
        this.differenceBalance = bigDecimal;
        this.displayDate = "";
    }

    public static /* synthetic */ RoomReflectionsToken copy$default(RoomReflectionsToken roomReflectionsToken, Long l, String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, Long l2, boolean z, Long l3, Long l4, Long l5, Double d, int i3, Object obj) {
        RoomReflectionsToken roomReflectionsToken2 = roomReflectionsToken;
        int i4 = i3;
        return roomReflectionsToken.copy((i4 & 1) != 0 ? roomReflectionsToken2.f42462id : l, (i4 & 2) != 0 ? roomReflectionsToken2.symbolWithType : str, (i4 & 4) != 0 ? roomReflectionsToken2.symbol : str2, (i4 & 8) != 0 ? roomReflectionsToken2.name : str3, (i4 & 16) != 0 ? roomReflectionsToken2.iconResName : str4, (i4 & 32) != 0 ? roomReflectionsToken2.contractAddress : str5, (i4 & 64) != 0 ? roomReflectionsToken2.chainId : i, (i4 & 128) != 0 ? roomReflectionsToken2.decimals : i2, (i4 & 256) != 0 ? roomReflectionsToken2.nativeBalance : str6, (i4 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? roomReflectionsToken2.firstTimeStamp : l2, (i4 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? roomReflectionsToken2.enableAdvanceMode : z, (i4 & 2048) != 0 ? roomReflectionsToken2.latestBalance : l3, (i4 & 4096) != 0 ? roomReflectionsToken2.latestTimeStamp : l4, (i4 & 8192) != 0 ? roomReflectionsToken2.cmcId : l5, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? roomReflectionsToken2.priceUsd : d);
    }

    public final Long component1() {
        return this.f42462id;
    }

    public final Long component10() {
        return this.firstTimeStamp;
    }

    public final boolean component11() {
        return this.enableAdvanceMode;
    }

    public final Long component12() {
        return this.latestBalance;
    }

    public final Long component13() {
        return this.latestTimeStamp;
    }

    public final Long component14() {
        return this.cmcId;
    }

    public final Double component15() {
        return this.priceUsd;
    }

    public final String component2() {
        return this.symbolWithType;
    }

    public final String component3() {
        return this.symbol;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.iconResName;
    }

    public final String component6() {
        return this.contractAddress;
    }

    public final int component7() {
        return this.chainId;
    }

    public final int component8() {
        return this.decimals;
    }

    public final String component9() {
        return this.nativeBalance;
    }

    public final RoomReflectionsToken copy(Long l, String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, Long l2, boolean z, Long l3, Long l4, Long l5, Double d) {
        String str7 = str;
        vx2.m53591g(str7, "symbolWithType");
        String str8 = str2;
        vx2.m53591g(str8, "symbol");
        String str9 = str3;
        vx2.m53591g(str9, PublicResolver.FUNC_NAME);
        String str10 = str4;
        vx2.m53591g(str10, "iconResName");
        String str11 = str5;
        vx2.m53591g(str11, "contractAddress");
        return new RoomReflectionsToken(l, str7, str8, str9, str10, str11, i, i2, str6, l2, z, l3, l4, l5, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomReflectionsToken)) {
            return false;
        }
        RoomReflectionsToken roomReflectionsToken = (RoomReflectionsToken) obj;
        return vx2.m53586b(this.f42462id, roomReflectionsToken.f42462id) && vx2.m53586b(this.symbolWithType, roomReflectionsToken.symbolWithType) && vx2.m53586b(this.symbol, roomReflectionsToken.symbol) && vx2.m53586b(this.name, roomReflectionsToken.name) && vx2.m53586b(this.iconResName, roomReflectionsToken.iconResName) && vx2.m53586b(this.contractAddress, roomReflectionsToken.contractAddress) && this.chainId == roomReflectionsToken.chainId && this.decimals == roomReflectionsToken.decimals && vx2.m53586b(this.nativeBalance, roomReflectionsToken.nativeBalance) && vx2.m53586b(this.firstTimeStamp, roomReflectionsToken.firstTimeStamp) && this.enableAdvanceMode == roomReflectionsToken.enableAdvanceMode && vx2.m53586b(this.latestBalance, roomReflectionsToken.latestBalance) && vx2.m53586b(this.latestTimeStamp, roomReflectionsToken.latestTimeStamp) && vx2.m53586b(this.cmcId, roomReflectionsToken.cmcId) && vx2.m53586b(this.priceUsd, roomReflectionsToken.priceUsd);
    }

    public final int getChainId() {
        return this.chainId;
    }

    public final Long getCmcId() {
        return this.cmcId;
    }

    public final String getContractAddress() {
        return this.contractAddress;
    }

    public final int getDecimals() {
        return this.decimals;
    }

    public final BigDecimal getDifferenceBalance() {
        return this.differenceBalance;
    }

    public final String getDisplayDate() {
        return this.displayDate;
    }

    public final boolean getEnableAdvanceMode() {
        return this.enableAdvanceMode;
    }

    public final Long getFirstTimeStamp() {
        return this.firstTimeStamp;
    }

    public final Integer getIconResId() {
        return this.iconResId;
    }

    public final String getIconResName() {
        return this.iconResName;
    }

    public final Long getId() {
        return this.f42462id;
    }

    public final Long getLatestBalance() {
        return this.latestBalance;
    }

    public final Long getLatestTimeStamp() {
        return this.latestTimeStamp;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNativeBalance() {
        return this.nativeBalance;
    }

    public final Double getPriceUsd() {
        return this.priceUsd;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getSymbolWithType() {
        return this.symbolWithType;
    }

    public int hashCode() {
        Long l = this.f42462id;
        int i = 0;
        int hashCode = (((((((((((((((l == null ? 0 : l.hashCode()) * 31) + this.symbolWithType.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.name.hashCode()) * 31) + this.iconResName.hashCode()) * 31) + this.contractAddress.hashCode()) * 31) + this.chainId) * 31) + this.decimals) * 31;
        String str = this.nativeBalance;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.firstTimeStamp;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        boolean z = this.enableAdvanceMode;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        Long l3 = this.latestBalance;
        int hashCode4 = (i2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.latestTimeStamp;
        int hashCode5 = (hashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.cmcId;
        int hashCode6 = (hashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Double d = this.priceUsd;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode6 + i;
    }

    public final void setCmcId(Long l) {
        this.cmcId = l;
    }

    public final void setDifferenceBalance(BigDecimal bigDecimal) {
        vx2.m53591g(bigDecimal, "<set-?>");
        this.differenceBalance = bigDecimal;
    }

    public final void setDisplayDate(String str) {
        this.displayDate = str;
    }

    public final void setEnableAdvanceMode(boolean z) {
        this.enableAdvanceMode = z;
    }

    public final void setFirstTimeStamp(Long l) {
        this.firstTimeStamp = l;
    }

    public final void setIconResId(Integer num) {
        this.iconResId = num;
    }

    public final void setId(Long l) {
        this.f42462id = l;
    }

    public final void setLatestBalance(Long l) {
        this.latestBalance = l;
    }

    public final void setLatestTimeStamp(Long l) {
        this.latestTimeStamp = l;
    }

    public final void setNativeBalance(String str) {
        this.nativeBalance = str;
    }

    public final void setPriceUsd(Double d) {
        this.priceUsd = d;
    }

    public String toString() {
        Long l = this.f42462id;
        String str = this.symbolWithType;
        String str2 = this.symbol;
        String str3 = this.name;
        String str4 = this.iconResName;
        String str5 = this.contractAddress;
        int i = this.chainId;
        int i2 = this.decimals;
        String str6 = this.nativeBalance;
        Long l2 = this.firstTimeStamp;
        boolean z = this.enableAdvanceMode;
        Long l3 = this.latestBalance;
        Long l4 = this.latestTimeStamp;
        Long l5 = this.cmcId;
        Double d = this.priceUsd;
        return "RoomReflectionsToken(id=" + l + ", symbolWithType=" + str + ", symbol=" + str2 + ", name=" + str3 + ", iconResName=" + str4 + ", contractAddress=" + str5 + ", chainId=" + i + ", decimals=" + i2 + ", nativeBalance=" + str6 + ", firstTimeStamp=" + l2 + ", enableAdvanceMode=" + z + ", latestBalance=" + l3 + ", latestTimeStamp=" + l4 + ", cmcId=" + l5 + ", priceUsd=" + d + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RoomReflectionsToken(java.lang.Long r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, int r26, java.lang.String r27, java.lang.Long r28, boolean r29, java.lang.Long r30, java.lang.Long r31, java.lang.Long r32, java.lang.Double r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r18 = this;
            r0 = r34
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r3 = r1
            goto L_0x000b
        L_0x0009:
            r3 = r19
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0013
            java.lang.String r1 = "0"
            r11 = r1
            goto L_0x0015
        L_0x0013:
            r11 = r27
        L_0x0015:
            r1 = r0 & 512(0x200, float:7.175E-43)
            r4 = 0
            if (r1 == 0) goto L_0x0021
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r12 = r1
            goto L_0x0023
        L_0x0021:
            r12 = r28
        L_0x0023:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x002a
            r1 = 0
            r13 = r1
            goto L_0x002c
        L_0x002a:
            r13 = r29
        L_0x002c:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0036
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r14 = r1
            goto L_0x0038
        L_0x0036:
            r14 = r30
        L_0x0038:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0042
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r15 = r1
            goto L_0x0044
        L_0x0042:
            r15 = r31
        L_0x0044:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x004f
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r16 = r1
            goto L_0x0051
        L_0x004f:
            r16 = r32
        L_0x0051:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x005e
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r17 = r0
            goto L_0x0060
        L_0x005e:
            r17 = r33
        L_0x0060:
            r2 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.reflections.RoomReflectionsToken.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.Long, boolean, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

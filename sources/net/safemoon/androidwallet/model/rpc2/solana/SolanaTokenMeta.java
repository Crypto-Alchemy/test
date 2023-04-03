package net.safemoon.androidwallet.model.rpc2.solana;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\fJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012Jn\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\tHÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010¨\u00061"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaTokenMeta;", "", "symbol", "", "name", "icon", "website", "twitter", "decimals", "", "coingeckoId", "holder", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getCoingeckoId", "()Ljava/lang/String;", "setCoingeckoId", "(Ljava/lang/String;)V", "getDecimals", "()Ljava/lang/Integer;", "setDecimals", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getHolder", "setHolder", "getIcon", "setIcon", "getName", "setName", "getSymbol", "setSymbol", "getTwitter", "setTwitter", "getWebsite", "setWebsite", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaTokenMeta;", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SolanaTokenMeta.kt */
public final class SolanaTokenMeta {
    @SerializedName("coingeckoId")
    private String coingeckoId;
    @SerializedName("decimals")
    private Integer decimals;
    @SerializedName("holder")
    private Integer holder;
    @SerializedName("icon")
    private String icon;
    @SerializedName("name")
    private String name;
    @SerializedName("symbol")
    private String symbol;
    @SerializedName("twitter")
    private String twitter;
    @SerializedName("website")
    private String website;

    public SolanaTokenMeta() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, 255, (DefaultConstructorMarker) null);
    }

    public SolanaTokenMeta(String str, String str2, String str3, String str4, String str5, Integer num, String str6, Integer num2) {
        this.symbol = str;
        this.name = str2;
        this.icon = str3;
        this.website = str4;
        this.twitter = str5;
        this.decimals = num;
        this.coingeckoId = str6;
        this.holder = num2;
    }

    public static /* synthetic */ SolanaTokenMeta copy$default(SolanaTokenMeta solanaTokenMeta, String str, String str2, String str3, String str4, String str5, Integer num, String str6, Integer num2, int i, Object obj) {
        SolanaTokenMeta solanaTokenMeta2 = solanaTokenMeta;
        int i2 = i;
        return solanaTokenMeta.copy((i2 & 1) != 0 ? solanaTokenMeta2.symbol : str, (i2 & 2) != 0 ? solanaTokenMeta2.name : str2, (i2 & 4) != 0 ? solanaTokenMeta2.icon : str3, (i2 & 8) != 0 ? solanaTokenMeta2.website : str4, (i2 & 16) != 0 ? solanaTokenMeta2.twitter : str5, (i2 & 32) != 0 ? solanaTokenMeta2.decimals : num, (i2 & 64) != 0 ? solanaTokenMeta2.coingeckoId : str6, (i2 & 128) != 0 ? solanaTokenMeta2.holder : num2);
    }

    public final String component1() {
        return this.symbol;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.icon;
    }

    public final String component4() {
        return this.website;
    }

    public final String component5() {
        return this.twitter;
    }

    public final Integer component6() {
        return this.decimals;
    }

    public final String component7() {
        return this.coingeckoId;
    }

    public final Integer component8() {
        return this.holder;
    }

    public final SolanaTokenMeta copy(String str, String str2, String str3, String str4, String str5, Integer num, String str6, Integer num2) {
        return new SolanaTokenMeta(str, str2, str3, str4, str5, num, str6, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolanaTokenMeta)) {
            return false;
        }
        SolanaTokenMeta solanaTokenMeta = (SolanaTokenMeta) obj;
        return vx2.m53586b(this.symbol, solanaTokenMeta.symbol) && vx2.m53586b(this.name, solanaTokenMeta.name) && vx2.m53586b(this.icon, solanaTokenMeta.icon) && vx2.m53586b(this.website, solanaTokenMeta.website) && vx2.m53586b(this.twitter, solanaTokenMeta.twitter) && vx2.m53586b(this.decimals, solanaTokenMeta.decimals) && vx2.m53586b(this.coingeckoId, solanaTokenMeta.coingeckoId) && vx2.m53586b(this.holder, solanaTokenMeta.holder);
    }

    public final String getCoingeckoId() {
        return this.coingeckoId;
    }

    public final Integer getDecimals() {
        return this.decimals;
    }

    public final Integer getHolder() {
        return this.holder;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getTwitter() {
        return this.twitter;
    }

    public final String getWebsite() {
        return this.website;
    }

    public int hashCode() {
        String str = this.symbol;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.website;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.twitter;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.decimals;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.coingeckoId;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.holder;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode7 + i;
    }

    public final void setCoingeckoId(String str) {
        this.coingeckoId = str;
    }

    public final void setDecimals(Integer num) {
        this.decimals = num;
    }

    public final void setHolder(Integer num) {
        this.holder = num;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSymbol(String str) {
        this.symbol = str;
    }

    public final void setTwitter(String str) {
        this.twitter = str;
    }

    public final void setWebsite(String str) {
        this.website = str;
    }

    public String toString() {
        String str = this.symbol;
        String str2 = this.name;
        String str3 = this.icon;
        String str4 = this.website;
        String str5 = this.twitter;
        Integer num = this.decimals;
        String str6 = this.coingeckoId;
        Integer num2 = this.holder;
        return "SolanaTokenMeta(symbol=" + str + ", name=" + str2 + ", icon=" + str3 + ", website=" + str4 + ", twitter=" + str5 + ", decimals=" + num + ", coingeckoId=" + str6 + ", holder=" + num2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SolanaTokenMeta(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.Integer r15, java.lang.String r16, java.lang.Integer r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.model.rpc2.solana.SolanaTokenMeta.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

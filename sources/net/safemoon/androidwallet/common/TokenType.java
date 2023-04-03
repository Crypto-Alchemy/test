package net.safemoon.androidwallet.common;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import org.web3j.ens.contracts.generated.PublicResolver;

@Keep
@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001%B1\b\u0002\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\tJ\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1¨\u00062"}, mo44877d2 = {"Lnet/safemoon/androidwallet/common/TokenType;", "", "", "isPartOfMultiChainTokens", "", "getNativeToken", "getSymbolWithType", "getTitle", "getPlaneName", "", "getIcon", "getScanApi", "getName", "getOptionalName", "getDisplayName", "getChainTitle", "getNetworkResource", "getWrapAddress", "getAssignKey", "chainId", "I", "getChainId", "()I", "isTestNet", "Z", "()Z", "isEnable", "Lnet/safemoon/androidwallet/common/MyCoinType;", "coinType", "Lnet/safemoon/androidwallet/common/MyCoinType;", "getCoinType", "()Lnet/safemoon/androidwallet/common/MyCoinType;", "decimals", "getDecimals", "<init>", "(Ljava/lang/String;IIZZLnet/safemoon/androidwallet/common/MyCoinType;I)V", "Companion", "a", "BEP_20", "ERC_20", "POLYGON", "AVALANCHE_C", "SOLANA", "MULTI_COIN", "MULTI_COIN_BITCOIN", "MULTI_COIN_DOGE", "BEP_20_TEST", "ERC_20_TEST", "POLYGON_TEST", "AVALANCHE_FUJI_TEST", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TokenType.kt */
public enum TokenType {
    BEP_20(56, false, true, r6, 18),
    ERC_20(1, false, true, r8, 18),
    POLYGON(137, false, true, r16, 18),
    AVALANCHE_C(43114, false, true, r23, 18),
    SOLANA(r30.getValue() * -1, false, true, r30, 9),
    MULTI_COIN(Integer.MAX_VALUE, false, true, r30, 0),
    MULTI_COIN_BITCOIN(CellBase.GROUP_ID_END_USER, false, false, MyCoinType.BITCOIN, 8),
    MULTI_COIN_DOGE(r30.getValue() * -1, false, false, r30, 8),
    BEP_20_TEST(97, true, true, r6, 18),
    ERC_20_TEST(5, true, true, r8, 18),
    POLYGON_TEST(80001, true, true, r16, 18),
    AVALANCHE_FUJI_TEST(43113, true, true, r23, 18);
    
    /* access modifiers changed from: private */
    public static String API_KEY_AVALANCHE_C;
    /* access modifiers changed from: private */
    public static String API_KEY_AVALANCHE_FUJI_TEST;
    /* access modifiers changed from: private */
    public static String API_KEY_BEP_20;
    /* access modifiers changed from: private */
    public static String API_KEY_BEP_20_TEST;
    /* access modifiers changed from: private */
    public static String API_KEY_ERC_20;
    /* access modifiers changed from: private */
    public static String API_KEY_ERC_20_TEST;
    /* access modifiers changed from: private */
    public static String API_KEY_POLYGON;
    /* access modifiers changed from: private */
    public static String API_KEY_POLYGON_TEST;
    public static final C8246a Companion = null;
    private final int chainId;
    private final MyCoinType coinType;
    private final int decimals;
    private final boolean isEnable;
    private final boolean isTestNet;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006R\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010¨\u0006\u001c"}, mo44877d2 = {"Lnet/safemoon/androidwallet/common/TokenType$a;", "", "", "chainId", "Lnet/safemoon/androidwallet/common/TokenType;", "b", "", "name", "c", "symbol", "a", "API_KEY_BEP_20", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "API_KEY_ERC_20", "getAPI_KEY_ERC_20", "g", "API_KEY_POLYGON", "getAPI_KEY_POLYGON", "h", "API_KEY_AVALANCHE_C", "getAPI_KEY_AVALANCHE_C", "e", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.common.TokenType$a */
    /* compiled from: TokenType.kt */
    public static final class C8246a {
        public C8246a() {
        }

        public /* synthetic */ C8246a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TokenType mo57098a(String str) {
            vx2.m53591g(str, "symbol");
            Boolean bool = y40.f35761c;
            vx2.m53590f(bool, "IS_TEST_NET");
            if (bool.booleanValue()) {
                int hashCode = str.hashCode();
                if (hashCode != 65910) {
                    if (hashCode != 68985) {
                        if (hashCode == 73130586 && str.equals("MATIC")) {
                            return TokenType.POLYGON_TEST;
                        }
                    } else if (str.equals("ETH")) {
                        return TokenType.ERC_20_TEST;
                    }
                } else if (str.equals("BNB")) {
                    return TokenType.BEP_20_TEST;
                }
                throw new IllegalArgumentException("Unsupported value=" + str);
            }
            switch (str.hashCode()) {
                case 65910:
                    if (str.equals("BNB")) {
                        return TokenType.BEP_20;
                    }
                    break;
                case 68985:
                    if (str.equals("ETH")) {
                        return TokenType.ERC_20;
                    }
                    break;
                case 82288:
                    if (str.equals("SOL")) {
                        return TokenType.SOLANA;
                    }
                    break;
                case 2021164:
                    if (str.equals("AVAX")) {
                        return TokenType.AVALANCHE_C;
                    }
                    break;
                case 73130586:
                    if (str.equals("MATIC")) {
                        return TokenType.POLYGON;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported value=" + str);
        }

        /* renamed from: b */
        public final TokenType mo57099b(int i) {
            TokenType tokenType;
            boolean z;
            if (i == 0) {
                return TokenType.ERC_20;
            }
            TokenType[] values = TokenType.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    tokenType = null;
                    break;
                }
                TokenType tokenType2 = values[i2];
                if (tokenType2.getChainId() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    tokenType = tokenType2;
                    break;
                }
                i2++;
            }
            if (tokenType != null) {
                return tokenType;
            }
            throw new IllegalArgumentException("Unsupported value=" + i);
        }

        /* renamed from: c */
        public final TokenType mo57100c(String str) {
            TokenType tokenType;
            boolean z;
            vx2.m53591g(str, PublicResolver.FUNC_NAME);
            TokenType[] values = TokenType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    tokenType = null;
                    break;
                }
                tokenType = values[i];
                if (vx2.m53586b(tokenType.name(), str) || vx2.m53586b(tokenType.getOptionalName(), str)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            }
            if (tokenType != null) {
                return tokenType;
            }
            throw new IllegalArgumentException("Unsupported value=" + str);
        }

        /* renamed from: d */
        public final String mo57101d() {
            return TokenType.API_KEY_BEP_20;
        }

        /* renamed from: e */
        public final void mo57102e(String str) {
            vx2.m53591g(str, "<set-?>");
            TokenType.API_KEY_AVALANCHE_C = str;
        }

        /* renamed from: f */
        public final void mo57103f(String str) {
            vx2.m53591g(str, "<set-?>");
            TokenType.API_KEY_BEP_20 = str;
        }

        /* renamed from: g */
        public final void mo57104g(String str) {
            vx2.m53591g(str, "<set-?>");
            TokenType.API_KEY_ERC_20 = str;
        }

        /* renamed from: h */
        public final void mo57105h(String str) {
            vx2.m53591g(str, "<set-?>");
            TokenType.API_KEY_POLYGON = str;
        }
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: net.safemoon.androidwallet.common.TokenType$b */
    /* compiled from: TokenType.kt */
    public /* synthetic */ class C8247b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41646a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                net.safemoon.androidwallet.common.TokenType[] r0 = net.safemoon.androidwallet.common.TokenType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.BEP_20     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.BEP_20_TEST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.ERC_20     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.ERC_20_TEST     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.POLYGON     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.POLYGON_TEST     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.AVALANCHE_C     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                net.safemoon.androidwallet.common.TokenType r1 = net.safemoon.androidwallet.common.TokenType.AVALANCHE_FUJI_TEST     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                f41646a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.common.TokenType.C8247b.<clinit>():void");
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C8246a((DefaultConstructorMarker) null);
        API_KEY_BEP_20 = "";
        API_KEY_BEP_20_TEST = "";
        API_KEY_ERC_20 = "";
        API_KEY_ERC_20_TEST = "";
        API_KEY_POLYGON = "";
        API_KEY_POLYGON_TEST = "";
        API_KEY_AVALANCHE_C = "";
        API_KEY_AVALANCHE_FUJI_TEST = "";
    }

    private TokenType(int i, boolean z, boolean z2, MyCoinType myCoinType, int i2) {
        this.chainId = i;
        this.isTestNet = z;
        this.isEnable = z2;
        this.coinType = myCoinType;
        this.decimals = i2;
    }

    public static final TokenType fromValue(int i) {
        return Companion.mo57099b(i);
    }

    public static final TokenType fromValue(String str) {
        return Companion.mo57100c(str);
    }

    public final String getAssignKey() {
        switch (C8247b.f41646a[ordinal()]) {
            case 1:
                return API_KEY_BEP_20;
            case 2:
                return API_KEY_BEP_20_TEST;
            case 3:
                return API_KEY_ERC_20;
            case 4:
                return API_KEY_ERC_20_TEST;
            case 5:
                return API_KEY_POLYGON;
            case 6:
                return API_KEY_POLYGON_TEST;
            case 7:
                return API_KEY_AVALANCHE_C;
            case 8:
                return API_KEY_AVALANCHE_FUJI_TEST;
            default:
                return "";
        }
    }

    public final int getChainId() {
        return this.chainId;
    }

    public final String getChainTitle() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.chainId;
        boolean z4 = false;
        if (i == ERC_20.chainId || i == ERC_20_TEST.chainId) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "Ethereum";
        }
        if (i == BEP_20.chainId || i == BEP_20_TEST.chainId) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "BSC";
        }
        if (i == POLYGON.chainId || i == POLYGON_TEST.chainId) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return "Polygon";
        }
        if (i == AVALANCHE_C.chainId || i == AVALANCHE_FUJI_TEST.chainId) {
            z4 = true;
        }
        if (z4) {
            return "Avalanche";
        }
        if (i == SOLANA.chainId) {
            return "Solana";
        }
        if (i == MULTI_COIN_BITCOIN.chainId) {
            return "Bitcoin";
        }
        if (i == MULTI_COIN_DOGE.chainId) {
            return "Doge";
        }
        return "MultiChain";
    }

    public final MyCoinType getCoinType() {
        return this.coinType;
    }

    public final int getDecimals() {
        return this.decimals;
    }

    public final String getDisplayName() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.chainId;
        boolean z4 = false;
        if (i == ERC_20.chainId || i == ERC_20_TEST.chainId) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "ERC-20";
        }
        if (i == BEP_20.chainId || i == BEP_20_TEST.chainId) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "BEP-20";
        }
        if (i == POLYGON.chainId || i == POLYGON_TEST.chainId) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return "MATIC";
        }
        if (i == AVALANCHE_C.chainId || i == AVALANCHE_FUJI_TEST.chainId) {
            z4 = true;
        }
        if (z4) {
            return "AVAX";
        }
        if (i == SOLANA.chainId) {
            return "SOLANA";
        }
        if (i == MULTI_COIN_BITCOIN.chainId) {
            return "BITCOIN";
        }
        if (i == MULTI_COIN_DOGE.chainId) {
            return "DOGE";
        }
        return getName();
    }

    public final int getIcon() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.chainId;
        boolean z4 = false;
        if (i == ERC_20.chainId || i == ERC_20_TEST.chainId) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return R.drawable.ethereum;
        }
        if (i == BEP_20.chainId || i == BEP_20_TEST.chainId) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return R.drawable.binance;
        }
        if (i == POLYGON.chainId || i == POLYGON_TEST.chainId) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return R.drawable.polygon_matic_chain;
        }
        if (i == AVALANCHE_C.chainId || i == AVALANCHE_FUJI_TEST.chainId) {
            z4 = true;
        }
        if (z4) {
            return R.drawable.avalanche;
        }
        if (i == SOLANA.chainId) {
            return R.drawable.solana;
        }
        if (i == MULTI_COIN_BITCOIN.chainId) {
            return R.drawable.bitcoin;
        }
        if (i == MULTI_COIN_DOGE.chainId) {
            return R.drawable.dogecoin;
        }
        if (i == MULTI_COIN.chainId) {
            return R.drawable.ic_multicoin;
        }
        return R.drawable.bitcoin;
    }

    public final String getName() {
        return name();
    }

    public final String getNativeToken() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.chainId;
        boolean z4 = false;
        if (i == ERC_20.chainId || i == ERC_20_TEST.chainId) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "ETH";
        }
        if (i == BEP_20.chainId || i == BEP_20_TEST.chainId) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "BNB";
        }
        if (i == POLYGON.chainId || i == POLYGON_TEST.chainId) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return "MATIC";
        }
        if (i == AVALANCHE_C.chainId || i == AVALANCHE_FUJI_TEST.chainId) {
            z4 = true;
        }
        if (z4) {
            return "AVAX";
        }
        if (i == SOLANA.chainId) {
            return "SOL";
        }
        if (i == MULTI_COIN_BITCOIN.chainId) {
            return "BTC";
        }
        if (i == MULTI_COIN_DOGE.chainId) {
            return "DOGE";
        }
        if (i == MULTI_COIN.chainId) {
            return "MULTI_COIN";
        }
        throw new IllegalArgumentException("Unsupported value=" + this.chainId);
    }

    public final int getNetworkResource() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.chainId;
        boolean z4 = false;
        if (i == ERC_20.chainId || i == ERC_20_TEST.chainId) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return R.string.network_type_ethereum;
        }
        if (i == BEP_20.chainId || i == BEP_20_TEST.chainId) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return R.string.network_type_bsc;
        }
        if (i == POLYGON.chainId || i == POLYGON_TEST.chainId) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return R.string.network_type_matic;
        }
        if (i == AVALANCHE_C.chainId || i == AVALANCHE_FUJI_TEST.chainId) {
            z4 = true;
        }
        if (z4) {
            return R.string.network_type_avalanche_c;
        }
        if (i == SOLANA.chainId) {
            return R.string.network_type_solana;
        }
        throw new IllegalArgumentException("Unsupported value=" + this.chainId);
    }

    public final String getOptionalName() {
        int i = this.chainId;
        if (i == AVALANCHE_C.chainId) {
            return "AVALANCHE";
        }
        if (i == MULTI_COIN_BITCOIN.chainId) {
            return "BTC";
        }
        if (i == MULTI_COIN_DOGE.chainId) {
            return "DOGE";
        }
        return getName();
    }

    public final String getPlaneName() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.chainId;
        boolean z4 = false;
        if (i == ERC_20.chainId || i == ERC_20_TEST.chainId) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "Ethereum ERC-20   ";
        }
        if (i == BEP_20.chainId || i == BEP_20_TEST.chainId) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "Smart Chain BEP-20";
        }
        if (i == POLYGON.chainId || i == POLYGON_TEST.chainId) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return "Polygon";
        }
        if (i == AVALANCHE_C.chainId || i == AVALANCHE_FUJI_TEST.chainId) {
            z4 = true;
        }
        if (z4) {
            return "Avalanche C";
        }
        if (i == SOLANA.chainId) {
            return "Solana";
        }
        if (i == MULTI_COIN_BITCOIN.chainId) {
            return "Bitcoin";
        }
        if (i == MULTI_COIN_DOGE.chainId) {
            return "Dogecoin";
        }
        return "Multi-Coin";
    }

    public final String getScanApi() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.chainId;
        boolean z4 = false;
        if (i == ERC_20.chainId || i == ERC_20_TEST.chainId) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "https://api.etherscan.io";
        }
        if (i == BEP_20.chainId || i == BEP_20_TEST.chainId) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "https://api.bscscan.com";
        }
        if (i == POLYGON.chainId || i == POLYGON_TEST.chainId) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return "https://api.polygonscan.com";
        }
        if (i == AVALANCHE_C.chainId || i == AVALANCHE_FUJI_TEST.chainId) {
            z4 = true;
        }
        if (z4) {
            return "https://api.snowtrace.io";
        }
        if (i == SOLANA.chainId) {
            return "https://public-api.solscan.io";
        }
        if (i == MULTI_COIN_BITCOIN.chainId) {
            return "https://blockchain.info";
        }
        if (i == MULTI_COIN_DOGE.chainId) {
            return "https://dogechain.info";
        }
        if (Companion.mo57099b(i).isPartOfMultiChainTokens()) {
            return "https://nourl";
        }
        throw new IllegalArgumentException("Unsupported value=" + this.chainId);
    }

    public final String getSymbolWithType() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.chainId;
        boolean z4 = false;
        if (i == ERC_20.chainId || i == ERC_20_TEST.chainId) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "ERC_ETH";
        }
        if (i == BEP_20.chainId || i == BEP_20_TEST.chainId) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "BEP_BNB";
        }
        if (i == POLYGON.chainId || i == POLYGON_TEST.chainId) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return "POLYGON_MATIC";
        }
        if (i == AVALANCHE_C.chainId || i == AVALANCHE_FUJI_TEST.chainId) {
            z4 = true;
        }
        if (z4) {
            return "AVALANCHE_C_AVAX";
        }
        if (i == SOLANA.chainId) {
            return "SOLANA_SOL";
        }
        if (i == MULTI_COIN_BITCOIN.chainId) {
            return "MULTI_COIN_BITCOIN";
        }
        if (i == MULTI_COIN_DOGE.chainId) {
            return "MULTI_COIN_DOGE";
        }
        throw new IllegalArgumentException("Unsupported value=" + this.chainId);
    }

    public final String getTitle() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.chainId;
        boolean z4 = false;
        if (i == ERC_20.chainId || i == ERC_20_TEST.chainId) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "Ethereum";
        }
        if (i == BEP_20.chainId || i == BEP_20_TEST.chainId) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "Smart Chain";
        }
        if (i == POLYGON.chainId || i == POLYGON_TEST.chainId) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return "Polygon";
        }
        if (i == AVALANCHE_C.chainId || i == AVALANCHE_FUJI_TEST.chainId) {
            z4 = true;
        }
        if (z4) {
            return "Avalanche C";
        }
        if (i == SOLANA.chainId) {
            return "Solana";
        }
        if (i == MULTI_COIN_BITCOIN.chainId) {
            return "Bitcoin";
        }
        if (i == MULTI_COIN_DOGE.chainId) {
            return "Dogecoin";
        }
        if (i == MULTI_COIN.chainId) {
            return "Multi-Coin";
        }
        throw new IllegalArgumentException("Unsupported value=" + this.chainId);
    }

    public final String getWrapAddress() {
        int i = this.chainId;
        if (i == ERC_20.chainId) {
            return "0xc02aaa39b223fe8d0a0e5c4f27ead9083c756cc2";
        }
        if (i == BEP_20.chainId) {
            return "0xbb4CdB9CBd36B01bD1cBaEBF2De08d9173bc095c";
        }
        if (i == BEP_20_TEST.chainId) {
            return "0xae13d989dac2f0debff460ac112a837c89baa7cd";
        }
        if (i == POLYGON.chainId) {
            return "0x0d500B1d8E8eF31E21C99d1Db9A6444d3ADf1270";
        }
        if (i == AVALANCHE_C.chainId) {
            return "0xb31f66aa3c1e785363f0875a1b74e27b85fd66c7";
        }
        return "";
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public final boolean isPartOfMultiChainTokens() {
        int i = this.chainId;
        if (i > 0 || i == SOLANA.chainId) {
            return false;
        }
        return true;
    }

    public final boolean isTestNet() {
        return this.isTestNet;
    }
}

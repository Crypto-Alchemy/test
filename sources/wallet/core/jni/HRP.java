package wallet.core.jni;

import org.web3j.ens.contracts.generated.PublicResolver;

public enum HRP {
    UNKNOWN(0),
    BITCOIN(1),
    LITECOIN(2),
    VIACOIN(3),
    GROESTLCOIN(4),
    DIGIBYTE(5),
    MONACOIN(6),
    COSMOS(7),
    BITCOINCASH(8),
    BITCOINGOLD(9),
    IOTEX(10),
    NERVOS(11),
    ZILLIQA(12),
    TERRA(13),
    CRYPTOORG(14),
    KAVA(15),
    OASIS(16),
    BLUZELLE(17),
    BANDCHAIN(18),
    ELROND(19),
    SECRET(20),
    BINANCE(21),
    ECASH(22),
    THORCHAIN(23),
    HARMONY(24),
    CARDANO(25),
    QTUM(26),
    OSMOSIS(27),
    TERRAV2(28),
    NATIVEEVMOS(29);
    
    private final int value;

    /* renamed from: wallet.core.jni.HRP$1 */
    public static /* synthetic */ class C66501 {
        public static final /* synthetic */ int[] $SwitchMap$wallet$core$jni$HRP = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|(3:59|60|62)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|62) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0150 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x015c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                wallet.core.jni.HRP[] r0 = wallet.core.jni.HRP.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$wallet$core$jni$HRP = r0
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x001d }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.BITCOIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x0028 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.LITECOIN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x0033 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.VIACOIN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x003e }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.GROESTLCOIN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x0049 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.DIGIBYTE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x0054 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.MONACOIN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x0060 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.COSMOS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x006c }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.BITCOINCASH     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x0078 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.BITCOINGOLD     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x0084 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.IOTEX     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x0090 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.NERVOS     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x009c }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.ZILLIQA     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x00a8 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.TERRA     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x00b4 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.CRYPTOORG     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x00c0 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.KAVA     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x00cc }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.OASIS     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x00d8 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.BLUZELLE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x00e4 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.BANDCHAIN     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x00f0 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.ELROND     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x00fc }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.SECRET     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x0108 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.BINANCE     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x0114 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.ECASH     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x0120 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.THORCHAIN     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x012c }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.HARMONY     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x0138 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.CARDANO     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x0144 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.QTUM     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x0150 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.OSMOSIS     // Catch:{ NoSuchFieldError -> 0x0150 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0150 }
            L_0x0150:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x015c }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.TERRAV2     // Catch:{ NoSuchFieldError -> 0x015c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                int[] r0 = $SwitchMap$wallet$core$jni$HRP     // Catch:{ NoSuchFieldError -> 0x0168 }
                wallet.core.jni.HRP r1 = wallet.core.jni.HRP.NATIVEEVMOS     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.HRP.C66501.<clinit>():void");
        }
    }

    private HRP(int i) {
        this.value = i;
    }

    public static HRP createFromValue(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return BITCOIN;
            case 2:
                return LITECOIN;
            case 3:
                return VIACOIN;
            case 4:
                return GROESTLCOIN;
            case 5:
                return DIGIBYTE;
            case 6:
                return MONACOIN;
            case 7:
                return COSMOS;
            case 8:
                return BITCOINCASH;
            case 9:
                return BITCOINGOLD;
            case 10:
                return IOTEX;
            case 11:
                return NERVOS;
            case 12:
                return ZILLIQA;
            case 13:
                return TERRA;
            case 14:
                return CRYPTOORG;
            case 15:
                return KAVA;
            case 16:
                return OASIS;
            case 17:
                return BLUZELLE;
            case 18:
                return BANDCHAIN;
            case 19:
                return ELROND;
            case 20:
                return SECRET;
            case 21:
                return BINANCE;
            case 22:
                return ECASH;
            case 23:
                return THORCHAIN;
            case 24:
                return HARMONY;
            case 25:
                return CARDANO;
            case 26:
                return QTUM;
            case 27:
                return OSMOSIS;
            case 28:
                return TERRAV2;
            case 29:
                return NATIVEEVMOS;
            default:
                return null;
        }
    }

    public String toString() {
        switch (C66501.$SwitchMap$wallet$core$jni$HRP[ordinal()]) {
            case 2:
                return "bc";
            case 3:
                return "ltc";
            case 4:
                return "via";
            case 5:
                return "grs";
            case 6:
                return "dgb";
            case 7:
                return "mona";
            case 8:
                return "cosmos";
            case 9:
                return "bitcoincash";
            case 10:
                return "btg";
            case 11:
                return "io";
            case 12:
                return "ckb";
            case 13:
                return "zil";
            case 14:
                return "terra";
            case 15:
                return "cro";
            case 16:
                return "kava";
            case 17:
                return "oasis";
            case 18:
                return "bluzelle";
            case 19:
                return "band";
            case 20:
                return "erd";
            case 21:
                return "secret";
            case 22:
                return "bnb";
            case 23:
                return "ecash";
            case 24:
                return "thor";
            case 25:
                return "one";
            case 26:
                return PublicResolver.FUNC_ADDR;
            case 27:
                return "qc";
            case 28:
                return "osmo";
            case 29:
                return "terra";
            case 30:
                return "evmos";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }
}

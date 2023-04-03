package wallet.core.jni;

import androidx.recyclerview.widget.RecyclerView;
import com.google.zxing.oned.Code39Reader;

public enum CoinType {
    AETERNITY(457),
    AION(425),
    BINANCE(714),
    BITCOIN(0),
    BITCOINCASH(145),
    BITCOINGOLD(156),
    CALLISTO(820),
    CARDANO(1815),
    COSMOS(118),
    DASH(5),
    DECRED(42),
    DIGIBYTE(20),
    DOGECOIN(3),
    EOS(194),
    ETHEREUM(60),
    ETHEREUMCLASSIC(61),
    FIO(235),
    GOCHAIN(6060),
    GROESTLCOIN(17),
    ICON(74),
    IOTEX(304),
    KAVA(459),
    KIN(2017),
    LITECOIN(2),
    MONACOIN(22),
    NEBULAS(2718),
    NULS(8964),
    NANO(165),
    NEAR(397),
    NIMIQ(242),
    ONTOLOGY(RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE),
    POANETWORK(178),
    QTUM(2301),
    XRP(144),
    SOLANA(501),
    STELLAR(Code39Reader.ASTERISK_ENCODING),
    TEZOS(1729),
    THETA(500),
    THUNDERTOKEN(1001),
    NEO(888),
    TOMOCHAIN(889),
    TRON(195),
    VECHAIN(818),
    VIACOIN(14),
    WANCHAIN(5718350),
    ZCASH(133),
    FIRO(136),
    ZILLIQA(313),
    ZELCASH(19167),
    RAVENCOIN(175),
    WAVES(5741564),
    TERRA(330),
    TERRAV2(10000330),
    HARMONY(1023),
    ALGORAND(283),
    KUSAMA(434),
    POLKADOT(354),
    FILECOIN(461),
    ELROND(508),
    BANDCHAIN(494),
    SMARTCHAINLEGACY(10000714),
    SMARTCHAIN(20000714),
    OASIS(474),
    POLYGON(966),
    THORCHAIN(931),
    BLUZELLE(483),
    OPTIMISM(10000070),
    ZKSYNC(10000280),
    ARBITRUM(10042221),
    ECOCHAIN(10000553),
    AVALANCHECCHAIN(10009000),
    XDAI(10000100),
    FANTOM(10000250),
    CRYPTOORG(394),
    CELO(52752),
    RONIN(10002020),
    OSMOSIS(10000118),
    ECASH(899),
    CRONOSCHAIN(10000025),
    SMARTBITCOINCASH(10000145),
    KUCOINCOMMUNITYCHAIN(10000321),
    BOBA(10000288),
    METIS(1001088),
    AURORA(1323161554),
    EVMOS(10009001),
    NATIVEEVMOS(20009001),
    MOONRIVER(10001285),
    MOONBEAM(10001284),
    KAVAEVM(10002222),
    KLAYTN(10008217),
    METER(18000),
    OKXCHAIN(996),
    NERVOS(309),
    EVERSCALE(396),
    APTOS(637),
    HEDERA(3030),
    SECRET(529);
    
    private final int value;

    private CoinType(int i) {
        this.value = i;
    }

    public static CoinType createFromValue(int i) {
        switch (i) {
            case 0:
                return BITCOIN;
            case 2:
                return LITECOIN;
            case 3:
                return DOGECOIN;
            case 5:
                return DASH;
            case 14:
                return VIACOIN;
            case 17:
                return GROESTLCOIN;
            case 20:
                return DIGIBYTE;
            case 22:
                return MONACOIN;
            case 42:
                return DECRED;
            case 60:
                return ETHEREUM;
            case 61:
                return ETHEREUMCLASSIC;
            case 74:
                return ICON;
            case 118:
                return COSMOS;
            case 133:
                return ZCASH;
            case 136:
                return FIRO;
            case 144:
                return XRP;
            case 145:
                return BITCOINCASH;
            case Code39Reader.ASTERISK_ENCODING:
                return STELLAR;
            case 156:
                return BITCOINGOLD;
            case 165:
                return NANO;
            case 175:
                return RAVENCOIN;
            case 178:
                return POANETWORK;
            case 194:
                return EOS;
            case 195:
                return TRON;
            case 235:
                return FIO;
            case 242:
                return NIMIQ;
            case 283:
                return ALGORAND;
            case 304:
                return IOTEX;
            case 309:
                return NERVOS;
            case 313:
                return ZILLIQA;
            case 330:
                return TERRA;
            case 354:
                return POLKADOT;
            case 394:
                return CRYPTOORG;
            case 396:
                return EVERSCALE;
            case 397:
                return NEAR;
            case 425:
                return AION;
            case 434:
                return KUSAMA;
            case 457:
                return AETERNITY;
            case 459:
                return KAVA;
            case 461:
                return FILECOIN;
            case 474:
                return OASIS;
            case 483:
                return BLUZELLE;
            case 494:
                return BANDCHAIN;
            case 500:
                return THETA;
            case 501:
                return SOLANA;
            case 508:
                return ELROND;
            case 529:
                return SECRET;
            case 637:
                return APTOS;
            case 714:
                return BINANCE;
            case 818:
                return VECHAIN;
            case 820:
                return CALLISTO;
            case 888:
                return NEO;
            case 889:
                return TOMOCHAIN;
            case 899:
                return ECASH;
            case 931:
                return THORCHAIN;
            case 966:
                return POLYGON;
            case 996:
                return OKXCHAIN;
            case 1001:
                return THUNDERTOKEN;
            case 1023:
                return HARMONY;
            case RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE:
                return ONTOLOGY;
            case 1729:
                return TEZOS;
            case 1815:
                return CARDANO;
            case 2017:
                return KIN;
            case 2301:
                return QTUM;
            case 2718:
                return NEBULAS;
            case 3030:
                return HEDERA;
            case 6060:
                return GOCHAIN;
            case 8964:
                return NULS;
            case 18000:
                return METER;
            case 19167:
                return ZELCASH;
            case 52752:
                return CELO;
            case 1001088:
                return METIS;
            case 5718350:
                return WANCHAIN;
            case 5741564:
                return WAVES;
            case 10000025:
                return CRONOSCHAIN;
            case 10000070:
                return OPTIMISM;
            case 10000100:
                return XDAI;
            case 10000118:
                return OSMOSIS;
            case 10000145:
                return SMARTBITCOINCASH;
            case 10000250:
                return FANTOM;
            case 10000280:
                return ZKSYNC;
            case 10000288:
                return BOBA;
            case 10000321:
                return KUCOINCOMMUNITYCHAIN;
            case 10000330:
                return TERRAV2;
            case 10000553:
                return ECOCHAIN;
            case 10000714:
                return SMARTCHAINLEGACY;
            case 10001284:
                return MOONBEAM;
            case 10001285:
                return MOONRIVER;
            case 10002020:
                return RONIN;
            case 10002222:
                return KAVAEVM;
            case 10008217:
                return KLAYTN;
            case 10009000:
                return AVALANCHECCHAIN;
            case 10009001:
                return EVMOS;
            case 10042221:
                return ARBITRUM;
            case 20000714:
                return SMARTCHAIN;
            case 20009001:
                return NATIVEEVMOS;
            case 1323161554:
                return AURORA;
            default:
                return null;
        }
    }

    public native Blockchain blockchain();

    public native String chainId();

    public native Curve curve();

    public native String derivationPath();

    public native String derivationPathWithDerivation(Derivation derivation);

    public native String deriveAddress(PrivateKey privateKey);

    public native String deriveAddressFromPublicKey(PublicKey publicKey);

    public native HRP hrp();

    public native byte p2pkhPrefix();

    public native byte p2shPrefix();

    public native PublicKeyType publicKeyType();

    public native Purpose purpose();

    public native int slip44Id();

    public native int ss58Prefix();

    public native byte staticPrefix();

    public native boolean validate(String str);

    public int value() {
        return this.value;
    }

    public native HDVersion xprvVersion();

    public native HDVersion xpubVersion();
}

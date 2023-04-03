package wallet.core.jni;

import net.sqlcipher.database.SQLiteDatabase;

public enum EthereumChainID {
    ETHEREUM(1),
    CLASSIC(61),
    POA(99),
    VECHAIN(74),
    CALLISTO(820),
    TOMOCHAIN(88),
    POLYGON(137),
    OKC(66),
    THUNDERTOKEN(108),
    GOCHAIN(60),
    METER(82),
    CELO(42220),
    WANCHAIN(888),
    CRONOS(25),
    OPTIMISM(10),
    XDAI(100),
    SMARTBCH(10000),
    FANTOM(SQLiteDatabase.MAX_SQL_CACHE_SIZE),
    ZKSYNC(280),
    BOBA(288),
    KCC(321),
    HECO(128),
    METIS(1088),
    MOONBEAM(1284),
    MOONRIVER(1285),
    RONIN(2020),
    KAVAEVM(2222),
    KLAYTN(8217),
    AVALANCHEC(43114),
    EVMOS(9001),
    ARBITRUM(42161),
    SMARTCHAIN(56),
    AURORA(1313161554);
    
    private final int value;

    private EthereumChainID(int i) {
        this.value = i;
    }

    public static EthereumChainID createFromValue(int i) {
        switch (i) {
            case 1:
                return ETHEREUM;
            case 10:
                return OPTIMISM;
            case 25:
                return CRONOS;
            case 56:
                return SMARTCHAIN;
            case 60:
                return GOCHAIN;
            case 61:
                return CLASSIC;
            case 66:
                return OKC;
            case 74:
                return VECHAIN;
            case 82:
                return METER;
            case 88:
                return TOMOCHAIN;
            case 99:
                return POA;
            case 100:
                return XDAI;
            case 108:
                return THUNDERTOKEN;
            case 128:
                return HECO;
            case 137:
                return POLYGON;
            case SQLiteDatabase.MAX_SQL_CACHE_SIZE /*250*/:
                return FANTOM;
            case 280:
                return ZKSYNC;
            case 288:
                return BOBA;
            case 321:
                return KCC;
            case 820:
                return CALLISTO;
            case 888:
                return WANCHAIN;
            case 1088:
                return METIS;
            case 1284:
                return MOONBEAM;
            case 1285:
                return MOONRIVER;
            case 2020:
                return RONIN;
            case 2222:
                return KAVAEVM;
            case 8217:
                return KLAYTN;
            case 9001:
                return EVMOS;
            case 10000:
                return SMARTBCH;
            case 42161:
                return ARBITRUM;
            case 42220:
                return CELO;
            case 43114:
                return AVALANCHEC;
            case 1313161554:
                return AURORA;
            default:
                return null;
        }
    }

    public int value() {
        return this.value;
    }
}

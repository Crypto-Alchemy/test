package wallet.core.jni;

public enum Blockchain {
    BITCOIN(0),
    ETHEREUM(1),
    VECHAIN(3),
    TRON(4),
    ICON(5),
    BINANCE(6),
    RIPPLE(7),
    TEZOS(8),
    NIMIQ(9),
    STELLAR(10),
    AION(11),
    COSMOS(12),
    THETA(13),
    ONTOLOGY(14),
    ZILLIQA(15),
    IOTEX(16),
    EOS(17),
    NANO(18),
    NULS(19),
    WAVES(20),
    AETERNITY(21),
    NEBULAS(22),
    FIO(23),
    SOLANA(24),
    HARMONY(25),
    NEAR(26),
    ALGORAND(27),
    POLKADOT(29),
    CARDANO(30),
    NEO(31),
    FILECOIN(32),
    ELRONDNETWORK(33),
    OASISNETWORK(34),
    DECRED(35),
    ZCASH(36),
    GROESTLCOIN(37),
    THORCHAIN(38),
    RONIN(39),
    KUSAMA(40),
    NERVOS(41),
    EVERSCALE(42),
    APTOS(43),
    HEDERA(44);
    
    private final int value;

    private Blockchain(int i) {
        this.value = i;
    }

    public static Blockchain createFromValue(int i) {
        switch (i) {
            case 0:
                return BITCOIN;
            case 1:
                return ETHEREUM;
            case 3:
                return VECHAIN;
            case 4:
                return TRON;
            case 5:
                return ICON;
            case 6:
                return BINANCE;
            case 7:
                return RIPPLE;
            case 8:
                return TEZOS;
            case 9:
                return NIMIQ;
            case 10:
                return STELLAR;
            case 11:
                return AION;
            case 12:
                return COSMOS;
            case 13:
                return THETA;
            case 14:
                return ONTOLOGY;
            case 15:
                return ZILLIQA;
            case 16:
                return IOTEX;
            case 17:
                return EOS;
            case 18:
                return NANO;
            case 19:
                return NULS;
            case 20:
                return WAVES;
            case 21:
                return AETERNITY;
            case 22:
                return NEBULAS;
            case 23:
                return FIO;
            case 24:
                return SOLANA;
            case 25:
                return HARMONY;
            case 26:
                return NEAR;
            case 27:
                return ALGORAND;
            case 29:
                return POLKADOT;
            case 30:
                return CARDANO;
            case 31:
                return NEO;
            case 32:
                return FILECOIN;
            case 33:
                return ELRONDNETWORK;
            case 34:
                return OASISNETWORK;
            case 35:
                return DECRED;
            case 36:
                return ZCASH;
            case 37:
                return GROESTLCOIN;
            case 38:
                return THORCHAIN;
            case 39:
                return RONIN;
            case 40:
                return KUSAMA;
            case 41:
                return NERVOS;
            case 42:
                return EVERSCALE;
            case 43:
                return APTOS;
            case 44:
                return HEDERA;
            default:
                return null;
        }
    }

    public int value() {
        return this.value;
    }
}

package wallet.core.jni;

public class CoinTypeConfiguration {
    private byte[] bytes;

    private CoinTypeConfiguration() {
    }

    public static CoinTypeConfiguration createFromNative(byte[] bArr) {
        CoinTypeConfiguration coinTypeConfiguration = new CoinTypeConfiguration();
        coinTypeConfiguration.bytes = bArr;
        return coinTypeConfiguration;
    }

    public static native String getAccountURL(CoinType coinType, String str);

    public static native int getDecimals(CoinType coinType);

    public static native String getID(CoinType coinType);

    public static native String getName(CoinType coinType);

    public static native String getSymbol(CoinType coinType);

    public static native String getTransactionURL(CoinType coinType, String str);
}

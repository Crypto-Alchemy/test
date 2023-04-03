package wallet.core.jni;

public class BitcoinMessageSigner {
    private long nativeHandle = 0;

    private BitcoinMessageSigner() {
    }

    public static BitcoinMessageSigner createFromNative(long j) {
        BitcoinMessageSigner bitcoinMessageSigner = new BitcoinMessageSigner();
        bitcoinMessageSigner.nativeHandle = j;
        return bitcoinMessageSigner;
    }

    public static native String signMessage(PrivateKey privateKey, String str, String str2);

    public static native boolean verifyMessage(String str, String str2, String str3);
}

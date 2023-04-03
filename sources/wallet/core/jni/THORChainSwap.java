package wallet.core.jni;

public class THORChainSwap {
    private byte[] bytes;

    private THORChainSwap() {
    }

    public static native byte[] buildSwap(byte[] bArr);

    public static THORChainSwap createFromNative(byte[] bArr) {
        THORChainSwap tHORChainSwap = new THORChainSwap();
        tHORChainSwap.bytes = bArr;
        return tHORChainSwap;
    }
}

package wallet.core.jni;

public class EthereumAbi {
    private byte[] bytes;

    private EthereumAbi() {
    }

    public static EthereumAbi createFromNative(byte[] bArr) {
        EthereumAbi ethereumAbi = new EthereumAbi();
        ethereumAbi.bytes = bArr;
        return ethereumAbi;
    }

    public static native String decodeCall(byte[] bArr, String str);

    public static native boolean decodeOutput(EthereumAbiFunction ethereumAbiFunction, byte[] bArr);

    public static native byte[] encode(EthereumAbiFunction ethereumAbiFunction);

    public static native byte[] encodeTyped(String str);
}

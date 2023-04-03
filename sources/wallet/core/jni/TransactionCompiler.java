package wallet.core.jni;

public class TransactionCompiler {
    private byte[] bytes;

    private TransactionCompiler() {
    }

    public static native byte[] buildInput(CoinType coinType, String str, String str2, String str3, String str4, String str5, String str6);

    public static native byte[] compileWithSignatures(CoinType coinType, byte[] bArr, DataVector dataVector, DataVector dataVector2);

    public static TransactionCompiler createFromNative(byte[] bArr) {
        TransactionCompiler transactionCompiler = new TransactionCompiler();
        transactionCompiler.bytes = bArr;
        return transactionCompiler;
    }

    public static native byte[] preImageHashes(CoinType coinType, byte[] bArr);
}

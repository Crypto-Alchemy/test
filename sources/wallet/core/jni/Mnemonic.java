package wallet.core.jni;

public class Mnemonic {
    private byte[] bytes;

    private Mnemonic() {
    }

    public static Mnemonic createFromNative(byte[] bArr) {
        Mnemonic mnemonic = new Mnemonic();
        mnemonic.bytes = bArr;
        return mnemonic;
    }

    public static native boolean isValid(String str);

    public static native boolean isValidWord(String str);

    public static native String suggest(String str);
}

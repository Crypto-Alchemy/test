package wallet.core.jni;

import java.security.InvalidParameterException;

public class BitcoinScript {
    private long nativeHandle;

    public BitcoinScript() {
        long nativeCreate = nativeCreate();
        this.nativeHandle = nativeCreate;
        if (nativeCreate != 0) {
            BitcoinScriptPhantomReference.register(this, nativeCreate);
            return;
        }
        throw new InvalidParameterException();
    }

    public static native BitcoinScript buildPayToPublicKey(byte[] bArr);

    public static native BitcoinScript buildPayToPublicKeyHash(byte[] bArr);

    public static native BitcoinScript buildPayToScriptHash(byte[] bArr);

    public static native BitcoinScript buildPayToWitnessPubkeyHash(byte[] bArr);

    public static native BitcoinScript buildPayToWitnessScriptHash(byte[] bArr);

    public static BitcoinScript createFromNative(long j) {
        BitcoinScript bitcoinScript = new BitcoinScript();
        bitcoinScript.nativeHandle = j;
        BitcoinScriptPhantomReference.register(bitcoinScript, j);
        return bitcoinScript;
    }

    public static native boolean equals(BitcoinScript bitcoinScript, BitcoinScript bitcoinScript2);

    public static native int hashTypeForCoin(CoinType coinType);

    public static native BitcoinScript lockScriptForAddress(String str, CoinType coinType);

    public static native long nativeCreate();

    public static native long nativeCreateCopy(BitcoinScript bitcoinScript);

    public static native long nativeCreateWithData(byte[] bArr);

    public static native void nativeDelete(long j);

    public native byte[] data();

    public native byte[] encode();

    public native boolean isPayToScriptHash();

    public native boolean isPayToWitnessPublicKeyHash();

    public native boolean isPayToWitnessScriptHash();

    public native boolean isWitnessProgram();

    public native byte[] matchPayToPubkey();

    public native byte[] matchPayToPubkeyHash();

    public native byte[] matchPayToScriptHash();

    public native byte[] matchPayToWitnessPublicKeyHash();

    public native byte[] matchPayToWitnessScriptHash();

    public native byte[] scriptHash();

    public native int size();

    public BitcoinScript(byte[] bArr) {
        long nativeCreateWithData = nativeCreateWithData(bArr);
        this.nativeHandle = nativeCreateWithData;
        if (nativeCreateWithData != 0) {
            BitcoinScriptPhantomReference.register(this, nativeCreateWithData);
            return;
        }
        throw new InvalidParameterException();
    }

    public BitcoinScript(BitcoinScript bitcoinScript) {
        long nativeCreateCopy = nativeCreateCopy(bitcoinScript);
        this.nativeHandle = nativeCreateCopy;
        if (nativeCreateCopy != 0) {
            BitcoinScriptPhantomReference.register(this, nativeCreateCopy);
            return;
        }
        throw new InvalidParameterException();
    }
}

package wallet.core.jni;

public class Cardano {
    private byte[] bytes;

    private Cardano() {
    }

    public static Cardano createFromNative(byte[] bArr) {
        Cardano cardano = new Cardano();
        cardano.bytes = bArr;
        return cardano;
    }

    public static native String getStakingAddress(String str);

    public static native long minAdaAmount(byte[] bArr);
}

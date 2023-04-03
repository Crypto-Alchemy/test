package p000;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.ECGenParameterSpec;
import java.util.Arrays;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: qb3 */
/* compiled from: Keys */
public class qb3 {
    public static final int ADDRESS_LENGTH_IN_HEX = 40;
    public static final int ADDRESS_SIZE = 160;
    public static final int PRIVATE_KEY_LENGTH_IN_HEX = 64;
    public static final int PRIVATE_KEY_SIZE = 32;
    public static final int PUBLIC_KEY_LENGTH_IN_HEX = 128;
    public static final int PUBLIC_KEY_SIZE = 64;

    static {
        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    private qb3() {
    }

    public static cm1 createEcKeyPair() throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
        return createEcKeyPair(zr5.secureRandom());
    }

    public static KeyPair createSecp256k1KeyPair() throws NoSuchProviderException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        return createSecp256k1KeyPair(zr5.secureRandom());
    }

    public static cm1 deserialize(byte[] bArr) {
        if (bArr.length == 96) {
            return new cm1(pc4.toBigInt(bArr, 0, 32), pc4.toBigInt(bArr, 32, 64));
        }
        throw new RuntimeException("Invalid input key size");
    }

    public static String getAddress(cm1 cm1) {
        return getAddress(cm1.getPublicKey());
    }

    public static byte[] serialize(cm1 cm1) {
        byte[] bytesPadded = pc4.toBytesPadded(cm1.getPrivateKey(), 32);
        byte[] bytesPadded2 = pc4.toBytesPadded(cm1.getPublicKey(), 64);
        byte[] copyOf = Arrays.copyOf(bytesPadded, 96);
        System.arraycopy(bytesPadded2, 0, copyOf, 32, 64);
        return copyOf;
    }

    public static String toChecksumAddress(String str) {
        String lowerCase = pc4.cleanHexPrefix(str).toLowerCase();
        String cleanHexPrefix = pc4.cleanHexPrefix(jl2.sha3String(lowerCase));
        StringBuilder sb = new StringBuilder(lowerCase.length() + 2);
        sb.append("0x");
        for (int i = 0; i < lowerCase.length(); i++) {
            if (Integer.parseInt(String.valueOf(cleanHexPrefix.charAt(i)), 16) >= 8) {
                sb.append(String.valueOf(lowerCase.charAt(i)).toUpperCase());
            } else {
                sb.append(lowerCase.charAt(i));
            }
        }
        return sb.toString();
    }

    public static cm1 createEcKeyPair(SecureRandom secureRandom) throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
        return cm1.create(createSecp256k1KeyPair(secureRandom));
    }

    public static KeyPair createSecp256k1KeyPair(SecureRandom secureRandom) throws NoSuchProviderException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        KeyPairGenerator instance = KeyPairGenerator.getInstance("ECDSA", BouncyCastleProvider.PROVIDER_NAME);
        ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256k1");
        if (secureRandom != null) {
            instance.initialize(eCGenParameterSpec, secureRandom);
        } else {
            instance.initialize(eCGenParameterSpec);
        }
        return instance.generateKeyPair();
    }

    public static String getAddress(BigInteger bigInteger) {
        return getAddress(pc4.toHexStringWithPrefixZeroPadded(bigInteger, 128));
    }

    public static String getAddress(String str) {
        String cleanHexPrefix = pc4.cleanHexPrefix(str);
        if (cleanHexPrefix.length() < 128) {
            cleanHexPrefix = pb6.zeros(128 - cleanHexPrefix.length()) + cleanHexPrefix;
        }
        String sha3 = jl2.sha3(cleanHexPrefix);
        return sha3.substring(sha3.length() - 40);
    }

    public static byte[] getAddress(byte[] bArr) {
        byte[] sha3 = jl2.sha3(bArr);
        return Arrays.copyOfRange(sha3, sha3.length - 20, sha3.length);
    }
}

package p000;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.UUID;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.web3j.crypto.CipherException;
import p000.kh7;

/* renamed from: jg7 */
/* compiled from: Wallet */
public class jg7 {
    public static final String AES_128_CTR = "pbkdf2";
    private static final String CIPHER = "aes-128-ctr";
    private static final int CURRENT_VERSION = 3;
    private static final int DKLEN = 32;
    private static final int N_LIGHT = 4096;
    private static final int N_STANDARD = 262144;
    private static final int P_LIGHT = 6;
    private static final int P_STANDARD = 1;

    /* renamed from: R */
    private static final int f38678R = 8;
    public static final String SCRYPT = "scrypt";

    public static kh7 create(String str, cm1 cm1, int i, int i2) throws CipherException {
        byte[] generateRandomBytes = generateRandomBytes(32);
        byte[] generateDerivedScryptKey = generateDerivedScryptKey(str.getBytes(yl0.UTF_8), generateRandomBytes, i, 8, i2, 32);
        byte[] copyOfRange = Arrays.copyOfRange(generateDerivedScryptKey, 0, 16);
        byte[] generateRandomBytes2 = generateRandomBytes(16);
        byte[] performCipherOperation = performCipherOperation(1, generateRandomBytes2, copyOfRange, pc4.toBytesPadded(cm1.getPrivateKey(), 32));
        return createWalletFile(cm1, performCipherOperation, generateRandomBytes2, generateRandomBytes, generateMac(generateDerivedScryptKey, performCipherOperation), i, i2);
    }

    public static kh7 createLight(String str, cm1 cm1) throws CipherException {
        return create(str, cm1, 4096, 6);
    }

    public static kh7 createStandard(String str, cm1 cm1) throws CipherException {
        return create(str, cm1, N_STANDARD, 1);
    }

    private static kh7 createWalletFile(cm1 cm1, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, int i2) {
        kh7 kh7 = new kh7();
        kh7.setAddress(qb3.getAddress(cm1));
        kh7.C7347c cVar = new kh7.C7347c();
        cVar.setCipher(CIPHER);
        cVar.setCiphertext(pc4.toHexStringNoPrefix(bArr));
        kh7.C7346b bVar = new kh7.C7346b();
        bVar.setIv(pc4.toHexStringNoPrefix(bArr2));
        cVar.setCipherparams(bVar);
        cVar.setKdf(SCRYPT);
        kh7.C7349e eVar = new kh7.C7349e();
        eVar.setDklen(32);
        eVar.setN(i);
        eVar.setP(i2);
        eVar.setR(8);
        eVar.setSalt(pc4.toHexStringNoPrefix(bArr3));
        cVar.setKdfparams(eVar);
        cVar.setMac(pc4.toHexStringNoPrefix(bArr4));
        kh7.setCrypto(cVar);
        kh7.setId(UUID.randomUUID().toString());
        kh7.setVersion(3);
        return kh7;
    }

    public static cm1 decrypt(String str, kh7 kh7) throws CipherException {
        byte[] bArr;
        validate(kh7);
        kh7.C7347c crypto = kh7.getCrypto();
        byte[] hexStringToByteArray = pc4.hexStringToByteArray(crypto.getMac());
        byte[] hexStringToByteArray2 = pc4.hexStringToByteArray(crypto.getCipherparams().getIv());
        byte[] hexStringToByteArray3 = pc4.hexStringToByteArray(crypto.getCiphertext());
        kh7.C7348d kdfparams = crypto.getKdfparams();
        if (kdfparams instanceof kh7.C7349e) {
            kh7.C7349e eVar = (kh7.C7349e) crypto.getKdfparams();
            int dklen = eVar.getDklen();
            int n = eVar.getN();
            int p = eVar.getP();
            int r = eVar.getR();
            bArr = generateDerivedScryptKey(str.getBytes(yl0.UTF_8), pc4.hexStringToByteArray(eVar.getSalt()), n, r, p, dklen);
        } else if (kdfparams instanceof kh7.C7345a) {
            kh7.C7345a aVar = (kh7.C7345a) crypto.getKdfparams();
            int c = aVar.getC();
            String prf = aVar.getPrf();
            bArr = generateAes128CtrDerivedKey(str.getBytes(yl0.UTF_8), pc4.hexStringToByteArray(aVar.getSalt()), c, prf);
        } else {
            throw new CipherException("Unable to deserialize params: " + crypto.getKdf());
        }
        if (Arrays.equals(generateMac(bArr, hexStringToByteArray3), hexStringToByteArray)) {
            return cm1.create(performCipherOperation(2, hexStringToByteArray2, Arrays.copyOfRange(bArr, 0, 16), hexStringToByteArray3));
        }
        throw new CipherException("Invalid password provided");
    }

    private static byte[] generateAes128CtrDerivedKey(byte[] bArr, byte[] bArr2, int i, String str) throws CipherException {
        if (str.equals("hmac-sha256")) {
            vj4 vj4 = new vj4(new bj5());
            vj4.mo65867b(bArr, bArr2, i);
            return ((va3) vj4.mo66532e(256)).mo66464a();
        }
        throw new CipherException("Unsupported prf:" + str);
    }

    private static byte[] generateDerivedScryptKey(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) throws CipherException {
        return ui5.m72800i(bArr, bArr2, i, i2, i3, i4);
    }

    private static byte[] generateMac(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr2.length + 16)];
        System.arraycopy(bArr, 16, bArr3, 0, 16);
        System.arraycopy(bArr2, 0, bArr3, 16, bArr2.length);
        return jl2.sha3(bArr3);
    }

    public static byte[] generateRandomBytes(int i) {
        byte[] bArr = new byte[i];
        zr5.secureRandom().nextBytes(bArr);
        return bArr;
    }

    private static byte[] performCipherOperation(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) throws CipherException {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            instance.init(i, new SecretKeySpec(bArr2, "AES"), ivParameterSpec);
            return instance.doFinal(bArr3);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new CipherException("Error performing cipher operation", e);
        }
    }

    public static void validate(kh7 kh7) throws CipherException {
        kh7.C7347c crypto = kh7.getCrypto();
        if (kh7.getVersion() != 3) {
            throw new CipherException("Wallet version is not supported");
        } else if (!crypto.getCipher().equals(CIPHER)) {
            throw new CipherException("Wallet cipher is not supported");
        } else if (!crypto.getKdf().equals(AES_128_CTR) && !crypto.getKdf().equals(SCRYPT)) {
            throw new CipherException("KDF type is not supported");
        }
    }
}

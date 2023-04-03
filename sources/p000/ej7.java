package p000;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.web3j.crypto.CipherException;

/* renamed from: ej7 */
/* compiled from: WalletUtils */
public class ej7 {
    private static final ObjectMapper objectMapper;
    private static final SecureRandom secureRandom = zr5.secureRandom();

    static {
        ObjectMapper objectMapper2 = new ObjectMapper();
        objectMapper = objectMapper2;
        objectMapper2.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        objectMapper2.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static u10 generateBip39Wallet(String str, File file) throws CipherException, IOException {
        byte[] bArr = new byte[16];
        secureRandom.nextBytes(bArr);
        String generateMnemonic = ew3.generateMnemonic(bArr);
        return new u10(generateWalletFile(str, cm1.create(jl2.sha256(ew3.generateSeed(generateMnemonic, str))), file, false), generateMnemonic);
    }

    public static u10 generateBip39WalletFromMnemonic(String str, String str2, File file) throws CipherException, IOException {
        return new u10(generateWalletFile(str, cm1.create(jl2.sha256(ew3.generateSeed(str2, str))), file, false), str2);
    }

    public static String generateFullNewWalletFile(String str, File file) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException, CipherException, IOException {
        return generateNewWalletFile(str, file, true);
    }

    public static String generateLightNewWalletFile(String str, File file) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException, CipherException, IOException {
        return generateNewWalletFile(str, file, false);
    }

    public static String generateNewWalletFile(String str, File file) throws CipherException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException, IOException {
        return generateFullNewWalletFile(str, file);
    }

    public static String generateWalletFile(String str, cm1 cm1, File file, boolean z) throws CipherException, IOException {
        kh7 kh7;
        if (z) {
            kh7 = jg7.createStandard(str, cm1);
        } else {
            kh7 = jg7.createLight(str, cm1);
        }
        String walletFileName = getWalletFileName(kh7);
        objectMapper.writeValue(new File(file, walletFileName), (Object) kh7);
        return walletFileName;
    }

    public static String getDefaultKeyDirectory() {
        return getDefaultKeyDirectory(System.getProperty("os.name"));
    }

    public static String getMainnetKeyDirectory() {
        return String.format("%s%skeystore", new Object[]{getDefaultKeyDirectory(), File.separator});
    }

    public static String getRinkebyKeyDirectory() {
        String str = File.separator;
        return String.format("%s%srinkeby%skeystore", new Object[]{getDefaultKeyDirectory(), str, str});
    }

    public static String getTestnetKeyDirectory() {
        String str = File.separator;
        return String.format("%s%stestnet%skeystore", new Object[]{getDefaultKeyDirectory(), str, str});
    }

    private static String getWalletFileName(kh7 kh7) {
        return timestamp(new Date()) + kh7.getAddress() + ".json";
    }

    public static boolean isValidAddress(String str) {
        return isValidAddress(str, 40);
    }

    public static boolean isValidPrivateKey(String str) {
        if (pc4.cleanHexPrefix(str).length() == 64) {
            return true;
        }
        return false;
    }

    public static cw0 loadBip39Credentials(String str, String str2) {
        return cw0.create(cm1.create(jl2.sha256(ew3.generateSeed(str2, str))));
    }

    public static cw0 loadCredentials(String str, String str2) throws IOException, CipherException {
        return loadCredentials(str, new File(str2));
    }

    public static cw0 loadJsonCredentials(String str, String str2) throws IOException, CipherException {
        return cw0.create(jg7.decrypt(str, (kh7) objectMapper.readValue(str2, kh7.class)));
    }

    public static String timestamp(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("'UTC--'yyyy-MM-dd'T'HH-mm-ss.S'Z--'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    public static String generateNewWalletFile(String str, File file, boolean z) throws CipherException, IOException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
        return generateWalletFile(str, qb3.createEcKeyPair(), file, z);
    }

    public static String getDefaultKeyDirectory(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("mac")) {
            String str2 = File.separator;
            return String.format("%s%sLibrary%sEthereum", new Object[]{System.getProperty("user.home"), str2, str2});
        } else if (lowerCase.startsWith("win")) {
            return String.format("%s%sEthereum", new Object[]{System.getenv("APPDATA"), File.separator});
        } else {
            return String.format("%s%s.ethereum", new Object[]{System.getProperty("user.home"), File.separator});
        }
    }

    public static boolean isValidAddress(String str, int i) {
        String cleanHexPrefix = pc4.cleanHexPrefix(str);
        try {
            pc4.toBigIntNoPrefix(cleanHexPrefix);
            if (cleanHexPrefix.length() == i) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static cw0 loadCredentials(String str, File file) throws IOException, CipherException {
        return cw0.create(jg7.decrypt(str, (kh7) objectMapper.readValue(file, kh7.class)));
    }
}

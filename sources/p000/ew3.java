package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/* renamed from: ew3 */
/* compiled from: MnemonicUtils */
public class ew3 {
    private static final int SEED_ITERATIONS = 2048;
    private static final int SEED_KEY_SIZE = 512;
    private static List<String> WORD_LIST;

    public static byte calculateChecksum(byte[] bArr) {
        return (byte) (jl2.sha256(bArr)[0] & ((byte) (255 << (8 - ((bArr.length * 8) / 32)))));
    }

    private static boolean[] convertToBits(byte[] bArr, byte b) {
        int length = bArr.length * 8;
        int i = length / 32;
        boolean[] zArr = new boolean[(length + i)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            for (int i3 = 0; i3 < 8; i3++) {
                zArr[(i2 * 8) + i3] = toBit(bArr[i2], i3);
            }
        }
        for (int i4 = 0; i4 < i; i4++) {
            zArr[length + i4] = toBit(b, i4);
        }
        return zArr;
    }

    public static byte[] generateEntropy(String str) {
        BitSet bitSet = new BitSet();
        int mnemonicToBits = mnemonicToBits(str, bitSet);
        if (mnemonicToBits != 0) {
            int i = (mnemonicToBits * 32) / 33;
            if (i % 8 == 0) {
                int i2 = i / 8;
                byte[] bArr = new byte[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    bArr[i3] = readByte(bitSet, i3);
                }
                validateEntropy(bArr);
                if (calculateChecksum(bArr) == readByte(bitSet, i2)) {
                    return bArr;
                }
                throw new IllegalArgumentException("Wrong checksum");
            }
            throw new IllegalArgumentException("Wrong mnemonic size");
        }
        throw new IllegalArgumentException("Empty mnemonic");
    }

    public static String generateMnemonic(byte[] bArr) {
        boolean z;
        validateEntropy(bArr);
        List<String> words = getWords();
        int length = bArr.length * 8;
        boolean[] convertToBits = convertToBits(bArr, calculateChecksum(bArr));
        int i = (length + (length / 32)) / 11;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(words.get(toInt(nextElevenBits(convertToBits, i2))));
            if (i2 < i - 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static byte[] generateSeed(String str, String str2) {
        if (!isMnemonicEmpty(str)) {
            if (str2 == null) {
                str2 = "";
            }
            String format = String.format("mnemonic%s", new Object[]{str2});
            vj4 vj4 = new vj4(new fj5());
            vj4.mo65867b(str.getBytes(StandardCharsets.UTF_8), format.getBytes(StandardCharsets.UTF_8), 2048);
            return ((va3) vj4.mo66532e(512)).mo66464a();
        }
        throw new IllegalArgumentException("Mnemonic is required to generate a seed");
    }

    public static List<String> getWords() {
        if (WORD_LIST == null) {
            WORD_LIST = Collections.unmodifiableList(populateWordList());
        }
        return WORD_LIST;
    }

    private static boolean isBitSet(int i, int i2) {
        return ((i >> i2) & 1) == 1;
    }

    private static boolean isMnemonicEmpty(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    private static int mnemonicToBits(String str, BitSet bitSet) {
        List<String> words = getWords();
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = words.indexOf(nextToken);
            if (indexOf >= 0) {
                int i2 = 0;
                while (i2 < 11) {
                    bitSet.set(i, isBitSet(indexOf, 10 - i2));
                    i2++;
                    i++;
                }
            } else {
                throw new IllegalArgumentException(String.format("Mnemonic word '%s' should be in the word list", new Object[]{nextToken}));
            }
        }
        return i;
    }

    private static boolean[] nextElevenBits(boolean[] zArr, int i) {
        int i2 = i * 11;
        return Arrays.copyOfRange(zArr, i2, i2 + 11);
    }

    private static List<String> populateWordList() {
        try {
            return readAllLines(Thread.currentThread().getContextClassLoader().getResourceAsStream("en-mnemonic-word-list.txt"));
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    private static List<String> readAllLines(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayList arrayList = new ArrayList();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return arrayList;
            }
            arrayList.add(readLine);
        }
    }

    private static byte readByte(BitSet bitSet, int i) {
        byte b = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            if (bitSet.get((8 * i) + i2)) {
                b = (byte) (b | (1 << (7 - i2)));
            }
        }
        return b;
    }

    private static boolean toBit(byte b, int i) {
        return ((b >>> (7 - i)) & 1) > 0;
    }

    private static int toInt(boolean[] zArr) {
        int i = 0;
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (zArr[i2]) {
                i += 1 << ((zArr.length - i2) - 1);
            }
        }
        return i;
    }

    private static void validateEntropy(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length * 8;
            if (length < 128 || length > 256 || length % 32 != 0) {
                throw new IllegalArgumentException("The allowed size of ENT is 128-256 bits of multiples of 32");
            }
            return;
        }
        throw new IllegalArgumentException("Entropy is required");
    }

    public static boolean validateMnemonic(String str) {
        try {
            generateEntropy(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}

package p000;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.util.Arrays;

/* renamed from: c16 */
/* compiled from: Sign */
public class c16 {
    public static final int CHAIN_ID_INC = 35;
    public static final xl1 CURVE;
    public static final co7 CURVE_PARAMS;
    public static final BigInteger HALF_CURVE_ORDER;
    public static final int LOWER_REAL_V = 27;
    public static final String MESSAGE_PREFIX = "\u0019Ethereum Signed Message:\n";
    public static final int REPLAY_PROTECTED_V_MIN = 37;

    /* renamed from: c16$a */
    /* compiled from: Sign */
    public static class C6919a {

        /* renamed from: r */
        private final byte[] f37035r;

        /* renamed from: s */
        private final byte[] f37036s;

        /* renamed from: v */
        private final byte[] f37037v;

        public C6919a(byte b, byte[] bArr, byte[] bArr2) {
            this(new byte[]{b}, bArr, bArr2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C6919a aVar = (C6919a) obj;
            if (Arrays.equals(this.f37037v, aVar.f37037v) && Arrays.equals(this.f37035r, aVar.f37035r)) {
                return Arrays.equals(this.f37036s, aVar.f37036s);
            }
            return false;
        }

        public byte[] getR() {
            return this.f37035r;
        }

        public byte[] getS() {
            return this.f37036s;
        }

        public byte[] getV() {
            return this.f37037v;
        }

        public int hashCode() {
            return (((Arrays.hashCode(this.f37037v) * 31) + Arrays.hashCode(this.f37035r)) * 31) + Arrays.hashCode(this.f37036s);
        }

        public C6919a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.f37037v = bArr;
            this.f37035r = bArr2;
            this.f37036s = bArr3;
        }
    }

    static {
        co7 i = by0.m56203i("secp256k1");
        CURVE_PARAMS = i;
        CURVE = new xl1(i.mo50929r(), i.mo50930s(), i.mo50932w(), i.mo50931t());
        HALF_CURVE_ORDER = i.mo50932w().shiftRight(1);
    }

    public static C6919a createSignatureData(vl1 vl1, BigInteger bigInteger, byte[] bArr) {
        int i = 0;
        while (true) {
            if (i >= 4) {
                i = -1;
                break;
            }
            BigInteger recoverFromSignature = recoverFromSignature(i, vl1, bArr);
            if (recoverFromSignature != null && recoverFromSignature.equals(bigInteger)) {
                break;
            }
            i++;
        }
        if (i != -1) {
            return new C6919a(new byte[]{(byte) (i + 27)}, pc4.toBytesPadded(vl1.f45325r, 32), pc4.toBytesPadded(vl1.f45326s, 32));
        }
        throw new RuntimeException("Could not construct a recoverable key. Are your credentials valid?");
    }

    private static nm1 decompressKey(BigInteger bigInteger, boolean z) {
        int i;
        ho7 ho7 = new ho7();
        xl1 xl1 = CURVE;
        byte[] c = ho7.mo52295c(bigInteger, ho7.mo52293a(xl1.mo66881a()) + 1);
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        c[0] = (byte) i;
        return xl1.mo66881a().mo66313j(c);
    }

    public static byte[] getEthereumMessageHash(byte[] bArr) {
        byte[] ethereumMessagePrefix = getEthereumMessagePrefix(bArr.length);
        byte[] bArr2 = new byte[(ethereumMessagePrefix.length + bArr.length)];
        System.arraycopy(ethereumMessagePrefix, 0, bArr2, 0, ethereumMessagePrefix.length);
        System.arraycopy(bArr, 0, bArr2, ethereumMessagePrefix.length, bArr.length);
        return jl2.sha3(bArr2);
    }

    public static byte[] getEthereumMessagePrefix(int i) {
        return MESSAGE_PREFIX.concat(String.valueOf(i)).getBytes(StandardCharsets.UTF_8);
    }

    public static int getRecId(C6919a aVar, long j) {
        BigInteger bigInt = pc4.toBigInt(aVar.getV());
        BigInteger valueOf = BigInteger.valueOf(27);
        BigInteger valueOf2 = BigInteger.valueOf(28);
        BigInteger valueOf3 = BigInteger.valueOf(37);
        BigInteger valueOf4 = BigInteger.valueOf(35);
        if (bigInt.equals(valueOf) || bigInt.equals(valueOf2)) {
            return bigInt.subtract(valueOf).intValue();
        }
        if (bigInt.compareTo(valueOf3) >= 0) {
            return bigInt.subtract(BigInteger.valueOf(j).multiply(i10.f38312c)).subtract(valueOf4).intValue();
        }
        throw new IllegalArgumentException(String.format("Unsupported v parameter: %s", new Object[]{bigInt}));
    }

    public static byte[] getVFromRecId(int i) {
        return new byte[]{(byte) (i + 27)};
    }

    public static BigInteger publicFromPoint(byte[] bArr) {
        return new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
    }

    public static BigInteger publicKeyFromPrivate(BigInteger bigInteger) {
        byte[] l = publicPointFromPrivate(bigInteger).mo62743l(false);
        return new BigInteger(1, Arrays.copyOfRange(l, 1, l.length));
    }

    public static nm1 publicPointFromPrivate(BigInteger bigInteger) {
        int bitLength = bigInteger.bitLength();
        xl1 xl1 = CURVE;
        if (bitLength > xl1.mo66884d().bitLength()) {
            bigInteger = bigInteger.mod(xl1.mo66884d());
        }
        return new k32().mo51129a(xl1.mo66882b(), bigInteger);
    }

    public static BigInteger recoverFromSignature(int i, vl1 vl1, byte[] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (i < 0 || i > 3) {
            z = false;
        } else {
            z = true;
        }
        C7305jr.verifyPrecondition(z, "recId must be in the range of [0, 3]");
        if (vl1.f45325r.signum() >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C7305jr.verifyPrecondition(z2, "r must be positive");
        if (vl1.f45326s.signum() >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C7305jr.verifyPrecondition(z3, "s must be positive");
        if (bArr != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        C7305jr.verifyPrecondition(z4, "message cannot be null");
        xl1 xl1 = CURVE;
        BigInteger d = xl1.mo66884d();
        BigInteger add = vl1.f45325r.add(BigInteger.valueOf(((long) i) / 2).multiply(d));
        if (add.compareTo(bp5.f36923j) >= 0) {
            return null;
        }
        if ((i & 1) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        nm1 decompressKey = decompressKey(add, z5);
        if (!decompressKey.mo62755y(d).mo62751u()) {
            return null;
        }
        BigInteger mod = BigInteger.ZERO.subtract(new BigInteger(1, bArr)).mod(d);
        BigInteger modInverse = vl1.f45325r.modInverse(d);
        byte[] l = sl1.m71978q(xl1.mo66882b(), modInverse.multiply(mod).mod(d), decompressKey, modInverse.multiply(vl1.f45326s).mod(d)).mo62743l(false);
        return new BigInteger(1, Arrays.copyOfRange(l, 1, l.length));
    }

    public static C6919a signMessage(byte[] bArr, cm1 cm1) {
        return signMessage(bArr, cm1, true);
    }

    public static C6919a signPrefixedMessage(byte[] bArr, cm1 cm1) {
        return signMessage(getEthereumMessageHash(bArr), cm1, false);
    }

    public static BigInteger signedMessageHashToKey(byte[] bArr, C6919a aVar) throws SignatureException {
        boolean z;
        boolean z2;
        byte[] r = aVar.getR();
        byte[] s = aVar.getS();
        if (r == null || r.length != 32) {
            z = false;
        } else {
            z = true;
        }
        C7305jr.verifyPrecondition(z, "r must be 32 bytes");
        if (s == null || s.length != 32) {
            z2 = false;
        } else {
            z2 = true;
        }
        C7305jr.verifyPrecondition(z2, "s must be 32 bytes");
        byte b = aVar.getV()[0] & 255;
        if (b < 27 || b > 34) {
            throw new SignatureException("Header byte out of range: " + b);
        }
        BigInteger recoverFromSignature = recoverFromSignature(b - 27, new vl1(new BigInteger(1, aVar.getR()), new BigInteger(1, aVar.getS())), bArr);
        if (recoverFromSignature != null) {
            return recoverFromSignature;
        }
        throw new SignatureException("Could not recover public key from signature");
    }

    public static BigInteger signedMessageToKey(byte[] bArr, C6919a aVar) throws SignatureException {
        return signedMessageHashToKey(jl2.sha3(bArr), aVar);
    }

    public static BigInteger signedPrefixedMessageToKey(byte[] bArr, C6919a aVar) throws SignatureException {
        return signedMessageHashToKey(getEthereumMessageHash(bArr), aVar);
    }

    public static C6919a signMessage(byte[] bArr, cm1 cm1, boolean z) {
        BigInteger publicKey = cm1.getPublicKey();
        if (z) {
            bArr = jl2.sha3(bArr);
        }
        return createSignatureData(cm1.sign(bArr), publicKey, bArr);
    }
}

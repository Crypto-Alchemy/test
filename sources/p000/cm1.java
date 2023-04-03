package p000;

import java.math.BigInteger;
import java.security.KeyPair;
import java.util.Arrays;
import org.bouncycastle.jcajce.provider.asymmetric.p024ec.BCECPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.p024ec.BCECPublicKey;

/* renamed from: cm1 */
/* compiled from: ECKeyPair */
public class cm1 {
    private final BigInteger privateKey;
    private final BigInteger publicKey;

    public cm1(BigInteger bigInteger, BigInteger bigInteger2) {
        this.privateKey = bigInteger;
        this.publicKey = bigInteger2;
    }

    public static cm1 create(KeyPair keyPair) {
        BigInteger d = ((BCECPrivateKey) keyPair.getPrivate()).getD();
        byte[] l = ((BCECPublicKey) keyPair.getPublic()).getQ().mo62743l(false);
        return new cm1(d, new BigInteger(1, Arrays.copyOfRange(l, 1, l.length)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cm1 cm1 = (cm1) obj;
        BigInteger bigInteger = this.privateKey;
        if (bigInteger == null ? cm1.privateKey != null : !bigInteger.equals(cm1.privateKey)) {
            return false;
        }
        BigInteger bigInteger2 = this.publicKey;
        if (bigInteger2 != null) {
            return bigInteger2.equals(cm1.publicKey);
        }
        if (cm1.publicKey == null) {
            return true;
        }
        return false;
    }

    public BigInteger getPrivateKey() {
        return this.privateKey;
    }

    public BigInteger getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        int i;
        BigInteger bigInteger = this.privateKey;
        int i2 = 0;
        if (bigInteger != null) {
            i = bigInteger.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        BigInteger bigInteger2 = this.publicKey;
        if (bigInteger2 != null) {
            i2 = bigInteger2.hashCode();
        }
        return i3 + i2;
    }

    public vl1 sign(byte[] bArr) {
        wl1 wl1 = new wl1(new mk2(new bj5()));
        wl1.mo66732d(true, new qm1(this.privateKey, c16.CURVE));
        BigInteger[] c = wl1.mo66731c(bArr);
        return new vl1(c[0], c[1]).toCanonicalised();
    }

    public static cm1 create(BigInteger bigInteger) {
        return new cm1(bigInteger, c16.publicKeyFromPrivate(bigInteger));
    }

    public static cm1 create(byte[] bArr) {
        return create(pc4.toBigInt(bArr));
    }
}

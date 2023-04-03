package p000;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.List;
import org.web3j.crypto.exception.CryptoWeb3jException;
import p000.c16;

/* renamed from: vt6 */
/* compiled from: TransactionEncoder */
public class vt6 {
    public static List<gh5> asRlpValues(h75 h75, c16.C6919a aVar) {
        return h75.getTransaction().asRlpValues(aVar);
    }

    public static c16.C6919a createEip155SignatureData(c16.C6919a aVar, long j) {
        return new c16.C6919a(pc4.toBigInt(aVar.getV()).subtract(BigInteger.valueOf(27)).add(BigInteger.valueOf(j).multiply(BigInteger.valueOf(2))).add(BigInteger.valueOf(35)).toByteArray(), aVar.getR(), aVar.getS());
    }

    public static byte[] encode(h75 h75) {
        return encode(h75, (c16.C6919a) null);
    }

    private static byte[] longToBytes(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(j);
        return allocate.array();
    }

    public static byte[] signMessage(h75 h75, cw0 cw0) {
        return encode(h75, c16.signMessage(encode(h75), cw0.getEcKeyPair()));
    }

    public static byte[] encode(h75 h75, long j) {
        if (h75.getType().isLegacy()) {
            return encode(h75, new c16.C6919a(longToBytes(j), new byte[0], new byte[0]));
        }
        throw new CryptoWeb3jException("Incorrect transaction type. Tx type should be Legacy.");
    }

    public static byte[] signMessage(h75 h75, long j, cw0 cw0) {
        if (h75.getType().isEip1559()) {
            return signMessage(h75, cw0);
        }
        return encode(h75, createEip155SignatureData(c16.signMessage(encode(h75, j), cw0.getEcKeyPair()), j));
    }

    @Deprecated
    public static c16.C6919a createEip155SignatureData(c16.C6919a aVar, byte b) {
        return createEip155SignatureData(aVar, (long) b);
    }

    @Deprecated
    public static byte[] encode(h75 h75, byte b) {
        return encode(h75, (long) b);
    }

    public static byte[] encode(h75 h75, c16.C6919a aVar) {
        byte[] encode = dh5.encode(new eh5(asRlpValues(h75, aVar)));
        return h75.getType().isEip1559() ? ByteBuffer.allocate(encode.length + 1).put(h75.getType().getRlpType().byteValue()).put(encode).array() : encode;
    }

    @Deprecated
    public static byte[] signMessage(h75 h75, byte b, cw0 cw0) {
        return signMessage(h75, (long) b, cw0);
    }
}

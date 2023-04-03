package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ee */
/* compiled from: AesEaxJce */
public final class C5786ee implements C5954id {

    /* renamed from: e */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f28581e = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* renamed from: f */
    public static final ThreadLocal<Cipher> f28582f = new C5787a();

    /* renamed from: g */
    public static final ThreadLocal<Cipher> f28583g = new C5788b();

    /* renamed from: a */
    public final byte[] f28584a;

    /* renamed from: b */
    public final byte[] f28585b;

    /* renamed from: c */
    public final SecretKeySpec f28586c;

    /* renamed from: d */
    public final int f28587d;

    /* renamed from: ee$a */
    /* compiled from: AesEaxJce */
    public class C5787a extends ThreadLocal<Cipher> {
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return cq1.f27858e.mo41605a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: ee$b */
    /* compiled from: AesEaxJce */
    public class C5788b extends ThreadLocal<Cipher> {
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return cq1.f27858e.mo41605a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C5786ee(byte[] bArr, int i) throws GeneralSecurityException {
        if (!f28581e.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i == 12 || i == 16) {
            this.f28587d = i;
            a87.m31749a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f28586c = secretKeySpec;
            Cipher cipher = f28582f.get();
            cipher.init(1, secretKeySpec);
            byte[] c = m43932c(cipher.doFinal(new byte[16]));
            this.f28584a = c;
            this.f28585b = m43932c(c);
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    /* renamed from: c */
    public static byte[] m43932c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    /* renamed from: f */
    public static byte[] m43933f(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public byte[] mo29526a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        byte[] bArr4 = bArr;
        int length = bArr4.length;
        int i = this.f28587d;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr5 = new byte[(bArr4.length + i + 16)];
            byte[] c = y65.m54637c(i);
            System.arraycopy(c, 0, bArr5, 0, this.f28587d);
            Cipher cipher = f28582f.get();
            cipher.init(1, this.f28586c);
            byte[] d = mo42273d(cipher, 0, c, 0, c.length);
            if (bArr2 == null) {
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr2;
            }
            byte[] d2 = mo42273d(cipher, 1, bArr3, 0, bArr3.length);
            Cipher cipher2 = f28583g.get();
            cipher2.init(1, this.f28586c, new IvParameterSpec(d));
            cipher2.doFinal(bArr, 0, bArr4.length, bArr5, this.f28587d);
            byte[] d3 = mo42273d(cipher, 2, bArr5, this.f28587d, bArr4.length);
            int length2 = bArr4.length + this.f28587d;
            for (int i2 = 0; i2 < 16; i2++) {
                bArr5[length2 + i2] = (byte) ((d2[i2] ^ d[i2]) ^ d3[i2]);
            }
            return bArr5;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public byte[] mo29527b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = (bArr.length - this.f28587d) - 16;
        if (length >= 0) {
            Cipher cipher = f28582f.get();
            cipher.init(1, this.f28586c);
            byte[] d = mo42273d(cipher, 0, bArr, 0, this.f28587d);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] d2 = mo42273d(cipher, 1, bArr3, 0, bArr3.length);
            byte[] d3 = mo42273d(cipher, 2, bArr, this.f28587d, length);
            int length2 = bArr.length - 16;
            byte b = 0;
            for (int i = 0; i < 16; i++) {
                b = (byte) (b | (((bArr[length2 + i] ^ d2[i]) ^ d[i]) ^ d3[i]));
            }
            if (b == 0) {
                Cipher cipher2 = f28583g.get();
                cipher2.init(1, this.f28586c, new IvParameterSpec(d));
                return cipher2.doFinal(bArr, this.f28587d, length);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: d */
    public final byte[] mo42273d(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m43933f(bArr2, this.f28584a));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            doFinal = cipher.doFinal(doFinal);
            i4 += 16;
        }
        return cipher.doFinal(m43933f(doFinal, mo42274e(Arrays.copyOfRange(bArr, i4 + i2, i2 + i3))));
    }

    /* renamed from: e */
    public final byte[] mo42274e(byte[] bArr) {
        if (bArr.length == 16) {
            return m43933f(bArr, this.f28584a);
        }
        byte[] copyOf = Arrays.copyOf(this.f28585b, 16);
        for (int i = 0; i < bArr.length; i++) {
            copyOf[i] = (byte) (copyOf[i] ^ bArr[i]);
        }
        copyOf[bArr.length] = (byte) (copyOf[bArr.length] ^ 128);
        return copyOf;
    }
}

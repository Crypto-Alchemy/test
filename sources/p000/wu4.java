package p000;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

@Immutable
/* renamed from: wu4 */
/* compiled from: PrfMac */
public class wu4 implements lm3 {

    /* renamed from: a */
    public final tu4 f35437a;

    /* renamed from: b */
    public final int f35438b;

    public wu4(tu4 tu4, int i) throws GeneralSecurityException {
        this.f35437a = tu4;
        this.f35438b = i;
        if (i >= 10) {
            tu4.mo48232a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public void mo45449a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!g70.m44637b(mo45450b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    /* renamed from: b */
    public byte[] mo45450b(byte[] bArr) throws GeneralSecurityException {
        return this.f35437a.mo48232a(bArr, this.f35438b);
    }
}

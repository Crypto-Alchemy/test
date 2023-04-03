package p000;

import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;

/* renamed from: ld3 */
public class ld3 {
    /* renamed from: a */
    public static pd3 m63803a(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i, byte[] bArr, byte[] bArr2) throws IllegalArgumentException {
        if (bArr2 == null || bArr2.length < lMSigParameters.mo64590d()) {
            throw new IllegalArgumentException("root seed is less than " + lMSigParameters.mo64590d());
        }
        return new pd3(lMSigParameters, lMOtsParameters, i, bArr, 1 << lMSigParameters.mo64589c(), bArr2);
    }

    /* renamed from: b */
    public static rd3 m63804b(md3 md3) {
        return new rd3(md3.mo56237i().mo52671d(), sd3.m71907c(md3.mo56237i(), md3.mo56238j(), md3.mo56235c()), md3.mo56239k(), md3.mo56236h());
    }

    /* renamed from: c */
    public static rd3 m63805c(pd3 pd3, byte[] bArr) {
        md3 e = pd3.mo65281e();
        e.update(bArr, 0, bArr.length);
        return m63804b(e);
    }
}

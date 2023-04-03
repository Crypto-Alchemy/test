package p000;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: rz0 */
public class rz0 implements C6843b4, ct2 {

    /* renamed from: a */
    public C9626y4 f44500a;

    public rz0(C9626y4 y4Var) {
        this.f44500a = y4Var;
    }

    /* renamed from: a */
    public static q01 m71719a(C9626y4 y4Var) throws IOException {
        try {
            return new q01(y4Var.mo67034h());
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e.getMessage(), e);
        }
    }

    /* renamed from: k */
    public C9326t4 mo50484k() throws IOException {
        return m71719a(this.f44500a);
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        try {
            return mo50484k();
        } catch (IOException e) {
            throw new ASN1ParsingException("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new ASN1ParsingException("unable to get DER object", e2);
        }
    }
}

package p000;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: w01 */
public class w01 implements C6843b4, ct2 {

    /* renamed from: a */
    public C9626y4 f45411a;

    public w01(C9626y4 y4Var) {
        this.f45411a = y4Var;
    }

    /* renamed from: k */
    public C9326t4 mo50484k() throws IOException {
        return r01.m71420b(this.f45411a.mo67034h());
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        try {
            return mo50484k();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }
}

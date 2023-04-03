package p000;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: pw */
public class C9196pw implements C6843b4, ct2 {

    /* renamed from: a */
    public C9626y4 f44126a;

    public C9196pw(C9626y4 y4Var) {
        this.f44126a = y4Var;
    }

    /* renamed from: a */
    public static C9147ow m71119a(C9626y4 y4Var) throws IOException {
        return new C9147ow(y4Var.mo67034h());
    }

    /* renamed from: k */
    public C9326t4 mo50484k() throws IOException {
        return m71119a(this.f44126a);
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

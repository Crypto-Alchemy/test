package p000;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: rw */
public class C9286rw implements C6843b4, ct2 {

    /* renamed from: a */
    public final int f44470a;

    /* renamed from: d */
    public final int f44471d;

    /* renamed from: e */
    public final C9626y4 f44472e;

    public C9286rw(int i, int i2, C9626y4 y4Var) {
        this.f44470a = i;
        this.f44471d = i2;
        this.f44472e = y4Var;
    }

    /* renamed from: k */
    public C9326t4 mo50484k() throws IOException {
        return this.f44472e.mo67029c(this.f44470a, this.f44471d);
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        try {
            return mo50484k();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage());
        }
    }
}

package p000;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: lw */
public class C7850lw implements C9233r4 {

    /* renamed from: a */
    public C9626y4 f40709a;

    public C7850lw(C9626y4 y4Var) {
        this.f40709a = y4Var;
    }

    /* renamed from: a */
    public static C7808kw m64019a(C9626y4 y4Var) throws IOException {
        return new C7808kw(ya6.m74322c(new rq0(y4Var)));
    }

    /* renamed from: e */
    public InputStream mo55987e() {
        return new rq0(this.f40709a);
    }

    /* renamed from: k */
    public C9326t4 mo50484k() throws IOException {
        return m64019a(this.f40709a);
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        try {
            return mo50484k();
        } catch (IOException e) {
            throw new ASN1ParsingException("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }
}

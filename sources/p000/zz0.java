package p000;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: zz0 */
public class zz0 implements C9233r4 {

    /* renamed from: a */
    public db1 f46509a;

    public zz0(db1 db1) {
        this.f46509a = db1;
    }

    /* renamed from: e */
    public InputStream mo55987e() {
        return this.f46509a;
    }

    /* renamed from: k */
    public C9326t4 mo50484k() throws IOException {
        return new yz0(this.f46509a.mo51167e());
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

package p000;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: if3 */
public class if3 implements Enumeration {

    /* renamed from: a */
    public C7243j4 f38379a;

    /* renamed from: b */
    public Object f38380b = mo52464a();

    public if3(byte[] bArr) {
        this.f38379a = new C7243j4(bArr, true);
    }

    /* renamed from: a */
    public final Object mo52464a() {
        try {
            return this.f38379a.mo52620i();
        } catch (IOException e) {
            throw new ASN1ParsingException("malformed ASN.1: " + e, e);
        }
    }

    public boolean hasMoreElements() {
        return this.f38380b != null;
    }

    public Object nextElement() {
        Object obj = this.f38380b;
        if (obj != null) {
            this.f38380b = mo52464a();
            return obj;
        }
        throw new NoSuchElementException();
    }
}

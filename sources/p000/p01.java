package p000;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: p01 */
public class p01 implements C9623y3 {

    /* renamed from: a */
    public final db1 f43966a;

    /* renamed from: d */
    public int f43967d = 0;

    public p01(db1 db1) {
        this.f43966a = db1;
    }

    /* renamed from: a */
    public final InputStream mo65202a(boolean z) throws IOException {
        int c = this.f43966a.mo51165c();
        if (c >= 1) {
            int read = this.f43966a.read();
            this.f43967d = read;
            if (read > 0) {
                if (c < 2) {
                    throw new IllegalStateException("zero length data with non-zero pad bits");
                } else if (read > 7) {
                    throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
                } else if (z) {
                    throw new IOException("expected octet-aligned bitstring, but found padBits: " + this.f43967d);
                }
            }
            return this.f43966a;
        }
        throw new IllegalStateException("content octets cannot be empty");
    }

    /* renamed from: j */
    public int mo52539j() {
        return this.f43967d;
    }

    /* renamed from: k */
    public C9326t4 mo50484k() throws IOException {
        return C9584x3.m73850H(this.f43966a.mo51167e());
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        try {
            return mo50484k();
        } catch (IOException e) {
            throw new ASN1ParsingException("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }

    /* renamed from: o */
    public InputStream mo52540o() throws IOException {
        return mo65202a(false);
    }
}

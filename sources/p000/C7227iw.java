package p000;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: iw */
public class C7227iw implements C9623y3 {

    /* renamed from: a */
    public C9626y4 f38523a;

    /* renamed from: d */
    public qq0 f38524d;

    public C7227iw(C9626y4 y4Var) {
        this.f38523a = y4Var;
    }

    /* renamed from: a */
    public static C7194hw m59122a(C9626y4 y4Var) throws IOException {
        qq0 qq0 = new qq0(y4Var, false);
        return new C7194hw(ya6.m74322c(qq0), qq0.mo65496b());
    }

    /* renamed from: j */
    public int mo52539j() {
        return this.f38524d.mo65496b();
    }

    /* renamed from: k */
    public C9326t4 mo50484k() throws IOException {
        return m59122a(this.f38523a);
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
        qq0 qq0 = new qq0(this.f38523a, false);
        this.f38524d = qq0;
        return qq0;
    }
}

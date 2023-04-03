package p000;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: jf3 */
public class jf3 extends C9480w4 {

    /* renamed from: e */
    public byte[] f38657e;

    public jf3(byte[] bArr) throws IOException {
        if (bArr != null) {
            this.f38657e = bArr;
            return;
        }
        throw new NullPointerException("'encoded' cannot be null");
    }

    /* renamed from: A */
    public int mo50761A(boolean z) throws IOException {
        byte[] V = mo52678V();
        return V != null ? C9302s4.m71859g(z, V.length) : super.mo50473F().mo50761A(z);
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        mo52677U();
        return super.mo50472E();
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        mo52677U();
        return super.mo50473F();
    }

    /* renamed from: M */
    public C6843b4 mo52675M(int i) {
        mo52677U();
        return super.mo52675M(i);
    }

    /* renamed from: N */
    public Enumeration mo52676N() {
        byte[] V = mo52678V();
        return V != null ? new if3(V) : super.mo52676N();
    }

    /* renamed from: O */
    public C9584x3 mo50762O() {
        return ((C9480w4) mo50473F()).mo50762O();
    }

    /* renamed from: Q */
    public C7013e4 mo50763Q() {
        return ((C9480w4) mo50473F()).mo50763Q();
    }

    /* renamed from: R */
    public C9203q4 mo50764R() {
        return ((C9480w4) mo50473F()).mo50764R();
    }

    /* renamed from: S */
    public C9586x4 mo50765S() {
        return ((C9480w4) mo50473F()).mo50765S();
    }

    /* renamed from: U */
    public final synchronized void mo52677U() {
        if (this.f38657e != null) {
            C7243j4 j4Var = new C7243j4(this.f38657e, true);
            try {
                C6923c4 l = j4Var.mo52622l();
                j4Var.close();
                this.f45435a = l.mo50810g();
                this.f38657e = null;
            } catch (IOException e) {
                throw new ASN1ParsingException("malformed ASN.1: " + e, e);
            }
        }
    }

    /* renamed from: V */
    public final synchronized byte[] mo52678V() {
        return this.f38657e;
    }

    public int hashCode() {
        mo52677U();
        return super.hashCode();
    }

    public Iterator<C6843b4> iterator() {
        mo52677U();
        return super.iterator();
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        byte[] V = mo52678V();
        if (V != null) {
            s4Var.mo65812o(z, 48, V);
        } else {
            super.mo50473F().mo50767s(s4Var, z);
        }
    }

    public int size() {
        mo52677U();
        return super.size();
    }
}

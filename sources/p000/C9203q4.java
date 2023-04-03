package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: q4 */
public abstract class C9203q4 extends C9326t4 implements C9233r4 {

    /* renamed from: d */
    public static final C7119g5 f44151d = new C9204a(C9203q4.class, 4);

    /* renamed from: e */
    public static final byte[] f44152e = new byte[0];

    /* renamed from: a */
    public byte[] f44153a;

    /* renamed from: q4$a */
    public static class C9204a extends C7119g5 {
        public C9204a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: c */
        public C9326t4 mo51361c(C9480w4 w4Var) {
            return w4Var.mo50764R();
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return yz0;
        }
    }

    public C9203q4(byte[] bArr) {
        if (bArr != null) {
            this.f44153a = bArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    /* renamed from: H */
    public static C9203q4 m71174H(byte[] bArr) {
        return new yz0(bArr);
    }

    /* renamed from: J */
    public static C9203q4 m71175J(C6848b5 b5Var, boolean z) {
        return (C9203q4) f44151d.mo51869e(b5Var, z);
    }

    /* renamed from: L */
    public static C9203q4 m71176L(Object obj) {
        if (obj == null || (obj instanceof C9203q4)) {
            return (C9203q4) obj;
        }
        if (obj instanceof C6843b4) {
            C9326t4 n = ((C6843b4) obj).mo50158n();
            if (n instanceof C9203q4) {
                return (C9203q4) n;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (C9203q4) f44151d.mo51868b((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        return new yz0(this.f44153a);
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        return new yz0(this.f44153a);
    }

    /* renamed from: M */
    public byte[] mo65418M() {
        return this.f44153a;
    }

    /* renamed from: e */
    public InputStream mo55987e() {
        return new ByteArrayInputStream(this.f44153a);
    }

    public int hashCode() {
        return C9367tq.m72437u(mo65418M());
    }

    /* renamed from: k */
    public C9326t4 mo50484k() {
        return mo50158n();
    }

    /* renamed from: r */
    public boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C9203q4)) {
            return false;
        }
        return C9367tq.m72417a(this.f44153a, ((C9203q4) t4Var).f44153a);
    }

    public String toString() {
        return "#" + ob6.m70223b(zl2.m75084b(this.f44153a));
    }
}

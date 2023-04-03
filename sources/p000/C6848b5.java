package p000;

import java.io.IOException;

/* renamed from: b5 */
public abstract class C6848b5 extends C9326t4 implements ct2 {

    /* renamed from: a */
    public final int f36682a;

    /* renamed from: d */
    public final int f36683d;

    /* renamed from: e */
    public final int f36684e;

    /* renamed from: g */
    public final C6843b4 f36685g;

    public C6848b5(int i, int i2, int i3, C6843b4 b4Var) {
        if (b4Var == null) {
            throw new NullPointerException("'obj' cannot be null");
        } else if (i2 == 0 || (i2 & 192) != i2) {
            throw new IllegalArgumentException("invalid tag class: " + i2);
        } else {
            this.f36682a = b4Var instanceof C6793a4 ? 1 : i;
            this.f36683d = i2;
            this.f36684e = i3;
            this.f36685g = b4Var;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6848b5(boolean z, int i, int i2, C6843b4 b4Var) {
        this(z ? 1 : 2, i, i2, b4Var);
    }

    public C6848b5(boolean z, int i, C6843b4 b4Var) {
        this(z, 128, i, b4Var);
    }

    /* renamed from: H */
    public static C6848b5 m55746H(C9326t4 t4Var) {
        if (t4Var instanceof C6848b5) {
            return (C6848b5) t4Var;
        }
        throw new IllegalStateException("unexpected object: " + t4Var.getClass().getName());
    }

    /* renamed from: J */
    public static C9326t4 m55747J(int i, int i2, C6923c4 c4Var) {
        x01 x01;
        boolean z = true;
        if (c4Var.mo50809f() != 1) {
            z = false;
        }
        if (z) {
            C6843b4 d = c4Var.mo50807d(0);
        } else {
            x01 = new x01(4, i, i2, r01.m71419a(c4Var));
        }
        return i != 64 ? x01 : new n01(x01);
    }

    /* renamed from: L */
    public static C9326t4 m55748L(int i, int i2, C6923c4 c4Var) {
        C9222qw qwVar;
        boolean z = true;
        if (c4Var.mo50809f() != 1) {
            z = false;
        }
        if (z) {
            C6843b4 d = c4Var.mo50807d(0);
        } else {
            qwVar = new C9222qw(4, i, i2, C7318jw.m59598a(c4Var));
        }
        return i != 64 ? qwVar : new C7107fw(qwVar);
    }

    /* renamed from: M */
    public static C9326t4 m55749M(int i, int i2, byte[] bArr) {
        x01 x01 = new x01(4, i, i2, new yz0(bArr));
        return i != 64 ? x01 : new n01(x01);
    }

    /* renamed from: R */
    public static C6848b5 m55750R(Object obj) {
        if (obj == null || (obj instanceof C6848b5)) {
            return (C6848b5) obj;
        }
        if (obj instanceof C6843b4) {
            C9326t4 n = ((C6843b4) obj).mo50158n();
            if (n instanceof C6848b5) {
                return (C6848b5) n;
            }
        } else if (obj instanceof byte[]) {
            try {
                return m55746H(C9326t4.m72150D((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        return new f01(this.f36682a, this.f36683d, this.f36684e, this.f36685g);
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        return new x01(this.f36682a, this.f36683d, this.f36684e, this.f36685g);
    }

    /* renamed from: N */
    public C9326t4 mo50474N(boolean z, int i) {
        C7119g5 a = C7161h5.m58472a(i);
        if (a != null) {
            return mo50475O(z, a);
        }
        throw new IllegalArgumentException("unsupported UNIVERSAL tag number: " + i);
    }

    /* renamed from: O */
    public C9326t4 mo50475O(boolean z, C7119g5 g5Var) {
        if (z) {
            if (mo50481W()) {
                return g5Var.mo51867a(this.f36685g.mo50158n());
            }
            throw new IllegalStateException("object explicit - implicit expected.");
        } else if (1 != this.f36682a) {
            C9326t4 n = this.f36685g.mo50158n();
            int i = this.f36682a;
            return i != 3 ? i != 4 ? g5Var.mo51867a(n) : n instanceof C9480w4 ? g5Var.mo51361c((C9480w4) n) : g5Var.mo51125d((yz0) n) : g5Var.mo51361c(mo50482X(n));
        } else {
            throw new IllegalStateException("object explicit - implicit expected.");
        }
    }

    /* renamed from: Q */
    public C7926n4 mo50476Q() {
        if (mo50481W()) {
            C6843b4 b4Var = this.f36685g;
            return b4Var instanceof C7926n4 ? (C7926n4) b4Var : b4Var.mo50158n();
        }
        throw new IllegalStateException("object implicit - explicit expected.");
    }

    /* renamed from: S */
    public C9326t4 mo50477S() {
        if (128 == mo50478T()) {
            return this.f36685g.mo50158n();
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    /* renamed from: T */
    public int mo50478T() {
        return this.f36683d;
    }

    /* renamed from: U */
    public int mo50479U() {
        return this.f36684e;
    }

    /* renamed from: V */
    public boolean mo50480V(int i) {
        return this.f36683d == 128 && this.f36684e == i;
    }

    /* renamed from: W */
    public boolean mo50481W() {
        int i = this.f36682a;
        return i == 1 || i == 3;
    }

    /* renamed from: X */
    public abstract C9480w4 mo50482X(C9326t4 t4Var);

    public int hashCode() {
        return (((this.f36683d * 7919) ^ this.f36684e) ^ (mo50481W() ? 15 : 240)) ^ this.f36685g.mo50158n().hashCode();
    }

    /* renamed from: k */
    public final C9326t4 mo50484k() {
        return this;
    }

    /* renamed from: r */
    public boolean mo50485r(C9326t4 t4Var) {
        if (t4Var instanceof C9435v3) {
            return t4Var.mo65963B(this);
        }
        if (!(t4Var instanceof C6848b5)) {
            return false;
        }
        C6848b5 b5Var = (C6848b5) t4Var;
        if (this.f36684e != b5Var.f36684e || this.f36683d != b5Var.f36683d) {
            return false;
        }
        if (this.f36682a != b5Var.f36682a && mo50481W() != b5Var.mo50481W()) {
            return false;
        }
        C9326t4 n = this.f36685g.mo50158n();
        C9326t4 n2 = b5Var.f36685g.mo50158n();
        if (n == n2) {
            return true;
        }
        if (mo50481W()) {
            return n.mo50485r(n2);
        }
        try {
            return C9367tq.m72417a(getEncoded(), b5Var.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    public String toString() {
        return C7207i5.m58862a(this.f36683d, this.f36684e) + this.f36685g;
    }
}

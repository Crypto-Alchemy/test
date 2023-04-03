package p000;

import java.io.IOException;

/* renamed from: g5 */
public abstract class C7119g5 extends C6924c5 {

    /* renamed from: b */
    public final C6794a5 f37974b;

    public C7119g5(Class cls, int i) {
        super(cls);
        this.f37974b = C6794a5.m55377a(0, i);
    }

    /* renamed from: a */
    public final C9326t4 mo51867a(C9326t4 t4Var) {
        if (this.f37068a.isInstance(t4Var)) {
            return t4Var;
        }
        throw new IllegalStateException("unexpected object: " + t4Var.getClass().getName());
    }

    /* renamed from: b */
    public final C9326t4 mo51868b(byte[] bArr) throws IOException {
        return mo51867a(C9326t4.m72150D(bArr));
    }

    /* renamed from: c */
    public C9326t4 mo51361c(C9480w4 w4Var) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    /* renamed from: d */
    public C9326t4 mo51125d(yz0 yz0) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    /* renamed from: e */
    public final C9326t4 mo51869e(C6848b5 b5Var, boolean z) {
        if (128 == b5Var.mo50478T()) {
            return mo51867a(b5Var.mo50475O(z, this));
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }
}

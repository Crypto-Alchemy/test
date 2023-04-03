package p000;

/* renamed from: eo7 */
public class eo7 extends C7926n4 {

    /* renamed from: a */
    public final C9203q4 f37580a;

    /* renamed from: d */
    public ul1 f37581d;

    /* renamed from: e */
    public nm1 f37582e;

    public eo7(nm1 nm1, boolean z) {
        this.f37582e = nm1.mo62725A();
        this.f37580a = new yz0(nm1.mo62743l(z));
    }

    public eo7(ul1 ul1, C9203q4 q4Var) {
        this(ul1, q4Var.mo65418M());
    }

    public eo7(ul1 ul1, byte[] bArr) {
        this.f37581d = ul1;
        this.f37580a = new yz0(C9367tq.m72422f(bArr));
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        return this.f37580a;
    }

    /* renamed from: r */
    public synchronized nm1 mo51515r() {
        if (this.f37582e == null) {
            this.f37582e = this.f37581d.mo66313j(this.f37580a.mo65418M()).mo62725A();
        }
        return this.f37582e;
    }
}

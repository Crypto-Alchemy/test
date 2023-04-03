package p000;

/* renamed from: ao7 */
public class ao7 extends C7926n4 implements C6793a4 {

    /* renamed from: a */
    public C9326t4 f36526a;

    public ao7(co7 co7) {
        this.f36526a = null;
        this.f36526a = co7.mo50158n();
    }

    public ao7(C7820l4 l4Var) {
        this.f36526a = l4Var;
    }

    public ao7(C9156p4 p4Var) {
        this.f36526a = p4Var;
    }

    public ao7(C9326t4 t4Var) {
        this.f36526a = t4Var;
    }

    /* renamed from: r */
    public static ao7 m55608r(Object obj) {
        if (obj == null || (obj instanceof ao7)) {
            return (ao7) obj;
        }
        if (obj instanceof C9326t4) {
            return new ao7((C9326t4) obj);
        }
        if (obj instanceof byte[]) {
            try {
                return new ao7(C9326t4.m72150D((byte[]) obj));
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse encoded data: " + e.getMessage());
            }
        } else {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        return this.f36526a;
    }

    /* renamed from: s */
    public C9326t4 mo50279s() {
        return this.f36526a;
    }

    /* renamed from: t */
    public boolean mo50280t() {
        return this.f36526a instanceof C7820l4;
    }

    /* renamed from: u */
    public boolean mo50281u() {
        return this.f36526a instanceof C9156p4;
    }
}

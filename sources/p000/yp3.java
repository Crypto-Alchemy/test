package p000;

/* renamed from: yp3 */
public class yp3 extends wp3 {

    /* renamed from: e */
    public int f46239e;

    /* renamed from: g */
    public int f46240g;

    /* renamed from: k */
    public oe2 f46241k;

    /* renamed from: r */
    public fs4 f46242r;

    /* renamed from: s */
    public mn4 f46243s;

    /* renamed from: x */
    public me2 f46244x;

    /* renamed from: y */
    public fs4[] f46245y;

    public yp3(int i, int i2, oe2 oe2, fs4 fs4, me2 me2, mn4 mn4, String str) {
        super(true, str);
        this.f46239e = i;
        this.f46240g = i2;
        this.f46241k = oe2;
        this.f46242r = fs4;
        this.f46244x = me2;
        this.f46243s = mn4;
        this.f46245y = new hs4(oe2, fs4).mo52310c();
    }

    public yp3(int i, int i2, oe2 oe2, fs4 fs4, mn4 mn4, String str) {
        this(i, i2, oe2, fs4, oi2.m70286a(oe2, fs4), mn4, str);
    }

    /* renamed from: b */
    public oe2 mo67140b() {
        return this.f46241k;
    }

    /* renamed from: c */
    public fs4 mo67141c() {
        return this.f46242r;
    }

    /* renamed from: d */
    public me2 mo67142d() {
        return this.f46244x;
    }

    /* renamed from: e */
    public int mo67143e() {
        return this.f46240g;
    }

    /* renamed from: f */
    public int mo67144f() {
        return this.f46239e;
    }

    /* renamed from: g */
    public mn4 mo67145g() {
        return this.f46243s;
    }

    /* renamed from: h */
    public fs4[] mo67146h() {
        return this.f46245y;
    }
}

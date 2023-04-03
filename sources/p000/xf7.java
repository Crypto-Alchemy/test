package p000;

/* renamed from: xf7 */
public final class xf7 {

    /* renamed from: a */
    public final yo7 f45885a;

    /* renamed from: b */
    public final int f45886b;

    /* renamed from: c */
    public final int f45887c;

    /* renamed from: d */
    public final int f45888d;

    /* renamed from: e */
    public final int f45889e;

    /* renamed from: f */
    public final int f45890f;

    /* renamed from: g */
    public final C9156p4 f45891g;

    public xf7(C9156p4 p4Var) {
        if (p4Var != null) {
            this.f45891g = p4Var;
            ig1 a = kg1.m59760a(p4Var);
            int h = dp7.m56998h(a);
            this.f45886b = h;
            this.f45887c = 16;
            int ceil = (int) Math.ceil(((double) (h * 8)) / ((double) dp7.m57005o(16)));
            this.f45889e = ceil;
            int floor = ((int) Math.floor((double) (dp7.m57005o((16 - 1) * ceil) / dp7.m57005o(16)))) + 1;
            this.f45890f = floor;
            int i = ceil + floor;
            this.f45888d = i;
            wf7 c = wf7.m73594c(a.mo50201d(), h, 16, i);
            this.f45885a = c;
            if (c == null) {
                throw new IllegalArgumentException("cannot find OID for digest algorithm: " + a.mo50201d());
            }
            return;
        }
        throw new NullPointerException("treeDigest == null");
    }

    /* renamed from: a */
    public int mo66862a() {
        return this.f45888d;
    }

    /* renamed from: b */
    public C9156p4 mo66863b() {
        return this.f45891g;
    }

    /* renamed from: c */
    public int mo66864c() {
        return this.f45886b;
    }

    /* renamed from: d */
    public int mo66865d() {
        return this.f45887c;
    }
}

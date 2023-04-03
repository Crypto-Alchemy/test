package p000;

/* renamed from: uf7 */
public class uf7 implements vt4 {

    /* renamed from: a */
    public volatile int f45044a = 4;

    /* renamed from: b */
    public int f45045b = -1;

    /* renamed from: c */
    public nm1[] f45046c = null;

    /* renamed from: d */
    public nm1[] f45047d = null;

    /* renamed from: e */
    public nm1 f45048e = null;

    /* renamed from: f */
    public int f45049f = -1;

    /* renamed from: a */
    public int mo66268a() {
        int i = this.f45044a;
        if (i <= 0) {
            return i;
        }
        int i2 = i - 1;
        this.f45044a = i2;
        return i2;
    }

    /* renamed from: b */
    public int mo66269b() {
        return this.f45045b;
    }

    /* renamed from: c */
    public nm1[] mo66270c() {
        return this.f45046c;
    }

    /* renamed from: d */
    public nm1[] mo66271d() {
        return this.f45047d;
    }

    /* renamed from: e */
    public int mo66272e() {
        return this.f45044a;
    }

    /* renamed from: f */
    public nm1 mo66273f() {
        return this.f45048e;
    }

    /* renamed from: g */
    public int mo66274g() {
        return this.f45049f;
    }

    /* renamed from: h */
    public boolean mo66275h() {
        return this.f45044a <= 0;
    }

    /* renamed from: i */
    public void mo66276i(int i) {
        this.f45045b = i;
    }

    /* renamed from: j */
    public void mo66277j(nm1[] nm1Arr) {
        this.f45046c = nm1Arr;
    }

    /* renamed from: k */
    public void mo66278k(nm1[] nm1Arr) {
        this.f45047d = nm1Arr;
    }

    /* renamed from: l */
    public void mo66279l(int i) {
        this.f45044a = i;
    }

    /* renamed from: m */
    public void mo66280m(nm1 nm1) {
        this.f45048e = nm1;
    }

    /* renamed from: n */
    public void mo66281n(int i) {
        this.f45049f = i;
    }
}

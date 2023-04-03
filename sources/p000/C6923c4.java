package p000;

/* renamed from: c4 */
public class C6923c4 {

    /* renamed from: d */
    public static final C6843b4[] f37064d = new C6843b4[0];

    /* renamed from: a */
    public C6843b4[] f37065a;

    /* renamed from: b */
    public int f37066b;

    /* renamed from: c */
    public boolean f37067c;

    public C6923c4() {
        this(10);
    }

    public C6923c4(int i) {
        if (i >= 0) {
            this.f37065a = i == 0 ? f37064d : new C6843b4[i];
            this.f37066b = 0;
            this.f37067c = false;
            return;
        }
        throw new IllegalArgumentException("'initialCapacity' must not be negative");
    }

    /* renamed from: b */
    public static C6843b4[] m56299b(C6843b4[] b4VarArr) {
        return b4VarArr.length < 1 ? f37064d : (C6843b4[]) b4VarArr.clone();
    }

    /* renamed from: a */
    public void mo50805a(C6843b4 b4Var) {
        if (b4Var != null) {
            int length = this.f37065a.length;
            boolean z = true;
            int i = this.f37066b + 1;
            if (i <= length) {
                z = false;
            }
            if (this.f37067c || z) {
                mo50808e(i);
            }
            this.f37065a[this.f37066b] = b4Var;
            this.f37066b = i;
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    /* renamed from: c */
    public C6843b4[] mo50806c() {
        int i = this.f37066b;
        if (i == 0) {
            return f37064d;
        }
        C6843b4[] b4VarArr = new C6843b4[i];
        System.arraycopy(this.f37065a, 0, b4VarArr, 0, i);
        return b4VarArr;
    }

    /* renamed from: d */
    public C6843b4 mo50807d(int i) {
        if (i < this.f37066b) {
            return this.f37065a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.f37066b);
    }

    /* renamed from: e */
    public final void mo50808e(int i) {
        C6843b4[] b4VarArr = new C6843b4[Math.max(this.f37065a.length, i + (i >> 1))];
        System.arraycopy(this.f37065a, 0, b4VarArr, 0, this.f37066b);
        this.f37065a = b4VarArr;
        this.f37067c = false;
    }

    /* renamed from: f */
    public int mo50809f() {
        return this.f37066b;
    }

    /* renamed from: g */
    public C6843b4[] mo50810g() {
        int i = this.f37066b;
        if (i == 0) {
            return f37064d;
        }
        C6843b4[] b4VarArr = this.f37065a;
        if (b4VarArr.length == i) {
            this.f37067c = true;
            return b4VarArr;
        }
        C6843b4[] b4VarArr2 = new C6843b4[i];
        System.arraycopy(b4VarArr, 0, b4VarArr2, 0, i);
        return b4VarArr2;
    }
}

package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.xmss.C9049d;

/* renamed from: zo7 */
public final class zo7 {

    /* renamed from: i */
    public static final Map<Integer, zo7> f46459i;

    /* renamed from: a */
    public final yo7 f46460a;

    /* renamed from: b */
    public final int f46461b;

    /* renamed from: c */
    public final int f46462c;

    /* renamed from: d */
    public final C9156p4 f46463d;

    /* renamed from: e */
    public final int f46464e;

    /* renamed from: f */
    public final String f46465f;

    /* renamed from: g */
    public final int f46466g;

    /* renamed from: h */
    public final xf7 f46467h;

    static {
        HashMap hashMap = new HashMap();
        Integer d = gx2.m58284d(1);
        C9156p4 p4Var = n24.f41061c;
        hashMap.put(d, new zo7(10, p4Var));
        hashMap.put(gx2.m58284d(2), new zo7(16, p4Var));
        hashMap.put(gx2.m58284d(3), new zo7(20, p4Var));
        Integer d2 = gx2.m58284d(4);
        C9156p4 p4Var2 = n24.f41065e;
        hashMap.put(d2, new zo7(10, p4Var2));
        hashMap.put(gx2.m58284d(5), new zo7(16, p4Var2));
        hashMap.put(gx2.m58284d(6), new zo7(20, p4Var2));
        Integer d3 = gx2.m58284d(7);
        C9156p4 p4Var3 = n24.f41081m;
        hashMap.put(d3, new zo7(10, p4Var3));
        hashMap.put(gx2.m58284d(8), new zo7(16, p4Var3));
        hashMap.put(gx2.m58284d(9), new zo7(20, p4Var3));
        Integer d4 = gx2.m58284d(10);
        C9156p4 p4Var4 = n24.f41083n;
        hashMap.put(d4, new zo7(10, p4Var4));
        hashMap.put(gx2.m58284d(11), new zo7(16, p4Var4));
        hashMap.put(gx2.m58284d(12), new zo7(20, p4Var4));
        f46459i = Collections.unmodifiableMap(hashMap);
    }

    public zo7(int i, ig1 ig1) {
        this(i, kg1.m59762c(ig1.mo50201d()));
    }

    public zo7(int i, C9156p4 p4Var) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        } else if (p4Var != null) {
            this.f46461b = i;
            this.f46462c = mo67365a();
            String b = kg1.m59761b(p4Var);
            this.f46465f = b;
            this.f46463d = p4Var;
            xf7 xf7 = new xf7(p4Var);
            this.f46467h = xf7;
            int c = xf7.mo66864c();
            this.f46466g = c;
            int d = xf7.mo66865d();
            this.f46464e = d;
            this.f46460a = xa1.m73895c(b, c, d, xf7.mo66862a(), i);
        } else {
            throw new NullPointerException("digest == null");
        }
    }

    /* renamed from: k */
    public static zo7 m75168k(int i) {
        return f46459i.get(gx2.m58284d(i));
    }

    /* renamed from: a */
    public final int mo67365a() {
        int i = 2;
        while (true) {
            int i2 = this.f46461b;
            if (i > i2) {
                throw new IllegalStateException("should never happen...");
            } else if ((i2 - i) % 2 == 0) {
                return i;
            } else {
                i++;
            }
        }
    }

    /* renamed from: b */
    public int mo67366b() {
        return this.f46461b;
    }

    /* renamed from: c */
    public int mo67367c() {
        return this.f46462c;
    }

    /* renamed from: d */
    public int mo67368d() {
        return this.f46467h.mo66862a();
    }

    /* renamed from: e */
    public yo7 mo67369e() {
        return this.f46460a;
    }

    /* renamed from: f */
    public String mo67370f() {
        return this.f46465f;
    }

    /* renamed from: g */
    public C9156p4 mo67371g() {
        return this.f46463d;
    }

    /* renamed from: h */
    public int mo67372h() {
        return this.f46466g;
    }

    /* renamed from: i */
    public C9049d mo67373i() {
        return new C9049d(this.f46467h);
    }

    /* renamed from: j */
    public int mo67374j() {
        return this.f46464e;
    }
}

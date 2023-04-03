package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: to7 */
public final class to7 {

    /* renamed from: e */
    public static final Map<Integer, to7> f44787e;

    /* renamed from: a */
    public final yo7 f44788a;

    /* renamed from: b */
    public final zo7 f44789b;

    /* renamed from: c */
    public final int f44790c;

    /* renamed from: d */
    public final int f44791d;

    static {
        HashMap hashMap = new HashMap();
        Integer d = gx2.m58284d(1);
        C9156p4 p4Var = n24.f41061c;
        hashMap.put(d, new to7(20, 2, p4Var));
        hashMap.put(gx2.m58284d(2), new to7(20, 4, p4Var));
        hashMap.put(gx2.m58284d(3), new to7(40, 2, p4Var));
        hashMap.put(gx2.m58284d(4), new to7(40, 4, p4Var));
        hashMap.put(gx2.m58284d(5), new to7(40, 8, p4Var));
        hashMap.put(gx2.m58284d(6), new to7(60, 3, p4Var));
        hashMap.put(gx2.m58284d(7), new to7(60, 6, p4Var));
        hashMap.put(gx2.m58284d(8), new to7(60, 12, p4Var));
        Integer d2 = gx2.m58284d(9);
        C9156p4 p4Var2 = n24.f41065e;
        hashMap.put(d2, new to7(20, 2, p4Var2));
        hashMap.put(gx2.m58284d(10), new to7(20, 4, p4Var2));
        hashMap.put(gx2.m58284d(11), new to7(40, 2, p4Var2));
        hashMap.put(gx2.m58284d(12), new to7(40, 4, p4Var2));
        hashMap.put(gx2.m58284d(13), new to7(40, 8, p4Var2));
        hashMap.put(gx2.m58284d(14), new to7(60, 3, p4Var2));
        hashMap.put(gx2.m58284d(15), new to7(60, 6, p4Var2));
        hashMap.put(gx2.m58284d(16), new to7(60, 12, p4Var2));
        Integer d3 = gx2.m58284d(17);
        C9156p4 p4Var3 = n24.f41081m;
        hashMap.put(d3, new to7(20, 2, p4Var3));
        hashMap.put(gx2.m58284d(18), new to7(20, 4, p4Var3));
        hashMap.put(gx2.m58284d(19), new to7(40, 2, p4Var3));
        hashMap.put(gx2.m58284d(20), new to7(40, 4, p4Var3));
        hashMap.put(gx2.m58284d(21), new to7(40, 8, p4Var3));
        hashMap.put(gx2.m58284d(22), new to7(60, 3, p4Var3));
        hashMap.put(gx2.m58284d(23), new to7(60, 6, p4Var3));
        hashMap.put(gx2.m58284d(24), new to7(60, 12, p4Var3));
        Integer d4 = gx2.m58284d(25);
        C9156p4 p4Var4 = n24.f41083n;
        hashMap.put(d4, new to7(20, 2, p4Var4));
        hashMap.put(gx2.m58284d(26), new to7(20, 4, p4Var4));
        hashMap.put(gx2.m58284d(27), new to7(40, 2, p4Var4));
        hashMap.put(gx2.m58284d(28), new to7(40, 4, p4Var4));
        hashMap.put(gx2.m58284d(29), new to7(40, 8, p4Var4));
        hashMap.put(gx2.m58284d(30), new to7(60, 3, p4Var4));
        hashMap.put(gx2.m58284d(31), new to7(60, 6, p4Var4));
        hashMap.put(gx2.m58284d(32), new to7(60, 12, p4Var4));
        f44787e = Collections.unmodifiableMap(hashMap);
    }

    public to7(int i, int i2, ig1 ig1) {
        this(i, i2, kg1.m59762c(ig1.mo50201d()));
    }

    public to7(int i, int i2, C9156p4 p4Var) {
        this.f44790c = i;
        this.f44791d = i2;
        this.f44789b = new zo7(m72384j(i, i2), p4Var);
        this.f44788a = wa1.m73525c(mo66106e(), mo66107f(), mo66108g(), mo66104c(), mo66102a(), i2);
    }

    /* renamed from: i */
    public static to7 m72383i(int i) {
        return f44787e.get(gx2.m58284d(i));
    }

    /* renamed from: j */
    public static int m72384j(int i, int i2) throws IllegalArgumentException {
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        } else if (i % i2 == 0) {
            int i3 = i / i2;
            if (i3 != 1) {
                return i3;
            }
            throw new IllegalArgumentException("height / layers must be greater than 1");
        } else {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
    }

    /* renamed from: a */
    public int mo66102a() {
        return this.f44790c;
    }

    /* renamed from: b */
    public int mo66103b() {
        return this.f44791d;
    }

    /* renamed from: c */
    public int mo66104c() {
        return this.f44789b.mo67368d();
    }

    /* renamed from: d */
    public yo7 mo66105d() {
        return this.f44788a;
    }

    /* renamed from: e */
    public String mo66106e() {
        return this.f44789b.mo67370f();
    }

    /* renamed from: f */
    public int mo66107f() {
        return this.f44789b.mo67372h();
    }

    /* renamed from: g */
    public int mo66108g() {
        return this.f44789b.mo67374j();
    }

    /* renamed from: h */
    public zo7 mo66109h() {
        return this.f44789b;
    }
}

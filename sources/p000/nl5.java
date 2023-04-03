package p000;

import java.math.BigInteger;

/* renamed from: nl5 */
public class nl5 {

    /* renamed from: a */
    public final BigInteger f43502a;

    /* renamed from: b */
    public final BigInteger f43503b;

    /* renamed from: c */
    public final BigInteger f43504c;

    /* renamed from: d */
    public final BigInteger f43505d;

    /* renamed from: e */
    public final BigInteger f43506e;

    /* renamed from: f */
    public final BigInteger f43507f;

    /* renamed from: g */
    public final int f43508g;

    public nl5(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger, BigInteger bigInteger2, int i) {
        m69804a(bigIntegerArr, "v1");
        m69804a(bigIntegerArr2, "v2");
        this.f43502a = bigIntegerArr[0];
        this.f43503b = bigIntegerArr[1];
        this.f43504c = bigIntegerArr2[0];
        this.f43505d = bigIntegerArr2[1];
        this.f43506e = bigInteger;
        this.f43507f = bigInteger2;
        this.f43508g = i;
    }

    /* renamed from: a */
    public static void m69804a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException("'" + str + "' must consist of exactly 2 (non-null) values");
        }
    }

    /* renamed from: b */
    public int mo62718b() {
        return this.f43508g;
    }

    /* renamed from: c */
    public BigInteger mo62719c() {
        return this.f43506e;
    }

    /* renamed from: d */
    public BigInteger mo62720d() {
        return this.f43507f;
    }

    /* renamed from: e */
    public BigInteger mo62721e() {
        return this.f43502a;
    }

    /* renamed from: f */
    public BigInteger mo62722f() {
        return this.f43503b;
    }

    /* renamed from: g */
    public BigInteger mo62723g() {
        return this.f43504c;
    }

    /* renamed from: h */
    public BigInteger mo62724h() {
        return this.f43505d;
    }
}

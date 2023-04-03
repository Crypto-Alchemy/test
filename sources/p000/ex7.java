package p000;

import java.io.PrintStream;

/* renamed from: ex7 */
/* compiled from: uiscm */
public class ex7 {

    /* renamed from: A */
    public static final String f11395A = new String("1.1");

    /* renamed from: B */
    public static final String f11396B = new String("1.2");

    /* renamed from: C */
    public static final String f11397C = new String("1.3");

    /* renamed from: D */
    public static final String f11398D = new String("1.91");

    /* renamed from: E */
    public static final String f11399E = new String("1.92");

    /* renamed from: F */
    public static final String f11400F = new String("1.98");

    /* renamed from: G */
    public static final String f11401G = new String("1.99");

    /* renamed from: H */
    public static final String f11402H = new String("2.1");

    /* renamed from: I */
    public static final String f11403I = new String("2.2");

    /* renamed from: J */
    public static final String f11404J = new String("2.91");

    /* renamed from: K */
    public static final String f11405K = new String("2.92");

    /* renamed from: L */
    public static final String f11406L = new String("2.93");

    /* renamed from: M */
    public static final String f11407M = new String("3.1");

    /* renamed from: N */
    public static final String f11408N = new String("3.2");

    /* renamed from: O */
    public static final String f11409O = new String("3.3");

    /* renamed from: P */
    public static final String f11410P = new String("3.91");

    /* renamed from: Q */
    public static final String f11411Q = new String("3.92");

    /* renamed from: R */
    public static final String f11412R = new String("4.1");

    /* renamed from: S */
    public static final String f11413S = new String("4.2");

    /* renamed from: T */
    public static final String f11414T = new String("4.3");

    /* renamed from: U */
    public static final String f11415U = new String("4.4");

    /* renamed from: V */
    public static final String f11416V = new String("4.5");

    /* renamed from: W */
    public static final String f11417W = new String("4.91");

    /* renamed from: X */
    public static final String f11418X = new String("4.92");

    /* renamed from: Y */
    public static final byte[] f11419Y = {7, 35, 51, 67, 71, 73, -110};

    /* renamed from: z */
    public static final String f11420z = new String("1.0");

    /* renamed from: a */
    public cx7 f11421a = new cx7(false);

    /* renamed from: b */
    public int f11422b = 0;

    /* renamed from: c */
    public String f11423c = "Loading applet...";

    /* renamed from: d */
    public String f11424d = "System OK";

    /* renamed from: e */
    public byte[] f11425e = null;

    /* renamed from: f */
    public String f11426f;

    /* renamed from: g */
    public byte[] f11427g = null;

    /* renamed from: h */
    public byte[] f11428h = null;

    /* renamed from: i */
    public byte[] f11429i = null;

    /* renamed from: j */
    public byte[] f11430j = null;

    /* renamed from: k */
    public byte[] f11431k = null;

    /* renamed from: l */
    public byte[] f11432l = null;

    /* renamed from: m */
    public byte[] f11433m = null;

    /* renamed from: n */
    public byte[] f11434n = null;

    /* renamed from: o */
    public byte[] f11435o = null;

    /* renamed from: p */
    public byte[] f11436p = null;

    /* renamed from: q */
    public boolean f11437q = false;

    /* renamed from: r */
    public boolean f11438r = false;

    /* renamed from: s */
    public String f11439s;

    /* renamed from: t */
    public int f11440t;

    /* renamed from: u */
    public int f11441u;

    /* renamed from: v */
    public long f11442v = 0;

    /* renamed from: w */
    public long f11443w = 0;

    /* renamed from: x */
    public String f11444x = f11395A;

    /* renamed from: y */
    public boolean f11445y = false;

    public ex7() {
        mo19533r();
        this.f11440t = 2;
        this.f11443w = 0;
        this.f11442v = 0;
    }

    /* renamed from: a */
    public boolean mo19516a() {
        boolean z;
        if (this.f11443w == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f11423c = "Module Disabled";
        }
        return z;
    }

    /* renamed from: b */
    public String mo19517b(String str) {
        if (!mo19516a()) {
            this.f11442v = this.f11443w;
            return new String();
        }
        try {
            this.f11421a.mo18377i(true);
            String b = this.f11421a.mo18370b(str);
            if (b.length() == 0) {
                this.f11442v = this.f11421a.mo18374f();
                this.f11423c = "Text decryption failed - " + this.f11442v;
                return new String();
            }
            this.f11442v = 0;
            return b;
        } catch (Exception e) {
            this.f11442v = x70.f19363Q;
            this.f11423c = "System error: " + e.getMessage();
            return new String();
        }
    }

    /* renamed from: c */
    public String mo19518c(String str) {
        if (!mo19516a()) {
            this.f11442v = this.f11443w;
            return new String();
        }
        try {
            this.f11421a.mo18377i(true);
            String d = this.f11421a.mo18372d(str);
            if (d.length() == 0) {
                this.f11442v = this.f11421a.mo18374f();
                this.f11423c = "Text encryption failed - " + this.f11442v;
                return new String();
            }
            this.f11442v = 0;
            return d;
        } catch (Exception e) {
            this.f11442v = x70.f19363Q;
            this.f11423c = "System error: " + e.getMessage();
            return new String();
        }
    }

    /* renamed from: d */
    public final int mo19519d() {
        this.f11442v = 0;
        int i = this.f11440t;
        if ((i & 248) > 0) {
            return x70.f19405h0;
        }
        if ((i & 4) > 0) {
            return x70.f19402g0;
        }
        if ((i & 2) > 0) {
            return x70.f19399f0;
        }
        this.f11442v = x70.f19425o;
        return x70.f19396e0;
    }

    /* renamed from: e */
    public String mo19520e() {
        byte[] bArr = this.f11429i;
        if (bArr != null) {
            return C3311sx.m27176f(bArr);
        }
        return null;
    }

    /* renamed from: f */
    public long mo19521f() {
        return this.f11443w;
    }

    /* renamed from: g */
    public String mo19522g() {
        if (mo19516a() || mo19521f() == x70.f19367S) {
            try {
                if (mo19527l()) {
                    return C3311sx.m27176f(this.f11427g);
                }
                System.out.println("GetU5 696 MakeU5 failed");
                return new String();
            } catch (Exception e) {
                this.f11442v = x70.f19363Q;
                this.f11423c = "System error: " + e.getMessage();
                return new String();
            }
        } else {
            this.f11442v = this.f11443w;
            return new String();
        }
    }

    /* renamed from: h */
    public final boolean mo19523h() {
        boolean z;
        int i;
        if (this.f11431k != null) {
            int i2 = 0;
            while (true) {
                byte[] bArr = this.f11431k;
                if (i2 >= bArr.length) {
                    break;
                }
                bArr[i2] = 0;
                i2++;
            }
        }
        this.f11431k = null;
        if ((this.f11440t & 16) > 0) {
            byte[] bArr2 = this.f11436p;
            if (bArr2 == null || bArr2.length == 0) {
                this.f11442v = x70.f19347I;
                return false;
            }
            i = bArr2.length;
            z = true;
        } else {
            i = 0;
            z = false;
        }
        if (!z) {
            this.f11442v = x70.f19341F;
            return false;
        }
        byte[] bArr3 = new byte[i];
        this.f11431k = bArr3;
        if (i > 0) {
            System.arraycopy(this.f11436p, 0, bArr3, 0, 20);
        }
        this.f11442v = 0;
        return true;
    }

    /* renamed from: i */
    public final boolean mo19524i() {
        byte[] bArr;
        if (this.f11432l != null) {
            int i = 0;
            while (true) {
                byte[] bArr2 = this.f11432l;
                if (i >= bArr2.length) {
                    break;
                }
                bArr2[i] = 0;
                i++;
            }
        }
        this.f11432l = null;
        if (!mo19523h() || (bArr = this.f11430j) == null) {
            this.f11442v = x70.f19341F;
            return false;
        }
        byte[] bArr3 = new byte[(this.f11431k.length + 20)];
        System.arraycopy(bArr, 0, bArr3, 0, 20);
        byte[] bArr4 = this.f11431k;
        System.arraycopy(bArr4, 0, bArr3, 20, bArr4.length);
        new dx7();
        this.f11432l = new byte[20];
        if (!dx7.m15519h(bArr3) || !dx7.m15518g(this.f11432l)) {
            long f = dx7.m15517f();
            int i2 = 0;
            while (true) {
                byte[] bArr5 = this.f11432l;
                if (i2 >= bArr5.length) {
                    this.f11432l = null;
                    this.f11442v = f;
                    return false;
                }
                bArr5[i2] = 0;
                i2++;
            }
        } else {
            this.f11442v = 0;
            return true;
        }
    }

    /* renamed from: j */
    public final boolean mo19525j() {
        byte[] bArr = this.f11425e;
        if (bArr == null) {
            System.out.println("MakeCValue 739 username is null");
            this.f11442v = x70.f19330A;
            return false;
        }
        byte[] bArr2 = new byte[20];
        if (!dx7.m15519h(bArr) || !dx7.m15518g(bArr2)) {
            long f = dx7.m15517f();
            for (int i = 0; i < 20; i++) {
                bArr2[i] = 0;
            }
            this.f11427g = null;
            this.f11442v = f;
            return false;
        }
        byte[] bArr3 = new byte[12];
        this.f11428h = bArr3;
        System.arraycopy(bArr2, 0, bArr3, 0, 12);
        byte[] bArr4 = new byte[32];
        int d = mo19519d();
        this.f11441u = d;
        if (d == x70.f19399f0) {
            if (!mo19526k()) {
                System.out.println("uiscm 803 MakeK5 failed");
                return false;
            }
            System.arraycopy(this.f11429i, 0, bArr4, 0, 20);
        } else if (d == x70.f19402g0) {
            byte[] bArr5 = this.f11430j;
            if (bArr5 == null) {
                this.f11442v = x70.f19339E;
                return false;
            }
            System.arraycopy(bArr5, 0, bArr4, 0, 20);
        } else if (d != x70.f19405h0) {
            this.f11442v = x70.f19359O;
            return false;
        } else if (!mo19524i()) {
            return false;
        } else {
            System.arraycopy(this.f11432l, 0, bArr4, 0, 20);
        }
        System.arraycopy(this.f11428h, 0, bArr4, 20, 12);
        cx7 cx7 = new cx7(true);
        if (!cx7.mo18375g(bArr4)) {
            this.f11442v = x70.f19458z;
            return false;
        }
        this.f11439s = cx7.mo18373e(f11419Y);
        this.f11442v = 0;
        return true;
    }

    /* renamed from: k */
    public final boolean mo19526k() {
        if (!this.f11438r) {
            if (this.f11429i != null) {
                int i = 0;
                while (true) {
                    byte[] bArr = this.f11429i;
                    if (i >= bArr.length) {
                        break;
                    }
                    bArr[i] = 0;
                    i++;
                }
            }
            this.f11429i = null;
            if (this.f11422b == 1) {
                System.out.println("uiscm 449 pass=" + this.f11426f);
            }
            if (this.f11426f.length() < 1) {
                this.f11442v = x70.f19333B;
                return false;
            }
            byte[] bArr2 = new byte[40];
            new fx7();
            if (this.f11422b == 1) {
                System.out.println("uiscm 460 pass=" + this.f11426f);
            }
            byte[] c = fx7.m17479c(this.f11425e);
            byte[] c2 = fx7.m17479c(C2540id3.m19559a(this.f11426f));
            System.arraycopy(c, 0, bArr2, 0, 20);
            System.arraycopy(c2, 0, bArr2, 20, 20);
            String d = C2540id3.m19562d(bArr2);
            if (this.f11422b == 1) {
                System.out.println("uiscm 471 seed=" + d);
            }
            this.f11429i = new byte[20];
            if (!dx7.m15519h(bArr2) || !dx7.m15518g(this.f11429i)) {
                long f = dx7.m15517f();
                System.out.println("MakeK5 465 failed nResult=" + f);
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = this.f11429i;
                    if (i2 >= bArr3.length) {
                        this.f11429i = null;
                        this.f11442v = f;
                        return false;
                    }
                    bArr3[i2] = 0;
                    i2++;
                }
            }
        }
        this.f11438r = true;
        this.f11442v = 0;
        return true;
    }

    /* renamed from: l */
    public final boolean mo19527l() {
        if (!this.f11437q) {
            if (this.f11425e == null || !mo19526k()) {
                return false;
            }
            cx7 cx7 = new cx7(false);
            if (!cx7.mo18375g(this.f11429i)) {
                return false;
            }
            byte[] c = cx7.mo18371c(this.f11425e);
            if (c.length == 0) {
                return false;
            }
            this.f11427g = new byte[20];
            new dx7();
            if (!dx7.m15519h(c) || !dx7.m15518g(this.f11427g)) {
                dx7.m15517f();
                System.out.println("MakeU5 508 failure");
                int i = 0;
                while (true) {
                    byte[] bArr = this.f11427g;
                    if (i >= bArr.length) {
                        this.f11427g = null;
                        return false;
                    }
                    bArr[i] = 0;
                    i++;
                }
            }
        }
        this.f11437q = true;
        return true;
    }

    /* renamed from: m */
    public void mo19528m(boolean z) {
        this.f11445y = z;
    }

    /* renamed from: n */
    public void mo19529n() {
        this.f11423c = this.f11424d;
    }

    /* renamed from: o */
    public boolean mo19530o() {
        try {
            if (!mo19525j()) {
                this.f11444x = f11411Q;
                this.f11423c = "Verification failed - " + this.f11442v;
                System.out.println("SetInitialAuthentication 399 makeCValue failed");
                return false;
            }
            this.f11444x = f11397C;
            mo19529n();
            this.f11442v = 0;
            return true;
        } catch (Exception e) {
            this.f11442v = x70.f19363Q;
            this.f11423c = "uiscm 406 System error: " + e.getMessage();
            return false;
        }
    }

    /* renamed from: p */
    public void mo19531p(String str) {
        this.f11444x = f11407M;
        this.f11426f = str;
        this.f11442v = 0;
    }

    /* renamed from: q */
    public void mo19532q(String str) {
        if (this.f11422b == 1) {
            this.f11443w = 0;
        }
        this.f11444x = f11407M;
        byte[] a = C2540id3.m19559a(str);
        this.f11425e = a;
        String d = C2540id3.m19562d(a);
        if (this.f11422b == 1) {
            PrintStream printStream = System.out;
            printStream.println("uiscm 354 username=" + d);
        }
        this.f11442v = 0;
    }

    /* renamed from: r */
    public void mo19533r() {
        mo19534s();
        this.f11425e = null;
        this.f11426f = "";
        this.f11439s = "";
        this.f11440t = 2;
        this.f11441u = x70.f19396e0;
        if (this.f11427g != null) {
            int i = 0;
            while (true) {
                byte[] bArr = this.f11427g;
                if (i >= bArr.length) {
                    break;
                }
                bArr[i] = 0;
                i++;
            }
        }
        if (this.f11428h != null) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = this.f11428h;
                if (i2 >= bArr2.length) {
                    break;
                }
                bArr2[i2] = 0;
                i2++;
            }
        }
        if (this.f11429i != null) {
            int i3 = 0;
            while (true) {
                byte[] bArr3 = this.f11429i;
                if (i3 >= bArr3.length) {
                    break;
                }
                bArr3[i3] = 0;
                i3++;
            }
        }
        if (this.f11430j != null) {
            int i4 = 0;
            while (true) {
                byte[] bArr4 = this.f11430j;
                if (i4 >= bArr4.length) {
                    break;
                }
                bArr4[i4] = 0;
                i4++;
            }
        }
        if (this.f11431k != null) {
            int i5 = 0;
            while (true) {
                byte[] bArr5 = this.f11431k;
                if (i5 >= bArr5.length) {
                    break;
                }
                bArr5[i5] = 0;
                i5++;
            }
        }
        if (this.f11432l != null) {
            int i6 = 0;
            while (true) {
                byte[] bArr6 = this.f11432l;
                if (i6 >= bArr6.length) {
                    break;
                }
                bArr6[i6] = 0;
                i6++;
            }
        }
        if (this.f11435o != null) {
            int i7 = 0;
            while (true) {
                byte[] bArr7 = this.f11435o;
                if (i7 >= bArr7.length) {
                    break;
                }
                bArr7[i7] = 0;
                i7++;
            }
        }
        if (this.f11436p != null) {
            int i8 = 0;
            while (true) {
                byte[] bArr8 = this.f11436p;
                if (i8 >= bArr8.length) {
                    break;
                }
                bArr8[i8] = 0;
                i8++;
            }
        }
        if (this.f11433m != null) {
            int i9 = 0;
            while (true) {
                byte[] bArr9 = this.f11433m;
                if (i9 >= bArr9.length) {
                    break;
                }
                bArr9[i9] = 0;
                i9++;
            }
        }
        this.f11427g = null;
        this.f11428h = null;
        this.f11429i = null;
        this.f11430j = null;
        this.f11431k = null;
        this.f11432l = null;
        this.f11435o = null;
        this.f11436p = null;
        this.f11433m = null;
        this.f11434n = null;
        this.f11442v = 0;
    }

    /* renamed from: s */
    public void mo19534s() {
        this.f11421a.mo18378j();
    }

    /* renamed from: t */
    public boolean mo19535t(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        if (!this.f11421a.mo18375g(bArr)) {
            this.f11442v = this.f11421a.mo18374f();
            return false;
        }
        this.f11442v = 0;
        return true;
    }
}

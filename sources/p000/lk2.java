package p000;

import java.util.Hashtable;

/* renamed from: lk2 */
public class lk2 implements km3 {

    /* renamed from: h */
    public static Hashtable f40632h;

    /* renamed from: a */
    public ig1 f40633a;

    /* renamed from: b */
    public int f40634b;

    /* renamed from: c */
    public int f40635c;

    /* renamed from: d */
    public us3 f40636d;

    /* renamed from: e */
    public us3 f40637e;

    /* renamed from: f */
    public byte[] f40638f;

    /* renamed from: g */
    public byte[] f40639g;

    static {
        Hashtable hashtable = new Hashtable();
        f40632h = hashtable;
        hashtable.put("GOST3411", gx2.m58284d(32));
        f40632h.put("MD2", gx2.m58284d(16));
        f40632h.put("MD4", gx2.m58284d(64));
        f40632h.put("MD5", gx2.m58284d(64));
        f40632h.put("RIPEMD128", gx2.m58284d(64));
        f40632h.put("RIPEMD160", gx2.m58284d(64));
        f40632h.put("SHA-1", gx2.m58284d(64));
        f40632h.put("SHA-224", gx2.m58284d(64));
        f40632h.put("SHA-256", gx2.m58284d(64));
        f40632h.put("SHA-384", gx2.m58284d(128));
        f40632h.put("SHA-512", gx2.m58284d(128));
        f40632h.put("Tiger", gx2.m58284d(64));
        f40632h.put("Whirlpool", gx2.m58284d(64));
    }

    public lk2(ig1 ig1) {
        this(ig1, m63849d(ig1));
    }

    public lk2(ig1 ig1, int i) {
        this.f40633a = ig1;
        int e = ig1.mo50202e();
        this.f40634b = e;
        this.f40635c = i;
        this.f40638f = new byte[i];
        this.f40639g = new byte[(i + e)];
    }

    /* renamed from: d */
    public static int m63849d(ig1 ig1) {
        if (ig1 instanceof tx1) {
            return ((tx1) ig1).mo51714g();
        }
        Integer num = (Integer) f40632h.get(ig1.mo50201d());
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("unknown digest passed: " + ig1.mo50201d());
    }

    /* renamed from: f */
    public static void m63850f(byte[] bArr, int i, byte b) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ b);
        }
    }

    /* renamed from: a */
    public int mo50312a(byte[] bArr, int i) {
        this.f40633a.mo50198a(this.f40639g, this.f40635c);
        us3 us3 = this.f40637e;
        if (us3 != null) {
            ((us3) this.f40633a).mo50199c(us3);
            ig1 ig1 = this.f40633a;
            ig1.update(this.f40639g, this.f40635c, ig1.mo50202e());
        } else {
            ig1 ig12 = this.f40633a;
            byte[] bArr2 = this.f40639g;
            ig12.update(bArr2, 0, bArr2.length);
        }
        int a = this.f40633a.mo50198a(bArr, i);
        int i2 = this.f40635c;
        while (true) {
            byte[] bArr3 = this.f40639g;
            if (i2 >= bArr3.length) {
                break;
            }
            bArr3[i2] = 0;
            i2++;
        }
        us3 us32 = this.f40636d;
        if (us32 != null) {
            ((us3) this.f40633a).mo50199c(us32);
        } else {
            ig1 ig13 = this.f40633a;
            byte[] bArr4 = this.f40638f;
            ig13.update(bArr4, 0, bArr4.length);
        }
        return a;
    }

    /* renamed from: b */
    public int mo50313b() {
        return this.f40634b;
    }

    /* renamed from: c */
    public void mo50314c(we0 we0) {
        byte[] bArr;
        this.f40633a.reset();
        byte[] a = ((va3) we0).mo66464a();
        int length = a.length;
        if (length > this.f40635c) {
            this.f40633a.update(a, 0, length);
            this.f40633a.mo50198a(this.f40638f, 0);
            length = this.f40634b;
        } else {
            System.arraycopy(a, 0, this.f40638f, 0, length);
        }
        while (true) {
            bArr = this.f40638f;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.f40639g, 0, this.f40635c);
        m63850f(this.f40638f, this.f40635c, (byte) 54);
        m63850f(this.f40639g, this.f40635c, (byte) 92);
        ig1 ig1 = this.f40633a;
        if (ig1 instanceof us3) {
            us3 copy = ((us3) ig1).copy();
            this.f40637e = copy;
            ((ig1) copy).update(this.f40639g, 0, this.f40635c);
        }
        ig1 ig12 = this.f40633a;
        byte[] bArr2 = this.f40638f;
        ig12.update(bArr2, 0, bArr2.length);
        ig1 ig13 = this.f40633a;
        if (ig13 instanceof us3) {
            this.f40636d = ((us3) ig13).copy();
        }
    }

    /* renamed from: e */
    public void mo55914e(byte b) {
        this.f40633a.mo51713b(b);
    }

    public void update(byte[] bArr, int i, int i2) {
        this.f40633a.update(bArr, i, i2);
    }
}

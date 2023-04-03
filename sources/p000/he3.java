package p000;

/* renamed from: he3 */
public class he3 {

    /* renamed from: a */
    public int f38194a;

    /* renamed from: b */
    public int f38195b;

    /* renamed from: c */
    public int f38196c;

    /* renamed from: d */
    public short[][][] f38197d;

    /* renamed from: e */
    public short[][][] f38198e;

    /* renamed from: f */
    public short[][] f38199f;

    /* renamed from: g */
    public short[] f38200g;

    public he3(byte b, byte b2, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        byte b3 = b & 255;
        this.f38194a = b3;
        byte b4 = b2 & 255;
        this.f38195b = b4;
        this.f38196c = b4 - b3;
        this.f38197d = sArr;
        this.f38198e = sArr2;
        this.f38199f = sArr3;
        this.f38200g = sArr4;
    }

    /* renamed from: a */
    public short[][][] mo52186a() {
        return this.f38197d;
    }

    /* renamed from: b */
    public short[][][] mo52187b() {
        return this.f38198e;
    }

    /* renamed from: c */
    public short[] mo52188c() {
        return this.f38200g;
    }

    /* renamed from: d */
    public short[][] mo52189d() {
        return this.f38199f;
    }

    /* renamed from: e */
    public int mo52190e() {
        return this.f38196c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof he3)) {
            return false;
        }
        he3 he3 = (he3) obj;
        return this.f38194a == he3.mo52192f() && this.f38195b == he3.mo52193g() && this.f38196c == he3.mo52190e() && x65.m73885k(this.f38197d, he3.mo52186a()) && x65.m73885k(this.f38198e, he3.mo52187b()) && x65.m73884j(this.f38199f, he3.mo52189d()) && x65.m73883i(this.f38200g, he3.mo52188c());
    }

    /* renamed from: f */
    public int mo52192f() {
        return this.f38194a;
    }

    /* renamed from: g */
    public int mo52193g() {
        return this.f38195b;
    }

    public int hashCode() {
        return (((((((((((this.f38194a * 37) + this.f38195b) * 37) + this.f38196c) * 37) + C9367tq.m72414C(this.f38197d)) * 37) + C9367tq.m72414C(this.f38198e)) * 37) + C9367tq.m72413B(this.f38199f)) * 37) + C9367tq.m72412A(this.f38200g);
    }
}

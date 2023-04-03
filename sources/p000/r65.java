package p000;

/* renamed from: r65 */
public class r65 extends C7926n4 {

    /* renamed from: a */
    public C7333k4 f44285a;

    /* renamed from: d */
    public C9156p4 f44286d;

    /* renamed from: e */
    public byte[][] f44287e;

    /* renamed from: g */
    public byte[] f44288g;

    /* renamed from: k */
    public byte[][] f44289k;

    /* renamed from: r */
    public byte[] f44290r;

    /* renamed from: s */
    public byte[] f44291s;

    /* renamed from: x */
    public he3[] f44292x;

    public r65(C9480w4 w4Var) {
        C9480w4 w4Var2 = w4Var;
        int i = 0;
        if (w4Var2.mo52675M(0) instanceof C7333k4) {
            this.f44285a = C7333k4.m59688L(w4Var2.mo52675M(0));
        } else {
            this.f44286d = C9156p4.m70910O(w4Var2.mo52675M(0));
        }
        C9480w4 w4Var3 = (C9480w4) w4Var2.mo52675M(1);
        this.f44287e = new byte[w4Var3.size()][];
        for (int i2 = 0; i2 < w4Var3.size(); i2++) {
            this.f44287e[i2] = ((C9203q4) w4Var3.mo52675M(i2)).mo65418M();
        }
        this.f44288g = ((C9203q4) ((C9480w4) w4Var2.mo52675M(2)).mo52675M(0)).mo65418M();
        C9480w4 w4Var4 = (C9480w4) w4Var2.mo52675M(3);
        this.f44289k = new byte[w4Var4.size()][];
        for (int i3 = 0; i3 < w4Var4.size(); i3++) {
            this.f44289k[i3] = ((C9203q4) w4Var4.mo52675M(i3)).mo65418M();
        }
        this.f44290r = ((C9203q4) ((C9480w4) w4Var2.mo52675M(4)).mo52675M(0)).mo65418M();
        this.f44291s = ((C9203q4) ((C9480w4) w4Var2.mo52675M(5)).mo52675M(0)).mo65418M();
        C9480w4 w4Var5 = (C9480w4) w4Var2.mo52675M(6);
        byte[][][][] bArr = new byte[w4Var5.size()][][][];
        byte[][][][] bArr2 = new byte[w4Var5.size()][][][];
        byte[][][] bArr3 = new byte[w4Var5.size()][][];
        byte[][] bArr4 = new byte[w4Var5.size()][];
        int i4 = 0;
        while (i4 < w4Var5.size()) {
            C9480w4 w4Var6 = (C9480w4) w4Var5.mo52675M(i4);
            C9480w4 w4Var7 = (C9480w4) w4Var6.mo52675M(i);
            bArr[i4] = new byte[w4Var7.size()][][];
            for (int i5 = i; i5 < w4Var7.size(); i5++) {
                C9480w4 w4Var8 = (C9480w4) w4Var7.mo52675M(i5);
                bArr[i4][i5] = new byte[w4Var8.size()][];
                for (int i6 = 0; i6 < w4Var8.size(); i6++) {
                    bArr[i4][i5][i6] = ((C9203q4) w4Var8.mo52675M(i6)).mo65418M();
                }
            }
            C9480w4 w4Var9 = (C9480w4) w4Var6.mo52675M(1);
            bArr2[i4] = new byte[w4Var9.size()][][];
            for (int i7 = 0; i7 < w4Var9.size(); i7++) {
                C9480w4 w4Var10 = (C9480w4) w4Var9.mo52675M(i7);
                bArr2[i4][i7] = new byte[w4Var10.size()][];
                for (int i8 = 0; i8 < w4Var10.size(); i8++) {
                    bArr2[i4][i7][i8] = ((C9203q4) w4Var10.mo52675M(i8)).mo65418M();
                }
            }
            C9480w4 w4Var11 = (C9480w4) w4Var6.mo52675M(2);
            bArr3[i4] = new byte[w4Var11.size()][];
            for (int i9 = 0; i9 < w4Var11.size(); i9++) {
                bArr3[i4][i9] = ((C9203q4) w4Var11.mo52675M(i9)).mo65418M();
            }
            bArr4[i4] = ((C9203q4) w4Var6.mo52675M(3)).mo65418M();
            i4++;
            i = 0;
        }
        int length = this.f44291s.length - 1;
        this.f44292x = new he3[length];
        int i10 = 0;
        while (i10 < length) {
            byte[] bArr5 = this.f44291s;
            int i11 = i10 + 1;
            this.f44292x[i10] = new he3(bArr5[i10], bArr5[i11], x65.m73880f(bArr[i10]), x65.m73880f(bArr2[i10]), x65.m73878d(bArr3[i10]), x65.m73876b(bArr4[i10]));
            i10 = i11;
        }
    }

    public r65(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, he3[] he3Arr) {
        this.f44285a = new C7333k4(1);
        this.f44287e = x65.m73877c(sArr);
        this.f44288g = x65.m73875a(sArr2);
        this.f44289k = x65.m73877c(sArr3);
        this.f44290r = x65.m73875a(sArr4);
        this.f44291s = x65.m73882h(iArr);
        this.f44292x = he3Arr;
    }

    /* renamed from: t */
    public static r65 m71455t(Object obj) {
        if (obj instanceof r65) {
            return (r65) obj;
        }
        if (obj != null) {
            return new r65(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: A */
    public he3[] mo65604A() {
        return this.f44292x;
    }

    /* renamed from: B */
    public int[] mo65605B() {
        return x65.m73881g(this.f44291s);
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4();
        C6843b4 b4Var = this.f44285a;
        if (b4Var == null) {
            b4Var = this.f44286d;
        }
        c4Var.mo50805a(b4Var);
        C6923c4 c4Var2 = new C6923c4();
        for (byte[] yz0 : this.f44287e) {
            c4Var2.mo50805a(new yz0(yz0));
        }
        c4Var.mo50805a(new c01(c4Var2));
        C6923c4 c4Var3 = new C6923c4();
        c4Var3.mo50805a(new yz0(this.f44288g));
        c4Var.mo50805a(new c01(c4Var3));
        C6923c4 c4Var4 = new C6923c4();
        for (byte[] yz02 : this.f44289k) {
            c4Var4.mo50805a(new yz0(yz02));
        }
        c4Var.mo50805a(new c01(c4Var4));
        C6923c4 c4Var5 = new C6923c4();
        c4Var5.mo50805a(new yz0(this.f44290r));
        c4Var.mo50805a(new c01(c4Var5));
        C6923c4 c4Var6 = new C6923c4();
        c4Var6.mo50805a(new yz0(this.f44291s));
        c4Var.mo50805a(new c01(c4Var6));
        C6923c4 c4Var7 = new C6923c4();
        for (int i = 0; i < this.f44292x.length; i++) {
            C6923c4 c4Var8 = new C6923c4();
            byte[][][] e = x65.m73879e(this.f44292x[i].mo52186a());
            C6923c4 c4Var9 = new C6923c4();
            for (int i2 = 0; i2 < e.length; i2++) {
                C6923c4 c4Var10 = new C6923c4();
                for (byte[] yz03 : e[i2]) {
                    c4Var10.mo50805a(new yz0(yz03));
                }
                c4Var9.mo50805a(new c01(c4Var10));
            }
            c4Var8.mo50805a(new c01(c4Var9));
            byte[][][] e2 = x65.m73879e(this.f44292x[i].mo52187b());
            C6923c4 c4Var11 = new C6923c4();
            for (int i3 = 0; i3 < e2.length; i3++) {
                C6923c4 c4Var12 = new C6923c4();
                for (byte[] yz04 : e2[i3]) {
                    c4Var12.mo50805a(new yz0(yz04));
                }
                c4Var11.mo50805a(new c01(c4Var12));
            }
            c4Var8.mo50805a(new c01(c4Var11));
            byte[][] c = x65.m73877c(this.f44292x[i].mo52189d());
            C6923c4 c4Var13 = new C6923c4();
            for (byte[] yz05 : c) {
                c4Var13.mo50805a(new yz0(yz05));
            }
            c4Var8.mo50805a(new c01(c4Var13));
            c4Var8.mo50805a(new yz0(x65.m73875a(this.f44292x[i].mo52188c())));
            c4Var7.mo50805a(new c01(c4Var8));
        }
        c4Var.mo50805a(new c01(c4Var7));
        return new c01(c4Var);
    }

    /* renamed from: r */
    public short[] mo65606r() {
        return x65.m73876b(this.f44288g);
    }

    /* renamed from: s */
    public short[] mo65607s() {
        return x65.m73876b(this.f44290r);
    }

    /* renamed from: u */
    public short[][] mo65608u() {
        return x65.m73878d(this.f44287e);
    }

    /* renamed from: w */
    public short[][] mo65609w() {
        return x65.m73878d(this.f44289k);
    }
}

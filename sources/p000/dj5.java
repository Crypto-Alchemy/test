package p000;

/* renamed from: dj5 */
public class dj5 extends fl3 {
    public dj5() {
    }

    public dj5(dj5 dj5) {
        super(dj5);
    }

    /* renamed from: a */
    public int mo50198a(byte[] bArr, int i) {
        mo51723p();
        ek4.m57392l(this.f37842e, bArr, i);
        ek4.m57392l(this.f37843f, bArr, i + 8);
        ek4.m57392l(this.f37844g, bArr, i + 16);
        ek4.m57392l(this.f37845h, bArr, i + 24);
        ek4.m57392l(this.f37846i, bArr, i + 32);
        ek4.m57392l(this.f37847j, bArr, i + 40);
        reset();
        return 48;
    }

    /* renamed from: c */
    public void mo50199c(us3 us3) {
        super.mo51722o((dj5) us3);
    }

    public us3 copy() {
        return new dj5(this);
    }

    /* renamed from: d */
    public String mo50201d() {
        return "SHA-384";
    }

    /* renamed from: e */
    public int mo50202e() {
        return 48;
    }

    public void reset() {
        super.reset();
        this.f37842e = -3766243637369397544L;
        this.f37843f = 7105036623409894663L;
        this.f37844g = -7973340178411365097L;
        this.f37845h = 1526699215303891257L;
        this.f37846i = 7436329637833083697L;
        this.f37847j = -8163818279084223215L;
        this.f37848k = -2662702644619276377L;
        this.f37849l = 5167115440072839076L;
    }
}

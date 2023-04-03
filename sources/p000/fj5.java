package p000;

/* renamed from: fj5 */
public class fj5 extends fl3 {
    public fj5() {
    }

    public fj5(fj5 fj5) {
        super(fj5);
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
        ek4.m57392l(this.f37848k, bArr, i + 48);
        ek4.m57392l(this.f37849l, bArr, i + 56);
        reset();
        return 64;
    }

    /* renamed from: c */
    public void mo50199c(us3 us3) {
        mo51722o((fj5) us3);
    }

    public us3 copy() {
        return new fj5(this);
    }

    /* renamed from: d */
    public String mo50201d() {
        return "SHA-512";
    }

    /* renamed from: e */
    public int mo50202e() {
        return 64;
    }

    public void reset() {
        super.reset();
        this.f37842e = 7640891576956012808L;
        this.f37843f = -4942790177534073029L;
        this.f37844g = 4354685564936845355L;
        this.f37845h = -6534734903238641935L;
        this.f37846i = 5840696475078001361L;
        this.f37847j = -7276294671716946913L;
        this.f37848k = 2270897969802886507L;
        this.f37849l = 6620516959819538809L;
    }
}

package p000;

/* renamed from: ws5 */
public class ws5 {

    /* renamed from: a */
    public final byte[] f45759a;

    /* renamed from: b */
    public final byte[] f45760b;

    /* renamed from: c */
    public final ig1 f45761c;

    /* renamed from: d */
    public int f45762d;

    /* renamed from: e */
    public int f45763e;

    public ws5(byte[] bArr, byte[] bArr2, ig1 ig1) {
        this.f45759a = bArr;
        this.f45760b = bArr2;
        this.f45761c = ig1;
    }

    /* renamed from: a */
    public void mo66765a(byte[] bArr, boolean z) {
        mo66766b(bArr, z, 0);
    }

    /* renamed from: b */
    public void mo66766b(byte[] bArr, boolean z, int i) {
        mo66767c(bArr, i);
        if (z) {
            this.f45763e++;
        }
    }

    /* renamed from: c */
    public byte[] mo66767c(byte[] bArr, int i) {
        if (bArr.length >= this.f45761c.mo50202e()) {
            ig1 ig1 = this.f45761c;
            byte[] bArr2 = this.f45759a;
            ig1.update(bArr2, 0, bArr2.length);
            this.f45761c.mo51713b((byte) (this.f45762d >>> 24));
            this.f45761c.mo51713b((byte) (this.f45762d >>> 16));
            this.f45761c.mo51713b((byte) (this.f45762d >>> 8));
            this.f45761c.mo51713b((byte) this.f45762d);
            this.f45761c.mo51713b((byte) (this.f45763e >>> 8));
            this.f45761c.mo51713b((byte) this.f45763e);
            this.f45761c.mo51713b((byte) -1);
            ig1 ig12 = this.f45761c;
            byte[] bArr3 = this.f45760b;
            ig12.update(bArr3, 0, bArr3.length);
            this.f45761c.mo50198a(bArr, i);
            return bArr;
        }
        throw new IllegalArgumentException("target length is less than digest size.");
    }

    /* renamed from: d */
    public void mo66768d(int i) {
        this.f45763e = i;
    }

    /* renamed from: e */
    public void mo66769e(int i) {
        this.f45762d = i;
    }
}

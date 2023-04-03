package p000;

/* renamed from: tc0 */
public class tc0 extends uk5 {
    /* renamed from: a */
    public void mo66011a() {
        int[] iArr = this.f45097c;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
    }

    /* renamed from: b */
    public void mo66012b(byte[] bArr) {
        uc0.m72694n(this.f45095a, this.f45097c, this.f45098d);
        ek4.m57385e(this.f45098d, bArr, 0);
    }

    /* renamed from: c */
    public String mo66013c() {
        return "ChaCha7539";
    }

    /* renamed from: d */
    public int mo66014d() {
        return 12;
    }

    /* renamed from: j */
    public void mo66015j() {
        this.f45097c[12] = 0;
    }

    /* renamed from: m */
    public void mo66016m(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length == 32) {
                mo66297g(bArr.length, this.f45097c, 0);
                ek4.m57388h(bArr, 0, this.f45097c, 4, 8);
            } else {
                throw new IllegalArgumentException(mo66013c() + " requires 256 bit key");
            }
        }
        ek4.m57388h(bArr2, 0, this.f45097c, 13, 3);
    }
}

package p000;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.MaxBytesExceededException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: uk5 */
public class uk5 {

    /* renamed from: j */
    public static final int[] f45092j = ek4.m57389i(ob6.m70226e("expand 16-byte kexpand 32-byte k"), 0, 8);

    /* renamed from: k */
    public static final byte[] f45093k = ob6.m70226e("expand 32-byte k");

    /* renamed from: l */
    public static final byte[] f45094l = ob6.m70226e("expand 16-byte k");

    /* renamed from: a */
    public int f45095a;

    /* renamed from: b */
    public int f45096b;

    /* renamed from: c */
    public int[] f45097c;

    /* renamed from: d */
    public int[] f45098d;

    /* renamed from: e */
    public byte[] f45099e;

    /* renamed from: f */
    public boolean f45100f;

    /* renamed from: g */
    public int f45101g;

    /* renamed from: h */
    public int f45102h;

    /* renamed from: i */
    public int f45103i;

    public uk5() {
        this(20);
    }

    public uk5(int i) {
        this.f45096b = 0;
        this.f45097c = new int[16];
        this.f45098d = new int[16];
        this.f45099e = new byte[64];
        this.f45100f = false;
        if (i <= 0 || (i & 1) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.f45095a = i;
    }

    /* renamed from: l */
    public static void m72812l(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        if (iArr3.length != 16) {
            throw new IllegalArgumentException();
        } else if (iArr4.length != 16) {
            throw new IllegalArgumentException();
        } else if (i % 2 == 0) {
            boolean z = false;
            int i2 = iArr3[0];
            int i3 = iArr3[1];
            int i4 = iArr3[2];
            int i5 = iArr3[3];
            int i6 = iArr3[4];
            int i7 = iArr3[5];
            int i8 = iArr3[6];
            int i9 = 7;
            int i10 = iArr3[7];
            int i11 = iArr3[8];
            int i12 = 9;
            int i13 = iArr3[9];
            int i14 = iArr3[10];
            int i15 = iArr3[11];
            int i16 = iArr3[12];
            int i17 = 13;
            int i18 = iArr3[13];
            int i19 = iArr3[14];
            int i20 = iArr3[15];
            int i21 = i19;
            int i22 = i18;
            int i23 = i16;
            int i24 = i15;
            int i25 = i14;
            int i26 = i13;
            int i27 = i11;
            int i28 = i10;
            int i29 = i8;
            int i30 = i7;
            int i31 = i6;
            int i32 = i5;
            int i33 = i4;
            int i34 = i3;
            int i35 = i2;
            int i36 = i;
            while (i36 > 0) {
                int c = gx2.m58283c(i35 + i23, i9) ^ i31;
                int c2 = i27 ^ gx2.m58283c(c + i35, i12);
                int c3 = i23 ^ gx2.m58283c(c2 + c, i17);
                int c4 = gx2.m58283c(c3 + c2, 18) ^ i35;
                int c5 = i26 ^ gx2.m58283c(i30 + i34, i9);
                int c6 = i22 ^ gx2.m58283c(c5 + i30, i12);
                int c7 = i34 ^ gx2.m58283c(c6 + c5, i17);
                int c8 = gx2.m58283c(c7 + c6, 18) ^ i30;
                int c9 = i21 ^ gx2.m58283c(i25 + i29, 7);
                int c10 = i33 ^ gx2.m58283c(c9 + i25, 9);
                int c11 = i29 ^ gx2.m58283c(c10 + c9, 13);
                int c12 = i25 ^ gx2.m58283c(c11 + c10, 18);
                int c13 = i32 ^ gx2.m58283c(i20 + i24, 7);
                int c14 = i28 ^ gx2.m58283c(c13 + i20, 9);
                int i37 = i36;
                int c15 = i24 ^ gx2.m58283c(c14 + c13, 13);
                int i38 = c6;
                int c16 = i20 ^ gx2.m58283c(c15 + c14, 18);
                int i39 = c3;
                i34 = c7 ^ gx2.m58283c(c4 + c13, 7);
                i33 = c10 ^ gx2.m58283c(i34 + c4, 9);
                int c17 = c13 ^ gx2.m58283c(i33 + i34, 13);
                int c18 = c4 ^ gx2.m58283c(c17 + i33, 18);
                i29 = c11 ^ gx2.m58283c(c8 + c, 7);
                i28 = c14 ^ gx2.m58283c(i29 + c8, 9);
                int c19 = gx2.m58283c(i28 + i29, 13) ^ c;
                i30 = c8 ^ gx2.m58283c(c19 + i28, 18);
                i24 = c15 ^ gx2.m58283c(c12 + c5, 7);
                int c20 = gx2.m58283c(i24 + c12, 9) ^ c2;
                i26 = c5 ^ gx2.m58283c(c20 + i24, 13);
                i25 = c12 ^ gx2.m58283c(i26 + c20, 18);
                i23 = i39 ^ gx2.m58283c(c16 + c9, 7);
                i22 = i38 ^ gx2.m58283c(i23 + c16, 9);
                i21 = c9 ^ gx2.m58283c(i22 + i23, 13);
                i20 = c16 ^ gx2.m58283c(i21 + i22, 18);
                i32 = c17;
                i27 = c20;
                i35 = c18;
                i31 = c19;
                z = false;
                i17 = 13;
                i12 = 9;
                i9 = 7;
                int[] iArr5 = iArr;
                i36 = i37 - 2;
                int[] iArr6 = iArr2;
            }
            char c21 = z;
            iArr2[c21] = i35 + iArr[c21];
            iArr2[1] = i34 + iArr[1];
            iArr2[2] = i33 + iArr[2];
            iArr2[3] = i32 + iArr[3];
            iArr2[4] = i31 + iArr[4];
            iArr2[5] = i30 + iArr[5];
            iArr2[6] = i29 + iArr[6];
            iArr2[7] = i28 + iArr[7];
            iArr2[8] = i27 + iArr[8];
            iArr2[9] = i26 + iArr[9];
            iArr2[10] = i25 + iArr[10];
            iArr2[11] = i24 + iArr[11];
            iArr2[12] = i23 + iArr[12];
            iArr2[13] = i22 + iArr[13];
            iArr2[14] = i21 + iArr[14];
            iArr2[15] = i20 + iArr[15];
        } else {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
    }

    /* renamed from: a */
    public void mo66011a() {
        throw null;
    }

    /* renamed from: b */
    public void mo66012b(byte[] bArr) {
        throw null;
    }

    /* renamed from: c */
    public String mo66013c() {
        throw null;
    }

    /* renamed from: d */
    public int mo66014d() {
        throw null;
    }

    /* renamed from: e */
    public void mo66295e(boolean z, we0 we0) {
        if (we0 instanceof yl4) {
            yl4 yl4 = (yl4) we0;
            byte[] a = yl4.mo67127a();
            if (a == null || a.length != mo66014d()) {
                throw new IllegalArgumentException(mo66013c() + " requires exactly " + mo66014d() + " bytes of IV");
            }
            we0 b = yl4.mo67128b();
            if (b == null) {
                if (this.f45100f) {
                    mo66016m((byte[]) null, a);
                } else {
                    throw new IllegalStateException(mo66013c() + " KeyParameter can not be null for first initialisation");
                }
            } else if (b instanceof va3) {
                mo66016m(((va3) b).mo66464a(), a);
            } else {
                throw new IllegalArgumentException(mo66013c() + " Init parameters must contain a KeyParameter (or null for re-init)");
            }
            mo66299i();
            this.f45100f = true;
            return;
        }
        throw new IllegalArgumentException(mo66013c() + " Init parameters must include an IV");
    }

    /* renamed from: f */
    public final boolean mo66296f(int i) {
        int i2 = this.f45101g + i;
        this.f45101g = i2;
        if (i2 >= i || i2 < 0) {
            return false;
        }
        int i3 = this.f45102h + 1;
        this.f45102h = i3;
        if (i3 != 0) {
            return false;
        }
        int i4 = this.f45103i + 1;
        this.f45103i = i4;
        return (i4 & 32) != 0;
    }

    /* renamed from: g */
    public void mo66297g(int i, int[] iArr, int i2) {
        int i3 = (i - 16) / 4;
        int[] iArr2 = f45092j;
        iArr[i2] = iArr2[i3];
        iArr[i2 + 1] = iArr2[i3 + 1];
        iArr[i2 + 2] = iArr2[i3 + 2];
        iArr[i2 + 3] = iArr2[i3 + 3];
    }

    /* renamed from: h */
    public int mo66298h(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.f45100f) {
            throw new IllegalStateException(mo66013c() + " not initialised");
        } else if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        } else if (!mo66296f(i2)) {
            for (int i4 = 0; i4 < i2; i4++) {
                byte[] bArr3 = this.f45099e;
                int i5 = this.f45096b;
                bArr2[i4 + i3] = (byte) (bArr3[i5] ^ bArr[i4 + i]);
                int i6 = (i5 + 1) & 63;
                this.f45096b = i6;
                if (i6 == 0) {
                    mo66011a();
                    mo66012b(this.f45099e);
                }
            }
            return i2;
        } else {
            throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
        }
    }

    /* renamed from: i */
    public void mo66299i() {
        this.f45096b = 0;
        mo66300k();
        mo66015j();
        mo66012b(this.f45099e);
    }

    /* renamed from: j */
    public void mo66015j() {
        throw null;
    }

    /* renamed from: k */
    public final void mo66300k() {
        this.f45101g = 0;
        this.f45102h = 0;
        this.f45103i = 0;
    }

    /* renamed from: m */
    public void mo66016m(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}

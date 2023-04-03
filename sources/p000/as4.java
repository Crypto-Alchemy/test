package p000;

import okhttp3.internal.http2.Http2Connection;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: as4 */
public class as4 implements km3 {

    /* renamed from: a */
    public final j30 f36553a = null;

    /* renamed from: b */
    public final byte[] f36554b = new byte[1];

    /* renamed from: c */
    public int f36555c;

    /* renamed from: d */
    public int f36556d;

    /* renamed from: e */
    public int f36557e;

    /* renamed from: f */
    public int f36558f;

    /* renamed from: g */
    public int f36559g;

    /* renamed from: h */
    public int f36560h;

    /* renamed from: i */
    public int f36561i;

    /* renamed from: j */
    public int f36562j;

    /* renamed from: k */
    public int f36563k;

    /* renamed from: l */
    public int f36564l;

    /* renamed from: m */
    public int f36565m;

    /* renamed from: n */
    public int f36566n;

    /* renamed from: o */
    public int f36567o;

    /* renamed from: p */
    public final byte[] f36568p = new byte[16];

    /* renamed from: q */
    public int f36569q = 0;

    /* renamed from: r */
    public int f36570r;

    /* renamed from: s */
    public int f36571s;

    /* renamed from: t */
    public int f36572t;

    /* renamed from: u */
    public int f36573u;

    /* renamed from: v */
    public int f36574v;

    /* renamed from: d */
    public static final long m55667d(int i, int i2) {
        return (((long) i) & 4294967295L) * ((long) i2);
    }

    /* renamed from: a */
    public int mo50312a(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        if (i + 16 <= bArr.length) {
            if (this.f36569q > 0) {
                mo50315e();
            }
            int i2 = this.f36571s;
            int i3 = this.f36570r;
            int i4 = i2 + (i3 >>> 26);
            int i5 = this.f36572t + (i4 >>> 26);
            int i6 = this.f36573u + (i5 >>> 26);
            int i7 = i5 & 67108863;
            int i8 = this.f36574v + (i6 >>> 26);
            int i9 = i6 & 67108863;
            int i10 = (i3 & 67108863) + ((i8 >>> 26) * 5);
            int i11 = i8 & 67108863;
            int i12 = (i4 & 67108863) + (i10 >>> 26);
            int i13 = i10 & 67108863;
            int i14 = i13 + 5;
            int i15 = (i14 >>> 26) + i12;
            int i16 = (i15 >>> 26) + i7;
            int i17 = (i16 >>> 26) + i9;
            int i18 = 67108863 & i17;
            int i19 = ((i17 >>> 26) + i11) - 67108864;
            int i20 = (i19 >>> 31) - 1;
            int i21 = ~i20;
            int i22 = (i13 & i21) | (i14 & 67108863 & i20);
            this.f36570r = i22;
            int i23 = (i12 & i21) | (i15 & 67108863 & i20);
            this.f36571s = i23;
            int i24 = (i7 & i21) | (i16 & 67108863 & i20);
            this.f36572t = i24;
            int i25 = (i18 & i20) | (i9 & i21);
            this.f36573u = i25;
            int i26 = (i11 & i21) | (i19 & i20);
            this.f36574v = i26;
            long j = (((long) (i22 | (i23 << 26))) & 4294967295L) + (((long) this.f36564l) & 4294967295L);
            long j2 = (((long) ((i23 >>> 6) | (i24 << 20))) & 4294967295L) + (((long) this.f36565m) & 4294967295L);
            long j3 = (((long) ((i24 >>> 12) | (i25 << 14))) & 4294967295L) + (((long) this.f36566n) & 4294967295L);
            ek4.m57384d((int) j, bArr, i);
            long j4 = j2 + (j >>> 32);
            ek4.m57384d((int) j4, bArr, i + 4);
            long j5 = j3 + (j4 >>> 32);
            ek4.m57384d((int) j5, bArr, i + 8);
            ek4.m57384d((int) ((((long) ((i25 >>> 18) | (i26 << 8))) & 4294967295L) + (4294967295L & ((long) this.f36567o)) + (j5 >>> 32)), bArr, i + 12);
            mo50316f();
            return 16;
        }
        throw new OutputLengthException("Output buffer is too short.");
    }

    /* renamed from: b */
    public int mo50313b() {
        return 16;
    }

    /* renamed from: c */
    public void mo50314c(we0 we0) throws IllegalArgumentException {
        byte[] bArr;
        if (this.f36553a == null) {
            bArr = null;
        } else if (we0 instanceof yl4) {
            yl4 yl4 = (yl4) we0;
            bArr = yl4.mo67127a();
            we0 = yl4.mo67128b();
        } else {
            throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
        }
        if (we0 instanceof va3) {
            mo50317g(((va3) we0).mo66464a(), bArr);
            mo50316f();
            return;
        }
        throw new IllegalArgumentException("Poly1305 requires a key.");
    }

    /* renamed from: e */
    public final void mo50315e() {
        int i = this.f36569q;
        if (i < 16) {
            this.f36568p[i] = 1;
            for (int i2 = i + 1; i2 < 16; i2++) {
                this.f36568p[i2] = 0;
            }
        }
        long f = ((long) ek4.m57386f(this.f36568p, 0)) & 4294967295L;
        long f2 = ((long) ek4.m57386f(this.f36568p, 4)) & 4294967295L;
        long f3 = ((long) ek4.m57386f(this.f36568p, 8)) & 4294967295L;
        long f4 = 4294967295L & ((long) ek4.m57386f(this.f36568p, 12));
        int i3 = (int) (((long) this.f36570r) + (f & 67108863));
        this.f36570r = i3;
        this.f36571s = (int) (((long) this.f36571s) + ((((f2 << 32) | f) >>> 26) & 67108863));
        this.f36572t = (int) (((long) this.f36572t) + (((f2 | (f3 << 32)) >>> 20) & 67108863));
        this.f36573u = (int) (((long) this.f36573u) + ((((f4 << 32) | f3) >>> 14) & 67108863));
        int i4 = (int) (((long) this.f36574v) + (f4 >>> 8));
        this.f36574v = i4;
        if (this.f36569q == 16) {
            this.f36574v = i4 + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        long d = m55667d(i3, this.f36555c) + m55667d(this.f36571s, this.f36563k) + m55667d(this.f36572t, this.f36562j) + m55667d(this.f36573u, this.f36561i) + m55667d(this.f36574v, this.f36560h);
        long d2 = m55667d(this.f36570r, this.f36556d) + m55667d(this.f36571s, this.f36555c) + m55667d(this.f36572t, this.f36563k) + m55667d(this.f36573u, this.f36562j) + m55667d(this.f36574v, this.f36561i);
        long d3 = m55667d(this.f36570r, this.f36557e) + m55667d(this.f36571s, this.f36556d) + m55667d(this.f36572t, this.f36555c) + m55667d(this.f36573u, this.f36563k) + m55667d(this.f36574v, this.f36562j);
        long d4 = m55667d(this.f36570r, this.f36558f) + m55667d(this.f36571s, this.f36557e) + m55667d(this.f36572t, this.f36556d) + m55667d(this.f36573u, this.f36555c) + m55667d(this.f36574v, this.f36563k);
        long d5 = m55667d(this.f36570r, this.f36559g) + m55667d(this.f36571s, this.f36558f) + m55667d(this.f36572t, this.f36557e) + m55667d(this.f36573u, this.f36556d) + m55667d(this.f36574v, this.f36555c);
        long j = d2 + (d >>> 26);
        long j2 = d3 + (j >>> 26);
        this.f36572t = ((int) j2) & 67108863;
        long j3 = d4 + (j2 >>> 26);
        this.f36573u = ((int) j3) & 67108863;
        long j4 = d5 + (j3 >>> 26);
        this.f36574v = ((int) j4) & 67108863;
        int i5 = (((int) d) & 67108863) + (((int) (j4 >>> 26)) * 5);
        this.f36571s = (((int) j) & 67108863) + (i5 >>> 26);
        this.f36570r = i5 & 67108863;
    }

    /* renamed from: f */
    public void mo50316f() {
        this.f36569q = 0;
        this.f36574v = 0;
        this.f36573u = 0;
        this.f36572t = 0;
        this.f36571s = 0;
        this.f36570r = 0;
    }

    /* renamed from: g */
    public final void mo50317g(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            int i = 16;
            if (this.f36553a == null || (bArr2 != null && bArr2.length == 16)) {
                int f = ek4.m57386f(bArr, 0);
                int f2 = ek4.m57386f(bArr, 4);
                int f3 = ek4.m57386f(bArr, 8);
                int f4 = ek4.m57386f(bArr, 12);
                this.f36555c = 67108863 & f;
                int i2 = ((f >>> 26) | (f2 << 6)) & 67108611;
                this.f36556d = i2;
                int i3 = ((f2 >>> 20) | (f3 << 12)) & 67092735;
                this.f36557e = i3;
                int i4 = ((f3 >>> 14) | (f4 << 18)) & 66076671;
                this.f36558f = i4;
                int i5 = (f4 >>> 8) & 1048575;
                this.f36559g = i5;
                this.f36560h = i2 * 5;
                this.f36561i = i3 * 5;
                this.f36562j = i4 * 5;
                this.f36563k = i5 * 5;
                j30 j30 = this.f36553a;
                if (j30 != null) {
                    byte[] bArr3 = new byte[16];
                    j30.mo52611a(true, new va3(bArr, 16, 16));
                    this.f36553a.mo52612b(bArr2, 0, bArr3, 0);
                    i = 0;
                    bArr = bArr3;
                }
                this.f36564l = ek4.m57386f(bArr, i + 0);
                this.f36565m = ek4.m57386f(bArr, i + 4);
                this.f36566n = ek4.m57386f(bArr, i + 8);
                this.f36567o = ek4.m57386f(bArr, i + 12);
                return;
            }
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
    }

    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        int i3 = 0;
        while (i2 > i3) {
            if (this.f36569q == 16) {
                mo50315e();
                this.f36569q = 0;
            }
            int min = Math.min(i2 - i3, 16 - this.f36569q);
            System.arraycopy(bArr, i3 + i, this.f36568p, this.f36569q, min);
            i3 += min;
            this.f36569q += min;
        }
    }
}

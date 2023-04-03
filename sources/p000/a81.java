package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: a81 */
/* compiled from: DefaultExtractorInput */
public final class a81 implements iy1 {

    /* renamed from: a */
    public final byte[] f57a = new byte[4096];

    /* renamed from: b */
    public final u11 f58b;

    /* renamed from: c */
    public final long f59c;

    /* renamed from: d */
    public long f60d;

    /* renamed from: e */
    public byte[] f61e = new byte[65536];

    /* renamed from: f */
    public int f62f;

    /* renamed from: g */
    public int f63g;

    static {
        ir3.m19787a("media3.extractor");
    }

    public a81(u11 u11, long j, long j2) {
        this.f58b = u11;
        this.f60d = j;
        this.f59c = j2;
    }

    /* renamed from: a */
    public int mo83a(int i) throws IOException {
        int s = mo101s(i);
        if (s == 0) {
            byte[] bArr = this.f57a;
            s = mo98r(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        mo95o(s);
        return s;
    }

    /* renamed from: c */
    public boolean mo84c(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!mo93l(i2, z)) {
            return false;
        }
        System.arraycopy(this.f61e, this.f62f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: e */
    public void mo85e() {
        this.f62f = 0;
    }

    /* renamed from: f */
    public boolean mo86f(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int q = mo97q(bArr, i, i2);
        while (q < i2 && q != -1) {
            q = mo98r(bArr, i, i2, q, z);
        }
        mo95o(q);
        if (q != -1) {
            return true;
        }
        return false;
    }

    public long getLength() {
        return this.f59c;
    }

    public long getPosition() {
        return this.f60d;
    }

    /* renamed from: h */
    public long mo89h() {
        return this.f60d + ((long) this.f62f);
    }

    /* renamed from: i */
    public void mo90i(int i) throws IOException {
        mo93l(i, false);
    }

    /* renamed from: j */
    public int mo91j(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        mo96p(i2);
        int i4 = this.f63g;
        int i5 = this.f62f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = mo98r(this.f61e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f63g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f61e, this.f62f, bArr, i, i3);
        this.f62f += i3;
        return i3;
    }

    /* renamed from: k */
    public void mo92k(int i) throws IOException {
        mo102t(i, false);
    }

    /* renamed from: l */
    public boolean mo93l(int i, boolean z) throws IOException {
        mo96p(i);
        int i2 = this.f63g - this.f62f;
        while (i2 < i) {
            i2 = mo98r(this.f61e, this.f62f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f63g = this.f62f + i2;
        }
        this.f62f += i;
        return true;
    }

    /* renamed from: n */
    public void mo94n(byte[] bArr, int i, int i2) throws IOException {
        mo84c(bArr, i, i2, false);
    }

    /* renamed from: o */
    public final void mo95o(int i) {
        if (i != -1) {
            this.f60d += (long) i;
        }
    }

    /* renamed from: p */
    public final void mo96p(int i) {
        int i2 = this.f62f + i;
        byte[] bArr = this.f61e;
        if (i2 > bArr.length) {
            this.f61e = Arrays.copyOf(this.f61e, w67.m29374q(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: q */
    public final int mo97q(byte[] bArr, int i, int i2) {
        int i3 = this.f63g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f61e, 0, bArr, i, min);
        mo103u(min);
        return min;
    }

    /* renamed from: r */
    public final int mo98r(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int read = this.f58b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int q = mo97q(bArr, i, i2);
        if (q == 0) {
            q = mo98r(bArr, i, i2, 0, true);
        }
        mo95o(q);
        return q;
    }

    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        mo86f(bArr, i, i2, false);
    }

    /* renamed from: s */
    public final int mo101s(int i) {
        int min = Math.min(this.f63g, i);
        mo103u(min);
        return min;
    }

    /* renamed from: t */
    public boolean mo102t(int i, boolean z) throws IOException {
        int s = mo101s(i);
        while (s < i && s != -1) {
            s = mo98r(this.f57a, -s, Math.min(i, this.f57a.length + s), s, z);
        }
        mo95o(s);
        if (s != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final void mo103u(int i) {
        byte[] bArr;
        int i2 = this.f63g - i;
        this.f63g = i2;
        this.f62f = 0;
        byte[] bArr2 = this.f61e;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[(65536 + i2)];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.f61e = bArr;
    }
}

package p000;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: g60 */
/* compiled from: ByteArrayBuilder */
public final class g60 extends OutputStream {

    /* renamed from: r */
    public static final byte[] f12185r = new byte[0];

    /* renamed from: a */
    public final r40 f12186a;

    /* renamed from: d */
    public final LinkedList<byte[]> f12187d;

    /* renamed from: e */
    public int f12188e;

    /* renamed from: g */
    public byte[] f12189g;

    /* renamed from: k */
    public int f12190k;

    public g60() {
        this((r40) null);
    }

    /* renamed from: g */
    public static g60 m17614g(byte[] bArr, int i) {
        return new g60((r40) null, bArr, i);
    }

    /* renamed from: a */
    public final void mo20386a() {
        int length = this.f12188e + this.f12189g.length;
        if (length >= 0) {
            this.f12188e = length;
            int max = Math.max(length >> 1, 1000);
            if (max > 131072) {
                max = 131072;
            }
            this.f12187d.add(this.f12189g);
            this.f12189g = new byte[max];
            this.f12190k = 0;
            return;
        }
        throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
    }

    /* renamed from: b */
    public void mo20387b(int i) {
        if (this.f12190k >= this.f12189g.length) {
            mo20386a();
        }
        byte[] bArr = this.f12189g;
        int i2 = this.f12190k;
        this.f12190k = i2 + 1;
        bArr[i2] = (byte) i;
    }

    /* renamed from: c */
    public void mo20388c(int i) {
        int i2 = this.f12190k;
        int i3 = i2 + 2;
        byte[] bArr = this.f12189g;
        if (i3 < bArr.length) {
            int i4 = i2 + 1;
            bArr[i2] = (byte) (i >> 16);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (i >> 8);
            this.f12190k = i5 + 1;
            bArr[i5] = (byte) i;
            return;
        }
        mo20387b(i >> 16);
        mo20387b(i >> 8);
        mo20387b(i);
    }

    public void close() {
    }

    /* renamed from: d */
    public void mo20390d(int i) {
        int i2 = this.f12190k;
        int i3 = i2 + 1;
        byte[] bArr = this.f12189g;
        if (i3 < bArr.length) {
            int i4 = i2 + 1;
            bArr[i2] = (byte) (i >> 8);
            this.f12190k = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        mo20387b(i >> 8);
        mo20387b(i);
    }

    /* renamed from: e */
    public byte[] mo20391e(int i) {
        this.f12190k = i;
        return mo20400n();
    }

    /* renamed from: f */
    public byte[] mo20392f() {
        mo20386a();
        return this.f12189g;
    }

    public void flush() {
    }

    /* renamed from: h */
    public byte[] mo20394h() {
        return this.f12189g;
    }

    /* renamed from: i */
    public int mo20395i() {
        return this.f12190k;
    }

    /* renamed from: j */
    public void mo20396j() {
        byte[] bArr;
        mo20397k();
        r40 r40 = this.f12186a;
        if (r40 != null && (bArr = this.f12189g) != null) {
            r40.mo25324i(2, bArr);
            this.f12189g = null;
        }
    }

    /* renamed from: k */
    public void mo20397k() {
        this.f12188e = 0;
        this.f12190k = 0;
        if (!this.f12187d.isEmpty()) {
            this.f12187d.clear();
        }
    }

    /* renamed from: l */
    public byte[] mo20398l() {
        mo20397k();
        return this.f12189g;
    }

    /* renamed from: m */
    public void mo20399m(int i) {
        this.f12190k = i;
    }

    /* renamed from: n */
    public byte[] mo20400n() {
        int i = this.f12188e + this.f12190k;
        if (i == 0) {
            return f12185r;
        }
        byte[] bArr = new byte[i];
        Iterator<byte[]> it = this.f12187d.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] next = it.next();
            int length = next.length;
            System.arraycopy(next, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.f12189g, 0, bArr, i2, this.f12190k);
        int i3 = i2 + this.f12190k;
        if (i3 == i) {
            if (!this.f12187d.isEmpty()) {
                mo20397k();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i + ", copied " + i3 + " bytes");
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public g60(r40 r40) {
        this(r40, 500);
    }

    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this.f12189g.length - this.f12190k, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this.f12189g, this.f12190k, min);
                i += min;
                this.f12190k += min;
                i2 -= min;
            }
            if (i2 > 0) {
                mo20386a();
            } else {
                return;
            }
        }
    }

    public g60(int i) {
        this((r40) null, i);
    }

    public g60(r40 r40, int i) {
        this.f12187d = new LinkedList<>();
        this.f12186a = r40;
        this.f12189g = r40 == null ? new byte[(i > 131072 ? 131072 : i)] : r40.mo25316a(2);
    }

    public void write(int i) {
        mo20387b(i);
    }

    public g60(r40 r40, byte[] bArr, int i) {
        this.f12187d = new LinkedList<>();
        this.f12186a = null;
        this.f12189g = bArr;
        this.f12190k = i;
    }
}

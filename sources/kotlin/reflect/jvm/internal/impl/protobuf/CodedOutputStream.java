package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public final class CodedOutputStream {

    /* renamed from: a */
    public final byte[] f39909a;

    /* renamed from: b */
    public final int f39910b;

    /* renamed from: c */
    public int f39911c;

    /* renamed from: d */
    public int f39912d = 0;

    /* renamed from: e */
    public final OutputStream f39913e;

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f39913e = outputStream;
        this.f39909a = bArr;
        this.f39911c = 0;
        this.f39910b = bArr.length;
    }

    /* renamed from: A */
    public static int m61843A(int i, long j) {
        return m61846D(i) + m61844B(j);
    }

    /* renamed from: B */
    public static int m61844B(long j) {
        return m61874w(m61850H(j));
    }

    /* renamed from: C */
    public static int m61845C(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m61873v(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    /* renamed from: D */
    public static int m61846D(int i) {
        return m61873v(WireFormat.m61946c(i, 0));
    }

    /* renamed from: E */
    public static int m61847E(int i) {
        return m61873v(i);
    }

    /* renamed from: F */
    public static int m61848F(long j) {
        return m61874w(j);
    }

    /* renamed from: G */
    public static int m61849G(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: H */
    public static long m61850H(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: J */
    public static CodedOutputStream m61851J(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    /* renamed from: a */
    public static int m61852a(int i, boolean z) {
        return m61846D(i) + m61853b(z);
    }

    /* renamed from: b */
    public static int m61853b(boolean z) {
        return 1;
    }

    /* renamed from: c */
    public static int m61854c(byte[] bArr) {
        return m61873v(bArr.length) + bArr.length;
    }

    /* renamed from: d */
    public static int m61855d(int i, c70 c70) {
        return m61846D(i) + m61856e(c70);
    }

    /* renamed from: e */
    public static int m61856e(c70 c70) {
        return m61873v(c70.size()) + c70.size();
    }

    /* renamed from: f */
    public static int m61857f(int i, double d) {
        return m61846D(i) + m61858g(d);
    }

    /* renamed from: g */
    public static int m61858g(double d) {
        return 8;
    }

    /* renamed from: h */
    public static int m61859h(int i, int i2) {
        return m61846D(i) + m61860i(i2);
    }

    /* renamed from: i */
    public static int m61860i(int i) {
        return m61867p(i);
    }

    /* renamed from: j */
    public static int m61861j(int i) {
        return 4;
    }

    /* renamed from: k */
    public static int m61862k(long j) {
        return 8;
    }

    /* renamed from: l */
    public static int m61863l(int i, float f) {
        return m61846D(i) + m61864m(f);
    }

    /* renamed from: m */
    public static int m61864m(float f) {
        return 4;
    }

    /* renamed from: n */
    public static int m61865n(C7628h hVar) {
        return hVar.getSerializedSize();
    }

    /* renamed from: o */
    public static int m61866o(int i, int i2) {
        return m61846D(i) + m61867p(i2);
    }

    /* renamed from: p */
    public static int m61867p(int i) {
        if (i >= 0) {
            return m61873v(i);
        }
        return 10;
    }

    /* renamed from: q */
    public static int m61868q(long j) {
        return m61874w(j);
    }

    /* renamed from: r */
    public static int m61869r(kf3 kf3) {
        int b = kf3.mo52898b();
        return m61873v(b) + b;
    }

    /* renamed from: s */
    public static int m61870s(int i, C7628h hVar) {
        return m61846D(i) + m61871t(hVar);
    }

    /* renamed from: t */
    public static int m61871t(C7628h hVar) {
        int serializedSize = hVar.getSerializedSize();
        return m61873v(serializedSize) + serializedSize;
    }

    /* renamed from: u */
    public static int m61872u(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: v */
    public static int m61873v(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: w */
    public static int m61874w(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: x */
    public static int m61875x(int i) {
        return 4;
    }

    /* renamed from: y */
    public static int m61876y(long j) {
        return 8;
    }

    /* renamed from: z */
    public static int m61877z(int i) {
        return m61873v(m61849G(i));
    }

    /* renamed from: I */
    public void mo54597I() throws IOException {
        if (this.f39913e != null) {
            mo54598K();
        }
    }

    /* renamed from: K */
    public final void mo54598K() throws IOException {
        OutputStream outputStream = this.f39913e;
        if (outputStream != null) {
            outputStream.write(this.f39909a, 0, this.f39911c);
            this.f39911c = 0;
            return;
        }
        throw new OutOfSpaceException();
    }

    /* renamed from: L */
    public void mo54599L(int i, boolean z) throws IOException {
        mo54636w0(i, 0);
        mo54600M(z);
    }

    /* renamed from: M */
    public void mo54600M(boolean z) throws IOException {
        mo54621h0(z ? 1 : 0);
    }

    /* renamed from: N */
    public void mo54601N(byte[] bArr) throws IOException {
        mo54628o0(bArr.length);
        mo54624k0(bArr);
    }

    /* renamed from: O */
    public void mo54602O(int i, c70 c70) throws IOException {
        mo54636w0(i, 2);
        mo54603P(c70);
    }

    /* renamed from: P */
    public void mo54603P(c70 c70) throws IOException {
        mo54628o0(c70.size());
        mo54622i0(c70);
    }

    /* renamed from: Q */
    public void mo54604Q(int i, double d) throws IOException {
        mo54636w0(i, 1);
        mo54605R(d);
    }

    /* renamed from: R */
    public void mo54605R(double d) throws IOException {
        mo54627n0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: S */
    public void mo54606S(int i, int i2) throws IOException {
        mo54636w0(i, 0);
        mo54607T(i2);
    }

    /* renamed from: T */
    public void mo54607T(int i) throws IOException {
        mo54615b0(i);
    }

    /* renamed from: U */
    public void mo54608U(int i) throws IOException {
        mo54626m0(i);
    }

    /* renamed from: V */
    public void mo54609V(long j) throws IOException {
        mo54627n0(j);
    }

    /* renamed from: W */
    public void mo54610W(int i, float f) throws IOException {
        mo54636w0(i, 5);
        mo54611X(f);
    }

    /* renamed from: X */
    public void mo54611X(float f) throws IOException {
        mo54626m0(Float.floatToRawIntBits(f));
    }

    /* renamed from: Y */
    public void mo54612Y(int i, C7628h hVar) throws IOException {
        mo54636w0(i, 3);
        mo54613Z(hVar);
        mo54636w0(i, 4);
    }

    /* renamed from: Z */
    public void mo54613Z(C7628h hVar) throws IOException {
        hVar.writeTo(this);
    }

    /* renamed from: a0 */
    public void mo54614a0(int i, int i2) throws IOException {
        mo54636w0(i, 0);
        mo54615b0(i2);
    }

    /* renamed from: b0 */
    public void mo54615b0(int i) throws IOException {
        if (i >= 0) {
            mo54628o0(i);
        } else {
            mo54629p0((long) i);
        }
    }

    /* renamed from: c0 */
    public void mo54616c0(long j) throws IOException {
        mo54629p0(j);
    }

    /* renamed from: d0 */
    public void mo54617d0(int i, C7628h hVar) throws IOException {
        mo54636w0(i, 2);
        mo54618e0(hVar);
    }

    /* renamed from: e0 */
    public void mo54618e0(C7628h hVar) throws IOException {
        mo54628o0(hVar.getSerializedSize());
        hVar.writeTo(this);
    }

    /* renamed from: f0 */
    public void mo54619f0(int i, C7628h hVar) throws IOException {
        mo54636w0(1, 3);
        mo54637x0(2, i);
        mo54617d0(3, hVar);
        mo54636w0(1, 4);
    }

    /* renamed from: g0 */
    public void mo54620g0(byte b) throws IOException {
        if (this.f39911c == this.f39910b) {
            mo54598K();
        }
        byte[] bArr = this.f39909a;
        int i = this.f39911c;
        this.f39911c = i + 1;
        bArr[i] = b;
        this.f39912d++;
    }

    /* renamed from: h0 */
    public void mo54621h0(int i) throws IOException {
        mo54620g0((byte) i);
    }

    /* renamed from: i0 */
    public void mo54622i0(c70 c70) throws IOException {
        mo54623j0(c70, 0, c70.size());
    }

    /* renamed from: j0 */
    public void mo54623j0(c70 c70, int i, int i2) throws IOException {
        int i3 = this.f39910b;
        int i4 = this.f39911c;
        if (i3 - i4 >= i2) {
            c70.mo50827r(this.f39909a, i, i4, i2);
            this.f39911c += i2;
            this.f39912d += i2;
            return;
        }
        int i5 = i3 - i4;
        c70.mo50827r(this.f39909a, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f39911c = this.f39910b;
        this.f39912d += i5;
        mo54598K();
        if (i7 <= this.f39910b) {
            c70.mo50827r(this.f39909a, i6, 0, i7);
            this.f39911c = i7;
        } else {
            c70.mo50822N(this.f39913e, i6, i7);
        }
        this.f39912d += i7;
    }

    /* renamed from: k0 */
    public void mo54624k0(byte[] bArr) throws IOException {
        mo54625l0(bArr, 0, bArr.length);
    }

    /* renamed from: l0 */
    public void mo54625l0(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f39910b;
        int i4 = this.f39911c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f39909a, i4, i2);
            this.f39911c += i2;
            this.f39912d += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f39909a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f39911c = this.f39910b;
        this.f39912d += i5;
        mo54598K();
        if (i7 <= this.f39910b) {
            System.arraycopy(bArr, i6, this.f39909a, 0, i7);
            this.f39911c = i7;
        } else {
            this.f39913e.write(bArr, i6, i7);
        }
        this.f39912d += i7;
    }

    /* renamed from: m0 */
    public void mo54626m0(int i) throws IOException {
        mo54621h0(i & 255);
        mo54621h0((i >> 8) & 255);
        mo54621h0((i >> 16) & 255);
        mo54621h0((i >> 24) & 255);
    }

    /* renamed from: n0 */
    public void mo54627n0(long j) throws IOException {
        mo54621h0(((int) j) & 255);
        mo54621h0(((int) (j >> 8)) & 255);
        mo54621h0(((int) (j >> 16)) & 255);
        mo54621h0(((int) (j >> 24)) & 255);
        mo54621h0(((int) (j >> 32)) & 255);
        mo54621h0(((int) (j >> 40)) & 255);
        mo54621h0(((int) (j >> 48)) & 255);
        mo54621h0(((int) (j >> 56)) & 255);
    }

    /* renamed from: o0 */
    public void mo54628o0(int i) throws IOException {
        while ((i & -128) != 0) {
            mo54621h0((i & 127) | 128);
            i >>>= 7;
        }
        mo54621h0(i);
    }

    /* renamed from: p0 */
    public void mo54629p0(long j) throws IOException {
        while ((-128 & j) != 0) {
            mo54621h0((((int) j) & 127) | 128);
            j >>>= 7;
        }
        mo54621h0((int) j);
    }

    /* renamed from: q0 */
    public void mo54630q0(int i) throws IOException {
        mo54626m0(i);
    }

    /* renamed from: r0 */
    public void mo54631r0(long j) throws IOException {
        mo54627n0(j);
    }

    /* renamed from: s0 */
    public void mo54632s0(int i) throws IOException {
        mo54628o0(m61849G(i));
    }

    /* renamed from: t0 */
    public void mo54633t0(int i, long j) throws IOException {
        mo54636w0(i, 0);
        mo54634u0(j);
    }

    /* renamed from: u0 */
    public void mo54634u0(long j) throws IOException {
        mo54629p0(m61850H(j));
    }

    /* renamed from: v0 */
    public void mo54635v0(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        mo54628o0(bytes.length);
        mo54624k0(bytes);
    }

    /* renamed from: w0 */
    public void mo54636w0(int i, int i2) throws IOException {
        mo54628o0(WireFormat.m61946c(i, i2));
    }

    /* renamed from: x0 */
    public void mo54637x0(int i, int i2) throws IOException {
        mo54636w0(i, 0);
        mo54638y0(i2);
    }

    /* renamed from: y0 */
    public void mo54638y0(int i) throws IOException {
        mo54628o0(i);
    }

    /* renamed from: z0 */
    public void mo54639z0(long j) throws IOException {
        mo54629p0(j);
    }
}

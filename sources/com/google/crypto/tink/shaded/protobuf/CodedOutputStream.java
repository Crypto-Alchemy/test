package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Utf8;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends x60 {

    /* renamed from: c */
    public static final Logger f25086c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d */
    public static final boolean f25087d = q47.m50236I();

    /* renamed from: a */
    public C4727i f25088a;

    /* renamed from: b */
    public boolean f25089b;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        public OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.CodedOutputStream$b */
    public static class C4678b extends CodedOutputStream {

        /* renamed from: e */
        public final byte[] f25090e;

        /* renamed from: f */
        public final int f25091f;

        /* renamed from: g */
        public final int f25092g;

        /* renamed from: h */
        public int f25093h;

        public C4678b(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f25090e = bArr;
                    this.f25091f = i;
                    this.f25093h = i;
                    this.f25092g = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: B0 */
        public final void mo35382B0(int i, C4705c0 c0Var, C4731j0 j0Var) throws IOException {
            mo35394N0(i, 2);
            mo35396P0(((C4699a) c0Var).mo35601c(j0Var));
            j0Var.mo35730j(c0Var, this.f25088a);
        }

        /* renamed from: C0 */
        public final void mo35383C0(int i, C4705c0 c0Var) throws IOException {
            mo35394N0(1, 3);
            mo35395O0(2, i);
            mo35426V0(3, c0Var);
            mo35394N0(1, 4);
        }

        /* renamed from: D0 */
        public final void mo35384D0(int i, ByteString byteString) throws IOException {
            mo35394N0(1, 3);
            mo35395O0(2, i);
            mo35407k0(3, byteString);
            mo35394N0(1, 4);
        }

        /* renamed from: M0 */
        public final void mo35393M0(int i, String str) throws IOException {
            mo35394N0(i, 2);
            mo35428X0(str);
        }

        /* renamed from: N0 */
        public final void mo35394N0(int i, int i2) throws IOException {
            mo35396P0(WireFormat.m37461c(i, i2));
        }

        /* renamed from: O0 */
        public final void mo35395O0(int i, int i2) throws IOException {
            mo35394N0(i, 0);
            mo35396P0(i2);
        }

        /* renamed from: P0 */
        public final void mo35396P0(int i) throws IOException {
            if (!CodedOutputStream.f25087d || C3894bh.m32522c() || mo35403g0() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f25090e;
                    int i2 = this.f25093h;
                    this.f25093h = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f25090e;
                    int i3 = this.f25093h;
                    this.f25093h = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25093h), Integer.valueOf(this.f25092g), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f25090e;
                int i4 = this.f25093h;
                this.f25093h = i4 + 1;
                q47.m50243P(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f25090e;
                int i5 = this.f25093h;
                this.f25093h = i5 + 1;
                q47.m50243P(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f25090e;
                    int i7 = this.f25093h;
                    this.f25093h = i7 + 1;
                    q47.m50243P(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f25090e;
                int i8 = this.f25093h;
                this.f25093h = i8 + 1;
                q47.m50243P(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f25090e;
                    int i10 = this.f25093h;
                    this.f25093h = i10 + 1;
                    q47.m50243P(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f25090e;
                int i11 = this.f25093h;
                this.f25093h = i11 + 1;
                q47.m50243P(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f25090e;
                    int i13 = this.f25093h;
                    this.f25093h = i13 + 1;
                    q47.m50243P(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f25090e;
                int i14 = this.f25093h;
                this.f25093h = i14 + 1;
                q47.m50243P(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f25090e;
                int i15 = this.f25093h;
                this.f25093h = i15 + 1;
                q47.m50243P(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: Q0 */
        public final void mo35397Q0(int i, long j) throws IOException {
            mo35394N0(i, 0);
            mo35398R0(j);
        }

        /* renamed from: R0 */
        public final void mo35398R0(long j) throws IOException {
            if (!CodedOutputStream.f25087d || mo35403g0() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f25090e;
                    int i = this.f25093h;
                    this.f25093h = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f25090e;
                    int i2 = this.f25093h;
                    this.f25093h = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25093h), Integer.valueOf(this.f25092g), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f25090e;
                    int i3 = this.f25093h;
                    this.f25093h = i3 + 1;
                    q47.m50243P(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f25090e;
                int i4 = this.f25093h;
                this.f25093h = i4 + 1;
                q47.m50243P(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: S0 */
        public final void mo35423S0(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f25090e, this.f25093h, remaining);
                this.f25093h += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25093h), Integer.valueOf(this.f25092g), Integer.valueOf(remaining)}), e);
            }
        }

        /* renamed from: T0 */
        public final void mo35424T0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f25090e, this.f25093h, i2);
                this.f25093h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25093h), Integer.valueOf(this.f25092g), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: U0 */
        public final void mo35425U0(ByteString byteString) throws IOException {
            mo35396P0(byteString.size());
            byteString.writeTo((x60) this);
        }

        /* renamed from: V0 */
        public final void mo35426V0(int i, C4705c0 c0Var) throws IOException {
            mo35394N0(i, 2);
            mo35427W0(c0Var);
        }

        /* renamed from: W0 */
        public final void mo35427W0(C4705c0 c0Var) throws IOException {
            mo35396P0(c0Var.getSerializedSize());
            c0Var.mo35441a(this);
        }

        /* renamed from: X0 */
        public final void mo35428X0(String str) throws IOException {
            int i = this.f25093h;
            try {
                int X = CodedOutputStream.m37214X(str.length() * 3);
                int X2 = CodedOutputStream.m37214X(str.length());
                if (X2 == X) {
                    int i2 = i + X2;
                    this.f25093h = i2;
                    int i3 = Utf8.m37396i(str, this.f25090e, i2, mo35403g0());
                    this.f25093h = i;
                    mo35396P0((i3 - i) - X2);
                    this.f25093h = i3;
                    return;
                }
                mo35396P0(Utf8.m37397j(str));
                this.f25093h = Utf8.m37396i(str, this.f25090e, this.f25093h, mo35403g0());
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f25093h = i;
                mo35400c0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo35429a(ByteBuffer byteBuffer) throws IOException {
            mo35423S0(byteBuffer);
        }

        /* renamed from: b */
        public final void mo35399b(byte[] bArr, int i, int i2) throws IOException {
            mo35424T0(bArr, i, i2);
        }

        /* renamed from: g0 */
        public final int mo35403g0() {
            return this.f25092g - this.f25093h;
        }

        /* renamed from: h0 */
        public final void mo35404h0(byte b) throws IOException {
            try {
                byte[] bArr = this.f25090e;
                int i = this.f25093h;
                this.f25093h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25093h), Integer.valueOf(this.f25092g), 1}), e);
            }
        }

        /* renamed from: i0 */
        public final void mo35405i0(int i, boolean z) throws IOException {
            mo35394N0(i, 0);
            mo35404h0(z ? (byte) 1 : 0);
        }

        /* renamed from: k0 */
        public final void mo35407k0(int i, ByteString byteString) throws IOException {
            mo35394N0(i, 2);
            mo35425U0(byteString);
        }

        /* renamed from: p0 */
        public final void mo35412p0(int i, int i2) throws IOException {
            mo35394N0(i, 5);
            mo35413q0(i2);
        }

        /* renamed from: q0 */
        public final void mo35413q0(int i) throws IOException {
            try {
                byte[] bArr = this.f25090e;
                int i2 = this.f25093h;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f25093h = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25093h), Integer.valueOf(this.f25092g), 1}), e);
            }
        }

        /* renamed from: r0 */
        public final void mo35414r0(int i, long j) throws IOException {
            mo35394N0(i, 1);
            mo35415s0(j);
        }

        /* renamed from: s0 */
        public final void mo35415s0(long j) throws IOException {
            try {
                byte[] bArr = this.f25090e;
                int i = this.f25093h;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f25093h = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25093h), Integer.valueOf(this.f25092g), 1}), e);
            }
        }

        /* renamed from: x0 */
        public final void mo35420x0(int i, int i2) throws IOException {
            mo35394N0(i, 0);
            mo35421y0(i2);
        }

        /* renamed from: y0 */
        public final void mo35421y0(int i) throws IOException {
            if (i >= 0) {
                mo35396P0(i);
            } else {
                mo35398R0((long) i);
            }
        }
    }

    /* renamed from: A */
    public static int m37191A(int i, C4772v vVar) {
        return (m37212V(1) * 2) + m37213W(2, i) + m37192B(3, vVar);
    }

    /* renamed from: B */
    public static int m37192B(int i, C4772v vVar) {
        return m37212V(i) + m37193C(vVar);
    }

    /* renamed from: C */
    public static int m37193C(C4772v vVar) {
        return m37194D(vVar.mo36054b());
    }

    /* renamed from: D */
    public static int m37194D(int i) {
        return m37214X(i) + i;
    }

    /* renamed from: E */
    public static int m37195E(int i, C4705c0 c0Var) {
        return (m37212V(1) * 2) + m37213W(2, i) + m37196F(3, c0Var);
    }

    /* renamed from: F */
    public static int m37196F(int i, C4705c0 c0Var) {
        return m37212V(i) + m37198H(c0Var);
    }

    /* renamed from: G */
    public static int m37197G(int i, C4705c0 c0Var, C4731j0 j0Var) {
        return m37212V(i) + m37199I(c0Var, j0Var);
    }

    /* renamed from: H */
    public static int m37198H(C4705c0 c0Var) {
        return m37194D(c0Var.getSerializedSize());
    }

    /* renamed from: I */
    public static int m37199I(C4705c0 c0Var, C4731j0 j0Var) {
        return m37194D(((C4699a) c0Var).mo35601c(j0Var));
    }

    /* renamed from: J */
    public static int m37200J(int i, ByteString byteString) {
        return (m37212V(1) * 2) + m37213W(2, i) + m37225h(3, byteString);
    }

    @Deprecated
    /* renamed from: K */
    public static int m37201K(int i) {
        return m37214X(i);
    }

    /* renamed from: L */
    public static int m37202L(int i, int i2) {
        return m37212V(i) + m37203M(i2);
    }

    /* renamed from: M */
    public static int m37203M(int i) {
        return 4;
    }

    /* renamed from: N */
    public static int m37204N(int i, long j) {
        return m37212V(i) + m37205O(j);
    }

    /* renamed from: O */
    public static int m37205O(long j) {
        return 8;
    }

    /* renamed from: P */
    public static int m37206P(int i, int i2) {
        return m37212V(i) + m37207Q(i2);
    }

    /* renamed from: Q */
    public static int m37207Q(int i) {
        return m37214X(m37217a0(i));
    }

    /* renamed from: R */
    public static int m37208R(int i, long j) {
        return m37212V(i) + m37209S(j);
    }

    /* renamed from: S */
    public static int m37209S(long j) {
        return m37216Z(m37218b0(j));
    }

    /* renamed from: T */
    public static int m37210T(int i, String str) {
        return m37212V(i) + m37211U(str);
    }

    /* renamed from: U */
    public static int m37211U(String str) {
        int i;
        try {
            i = Utf8.m37397j(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            i = str.getBytes(C4758t.f25292b).length;
        }
        return m37194D(i);
    }

    /* renamed from: V */
    public static int m37212V(int i) {
        return m37214X(WireFormat.m37461c(i, 0));
    }

    /* renamed from: W */
    public static int m37213W(int i, int i2) {
        return m37212V(i) + m37214X(i2);
    }

    /* renamed from: X */
    public static int m37214X(int i) {
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

    /* renamed from: Y */
    public static int m37215Y(int i, long j) {
        return m37212V(i) + m37216Z(j);
    }

    /* renamed from: Z */
    public static int m37216Z(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: a0 */
    public static int m37217a0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: b0 */
    public static long m37218b0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: e */
    public static int m37220e(int i, boolean z) {
        return m37212V(i) + m37222f(z);
    }

    /* renamed from: e0 */
    public static CodedOutputStream m37221e0(byte[] bArr) {
        return m37223f0(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public static int m37222f(boolean z) {
        return 1;
    }

    /* renamed from: f0 */
    public static CodedOutputStream m37223f0(byte[] bArr, int i, int i2) {
        return new C4678b(bArr, i, i2);
    }

    /* renamed from: g */
    public static int m37224g(byte[] bArr) {
        return m37194D(bArr.length);
    }

    /* renamed from: h */
    public static int m37225h(int i, ByteString byteString) {
        return m37212V(i) + m37226i(byteString);
    }

    /* renamed from: i */
    public static int m37226i(ByteString byteString) {
        return m37194D(byteString.size());
    }

    /* renamed from: j */
    public static int m37227j(int i, double d) {
        return m37212V(i) + m37228k(d);
    }

    /* renamed from: k */
    public static int m37228k(double d) {
        return 8;
    }

    /* renamed from: l */
    public static int m37229l(int i, int i2) {
        return m37212V(i) + m37230m(i2);
    }

    /* renamed from: m */
    public static int m37230m(int i) {
        return m37241x(i);
    }

    /* renamed from: n */
    public static int m37231n(int i, int i2) {
        return m37212V(i) + m37232o(i2);
    }

    /* renamed from: o */
    public static int m37232o(int i) {
        return 4;
    }

    /* renamed from: p */
    public static int m37233p(int i, long j) {
        return m37212V(i) + m37234q(j);
    }

    /* renamed from: q */
    public static int m37234q(long j) {
        return 8;
    }

    /* renamed from: r */
    public static int m37235r(int i, float f) {
        return m37212V(i) + m37236s(f);
    }

    /* renamed from: s */
    public static int m37236s(float f) {
        return 4;
    }

    @Deprecated
    /* renamed from: t */
    public static int m37237t(int i, C4705c0 c0Var, C4731j0 j0Var) {
        return (m37212V(i) * 2) + m37239v(c0Var, j0Var);
    }

    @Deprecated
    /* renamed from: u */
    public static int m37238u(C4705c0 c0Var) {
        return c0Var.getSerializedSize();
    }

    @Deprecated
    /* renamed from: v */
    public static int m37239v(C4705c0 c0Var, C4731j0 j0Var) {
        return ((C4699a) c0Var).mo35601c(j0Var);
    }

    /* renamed from: w */
    public static int m37240w(int i, int i2) {
        return m37212V(i) + m37241x(i2);
    }

    /* renamed from: x */
    public static int m37241x(int i) {
        if (i >= 0) {
            return m37214X(i);
        }
        return 10;
    }

    /* renamed from: y */
    public static int m37242y(int i, long j) {
        return m37212V(i) + m37243z(j);
    }

    /* renamed from: z */
    public static int m37243z(long j) {
        return m37216Z(j);
    }

    /* renamed from: A0 */
    public final void mo35381A0(long j) throws IOException {
        mo35398R0(j);
    }

    /* renamed from: B0 */
    public abstract void mo35382B0(int i, C4705c0 c0Var, C4731j0 j0Var) throws IOException;

    /* renamed from: C0 */
    public abstract void mo35383C0(int i, C4705c0 c0Var) throws IOException;

    /* renamed from: D0 */
    public abstract void mo35384D0(int i, ByteString byteString) throws IOException;

    /* renamed from: E0 */
    public final void mo35385E0(int i, int i2) throws IOException {
        mo35412p0(i, i2);
    }

    /* renamed from: F0 */
    public final void mo35386F0(int i) throws IOException {
        mo35413q0(i);
    }

    /* renamed from: G0 */
    public final void mo35387G0(int i, long j) throws IOException {
        mo35414r0(i, j);
    }

    /* renamed from: H0 */
    public final void mo35388H0(long j) throws IOException {
        mo35415s0(j);
    }

    /* renamed from: I0 */
    public final void mo35389I0(int i, int i2) throws IOException {
        mo35395O0(i, m37217a0(i2));
    }

    /* renamed from: J0 */
    public final void mo35390J0(int i) throws IOException {
        mo35396P0(m37217a0(i));
    }

    /* renamed from: K0 */
    public final void mo35391K0(int i, long j) throws IOException {
        mo35397Q0(i, m37218b0(j));
    }

    /* renamed from: L0 */
    public final void mo35392L0(long j) throws IOException {
        mo35398R0(m37218b0(j));
    }

    /* renamed from: M0 */
    public abstract void mo35393M0(int i, String str) throws IOException;

    /* renamed from: N0 */
    public abstract void mo35394N0(int i, int i2) throws IOException;

    /* renamed from: O0 */
    public abstract void mo35395O0(int i, int i2) throws IOException;

    /* renamed from: P0 */
    public abstract void mo35396P0(int i) throws IOException;

    /* renamed from: Q0 */
    public abstract void mo35397Q0(int i, long j) throws IOException;

    /* renamed from: R0 */
    public abstract void mo35398R0(long j) throws IOException;

    /* renamed from: b */
    public abstract void mo35399b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c0 */
    public final void mo35400c0(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        f25086c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", unpairedSurrogateException);
        byte[] bytes = str.getBytes(C4758t.f25292b);
        try {
            mo35396P0(bytes.length);
            mo35399b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException((Throwable) e);
        } catch (OutOfSpaceException e2) {
            throw e2;
        }
    }

    /* renamed from: d */
    public final void mo35401d() {
        if (mo35403g0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: d0 */
    public boolean mo35402d0() {
        return this.f25089b;
    }

    /* renamed from: g0 */
    public abstract int mo35403g0();

    /* renamed from: h0 */
    public abstract void mo35404h0(byte b) throws IOException;

    /* renamed from: i0 */
    public abstract void mo35405i0(int i, boolean z) throws IOException;

    /* renamed from: j0 */
    public final void mo35406j0(boolean z) throws IOException {
        mo35404h0(z ? (byte) 1 : 0);
    }

    /* renamed from: k0 */
    public abstract void mo35407k0(int i, ByteString byteString) throws IOException;

    /* renamed from: l0 */
    public final void mo35408l0(int i, double d) throws IOException {
        mo35414r0(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: m0 */
    public final void mo35409m0(double d) throws IOException {
        mo35415s0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: n0 */
    public final void mo35410n0(int i, int i2) throws IOException {
        mo35420x0(i, i2);
    }

    /* renamed from: o0 */
    public final void mo35411o0(int i) throws IOException {
        mo35421y0(i);
    }

    /* renamed from: p0 */
    public abstract void mo35412p0(int i, int i2) throws IOException;

    /* renamed from: q0 */
    public abstract void mo35413q0(int i) throws IOException;

    /* renamed from: r0 */
    public abstract void mo35414r0(int i, long j) throws IOException;

    /* renamed from: s0 */
    public abstract void mo35415s0(long j) throws IOException;

    /* renamed from: t0 */
    public final void mo35416t0(int i, float f) throws IOException {
        mo35412p0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: u0 */
    public final void mo35417u0(float f) throws IOException {
        mo35413q0(Float.floatToRawIntBits(f));
    }

    @Deprecated
    /* renamed from: v0 */
    public final void mo35418v0(int i, C4705c0 c0Var, C4731j0 j0Var) throws IOException {
        mo35394N0(i, 3);
        mo35419w0(c0Var, j0Var);
        mo35394N0(i, 4);
    }

    @Deprecated
    /* renamed from: w0 */
    public final void mo35419w0(C4705c0 c0Var, C4731j0 j0Var) throws IOException {
        j0Var.mo35730j(c0Var, this.f25088a);
    }

    /* renamed from: x0 */
    public abstract void mo35420x0(int i, int i2) throws IOException;

    /* renamed from: y0 */
    public abstract void mo35421y0(int i) throws IOException;

    /* renamed from: z0 */
    public final void mo35422z0(int i, long j) throws IOException {
        mo35397Q0(i, j);
    }

    public CodedOutputStream() {
    }
}

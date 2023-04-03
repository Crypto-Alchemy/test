package com.google.protobuf;

import com.google.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends w60 {

    /* renamed from: c */
    public static final Logger f25533c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d */
    public static final boolean f25534d = p47.m49689I();

    /* renamed from: a */
    public C4980i f25535a;

    /* renamed from: b */
    public boolean f25536b;

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

    /* renamed from: com.google.protobuf.CodedOutputStream$b */
    public static abstract class C4926b extends CodedOutputStream {

        /* renamed from: e */
        public final byte[] f25537e;

        /* renamed from: f */
        public final int f25538f;

        /* renamed from: g */
        public int f25539g;

        /* renamed from: h */
        public int f25540h;

        public C4926b(int i) {
            super();
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.f25537e = bArr;
                this.f25538f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* renamed from: b1 */
        public final void mo36849b1(byte b) {
            byte[] bArr = this.f25537e;
            int i = this.f25539g;
            this.f25539g = i + 1;
            bArr[i] = b;
            this.f25540h++;
        }

        /* renamed from: c1 */
        public final void mo36850c1(int i) {
            byte[] bArr = this.f25537e;
            int i2 = this.f25539g;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f25539g = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f25540h += 4;
        }

        /* renamed from: d1 */
        public final void mo36851d1(long j) {
            byte[] bArr = this.f25537e;
            int i = this.f25539g;
            int i2 = i + 1;
            bArr[i] = (byte) ((int) (j & 255));
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((int) (255 & (j >> 24)));
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f25539g = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f25540h += 8;
        }

        /* renamed from: e1 */
        public final void mo36852e1(int i) {
            if (i >= 0) {
                mo36854g1(i);
            } else {
                mo36855h1((long) i);
            }
        }

        /* renamed from: f1 */
        public final void mo36853f1(int i, int i2) {
            mo36854g1(WireFormat.m39052c(i, i2));
        }

        /* renamed from: g1 */
        public final void mo36854g1(int i) {
            if (CodedOutputStream.f25534d) {
                long j = (long) this.f25539g;
                while ((i & -128) != 0) {
                    byte[] bArr = this.f25537e;
                    int i2 = this.f25539g;
                    this.f25539g = i2 + 1;
                    p47.m49696P(bArr, (long) i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f25537e;
                int i3 = this.f25539g;
                this.f25539g = i3 + 1;
                p47.m49696P(bArr2, (long) i3, (byte) i);
                this.f25540h += (int) (((long) this.f25539g) - j);
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr3 = this.f25537e;
                int i4 = this.f25539g;
                this.f25539g = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.f25540h++;
                i >>>= 7;
            }
            byte[] bArr4 = this.f25537e;
            int i5 = this.f25539g;
            this.f25539g = i5 + 1;
            bArr4[i5] = (byte) i;
            this.f25540h++;
        }

        /* renamed from: h1 */
        public final void mo36855h1(long j) {
            if (CodedOutputStream.f25534d) {
                long j2 = (long) this.f25539g;
                while ((j & -128) != 0) {
                    byte[] bArr = this.f25537e;
                    int i = this.f25539g;
                    this.f25539g = i + 1;
                    p47.m49696P(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f25537e;
                int i2 = this.f25539g;
                this.f25539g = i2 + 1;
                p47.m49696P(bArr2, (long) i2, (byte) ((int) j));
                this.f25540h += (int) (((long) this.f25539g) - j2);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f25537e;
                int i3 = this.f25539g;
                this.f25539g = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.f25540h++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f25537e;
            int i4 = this.f25539g;
            this.f25539g = i4 + 1;
            bArr4[i4] = (byte) ((int) j);
            this.f25540h++;
        }

        /* renamed from: i0 */
        public final int mo36831i0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$c */
    public static class C4927c extends CodedOutputStream {

        /* renamed from: e */
        public final byte[] f25541e;

        /* renamed from: f */
        public final int f25542f;

        /* renamed from: g */
        public final int f25543g;

        /* renamed from: h */
        public int f25544h;

        public C4927c(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f25541e = bArr;
                    this.f25542f = i;
                    this.f25544h = i;
                    this.f25543g = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: E0 */
        public final void mo36803E0(int i, int i2) throws IOException {
            mo36821W0(i, 0);
            mo36804F0(i2);
        }

        /* renamed from: F0 */
        public final void mo36804F0(int i) throws IOException {
            if (i >= 0) {
                mo36823Y0(i);
            } else {
                mo36825a1((long) i);
            }
        }

        /* renamed from: I0 */
        public final void mo36807I0(int i, C4956c0 c0Var, C4984j0 j0Var) throws IOException {
            mo36821W0(i, 2);
            mo36823Y0(((C4949a) c0Var).getSerializedSize(j0Var));
            j0Var.mo37183h(c0Var, this.f25535a);
        }

        /* renamed from: J0 */
        public final void mo36808J0(C4956c0 c0Var) throws IOException {
            mo36823Y0(c0Var.getSerializedSize());
            c0Var.writeTo(this);
        }

        /* renamed from: K0 */
        public final void mo36809K0(int i, C4956c0 c0Var) throws IOException {
            mo36821W0(1, 3);
            mo36822X0(2, i);
            mo36859d1(3, c0Var);
            mo36821W0(1, 4);
        }

        /* renamed from: L0 */
        public final void mo36810L0(int i, ByteString byteString) throws IOException {
            mo36821W0(1, 3);
            mo36822X0(2, i);
            mo36837o0(3, byteString);
            mo36821W0(1, 4);
        }

        /* renamed from: U0 */
        public final void mo36819U0(int i, String str) throws IOException {
            mo36821W0(i, 2);
            mo36820V0(str);
        }

        /* renamed from: V0 */
        public final void mo36820V0(String str) throws IOException {
            int i = this.f25544h;
            try {
                int X = CodedOutputStream.m38788X(str.length() * 3);
                int X2 = CodedOutputStream.m38788X(str.length());
                if (X2 == X) {
                    int i2 = i + X2;
                    this.f25544h = i2;
                    int i3 = Utf8.m38987i(str, this.f25541e, i2, mo36831i0());
                    this.f25544h = i;
                    mo36823Y0((i3 - i) - X2);
                    this.f25544h = i3;
                    return;
                }
                mo36823Y0(Utf8.m38988j(str));
                this.f25544h = Utf8.m38987i(str, this.f25541e, this.f25544h, mo36831i0());
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f25544h = i;
                mo36829d0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        /* renamed from: W0 */
        public final void mo36821W0(int i, int i2) throws IOException {
            mo36823Y0(WireFormat.m39052c(i, i2));
        }

        /* renamed from: X0 */
        public final void mo36822X0(int i, int i2) throws IOException {
            mo36821W0(i, 0);
            mo36823Y0(i2);
        }

        /* renamed from: Y0 */
        public final void mo36823Y0(int i) throws IOException {
            while ((i & -128) != 0) {
                byte[] bArr = this.f25541e;
                int i2 = this.f25544h;
                this.f25544h = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            try {
                byte[] bArr2 = this.f25541e;
                int i3 = this.f25544h;
                this.f25544h = i3 + 1;
                bArr2[i3] = (byte) i;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25544h), Integer.valueOf(this.f25543g), 1}), e);
            }
        }

        /* renamed from: Z0 */
        public final void mo36824Z0(int i, long j) throws IOException {
            mo36821W0(i, 0);
            mo36825a1(j);
        }

        /* renamed from: a */
        public final void mo36856a(ByteBuffer byteBuffer) throws IOException {
            mo36857b1(byteBuffer);
        }

        /* renamed from: a1 */
        public final void mo36825a1(long j) throws IOException {
            if (!CodedOutputStream.f25534d || mo36831i0() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f25541e;
                    int i = this.f25544h;
                    this.f25544h = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f25541e;
                    int i2 = this.f25544h;
                    this.f25544h = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25544h), Integer.valueOf(this.f25543g), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f25541e;
                    int i3 = this.f25544h;
                    this.f25544h = i3 + 1;
                    p47.m49696P(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f25541e;
                int i4 = this.f25544h;
                this.f25544h = i4 + 1;
                p47.m49696P(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: b */
        public final void mo36826b(byte[] bArr, int i, int i2) throws IOException {
            mo36858c1(bArr, i, i2);
        }

        /* renamed from: b1 */
        public final void mo36857b1(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f25541e, this.f25544h, remaining);
                this.f25544h += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25544h), Integer.valueOf(this.f25543g), Integer.valueOf(remaining)}), e);
            }
        }

        /* renamed from: c0 */
        public void mo36827c0() {
        }

        /* renamed from: c1 */
        public final void mo36858c1(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f25541e, this.f25544h, i2);
                this.f25544h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25544h), Integer.valueOf(this.f25543g), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: d1 */
        public final void mo36859d1(int i, C4956c0 c0Var) throws IOException {
            mo36821W0(i, 2);
            mo36808J0(c0Var);
        }

        /* renamed from: i0 */
        public final int mo36831i0() {
            return this.f25543g - this.f25544h;
        }

        /* renamed from: j0 */
        public final void mo36832j0(byte b) throws IOException {
            try {
                byte[] bArr = this.f25541e;
                int i = this.f25544h;
                this.f25544h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25544h), Integer.valueOf(this.f25543g), 1}), e);
            }
        }

        /* renamed from: k0 */
        public final void mo36833k0(int i, boolean z) throws IOException {
            mo36821W0(i, 0);
            mo36832j0(z ? (byte) 1 : 0);
        }

        /* renamed from: n0 */
        public final void mo36836n0(byte[] bArr, int i, int i2) throws IOException {
            mo36823Y0(i2);
            mo36858c1(bArr, i, i2);
        }

        /* renamed from: o0 */
        public final void mo36837o0(int i, ByteString byteString) throws IOException {
            mo36821W0(i, 2);
            mo36838p0(byteString);
        }

        /* renamed from: p0 */
        public final void mo36838p0(ByteString byteString) throws IOException {
            mo36823Y0(byteString.size());
            byteString.writeTo((w60) this);
        }

        /* renamed from: u0 */
        public final void mo36843u0(int i, int i2) throws IOException {
            mo36821W0(i, 5);
            mo36844v0(i2);
        }

        /* renamed from: v0 */
        public final void mo36844v0(int i) throws IOException {
            try {
                byte[] bArr = this.f25541e;
                int i2 = this.f25544h;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f25544h = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25544h), Integer.valueOf(this.f25543g), 1}), e);
            }
        }

        /* renamed from: w0 */
        public final void mo36845w0(int i, long j) throws IOException {
            mo36821W0(i, 1);
            mo36846x0(j);
        }

        /* renamed from: x0 */
        public final void mo36846x0(long j) throws IOException {
            try {
                byte[] bArr = this.f25541e;
                int i = this.f25544h;
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
                this.f25544h = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25544h), Integer.valueOf(this.f25543g), 1}), e);
            }
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$d */
    public static final class C4928d extends C4926b {

        /* renamed from: i */
        public final OutputStream f25545i;

        public C4928d(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.f25545i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        /* renamed from: E0 */
        public void mo36803E0(int i, int i2) throws IOException {
            mo36861j1(20);
            mo36853f1(i, 0);
            mo36852e1(i2);
        }

        /* renamed from: F0 */
        public void mo36804F0(int i) throws IOException {
            if (i >= 0) {
                mo36823Y0(i);
            } else {
                mo36825a1((long) i);
            }
        }

        /* renamed from: I0 */
        public void mo36807I0(int i, C4956c0 c0Var, C4984j0 j0Var) throws IOException {
            mo36821W0(i, 2);
            mo36865n1(c0Var, j0Var);
        }

        /* renamed from: J0 */
        public void mo36808J0(C4956c0 c0Var) throws IOException {
            mo36823Y0(c0Var.getSerializedSize());
            c0Var.writeTo(this);
        }

        /* renamed from: K0 */
        public void mo36809K0(int i, C4956c0 c0Var) throws IOException {
            mo36821W0(1, 3);
            mo36822X0(2, i);
            mo36864m1(3, c0Var);
            mo36821W0(1, 4);
        }

        /* renamed from: L0 */
        public void mo36810L0(int i, ByteString byteString) throws IOException {
            mo36821W0(1, 3);
            mo36822X0(2, i);
            mo36837o0(3, byteString);
            mo36821W0(1, 4);
        }

        /* renamed from: U0 */
        public void mo36819U0(int i, String str) throws IOException {
            mo36821W0(i, 2);
            mo36820V0(str);
        }

        /* renamed from: V0 */
        public void mo36820V0(String str) throws IOException {
            int i;
            int i2;
            try {
                int length = str.length() * 3;
                int X = CodedOutputStream.m38788X(length);
                int i3 = X + length;
                int i4 = this.f25538f;
                if (i3 > i4) {
                    byte[] bArr = new byte[length];
                    int i5 = Utf8.m38987i(str, bArr, 0, length);
                    mo36823Y0(i5);
                    mo36826b(bArr, 0, i5);
                    return;
                }
                if (i3 > i4 - this.f25539g) {
                    mo36860i1();
                }
                int X2 = CodedOutputStream.m38788X(str.length());
                i = this.f25539g;
                if (X2 == X) {
                    int i6 = i + X2;
                    this.f25539g = i6;
                    int i7 = Utf8.m38987i(str, this.f25537e, i6, this.f25538f - i6);
                    this.f25539g = i;
                    i2 = (i7 - i) - X2;
                    mo36854g1(i2);
                    this.f25539g = i7;
                } else {
                    i2 = Utf8.m38988j(str);
                    mo36854g1(i2);
                    this.f25539g = Utf8.m38987i(str, this.f25537e, this.f25539g, i2);
                }
                this.f25540h += i2;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f25540h -= this.f25539g - i;
                this.f25539g = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            } catch (Utf8.UnpairedSurrogateException e3) {
                mo36829d0(str, e3);
            }
        }

        /* renamed from: W0 */
        public void mo36821W0(int i, int i2) throws IOException {
            mo36823Y0(WireFormat.m39052c(i, i2));
        }

        /* renamed from: X0 */
        public void mo36822X0(int i, int i2) throws IOException {
            mo36861j1(20);
            mo36853f1(i, 0);
            mo36854g1(i2);
        }

        /* renamed from: Y0 */
        public void mo36823Y0(int i) throws IOException {
            mo36861j1(5);
            mo36854g1(i);
        }

        /* renamed from: Z0 */
        public void mo36824Z0(int i, long j) throws IOException {
            mo36861j1(20);
            mo36853f1(i, 0);
            mo36855h1(j);
        }

        /* renamed from: a */
        public void mo36856a(ByteBuffer byteBuffer) throws IOException {
            mo36862k1(byteBuffer);
        }

        /* renamed from: a1 */
        public void mo36825a1(long j) throws IOException {
            mo36861j1(10);
            mo36855h1(j);
        }

        /* renamed from: b */
        public void mo36826b(byte[] bArr, int i, int i2) throws IOException {
            mo36863l1(bArr, i, i2);
        }

        /* renamed from: c0 */
        public void mo36827c0() throws IOException {
            if (this.f25539g > 0) {
                mo36860i1();
            }
        }

        /* renamed from: i1 */
        public final void mo36860i1() throws IOException {
            this.f25545i.write(this.f25537e, 0, this.f25539g);
            this.f25539g = 0;
        }

        /* renamed from: j0 */
        public void mo36832j0(byte b) throws IOException {
            if (this.f25539g == this.f25538f) {
                mo36860i1();
            }
            mo36849b1(b);
        }

        /* renamed from: j1 */
        public final void mo36861j1(int i) throws IOException {
            if (this.f25538f - this.f25539g < i) {
                mo36860i1();
            }
        }

        /* renamed from: k0 */
        public void mo36833k0(int i, boolean z) throws IOException {
            mo36861j1(11);
            mo36853f1(i, 0);
            mo36849b1(z ? (byte) 1 : 0);
        }

        /* renamed from: k1 */
        public void mo36862k1(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            int i = this.f25538f;
            int i2 = this.f25539g;
            if (i - i2 >= remaining) {
                byteBuffer.get(this.f25537e, i2, remaining);
                this.f25539g += remaining;
                this.f25540h += remaining;
                return;
            }
            int i3 = i - i2;
            byteBuffer.get(this.f25537e, i2, i3);
            int i4 = remaining - i3;
            this.f25539g = this.f25538f;
            this.f25540h += i3;
            mo36860i1();
            while (true) {
                int i5 = this.f25538f;
                if (i4 > i5) {
                    byteBuffer.get(this.f25537e, 0, i5);
                    this.f25545i.write(this.f25537e, 0, this.f25538f);
                    int i6 = this.f25538f;
                    i4 -= i6;
                    this.f25540h += i6;
                } else {
                    byteBuffer.get(this.f25537e, 0, i4);
                    this.f25539g = i4;
                    this.f25540h += i4;
                    return;
                }
            }
        }

        /* renamed from: l1 */
        public void mo36863l1(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f25538f;
            int i4 = this.f25539g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.f25537e, i4, i2);
                this.f25539g += i2;
                this.f25540h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.f25537e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f25539g = this.f25538f;
            this.f25540h += i5;
            mo36860i1();
            if (i7 <= this.f25538f) {
                System.arraycopy(bArr, i6, this.f25537e, 0, i7);
                this.f25539g = i7;
            } else {
                this.f25545i.write(bArr, i6, i7);
            }
            this.f25540h += i7;
        }

        /* renamed from: m1 */
        public void mo36864m1(int i, C4956c0 c0Var) throws IOException {
            mo36821W0(i, 2);
            mo36808J0(c0Var);
        }

        /* renamed from: n0 */
        public void mo36836n0(byte[] bArr, int i, int i2) throws IOException {
            mo36823Y0(i2);
            mo36863l1(bArr, i, i2);
        }

        /* renamed from: n1 */
        public void mo36865n1(C4956c0 c0Var, C4984j0 j0Var) throws IOException {
            mo36823Y0(((C4949a) c0Var).getSerializedSize(j0Var));
            j0Var.mo37183h(c0Var, this.f25535a);
        }

        /* renamed from: o0 */
        public void mo36837o0(int i, ByteString byteString) throws IOException {
            mo36821W0(i, 2);
            mo36838p0(byteString);
        }

        /* renamed from: p0 */
        public void mo36838p0(ByteString byteString) throws IOException {
            mo36823Y0(byteString.size());
            byteString.writeTo((w60) this);
        }

        /* renamed from: u0 */
        public void mo36843u0(int i, int i2) throws IOException {
            mo36861j1(14);
            mo36853f1(i, 5);
            mo36850c1(i2);
        }

        /* renamed from: v0 */
        public void mo36844v0(int i) throws IOException {
            mo36861j1(4);
            mo36850c1(i);
        }

        /* renamed from: w0 */
        public void mo36845w0(int i, long j) throws IOException {
            mo36861j1(18);
            mo36853f1(i, 1);
            mo36851d1(j);
        }

        /* renamed from: x0 */
        public void mo36846x0(long j) throws IOException {
            mo36861j1(8);
            mo36851d1(j);
        }
    }

    /* renamed from: A */
    public static int m38765A(int i, C5025v vVar) {
        return (m38786V(1) * 2) + m38787W(2, i) + m38766B(3, vVar);
    }

    /* renamed from: B */
    public static int m38766B(int i, C5025v vVar) {
        return m38786V(i) + m38767C(vVar);
    }

    /* renamed from: C */
    public static int m38767C(C5025v vVar) {
        return m38768D(vVar.mo37540b());
    }

    /* renamed from: D */
    public static int m38768D(int i) {
        return m38788X(i) + i;
    }

    /* renamed from: E */
    public static int m38769E(int i, C4956c0 c0Var) {
        return (m38786V(1) * 2) + m38787W(2, i) + m38770F(3, c0Var);
    }

    /* renamed from: F */
    public static int m38770F(int i, C4956c0 c0Var) {
        return m38786V(i) + m38772H(c0Var);
    }

    /* renamed from: G */
    public static int m38771G(int i, C4956c0 c0Var, C4984j0 j0Var) {
        return m38786V(i) + m38773I(c0Var, j0Var);
    }

    /* renamed from: H */
    public static int m38772H(C4956c0 c0Var) {
        return m38768D(c0Var.getSerializedSize());
    }

    /* renamed from: I */
    public static int m38773I(C4956c0 c0Var, C4984j0 j0Var) {
        return m38768D(((C4949a) c0Var).getSerializedSize(j0Var));
    }

    /* renamed from: J */
    public static int m38774J(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: K */
    public static int m38775K(int i, ByteString byteString) {
        return (m38786V(1) * 2) + m38787W(2, i) + m38799h(3, byteString);
    }

    /* renamed from: L */
    public static int m38776L(int i, int i2) {
        return m38786V(i) + m38777M(i2);
    }

    /* renamed from: M */
    public static int m38777M(int i) {
        return 4;
    }

    /* renamed from: N */
    public static int m38778N(int i, long j) {
        return m38786V(i) + m38779O(j);
    }

    /* renamed from: O */
    public static int m38779O(long j) {
        return 8;
    }

    /* renamed from: P */
    public static int m38780P(int i, int i2) {
        return m38786V(i) + m38781Q(i2);
    }

    /* renamed from: Q */
    public static int m38781Q(int i) {
        return m38788X(m38791a0(i));
    }

    /* renamed from: R */
    public static int m38782R(int i, long j) {
        return m38786V(i) + m38783S(j);
    }

    /* renamed from: S */
    public static int m38783S(long j) {
        return m38790Z(m38792b0(j));
    }

    /* renamed from: T */
    public static int m38784T(int i, String str) {
        return m38786V(i) + m38785U(str);
    }

    /* renamed from: U */
    public static int m38785U(String str) {
        int i;
        try {
            i = Utf8.m38988j(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            i = str.getBytes(C5011t.f25748b).length;
        }
        return m38768D(i);
    }

    /* renamed from: V */
    public static int m38786V(int i) {
        return m38788X(WireFormat.m39052c(i, 0));
    }

    /* renamed from: W */
    public static int m38787W(int i, int i2) {
        return m38786V(i) + m38788X(i2);
    }

    /* renamed from: X */
    public static int m38788X(int i) {
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
    public static int m38789Y(int i, long j) {
        return m38786V(i) + m38790Z(j);
    }

    /* renamed from: Z */
    public static int m38790Z(long j) {
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
    public static int m38791a0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: b0 */
    public static long m38792b0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: e */
    public static int m38794e(int i, boolean z) {
        return m38786V(i) + m38795f(z);
    }

    /* renamed from: f */
    public static int m38795f(boolean z) {
        return 1;
    }

    /* renamed from: f0 */
    public static CodedOutputStream m38796f0(OutputStream outputStream, int i) {
        return new C4928d(outputStream, i);
    }

    /* renamed from: g */
    public static int m38797g(byte[] bArr) {
        return m38768D(bArr.length);
    }

    /* renamed from: g0 */
    public static CodedOutputStream m38798g0(byte[] bArr) {
        return m38800h0(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public static int m38799h(int i, ByteString byteString) {
        return m38786V(i) + m38801i(byteString);
    }

    /* renamed from: h0 */
    public static CodedOutputStream m38800h0(byte[] bArr, int i, int i2) {
        return new C4927c(bArr, i, i2);
    }

    /* renamed from: i */
    public static int m38801i(ByteString byteString) {
        return m38768D(byteString.size());
    }

    /* renamed from: j */
    public static int m38802j(int i, double d) {
        return m38786V(i) + m38803k(d);
    }

    /* renamed from: k */
    public static int m38803k(double d) {
        return 8;
    }

    /* renamed from: l */
    public static int m38804l(int i, int i2) {
        return m38786V(i) + m38805m(i2);
    }

    /* renamed from: m */
    public static int m38805m(int i) {
        return m38816x(i);
    }

    /* renamed from: n */
    public static int m38806n(int i, int i2) {
        return m38786V(i) + m38807o(i2);
    }

    /* renamed from: o */
    public static int m38807o(int i) {
        return 4;
    }

    /* renamed from: p */
    public static int m38808p(int i, long j) {
        return m38786V(i) + m38809q(j);
    }

    /* renamed from: q */
    public static int m38809q(long j) {
        return 8;
    }

    /* renamed from: r */
    public static int m38810r(int i, float f) {
        return m38786V(i) + m38811s(f);
    }

    /* renamed from: s */
    public static int m38811s(float f) {
        return 4;
    }

    @Deprecated
    /* renamed from: t */
    public static int m38812t(int i, C4956c0 c0Var, C4984j0 j0Var) {
        return (m38786V(i) * 2) + m38814v(c0Var, j0Var);
    }

    @Deprecated
    /* renamed from: u */
    public static int m38813u(C4956c0 c0Var) {
        return c0Var.getSerializedSize();
    }

    @Deprecated
    /* renamed from: v */
    public static int m38814v(C4956c0 c0Var, C4984j0 j0Var) {
        return ((C4949a) c0Var).getSerializedSize(j0Var);
    }

    /* renamed from: w */
    public static int m38815w(int i, int i2) {
        return m38786V(i) + m38816x(i2);
    }

    /* renamed from: x */
    public static int m38816x(int i) {
        if (i >= 0) {
            return m38788X(i);
        }
        return 10;
    }

    /* renamed from: y */
    public static int m38817y(int i, long j) {
        return m38786V(i) + m38818z(j);
    }

    /* renamed from: z */
    public static int m38818z(long j) {
        return m38790Z(j);
    }

    @Deprecated
    /* renamed from: A0 */
    public final void mo36799A0(int i, C4956c0 c0Var) throws IOException {
        mo36821W0(i, 3);
        mo36801C0(c0Var);
        mo36821W0(i, 4);
    }

    @Deprecated
    /* renamed from: B0 */
    public final void mo36800B0(int i, C4956c0 c0Var, C4984j0 j0Var) throws IOException {
        mo36821W0(i, 3);
        mo36802D0(c0Var, j0Var);
        mo36821W0(i, 4);
    }

    @Deprecated
    /* renamed from: C0 */
    public final void mo36801C0(C4956c0 c0Var) throws IOException {
        c0Var.writeTo(this);
    }

    @Deprecated
    /* renamed from: D0 */
    public final void mo36802D0(C4956c0 c0Var, C4984j0 j0Var) throws IOException {
        j0Var.mo37183h(c0Var, this.f25535a);
    }

    /* renamed from: E0 */
    public abstract void mo36803E0(int i, int i2) throws IOException;

    /* renamed from: F0 */
    public abstract void mo36804F0(int i) throws IOException;

    /* renamed from: G0 */
    public final void mo36805G0(int i, long j) throws IOException {
        mo36824Z0(i, j);
    }

    /* renamed from: H0 */
    public final void mo36806H0(long j) throws IOException {
        mo36825a1(j);
    }

    /* renamed from: I0 */
    public abstract void mo36807I0(int i, C4956c0 c0Var, C4984j0 j0Var) throws IOException;

    /* renamed from: J0 */
    public abstract void mo36808J0(C4956c0 c0Var) throws IOException;

    /* renamed from: K0 */
    public abstract void mo36809K0(int i, C4956c0 c0Var) throws IOException;

    /* renamed from: L0 */
    public abstract void mo36810L0(int i, ByteString byteString) throws IOException;

    /* renamed from: M0 */
    public final void mo36811M0(int i, int i2) throws IOException {
        mo36843u0(i, i2);
    }

    /* renamed from: N0 */
    public final void mo36812N0(int i) throws IOException {
        mo36844v0(i);
    }

    /* renamed from: O0 */
    public final void mo36813O0(int i, long j) throws IOException {
        mo36845w0(i, j);
    }

    /* renamed from: P0 */
    public final void mo36814P0(long j) throws IOException {
        mo36846x0(j);
    }

    /* renamed from: Q0 */
    public final void mo36815Q0(int i, int i2) throws IOException {
        mo36822X0(i, m38791a0(i2));
    }

    /* renamed from: R0 */
    public final void mo36816R0(int i) throws IOException {
        mo36823Y0(m38791a0(i));
    }

    /* renamed from: S0 */
    public final void mo36817S0(int i, long j) throws IOException {
        mo36824Z0(i, m38792b0(j));
    }

    /* renamed from: T0 */
    public final void mo36818T0(long j) throws IOException {
        mo36825a1(m38792b0(j));
    }

    /* renamed from: U0 */
    public abstract void mo36819U0(int i, String str) throws IOException;

    /* renamed from: V0 */
    public abstract void mo36820V0(String str) throws IOException;

    /* renamed from: W0 */
    public abstract void mo36821W0(int i, int i2) throws IOException;

    /* renamed from: X0 */
    public abstract void mo36822X0(int i, int i2) throws IOException;

    /* renamed from: Y0 */
    public abstract void mo36823Y0(int i) throws IOException;

    /* renamed from: Z0 */
    public abstract void mo36824Z0(int i, long j) throws IOException;

    /* renamed from: a1 */
    public abstract void mo36825a1(long j) throws IOException;

    /* renamed from: b */
    public abstract void mo36826b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c0 */
    public abstract void mo36827c0() throws IOException;

    /* renamed from: d */
    public final void mo36828d() {
        if (mo36831i0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: d0 */
    public final void mo36829d0(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        f25533c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", unpairedSurrogateException);
        byte[] bytes = str.getBytes(C5011t.f25748b);
        try {
            mo36823Y0(bytes.length);
            mo36826b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException((Throwable) e);
        }
    }

    /* renamed from: e0 */
    public boolean mo36830e0() {
        return this.f25536b;
    }

    /* renamed from: i0 */
    public abstract int mo36831i0();

    /* renamed from: j0 */
    public abstract void mo36832j0(byte b) throws IOException;

    /* renamed from: k0 */
    public abstract void mo36833k0(int i, boolean z) throws IOException;

    /* renamed from: l0 */
    public final void mo36834l0(boolean z) throws IOException {
        mo36832j0(z ? (byte) 1 : 0);
    }

    /* renamed from: m0 */
    public final void mo36835m0(byte[] bArr) throws IOException {
        mo36836n0(bArr, 0, bArr.length);
    }

    /* renamed from: n0 */
    public abstract void mo36836n0(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: o0 */
    public abstract void mo36837o0(int i, ByteString byteString) throws IOException;

    /* renamed from: p0 */
    public abstract void mo36838p0(ByteString byteString) throws IOException;

    /* renamed from: q0 */
    public final void mo36839q0(int i, double d) throws IOException {
        mo36845w0(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r0 */
    public final void mo36840r0(double d) throws IOException {
        mo36846x0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: s0 */
    public final void mo36841s0(int i, int i2) throws IOException {
        mo36803E0(i, i2);
    }

    /* renamed from: t0 */
    public final void mo36842t0(int i) throws IOException {
        mo36804F0(i);
    }

    /* renamed from: u0 */
    public abstract void mo36843u0(int i, int i2) throws IOException;

    /* renamed from: v0 */
    public abstract void mo36844v0(int i) throws IOException;

    /* renamed from: w0 */
    public abstract void mo36845w0(int i, long j) throws IOException;

    /* renamed from: x0 */
    public abstract void mo36846x0(long j) throws IOException;

    /* renamed from: y0 */
    public final void mo36847y0(int i, float f) throws IOException {
        mo36843u0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: z0 */
    public final void mo36848z0(float f) throws IOException {
        mo36844v0(Float.floatToRawIntBits(f));
    }

    public CodedOutputStream() {
    }
}

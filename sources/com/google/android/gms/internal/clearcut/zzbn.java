package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzbn extends eb8 {

    /* renamed from: b */
    public static final Logger f22481b = Logger.getLogger(zzbn.class.getName());

    /* renamed from: c */
    public static final boolean f22482c = qp8.m50772x();

    /* renamed from: a */
    public uc8 f22483a;

    /* renamed from: com.google.android.gms.internal.clearcut.zzbn$a */
    public static class C4079a extends zzbn {

        /* renamed from: d */
        public final byte[] f22484d;

        /* renamed from: e */
        public final int f22485e;

        /* renamed from: f */
        public final int f22486f;

        /* renamed from: g */
        public int f22487g;

        public C4079a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f22484d = bArr;
                    this.f22485e = i;
                    this.f22487g = i;
                    this.f22486f = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: A0 */
        public final void mo30817A0(int i) throws IOException {
            try {
                byte[] bArr = this.f22484d;
                int i2 = this.f22487g;
                int i3 = i2 + 1;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (i >> 16);
                this.f22487g = i5 + 1;
                bArr[i5] = i >> 24;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22487g), Integer.valueOf(this.f22486f), 1}), e);
            }
        }

        /* renamed from: G */
        public final void mo30818G(int i, int i2) throws IOException {
            mo30851y0((i << 3) | i2);
        }

        /* renamed from: I */
        public final void mo30820I(int i, zzbb zzbb) throws IOException {
            mo30818G(1, 3);
            mo30829b0(2, i);
            mo30840m(3, zzbb);
            mo30818G(1, 4);
        }

        /* renamed from: J */
        public final void mo30821J(int i, tj8 tj8) throws IOException {
            mo30818G(1, 3);
            mo30829b0(2, i);
            mo30843o(3, tj8);
            mo30818G(1, 4);
        }

        /* renamed from: K */
        public final void mo30822K(int i, boolean z) throws IOException {
            mo30818G(i, 0);
            mo30833g(z ? (byte) 1 : 0);
        }

        /* renamed from: K0 */
        public final int mo30853K0() {
            return this.f22487g - this.f22485e;
        }

        /* renamed from: L */
        public final void mo30823L(long j) throws IOException {
            if (!zzbn.f22482c || mo30849u() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f22484d;
                    int i = this.f22487g;
                    this.f22487g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f22484d;
                    int i2 = this.f22487g;
                    this.f22487g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22487g), Integer.valueOf(this.f22486f), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f22484d;
                    int i3 = this.f22487g;
                    this.f22487g = i3 + 1;
                    qp8.m50759k(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f22484d;
                int i4 = this.f22487g;
                this.f22487g = i4 + 1;
                qp8.m50759k(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: M */
        public final void mo30824M(tj8 tj8) throws IOException {
            mo30851y0(tj8.mo30774o());
            tj8.mo30772l(this);
        }

        /* renamed from: T */
        public final void mo30825T(int i, int i2) throws IOException {
            mo30818G(i, 0);
            mo30850x0(i2);
        }

        /* renamed from: U */
        public final void mo30826U(int i, long j) throws IOException {
            mo30818G(i, 1);
            mo30831c0(j);
        }

        /* renamed from: a */
        public final void mo30854a(byte[] bArr, int i, int i2) throws IOException {
            mo30830c(bArr, i, i2);
        }

        /* renamed from: b */
        public void mo30828b() {
        }

        /* renamed from: b0 */
        public final void mo30829b0(int i, int i2) throws IOException {
            mo30818G(i, 0);
            mo30851y0(i2);
        }

        /* renamed from: c */
        public final void mo30830c(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f22484d, this.f22487g, i2);
                this.f22487g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22487g), Integer.valueOf(this.f22486f), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: c0 */
        public final void mo30831c0(long j) throws IOException {
            try {
                byte[] bArr = this.f22484d;
                int i = this.f22487g;
                int i2 = i + 1;
                bArr[i] = (byte) ((int) j);
                int i3 = i2 + 1;
                bArr[i2] = (byte) ((int) (j >> 8));
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((int) (j >> 16));
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((int) (j >> 24));
                int i6 = i5 + 1;
                bArr[i5] = (byte) ((int) (j >> 32));
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((int) (j >> 40));
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((int) (j >> 48));
                this.f22487g = i8 + 1;
                bArr[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22487g), Integer.valueOf(this.f22486f), 1}), e);
            }
        }

        /* renamed from: g */
        public final void mo30833g(byte b) throws IOException {
            try {
                byte[] bArr = this.f22484d;
                int i = this.f22487g;
                this.f22487g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22487g), Integer.valueOf(this.f22486f), 1}), e);
            }
        }

        /* renamed from: i0 */
        public final void mo30836i0(int i, int i2) throws IOException {
            mo30818G(i, 5);
            mo30817A0(i2);
        }

        /* renamed from: l */
        public final void mo30839l(int i, long j) throws IOException {
            mo30818G(i, 0);
            mo30823L(j);
        }

        /* renamed from: m */
        public final void mo30840m(int i, zzbb zzbb) throws IOException {
            mo30818G(i, 2);
            mo30845q(zzbb);
        }

        /* renamed from: m0 */
        public final void mo30841m0(String str) throws IOException {
            int i = this.f22487g;
            try {
                int D0 = zzbn.m33952D0(str.length() * 3);
                int D02 = zzbn.m33952D0(str.length());
                if (D02 == D0) {
                    int i2 = i + D02;
                    this.f22487g = i2;
                    int b = C4064h.m33890b(str, this.f22484d, i2, mo30849u());
                    this.f22487g = i;
                    mo30851y0((b - i) - D02);
                    this.f22487g = b;
                    return;
                }
                mo30851y0(C4064h.m33889a(str));
                this.f22487g = C4064h.m33890b(str, this.f22484d, this.f22487g, mo30849u());
            } catch (zzfi e) {
                this.f22487g = i;
                mo30846r(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: n */
        public final void mo30842n(int i, String str) throws IOException {
            mo30818G(i, 2);
            mo30841m0(str);
        }

        /* renamed from: o */
        public final void mo30843o(int i, tj8 tj8) throws IOException {
            mo30818G(i, 2);
            mo30824M(tj8);
        }

        /* renamed from: p */
        public final void mo30844p(int i, tj8 tj8, hm8 hm8) throws IOException {
            mo30818G(i, 2);
            C4052a aVar = (C4052a) tj8;
            int c = aVar.mo30755c();
            if (c == -1) {
                c = hm8.mo41962h(aVar);
                aVar.mo30754b(c);
            }
            mo30851y0(c);
            hm8.mo41963i(tj8, this.f22483a);
        }

        /* renamed from: q */
        public final void mo30845q(zzbb zzbb) throws IOException {
            mo30851y0(zzbb.size());
            zzbb.zza((eb8) this);
        }

        /* renamed from: s */
        public final void mo30847s(tj8 tj8, hm8 hm8) throws IOException {
            C4052a aVar = (C4052a) tj8;
            int c = aVar.mo30755c();
            if (c == -1) {
                c = hm8.mo41962h(aVar);
                aVar.mo30754b(c);
            }
            mo30851y0(c);
            hm8.mo41963i(tj8, this.f22483a);
        }

        /* renamed from: u */
        public final int mo30849u() {
            return this.f22486f - this.f22487g;
        }

        /* renamed from: x0 */
        public final void mo30850x0(int i) throws IOException {
            if (i >= 0) {
                mo30851y0(i);
            } else {
                mo30823L((long) i);
            }
        }

        /* renamed from: y0 */
        public final void mo30851y0(int i) throws IOException {
            if (!zzbn.f22482c || mo30849u() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f22484d;
                    int i2 = this.f22487g;
                    this.f22487g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f22484d;
                    int i3 = this.f22487g;
                    this.f22487g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22487g), Integer.valueOf(this.f22486f), 1}), e);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.f22484d;
                    int i4 = this.f22487g;
                    this.f22487g = i4 + 1;
                    qp8.m50759k(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.f22484d;
                int i5 = this.f22487g;
                this.f22487g = i5 + 1;
                qp8.m50759k(bArr4, (long) i5, (byte) i);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.zzbn$b */
    public static final class C4080b extends C4079a {

        /* renamed from: h */
        public final ByteBuffer f22488h;

        /* renamed from: i */
        public int f22489i;

        public C4080b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f22488h = byteBuffer;
            this.f22489i = byteBuffer.position();
        }

        /* renamed from: b */
        public final void mo30828b() {
            this.f22488h.position(this.f22489i + mo30853K0());
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.zzbn$c */
    public static final class C4081c extends zzbn {

        /* renamed from: d */
        public final ByteBuffer f22490d;

        /* renamed from: e */
        public final ByteBuffer f22491e;

        /* renamed from: f */
        public final int f22492f;

        public C4081c(ByteBuffer byteBuffer) {
            super();
            this.f22490d = byteBuffer;
            this.f22491e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f22492f = byteBuffer.position();
        }

        /* renamed from: A0 */
        public final void mo30817A0(int i) throws IOException {
            try {
                this.f22491e.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: G */
        public final void mo30818G(int i, int i2) throws IOException {
            mo30851y0((i << 3) | i2);
        }

        /* renamed from: I */
        public final void mo30820I(int i, zzbb zzbb) throws IOException {
            mo30818G(1, 3);
            mo30829b0(2, i);
            mo30840m(3, zzbb);
            mo30818G(1, 4);
        }

        /* renamed from: J */
        public final void mo30821J(int i, tj8 tj8) throws IOException {
            mo30818G(1, 3);
            mo30829b0(2, i);
            mo30843o(3, tj8);
            mo30818G(1, 4);
        }

        /* renamed from: K */
        public final void mo30822K(int i, boolean z) throws IOException {
            mo30818G(i, 0);
            mo30833g(z ? (byte) 1 : 0);
        }

        /* renamed from: K0 */
        public final void mo30855K0(String str) throws IOException {
            try {
                C4064h.m33891c(str, this.f22491e);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: L */
        public final void mo30823L(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.f22491e.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f22491e.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: M */
        public final void mo30824M(tj8 tj8) throws IOException {
            mo30851y0(tj8.mo30774o());
            tj8.mo30772l(this);
        }

        /* renamed from: T */
        public final void mo30825T(int i, int i2) throws IOException {
            mo30818G(i, 0);
            mo30850x0(i2);
        }

        /* renamed from: U */
        public final void mo30826U(int i, long j) throws IOException {
            mo30818G(i, 1);
            mo30831c0(j);
        }

        /* renamed from: a */
        public final void mo30854a(byte[] bArr, int i, int i2) throws IOException {
            mo30830c(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo30828b() {
            this.f22490d.position(this.f22491e.position());
        }

        /* renamed from: b0 */
        public final void mo30829b0(int i, int i2) throws IOException {
            mo30818G(i, 0);
            mo30851y0(i2);
        }

        /* renamed from: c */
        public final void mo30830c(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f22491e.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: c0 */
        public final void mo30831c0(long j) throws IOException {
            try {
                this.f22491e.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: g */
        public final void mo30833g(byte b) throws IOException {
            try {
                this.f22491e.put(b);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: i0 */
        public final void mo30836i0(int i, int i2) throws IOException {
            mo30818G(i, 5);
            mo30817A0(i2);
        }

        /* renamed from: l */
        public final void mo30839l(int i, long j) throws IOException {
            mo30818G(i, 0);
            mo30823L(j);
        }

        /* renamed from: m */
        public final void mo30840m(int i, zzbb zzbb) throws IOException {
            mo30818G(i, 2);
            mo30845q(zzbb);
        }

        /* renamed from: m0 */
        public final void mo30841m0(String str) throws IOException {
            int position = this.f22491e.position();
            try {
                int D0 = zzbn.m33952D0(str.length() * 3);
                int D02 = zzbn.m33952D0(str.length());
                if (D02 == D0) {
                    int position2 = this.f22491e.position() + D02;
                    this.f22491e.position(position2);
                    mo30855K0(str);
                    int position3 = this.f22491e.position();
                    this.f22491e.position(position);
                    mo30851y0(position3 - position2);
                    this.f22491e.position(position3);
                    return;
                }
                mo30851y0(C4064h.m33889a(str));
                mo30855K0(str);
            } catch (zzfi e) {
                this.f22491e.position(position);
                mo30846r(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: n */
        public final void mo30842n(int i, String str) throws IOException {
            mo30818G(i, 2);
            mo30841m0(str);
        }

        /* renamed from: o */
        public final void mo30843o(int i, tj8 tj8) throws IOException {
            mo30818G(i, 2);
            mo30824M(tj8);
        }

        /* renamed from: p */
        public final void mo30844p(int i, tj8 tj8, hm8 hm8) throws IOException {
            mo30818G(i, 2);
            mo30847s(tj8, hm8);
        }

        /* renamed from: q */
        public final void mo30845q(zzbb zzbb) throws IOException {
            mo30851y0(zzbb.size());
            zzbb.zza((eb8) this);
        }

        /* renamed from: s */
        public final void mo30847s(tj8 tj8, hm8 hm8) throws IOException {
            C4052a aVar = (C4052a) tj8;
            int c = aVar.mo30755c();
            if (c == -1) {
                c = hm8.mo41962h(aVar);
                aVar.mo30754b(c);
            }
            mo30851y0(c);
            hm8.mo41963i(tj8, this.f22483a);
        }

        /* renamed from: u */
        public final int mo30849u() {
            return this.f22491e.remaining();
        }

        /* renamed from: x0 */
        public final void mo30850x0(int i) throws IOException {
            if (i >= 0) {
                mo30851y0(i);
            } else {
                mo30823L((long) i);
            }
        }

        /* renamed from: y0 */
        public final void mo30851y0(int i) throws IOException {
            while ((i & -128) != 0) {
                this.f22491e.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f22491e.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.zzbn$d */
    public static final class C4082d extends zzbn {

        /* renamed from: d */
        public final ByteBuffer f22493d;

        /* renamed from: e */
        public final ByteBuffer f22494e;

        /* renamed from: f */
        public final long f22495f;

        /* renamed from: g */
        public final long f22496g;

        /* renamed from: h */
        public final long f22497h;

        /* renamed from: i */
        public final long f22498i;

        /* renamed from: j */
        public long f22499j;

        public C4082d(ByteBuffer byteBuffer) {
            super();
            this.f22493d = byteBuffer;
            this.f22494e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long o = qp8.m50763o(byteBuffer);
            this.f22495f = o;
            long position = ((long) byteBuffer.position()) + o;
            this.f22496g = position;
            long limit = o + ((long) byteBuffer.limit());
            this.f22497h = limit;
            this.f22498i = limit - 10;
            this.f22499j = position;
        }

        /* renamed from: A0 */
        public final void mo30817A0(int i) throws IOException {
            this.f22494e.putInt((int) (this.f22499j - this.f22495f), i);
            this.f22499j += 4;
        }

        /* renamed from: G */
        public final void mo30818G(int i, int i2) throws IOException {
            mo30851y0((i << 3) | i2);
        }

        /* renamed from: I */
        public final void mo30820I(int i, zzbb zzbb) throws IOException {
            mo30818G(1, 3);
            mo30829b0(2, i);
            mo30840m(3, zzbb);
            mo30818G(1, 4);
        }

        /* renamed from: J */
        public final void mo30821J(int i, tj8 tj8) throws IOException {
            mo30818G(1, 3);
            mo30829b0(2, i);
            mo30843o(3, tj8);
            mo30818G(1, 4);
        }

        /* renamed from: K */
        public final void mo30822K(int i, boolean z) throws IOException {
            mo30818G(i, 0);
            mo30833g(z ? (byte) 1 : 0);
        }

        /* renamed from: K0 */
        public final void mo30856K0(long j) {
            this.f22494e.position((int) (j - this.f22495f));
        }

        /* renamed from: L */
        public final void mo30823L(long j) throws IOException {
            if (this.f22499j <= this.f22498i) {
                while ((j & -128) != 0) {
                    long j2 = this.f22499j;
                    this.f22499j = j2 + 1;
                    qp8.m50751c(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.f22499j;
                this.f22499j = 1 + j3;
                qp8.m50751c(j3, (byte) ((int) j));
                return;
            }
            while (true) {
                long j4 = this.f22499j;
                if (j4 >= this.f22497h) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f22499j), Long.valueOf(this.f22497h), 1}));
                } else if ((j & -128) == 0) {
                    this.f22499j = 1 + j4;
                    qp8.m50751c(j4, (byte) ((int) j));
                    return;
                } else {
                    this.f22499j = j4 + 1;
                    qp8.m50751c(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        /* renamed from: M */
        public final void mo30824M(tj8 tj8) throws IOException {
            mo30851y0(tj8.mo30774o());
            tj8.mo30772l(this);
        }

        /* renamed from: T */
        public final void mo30825T(int i, int i2) throws IOException {
            mo30818G(i, 0);
            mo30850x0(i2);
        }

        /* renamed from: U */
        public final void mo30826U(int i, long j) throws IOException {
            mo30818G(i, 1);
            mo30831c0(j);
        }

        /* renamed from: a */
        public final void mo30854a(byte[] bArr, int i, int i2) throws IOException {
            mo30830c(bArr, i, i2);
        }

        /* renamed from: b */
        public final void mo30828b() {
            this.f22493d.position((int) (this.f22499j - this.f22495f));
        }

        /* renamed from: b0 */
        public final void mo30829b0(int i, int i2) throws IOException {
            mo30818G(i, 0);
            mo30851y0(i2);
        }

        /* renamed from: c */
        public final void mo30830c(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                long j2 = this.f22499j;
                if (this.f22497h - j >= j2) {
                    qp8.m50760l(bArr, (long) i, j2, j);
                    this.f22499j += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f22499j), Long.valueOf(this.f22497h), Integer.valueOf(i2)}));
        }

        /* renamed from: c0 */
        public final void mo30831c0(long j) throws IOException {
            this.f22494e.putLong((int) (this.f22499j - this.f22495f), j);
            this.f22499j += 8;
        }

        /* renamed from: g */
        public final void mo30833g(byte b) throws IOException {
            long j = this.f22499j;
            if (j < this.f22497h) {
                this.f22499j = 1 + j;
                qp8.m50751c(j, b);
                return;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f22499j), Long.valueOf(this.f22497h), 1}));
        }

        /* renamed from: i0 */
        public final void mo30836i0(int i, int i2) throws IOException {
            mo30818G(i, 5);
            mo30817A0(i2);
        }

        /* renamed from: l */
        public final void mo30839l(int i, long j) throws IOException {
            mo30818G(i, 0);
            mo30823L(j);
        }

        /* renamed from: m */
        public final void mo30840m(int i, zzbb zzbb) throws IOException {
            mo30818G(i, 2);
            mo30845q(zzbb);
        }

        /* renamed from: m0 */
        public final void mo30841m0(String str) throws IOException {
            long j = this.f22499j;
            try {
                int D0 = zzbn.m33952D0(str.length() * 3);
                int D02 = zzbn.m33952D0(str.length());
                if (D02 == D0) {
                    int i = ((int) (this.f22499j - this.f22495f)) + D02;
                    this.f22494e.position(i);
                    C4064h.m33891c(str, this.f22494e);
                    int position = this.f22494e.position() - i;
                    mo30851y0(position);
                    this.f22499j += (long) position;
                    return;
                }
                int a = C4064h.m33889a(str);
                mo30851y0(a);
                mo30856K0(this.f22499j);
                C4064h.m33891c(str, this.f22494e);
                this.f22499j += (long) a;
            } catch (zzfi e) {
                this.f22499j = j;
                mo30856K0(j);
                mo30846r(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzc((Throwable) e3);
            }
        }

        /* renamed from: n */
        public final void mo30842n(int i, String str) throws IOException {
            mo30818G(i, 2);
            mo30841m0(str);
        }

        /* renamed from: o */
        public final void mo30843o(int i, tj8 tj8) throws IOException {
            mo30818G(i, 2);
            mo30824M(tj8);
        }

        /* renamed from: p */
        public final void mo30844p(int i, tj8 tj8, hm8 hm8) throws IOException {
            mo30818G(i, 2);
            mo30847s(tj8, hm8);
        }

        /* renamed from: q */
        public final void mo30845q(zzbb zzbb) throws IOException {
            mo30851y0(zzbb.size());
            zzbb.zza((eb8) this);
        }

        /* renamed from: s */
        public final void mo30847s(tj8 tj8, hm8 hm8) throws IOException {
            C4052a aVar = (C4052a) tj8;
            int c = aVar.mo30755c();
            if (c == -1) {
                c = hm8.mo41962h(aVar);
                aVar.mo30754b(c);
            }
            mo30851y0(c);
            hm8.mo41963i(tj8, this.f22483a);
        }

        /* renamed from: u */
        public final int mo30849u() {
            return (int) (this.f22497h - this.f22499j);
        }

        /* renamed from: x0 */
        public final void mo30850x0(int i) throws IOException {
            if (i >= 0) {
                mo30851y0(i);
            } else {
                mo30823L((long) i);
            }
        }

        /* renamed from: y0 */
        public final void mo30851y0(int i) throws IOException {
            long j;
            if (this.f22499j <= this.f22498i) {
                while (true) {
                    int i2 = i & -128;
                    j = this.f22499j;
                    if (i2 == 0) {
                        break;
                    }
                    this.f22499j = j + 1;
                    qp8.m50751c(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            } else {
                while (true) {
                    j = this.f22499j;
                    if (j >= this.f22497h) {
                        throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f22499j), Long.valueOf(this.f22497h), 1}));
                    } else if ((i & -128) == 0) {
                        break;
                    } else {
                        this.f22499j = j + 1;
                        qp8.m50751c(j, (byte) ((i & 127) | 128));
                        i >>>= 7;
                    }
                }
            }
            this.f22499j = 1 + j;
            qp8.m50751c(j, (byte) i);
        }
    }

    public static class zzc extends IOException {
        public zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public zzc(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r1 = r3.length()
                if (r1 == 0) goto L_0x0011
                java.lang.String r3 = r0.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r0)
            L_0x0016:
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzbn.zzc.<init>(java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public zzc(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r1 = r3.length()
                if (r1 == 0) goto L_0x0011
                java.lang.String r3 = r0.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r0)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzbn.zzc.<init>(java.lang.String, java.lang.Throwable):void");
        }

        public zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    public zzbn() {
    }

    /* renamed from: A */
    public static int m33946A(int i, String str) {
        return m33948B0(i) + m33985q0(str);
    }

    /* renamed from: B */
    public static int m33947B(int i, xg8 xg8) {
        return (m33948B0(1) << 1) + m33982n0(2, i) + m33972d(3, xg8);
    }

    /* renamed from: B0 */
    public static int m33948B0(int i) {
        return m33952D0(i << 3);
    }

    /* renamed from: C */
    public static int m33949C(int i, tj8 tj8, hm8 hm8) {
        return m33948B0(i) + m33953E(tj8, hm8);
    }

    /* renamed from: C0 */
    public static int m33950C0(int i) {
        if (i >= 0) {
            return m33952D0(i);
        }
        return 10;
    }

    /* renamed from: D */
    public static int m33951D(zzbb zzbb) {
        int size = zzbb.size();
        return m33952D0(size) + size;
    }

    /* renamed from: D0 */
    public static int m33952D0(int i) {
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

    /* renamed from: E */
    public static int m33953E(tj8 tj8, hm8 hm8) {
        C4052a aVar = (C4052a) tj8;
        int c = aVar.mo30755c();
        if (c == -1) {
            c = hm8.mo41962h(aVar);
            aVar.mo30754b(c);
        }
        return m33952D0(c) + c;
    }

    /* renamed from: E0 */
    public static int m33954E0(int i) {
        return m33952D0(m33959I0(i));
    }

    /* renamed from: F */
    public static int m33955F(boolean z) {
        return 1;
    }

    /* renamed from: F0 */
    public static int m33956F0(int i) {
        return 4;
    }

    /* renamed from: G0 */
    public static int m33957G0(int i) {
        return 4;
    }

    /* renamed from: H0 */
    public static int m33958H0(int i) {
        return m33950C0(i);
    }

    /* renamed from: I0 */
    public static int m33959I0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    /* renamed from: J0 */
    public static int m33960J0(int i) {
        return m33952D0(i);
    }

    /* renamed from: N */
    public static int m33961N(int i, zzbb zzbb) {
        int B0 = m33948B0(i);
        int size = zzbb.size();
        return B0 + m33952D0(size) + size;
    }

    /* renamed from: O */
    public static int m33962O(int i, tj8 tj8) {
        return m33948B0(i) + m33965R(tj8);
    }

    @Deprecated
    /* renamed from: P */
    public static int m33963P(int i, tj8 tj8, hm8 hm8) {
        int B0 = m33948B0(i) << 1;
        C4052a aVar = (C4052a) tj8;
        int c = aVar.mo30755c();
        if (c == -1) {
            c = hm8.mo41962h(aVar);
            aVar.mo30754b(c);
        }
        return B0 + c;
    }

    /* renamed from: Q */
    public static int m33964Q(int i, boolean z) {
        return m33948B0(i) + 1;
    }

    /* renamed from: R */
    public static int m33965R(tj8 tj8) {
        int o = tj8.mo30774o();
        return m33952D0(o) + o;
    }

    /* renamed from: S */
    public static zzbn m33966S(byte[] bArr) {
        return new C4079a(bArr, 0, bArr.length);
    }

    /* renamed from: W */
    public static int m33967W(int i, long j) {
        return m33948B0(i) + m33978h0(j);
    }

    /* renamed from: X */
    public static int m33968X(int i, zzbb zzbb) {
        return (m33948B0(1) << 1) + m33982n0(2, i) + m33961N(3, zzbb);
    }

    /* renamed from: Y */
    public static int m33969Y(int i, tj8 tj8) {
        return (m33948B0(1) << 1) + m33982n0(2, i) + m33962O(3, tj8);
    }

    @Deprecated
    /* renamed from: Z */
    public static int m33970Z(tj8 tj8) {
        return tj8.mo30774o();
    }

    /* renamed from: a0 */
    public static int m33971a0(byte[] bArr) {
        int length = bArr.length;
        return m33952D0(length) + length;
    }

    /* renamed from: d */
    public static int m33972d(int i, xg8 xg8) {
        int B0 = m33948B0(i);
        int a = xg8.mo49479a();
        return B0 + m33952D0(a) + a;
    }

    /* renamed from: d0 */
    public static int m33973d0(int i, long j) {
        return m33948B0(i) + m33978h0(j);
    }

    /* renamed from: e */
    public static int m33974e(xg8 xg8) {
        int a = xg8.mo49479a();
        return m33952D0(a) + a;
    }

    /* renamed from: e0 */
    public static int m33975e0(long j) {
        return m33978h0(j);
    }

    /* renamed from: f */
    public static zzbn m33976f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C4080b(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            return qp8.m50773y() ? new C4082d(byteBuffer) : new C4081c(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    /* renamed from: g0 */
    public static int m33977g0(int i, long j) {
        return m33948B0(i) + m33978h0(m33989u0(j));
    }

    /* renamed from: h0 */
    public static int m33978h0(long j) {
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

    /* renamed from: j0 */
    public static int m33979j0(int i, int i2) {
        return m33948B0(i) + m33950C0(i2);
    }

    /* renamed from: k0 */
    public static int m33980k0(int i, long j) {
        return m33948B0(i) + 8;
    }

    /* renamed from: l0 */
    public static int m33981l0(long j) {
        return m33978h0(m33989u0(j));
    }

    /* renamed from: n0 */
    public static int m33982n0(int i, int i2) {
        return m33948B0(i) + m33952D0(i2);
    }

    /* renamed from: o0 */
    public static int m33983o0(int i, long j) {
        return m33948B0(i) + 8;
    }

    /* renamed from: p0 */
    public static int m33984p0(long j) {
        return 8;
    }

    /* renamed from: q0 */
    public static int m33985q0(String str) {
        int i;
        try {
            i = C4064h.m33889a(str);
        } catch (zzfi unused) {
            i = str.getBytes(vf8.f34940a).length;
        }
        return m33952D0(i) + i;
    }

    /* renamed from: r0 */
    public static int m33986r0(int i, int i2) {
        return m33948B0(i) + m33952D0(m33959I0(i2));
    }

    /* renamed from: s0 */
    public static int m33987s0(long j) {
        return 8;
    }

    /* renamed from: t0 */
    public static int m33988t0(int i, int i2) {
        return m33948B0(i) + 4;
    }

    /* renamed from: u0 */
    public static long m33989u0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: v0 */
    public static int m33991v0(int i, int i2) {
        return m33948B0(i) + 4;
    }

    /* renamed from: w */
    public static int m33992w(double d) {
        return 8;
    }

    /* renamed from: w0 */
    public static int m33993w0(int i, int i2) {
        return m33948B0(i) + m33950C0(i2);
    }

    /* renamed from: x */
    public static int m33994x(float f) {
        return 4;
    }

    /* renamed from: y */
    public static int m33995y(int i, double d) {
        return m33948B0(i) + 8;
    }

    /* renamed from: z */
    public static int m33996z(int i, float f) {
        return m33948B0(i) + 4;
    }

    /* renamed from: A0 */
    public abstract void mo30817A0(int i) throws IOException;

    /* renamed from: G */
    public abstract void mo30818G(int i, int i2) throws IOException;

    /* renamed from: H */
    public final void mo30819H(int i, long j) throws IOException {
        mo30839l(i, m33989u0(j));
    }

    /* renamed from: I */
    public abstract void mo30820I(int i, zzbb zzbb) throws IOException;

    /* renamed from: J */
    public abstract void mo30821J(int i, tj8 tj8) throws IOException;

    /* renamed from: K */
    public abstract void mo30822K(int i, boolean z) throws IOException;

    /* renamed from: L */
    public abstract void mo30823L(long j) throws IOException;

    /* renamed from: M */
    public abstract void mo30824M(tj8 tj8) throws IOException;

    /* renamed from: T */
    public abstract void mo30825T(int i, int i2) throws IOException;

    /* renamed from: U */
    public abstract void mo30826U(int i, long j) throws IOException;

    /* renamed from: V */
    public final void mo30827V(long j) throws IOException {
        mo30823L(m33989u0(j));
    }

    /* renamed from: b */
    public abstract void mo30828b() throws IOException;

    /* renamed from: b0 */
    public abstract void mo30829b0(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo30830c(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c0 */
    public abstract void mo30831c0(long j) throws IOException;

    /* renamed from: f0 */
    public final void mo30832f0(int i, int i2) throws IOException {
        mo30829b0(i, m33959I0(i2));
    }

    /* renamed from: g */
    public abstract void mo30833g(byte b) throws IOException;

    /* renamed from: h */
    public final void mo30834h(double d) throws IOException {
        mo30831c0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: i */
    public final void mo30835i(float f) throws IOException {
        mo30817A0(Float.floatToRawIntBits(f));
    }

    /* renamed from: i0 */
    public abstract void mo30836i0(int i, int i2) throws IOException;

    /* renamed from: j */
    public final void mo30837j(int i, double d) throws IOException {
        mo30826U(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: k */
    public final void mo30838k(int i, float f) throws IOException {
        mo30836i0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: l */
    public abstract void mo30839l(int i, long j) throws IOException;

    /* renamed from: m */
    public abstract void mo30840m(int i, zzbb zzbb) throws IOException;

    /* renamed from: m0 */
    public abstract void mo30841m0(String str) throws IOException;

    /* renamed from: n */
    public abstract void mo30842n(int i, String str) throws IOException;

    /* renamed from: o */
    public abstract void mo30843o(int i, tj8 tj8) throws IOException;

    /* renamed from: p */
    public abstract void mo30844p(int i, tj8 tj8, hm8 hm8) throws IOException;

    /* renamed from: q */
    public abstract void mo30845q(zzbb zzbb) throws IOException;

    /* renamed from: r */
    public final void mo30846r(String str, zzfi zzfi) throws IOException {
        f22481b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzfi);
        byte[] bytes = str.getBytes(vf8.f34940a);
        try {
            mo30851y0(bytes.length);
            mo30854a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzc((Throwable) e);
        } catch (zzc e2) {
            throw e2;
        }
    }

    /* renamed from: s */
    public abstract void mo30847s(tj8 tj8, hm8 hm8) throws IOException;

    /* renamed from: t */
    public final void mo30848t(boolean z) throws IOException {
        mo30833g(z ? (byte) 1 : 0);
    }

    /* renamed from: u */
    public abstract int mo30849u();

    /* renamed from: x0 */
    public abstract void mo30850x0(int i) throws IOException;

    /* renamed from: y0 */
    public abstract void mo30851y0(int i) throws IOException;

    /* renamed from: z0 */
    public final void mo30852z0(int i) throws IOException {
        mo30851y0(m33959I0(i));
    }
}

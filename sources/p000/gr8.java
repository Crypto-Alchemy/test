package p000;

import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzft;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: gr8 */
public final class gr8 {

    /* renamed from: a */
    public final ByteBuffer f29337a;

    /* renamed from: b */
    public zzbn f29338b;

    /* renamed from: c */
    public int f29339c;

    public gr8(ByteBuffer byteBuffer) {
        this.f29337a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public gr8(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: A */
    public static int m44861A(int i) {
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

    /* renamed from: a */
    public static int m44862a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: g */
    public static int m44863g(int i, String str) {
        return m44874y(i) + m44869r(str);
    }

    /* renamed from: h */
    public static int m44864h(int i, as8 as8) {
        int y = m44874y(i);
        int d = as8.mo29049d();
        return y + m44861A(d) + d;
    }

    /* renamed from: i */
    public static int m44865i(int i, byte[] bArr) {
        return m44874y(i) + m44870s(bArr);
    }

    /* renamed from: m */
    public static int m44866m(int i, long j) {
        return m44874y(i) + m44873x(j);
    }

    /* renamed from: n */
    public static void m44867n(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            int i4 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i5 = remaining + arrayOffset;
                    while (i4 < length) {
                        int i6 = i4 + arrayOffset;
                        if (i6 >= i5 || (charAt = charSequence.charAt(i4)) >= 128) {
                            break;
                        }
                        array[i6] = (byte) charAt;
                        i4++;
                    }
                    if (i4 == length) {
                        i2 = arrayOffset + length;
                    } else {
                        i2 = arrayOffset + i4;
                        while (i4 < length) {
                            char charAt2 = charSequence.charAt(i4);
                            if (charAt2 < 128 && i2 < i5) {
                                i3 = i2 + 1;
                                array[i2] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i2 <= i5 - 2) {
                                int i7 = i2 + 1;
                                array[i2] = (byte) ((charAt2 >>> 6) | 960);
                                i2 = i7 + 1;
                                array[i7] = (byte) ((charAt2 & '?') | 128);
                                i4++;
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i2 <= i5 - 3) {
                                int i8 = i2 + 1;
                                array[i2] = (byte) ((charAt2 >>> 12) | 480);
                                int i9 = i8 + 1;
                                array[i8] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i3 = i9 + 1;
                                array[i9] = (byte) ((charAt2 & '?') | 128);
                            } else if (i2 <= i5 - 4) {
                                int i10 = i4 + 1;
                                if (i10 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i10);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i11 = i2 + 1;
                                        array[i2] = (byte) ((codePoint >>> 18) | 240);
                                        int i12 = i11 + 1;
                                        array[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i13 = i12 + 1;
                                        array[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i2 = i13 + 1;
                                        array[i13] = (byte) ((codePoint & 63) | 128);
                                        i4 = i10;
                                        i4++;
                                    } else {
                                        i4 = i10;
                                    }
                                }
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i4 - 1);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i2);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i2 = i3;
                            i4++;
                        }
                    }
                    byteBuffer.position(i2 - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i4 < length2) {
                    char charAt4 = charSequence.charAt(i4);
                    if (charAt4 >= 128) {
                        if (charAt4 < 2048) {
                            i = (charAt4 >>> 6) | 960;
                        } else if (charAt4 < 55296 || 57343 < charAt4) {
                            byteBuffer.put((byte) ((charAt4 >>> 12) | 480));
                            i = ((charAt4 >>> 6) & 63) | 128;
                        } else {
                            int i14 = i4 + 1;
                            if (i14 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i4 = i14;
                                    i4++;
                                } else {
                                    i4 = i14;
                                }
                            }
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Unpaired surrogate at index ");
                            sb3.append(i4 - 1);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        byteBuffer.put((byte) i);
                        charAt4 = (charAt4 & '?') | 128;
                    }
                    byteBuffer.put((byte) charAt4);
                    i4++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    /* renamed from: q */
    public static gr8 m44868q(byte[] bArr) {
        return m44871t(bArr, 0, bArr.length);
    }

    /* renamed from: r */
    public static int m44869r(String str) {
        int a = m44862a(str);
        return m44861A(a) + a;
    }

    /* renamed from: s */
    public static int m44870s(byte[] bArr) {
        return m44861A(bArr.length) + bArr.length;
    }

    /* renamed from: t */
    public static gr8 m44871t(byte[] bArr, int i, int i2) {
        return new gr8(bArr, 0, i2);
    }

    /* renamed from: v */
    public static long m44872v(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: x */
    public static int m44873x(long j) {
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

    /* renamed from: y */
    public static int m44874y(int i) {
        return m44861A(i << 3);
    }

    /* renamed from: z */
    public static int m44875z(int i) {
        if (i >= 0) {
            return m44861A(i);
        }
        return 10;
    }

    /* renamed from: b */
    public final void mo42957b(int i, String str) throws IOException {
        mo42962j(i, 2);
        try {
            int A = m44861A(str.length());
            if (A == m44861A(str.length() * 3)) {
                int position = this.f29337a.position();
                if (this.f29337a.remaining() >= A) {
                    this.f29337a.position(position + A);
                    m44867n(str, this.f29337a);
                    int position2 = this.f29337a.position();
                    this.f29337a.position(position);
                    mo42961f((position2 - position) - A);
                    this.f29337a.position(position2);
                    return;
                }
                throw new zzft(position + A, this.f29337a.limit());
            }
            mo42961f(m44862a(str));
            m44867n(str, this.f29337a);
        } catch (BufferOverflowException e) {
            zzft zzft = new zzft(this.f29337a.position(), this.f29337a.limit());
            zzft.initCause(e);
            throw zzft;
        }
    }

    /* renamed from: c */
    public final void mo42958c(int i, as8 as8) throws IOException {
        mo42962j(i, 2);
        if (as8.f20992a < 0) {
            as8.mo29049d();
        }
        mo42961f(as8.f20992a);
        as8.mo29047a(this);
    }

    /* renamed from: d */
    public final void mo42959d(int i, byte[] bArr) throws IOException {
        mo42962j(i, 2);
        mo42961f(bArr.length);
        int length = bArr.length;
        if (this.f29337a.remaining() >= length) {
            this.f29337a.put(bArr, 0, length);
            return;
        }
        throw new zzft(this.f29337a.position(), this.f29337a.limit());
    }

    /* renamed from: e */
    public final void mo42960e(int i) throws IOException {
        byte b = (byte) i;
        if (this.f29337a.hasRemaining()) {
            this.f29337a.put(b);
            return;
        }
        throw new zzft(this.f29337a.position(), this.f29337a.limit());
    }

    /* renamed from: f */
    public final void mo42961f(int i) throws IOException {
        while ((i & -128) != 0) {
            mo42960e((i & 127) | 128);
            i >>>= 7;
        }
        mo42960e(i);
    }

    /* renamed from: j */
    public final void mo42962j(int i, int i2) throws IOException {
        mo42961f((i << 3) | i2);
    }

    /* renamed from: k */
    public final void mo42963k(int i, boolean z) throws IOException {
        mo42962j(25, 0);
        byte b = z ? (byte) 1 : 0;
        if (this.f29337a.hasRemaining()) {
            this.f29337a.put(b);
            return;
        }
        throw new zzft(this.f29337a.position(), this.f29337a.limit());
    }

    /* renamed from: l */
    public final void mo42964l(int i, int i2) throws IOException {
        mo42962j(i, 0);
        if (i2 >= 0) {
            mo42961f(i2);
        } else {
            mo42968w((long) i2);
        }
    }

    /* renamed from: o */
    public final void mo42965o(int i, tj8 tj8) throws IOException {
        if (this.f29338b == null) {
            this.f29338b = zzbn.m33976f(this.f29337a);
        } else {
            if (this.f29339c != this.f29337a.position()) {
                this.f29338b.mo30830c(this.f29337a.array(), this.f29339c, this.f29337a.position() - this.f29339c);
            }
            zzbn zzbn = this.f29338b;
            zzbn.mo30843o(i, tj8);
            zzbn.mo30828b();
            this.f29339c = this.f29337a.position();
        }
        this.f29339c = this.f29337a.position();
        zzbn zzbn2 = this.f29338b;
        zzbn2.mo30843o(i, tj8);
        zzbn2.mo30828b();
        this.f29339c = this.f29337a.position();
    }

    /* renamed from: p */
    public final void mo42966p() {
        if (this.f29337a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f29337a.remaining())}));
        }
    }

    /* renamed from: u */
    public final void mo42967u(int i, long j) throws IOException {
        mo42962j(i, 0);
        mo42968w(j);
    }

    /* renamed from: w */
    public final void mo42968w(long j) throws IOException {
        while ((-128 & j) != 0) {
            mo42960e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        mo42960e((int) j);
    }
}

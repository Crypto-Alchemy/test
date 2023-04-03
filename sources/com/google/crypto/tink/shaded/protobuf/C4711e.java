package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C4779z;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.e */
/* compiled from: BinaryReader */
public abstract class C4711e implements C4729i0 {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.e$b */
    /* compiled from: BinaryReader */
    public static final class C4713b extends C4711e {

        /* renamed from: a */
        public final boolean f25146a;

        /* renamed from: b */
        public final byte[] f25147b;

        /* renamed from: c */
        public int f25148c;

        /* renamed from: d */
        public final int f25149d;

        /* renamed from: e */
        public int f25150e;

        /* renamed from: f */
        public int f25151f;

        /* renamed from: g */
        public int f25152g;

        public C4713b(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f25146a = z;
            this.f25147b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f25148c = arrayOffset;
            this.f25149d = arrayOffset;
            this.f25150e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: A */
        public int mo35634A() throws IOException {
            if (mo35650R()) {
                return Integer.MAX_VALUE;
            }
            int b0 = mo35662b0();
            this.f25151f = b0;
            if (b0 == this.f25152g) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.m37459a(b0);
        }

        /* renamed from: B */
        public void mo35635B(List<String> list) throws IOException {
            mo35660a0(list, false);
        }

        /* renamed from: C */
        public void mo35636C(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C4755q) {
                C4755q qVar = (C4755q) list;
                int b = WireFormat.m37460b(this.f25151f);
                if (b == 2) {
                    int b0 = mo35662b0();
                    mo35682l0(b0);
                    int i3 = this.f25148c + b0;
                    while (this.f25148c < i3) {
                        qVar.mo36009n(Float.intBitsToFloat(mo35654V()));
                    }
                } else if (b == 5) {
                    do {
                        qVar.mo36009n(readFloat());
                        if (!mo35650R()) {
                            i2 = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i2;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m37460b(this.f25151f);
                if (b2 == 2) {
                    int b02 = mo35662b0();
                    mo35682l0(b02);
                    int i4 = this.f25148c + b02;
                    while (this.f25148c < i4) {
                        list.add(Float.valueOf(Float.intBitsToFloat(mo35654V())));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!mo35650R()) {
                            i = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: D */
        public boolean mo35637D() throws IOException {
            int i;
            if (mo35650R() || (i = this.f25151f) == this.f25152g) {
                return false;
            }
            int b = WireFormat.m37460b(i);
            if (b == 0) {
                mo35678j0();
                return true;
            } else if (b == 1) {
                mo35674h0(8);
                return true;
            } else if (b == 2) {
                mo35674h0(mo35662b0());
                return true;
            } else if (b == 3) {
                mo35676i0();
                return true;
            } else if (b == 5) {
                mo35674h0(4);
                return true;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: E */
        public int mo35638E() throws IOException {
            mo35672g0(5);
            return mo35653U();
        }

        /* renamed from: F */
        public void mo35639F(List<ByteString> list) throws IOException {
            int i;
            if (WireFormat.m37460b(this.f25151f) == 2) {
                do {
                    list.add(mo35686o());
                    if (!mo35650R()) {
                        i = this.f25148c;
                    } else {
                        return;
                    }
                } while (mo35662b0() == this.f25151f);
                this.f25148c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        /* renamed from: G */
        public void mo35640G(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C4730j) {
                C4730j jVar = (C4730j) list;
                int b = WireFormat.m37460b(this.f25151f);
                if (b == 1) {
                    do {
                        jVar.mo35892n(readDouble());
                        if (!mo35650R()) {
                            i2 = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i2;
                } else if (b == 2) {
                    int b0 = mo35662b0();
                    mo35684m0(b0);
                    int i3 = this.f25148c + b0;
                    while (this.f25148c < i3) {
                        jVar.mo35892n(Double.longBitsToDouble(mo35656X()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m37460b(this.f25151f);
                if (b2 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!mo35650R()) {
                            i = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i;
                } else if (b2 == 2) {
                    int b02 = mo35662b0();
                    mo35684m0(b02);
                    int i4 = this.f25148c + b02;
                    while (this.f25148c < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(mo35656X())));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: H */
        public long mo35641H() throws IOException {
            mo35672g0(0);
            return mo35664c0();
        }

        /* renamed from: I */
        public String mo35642I() throws IOException {
            return mo35658Z(true);
        }

        /* renamed from: J */
        public <T> T mo35643J(C4731j0<T> j0Var, C4734l lVar) throws IOException {
            mo35672g0(3);
            return mo35652T(j0Var, lVar);
        }

        /* renamed from: K */
        public <T> T mo35644K(Class<T> cls, C4734l lVar) throws IOException {
            mo35672g0(3);
            return mo35652T(ey4.m44106a().mo42452d(cls), lVar);
        }

        /* renamed from: L */
        public <K, V> void mo35645L(Map<K, V> map, C4779z.C4780a<K, V> aVar, C4734l lVar) throws IOException {
            mo35672g0(2);
            int b0 = mo35662b0();
            mo35668e0(b0);
            int i = this.f25150e;
            this.f25150e = this.f25148c + b0;
            try {
                throw null;
            } catch (Throwable th) {
                this.f25150e = i;
                throw th;
            }
        }

        /* renamed from: M */
        public <T> void mo35646M(List<T> list, C4731j0<T> j0Var, C4734l lVar) throws IOException {
            int i;
            if (WireFormat.m37460b(this.f25151f) == 2) {
                int i2 = this.f25151f;
                do {
                    list.add(mo35657Y(j0Var, lVar));
                    if (!mo35650R()) {
                        i = this.f25148c;
                    } else {
                        return;
                    }
                } while (mo35662b0() == i2);
                this.f25148c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        /* renamed from: N */
        public <T> T mo35647N(C4731j0<T> j0Var, C4734l lVar) throws IOException {
            mo35672g0(2);
            return mo35657Y(j0Var, lVar);
        }

        /* renamed from: O */
        public <T> T mo35648O(Class<T> cls, C4734l lVar) throws IOException {
            mo35672g0(2);
            return mo35657Y(ey4.m44106a().mo42452d(cls), lVar);
        }

        /* renamed from: P */
        public <T> void mo35649P(List<T> list, C4731j0<T> j0Var, C4734l lVar) throws IOException {
            int i;
            if (WireFormat.m37460b(this.f25151f) == 3) {
                int i2 = this.f25151f;
                do {
                    list.add(mo35652T(j0Var, lVar));
                    if (!mo35650R()) {
                        i = this.f25148c;
                    } else {
                        return;
                    }
                } while (mo35662b0() == i2);
                this.f25148c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        /* renamed from: R */
        public final boolean mo35650R() {
            if (this.f25148c == this.f25150e) {
                return true;
            }
            return false;
        }

        /* renamed from: S */
        public final byte mo35651S() throws IOException {
            int i = this.f25148c;
            if (i != this.f25150e) {
                byte[] bArr = this.f25147b;
                this.f25148c = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: T */
        public final <T> T mo35652T(C4731j0<T> j0Var, C4734l lVar) throws IOException {
            int i = this.f25152g;
            this.f25152g = WireFormat.m37461c(WireFormat.m37459a(this.f25151f), 4);
            try {
                T b = j0Var.mo35714b();
                j0Var.mo35728i(b, this, lVar);
                j0Var.mo35720e(b);
                if (this.f25151f == this.f25152g) {
                    return b;
                }
                throw InvalidProtocolBufferException.parseFailure();
            } finally {
                this.f25152g = i;
            }
        }

        /* renamed from: U */
        public final int mo35653U() throws IOException {
            mo35668e0(4);
            return mo35654V();
        }

        /* renamed from: V */
        public final int mo35654V() {
            int i = this.f25148c;
            byte[] bArr = this.f25147b;
            this.f25148c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: W */
        public final long mo35655W() throws IOException {
            mo35668e0(8);
            return mo35656X();
        }

        /* renamed from: X */
        public final long mo35656X() {
            int i = this.f25148c;
            byte[] bArr = this.f25147b;
            this.f25148c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* renamed from: Y */
        public final <T> T mo35657Y(C4731j0<T> j0Var, C4734l lVar) throws IOException {
            int b0 = mo35662b0();
            mo35668e0(b0);
            int i = this.f25150e;
            int i2 = this.f25148c + b0;
            this.f25150e = i2;
            try {
                T b = j0Var.mo35714b();
                j0Var.mo35728i(b, this, lVar);
                j0Var.mo35720e(b);
                if (this.f25148c == i2) {
                    return b;
                }
                throw InvalidProtocolBufferException.parseFailure();
            } finally {
                this.f25150e = i;
            }
        }

        /* renamed from: Z */
        public String mo35658Z(boolean z) throws IOException {
            mo35672g0(2);
            int b0 = mo35662b0();
            if (b0 == 0) {
                return "";
            }
            mo35668e0(b0);
            if (z) {
                byte[] bArr = this.f25147b;
                int i = this.f25148c;
                if (!Utf8.m37407t(bArr, i, i + b0)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            String str = new String(this.f25147b, this.f25148c, b0, C4758t.f25292b);
            this.f25148c += b0;
            return str;
        }

        /* renamed from: a */
        public int mo35659a() {
            return this.f25151f;
        }

        /* renamed from: a0 */
        public void mo35660a0(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (WireFormat.m37460b(this.f25151f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            } else if (!(list instanceof yf3) || z) {
                do {
                    list.add(mo35658Z(z));
                    if (!mo35650R()) {
                        i = this.f25148c;
                    } else {
                        return;
                    }
                } while (mo35662b0() == this.f25151f);
                this.f25148c = i;
            } else {
                yf3 yf3 = (yf3) list;
                do {
                    yf3.mo36058a1(mo35686o());
                    if (!mo35650R()) {
                        i2 = this.f25148c;
                    } else {
                        return;
                    }
                } while (mo35662b0() == this.f25151f);
                this.f25148c = i2;
            }
        }

        /* renamed from: b */
        public long mo35661b() throws IOException {
            mo35672g0(1);
            return mo35655W();
        }

        /* renamed from: b0 */
        public final int mo35662b0() throws IOException {
            byte b;
            int i = this.f25148c;
            int i2 = this.f25150e;
            if (i2 != i) {
                byte[] bArr = this.f25147b;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f25148c = i3;
                    return b2;
                } else if (i2 - i3 < 9) {
                    return (int) mo35666d0();
                } else {
                    int i4 = i3 + 1;
                    byte b3 = b2 ^ (bArr[i3] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i5 = i4 + 1;
                        byte b4 = b3 ^ (bArr[i4] << 14);
                        if (b4 >= 0) {
                            b = b4 ^ 16256;
                        } else {
                            i4 = i5 + 1;
                            byte b5 = b4 ^ (bArr[i5] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                i5 = i4 + 1;
                                byte b6 = bArr[i4];
                                b = (b5 ^ (b6 << 28)) ^ 266354560;
                                if (b6 < 0) {
                                    i4 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i4 + 1;
                                        if (bArr[i4] < 0) {
                                            i4 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i4 + 1;
                                                if (bArr[i4] < 0) {
                                                    i4 = i5 + 1;
                                                    if (bArr[i5] < 0) {
                                                        throw InvalidProtocolBufferException.malformedVarint();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                    this.f25148c = i4;
                    return b;
                }
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: c */
        public void mo35663c(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C4757s) {
                C4757s sVar = (C4757s) list;
                int b = WireFormat.m37460b(this.f25151f);
                if (b == 2) {
                    int b0 = mo35662b0();
                    mo35682l0(b0);
                    int i3 = this.f25148c + b0;
                    while (this.f25148c < i3) {
                        sVar.mo36030n(mo35654V());
                    }
                } else if (b == 5) {
                    do {
                        sVar.mo36030n(mo35638E());
                        if (!mo35650R()) {
                            i2 = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i2;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m37460b(this.f25151f);
                if (b2 == 2) {
                    int b02 = mo35662b0();
                    mo35682l0(b02);
                    int i4 = this.f25148c + b02;
                    while (this.f25148c < i4) {
                        list.add(Integer.valueOf(mo35654V()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo35638E()));
                        if (!mo35650R()) {
                            i = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: c0 */
        public long mo35664c0() throws IOException {
            long j;
            int i;
            long j2;
            long j3;
            byte b;
            int i2 = this.f25148c;
            int i3 = this.f25150e;
            if (i3 != i2) {
                byte[] bArr = this.f25147b;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f25148c = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return mo35666d0();
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << 14);
                        if (b4 >= 0) {
                            i = i6;
                            j = (long) (b4 ^ 16256);
                        } else {
                            i5 = i6 + 1;
                            byte b5 = b4 ^ (bArr[i6] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                long j4 = (long) b5;
                                int i7 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i8 = i7 + 1;
                                    long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i7 = i8 + 1;
                                        j5 = j6 ^ (((long) bArr[i8]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i7 + 1;
                                            j6 = j5 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i9 = i8 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i = i9 + 1;
                                                    if (((long) bArr[i9]) < 0) {
                                                        throw InvalidProtocolBufferException.malformedVarint();
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i = i7;
                            }
                        }
                        this.f25148c = i;
                        return j;
                    }
                    j = (long) b;
                    this.f25148c = i;
                    return j;
                }
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: d */
        public void mo35665d(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C4778y) {
                C4778y yVar = (C4778y) list;
                int b = WireFormat.m37460b(this.f25151f);
                if (b == 0) {
                    do {
                        yVar.mo36083o(mo35698y());
                        if (!mo35650R()) {
                            i2 = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i2;
                } else if (b == 2) {
                    int b0 = this.f25148c + mo35662b0();
                    while (this.f25148c < b0) {
                        yVar.mo36083o(C4717g.m37755c(mo35664c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m37460b(this.f25151f);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo35698y()));
                        if (!mo35650R()) {
                            i = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i;
                } else if (b2 == 2) {
                    int b02 = this.f25148c + mo35662b0();
                    while (this.f25148c < b02) {
                        list.add(Long.valueOf(C4717g.m37755c(mo35664c0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: d0 */
        public final long mo35666d0() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte S = mo35651S();
                j |= ((long) (S & Byte.MAX_VALUE)) << i;
                if ((S & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: e */
        public boolean mo35667e() throws IOException {
            mo35672g0(0);
            if (mo35662b0() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: e0 */
        public final void mo35668e0(int i) throws IOException {
            if (i < 0 || i > this.f25150e - this.f25148c) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: f */
        public long mo35669f() throws IOException {
            mo35672g0(1);
            return mo35655W();
        }

        /* renamed from: f0 */
        public final void mo35670f0(int i) throws IOException {
            if (this.f25148c != i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: g */
        public void mo35671g(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C4778y) {
                C4778y yVar = (C4778y) list;
                int b = WireFormat.m37460b(this.f25151f);
                if (b == 0) {
                    do {
                        yVar.mo36083o(mo35692s());
                        if (!mo35650R()) {
                            i2 = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i2;
                } else if (b == 2) {
                    int b0 = this.f25148c + mo35662b0();
                    while (this.f25148c < b0) {
                        yVar.mo36083o(mo35664c0());
                    }
                    mo35670f0(b0);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m37460b(this.f25151f);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo35692s()));
                        if (!mo35650R()) {
                            i = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i;
                } else if (b2 == 2) {
                    int b02 = this.f25148c + mo35662b0();
                    while (this.f25148c < b02) {
                        list.add(Long.valueOf(mo35664c0()));
                    }
                    mo35670f0(b02);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: g0 */
        public final void mo35672g0(int i) throws IOException {
            if (WireFormat.m37460b(this.f25151f) != i) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: h */
        public int mo35673h() throws IOException {
            mo35672g0(0);
            return mo35662b0();
        }

        /* renamed from: h0 */
        public final void mo35674h0(int i) throws IOException {
            mo35668e0(i);
            this.f25148c += i;
        }

        /* renamed from: i */
        public void mo35675i(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C4778y) {
                C4778y yVar = (C4778y) list;
                int b = WireFormat.m37460b(this.f25151f);
                if (b == 0) {
                    do {
                        yVar.mo36083o(mo35641H());
                        if (!mo35650R()) {
                            i2 = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i2;
                } else if (b == 2) {
                    int b0 = this.f25148c + mo35662b0();
                    while (this.f25148c < b0) {
                        yVar.mo36083o(mo35664c0());
                    }
                    mo35670f0(b0);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m37460b(this.f25151f);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo35641H()));
                        if (!mo35650R()) {
                            i = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i;
                } else if (b2 == 2) {
                    int b02 = this.f25148c + mo35662b0();
                    while (this.f25148c < b02) {
                        list.add(Long.valueOf(mo35664c0()));
                    }
                    mo35670f0(b02);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* renamed from: i0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo35676i0() throws java.io.IOException {
            /*
                r3 = this;
                int r0 = r3.f25152g
                int r1 = r3.f25151f
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.m37459a(r1)
                r2 = 4
                int r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.m37461c(r1, r2)
                r3.f25152g = r1
            L_0x000f:
                int r1 = r3.mo35634A()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.mo35637D()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f25151f
                int r2 = r3.f25152g
                if (r1 != r2) goto L_0x0027
                r3.f25152g = r0
                return
            L_0x0027:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4711e.C4713b.mo35676i0():void");
        }

        /* renamed from: j */
        public void mo35677j(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C4757s) {
                C4757s sVar = (C4757s) list;
                int b = WireFormat.m37460b(this.f25151f);
                if (b == 0) {
                    do {
                        sVar.mo36030n(mo35679k());
                        if (!mo35650R()) {
                            i2 = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i2;
                } else if (b == 2) {
                    int b0 = this.f25148c + mo35662b0();
                    while (this.f25148c < b0) {
                        sVar.mo36030n(mo35662b0());
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m37460b(this.f25151f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo35679k()));
                        if (!mo35650R()) {
                            i = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i;
                } else if (b2 == 2) {
                    int b02 = this.f25148c + mo35662b0();
                    while (this.f25148c < b02) {
                        list.add(Integer.valueOf(mo35662b0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: j0 */
        public final void mo35678j0() throws IOException {
            int i = this.f25150e;
            int i2 = this.f25148c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f25147b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f25148c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            mo35680k0();
        }

        /* renamed from: k */
        public int mo35679k() throws IOException {
            mo35672g0(0);
            return mo35662b0();
        }

        /* renamed from: k0 */
        public final void mo35680k0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo35651S() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: l */
        public int mo35681l() throws IOException {
            mo35672g0(0);
            return C4717g.m37754b(mo35662b0());
        }

        /* renamed from: l0 */
        public final void mo35682l0(int i) throws IOException {
            mo35668e0(i);
            if ((i & 3) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        /* renamed from: m */
        public void mo35683m(List<Boolean> list) throws IOException {
            int i;
            boolean z;
            int i2;
            boolean z2;
            if (list instanceof C4715f) {
                C4715f fVar = (C4715f) list;
                int b = WireFormat.m37460b(this.f25151f);
                if (b == 0) {
                    do {
                        fVar.mo35765o(mo35667e());
                        if (!mo35650R()) {
                            i2 = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i2;
                } else if (b == 2) {
                    int b0 = this.f25148c + mo35662b0();
                    while (this.f25148c < b0) {
                        if (mo35662b0() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        fVar.mo35765o(z2);
                    }
                    mo35670f0(b0);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m37460b(this.f25151f);
                if (b2 == 0) {
                    do {
                        list.add(Boolean.valueOf(mo35667e()));
                        if (!mo35650R()) {
                            i = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i;
                } else if (b2 == 2) {
                    int b02 = this.f25148c + mo35662b0();
                    while (this.f25148c < b02) {
                        if (mo35662b0() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        list.add(Boolean.valueOf(z));
                    }
                    mo35670f0(b02);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: m0 */
        public final void mo35684m0(int i) throws IOException {
            mo35668e0(i);
            if ((i & 7) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        /* renamed from: n */
        public void mo35685n(List<String> list) throws IOException {
            mo35660a0(list, true);
        }

        /* renamed from: o */
        public ByteString mo35686o() throws IOException {
            ByteString byteString;
            mo35672g0(2);
            int b0 = mo35662b0();
            if (b0 == 0) {
                return ByteString.EMPTY;
            }
            mo35668e0(b0);
            if (this.f25146a) {
                byteString = ByteString.wrap(this.f25147b, this.f25148c, b0);
            } else {
                byteString = ByteString.copyFrom(this.f25147b, this.f25148c, b0);
            }
            this.f25148c += b0;
            return byteString;
        }

        /* renamed from: p */
        public int mo35687p() throws IOException {
            mo35672g0(0);
            return mo35662b0();
        }

        /* renamed from: q */
        public void mo35688q(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C4778y) {
                C4778y yVar = (C4778y) list;
                int b = WireFormat.m37460b(this.f25151f);
                if (b == 1) {
                    do {
                        yVar.mo36083o(mo35661b());
                        if (!mo35650R()) {
                            i2 = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i2;
                } else if (b == 2) {
                    int b0 = mo35662b0();
                    mo35684m0(b0);
                    int i3 = this.f25148c + b0;
                    while (this.f25148c < i3) {
                        yVar.mo36083o(mo35656X());
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m37460b(this.f25151f);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo35661b()));
                        if (!mo35650R()) {
                            i = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i;
                } else if (b2 == 2) {
                    int b02 = mo35662b0();
                    mo35684m0(b02);
                    int i4 = this.f25148c + b02;
                    while (this.f25148c < i4) {
                        list.add(Long.valueOf(mo35656X()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: r */
        public void mo35689r(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C4757s) {
                C4757s sVar = (C4757s) list;
                int b = WireFormat.m37460b(this.f25151f);
                if (b == 0) {
                    do {
                        sVar.mo36030n(mo35681l());
                        if (!mo35650R()) {
                            i2 = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i2;
                } else if (b == 2) {
                    int b0 = this.f25148c + mo35662b0();
                    while (this.f25148c < b0) {
                        sVar.mo36030n(C4717g.m37754b(mo35662b0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m37460b(this.f25151f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo35681l()));
                        if (!mo35650R()) {
                            i = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i;
                } else if (b2 == 2) {
                    int b02 = this.f25148c + mo35662b0();
                    while (this.f25148c < b02) {
                        list.add(Integer.valueOf(C4717g.m37754b(mo35662b0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        public double readDouble() throws IOException {
            mo35672g0(1);
            return Double.longBitsToDouble(mo35655W());
        }

        public float readFloat() throws IOException {
            mo35672g0(5);
            return Float.intBitsToFloat(mo35653U());
        }

        /* renamed from: s */
        public long mo35692s() throws IOException {
            mo35672g0(0);
            return mo35664c0();
        }

        /* renamed from: t */
        public void mo35693t(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C4757s) {
                C4757s sVar = (C4757s) list;
                int b = WireFormat.m37460b(this.f25151f);
                if (b == 0) {
                    do {
                        sVar.mo36030n(mo35673h());
                        if (!mo35650R()) {
                            i2 = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i2;
                } else if (b == 2) {
                    int b0 = this.f25148c + mo35662b0();
                    while (this.f25148c < b0) {
                        sVar.mo36030n(mo35662b0());
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m37460b(this.f25151f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo35673h()));
                        if (!mo35650R()) {
                            i = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i;
                } else if (b2 == 2) {
                    int b02 = this.f25148c + mo35662b0();
                    while (this.f25148c < b02) {
                        list.add(Integer.valueOf(mo35662b0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: u */
        public int mo35694u() throws IOException {
            mo35672g0(5);
            return mo35653U();
        }

        /* renamed from: v */
        public void mo35695v(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C4778y) {
                C4778y yVar = (C4778y) list;
                int b = WireFormat.m37460b(this.f25151f);
                if (b == 1) {
                    do {
                        yVar.mo36083o(mo35669f());
                        if (!mo35650R()) {
                            i2 = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i2;
                } else if (b == 2) {
                    int b0 = mo35662b0();
                    mo35684m0(b0);
                    int i3 = this.f25148c + b0;
                    while (this.f25148c < i3) {
                        yVar.mo36083o(mo35656X());
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m37460b(this.f25151f);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo35669f()));
                        if (!mo35650R()) {
                            i = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i;
                } else if (b2 == 2) {
                    int b02 = mo35662b0();
                    mo35684m0(b02);
                    int i4 = this.f25148c + b02;
                    while (this.f25148c < i4) {
                        list.add(Long.valueOf(mo35656X()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: w */
        public void mo35696w(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C4757s) {
                C4757s sVar = (C4757s) list;
                int b = WireFormat.m37460b(this.f25151f);
                if (b == 0) {
                    do {
                        sVar.mo36030n(mo35687p());
                        if (!mo35650R()) {
                            i2 = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i2;
                } else if (b == 2) {
                    int b0 = this.f25148c + mo35662b0();
                    while (this.f25148c < b0) {
                        sVar.mo36030n(mo35662b0());
                    }
                    mo35670f0(b0);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m37460b(this.f25151f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo35687p()));
                        if (!mo35650R()) {
                            i = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i;
                } else if (b2 == 2) {
                    int b02 = this.f25148c + mo35662b0();
                    while (this.f25148c < b02) {
                        list.add(Integer.valueOf(mo35662b0()));
                    }
                    mo35670f0(b02);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: x */
        public void mo35697x(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C4757s) {
                C4757s sVar = (C4757s) list;
                int b = WireFormat.m37460b(this.f25151f);
                if (b == 2) {
                    int b0 = mo35662b0();
                    mo35682l0(b0);
                    int i3 = this.f25148c + b0;
                    while (this.f25148c < i3) {
                        sVar.mo36030n(mo35654V());
                    }
                } else if (b == 5) {
                    do {
                        sVar.mo36030n(mo35694u());
                        if (!mo35650R()) {
                            i2 = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i2;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m37460b(this.f25151f);
                if (b2 == 2) {
                    int b02 = mo35662b0();
                    mo35682l0(b02);
                    int i4 = this.f25148c + b02;
                    while (this.f25148c < i4) {
                        list.add(Integer.valueOf(mo35654V()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo35694u()));
                        if (!mo35650R()) {
                            i = this.f25148c;
                        } else {
                            return;
                        }
                    } while (mo35662b0() == this.f25151f);
                    this.f25148c = i;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: y */
        public long mo35698y() throws IOException {
            mo35672g0(0);
            return C4717g.m37755c(mo35664c0());
        }

        /* renamed from: z */
        public String mo35699z() throws IOException {
            return mo35658Z(false);
        }
    }

    public C4711e() {
    }

    /* renamed from: Q */
    public static C4711e m37585Q(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new C4713b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}

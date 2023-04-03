package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.protobuf.g */
/* compiled from: CodedInputStream */
public abstract class C4969g {

    /* renamed from: f */
    public static volatile int f25634f = 100;

    /* renamed from: a */
    public int f25635a;

    /* renamed from: b */
    public int f25636b;

    /* renamed from: c */
    public int f25637c;

    /* renamed from: d */
    public C4977h f25638d;

    /* renamed from: e */
    public boolean f25639e;

    /* renamed from: com.google.protobuf.g$b */
    /* compiled from: CodedInputStream */
    public static final class C4971b extends C4969g {

        /* renamed from: g */
        public final byte[] f25640g;

        /* renamed from: h */
        public final boolean f25641h;

        /* renamed from: i */
        public int f25642i;

        /* renamed from: j */
        public int f25643j;

        /* renamed from: k */
        public int f25644k;

        /* renamed from: l */
        public int f25645l;

        /* renamed from: m */
        public int f25646m;

        /* renamed from: n */
        public boolean f25647n;

        /* renamed from: o */
        public int f25648o;

        /* renamed from: A */
        public long mo37237A() throws IOException {
            return mo37264M();
        }

        /* renamed from: B */
        public int mo37238B() throws IOException {
            return C4969g.m39342b(mo37265N());
        }

        /* renamed from: C */
        public long mo37239C() throws IOException {
            return C4969g.m39343c(mo37266O());
        }

        /* renamed from: D */
        public String mo37240D() throws IOException {
            int N = mo37265N();
            if (N > 0) {
                int i = this.f25642i;
                int i2 = this.f25644k;
                if (N <= i - i2) {
                    String str = new String(this.f25640g, i2, N, C5011t.f25748b);
                    this.f25644k += N;
                    return str;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: E */
        public String mo37241E() throws IOException {
            int N = mo37265N();
            if (N > 0) {
                int i = this.f25642i;
                int i2 = this.f25644k;
                if (N <= i - i2) {
                    String h = Utf8.m38986h(this.f25640g, i2, N);
                    this.f25644k += N;
                    return h;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: F */
        public int mo37242F() throws IOException {
            if (mo37248e()) {
                this.f25646m = 0;
                return 0;
            }
            int N = mo37265N();
            this.f25646m = N;
            if (WireFormat.m39050a(N) != 0) {
                return this.f25646m;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: G */
        public int mo37243G() throws IOException {
            return mo37265N();
        }

        /* renamed from: H */
        public long mo37244H() throws IOException {
            return mo37266O();
        }

        /* renamed from: I */
        public boolean mo37245I(int i) throws IOException {
            int b = WireFormat.m39051b(i);
            if (b == 0) {
                mo37271T();
                return true;
            } else if (b == 1) {
                mo37270S(8);
                return true;
            } else if (b == 2) {
                mo37270S(mo37265N());
                return true;
            } else if (b == 3) {
                mo37269R();
                mo37246a(WireFormat.m39052c(WireFormat.m39050a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo37270S(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: J */
        public byte mo37261J() throws IOException {
            int i = this.f25644k;
            if (i != this.f25642i) {
                byte[] bArr = this.f25640g;
                this.f25644k = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: K */
        public byte[] mo37262K(int i) throws IOException {
            if (i > 0) {
                int i2 = this.f25642i;
                int i3 = this.f25644k;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f25644k = i4;
                    return Arrays.copyOfRange(this.f25640g, i3, i4);
                }
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (i == 0) {
                return C5011t.f25750d;
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        /* renamed from: L */
        public int mo37263L() throws IOException {
            int i = this.f25644k;
            if (this.f25642i - i >= 4) {
                byte[] bArr = this.f25640g;
                this.f25644k = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: M */
        public long mo37264M() throws IOException {
            int i = this.f25644k;
            if (this.f25642i - i >= 8) {
                byte[] bArr = this.f25640g;
                this.f25644k = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo37265N() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f25644k
                int r1 = r5.f25642i
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f25640g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f25644k = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo37267P()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f25644k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4969g.C4971b.mo37265N():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: O */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo37266O() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f25644k
                int r1 = r11.f25642i
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f25640g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f25644k = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo37267P()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f25644k = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4969g.C4971b.mo37266O():long");
        }

        /* renamed from: P */
        public long mo37267P() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo37261J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: Q */
        public final void mo37268Q() {
            int i = this.f25642i + this.f25643j;
            this.f25642i = i;
            int i2 = i - this.f25645l;
            int i3 = this.f25648o;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f25643j = i4;
                this.f25642i = i - i4;
                return;
            }
            this.f25643j = 0;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: R */
        public void mo37269R() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo37242F()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo37245I(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4969g.C4971b.mo37269R():void");
        }

        /* renamed from: S */
        public void mo37270S(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f25642i;
                int i3 = this.f25644k;
                if (i <= i2 - i3) {
                    this.f25644k = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: T */
        public final void mo37271T() throws IOException {
            if (this.f25642i - this.f25644k >= 10) {
                mo37272U();
            } else {
                mo37273V();
            }
        }

        /* renamed from: U */
        public final void mo37272U() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f25640g;
                int i2 = this.f25644k;
                this.f25644k = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: V */
        public final void mo37273V() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo37261J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: a */
        public void mo37246a(int i) throws InvalidProtocolBufferException {
            if (this.f25646m != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* renamed from: d */
        public int mo37247d() {
            return this.f25644k - this.f25645l;
        }

        /* renamed from: e */
        public boolean mo37248e() throws IOException {
            if (this.f25644k == this.f25642i) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        public void mo37249n(int i) {
            this.f25648o = i;
            mo37268Q();
        }

        /* renamed from: o */
        public int mo37250o(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int d = i + mo37247d();
                if (d >= 0) {
                    int i2 = this.f25648o;
                    if (d <= i2) {
                        this.f25648o = d;
                        mo37268Q();
                        return i2;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.parseFailure();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: p */
        public boolean mo37251p() throws IOException {
            if (mo37266O() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: q */
        public ByteString mo37252q() throws IOException {
            ByteString byteString;
            int N = mo37265N();
            if (N > 0) {
                int i = this.f25642i;
                int i2 = this.f25644k;
                if (N <= i - i2) {
                    if (!this.f25641h || !this.f25647n) {
                        byteString = ByteString.copyFrom(this.f25640g, i2, N);
                    } else {
                        byteString = ByteString.wrap(this.f25640g, i2, N);
                    }
                    this.f25644k += N;
                    return byteString;
                }
            }
            if (N == 0) {
                return ByteString.EMPTY;
            }
            return ByteString.wrap(mo37262K(N));
        }

        /* renamed from: r */
        public double mo37253r() throws IOException {
            return Double.longBitsToDouble(mo37264M());
        }

        /* renamed from: s */
        public int mo37254s() throws IOException {
            return mo37265N();
        }

        /* renamed from: t */
        public int mo37255t() throws IOException {
            return mo37263L();
        }

        /* renamed from: u */
        public long mo37256u() throws IOException {
            return mo37264M();
        }

        /* renamed from: v */
        public float mo37257v() throws IOException {
            return Float.intBitsToFloat(mo37263L());
        }

        /* renamed from: w */
        public int mo37258w() throws IOException {
            return mo37265N();
        }

        /* renamed from: x */
        public long mo37259x() throws IOException {
            return mo37266O();
        }

        /* renamed from: z */
        public int mo37260z() throws IOException {
            return mo37263L();
        }

        public C4971b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f25648o = Integer.MAX_VALUE;
            this.f25640g = bArr;
            this.f25642i = i2 + i;
            this.f25644k = i;
            this.f25645l = i;
            this.f25641h = z;
        }
    }

    /* renamed from: com.google.protobuf.g$c */
    /* compiled from: CodedInputStream */
    public static final class C4972c extends C4969g {

        /* renamed from: g */
        public final Iterable<ByteBuffer> f25649g;

        /* renamed from: h */
        public final Iterator<ByteBuffer> f25650h;

        /* renamed from: i */
        public ByteBuffer f25651i;

        /* renamed from: j */
        public final boolean f25652j;

        /* renamed from: k */
        public boolean f25653k;

        /* renamed from: l */
        public int f25654l;

        /* renamed from: m */
        public int f25655m;

        /* renamed from: n */
        public int f25656n;

        /* renamed from: o */
        public int f25657o;

        /* renamed from: p */
        public int f25658p;

        /* renamed from: q */
        public int f25659q;

        /* renamed from: r */
        public long f25660r;

        /* renamed from: s */
        public long f25661s;

        /* renamed from: t */
        public long f25662t;

        /* renamed from: u */
        public long f25663u;

        /* renamed from: A */
        public long mo37237A() throws IOException {
            return mo37279O();
        }

        /* renamed from: B */
        public int mo37238B() throws IOException {
            return C4969g.m39342b(mo37280P());
        }

        /* renamed from: C */
        public long mo37239C() throws IOException {
            return C4969g.m39343c(mo37281Q());
        }

        /* renamed from: D */
        public String mo37240D() throws IOException {
            int P = mo37280P();
            if (P > 0) {
                long j = (long) P;
                long j2 = this.f25663u;
                long j3 = this.f25660r;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[P];
                    p47.m49721p(j3, bArr, 0, j);
                    String str = new String(bArr, C5011t.f25748b);
                    this.f25660r += j;
                    return str;
                }
            }
            if (P > 0 && P <= mo37284T()) {
                byte[] bArr2 = new byte[P];
                mo37277M(bArr2, 0, P);
                return new String(bArr2, C5011t.f25748b);
            } else if (P == 0) {
                return "";
            } else {
                if (P < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: E */
        public String mo37241E() throws IOException {
            int P = mo37280P();
            if (P > 0) {
                long j = (long) P;
                long j2 = this.f25663u;
                long j3 = this.f25660r;
                if (j <= j2 - j3) {
                    String g = Utf8.m38985g(this.f25651i, (int) (j3 - this.f25661s), P);
                    this.f25660r += j;
                    return g;
                }
            }
            if (P >= 0 && P <= mo37284T()) {
                byte[] bArr = new byte[P];
                mo37277M(bArr, 0, P);
                return Utf8.m38986h(bArr, 0, P);
            } else if (P == 0) {
                return "";
            } else {
                if (P <= 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: F */
        public int mo37242F() throws IOException {
            if (mo37248e()) {
                this.f25657o = 0;
                return 0;
            }
            int P = mo37280P();
            this.f25657o = P;
            if (WireFormat.m39050a(P) != 0) {
                return this.f25657o;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: G */
        public int mo37243G() throws IOException {
            return mo37280P();
        }

        /* renamed from: H */
        public long mo37244H() throws IOException {
            return mo37281Q();
        }

        /* renamed from: I */
        public boolean mo37245I(int i) throws IOException {
            int b = WireFormat.m39051b(i);
            if (b == 0) {
                mo37287W();
                return true;
            } else if (b == 1) {
                mo37286V(8);
                return true;
            } else if (b == 2) {
                mo37286V(mo37280P());
                return true;
            } else if (b == 3) {
                mo37285U();
                mo37246a(WireFormat.m39052c(WireFormat.m39050a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo37286V(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: J */
        public final long mo37274J() {
            return this.f25663u - this.f25660r;
        }

        /* renamed from: K */
        public final void mo37275K() throws InvalidProtocolBufferException {
            if (this.f25650h.hasNext()) {
                mo37289Y();
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: L */
        public byte mo37276L() throws IOException {
            if (mo37274J() == 0) {
                mo37275K();
            }
            long j = this.f25660r;
            this.f25660r = 1 + j;
            return p47.m49728w(j);
        }

        /* renamed from: M */
        public final void mo37277M(byte[] bArr, int i, int i2) throws IOException {
            if (i2 >= 0 && i2 <= mo37284T()) {
                int i3 = i2;
                while (i3 > 0) {
                    if (mo37274J() == 0) {
                        mo37275K();
                    }
                    int min = Math.min(i3, (int) mo37274J());
                    long j = (long) min;
                    p47.m49721p(this.f25660r, bArr, (long) ((i2 - i3) + i), j);
                    i3 -= min;
                    this.f25660r += j;
                }
            } else if (i2 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (i2 != 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        /* renamed from: N */
        public int mo37278N() throws IOException {
            if (mo37274J() < 4) {
                return (mo37276L() & 255) | ((mo37276L() & 255) << 8) | ((mo37276L() & 255) << 16) | ((mo37276L() & 255) << 24);
            }
            long j = this.f25660r;
            this.f25660r = 4 + j;
            return ((p47.m49728w(j + 3) & 255) << 24) | (p47.m49728w(j) & 255) | ((p47.m49728w(1 + j) & 255) << 8) | ((p47.m49728w(2 + j) & 255) << 16);
        }

        /* renamed from: O */
        public long mo37279O() throws IOException {
            long L;
            byte L2;
            if (mo37274J() >= 8) {
                long j = this.f25660r;
                this.f25660r = 8 + j;
                L = (((long) p47.m49728w(j)) & 255) | ((((long) p47.m49728w(1 + j)) & 255) << 8) | ((((long) p47.m49728w(2 + j)) & 255) << 16) | ((((long) p47.m49728w(3 + j)) & 255) << 24) | ((((long) p47.m49728w(4 + j)) & 255) << 32) | ((((long) p47.m49728w(5 + j)) & 255) << 40) | ((((long) p47.m49728w(6 + j)) & 255) << 48);
                L2 = p47.m49728w(j + 7);
            } else {
                L = (((long) mo37276L()) & 255) | ((((long) mo37276L()) & 255) << 8) | ((((long) mo37276L()) & 255) << 16) | ((((long) mo37276L()) & 255) << 24) | ((((long) mo37276L()) & 255) << 32) | ((((long) mo37276L()) & 255) << 40) | ((((long) mo37276L()) & 255) << 48);
                L2 = mo37276L();
            }
            return ((((long) L2) & 255) << 56) | L;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
            if (p000.p47.m49728w(r4) < 0) goto L_0x008a;
         */
        /* renamed from: P */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo37280P() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f25660r
                long r2 = r10.f25663u
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x008a
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = p000.p47.m49728w(r0)
                if (r0 < 0) goto L_0x001a
                long r4 = r10.f25660r
                long r4 = r4 + r2
                r10.f25660r = r4
                return r0
            L_0x001a:
                long r6 = r10.f25663u
                long r8 = r10.f25660r
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0026
                goto L_0x008a
            L_0x0026:
                long r6 = r4 + r2
                byte r1 = p000.p47.m49728w(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0034
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0090
            L_0x0034:
                long r4 = r6 + r2
                byte r1 = p000.p47.m49728w(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0043
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x0041:
                r6 = r4
                goto L_0x0090
            L_0x0043:
                long r6 = r4 + r2
                byte r1 = p000.p47.m49728w(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0053
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x0090
            L_0x0053:
                long r4 = r6 + r2
                byte r1 = p000.p47.m49728w(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = p000.p47.m49728w(r4)
                if (r1 >= 0) goto L_0x0090
                long r4 = r6 + r2
                byte r1 = p000.p47.m49728w(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = p000.p47.m49728w(r4)
                if (r1 >= 0) goto L_0x0090
                long r4 = r6 + r2
                byte r1 = p000.p47.m49728w(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = p000.p47.m49728w(r4)
                if (r1 >= 0) goto L_0x0090
            L_0x008a:
                long r0 = r10.mo37282R()
                int r0 = (int) r0
                return r0
            L_0x0090:
                r10.f25660r = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4969g.C4972c.mo37280P():int");
        }

        /* renamed from: Q */
        public long mo37281Q() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f25660r;
            if (this.f25663u != j4) {
                long j5 = j4 + 1;
                byte w = p47.m49728w(j4);
                if (w >= 0) {
                    this.f25660r++;
                    return (long) w;
                } else if (this.f25663u - this.f25660r >= 10) {
                    long j6 = j5 + 1;
                    byte w2 = w ^ (p47.m49728w(j5) << 7);
                    if (w2 < 0) {
                        b = w2 ^ Byte.MIN_VALUE;
                    } else {
                        long j7 = j6 + 1;
                        byte w3 = w2 ^ (p47.m49728w(j6) << 14);
                        if (w3 >= 0) {
                            j = (long) (w3 ^ 16256);
                        } else {
                            j6 = j7 + 1;
                            byte w4 = w3 ^ (p47.m49728w(j7) << 21);
                            if (w4 < 0) {
                                b = w4 ^ -2080896;
                            } else {
                                j7 = j6 + 1;
                                long w5 = ((long) w4) ^ (((long) p47.m49728w(j6)) << 28);
                                if (w5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long w6 = w5 ^ (((long) p47.m49728w(j7)) << 35);
                                    if (w6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        w5 = w6 ^ (((long) p47.m49728w(j8)) << 42);
                                        if (w5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            w6 = w5 ^ (((long) p47.m49728w(j7)) << 49);
                                            if (w6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (w6 ^ (((long) p47.m49728w(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) p47.m49728w(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f25660r = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = w6 ^ j2;
                                    j6 = j8;
                                    this.f25660r = j6;
                                    return j;
                                }
                                j = w5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f25660r = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f25660r = j6;
                    return j;
                }
            }
            return mo37282R();
        }

        /* renamed from: R */
        public long mo37282R() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte L = mo37276L();
                j |= ((long) (L & Byte.MAX_VALUE)) << i;
                if ((L & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: S */
        public final void mo37283S() {
            int i = this.f25654l + this.f25655m;
            this.f25654l = i;
            int i2 = i - this.f25659q;
            int i3 = this.f25656n;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f25655m = i4;
                this.f25654l = i - i4;
                return;
            }
            this.f25655m = 0;
        }

        /* renamed from: T */
        public final int mo37284T() {
            return (int) ((((long) (this.f25654l - this.f25658p)) - this.f25660r) + this.f25661s);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: U */
        public void mo37285U() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo37242F()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo37245I(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4969g.C4972c.mo37285U():void");
        }

        /* renamed from: V */
        public void mo37286V(int i) throws IOException {
            if (i >= 0 && ((long) i) <= (((long) (this.f25654l - this.f25658p)) - this.f25660r) + this.f25661s) {
                while (i > 0) {
                    if (mo37274J() == 0) {
                        mo37275K();
                    }
                    int min = Math.min(i, (int) mo37274J());
                    i -= min;
                    this.f25660r += (long) min;
                }
            } else if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: W */
        public final void mo37287W() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo37276L() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
            r2.position(r0);
            r2.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0023 */
        /* renamed from: X */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.nio.ByteBuffer mo37288X(int r4, int r5) throws java.io.IOException {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f25651i
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f25651i
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f25651i
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0023 }
                r2.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0023 }
                java.nio.ByteBuffer r4 = r3.f25651i     // Catch:{ IllegalArgumentException -> 0x0023 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0023 }
                r2.position(r0)
                r2.limit(r1)
                return r4
            L_0x0021:
                r4 = move-exception
                goto L_0x0028
            L_0x0023:
                com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()     // Catch:{ all -> 0x0021 }
                throw r4     // Catch:{ all -> 0x0021 }
            L_0x0028:
                r2.position(r0)
                r2.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4969g.C4972c.mo37288X(int, int):java.nio.ByteBuffer");
        }

        /* renamed from: Y */
        public final void mo37289Y() {
            ByteBuffer next = this.f25650h.next();
            this.f25651i = next;
            this.f25658p += (int) (this.f25660r - this.f25661s);
            long position = (long) next.position();
            this.f25660r = position;
            this.f25661s = position;
            this.f25663u = (long) this.f25651i.limit();
            long k = p47.m49716k(this.f25651i);
            this.f25662t = k;
            this.f25660r += k;
            this.f25661s += k;
            this.f25663u += k;
        }

        /* renamed from: a */
        public void mo37246a(int i) throws InvalidProtocolBufferException {
            if (this.f25657o != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* renamed from: d */
        public int mo37247d() {
            return (int) ((((long) (this.f25658p - this.f25659q)) + this.f25660r) - this.f25661s);
        }

        /* renamed from: e */
        public boolean mo37248e() throws IOException {
            if ((((long) this.f25658p) + this.f25660r) - this.f25661s == ((long) this.f25654l)) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        public void mo37249n(int i) {
            this.f25656n = i;
            mo37283S();
        }

        /* renamed from: o */
        public int mo37250o(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int d = i + mo37247d();
                int i2 = this.f25656n;
                if (d <= i2) {
                    this.f25656n = d;
                    mo37283S();
                    return i2;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: p */
        public boolean mo37251p() throws IOException {
            if (mo37281Q() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: q */
        public ByteString mo37252q() throws IOException {
            int P = mo37280P();
            if (P > 0) {
                long j = (long) P;
                long j2 = this.f25663u;
                long j3 = this.f25660r;
                if (j <= j2 - j3) {
                    if (!this.f25652j || !this.f25653k) {
                        byte[] bArr = new byte[P];
                        p47.m49721p(j3, bArr, 0, j);
                        this.f25660r += j;
                        return ByteString.wrap(bArr);
                    }
                    int i = (int) (j3 - this.f25662t);
                    ByteString wrap = ByteString.wrap(mo37288X(i, P + i));
                    this.f25660r += j;
                    return wrap;
                }
            }
            if (P <= 0 || P > mo37284T()) {
                if (P == 0) {
                    return ByteString.EMPTY;
                }
                if (P < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (!this.f25652j || !this.f25653k) {
                byte[] bArr2 = new byte[P];
                mo37277M(bArr2, 0, P);
                return ByteString.wrap(bArr2);
            } else {
                ArrayList arrayList = new ArrayList();
                while (P > 0) {
                    if (mo37274J() == 0) {
                        mo37275K();
                    }
                    int min = Math.min(P, (int) mo37274J());
                    int i2 = (int) (this.f25660r - this.f25662t);
                    arrayList.add(ByteString.wrap(mo37288X(i2, i2 + min)));
                    P -= min;
                    this.f25660r += (long) min;
                }
                return ByteString.copyFrom((Iterable<ByteString>) arrayList);
            }
        }

        /* renamed from: r */
        public double mo37253r() throws IOException {
            return Double.longBitsToDouble(mo37279O());
        }

        /* renamed from: s */
        public int mo37254s() throws IOException {
            return mo37280P();
        }

        /* renamed from: t */
        public int mo37255t() throws IOException {
            return mo37278N();
        }

        /* renamed from: u */
        public long mo37256u() throws IOException {
            return mo37279O();
        }

        /* renamed from: v */
        public float mo37257v() throws IOException {
            return Float.intBitsToFloat(mo37278N());
        }

        /* renamed from: w */
        public int mo37258w() throws IOException {
            return mo37280P();
        }

        /* renamed from: x */
        public long mo37259x() throws IOException {
            return mo37281Q();
        }

        /* renamed from: z */
        public int mo37260z() throws IOException {
            return mo37278N();
        }

        public C4972c(Iterable<ByteBuffer> iterable, int i, boolean z) {
            super();
            this.f25656n = Integer.MAX_VALUE;
            this.f25654l = i;
            this.f25649g = iterable;
            this.f25650h = iterable.iterator();
            this.f25652j = z;
            this.f25658p = 0;
            this.f25659q = 0;
            if (i == 0) {
                this.f25651i = C5011t.f25751e;
                this.f25660r = 0;
                this.f25661s = 0;
                this.f25663u = 0;
                this.f25662t = 0;
                return;
            }
            mo37289Y();
        }
    }

    /* renamed from: com.google.protobuf.g$d */
    /* compiled from: CodedInputStream */
    public static final class C4973d extends C4969g {

        /* renamed from: g */
        public final InputStream f25664g;

        /* renamed from: h */
        public final byte[] f25665h;

        /* renamed from: i */
        public int f25666i;

        /* renamed from: j */
        public int f25667j;

        /* renamed from: k */
        public int f25668k;

        /* renamed from: l */
        public int f25669l;

        /* renamed from: m */
        public int f25670m;

        /* renamed from: n */
        public int f25671n;

        /* renamed from: o */
        public C4974a f25672o;

        /* renamed from: com.google.protobuf.g$d$a */
        /* compiled from: CodedInputStream */
        public interface C4974a {
            /* renamed from: a */
            void mo37309a();
        }

        /* renamed from: J */
        public static int m39454J(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        /* renamed from: K */
        public static int m39455K(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        /* renamed from: X */
        public static long m39456X(InputStream inputStream, long j) throws IOException {
            try {
                return inputStream.skip(j);
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        /* renamed from: A */
        public long mo37237A() throws IOException {
            return mo37296R();
        }

        /* renamed from: B */
        public int mo37238B() throws IOException {
            return C4969g.m39342b(mo37297S());
        }

        /* renamed from: C */
        public long mo37239C() throws IOException {
            return C4969g.m39343c(mo37298T());
        }

        /* renamed from: D */
        public String mo37240D() throws IOException {
            int S = mo37297S();
            if (S > 0) {
                int i = this.f25666i;
                int i2 = this.f25668k;
                if (S <= i - i2) {
                    String str = new String(this.f25665h, i2, S, C5011t.f25748b);
                    this.f25668k += S;
                    return str;
                }
            }
            if (S == 0) {
                return "";
            }
            if (S > this.f25666i) {
                return new String(mo37292N(S, false), C5011t.f25748b);
            }
            mo37301W(S);
            String str2 = new String(this.f25665h, this.f25668k, S, C5011t.f25748b);
            this.f25668k += S;
            return str2;
        }

        /* renamed from: E */
        public String mo37241E() throws IOException {
            byte[] bArr;
            int S = mo37297S();
            int i = this.f25668k;
            int i2 = this.f25666i;
            if (S <= i2 - i && S > 0) {
                bArr = this.f25665h;
                this.f25668k = i + S;
            } else if (S == 0) {
                return "";
            } else {
                if (S <= i2) {
                    mo37301W(S);
                    bArr = this.f25665h;
                    this.f25668k = S + 0;
                } else {
                    bArr = mo37292N(S, false);
                }
                i = 0;
            }
            return Utf8.m38986h(bArr, i, S);
        }

        /* renamed from: F */
        public int mo37242F() throws IOException {
            if (mo37248e()) {
                this.f25669l = 0;
                return 0;
            }
            int S = mo37297S();
            this.f25669l = S;
            if (WireFormat.m39050a(S) != 0) {
                return this.f25669l;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: G */
        public int mo37243G() throws IOException {
            return mo37297S();
        }

        /* renamed from: H */
        public long mo37244H() throws IOException {
            return mo37298T();
        }

        /* renamed from: I */
        public boolean mo37245I(int i) throws IOException {
            int b = WireFormat.m39051b(i);
            if (b == 0) {
                mo37305b0();
                return true;
            } else if (b == 1) {
                mo37303Z(8);
                return true;
            } else if (b == 2) {
                mo37303Z(mo37297S());
                return true;
            } else if (b == 3) {
                mo37302Y();
                mo37246a(WireFormat.m39052c(WireFormat.m39050a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo37303Z(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: L */
        public final ByteString mo37290L(int i) throws IOException {
            byte[] O = mo37293O(i);
            if (O != null) {
                return ByteString.copyFrom(O);
            }
            int i2 = this.f25668k;
            int i3 = this.f25666i;
            int i4 = i3 - i2;
            this.f25670m += i3;
            this.f25668k = 0;
            this.f25666i = 0;
            List<byte[]> P = mo37294P(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f25665h, i2, bArr, 0, i4);
            for (byte[] next : P) {
                System.arraycopy(next, 0, bArr, i4, next.length);
                i4 += next.length;
            }
            return ByteString.wrap(bArr);
        }

        /* renamed from: M */
        public byte mo37291M() throws IOException {
            if (this.f25668k == this.f25666i) {
                mo37301W(1);
            }
            byte[] bArr = this.f25665h;
            int i = this.f25668k;
            this.f25668k = i + 1;
            return bArr[i];
        }

        /* renamed from: N */
        public final byte[] mo37292N(int i, boolean z) throws IOException {
            byte[] O = mo37293O(i);
            if (O == null) {
                int i2 = this.f25668k;
                int i3 = this.f25666i;
                int i4 = i3 - i2;
                this.f25670m += i3;
                this.f25668k = 0;
                this.f25666i = 0;
                List<byte[]> P = mo37294P(i - i4);
                byte[] bArr = new byte[i];
                System.arraycopy(this.f25665h, i2, bArr, 0, i4);
                for (byte[] next : P) {
                    System.arraycopy(next, 0, bArr, i4, next.length);
                    i4 += next.length;
                }
                return bArr;
            } else if (z) {
                return (byte[]) O.clone();
            } else {
                return O;
            }
        }

        /* renamed from: O */
        public final byte[] mo37293O(int i) throws IOException {
            if (i == 0) {
                return C5011t.f25750d;
            }
            if (i >= 0) {
                int i2 = this.f25670m;
                int i3 = this.f25668k;
                int i4 = i2 + i3 + i;
                if (i4 - this.f25637c <= 0) {
                    int i5 = this.f25671n;
                    if (i4 <= i5) {
                        int i6 = this.f25666i - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > m39454J(this.f25664g)) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f25665h, this.f25668k, bArr, 0, i6);
                        this.f25670m += this.f25666i;
                        this.f25668k = 0;
                        this.f25666i = 0;
                        while (i6 < i) {
                            int K = m39455K(this.f25664g, bArr, i6, i - i6);
                            if (K != -1) {
                                this.f25670m += K;
                                i6 += K;
                            } else {
                                throw InvalidProtocolBufferException.truncatedMessage();
                            }
                        }
                        return bArr;
                    }
                    mo37303Z((i5 - i2) - i3);
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: P */
        public final List<byte[]> mo37294P(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f25664g.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f25670m += read;
                        i2 += read;
                    } else {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: Q */
        public int mo37295Q() throws IOException {
            int i = this.f25668k;
            if (this.f25666i - i < 4) {
                mo37301W(4);
                i = this.f25668k;
            }
            byte[] bArr = this.f25665h;
            this.f25668k = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: R */
        public long mo37296R() throws IOException {
            int i = this.f25668k;
            if (this.f25666i - i < 8) {
                mo37301W(8);
                i = this.f25668k;
            }
            byte[] bArr = this.f25665h;
            this.f25668k = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: S */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo37297S() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f25668k
                int r1 = r5.f25666i
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f25665h
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f25668k = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo37299U()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f25668k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4969g.C4973d.mo37297S():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: T */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo37298T() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f25668k
                int r1 = r11.f25666i
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f25665h
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f25668k = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo37299U()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f25668k = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4969g.C4973d.mo37298T():long");
        }

        /* renamed from: U */
        public long mo37299U() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte M = mo37291M();
                j |= ((long) (M & Byte.MAX_VALUE)) << i;
                if ((M & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: V */
        public final void mo37300V() {
            int i = this.f25666i + this.f25667j;
            this.f25666i = i;
            int i2 = this.f25670m + i;
            int i3 = this.f25671n;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f25667j = i4;
                this.f25666i = i - i4;
                return;
            }
            this.f25667j = 0;
        }

        /* renamed from: W */
        public final void mo37301W(int i) throws IOException {
            if (mo37308e0(i)) {
                return;
            }
            if (i > (this.f25637c - this.f25670m) - this.f25668k) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: Y */
        public void mo37302Y() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo37242F()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo37245I(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4969g.C4973d.mo37302Y():void");
        }

        /* renamed from: Z */
        public void mo37303Z(int i) throws IOException {
            int i2 = this.f25666i;
            int i3 = this.f25668k;
            if (i > i2 - i3 || i < 0) {
                mo37304a0(i);
            } else {
                this.f25668k = i3 + i;
            }
        }

        /* renamed from: a */
        public void mo37246a(int i) throws InvalidProtocolBufferException {
            if (this.f25669l != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            throw new java.lang.IllegalStateException(r8.f25664g.getClass() + "#skip returned invalid result: " + r0 + "\nThe InputStream implementation is buggy.");
         */
        /* renamed from: a0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo37304a0(int r9) throws java.io.IOException {
            /*
                r8 = this;
                if (r9 < 0) goto L_0x0097
                int r0 = r8.f25670m
                int r1 = r8.f25668k
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.f25671n
                if (r2 > r3) goto L_0x008d
                com.google.protobuf.g$d$a r2 = r8.f25672o
                r3 = 0
                if (r2 != 0) goto L_0x006f
                int r0 = r0 + r1
                r8.f25670m = r0
                int r0 = r8.f25666i
                int r0 = r0 - r1
                r8.f25666i = r3
                r8.f25668k = r3
                r3 = r0
            L_0x001d:
                if (r3 >= r9) goto L_0x0067
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.f25664g     // Catch:{ all -> 0x005d }
                long r4 = (long) r0     // Catch:{ all -> 0x005d }
                long r0 = m39456X(r1, r4)     // Catch:{ all -> 0x005d }
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L_0x0038
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 > 0) goto L_0x0038
                if (r2 != 0) goto L_0x0035
                goto L_0x0067
            L_0x0035:
                int r0 = (int) r0     // Catch:{ all -> 0x005d }
                int r3 = r3 + r0
                goto L_0x001d
            L_0x0038:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
                r2.<init>()     // Catch:{ all -> 0x005d }
                java.io.InputStream r4 = r8.f25664g     // Catch:{ all -> 0x005d }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x005d }
                r2.append(r4)     // Catch:{ all -> 0x005d }
                java.lang.String r4 = "#skip returned invalid result: "
                r2.append(r4)     // Catch:{ all -> 0x005d }
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = "\nThe InputStream implementation is buggy."
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x005d }
                r9.<init>(r0)     // Catch:{ all -> 0x005d }
                throw r9     // Catch:{ all -> 0x005d }
            L_0x005d:
                r9 = move-exception
                int r0 = r8.f25670m
                int r0 = r0 + r3
                r8.f25670m = r0
                r8.mo37300V()
                throw r9
            L_0x0067:
                int r0 = r8.f25670m
                int r0 = r0 + r3
                r8.f25670m = r0
                r8.mo37300V()
            L_0x006f:
                if (r3 >= r9) goto L_0x008c
                int r0 = r8.f25666i
                int r1 = r8.f25668k
                int r1 = r0 - r1
                r8.f25668k = r0
                r0 = 1
                r8.mo37301W(r0)
            L_0x007d:
                int r2 = r9 - r1
                int r3 = r8.f25666i
                if (r2 <= r3) goto L_0x008a
                int r1 = r1 + r3
                r8.f25668k = r3
                r8.mo37301W(r0)
                goto L_0x007d
            L_0x008a:
                r8.f25668k = r2
            L_0x008c:
                return
            L_0x008d:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.mo37303Z(r3)
                com.google.protobuf.InvalidProtocolBufferException r9 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r9
            L_0x0097:
                com.google.protobuf.InvalidProtocolBufferException r9 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4969g.C4973d.mo37304a0(int):void");
        }

        /* renamed from: b0 */
        public final void mo37305b0() throws IOException {
            if (this.f25666i - this.f25668k >= 10) {
                mo37306c0();
            } else {
                mo37307d0();
            }
        }

        /* renamed from: c0 */
        public final void mo37306c0() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f25665h;
                int i2 = this.f25668k;
                this.f25668k = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: d */
        public int mo37247d() {
            return this.f25670m + this.f25668k;
        }

        /* renamed from: d0 */
        public final void mo37307d0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo37291M() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: e */
        public boolean mo37248e() throws IOException {
            if (this.f25668k != this.f25666i || mo37308e0(1)) {
                return false;
            }
            return true;
        }

        /* renamed from: e0 */
        public final boolean mo37308e0(int i) throws IOException {
            int i2 = this.f25668k;
            if (i2 + i > this.f25666i) {
                int i3 = this.f25637c;
                int i4 = this.f25670m;
                if (i > (i3 - i4) - i2 || i4 + i2 + i > this.f25671n) {
                    return false;
                }
                C4974a aVar = this.f25672o;
                if (aVar != null) {
                    aVar.mo37309a();
                }
                int i5 = this.f25668k;
                if (i5 > 0) {
                    int i6 = this.f25666i;
                    if (i6 > i5) {
                        byte[] bArr = this.f25665h;
                        System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                    }
                    this.f25670m += i5;
                    this.f25666i -= i5;
                    this.f25668k = 0;
                }
                InputStream inputStream = this.f25664g;
                byte[] bArr2 = this.f25665h;
                int i7 = this.f25666i;
                int K = m39455K(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.f25637c - this.f25670m) - i7));
                if (K == 0 || K < -1 || K > this.f25665h.length) {
                    throw new IllegalStateException(this.f25664g.getClass() + "#read(byte[]) returned invalid result: " + K + "\nThe InputStream implementation is buggy.");
                } else if (K <= 0) {
                    return false;
                } else {
                    this.f25666i += K;
                    mo37300V();
                    if (this.f25666i >= i) {
                        return true;
                    }
                    return mo37308e0(i);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
        }

        /* renamed from: n */
        public void mo37249n(int i) {
            this.f25671n = i;
            mo37300V();
        }

        /* renamed from: o */
        public int mo37250o(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = i + this.f25670m + this.f25668k;
                int i3 = this.f25671n;
                if (i2 <= i3) {
                    this.f25671n = i2;
                    mo37300V();
                    return i3;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: p */
        public boolean mo37251p() throws IOException {
            if (mo37298T() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: q */
        public ByteString mo37252q() throws IOException {
            int S = mo37297S();
            int i = this.f25666i;
            int i2 = this.f25668k;
            if (S <= i - i2 && S > 0) {
                ByteString copyFrom = ByteString.copyFrom(this.f25665h, i2, S);
                this.f25668k += S;
                return copyFrom;
            } else if (S == 0) {
                return ByteString.EMPTY;
            } else {
                return mo37290L(S);
            }
        }

        /* renamed from: r */
        public double mo37253r() throws IOException {
            return Double.longBitsToDouble(mo37296R());
        }

        /* renamed from: s */
        public int mo37254s() throws IOException {
            return mo37297S();
        }

        /* renamed from: t */
        public int mo37255t() throws IOException {
            return mo37295Q();
        }

        /* renamed from: u */
        public long mo37256u() throws IOException {
            return mo37296R();
        }

        /* renamed from: v */
        public float mo37257v() throws IOException {
            return Float.intBitsToFloat(mo37295Q());
        }

        /* renamed from: w */
        public int mo37258w() throws IOException {
            return mo37297S();
        }

        /* renamed from: x */
        public long mo37259x() throws IOException {
            return mo37298T();
        }

        /* renamed from: z */
        public int mo37260z() throws IOException {
            return mo37295Q();
        }

        public C4973d(InputStream inputStream, int i) {
            super();
            this.f25671n = Integer.MAX_VALUE;
            this.f25672o = null;
            C5011t.m39928b(inputStream, "input");
            this.f25664g = inputStream;
            this.f25665h = new byte[i];
            this.f25666i = 0;
            this.f25668k = 0;
            this.f25670m = 0;
        }
    }

    /* renamed from: com.google.protobuf.g$e */
    /* compiled from: CodedInputStream */
    public static final class C4975e extends C4969g {

        /* renamed from: g */
        public final ByteBuffer f25673g;

        /* renamed from: h */
        public final boolean f25674h;

        /* renamed from: i */
        public final long f25675i;

        /* renamed from: j */
        public long f25676j;

        /* renamed from: k */
        public long f25677k;

        /* renamed from: l */
        public long f25678l;

        /* renamed from: m */
        public int f25679m;

        /* renamed from: n */
        public int f25680n;

        /* renamed from: o */
        public boolean f25681o;

        /* renamed from: p */
        public int f25682p;

        /* renamed from: K */
        public static boolean m39501K() {
            return p47.m49690J();
        }

        /* renamed from: A */
        public long mo37237A() throws IOException {
            return mo37313N();
        }

        /* renamed from: B */
        public int mo37238B() throws IOException {
            return C4969g.m39342b(mo37314O());
        }

        /* renamed from: C */
        public long mo37239C() throws IOException {
            return C4969g.m39343c(mo37315P());
        }

        /* renamed from: D */
        public String mo37240D() throws IOException {
            int O = mo37314O();
            if (O > 0 && O <= mo37318S()) {
                byte[] bArr = new byte[O];
                long j = (long) O;
                p47.m49721p(this.f25677k, bArr, 0, j);
                String str = new String(bArr, C5011t.f25748b);
                this.f25677k += j;
                return str;
            } else if (O == 0) {
                return "";
            } else {
                if (O < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: E */
        public String mo37241E() throws IOException {
            int O = mo37314O();
            if (O > 0 && O <= mo37318S()) {
                String g = Utf8.m38985g(this.f25673g, mo37310J(this.f25677k), O);
                this.f25677k += (long) O;
                return g;
            } else if (O == 0) {
                return "";
            } else {
                if (O <= 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: F */
        public int mo37242F() throws IOException {
            if (mo37248e()) {
                this.f25680n = 0;
                return 0;
            }
            int O = mo37314O();
            this.f25680n = O;
            if (WireFormat.m39050a(O) != 0) {
                return this.f25680n;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: G */
        public int mo37243G() throws IOException {
            return mo37314O();
        }

        /* renamed from: H */
        public long mo37244H() throws IOException {
            return mo37315P();
        }

        /* renamed from: I */
        public boolean mo37245I(int i) throws IOException {
            int b = WireFormat.m39051b(i);
            if (b == 0) {
                mo37321V();
                return true;
            } else if (b == 1) {
                mo37320U(8);
                return true;
            } else if (b == 2) {
                mo37320U(mo37314O());
                return true;
            } else if (b == 3) {
                mo37319T();
                mo37246a(WireFormat.m39052c(WireFormat.m39050a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo37320U(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: J */
        public final int mo37310J(long j) {
            return (int) (j - this.f25675i);
        }

        /* renamed from: L */
        public byte mo37311L() throws IOException {
            long j = this.f25677k;
            if (j != this.f25676j) {
                this.f25677k = 1 + j;
                return p47.m49728w(j);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: M */
        public int mo37312M() throws IOException {
            long j = this.f25677k;
            if (this.f25676j - j >= 4) {
                this.f25677k = 4 + j;
                return ((p47.m49728w(j + 3) & 255) << 24) | (p47.m49728w(j) & 255) | ((p47.m49728w(1 + j) & 255) << 8) | ((p47.m49728w(2 + j) & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: N */
        public long mo37313N() throws IOException {
            long j = this.f25677k;
            if (this.f25676j - j >= 8) {
                this.f25677k = 8 + j;
                return ((((long) p47.m49728w(j + 7)) & 255) << 56) | (((long) p47.m49728w(j)) & 255) | ((((long) p47.m49728w(1 + j)) & 255) << 8) | ((((long) p47.m49728w(2 + j)) & 255) << 16) | ((((long) p47.m49728w(3 + j)) & 255) << 24) | ((((long) p47.m49728w(4 + j)) & 255) << 32) | ((((long) p47.m49728w(5 + j)) & 255) << 40) | ((((long) p47.m49728w(6 + j)) & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (p000.p47.m49728w(r4) < 0) goto L_0x0085;
         */
        /* renamed from: O */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo37314O() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f25677k
                long r2 = r10.f25676j
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = p000.p47.m49728w(r0)
                if (r0 < 0) goto L_0x0017
                r10.f25677k = r4
                return r0
            L_0x0017:
                long r6 = r10.f25676j
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = p000.p47.m49728w(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = p000.p47.m49728w(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = p000.p47.m49728w(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = p000.p47.m49728w(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = p000.p47.m49728w(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = p000.p47.m49728w(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = p000.p47.m49728w(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = p000.p47.m49728w(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = p000.p47.m49728w(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.mo37316Q()
                int r0 = (int) r0
                return r0
            L_0x008b:
                r10.f25677k = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4969g.C4975e.mo37314O():int");
        }

        /* renamed from: P */
        public long mo37315P() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f25677k;
            if (this.f25676j != j4) {
                long j5 = j4 + 1;
                byte w = p47.m49728w(j4);
                if (w >= 0) {
                    this.f25677k = j5;
                    return (long) w;
                } else if (this.f25676j - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte w2 = w ^ (p47.m49728w(j5) << 7);
                    if (w2 < 0) {
                        b = w2 ^ Byte.MIN_VALUE;
                    } else {
                        long j7 = j6 + 1;
                        byte w3 = w2 ^ (p47.m49728w(j6) << 14);
                        if (w3 >= 0) {
                            j = (long) (w3 ^ 16256);
                        } else {
                            j6 = j7 + 1;
                            byte w4 = w3 ^ (p47.m49728w(j7) << 21);
                            if (w4 < 0) {
                                b = w4 ^ -2080896;
                            } else {
                                j7 = j6 + 1;
                                long w5 = ((long) w4) ^ (((long) p47.m49728w(j6)) << 28);
                                if (w5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long w6 = w5 ^ (((long) p47.m49728w(j7)) << 35);
                                    if (w6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        w5 = w6 ^ (((long) p47.m49728w(j8)) << 42);
                                        if (w5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            w6 = w5 ^ (((long) p47.m49728w(j7)) << 49);
                                            if (w6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (w6 ^ (((long) p47.m49728w(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) p47.m49728w(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f25677k = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = w6 ^ j2;
                                    j6 = j8;
                                    this.f25677k = j6;
                                    return j;
                                }
                                j = w5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f25677k = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f25677k = j6;
                    return j;
                }
            }
            return mo37316Q();
        }

        /* renamed from: Q */
        public long mo37316Q() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte L = mo37311L();
                j |= ((long) (L & Byte.MAX_VALUE)) << i;
                if ((L & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: R */
        public final void mo37317R() {
            long j = this.f25676j + ((long) this.f25679m);
            this.f25676j = j;
            int i = (int) (j - this.f25678l);
            int i2 = this.f25682p;
            if (i > i2) {
                int i3 = i - i2;
                this.f25679m = i3;
                this.f25676j = j - ((long) i3);
                return;
            }
            this.f25679m = 0;
        }

        /* renamed from: S */
        public final int mo37318S() {
            return (int) (this.f25676j - this.f25677k);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: T */
        public void mo37319T() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo37242F()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo37245I(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4969g.C4975e.mo37319T():void");
        }

        /* renamed from: U */
        public void mo37320U(int i) throws IOException {
            if (i >= 0 && i <= mo37318S()) {
                this.f25677k += (long) i;
            } else if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: V */
        public final void mo37321V() throws IOException {
            if (mo37318S() >= 10) {
                mo37322W();
            } else {
                mo37323X();
            }
        }

        /* renamed from: W */
        public final void mo37322W() throws IOException {
            int i = 0;
            while (i < 10) {
                long j = this.f25677k;
                this.f25677k = 1 + j;
                if (p47.m49728w(j) < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: X */
        public final void mo37323X() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo37311L() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: Y */
        public final ByteBuffer mo37324Y(long j, long j2) throws IOException {
            int position = this.f25673g.position();
            int limit = this.f25673g.limit();
            ByteBuffer byteBuffer = this.f25673g;
            try {
                byteBuffer.position(mo37310J(j));
                byteBuffer.limit(mo37310J(j2));
                ByteBuffer slice = this.f25673g.slice();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
                return slice;
            } catch (IllegalArgumentException e) {
                InvalidProtocolBufferException truncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                truncatedMessage.initCause(e);
                throw truncatedMessage;
            } catch (Throwable th) {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
                throw th;
            }
        }

        /* renamed from: a */
        public void mo37246a(int i) throws InvalidProtocolBufferException {
            if (this.f25680n != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* renamed from: d */
        public int mo37247d() {
            return (int) (this.f25677k - this.f25678l);
        }

        /* renamed from: e */
        public boolean mo37248e() throws IOException {
            if (this.f25677k == this.f25676j) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        public void mo37249n(int i) {
            this.f25682p = i;
            mo37317R();
        }

        /* renamed from: o */
        public int mo37250o(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int d = i + mo37247d();
                int i2 = this.f25682p;
                if (d <= i2) {
                    this.f25682p = d;
                    mo37317R();
                    return i2;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: p */
        public boolean mo37251p() throws IOException {
            if (mo37315P() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: q */
        public ByteString mo37252q() throws IOException {
            int O = mo37314O();
            if (O <= 0 || O > mo37318S()) {
                if (O == 0) {
                    return ByteString.EMPTY;
                }
                if (O < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (!this.f25674h || !this.f25681o) {
                byte[] bArr = new byte[O];
                long j = (long) O;
                p47.m49721p(this.f25677k, bArr, 0, j);
                this.f25677k += j;
                return ByteString.wrap(bArr);
            } else {
                long j2 = this.f25677k;
                long j3 = (long) O;
                ByteBuffer Y = mo37324Y(j2, j2 + j3);
                this.f25677k += j3;
                return ByteString.wrap(Y);
            }
        }

        /* renamed from: r */
        public double mo37253r() throws IOException {
            return Double.longBitsToDouble(mo37313N());
        }

        /* renamed from: s */
        public int mo37254s() throws IOException {
            return mo37314O();
        }

        /* renamed from: t */
        public int mo37255t() throws IOException {
            return mo37312M();
        }

        /* renamed from: u */
        public long mo37256u() throws IOException {
            return mo37313N();
        }

        /* renamed from: v */
        public float mo37257v() throws IOException {
            return Float.intBitsToFloat(mo37312M());
        }

        /* renamed from: w */
        public int mo37258w() throws IOException {
            return mo37314O();
        }

        /* renamed from: x */
        public long mo37259x() throws IOException {
            return mo37315P();
        }

        /* renamed from: z */
        public int mo37260z() throws IOException {
            return mo37312M();
        }

        public C4975e(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f25682p = Integer.MAX_VALUE;
            this.f25673g = byteBuffer;
            long k = p47.m49716k(byteBuffer);
            this.f25675i = k;
            this.f25676j = ((long) byteBuffer.limit()) + k;
            long position = k + ((long) byteBuffer.position());
            this.f25677k = position;
            this.f25678l = position;
            this.f25674h = z;
        }
    }

    /* renamed from: b */
    public static int m39342b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m39343c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: f */
    public static C4969g m39344f(InputStream inputStream) {
        return m39345g(inputStream, 4096);
    }

    /* renamed from: g */
    public static C4969g m39345g(InputStream inputStream, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        } else if (inputStream == null) {
            return m39349k(C5011t.f25750d);
        } else {
            return new C4973d(inputStream, i);
        }
    }

    /* renamed from: h */
    public static C4969g m39346h(Iterable<ByteBuffer> iterable, boolean z) {
        boolean z2 = false;
        int i = 0;
        for (ByteBuffer next : iterable) {
            i += next.remaining();
            if (next.hasArray()) {
                z2 |= true;
            } else if (next.isDirect()) {
                z2 |= true;
            } else {
                z2 |= true;
            }
        }
        if (z2) {
            return new C4972c(iterable, i, z);
        }
        return m39344f(new oz2(iterable));
    }

    /* renamed from: i */
    public static C4969g m39347i(ByteBuffer byteBuffer) {
        return m39348j(byteBuffer, false);
    }

    /* renamed from: j */
    public static C4969g m39348j(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m39351m(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && C4975e.m39501K()) {
            return new C4975e(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m39351m(bArr, 0, remaining, true);
    }

    /* renamed from: k */
    public static C4969g m39349k(byte[] bArr) {
        return m39350l(bArr, 0, bArr.length);
    }

    /* renamed from: l */
    public static C4969g m39350l(byte[] bArr, int i, int i2) {
        return m39351m(bArr, i, i2, false);
    }

    /* renamed from: m */
    public static C4969g m39351m(byte[] bArr, int i, int i2, boolean z) {
        C4971b bVar = new C4971b(bArr, i, i2, z);
        try {
            bVar.mo37250o(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: y */
    public static int m39352y(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if ((read2 & 128) == 0) {
                return i2;
            } else {
                i3 += 7;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* renamed from: A */
    public abstract long mo37237A() throws IOException;

    /* renamed from: B */
    public abstract int mo37238B() throws IOException;

    /* renamed from: C */
    public abstract long mo37239C() throws IOException;

    /* renamed from: D */
    public abstract String mo37240D() throws IOException;

    /* renamed from: E */
    public abstract String mo37241E() throws IOException;

    /* renamed from: F */
    public abstract int mo37242F() throws IOException;

    /* renamed from: G */
    public abstract int mo37243G() throws IOException;

    /* renamed from: H */
    public abstract long mo37244H() throws IOException;

    /* renamed from: I */
    public abstract boolean mo37245I(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo37246a(int i) throws InvalidProtocolBufferException;

    /* renamed from: d */
    public abstract int mo37247d();

    /* renamed from: e */
    public abstract boolean mo37248e() throws IOException;

    /* renamed from: n */
    public abstract void mo37249n(int i);

    /* renamed from: o */
    public abstract int mo37250o(int i) throws InvalidProtocolBufferException;

    /* renamed from: p */
    public abstract boolean mo37251p() throws IOException;

    /* renamed from: q */
    public abstract ByteString mo37252q() throws IOException;

    /* renamed from: r */
    public abstract double mo37253r() throws IOException;

    /* renamed from: s */
    public abstract int mo37254s() throws IOException;

    /* renamed from: t */
    public abstract int mo37255t() throws IOException;

    /* renamed from: u */
    public abstract long mo37256u() throws IOException;

    /* renamed from: v */
    public abstract float mo37257v() throws IOException;

    /* renamed from: w */
    public abstract int mo37258w() throws IOException;

    /* renamed from: x */
    public abstract long mo37259x() throws IOException;

    /* renamed from: z */
    public abstract int mo37260z() throws IOException;

    public C4969g() {
        this.f25636b = f25634f;
        this.f25637c = Integer.MAX_VALUE;
        this.f25639e = false;
    }
}

package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.g */
/* compiled from: CodedInputStream */
public abstract class C4717g {

    /* renamed from: f */
    public static volatile int f25179f = 100;

    /* renamed from: a */
    public int f25180a;

    /* renamed from: b */
    public int f25181b;

    /* renamed from: c */
    public int f25182c;

    /* renamed from: d */
    public C4725h f25183d;

    /* renamed from: e */
    public boolean f25184e;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g$b */
    /* compiled from: CodedInputStream */
    public static final class C4719b extends C4717g {

        /* renamed from: g */
        public final byte[] f25185g;

        /* renamed from: h */
        public final boolean f25186h;

        /* renamed from: i */
        public int f25187i;

        /* renamed from: j */
        public int f25188j;

        /* renamed from: k */
        public int f25189k;

        /* renamed from: l */
        public int f25190l;

        /* renamed from: m */
        public int f25191m;

        /* renamed from: n */
        public boolean f25192n;

        /* renamed from: o */
        public int f25193o;

        /* renamed from: A */
        public long mo35779A() throws IOException {
            return C4717g.m37755c(mo35808M());
        }

        /* renamed from: B */
        public String mo35780B() throws IOException {
            int L = mo35807L();
            if (L > 0) {
                int i = this.f25187i;
                int i2 = this.f25189k;
                if (L <= i - i2) {
                    String str = new String(this.f25185g, i2, L, C4758t.f25292b);
                    this.f25189k += L;
                    return str;
                }
            }
            if (L == 0) {
                return "";
            }
            if (L < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: C */
        public String mo35781C() throws IOException {
            int L = mo35807L();
            if (L > 0) {
                int i = this.f25187i;
                int i2 = this.f25189k;
                if (L <= i - i2) {
                    String h = Utf8.m37395h(this.f25185g, i2, L);
                    this.f25189k += L;
                    return h;
                }
            }
            if (L == 0) {
                return "";
            }
            if (L <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: D */
        public int mo35782D() throws IOException {
            if (mo35788e()) {
                this.f25191m = 0;
                return 0;
            }
            int L = mo35807L();
            this.f25191m = L;
            if (WireFormat.m37459a(L) != 0) {
                return this.f25191m;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: E */
        public int mo35783E() throws IOException {
            return mo35807L();
        }

        /* renamed from: F */
        public long mo35784F() throws IOException {
            return mo35808M();
        }

        /* renamed from: G */
        public boolean mo35785G(int i) throws IOException {
            int b = WireFormat.m37460b(i);
            if (b == 0) {
                mo35813R();
                return true;
            } else if (b == 1) {
                mo35812Q(8);
                return true;
            } else if (b == 2) {
                mo35812Q(mo35807L());
                return true;
            } else if (b == 3) {
                mo35811P();
                mo35786a(WireFormat.m37461c(WireFormat.m37459a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo35812Q(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: H */
        public byte mo35803H() throws IOException {
            int i = this.f25189k;
            if (i != this.f25187i) {
                byte[] bArr = this.f25185g;
                this.f25189k = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: I */
        public byte[] mo35804I(int i) throws IOException {
            if (i > 0) {
                int i2 = this.f25187i;
                int i3 = this.f25189k;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f25189k = i4;
                    return Arrays.copyOfRange(this.f25185g, i3, i4);
                }
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (i == 0) {
                return C4758t.f25294d;
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        /* renamed from: J */
        public int mo35805J() throws IOException {
            int i = this.f25189k;
            if (this.f25187i - i >= 4) {
                byte[] bArr = this.f25185g;
                this.f25189k = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: K */
        public long mo35806K() throws IOException {
            int i = this.f25189k;
            if (this.f25187i - i >= 8) {
                byte[] bArr = this.f25185g;
                this.f25189k = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: L */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo35807L() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f25189k
                int r1 = r5.f25187i
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f25185g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f25189k = r3
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
                long r0 = r5.mo35809N()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f25189k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4717g.C4719b.mo35807L():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: M */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo35808M() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f25189k
                int r1 = r11.f25187i
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f25185g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f25189k = r3
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
                long r0 = r11.mo35809N()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f25189k = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4717g.C4719b.mo35808M():long");
        }

        /* renamed from: N */
        public long mo35809N() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte H = mo35803H();
                j |= ((long) (H & Byte.MAX_VALUE)) << i;
                if ((H & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: O */
        public final void mo35810O() {
            int i = this.f25187i + this.f25188j;
            this.f25187i = i;
            int i2 = i - this.f25190l;
            int i3 = this.f25193o;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f25188j = i4;
                this.f25187i = i - i4;
                return;
            }
            this.f25188j = 0;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: P */
        public void mo35811P() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo35782D()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo35785G(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4717g.C4719b.mo35811P():void");
        }

        /* renamed from: Q */
        public void mo35812Q(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f25187i;
                int i3 = this.f25189k;
                if (i <= i2 - i3) {
                    this.f25189k = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: R */
        public final void mo35813R() throws IOException {
            if (this.f25187i - this.f25189k >= 10) {
                mo35814S();
            } else {
                mo35815T();
            }
        }

        /* renamed from: S */
        public final void mo35814S() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f25185g;
                int i2 = this.f25189k;
                this.f25189k = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: T */
        public final void mo35815T() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo35803H() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: a */
        public void mo35786a(int i) throws InvalidProtocolBufferException {
            if (this.f25191m != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* renamed from: d */
        public int mo35787d() {
            return this.f25189k - this.f25190l;
        }

        /* renamed from: e */
        public boolean mo35788e() throws IOException {
            if (this.f25189k == this.f25187i) {
                return true;
            }
            return false;
        }

        /* renamed from: m */
        public void mo35789m(int i) {
            this.f25193o = i;
            mo35810O();
        }

        /* renamed from: n */
        public int mo35790n(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int d = i + mo35787d();
                if (d >= 0) {
                    int i2 = this.f25193o;
                    if (d <= i2) {
                        this.f25193o = d;
                        mo35810O();
                        return i2;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.parseFailure();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: o */
        public boolean mo35791o() throws IOException {
            if (mo35808M() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: p */
        public ByteString mo35792p() throws IOException {
            ByteString byteString;
            int L = mo35807L();
            if (L > 0) {
                int i = this.f25187i;
                int i2 = this.f25189k;
                if (L <= i - i2) {
                    if (!this.f25186h || !this.f25192n) {
                        byteString = ByteString.copyFrom(this.f25185g, i2, L);
                    } else {
                        byteString = ByteString.wrap(this.f25185g, i2, L);
                    }
                    this.f25189k += L;
                    return byteString;
                }
            }
            if (L == 0) {
                return ByteString.EMPTY;
            }
            return ByteString.wrap(mo35804I(L));
        }

        /* renamed from: q */
        public double mo35793q() throws IOException {
            return Double.longBitsToDouble(mo35806K());
        }

        /* renamed from: r */
        public int mo35794r() throws IOException {
            return mo35807L();
        }

        /* renamed from: s */
        public int mo35795s() throws IOException {
            return mo35805J();
        }

        /* renamed from: t */
        public long mo35796t() throws IOException {
            return mo35806K();
        }

        /* renamed from: u */
        public float mo35797u() throws IOException {
            return Float.intBitsToFloat(mo35805J());
        }

        /* renamed from: v */
        public int mo35798v() throws IOException {
            return mo35807L();
        }

        /* renamed from: w */
        public long mo35799w() throws IOException {
            return mo35808M();
        }

        /* renamed from: x */
        public int mo35800x() throws IOException {
            return mo35805J();
        }

        /* renamed from: y */
        public long mo35801y() throws IOException {
            return mo35806K();
        }

        /* renamed from: z */
        public int mo35802z() throws IOException {
            return C4717g.m37754b(mo35807L());
        }

        public C4719b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f25193o = Integer.MAX_VALUE;
            this.f25185g = bArr;
            this.f25187i = i2 + i;
            this.f25189k = i;
            this.f25190l = i;
            this.f25186h = z;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g$c */
    /* compiled from: CodedInputStream */
    public static final class C4720c extends C4717g {

        /* renamed from: g */
        public final Iterable<ByteBuffer> f25194g;

        /* renamed from: h */
        public final Iterator<ByteBuffer> f25195h;

        /* renamed from: i */
        public ByteBuffer f25196i;

        /* renamed from: j */
        public final boolean f25197j;

        /* renamed from: k */
        public boolean f25198k;

        /* renamed from: l */
        public int f25199l;

        /* renamed from: m */
        public int f25200m;

        /* renamed from: n */
        public int f25201n;

        /* renamed from: o */
        public int f25202o;

        /* renamed from: p */
        public int f25203p;

        /* renamed from: q */
        public int f25204q;

        /* renamed from: r */
        public long f25205r;

        /* renamed from: s */
        public long f25206s;

        /* renamed from: t */
        public long f25207t;

        /* renamed from: u */
        public long f25208u;

        /* renamed from: A */
        public long mo35779A() throws IOException {
            return C4717g.m37755c(mo35823O());
        }

        /* renamed from: B */
        public String mo35780B() throws IOException {
            int N = mo35822N();
            if (N > 0) {
                long j = (long) N;
                long j2 = this.f25208u;
                long j3 = this.f25205r;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[N];
                    q47.m50268p(j3, bArr, 0, j);
                    String str = new String(bArr, C4758t.f25292b);
                    this.f25205r += j;
                    return str;
                }
            }
            if (N > 0 && N <= mo35826R()) {
                byte[] bArr2 = new byte[N];
                mo35819K(bArr2, 0, N);
                return new String(bArr2, C4758t.f25292b);
            } else if (N == 0) {
                return "";
            } else {
                if (N < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: C */
        public String mo35781C() throws IOException {
            int N = mo35822N();
            if (N > 0) {
                long j = (long) N;
                long j2 = this.f25208u;
                long j3 = this.f25205r;
                if (j <= j2 - j3) {
                    String g = Utf8.m37394g(this.f25196i, (int) (j3 - this.f25206s), N);
                    this.f25205r += j;
                    return g;
                }
            }
            if (N >= 0 && N <= mo35826R()) {
                byte[] bArr = new byte[N];
                mo35819K(bArr, 0, N);
                return Utf8.m37395h(bArr, 0, N);
            } else if (N == 0) {
                return "";
            } else {
                if (N <= 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: D */
        public int mo35782D() throws IOException {
            if (mo35788e()) {
                this.f25202o = 0;
                return 0;
            }
            int N = mo35822N();
            this.f25202o = N;
            if (WireFormat.m37459a(N) != 0) {
                return this.f25202o;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: E */
        public int mo35783E() throws IOException {
            return mo35822N();
        }

        /* renamed from: F */
        public long mo35784F() throws IOException {
            return mo35823O();
        }

        /* renamed from: G */
        public boolean mo35785G(int i) throws IOException {
            int b = WireFormat.m37460b(i);
            if (b == 0) {
                mo35829U();
                return true;
            } else if (b == 1) {
                mo35828T(8);
                return true;
            } else if (b == 2) {
                mo35828T(mo35822N());
                return true;
            } else if (b == 3) {
                mo35827S();
                mo35786a(WireFormat.m37461c(WireFormat.m37459a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo35828T(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: H */
        public final long mo35816H() {
            return this.f25208u - this.f25205r;
        }

        /* renamed from: I */
        public final void mo35817I() throws InvalidProtocolBufferException {
            if (this.f25195h.hasNext()) {
                mo35831W();
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: J */
        public byte mo35818J() throws IOException {
            if (mo35816H() == 0) {
                mo35817I();
            }
            long j = this.f25205r;
            this.f25205r = 1 + j;
            return q47.m50275w(j);
        }

        /* renamed from: K */
        public final void mo35819K(byte[] bArr, int i, int i2) throws IOException {
            if (i2 >= 0 && i2 <= mo35826R()) {
                int i3 = i2;
                while (i3 > 0) {
                    if (mo35816H() == 0) {
                        mo35817I();
                    }
                    int min = Math.min(i3, (int) mo35816H());
                    long j = (long) min;
                    q47.m50268p(this.f25205r, bArr, (long) ((i2 - i3) + i), j);
                    i3 -= min;
                    this.f25205r += j;
                }
            } else if (i2 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (i2 != 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        /* renamed from: L */
        public int mo35820L() throws IOException {
            if (mo35816H() < 4) {
                return (mo35818J() & 255) | ((mo35818J() & 255) << 8) | ((mo35818J() & 255) << 16) | ((mo35818J() & 255) << 24);
            }
            long j = this.f25205r;
            this.f25205r = 4 + j;
            return ((q47.m50275w(j + 3) & 255) << 24) | (q47.m50275w(j) & 255) | ((q47.m50275w(1 + j) & 255) << 8) | ((q47.m50275w(2 + j) & 255) << 16);
        }

        /* renamed from: M */
        public long mo35821M() throws IOException {
            long J;
            byte J2;
            if (mo35816H() >= 8) {
                long j = this.f25205r;
                this.f25205r = 8 + j;
                J = (((long) q47.m50275w(j)) & 255) | ((((long) q47.m50275w(1 + j)) & 255) << 8) | ((((long) q47.m50275w(2 + j)) & 255) << 16) | ((((long) q47.m50275w(3 + j)) & 255) << 24) | ((((long) q47.m50275w(4 + j)) & 255) << 32) | ((((long) q47.m50275w(5 + j)) & 255) << 40) | ((((long) q47.m50275w(6 + j)) & 255) << 48);
                J2 = q47.m50275w(j + 7);
            } else {
                J = (((long) mo35818J()) & 255) | ((((long) mo35818J()) & 255) << 8) | ((((long) mo35818J()) & 255) << 16) | ((((long) mo35818J()) & 255) << 24) | ((((long) mo35818J()) & 255) << 32) | ((((long) mo35818J()) & 255) << 40) | ((((long) mo35818J()) & 255) << 48);
                J2 = mo35818J();
            }
            return ((((long) J2) & 255) << 56) | J;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
            if (p000.q47.m50275w(r4) < 0) goto L_0x008a;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo35822N() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f25205r
                long r2 = r10.f25208u
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x008a
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = p000.q47.m50275w(r0)
                if (r0 < 0) goto L_0x001a
                long r4 = r10.f25205r
                long r4 = r4 + r2
                r10.f25205r = r4
                return r0
            L_0x001a:
                long r6 = r10.f25208u
                long r8 = r10.f25205r
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0026
                goto L_0x008a
            L_0x0026:
                long r6 = r4 + r2
                byte r1 = p000.q47.m50275w(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0034
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0090
            L_0x0034:
                long r4 = r6 + r2
                byte r1 = p000.q47.m50275w(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0043
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x0041:
                r6 = r4
                goto L_0x0090
            L_0x0043:
                long r6 = r4 + r2
                byte r1 = p000.q47.m50275w(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0053
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x0090
            L_0x0053:
                long r4 = r6 + r2
                byte r1 = p000.q47.m50275w(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = p000.q47.m50275w(r4)
                if (r1 >= 0) goto L_0x0090
                long r4 = r6 + r2
                byte r1 = p000.q47.m50275w(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = p000.q47.m50275w(r4)
                if (r1 >= 0) goto L_0x0090
                long r4 = r6 + r2
                byte r1 = p000.q47.m50275w(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = p000.q47.m50275w(r4)
                if (r1 >= 0) goto L_0x0090
            L_0x008a:
                long r0 = r10.mo35824P()
                int r0 = (int) r0
                return r0
            L_0x0090:
                r10.f25205r = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4717g.C4720c.mo35822N():int");
        }

        /* renamed from: O */
        public long mo35823O() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f25205r;
            if (this.f25208u != j4) {
                long j5 = j4 + 1;
                byte w = q47.m50275w(j4);
                if (w >= 0) {
                    this.f25205r++;
                    return (long) w;
                } else if (this.f25208u - this.f25205r >= 10) {
                    long j6 = j5 + 1;
                    byte w2 = w ^ (q47.m50275w(j5) << 7);
                    if (w2 < 0) {
                        b = w2 ^ Byte.MIN_VALUE;
                    } else {
                        long j7 = j6 + 1;
                        byte w3 = w2 ^ (q47.m50275w(j6) << 14);
                        if (w3 >= 0) {
                            j = (long) (w3 ^ 16256);
                        } else {
                            j6 = j7 + 1;
                            byte w4 = w3 ^ (q47.m50275w(j7) << 21);
                            if (w4 < 0) {
                                b = w4 ^ -2080896;
                            } else {
                                j7 = j6 + 1;
                                long w5 = ((long) w4) ^ (((long) q47.m50275w(j6)) << 28);
                                if (w5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long w6 = w5 ^ (((long) q47.m50275w(j7)) << 35);
                                    if (w6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        w5 = w6 ^ (((long) q47.m50275w(j8)) << 42);
                                        if (w5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            w6 = w5 ^ (((long) q47.m50275w(j7)) << 49);
                                            if (w6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (w6 ^ (((long) q47.m50275w(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) q47.m50275w(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f25205r = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = w6 ^ j2;
                                    j6 = j8;
                                    this.f25205r = j6;
                                    return j;
                                }
                                j = w5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f25205r = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f25205r = j6;
                    return j;
                }
            }
            return mo35824P();
        }

        /* renamed from: P */
        public long mo35824P() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo35818J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: Q */
        public final void mo35825Q() {
            int i = this.f25199l + this.f25200m;
            this.f25199l = i;
            int i2 = i - this.f25204q;
            int i3 = this.f25201n;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f25200m = i4;
                this.f25199l = i - i4;
                return;
            }
            this.f25200m = 0;
        }

        /* renamed from: R */
        public final int mo35826R() {
            return (int) ((((long) (this.f25199l - this.f25203p)) - this.f25205r) + this.f25206s);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: S */
        public void mo35827S() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo35782D()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo35785G(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4717g.C4720c.mo35827S():void");
        }

        /* renamed from: T */
        public void mo35828T(int i) throws IOException {
            if (i >= 0 && ((long) i) <= (((long) (this.f25199l - this.f25203p)) - this.f25205r) + this.f25206s) {
                while (i > 0) {
                    if (mo35816H() == 0) {
                        mo35817I();
                    }
                    int min = Math.min(i, (int) mo35816H());
                    i -= min;
                    this.f25205r += (long) min;
                }
            } else if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: U */
        public final void mo35829U() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo35818J() < 0) {
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
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
            r2.position(r0);
            r2.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0023 */
        /* renamed from: V */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.nio.ByteBuffer mo35830V(int r4, int r5) throws java.io.IOException {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f25196i
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f25196i
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f25196i
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0023 }
                r2.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0023 }
                java.nio.ByteBuffer r4 = r3.f25196i     // Catch:{ IllegalArgumentException -> 0x0023 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0023 }
                r2.position(r0)
                r2.limit(r1)
                return r4
            L_0x0021:
                r4 = move-exception
                goto L_0x0028
            L_0x0023:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()     // Catch:{ all -> 0x0021 }
                throw r4     // Catch:{ all -> 0x0021 }
            L_0x0028:
                r2.position(r0)
                r2.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4717g.C4720c.mo35830V(int, int):java.nio.ByteBuffer");
        }

        /* renamed from: W */
        public final void mo35831W() {
            ByteBuffer next = this.f25195h.next();
            this.f25196i = next;
            this.f25203p += (int) (this.f25205r - this.f25206s);
            long position = (long) next.position();
            this.f25205r = position;
            this.f25206s = position;
            this.f25208u = (long) this.f25196i.limit();
            long k = q47.m50263k(this.f25196i);
            this.f25207t = k;
            this.f25205r += k;
            this.f25206s += k;
            this.f25208u += k;
        }

        /* renamed from: a */
        public void mo35786a(int i) throws InvalidProtocolBufferException {
            if (this.f25202o != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* renamed from: d */
        public int mo35787d() {
            return (int) ((((long) (this.f25203p - this.f25204q)) + this.f25205r) - this.f25206s);
        }

        /* renamed from: e */
        public boolean mo35788e() throws IOException {
            if ((((long) this.f25203p) + this.f25205r) - this.f25206s == ((long) this.f25199l)) {
                return true;
            }
            return false;
        }

        /* renamed from: m */
        public void mo35789m(int i) {
            this.f25201n = i;
            mo35825Q();
        }

        /* renamed from: n */
        public int mo35790n(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int d = i + mo35787d();
                int i2 = this.f25201n;
                if (d <= i2) {
                    this.f25201n = d;
                    mo35825Q();
                    return i2;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: o */
        public boolean mo35791o() throws IOException {
            if (mo35823O() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: p */
        public ByteString mo35792p() throws IOException {
            int N = mo35822N();
            if (N > 0) {
                long j = (long) N;
                long j2 = this.f25208u;
                long j3 = this.f25205r;
                if (j <= j2 - j3) {
                    if (!this.f25197j || !this.f25198k) {
                        byte[] bArr = new byte[N];
                        q47.m50268p(j3, bArr, 0, j);
                        this.f25205r += j;
                        return ByteString.wrap(bArr);
                    }
                    int i = (int) (j3 - this.f25207t);
                    ByteString wrap = ByteString.wrap(mo35830V(i, N + i));
                    this.f25205r += j;
                    return wrap;
                }
            }
            if (N <= 0 || N > mo35826R()) {
                if (N == 0) {
                    return ByteString.EMPTY;
                }
                if (N < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (!this.f25197j || !this.f25198k) {
                byte[] bArr2 = new byte[N];
                mo35819K(bArr2, 0, N);
                return ByteString.wrap(bArr2);
            } else {
                ArrayList arrayList = new ArrayList();
                while (N > 0) {
                    if (mo35816H() == 0) {
                        mo35817I();
                    }
                    int min = Math.min(N, (int) mo35816H());
                    int i2 = (int) (this.f25205r - this.f25207t);
                    arrayList.add(ByteString.wrap(mo35830V(i2, i2 + min)));
                    N -= min;
                    this.f25205r += (long) min;
                }
                return ByteString.copyFrom((Iterable<ByteString>) arrayList);
            }
        }

        /* renamed from: q */
        public double mo35793q() throws IOException {
            return Double.longBitsToDouble(mo35821M());
        }

        /* renamed from: r */
        public int mo35794r() throws IOException {
            return mo35822N();
        }

        /* renamed from: s */
        public int mo35795s() throws IOException {
            return mo35820L();
        }

        /* renamed from: t */
        public long mo35796t() throws IOException {
            return mo35821M();
        }

        /* renamed from: u */
        public float mo35797u() throws IOException {
            return Float.intBitsToFloat(mo35820L());
        }

        /* renamed from: v */
        public int mo35798v() throws IOException {
            return mo35822N();
        }

        /* renamed from: w */
        public long mo35799w() throws IOException {
            return mo35823O();
        }

        /* renamed from: x */
        public int mo35800x() throws IOException {
            return mo35820L();
        }

        /* renamed from: y */
        public long mo35801y() throws IOException {
            return mo35821M();
        }

        /* renamed from: z */
        public int mo35802z() throws IOException {
            return C4717g.m37754b(mo35822N());
        }

        public C4720c(Iterable<ByteBuffer> iterable, int i, boolean z) {
            super();
            this.f25201n = Integer.MAX_VALUE;
            this.f25199l = i;
            this.f25194g = iterable;
            this.f25195h = iterable.iterator();
            this.f25197j = z;
            this.f25203p = 0;
            this.f25204q = 0;
            if (i == 0) {
                this.f25196i = C4758t.f25295e;
                this.f25205r = 0;
                this.f25206s = 0;
                this.f25208u = 0;
                this.f25207t = 0;
                return;
            }
            mo35831W();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g$d */
    /* compiled from: CodedInputStream */
    public static final class C4721d extends C4717g {

        /* renamed from: g */
        public final InputStream f25209g;

        /* renamed from: h */
        public final byte[] f25210h;

        /* renamed from: i */
        public int f25211i;

        /* renamed from: j */
        public int f25212j;

        /* renamed from: k */
        public int f25213k;

        /* renamed from: l */
        public int f25214l;

        /* renamed from: m */
        public int f25215m;

        /* renamed from: n */
        public int f25216n;

        /* renamed from: o */
        public C4722a f25217o;

        /* renamed from: com.google.crypto.tink.shaded.protobuf.g$d$a */
        /* compiled from: CodedInputStream */
        public interface C4722a {
            /* renamed from: a */
            void mo35851a();
        }

        /* renamed from: H */
        public static int m37864H(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        /* renamed from: I */
        public static int m37865I(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        /* renamed from: V */
        public static long m37866V(InputStream inputStream, long j) throws IOException {
            try {
                return inputStream.skip(j);
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        /* renamed from: A */
        public long mo35779A() throws IOException {
            return C4717g.m37755c(mo35840R());
        }

        /* renamed from: B */
        public String mo35780B() throws IOException {
            int Q = mo35839Q();
            if (Q > 0) {
                int i = this.f25211i;
                int i2 = this.f25213k;
                if (Q <= i - i2) {
                    String str = new String(this.f25210h, i2, Q, C4758t.f25292b);
                    this.f25213k += Q;
                    return str;
                }
            }
            if (Q == 0) {
                return "";
            }
            if (Q > this.f25211i) {
                return new String(mo35834L(Q, false), C4758t.f25292b);
            }
            mo35843U(Q);
            String str2 = new String(this.f25210h, this.f25213k, Q, C4758t.f25292b);
            this.f25213k += Q;
            return str2;
        }

        /* renamed from: C */
        public String mo35781C() throws IOException {
            byte[] bArr;
            int Q = mo35839Q();
            int i = this.f25213k;
            int i2 = this.f25211i;
            if (Q <= i2 - i && Q > 0) {
                bArr = this.f25210h;
                this.f25213k = i + Q;
            } else if (Q == 0) {
                return "";
            } else {
                if (Q <= i2) {
                    mo35843U(Q);
                    bArr = this.f25210h;
                    this.f25213k = Q + 0;
                } else {
                    bArr = mo35834L(Q, false);
                }
                i = 0;
            }
            return Utf8.m37395h(bArr, i, Q);
        }

        /* renamed from: D */
        public int mo35782D() throws IOException {
            if (mo35788e()) {
                this.f25214l = 0;
                return 0;
            }
            int Q = mo35839Q();
            this.f25214l = Q;
            if (WireFormat.m37459a(Q) != 0) {
                return this.f25214l;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: E */
        public int mo35783E() throws IOException {
            return mo35839Q();
        }

        /* renamed from: F */
        public long mo35784F() throws IOException {
            return mo35840R();
        }

        /* renamed from: G */
        public boolean mo35785G(int i) throws IOException {
            int b = WireFormat.m37460b(i);
            if (b == 0) {
                mo35847Z();
                return true;
            } else if (b == 1) {
                mo35845X(8);
                return true;
            } else if (b == 2) {
                mo35845X(mo35839Q());
                return true;
            } else if (b == 3) {
                mo35844W();
                mo35786a(WireFormat.m37461c(WireFormat.m37459a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo35845X(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: J */
        public final ByteString mo35832J(int i) throws IOException {
            byte[] M = mo35835M(i);
            if (M != null) {
                return ByteString.copyFrom(M);
            }
            int i2 = this.f25213k;
            int i3 = this.f25211i;
            int i4 = i3 - i2;
            this.f25215m += i3;
            this.f25213k = 0;
            this.f25211i = 0;
            List<byte[]> N = mo35836N(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f25210h, i2, bArr, 0, i4);
            for (byte[] next : N) {
                System.arraycopy(next, 0, bArr, i4, next.length);
                i4 += next.length;
            }
            return ByteString.wrap(bArr);
        }

        /* renamed from: K */
        public byte mo35833K() throws IOException {
            if (this.f25213k == this.f25211i) {
                mo35843U(1);
            }
            byte[] bArr = this.f25210h;
            int i = this.f25213k;
            this.f25213k = i + 1;
            return bArr[i];
        }

        /* renamed from: L */
        public final byte[] mo35834L(int i, boolean z) throws IOException {
            byte[] M = mo35835M(i);
            if (M == null) {
                int i2 = this.f25213k;
                int i3 = this.f25211i;
                int i4 = i3 - i2;
                this.f25215m += i3;
                this.f25213k = 0;
                this.f25211i = 0;
                List<byte[]> N = mo35836N(i - i4);
                byte[] bArr = new byte[i];
                System.arraycopy(this.f25210h, i2, bArr, 0, i4);
                for (byte[] next : N) {
                    System.arraycopy(next, 0, bArr, i4, next.length);
                    i4 += next.length;
                }
                return bArr;
            } else if (z) {
                return (byte[]) M.clone();
            } else {
                return M;
            }
        }

        /* renamed from: M */
        public final byte[] mo35835M(int i) throws IOException {
            if (i == 0) {
                return C4758t.f25294d;
            }
            if (i >= 0) {
                int i2 = this.f25215m;
                int i3 = this.f25213k;
                int i4 = i2 + i3 + i;
                if (i4 - this.f25182c <= 0) {
                    int i5 = this.f25216n;
                    if (i4 <= i5) {
                        int i6 = this.f25211i - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > m37864H(this.f25209g)) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f25210h, this.f25213k, bArr, 0, i6);
                        this.f25215m += this.f25211i;
                        this.f25213k = 0;
                        this.f25211i = 0;
                        while (i6 < i) {
                            int I = m37865I(this.f25209g, bArr, i6, i - i6);
                            if (I != -1) {
                                this.f25215m += I;
                                i6 += I;
                            } else {
                                throw InvalidProtocolBufferException.truncatedMessage();
                            }
                        }
                        return bArr;
                    }
                    mo35845X((i5 - i2) - i3);
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: N */
        public final List<byte[]> mo35836N(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f25209g.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f25215m += read;
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

        /* renamed from: O */
        public int mo35837O() throws IOException {
            int i = this.f25213k;
            if (this.f25211i - i < 4) {
                mo35843U(4);
                i = this.f25213k;
            }
            byte[] bArr = this.f25210h;
            this.f25213k = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: P */
        public long mo35838P() throws IOException {
            int i = this.f25213k;
            if (this.f25211i - i < 8) {
                mo35843U(8);
                i = this.f25213k;
            }
            byte[] bArr = this.f25210h;
            this.f25213k = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: Q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo35839Q() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f25213k
                int r1 = r5.f25211i
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f25210h
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f25213k = r3
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
                long r0 = r5.mo35841S()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f25213k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4717g.C4721d.mo35839Q():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: R */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo35840R() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f25213k
                int r1 = r11.f25211i
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f25210h
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f25213k = r3
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
                long r0 = r11.mo35841S()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f25213k = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4717g.C4721d.mo35840R():long");
        }

        /* renamed from: S */
        public long mo35841S() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte K = mo35833K();
                j |= ((long) (K & Byte.MAX_VALUE)) << i;
                if ((K & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: T */
        public final void mo35842T() {
            int i = this.f25211i + this.f25212j;
            this.f25211i = i;
            int i2 = this.f25215m + i;
            int i3 = this.f25216n;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f25212j = i4;
                this.f25211i = i - i4;
                return;
            }
            this.f25212j = 0;
        }

        /* renamed from: U */
        public final void mo35843U(int i) throws IOException {
            if (mo35850c0(i)) {
                return;
            }
            if (i > (this.f25182c - this.f25215m) - this.f25213k) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: W */
        public void mo35844W() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo35782D()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo35785G(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4717g.C4721d.mo35844W():void");
        }

        /* renamed from: X */
        public void mo35845X(int i) throws IOException {
            int i2 = this.f25211i;
            int i3 = this.f25213k;
            if (i > i2 - i3 || i < 0) {
                mo35846Y(i);
            } else {
                this.f25213k = i3 + i;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            throw new java.lang.IllegalStateException(r8.f25209g.getClass() + "#skip returned invalid result: " + r0 + "\nThe InputStream implementation is buggy.");
         */
        /* renamed from: Y */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo35846Y(int r9) throws java.io.IOException {
            /*
                r8 = this;
                if (r9 < 0) goto L_0x0097
                int r0 = r8.f25215m
                int r1 = r8.f25213k
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.f25216n
                if (r2 > r3) goto L_0x008d
                com.google.crypto.tink.shaded.protobuf.g$d$a r2 = r8.f25217o
                r3 = 0
                if (r2 != 0) goto L_0x006f
                int r0 = r0 + r1
                r8.f25215m = r0
                int r0 = r8.f25211i
                int r0 = r0 - r1
                r8.f25211i = r3
                r8.f25213k = r3
                r3 = r0
            L_0x001d:
                if (r3 >= r9) goto L_0x0067
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.f25209g     // Catch:{ all -> 0x005d }
                long r4 = (long) r0     // Catch:{ all -> 0x005d }
                long r0 = m37866V(r1, r4)     // Catch:{ all -> 0x005d }
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
                java.io.InputStream r4 = r8.f25209g     // Catch:{ all -> 0x005d }
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
                int r0 = r8.f25215m
                int r0 = r0 + r3
                r8.f25215m = r0
                r8.mo35842T()
                throw r9
            L_0x0067:
                int r0 = r8.f25215m
                int r0 = r0 + r3
                r8.f25215m = r0
                r8.mo35842T()
            L_0x006f:
                if (r3 >= r9) goto L_0x008c
                int r0 = r8.f25211i
                int r1 = r8.f25213k
                int r1 = r0 - r1
                r8.f25213k = r0
                r0 = 1
                r8.mo35843U(r0)
            L_0x007d:
                int r2 = r9 - r1
                int r3 = r8.f25211i
                if (r2 <= r3) goto L_0x008a
                int r1 = r1 + r3
                r8.f25213k = r3
                r8.mo35843U(r0)
                goto L_0x007d
            L_0x008a:
                r8.f25213k = r2
            L_0x008c:
                return
            L_0x008d:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.mo35845X(r3)
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r9 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r9
            L_0x0097:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r9 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4717g.C4721d.mo35846Y(int):void");
        }

        /* renamed from: Z */
        public final void mo35847Z() throws IOException {
            if (this.f25211i - this.f25213k >= 10) {
                mo35848a0();
            } else {
                mo35849b0();
            }
        }

        /* renamed from: a */
        public void mo35786a(int i) throws InvalidProtocolBufferException {
            if (this.f25214l != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* renamed from: a0 */
        public final void mo35848a0() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f25210h;
                int i2 = this.f25213k;
                this.f25213k = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: b0 */
        public final void mo35849b0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo35833K() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: c0 */
        public final boolean mo35850c0(int i) throws IOException {
            int i2 = this.f25213k;
            if (i2 + i > this.f25211i) {
                int i3 = this.f25182c;
                int i4 = this.f25215m;
                if (i > (i3 - i4) - i2 || i4 + i2 + i > this.f25216n) {
                    return false;
                }
                C4722a aVar = this.f25217o;
                if (aVar != null) {
                    aVar.mo35851a();
                }
                int i5 = this.f25213k;
                if (i5 > 0) {
                    int i6 = this.f25211i;
                    if (i6 > i5) {
                        byte[] bArr = this.f25210h;
                        System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                    }
                    this.f25215m += i5;
                    this.f25211i -= i5;
                    this.f25213k = 0;
                }
                InputStream inputStream = this.f25209g;
                byte[] bArr2 = this.f25210h;
                int i7 = this.f25211i;
                int I = m37865I(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.f25182c - this.f25215m) - i7));
                if (I == 0 || I < -1 || I > this.f25210h.length) {
                    throw new IllegalStateException(this.f25209g.getClass() + "#read(byte[]) returned invalid result: " + I + "\nThe InputStream implementation is buggy.");
                } else if (I <= 0) {
                    return false;
                } else {
                    this.f25211i += I;
                    mo35842T();
                    if (this.f25211i >= i) {
                        return true;
                    }
                    return mo35850c0(i);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
        }

        /* renamed from: d */
        public int mo35787d() {
            return this.f25215m + this.f25213k;
        }

        /* renamed from: e */
        public boolean mo35788e() throws IOException {
            if (this.f25213k != this.f25211i || mo35850c0(1)) {
                return false;
            }
            return true;
        }

        /* renamed from: m */
        public void mo35789m(int i) {
            this.f25216n = i;
            mo35842T();
        }

        /* renamed from: n */
        public int mo35790n(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = i + this.f25215m + this.f25213k;
                int i3 = this.f25216n;
                if (i2 <= i3) {
                    this.f25216n = i2;
                    mo35842T();
                    return i3;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: o */
        public boolean mo35791o() throws IOException {
            if (mo35840R() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: p */
        public ByteString mo35792p() throws IOException {
            int Q = mo35839Q();
            int i = this.f25211i;
            int i2 = this.f25213k;
            if (Q <= i - i2 && Q > 0) {
                ByteString copyFrom = ByteString.copyFrom(this.f25210h, i2, Q);
                this.f25213k += Q;
                return copyFrom;
            } else if (Q == 0) {
                return ByteString.EMPTY;
            } else {
                return mo35832J(Q);
            }
        }

        /* renamed from: q */
        public double mo35793q() throws IOException {
            return Double.longBitsToDouble(mo35838P());
        }

        /* renamed from: r */
        public int mo35794r() throws IOException {
            return mo35839Q();
        }

        /* renamed from: s */
        public int mo35795s() throws IOException {
            return mo35837O();
        }

        /* renamed from: t */
        public long mo35796t() throws IOException {
            return mo35838P();
        }

        /* renamed from: u */
        public float mo35797u() throws IOException {
            return Float.intBitsToFloat(mo35837O());
        }

        /* renamed from: v */
        public int mo35798v() throws IOException {
            return mo35839Q();
        }

        /* renamed from: w */
        public long mo35799w() throws IOException {
            return mo35840R();
        }

        /* renamed from: x */
        public int mo35800x() throws IOException {
            return mo35837O();
        }

        /* renamed from: y */
        public long mo35801y() throws IOException {
            return mo35838P();
        }

        /* renamed from: z */
        public int mo35802z() throws IOException {
            return C4717g.m37754b(mo35839Q());
        }

        public C4721d(InputStream inputStream, int i) {
            super();
            this.f25216n = Integer.MAX_VALUE;
            this.f25217o = null;
            C4758t.m38321b(inputStream, "input");
            this.f25209g = inputStream;
            this.f25210h = new byte[i];
            this.f25211i = 0;
            this.f25213k = 0;
            this.f25215m = 0;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.g$e */
    /* compiled from: CodedInputStream */
    public static final class C4723e extends C4717g {

        /* renamed from: g */
        public final ByteBuffer f25218g;

        /* renamed from: h */
        public final boolean f25219h;

        /* renamed from: i */
        public final long f25220i;

        /* renamed from: j */
        public long f25221j;

        /* renamed from: k */
        public long f25222k;

        /* renamed from: l */
        public long f25223l;

        /* renamed from: m */
        public int f25224m;

        /* renamed from: n */
        public int f25225n;

        /* renamed from: o */
        public boolean f25226o;

        /* renamed from: p */
        public int f25227p;

        /* renamed from: I */
        public static boolean m37911I() {
            return q47.m50237J();
        }

        /* renamed from: A */
        public long mo35779A() throws IOException {
            return C4717g.m37755c(mo35857N());
        }

        /* renamed from: B */
        public String mo35780B() throws IOException {
            int M = mo35856M();
            if (M > 0 && M <= mo35860Q()) {
                byte[] bArr = new byte[M];
                long j = (long) M;
                q47.m50268p(this.f25222k, bArr, 0, j);
                String str = new String(bArr, C4758t.f25292b);
                this.f25222k += j;
                return str;
            } else if (M == 0) {
                return "";
            } else {
                if (M < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: C */
        public String mo35781C() throws IOException {
            int M = mo35856M();
            if (M > 0 && M <= mo35860Q()) {
                String g = Utf8.m37394g(this.f25218g, mo35852H(this.f25222k), M);
                this.f25222k += (long) M;
                return g;
            } else if (M == 0) {
                return "";
            } else {
                if (M <= 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: D */
        public int mo35782D() throws IOException {
            if (mo35788e()) {
                this.f25225n = 0;
                return 0;
            }
            int M = mo35856M();
            this.f25225n = M;
            if (WireFormat.m37459a(M) != 0) {
                return this.f25225n;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: E */
        public int mo35783E() throws IOException {
            return mo35856M();
        }

        /* renamed from: F */
        public long mo35784F() throws IOException {
            return mo35857N();
        }

        /* renamed from: G */
        public boolean mo35785G(int i) throws IOException {
            int b = WireFormat.m37460b(i);
            if (b == 0) {
                mo35863T();
                return true;
            } else if (b == 1) {
                mo35862S(8);
                return true;
            } else if (b == 2) {
                mo35862S(mo35856M());
                return true;
            } else if (b == 3) {
                mo35861R();
                mo35786a(WireFormat.m37461c(WireFormat.m37459a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo35862S(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: H */
        public final int mo35852H(long j) {
            return (int) (j - this.f25220i);
        }

        /* renamed from: J */
        public byte mo35853J() throws IOException {
            long j = this.f25222k;
            if (j != this.f25221j) {
                this.f25222k = 1 + j;
                return q47.m50275w(j);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: K */
        public int mo35854K() throws IOException {
            long j = this.f25222k;
            if (this.f25221j - j >= 4) {
                this.f25222k = 4 + j;
                return ((q47.m50275w(j + 3) & 255) << 24) | (q47.m50275w(j) & 255) | ((q47.m50275w(1 + j) & 255) << 8) | ((q47.m50275w(2 + j) & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: L */
        public long mo35855L() throws IOException {
            long j = this.f25222k;
            if (this.f25221j - j >= 8) {
                this.f25222k = 8 + j;
                return ((((long) q47.m50275w(j + 7)) & 255) << 56) | (((long) q47.m50275w(j)) & 255) | ((((long) q47.m50275w(1 + j)) & 255) << 8) | ((((long) q47.m50275w(2 + j)) & 255) << 16) | ((((long) q47.m50275w(3 + j)) & 255) << 24) | ((((long) q47.m50275w(4 + j)) & 255) << 32) | ((((long) q47.m50275w(5 + j)) & 255) << 40) | ((((long) q47.m50275w(6 + j)) & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (p000.q47.m50275w(r4) < 0) goto L_0x0085;
         */
        /* renamed from: M */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo35856M() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f25222k
                long r2 = r10.f25221j
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = p000.q47.m50275w(r0)
                if (r0 < 0) goto L_0x0017
                r10.f25222k = r4
                return r0
            L_0x0017:
                long r6 = r10.f25221j
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = p000.q47.m50275w(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = p000.q47.m50275w(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = p000.q47.m50275w(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = p000.q47.m50275w(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = p000.q47.m50275w(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = p000.q47.m50275w(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = p000.q47.m50275w(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = p000.q47.m50275w(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = p000.q47.m50275w(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.mo35858O()
                int r0 = (int) r0
                return r0
            L_0x008b:
                r10.f25222k = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4717g.C4723e.mo35856M():int");
        }

        /* renamed from: N */
        public long mo35857N() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f25222k;
            if (this.f25221j != j4) {
                long j5 = j4 + 1;
                byte w = q47.m50275w(j4);
                if (w >= 0) {
                    this.f25222k = j5;
                    return (long) w;
                } else if (this.f25221j - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte w2 = w ^ (q47.m50275w(j5) << 7);
                    if (w2 < 0) {
                        b = w2 ^ Byte.MIN_VALUE;
                    } else {
                        long j7 = j6 + 1;
                        byte w3 = w2 ^ (q47.m50275w(j6) << 14);
                        if (w3 >= 0) {
                            j = (long) (w3 ^ 16256);
                        } else {
                            j6 = j7 + 1;
                            byte w4 = w3 ^ (q47.m50275w(j7) << 21);
                            if (w4 < 0) {
                                b = w4 ^ -2080896;
                            } else {
                                j7 = j6 + 1;
                                long w5 = ((long) w4) ^ (((long) q47.m50275w(j6)) << 28);
                                if (w5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long w6 = w5 ^ (((long) q47.m50275w(j7)) << 35);
                                    if (w6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        w5 = w6 ^ (((long) q47.m50275w(j8)) << 42);
                                        if (w5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            w6 = w5 ^ (((long) q47.m50275w(j7)) << 49);
                                            if (w6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (w6 ^ (((long) q47.m50275w(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) q47.m50275w(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f25222k = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = w6 ^ j2;
                                    j6 = j8;
                                    this.f25222k = j6;
                                    return j;
                                }
                                j = w5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f25222k = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f25222k = j6;
                    return j;
                }
            }
            return mo35858O();
        }

        /* renamed from: O */
        public long mo35858O() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte J = mo35853J();
                j |= ((long) (J & Byte.MAX_VALUE)) << i;
                if ((J & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: P */
        public final void mo35859P() {
            long j = this.f25221j + ((long) this.f25224m);
            this.f25221j = j;
            int i = (int) (j - this.f25223l);
            int i2 = this.f25227p;
            if (i > i2) {
                int i3 = i - i2;
                this.f25224m = i3;
                this.f25221j = j - ((long) i3);
                return;
            }
            this.f25224m = 0;
        }

        /* renamed from: Q */
        public final int mo35860Q() {
            return (int) (this.f25221j - this.f25222k);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: R */
        public void mo35861R() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo35782D()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo35785G(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4717g.C4723e.mo35861R():void");
        }

        /* renamed from: S */
        public void mo35862S(int i) throws IOException {
            if (i >= 0 && i <= mo35860Q()) {
                this.f25222k += (long) i;
            } else if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: T */
        public final void mo35863T() throws IOException {
            if (mo35860Q() >= 10) {
                mo35864U();
            } else {
                mo35865V();
            }
        }

        /* renamed from: U */
        public final void mo35864U() throws IOException {
            int i = 0;
            while (i < 10) {
                long j = this.f25222k;
                this.f25222k = 1 + j;
                if (q47.m50275w(j) < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: V */
        public final void mo35865V() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo35853J() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: W */
        public final ByteBuffer mo35866W(long j, long j2) throws IOException {
            int position = this.f25218g.position();
            int limit = this.f25218g.limit();
            ByteBuffer byteBuffer = this.f25218g;
            try {
                byteBuffer.position(mo35852H(j));
                byteBuffer.limit(mo35852H(j2));
                ByteBuffer slice = this.f25218g.slice();
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
        public void mo35786a(int i) throws InvalidProtocolBufferException {
            if (this.f25225n != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* renamed from: d */
        public int mo35787d() {
            return (int) (this.f25222k - this.f25223l);
        }

        /* renamed from: e */
        public boolean mo35788e() throws IOException {
            if (this.f25222k == this.f25221j) {
                return true;
            }
            return false;
        }

        /* renamed from: m */
        public void mo35789m(int i) {
            this.f25227p = i;
            mo35859P();
        }

        /* renamed from: n */
        public int mo35790n(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int d = i + mo35787d();
                int i2 = this.f25227p;
                if (d <= i2) {
                    this.f25227p = d;
                    mo35859P();
                    return i2;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: o */
        public boolean mo35791o() throws IOException {
            if (mo35857N() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: p */
        public ByteString mo35792p() throws IOException {
            int M = mo35856M();
            if (M <= 0 || M > mo35860Q()) {
                if (M == 0) {
                    return ByteString.EMPTY;
                }
                if (M < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (!this.f25219h || !this.f25226o) {
                byte[] bArr = new byte[M];
                long j = (long) M;
                q47.m50268p(this.f25222k, bArr, 0, j);
                this.f25222k += j;
                return ByteString.wrap(bArr);
            } else {
                long j2 = this.f25222k;
                long j3 = (long) M;
                ByteBuffer W = mo35866W(j2, j2 + j3);
                this.f25222k += j3;
                return ByteString.wrap(W);
            }
        }

        /* renamed from: q */
        public double mo35793q() throws IOException {
            return Double.longBitsToDouble(mo35855L());
        }

        /* renamed from: r */
        public int mo35794r() throws IOException {
            return mo35856M();
        }

        /* renamed from: s */
        public int mo35795s() throws IOException {
            return mo35854K();
        }

        /* renamed from: t */
        public long mo35796t() throws IOException {
            return mo35855L();
        }

        /* renamed from: u */
        public float mo35797u() throws IOException {
            return Float.intBitsToFloat(mo35854K());
        }

        /* renamed from: v */
        public int mo35798v() throws IOException {
            return mo35856M();
        }

        /* renamed from: w */
        public long mo35799w() throws IOException {
            return mo35857N();
        }

        /* renamed from: x */
        public int mo35800x() throws IOException {
            return mo35854K();
        }

        /* renamed from: y */
        public long mo35801y() throws IOException {
            return mo35855L();
        }

        /* renamed from: z */
        public int mo35802z() throws IOException {
            return C4717g.m37754b(mo35856M());
        }

        public C4723e(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f25227p = Integer.MAX_VALUE;
            this.f25218g = byteBuffer;
            long k = q47.m50263k(byteBuffer);
            this.f25220i = k;
            this.f25221j = ((long) byteBuffer.limit()) + k;
            long position = k + ((long) byteBuffer.position());
            this.f25222k = position;
            this.f25223l = position;
            this.f25219h = z;
        }
    }

    /* renamed from: b */
    public static int m37754b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m37755c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: f */
    public static C4717g m37756f(InputStream inputStream) {
        return m37757g(inputStream, 4096);
    }

    /* renamed from: g */
    public static C4717g m37757g(InputStream inputStream, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        } else if (inputStream == null) {
            return m37760j(C4758t.f25294d);
        } else {
            return new C4721d(inputStream, i);
        }
    }

    /* renamed from: h */
    public static C4717g m37758h(Iterable<ByteBuffer> iterable, boolean z) {
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
            return new C4720c(iterable, i, z);
        }
        return m37756f(new pz2(iterable));
    }

    /* renamed from: i */
    public static C4717g m37759i(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m37762l(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && C4723e.m37911I()) {
            return new C4723e(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m37762l(bArr, 0, remaining, true);
    }

    /* renamed from: j */
    public static C4717g m37760j(byte[] bArr) {
        return m37761k(bArr, 0, bArr.length);
    }

    /* renamed from: k */
    public static C4717g m37761k(byte[] bArr, int i, int i2) {
        return m37762l(bArr, i, i2, false);
    }

    /* renamed from: l */
    public static C4717g m37762l(byte[] bArr, int i, int i2, boolean z) {
        C4719b bVar = new C4719b(bArr, i, i2, z);
        try {
            bVar.mo35790n(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract long mo35779A() throws IOException;

    /* renamed from: B */
    public abstract String mo35780B() throws IOException;

    /* renamed from: C */
    public abstract String mo35781C() throws IOException;

    /* renamed from: D */
    public abstract int mo35782D() throws IOException;

    /* renamed from: E */
    public abstract int mo35783E() throws IOException;

    /* renamed from: F */
    public abstract long mo35784F() throws IOException;

    /* renamed from: G */
    public abstract boolean mo35785G(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo35786a(int i) throws InvalidProtocolBufferException;

    /* renamed from: d */
    public abstract int mo35787d();

    /* renamed from: e */
    public abstract boolean mo35788e() throws IOException;

    /* renamed from: m */
    public abstract void mo35789m(int i);

    /* renamed from: n */
    public abstract int mo35790n(int i) throws InvalidProtocolBufferException;

    /* renamed from: o */
    public abstract boolean mo35791o() throws IOException;

    /* renamed from: p */
    public abstract ByteString mo35792p() throws IOException;

    /* renamed from: q */
    public abstract double mo35793q() throws IOException;

    /* renamed from: r */
    public abstract int mo35794r() throws IOException;

    /* renamed from: s */
    public abstract int mo35795s() throws IOException;

    /* renamed from: t */
    public abstract long mo35796t() throws IOException;

    /* renamed from: u */
    public abstract float mo35797u() throws IOException;

    /* renamed from: v */
    public abstract int mo35798v() throws IOException;

    /* renamed from: w */
    public abstract long mo35799w() throws IOException;

    /* renamed from: x */
    public abstract int mo35800x() throws IOException;

    /* renamed from: y */
    public abstract long mo35801y() throws IOException;

    /* renamed from: z */
    public abstract int mo35802z() throws IOException;

    public C4717g() {
        this.f25181b = f25179f;
        this.f25182c = Integer.MAX_VALUE;
        this.f25184e = false;
    }
}

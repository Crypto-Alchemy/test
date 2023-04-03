package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.C7628h;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c */
/* compiled from: CodedInputStream */
public final class C7614c {

    /* renamed from: a */
    public final byte[] f39941a;

    /* renamed from: b */
    public final boolean f39942b;

    /* renamed from: c */
    public int f39943c;

    /* renamed from: d */
    public int f39944d;

    /* renamed from: e */
    public int f39945e;

    /* renamed from: f */
    public final InputStream f39946f;

    /* renamed from: g */
    public int f39947g;

    /* renamed from: h */
    public boolean f39948h;

    /* renamed from: i */
    public int f39949i;

    /* renamed from: j */
    public int f39950j;

    /* renamed from: k */
    public int f39951k;

    /* renamed from: l */
    public int f39952l;

    /* renamed from: m */
    public int f39953m;

    /* renamed from: n */
    public C7615a f39954n;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$a */
    /* compiled from: CodedInputStream */
    public interface C7615a {
        /* renamed from: a */
        void mo54732a();
    }

    public C7614c(InputStream inputStream) {
        this.f39948h = false;
        this.f39950j = Integer.MAX_VALUE;
        this.f39952l = 64;
        this.f39953m = 67108864;
        this.f39954n = null;
        this.f39941a = new byte[4096];
        this.f39943c = 0;
        this.f39945e = 0;
        this.f39949i = 0;
        this.f39946f = inputStream;
        this.f39942b = false;
    }

    /* renamed from: B */
    public static int m61961B(int i, InputStream inputStream) throws IOException {
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

    /* renamed from: b */
    public static int m61962b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m61963c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: g */
    public static C7614c m61964g(ni3 ni3) {
        C7614c cVar = new C7614c(ni3);
        try {
            cVar.mo54715j(ni3.size());
            return cVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: h */
    public static C7614c m61965h(InputStream inputStream) {
        return new C7614c(inputStream);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        if (r2[r3] < 0) goto L_0x007c;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo54691A() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f39945e
            int r1 = r9.f39943c
            if (r1 != r0) goto L_0x0008
            goto L_0x007c
        L_0x0008:
            byte[] r2 = r9.f39941a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0013
            r9.f39945e = r3
            return r0
        L_0x0013:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x0019
            goto L_0x007c
        L_0x0019:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x002d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x0029:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L_0x0082
        L_0x002d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x003f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L_0x003d:
            r1 = r3
            goto L_0x0082
        L_0x003f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x004f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x0029
        L_0x004f:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x0082
        L_0x007c:
            long r0 = r9.mo54693D()
            int r0 = (int) r0
            return r0
        L_0x0082:
            r9.f39945e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C7614c.mo54691A():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b8;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo54692C() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f39945e
            int r1 = r9.f39943c
            if (r1 != r0) goto L_0x0008
            goto L_0x00b8
        L_0x0008:
            byte[] r2 = r9.f39941a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0014
            r9.f39945e = r3
            long r0 = (long) r0
            return r0
        L_0x0014:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x001b
            goto L_0x00b8
        L_0x001b:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x002b:
            long r2 = r3 ^ r5
            goto L_0x00bf
        L_0x002f:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            long r7 = (long) r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0042
            r1 = 16256(0x3f80, double:8.0315E-320)
        L_0x003d:
            long r2 = r3 ^ r1
            r1 = r0
            goto L_0x00bf
        L_0x0042:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            int r0 = r0 << 21
            long r7 = (long) r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x002b
        L_0x0052:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 28
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0063
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L_0x003d
        L_0x0063:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L_0x002b
        L_0x0076:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0089
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x003d
        L_0x0089:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x002b
        L_0x009c:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bd
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00be
        L_0x00b8:
            long r0 = r9.mo54693D()
            return r0
        L_0x00bd:
            r1 = r0
        L_0x00be:
            r2 = r3
        L_0x00bf:
            r9.f39945e = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C7614c.mo54692C():long");
    }

    /* renamed from: D */
    public long mo54693D() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte w = mo54728w();
            j |= ((long) (w & Byte.MAX_VALUE)) << i;
            if ((w & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /* renamed from: E */
    public int mo54694E() throws IOException {
        return mo54730y();
    }

    /* renamed from: F */
    public long mo54695F() throws IOException {
        return mo54731z();
    }

    /* renamed from: G */
    public int mo54696G() throws IOException {
        return m61962b(mo54691A());
    }

    /* renamed from: H */
    public long mo54697H() throws IOException {
        return m61963c(mo54692C());
    }

    /* renamed from: I */
    public String mo54698I() throws IOException {
        int A = mo54691A();
        int i = this.f39943c;
        int i2 = this.f39945e;
        if (A <= i - i2 && A > 0) {
            String str = new String(this.f39941a, i2, A, "UTF-8");
            this.f39945e += A;
            return str;
        } else if (A == 0) {
            return "";
        } else {
            return new String(mo54729x(A), "UTF-8");
        }
    }

    /* renamed from: J */
    public String mo54699J() throws IOException {
        byte[] bArr;
        int A = mo54691A();
        int i = this.f39945e;
        if (A <= this.f39943c - i && A > 0) {
            bArr = this.f39941a;
            this.f39945e = i + A;
        } else if (A == 0) {
            return "";
        } else {
            bArr = mo54729x(A);
            i = 0;
        }
        if (f67.m57624f(bArr, i, i + A)) {
            return new String(bArr, i, A, "UTF-8");
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    /* renamed from: K */
    public int mo54700K() throws IOException {
        if (mo54713f()) {
            this.f39947g = 0;
            return 0;
        }
        int A = mo54691A();
        this.f39947g = A;
        if (WireFormat.m61944a(A) != 0) {
            return this.f39947g;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* renamed from: L */
    public int mo54701L() throws IOException {
        return mo54691A();
    }

    /* renamed from: M */
    public long mo54702M() throws IOException {
        return mo54692C();
    }

    /* renamed from: N */
    public final void mo54703N() {
        int i = this.f39943c + this.f39944d;
        this.f39943c = i;
        int i2 = this.f39949i + i;
        int i3 = this.f39950j;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f39944d = i4;
            this.f39943c = i - i4;
            return;
        }
        this.f39944d = 0;
    }

    /* renamed from: O */
    public final void mo54704O(int i) throws IOException {
        if (!mo54709T(i)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* renamed from: P */
    public boolean mo54705P(int i, CodedOutputStream codedOutputStream) throws IOException {
        int b = WireFormat.m61945b(i);
        if (b == 0) {
            long t = mo54725t();
            codedOutputStream.mo54628o0(i);
            codedOutputStream.mo54639z0(t);
            return true;
        } else if (b == 1) {
            long z = mo54731z();
            codedOutputStream.mo54628o0(i);
            codedOutputStream.mo54609V(z);
            return true;
        } else if (b == 2) {
            c70 l = mo54717l();
            codedOutputStream.mo54628o0(i);
            codedOutputStream.mo54603P(l);
            return true;
        } else if (b == 3) {
            codedOutputStream.mo54628o0(i);
            mo54706Q(codedOutputStream);
            int c = WireFormat.m61946c(WireFormat.m61944a(i), 4);
            mo54710a(c);
            codedOutputStream.mo54628o0(c);
            return true;
        } else if (b == 4) {
            return false;
        } else {
            if (b == 5) {
                int y = mo54730y();
                codedOutputStream.mo54628o0(i);
                codedOutputStream.mo54608U(y);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: Q */
    public void mo54706Q(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2) throws java.io.IOException {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r1.mo54700K()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.mo54705P(r0, r2)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C7614c.mo54706Q(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream):void");
    }

    /* renamed from: R */
    public void mo54707R(int i) throws IOException {
        int i2 = this.f39943c;
        int i3 = this.f39945e;
        if (i > i2 - i3 || i < 0) {
            mo54708S(i);
        } else {
            this.f39945e = i3 + i;
        }
    }

    /* renamed from: S */
    public final void mo54708S(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f39949i;
            int i3 = this.f39945e;
            int i4 = i2 + i3 + i;
            int i5 = this.f39950j;
            if (i4 <= i5) {
                int i6 = this.f39943c;
                int i7 = i6 - i3;
                this.f39945e = i6;
                mo54704O(1);
                while (true) {
                    int i8 = i - i7;
                    int i9 = this.f39943c;
                    if (i8 > i9) {
                        i7 += i9;
                        this.f39945e = i9;
                        mo54704O(1);
                    } else {
                        this.f39945e = i8;
                        return;
                    }
                }
            } else {
                mo54707R((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } else {
            throw InvalidProtocolBufferException.negativeSize();
        }
    }

    /* renamed from: T */
    public final boolean mo54709T(int i) throws IOException {
        int i2 = this.f39945e;
        if (i2 + i <= this.f39943c) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        } else if (this.f39949i + i2 + i > this.f39950j) {
            return false;
        } else {
            C7615a aVar = this.f39954n;
            if (aVar != null) {
                aVar.mo54732a();
            }
            if (this.f39946f != null) {
                int i3 = this.f39945e;
                if (i3 > 0) {
                    int i4 = this.f39943c;
                    if (i4 > i3) {
                        byte[] bArr = this.f39941a;
                        System.arraycopy(bArr, i3, bArr, 0, i4 - i3);
                    }
                    this.f39949i += i3;
                    this.f39943c -= i3;
                    this.f39945e = 0;
                }
                InputStream inputStream = this.f39946f;
                byte[] bArr2 = this.f39941a;
                int i5 = this.f39943c;
                int read = inputStream.read(bArr2, i5, bArr2.length - i5);
                if (read == 0 || read < -1 || read > this.f39941a.length) {
                    StringBuilder sb2 = new StringBuilder(102);
                    sb2.append("InputStream#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                } else if (read > 0) {
                    this.f39943c += read;
                    if ((this.f39949i + i) - this.f39953m <= 0) {
                        mo54703N();
                        if (this.f39943c >= i) {
                            return true;
                        }
                        return mo54709T(i);
                    }
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public void mo54710a(int i) throws InvalidProtocolBufferException {
        if (this.f39947g != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    /* renamed from: d */
    public final void mo54711d(int i) throws IOException {
        if (this.f39943c - this.f39945e < i) {
            mo54704O(i);
        }
    }

    /* renamed from: e */
    public int mo54712e() {
        int i = this.f39950j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f39949i + this.f39945e);
    }

    /* renamed from: f */
    public boolean mo54713f() throws IOException {
        if (this.f39945e != this.f39943c || mo54709T(1)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public void mo54714i(int i) {
        this.f39950j = i;
        mo54703N();
    }

    /* renamed from: j */
    public int mo54715j(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            int i2 = i + this.f39949i + this.f39945e;
            int i3 = this.f39950j;
            if (i2 <= i3) {
                this.f39950j = i2;
                mo54703N();
                return i3;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* renamed from: k */
    public boolean mo54716k() throws IOException {
        if (mo54692C() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public c70 mo54717l() throws IOException {
        c70 c70;
        int A = mo54691A();
        int i = this.f39943c;
        int i2 = this.f39945e;
        if (A <= i - i2 && A > 0) {
            if (!this.f39942b || !this.f39948h) {
                c70 = c70.m56316o(this.f39941a, i2, A);
            } else {
                c70 = new y30(this.f39941a, this.f39945e, A);
            }
            this.f39945e += A;
            return c70;
        } else if (A == 0) {
            return c70.f37074a;
        } else {
            return new ni3(mo54729x(A));
        }
    }

    /* renamed from: m */
    public double mo54718m() throws IOException {
        return Double.longBitsToDouble(mo54731z());
    }

    /* renamed from: n */
    public int mo54719n() throws IOException {
        return mo54691A();
    }

    /* renamed from: o */
    public int mo54720o() throws IOException {
        return mo54730y();
    }

    /* renamed from: p */
    public long mo54721p() throws IOException {
        return mo54731z();
    }

    /* renamed from: q */
    public float mo54722q() throws IOException {
        return Float.intBitsToFloat(mo54730y());
    }

    /* renamed from: r */
    public void mo54723r(int i, C7628h.C7629a aVar, C7616d dVar) throws IOException {
        int i2 = this.f39951k;
        if (i2 < this.f39952l) {
            this.f39951k = i2 + 1;
            aVar.mo53900n(this, dVar);
            mo54710a(WireFormat.m61946c(i, 4));
            this.f39951k--;
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    /* renamed from: s */
    public int mo54724s() throws IOException {
        return mo54691A();
    }

    /* renamed from: t */
    public long mo54725t() throws IOException {
        return mo54692C();
    }

    /* renamed from: u */
    public <T extends C7628h> T mo54726u(jm4<T> jm4, C7616d dVar) throws IOException {
        int A = mo54691A();
        if (this.f39951k < this.f39952l) {
            int j = mo54715j(A);
            this.f39951k++;
            T t = (C7628h) jm4.mo52753c(this, dVar);
            mo54710a(0);
            this.f39951k--;
            mo54714i(j);
            return t;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    /* renamed from: v */
    public void mo54727v(C7628h.C7629a aVar, C7616d dVar) throws IOException {
        int A = mo54691A();
        if (this.f39951k < this.f39952l) {
            int j = mo54715j(A);
            this.f39951k++;
            aVar.mo53900n(this, dVar);
            mo54710a(0);
            this.f39951k--;
            mo54714i(j);
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    /* renamed from: w */
    public byte mo54728w() throws IOException {
        if (this.f39945e == this.f39943c) {
            mo54704O(1);
        }
        byte[] bArr = this.f39941a;
        int i = this.f39945e;
        this.f39945e = i + 1;
        return bArr[i];
    }

    /* renamed from: x */
    public final byte[] mo54729x(int i) throws IOException {
        int i2;
        if (i > 0) {
            int i3 = this.f39949i;
            int i4 = this.f39945e;
            int i5 = i3 + i4 + i;
            int i6 = this.f39950j;
            if (i5 > i6) {
                mo54707R((i6 - i3) - i4);
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (i < 4096) {
                byte[] bArr = new byte[i];
                int i7 = this.f39943c - i4;
                System.arraycopy(this.f39941a, i4, bArr, 0, i7);
                this.f39945e = this.f39943c;
                int i8 = i - i7;
                mo54711d(i8);
                System.arraycopy(this.f39941a, 0, bArr, i7, i8);
                this.f39945e = i8;
                return bArr;
            } else {
                int i9 = this.f39943c;
                this.f39949i = i3 + i9;
                this.f39945e = 0;
                this.f39943c = 0;
                int i10 = i9 - i4;
                int i11 = i - i10;
                ArrayList<byte[]> arrayList = new ArrayList<>();
                while (i11 > 0) {
                    int min = Math.min(i11, 4096);
                    byte[] bArr2 = new byte[min];
                    int i12 = 0;
                    while (i12 < min) {
                        InputStream inputStream = this.f39946f;
                        if (inputStream == null) {
                            i2 = -1;
                        } else {
                            i2 = inputStream.read(bArr2, i12, min - i12);
                        }
                        if (i2 != -1) {
                            this.f39949i += i2;
                            i12 += i2;
                        } else {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        }
                    }
                    i11 -= min;
                    arrayList.add(bArr2);
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(this.f39941a, i4, bArr3, 0, i10);
                for (byte[] bArr4 : arrayList) {
                    System.arraycopy(bArr4, 0, bArr3, i10, bArr4.length);
                    i10 += bArr4.length;
                }
                return bArr3;
            }
        } else if (i == 0) {
            return C7621f.f39965a;
        } else {
            throw InvalidProtocolBufferException.negativeSize();
        }
    }

    /* renamed from: y */
    public int mo54730y() throws IOException {
        int i = this.f39945e;
        if (this.f39943c - i < 4) {
            mo54704O(4);
            i = this.f39945e;
        }
        byte[] bArr = this.f39941a;
        this.f39945e = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: z */
    public long mo54731z() throws IOException {
        int i = this.f39945e;
        if (this.f39943c - i < 8) {
            mo54704O(8);
            i = this.f39945e;
        }
        byte[] bArr = this.f39941a;
        this.f39945e = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public C7614c(ni3 ni3) {
        this.f39948h = false;
        this.f39950j = Integer.MAX_VALUE;
        this.f39952l = 64;
        this.f39953m = 67108864;
        this.f39954n = null;
        this.f39941a = ni3.f43478d;
        int S = ni3.mo62692S();
        this.f39945e = S;
        this.f39943c = S + ni3.size();
        this.f39949i = -this.f39945e;
        this.f39946f = null;
        this.f39942b = true;
    }
}

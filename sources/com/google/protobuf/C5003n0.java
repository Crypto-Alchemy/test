package com.google.protobuf;

import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.protobuf.n0 */
/* compiled from: UnknownFieldSetLite */
public final class C5003n0 {

    /* renamed from: f */
    public static final C5003n0 f25728f = new C5003n0(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f25729a;

    /* renamed from: b */
    public int[] f25730b;

    /* renamed from: c */
    public Object[] f25731c;

    /* renamed from: d */
    public int f25732d;

    /* renamed from: e */
    public boolean f25733e;

    public C5003n0() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static C5003n0 m39843c() {
        return f25728f;
    }

    /* renamed from: f */
    public static int m39844f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: g */
    public static int m39845g(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* renamed from: m */
    public static C5003n0 m39846m(C5003n0 n0Var, C5003n0 n0Var2) {
        int i = n0Var.f25729a + n0Var2.f25729a;
        int[] copyOf = Arrays.copyOf(n0Var.f25730b, i);
        System.arraycopy(n0Var2.f25730b, 0, copyOf, n0Var.f25729a, n0Var2.f25729a);
        Object[] copyOf2 = Arrays.copyOf(n0Var.f25731c, i);
        System.arraycopy(n0Var2.f25731c, 0, copyOf2, n0Var.f25729a, n0Var2.f25729a);
        return new C5003n0(i, copyOf, copyOf2, true);
    }

    /* renamed from: n */
    public static C5003n0 m39847n() {
        return new C5003n0();
    }

    /* renamed from: o */
    public static boolean m39848o(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m39849r(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    public static void m39850t(int i, Object obj, Writer writer) throws IOException {
        int a = WireFormat.m39050a(i);
        int b = WireFormat.m39051b(i);
        if (b == 0) {
            writer.mo37035u(a, ((Long) obj).longValue());
        } else if (b == 1) {
            writer.mo37033s(a, ((Long) obj).longValue());
        } else if (b == 2) {
            writer.mo37011L(a, (ByteString) obj);
        } else if (b != 3) {
            if (b == 5) {
                writer.mo37017c(a, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
        } else if (writer.mo37034t() == Writer.FieldOrder.ASCENDING) {
            writer.mo37038x(a);
            ((C5003n0) obj).mo37466u(writer);
            writer.mo37002C(a);
        } else {
            writer.mo37002C(a);
            ((C5003n0) obj).mo37466u(writer);
            writer.mo37038x(a);
        }
    }

    /* renamed from: a */
    public void mo37452a() {
        if (!this.f25733e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final void mo37453b() {
        int i;
        int i2 = this.f25729a;
        int[] iArr = this.f25730b;
        if (i2 == iArr.length) {
            if (i2 < 4) {
                i = 8;
            } else {
                i = i2 >> 1;
            }
            int i3 = i2 + i;
            this.f25730b = Arrays.copyOf(iArr, i3);
            this.f25731c = Arrays.copyOf(this.f25731c, i3);
        }
    }

    /* renamed from: d */
    public int mo37454d() {
        int i;
        int i2 = this.f25732d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f25729a; i4++) {
            int i5 = this.f25730b[i4];
            int a = WireFormat.m39050a(i5);
            int b = WireFormat.m39051b(i5);
            if (b == 0) {
                i = CodedOutputStream.m38789Y(a, ((Long) this.f25731c[i4]).longValue());
            } else if (b == 1) {
                i = CodedOutputStream.m38808p(a, ((Long) this.f25731c[i4]).longValue());
            } else if (b == 2) {
                i = CodedOutputStream.m38799h(a, (ByteString) this.f25731c[i4]);
            } else if (b == 3) {
                i = (CodedOutputStream.m38786V(a) * 2) + ((C5003n0) this.f25731c[i4]).mo37454d();
            } else if (b == 5) {
                i = CodedOutputStream.m38806n(a, ((Integer) this.f25731c[i4]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
            }
            i3 += i;
        }
        this.f25732d = i3;
        return i3;
    }

    /* renamed from: e */
    public int mo37455e() {
        int i = this.f25732d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f25729a; i3++) {
            i2 += CodedOutputStream.m38775K(WireFormat.m39050a(this.f25730b[i3]), (ByteString) this.f25731c[i3]);
        }
        this.f25732d = i2;
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5003n0)) {
            return false;
        }
        C5003n0 n0Var = (C5003n0) obj;
        int i = this.f25729a;
        if (i != n0Var.f25729a || !m39849r(this.f25730b, n0Var.f25730b, i) || !m39848o(this.f25731c, n0Var.f25731c, this.f25729a)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public void mo37457h() {
        this.f25733e = false;
    }

    public int hashCode() {
        int i = this.f25729a;
        return ((((527 + i) * 31) + m39844f(this.f25730b, i)) * 31) + m39845g(this.f25731c, this.f25729a);
    }

    /* renamed from: i */
    public boolean mo37459i(int i, C4969g gVar) throws IOException {
        mo37452a();
        int a = WireFormat.m39050a(i);
        int b = WireFormat.m39051b(i);
        if (b == 0) {
            mo37464q(i, Long.valueOf(gVar.mo37259x()));
            return true;
        } else if (b == 1) {
            mo37464q(i, Long.valueOf(gVar.mo37256u()));
            return true;
        } else if (b == 2) {
            mo37464q(i, gVar.mo37252q());
            return true;
        } else if (b == 3) {
            C5003n0 n0Var = new C5003n0();
            n0Var.mo37460j(gVar);
            gVar.mo37246a(WireFormat.m39052c(a, 4));
            mo37464q(i, n0Var);
            return true;
        } else if (b == 4) {
            return false;
        } else {
            if (b == 5) {
                mo37464q(i, Integer.valueOf(gVar.mo37255t()));
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
    /* renamed from: j */
    public final com.google.protobuf.C5003n0 mo37460j(com.google.protobuf.C4969g r2) throws java.io.IOException {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r2.mo37242F()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.mo37459i(r0, r2)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5003n0.mo37460j(com.google.protobuf.g):com.google.protobuf.n0");
    }

    /* renamed from: k */
    public C5003n0 mo37461k(int i, ByteString byteString) {
        mo37452a();
        if (i != 0) {
            mo37464q(WireFormat.m39052c(i, 2), byteString);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* renamed from: l */
    public C5003n0 mo37462l(int i, int i2) {
        mo37452a();
        if (i != 0) {
            mo37464q(WireFormat.m39052c(i, 0), Long.valueOf((long) i2));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* renamed from: p */
    public final void mo37463p(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f25729a; i2++) {
            C4961d0.m39167c(sb, i, String.valueOf(WireFormat.m39050a(this.f25730b[i2])), this.f25731c[i2]);
        }
    }

    /* renamed from: q */
    public void mo37464q(int i, Object obj) {
        mo37452a();
        mo37453b();
        int[] iArr = this.f25730b;
        int i2 = this.f25729a;
        iArr[i2] = i;
        this.f25731c[i2] = obj;
        this.f25729a = i2 + 1;
    }

    /* renamed from: s */
    public void mo37465s(Writer writer) throws IOException {
        if (writer.mo37034t() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.f25729a - 1; i >= 0; i--) {
                writer.mo37016b(WireFormat.m39050a(this.f25730b[i]), this.f25731c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f25729a; i2++) {
            writer.mo37016b(WireFormat.m39050a(this.f25730b[i2]), this.f25731c[i2]);
        }
    }

    /* renamed from: u */
    public void mo37466u(Writer writer) throws IOException {
        if (this.f25729a != 0) {
            if (writer.mo37034t() == Writer.FieldOrder.ASCENDING) {
                for (int i = 0; i < this.f25729a; i++) {
                    m39850t(this.f25730b[i], this.f25731c[i], writer);
                }
                return;
            }
            for (int i2 = this.f25729a - 1; i2 >= 0; i2--) {
                m39850t(this.f25730b[i2], this.f25731c[i2], writer);
            }
        }
    }

    public C5003n0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f25732d = -1;
        this.f25729a = i;
        this.f25730b = iArr;
        this.f25731c = objArr;
        this.f25733e = z;
    }
}

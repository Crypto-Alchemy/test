package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.crypto.tink.shaded.protobuf.n0 */
/* compiled from: UnknownFieldSetLite */
public final class C4750n0 {

    /* renamed from: f */
    public static final C4750n0 f25272f = new C4750n0(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f25273a;

    /* renamed from: b */
    public int[] f25274b;

    /* renamed from: c */
    public Object[] f25275c;

    /* renamed from: d */
    public int f25276d;

    /* renamed from: e */
    public boolean f25277e;

    public C4750n0() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static C4750n0 m38246c() {
        return f25272f;
    }

    /* renamed from: f */
    public static int m38247f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: g */
    public static int m38248g(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* renamed from: i */
    public static C4750n0 m38249i(C4750n0 n0Var, C4750n0 n0Var2) {
        int i = n0Var.f25273a + n0Var2.f25273a;
        int[] copyOf = Arrays.copyOf(n0Var.f25274b, i);
        System.arraycopy(n0Var2.f25274b, 0, copyOf, n0Var.f25273a, n0Var2.f25273a);
        Object[] copyOf2 = Arrays.copyOf(n0Var.f25275c, i);
        System.arraycopy(n0Var2.f25275c, 0, copyOf2, n0Var.f25273a, n0Var2.f25273a);
        return new C4750n0(i, copyOf, copyOf2, true);
    }

    /* renamed from: j */
    public static C4750n0 m38250j() {
        return new C4750n0();
    }

    /* renamed from: k */
    public static boolean m38251k(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m38252n(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public static void m38253p(int i, Object obj, Writer writer) throws IOException {
        int a = WireFormat.m37459a(i);
        int b = WireFormat.m37460b(i);
        if (b == 0) {
            writer.mo35595u(a, ((Long) obj).longValue());
        } else if (b == 1) {
            writer.mo35593s(a, ((Long) obj).longValue());
        } else if (b == 2) {
            writer.mo35572M(a, (ByteString) obj);
        } else if (b != 3) {
            if (b == 5) {
                writer.mo35577c(a, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
        } else if (writer.mo35594t() == Writer.FieldOrder.ASCENDING) {
            writer.mo35598x(a);
            ((C4750n0) obj).mo35981q(writer);
            writer.mo35562C(a);
        } else {
            writer.mo35562C(a);
            ((C4750n0) obj).mo35981q(writer);
            writer.mo35598x(a);
        }
    }

    /* renamed from: a */
    public void mo35971a() {
        if (!this.f25277e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final void mo35972b() {
        int i;
        int i2 = this.f25273a;
        int[] iArr = this.f25274b;
        if (i2 == iArr.length) {
            if (i2 < 4) {
                i = 8;
            } else {
                i = i2 >> 1;
            }
            int i3 = i2 + i;
            this.f25274b = Arrays.copyOf(iArr, i3);
            this.f25275c = Arrays.copyOf(this.f25275c, i3);
        }
    }

    /* renamed from: d */
    public int mo35973d() {
        int i;
        int i2 = this.f25276d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f25273a; i4++) {
            int i5 = this.f25274b[i4];
            int a = WireFormat.m37459a(i5);
            int b = WireFormat.m37460b(i5);
            if (b == 0) {
                i = CodedOutputStream.m37215Y(a, ((Long) this.f25275c[i4]).longValue());
            } else if (b == 1) {
                i = CodedOutputStream.m37233p(a, ((Long) this.f25275c[i4]).longValue());
            } else if (b == 2) {
                i = CodedOutputStream.m37225h(a, (ByteString) this.f25275c[i4]);
            } else if (b == 3) {
                i = (CodedOutputStream.m37212V(a) * 2) + ((C4750n0) this.f25275c[i4]).mo35973d();
            } else if (b == 5) {
                i = CodedOutputStream.m37231n(a, ((Integer) this.f25275c[i4]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
            }
            i3 += i;
        }
        this.f25276d = i3;
        return i3;
    }

    /* renamed from: e */
    public int mo35974e() {
        int i = this.f25276d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f25273a; i3++) {
            i2 += CodedOutputStream.m37200J(WireFormat.m37459a(this.f25274b[i3]), (ByteString) this.f25275c[i3]);
        }
        this.f25276d = i2;
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4750n0)) {
            return false;
        }
        C4750n0 n0Var = (C4750n0) obj;
        int i = this.f25273a;
        if (i != n0Var.f25273a || !m38252n(this.f25274b, n0Var.f25274b, i) || !m38251k(this.f25275c, n0Var.f25275c, this.f25273a)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public void mo35976h() {
        this.f25277e = false;
    }

    public int hashCode() {
        int i = this.f25273a;
        return ((((527 + i) * 31) + m38247f(this.f25274b, i)) * 31) + m38248g(this.f25275c, this.f25273a);
    }

    /* renamed from: l */
    public final void mo35978l(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f25273a; i2++) {
            C4710d0.m37582c(sb, i, String.valueOf(WireFormat.m37459a(this.f25274b[i2])), this.f25275c[i2]);
        }
    }

    /* renamed from: m */
    public void mo35979m(int i, Object obj) {
        mo35971a();
        mo35972b();
        int[] iArr = this.f25274b;
        int i2 = this.f25273a;
        iArr[i2] = i;
        this.f25275c[i2] = obj;
        this.f25273a = i2 + 1;
    }

    /* renamed from: o */
    public void mo35980o(Writer writer) throws IOException {
        if (writer.mo35594t() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.f25273a - 1; i >= 0; i--) {
                writer.mo35576b(WireFormat.m37459a(this.f25274b[i]), this.f25275c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f25273a; i2++) {
            writer.mo35576b(WireFormat.m37459a(this.f25274b[i2]), this.f25275c[i2]);
        }
    }

    /* renamed from: q */
    public void mo35981q(Writer writer) throws IOException {
        if (this.f25273a != 0) {
            if (writer.mo35594t() == Writer.FieldOrder.ASCENDING) {
                for (int i = 0; i < this.f25273a; i++) {
                    m38253p(this.f25274b[i], this.f25275c[i], writer);
                }
                return;
            }
            for (int i2 = this.f25273a - 1; i2 >= 0; i2--) {
                m38253p(this.f25274b[i2], this.f25275c[i2], writer);
            }
        }
    }

    public C4750n0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f25276d = -1;
        this.f25273a = i;
        this.f25274b = iArr;
        this.f25275c = objArr;
        this.f25277e = z;
    }
}

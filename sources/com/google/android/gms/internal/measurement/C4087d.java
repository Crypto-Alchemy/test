package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.d */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public abstract class C4087d extends k09 {

    /* renamed from: b */
    public static final Logger f22612b = Logger.getLogger(C4087d.class.getName());

    /* renamed from: c */
    public static final boolean f22613c = ta9.m52166f();

    /* renamed from: a */
    public j29 f22614a;

    public C4087d() {
    }

    public /* synthetic */ C4087d(b29 b29) {
    }

    /* renamed from: A */
    public static int m34149A(int i) {
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

    /* renamed from: B */
    public static int m34150B(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: C */
    public static int m34151C(String str) {
        int i;
        try {
            i = C4089f.m34184c(str);
        } catch (zzmv unused) {
            i = str.getBytes(p59.f32581a).length;
        }
        return m34149A(i) + i;
    }

    /* renamed from: D */
    public static int m34152D(C4088e eVar) {
        int a = eVar.mo30904a();
        return m34149A(a) + a;
    }

    /* renamed from: a */
    public static int m34153a(zzjd zzjd) {
        int zzc = zzjd.zzc();
        return m34149A(zzc) + zzc;
    }

    /* renamed from: b */
    public static int m34154b(r79 r79, n89 n89) {
        C4085b bVar = (C4085b) r79;
        int e = bVar.mo30881e();
        if (e == -1) {
            e = n89.mo46037d(bVar);
            bVar.mo30882i(e);
        }
        return m34149A(e) + e;
    }

    @Deprecated
    /* renamed from: e */
    public static int m34155e(int i, r79 r79, n89 n89) {
        int A = m34149A(i << 3);
        int i2 = A + A;
        C4085b bVar = (C4085b) r79;
        int e = bVar.mo30881e();
        if (e == -1) {
            e = n89.mo46037d(bVar);
            bVar.mo30882i(e);
        }
        return i2 + e;
    }

    /* renamed from: x */
    public static C4087d m34157x(byte[] bArr) {
        return new C4086c(bArr, 0, bArr.length);
    }

    /* renamed from: y */
    public static int m34158y(int i) {
        return m34149A(i << 3);
    }

    /* renamed from: z */
    public static int m34159z(int i) {
        if (i >= 0) {
            return m34149A(i);
        }
        return 10;
    }

    /* renamed from: c */
    public final void mo30902c() {
        if (mo30901w() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: d */
    public final void mo30903d(String str, zzmv zzmv) throws IOException {
        f22612b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzmv);
        byte[] bytes = str.getBytes(p59.f32581a);
        try {
            int length = bytes.length;
            mo30896r(length);
            mo30900v(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(e);
        } catch (zzjj e2) {
            throw e2;
        }
    }

    /* renamed from: g */
    public abstract void mo30885g(int i, int i2) throws IOException;

    /* renamed from: h */
    public abstract void mo30886h(int i, int i2) throws IOException;

    /* renamed from: i */
    public abstract void mo30887i(int i, int i2) throws IOException;

    /* renamed from: j */
    public abstract void mo30888j(int i, int i2) throws IOException;

    /* renamed from: k */
    public abstract void mo30889k(int i, long j) throws IOException;

    /* renamed from: l */
    public abstract void mo30890l(int i, long j) throws IOException;

    /* renamed from: m */
    public abstract void mo30891m(int i, boolean z) throws IOException;

    /* renamed from: n */
    public abstract void mo30892n(int i, String str) throws IOException;

    /* renamed from: o */
    public abstract void mo30893o(int i, zzjd zzjd) throws IOException;

    /* renamed from: p */
    public abstract void mo30894p(byte b) throws IOException;

    /* renamed from: q */
    public abstract void mo30895q(int i) throws IOException;

    /* renamed from: r */
    public abstract void mo30896r(int i) throws IOException;

    /* renamed from: s */
    public abstract void mo30897s(int i) throws IOException;

    /* renamed from: t */
    public abstract void mo30898t(long j) throws IOException;

    /* renamed from: u */
    public abstract void mo30899u(long j) throws IOException;

    /* renamed from: v */
    public abstract void mo30900v(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: w */
    public abstract int mo30901w();
}

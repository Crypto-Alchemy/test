package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.m0 */
/* compiled from: UnknownFieldSchema */
public abstract class C4747m0<T, B> {
    /* renamed from: a */
    public abstract void mo28851a(B b, int i, int i2);

    /* renamed from: b */
    public abstract void mo28852b(B b, int i, long j);

    /* renamed from: c */
    public abstract void mo28853c(B b, int i, T t);

    /* renamed from: d */
    public abstract void mo28854d(B b, int i, ByteString byteString);

    /* renamed from: e */
    public abstract void mo28855e(B b, int i, long j);

    /* renamed from: f */
    public abstract B mo28856f(Object obj);

    /* renamed from: g */
    public abstract T mo28857g(Object obj);

    /* renamed from: h */
    public abstract int mo28858h(T t);

    /* renamed from: i */
    public abstract int mo28859i(T t);

    /* renamed from: j */
    public abstract void mo28860j(Object obj);

    /* renamed from: k */
    public abstract T mo28861k(T t, T t2);

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35969l(B r3, com.google.crypto.tink.shaded.protobuf.C4729i0 r4) throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.mo35634A()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.mo35970m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4747m0.mo35969l(java.lang.Object, com.google.crypto.tink.shaded.protobuf.i0):void");
    }

    /* renamed from: m */
    public final boolean mo35970m(B b, C4729i0 i0Var) throws IOException {
        int a = i0Var.mo35659a();
        int a2 = WireFormat.m37459a(a);
        int b2 = WireFormat.m37460b(a);
        if (b2 == 0) {
            mo28855e(b, a2, i0Var.mo35641H());
            return true;
        } else if (b2 == 1) {
            mo28852b(b, a2, i0Var.mo35661b());
            return true;
        } else if (b2 == 2) {
            mo28854d(b, a2, i0Var.mo35686o());
            return true;
        } else if (b2 == 3) {
            Object n = mo28862n();
            int c = WireFormat.m37461c(a2, 4);
            mo35969l(n, i0Var);
            if (c == i0Var.mo35659a()) {
                mo28853c(b, a2, mo28866r(n));
                return true;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                mo28851a(b, a2, i0Var.mo35694u());
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* renamed from: n */
    public abstract B mo28862n();

    /* renamed from: o */
    public abstract void mo28863o(Object obj, B b);

    /* renamed from: p */
    public abstract void mo28864p(Object obj, T t);

    /* renamed from: q */
    public abstract boolean mo28865q(C4729i0 i0Var);

    /* renamed from: r */
    public abstract T mo28866r(B b);

    /* renamed from: s */
    public abstract void mo28867s(T t, Writer writer) throws IOException;

    /* renamed from: t */
    public abstract void mo28868t(T t, Writer writer) throws IOException;
}

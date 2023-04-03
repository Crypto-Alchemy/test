package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.m0 */
/* compiled from: UnknownFieldSchema */
public abstract class C5000m0<T, B> {
    /* renamed from: a */
    public abstract void mo37432a(B b, int i, int i2);

    /* renamed from: b */
    public abstract void mo37433b(B b, int i, long j);

    /* renamed from: c */
    public abstract void mo37434c(B b, int i, T t);

    /* renamed from: d */
    public abstract void mo37435d(B b, int i, ByteString byteString);

    /* renamed from: e */
    public abstract void mo37436e(B b, int i, long j);

    /* renamed from: f */
    public abstract B mo37437f(Object obj);

    /* renamed from: g */
    public abstract T mo37438g(Object obj);

    /* renamed from: h */
    public abstract int mo37439h(T t);

    /* renamed from: i */
    public abstract int mo37440i(T t);

    /* renamed from: j */
    public abstract void mo37441j(Object obj);

    /* renamed from: k */
    public abstract T mo37442k(T t, T t2);

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37443l(B r3, com.google.protobuf.C4982i0 r4) throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.mo37091A()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.mo37444m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5000m0.mo37443l(java.lang.Object, com.google.protobuf.i0):void");
    }

    /* renamed from: m */
    public final boolean mo37444m(B b, C4982i0 i0Var) throws IOException {
        int a = i0Var.mo37116a();
        int a2 = WireFormat.m39050a(a);
        int b2 = WireFormat.m39051b(a);
        if (b2 == 0) {
            mo37436e(b, a2, i0Var.mo37098H());
            return true;
        } else if (b2 == 1) {
            mo37433b(b, a2, i0Var.mo37118b());
            return true;
        } else if (b2 == 2) {
            mo37435d(b, a2, i0Var.mo37144o());
            return true;
        } else if (b2 == 3) {
            Object n = mo37445n();
            int c = WireFormat.m39052c(a2, 4);
            mo37443l(n, i0Var);
            if (c == i0Var.mo37116a()) {
                mo37434c(b, a2, mo37449r(n));
                return true;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                mo37432a(b, a2, i0Var.mo37152u());
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* renamed from: n */
    public abstract B mo37445n();

    /* renamed from: o */
    public abstract void mo37446o(Object obj, B b);

    /* renamed from: p */
    public abstract void mo37447p(Object obj, T t);

    /* renamed from: q */
    public abstract boolean mo37448q(C4982i0 i0Var);

    /* renamed from: r */
    public abstract T mo37449r(B b);

    /* renamed from: s */
    public abstract void mo37450s(T t, Writer writer) throws IOException;

    /* renamed from: t */
    public abstract void mo37451t(T t, Writer writer) throws IOException;
}

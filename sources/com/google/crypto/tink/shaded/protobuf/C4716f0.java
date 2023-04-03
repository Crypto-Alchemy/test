package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C4752p;
import com.google.crypto.tink.shaded.protobuf.C4768u;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.f0 */
/* compiled from: MessageSetSchema */
public final class C4716f0<T> implements C4731j0<T> {

    /* renamed from: a */
    public final C4705c0 f25175a;

    /* renamed from: b */
    public final C4747m0<?, ?> f25176b;

    /* renamed from: c */
    public final boolean f25177c;

    /* renamed from: d */
    public final C4746m<?> f25178d;

    public C4716f0(C4747m0<?, ?> m0Var, C4746m<?> mVar, C4705c0 c0Var) {
        this.f25176b = m0Var;
        this.f25177c = mVar.mo35963e(c0Var);
        this.f25178d = mVar;
        this.f25175a = c0Var;
    }

    /* renamed from: m */
    public static <T> C4716f0<T> m37739m(C4747m0<?, ?> m0Var, C4746m<?> mVar, C4705c0 c0Var) {
        return new C4716f0<>(m0Var, mVar, c0Var);
    }

    /* renamed from: a */
    public void mo35712a(T t, T t2) {
        C4733k0.m38123G(this.f25176b, t, t2);
        if (this.f25177c) {
            C4733k0.m38121E(this.f25178d, t, t2);
        }
    }

    /* renamed from: b */
    public T mo35714b() {
        return this.f25175a.newBuilderForType().buildPartial();
    }

    /* renamed from: c */
    public int mo35716c(T t) {
        int hashCode = this.f25176b.mo28857g(t).hashCode();
        if (this.f25177c) {
            return (hashCode * 53) + this.f25178d.mo35961c(t).hashCode();
        }
        return hashCode;
    }

    /* renamed from: d */
    public boolean mo35718d(T t, T t2) {
        if (!this.f25176b.mo28857g(t).equals(this.f25176b.mo28857g(t2))) {
            return false;
        }
        if (this.f25177c) {
            return this.f25178d.mo35961c(t).equals(this.f25178d.mo35961c(t2));
        }
        return true;
    }

    /* renamed from: e */
    public void mo35720e(T t) {
        this.f25176b.mo28860j(t);
        this.f25178d.mo35964f(t);
    }

    /* renamed from: f */
    public final boolean mo35722f(T t) {
        return this.f25178d.mo35961c(t).mo35994o();
    }

    /* renamed from: g */
    public int mo35724g(T t) {
        int k = mo35775k(this.f25176b, t) + 0;
        if (this.f25177c) {
            return k + this.f25178d.mo35961c(t).mo35989j();
        }
        return k;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35726h(T r11, byte[] r12, int r13, int r14, com.google.crypto.tink.shaded.protobuf.C4707d.C4709b r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            com.google.crypto.tink.shaded.protobuf.n0 r1 = r0.unknownFields
            com.google.crypto.tink.shaded.protobuf.n0 r2 = com.google.crypto.tink.shaded.protobuf.C4750n0.m38246c()
            if (r1 != r2) goto L_0x0011
            com.google.crypto.tink.shaded.protobuf.n0 r1 = com.google.crypto.tink.shaded.protobuf.C4750n0.m38250j()
            r0.unknownFields = r1
        L_0x0011:
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$c r11 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.C4682c) r11
            com.google.crypto.tink.shaded.protobuf.p r11 = r11.mo35475C()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00d7
            int r4 = com.google.crypto.tink.shaded.protobuf.C4707d.m37548I(r12, r13, r15)
            int r13 = r15.f25142a
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.f25132a
            r5 = 2
            if (r13 == r3) goto L_0x006b
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.m37460b(r13)
            if (r3 != r5) goto L_0x0066
            com.google.crypto.tink.shaded.protobuf.m<?> r2 = r10.f25178d
            com.google.crypto.tink.shaded.protobuf.l r3 = r15.f25145d
            com.google.crypto.tink.shaded.protobuf.c0 r5 = r10.f25175a
            int r6 = com.google.crypto.tink.shaded.protobuf.WireFormat.m37459a(r13)
            java.lang.Object r2 = r2.mo35960b(r3, r5, r6)
            r8 = r2
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$e r8 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.C4684e) r8
            if (r8 == 0) goto L_0x005b
            ey4 r13 = p000.ey4.m44106a()
            com.google.crypto.tink.shaded.protobuf.c0 r2 = r8.mo35486b()
            java.lang.Class r2 = r2.getClass()
            com.google.crypto.tink.shaded.protobuf.j0 r13 = r13.mo42452d(r2)
            int r13 = com.google.crypto.tink.shaded.protobuf.C4707d.m37569p(r13, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$d r2 = r8.f25112b
            java.lang.Object r3 = r15.f25144c
            r11.mo35999w(r2, r3)
            goto L_0x0064
        L_0x005b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.crypto.tink.shaded.protobuf.C4707d.m37546G(r2, r3, r4, r5, r6, r7)
        L_0x0064:
            r2 = r8
            goto L_0x0019
        L_0x0066:
            int r13 = com.google.crypto.tink.shaded.protobuf.C4707d.m37553N(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x006b:
            r13 = 0
            r3 = r0
        L_0x006d:
            if (r4 >= r14) goto L_0x00cb
            int r4 = com.google.crypto.tink.shaded.protobuf.C4707d.m37548I(r12, r4, r15)
            int r6 = r15.f25142a
            int r7 = com.google.crypto.tink.shaded.protobuf.WireFormat.m37459a(r6)
            int r8 = com.google.crypto.tink.shaded.protobuf.WireFormat.m37460b(r6)
            if (r7 == r5) goto L_0x00ac
            r9 = 3
            if (r7 == r9) goto L_0x0083
            goto L_0x00c1
        L_0x0083:
            if (r2 == 0) goto L_0x00a1
            ey4 r6 = p000.ey4.m44106a()
            com.google.crypto.tink.shaded.protobuf.c0 r7 = r2.mo35486b()
            java.lang.Class r7 = r7.getClass()
            com.google.crypto.tink.shaded.protobuf.j0 r6 = r6.mo42452d(r7)
            int r4 = com.google.crypto.tink.shaded.protobuf.C4707d.m37569p(r6, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$d r6 = r2.f25112b
            java.lang.Object r7 = r15.f25144c
            r11.mo35999w(r6, r7)
            goto L_0x006d
        L_0x00a1:
            if (r8 != r5) goto L_0x00c1
            int r4 = com.google.crypto.tink.shaded.protobuf.C4707d.m37555b(r12, r4, r15)
            java.lang.Object r3 = r15.f25144c
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            goto L_0x006d
        L_0x00ac:
            if (r8 != 0) goto L_0x00c1
            int r4 = com.google.crypto.tink.shaded.protobuf.C4707d.m37548I(r12, r4, r15)
            int r13 = r15.f25142a
            com.google.crypto.tink.shaded.protobuf.m<?> r2 = r10.f25178d
            com.google.crypto.tink.shaded.protobuf.l r6 = r15.f25145d
            com.google.crypto.tink.shaded.protobuf.c0 r7 = r10.f25175a
            java.lang.Object r2 = r2.mo35960b(r6, r7, r13)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$e r2 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.C4684e) r2
            goto L_0x006d
        L_0x00c1:
            int r7 = com.google.crypto.tink.shaded.protobuf.WireFormat.f25133b
            if (r6 != r7) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r4 = com.google.crypto.tink.shaded.protobuf.C4707d.m37553N(r6, r12, r4, r14, r15)
            goto L_0x006d
        L_0x00cb:
            if (r3 == 0) goto L_0x00d4
            int r13 = com.google.crypto.tink.shaded.protobuf.WireFormat.m37461c(r13, r5)
            r1.mo35979m(r13, r3)
        L_0x00d4:
            r13 = r4
            goto L_0x0019
        L_0x00d7:
            if (r13 != r14) goto L_0x00da
            return
        L_0x00da:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r11 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4716f0.mo35726h(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.d$b):void");
    }

    /* renamed from: i */
    public void mo35728i(T t, C4729i0 i0Var, C4734l lVar) throws IOException {
        mo35776l(this.f25176b, this.f25178d, t, i0Var, lVar);
    }

    /* renamed from: j */
    public void mo35730j(T t, Writer writer) throws IOException {
        Iterator<Map.Entry<?, Object>> r = this.f25178d.mo35961c(t).mo35995r();
        while (r.hasNext()) {
            Map.Entry next = r.next();
            C4752p.C4754b bVar = (C4752p.C4754b) next.getKey();
            if (bVar.mo35484n() != WireFormat.JavaType.MESSAGE || bVar.mo35482j() || bVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C4768u.C4770b) {
                writer.mo35576b(bVar.getNumber(), ((C4768u.C4770b) next).mo36045a().mo36057e());
            } else {
                writer.mo35576b(bVar.getNumber(), next.getValue());
            }
        }
        mo35778o(this.f25176b, t, writer);
    }

    /* renamed from: k */
    public final <UT, UB> int mo35775k(C4747m0<UT, UB> m0Var, T t) {
        return m0Var.mo28859i(m0Var.mo28857g(t));
    }

    /* renamed from: l */
    public final <UT, UB, ET extends C4752p.C4754b<ET>> void mo35776l(C4747m0<UT, UB> m0Var, C4746m<ET> mVar, T t, C4729i0 i0Var, C4734l lVar) throws IOException {
        UB f = m0Var.mo28856f(t);
        C4752p<ET> d = mVar.mo35962d(t);
        do {
            try {
                if (i0Var.mo35634A() == Integer.MAX_VALUE) {
                    m0Var.mo28863o(t, f);
                    return;
                }
            } finally {
                m0Var.mo28863o(t, f);
            }
        } while (mo35777n(i0Var, lVar, mVar, d, m0Var, f));
    }

    /* renamed from: n */
    public final <UT, UB, ET extends C4752p.C4754b<ET>> boolean mo35777n(C4729i0 i0Var, C4734l lVar, C4746m<ET> mVar, C4752p<ET> pVar, C4747m0<UT, UB> m0Var, UB ub) throws IOException {
        int a = i0Var.mo35659a();
        if (a == WireFormat.f25132a) {
            int i = 0;
            Object obj = null;
            ByteString byteString = null;
            while (i0Var.mo35634A() != Integer.MAX_VALUE) {
                int a2 = i0Var.mo35659a();
                if (a2 == WireFormat.f25134c) {
                    i = i0Var.mo35673h();
                    obj = mVar.mo35960b(lVar, this.f25175a, i);
                } else if (a2 == WireFormat.f25135d) {
                    if (obj != null) {
                        mVar.mo35966h(i0Var, obj, lVar, pVar);
                    } else {
                        byteString = i0Var.mo35686o();
                    }
                } else if (!i0Var.mo35637D()) {
                    break;
                }
            }
            if (i0Var.mo35659a() == WireFormat.f25133b) {
                if (byteString != null) {
                    if (obj != null) {
                        mVar.mo35967i(byteString, obj, lVar, pVar);
                    } else {
                        m0Var.mo28854d(ub, i, byteString);
                    }
                }
                return true;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        } else if (WireFormat.m37460b(a) != 2) {
            return i0Var.mo35637D();
        } else {
            Object b = mVar.mo35960b(lVar, this.f25175a, WireFormat.m37459a(a));
            if (b == null) {
                return m0Var.mo35970m(ub, i0Var);
            }
            mVar.mo35966h(i0Var, b, lVar, pVar);
            return true;
        }
    }

    /* renamed from: o */
    public final <UT, UB> void mo35778o(C4747m0<UT, UB> m0Var, T t, Writer writer) throws IOException {
        m0Var.mo28867s(m0Var.mo28857g(t), writer);
    }
}

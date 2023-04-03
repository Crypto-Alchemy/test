package com.google.protobuf;

import com.google.protobuf.C5005p;
import com.google.protobuf.C5021u;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.f0 */
/* compiled from: MessageSetSchema */
public final class C4968f0<T> implements C4984j0<T> {

    /* renamed from: a */
    public final C4956c0 f25630a;

    /* renamed from: b */
    public final C5000m0<?, ?> f25631b;

    /* renamed from: c */
    public final boolean f25632c;

    /* renamed from: d */
    public final C4999m<?> f25633d;

    public C4968f0(C5000m0<?, ?> m0Var, C4999m<?> mVar, C4956c0 c0Var) {
        this.f25631b = m0Var;
        this.f25632c = mVar.mo37426e(c0Var);
        this.f25633d = mVar;
        this.f25630a = c0Var;
    }

    /* renamed from: m */
    public static <T> C4968f0<T> m39327m(C5000m0<?, ?> m0Var, C4999m<?> mVar, C4956c0 c0Var) {
        return new C4968f0<>(m0Var, mVar, c0Var);
    }

    /* renamed from: a */
    public void mo37170a(T t, T t2) {
        C4986k0.m39720G(this.f25631b, t, t2);
        if (this.f25632c) {
            C4986k0.m39718E(this.f25633d, t, t2);
        }
    }

    /* renamed from: b */
    public T mo37171b() {
        return this.f25630a.newBuilderForType().buildPartial();
    }

    /* renamed from: c */
    public int mo37173c(T t) {
        int hashCode = this.f25631b.mo37438g(t).hashCode();
        if (this.f25632c) {
            return (hashCode * 53) + this.f25633d.mo37424c(t).hashCode();
        }
        return hashCode;
    }

    /* renamed from: d */
    public boolean mo37175d(T t, T t2) {
        if (!this.f25631b.mo37438g(t).equals(this.f25631b.mo37438g(t2))) {
            return false;
        }
        if (this.f25632c) {
            return this.f25633d.mo37424c(t).equals(this.f25633d.mo37424c(t2));
        }
        return true;
    }

    /* renamed from: e */
    public void mo37177e(T t) {
        this.f25631b.mo37441j(t);
        this.f25633d.mo37427f(t);
    }

    /* renamed from: f */
    public final boolean mo37179f(T t) {
        return this.f25633d.mo37424c(t).mo37479p();
    }

    /* renamed from: g */
    public int mo37181g(T t) {
        int k = mo37233k(this.f25631b, t) + 0;
        if (this.f25632c) {
            return k + this.f25633d.mo37424c(t).mo37474j();
        }
        return k;
    }

    /* renamed from: h */
    public void mo37183h(T t, Writer writer) throws IOException {
        Iterator<Map.Entry<?, Object>> t2 = this.f25633d.mo37424c(t).mo37480t();
        while (t2.hasNext()) {
            Map.Entry next = t2.next();
            C5005p.C5007b bVar = (C5005p.C5007b) next.getKey();
            if (bVar.mo36924n() != WireFormat.JavaType.MESSAGE || bVar.mo36922j() || bVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C5021u.C5023b) {
                writer.mo37016b(bVar.getNumber(), ((C5021u.C5023b) next).mo37531a().mo37543e());
            } else {
                writer.mo37016b(bVar.getNumber(), next.getValue());
            }
        }
        mo37236o(this.f25631b, t, writer);
    }

    /* renamed from: i */
    public void mo37185i(T t, C4982i0 i0Var, C4987l lVar) throws IOException {
        mo37234l(this.f25631b, this.f25633d, t, i0Var, lVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.protobuf.GeneratedMessageLite$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37187j(T r11, byte[] r12, int r13, int r14, com.google.protobuf.C4958d.C4960b r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            com.google.protobuf.n0 r1 = r0.unknownFields
            com.google.protobuf.n0 r2 = com.google.protobuf.C5003n0.m39843c()
            if (r1 != r2) goto L_0x0011
            com.google.protobuf.n0 r1 = com.google.protobuf.C5003n0.m39847n()
            r0.unknownFields = r1
        L_0x0011:
            com.google.protobuf.GeneratedMessageLite$c r11 = (com.google.protobuf.GeneratedMessageLite.C4932c) r11
            com.google.protobuf.p r11 = r11.mo36915a()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00d7
            int r4 = com.google.protobuf.C4958d.m39133I(r12, r13, r15)
            int r13 = r15.f25595a
            int r3 = com.google.protobuf.WireFormat.f25584a
            r5 = 2
            if (r13 == r3) goto L_0x006b
            int r3 = com.google.protobuf.WireFormat.m39051b(r13)
            if (r3 != r5) goto L_0x0066
            com.google.protobuf.m<?> r2 = r10.f25633d
            com.google.protobuf.l r3 = r15.f25598d
            com.google.protobuf.c0 r5 = r10.f25630a
            int r6 = com.google.protobuf.WireFormat.m39050a(r13)
            java.lang.Object r2 = r2.mo37423b(r3, r5, r6)
            r8 = r2
            com.google.protobuf.GeneratedMessageLite$e r8 = (com.google.protobuf.GeneratedMessageLite.C4934e) r8
            if (r8 == 0) goto L_0x005b
            dy4 r13 = p000.dy4.m43731a()
            com.google.protobuf.c0 r2 = r8.mo36926c()
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.j0 r13 = r13.mo42089d(r2)
            int r13 = com.google.protobuf.C4958d.m39154p(r13, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$d r2 = r8.f25564d
            java.lang.Object r3 = r15.f25597c
            r11.mo37484y(r2, r3)
            goto L_0x0064
        L_0x005b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.C4958d.m39131G(r2, r3, r4, r5, r6, r7)
        L_0x0064:
            r2 = r8
            goto L_0x0019
        L_0x0066:
            int r13 = com.google.protobuf.C4958d.m39138N(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x006b:
            r13 = 0
            r3 = r0
        L_0x006d:
            if (r4 >= r14) goto L_0x00cb
            int r4 = com.google.protobuf.C4958d.m39133I(r12, r4, r15)
            int r6 = r15.f25595a
            int r7 = com.google.protobuf.WireFormat.m39050a(r6)
            int r8 = com.google.protobuf.WireFormat.m39051b(r6)
            if (r7 == r5) goto L_0x00ac
            r9 = 3
            if (r7 == r9) goto L_0x0083
            goto L_0x00c1
        L_0x0083:
            if (r2 == 0) goto L_0x00a1
            dy4 r6 = p000.dy4.m43731a()
            com.google.protobuf.c0 r7 = r2.mo36926c()
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.j0 r6 = r6.mo42089d(r7)
            int r4 = com.google.protobuf.C4958d.m39154p(r6, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$d r6 = r2.f25564d
            java.lang.Object r7 = r15.f25597c
            r11.mo37484y(r6, r7)
            goto L_0x006d
        L_0x00a1:
            if (r8 != r5) goto L_0x00c1
            int r4 = com.google.protobuf.C4958d.m39140b(r12, r4, r15)
            java.lang.Object r3 = r15.f25597c
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            goto L_0x006d
        L_0x00ac:
            if (r8 != 0) goto L_0x00c1
            int r4 = com.google.protobuf.C4958d.m39133I(r12, r4, r15)
            int r13 = r15.f25595a
            com.google.protobuf.m<?> r2 = r10.f25633d
            com.google.protobuf.l r6 = r15.f25598d
            com.google.protobuf.c0 r7 = r10.f25630a
            java.lang.Object r2 = r2.mo37423b(r6, r7, r13)
            com.google.protobuf.GeneratedMessageLite$e r2 = (com.google.protobuf.GeneratedMessageLite.C4934e) r2
            goto L_0x006d
        L_0x00c1:
            int r7 = com.google.protobuf.WireFormat.f25585b
            if (r6 != r7) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r4 = com.google.protobuf.C4958d.m39138N(r6, r12, r4, r14, r15)
            goto L_0x006d
        L_0x00cb:
            if (r3 == 0) goto L_0x00d4
            int r13 = com.google.protobuf.WireFormat.m39052c(r13, r5)
            r1.mo37464q(r13, r3)
        L_0x00d4:
            r13 = r4
            goto L_0x0019
        L_0x00d7:
            if (r13 != r14) goto L_0x00da
            return
        L_0x00da:
            com.google.protobuf.InvalidProtocolBufferException r11 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4968f0.mo37187j(java.lang.Object, byte[], int, int, com.google.protobuf.d$b):void");
    }

    /* renamed from: k */
    public final <UT, UB> int mo37233k(C5000m0<UT, UB> m0Var, T t) {
        return m0Var.mo37440i(m0Var.mo37438g(t));
    }

    /* renamed from: l */
    public final <UT, UB, ET extends C5005p.C5007b<ET>> void mo37234l(C5000m0<UT, UB> m0Var, C4999m<ET> mVar, T t, C4982i0 i0Var, C4987l lVar) throws IOException {
        UB f = m0Var.mo37437f(t);
        C5005p<ET> d = mVar.mo37425d(t);
        do {
            try {
                if (i0Var.mo37091A() == Integer.MAX_VALUE) {
                    m0Var.mo37446o(t, f);
                    return;
                }
            } finally {
                m0Var.mo37446o(t, f);
            }
        } while (mo37235n(i0Var, lVar, mVar, d, m0Var, f));
    }

    /* renamed from: n */
    public final <UT, UB, ET extends C5005p.C5007b<ET>> boolean mo37235n(C4982i0 i0Var, C4987l lVar, C4999m<ET> mVar, C5005p<ET> pVar, C5000m0<UT, UB> m0Var, UB ub) throws IOException {
        int a = i0Var.mo37116a();
        if (a == WireFormat.f25584a) {
            int i = 0;
            Object obj = null;
            ByteString byteString = null;
            while (i0Var.mo37091A() != Integer.MAX_VALUE) {
                int a2 = i0Var.mo37116a();
                if (a2 == WireFormat.f25586c) {
                    i = i0Var.mo37130h();
                    obj = mVar.mo37423b(lVar, this.f25630a, i);
                } else if (a2 == WireFormat.f25587d) {
                    if (obj != null) {
                        mVar.mo37429h(i0Var, obj, lVar, pVar);
                    } else {
                        byteString = i0Var.mo37144o();
                    }
                } else if (!i0Var.mo37094D()) {
                    break;
                }
            }
            if (i0Var.mo37116a() == WireFormat.f25585b) {
                if (byteString != null) {
                    if (obj != null) {
                        mVar.mo37430i(byteString, obj, lVar, pVar);
                    } else {
                        m0Var.mo37435d(ub, i, byteString);
                    }
                }
                return true;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        } else if (WireFormat.m39051b(a) != 2) {
            return i0Var.mo37094D();
        } else {
            Object b = mVar.mo37423b(lVar, this.f25630a, WireFormat.m39050a(a));
            if (b == null) {
                return m0Var.mo37444m(ub, i0Var);
            }
            mVar.mo37429h(i0Var, b, lVar, pVar);
            return true;
        }
    }

    /* renamed from: o */
    public final <UT, UB> void mo37236o(C5000m0<UT, UB> m0Var, T t, Writer writer) throws IOException {
        m0Var.mo37450s(m0Var.mo37438g(t), writer);
    }
}

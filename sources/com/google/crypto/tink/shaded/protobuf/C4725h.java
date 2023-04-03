package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C4779z;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h */
/* compiled from: CodedInputStreamReader */
public final class C4725h implements C4729i0 {

    /* renamed from: a */
    public final C4717g f25228a;

    /* renamed from: b */
    public int f25229b;

    /* renamed from: c */
    public int f25230c;

    /* renamed from: d */
    public int f25231d = 0;

    public C4725h(C4717g gVar) {
        C4717g gVar2 = (C4717g) C4758t.m38321b(gVar, "input");
        this.f25228a = gVar2;
        gVar2.f25183d = this;
    }

    /* renamed from: Q */
    public static C4725h m37952Q(C4717g gVar) {
        C4725h hVar = gVar.f25183d;
        if (hVar != null) {
            return hVar;
        }
        return new C4725h(gVar);
    }

    /* renamed from: A */
    public int mo35634A() throws IOException {
        int i = this.f25231d;
        if (i != 0) {
            this.f25229b = i;
            this.f25231d = 0;
        } else {
            this.f25229b = this.f25228a.mo35782D();
        }
        int i2 = this.f25229b;
        if (i2 == 0 || i2 == this.f25230c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.m37459a(i2);
    }

    /* renamed from: B */
    public void mo35635B(List<String> list) throws IOException {
        mo35870T(list, false);
    }

    /* renamed from: C */
    public void mo35636C(List<Float> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C4755q) {
            C4755q qVar = (C4755q) list;
            int b = WireFormat.m37460b(this.f25229b);
            if (b == 2) {
                int E = this.f25228a.mo35783E();
                mo35873W(E);
                int d = this.f25228a.mo35787d() + E;
                do {
                    qVar.mo36009n(this.f25228a.mo35797u());
                } while (this.f25228a.mo35787d() < d);
            } else if (b == 5) {
                do {
                    qVar.mo36009n(this.f25228a.mo35797u());
                    if (!this.f25228a.mo35788e()) {
                        D2 = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D2 == this.f25229b);
                this.f25231d = D2;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m37460b(this.f25229b);
            if (b2 == 2) {
                int E2 = this.f25228a.mo35783E();
                mo35873W(E2);
                int d2 = this.f25228a.mo35787d() + E2;
                do {
                    list.add(Float.valueOf(this.f25228a.mo35797u()));
                } while (this.f25228a.mo35787d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Float.valueOf(this.f25228a.mo35797u()));
                    if (!this.f25228a.mo35788e()) {
                        D = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D == this.f25229b);
                this.f25231d = D;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: D */
    public boolean mo35637D() throws IOException {
        int i;
        if (this.f25228a.mo35788e() || (i = this.f25229b) == this.f25230c) {
            return false;
        }
        return this.f25228a.mo35785G(i);
    }

    /* renamed from: E */
    public int mo35638E() throws IOException {
        mo35872V(5);
        return this.f25228a.mo35800x();
    }

    /* renamed from: F */
    public void mo35639F(List<ByteString> list) throws IOException {
        int D;
        if (WireFormat.m37460b(this.f25229b) == 2) {
            do {
                list.add(mo35686o());
                if (!this.f25228a.mo35788e()) {
                    D = this.f25228a.mo35782D();
                } else {
                    return;
                }
            } while (D == this.f25229b);
            this.f25231d = D;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: G */
    public void mo35640G(List<Double> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C4730j) {
            C4730j jVar = (C4730j) list;
            int b = WireFormat.m37460b(this.f25229b);
            if (b == 1) {
                do {
                    jVar.mo35892n(this.f25228a.mo35793q());
                    if (!this.f25228a.mo35788e()) {
                        D2 = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D2 == this.f25229b);
                this.f25231d = D2;
            } else if (b == 2) {
                int E = this.f25228a.mo35783E();
                mo35874X(E);
                int d = this.f25228a.mo35787d() + E;
                do {
                    jVar.mo35892n(this.f25228a.mo35793q());
                } while (this.f25228a.mo35787d() < d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m37460b(this.f25229b);
            if (b2 == 1) {
                do {
                    list.add(Double.valueOf(this.f25228a.mo35793q()));
                    if (!this.f25228a.mo35788e()) {
                        D = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D == this.f25229b);
                this.f25231d = D;
            } else if (b2 == 2) {
                int E2 = this.f25228a.mo35783E();
                mo35874X(E2);
                int d2 = this.f25228a.mo35787d() + E2;
                do {
                    list.add(Double.valueOf(this.f25228a.mo35793q()));
                } while (this.f25228a.mo35787d() < d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: H */
    public long mo35641H() throws IOException {
        mo35872V(0);
        return this.f25228a.mo35799w();
    }

    /* renamed from: I */
    public String mo35642I() throws IOException {
        mo35872V(2);
        return this.f25228a.mo35781C();
    }

    /* renamed from: J */
    public <T> T mo35643J(C4731j0<T> j0Var, C4734l lVar) throws IOException {
        mo35872V(3);
        return mo35868R(j0Var, lVar);
    }

    /* renamed from: K */
    public <T> T mo35644K(Class<T> cls, C4734l lVar) throws IOException {
        mo35872V(3);
        return mo35868R(ey4.m44106a().mo42452d(cls), lVar);
    }

    /* renamed from: L */
    public <K, V> void mo35645L(Map<K, V> map, C4779z.C4780a<K, V> aVar, C4734l lVar) throws IOException {
        mo35872V(2);
        this.f25228a.mo35790n(this.f25228a.mo35783E());
        throw null;
    }

    /* renamed from: M */
    public <T> void mo35646M(List<T> list, C4731j0<T> j0Var, C4734l lVar) throws IOException {
        int D;
        if (WireFormat.m37460b(this.f25229b) == 2) {
            int i = this.f25229b;
            do {
                list.add(mo35869S(j0Var, lVar));
                if (!this.f25228a.mo35788e() && this.f25231d == 0) {
                    D = this.f25228a.mo35782D();
                } else {
                    return;
                }
            } while (D == i);
            this.f25231d = D;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: N */
    public <T> T mo35647N(C4731j0<T> j0Var, C4734l lVar) throws IOException {
        mo35872V(2);
        return mo35869S(j0Var, lVar);
    }

    /* renamed from: O */
    public <T> T mo35648O(Class<T> cls, C4734l lVar) throws IOException {
        mo35872V(2);
        return mo35869S(ey4.m44106a().mo42452d(cls), lVar);
    }

    /* renamed from: P */
    public <T> void mo35649P(List<T> list, C4731j0<T> j0Var, C4734l lVar) throws IOException {
        int D;
        if (WireFormat.m37460b(this.f25229b) == 3) {
            int i = this.f25229b;
            do {
                list.add(mo35868R(j0Var, lVar));
                if (!this.f25228a.mo35788e() && this.f25231d == 0) {
                    D = this.f25228a.mo35782D();
                } else {
                    return;
                }
            } while (D == i);
            this.f25231d = D;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: R */
    public final <T> T mo35868R(C4731j0<T> j0Var, C4734l lVar) throws IOException {
        int i = this.f25230c;
        this.f25230c = WireFormat.m37461c(WireFormat.m37459a(this.f25229b), 4);
        try {
            T b = j0Var.mo35714b();
            j0Var.mo35728i(b, this, lVar);
            j0Var.mo35720e(b);
            if (this.f25229b == this.f25230c) {
                return b;
            }
            throw InvalidProtocolBufferException.parseFailure();
        } finally {
            this.f25230c = i;
        }
    }

    /* renamed from: S */
    public final <T> T mo35869S(C4731j0<T> j0Var, C4734l lVar) throws IOException {
        int E = this.f25228a.mo35783E();
        C4717g gVar = this.f25228a;
        if (gVar.f25180a < gVar.f25181b) {
            int n = gVar.mo35790n(E);
            T b = j0Var.mo35714b();
            this.f25228a.f25180a++;
            j0Var.mo35728i(b, this, lVar);
            j0Var.mo35720e(b);
            this.f25228a.mo35786a(0);
            C4717g gVar2 = this.f25228a;
            gVar2.f25180a--;
            gVar2.mo35789m(n);
            return b;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    /* renamed from: T */
    public void mo35870T(List<String> list, boolean z) throws IOException {
        String str;
        int D;
        int D2;
        if (WireFormat.m37460b(this.f25229b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        } else if (!(list instanceof yf3) || z) {
            do {
                if (z) {
                    str = mo35642I();
                } else {
                    str = mo35699z();
                }
                list.add(str);
                if (!this.f25228a.mo35788e()) {
                    D = this.f25228a.mo35782D();
                } else {
                    return;
                }
            } while (D == this.f25229b);
            this.f25231d = D;
        } else {
            yf3 yf3 = (yf3) list;
            do {
                yf3.mo36058a1(mo35686o());
                if (!this.f25228a.mo35788e()) {
                    D2 = this.f25228a.mo35782D();
                } else {
                    return;
                }
            } while (D2 == this.f25229b);
            this.f25231d = D2;
        }
    }

    /* renamed from: U */
    public final void mo35871U(int i) throws IOException {
        if (this.f25228a.mo35787d() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* renamed from: V */
    public final void mo35872V(int i) throws IOException {
        if (WireFormat.m37460b(this.f25229b) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* renamed from: W */
    public final void mo35873W(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* renamed from: X */
    public final void mo35874X(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* renamed from: a */
    public int mo35659a() {
        return this.f25229b;
    }

    /* renamed from: b */
    public long mo35661b() throws IOException {
        mo35872V(1);
        return this.f25228a.mo35796t();
    }

    /* renamed from: c */
    public void mo35663c(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C4757s) {
            C4757s sVar = (C4757s) list;
            int b = WireFormat.m37460b(this.f25229b);
            if (b == 2) {
                int E = this.f25228a.mo35783E();
                mo35873W(E);
                int d = this.f25228a.mo35787d() + E;
                do {
                    sVar.mo36030n(this.f25228a.mo35800x());
                } while (this.f25228a.mo35787d() < d);
            } else if (b == 5) {
                do {
                    sVar.mo36030n(this.f25228a.mo35800x());
                    if (!this.f25228a.mo35788e()) {
                        D2 = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D2 == this.f25229b);
                this.f25231d = D2;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m37460b(this.f25229b);
            if (b2 == 2) {
                int E2 = this.f25228a.mo35783E();
                mo35873W(E2);
                int d2 = this.f25228a.mo35787d() + E2;
                do {
                    list.add(Integer.valueOf(this.f25228a.mo35800x()));
                } while (this.f25228a.mo35787d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f25228a.mo35800x()));
                    if (!this.f25228a.mo35788e()) {
                        D = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D == this.f25229b);
                this.f25231d = D;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: d */
    public void mo35665d(List<Long> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C4778y) {
            C4778y yVar = (C4778y) list;
            int b = WireFormat.m37460b(this.f25229b);
            if (b == 0) {
                do {
                    yVar.mo36083o(this.f25228a.mo35779A());
                    if (!this.f25228a.mo35788e()) {
                        D2 = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D2 == this.f25229b);
                this.f25231d = D2;
            } else if (b == 2) {
                int d = this.f25228a.mo35787d() + this.f25228a.mo35783E();
                do {
                    yVar.mo36083o(this.f25228a.mo35779A());
                } while (this.f25228a.mo35787d() < d);
                mo35871U(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m37460b(this.f25229b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f25228a.mo35779A()));
                    if (!this.f25228a.mo35788e()) {
                        D = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D == this.f25229b);
                this.f25231d = D;
            } else if (b2 == 2) {
                int d2 = this.f25228a.mo35787d() + this.f25228a.mo35783E();
                do {
                    list.add(Long.valueOf(this.f25228a.mo35779A()));
                } while (this.f25228a.mo35787d() < d2);
                mo35871U(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: e */
    public boolean mo35667e() throws IOException {
        mo35872V(0);
        return this.f25228a.mo35791o();
    }

    /* renamed from: f */
    public long mo35669f() throws IOException {
        mo35872V(1);
        return this.f25228a.mo35801y();
    }

    /* renamed from: g */
    public void mo35671g(List<Long> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C4778y) {
            C4778y yVar = (C4778y) list;
            int b = WireFormat.m37460b(this.f25229b);
            if (b == 0) {
                do {
                    yVar.mo36083o(this.f25228a.mo35784F());
                    if (!this.f25228a.mo35788e()) {
                        D2 = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D2 == this.f25229b);
                this.f25231d = D2;
            } else if (b == 2) {
                int d = this.f25228a.mo35787d() + this.f25228a.mo35783E();
                do {
                    yVar.mo36083o(this.f25228a.mo35784F());
                } while (this.f25228a.mo35787d() < d);
                mo35871U(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m37460b(this.f25229b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f25228a.mo35784F()));
                    if (!this.f25228a.mo35788e()) {
                        D = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D == this.f25229b);
                this.f25231d = D;
            } else if (b2 == 2) {
                int d2 = this.f25228a.mo35787d() + this.f25228a.mo35783E();
                do {
                    list.add(Long.valueOf(this.f25228a.mo35784F()));
                } while (this.f25228a.mo35787d() < d2);
                mo35871U(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: h */
    public int mo35673h() throws IOException {
        mo35872V(0);
        return this.f25228a.mo35783E();
    }

    /* renamed from: i */
    public void mo35675i(List<Long> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C4778y) {
            C4778y yVar = (C4778y) list;
            int b = WireFormat.m37460b(this.f25229b);
            if (b == 0) {
                do {
                    yVar.mo36083o(this.f25228a.mo35799w());
                    if (!this.f25228a.mo35788e()) {
                        D2 = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D2 == this.f25229b);
                this.f25231d = D2;
            } else if (b == 2) {
                int d = this.f25228a.mo35787d() + this.f25228a.mo35783E();
                do {
                    yVar.mo36083o(this.f25228a.mo35799w());
                } while (this.f25228a.mo35787d() < d);
                mo35871U(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m37460b(this.f25229b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f25228a.mo35799w()));
                    if (!this.f25228a.mo35788e()) {
                        D = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D == this.f25229b);
                this.f25231d = D;
            } else if (b2 == 2) {
                int d2 = this.f25228a.mo35787d() + this.f25228a.mo35783E();
                do {
                    list.add(Long.valueOf(this.f25228a.mo35799w()));
                } while (this.f25228a.mo35787d() < d2);
                mo35871U(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: j */
    public void mo35677j(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C4757s) {
            C4757s sVar = (C4757s) list;
            int b = WireFormat.m37460b(this.f25229b);
            if (b == 0) {
                do {
                    sVar.mo36030n(this.f25228a.mo35794r());
                    if (!this.f25228a.mo35788e()) {
                        D2 = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D2 == this.f25229b);
                this.f25231d = D2;
            } else if (b == 2) {
                int d = this.f25228a.mo35787d() + this.f25228a.mo35783E();
                do {
                    sVar.mo36030n(this.f25228a.mo35794r());
                } while (this.f25228a.mo35787d() < d);
                mo35871U(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m37460b(this.f25229b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f25228a.mo35794r()));
                    if (!this.f25228a.mo35788e()) {
                        D = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D == this.f25229b);
                this.f25231d = D;
            } else if (b2 == 2) {
                int d2 = this.f25228a.mo35787d() + this.f25228a.mo35783E();
                do {
                    list.add(Integer.valueOf(this.f25228a.mo35794r()));
                } while (this.f25228a.mo35787d() < d2);
                mo35871U(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: k */
    public int mo35679k() throws IOException {
        mo35872V(0);
        return this.f25228a.mo35794r();
    }

    /* renamed from: l */
    public int mo35681l() throws IOException {
        mo35872V(0);
        return this.f25228a.mo35802z();
    }

    /* renamed from: m */
    public void mo35683m(List<Boolean> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C4715f) {
            C4715f fVar = (C4715f) list;
            int b = WireFormat.m37460b(this.f25229b);
            if (b == 0) {
                do {
                    fVar.mo35765o(this.f25228a.mo35791o());
                    if (!this.f25228a.mo35788e()) {
                        D2 = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D2 == this.f25229b);
                this.f25231d = D2;
            } else if (b == 2) {
                int d = this.f25228a.mo35787d() + this.f25228a.mo35783E();
                do {
                    fVar.mo35765o(this.f25228a.mo35791o());
                } while (this.f25228a.mo35787d() < d);
                mo35871U(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m37460b(this.f25229b);
            if (b2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f25228a.mo35791o()));
                    if (!this.f25228a.mo35788e()) {
                        D = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D == this.f25229b);
                this.f25231d = D;
            } else if (b2 == 2) {
                int d2 = this.f25228a.mo35787d() + this.f25228a.mo35783E();
                do {
                    list.add(Boolean.valueOf(this.f25228a.mo35791o()));
                } while (this.f25228a.mo35787d() < d2);
                mo35871U(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: n */
    public void mo35685n(List<String> list) throws IOException {
        mo35870T(list, true);
    }

    /* renamed from: o */
    public ByteString mo35686o() throws IOException {
        mo35872V(2);
        return this.f25228a.mo35792p();
    }

    /* renamed from: p */
    public int mo35687p() throws IOException {
        mo35872V(0);
        return this.f25228a.mo35798v();
    }

    /* renamed from: q */
    public void mo35688q(List<Long> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C4778y) {
            C4778y yVar = (C4778y) list;
            int b = WireFormat.m37460b(this.f25229b);
            if (b == 1) {
                do {
                    yVar.mo36083o(this.f25228a.mo35796t());
                    if (!this.f25228a.mo35788e()) {
                        D2 = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D2 == this.f25229b);
                this.f25231d = D2;
            } else if (b == 2) {
                int E = this.f25228a.mo35783E();
                mo35874X(E);
                int d = this.f25228a.mo35787d() + E;
                do {
                    yVar.mo36083o(this.f25228a.mo35796t());
                } while (this.f25228a.mo35787d() < d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m37460b(this.f25229b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f25228a.mo35796t()));
                    if (!this.f25228a.mo35788e()) {
                        D = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D == this.f25229b);
                this.f25231d = D;
            } else if (b2 == 2) {
                int E2 = this.f25228a.mo35783E();
                mo35874X(E2);
                int d2 = this.f25228a.mo35787d() + E2;
                do {
                    list.add(Long.valueOf(this.f25228a.mo35796t()));
                } while (this.f25228a.mo35787d() < d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: r */
    public void mo35689r(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C4757s) {
            C4757s sVar = (C4757s) list;
            int b = WireFormat.m37460b(this.f25229b);
            if (b == 0) {
                do {
                    sVar.mo36030n(this.f25228a.mo35802z());
                    if (!this.f25228a.mo35788e()) {
                        D2 = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D2 == this.f25229b);
                this.f25231d = D2;
            } else if (b == 2) {
                int d = this.f25228a.mo35787d() + this.f25228a.mo35783E();
                do {
                    sVar.mo36030n(this.f25228a.mo35802z());
                } while (this.f25228a.mo35787d() < d);
                mo35871U(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m37460b(this.f25229b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f25228a.mo35802z()));
                    if (!this.f25228a.mo35788e()) {
                        D = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D == this.f25229b);
                this.f25231d = D;
            } else if (b2 == 2) {
                int d2 = this.f25228a.mo35787d() + this.f25228a.mo35783E();
                do {
                    list.add(Integer.valueOf(this.f25228a.mo35802z()));
                } while (this.f25228a.mo35787d() < d2);
                mo35871U(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    public double readDouble() throws IOException {
        mo35872V(1);
        return this.f25228a.mo35793q();
    }

    public float readFloat() throws IOException {
        mo35872V(5);
        return this.f25228a.mo35797u();
    }

    /* renamed from: s */
    public long mo35692s() throws IOException {
        mo35872V(0);
        return this.f25228a.mo35784F();
    }

    /* renamed from: t */
    public void mo35693t(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C4757s) {
            C4757s sVar = (C4757s) list;
            int b = WireFormat.m37460b(this.f25229b);
            if (b == 0) {
                do {
                    sVar.mo36030n(this.f25228a.mo35783E());
                    if (!this.f25228a.mo35788e()) {
                        D2 = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D2 == this.f25229b);
                this.f25231d = D2;
            } else if (b == 2) {
                int d = this.f25228a.mo35787d() + this.f25228a.mo35783E();
                do {
                    sVar.mo36030n(this.f25228a.mo35783E());
                } while (this.f25228a.mo35787d() < d);
                mo35871U(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m37460b(this.f25229b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f25228a.mo35783E()));
                    if (!this.f25228a.mo35788e()) {
                        D = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D == this.f25229b);
                this.f25231d = D;
            } else if (b2 == 2) {
                int d2 = this.f25228a.mo35787d() + this.f25228a.mo35783E();
                do {
                    list.add(Integer.valueOf(this.f25228a.mo35783E()));
                } while (this.f25228a.mo35787d() < d2);
                mo35871U(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: u */
    public int mo35694u() throws IOException {
        mo35872V(5);
        return this.f25228a.mo35795s();
    }

    /* renamed from: v */
    public void mo35695v(List<Long> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C4778y) {
            C4778y yVar = (C4778y) list;
            int b = WireFormat.m37460b(this.f25229b);
            if (b == 1) {
                do {
                    yVar.mo36083o(this.f25228a.mo35801y());
                    if (!this.f25228a.mo35788e()) {
                        D2 = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D2 == this.f25229b);
                this.f25231d = D2;
            } else if (b == 2) {
                int E = this.f25228a.mo35783E();
                mo35874X(E);
                int d = this.f25228a.mo35787d() + E;
                do {
                    yVar.mo36083o(this.f25228a.mo35801y());
                } while (this.f25228a.mo35787d() < d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m37460b(this.f25229b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f25228a.mo35801y()));
                    if (!this.f25228a.mo35788e()) {
                        D = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D == this.f25229b);
                this.f25231d = D;
            } else if (b2 == 2) {
                int E2 = this.f25228a.mo35783E();
                mo35874X(E2);
                int d2 = this.f25228a.mo35787d() + E2;
                do {
                    list.add(Long.valueOf(this.f25228a.mo35801y()));
                } while (this.f25228a.mo35787d() < d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: w */
    public void mo35696w(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C4757s) {
            C4757s sVar = (C4757s) list;
            int b = WireFormat.m37460b(this.f25229b);
            if (b == 0) {
                do {
                    sVar.mo36030n(this.f25228a.mo35798v());
                    if (!this.f25228a.mo35788e()) {
                        D2 = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D2 == this.f25229b);
                this.f25231d = D2;
            } else if (b == 2) {
                int d = this.f25228a.mo35787d() + this.f25228a.mo35783E();
                do {
                    sVar.mo36030n(this.f25228a.mo35798v());
                } while (this.f25228a.mo35787d() < d);
                mo35871U(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m37460b(this.f25229b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f25228a.mo35798v()));
                    if (!this.f25228a.mo35788e()) {
                        D = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D == this.f25229b);
                this.f25231d = D;
            } else if (b2 == 2) {
                int d2 = this.f25228a.mo35787d() + this.f25228a.mo35783E();
                do {
                    list.add(Integer.valueOf(this.f25228a.mo35798v()));
                } while (this.f25228a.mo35787d() < d2);
                mo35871U(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: x */
    public void mo35697x(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof C4757s) {
            C4757s sVar = (C4757s) list;
            int b = WireFormat.m37460b(this.f25229b);
            if (b == 2) {
                int E = this.f25228a.mo35783E();
                mo35873W(E);
                int d = this.f25228a.mo35787d() + E;
                do {
                    sVar.mo36030n(this.f25228a.mo35795s());
                } while (this.f25228a.mo35787d() < d);
            } else if (b == 5) {
                do {
                    sVar.mo36030n(this.f25228a.mo35795s());
                    if (!this.f25228a.mo35788e()) {
                        D2 = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D2 == this.f25229b);
                this.f25231d = D2;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m37460b(this.f25229b);
            if (b2 == 2) {
                int E2 = this.f25228a.mo35783E();
                mo35873W(E2);
                int d2 = this.f25228a.mo35787d() + E2;
                do {
                    list.add(Integer.valueOf(this.f25228a.mo35795s()));
                } while (this.f25228a.mo35787d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f25228a.mo35795s()));
                    if (!this.f25228a.mo35788e()) {
                        D = this.f25228a.mo35782D();
                    } else {
                        return;
                    }
                } while (D == this.f25229b);
                this.f25231d = D;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: y */
    public long mo35698y() throws IOException {
        mo35872V(0);
        return this.f25228a.mo35779A();
    }

    /* renamed from: z */
    public String mo35699z() throws IOException {
        mo35872V(2);
        return this.f25228a.mo35780B();
    }
}

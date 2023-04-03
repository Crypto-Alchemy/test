package com.google.protobuf;

import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.protobuf.h */
/* compiled from: CodedInputStreamReader */
public final class C4977h implements C4982i0 {

    /* renamed from: a */
    public final C4969g f25683a;

    /* renamed from: b */
    public int f25684b;

    /* renamed from: c */
    public int f25685c;

    /* renamed from: d */
    public int f25686d = 0;

    /* renamed from: com.google.protobuf.h$a */
    /* compiled from: CodedInputStreamReader */
    public static /* synthetic */ class C4978a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25687a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25687a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25687a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25687a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25687a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25687a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25687a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25687a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f25687a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f25687a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f25687a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f25687a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f25687a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f25687a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f25687a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f25687a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f25687a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f25687a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4977h.C4978a.<clinit>():void");
        }
    }

    public C4977h(C4969g gVar) {
        C4969g gVar2 = (C4969g) C5011t.m39928b(gVar, "input");
        this.f25683a = gVar2;
        gVar2.f25638d = this;
    }

    /* renamed from: Q */
    public static C4977h m39542Q(C4969g gVar) {
        C4977h hVar = gVar.f25638d;
        if (hVar != null) {
            return hVar;
        }
        return new C4977h(gVar);
    }

    /* renamed from: A */
    public int mo37091A() throws IOException {
        int i = this.f25686d;
        if (i != 0) {
            this.f25684b = i;
            this.f25686d = 0;
        } else {
            this.f25684b = this.f25683a.mo37242F();
        }
        int i2 = this.f25684b;
        if (i2 == 0 || i2 == this.f25685c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.m39050a(i2);
    }

    /* renamed from: B */
    public void mo37092B(List<String> list) throws IOException {
        mo37329U(list, false);
    }

    /* renamed from: C */
    public void mo37093C(List<Float> list) throws IOException {
        int F;
        int F2;
        if (list instanceof C5008q) {
            C5008q qVar = (C5008q) list;
            int b = WireFormat.m39051b(this.f25684b);
            if (b == 2) {
                int G = this.f25683a.mo37243G();
                mo37332X(G);
                int d = this.f25683a.mo37247d() + G;
                do {
                    qVar.mo37494n(this.f25683a.mo37257v());
                } while (this.f25683a.mo37247d() < d);
            } else if (b == 5) {
                do {
                    qVar.mo37494n(this.f25683a.mo37257v());
                    if (!this.f25683a.mo37248e()) {
                        F2 = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F2 == this.f25684b);
                this.f25686d = F2;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m39051b(this.f25684b);
            if (b2 == 2) {
                int G2 = this.f25683a.mo37243G();
                mo37332X(G2);
                int d2 = this.f25683a.mo37247d() + G2;
                do {
                    list.add(Float.valueOf(this.f25683a.mo37257v()));
                } while (this.f25683a.mo37247d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Float.valueOf(this.f25683a.mo37257v()));
                    if (!this.f25683a.mo37248e()) {
                        F = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F == this.f25684b);
                this.f25686d = F;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: D */
    public boolean mo37094D() throws IOException {
        int i;
        if (this.f25683a.mo37248e() || (i = this.f25684b) == this.f25685c) {
            return false;
        }
        return this.f25683a.mo37245I(i);
    }

    /* renamed from: E */
    public int mo37095E() throws IOException {
        mo37331W(5);
        return this.f25683a.mo37260z();
    }

    /* renamed from: F */
    public void mo37096F(List<ByteString> list) throws IOException {
        int F;
        if (WireFormat.m39051b(this.f25684b) == 2) {
            do {
                list.add(mo37144o());
                if (!this.f25683a.mo37248e()) {
                    F = this.f25683a.mo37242F();
                } else {
                    return;
                }
            } while (F == this.f25684b);
            this.f25686d = F;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: G */
    public void mo37097G(List<Double> list) throws IOException {
        int F;
        int F2;
        if (list instanceof C4983j) {
            C4983j jVar = (C4983j) list;
            int b = WireFormat.m39051b(this.f25684b);
            if (b == 1) {
                do {
                    jVar.mo37355n(this.f25683a.mo37253r());
                    if (!this.f25683a.mo37248e()) {
                        F2 = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F2 == this.f25684b);
                this.f25686d = F2;
            } else if (b == 2) {
                int G = this.f25683a.mo37243G();
                mo37333Y(G);
                int d = this.f25683a.mo37247d() + G;
                do {
                    jVar.mo37355n(this.f25683a.mo37253r());
                } while (this.f25683a.mo37247d() < d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m39051b(this.f25684b);
            if (b2 == 1) {
                do {
                    list.add(Double.valueOf(this.f25683a.mo37253r()));
                    if (!this.f25683a.mo37248e()) {
                        F = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F == this.f25684b);
                this.f25686d = F;
            } else if (b2 == 2) {
                int G2 = this.f25683a.mo37243G();
                mo37333Y(G2);
                int d2 = this.f25683a.mo37247d() + G2;
                do {
                    list.add(Double.valueOf(this.f25683a.mo37253r()));
                } while (this.f25683a.mo37247d() < d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: H */
    public long mo37098H() throws IOException {
        mo37331W(0);
        return this.f25683a.mo37259x();
    }

    /* renamed from: I */
    public String mo37099I() throws IOException {
        mo37331W(2);
        return this.f25683a.mo37241E();
    }

    @Deprecated
    /* renamed from: J */
    public <T> void mo37100J(List<T> list, C4984j0<T> j0Var, C4987l lVar) throws IOException {
        int F;
        if (WireFormat.m39051b(this.f25684b) == 3) {
            int i = this.f25684b;
            do {
                list.add(mo37327S(j0Var, lVar));
                if (!this.f25683a.mo37248e() && this.f25686d == 0) {
                    F = this.f25683a.mo37242F();
                } else {
                    return;
                }
            } while (F == i);
            this.f25686d = F;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: K */
    public <T> void mo37101K(List<T> list, C4984j0<T> j0Var, C4987l lVar) throws IOException {
        int F;
        if (WireFormat.m39051b(this.f25684b) == 2) {
            int i = this.f25684b;
            do {
                list.add(mo37328T(j0Var, lVar));
                if (!this.f25683a.mo37248e() && this.f25686d == 0) {
                    F = this.f25683a.mo37242F();
                } else {
                    return;
                }
            } while (F == i);
            this.f25686d = F;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    @Deprecated
    /* renamed from: L */
    public <T> T mo37102L(Class<T> cls, C4987l lVar) throws IOException {
        mo37331W(3);
        return mo37327S(dy4.m43731a().mo42089d(cls), lVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (mo37094D() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new com.google.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void mo37103M(java.util.Map<K, V> r8, com.google.protobuf.C5032z.C5033a<K, V> r9, com.google.protobuf.C4987l r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.mo37331W(r0)
            com.google.protobuf.g r1 = r7.f25683a
            int r1 = r1.mo37243G()
            com.google.protobuf.g r2 = r7.f25683a
            int r1 = r2.mo37250o(r1)
            K r2 = r9.f25774b
            V r3 = r9.f25776d
        L_0x0014:
            int r4 = r7.mo37091A()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            com.google.protobuf.g r5 = r7.f25683a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.mo37248e()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.mo37094D()     // Catch:{ InvalidWireTypeException -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004f }
            r4.<init>((java.lang.String) r6)     // Catch:{ InvalidWireTypeException -> 0x004f }
            throw r4     // Catch:{ InvalidWireTypeException -> 0x004f }
        L_0x003a:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f25775c     // Catch:{ InvalidWireTypeException -> 0x004f }
            V r5 = r9.f25776d     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Object r3 = r7.mo37326R(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x0047:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f25773a     // Catch:{ InvalidWireTypeException -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.mo37326R(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.mo37094D()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0065 }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            com.google.protobuf.g r8 = r7.f25683a
            r8.mo37249n(r1)
            return
        L_0x0065:
            r8 = move-exception
            com.google.protobuf.g r9 = r7.f25683a
            r9.mo37249n(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4977h.mo37103M(java.util.Map, com.google.protobuf.z$a, com.google.protobuf.l):void");
    }

    /* renamed from: N */
    public <T> T mo37104N(Class<T> cls, C4987l lVar) throws IOException {
        mo37331W(2);
        return mo37328T(dy4.m43731a().mo42089d(cls), lVar);
    }

    @Deprecated
    /* renamed from: O */
    public <T> T mo37105O(C4984j0<T> j0Var, C4987l lVar) throws IOException {
        mo37331W(3);
        return mo37327S(j0Var, lVar);
    }

    /* renamed from: P */
    public <T> T mo37106P(C4984j0<T> j0Var, C4987l lVar) throws IOException {
        mo37331W(2);
        return mo37328T(j0Var, lVar);
    }

    /* renamed from: R */
    public final Object mo37326R(WireFormat.FieldType fieldType, Class<?> cls, C4987l lVar) throws IOException {
        switch (C4978a.f25687a[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo37124e());
            case 2:
                return mo37144o();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo37136k());
            case 5:
                return Integer.valueOf(mo37152u());
            case 6:
                return Long.valueOf(mo37118b());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo37145p());
            case 9:
                return Long.valueOf(mo37098H());
            case 10:
                return mo37104N(cls, lVar);
            case 11:
                return Integer.valueOf(mo37095E());
            case 12:
                return Long.valueOf(mo37126f());
            case 13:
                return Integer.valueOf(mo37138l());
            case 14:
                return Long.valueOf(mo37156y());
            case 15:
                return mo37099I();
            case 16:
                return Integer.valueOf(mo37130h());
            case 17:
                return Long.valueOf(mo37150s());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    /* renamed from: S */
    public final <T> T mo37327S(C4984j0<T> j0Var, C4987l lVar) throws IOException {
        int i = this.f25685c;
        this.f25685c = WireFormat.m39052c(WireFormat.m39050a(this.f25684b), 4);
        try {
            T b = j0Var.mo37171b();
            j0Var.mo37185i(b, this, lVar);
            j0Var.mo37177e(b);
            if (this.f25684b == this.f25685c) {
                return b;
            }
            throw InvalidProtocolBufferException.parseFailure();
        } finally {
            this.f25685c = i;
        }
    }

    /* renamed from: T */
    public final <T> T mo37328T(C4984j0<T> j0Var, C4987l lVar) throws IOException {
        int G = this.f25683a.mo37243G();
        C4969g gVar = this.f25683a;
        if (gVar.f25635a < gVar.f25636b) {
            int o = gVar.mo37250o(G);
            T b = j0Var.mo37171b();
            this.f25683a.f25635a++;
            j0Var.mo37185i(b, this, lVar);
            j0Var.mo37177e(b);
            this.f25683a.mo37246a(0);
            C4969g gVar2 = this.f25683a;
            gVar2.f25635a--;
            gVar2.mo37249n(o);
            return b;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    /* renamed from: U */
    public void mo37329U(List<String> list, boolean z) throws IOException {
        String str;
        int F;
        int F2;
        if (WireFormat.m39051b(this.f25684b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        } else if (!(list instanceof wf3) || z) {
            do {
                if (z) {
                    str = mo37099I();
                } else {
                    str = mo37157z();
                }
                list.add(str);
                if (!this.f25683a.mo37248e()) {
                    F = this.f25683a.mo37242F();
                } else {
                    return;
                }
            } while (F == this.f25684b);
            this.f25686d = F;
        } else {
            wf3 wf3 = (wf3) list;
            do {
                wf3.mo37544K(mo37144o());
                if (!this.f25683a.mo37248e()) {
                    F2 = this.f25683a.mo37242F();
                } else {
                    return;
                }
            } while (F2 == this.f25684b);
            this.f25686d = F2;
        }
    }

    /* renamed from: V */
    public final void mo37330V(int i) throws IOException {
        if (this.f25683a.mo37247d() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* renamed from: W */
    public final void mo37331W(int i) throws IOException {
        if (WireFormat.m39051b(this.f25684b) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* renamed from: X */
    public final void mo37332X(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* renamed from: Y */
    public final void mo37333Y(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* renamed from: a */
    public int mo37116a() {
        return this.f25684b;
    }

    /* renamed from: b */
    public long mo37118b() throws IOException {
        mo37331W(1);
        return this.f25683a.mo37256u();
    }

    /* renamed from: c */
    public void mo37120c(List<Integer> list) throws IOException {
        int F;
        int F2;
        if (list instanceof C5010s) {
            C5010s sVar = (C5010s) list;
            int b = WireFormat.m39051b(this.f25684b);
            if (b == 2) {
                int G = this.f25683a.mo37243G();
                mo37332X(G);
                int d = this.f25683a.mo37247d() + G;
                do {
                    sVar.mo37514n(this.f25683a.mo37260z());
                } while (this.f25683a.mo37247d() < d);
            } else if (b == 5) {
                do {
                    sVar.mo37514n(this.f25683a.mo37260z());
                    if (!this.f25683a.mo37248e()) {
                        F2 = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F2 == this.f25684b);
                this.f25686d = F2;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m39051b(this.f25684b);
            if (b2 == 2) {
                int G2 = this.f25683a.mo37243G();
                mo37332X(G2);
                int d2 = this.f25683a.mo37247d() + G2;
                do {
                    list.add(Integer.valueOf(this.f25683a.mo37260z()));
                } while (this.f25683a.mo37247d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f25683a.mo37260z()));
                    if (!this.f25683a.mo37248e()) {
                        F = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F == this.f25684b);
                this.f25686d = F;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: d */
    public void mo37122d(List<Long> list) throws IOException {
        int F;
        int F2;
        if (list instanceof C5031y) {
            C5031y yVar = (C5031y) list;
            int b = WireFormat.m39051b(this.f25684b);
            if (b == 0) {
                do {
                    yVar.mo37569o(this.f25683a.mo37239C());
                    if (!this.f25683a.mo37248e()) {
                        F2 = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F2 == this.f25684b);
                this.f25686d = F2;
            } else if (b == 2) {
                int d = this.f25683a.mo37247d() + this.f25683a.mo37243G();
                do {
                    yVar.mo37569o(this.f25683a.mo37239C());
                } while (this.f25683a.mo37247d() < d);
                mo37330V(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m39051b(this.f25684b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f25683a.mo37239C()));
                    if (!this.f25683a.mo37248e()) {
                        F = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F == this.f25684b);
                this.f25686d = F;
            } else if (b2 == 2) {
                int d2 = this.f25683a.mo37247d() + this.f25683a.mo37243G();
                do {
                    list.add(Long.valueOf(this.f25683a.mo37239C()));
                } while (this.f25683a.mo37247d() < d2);
                mo37330V(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: e */
    public boolean mo37124e() throws IOException {
        mo37331W(0);
        return this.f25683a.mo37251p();
    }

    /* renamed from: f */
    public long mo37126f() throws IOException {
        mo37331W(1);
        return this.f25683a.mo37237A();
    }

    /* renamed from: g */
    public void mo37128g(List<Long> list) throws IOException {
        int F;
        int F2;
        if (list instanceof C5031y) {
            C5031y yVar = (C5031y) list;
            int b = WireFormat.m39051b(this.f25684b);
            if (b == 0) {
                do {
                    yVar.mo37569o(this.f25683a.mo37244H());
                    if (!this.f25683a.mo37248e()) {
                        F2 = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F2 == this.f25684b);
                this.f25686d = F2;
            } else if (b == 2) {
                int d = this.f25683a.mo37247d() + this.f25683a.mo37243G();
                do {
                    yVar.mo37569o(this.f25683a.mo37244H());
                } while (this.f25683a.mo37247d() < d);
                mo37330V(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m39051b(this.f25684b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f25683a.mo37244H()));
                    if (!this.f25683a.mo37248e()) {
                        F = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F == this.f25684b);
                this.f25686d = F;
            } else if (b2 == 2) {
                int d2 = this.f25683a.mo37247d() + this.f25683a.mo37243G();
                do {
                    list.add(Long.valueOf(this.f25683a.mo37244H()));
                } while (this.f25683a.mo37247d() < d2);
                mo37330V(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: h */
    public int mo37130h() throws IOException {
        mo37331W(0);
        return this.f25683a.mo37243G();
    }

    /* renamed from: i */
    public void mo37132i(List<Long> list) throws IOException {
        int F;
        int F2;
        if (list instanceof C5031y) {
            C5031y yVar = (C5031y) list;
            int b = WireFormat.m39051b(this.f25684b);
            if (b == 0) {
                do {
                    yVar.mo37569o(this.f25683a.mo37259x());
                    if (!this.f25683a.mo37248e()) {
                        F2 = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F2 == this.f25684b);
                this.f25686d = F2;
            } else if (b == 2) {
                int d = this.f25683a.mo37247d() + this.f25683a.mo37243G();
                do {
                    yVar.mo37569o(this.f25683a.mo37259x());
                } while (this.f25683a.mo37247d() < d);
                mo37330V(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m39051b(this.f25684b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f25683a.mo37259x()));
                    if (!this.f25683a.mo37248e()) {
                        F = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F == this.f25684b);
                this.f25686d = F;
            } else if (b2 == 2) {
                int d2 = this.f25683a.mo37247d() + this.f25683a.mo37243G();
                do {
                    list.add(Long.valueOf(this.f25683a.mo37259x()));
                } while (this.f25683a.mo37247d() < d2);
                mo37330V(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: j */
    public void mo37134j(List<Integer> list) throws IOException {
        int F;
        int F2;
        if (list instanceof C5010s) {
            C5010s sVar = (C5010s) list;
            int b = WireFormat.m39051b(this.f25684b);
            if (b == 0) {
                do {
                    sVar.mo37514n(this.f25683a.mo37254s());
                    if (!this.f25683a.mo37248e()) {
                        F2 = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F2 == this.f25684b);
                this.f25686d = F2;
            } else if (b == 2) {
                int d = this.f25683a.mo37247d() + this.f25683a.mo37243G();
                do {
                    sVar.mo37514n(this.f25683a.mo37254s());
                } while (this.f25683a.mo37247d() < d);
                mo37330V(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m39051b(this.f25684b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f25683a.mo37254s()));
                    if (!this.f25683a.mo37248e()) {
                        F = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F == this.f25684b);
                this.f25686d = F;
            } else if (b2 == 2) {
                int d2 = this.f25683a.mo37247d() + this.f25683a.mo37243G();
                do {
                    list.add(Integer.valueOf(this.f25683a.mo37254s()));
                } while (this.f25683a.mo37247d() < d2);
                mo37330V(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: k */
    public int mo37136k() throws IOException {
        mo37331W(0);
        return this.f25683a.mo37254s();
    }

    /* renamed from: l */
    public int mo37138l() throws IOException {
        mo37331W(0);
        return this.f25683a.mo37238B();
    }

    /* renamed from: m */
    public void mo37140m(List<Boolean> list) throws IOException {
        int F;
        int F2;
        if (list instanceof C4967f) {
            C4967f fVar = (C4967f) list;
            int b = WireFormat.m39051b(this.f25684b);
            if (b == 0) {
                do {
                    fVar.mo37224o(this.f25683a.mo37251p());
                    if (!this.f25683a.mo37248e()) {
                        F2 = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F2 == this.f25684b);
                this.f25686d = F2;
            } else if (b == 2) {
                int d = this.f25683a.mo37247d() + this.f25683a.mo37243G();
                do {
                    fVar.mo37224o(this.f25683a.mo37251p());
                } while (this.f25683a.mo37247d() < d);
                mo37330V(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m39051b(this.f25684b);
            if (b2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f25683a.mo37251p()));
                    if (!this.f25683a.mo37248e()) {
                        F = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F == this.f25684b);
                this.f25686d = F;
            } else if (b2 == 2) {
                int d2 = this.f25683a.mo37247d() + this.f25683a.mo37243G();
                do {
                    list.add(Boolean.valueOf(this.f25683a.mo37251p()));
                } while (this.f25683a.mo37247d() < d2);
                mo37330V(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: n */
    public void mo37142n(List<String> list) throws IOException {
        mo37329U(list, true);
    }

    /* renamed from: o */
    public ByteString mo37144o() throws IOException {
        mo37331W(2);
        return this.f25683a.mo37252q();
    }

    /* renamed from: p */
    public int mo37145p() throws IOException {
        mo37331W(0);
        return this.f25683a.mo37258w();
    }

    /* renamed from: q */
    public void mo37146q(List<Long> list) throws IOException {
        int F;
        int F2;
        if (list instanceof C5031y) {
            C5031y yVar = (C5031y) list;
            int b = WireFormat.m39051b(this.f25684b);
            if (b == 1) {
                do {
                    yVar.mo37569o(this.f25683a.mo37256u());
                    if (!this.f25683a.mo37248e()) {
                        F2 = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F2 == this.f25684b);
                this.f25686d = F2;
            } else if (b == 2) {
                int G = this.f25683a.mo37243G();
                mo37333Y(G);
                int d = this.f25683a.mo37247d() + G;
                do {
                    yVar.mo37569o(this.f25683a.mo37256u());
                } while (this.f25683a.mo37247d() < d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m39051b(this.f25684b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f25683a.mo37256u()));
                    if (!this.f25683a.mo37248e()) {
                        F = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F == this.f25684b);
                this.f25686d = F;
            } else if (b2 == 2) {
                int G2 = this.f25683a.mo37243G();
                mo37333Y(G2);
                int d2 = this.f25683a.mo37247d() + G2;
                do {
                    list.add(Long.valueOf(this.f25683a.mo37256u()));
                } while (this.f25683a.mo37247d() < d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: r */
    public void mo37147r(List<Integer> list) throws IOException {
        int F;
        int F2;
        if (list instanceof C5010s) {
            C5010s sVar = (C5010s) list;
            int b = WireFormat.m39051b(this.f25684b);
            if (b == 0) {
                do {
                    sVar.mo37514n(this.f25683a.mo37238B());
                    if (!this.f25683a.mo37248e()) {
                        F2 = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F2 == this.f25684b);
                this.f25686d = F2;
            } else if (b == 2) {
                int d = this.f25683a.mo37247d() + this.f25683a.mo37243G();
                do {
                    sVar.mo37514n(this.f25683a.mo37238B());
                } while (this.f25683a.mo37247d() < d);
                mo37330V(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m39051b(this.f25684b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f25683a.mo37238B()));
                    if (!this.f25683a.mo37248e()) {
                        F = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F == this.f25684b);
                this.f25686d = F;
            } else if (b2 == 2) {
                int d2 = this.f25683a.mo37247d() + this.f25683a.mo37243G();
                do {
                    list.add(Integer.valueOf(this.f25683a.mo37238B()));
                } while (this.f25683a.mo37247d() < d2);
                mo37330V(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    public double readDouble() throws IOException {
        mo37331W(1);
        return this.f25683a.mo37253r();
    }

    public float readFloat() throws IOException {
        mo37331W(5);
        return this.f25683a.mo37257v();
    }

    /* renamed from: s */
    public long mo37150s() throws IOException {
        mo37331W(0);
        return this.f25683a.mo37244H();
    }

    /* renamed from: t */
    public void mo37151t(List<Integer> list) throws IOException {
        int F;
        int F2;
        if (list instanceof C5010s) {
            C5010s sVar = (C5010s) list;
            int b = WireFormat.m39051b(this.f25684b);
            if (b == 0) {
                do {
                    sVar.mo37514n(this.f25683a.mo37243G());
                    if (!this.f25683a.mo37248e()) {
                        F2 = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F2 == this.f25684b);
                this.f25686d = F2;
            } else if (b == 2) {
                int d = this.f25683a.mo37247d() + this.f25683a.mo37243G();
                do {
                    sVar.mo37514n(this.f25683a.mo37243G());
                } while (this.f25683a.mo37247d() < d);
                mo37330V(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m39051b(this.f25684b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f25683a.mo37243G()));
                    if (!this.f25683a.mo37248e()) {
                        F = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F == this.f25684b);
                this.f25686d = F;
            } else if (b2 == 2) {
                int d2 = this.f25683a.mo37247d() + this.f25683a.mo37243G();
                do {
                    list.add(Integer.valueOf(this.f25683a.mo37243G()));
                } while (this.f25683a.mo37247d() < d2);
                mo37330V(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: u */
    public int mo37152u() throws IOException {
        mo37331W(5);
        return this.f25683a.mo37255t();
    }

    /* renamed from: v */
    public void mo37153v(List<Long> list) throws IOException {
        int F;
        int F2;
        if (list instanceof C5031y) {
            C5031y yVar = (C5031y) list;
            int b = WireFormat.m39051b(this.f25684b);
            if (b == 1) {
                do {
                    yVar.mo37569o(this.f25683a.mo37237A());
                    if (!this.f25683a.mo37248e()) {
                        F2 = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F2 == this.f25684b);
                this.f25686d = F2;
            } else if (b == 2) {
                int G = this.f25683a.mo37243G();
                mo37333Y(G);
                int d = this.f25683a.mo37247d() + G;
                do {
                    yVar.mo37569o(this.f25683a.mo37237A());
                } while (this.f25683a.mo37247d() < d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m39051b(this.f25684b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f25683a.mo37237A()));
                    if (!this.f25683a.mo37248e()) {
                        F = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F == this.f25684b);
                this.f25686d = F;
            } else if (b2 == 2) {
                int G2 = this.f25683a.mo37243G();
                mo37333Y(G2);
                int d2 = this.f25683a.mo37247d() + G2;
                do {
                    list.add(Long.valueOf(this.f25683a.mo37237A()));
                } while (this.f25683a.mo37247d() < d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: w */
    public void mo37154w(List<Integer> list) throws IOException {
        int F;
        int F2;
        if (list instanceof C5010s) {
            C5010s sVar = (C5010s) list;
            int b = WireFormat.m39051b(this.f25684b);
            if (b == 0) {
                do {
                    sVar.mo37514n(this.f25683a.mo37258w());
                    if (!this.f25683a.mo37248e()) {
                        F2 = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F2 == this.f25684b);
                this.f25686d = F2;
            } else if (b == 2) {
                int d = this.f25683a.mo37247d() + this.f25683a.mo37243G();
                do {
                    sVar.mo37514n(this.f25683a.mo37258w());
                } while (this.f25683a.mo37247d() < d);
                mo37330V(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m39051b(this.f25684b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f25683a.mo37258w()));
                    if (!this.f25683a.mo37248e()) {
                        F = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F == this.f25684b);
                this.f25686d = F;
            } else if (b2 == 2) {
                int d2 = this.f25683a.mo37247d() + this.f25683a.mo37243G();
                do {
                    list.add(Integer.valueOf(this.f25683a.mo37258w()));
                } while (this.f25683a.mo37247d() < d2);
                mo37330V(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: x */
    public void mo37155x(List<Integer> list) throws IOException {
        int F;
        int F2;
        if (list instanceof C5010s) {
            C5010s sVar = (C5010s) list;
            int b = WireFormat.m39051b(this.f25684b);
            if (b == 2) {
                int G = this.f25683a.mo37243G();
                mo37332X(G);
                int d = this.f25683a.mo37247d() + G;
                do {
                    sVar.mo37514n(this.f25683a.mo37255t());
                } while (this.f25683a.mo37247d() < d);
            } else if (b == 5) {
                do {
                    sVar.mo37514n(this.f25683a.mo37255t());
                    if (!this.f25683a.mo37248e()) {
                        F2 = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F2 == this.f25684b);
                this.f25686d = F2;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m39051b(this.f25684b);
            if (b2 == 2) {
                int G2 = this.f25683a.mo37243G();
                mo37332X(G2);
                int d2 = this.f25683a.mo37247d() + G2;
                do {
                    list.add(Integer.valueOf(this.f25683a.mo37255t()));
                } while (this.f25683a.mo37247d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f25683a.mo37255t()));
                    if (!this.f25683a.mo37248e()) {
                        F = this.f25683a.mo37242F();
                    } else {
                        return;
                    }
                } while (F == this.f25684b);
                this.f25686d = F;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: y */
    public long mo37156y() throws IOException {
        mo37331W(0);
        return this.f25683a.mo37239C();
    }

    /* renamed from: z */
    public String mo37157z() throws IOException {
        mo37331W(2);
        return this.f25683a.mo37240D();
    }
}

package com.google.protobuf;

import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.protobuf.e */
/* compiled from: BinaryReader */
public abstract class C4962e implements C4982i0 {

    /* renamed from: com.google.protobuf.e$a */
    /* compiled from: BinaryReader */
    public static /* synthetic */ class C4963a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25599a;

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
                f25599a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25599a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25599a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25599a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25599a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25599a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25599a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f25599a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f25599a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f25599a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f25599a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f25599a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f25599a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f25599a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f25599a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f25599a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f25599a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4962e.C4963a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.e$b */
    /* compiled from: BinaryReader */
    public static final class C4964b extends C4962e {

        /* renamed from: a */
        public final boolean f25600a;

        /* renamed from: b */
        public final byte[] f25601b;

        /* renamed from: c */
        public int f25602c;

        /* renamed from: d */
        public final int f25603d;

        /* renamed from: e */
        public int f25604e;

        /* renamed from: f */
        public int f25605f;

        /* renamed from: g */
        public int f25606g;

        public C4964b(ByteBuffer byteBuffer, boolean z) {
            super((C4963a) null);
            this.f25600a = z;
            this.f25601b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f25602c = arrayOffset;
            this.f25603d = arrayOffset;
            this.f25604e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: A */
        public int mo37091A() throws IOException {
            if (mo37107R()) {
                return Integer.MAX_VALUE;
            }
            int c0 = mo37121c0();
            this.f25605f = c0;
            if (c0 == this.f25606g) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.m39050a(c0);
        }

        /* renamed from: B */
        public void mo37092B(List<String> list) throws IOException {
            mo37119b0(list, false);
        }

        /* renamed from: C */
        public void mo37093C(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5008q) {
                C5008q qVar = (C5008q) list;
                int b = WireFormat.m39051b(this.f25605f);
                if (b == 2) {
                    int c0 = mo37121c0();
                    mo37141m0(c0);
                    int i3 = this.f25602c + c0;
                    while (this.f25602c < i3) {
                        qVar.mo37494n(Float.intBitsToFloat(mo37112W()));
                    }
                } else if (b == 5) {
                    do {
                        qVar.mo37494n(readFloat());
                        if (!mo37107R()) {
                            i2 = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i2;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m39051b(this.f25605f);
                if (b2 == 2) {
                    int c02 = mo37121c0();
                    mo37141m0(c02);
                    int i4 = this.f25602c + c02;
                    while (this.f25602c < i4) {
                        list.add(Float.valueOf(Float.intBitsToFloat(mo37112W())));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!mo37107R()) {
                            i = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: D */
        public boolean mo37094D() throws IOException {
            int i;
            if (mo37107R() || (i = this.f25605f) == this.f25606g) {
                return false;
            }
            int b = WireFormat.m39051b(i);
            if (b == 0) {
                mo37137k0();
                return true;
            } else if (b == 1) {
                mo37133i0(8);
                return true;
            } else if (b == 2) {
                mo37133i0(mo37121c0());
                return true;
            } else if (b == 3) {
                mo37135j0();
                return true;
            } else if (b == 5) {
                mo37133i0(4);
                return true;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: E */
        public int mo37095E() throws IOException {
            mo37131h0(5);
            return mo37111V();
        }

        /* renamed from: F */
        public void mo37096F(List<ByteString> list) throws IOException {
            int i;
            if (WireFormat.m39051b(this.f25605f) == 2) {
                do {
                    list.add(mo37144o());
                    if (!mo37107R()) {
                        i = this.f25602c;
                    } else {
                        return;
                    }
                } while (mo37121c0() == this.f25605f);
                this.f25602c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        /* renamed from: G */
        public void mo37097G(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C4983j) {
                C4983j jVar = (C4983j) list;
                int b = WireFormat.m39051b(this.f25605f);
                if (b == 1) {
                    do {
                        jVar.mo37355n(readDouble());
                        if (!mo37107R()) {
                            i2 = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i2;
                } else if (b == 2) {
                    int c0 = mo37121c0();
                    mo37143n0(c0);
                    int i3 = this.f25602c + c0;
                    while (this.f25602c < i3) {
                        jVar.mo37355n(Double.longBitsToDouble(mo37114Y()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m39051b(this.f25605f);
                if (b2 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!mo37107R()) {
                            i = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i;
                } else if (b2 == 2) {
                    int c02 = mo37121c0();
                    mo37143n0(c02);
                    int i4 = this.f25602c + c02;
                    while (this.f25602c < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(mo37114Y())));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: H */
        public long mo37098H() throws IOException {
            mo37131h0(0);
            return mo37123d0();
        }

        /* renamed from: I */
        public String mo37099I() throws IOException {
            return mo37117a0(true);
        }

        @Deprecated
        /* renamed from: J */
        public <T> void mo37100J(List<T> list, C4984j0<T> j0Var, C4987l lVar) throws IOException {
            int i;
            if (WireFormat.m39051b(this.f25605f) == 3) {
                int i2 = this.f25605f;
                do {
                    list.add(mo37110U(j0Var, lVar));
                    if (!mo37107R()) {
                        i = this.f25602c;
                    } else {
                        return;
                    }
                } while (mo37121c0() == i2);
                this.f25602c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        /* renamed from: K */
        public <T> void mo37101K(List<T> list, C4984j0<T> j0Var, C4987l lVar) throws IOException {
            int i;
            if (WireFormat.m39051b(this.f25605f) == 2) {
                int i2 = this.f25605f;
                do {
                    list.add(mo37115Z(j0Var, lVar));
                    if (!mo37107R()) {
                        i = this.f25602c;
                    } else {
                        return;
                    }
                } while (mo37121c0() == i2);
                this.f25602c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Deprecated
        /* renamed from: L */
        public <T> T mo37102L(Class<T> cls, C4987l lVar) throws IOException {
            mo37131h0(3);
            return mo37110U(dy4.m43731a().mo42089d(cls), lVar);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|(2:22|35)(3:30|23|24)) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            if (mo37094D() != false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
            throw new com.google.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* renamed from: M */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <K, V> void mo37103M(java.util.Map<K, V> r8, com.google.protobuf.C5032z.C5033a<K, V> r9, com.google.protobuf.C4987l r10) throws java.io.IOException {
            /*
                r7 = this;
                r0 = 2
                r7.mo37131h0(r0)
                int r1 = r7.mo37121c0()
                r7.mo37127f0(r1)
                int r2 = r7.f25604e
                int r3 = r7.f25602c
                int r3 = r3 + r1
                r7.f25604e = r3
                K r1 = r9.f25774b     // Catch:{ all -> 0x005b }
                V r3 = r9.f25776d     // Catch:{ all -> 0x005b }
            L_0x0016:
                int r4 = r7.mo37091A()     // Catch:{ all -> 0x005b }
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L_0x0025
                r8.put(r1, r3)     // Catch:{ all -> 0x005b }
                r7.f25604e = r2
                return
            L_0x0025:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L_0x0046
                if (r4 == r0) goto L_0x0039
                boolean r4 = r7.mo37094D()     // Catch:{ InvalidWireTypeException -> 0x004e }
                if (r4 == 0) goto L_0x0033
                goto L_0x0016
            L_0x0033:
                com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004e }
                r4.<init>((java.lang.String) r6)     // Catch:{ InvalidWireTypeException -> 0x004e }
                throw r4     // Catch:{ InvalidWireTypeException -> 0x004e }
            L_0x0039:
                com.google.protobuf.WireFormat$FieldType r4 = r9.f25775c     // Catch:{ InvalidWireTypeException -> 0x004e }
                V r5 = r9.f25776d     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Object r3 = r7.mo37109T(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x0046:
                com.google.protobuf.WireFormat$FieldType r4 = r9.f25773a     // Catch:{ InvalidWireTypeException -> 0x004e }
                r5 = 0
                java.lang.Object r1 = r7.mo37109T(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x004e:
                boolean r4 = r7.mo37094D()     // Catch:{ all -> 0x005b }
                if (r4 == 0) goto L_0x0055
                goto L_0x0016
            L_0x0055:
                com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x005b }
                r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x005b }
                throw r8     // Catch:{ all -> 0x005b }
            L_0x005b:
                r8 = move-exception
                r7.f25604e = r2
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4962e.C4964b.mo37103M(java.util.Map, com.google.protobuf.z$a, com.google.protobuf.l):void");
        }

        /* renamed from: N */
        public <T> T mo37104N(Class<T> cls, C4987l lVar) throws IOException {
            mo37131h0(2);
            return mo37115Z(dy4.m43731a().mo42089d(cls), lVar);
        }

        @Deprecated
        /* renamed from: O */
        public <T> T mo37105O(C4984j0<T> j0Var, C4987l lVar) throws IOException {
            mo37131h0(3);
            return mo37110U(j0Var, lVar);
        }

        /* renamed from: P */
        public <T> T mo37106P(C4984j0<T> j0Var, C4987l lVar) throws IOException {
            mo37131h0(2);
            return mo37115Z(j0Var, lVar);
        }

        /* renamed from: R */
        public final boolean mo37107R() {
            if (this.f25602c == this.f25604e) {
                return true;
            }
            return false;
        }

        /* renamed from: S */
        public final byte mo37108S() throws IOException {
            int i = this.f25602c;
            if (i != this.f25604e) {
                byte[] bArr = this.f25601b;
                this.f25602c = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: T */
        public final Object mo37109T(WireFormat.FieldType fieldType, Class<?> cls, C4987l lVar) throws IOException {
            switch (C4963a.f25599a[fieldType.ordinal()]) {
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
                    throw new RuntimeException("unsupported field type.");
            }
        }

        /* renamed from: U */
        public final <T> T mo37110U(C4984j0<T> j0Var, C4987l lVar) throws IOException {
            int i = this.f25606g;
            this.f25606g = WireFormat.m39052c(WireFormat.m39050a(this.f25605f), 4);
            try {
                T b = j0Var.mo37171b();
                j0Var.mo37185i(b, this, lVar);
                j0Var.mo37177e(b);
                if (this.f25605f == this.f25606g) {
                    return b;
                }
                throw InvalidProtocolBufferException.parseFailure();
            } finally {
                this.f25606g = i;
            }
        }

        /* renamed from: V */
        public final int mo37111V() throws IOException {
            mo37127f0(4);
            return mo37112W();
        }

        /* renamed from: W */
        public final int mo37112W() {
            int i = this.f25602c;
            byte[] bArr = this.f25601b;
            this.f25602c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: X */
        public final long mo37113X() throws IOException {
            mo37127f0(8);
            return mo37114Y();
        }

        /* renamed from: Y */
        public final long mo37114Y() {
            int i = this.f25602c;
            byte[] bArr = this.f25601b;
            this.f25602c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* renamed from: Z */
        public final <T> T mo37115Z(C4984j0<T> j0Var, C4987l lVar) throws IOException {
            int c0 = mo37121c0();
            mo37127f0(c0);
            int i = this.f25604e;
            int i2 = this.f25602c + c0;
            this.f25604e = i2;
            try {
                T b = j0Var.mo37171b();
                j0Var.mo37185i(b, this, lVar);
                j0Var.mo37177e(b);
                if (this.f25602c == i2) {
                    return b;
                }
                throw InvalidProtocolBufferException.parseFailure();
            } finally {
                this.f25604e = i;
            }
        }

        /* renamed from: a */
        public int mo37116a() {
            return this.f25605f;
        }

        /* renamed from: a0 */
        public String mo37117a0(boolean z) throws IOException {
            mo37131h0(2);
            int c0 = mo37121c0();
            if (c0 == 0) {
                return "";
            }
            mo37127f0(c0);
            if (z) {
                byte[] bArr = this.f25601b;
                int i = this.f25602c;
                if (!Utf8.m38998t(bArr, i, i + c0)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            String str = new String(this.f25601b, this.f25602c, c0, C5011t.f25748b);
            this.f25602c += c0;
            return str;
        }

        /* renamed from: b */
        public long mo37118b() throws IOException {
            mo37131h0(1);
            return mo37113X();
        }

        /* renamed from: b0 */
        public void mo37119b0(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (WireFormat.m39051b(this.f25605f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            } else if (!(list instanceof wf3) || z) {
                do {
                    list.add(mo37117a0(z));
                    if (!mo37107R()) {
                        i = this.f25602c;
                    } else {
                        return;
                    }
                } while (mo37121c0() == this.f25605f);
                this.f25602c = i;
            } else {
                wf3 wf3 = (wf3) list;
                do {
                    wf3.mo37544K(mo37144o());
                    if (!mo37107R()) {
                        i2 = this.f25602c;
                    } else {
                        return;
                    }
                } while (mo37121c0() == this.f25605f);
                this.f25602c = i2;
            }
        }

        /* renamed from: c */
        public void mo37120c(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5010s) {
                C5010s sVar = (C5010s) list;
                int b = WireFormat.m39051b(this.f25605f);
                if (b == 2) {
                    int c0 = mo37121c0();
                    mo37141m0(c0);
                    int i3 = this.f25602c + c0;
                    while (this.f25602c < i3) {
                        sVar.mo37514n(mo37112W());
                    }
                } else if (b == 5) {
                    do {
                        sVar.mo37514n(mo37095E());
                        if (!mo37107R()) {
                            i2 = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i2;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m39051b(this.f25605f);
                if (b2 == 2) {
                    int c02 = mo37121c0();
                    mo37141m0(c02);
                    int i4 = this.f25602c + c02;
                    while (this.f25602c < i4) {
                        list.add(Integer.valueOf(mo37112W()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo37095E()));
                        if (!mo37107R()) {
                            i = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: c0 */
        public final int mo37121c0() throws IOException {
            byte b;
            int i = this.f25602c;
            int i2 = this.f25604e;
            if (i2 != i) {
                byte[] bArr = this.f25601b;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f25602c = i3;
                    return b2;
                } else if (i2 - i3 < 9) {
                    return (int) mo37125e0();
                } else {
                    int i4 = i3 + 1;
                    byte b3 = b2 ^ (bArr[i3] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i5 = i4 + 1;
                        byte b4 = b3 ^ (bArr[i4] << 14);
                        if (b4 >= 0) {
                            b = b4 ^ 16256;
                        } else {
                            i4 = i5 + 1;
                            byte b5 = b4 ^ (bArr[i5] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                i5 = i4 + 1;
                                byte b6 = bArr[i4];
                                b = (b5 ^ (b6 << 28)) ^ 266354560;
                                if (b6 < 0) {
                                    i4 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i4 + 1;
                                        if (bArr[i4] < 0) {
                                            i4 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i4 + 1;
                                                if (bArr[i4] < 0) {
                                                    i4 = i5 + 1;
                                                    if (bArr[i5] < 0) {
                                                        throw InvalidProtocolBufferException.malformedVarint();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                    this.f25602c = i4;
                    return b;
                }
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: d */
        public void mo37122d(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5031y) {
                C5031y yVar = (C5031y) list;
                int b = WireFormat.m39051b(this.f25605f);
                if (b == 0) {
                    do {
                        yVar.mo37569o(mo37156y());
                        if (!mo37107R()) {
                            i2 = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i2;
                } else if (b == 2) {
                    int c0 = this.f25602c + mo37121c0();
                    while (this.f25602c < c0) {
                        yVar.mo37569o(C4969g.m39343c(mo37123d0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m39051b(this.f25605f);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo37156y()));
                        if (!mo37107R()) {
                            i = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i;
                } else if (b2 == 2) {
                    int c02 = this.f25602c + mo37121c0();
                    while (this.f25602c < c02) {
                        list.add(Long.valueOf(C4969g.m39343c(mo37123d0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: d0 */
        public long mo37123d0() throws IOException {
            long j;
            int i;
            long j2;
            long j3;
            byte b;
            int i2 = this.f25602c;
            int i3 = this.f25604e;
            if (i3 != i2) {
                byte[] bArr = this.f25601b;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f25602c = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return mo37125e0();
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << 14);
                        if (b4 >= 0) {
                            i = i6;
                            j = (long) (b4 ^ 16256);
                        } else {
                            i5 = i6 + 1;
                            byte b5 = b4 ^ (bArr[i6] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                long j4 = (long) b5;
                                int i7 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i8 = i7 + 1;
                                    long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i7 = i8 + 1;
                                        j5 = j6 ^ (((long) bArr[i8]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i7 + 1;
                                            j6 = j5 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i9 = i8 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i = i9 + 1;
                                                    if (((long) bArr[i9]) < 0) {
                                                        throw InvalidProtocolBufferException.malformedVarint();
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i = i7;
                            }
                        }
                        this.f25602c = i;
                        return j;
                    }
                    j = (long) b;
                    this.f25602c = i;
                    return j;
                }
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: e */
        public boolean mo37124e() throws IOException {
            mo37131h0(0);
            if (mo37121c0() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: e0 */
        public final long mo37125e0() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte S = mo37108S();
                j |= ((long) (S & Byte.MAX_VALUE)) << i;
                if ((S & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: f */
        public long mo37126f() throws IOException {
            mo37131h0(1);
            return mo37113X();
        }

        /* renamed from: f0 */
        public final void mo37127f0(int i) throws IOException {
            if (i < 0 || i > this.f25604e - this.f25602c) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: g */
        public void mo37128g(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5031y) {
                C5031y yVar = (C5031y) list;
                int b = WireFormat.m39051b(this.f25605f);
                if (b == 0) {
                    do {
                        yVar.mo37569o(mo37150s());
                        if (!mo37107R()) {
                            i2 = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i2;
                } else if (b == 2) {
                    int c0 = this.f25602c + mo37121c0();
                    while (this.f25602c < c0) {
                        yVar.mo37569o(mo37123d0());
                    }
                    mo37129g0(c0);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m39051b(this.f25605f);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo37150s()));
                        if (!mo37107R()) {
                            i = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i;
                } else if (b2 == 2) {
                    int c02 = this.f25602c + mo37121c0();
                    while (this.f25602c < c02) {
                        list.add(Long.valueOf(mo37123d0()));
                    }
                    mo37129g0(c02);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: g0 */
        public final void mo37129g0(int i) throws IOException {
            if (this.f25602c != i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: h */
        public int mo37130h() throws IOException {
            mo37131h0(0);
            return mo37121c0();
        }

        /* renamed from: h0 */
        public final void mo37131h0(int i) throws IOException {
            if (WireFormat.m39051b(this.f25605f) != i) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: i */
        public void mo37132i(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5031y) {
                C5031y yVar = (C5031y) list;
                int b = WireFormat.m39051b(this.f25605f);
                if (b == 0) {
                    do {
                        yVar.mo37569o(mo37098H());
                        if (!mo37107R()) {
                            i2 = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i2;
                } else if (b == 2) {
                    int c0 = this.f25602c + mo37121c0();
                    while (this.f25602c < c0) {
                        yVar.mo37569o(mo37123d0());
                    }
                    mo37129g0(c0);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m39051b(this.f25605f);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo37098H()));
                        if (!mo37107R()) {
                            i = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i;
                } else if (b2 == 2) {
                    int c02 = this.f25602c + mo37121c0();
                    while (this.f25602c < c02) {
                        list.add(Long.valueOf(mo37123d0()));
                    }
                    mo37129g0(c02);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: i0 */
        public final void mo37133i0(int i) throws IOException {
            mo37127f0(i);
            this.f25602c += i;
        }

        /* renamed from: j */
        public void mo37134j(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5010s) {
                C5010s sVar = (C5010s) list;
                int b = WireFormat.m39051b(this.f25605f);
                if (b == 0) {
                    do {
                        sVar.mo37514n(mo37136k());
                        if (!mo37107R()) {
                            i2 = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i2;
                } else if (b == 2) {
                    int c0 = this.f25602c + mo37121c0();
                    while (this.f25602c < c0) {
                        sVar.mo37514n(mo37121c0());
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m39051b(this.f25605f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo37136k()));
                        if (!mo37107R()) {
                            i = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i;
                } else if (b2 == 2) {
                    int c02 = this.f25602c + mo37121c0();
                    while (this.f25602c < c02) {
                        list.add(Integer.valueOf(mo37121c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* renamed from: j0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo37135j0() throws java.io.IOException {
            /*
                r3 = this;
                int r0 = r3.f25606g
                int r1 = r3.f25605f
                int r1 = com.google.protobuf.WireFormat.m39050a(r1)
                r2 = 4
                int r1 = com.google.protobuf.WireFormat.m39052c(r1, r2)
                r3.f25606g = r1
            L_0x000f:
                int r1 = r3.mo37091A()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.mo37094D()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f25605f
                int r2 = r3.f25606g
                if (r1 != r2) goto L_0x0027
                r3.f25606g = r0
                return
            L_0x0027:
                com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4962e.C4964b.mo37135j0():void");
        }

        /* renamed from: k */
        public int mo37136k() throws IOException {
            mo37131h0(0);
            return mo37121c0();
        }

        /* renamed from: k0 */
        public final void mo37137k0() throws IOException {
            int i = this.f25604e;
            int i2 = this.f25602c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f25601b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f25602c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            mo37139l0();
        }

        /* renamed from: l */
        public int mo37138l() throws IOException {
            mo37131h0(0);
            return C4969g.m39342b(mo37121c0());
        }

        /* renamed from: l0 */
        public final void mo37139l0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo37108S() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: m */
        public void mo37140m(List<Boolean> list) throws IOException {
            int i;
            boolean z;
            int i2;
            boolean z2;
            if (list instanceof C4967f) {
                C4967f fVar = (C4967f) list;
                int b = WireFormat.m39051b(this.f25605f);
                if (b == 0) {
                    do {
                        fVar.mo37224o(mo37124e());
                        if (!mo37107R()) {
                            i2 = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i2;
                } else if (b == 2) {
                    int c0 = this.f25602c + mo37121c0();
                    while (this.f25602c < c0) {
                        if (mo37121c0() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        fVar.mo37224o(z2);
                    }
                    mo37129g0(c0);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m39051b(this.f25605f);
                if (b2 == 0) {
                    do {
                        list.add(Boolean.valueOf(mo37124e()));
                        if (!mo37107R()) {
                            i = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i;
                } else if (b2 == 2) {
                    int c02 = this.f25602c + mo37121c0();
                    while (this.f25602c < c02) {
                        if (mo37121c0() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        list.add(Boolean.valueOf(z));
                    }
                    mo37129g0(c02);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: m0 */
        public final void mo37141m0(int i) throws IOException {
            mo37127f0(i);
            if ((i & 3) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        /* renamed from: n */
        public void mo37142n(List<String> list) throws IOException {
            mo37119b0(list, true);
        }

        /* renamed from: n0 */
        public final void mo37143n0(int i) throws IOException {
            mo37127f0(i);
            if ((i & 7) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        /* renamed from: o */
        public ByteString mo37144o() throws IOException {
            ByteString byteString;
            mo37131h0(2);
            int c0 = mo37121c0();
            if (c0 == 0) {
                return ByteString.EMPTY;
            }
            mo37127f0(c0);
            if (this.f25600a) {
                byteString = ByteString.wrap(this.f25601b, this.f25602c, c0);
            } else {
                byteString = ByteString.copyFrom(this.f25601b, this.f25602c, c0);
            }
            this.f25602c += c0;
            return byteString;
        }

        /* renamed from: p */
        public int mo37145p() throws IOException {
            mo37131h0(0);
            return mo37121c0();
        }

        /* renamed from: q */
        public void mo37146q(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5031y) {
                C5031y yVar = (C5031y) list;
                int b = WireFormat.m39051b(this.f25605f);
                if (b == 1) {
                    do {
                        yVar.mo37569o(mo37118b());
                        if (!mo37107R()) {
                            i2 = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i2;
                } else if (b == 2) {
                    int c0 = mo37121c0();
                    mo37143n0(c0);
                    int i3 = this.f25602c + c0;
                    while (this.f25602c < i3) {
                        yVar.mo37569o(mo37114Y());
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m39051b(this.f25605f);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo37118b()));
                        if (!mo37107R()) {
                            i = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i;
                } else if (b2 == 2) {
                    int c02 = mo37121c0();
                    mo37143n0(c02);
                    int i4 = this.f25602c + c02;
                    while (this.f25602c < i4) {
                        list.add(Long.valueOf(mo37114Y()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: r */
        public void mo37147r(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5010s) {
                C5010s sVar = (C5010s) list;
                int b = WireFormat.m39051b(this.f25605f);
                if (b == 0) {
                    do {
                        sVar.mo37514n(mo37138l());
                        if (!mo37107R()) {
                            i2 = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i2;
                } else if (b == 2) {
                    int c0 = this.f25602c + mo37121c0();
                    while (this.f25602c < c0) {
                        sVar.mo37514n(C4969g.m39342b(mo37121c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m39051b(this.f25605f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo37138l()));
                        if (!mo37107R()) {
                            i = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i;
                } else if (b2 == 2) {
                    int c02 = this.f25602c + mo37121c0();
                    while (this.f25602c < c02) {
                        list.add(Integer.valueOf(C4969g.m39342b(mo37121c0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        public double readDouble() throws IOException {
            mo37131h0(1);
            return Double.longBitsToDouble(mo37113X());
        }

        public float readFloat() throws IOException {
            mo37131h0(5);
            return Float.intBitsToFloat(mo37111V());
        }

        /* renamed from: s */
        public long mo37150s() throws IOException {
            mo37131h0(0);
            return mo37123d0();
        }

        /* renamed from: t */
        public void mo37151t(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5010s) {
                C5010s sVar = (C5010s) list;
                int b = WireFormat.m39051b(this.f25605f);
                if (b == 0) {
                    do {
                        sVar.mo37514n(mo37130h());
                        if (!mo37107R()) {
                            i2 = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i2;
                } else if (b == 2) {
                    int c0 = this.f25602c + mo37121c0();
                    while (this.f25602c < c0) {
                        sVar.mo37514n(mo37121c0());
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m39051b(this.f25605f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo37130h()));
                        if (!mo37107R()) {
                            i = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i;
                } else if (b2 == 2) {
                    int c02 = this.f25602c + mo37121c0();
                    while (this.f25602c < c02) {
                        list.add(Integer.valueOf(mo37121c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: u */
        public int mo37152u() throws IOException {
            mo37131h0(5);
            return mo37111V();
        }

        /* renamed from: v */
        public void mo37153v(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5031y) {
                C5031y yVar = (C5031y) list;
                int b = WireFormat.m39051b(this.f25605f);
                if (b == 1) {
                    do {
                        yVar.mo37569o(mo37126f());
                        if (!mo37107R()) {
                            i2 = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i2;
                } else if (b == 2) {
                    int c0 = mo37121c0();
                    mo37143n0(c0);
                    int i3 = this.f25602c + c0;
                    while (this.f25602c < i3) {
                        yVar.mo37569o(mo37114Y());
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m39051b(this.f25605f);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo37126f()));
                        if (!mo37107R()) {
                            i = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i;
                } else if (b2 == 2) {
                    int c02 = mo37121c0();
                    mo37143n0(c02);
                    int i4 = this.f25602c + c02;
                    while (this.f25602c < i4) {
                        list.add(Long.valueOf(mo37114Y()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: w */
        public void mo37154w(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5010s) {
                C5010s sVar = (C5010s) list;
                int b = WireFormat.m39051b(this.f25605f);
                if (b == 0) {
                    do {
                        sVar.mo37514n(mo37145p());
                        if (!mo37107R()) {
                            i2 = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i2;
                } else if (b == 2) {
                    int c0 = this.f25602c + mo37121c0();
                    while (this.f25602c < c0) {
                        sVar.mo37514n(mo37121c0());
                    }
                    mo37129g0(c0);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m39051b(this.f25605f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo37145p()));
                        if (!mo37107R()) {
                            i = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i;
                } else if (b2 == 2) {
                    int c02 = this.f25602c + mo37121c0();
                    while (this.f25602c < c02) {
                        list.add(Integer.valueOf(mo37121c0()));
                    }
                    mo37129g0(c02);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: x */
        public void mo37155x(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C5010s) {
                C5010s sVar = (C5010s) list;
                int b = WireFormat.m39051b(this.f25605f);
                if (b == 2) {
                    int c0 = mo37121c0();
                    mo37141m0(c0);
                    int i3 = this.f25602c + c0;
                    while (this.f25602c < i3) {
                        sVar.mo37514n(mo37112W());
                    }
                } else if (b == 5) {
                    do {
                        sVar.mo37514n(mo37152u());
                        if (!mo37107R()) {
                            i2 = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i2;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m39051b(this.f25605f);
                if (b2 == 2) {
                    int c02 = mo37121c0();
                    mo37141m0(c02);
                    int i4 = this.f25602c + c02;
                    while (this.f25602c < i4) {
                        list.add(Integer.valueOf(mo37112W()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo37152u()));
                        if (!mo37107R()) {
                            i = this.f25602c;
                        } else {
                            return;
                        }
                    } while (mo37121c0() == this.f25605f);
                    this.f25602c = i;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: y */
        public long mo37156y() throws IOException {
            mo37131h0(0);
            return C4969g.m39343c(mo37123d0());
        }

        /* renamed from: z */
        public String mo37157z() throws IOException {
            return mo37117a0(false);
        }
    }

    public C4962e() {
    }

    public /* synthetic */ C4962e(C4963a aVar) {
        this();
    }

    /* renamed from: Q */
    public static C4962e m39170Q(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new C4964b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}

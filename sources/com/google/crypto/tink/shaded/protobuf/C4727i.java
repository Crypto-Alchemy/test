package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C4779z;
import com.google.crypto.tink.shaded.protobuf.Writer;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i */
/* compiled from: CodedOutputStreamWriter */
public final class C4727i implements Writer {

    /* renamed from: a */
    public final CodedOutputStream f25235a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$a */
    /* compiled from: CodedOutputStreamWriter */
    public static /* synthetic */ class C4728a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25236a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25236a = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4727i.C4728a.<clinit>():void");
        }
    }

    public C4727i(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C4758t.m38321b(codedOutputStream, "output");
        this.f25235a = codedOutputStream2;
        codedOutputStream2.f25088a = this;
    }

    /* renamed from: P */
    public static C4727i m38008P(CodedOutputStream codedOutputStream) {
        C4727i iVar = codedOutputStream.f25088a;
        if (iVar != null) {
            return iVar;
        }
        return new C4727i(codedOutputStream);
    }

    /* renamed from: A */
    public void mo35560A(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25235a.mo35394N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m37222f(list.get(i4).booleanValue());
            }
            this.f25235a.mo35396P0(i3);
            while (i2 < list.size()) {
                this.f25235a.mo35406j0(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25235a.mo35405i0(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: B */
    public void mo35561B(int i, float f) throws IOException {
        this.f25235a.mo35416t0(i, f);
    }

    /* renamed from: C */
    public void mo35562C(int i) throws IOException {
        this.f25235a.mo35394N0(i, 4);
    }

    /* renamed from: D */
    public void mo35563D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25235a.mo35394N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m37207Q(list.get(i4).intValue());
            }
            this.f25235a.mo35396P0(i3);
            while (i2 < list.size()) {
                this.f25235a.mo35390J0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25235a.mo35389I0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public void mo35564E(int i, int i2) throws IOException {
        this.f25235a.mo35410n0(i, i2);
    }

    /* renamed from: F */
    public void mo35565F(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25235a.mo35394N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m37243z(list.get(i4).longValue());
            }
            this.f25235a.mo35396P0(i3);
            while (i2 < list.size()) {
                this.f25235a.mo35381A0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25235a.mo35422z0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public void mo35566G(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25235a.mo35394N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m37228k(list.get(i4).doubleValue());
            }
            this.f25235a.mo35396P0(i3);
            while (i2 < list.size()) {
                this.f25235a.mo35409m0(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25235a.mo35408l0(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: H */
    public void mo35567H(int i, int i2) throws IOException {
        this.f25235a.mo35389I0(i, i2);
    }

    /* renamed from: I */
    public void mo35568I(int i, List<ByteString> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f25235a.mo35407k0(i, list.get(i2));
        }
    }

    /* renamed from: J */
    public <K, V> void mo35569J(int i, C4779z.C4780a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.f25235a.mo35402d0()) {
            mo35882Q(i, aVar, map);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            this.f25235a.mo35394N0(i, 2);
            this.f25235a.mo35396P0(C4779z.m38380b(aVar, next.getKey(), next.getValue()));
            C4779z.m38381d(this.f25235a, aVar, next.getKey(), next.getValue());
        }
    }

    /* renamed from: K */
    public void mo35570K(int i, Object obj, C4731j0 j0Var) throws IOException {
        this.f25235a.mo35418v0(i, (C4705c0) obj, j0Var);
    }

    /* renamed from: L */
    public void mo35571L(int i, List<?> list, C4731j0 j0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo35573N(i, list.get(i2), j0Var);
        }
    }

    /* renamed from: M */
    public void mo35572M(int i, ByteString byteString) throws IOException {
        this.f25235a.mo35407k0(i, byteString);
    }

    /* renamed from: N */
    public void mo35573N(int i, Object obj, C4731j0 j0Var) throws IOException {
        this.f25235a.mo35382B0(i, (C4705c0) obj, j0Var);
    }

    /* renamed from: O */
    public void mo35574O(int i, List<?> list, C4731j0 j0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo35570K(i, list.get(i2), j0Var);
        }
    }

    /* renamed from: Q */
    public final <K, V> void mo35882Q(int i, C4779z.C4780a<K, V> aVar, Map<K, V> map) throws IOException {
        int[] iArr = C4728a.f25236a;
        throw null;
    }

    /* renamed from: R */
    public final void mo35883R(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f25235a.mo35393M0(i, (String) obj);
        } else {
            this.f25235a.mo35407k0(i, (ByteString) obj);
        }
    }

    /* renamed from: a */
    public void mo35575a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25235a.mo35394N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m37236s(list.get(i4).floatValue());
            }
            this.f25235a.mo35396P0(i3);
            while (i2 < list.size()) {
                this.f25235a.mo35417u0(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25235a.mo35416t0(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo35576b(int i, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f25235a.mo35384D0(i, (ByteString) obj);
        } else {
            this.f25235a.mo35383C0(i, (C4705c0) obj);
        }
    }

    /* renamed from: c */
    public void mo35577c(int i, int i2) throws IOException {
        this.f25235a.mo35412p0(i, i2);
    }

    /* renamed from: d */
    public void mo35578d(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof yf3) {
            yf3 yf3 = (yf3) list;
            while (i2 < list.size()) {
                mo35883R(i, yf3.mo36064m(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25235a.mo35393M0(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: e */
    public void mo35579e(int i, String str) throws IOException {
        this.f25235a.mo35393M0(i, str);
    }

    /* renamed from: f */
    public void mo35580f(int i, long j) throws IOException {
        this.f25235a.mo35397Q0(i, j);
    }

    /* renamed from: g */
    public void mo35581g(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25235a.mo35394N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m37241x(list.get(i4).intValue());
            }
            this.f25235a.mo35396P0(i3);
            while (i2 < list.size()) {
                this.f25235a.mo35421y0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25235a.mo35420x0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: h */
    public void mo35582h(int i, int i2) throws IOException {
        this.f25235a.mo35420x0(i, i2);
    }

    /* renamed from: i */
    public void mo35583i(int i, long j) throws IOException {
        this.f25235a.mo35387G0(i, j);
    }

    /* renamed from: j */
    public void mo35584j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25235a.mo35394N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m37232o(list.get(i4).intValue());
            }
            this.f25235a.mo35396P0(i3);
            while (i2 < list.size()) {
                this.f25235a.mo35413q0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25235a.mo35412p0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public void mo35585k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25235a.mo35394N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m37214X(list.get(i4).intValue());
            }
            this.f25235a.mo35396P0(i3);
            while (i2 < list.size()) {
                this.f25235a.mo35396P0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25235a.mo35395O0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public void mo35586l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25235a.mo35394N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m37209S(list.get(i4).longValue());
            }
            this.f25235a.mo35396P0(i3);
            while (i2 < list.size()) {
                this.f25235a.mo35392L0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25235a.mo35391K0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public void mo35587m(int i, long j) throws IOException {
        this.f25235a.mo35391K0(i, j);
    }

    /* renamed from: n */
    public void mo35588n(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25235a.mo35394N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m37230m(list.get(i4).intValue());
            }
            this.f25235a.mo35396P0(i3);
            while (i2 < list.size()) {
                this.f25235a.mo35411o0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25235a.mo35410n0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: o */
    public void mo35589o(int i, int i2) throws IOException {
        this.f25235a.mo35395O0(i, i2);
    }

    /* renamed from: p */
    public void mo35590p(int i, double d) throws IOException {
        this.f25235a.mo35408l0(i, d);
    }

    /* renamed from: q */
    public void mo35591q(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25235a.mo35394N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m37205O(list.get(i4).longValue());
            }
            this.f25235a.mo35396P0(i3);
            while (i2 < list.size()) {
                this.f25235a.mo35388H0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25235a.mo35387G0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: r */
    public void mo35592r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25235a.mo35394N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m37216Z(list.get(i4).longValue());
            }
            this.f25235a.mo35396P0(i3);
            while (i2 < list.size()) {
                this.f25235a.mo35398R0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25235a.mo35397Q0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: s */
    public void mo35593s(int i, long j) throws IOException {
        this.f25235a.mo35414r0(i, j);
    }

    /* renamed from: t */
    public Writer.FieldOrder mo35594t() {
        return Writer.FieldOrder.ASCENDING;
    }

    /* renamed from: u */
    public void mo35595u(int i, long j) throws IOException {
        this.f25235a.mo35422z0(i, j);
    }

    /* renamed from: v */
    public void mo35596v(int i, boolean z) throws IOException {
        this.f25235a.mo35405i0(i, z);
    }

    /* renamed from: w */
    public void mo35597w(int i, int i2) throws IOException {
        this.f25235a.mo35385E0(i, i2);
    }

    /* renamed from: x */
    public void mo35598x(int i) throws IOException {
        this.f25235a.mo35394N0(i, 3);
    }

    /* renamed from: y */
    public void mo35599y(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25235a.mo35394N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m37234q(list.get(i4).longValue());
            }
            this.f25235a.mo35396P0(i3);
            while (i2 < list.size()) {
                this.f25235a.mo35415s0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25235a.mo35414r0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public void mo35600z(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25235a.mo35394N0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m37203M(list.get(i4).intValue());
            }
            this.f25235a.mo35396P0(i3);
            while (i2 < list.size()) {
                this.f25235a.mo35386F0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25235a.mo35385E0(i, list.get(i2).intValue());
            i2++;
        }
    }
}

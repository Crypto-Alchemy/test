package com.google.protobuf;

import com.google.protobuf.C5032z;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.i */
/* compiled from: CodedOutputStreamWriter */
public final class C4980i implements Writer {

    /* renamed from: a */
    public final CodedOutputStream f25691a;

    /* renamed from: com.google.protobuf.i$a */
    /* compiled from: CodedOutputStreamWriter */
    public static /* synthetic */ class C4981a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25692a;

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
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25692a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25692a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25692a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25692a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25692a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25692a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25692a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f25692a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f25692a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f25692a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f25692a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f25692a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4980i.C4981a.<clinit>():void");
        }
    }

    public C4980i(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C5011t.m39928b(codedOutputStream, "output");
        this.f25691a = codedOutputStream2;
        codedOutputStream2.f25535a = this;
    }

    /* renamed from: P */
    public static C4980i m39599P(CodedOutputStream codedOutputStream) {
        C4980i iVar = codedOutputStream.f25535a;
        if (iVar != null) {
            return iVar;
        }
        return new C4980i(codedOutputStream);
    }

    /* renamed from: A */
    public void mo37000A(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25691a.mo36821W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m38795f(list.get(i4).booleanValue());
            }
            this.f25691a.mo36823Y0(i3);
            while (i2 < list.size()) {
                this.f25691a.mo36834l0(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25691a.mo36833k0(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: B */
    public void mo37001B(int i, float f) throws IOException {
        this.f25691a.mo36847y0(i, f);
    }

    @Deprecated
    /* renamed from: C */
    public void mo37002C(int i) throws IOException {
        this.f25691a.mo36821W0(i, 4);
    }

    /* renamed from: D */
    public void mo37003D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25691a.mo36821W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m38781Q(list.get(i4).intValue());
            }
            this.f25691a.mo36823Y0(i3);
            while (i2 < list.size()) {
                this.f25691a.mo36816R0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25691a.mo36815Q0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public void mo37004E(int i, int i2) throws IOException {
        this.f25691a.mo36841s0(i, i2);
    }

    /* renamed from: F */
    public void mo37005F(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25691a.mo36821W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m38818z(list.get(i4).longValue());
            }
            this.f25691a.mo36823Y0(i3);
            while (i2 < list.size()) {
                this.f25691a.mo36806H0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25691a.mo36805G0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public void mo37006G(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25691a.mo36821W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m38803k(list.get(i4).doubleValue());
            }
            this.f25691a.mo36823Y0(i3);
            while (i2 < list.size()) {
                this.f25691a.mo36840r0(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25691a.mo36839q0(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: H */
    public void mo37007H(int i, int i2) throws IOException {
        this.f25691a.mo36815Q0(i, i2);
    }

    /* renamed from: I */
    public void mo37008I(int i, List<ByteString> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f25691a.mo36837o0(i, list.get(i2));
        }
    }

    /* renamed from: J */
    public void mo37009J(int i, List<?> list, C4984j0 j0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo37013N(i, list.get(i2), j0Var);
        }
    }

    /* renamed from: K */
    public void mo37010K(int i, Object obj, C4984j0 j0Var) throws IOException {
        this.f25691a.mo36800B0(i, (C4956c0) obj, j0Var);
    }

    /* renamed from: L */
    public void mo37011L(int i, ByteString byteString) throws IOException {
        this.f25691a.mo36837o0(i, byteString);
    }

    /* renamed from: M */
    public void mo37012M(int i, List<?> list, C4984j0 j0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo37010K(i, list.get(i2), j0Var);
        }
    }

    /* renamed from: N */
    public void mo37013N(int i, Object obj, C4984j0 j0Var) throws IOException {
        this.f25691a.mo36807I0(i, (C4956c0) obj, j0Var);
    }

    /* renamed from: O */
    public <K, V> void mo37014O(int i, C5032z.C5033a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.f25691a.mo36830e0()) {
            mo37344T(i, aVar, map);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            this.f25691a.mo36821W0(i, 2);
            this.f25691a.mo36823Y0(C5032z.m39993b(aVar, next.getKey(), next.getValue()));
            C5032z.m39995e(this.f25691a, aVar, next.getKey(), next.getValue());
        }
    }

    /* renamed from: Q */
    public final <V> void mo37341Q(int i, boolean z, V v, C5032z.C5033a<Boolean, V> aVar) throws IOException {
        this.f25691a.mo36821W0(i, 2);
        this.f25691a.mo36823Y0(C5032z.m39993b(aVar, Boolean.valueOf(z), v));
        C5032z.m39995e(this.f25691a, aVar, Boolean.valueOf(z), v);
    }

    /* renamed from: R */
    public final <V> void mo37342R(int i, C5032z.C5033a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i2] = intValue.intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.f25691a.mo36821W0(i, 2);
            this.f25691a.mo36823Y0(C5032z.m39993b(aVar, Integer.valueOf(i4), v));
            C5032z.m39995e(this.f25691a, aVar, Integer.valueOf(i4), v);
        }
    }

    /* renamed from: S */
    public final <V> void mo37343S(int i, C5032z.C5033a<Long, V> aVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i2] = longValue.longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.f25691a.mo36821W0(i, 2);
            this.f25691a.mo36823Y0(C5032z.m39993b(aVar, Long.valueOf(j), v));
            C5032z.m39995e(this.f25691a, aVar, Long.valueOf(j), v);
        }
    }

    /* renamed from: T */
    public final <K, V> void mo37344T(int i, C5032z.C5033a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (C4981a.f25692a[aVar.f25773a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    mo37341Q(i, false, v, aVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    mo37341Q(i, true, v2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                mo37342R(i, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                mo37343S(i, aVar, map);
                return;
            case 12:
                mo37345U(i, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f25773a);
        }
    }

    /* renamed from: U */
    public final <V> void mo37345U(int i, C5032z.C5033a<String, V> aVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        int i2 = 0;
        for (String str : map.keySet()) {
            strArr[i2] = str;
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = strArr[i3];
            V v = map.get(str2);
            this.f25691a.mo36821W0(i, 2);
            this.f25691a.mo36823Y0(C5032z.m39993b(aVar, str2, v));
            C5032z.m39995e(this.f25691a, aVar, str2, v);
        }
    }

    /* renamed from: V */
    public final void mo37346V(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f25691a.mo36819U0(i, (String) obj);
        } else {
            this.f25691a.mo36837o0(i, (ByteString) obj);
        }
    }

    /* renamed from: a */
    public void mo37015a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25691a.mo36821W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m38811s(list.get(i4).floatValue());
            }
            this.f25691a.mo36823Y0(i3);
            while (i2 < list.size()) {
                this.f25691a.mo36848z0(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25691a.mo36847y0(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo37016b(int i, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f25691a.mo36810L0(i, (ByteString) obj);
        } else {
            this.f25691a.mo36809K0(i, (C4956c0) obj);
        }
    }

    /* renamed from: c */
    public void mo37017c(int i, int i2) throws IOException {
        this.f25691a.mo36843u0(i, i2);
    }

    /* renamed from: d */
    public void mo37018d(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof wf3) {
            wf3 wf3 = (wf3) list;
            while (i2 < list.size()) {
                mo37346V(i, wf3.mo37550m(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25691a.mo36819U0(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: e */
    public void mo37019e(int i, String str) throws IOException {
        this.f25691a.mo36819U0(i, str);
    }

    /* renamed from: f */
    public void mo37020f(int i, long j) throws IOException {
        this.f25691a.mo36824Z0(i, j);
    }

    /* renamed from: g */
    public void mo37021g(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25691a.mo36821W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m38816x(list.get(i4).intValue());
            }
            this.f25691a.mo36823Y0(i3);
            while (i2 < list.size()) {
                this.f25691a.mo36804F0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25691a.mo36803E0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: h */
    public void mo37022h(int i, int i2) throws IOException {
        this.f25691a.mo36803E0(i, i2);
    }

    /* renamed from: i */
    public void mo37023i(int i, long j) throws IOException {
        this.f25691a.mo36813O0(i, j);
    }

    /* renamed from: j */
    public void mo37024j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25691a.mo36821W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m38807o(list.get(i4).intValue());
            }
            this.f25691a.mo36823Y0(i3);
            while (i2 < list.size()) {
                this.f25691a.mo36844v0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25691a.mo36843u0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public void mo37025k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25691a.mo36821W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m38788X(list.get(i4).intValue());
            }
            this.f25691a.mo36823Y0(i3);
            while (i2 < list.size()) {
                this.f25691a.mo36823Y0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25691a.mo36822X0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public void mo37026l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25691a.mo36821W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m38783S(list.get(i4).longValue());
            }
            this.f25691a.mo36823Y0(i3);
            while (i2 < list.size()) {
                this.f25691a.mo36818T0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25691a.mo36817S0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public void mo37027m(int i, long j) throws IOException {
        this.f25691a.mo36817S0(i, j);
    }

    /* renamed from: n */
    public void mo37028n(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25691a.mo36821W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m38805m(list.get(i4).intValue());
            }
            this.f25691a.mo36823Y0(i3);
            while (i2 < list.size()) {
                this.f25691a.mo36842t0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25691a.mo36841s0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: o */
    public void mo37029o(int i, int i2) throws IOException {
        this.f25691a.mo36822X0(i, i2);
    }

    /* renamed from: p */
    public void mo37030p(int i, double d) throws IOException {
        this.f25691a.mo36839q0(i, d);
    }

    /* renamed from: q */
    public void mo37031q(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25691a.mo36821W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m38779O(list.get(i4).longValue());
            }
            this.f25691a.mo36823Y0(i3);
            while (i2 < list.size()) {
                this.f25691a.mo36814P0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25691a.mo36813O0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: r */
    public void mo37032r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25691a.mo36821W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m38790Z(list.get(i4).longValue());
            }
            this.f25691a.mo36823Y0(i3);
            while (i2 < list.size()) {
                this.f25691a.mo36825a1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25691a.mo36824Z0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: s */
    public void mo37033s(int i, long j) throws IOException {
        this.f25691a.mo36845w0(i, j);
    }

    /* renamed from: t */
    public Writer.FieldOrder mo37034t() {
        return Writer.FieldOrder.ASCENDING;
    }

    /* renamed from: u */
    public void mo37035u(int i, long j) throws IOException {
        this.f25691a.mo36805G0(i, j);
    }

    /* renamed from: v */
    public void mo37036v(int i, boolean z) throws IOException {
        this.f25691a.mo36833k0(i, z);
    }

    /* renamed from: w */
    public void mo37037w(int i, int i2) throws IOException {
        this.f25691a.mo36811M0(i, i2);
    }

    @Deprecated
    /* renamed from: x */
    public void mo37038x(int i) throws IOException {
        this.f25691a.mo36821W0(i, 3);
    }

    /* renamed from: y */
    public void mo37039y(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25691a.mo36821W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m38809q(list.get(i4).longValue());
            }
            this.f25691a.mo36823Y0(i3);
            while (i2 < list.size()) {
                this.f25691a.mo36846x0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25691a.mo36845w0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public void mo37040z(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f25691a.mo36821W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m38777M(list.get(i4).intValue());
            }
            this.f25691a.mo36823Y0(i3);
            while (i2 < list.size()) {
                this.f25691a.mo36812N0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f25691a.mo36811M0(i, list.get(i2).intValue());
            i2++;
        }
    }
}

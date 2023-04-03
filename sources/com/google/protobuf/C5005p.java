package com.google.protobuf;

import com.google.protobuf.C4956c0;
import com.google.protobuf.C5005p.C5007b;
import com.google.protobuf.C5011t;
import com.google.protobuf.C5021u;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.p */
/* compiled from: FieldSet */
public final class C5005p<T extends C5007b<T>> {

    /* renamed from: d */
    public static final C5005p f25734d = new C5005p(true);

    /* renamed from: a */
    public final C4989l0<T, Object> f25735a;

    /* renamed from: b */
    public boolean f25736b;

    /* renamed from: c */
    public boolean f25737c;

    /* renamed from: com.google.protobuf.p$a */
    /* compiled from: FieldSet */
    public static /* synthetic */ class C5006a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25738a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f25739b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25739b = r0
                r1 = 1
                com.google.protobuf.WireFormat$FieldType r2 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f25739b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r3 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f25739b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r4 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f25739b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r5 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f25739b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r6 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f25739b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r7 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f25739b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r8 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f25739b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r9 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f25739b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f25739b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f25739b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f25739b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f25739b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f25739b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f25739b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f25739b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f25739b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f25739b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                com.google.protobuf.WireFormat$JavaType[] r9 = com.google.protobuf.WireFormat.JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f25738a = r9
                com.google.protobuf.WireFormat$JavaType r10 = com.google.protobuf.WireFormat.JavaType.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f25738a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.google.protobuf.WireFormat$JavaType r9 = com.google.protobuf.WireFormat.JavaType.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f25738a     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f25738a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f25738a     // Catch:{ NoSuchFieldError -> 0x0111 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f25738a     // Catch:{ NoSuchFieldError -> 0x011b }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f25738a     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f25738a     // Catch:{ NoSuchFieldError -> 0x012f }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f25738a     // Catch:{ NoSuchFieldError -> 0x0139 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5005p.C5006a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.p$b */
    /* compiled from: FieldSet */
    public interface C5007b<T extends C5007b<T>> extends Comparable<T> {
        /* renamed from: Q */
        C4956c0.C4957a mo36916Q(C4956c0.C4957a aVar, C4956c0 c0Var);

        int getNumber();

        boolean isPacked();

        /* renamed from: j */
        boolean mo36922j();

        /* renamed from: k */
        WireFormat.FieldType mo36923k();

        /* renamed from: n */
        WireFormat.JavaType mo36924n();
    }

    public C5005p() {
        this.f25735a = C4989l0.m39778r(16);
    }

    /* renamed from: A */
    public static void m39864A(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.mo36799A0(i, (C4956c0) obj);
            return;
        }
        codedOutputStream.mo36821W0(i, m39871m(fieldType, false));
        m39865B(codedOutputStream, fieldType, obj);
    }

    /* renamed from: B */
    public static void m39865B(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (C5006a.f25739b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.mo36840r0(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.mo36848z0(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.mo36806H0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo36825a1(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.mo36804F0(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.mo36846x0(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.mo36844v0(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.mo36834l0(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.mo36801C0((C4956c0) obj);
                return;
            case 10:
                codedOutputStream.mo36808J0((C4956c0) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.mo36838p0((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.mo36820V0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof ByteString) {
                    codedOutputStream.mo36838p0((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.mo36835m0((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.mo36823Y0(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.mo36812N0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.mo36814P0(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.mo36816R0(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.mo36818T0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof C5011t.C5014c) {
                    codedOutputStream.mo36842t0(((C5011t.C5014c) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.mo36842t0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: c */
    public static Object m39866c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: d */
    public static int m39867d(WireFormat.FieldType fieldType, int i, Object obj) {
        int V = CodedOutputStream.m38786V(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            V *= 2;
        }
        return V + m39868e(fieldType, obj);
    }

    /* renamed from: e */
    public static int m39868e(WireFormat.FieldType fieldType, Object obj) {
        switch (C5006a.f25739b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.m38803k(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m38811s(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m38818z(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m38790Z(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m38816x(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m38809q(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m38807o(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m38795f(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m38813u((C4956c0) obj);
            case 10:
                if (obj instanceof C5021u) {
                    return CodedOutputStream.m38767C((C5021u) obj);
                }
                return CodedOutputStream.m38772H((C4956c0) obj);
            case 11:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.m38801i((ByteString) obj);
                }
                return CodedOutputStream.m38785U((String) obj);
            case 12:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.m38801i((ByteString) obj);
                }
                return CodedOutputStream.m38797g((byte[]) obj);
            case 13:
                return CodedOutputStream.m38788X(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.m38777M(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m38779O(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m38781Q(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m38783S(((Long) obj).longValue());
            case 18:
                if (obj instanceof C5011t.C5014c) {
                    return CodedOutputStream.m38805m(((C5011t.C5014c) obj).getNumber());
                }
                return CodedOutputStream.m38805m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m39869f(C5007b<?> bVar, Object obj) {
        WireFormat.FieldType k = bVar.mo36923k();
        int number = bVar.getNumber();
        if (!bVar.mo36922j()) {
            return m39867d(k, number, obj);
        }
        int i = 0;
        if (bVar.isPacked()) {
            for (Object e : (List) obj) {
                i += m39868e(k, e);
            }
            return CodedOutputStream.m38786V(number) + i + CodedOutputStream.m38788X(i);
        }
        for (Object d : (List) obj) {
            i += m39867d(k, number, d);
        }
        return i;
    }

    /* renamed from: h */
    public static <T extends C5007b<T>> C5005p<T> m39870h() {
        return f25734d;
    }

    /* renamed from: m */
    public static int m39871m(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* renamed from: q */
    public static <T extends C5007b<T>> boolean m39872q(Map.Entry<T, Object> entry) {
        C5007b bVar = (C5007b) entry.getKey();
        if (bVar.mo36924n() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (!bVar.mo36922j()) {
            return m39873r(entry.getValue());
        }
        for (Object r : (List) entry.getValue()) {
            if (!m39873r(r)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m39873r(Object obj) {
        if (obj instanceof qu3) {
            return ((qu3) obj).isInitialized();
        }
        if (obj instanceof C5021u) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: s */
    public static boolean m39874s(WireFormat.FieldType fieldType, Object obj) {
        C5011t.m39927a(obj);
        switch (C5006a.f25738a[fieldType.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof C5011t.C5014c)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof C4956c0) || (obj instanceof C5021u)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: x */
    public static <T extends C5007b<T>> C5005p<T> m39875x() {
        return new C5005p<>();
    }

    /* renamed from: a */
    public void mo37467a(T t, Object obj) {
        List list;
        if (t.mo36922j()) {
            mo37485z(t, obj);
            Object i = mo37473i(t);
            if (i == null) {
                list = new ArrayList();
                this.f25735a.put(t, list);
            } else {
                list = (List) i;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public C5005p<T> clone() {
        C5005p<T> x = m39875x();
        for (int i = 0; i < this.f25735a.mo37380k(); i++) {
            Map.Entry<T, Object> j = this.f25735a.mo37379j(i);
            x.mo37484y((C5007b) j.getKey(), j.getValue());
        }
        for (Map.Entry next : this.f25735a.mo37382m()) {
            x.mo37484y((C5007b) next.getKey(), next.getValue());
        }
        x.f25737c = this.f25737c;
        return x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5005p)) {
            return false;
        }
        return this.f25735a.equals(((C5005p) obj).f25735a);
    }

    /* renamed from: g */
    public Iterator<Map.Entry<T, Object>> mo37471g() {
        if (this.f25737c) {
            return new C5021u.C5024c(this.f25735a.mo37376h().iterator());
        }
        return this.f25735a.mo37376h().iterator();
    }

    public int hashCode() {
        return this.f25735a.hashCode();
    }

    /* renamed from: i */
    public Object mo37473i(T t) {
        Object obj = this.f25735a.get(t);
        if (obj instanceof C5021u) {
            return ((C5021u) obj).mo37528f();
        }
        return obj;
    }

    /* renamed from: j */
    public int mo37474j() {
        int i = 0;
        for (int i2 = 0; i2 < this.f25735a.mo37380k(); i2++) {
            i += mo37475k(this.f25735a.mo37379j(i2));
        }
        for (Map.Entry<T, Object> k : this.f25735a.mo37382m()) {
            i += mo37475k(k);
        }
        return i;
    }

    /* renamed from: k */
    public final int mo37475k(Map.Entry<T, Object> entry) {
        C5007b bVar = (C5007b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.mo36924n() != WireFormat.JavaType.MESSAGE || bVar.mo36922j() || bVar.isPacked()) {
            return m39869f(bVar, value);
        }
        if (value instanceof C5021u) {
            return CodedOutputStream.m38765A(((C5007b) entry.getKey()).getNumber(), (C5021u) value);
        }
        return CodedOutputStream.m38769E(((C5007b) entry.getKey()).getNumber(), (C4956c0) value);
    }

    /* renamed from: l */
    public int mo37476l() {
        int i = 0;
        for (int i2 = 0; i2 < this.f25735a.mo37380k(); i2++) {
            Map.Entry<T, Object> j = this.f25735a.mo37379j(i2);
            i += m39869f((C5007b) j.getKey(), j.getValue());
        }
        for (Map.Entry next : this.f25735a.mo37382m()) {
            i += m39869f((C5007b) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: n */
    public boolean mo37477n() {
        return this.f25735a.isEmpty();
    }

    /* renamed from: o */
    public boolean mo37478o() {
        return this.f25736b;
    }

    /* renamed from: p */
    public boolean mo37479p() {
        for (int i = 0; i < this.f25735a.mo37380k(); i++) {
            if (!m39872q(this.f25735a.mo37379j(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> q : this.f25735a.mo37382m()) {
            if (!m39872q(q)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    public Iterator<Map.Entry<T, Object>> mo37480t() {
        if (this.f25737c) {
            return new C5021u.C5024c(this.f25735a.entrySet().iterator());
        }
        return this.f25735a.entrySet().iterator();
    }

    /* renamed from: u */
    public void mo37481u() {
        if (!this.f25736b) {
            this.f25735a.mo37386q();
            this.f25736b = true;
        }
    }

    /* renamed from: v */
    public void mo37482v(C5005p<T> pVar) {
        for (int i = 0; i < pVar.f25735a.mo37380k(); i++) {
            mo37483w(pVar.f25735a.mo37379j(i));
        }
        for (Map.Entry<T, Object> w : pVar.f25735a.mo37382m()) {
            mo37483w(w);
        }
    }

    /* renamed from: w */
    public final void mo37483w(Map.Entry<T, Object> entry) {
        C5007b bVar = (C5007b) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C5021u) {
            value = ((C5021u) value).mo37528f();
        }
        if (bVar.mo36922j()) {
            Object i = mo37473i(bVar);
            if (i == null) {
                i = new ArrayList();
            }
            for (Object c : (List) value) {
                ((List) i).add(m39866c(c));
            }
            this.f25735a.put(bVar, i);
        } else if (bVar.mo36924n() == WireFormat.JavaType.MESSAGE) {
            Object i2 = mo37473i(bVar);
            if (i2 == null) {
                this.f25735a.put(bVar, m39866c(value));
                return;
            }
            this.f25735a.put(bVar, bVar.mo36916Q(((C4956c0) i2).toBuilder(), (C4956c0) value).build());
        } else {
            this.f25735a.put(bVar, m39866c(value));
        }
    }

    /* renamed from: y */
    public void mo37484y(T t, Object obj) {
        if (!t.mo36922j()) {
            mo37485z(t, obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object z : arrayList) {
                mo37485z(t, z);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C5021u) {
            this.f25737c = true;
        }
        this.f25735a.put(t, obj);
    }

    /* renamed from: z */
    public final void mo37485z(T t, Object obj) {
        if (!m39874s(t.mo36923k(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.getNumber()), t.mo36923k().getJavaType(), obj.getClass().getName()}));
        }
    }

    public C5005p(boolean z) {
        this(C4989l0.m39778r(0));
        mo37481u();
    }

    public C5005p(C4989l0<T, Object> l0Var) {
        this.f25735a = l0Var;
        mo37481u();
    }
}

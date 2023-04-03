package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C7618e.C7620b;
import kotlin.reflect.jvm.internal.impl.protobuf.C7621f;
import kotlin.reflect.jvm.internal.impl.protobuf.C7624g;
import kotlin.reflect.jvm.internal.impl.protobuf.C7628h;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e */
/* compiled from: FieldSet */
public final class C7618e<FieldDescriptorType extends C7620b<FieldDescriptorType>> {

    /* renamed from: d */
    public static final C7618e f39959d = new C7618e(true);

    /* renamed from: a */
    public final C7630i<FieldDescriptorType, Object> f39960a = C7630i.m62051n(16);

    /* renamed from: b */
    public boolean f39961b;

    /* renamed from: c */
    public boolean f39962c = false;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e$a */
    /* compiled from: FieldSet */
    public static /* synthetic */ class C7619a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39963a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f39964b;

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
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39964b = r0
                r1 = 1
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r2 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f39964b     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r3 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f39964b     // Catch:{ NoSuchFieldError -> 0x0028 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r4 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f39964b     // Catch:{ NoSuchFieldError -> 0x0033 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r5 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f39964b     // Catch:{ NoSuchFieldError -> 0x003e }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r6 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f39964b     // Catch:{ NoSuchFieldError -> 0x0049 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r7 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f39964b     // Catch:{ NoSuchFieldError -> 0x0054 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r8 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f39964b     // Catch:{ NoSuchFieldError -> 0x0060 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r9 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f39964b     // Catch:{ NoSuchFieldError -> 0x006c }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f39964b     // Catch:{ NoSuchFieldError -> 0x0078 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f39964b     // Catch:{ NoSuchFieldError -> 0x0084 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f39964b     // Catch:{ NoSuchFieldError -> 0x0090 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f39964b     // Catch:{ NoSuchFieldError -> 0x009c }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f39964b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f39964b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f39964b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f39964b     // Catch:{ NoSuchFieldError -> 0x00cc }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f39964b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType[] r9 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f39963a = r9
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f39963a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r9 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f39963a     // Catch:{ NoSuchFieldError -> 0x00fd }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f39963a     // Catch:{ NoSuchFieldError -> 0x0107 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f39963a     // Catch:{ NoSuchFieldError -> 0x0111 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f39963a     // Catch:{ NoSuchFieldError -> 0x011b }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f39963a     // Catch:{ NoSuchFieldError -> 0x0125 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f39963a     // Catch:{ NoSuchFieldError -> 0x012f }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f39963a     // Catch:{ NoSuchFieldError -> 0x0139 }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C7618e.C7619a.<clinit>():void");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e$b */
    /* compiled from: FieldSet */
    public interface C7620b<T extends C7620b<T>> extends Comparable<T> {
        int getNumber();

        boolean isPacked();

        /* renamed from: j */
        boolean mo54661j();

        /* renamed from: k */
        WireFormat.FieldType mo54662k();

        /* renamed from: n */
        WireFormat.JavaType mo54663n();

        /* renamed from: y0 */
        C7628h.C7629a mo54664y0(C7628h.C7629a aVar, C7628h hVar);
    }

    public C7618e() {
    }

    /* renamed from: d */
    public static int m62012d(WireFormat.FieldType fieldType, int i, Object obj) {
        int D = CodedOutputStream.m61846D(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            D *= 2;
        }
        return D + m62013e(fieldType, obj);
    }

    /* renamed from: e */
    public static int m62013e(WireFormat.FieldType fieldType, Object obj) {
        switch (C7619a.f39964b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.m61858g(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m61864m(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m61868q(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m61848F(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m61867p(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m61862k(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m61861j(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m61853b(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m61845C((String) obj);
            case 10:
                if (obj instanceof c70) {
                    return CodedOutputStream.m61856e((c70) obj);
                }
                return CodedOutputStream.m61854c((byte[]) obj);
            case 11:
                return CodedOutputStream.m61847E(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.m61875x(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.m61876y(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.m61877z(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m61844B(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m61865n((C7628h) obj);
            case 17:
                if (obj instanceof C7624g) {
                    return CodedOutputStream.m61869r((C7624g) obj);
                }
                return CodedOutputStream.m61871t((C7628h) obj);
            case 18:
                if (obj instanceof C7621f.C7622a) {
                    return CodedOutputStream.m61860i(((C7621f.C7622a) obj).getNumber());
                }
                return CodedOutputStream.m61860i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m62014f(C7620b<?> bVar, Object obj) {
        WireFormat.FieldType k = bVar.mo54662k();
        int number = bVar.getNumber();
        if (!bVar.mo54661j()) {
            return m62012d(k, number, obj);
        }
        int i = 0;
        if (bVar.isPacked()) {
            for (Object e : (List) obj) {
                i += m62013e(k, e);
            }
            return CodedOutputStream.m61846D(number) + i + CodedOutputStream.m61873v(i);
        }
        for (Object d : (List) obj) {
            i += m62012d(k, number, d);
        }
        return i;
    }

    /* renamed from: g */
    public static <T extends C7620b<T>> C7618e<T> m62015g() {
        return f39959d;
    }

    /* renamed from: l */
    public static int m62016l(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* renamed from: t */
    public static <T extends C7620b<T>> C7618e<T> m62017t() {
        return new C7618e<>();
    }

    /* renamed from: u */
    public static Object m62018u(C7614c cVar, WireFormat.FieldType fieldType, boolean z) throws IOException {
        switch (C7619a.f39964b[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(cVar.mo54718m());
            case 2:
                return Float.valueOf(cVar.mo54722q());
            case 3:
                return Long.valueOf(cVar.mo54725t());
            case 4:
                return Long.valueOf(cVar.mo54702M());
            case 5:
                return Integer.valueOf(cVar.mo54724s());
            case 6:
                return Long.valueOf(cVar.mo54721p());
            case 7:
                return Integer.valueOf(cVar.mo54720o());
            case 8:
                return Boolean.valueOf(cVar.mo54716k());
            case 9:
                if (z) {
                    return cVar.mo54699J();
                }
                return cVar.mo54698I();
            case 10:
                return cVar.mo54717l();
            case 11:
                return Integer.valueOf(cVar.mo54701L());
            case 12:
                return Integer.valueOf(cVar.mo54694E());
            case 13:
                return Long.valueOf(cVar.mo54695F());
            case 14:
                return Integer.valueOf(cVar.mo54696G());
            case 15:
                return Long.valueOf(cVar.mo54697H());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C7624g) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C7621f.C7622a) == false) goto L_0x0030;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m62019w(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.C7618e.C7619a.f39963a
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = r2.getJavaType()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0042;
                case 2: goto L_0x003f;
                case 3: goto L_0x003c;
                case 4: goto L_0x0039;
                case 5: goto L_0x0036;
                case 6: goto L_0x0033;
                case 7: goto L_0x0027;
                case 8: goto L_0x001e;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0044
        L_0x0015:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C7628h
            if (r2 != 0) goto L_0x0031
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C7624g
            if (r2 == 0) goto L_0x0030
            goto L_0x0031
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0031
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C7621f.C7622a
            if (r2 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0027:
            boolean r2 = r3 instanceof p000.c70
            if (r2 != 0) goto L_0x0031
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            r1 = r0
            goto L_0x0044
        L_0x0033:
            boolean r1 = r3 instanceof java.lang.String
            goto L_0x0044
        L_0x0036:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L_0x0044
        L_0x0039:
            boolean r1 = r3 instanceof java.lang.Double
            goto L_0x0044
        L_0x003c:
            boolean r1 = r3 instanceof java.lang.Float
            goto L_0x0044
        L_0x003f:
            boolean r1 = r3 instanceof java.lang.Long
            goto L_0x0044
        L_0x0042:
            boolean r1 = r3 instanceof java.lang.Integer
        L_0x0044:
            if (r1 == 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C7618e.m62019w(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    /* renamed from: x */
    public static void m62020x(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.mo54612Y(i, (C7628h) obj);
            return;
        }
        codedOutputStream.mo54636w0(i, m62016l(fieldType, false));
        m62021y(codedOutputStream, fieldType, obj);
    }

    /* renamed from: y */
    public static void m62021y(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (C7619a.f39964b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.mo54605R(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.mo54611X(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.mo54616c0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo54639z0(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.mo54615b0(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.mo54609V(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.mo54608U(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.mo54600M(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.mo54635v0((String) obj);
                return;
            case 10:
                if (obj instanceof c70) {
                    codedOutputStream.mo54603P((c70) obj);
                    return;
                } else {
                    codedOutputStream.mo54601N((byte[]) obj);
                    return;
                }
            case 11:
                codedOutputStream.mo54638y0(((Integer) obj).intValue());
                return;
            case 12:
                codedOutputStream.mo54630q0(((Integer) obj).intValue());
                return;
            case 13:
                codedOutputStream.mo54631r0(((Long) obj).longValue());
                return;
            case 14:
                codedOutputStream.mo54632s0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.mo54634u0(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.mo54613Z((C7628h) obj);
                return;
            case 17:
                codedOutputStream.mo54618e0((C7628h) obj);
                return;
            case 18:
                if (obj instanceof C7621f.C7622a) {
                    codedOutputStream.mo54607T(((C7621f.C7622a) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.mo54607T(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: z */
    public static void m62022z(C7620b<?> bVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType k = bVar.mo54662k();
        int number = bVar.getNumber();
        if (bVar.mo54661j()) {
            List<Object> list = (List) obj;
            if (bVar.isPacked()) {
                codedOutputStream.mo54636w0(number, 2);
                int i = 0;
                for (Object e : list) {
                    i += m62013e(k, e);
                }
                codedOutputStream.mo54628o0(i);
                for (Object y : list) {
                    m62021y(codedOutputStream, k, y);
                }
                return;
            }
            for (Object x : list) {
                m62020x(codedOutputStream, k, number, x);
            }
        } else if (obj instanceof C7624g) {
            m62020x(codedOutputStream, k, number, ((C7624g) obj).mo54753e());
        } else {
            m62020x(codedOutputStream, k, number, obj);
        }
    }

    /* renamed from: a */
    public void mo54737a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.mo54661j()) {
            m62019w(fielddescriptortype.mo54662k(), obj);
            Object h = mo54741h(fielddescriptortype);
            if (h == null) {
                list = new ArrayList();
                this.f39960a.mo54777p(fielddescriptortype, list);
            } else {
                list = (List) h;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public C7618e<FieldDescriptorType> clone() {
        C7618e<FieldDescriptorType> t = m62017t();
        for (int i = 0; i < this.f39960a.mo54772i(); i++) {
            Map.Entry<FieldDescriptorType, Object> h = this.f39960a.mo54771h(i);
            t.mo54752v((C7620b) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.f39960a.mo54773j()) {
            t.mo54752v((C7620b) next.getKey(), next.getValue());
        }
        t.f39962c = this.f39962c;
        return t;
    }

    /* renamed from: c */
    public final Object mo54739c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: h */
    public Object mo54741h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f39960a.get(fielddescriptortype);
        if (obj instanceof C7624g) {
            return ((C7624g) obj).mo54753e();
        }
        return obj;
    }

    /* renamed from: i */
    public Object mo54742i(FieldDescriptorType fielddescriptortype, int i) {
        if (fielddescriptortype.mo54661j()) {
            Object h = mo54741h(fielddescriptortype);
            if (h != null) {
                return ((List) h).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: j */
    public int mo54743j(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.mo54661j()) {
            Object h = mo54741h(fielddescriptortype);
            if (h == null) {
                return 0;
            }
            return ((List) h).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: k */
    public int mo54744k() {
        int i = 0;
        for (int i2 = 0; i2 < this.f39960a.mo54772i(); i2++) {
            Map.Entry<FieldDescriptorType, Object> h = this.f39960a.mo54771h(i2);
            i += m62014f((C7620b) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.f39960a.mo54773j()) {
            i += m62014f((C7620b) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: m */
    public boolean mo54745m(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.mo54661j()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        } else if (this.f39960a.get(fielddescriptortype) != null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: n */
    public boolean mo54746n() {
        for (int i = 0; i < this.f39960a.mo54772i(); i++) {
            if (!mo54747o(this.f39960a.mo54771h(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> o : this.f39960a.mo54773j()) {
            if (!mo54747o(o)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public final boolean mo54747o(Map.Entry<FieldDescriptorType, Object> entry) {
        C7620b bVar = (C7620b) entry.getKey();
        if (bVar.mo54663n() == WireFormat.JavaType.MESSAGE) {
            if (bVar.mo54661j()) {
                for (C7628h isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C7628h) {
                    if (!((C7628h) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof C7624g) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: p */
    public Iterator<Map.Entry<FieldDescriptorType, Object>> mo54748p() {
        if (this.f39962c) {
            return new C7624g.C7627c(this.f39960a.entrySet().iterator());
        }
        return this.f39960a.entrySet().iterator();
    }

    /* renamed from: q */
    public void mo54749q() {
        if (!this.f39961b) {
            this.f39960a.mo54776m();
            this.f39961b = true;
        }
    }

    /* renamed from: r */
    public void mo54750r(C7618e<FieldDescriptorType> eVar) {
        for (int i = 0; i < eVar.f39960a.mo54772i(); i++) {
            mo54751s(eVar.f39960a.mo54771h(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> s : eVar.f39960a.mo54773j()) {
            mo54751s(s);
        }
    }

    /* renamed from: s */
    public final void mo54751s(Map.Entry<FieldDescriptorType, Object> entry) {
        C7620b bVar = (C7620b) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C7624g) {
            value = ((C7624g) value).mo54753e();
        }
        if (bVar.mo54661j()) {
            Object h = mo54741h(bVar);
            if (h == null) {
                h = new ArrayList();
            }
            for (Object c : (List) value) {
                ((List) h).add(mo54739c(c));
            }
            this.f39960a.mo54777p(bVar, h);
        } else if (bVar.mo54663n() == WireFormat.JavaType.MESSAGE) {
            Object h2 = mo54741h(bVar);
            if (h2 == null) {
                this.f39960a.mo54777p(bVar, mo54739c(value));
                return;
            }
            this.f39960a.mo54777p(bVar, bVar.mo54664y0(((C7628h) h2).toBuilder(), (C7628h) value).build());
        } else {
            this.f39960a.mo54777p(bVar, mo54739c(value));
        }
    }

    /* renamed from: v */
    public void mo54752v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo54661j()) {
            m62019w(fielddescriptortype.mo54662k(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object w : arrayList) {
                m62019w(fielddescriptortype.mo54662k(), w);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C7624g) {
            this.f39962c = true;
        }
        this.f39960a.mo54777p(fielddescriptortype, obj);
    }

    public C7618e(boolean z) {
        mo54749q();
    }
}

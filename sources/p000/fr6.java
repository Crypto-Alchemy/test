package p000;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

/* renamed from: fr6 */
/* compiled from: TokenBuffer */
public class fr6 extends JsonGenerator {

    /* renamed from: X */
    public static final int f11976X = JsonGenerator.Feature.collectDefaults();

    /* renamed from: A */
    public boolean f11977A;

    /* renamed from: B */
    public boolean f11978B;

    /* renamed from: C */
    public boolean f11979C;

    /* renamed from: H */
    public C2321c f11980H;

    /* renamed from: I */
    public C2321c f11981I;

    /* renamed from: L */
    public int f11982L;

    /* renamed from: M */
    public Object f11983M;

    /* renamed from: P */
    public Object f11984P;

    /* renamed from: Q */
    public boolean f11985Q = false;

    /* renamed from: U */
    public p73 f11986U;

    /* renamed from: k */
    public xe4 f11987k;

    /* renamed from: r */
    public z63 f11988r;

    /* renamed from: s */
    public int f11989s;

    /* renamed from: x */
    public boolean f11990x;

    /* renamed from: y */
    public boolean f11991y;

    /* renamed from: fr6$a */
    /* compiled from: TokenBuffer */
    public static /* synthetic */ class C2319a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11992a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f11993b;

        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00b1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00bd */
        static {
            /*
                com.fasterxml.jackson.core.JsonParser$NumberType[] r0 = com.fasterxml.jackson.core.JsonParser.NumberType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11993b = r0
                r1 = 1
                com.fasterxml.jackson.core.JsonParser$NumberType r2 = com.fasterxml.jackson.core.JsonParser.NumberType.INT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f11993b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.core.JsonParser$NumberType r3 = com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f11993b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.core.JsonParser$NumberType r4 = com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f11993b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.core.JsonParser$NumberType r5 = com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f11993b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.core.JsonParser$NumberType r6 = com.fasterxml.jackson.core.JsonParser.NumberType.LONG     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.fasterxml.jackson.core.JsonToken[] r5 = com.fasterxml.jackson.core.JsonToken.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f11992a = r5
                com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.START_OBJECT     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f11992a     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f11992a     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f11992a     // Catch:{ NoSuchFieldError -> 0x006d }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f11992a     // Catch:{ NoSuchFieldError -> 0x0077 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = f11992a     // Catch:{ NoSuchFieldError -> 0x0082 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = f11992a     // Catch:{ NoSuchFieldError -> 0x008d }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r0 = f11992a     // Catch:{ NoSuchFieldError -> 0x0099 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = f11992a     // Catch:{ NoSuchFieldError -> 0x00a5 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x00a5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a5 }
            L_0x00a5:
                int[] r0 = f11992a     // Catch:{ NoSuchFieldError -> 0x00b1 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x00b1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b1 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b1 }
            L_0x00b1:
                int[] r0 = f11992a     // Catch:{ NoSuchFieldError -> 0x00bd }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ NoSuchFieldError -> 0x00bd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bd }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00bd }
            L_0x00bd:
                int[] r0 = f11992a     // Catch:{ NoSuchFieldError -> 0x00c9 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT     // Catch:{ NoSuchFieldError -> 0x00c9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c9 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c9 }
            L_0x00c9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.fr6.C2319a.<clinit>():void");
        }
    }

    /* renamed from: fr6$b */
    /* compiled from: TokenBuffer */
    public static final class C2320b extends mm4 {

        /* renamed from: M */
        public xe4 f11994M;

        /* renamed from: P */
        public final boolean f11995P;

        /* renamed from: Q */
        public final boolean f11996Q;

        /* renamed from: U */
        public final boolean f11997U;

        /* renamed from: X */
        public C2321c f11998X;

        /* renamed from: Y */
        public int f11999Y;

        /* renamed from: Z */
        public gr6 f12000Z;

        /* renamed from: e0 */
        public boolean f12001e0;

        /* renamed from: k0 */
        public transient g60 f12002k0;

        /* renamed from: v0 */
        public JsonLocation f12003v0 = null;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2320b(C2321c cVar, xe4 xe4, boolean z, boolean z2, z63 z63) {
            super(0);
            boolean z3 = false;
            this.f11998X = cVar;
            this.f11999Y = -1;
            this.f11994M = xe4;
            this.f12000Z = gr6.m18372m(z63);
            this.f11995P = z;
            this.f11996Q = z2;
            this.f11997U = (z || z2) ? true : z3;
        }

        /* renamed from: A */
        public Object mo13924A() {
            if (this.f15012g == JsonToken.VALUE_EMBEDDED_OBJECT) {
                return mo20098N1();
            }
            return null;
        }

        /* renamed from: C */
        public float mo13927C() throws IOException {
            return mo13936L().floatValue();
        }

        /* renamed from: D0 */
        public boolean mo13929D0() {
            if (this.f15012g != JsonToken.VALUE_NUMBER_FLOAT) {
                return false;
            }
            Object N1 = mo20098N1();
            if (N1 instanceof Double) {
                Double d = (Double) N1;
                if (d.isNaN() || d.isInfinite()) {
                    return true;
                }
                return false;
            } else if (!(N1 instanceof Float)) {
                return false;
            } else {
                Float f = (Float) N1;
                if (f.isNaN() || f.isInfinite()) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: E0 */
        public String mo13930E0() throws IOException {
            C2321c cVar;
            JsonToken jsonToken;
            String str;
            if (this.f12001e0 || (cVar = this.f11998X) == null) {
                return null;
            }
            int i = this.f11999Y + 1;
            if (i < 16 && cVar.mo20119q(i) == (jsonToken = JsonToken.FIELD_NAME)) {
                this.f11999Y = i;
                this.f15012g = jsonToken;
                Object j = this.f11998X.mo20112j(i);
                if (j instanceof String) {
                    str = (String) j;
                } else {
                    str = j.toString();
                }
                this.f12000Z.mo20820o(str);
                return str;
            } else if (mo13938N0() == JsonToken.FIELD_NAME) {
                return mo13964f();
            } else {
                return null;
            }
        }

        /* renamed from: I */
        public int mo13933I() throws IOException {
            Number number;
            if (this.f15012g == JsonToken.VALUE_NUMBER_INT) {
                number = (Number) mo20098N1();
            } else {
                number = mo13936L();
            }
            if ((number instanceof Integer) || mo20099O1(number)) {
                return number.intValue();
            }
            return mo20096L1(number);
        }

        /* renamed from: J */
        public long mo13934J() throws IOException {
            Number number;
            if (this.f15012g == JsonToken.VALUE_NUMBER_INT) {
                number = (Number) mo20098N1();
            } else {
                number = mo13936L();
            }
            if ((number instanceof Long) || mo20100P1(number)) {
                return number.longValue();
            }
            return mo20097M1(number);
        }

        /* renamed from: K */
        public JsonParser.NumberType mo13935K() throws IOException {
            Number L = mo13936L();
            if (L instanceof Integer) {
                return JsonParser.NumberType.INT;
            }
            if (L instanceof Long) {
                return JsonParser.NumberType.LONG;
            }
            if (L instanceof Double) {
                return JsonParser.NumberType.DOUBLE;
            }
            if (L instanceof BigDecimal) {
                return JsonParser.NumberType.BIG_DECIMAL;
            }
            if (L instanceof BigInteger) {
                return JsonParser.NumberType.BIG_INTEGER;
            }
            if (L instanceof Float) {
                return JsonParser.NumberType.FLOAT;
            }
            if (L instanceof Short) {
                return JsonParser.NumberType.INT;
            }
            return null;
        }

        /* renamed from: K1 */
        public final void mo20095K1() throws JacksonException {
            JsonToken jsonToken = this.f15012g;
            if (jsonToken == null || !jsonToken.isNumeric()) {
                throw mo13953a("Current token (" + this.f15012g + ") not numeric, cannot use numeric value accessors");
            }
        }

        /* renamed from: L */
        public final Number mo13936L() throws IOException {
            mo20095K1();
            Object N1 = mo20098N1();
            if (N1 instanceof Number) {
                return (Number) N1;
            }
            if (N1 instanceof String) {
                String str = (String) N1;
                if (str.indexOf(46) >= 0) {
                    return Double.valueOf(Double.parseDouble(str));
                }
                return Long.valueOf(Long.parseLong(str));
            } else if (N1 == null) {
                return null;
            } else {
                throw new IllegalStateException("Internal error: entry should be a Number, but is of type " + N1.getClass().getName());
            }
        }

        /* renamed from: L1 */
        public int mo20096L1(Number number) throws IOException {
            if (number instanceof Long) {
                long longValue = number.longValue();
                int i = (int) longValue;
                if (((long) i) != longValue) {
                    mo23213D1();
                }
                return i;
            }
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (mm4.f15010x.compareTo(bigInteger) > 0 || mm4.f15011y.compareTo(bigInteger) < 0) {
                    mo23213D1();
                }
            } else if ((number instanceof Double) || (number instanceof Float)) {
                double doubleValue = number.doubleValue();
                if (doubleValue < -2.147483648E9d || doubleValue > 2.147483647E9d) {
                    mo23213D1();
                }
                return (int) doubleValue;
            } else if (number instanceof BigDecimal) {
                BigDecimal bigDecimal = (BigDecimal) number;
                if (mm4.f15006I.compareTo(bigDecimal) > 0 || mm4.f15007L.compareTo(bigDecimal) < 0) {
                    mo23213D1();
                }
            } else {
                mo23234z1();
            }
            return number.intValue();
        }

        /* renamed from: M1 */
        public long mo20097M1(Number number) throws IOException {
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (mm4.f15002A.compareTo(bigInteger) > 0 || mm4.f15003B.compareTo(bigInteger) < 0) {
                    mo23216G1();
                }
            } else if ((number instanceof Double) || (number instanceof Float)) {
                double doubleValue = number.doubleValue();
                if (doubleValue < -9.223372036854776E18d || doubleValue > 9.223372036854776E18d) {
                    mo23216G1();
                }
                return (long) doubleValue;
            } else if (number instanceof BigDecimal) {
                BigDecimal bigDecimal = (BigDecimal) number;
                if (mm4.f15004C.compareTo(bigDecimal) > 0 || mm4.f15005H.compareTo(bigDecimal) < 0) {
                    mo23216G1();
                }
            } else {
                mo23234z1();
            }
            return number.longValue();
        }

        /* renamed from: N0 */
        public JsonToken mo13938N0() throws IOException {
            C2321c cVar;
            String str;
            if (this.f12001e0 || (cVar = this.f11998X) == null) {
                return null;
            }
            int i = this.f11999Y + 1;
            this.f11999Y = i;
            if (i >= 16) {
                this.f11999Y = 0;
                C2321c l = cVar.mo20114l();
                this.f11998X = l;
                if (l == null) {
                    return null;
                }
            }
            JsonToken q = this.f11998X.mo20119q(this.f11999Y);
            this.f15012g = q;
            if (q == JsonToken.FIELD_NAME) {
                Object N1 = mo20098N1();
                if (N1 instanceof String) {
                    str = (String) N1;
                } else {
                    str = N1.toString();
                }
                this.f12000Z.mo20820o(str);
            } else if (q == JsonToken.START_OBJECT) {
                this.f12000Z = this.f12000Z.mo20818l();
            } else if (q == JsonToken.START_ARRAY) {
                this.f12000Z = this.f12000Z.mo20817k();
            } else if (q == JsonToken.END_OBJECT || q == JsonToken.END_ARRAY) {
                this.f12000Z = this.f12000Z.mo20819n();
            } else {
                this.f12000Z.mo20821p();
            }
            return this.f15012g;
        }

        /* renamed from: N1 */
        public final Object mo20098N1() {
            return this.f11998X.mo20112j(this.f11999Y);
        }

        /* renamed from: O */
        public Object mo13939O() {
            return this.f11998X.mo20110h(this.f11999Y);
        }

        /* renamed from: O1 */
        public final boolean mo20099O1(Number number) {
            if ((number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
            return false;
        }

        /* renamed from: P */
        public z63 mo13941P() {
            return this.f12000Z;
        }

        /* renamed from: P1 */
        public final boolean mo20100P1(Number number) {
            if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
            return false;
        }

        /* renamed from: Q */
        public yz2<StreamReadCapability> mo13943Q() {
            return JsonParser.f9821e;
        }

        /* renamed from: Q1 */
        public void mo20101Q1(JsonLocation jsonLocation) {
            this.f12003v0 = jsonLocation;
        }

        /* renamed from: S0 */
        public int mo13946S0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
            byte[] l = mo13975l(base64Variant);
            if (l == null) {
                return 0;
            }
            outputStream.write(l, 0, l.length);
            return l.length;
        }

        /* renamed from: W */
        public String mo13947W() {
            JsonToken jsonToken = this.f15012g;
            if (jsonToken == JsonToken.VALUE_STRING || jsonToken == JsonToken.FIELD_NAME) {
                Object N1 = mo20098N1();
                if (N1 instanceof String) {
                    return (String) N1;
                }
                return wf0.m29501a0(N1);
            } else if (jsonToken == null) {
                return null;
            } else {
                int i = C2319a.f11992a[jsonToken.ordinal()];
                if (i == 7 || i == 8) {
                    return wf0.m29501a0(mo20098N1());
                }
                return this.f15012g.asString();
            }
        }

        /* renamed from: X */
        public char[] mo13949X() {
            String W = mo13947W();
            if (W == null) {
                return null;
            }
            return W.toCharArray();
        }

        /* renamed from: Y */
        public int mo13950Y() {
            String W = mo13947W();
            if (W == null) {
                return 0;
            }
            return W.length();
        }

        /* renamed from: b0 */
        public int mo13956b0() {
            return 0;
        }

        /* renamed from: c */
        public boolean mo13957c() {
            return this.f11996Q;
        }

        /* renamed from: c0 */
        public JsonLocation mo13958c0() {
            return mo13981q();
        }

        public void close() throws IOException {
            if (!this.f12001e0) {
                this.f12001e0 = true;
            }
        }

        /* renamed from: d */
        public boolean mo13961d() {
            return this.f11995P;
        }

        /* renamed from: e0 */
        public Object mo13963e0() {
            return this.f11998X.mo20111i(this.f11999Y);
        }

        /* renamed from: f */
        public String mo13964f() {
            JsonToken jsonToken = this.f15012g;
            if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
                return this.f12000Z.mo11443e().mo11435b();
            }
            return this.f12000Z.mo11435b();
        }

        /* renamed from: h1 */
        public void mo20102h1() {
            mo23234z1();
        }

        /* renamed from: j */
        public BigInteger mo13971j() throws IOException {
            Number L = mo13936L();
            if (L instanceof BigInteger) {
                return (BigInteger) L;
            }
            if (mo13935K() == JsonParser.NumberType.BIG_DECIMAL) {
                return ((BigDecimal) L).toBigInteger();
            }
            return BigInteger.valueOf(L.longValue());
        }

        /* renamed from: l */
        public byte[] mo13975l(Base64Variant base64Variant) throws IOException {
            if (this.f15012g == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object N1 = mo20098N1();
                if (N1 instanceof byte[]) {
                    return (byte[]) N1;
                }
            }
            if (this.f15012g == JsonToken.VALUE_STRING) {
                String W = mo13947W();
                if (W == null) {
                    return null;
                }
                g60 g60 = this.f12002k0;
                if (g60 == null) {
                    g60 = new g60(100);
                    this.f12002k0 = g60;
                } else {
                    g60.mo20397k();
                }
                mo23221f1(W, g60, base64Variant);
                return g60.mo20400n();
            }
            throw mo13953a("Current token (" + this.f15012g + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
        }

        /* renamed from: p */
        public xe4 mo13980p() {
            return this.f11994M;
        }

        /* renamed from: q */
        public JsonLocation mo13981q() {
            JsonLocation jsonLocation = this.f12003v0;
            if (jsonLocation == null) {
                return JsonLocation.f9820NA;
            }
            return jsonLocation;
        }

        /* renamed from: q0 */
        public boolean mo13982q0() {
            return false;
        }

        /* renamed from: s */
        public String mo13983s() {
            return mo13964f();
        }

        /* renamed from: y */
        public BigDecimal mo13988y() throws IOException {
            Number L = mo13936L();
            if (L instanceof BigDecimal) {
                return (BigDecimal) L;
            }
            int i = C2319a.f11993b[mo13935K().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new BigDecimal((BigInteger) L);
                }
                if (i != 5) {
                    return BigDecimal.valueOf(L.doubleValue());
                }
            }
            return BigDecimal.valueOf(L.longValue());
        }

        /* renamed from: z */
        public double mo13990z() throws IOException {
            return mo13936L().doubleValue();
        }
    }

    /* renamed from: fr6$c */
    /* compiled from: TokenBuffer */
    public static final class C2321c {

        /* renamed from: e */
        public static final JsonToken[] f12004e;

        /* renamed from: a */
        public C2321c f12005a;

        /* renamed from: b */
        public long f12006b;

        /* renamed from: c */
        public final Object[] f12007c = new Object[16];

        /* renamed from: d */
        public TreeMap<Integer, Object> f12008d;

        static {
            JsonToken[] jsonTokenArr = new JsonToken[16];
            f12004e = jsonTokenArr;
            JsonToken[] values = JsonToken.values();
            System.arraycopy(values, 1, jsonTokenArr, 1, Math.min(15, values.length - 1));
        }

        /* renamed from: a */
        public final int mo20103a(int i) {
            return i + i + 1;
        }

        /* renamed from: b */
        public final int mo20104b(int i) {
            return i + i;
        }

        /* renamed from: c */
        public C2321c mo20105c(int i, JsonToken jsonToken) {
            if (i < 16) {
                mo20115m(i, jsonToken);
                return null;
            }
            C2321c cVar = new C2321c();
            this.f12005a = cVar;
            cVar.mo20115m(0, jsonToken);
            return this.f12005a;
        }

        /* renamed from: d */
        public C2321c mo20106d(int i, JsonToken jsonToken, Object obj) {
            if (i < 16) {
                mo20116n(i, jsonToken, obj);
                return null;
            }
            C2321c cVar = new C2321c();
            this.f12005a = cVar;
            cVar.mo20116n(0, jsonToken, obj);
            return this.f12005a;
        }

        /* renamed from: e */
        public C2321c mo20107e(int i, JsonToken jsonToken, Object obj, Object obj2) {
            if (i < 16) {
                mo20117o(i, jsonToken, obj, obj2);
                return null;
            }
            C2321c cVar = new C2321c();
            this.f12005a = cVar;
            cVar.mo20117o(0, jsonToken, obj, obj2);
            return this.f12005a;
        }

        /* renamed from: f */
        public C2321c mo20108f(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            if (i < 16) {
                mo20118p(i, jsonToken, obj, obj2, obj3);
                return null;
            }
            C2321c cVar = new C2321c();
            this.f12005a = cVar;
            cVar.mo20118p(0, jsonToken, obj, obj2, obj3);
            return this.f12005a;
        }

        /* renamed from: g */
        public final void mo20109g(int i, Object obj, Object obj2) {
            if (this.f12008d == null) {
                this.f12008d = new TreeMap<>();
            }
            if (obj != null) {
                this.f12008d.put(Integer.valueOf(mo20103a(i)), obj);
            }
            if (obj2 != null) {
                this.f12008d.put(Integer.valueOf(mo20104b(i)), obj2);
            }
        }

        /* renamed from: h */
        public Object mo20110h(int i) {
            TreeMap<Integer, Object> treeMap = this.f12008d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(mo20103a(i)));
        }

        /* renamed from: i */
        public Object mo20111i(int i) {
            TreeMap<Integer, Object> treeMap = this.f12008d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(mo20104b(i)));
        }

        /* renamed from: j */
        public Object mo20112j(int i) {
            return this.f12007c[i];
        }

        /* renamed from: k */
        public boolean mo20113k() {
            if (this.f12008d != null) {
                return true;
            }
            return false;
        }

        /* renamed from: l */
        public C2321c mo20114l() {
            return this.f12005a;
        }

        /* renamed from: m */
        public final void mo20115m(int i, JsonToken jsonToken) {
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.f12006b |= ordinal;
        }

        /* renamed from: n */
        public final void mo20116n(int i, JsonToken jsonToken, Object obj) {
            this.f12007c[i] = obj;
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.f12006b |= ordinal;
        }

        /* renamed from: o */
        public final void mo20117o(int i, JsonToken jsonToken, Object obj, Object obj2) {
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.f12006b = ordinal | this.f12006b;
            mo20109g(i, obj, obj2);
        }

        /* renamed from: p */
        public final void mo20118p(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            this.f12007c[i] = obj;
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.f12006b = ordinal | this.f12006b;
            mo20109g(i, obj2, obj3);
        }

        /* renamed from: q */
        public JsonToken mo20119q(int i) {
            long j = this.f12006b;
            if (i > 0) {
                j >>= i << 2;
            }
            return f12004e[((int) j) & 15];
        }
    }

    public fr6(xe4 xe4, boolean z) {
        boolean z2 = false;
        this.f11987k = xe4;
        this.f11989s = f11976X;
        this.f11986U = p73.m24704q((el1) null);
        C2321c cVar = new C2321c();
        this.f11981I = cVar;
        this.f11980H = cVar;
        this.f11982L = 0;
        this.f11991y = z;
        this.f11977A = z;
        this.f11978B = (z || z) ? true : z2;
    }

    /* renamed from: A0 */
    public void mo13833A0(qw5 qw5) throws IOException {
        mo20090v1();
    }

    /* renamed from: A1 */
    public JsonParser mo20073A1() throws IOException {
        JsonParser y1 = mo20093y1(this.f11987k);
        y1.mo13938N0();
        return y1;
    }

    /* renamed from: B0 */
    public void mo13834B0(String str) throws IOException {
        mo20090v1();
    }

    /* renamed from: B1 */
    public void mo20074B1(JsonParser jsonParser) throws IOException {
        JsonToken g = jsonParser.mo13965g();
        if (g == JsonToken.FIELD_NAME) {
            if (this.f11978B) {
                mo20086s1(jsonParser);
            }
            mo13864b0(jsonParser.mo13964f());
            g = jsonParser.mo13938N0();
        } else if (g == null) {
            throw new IllegalStateException("No token available from argument `JsonParser`");
        }
        int i = C2319a.f11992a[g.ordinal()];
        if (i == 1) {
            if (this.f11978B) {
                mo20086s1(jsonParser);
            }
            mo13852Q0();
            mo20087t1(jsonParser);
        } else if (i == 2) {
            mo13855W();
        } else if (i == 3) {
            if (this.f11978B) {
                mo20086s1(jsonParser);
            }
            mo13840G0();
            mo20087t1(jsonParser);
        } else if (i != 4) {
            mo20089u1(jsonParser, g);
        } else {
            mo13853S();
        }
    }

    /* renamed from: C0 */
    public void mo13836C0(char[] cArr, int i, int i2) throws IOException {
        mo20090v1();
    }

    /* renamed from: C1 */
    public fr6 mo20075C1(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken N0;
        if (!jsonParser.mo13984s0(JsonToken.FIELD_NAME)) {
            mo20074B1(jsonParser);
            return this;
        }
        mo13852Q0();
        do {
            mo20074B1(jsonParser);
            N0 = jsonParser.mo13938N0();
        } while (N0 == JsonToken.FIELD_NAME);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        if (N0 != jsonToken) {
            deserializationContext.reportWrongTokenException((Class<?>) fr6.class, jsonToken, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + N0, new Object[0]);
        }
        mo13855W();
        return this;
    }

    /* renamed from: D1 */
    public JsonToken mo20076D1() {
        return this.f11980H.mo20119q(0);
    }

    /* renamed from: E0 */
    public void mo13838E0(String str) throws IOException {
        mo20085r1(JsonToken.VALUE_EMBEDDED_OBJECT, new l75(str));
    }

    /* renamed from: E1 */
    public fr6 mo20077E1(boolean z) {
        this.f11979C = z;
        return this;
    }

    /* renamed from: F1 */
    public final p73 mo13885k() {
        return this.f11986U;
    }

    /* renamed from: G0 */
    public final void mo13840G0() throws IOException {
        this.f11986U.mo24470x();
        mo20083l1(JsonToken.START_ARRAY);
        this.f11986U = this.f11986U.mo24460m();
    }

    /* renamed from: G1 */
    public void mo20079G1(JsonGenerator jsonGenerator) throws IOException {
        boolean z;
        boolean z2;
        C2321c cVar = this.f11980H;
        boolean z3 = this.f11978B;
        if (!z3 || !cVar.mo20113k()) {
            z = false;
        } else {
            z = true;
        }
        int i = -1;
        while (true) {
            i++;
            if (i >= 16) {
                cVar = cVar.mo20114l();
                if (cVar != null) {
                    if (!z3 || !cVar.mo20113k()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    i = 0;
                } else {
                    return;
                }
            }
            JsonToken q = cVar.mo20119q(i);
            if (q != null) {
                if (z) {
                    Object h = cVar.mo20110h(i);
                    if (h != null) {
                        jsonGenerator.mo13894q0(h);
                    }
                    Object i2 = cVar.mo20111i(i);
                    if (i2 != null) {
                        jsonGenerator.mo13870d1(i2);
                    }
                }
                switch (C2319a.f11992a[q.ordinal()]) {
                    case 1:
                        jsonGenerator.mo13852Q0();
                        break;
                    case 2:
                        jsonGenerator.mo13855W();
                        break;
                    case 3:
                        jsonGenerator.mo13840G0();
                        break;
                    case 4:
                        jsonGenerator.mo13853S();
                        break;
                    case 5:
                        Object j = cVar.mo20112j(i);
                        if (!(j instanceof qw5)) {
                            jsonGenerator.mo13864b0((String) j);
                            break;
                        } else {
                            jsonGenerator.mo13858Y((qw5) j);
                            break;
                        }
                    case 6:
                        Object j2 = cVar.mo20112j(i);
                        if (!(j2 instanceof qw5)) {
                            jsonGenerator.mo13860Z0((String) j2);
                            break;
                        } else {
                            jsonGenerator.mo13859Y0((qw5) j2);
                            break;
                        }
                    case 7:
                        Object j3 = cVar.mo20112j(i);
                        if (!(j3 instanceof Integer)) {
                            if (!(j3 instanceof BigInteger)) {
                                if (!(j3 instanceof Long)) {
                                    if (!(j3 instanceof Short)) {
                                        jsonGenerator.mo13880h0(((Number) j3).intValue());
                                        break;
                                    } else {
                                        jsonGenerator.mo13891o0(((Short) j3).shortValue());
                                        break;
                                    }
                                } else {
                                    jsonGenerator.mo13882i0(((Long) j3).longValue());
                                    break;
                                }
                            } else {
                                jsonGenerator.mo13888l0((BigInteger) j3);
                                break;
                            }
                        } else {
                            jsonGenerator.mo13880h0(((Integer) j3).intValue());
                            break;
                        }
                    case 8:
                        Object j4 = cVar.mo20112j(i);
                        if (!(j4 instanceof Double)) {
                            if (!(j4 instanceof BigDecimal)) {
                                if (!(j4 instanceof Float)) {
                                    if (j4 != null) {
                                        if (!(j4 instanceof String)) {
                                            mo13861a(String.format("Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize", new Object[]{j4.getClass().getName()}));
                                            break;
                                        } else {
                                            jsonGenerator.mo13884j0((String) j4);
                                            break;
                                        }
                                    } else {
                                        jsonGenerator.mo13866c0();
                                        break;
                                    }
                                } else {
                                    jsonGenerator.mo13877g0(((Float) j4).floatValue());
                                    break;
                                }
                            } else {
                                jsonGenerator.mo13886k0((BigDecimal) j4);
                                break;
                            }
                        } else {
                            jsonGenerator.mo13872e0(((Double) j4).doubleValue());
                            break;
                        }
                    case 9:
                        jsonGenerator.mo13849P(true);
                        break;
                    case 10:
                        jsonGenerator.mo13849P(false);
                        break;
                    case 11:
                        jsonGenerator.mo13866c0();
                        break;
                    case 12:
                        Object j5 = cVar.mo20112j(i);
                        if (!(j5 instanceof l75)) {
                            if (!(j5 instanceof w63)) {
                                jsonGenerator.mo13851Q(j5);
                                break;
                            } else {
                                jsonGenerator.writeObject(j5);
                                break;
                            }
                        } else {
                            ((l75) j5).mo22680b(jsonGenerator);
                            break;
                        }
                    default:
                        throw new RuntimeException("Internal error: should never end up through this code path");
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: J */
    public int mo13842J(Base64Variant base64Variant, InputStream inputStream, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: L */
    public void mo13844L(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        writeObject(bArr2);
    }

    /* renamed from: O0 */
    public void mo13848O0(Object obj) throws IOException {
        this.f11986U.mo24470x();
        mo20083l1(JsonToken.START_ARRAY);
        this.f11986U = this.f11986U.mo24461n(obj);
    }

    /* renamed from: P */
    public void mo13849P(boolean z) throws IOException {
        JsonToken jsonToken;
        if (z) {
            jsonToken = JsonToken.VALUE_TRUE;
        } else {
            jsonToken = JsonToken.VALUE_FALSE;
        }
        mo20084q1(jsonToken);
    }

    /* renamed from: P0 */
    public void mo13850P0(Object obj, int i) throws IOException {
        this.f11986U.mo24470x();
        mo20083l1(JsonToken.START_ARRAY);
        this.f11986U = this.f11986U.mo24461n(obj);
    }

    /* renamed from: Q */
    public void mo13851Q(Object obj) throws IOException {
        mo20085r1(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    /* renamed from: Q0 */
    public final void mo13852Q0() throws IOException {
        this.f11986U.mo24470x();
        mo20083l1(JsonToken.START_OBJECT);
        this.f11986U = this.f11986U.mo24462o();
    }

    /* renamed from: S */
    public final void mo13853S() throws IOException {
        mo20080h1(JsonToken.END_ARRAY);
        p73 s = this.f11986U.mo11443e();
        if (s != null) {
            this.f11986U = s;
        }
    }

    /* renamed from: S0 */
    public void mo13854S0(Object obj) throws IOException {
        this.f11986U.mo24470x();
        mo20083l1(JsonToken.START_OBJECT);
        this.f11986U = this.f11986U.mo24463p(obj);
    }

    /* renamed from: W */
    public final void mo13855W() throws IOException {
        mo20080h1(JsonToken.END_OBJECT);
        p73 s = this.f11986U.mo11443e();
        if (s != null) {
            this.f11986U = s;
        }
    }

    /* renamed from: W0 */
    public void mo13856W0(Object obj, int i) throws IOException {
        this.f11986U.mo24470x();
        mo20083l1(JsonToken.START_OBJECT);
        this.f11986U = this.f11986U.mo24463p(obj);
    }

    /* renamed from: Y */
    public void mo13858Y(qw5 qw5) throws IOException {
        this.f11986U.mo24469w(qw5.getValue());
        mo20081j1(qw5);
    }

    /* renamed from: Y0 */
    public void mo13859Y0(qw5 qw5) throws IOException {
        if (qw5 == null) {
            mo13866c0();
        } else {
            mo20085r1(JsonToken.VALUE_STRING, qw5);
        }
    }

    /* renamed from: Z0 */
    public void mo13860Z0(String str) throws IOException {
        if (str == null) {
            mo13866c0();
        } else {
            mo20085r1(JsonToken.VALUE_STRING, str);
        }
    }

    /* renamed from: a1 */
    public void mo13862a1(char[] cArr, int i, int i2) throws IOException {
        mo13860Z0(new String(cArr, i, i2));
    }

    /* renamed from: b0 */
    public final void mo13864b0(String str) throws IOException {
        this.f11986U.mo24469w(str);
        mo20081j1(str);
    }

    /* renamed from: c0 */
    public void mo13866c0() throws IOException {
        mo20084q1(JsonToken.VALUE_NULL);
    }

    public void close() throws IOException {
        this.f11990x = true;
    }

    /* renamed from: d1 */
    public void mo13870d1(Object obj) {
        this.f11983M = obj;
        this.f11985Q = true;
    }

    /* renamed from: e0 */
    public void mo13872e0(double d) throws IOException {
        mo20085r1(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    /* renamed from: f */
    public boolean mo13873f() {
        return true;
    }

    public void flush() throws IOException {
    }

    /* renamed from: g */
    public boolean mo13876g() {
        return this.f11977A;
    }

    /* renamed from: g0 */
    public void mo13877g0(float f) throws IOException {
        mo20085r1(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    /* renamed from: h */
    public boolean mo13879h() {
        return this.f11991y;
    }

    /* renamed from: h0 */
    public void mo13880h0(int i) throws IOException {
        mo20085r1(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    /* renamed from: h1 */
    public final void mo20080h1(JsonToken jsonToken) {
        C2321c c = this.f11981I.mo20105c(this.f11982L, jsonToken);
        if (c == null) {
            this.f11982L++;
            return;
        }
        this.f11981I = c;
        this.f11982L = 1;
    }

    /* renamed from: i */
    public JsonGenerator mo13881i(JsonGenerator.Feature feature) {
        this.f11989s = (~feature.getMask()) & this.f11989s;
        return this;
    }

    /* renamed from: i0 */
    public void mo13882i0(long j) throws IOException {
        mo20085r1(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    /* renamed from: j */
    public int mo13883j() {
        return this.f11989s;
    }

    /* renamed from: j0 */
    public void mo13884j0(String str) throws IOException {
        mo20085r1(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    /* renamed from: j1 */
    public final void mo20081j1(Object obj) {
        C2321c cVar;
        if (this.f11985Q) {
            cVar = this.f11981I.mo20108f(this.f11982L, JsonToken.FIELD_NAME, obj, this.f11984P, this.f11983M);
        } else {
            cVar = this.f11981I.mo20106d(this.f11982L, JsonToken.FIELD_NAME, obj);
        }
        if (cVar == null) {
            this.f11982L++;
            return;
        }
        this.f11981I = cVar;
        this.f11982L = 1;
    }

    /* renamed from: k0 */
    public void mo13886k0(BigDecimal bigDecimal) throws IOException {
        if (bigDecimal == null) {
            mo13866c0();
        } else {
            mo20085r1(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    /* renamed from: k1 */
    public final void mo20082k1(StringBuilder sb) {
        Object h = this.f11981I.mo20110h(this.f11982L - 1);
        if (h != null) {
            sb.append("[objectId=");
            sb.append(String.valueOf(h));
            sb.append(']');
        }
        Object i = this.f11981I.mo20111i(this.f11982L - 1);
        if (i != null) {
            sb.append("[typeId=");
            sb.append(String.valueOf(i));
            sb.append(']');
        }
    }

    /* renamed from: l0 */
    public void mo13888l0(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            mo13866c0();
        } else {
            mo20085r1(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    /* renamed from: l1 */
    public final void mo20083l1(JsonToken jsonToken) {
        C2321c cVar;
        if (this.f11985Q) {
            cVar = this.f11981I.mo20107e(this.f11982L, jsonToken, this.f11984P, this.f11983M);
        } else {
            cVar = this.f11981I.mo20105c(this.f11982L, jsonToken);
        }
        if (cVar == null) {
            this.f11982L++;
            return;
        }
        this.f11981I = cVar;
        this.f11982L = 1;
    }

    /* renamed from: m */
    public boolean mo13889m(JsonGenerator.Feature feature) {
        if ((feature.getMask() & this.f11989s) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o0 */
    public void mo13891o0(short s) throws IOException {
        mo20085r1(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s));
    }

    /* renamed from: p */
    public JsonGenerator mo13892p(int i, int i2) {
        this.f11989s = (i & i2) | (mo13883j() & (~i2));
        return this;
    }

    /* renamed from: q0 */
    public void mo13894q0(Object obj) {
        this.f11984P = obj;
        this.f11985Q = true;
    }

    /* renamed from: q1 */
    public final void mo20084q1(JsonToken jsonToken) {
        C2321c cVar;
        this.f11986U.mo24470x();
        if (this.f11985Q) {
            cVar = this.f11981I.mo20107e(this.f11982L, jsonToken, this.f11984P, this.f11983M);
        } else {
            cVar = this.f11981I.mo20105c(this.f11982L, jsonToken);
        }
        if (cVar == null) {
            this.f11982L++;
            return;
        }
        this.f11981I = cVar;
        this.f11982L = 1;
    }

    /* renamed from: r1 */
    public final void mo20085r1(JsonToken jsonToken, Object obj) {
        C2321c cVar;
        this.f11986U.mo24470x();
        if (this.f11985Q) {
            cVar = this.f11981I.mo20108f(this.f11982L, jsonToken, obj, this.f11984P, this.f11983M);
        } else {
            cVar = this.f11981I.mo20106d(this.f11982L, jsonToken, obj);
        }
        if (cVar == null) {
            this.f11982L++;
            return;
        }
        this.f11981I = cVar;
        this.f11982L = 1;
    }

    /* renamed from: s1 */
    public final void mo20086s1(JsonParser jsonParser) throws IOException {
        Object e0 = jsonParser.mo13963e0();
        this.f11983M = e0;
        if (e0 != null) {
            this.f11985Q = true;
        }
        Object O = jsonParser.mo13939O();
        this.f11984P = O;
        if (O != null) {
            this.f11985Q = true;
        }
    }

    /* renamed from: t1 */
    public void mo20087t1(JsonParser jsonParser) throws IOException {
        int i = 1;
        while (true) {
            JsonToken N0 = jsonParser.mo13938N0();
            if (N0 != null) {
                int i2 = C2319a.f11992a[N0.ordinal()];
                if (i2 == 1) {
                    if (this.f11978B) {
                        mo20086s1(jsonParser);
                    }
                    mo13852Q0();
                } else if (i2 == 2) {
                    mo13855W();
                    i--;
                    if (i == 0) {
                        return;
                    }
                } else if (i2 == 3) {
                    if (this.f11978B) {
                        mo20086s1(jsonParser);
                    }
                    mo13840G0();
                } else if (i2 == 4) {
                    mo13853S();
                    i--;
                    if (i == 0) {
                        return;
                    }
                } else if (i2 != 5) {
                    mo20089u1(jsonParser, N0);
                } else {
                    if (this.f11978B) {
                        mo20086s1(jsonParser);
                    }
                    mo13864b0(jsonParser.mo13964f());
                }
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("[TokenBuffer: ");
        JsonParser x1 = mo20092x1();
        int i = 0;
        if (this.f11991y || this.f11977A) {
            z = true;
        } else {
            z = false;
        }
        while (true) {
            try {
                JsonToken N0 = x1.mo13938N0();
                if (N0 == null) {
                    break;
                }
                if (z) {
                    mo20082k1(sb);
                }
                if (i < 100) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(N0.toString());
                    if (N0 == JsonToken.FIELD_NAME) {
                        sb.append('(');
                        sb.append(x1.mo13964f());
                        sb.append(')');
                    }
                }
                i++;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        if (i >= 100) {
            sb.append(" ... (truncated ");
            sb.append(i - 100);
            sb.append(" entries)");
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: u1 */
    public final void mo20089u1(JsonParser jsonParser, JsonToken jsonToken) throws IOException {
        if (this.f11978B) {
            mo20086s1(jsonParser);
        }
        switch (C2319a.f11992a[jsonToken.ordinal()]) {
            case 6:
                if (jsonParser.mo13982q0()) {
                    mo13862a1(jsonParser.mo13949X(), jsonParser.mo13956b0(), jsonParser.mo13950Y());
                    return;
                } else {
                    mo13860Z0(jsonParser.mo13947W());
                    return;
                }
            case 7:
                int i = C2319a.f11993b[jsonParser.mo13935K().ordinal()];
                if (i == 1) {
                    mo13880h0(jsonParser.mo13933I());
                    return;
                } else if (i != 2) {
                    mo13882i0(jsonParser.mo13934J());
                    return;
                } else {
                    mo13888l0(jsonParser.mo13971j());
                    return;
                }
            case 8:
                if (this.f11979C) {
                    mo13886k0(jsonParser.mo13988y());
                    return;
                }
                mo20085r1(JsonToken.VALUE_NUMBER_FLOAT, jsonParser.mo13937N());
                return;
            case 9:
                mo13849P(true);
                return;
            case 10:
                mo13849P(false);
                return;
            case 11:
                mo13866c0();
                return;
            case 12:
                writeObject(jsonParser.mo13924A());
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: " + jsonToken);
        }
    }

    @Deprecated
    /* renamed from: v */
    public JsonGenerator mo13897v(int i) {
        this.f11989s = i;
        return this;
    }

    /* renamed from: v1 */
    public void mo20090v1() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    /* renamed from: w1 */
    public fr6 mo20091w1(fr6 fr6) throws IOException {
        boolean z;
        if (!this.f11991y) {
            this.f11991y = fr6.mo13879h();
        }
        if (!this.f11977A) {
            this.f11977A = fr6.mo13876g();
        }
        if (this.f11991y || this.f11977A) {
            z = true;
        } else {
            z = false;
        }
        this.f11978B = z;
        JsonParser x1 = fr6.mo20092x1();
        while (x1.mo13938N0() != null) {
            mo20074B1(x1);
        }
        return this;
    }

    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            mo13866c0();
        } else if (obj.getClass() == byte[].class || (obj instanceof l75)) {
            mo20085r1(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            xe4 xe4 = this.f11987k;
            if (xe4 == null) {
                mo20085r1(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            } else {
                xe4.writeValue(this, obj);
            }
        }
    }

    /* renamed from: x1 */
    public JsonParser mo20092x1() {
        return mo20093y1(this.f11987k);
    }

    /* renamed from: y0 */
    public void mo13902y0(char c) throws IOException {
        mo20090v1();
    }

    /* renamed from: y1 */
    public JsonParser mo20093y1(xe4 xe4) {
        return new C2320b(this.f11980H, xe4, this.f11991y, this.f11977A, this.f11988r);
    }

    /* renamed from: z1 */
    public JsonParser mo20094z1(JsonParser jsonParser) {
        C2320b bVar = new C2320b(this.f11980H, jsonParser.mo13980p(), this.f11991y, this.f11977A, this.f11988r);
        bVar.mo20101Q1(jsonParser.mo13958c0());
        return bVar;
    }

    public fr6(JsonParser jsonParser, DeserializationContext deserializationContext) {
        boolean z = false;
        this.f11987k = jsonParser.mo13980p();
        this.f11988r = jsonParser.mo13941P();
        this.f11989s = f11976X;
        this.f11986U = p73.m24704q((el1) null);
        C2321c cVar = new C2321c();
        this.f11981I = cVar;
        this.f11980H = cVar;
        this.f11982L = 0;
        this.f11991y = jsonParser.mo13961d();
        boolean c = jsonParser.mo13957c();
        this.f11977A = c;
        this.f11978B = this.f11991y || c;
        this.f11979C = deserializationContext != null ? deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) : z;
    }
}

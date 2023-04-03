package p000;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.node.BinaryNode;
import com.fasterxml.jackson.databind.node.NumericNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TextNode;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import p000.b84;

/* renamed from: tx6 */
/* compiled from: TreeTraversingParser */
public class tx6 extends mm4 {

    /* renamed from: M */
    public xe4 f18304M;

    /* renamed from: P */
    public b84 f18305P;

    /* renamed from: Q */
    public boolean f18306Q;

    /* renamed from: tx6$a */
    /* compiled from: TreeTraversingParser */
    public static /* synthetic */ class C3388a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18307a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.core.JsonToken[] r0 = com.fasterxml.jackson.core.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18307a = r0
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_OBJECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18307a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18307a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18307a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18307a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18307a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f18307a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f18307a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f18307a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.tx6.C3388a.<clinit>():void");
        }
    }

    public tx6(g53 g53) {
        this(g53, (xe4) null);
    }

    /* renamed from: A */
    public Object mo13924A() {
        g53 K1;
        if (this.f18306Q || (K1 = mo26589K1()) == null) {
            return null;
        }
        if (K1.isPojo()) {
            return ((POJONode) K1).getPojo();
        }
        if (K1.isBinary()) {
            return ((BinaryNode) K1).binaryValue();
        }
        return null;
    }

    /* renamed from: C */
    public float mo13927C() throws IOException {
        return (float) mo26590L1().doubleValue();
    }

    /* renamed from: D0 */
    public boolean mo13929D0() {
        if (this.f18306Q) {
            return false;
        }
        g53 K1 = mo26589K1();
        if (K1 instanceof NumericNode) {
            return ((NumericNode) K1).isNaN();
        }
        return false;
    }

    /* renamed from: I */
    public int mo13933I() throws IOException {
        NumericNode numericNode = (NumericNode) mo26590L1();
        if (!numericNode.canConvertToInt()) {
            mo23213D1();
        }
        return numericNode.intValue();
    }

    /* renamed from: J */
    public long mo13934J() throws IOException {
        NumericNode numericNode = (NumericNode) mo26590L1();
        if (!numericNode.canConvertToLong()) {
            mo23216G1();
        }
        return numericNode.longValue();
    }

    /* renamed from: K */
    public JsonParser.NumberType mo13935K() throws IOException {
        g53 L1 = mo26590L1();
        if (L1 == null) {
            return null;
        }
        return L1.numberType();
    }

    /* renamed from: K1 */
    public g53 mo26589K1() {
        b84 b84;
        if (this.f18306Q || (b84 = this.f18305P) == null) {
            return null;
        }
        return b84.mo11438k();
    }

    /* renamed from: L */
    public Number mo13936L() throws IOException {
        return mo26590L1().numberValue();
    }

    /* renamed from: L1 */
    public g53 mo26590L1() throws JacksonException {
        JsonToken jsonToken;
        g53 K1 = mo26589K1();
        if (K1 != null && K1.isNumber()) {
            return K1;
        }
        if (K1 == null) {
            jsonToken = null;
        } else {
            jsonToken = K1.asToken();
        }
        throw mo13953a("Current token (" + jsonToken + ") not numeric, cannot use numeric value accessors");
    }

    /* renamed from: N0 */
    public JsonToken mo13938N0() throws IOException {
        JsonToken m = this.f18305P.mo11440m();
        this.f15012g = m;
        if (m == null) {
            this.f18306Q = true;
            return null;
        }
        int i = C3388a.f18307a[m.ordinal()];
        if (i == 1) {
            this.f18305P = this.f18305P.mo11442o();
        } else if (i == 2) {
            this.f18305P = this.f18305P.mo11441n();
        } else if (i == 3 || i == 4) {
            this.f18305P = this.f18305P.mo11439l();
        }
        return this.f15012g;
    }

    /* renamed from: P */
    public z63 mo13941P() {
        return this.f18305P;
    }

    /* renamed from: Q */
    public yz2<StreamReadCapability> mo13943Q() {
        return JsonParser.f9821e;
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
        if (jsonToken == null) {
            return null;
        }
        switch (C3388a.f18307a[jsonToken.ordinal()]) {
            case 5:
                return this.f18305P.mo11435b();
            case 6:
                return mo26589K1().textValue();
            case 7:
            case 8:
                return String.valueOf(mo26589K1().numberValue());
            case 9:
                g53 K1 = mo26589K1();
                if (K1 != null && K1.isBinary()) {
                    return K1.asText();
                }
        }
        return this.f15012g.asString();
    }

    /* renamed from: X */
    public char[] mo13949X() throws IOException {
        return mo13947W().toCharArray();
    }

    /* renamed from: Y */
    public int mo13950Y() throws IOException {
        return mo13947W().length();
    }

    /* renamed from: b0 */
    public int mo13956b0() throws IOException {
        return 0;
    }

    /* renamed from: c0 */
    public JsonLocation mo13958c0() {
        return JsonLocation.f9820NA;
    }

    /* renamed from: c1 */
    public JsonParser mo13959c1() throws IOException {
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.START_OBJECT) {
            this.f18305P = this.f18305P.mo11439l();
            this.f15012g = JsonToken.END_OBJECT;
        } else if (jsonToken == JsonToken.START_ARRAY) {
            this.f18305P = this.f18305P.mo11439l();
            this.f15012g = JsonToken.END_ARRAY;
        }
        return this;
    }

    public void close() throws IOException {
        if (!this.f18306Q) {
            this.f18306Q = true;
            this.f18305P = null;
            this.f15012g = null;
        }
    }

    /* renamed from: h1 */
    public void mo20102h1() {
        mo23234z1();
    }

    /* renamed from: j */
    public BigInteger mo13971j() throws IOException {
        return mo26590L1().bigIntegerValue();
    }

    /* renamed from: l */
    public byte[] mo13975l(Base64Variant base64Variant) throws IOException {
        g53 K1 = mo26589K1();
        if (K1 == null) {
            return null;
        }
        if (K1 instanceof TextNode) {
            return ((TextNode) K1).getBinaryValue(base64Variant);
        }
        return K1.binaryValue();
    }

    /* renamed from: p */
    public xe4 mo13980p() {
        return this.f18304M;
    }

    /* renamed from: q */
    public JsonLocation mo13981q() {
        return JsonLocation.f9820NA;
    }

    /* renamed from: q0 */
    public boolean mo13982q0() {
        return false;
    }

    /* renamed from: s */
    public String mo13983s() {
        b84 b84 = this.f18305P;
        JsonToken jsonToken = this.f15012g;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            b84 = b84.mo11439l();
        }
        if (b84 == null) {
            return null;
        }
        return b84.mo11435b();
    }

    /* renamed from: y */
    public BigDecimal mo13988y() throws IOException {
        return mo26590L1().decimalValue();
    }

    /* renamed from: z */
    public double mo13990z() throws IOException {
        return mo26590L1().doubleValue();
    }

    public tx6(g53 g53, xe4 xe4) {
        super(0);
        this.f18304M = xe4;
        this.f18305P = new b84.C1613c(g53, (b84) null);
    }
}

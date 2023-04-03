package p000;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import java.io.IOException;
import java.math.BigDecimal;

/* renamed from: df2 */
/* compiled from: GeneratorBase */
public abstract class df2 extends JsonGenerator {

    /* renamed from: A */
    public static final int f10685A = ((JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask());

    /* renamed from: k */
    public xe4 f10686k;

    /* renamed from: r */
    public int f10687r;

    /* renamed from: s */
    public boolean f10688s;

    /* renamed from: x */
    public p73 f10689x;

    /* renamed from: y */
    public boolean f10690y;

    public df2(int i, xe4 xe4) {
        el1 el1;
        this.f10687r = i;
        this.f10686k = xe4;
        if (JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i)) {
            el1 = el1.m16172e(this);
        } else {
            el1 = null;
        }
        this.f10689x = p73.m24704q(el1);
        this.f10688s = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
    }

    /* renamed from: D0 */
    public void mo13837D0(qw5 qw5) throws IOException {
        mo18747l1("write raw value");
        mo13833A0(qw5);
    }

    /* renamed from: E0 */
    public void mo13838E0(String str) throws IOException {
        mo18747l1("write raw value");
        mo13834B0(str);
    }

    public void close() throws IOException {
        this.f10690y = true;
    }

    /* renamed from: h1 */
    public String mo18744h1(BigDecimal bigDecimal) throws IOException {
        if (!JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this.f10687r)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale < -9999 || scale > 9999) {
            mo13861a(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(scale), Integer.valueOf(NumberSerializer.MAX_BIG_DECIMAL_SCALE), Integer.valueOf(NumberSerializer.MAX_BIG_DECIMAL_SCALE)}));
        }
        return bigDecimal.toPlainString();
    }

    /* renamed from: i */
    public JsonGenerator mo13881i(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this.f10687r &= ~mask;
        if ((mask & f10685A) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this.f10688s = false;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                mo13899x(0);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                this.f10689x = this.f10689x.mo24468v((el1) null);
            }
        }
        return this;
    }

    /* renamed from: j */
    public int mo13883j() {
        return this.f10687r;
    }

    /* renamed from: j1 */
    public void mo18745j1(int i, int i2) {
        if ((f10685A & i2) != 0) {
            this.f10688s = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
            JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
            if (feature.enabledIn(i2)) {
                if (feature.enabledIn(i)) {
                    mo13899x(127);
                } else {
                    mo13899x(0);
                }
            }
            JsonGenerator.Feature feature2 = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
            if (!feature2.enabledIn(i2)) {
                return;
            }
            if (!feature2.enabledIn(i)) {
                this.f10689x = this.f10689x.mo24468v((el1) null);
            } else if (this.f10689x.mo24464r() == null) {
                this.f10689x = this.f10689x.mo24468v(el1.m16172e(this));
            }
        }
    }

    /* renamed from: k */
    public z63 mo13885k() {
        return this.f10689x;
    }

    /* renamed from: k1 */
    public final int mo18746k1(int i, int i2) throws IOException {
        if (i2 < 56320 || i2 > 57343) {
            mo13861a(String.format("Incomplete surrogate pair: first char 0x%04X, second 0x%04X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        return ((i - 55296) << 10) + 65536 + (i2 - 56320);
    }

    /* renamed from: l1 */
    public abstract void mo18747l1(String str) throws IOException;

    /* renamed from: m */
    public final boolean mo13889m(JsonGenerator.Feature feature) {
        if ((feature.getMask() & this.f10687r) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public JsonGenerator mo13892p(int i, int i2) {
        int i3 = this.f10687r;
        int i4 = (i & i2) | ((~i2) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this.f10687r = i4;
            mo18745j1(i4, i5);
        }
        return this;
    }

    /* renamed from: s */
    public void mo13895s(Object obj) {
        p73 p73 = this.f10689x;
        if (p73 != null) {
            p73.mo11437i(obj);
        }
    }

    @Deprecated
    /* renamed from: v */
    public JsonGenerator mo13897v(int i) {
        int i2 = this.f10687r ^ i;
        this.f10687r = i;
        if (i2 != 0) {
            mo18745j1(i, i2);
        }
        return this;
    }

    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            mo13866c0();
            return;
        }
        xe4 xe4 = this.f10686k;
        if (xe4 != null) {
            xe4.writeValue(this, obj);
        } else {
            mo13869d(obj);
        }
    }
}

package p000;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.StreamWriteCapability;
import com.fasterxml.jackson.core.p009io.CharacterEscapes;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.IOException;

/* renamed from: u43 */
/* compiled from: JsonGeneratorImpl */
public abstract class u43 extends df2 {

    /* renamed from: P */
    public static final int[] f18377P = ud0.m28145e();

    /* renamed from: Q */
    public static final yz2<StreamWriteCapability> f18378Q = JsonGenerator.f9815e;

    /* renamed from: B */
    public final po2 f18379B;

    /* renamed from: C */
    public int[] f18380C = f18377P;

    /* renamed from: H */
    public int f18381H;

    /* renamed from: I */
    public CharacterEscapes f18382I;

    /* renamed from: L */
    public qw5 f18383L = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;

    /* renamed from: M */
    public boolean f18384M;

    public u43(po2 po2, int i, xe4 xe4) {
        super(i, xe4);
        this.f18379B = po2;
        if (JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i)) {
            this.f18381H = 127;
        }
        this.f18384M = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i);
    }

    /* renamed from: i */
    public JsonGenerator mo13881i(JsonGenerator.Feature feature) {
        super.mo13881i(feature);
        if (feature == JsonGenerator.Feature.QUOTE_FIELD_NAMES) {
            this.f18384M = true;
        }
        return this;
    }

    /* renamed from: j1 */
    public void mo18745j1(int i, int i2) {
        super.mo18745j1(i, i2);
        this.f18384M = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i);
    }

    /* renamed from: q */
    public JsonGenerator mo13893q(CharacterEscapes characterEscapes) {
        this.f18382I = characterEscapes;
        if (characterEscapes == null) {
            this.f18380C = f18377P;
        } else {
            this.f18380C = characterEscapes.getEscapeCodesForAscii();
        }
        return this;
    }

    /* renamed from: q1 */
    public void mo26651q1(String str) throws IOException {
        mo13861a(String.format("Can not %s, expecting field name (context: %s)", new Object[]{str, this.f10689x.mo28330j()}));
    }

    /* renamed from: r1 */
    public void mo26652r1(String str, int i) throws IOException {
        if (i != 0) {
            if (i == 1) {
                this.f9817a.writeArrayValueSeparator(this);
            } else if (i == 2) {
                this.f9817a.writeObjectFieldValueSeparator(this);
            } else if (i == 3) {
                this.f9817a.writeRootValueSeparator(this);
            } else if (i != 5) {
                mo13863b();
            } else {
                mo26651q1(str);
            }
        } else if (this.f10689x.mo28327f()) {
            this.f9817a.beforeArrayValues(this);
        } else if (this.f10689x.mo28328g()) {
            this.f9817a.beforeObjectEntries(this);
        }
    }

    /* renamed from: x */
    public JsonGenerator mo13899x(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f18381H = i;
        return this;
    }

    /* renamed from: z */
    public JsonGenerator mo13903z(qw5 qw5) {
        this.f18383L = qw5;
        return this;
    }
}

package p000;

import java.io.IOException;

/* renamed from: i73 */
/* compiled from: JsonUtf8Writer */
public final class i73 extends q73 {

    /* renamed from: H */
    public static final String[] f29841H = new String[128];

    /* renamed from: A */
    public final v40 f29842A;

    /* renamed from: B */
    public String f29843B = ":";

    /* renamed from: C */
    public String f29844C;

    /* renamed from: i73$a */
    /* compiled from: JsonUtf8Writer */
    public class C5951a implements s36 {
        public C5951a() {
        }

        public void close() {
            if (i73.this.mo46991m() == 9) {
                i73 i73 = i73.this;
                int i = i73.f32957a - 1;
                i73.f32957a = i;
                int[] iArr = i73.f32960g;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
                return;
            }
            throw new AssertionError();
        }

        public void flush() throws IOException {
            i73.this.f29842A.flush();
        }

        public qq6 timeout() {
            return qq6.NONE;
        }

        public void write(m40 m40, long j) throws IOException {
            i73.this.f29842A.write(m40, j);
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f29841H[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f29841H;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public i73(v40 v40) {
        if (v40 != null) {
            this.f29842A = v40;
            mo46993p(6);
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* renamed from: P */
    public static void m45504P(v40 v40, String str) throws IOException {
        String str2;
        String[] strArr = f29841H;
        v40.writeByte(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                v40.mo56052d0(str, i, i2);
            }
            v40.mo56044Z(str2);
            i = i2 + 1;
        }
        if (i < length) {
            v40.mo56052d0(str, i, length);
        }
        v40.writeByte(34);
    }

    /* renamed from: A */
    public q73 mo39389A(String str) throws IOException {
        if (str == null) {
            return mo39400k();
        }
        if (this.f32964x) {
            this.f32964x = false;
            return mo39399j(str);
        }
        mo43511Q();
        mo43507K();
        m45504P(this.f29842A, str);
        int[] iArr = this.f32960g;
        int i = this.f32957a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: C */
    public q73 mo39390C(boolean z) throws IOException {
        String str;
        if (!this.f32964x) {
            mo43511Q();
            mo43507K();
            v40 v40 = this.f29842A;
            if (z) {
                str = "true";
            } else {
                str = "false";
            }
            v40.mo56044Z(str);
            int[] iArr = this.f32960g;
            int i = this.f32957a - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: G */
    public v40 mo39391G() throws IOException {
        if (!this.f32964x) {
            mo43511Q();
            mo43507K();
            mo46993p(9);
            return sg4.m71928c(new C5951a());
        }
        throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: J */
    public final void mo43506J() throws IOException {
        int m = mo46991m();
        if (m == 5) {
            this.f29842A.writeByte(44);
        } else if (m != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        mo43509N();
        mo46994q(4);
    }

    /* renamed from: K */
    public final void mo43507K() throws IOException {
        int m = mo46991m();
        int i = 7;
        if (m != 1) {
            if (m != 2) {
                if (m == 4) {
                    i = 5;
                    this.f29842A.mo56044Z(this.f29843B);
                } else if (m == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                } else if (m != 6) {
                    if (m != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    } else if (!this.f32962r) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                mo46994q(i);
            }
            this.f29842A.writeByte(44);
        }
        mo43509N();
        i = 2;
        mo46994q(i);
    }

    /* renamed from: L */
    public final q73 mo43508L(int i, int i2, char c) throws IOException {
        int m = mo46991m();
        if (m != i2 && m != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f29844C == null) {
            int i3 = this.f32957a;
            int i4 = this.f32965y;
            if (i3 == (~i4)) {
                this.f32965y = ~i4;
                return this;
            }
            int i5 = i3 - 1;
            this.f32957a = i5;
            this.f32959e[i5] = null;
            int[] iArr = this.f32960g;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
            if (m == i2) {
                mo43509N();
            }
            this.f29842A.writeByte(c);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f29844C);
        }
    }

    /* renamed from: N */
    public final void mo43509N() throws IOException {
        if (this.f32961k != null) {
            this.f29842A.writeByte(10);
            int i = this.f32957a;
            for (int i2 = 1; i2 < i; i2++) {
                this.f29842A.mo56044Z(this.f32961k);
            }
        }
    }

    /* renamed from: O */
    public final q73 mo43510O(int i, int i2, char c) throws IOException {
        int i3 = this.f32957a;
        int i4 = this.f32965y;
        if (i3 == i4) {
            int[] iArr = this.f32958d;
            if (iArr[i3 - 1] == i || iArr[i3 - 1] == i2) {
                this.f32965y = ~i4;
                return this;
            }
        }
        mo43507K();
        mo46986d();
        mo46993p(i);
        this.f32960g[this.f32957a - 1] = 0;
        this.f29842A.writeByte(c);
        return this;
    }

    /* renamed from: Q */
    public final void mo43511Q() throws IOException {
        if (this.f29844C != null) {
            mo43506J();
            m45504P(this.f29842A, this.f29844C);
            this.f29844C = null;
        }
    }

    /* renamed from: a */
    public q73 mo39393a() throws IOException {
        if (!this.f32964x) {
            mo43511Q();
            return mo43510O(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: c */
    public q73 mo39394c() throws IOException {
        if (!this.f32964x) {
            mo43511Q();
            return mo43510O(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    public void close() throws IOException {
        this.f29842A.close();
        int i = this.f32957a;
        if (i > 1 || (i == 1 && this.f32958d[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f32957a = 0;
    }

    /* renamed from: e */
    public q73 mo39396e() throws IOException {
        return mo43508L(1, 2, ']');
    }

    public void flush() throws IOException {
        if (this.f32957a != 0) {
            this.f29842A.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public q73 mo39398g() throws IOException {
        this.f32964x = false;
        return mo43508L(3, 5, '}');
    }

    /* renamed from: j */
    public q73 mo39399j(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f32957a != 0) {
            int m = mo46991m();
            if ((m == 3 || m == 5) && this.f29844C == null && !this.f32964x) {
                this.f29844C = str;
                this.f32959e[this.f32957a - 1] = str;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: k */
    public q73 mo39400k() throws IOException {
        if (!this.f32964x) {
            if (this.f29844C != null) {
                if (this.f32963s) {
                    mo43511Q();
                } else {
                    this.f29844C = null;
                    return this;
                }
            }
            mo43507K();
            this.f29842A.mo56044Z("null");
            int[] iArr = this.f32960g;
            int i = this.f32957a - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: x */
    public q73 mo39401x(double d) throws IOException {
        if (!this.f32962r && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f32964x) {
            this.f32964x = false;
            return mo39399j(Double.toString(d));
        } else {
            mo43511Q();
            mo43507K();
            this.f29842A.mo56044Z(Double.toString(d));
            int[] iArr = this.f32960g;
            int i = this.f32957a - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: y */
    public q73 mo39402y(long j) throws IOException {
        if (this.f32964x) {
            this.f32964x = false;
            return mo39399j(Long.toString(j));
        }
        mo43511Q();
        mo43507K();
        this.f29842A.mo56044Z(Long.toString(j));
        int[] iArr = this.f32960g;
        int i = this.f32957a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: z */
    public q73 mo39403z(Number number) throws IOException {
        if (number == null) {
            return mo39400k();
        }
        String obj = number.toString();
        if (!this.f32962r && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (this.f32964x) {
            this.f32964x = false;
            return mo39399j(obj);
        } else {
            mo43511Q();
            mo43507K();
            this.f29842A.mo56044Z(obj);
            int[] iArr = this.f32960g;
            int i = this.f32957a - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }
}

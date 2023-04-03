package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.squareup.moshi.f */
/* compiled from: JsonValueWriter */
public final class C5397f extends q73 {

    /* renamed from: A */
    public Object[] f26724A = new Object[32];

    /* renamed from: B */
    public String f26725B;

    /* renamed from: com.squareup.moshi.f$a */
    /* compiled from: JsonValueWriter */
    public class C5398a extends p82 {

        /* renamed from: a */
        public final /* synthetic */ m40 f26726a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5398a(s36 s36, m40 m40) {
            super(s36);
            this.f26726a = m40;
        }

        /* JADX INFO: finally extract failed */
        public void close() throws IOException {
            if (C5397f.this.mo46991m() == 9) {
                C5397f fVar = C5397f.this;
                Object[] objArr = fVar.f26724A;
                int i = fVar.f32957a;
                if (objArr[i] == null) {
                    fVar.f32957a = i - 1;
                    Object y = JsonReader.m41502p(this.f26726a).mo39294y();
                    C5397f fVar2 = C5397f.this;
                    boolean z = fVar2.f32963s;
                    fVar2.f32963s = true;
                    try {
                        C5397f unused = fVar2.mo39392J(y);
                        C5397f fVar3 = C5397f.this;
                        fVar3.f32963s = z;
                        int[] iArr = fVar3.f32960g;
                        int i2 = fVar3.f32957a - 1;
                        iArr[i2] = iArr[i2] + 1;
                        return;
                    } catch (Throwable th) {
                        C5397f.this.f32963s = z;
                        throw th;
                    }
                }
            }
            throw new AssertionError();
        }
    }

    public C5397f() {
        mo46993p(6);
    }

    /* renamed from: A */
    public q73 mo39389A(String str) throws IOException {
        if (this.f32964x) {
            this.f32964x = false;
            return mo39399j(str);
        }
        mo39392J(str);
        int[] iArr = this.f32960g;
        int i = this.f32957a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: C */
    public q73 mo39390C(boolean z) throws IOException {
        if (!this.f32964x) {
            mo39392J(Boolean.valueOf(z));
            int[] iArr = this.f32960g;
            int i = this.f32957a - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: G */
    public v40 mo39391G() {
        if (this.f32964x) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + getPath());
        } else if (mo46991m() != 9) {
            mo46993p(9);
            m40 m40 = new m40();
            return sg4.m71928c(new C5398a(m40, m40));
        } else {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
    }

    /* renamed from: J */
    public final C5397f mo39392J(Object obj) {
        String str;
        Object put;
        int m = mo46991m();
        int i = this.f32957a;
        if (i == 1) {
            if (m == 6) {
                this.f32958d[i - 1] = 7;
                this.f26724A[i - 1] = obj;
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (m != 3 || (str = this.f26725B) == null) {
            if (m == 1) {
                ((List) this.f26724A[i - 1]).add(obj);
            } else if (m == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            } else {
                throw new IllegalStateException("Nesting problem.");
            }
        } else if ((obj != null || this.f32963s) && (put = ((Map) this.f26724A[i - 1]).put(str, obj)) != null) {
            throw new IllegalArgumentException("Map key '" + this.f26725B + "' has multiple values at path " + getPath() + ": " + put + " and " + obj);
        } else {
            this.f26725B = null;
        }
        return this;
    }

    /* renamed from: a */
    public q73 mo39393a() throws IOException {
        if (!this.f32964x) {
            int i = this.f32957a;
            int i2 = this.f32965y;
            if (i == i2 && this.f32958d[i - 1] == 1) {
                this.f32965y = ~i2;
                return this;
            }
            mo46986d();
            ArrayList arrayList = new ArrayList();
            mo39392J(arrayList);
            Object[] objArr = this.f26724A;
            int i3 = this.f32957a;
            objArr[i3] = arrayList;
            this.f32960g[i3] = 0;
            mo46993p(1);
            return this;
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: c */
    public q73 mo39394c() throws IOException {
        if (!this.f32964x) {
            int i = this.f32957a;
            int i2 = this.f32965y;
            if (i == i2 && this.f32958d[i - 1] == 3) {
                this.f32965y = ~i2;
                return this;
            }
            mo46986d();
            LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
            mo39392J(linkedHashTreeMap);
            this.f26724A[this.f32957a] = linkedHashTreeMap;
            mo46993p(3);
            return this;
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    public void close() throws IOException {
        int i = this.f32957a;
        if (i > 1 || (i == 1 && this.f32958d[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f32957a = 0;
    }

    /* renamed from: e */
    public q73 mo39396e() throws IOException {
        if (mo46991m() == 1) {
            int i = this.f32957a;
            int i2 = this.f32965y;
            if (i == (~i2)) {
                this.f32965y = ~i2;
                return this;
            }
            int i3 = i - 1;
            this.f32957a = i3;
            this.f26724A[i3] = null;
            int[] iArr = this.f32960g;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    public void flush() throws IOException {
        if (this.f32957a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: g */
    public q73 mo39398g() throws IOException {
        if (mo46991m() != 3) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f26725B == null) {
            int i = this.f32957a;
            int i2 = this.f32965y;
            if (i == (~i2)) {
                this.f32965y = ~i2;
                return this;
            }
            this.f32964x = false;
            int i3 = i - 1;
            this.f32957a = i3;
            this.f26724A[i3] = null;
            this.f32959e[i3] = null;
            int[] iArr = this.f32960g;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f26725B);
        }
    }

    /* renamed from: j */
    public q73 mo39399j(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f32957a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else if (mo46991m() == 3 && this.f26725B == null && !this.f32964x) {
            this.f26725B = str;
            this.f32959e[this.f32957a - 1] = str;
            return this;
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
    }

    /* renamed from: k */
    public q73 mo39400k() throws IOException {
        if (!this.f32964x) {
            mo39392J((Object) null);
            int[] iArr = this.f32960g;
            int i = this.f32957a - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: x */
    public q73 mo39401x(double d) throws IOException {
        if (!this.f32962r && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f32964x) {
            this.f32964x = false;
            return mo39399j(Double.toString(d));
        } else {
            mo39392J(Double.valueOf(d));
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
        mo39392J(Long.valueOf(j));
        int[] iArr = this.f32960g;
        int i = this.f32957a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: z */
    public q73 mo39403z(Number number) throws IOException {
        BigDecimal bigDecimal;
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return mo39402y(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return mo39401x(number.doubleValue());
        }
        if (number == null) {
            return mo39400k();
        }
        if (number instanceof BigDecimal) {
            bigDecimal = (BigDecimal) number;
        } else {
            bigDecimal = new BigDecimal(number.toString());
        }
        if (this.f32964x) {
            this.f32964x = false;
            return mo39399j(bigDecimal.toString());
        }
        mo39392J(bigDecimal);
        int[] iArr = this.f32960g;
        int i = this.f32957a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}

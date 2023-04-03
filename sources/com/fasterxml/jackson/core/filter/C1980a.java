package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.filter.TokenFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.fasterxml.jackson.core.filter.a */
/* compiled from: FilteringParserDelegate */
public class C1980a extends l53 {

    /* renamed from: A */
    public hr6 f9846A;

    /* renamed from: B */
    public hr6 f9847B;

    /* renamed from: C */
    public TokenFilter f9848C;

    /* renamed from: H */
    public int f9849H;

    /* renamed from: k */
    public TokenFilter f9850k;

    /* renamed from: r */
    public boolean f9851r;

    /* renamed from: s */
    public TokenFilter.Inclusion f9852s;

    /* renamed from: x */
    public JsonToken f9853x;

    /* renamed from: y */
    public JsonToken f9854y;

    public C1980a(JsonParser jsonParser, TokenFilter tokenFilter, TokenFilter.Inclusion inclusion, boolean z) {
        super(jsonParser);
        this.f9850k = tokenFilter;
        this.f9848C = tokenFilter;
        this.f9846A = hr6.m19180o(tokenFilter);
        this.f9852s = inclusion;
        this.f9851r = z;
    }

    /* renamed from: A */
    public Object mo13924A() throws IOException {
        return this.f14419g.mo13924A();
    }

    /* renamed from: B0 */
    public boolean mo13926B0() {
        if (this.f9853x == JsonToken.START_ARRAY) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public float mo13927C() throws IOException {
        return this.f14419g.mo13927C();
    }

    /* renamed from: C0 */
    public boolean mo13928C0() {
        if (this.f9853x == JsonToken.START_OBJECT) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public int mo13933I() throws IOException {
        return this.f14419g.mo13933I();
    }

    /* renamed from: J */
    public long mo13934J() throws IOException {
        return this.f14419g.mo13934J();
    }

    /* renamed from: K */
    public JsonParser.NumberType mo13935K() throws IOException {
        return this.f14419g.mo13935K();
    }

    /* renamed from: L */
    public Number mo13936L() throws IOException {
        return this.f14419g.mo13936L();
    }

    /* renamed from: N0 */
    public JsonToken mo13938N0() throws IOException {
        JsonToken h1;
        JsonToken h12;
        JsonToken h13;
        TokenFilter l;
        JsonToken jsonToken;
        if (this.f9851r || (jsonToken = this.f9853x) == null || this.f9847B != null || !jsonToken.isScalarValue() || this.f9846A.mo21360s() || this.f9852s != TokenFilter.Inclusion.ONLY_INCLUDE_ALL || this.f9848C != TokenFilter.f9844a) {
            hr6 hr6 = this.f9847B;
            if (hr6 != null) {
                do {
                    JsonToken t = hr6.mo21361t();
                    if (t != null) {
                        this.f9853x = t;
                        return t;
                    }
                    hr6 hr62 = this.f9846A;
                    if (hr6 == hr62) {
                        this.f9847B = null;
                        if (hr6.mo28327f()) {
                            JsonToken v = this.f14419g.mo13985v();
                            this.f9853x = v;
                            return v;
                        }
                        JsonToken g = this.f14419g.mo13965g();
                        if (g != JsonToken.FIELD_NAME) {
                            this.f9853x = g;
                            return g;
                        }
                    } else {
                        hr6 = hr62.mo21357p(hr6);
                        this.f9847B = hr6;
                    }
                } while (hr6 != null);
                throw mo13953a("Unexpected problem: chain of filtered context broken");
            }
            JsonToken N0 = this.f14419g.mo13938N0();
            if (N0 == null) {
                this.f9853x = N0;
                return N0;
            }
            int id = N0.mo14000id();
            if (id != 1) {
                if (id != 2) {
                    if (id == 3) {
                        TokenFilter tokenFilter = this.f9848C;
                        TokenFilter tokenFilter2 = TokenFilter.f9844a;
                        if (tokenFilter == tokenFilter2) {
                            this.f9846A = this.f9846A.mo21355m(tokenFilter, true);
                            this.f9853x = N0;
                            return N0;
                        } else if (tokenFilter == null) {
                            this.f14419g.mo13959c1();
                        } else {
                            TokenFilter l2 = this.f9846A.mo21354l(tokenFilter);
                            if (l2 == null) {
                                this.f14419g.mo13959c1();
                            } else {
                                if (l2 != tokenFilter2) {
                                    l2 = l2.mo14034c();
                                }
                                this.f9848C = l2;
                                if (l2 == tokenFilter2) {
                                    this.f9846A = this.f9846A.mo21355m(l2, true);
                                    this.f9853x = N0;
                                    return N0;
                                } else if (l2 == null || this.f9852s != TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                    hr6 m = this.f9846A.mo21355m(l2, false);
                                    this.f9846A = m;
                                    if (this.f9852s == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (h12 = mo14044h1(m)) != null) {
                                        this.f9853x = h12;
                                        return h12;
                                    }
                                } else {
                                    this.f9846A = this.f9846A.mo21355m(l2, true);
                                    this.f9853x = N0;
                                    return N0;
                                }
                            }
                        }
                    } else if (id != 4) {
                        if (id != 5) {
                            TokenFilter tokenFilter3 = this.f9848C;
                            TokenFilter tokenFilter4 = TokenFilter.f9844a;
                            if (tokenFilter3 == tokenFilter4) {
                                this.f9853x = N0;
                                return N0;
                            } else if (tokenFilter3 != null && (((l = this.f9846A.mo21354l(tokenFilter3)) == tokenFilter4 || (l != null && l.mo14039h(this.f14419g))) && mo14045j1())) {
                                this.f9853x = N0;
                                return N0;
                            }
                        } else {
                            String s = this.f14419g.mo13983s();
                            TokenFilter v2 = this.f9846A.mo21364v(s);
                            TokenFilter tokenFilter5 = TokenFilter.f9844a;
                            if (v2 == tokenFilter5) {
                                this.f9848C = v2;
                                this.f9853x = N0;
                                return N0;
                            } else if (v2 == null) {
                                this.f14419g.mo13938N0();
                                this.f14419g.mo13959c1();
                            } else {
                                TokenFilter f = v2.mo14037f(s);
                                if (f == null) {
                                    this.f14419g.mo13938N0();
                                    this.f14419g.mo13959c1();
                                } else {
                                    this.f9848C = f;
                                    if (f == tokenFilter5) {
                                        if (!mo14045j1()) {
                                            this.f14419g.mo13938N0();
                                            this.f14419g.mo13959c1();
                                        } else if (this.f9852s == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH) {
                                            this.f9853x = N0;
                                            return N0;
                                        }
                                    }
                                    if (!(this.f9852s == TokenFilter.Inclusion.ONLY_INCLUDE_ALL || (h13 = mo14044h1(this.f9846A)) == null)) {
                                        this.f9853x = h13;
                                        return h13;
                                    }
                                }
                            }
                        }
                    }
                }
                boolean s2 = this.f9846A.mo21360s();
                TokenFilter q = this.f9846A.mo21358q();
                if (!(q == null || q == TokenFilter.f9844a)) {
                    q.mo14033b();
                }
                hr6 r = this.f9846A.mo11443e();
                this.f9846A = r;
                this.f9848C = r.mo21358q();
                if (s2) {
                    this.f9853x = N0;
                    return N0;
                }
            } else {
                TokenFilter tokenFilter6 = this.f9848C;
                TokenFilter tokenFilter7 = TokenFilter.f9844a;
                if (tokenFilter6 == tokenFilter7) {
                    this.f9846A = this.f9846A.mo21356n(tokenFilter6, true);
                    this.f9853x = N0;
                    return N0;
                } else if (tokenFilter6 == null) {
                    this.f14419g.mo13959c1();
                } else {
                    TokenFilter l3 = this.f9846A.mo21354l(tokenFilter6);
                    if (l3 == null) {
                        this.f14419g.mo13959c1();
                    } else {
                        if (l3 != tokenFilter7) {
                            l3 = l3.mo14035d();
                        }
                        this.f9848C = l3;
                        if (l3 == tokenFilter7) {
                            this.f9846A = this.f9846A.mo21356n(l3, true);
                            this.f9853x = N0;
                            return N0;
                        } else if (l3 == null || this.f9852s != TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            hr6 n = this.f9846A.mo21356n(l3, false);
                            this.f9846A = n;
                            if (this.f9852s == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (h1 = mo14044h1(n)) != null) {
                                this.f9853x = h1;
                                return h1;
                            }
                        } else {
                            this.f9846A = this.f9846A.mo21356n(l3, true);
                            this.f9853x = N0;
                            return N0;
                        }
                    }
                }
            }
            return mo14043g1();
        }
        this.f9853x = null;
        return null;
    }

    /* renamed from: O0 */
    public JsonToken mo13940O0() throws IOException {
        JsonToken N0 = mo13938N0();
        if (N0 == JsonToken.FIELD_NAME) {
            return mo13938N0();
        }
        return N0;
    }

    /* renamed from: P */
    public z63 mo13941P() {
        return mo14041d1();
    }

    /* renamed from: S */
    public short mo13945S() throws IOException {
        return this.f14419g.mo13945S();
    }

    /* renamed from: S0 */
    public int mo13946S0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        return this.f14419g.mo13946S0(base64Variant, outputStream);
    }

    /* renamed from: W */
    public String mo13947W() throws IOException {
        if (this.f9853x == JsonToken.FIELD_NAME) {
            return mo13964f();
        }
        return this.f14419g.mo13947W();
    }

    /* renamed from: X */
    public char[] mo13949X() throws IOException {
        if (this.f9853x == JsonToken.FIELD_NAME) {
            return mo13964f().toCharArray();
        }
        return this.f14419g.mo13949X();
    }

    /* renamed from: Y */
    public int mo13950Y() throws IOException {
        if (this.f9853x == JsonToken.FIELD_NAME) {
            return mo13964f().length();
        }
        return this.f14419g.mo13950Y();
    }

    /* renamed from: b0 */
    public int mo13956b0() throws IOException {
        if (this.f9853x == JsonToken.FIELD_NAME) {
            return 0;
        }
        return this.f14419g.mo13956b0();
    }

    /* renamed from: c0 */
    public JsonLocation mo13958c0() {
        return this.f14419g.mo13958c0();
    }

    /* renamed from: c1 */
    public JsonParser mo13959c1() throws IOException {
        JsonToken jsonToken = this.f9853x;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken N0 = mo13938N0();
            if (N0 == null) {
                return this;
            }
            if (N0.isStructStart()) {
                i++;
            } else if (N0.isStructEnd() && i - 1 == 0) {
                return this;
            }
        }
    }

    /* renamed from: d1 */
    public z63 mo14041d1() {
        hr6 hr6 = this.f9847B;
        if (hr6 != null) {
            return hr6;
        }
        return this.f9846A;
    }

    /* renamed from: e */
    public void mo13962e() {
        JsonToken jsonToken = this.f9853x;
        if (jsonToken != null) {
            this.f9854y = jsonToken;
            this.f9853x = null;
        }
    }

    /* renamed from: f */
    public String mo13964f() throws IOException {
        z63 d1 = mo14041d1();
        JsonToken jsonToken = this.f9853x;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return d1.mo11435b();
        }
        z63 e = d1.mo11443e();
        if (e == null) {
            return null;
        }
        return e.mo11435b();
    }

    /* renamed from: f1 */
    public final JsonToken mo14042f1(hr6 hr6) throws IOException {
        this.f9847B = hr6;
        JsonToken t = hr6.mo21361t();
        if (t != null) {
            return t;
        }
        while (hr6 != this.f9846A) {
            hr6 = this.f9847B.mo21357p(hr6);
            this.f9847B = hr6;
            if (hr6 != null) {
                JsonToken t2 = hr6.mo21361t();
                if (t2 != null) {
                    return t2;
                }
            } else {
                throw mo13953a("Unexpected problem: chain of filtered context broken");
            }
        }
        throw mo13953a("Internal error: failed to locate expected buffered tokens");
    }

    /* renamed from: g */
    public JsonToken mo13965g() {
        return this.f9853x;
    }

    /* renamed from: g0 */
    public int mo13966g0() throws IOException {
        return this.f14419g.mo13966g0();
    }

    /* renamed from: g1 */
    public final JsonToken mo14043g1() throws IOException {
        JsonToken h1;
        JsonToken h12;
        JsonToken h13;
        TokenFilter l;
        while (true) {
            JsonToken N0 = this.f14419g.mo13938N0();
            if (N0 == null) {
                this.f9853x = N0;
                return N0;
            }
            int id = N0.mo14000id();
            if (id != 1) {
                if (id != 2) {
                    if (id == 3) {
                        TokenFilter tokenFilter = this.f9848C;
                        TokenFilter tokenFilter2 = TokenFilter.f9844a;
                        if (tokenFilter == tokenFilter2) {
                            this.f9846A = this.f9846A.mo21355m(tokenFilter, true);
                            this.f9853x = N0;
                            return N0;
                        } else if (tokenFilter == null) {
                            this.f14419g.mo13959c1();
                        } else {
                            TokenFilter l2 = this.f9846A.mo21354l(tokenFilter);
                            if (l2 == null) {
                                this.f14419g.mo13959c1();
                            } else {
                                if (l2 != tokenFilter2) {
                                    l2 = l2.mo14034c();
                                }
                                this.f9848C = l2;
                                if (l2 == tokenFilter2) {
                                    this.f9846A = this.f9846A.mo21355m(l2, true);
                                    this.f9853x = N0;
                                    return N0;
                                } else if (l2 == null || this.f9852s != TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                    hr6 m = this.f9846A.mo21355m(l2, false);
                                    this.f9846A = m;
                                    if (this.f9852s == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (h12 = mo14044h1(m)) != null) {
                                        this.f9853x = h12;
                                        return h12;
                                    }
                                } else {
                                    this.f9846A = this.f9846A.mo21355m(l2, true);
                                    this.f9853x = N0;
                                    return N0;
                                }
                            }
                        }
                    } else if (id != 4) {
                        if (id != 5) {
                            TokenFilter tokenFilter3 = this.f9848C;
                            TokenFilter tokenFilter4 = TokenFilter.f9844a;
                            if (tokenFilter3 == tokenFilter4) {
                                this.f9853x = N0;
                                return N0;
                            } else if (tokenFilter3 != null && (((l = this.f9846A.mo21354l(tokenFilter3)) == tokenFilter4 || (l != null && l.mo14039h(this.f14419g))) && mo14045j1())) {
                                this.f9853x = N0;
                                return N0;
                            }
                        } else {
                            String s = this.f14419g.mo13983s();
                            TokenFilter v = this.f9846A.mo21364v(s);
                            TokenFilter tokenFilter5 = TokenFilter.f9844a;
                            if (v == tokenFilter5) {
                                this.f9848C = v;
                                this.f9853x = N0;
                                return N0;
                            } else if (v == null) {
                                this.f14419g.mo13938N0();
                                this.f14419g.mo13959c1();
                            } else {
                                TokenFilter f = v.mo14037f(s);
                                if (f == null) {
                                    this.f14419g.mo13938N0();
                                    this.f14419g.mo13959c1();
                                } else {
                                    this.f9848C = f;
                                    if (f == tokenFilter5) {
                                        if (!mo14045j1()) {
                                            this.f14419g.mo13938N0();
                                            this.f14419g.mo13959c1();
                                        } else if (this.f9852s == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH) {
                                            this.f9853x = N0;
                                            return N0;
                                        }
                                    } else if (!(this.f9852s == TokenFilter.Inclusion.ONLY_INCLUDE_ALL || (h13 = mo14044h1(this.f9846A)) == null)) {
                                        this.f9853x = h13;
                                        return h13;
                                    }
                                }
                            }
                        }
                    }
                }
                boolean s2 = this.f9846A.mo21360s();
                TokenFilter q = this.f9846A.mo21358q();
                if (!(q == null || q == TokenFilter.f9844a)) {
                    q.mo14033b();
                }
                hr6 r = this.f9846A.mo11443e();
                this.f9846A = r;
                this.f9848C = r.mo21358q();
                if (s2) {
                    this.f9853x = N0;
                    return N0;
                }
            } else {
                TokenFilter tokenFilter6 = this.f9848C;
                TokenFilter tokenFilter7 = TokenFilter.f9844a;
                if (tokenFilter6 == tokenFilter7) {
                    this.f9846A = this.f9846A.mo21356n(tokenFilter6, true);
                    this.f9853x = N0;
                    return N0;
                } else if (tokenFilter6 == null) {
                    this.f14419g.mo13959c1();
                } else {
                    TokenFilter l3 = this.f9846A.mo21354l(tokenFilter6);
                    if (l3 == null) {
                        this.f14419g.mo13959c1();
                    } else {
                        if (l3 != tokenFilter7) {
                            l3 = l3.mo14035d();
                        }
                        this.f9848C = l3;
                        if (l3 == tokenFilter7) {
                            this.f9846A = this.f9846A.mo21356n(l3, true);
                            this.f9853x = N0;
                            return N0;
                        } else if (l3 == null || this.f9852s != TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            hr6 n = this.f9846A.mo21356n(l3, false);
                            this.f9846A = n;
                            if (this.f9852s == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (h1 = mo14044h1(n)) != null) {
                                this.f9853x = h1;
                                return h1;
                            }
                        } else {
                            this.f9846A = this.f9846A.mo21356n(l3, true);
                            this.f9853x = N0;
                            return N0;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final int mo13967h() {
        JsonToken jsonToken = this.f9853x;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.mo14000id();
    }

    /* renamed from: h0 */
    public int mo13968h0(int i) throws IOException {
        return this.f14419g.mo13968h0(i);
    }

    /* renamed from: h1 */
    public final JsonToken mo14044h1(hr6 hr6) throws IOException {
        boolean z;
        TokenFilter l;
        while (true) {
            JsonToken N0 = this.f14419g.mo13938N0();
            if (N0 == null) {
                return N0;
            }
            int id = N0.mo14000id();
            boolean z2 = false;
            if (id != 1) {
                if (id != 2) {
                    if (id == 3) {
                        TokenFilter l2 = this.f9846A.mo21354l(this.f9848C);
                        if (l2 == null) {
                            this.f14419g.mo13959c1();
                        } else {
                            TokenFilter tokenFilter = TokenFilter.f9844a;
                            if (l2 != tokenFilter) {
                                l2 = l2.mo14034c();
                            }
                            this.f9848C = l2;
                            if (l2 == tokenFilter) {
                                this.f9846A = this.f9846A.mo21355m(l2, true);
                                return mo14042f1(hr6);
                            } else if (l2 == null || this.f9852s != TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                this.f9846A = this.f9846A.mo21355m(l2, false);
                            } else {
                                this.f9846A = this.f9846A.mo21355m(l2, true);
                                return mo14042f1(hr6);
                            }
                        }
                    } else if (id != 4) {
                        if (id != 5) {
                            TokenFilter tokenFilter2 = this.f9848C;
                            TokenFilter tokenFilter3 = TokenFilter.f9844a;
                            if (tokenFilter2 == tokenFilter3) {
                                return mo14042f1(hr6);
                            }
                            if (tokenFilter2 != null && (((l = this.f9846A.mo21354l(tokenFilter2)) == tokenFilter3 || (l != null && l.mo14039h(this.f14419g))) && mo14045j1())) {
                                return mo14042f1(hr6);
                            }
                        } else {
                            String s = this.f14419g.mo13983s();
                            TokenFilter v = this.f9846A.mo21364v(s);
                            TokenFilter tokenFilter4 = TokenFilter.f9844a;
                            if (v == tokenFilter4) {
                                this.f9848C = v;
                                return mo14042f1(hr6);
                            } else if (v == null) {
                                this.f14419g.mo13938N0();
                                this.f14419g.mo13959c1();
                            } else {
                                TokenFilter f = v.mo14037f(s);
                                if (f == null) {
                                    this.f14419g.mo13938N0();
                                    this.f14419g.mo13959c1();
                                } else {
                                    this.f9848C = f;
                                    if (f != tokenFilter4) {
                                        continue;
                                    } else if (mo14045j1()) {
                                        return mo14042f1(hr6);
                                    } else {
                                        this.f9848C = this.f9846A.mo21364v(s);
                                    }
                                }
                            }
                        }
                    }
                }
                TokenFilter q = this.f9846A.mo21358q();
                if (!(q == null || q == TokenFilter.f9844a)) {
                    q.mo14033b();
                }
                hr6 hr62 = this.f9846A;
                if (hr62 == hr6) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && hr62.mo21360s()) {
                    z2 = true;
                }
                hr6 r = this.f9846A.mo11443e();
                this.f9846A = r;
                this.f9848C = r.mo21358q();
                if (z2) {
                    return N0;
                }
            } else {
                TokenFilter tokenFilter5 = this.f9848C;
                TokenFilter tokenFilter6 = TokenFilter.f9844a;
                if (tokenFilter5 == tokenFilter6) {
                    this.f9846A = this.f9846A.mo21356n(tokenFilter5, true);
                    return N0;
                } else if (tokenFilter5 == null) {
                    this.f14419g.mo13959c1();
                } else {
                    TokenFilter l3 = this.f9846A.mo21354l(tokenFilter5);
                    if (l3 == null) {
                        this.f14419g.mo13959c1();
                    } else {
                        if (l3 != tokenFilter6) {
                            l3 = l3.mo14035d();
                        }
                        this.f9848C = l3;
                        if (l3 == tokenFilter6) {
                            this.f9846A = this.f9846A.mo21356n(l3, true);
                            return mo14042f1(hr6);
                        } else if (l3 == null || this.f9852s != TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            this.f9846A = this.f9846A.mo21356n(l3, false);
                        } else {
                            this.f9846A = this.f9846A.mo21355m(l3, true);
                            return mo14042f1(hr6);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: i0 */
    public long mo13970i0() throws IOException {
        return this.f14419g.mo13970i0();
    }

    /* renamed from: j */
    public BigInteger mo13971j() throws IOException {
        return this.f14419g.mo13971j();
    }

    /* renamed from: j0 */
    public long mo13972j0(long j) throws IOException {
        return this.f14419g.mo13972j0(j);
    }

    /* renamed from: j1 */
    public final boolean mo14045j1() throws IOException {
        int i = this.f9849H;
        if (i != 0 && !this.f9851r) {
            return false;
        }
        this.f9849H = i + 1;
        return true;
    }

    /* renamed from: k0 */
    public String mo13974k0() throws IOException {
        if (this.f9853x == JsonToken.FIELD_NAME) {
            return mo13964f();
        }
        return this.f14419g.mo13974k0();
    }

    /* renamed from: l */
    public byte[] mo13975l(Base64Variant base64Variant) throws IOException {
        return this.f14419g.mo13975l(base64Variant);
    }

    /* renamed from: l0 */
    public String mo13976l0(String str) throws IOException {
        if (this.f9853x == JsonToken.FIELD_NAME) {
            return mo13964f();
        }
        return this.f14419g.mo13976l0(str);
    }

    /* renamed from: m */
    public boolean mo13977m() throws IOException {
        return this.f14419g.mo13977m();
    }

    /* renamed from: n */
    public byte mo13978n() throws IOException {
        return this.f14419g.mo13978n();
    }

    /* renamed from: o0 */
    public boolean mo13979o0() {
        if (this.f9853x != null) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public JsonLocation mo13981q() {
        return this.f14419g.mo13981q();
    }

    /* renamed from: q0 */
    public boolean mo13982q0() {
        if (this.f9853x == JsonToken.FIELD_NAME) {
            return false;
        }
        return this.f14419g.mo13982q0();
    }

    /* renamed from: s */
    public String mo13983s() throws IOException {
        z63 d1 = mo14041d1();
        JsonToken jsonToken = this.f9853x;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return d1.mo11435b();
        }
        z63 e = d1.mo11443e();
        if (e == null) {
            return null;
        }
        return e.mo11435b();
    }

    /* renamed from: s0 */
    public final boolean mo13984s0(JsonToken jsonToken) {
        if (this.f9853x == jsonToken) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public JsonToken mo13985v() {
        return this.f9853x;
    }

    @Deprecated
    /* renamed from: x */
    public final int mo13986x() {
        return mo13967h();
    }

    /* renamed from: x0 */
    public boolean mo13987x0(int i) {
        JsonToken jsonToken = this.f9853x;
        if (jsonToken == null) {
            if (i == 0) {
                return true;
            }
            return false;
        } else if (jsonToken.mo14000id() == i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: y */
    public BigDecimal mo13988y() throws IOException {
        return this.f14419g.mo13988y();
    }

    /* renamed from: z */
    public double mo13990z() throws IOException {
        return this.f14419g.mo13990z();
    }
}

package p000;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.filter.TokenFilter;

/* renamed from: hr6 */
/* compiled from: TokenFilterContext */
public class hr6 extends z63 {

    /* renamed from: c */
    public final hr6 f13018c;

    /* renamed from: d */
    public hr6 f13019d;

    /* renamed from: e */
    public String f13020e;

    /* renamed from: f */
    public TokenFilter f13021f;

    /* renamed from: g */
    public boolean f13022g;

    /* renamed from: h */
    public boolean f13023h = false;

    public hr6(int i, hr6 hr6, TokenFilter tokenFilter, boolean z) {
        this.f20473a = i;
        this.f13018c = hr6;
        this.f13021f = tokenFilter;
        this.f20474b = -1;
        this.f13022g = z;
    }

    /* renamed from: o */
    public static hr6 m19180o(TokenFilter tokenFilter) {
        return new hr6(0, (hr6) null, tokenFilter, true);
    }

    /* renamed from: b */
    public final String mo11435b() {
        return this.f13020e;
    }

    /* renamed from: c */
    public Object mo11436c() {
        return null;
    }

    /* renamed from: i */
    public void mo11437i(Object obj) {
    }

    /* renamed from: k */
    public void mo21353k(StringBuilder sb) {
        hr6 hr6 = this.f13018c;
        if (hr6 != null) {
            hr6.mo21353k(sb);
        }
        int i = this.f20473a;
        if (i == 2) {
            sb.append('{');
            if (this.f13020e != null) {
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                sb.append(this.f13020e);
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else {
                sb.append('?');
            }
            sb.append('}');
        } else if (i == 1) {
            sb.append('[');
            sb.append(mo28325a());
            sb.append(']');
        } else {
            sb.append("/");
        }
    }

    /* renamed from: l */
    public TokenFilter mo21354l(TokenFilter tokenFilter) {
        int i = this.f20473a;
        if (i == 2) {
            return tokenFilter;
        }
        int i2 = this.f20474b + 1;
        this.f20474b = i2;
        if (i == 1) {
            return tokenFilter.mo14036e(i2);
        }
        return tokenFilter.mo14038g(i2);
    }

    /* renamed from: m */
    public hr6 mo21355m(TokenFilter tokenFilter, boolean z) {
        hr6 hr6 = this.f13019d;
        if (hr6 != null) {
            return hr6.mo21363u(1, tokenFilter, z);
        }
        hr6 hr62 = new hr6(1, this, tokenFilter, z);
        this.f13019d = hr62;
        return hr62;
    }

    /* renamed from: n */
    public hr6 mo21356n(TokenFilter tokenFilter, boolean z) {
        hr6 hr6 = this.f13019d;
        if (hr6 != null) {
            return hr6.mo21363u(2, tokenFilter, z);
        }
        hr6 hr62 = new hr6(2, this, tokenFilter, z);
        this.f13019d = hr62;
        return hr62;
    }

    /* renamed from: p */
    public hr6 mo21357p(hr6 hr6) {
        hr6 hr62 = this.f13018c;
        if (hr62 == hr6) {
            return this;
        }
        while (hr62 != null) {
            hr6 hr63 = hr62.f13018c;
            if (hr63 == hr6) {
                return hr62;
            }
            hr62 = hr63;
        }
        return null;
    }

    /* renamed from: q */
    public TokenFilter mo21358q() {
        return this.f13021f;
    }

    /* renamed from: r */
    public final hr6 mo11443e() {
        return this.f13018c;
    }

    /* renamed from: s */
    public boolean mo21360s() {
        return this.f13022g;
    }

    /* renamed from: t */
    public JsonToken mo21361t() {
        if (!this.f13022g) {
            this.f13022g = true;
            if (this.f20473a == 2) {
                return JsonToken.START_OBJECT;
            }
            return JsonToken.START_ARRAY;
        } else if (!this.f13023h || this.f20473a != 2) {
            return null;
        } else {
            this.f13023h = false;
            return JsonToken.FIELD_NAME;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        mo21353k(sb);
        return sb.toString();
    }

    /* renamed from: u */
    public hr6 mo21363u(int i, TokenFilter tokenFilter, boolean z) {
        this.f20473a = i;
        this.f13021f = tokenFilter;
        this.f20474b = -1;
        this.f13020e = null;
        this.f13022g = z;
        this.f13023h = false;
        return this;
    }

    /* renamed from: v */
    public TokenFilter mo21364v(String str) throws JsonProcessingException {
        this.f13020e = str;
        this.f13023h = true;
        return this.f13021f;
    }
}

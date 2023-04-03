package p000;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;

/* renamed from: p73 */
/* compiled from: JsonWriteContext */
public class p73 extends z63 {

    /* renamed from: c */
    public final p73 f16333c;

    /* renamed from: d */
    public el1 f16334d;

    /* renamed from: e */
    public p73 f16335e;

    /* renamed from: f */
    public String f16336f;

    /* renamed from: g */
    public Object f16337g;

    /* renamed from: h */
    public boolean f16338h;

    public p73(int i, p73 p73, el1 el1) {
        this.f20473a = i;
        this.f16333c = p73;
        this.f16334d = el1;
        this.f20474b = -1;
    }

    /* renamed from: q */
    public static p73 m24704q(el1 el1) {
        return new p73(0, (p73) null, el1);
    }

    /* renamed from: b */
    public final String mo11435b() {
        return this.f16336f;
    }

    /* renamed from: c */
    public Object mo11436c() {
        return this.f16337g;
    }

    /* renamed from: i */
    public void mo11437i(Object obj) {
        this.f16337g = obj;
    }

    /* renamed from: k */
    public final void mo24458k(el1 el1, String str) throws JsonProcessingException {
        JsonGenerator jsonGenerator;
        if (el1.mo19292c(str)) {
            Object b = el1.mo19291b();
            String str2 = "Duplicate field '" + str + "'";
            if (b instanceof JsonGenerator) {
                jsonGenerator = (JsonGenerator) b;
            } else {
                jsonGenerator = null;
            }
            throw new JsonGenerationException(str2, jsonGenerator);
        }
    }

    /* renamed from: l */
    public p73 mo24459l() {
        this.f16337g = null;
        return this.f16333c;
    }

    /* renamed from: m */
    public p73 mo24460m() {
        el1 el1;
        p73 p73 = this.f16335e;
        if (p73 != null) {
            return p73.mo24466t(1);
        }
        el1 el12 = this.f16334d;
        if (el12 == null) {
            el1 = null;
        } else {
            el1 = el12.mo19290a();
        }
        p73 p732 = new p73(1, this, el1);
        this.f16335e = p732;
        return p732;
    }

    /* renamed from: n */
    public p73 mo24461n(Object obj) {
        el1 el1;
        p73 p73 = this.f16335e;
        if (p73 != null) {
            return p73.mo24467u(1, obj);
        }
        el1 el12 = this.f16334d;
        if (el12 == null) {
            el1 = null;
        } else {
            el1 = el12.mo19290a();
        }
        p73 p732 = new p73(1, this, el1, obj);
        this.f16335e = p732;
        return p732;
    }

    /* renamed from: o */
    public p73 mo24462o() {
        el1 el1;
        p73 p73 = this.f16335e;
        if (p73 != null) {
            return p73.mo24466t(2);
        }
        el1 el12 = this.f16334d;
        if (el12 == null) {
            el1 = null;
        } else {
            el1 = el12.mo19290a();
        }
        p73 p732 = new p73(2, this, el1);
        this.f16335e = p732;
        return p732;
    }

    /* renamed from: p */
    public p73 mo24463p(Object obj) {
        el1 el1;
        p73 p73 = this.f16335e;
        if (p73 != null) {
            return p73.mo24467u(2, obj);
        }
        el1 el12 = this.f16334d;
        if (el12 == null) {
            el1 = null;
        } else {
            el1 = el12.mo19290a();
        }
        p73 p732 = new p73(2, this, el1, obj);
        this.f16335e = p732;
        return p732;
    }

    /* renamed from: r */
    public el1 mo24464r() {
        return this.f16334d;
    }

    /* renamed from: s */
    public final p73 mo11443e() {
        return this.f16333c;
    }

    /* renamed from: t */
    public p73 mo24466t(int i) {
        this.f20473a = i;
        this.f20474b = -1;
        this.f16336f = null;
        this.f16338h = false;
        this.f16337g = null;
        el1 el1 = this.f16334d;
        if (el1 != null) {
            el1.mo19293d();
        }
        return this;
    }

    /* renamed from: u */
    public p73 mo24467u(int i, Object obj) {
        this.f20473a = i;
        this.f20474b = -1;
        this.f16336f = null;
        this.f16338h = false;
        this.f16337g = obj;
        el1 el1 = this.f16334d;
        if (el1 != null) {
            el1.mo19293d();
        }
        return this;
    }

    /* renamed from: v */
    public p73 mo24468v(el1 el1) {
        this.f16334d = el1;
        return this;
    }

    /* renamed from: w */
    public int mo24469w(String str) throws JsonProcessingException {
        if (this.f20473a != 2 || this.f16338h) {
            return 4;
        }
        this.f16338h = true;
        this.f16336f = str;
        el1 el1 = this.f16334d;
        if (el1 != null) {
            mo24458k(el1, str);
        }
        if (this.f20474b < 0) {
            return 0;
        }
        return 1;
    }

    /* renamed from: x */
    public int mo24470x() {
        int i = this.f20473a;
        if (i == 2) {
            if (!this.f16338h) {
                return 5;
            }
            this.f16338h = false;
            this.f20474b++;
            return 2;
        } else if (i == 1) {
            int i2 = this.f20474b;
            this.f20474b = i2 + 1;
            if (i2 < 0) {
                return 0;
            }
            return 1;
        } else {
            int i3 = this.f20474b + 1;
            this.f20474b = i3;
            if (i3 == 0) {
                return 0;
            }
            return 3;
        }
    }

    public p73(int i, p73 p73, el1 el1, Object obj) {
        this.f20473a = i;
        this.f16333c = p73;
        this.f16334d = el1;
        this.f20474b = -1;
        this.f16337g = obj;
    }
}

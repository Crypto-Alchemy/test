package p000;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.p009io.ContentReference;

/* renamed from: t53 */
/* compiled from: JsonReadContext */
public final class t53 extends z63 {

    /* renamed from: c */
    public final t53 f17946c;

    /* renamed from: d */
    public el1 f17947d;

    /* renamed from: e */
    public t53 f17948e;

    /* renamed from: f */
    public String f17949f;

    /* renamed from: g */
    public Object f17950g;

    /* renamed from: h */
    public int f17951h;

    /* renamed from: i */
    public int f17952i;

    public t53(t53 t53, el1 el1, int i, int i2, int i3) {
        this.f17946c = t53;
        this.f17947d = el1;
        this.f20473a = i;
        this.f17951h = i2;
        this.f17952i = i3;
        this.f20474b = -1;
    }

    /* renamed from: o */
    public static t53 m27435o(el1 el1) {
        return new t53((t53) null, el1, 0, 1, 0);
    }

    /* renamed from: b */
    public String mo11435b() {
        return this.f17949f;
    }

    /* renamed from: c */
    public Object mo11436c() {
        return this.f17950g;
    }

    /* renamed from: i */
    public void mo11437i(Object obj) {
        this.f17950g = obj;
    }

    /* renamed from: k */
    public final void mo26149k(el1 el1, String str) throws JsonProcessingException {
        JsonParser jsonParser;
        if (el1.mo19292c(str)) {
            Object b = el1.mo19291b();
            if (b instanceof JsonParser) {
                jsonParser = (JsonParser) b;
            } else {
                jsonParser = null;
            }
            throw new JsonParseException(jsonParser, "Duplicate field '" + str + "'");
        }
    }

    /* renamed from: l */
    public t53 mo26150l() {
        this.f17950g = null;
        return this.f17946c;
    }

    /* renamed from: m */
    public t53 mo26151m(int i, int i2) {
        el1 el1;
        t53 t53 = this.f17948e;
        if (t53 == null) {
            el1 el12 = this.f17947d;
            if (el12 == null) {
                el1 = null;
            } else {
                el1 = el12.mo19290a();
            }
            t53 = new t53(this, el1, 1, i, i2);
            this.f17948e = t53;
        } else {
            t53.mo26156s(1, i, i2);
        }
        return t53;
    }

    /* renamed from: n */
    public t53 mo26152n(int i, int i2) {
        el1 el1;
        t53 t53 = this.f17948e;
        if (t53 == null) {
            el1 el12 = this.f17947d;
            if (el12 == null) {
                el1 = null;
            } else {
                el1 = el12.mo19290a();
            }
            t53 t532 = new t53(this, el1, 2, i, i2);
            this.f17948e = t532;
            return t532;
        }
        t53.mo26156s(2, i, i2);
        return t53;
    }

    /* renamed from: p */
    public boolean mo26153p() {
        int i = this.f20474b + 1;
        this.f20474b = i;
        if (this.f20473a == 0 || i <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public el1 mo26154q() {
        return this.f17947d;
    }

    /* renamed from: r */
    public t53 mo11443e() {
        return this.f17946c;
    }

    /* renamed from: s */
    public void mo26156s(int i, int i2, int i3) {
        this.f20473a = i;
        this.f20474b = -1;
        this.f17951h = i2;
        this.f17952i = i3;
        this.f17949f = null;
        this.f17950g = null;
        el1 el1 = this.f17947d;
        if (el1 != null) {
            el1.mo19293d();
        }
    }

    /* renamed from: t */
    public void mo26157t(String str) throws JsonProcessingException {
        this.f17949f = str;
        el1 el1 = this.f17947d;
        if (el1 != null) {
            mo26149k(el1, str);
        }
    }

    /* renamed from: u */
    public JsonLocation mo26158u(ContentReference contentReference) {
        return new JsonLocation(contentReference, -1, this.f17951h, this.f17952i);
    }

    /* renamed from: v */
    public t53 mo26159v(el1 el1) {
        this.f17947d = el1;
        return this;
    }
}

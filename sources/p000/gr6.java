package p000;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.p009io.ContentReference;

/* renamed from: gr6 */
/* compiled from: TokenBufferReadContext */
public class gr6 extends z63 {

    /* renamed from: c */
    public final z63 f12580c;

    /* renamed from: d */
    public final JsonLocation f12581d;

    /* renamed from: e */
    public String f12582e;

    /* renamed from: f */
    public Object f12583f;

    public gr6(z63 z63, ContentReference contentReference) {
        super(z63);
        this.f12580c = z63.mo11443e();
        this.f12582e = z63.mo11435b();
        this.f12583f = z63.mo11436c();
        if (z63 instanceof t53) {
            this.f12581d = ((t53) z63).mo26158u(contentReference);
        } else {
            this.f12581d = JsonLocation.f9820NA;
        }
    }

    /* renamed from: m */
    public static gr6 m18372m(z63 z63) {
        if (z63 == null) {
            return new gr6();
        }
        return new gr6(z63, ContentReference.unknown());
    }

    /* renamed from: b */
    public String mo11435b() {
        return this.f12582e;
    }

    /* renamed from: c */
    public Object mo11436c() {
        return this.f12583f;
    }

    /* renamed from: e */
    public z63 mo11443e() {
        return this.f12580c;
    }

    /* renamed from: i */
    public void mo11437i(Object obj) {
        this.f12583f = obj;
    }

    /* renamed from: k */
    public gr6 mo20817k() {
        this.f20474b++;
        return new gr6(this, 1, -1);
    }

    /* renamed from: l */
    public gr6 mo20818l() {
        this.f20474b++;
        return new gr6(this, 2, -1);
    }

    /* renamed from: n */
    public gr6 mo20819n() {
        z63 z63 = this.f12580c;
        if (z63 instanceof gr6) {
            return (gr6) z63;
        }
        if (z63 == null) {
            return new gr6();
        }
        return new gr6(z63, this.f12581d);
    }

    /* renamed from: o */
    public void mo20820o(String str) throws JsonProcessingException {
        this.f12582e = str;
    }

    /* renamed from: p */
    public void mo20821p() {
        this.f20474b++;
    }

    public gr6(z63 z63, JsonLocation jsonLocation) {
        super(z63);
        this.f12580c = z63.mo11443e();
        this.f12582e = z63.mo11435b();
        this.f12583f = z63.mo11436c();
        this.f12581d = jsonLocation;
    }

    public gr6() {
        super(0, -1);
        this.f12580c = null;
        this.f12581d = JsonLocation.f9820NA;
    }

    public gr6(gr6 gr6, int i, int i2) {
        super(i, i2);
        this.f12580c = gr6;
        this.f12581d = gr6.f12581d;
    }
}

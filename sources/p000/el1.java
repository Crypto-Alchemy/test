package p000;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import java.util.HashSet;

/* renamed from: el1 */
/* compiled from: DupDetector */
public class el1 {

    /* renamed from: a */
    public final Object f11236a;

    /* renamed from: b */
    public String f11237b;

    /* renamed from: c */
    public String f11238c;

    /* renamed from: d */
    public HashSet<String> f11239d;

    public el1(Object obj) {
        this.f11236a = obj;
    }

    /* renamed from: e */
    public static el1 m16172e(JsonGenerator jsonGenerator) {
        return new el1(jsonGenerator);
    }

    /* renamed from: f */
    public static el1 m16173f(JsonParser jsonParser) {
        return new el1(jsonParser);
    }

    /* renamed from: a */
    public el1 mo19290a() {
        return new el1(this.f11236a);
    }

    /* renamed from: b */
    public Object mo19291b() {
        return this.f11236a;
    }

    /* renamed from: c */
    public boolean mo19292c(String str) throws JsonParseException {
        String str2 = this.f11237b;
        if (str2 == null) {
            this.f11237b = str;
            return false;
        } else if (str.equals(str2)) {
            return true;
        } else {
            String str3 = this.f11238c;
            if (str3 == null) {
                this.f11238c = str;
                return false;
            } else if (str.equals(str3)) {
                return true;
            } else {
                if (this.f11239d == null) {
                    HashSet<String> hashSet = new HashSet<>(16);
                    this.f11239d = hashSet;
                    hashSet.add(this.f11237b);
                    this.f11239d.add(this.f11238c);
                }
                return !this.f11239d.add(str);
            }
        }
    }

    /* renamed from: d */
    public void mo19293d() {
        this.f11237b = null;
        this.f11238c = null;
        this.f11239d = null;
    }
}

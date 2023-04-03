package p000;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

/* renamed from: l75 */
/* compiled from: RawValue */
public class l75 implements w63 {

    /* renamed from: a */
    public Object f14444a;

    public l75(String str) {
        this.f14444a = str;
    }

    /* renamed from: a */
    public void mo22679a(JsonGenerator jsonGenerator) throws IOException {
        Object obj = this.f14444a;
        if (obj instanceof qw5) {
            jsonGenerator.mo13837D0((qw5) obj);
        } else {
            jsonGenerator.mo13838E0(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public void mo22680b(JsonGenerator jsonGenerator) throws IOException {
        Object obj = this.f14444a;
        if (obj instanceof w63) {
            jsonGenerator.writeObject(obj);
        } else {
            mo22679a(jsonGenerator);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l75)) {
            return false;
        }
        Object obj2 = this.f14444a;
        Object obj3 = ((l75) obj).f14444a;
        if (obj2 == obj3) {
            return true;
        }
        if (obj2 == null || !obj2.equals(obj3)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.f14444a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public void serialize(JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
        Object obj = this.f14444a;
        if (obj instanceof w63) {
            ((w63) obj).serialize(jsonGenerator, zw5);
        } else {
            mo22679a(jsonGenerator);
        }
    }

    public void serializeWithType(JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
        Object obj = this.f14444a;
        if (obj instanceof w63) {
            ((w63) obj).serializeWithType(jsonGenerator, zw5, m17);
        } else if (obj instanceof qw5) {
            serialize(jsonGenerator, zw5);
        }
    }

    public String toString() {
        return String.format("[RawValue of type %s]", new Object[]{wf0.m29514h(this.f14444a)});
    }
}

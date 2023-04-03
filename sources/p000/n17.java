package p000;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import java.io.IOException;

/* renamed from: n17 */
/* compiled from: TypeSerializerBase */
public abstract class n17 extends m17 {

    /* renamed from: a */
    public final r07 f15298a;

    /* renamed from: b */
    public final BeanProperty f15299b;

    public n17(r07 r07, BeanProperty beanProperty) {
        this.f15298a = r07;
        this.f15299b = beanProperty;
    }

    /* renamed from: b */
    public String mo16711b() {
        return null;
    }

    /* renamed from: g */
    public WritableTypeId mo16712g(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        mo23469i(writableTypeId);
        return jsonGenerator.mo13874f1(writableTypeId);
    }

    /* renamed from: h */
    public WritableTypeId mo16713h(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        return jsonGenerator.mo13878g1(writableTypeId);
    }

    /* renamed from: i */
    public void mo23469i(WritableTypeId writableTypeId) {
        String str;
        if (writableTypeId.f9861c == null) {
            Object obj = writableTypeId.f9859a;
            Class<?> cls = writableTypeId.f9860b;
            if (cls == null) {
                str = mo23471k(obj);
            } else {
                str = mo23472l(obj, cls);
            }
            writableTypeId.f9861c = str;
        }
    }

    /* renamed from: j */
    public void mo23470j(Object obj) {
    }

    /* renamed from: k */
    public String mo23471k(Object obj) {
        String a = this.f15298a.mo25084a(obj);
        if (a == null) {
            mo23470j(obj);
        }
        return a;
    }

    /* renamed from: l */
    public String mo23472l(Object obj, Class<?> cls) {
        String e = this.f15298a.mo25087e(obj, cls);
        if (e == null) {
            mo23470j(obj);
        }
        return e;
    }
}

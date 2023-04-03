package p000;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

/* renamed from: un7 */
/* compiled from: WritableObjectId */
public final class un7 {

    /* renamed from: a */
    public final ObjectIdGenerator<?> f18544a;

    /* renamed from: b */
    public Object f18545b;

    /* renamed from: c */
    public boolean f18546c = false;

    public un7(ObjectIdGenerator<?> objectIdGenerator) {
        this.f18544a = objectIdGenerator;
    }

    /* renamed from: a */
    public Object mo26834a(Object obj) {
        if (this.f18545b == null) {
            this.f18545b = this.f18544a.generateId(obj);
        }
        return this.f18545b;
    }

    /* renamed from: b */
    public void mo26835b(JsonGenerator jsonGenerator, zw5 zw5, cf4 cf4) throws IOException {
        String str;
        this.f18546c = true;
        if (jsonGenerator.mo13876g()) {
            Object obj = this.f18545b;
            if (obj == null) {
                str = null;
            } else {
                str = String.valueOf(obj);
            }
            jsonGenerator.mo13894q0(str);
            return;
        }
        qw5 qw5 = cf4.f8430b;
        if (qw5 != null) {
            jsonGenerator.mo13858Y(qw5);
            cf4.f8432d.serialize(this.f18545b, jsonGenerator, zw5);
        }
    }

    /* renamed from: c */
    public boolean mo26836c(JsonGenerator jsonGenerator, zw5 zw5, cf4 cf4) throws IOException {
        if (this.f18545b == null) {
            return false;
        }
        if (!this.f18546c && !cf4.f8433e) {
            return false;
        }
        if (jsonGenerator.mo13876g()) {
            jsonGenerator.mo13896s0(String.valueOf(this.f18545b));
            return true;
        }
        cf4.f8432d.serialize(this.f18545b, jsonGenerator, zw5);
        return true;
    }
}

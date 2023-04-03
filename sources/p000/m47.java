package p000;

import com.fasterxml.jackson.core.JsonLocation;

/* renamed from: m47 */
/* compiled from: UnresolvedId */
public class m47 {

    /* renamed from: a */
    public final Object f14829a;

    /* renamed from: b */
    public final JsonLocation f14830b;

    /* renamed from: c */
    public final Class<?> f14831c;

    public m47(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this.f14829a = obj;
        this.f14831c = cls;
        this.f14830b = jsonLocation;
    }

    public String toString() {
        return String.format("Object id [%s] (for %s) at %s", new Object[]{this.f14829a, wf0.m29497X(this.f14831c), this.f14830b});
    }
}

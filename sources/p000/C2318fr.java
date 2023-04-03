package p000;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* renamed from: fr */
/* compiled from: AsWrapperTypeSerializer */
public class C2318fr extends n17 {
    public C2318fr(r07 r07, BeanProperty beanProperty) {
        super(r07, beanProperty);
    }

    /* renamed from: c */
    public JsonTypeInfo.C1971As mo11784c() {
        return JsonTypeInfo.C1971As.WRAPPER_OBJECT;
    }

    /* renamed from: m */
    public C2318fr mo11783a(BeanProperty beanProperty) {
        if (this.f15299b == beanProperty) {
            return this;
        }
        return new C2318fr(this.f15298a, beanProperty);
    }
}

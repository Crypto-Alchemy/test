package p000;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* renamed from: cr */
/* compiled from: AsExistingPropertyTypeSerializer */
public class C2112cr extends C2248er {
    public C2112cr(r07 r07, BeanProperty beanProperty, String str) {
        super(r07, beanProperty, str);
    }

    /* renamed from: c */
    public JsonTypeInfo.C1971As mo11784c() {
        return JsonTypeInfo.C1971As.EXISTING_PROPERTY;
    }

    /* renamed from: o */
    public C2112cr mo18231n(BeanProperty beanProperty) {
        if (this.f15299b == beanProperty) {
            return this;
        }
        return new C2112cr(this.f15298a, beanProperty, this.f11327c);
    }
}

package p000;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* renamed from: br */
/* compiled from: AsArrayTypeSerializer */
public class C1644br extends n17 {
    public C1644br(r07 r07, BeanProperty beanProperty) {
        super(r07, beanProperty);
    }

    /* renamed from: c */
    public JsonTypeInfo.C1971As mo11784c() {
        return JsonTypeInfo.C1971As.WRAPPER_ARRAY;
    }

    /* renamed from: m */
    public C1644br mo11783a(BeanProperty beanProperty) {
        if (this.f15299b == beanProperty) {
            return this;
        }
        return new C1644br(this.f15298a, beanProperty);
    }
}

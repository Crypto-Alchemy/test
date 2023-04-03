package p000;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* renamed from: er */
/* compiled from: AsPropertyTypeSerializer */
public class C2248er extends C1644br {

    /* renamed from: c */
    public final String f11327c;

    public C2248er(r07 r07, BeanProperty beanProperty, String str) {
        super(r07, beanProperty);
        this.f11327c = str;
    }

    /* renamed from: b */
    public String mo16711b() {
        return this.f11327c;
    }

    /* renamed from: c */
    public JsonTypeInfo.C1971As mo11784c() {
        return JsonTypeInfo.C1971As.PROPERTY;
    }

    /* renamed from: n */
    public C2248er mo11785m(BeanProperty beanProperty) {
        if (this.f15299b == beanProperty) {
            return this;
        }
        return new C2248er(this.f15298a, beanProperty, this.f11327c);
    }
}

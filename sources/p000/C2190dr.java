package p000;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* renamed from: dr */
/* compiled from: AsExternalTypeSerializer */
public class C2190dr extends n17 {

    /* renamed from: c */
    public final String f10817c;

    public C2190dr(r07 r07, BeanProperty beanProperty, String str) {
        super(r07, beanProperty);
        this.f10817c = str;
    }

    /* renamed from: b */
    public String mo16711b() {
        return this.f10817c;
    }

    /* renamed from: c */
    public JsonTypeInfo.C1971As mo11784c() {
        return JsonTypeInfo.C1971As.EXTERNAL_PROPERTY;
    }

    /* renamed from: m */
    public C2190dr mo11783a(BeanProperty beanProperty) {
        if (this.f15299b == beanProperty) {
            return this;
        }
        return new C2190dr(this.f15298a, beanProperty, this.f10817c);
    }
}

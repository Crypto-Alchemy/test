package p000;

import com.fasterxml.jackson.annotation.C1974a;
import com.fasterxml.jackson.annotation.C1975b;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.PropertyName;

/* renamed from: bf4 */
/* compiled from: ObjectIdInfo */
public class bf4 {

    /* renamed from: f */
    public static final bf4 f8125f = new bf4(PropertyName.NO_NAME, Object.class, (Class<? extends ObjectIdGenerator<?>>) null, false, (Class<? extends C1974a>) null);

    /* renamed from: a */
    public final PropertyName f8126a;

    /* renamed from: b */
    public final Class<? extends ObjectIdGenerator<?>> f8127b;

    /* renamed from: c */
    public final Class<? extends C1974a> f8128c;

    /* renamed from: d */
    public final Class<?> f8129d;

    /* renamed from: e */
    public final boolean f8130e;

    public bf4(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, Class<? extends C1974a> cls3) {
        this(propertyName, cls, cls2, false, cls3);
    }

    /* renamed from: a */
    public static bf4 m11343a() {
        return f8125f;
    }

    /* renamed from: b */
    public boolean mo11627b() {
        return this.f8130e;
    }

    /* renamed from: c */
    public Class<? extends ObjectIdGenerator<?>> mo11628c() {
        return this.f8127b;
    }

    /* renamed from: d */
    public PropertyName mo11629d() {
        return this.f8126a;
    }

    /* renamed from: e */
    public Class<? extends C1974a> mo11630e() {
        return this.f8128c;
    }

    /* renamed from: f */
    public Class<?> mo11631f() {
        return this.f8129d;
    }

    /* renamed from: g */
    public bf4 mo11632g(boolean z) {
        if (this.f8130e == z) {
            return this;
        }
        return new bf4(this.f8126a, this.f8129d, this.f8127b, z, this.f8128c);
    }

    public String toString() {
        return "ObjectIdInfo: propName=" + this.f8126a + ", scope=" + wf0.m29497X(this.f8129d) + ", generatorType=" + wf0.m29497X(this.f8127b) + ", alwaysAsId=" + this.f8130e;
    }

    public bf4(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, boolean z, Class<? extends C1974a> cls3) {
        this.f8126a = propertyName;
        this.f8129d = cls;
        this.f8127b = cls2;
        this.f8130e = z;
        this.f8128c = cls3 == null ? C1975b.class : cls3;
    }
}

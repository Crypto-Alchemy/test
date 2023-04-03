package p000;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f02 */
/* compiled from: FieldDescriptor */
public final class f02 {

    /* renamed from: a */
    public final String f28705a;

    /* renamed from: b */
    public final Map<Class<?>, Object> f28706b;

    /* renamed from: f02$b */
    /* compiled from: FieldDescriptor */
    public static final class C5823b {

        /* renamed from: a */
        public final String f28707a;

        /* renamed from: b */
        public Map<Class<?>, Object> f28708b = null;

        public C5823b(String str) {
            this.f28707a = str;
        }

        /* renamed from: a */
        public f02 mo42466a() {
            Map map;
            String str = this.f28707a;
            if (this.f28708b == null) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(new HashMap(this.f28708b));
            }
            return new f02(str, map);
        }

        /* renamed from: b */
        public <T extends Annotation> C5823b mo42467b(T t) {
            if (this.f28708b == null) {
                this.f28708b = new HashMap();
            }
            this.f28708b.put(t.annotationType(), t);
            return this;
        }
    }

    /* renamed from: a */
    public static C5823b m44116a(String str) {
        return new C5823b(str);
    }

    /* renamed from: d */
    public static f02 m44117d(String str) {
        return new f02(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String mo42461b() {
        return this.f28705a;
    }

    /* renamed from: c */
    public <T extends Annotation> T mo42462c(Class<T> cls) {
        return (Annotation) this.f28706b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f02)) {
            return false;
        }
        f02 f02 = (f02) obj;
        if (!this.f28705a.equals(f02.f28705a) || !this.f28706b.equals(f02.f28706b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f28705a.hashCode() * 31) + this.f28706b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f28705a + ", properties=" + this.f28706b.values() + "}";
    }

    public f02(String str, Map<Class<?>, Object> map) {
        this.f28705a = str;
        this.f28706b = map;
    }
}

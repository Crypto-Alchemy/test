package p000;

import com.fasterxml.jackson.databind.JavaType;

/* renamed from: u07 */
/* compiled from: TypeKey */
public class u07 {

    /* renamed from: a */
    public int f18335a;

    /* renamed from: b */
    public Class<?> f18336b;

    /* renamed from: c */
    public JavaType f18337c;

    /* renamed from: d */
    public boolean f18338d;

    public u07() {
    }

    public u07(Class<?> cls, boolean z) {
        this.f18336b = cls;
        this.f18337c = null;
        this.f18338d = z;
        this.f18335a = z ? m28015e(cls) : m28017g(cls);
    }

    /* renamed from: d */
    public static final int m28014d(JavaType javaType) {
        return javaType.hashCode() - 2;
    }

    /* renamed from: e */
    public static final int m28015e(Class<?> cls) {
        return cls.getName().hashCode() + 1;
    }

    /* renamed from: f */
    public static final int m28016f(JavaType javaType) {
        return javaType.hashCode() - 1;
    }

    /* renamed from: g */
    public static final int m28017g(Class<?> cls) {
        return cls.getName().hashCode();
    }

    /* renamed from: a */
    public Class<?> mo26618a() {
        return this.f18336b;
    }

    /* renamed from: b */
    public JavaType mo26619b() {
        return this.f18337c;
    }

    /* renamed from: c */
    public boolean mo26620c() {
        return this.f18338d;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        u07 u07 = (u07) obj;
        if (u07.f18338d != this.f18338d) {
            return false;
        }
        Class<?> cls = this.f18336b;
        if (cls == null) {
            return this.f18337c.equals(u07.f18337c);
        }
        if (u07.f18336b == cls) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18335a;
    }

    public final String toString() {
        if (this.f18336b != null) {
            return "{class: " + this.f18336b.getName() + ", typed? " + this.f18338d + "}";
        }
        return "{type: " + this.f18337c + ", typed? " + this.f18338d + "}";
    }

    public u07(JavaType javaType, boolean z) {
        this.f18337c = javaType;
        this.f18336b = null;
        this.f18338d = z;
        this.f18335a = z ? m28014d(javaType) : m28016f(javaType);
    }
}

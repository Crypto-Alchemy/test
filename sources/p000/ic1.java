package p000;

/* renamed from: ic1 */
/* compiled from: Dependency */
public final class ic1 {

    /* renamed from: a */
    public final Class<?> f29884a;

    /* renamed from: b */
    public final int f29885b;

    /* renamed from: c */
    public final int f29886c;

    public ic1(Class<?> cls, int i, int i2) {
        this.f29884a = (Class) eu4.m44087c(cls, "Null dependency anInterface.");
        this.f29885b = i;
        this.f29886c = i2;
    }

    /* renamed from: a */
    public static ic1 m45601a(Class<?> cls) {
        return new ic1(cls, 0, 2);
    }

    /* renamed from: b */
    public static String m45602b(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    @Deprecated
    /* renamed from: h */
    public static ic1 m45603h(Class<?> cls) {
        return new ic1(cls, 0, 0);
    }

    /* renamed from: i */
    public static ic1 m45604i(Class<?> cls) {
        return new ic1(cls, 0, 1);
    }

    /* renamed from: j */
    public static ic1 m45605j(Class<?> cls) {
        return new ic1(cls, 1, 0);
    }

    /* renamed from: k */
    public static ic1 m45606k(Class<?> cls) {
        return new ic1(cls, 1, 1);
    }

    /* renamed from: l */
    public static ic1 m45607l(Class<?> cls) {
        return new ic1(cls, 2, 0);
    }

    /* renamed from: c */
    public Class<?> mo43542c() {
        return this.f29884a;
    }

    /* renamed from: d */
    public boolean mo43543d() {
        if (this.f29886c == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo43544e() {
        if (this.f29886c == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ic1)) {
            return false;
        }
        ic1 ic1 = (ic1) obj;
        if (this.f29884a == ic1.f29884a && this.f29885b == ic1.f29885b && this.f29886c == ic1.f29886c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo43546f() {
        if (this.f29885b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo43547g() {
        if (this.f29885b == 2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f29884a.hashCode() ^ 1000003) * 1000003) ^ this.f29885b) * 1000003) ^ this.f29886c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f29884a);
        sb.append(", type=");
        int i = this.f29885b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(m45602b(this.f29886c));
        sb.append("}");
        return sb.toString();
    }
}

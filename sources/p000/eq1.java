package p000;

import java.security.MessageDigest;
import java.util.Map;

/* renamed from: eq1 */
/* compiled from: EngineKey */
public class eq1 implements z93 {

    /* renamed from: b */
    public final Object f11315b;

    /* renamed from: c */
    public final int f11316c;

    /* renamed from: d */
    public final int f11317d;

    /* renamed from: e */
    public final Class<?> f11318e;

    /* renamed from: f */
    public final Class<?> f11319f;

    /* renamed from: g */
    public final z93 f11320g;

    /* renamed from: h */
    public final Map<Class<?>, mw6<?>> f11321h;

    /* renamed from: i */
    public final xi4 f11322i;

    /* renamed from: j */
    public int f11323j;

    public eq1(Object obj, z93 z93, int i, int i2, Map<Class<?>, mw6<?>> map, Class<?> cls, Class<?> cls2, xi4 xi4) {
        this.f11315b = zt4.m31500d(obj);
        this.f11320g = (z93) zt4.m31501e(z93, "Signature must not be null");
        this.f11316c = i;
        this.f11317d = i2;
        this.f11321h = (Map) zt4.m31500d(map);
        this.f11318e = (Class) zt4.m31501e(cls, "Resource class must not be null");
        this.f11319f = (Class) zt4.m31501e(cls2, "Transcode class must not be null");
        this.f11322i = (xi4) zt4.m31500d(xi4);
    }

    /* renamed from: b */
    public void mo18753b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof eq1)) {
            return false;
        }
        eq1 eq1 = (eq1) obj;
        if (!this.f11315b.equals(eq1.f11315b) || !this.f11320g.equals(eq1.f11320g) || this.f11317d != eq1.f11317d || this.f11316c != eq1.f11316c || !this.f11321h.equals(eq1.f11321h) || !this.f11318e.equals(eq1.f11318e) || !this.f11319f.equals(eq1.f11319f) || !this.f11322i.equals(eq1.f11322i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f11323j == 0) {
            int hashCode = this.f11315b.hashCode();
            this.f11323j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f11320g.hashCode()) * 31) + this.f11316c) * 31) + this.f11317d;
            this.f11323j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f11321h.hashCode();
            this.f11323j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f11318e.hashCode();
            this.f11323j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f11319f.hashCode();
            this.f11323j = hashCode5;
            this.f11323j = (hashCode5 * 31) + this.f11322i.hashCode();
        }
        return this.f11323j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f11315b + ", width=" + this.f11316c + ", height=" + this.f11317d + ", resourceClass=" + this.f11318e + ", transcodeClass=" + this.f11319f + ", signature=" + this.f11320g + ", hashCode=" + this.f11323j + ", transformations=" + this.f11321h + ", options=" + this.f11322i + '}';
    }
}

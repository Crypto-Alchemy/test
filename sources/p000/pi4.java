package p000;

import java.security.MessageDigest;

/* renamed from: pi4 */
/* compiled from: Option */
public final class pi4<T> {

    /* renamed from: e */
    public static final C3073b<Object> f16494e = new C3072a();

    /* renamed from: a */
    public final T f16495a;

    /* renamed from: b */
    public final C3073b<T> f16496b;

    /* renamed from: c */
    public final String f16497c;

    /* renamed from: d */
    public volatile byte[] f16498d;

    /* renamed from: pi4$a */
    /* compiled from: Option */
    public class C3072a implements C3073b<Object> {
        /* renamed from: a */
        public void mo12605a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: pi4$b */
    /* compiled from: Option */
    public interface C3073b<T> {
        /* renamed from: a */
        void mo12605a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public pi4(String str, T t, C3073b<T> bVar) {
        this.f16497c = zt4.m31498b(str);
        this.f16495a = t;
        this.f16496b = (C3073b) zt4.m31500d(bVar);
    }

    /* renamed from: a */
    public static <T> pi4<T> m24959a(String str, T t, C3073b<T> bVar) {
        return new pi4<>(str, t, bVar);
    }

    /* renamed from: b */
    public static <T> C3073b<T> m24960b() {
        return f16494e;
    }

    /* renamed from: e */
    public static <T> pi4<T> m24961e(String str) {
        return new pi4<>(str, (Object) null, m24960b());
    }

    /* renamed from: f */
    public static <T> pi4<T> m24962f(String str, T t) {
        return new pi4<>(str, t, m24960b());
    }

    /* renamed from: c */
    public T mo24604c() {
        return this.f16495a;
    }

    /* renamed from: d */
    public final byte[] mo24605d() {
        if (this.f16498d == null) {
            this.f16498d = this.f16497c.getBytes(z93.f20511a);
        }
        return this.f16498d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof pi4) {
            return this.f16497c.equals(((pi4) obj).f16497c);
        }
        return false;
    }

    /* renamed from: g */
    public void mo24607g(T t, MessageDigest messageDigest) {
        this.f16496b.mo12605a(mo24605d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f16497c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f16497c + '\'' + '}';
    }
}

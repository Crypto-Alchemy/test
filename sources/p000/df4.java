package p000;

import java.security.MessageDigest;

/* renamed from: df4 */
/* compiled from: ObjectKey */
public final class df4 implements z93 {

    /* renamed from: b */
    public final Object f10694b;

    public df4(Object obj) {
        this.f10694b = zt4.m31500d(obj);
    }

    /* renamed from: b */
    public void mo18753b(MessageDigest messageDigest) {
        messageDigest.update(this.f10694b.toString().getBytes(z93.f20511a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof df4) {
            return this.f10694b.equals(((df4) obj).f10694b);
        }
        return false;
    }

    public int hashCode() {
        return this.f10694b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f10694b + '}';
    }
}

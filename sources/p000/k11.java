package p000;

import java.security.MessageDigest;

/* renamed from: k11 */
/* compiled from: DataCacheKey */
public final class k11 implements z93 {

    /* renamed from: b */
    public final z93 f13956b;

    /* renamed from: c */
    public final z93 f13957c;

    public k11(z93 z93, z93 z932) {
        this.f13956b = z93;
        this.f13957c = z932;
    }

    /* renamed from: b */
    public void mo18753b(MessageDigest messageDigest) {
        this.f13956b.mo18753b(messageDigest);
        this.f13957c.mo18753b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k11)) {
            return false;
        }
        k11 k11 = (k11) obj;
        if (!this.f13956b.equals(k11.f13956b) || !this.f13957c.equals(k11.f13957c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f13956b.hashCode() * 31) + this.f13957c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f13956b + ", signature=" + this.f13957c + '}';
    }
}

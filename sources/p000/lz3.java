package p000;

import java.util.List;

/* renamed from: lz3 */
/* compiled from: MultiCacheKey */
public class lz3 implements f80 {

    /* renamed from: a */
    public final List<f80> f14764a;

    /* renamed from: a */
    public String mo11960a() {
        return this.f14764a.get(0).mo11960a();
    }

    /* renamed from: b */
    public boolean mo11961b() {
        return false;
    }

    /* renamed from: c */
    public List<f80> mo22991c() {
        return this.f14764a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lz3) {
            return this.f14764a.equals(((lz3) obj).f14764a);
        }
        return false;
    }

    public int hashCode() {
        return this.f14764a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f14764a.toString();
    }
}

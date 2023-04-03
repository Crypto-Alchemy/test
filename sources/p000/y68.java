package p000;

import java.util.Iterator;
import java.util.List;

/* renamed from: y68 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class y68 implements r88 {

    /* renamed from: a */
    public final r88 f35777a;

    /* renamed from: d */
    public final String f35778d;

    public y68() {
        throw null;
    }

    public y68(String str) {
        this.f35777a = r88.f33330g1;
        this.f35778d = str;
    }

    public y68(String str, r88 r88) {
        this.f35777a = r88;
        this.f35778d = str;
    }

    /* renamed from: a */
    public final r88 mo49602a() {
        return this.f35777a;
    }

    /* renamed from: b */
    public final Double mo29499b() {
        throw new IllegalStateException("Control is not a double");
    }

    /* renamed from: c */
    public final Boolean mo29500c() {
        throw new IllegalStateException("Control is not a boolean");
    }

    /* renamed from: d */
    public final String mo49603d() {
        return this.f35778d;
    }

    /* renamed from: e */
    public final Iterator<r88> mo29501e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y68)) {
            return false;
        }
        y68 y68 = (y68) obj;
        if (!this.f35778d.equals(y68.f35778d) || !this.f35777a.equals(y68.f35777a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f35778d.hashCode() * 31) + this.f35777a.hashCode();
    }

    /* renamed from: n */
    public final r88 mo29505n() {
        return new y68(this.f35778d, this.f35777a.mo29505n());
    }

    /* renamed from: o */
    public final r88 mo29506o(String str, ps8 ps8, List<r88> list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }
}

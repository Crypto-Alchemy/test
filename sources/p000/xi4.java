package p000;

import java.security.MessageDigest;

/* renamed from: xi4 */
/* compiled from: Options */
public final class xi4 implements z93 {

    /* renamed from: b */
    public final C2781lq<pi4<?>, Object> f19852b = new k80();

    /* renamed from: f */
    public static <T> void m30124f(pi4<T> pi4, Object obj, MessageDigest messageDigest) {
        pi4.mo24607g(obj, messageDigest);
    }

    /* renamed from: b */
    public void mo18753b(MessageDigest messageDigest) {
        for (int i = 0; i < this.f19852b.size(); i++) {
            m30124f(this.f19852b.mo27919i(i), this.f19852b.mo27921m(i), messageDigest);
        }
    }

    /* renamed from: c */
    public <T> T mo27760c(pi4<T> pi4) {
        if (this.f19852b.containsKey(pi4)) {
            return this.f19852b.get(pi4);
        }
        return pi4.mo24604c();
    }

    /* renamed from: d */
    public void mo27761d(xi4 xi4) {
        this.f19852b.mo22210j(xi4.f19852b);
    }

    /* renamed from: e */
    public <T> xi4 mo27762e(pi4<T> pi4, T t) {
        this.f19852b.put(pi4, t);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof xi4) {
            return this.f19852b.equals(((xi4) obj).f19852b);
        }
        return false;
    }

    public int hashCode() {
        return this.f19852b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f19852b + '}';
    }
}

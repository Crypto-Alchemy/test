package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p000.uy1;

/* renamed from: pk5 */
/* compiled from: SafeKeyGenerator */
public class pk5 {

    /* renamed from: a */
    public final dm3<z93, String> f16525a = new dm3<>(1000);

    /* renamed from: b */
    public final ys4<C3080b> f16526b = uy1.m28526d(10, new C3079a());

    /* renamed from: pk5$a */
    /* compiled from: SafeKeyGenerator */
    public class C3079a implements uy1.C3444d<C3080b> {
        public C3079a() {
        }

        /* renamed from: b */
        public C3080b mo12529a() {
            try {
                return new C3080b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: pk5$b */
    /* compiled from: SafeKeyGenerator */
    public static final class C3080b implements uy1.C3446f {

        /* renamed from: a */
        public final MessageDigest f16528a;

        /* renamed from: d */
        public final d96 f16529d = d96.m14869a();

        public C3080b(MessageDigest messageDigest) {
            this.f16528a = messageDigest;
        }

        /* renamed from: d */
        public d96 mo12421d() {
            return this.f16529d;
        }
    }

    /* renamed from: a */
    public final String mo24630a(z93 z93) {
        C3080b bVar = (C3080b) zt4.m31500d(this.f16526b.mo11139b());
        try {
            z93.mo18753b(bVar.f16528a);
            return p67.m24695w(bVar.f16528a.digest());
        } finally {
            this.f16526b.mo11138a(bVar);
        }
    }

    /* renamed from: b */
    public String mo24631b(z93 z93) {
        String g;
        synchronized (this.f16525a) {
            g = this.f16525a.mo18844g(z93);
        }
        if (g == null) {
            g = mo24630a(z93);
        }
        synchronized (this.f16525a) {
            this.f16525a.mo18848k(z93, g);
        }
        return g;
    }
}

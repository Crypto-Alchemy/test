package p000;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: vr0 */
/* compiled from: ContentUriTriggers */
public final class vr0 {

    /* renamed from: a */
    public final Set<C3506a> f18888a = new HashSet();

    /* renamed from: vr0$a */
    /* compiled from: ContentUriTriggers */
    public static final class C3506a {

        /* renamed from: a */
        public final Uri f18889a;

        /* renamed from: b */
        public final boolean f18890b;

        public C3506a(Uri uri, boolean z) {
            this.f18889a = uri;
            this.f18890b = z;
        }

        /* renamed from: a */
        public Uri mo27309a() {
            return this.f18889a;
        }

        /* renamed from: b */
        public boolean mo27310b() {
            return this.f18890b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3506a.class != obj.getClass()) {
                return false;
            }
            C3506a aVar = (C3506a) obj;
            if (this.f18890b != aVar.f18890b || !this.f18889a.equals(aVar.f18889a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f18889a.hashCode() * 31) + (this.f18890b ? 1 : 0);
        }
    }

    /* renamed from: a */
    public void mo27304a(Uri uri, boolean z) {
        this.f18888a.add(new C3506a(uri, z));
    }

    /* renamed from: b */
    public Set<C3506a> mo27305b() {
        return this.f18888a;
    }

    /* renamed from: c */
    public int mo27306c() {
        return this.f18888a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vr0.class != obj.getClass()) {
            return false;
        }
        return this.f18888a.equals(((vr0) obj).f18888a);
    }

    public int hashCode() {
        return this.f18888a.hashCode();
    }
}

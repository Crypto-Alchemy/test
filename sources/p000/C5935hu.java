package p000;

import p000.av0;

/* renamed from: hu */
/* compiled from: AutoValue_CrashlyticsReport_FilesPayload */
public final class C5935hu extends av0.C3830d {

    /* renamed from: a */
    public final ms2<av0.C3830d.C3832b> f29731a;

    /* renamed from: b */
    public final String f29732b;

    /* renamed from: hu$b */
    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload */
    public static final class C5937b extends av0.C3830d.C3831a {

        /* renamed from: a */
        public ms2<av0.C3830d.C3832b> f29733a;

        /* renamed from: b */
        public String f29734b;

        /* renamed from: a */
        public av0.C3830d mo29186a() {
            String str = "";
            if (this.f29733a == null) {
                str = str + " files";
            }
            if (str.isEmpty()) {
                return new C5935hu(this.f29733a, this.f29734b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3830d.C3831a mo29187b(ms2<av0.C3830d.C3832b> ms2) {
            if (ms2 != null) {
                this.f29733a = ms2;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        /* renamed from: c */
        public av0.C3830d.C3831a mo29188c(String str) {
            this.f29734b = str;
            return this;
        }
    }

    /* renamed from: b */
    public ms2<av0.C3830d.C3832b> mo29184b() {
        return this.f29731a;
    }

    /* renamed from: c */
    public String mo29185c() {
        return this.f29732b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3830d)) {
            return false;
        }
        av0.C3830d dVar = (av0.C3830d) obj;
        if (this.f29731a.equals(dVar.mo29184b())) {
            String str = this.f29732b;
            if (str == null) {
                if (dVar.mo29185c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.mo29185c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f29731a.hashCode() ^ 1000003) * 1000003;
        String str = this.f29732b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f29731a + ", orgId=" + this.f29732b + "}";
    }

    public C5935hu(ms2<av0.C3830d.C3832b> ms2, String str) {
        this.f29731a = ms2;
        this.f29732b = str;
    }
}

package p000;

import p000.av0;

/* renamed from: qu */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage */
public final class C6424qu extends av0.C3834e.C3841d.C3842a.C3844b.C3845a {

    /* renamed from: a */
    public final long f33263a;

    /* renamed from: b */
    public final long f33264b;

    /* renamed from: c */
    public final String f33265c;

    /* renamed from: d */
    public final String f33266d;

    /* renamed from: qu$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage */
    public static final class C6426b extends av0.C3834e.C3841d.C3842a.C3844b.C3845a.C3846a {

        /* renamed from: a */
        public Long f33267a;

        /* renamed from: b */
        public Long f33268b;

        /* renamed from: c */
        public String f33269c;

        /* renamed from: d */
        public String f33270d;

        /* renamed from: a */
        public av0.C3834e.C3841d.C3842a.C3844b.C3845a mo29284a() {
            String str = "";
            if (this.f33267a == null) {
                str = str + " baseAddress";
            }
            if (this.f33268b == null) {
                str = str + " size";
            }
            if (this.f33269c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C6424qu(this.f33267a.longValue(), this.f33268b.longValue(), this.f33269c, this.f33270d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3834e.C3841d.C3842a.C3844b.C3845a.C3846a mo29285b(long j) {
            this.f33267a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public av0.C3834e.C3841d.C3842a.C3844b.C3845a.C3846a mo29286c(String str) {
            if (str != null) {
                this.f33269c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        /* renamed from: d */
        public av0.C3834e.C3841d.C3842a.C3844b.C3845a.C3846a mo29287d(long j) {
            this.f33268b = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public av0.C3834e.C3841d.C3842a.C3844b.C3845a.C3846a mo29288e(String str) {
            this.f33270d = str;
            return this;
        }
    }

    /* renamed from: b */
    public long mo29279b() {
        return this.f33263a;
    }

    /* renamed from: c */
    public String mo29280c() {
        return this.f33265c;
    }

    /* renamed from: d */
    public long mo29281d() {
        return this.f33264b;
    }

    /* renamed from: e */
    public String mo29282e() {
        return this.f33266d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3834e.C3841d.C3842a.C3844b.C3845a)) {
            return false;
        }
        av0.C3834e.C3841d.C3842a.C3844b.C3845a aVar = (av0.C3834e.C3841d.C3842a.C3844b.C3845a) obj;
        if (this.f33263a == aVar.mo29279b() && this.f33264b == aVar.mo29281d() && this.f33265c.equals(aVar.mo29280c())) {
            String str = this.f33266d;
            if (str == null) {
                if (aVar.mo29282e() == null) {
                    return true;
                }
            } else if (str.equals(aVar.mo29282e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        long j = this.f33263a;
        long j2 = this.f33264b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f33265c.hashCode()) * 1000003;
        String str = this.f33266d;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f33263a + ", size=" + this.f33264b + ", name=" + this.f33265c + ", uuid=" + this.f33266d + "}";
    }

    public C6424qu(long j, long j2, String str, String str2) {
        this.f33263a = j;
        this.f33264b = j2;
        this.f33265c = str;
        this.f33266d = str2;
    }
}

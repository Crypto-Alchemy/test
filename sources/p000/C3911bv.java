package p000;

import java.util.Map;
import p000.mt1;

/* renamed from: bv */
/* compiled from: AutoValue_EventInternal */
public final class C3911bv extends mt1 {

    /* renamed from: a */
    public final String f21483a;

    /* renamed from: b */
    public final Integer f21484b;

    /* renamed from: c */
    public final jp1 f21485c;

    /* renamed from: d */
    public final long f21486d;

    /* renamed from: e */
    public final long f21487e;

    /* renamed from: f */
    public final Map<String, String> f21488f;

    /* renamed from: bv$b */
    /* compiled from: AutoValue_EventInternal */
    public static final class C3913b extends mt1.C6257a {

        /* renamed from: a */
        public String f21489a;

        /* renamed from: b */
        public Integer f21490b;

        /* renamed from: c */
        public jp1 f21491c;

        /* renamed from: d */
        public Long f21492d;

        /* renamed from: e */
        public Long f21493e;

        /* renamed from: f */
        public Map<String, String> f21494f;

        /* renamed from: d */
        public mt1 mo29761d() {
            String str = "";
            if (this.f21489a == null) {
                str = str + " transportName";
            }
            if (this.f21491c == null) {
                str = str + " encodedPayload";
            }
            if (this.f21492d == null) {
                str = str + " eventMillis";
            }
            if (this.f21493e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f21494f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C3911bv(this.f21489a, this.f21490b, this.f21491c, this.f21492d.longValue(), this.f21493e.longValue(), this.f21494f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: e */
        public Map<String, String> mo29762e() {
            Map<String, String> map = this.f21494f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* renamed from: f */
        public mt1.C6257a mo29763f(Map<String, String> map) {
            if (map != null) {
                this.f21494f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        /* renamed from: g */
        public mt1.C6257a mo29764g(Integer num) {
            this.f21490b = num;
            return this;
        }

        /* renamed from: h */
        public mt1.C6257a mo29765h(jp1 jp1) {
            if (jp1 != null) {
                this.f21491c = jp1;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        /* renamed from: i */
        public mt1.C6257a mo29766i(long j) {
            this.f21492d = Long.valueOf(j);
            return this;
        }

        /* renamed from: j */
        public mt1.C6257a mo29767j(String str) {
            if (str != null) {
                this.f21489a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* renamed from: k */
        public mt1.C6257a mo29768k(long j) {
            this.f21493e = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: c */
    public Map<String, String> mo29752c() {
        return this.f21488f;
    }

    /* renamed from: d */
    public Integer mo29753d() {
        return this.f21484b;
    }

    /* renamed from: e */
    public jp1 mo29754e() {
        return this.f21485c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mt1)) {
            return false;
        }
        mt1 mt1 = (mt1) obj;
        if (!this.f21483a.equals(mt1.mo29758j()) || ((num = this.f21484b) != null ? !num.equals(mt1.mo29753d()) : mt1.mo29753d() != null) || !this.f21485c.equals(mt1.mo29754e()) || this.f21486d != mt1.mo29756f() || this.f21487e != mt1.mo29759k() || !this.f21488f.equals(mt1.mo29752c())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public long mo29756f() {
        return this.f21486d;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f21483a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f21484b;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        long j = this.f21486d;
        long j2 = this.f21487e;
        return ((((((((hashCode ^ i) * 1000003) ^ this.f21485c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f21488f.hashCode();
    }

    /* renamed from: j */
    public String mo29758j() {
        return this.f21483a;
    }

    /* renamed from: k */
    public long mo29759k() {
        return this.f21487e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f21483a + ", code=" + this.f21484b + ", encodedPayload=" + this.f21485c + ", eventMillis=" + this.f21486d + ", uptimeMillis=" + this.f21487e + ", autoMetadata=" + this.f21488f + "}";
    }

    public C3911bv(String str, Integer num, jp1 jp1, long j, long j2, Map<String, String> map) {
        this.f21483a = str;
        this.f21484b = num;
        this.f21485c = jp1;
        this.f21486d = j;
        this.f21487e = j2;
        this.f21488f = map;
    }
}

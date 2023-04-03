package p000;

import p000.ru5;

/* renamed from: jv */
/* compiled from: AutoValue_SendRequest */
public final class C6129jv extends ru5 {

    /* renamed from: a */
    public final hx6 f30640a;

    /* renamed from: b */
    public final String f30641b;

    /* renamed from: c */
    public final gt1<?> f30642c;

    /* renamed from: d */
    public final tw6<?, byte[]> f30643d;

    /* renamed from: e */
    public final qp1 f30644e;

    /* renamed from: jv$b */
    /* compiled from: AutoValue_SendRequest */
    public static final class C6131b extends ru5.C6457a {

        /* renamed from: a */
        public hx6 f30645a;

        /* renamed from: b */
        public String f30646b;

        /* renamed from: c */
        public gt1<?> f30647c;

        /* renamed from: d */
        public tw6<?, byte[]> f30648d;

        /* renamed from: e */
        public qp1 f30649e;

        /* renamed from: a */
        public ru5 mo44611a() {
            String str = "";
            if (this.f30645a == null) {
                str = str + " transportContext";
            }
            if (this.f30646b == null) {
                str = str + " transportName";
            }
            if (this.f30647c == null) {
                str = str + " event";
            }
            if (this.f30648d == null) {
                str = str + " transformer";
            }
            if (this.f30649e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C6129jv(this.f30645a, this.f30646b, this.f30647c, this.f30648d, this.f30649e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public ru5.C6457a mo44612b(qp1 qp1) {
            if (qp1 != null) {
                this.f30649e = qp1;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* renamed from: c */
        public ru5.C6457a mo44613c(gt1<?> gt1) {
            if (gt1 != null) {
                this.f30647c = gt1;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* renamed from: d */
        public ru5.C6457a mo44614d(tw6<?, byte[]> tw6) {
            if (tw6 != null) {
                this.f30648d = tw6;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        /* renamed from: e */
        public ru5.C6457a mo44615e(hx6 hx6) {
            if (hx6 != null) {
                this.f30645a = hx6;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        /* renamed from: f */
        public ru5.C6457a mo44616f(String str) {
            if (str != null) {
                this.f30646b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    /* renamed from: b */
    public qp1 mo44603b() {
        return this.f30644e;
    }

    /* renamed from: c */
    public gt1<?> mo44604c() {
        return this.f30642c;
    }

    /* renamed from: e */
    public tw6<?, byte[]> mo44605e() {
        return this.f30643d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ru5)) {
            return false;
        }
        ru5 ru5 = (ru5) obj;
        if (!this.f30640a.equals(ru5.mo44607f()) || !this.f30641b.equals(ru5.mo44608g()) || !this.f30642c.equals(ru5.mo44604c()) || !this.f30643d.equals(ru5.mo44605e()) || !this.f30644e.equals(ru5.mo44603b())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public hx6 mo44607f() {
        return this.f30640a;
    }

    /* renamed from: g */
    public String mo44608g() {
        return this.f30641b;
    }

    public int hashCode() {
        return ((((((((this.f30640a.hashCode() ^ 1000003) * 1000003) ^ this.f30641b.hashCode()) * 1000003) ^ this.f30642c.hashCode()) * 1000003) ^ this.f30643d.hashCode()) * 1000003) ^ this.f30644e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f30640a + ", transportName=" + this.f30641b + ", event=" + this.f30642c + ", transformer=" + this.f30643d + ", encoding=" + this.f30644e + "}";
    }

    public C6129jv(hx6 hx6, String str, gt1<?> gt1, tw6<?, byte[]> tw6, qp1 qp1) {
        this.f30640a = hx6;
        this.f30641b = str;
        this.f30642c = gt1;
        this.f30643d = tw6;
        this.f30644e = qp1;
    }
}

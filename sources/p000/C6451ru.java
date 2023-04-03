package p000;

import p000.av0;

/* renamed from: ru */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception */
public final class C6451ru extends av0.C3834e.C3841d.C3842a.C3844b.C3848c {

    /* renamed from: a */
    public final String f33582a;

    /* renamed from: b */
    public final String f33583b;

    /* renamed from: c */
    public final ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b> f33584c;

    /* renamed from: d */
    public final av0.C3834e.C3841d.C3842a.C3844b.C3848c f33585d;

    /* renamed from: e */
    public final int f33586e;

    /* renamed from: ru$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception */
    public static final class C6453b extends av0.C3834e.C3841d.C3842a.C3844b.C3848c.C3849a {

        /* renamed from: a */
        public String f33587a;

        /* renamed from: b */
        public String f33588b;

        /* renamed from: c */
        public ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b> f33589c;

        /* renamed from: d */
        public av0.C3834e.C3841d.C3842a.C3844b.C3848c f33590d;

        /* renamed from: e */
        public Integer f33591e;

        /* renamed from: a */
        public av0.C3834e.C3841d.C3842a.C3844b.C3848c mo29301a() {
            String str = "";
            if (this.f33587a == null) {
                str = str + " type";
            }
            if (this.f33589c == null) {
                str = str + " frames";
            }
            if (this.f33591e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C6451ru(this.f33587a, this.f33588b, this.f33589c, this.f33590d, this.f33591e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3834e.C3841d.C3842a.C3844b.C3848c.C3849a mo29302b(av0.C3834e.C3841d.C3842a.C3844b.C3848c cVar) {
            this.f33590d = cVar;
            return this;
        }

        /* renamed from: c */
        public av0.C3834e.C3841d.C3842a.C3844b.C3848c.C3849a mo29303c(ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b> ms2) {
            if (ms2 != null) {
                this.f33589c = ms2;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        /* renamed from: d */
        public av0.C3834e.C3841d.C3842a.C3844b.C3848c.C3849a mo29304d(int i) {
            this.f33591e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public av0.C3834e.C3841d.C3842a.C3844b.C3848c.C3849a mo29305e(String str) {
            this.f33588b = str;
            return this;
        }

        /* renamed from: f */
        public av0.C3834e.C3841d.C3842a.C3844b.C3848c.C3849a mo29306f(String str) {
            if (str != null) {
                this.f33587a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    /* renamed from: b */
    public av0.C3834e.C3841d.C3842a.C3844b.C3848c mo29296b() {
        return this.f33585d;
    }

    /* renamed from: c */
    public ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b> mo29297c() {
        return this.f33584c;
    }

    /* renamed from: d */
    public int mo29298d() {
        return this.f33586e;
    }

    /* renamed from: e */
    public String mo29299e() {
        return this.f33583b;
    }

    public boolean equals(Object obj) {
        String str;
        av0.C3834e.C3841d.C3842a.C3844b.C3848c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3834e.C3841d.C3842a.C3844b.C3848c)) {
            return false;
        }
        av0.C3834e.C3841d.C3842a.C3844b.C3848c cVar2 = (av0.C3834e.C3841d.C3842a.C3844b.C3848c) obj;
        if (!this.f33582a.equals(cVar2.mo29300f()) || ((str = this.f33583b) != null ? !str.equals(cVar2.mo29299e()) : cVar2.mo29299e() != null) || !this.f33584c.equals(cVar2.mo29297c()) || ((cVar = this.f33585d) != null ? !cVar.equals(cVar2.mo29296b()) : cVar2.mo29296b() != null) || this.f33586e != cVar2.mo29298d()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo29300f() {
        return this.f33582a;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f33582a.hashCode() ^ 1000003) * 1000003;
        String str = this.f33583b;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.f33584c.hashCode()) * 1000003;
        av0.C3834e.C3841d.C3842a.C3844b.C3848c cVar = this.f33585d;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.f33586e;
    }

    public String toString() {
        return "Exception{type=" + this.f33582a + ", reason=" + this.f33583b + ", frames=" + this.f33584c + ", causedBy=" + this.f33585d + ", overflowCount=" + this.f33586e + "}";
    }

    public C6451ru(String str, String str2, ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b> ms2, av0.C3834e.C3841d.C3842a.C3844b.C3848c cVar, int i) {
        this.f33582a = str;
        this.f33583b = str2;
        this.f33584c = ms2;
        this.f33585d = cVar;
        this.f33586e = i;
    }
}

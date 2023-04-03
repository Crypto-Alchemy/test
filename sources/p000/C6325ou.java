package p000;

import p000.av0;

/* renamed from: ou */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application */
public final class C6325ou extends av0.C3834e.C3841d.C3842a {

    /* renamed from: a */
    public final av0.C3834e.C3841d.C3842a.C3844b f32437a;

    /* renamed from: b */
    public final ms2<av0.C3828c> f32438b;

    /* renamed from: c */
    public final ms2<av0.C3828c> f32439c;

    /* renamed from: d */
    public final Boolean f32440d;

    /* renamed from: e */
    public final int f32441e;

    /* renamed from: ou$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application */
    public static final class C6327b extends av0.C3834e.C3841d.C3842a.C3843a {

        /* renamed from: a */
        public av0.C3834e.C3841d.C3842a.C3844b f32442a;

        /* renamed from: b */
        public ms2<av0.C3828c> f32443b;

        /* renamed from: c */
        public ms2<av0.C3828c> f32444c;

        /* renamed from: d */
        public Boolean f32445d;

        /* renamed from: e */
        public Integer f32446e;

        /* renamed from: a */
        public av0.C3834e.C3841d.C3842a mo29268a() {
            String str = "";
            if (this.f32442a == null) {
                str = str + " execution";
            }
            if (this.f32446e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C6325ou(this.f32442a, this.f32443b, this.f32444c, this.f32445d, this.f32446e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3834e.C3841d.C3842a.C3843a mo29269b(Boolean bool) {
            this.f32445d = bool;
            return this;
        }

        /* renamed from: c */
        public av0.C3834e.C3841d.C3842a.C3843a mo29270c(ms2<av0.C3828c> ms2) {
            this.f32443b = ms2;
            return this;
        }

        /* renamed from: d */
        public av0.C3834e.C3841d.C3842a.C3843a mo29271d(av0.C3834e.C3841d.C3842a.C3844b bVar) {
            if (bVar != null) {
                this.f32442a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        /* renamed from: e */
        public av0.C3834e.C3841d.C3842a.C3843a mo29272e(ms2<av0.C3828c> ms2) {
            this.f32444c = ms2;
            return this;
        }

        /* renamed from: f */
        public av0.C3834e.C3841d.C3842a.C3843a mo29273f(int i) {
            this.f32446e = Integer.valueOf(i);
            return this;
        }

        public C6327b() {
        }

        public C6327b(av0.C3834e.C3841d.C3842a aVar) {
            this.f32442a = aVar.mo29264d();
            this.f32443b = aVar.mo29263c();
            this.f32444c = aVar.mo29265e();
            this.f32445d = aVar.mo29262b();
            this.f32446e = Integer.valueOf(aVar.mo29266f());
        }
    }

    /* renamed from: b */
    public Boolean mo29262b() {
        return this.f32440d;
    }

    /* renamed from: c */
    public ms2<av0.C3828c> mo29263c() {
        return this.f32438b;
    }

    /* renamed from: d */
    public av0.C3834e.C3841d.C3842a.C3844b mo29264d() {
        return this.f32437a;
    }

    /* renamed from: e */
    public ms2<av0.C3828c> mo29265e() {
        return this.f32439c;
    }

    public boolean equals(Object obj) {
        ms2<av0.C3828c> ms2;
        ms2<av0.C3828c> ms22;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3834e.C3841d.C3842a)) {
            return false;
        }
        av0.C3834e.C3841d.C3842a aVar = (av0.C3834e.C3841d.C3842a) obj;
        if (!this.f32437a.equals(aVar.mo29264d()) || ((ms2 = this.f32438b) != null ? !ms2.equals(aVar.mo29263c()) : aVar.mo29263c() != null) || ((ms22 = this.f32439c) != null ? !ms22.equals(aVar.mo29265e()) : aVar.mo29265e() != null) || ((bool = this.f32440d) != null ? !bool.equals(aVar.mo29262b()) : aVar.mo29262b() != null) || this.f32441e != aVar.mo29266f()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo29266f() {
        return this.f32441e;
    }

    /* renamed from: g */
    public av0.C3834e.C3841d.C3842a.C3843a mo29267g() {
        return new C6327b(this);
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = (this.f32437a.hashCode() ^ 1000003) * 1000003;
        ms2<av0.C3828c> ms2 = this.f32438b;
        int i3 = 0;
        if (ms2 == null) {
            i = 0;
        } else {
            i = ms2.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        ms2<av0.C3828c> ms22 = this.f32439c;
        if (ms22 == null) {
            i2 = 0;
        } else {
            i2 = ms22.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        Boolean bool = this.f32440d;
        if (bool != null) {
            i3 = bool.hashCode();
        }
        return ((i5 ^ i3) * 1000003) ^ this.f32441e;
    }

    public String toString() {
        return "Application{execution=" + this.f32437a + ", customAttributes=" + this.f32438b + ", internalKeys=" + this.f32439c + ", background=" + this.f32440d + ", uiOrientation=" + this.f32441e + "}";
    }

    public C6325ou(av0.C3834e.C3841d.C3842a.C3844b bVar, ms2<av0.C3828c> ms2, ms2<av0.C3828c> ms22, Boolean bool, int i) {
        this.f32437a = bVar;
        this.f32438b = ms2;
        this.f32439c = ms22;
        this.f32440d = bool;
        this.f32441e = i;
    }
}

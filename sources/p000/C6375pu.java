package p000;

import p000.av0;

/* renamed from: pu */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution */
public final class C6375pu extends av0.C3834e.C3841d.C3842a.C3844b {

    /* renamed from: a */
    public final ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e> f32819a;

    /* renamed from: b */
    public final av0.C3834e.C3841d.C3842a.C3844b.C3848c f32820b;

    /* renamed from: c */
    public final av0.C3825a f32821c;

    /* renamed from: d */
    public final av0.C3834e.C3841d.C3842a.C3844b.C3850d f32822d;

    /* renamed from: e */
    public final ms2<av0.C3834e.C3841d.C3842a.C3844b.C3845a> f32823e;

    /* renamed from: pu$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution */
    public static final class C6377b extends av0.C3834e.C3841d.C3842a.C3844b.C3847b {

        /* renamed from: a */
        public ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e> f32824a;

        /* renamed from: b */
        public av0.C3834e.C3841d.C3842a.C3844b.C3848c f32825b;

        /* renamed from: c */
        public av0.C3825a f32826c;

        /* renamed from: d */
        public av0.C3834e.C3841d.C3842a.C3844b.C3850d f32827d;

        /* renamed from: e */
        public ms2<av0.C3834e.C3841d.C3842a.C3844b.C3845a> f32828e;

        /* renamed from: a */
        public av0.C3834e.C3841d.C3842a.C3844b mo29290a() {
            String str = "";
            if (this.f32827d == null) {
                str = str + " signal";
            }
            if (this.f32828e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C6375pu(this.f32824a, this.f32825b, this.f32826c, this.f32827d, this.f32828e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3834e.C3841d.C3842a.C3844b.C3847b mo29291b(av0.C3825a aVar) {
            this.f32826c = aVar;
            return this;
        }

        /* renamed from: c */
        public av0.C3834e.C3841d.C3842a.C3844b.C3847b mo29292c(ms2<av0.C3834e.C3841d.C3842a.C3844b.C3845a> ms2) {
            if (ms2 != null) {
                this.f32828e = ms2;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        /* renamed from: d */
        public av0.C3834e.C3841d.C3842a.C3844b.C3847b mo29293d(av0.C3834e.C3841d.C3842a.C3844b.C3848c cVar) {
            this.f32825b = cVar;
            return this;
        }

        /* renamed from: e */
        public av0.C3834e.C3841d.C3842a.C3844b.C3847b mo29294e(av0.C3834e.C3841d.C3842a.C3844b.C3850d dVar) {
            if (dVar != null) {
                this.f32827d = dVar;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        /* renamed from: f */
        public av0.C3834e.C3841d.C3842a.C3844b.C3847b mo29295f(ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e> ms2) {
            this.f32824a = ms2;
            return this;
        }
    }

    /* renamed from: b */
    public av0.C3825a mo29274b() {
        return this.f32821c;
    }

    /* renamed from: c */
    public ms2<av0.C3834e.C3841d.C3842a.C3844b.C3845a> mo29275c() {
        return this.f32823e;
    }

    /* renamed from: d */
    public av0.C3834e.C3841d.C3842a.C3844b.C3848c mo29276d() {
        return this.f32820b;
    }

    /* renamed from: e */
    public av0.C3834e.C3841d.C3842a.C3844b.C3850d mo29277e() {
        return this.f32822d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3834e.C3841d.C3842a.C3844b)) {
            return false;
        }
        av0.C3834e.C3841d.C3842a.C3844b bVar = (av0.C3834e.C3841d.C3842a.C3844b) obj;
        ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e> ms2 = this.f32819a;
        if (ms2 != null ? ms2.equals(bVar.mo29278f()) : bVar.mo29278f() == null) {
            av0.C3834e.C3841d.C3842a.C3844b.C3848c cVar = this.f32820b;
            if (cVar != null ? cVar.equals(bVar.mo29276d()) : bVar.mo29276d() == null) {
                av0.C3825a aVar = this.f32821c;
                if (aVar != null ? aVar.equals(bVar.mo29274b()) : bVar.mo29274b() == null) {
                    if (this.f32822d.equals(bVar.mo29277e()) && this.f32823e.equals(bVar.mo29275c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e> mo29278f() {
        return this.f32819a;
    }

    public int hashCode() {
        int i;
        int i2;
        ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e> ms2 = this.f32819a;
        int i3 = 0;
        if (ms2 == null) {
            i = 0;
        } else {
            i = ms2.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        av0.C3834e.C3841d.C3842a.C3844b.C3848c cVar = this.f32820b;
        if (cVar == null) {
            i2 = 0;
        } else {
            i2 = cVar.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        av0.C3825a aVar = this.f32821c;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        return ((((i5 ^ i3) * 1000003) ^ this.f32822d.hashCode()) * 1000003) ^ this.f32823e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f32819a + ", exception=" + this.f32820b + ", appExitInfo=" + this.f32821c + ", signal=" + this.f32822d + ", binaries=" + this.f32823e + "}";
    }

    public C6375pu(ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e> ms2, av0.C3834e.C3841d.C3842a.C3844b.C3848c cVar, av0.C3825a aVar, av0.C3834e.C3841d.C3842a.C3844b.C3850d dVar, ms2<av0.C3834e.C3841d.C3842a.C3844b.C3845a> ms22) {
        this.f32819a = ms2;
        this.f32820b = cVar;
        this.f32821c = aVar;
        this.f32822d = dVar;
        this.f32823e = ms22;
    }
}

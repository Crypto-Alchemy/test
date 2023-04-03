package p000;

import p000.av0;

/* renamed from: ju */
/* compiled from: AutoValue_CrashlyticsReport_Session */
public final class C6125ju extends av0.C3834e {

    /* renamed from: a */
    public final String f30617a;

    /* renamed from: b */
    public final String f30618b;

    /* renamed from: c */
    public final long f30619c;

    /* renamed from: d */
    public final Long f30620d;

    /* renamed from: e */
    public final boolean f30621e;

    /* renamed from: f */
    public final av0.C3834e.C3835a f30622f;

    /* renamed from: g */
    public final av0.C3834e.C3863f f30623g;

    /* renamed from: h */
    public final av0.C3834e.C3861e f30624h;

    /* renamed from: i */
    public final av0.C3834e.C3839c f30625i;

    /* renamed from: j */
    public final ms2<av0.C3834e.C3841d> f30626j;

    /* renamed from: k */
    public final int f30627k;

    /* renamed from: ju$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session */
    public static final class C6127b extends av0.C3834e.C3838b {

        /* renamed from: a */
        public String f30628a;

        /* renamed from: b */
        public String f30629b;

        /* renamed from: c */
        public Long f30630c;

        /* renamed from: d */
        public Long f30631d;

        /* renamed from: e */
        public Boolean f30632e;

        /* renamed from: f */
        public av0.C3834e.C3835a f30633f;

        /* renamed from: g */
        public av0.C3834e.C3863f f30634g;

        /* renamed from: h */
        public av0.C3834e.C3861e f30635h;

        /* renamed from: i */
        public av0.C3834e.C3839c f30636i;

        /* renamed from: j */
        public ms2<av0.C3834e.C3841d> f30637j;

        /* renamed from: k */
        public Integer f30638k;

        /* renamed from: a */
        public av0.C3834e mo29224a() {
            String str = "";
            if (this.f30628a == null) {
                str = str + " generator";
            }
            if (this.f30629b == null) {
                str = str + " identifier";
            }
            if (this.f30630c == null) {
                str = str + " startedAt";
            }
            if (this.f30632e == null) {
                str = str + " crashed";
            }
            if (this.f30633f == null) {
                str = str + " app";
            }
            if (this.f30638k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new C6125ju(this.f30628a, this.f30629b, this.f30630c.longValue(), this.f30631d, this.f30632e.booleanValue(), this.f30633f, this.f30634g, this.f30635h, this.f30636i, this.f30637j, this.f30638k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3834e.C3838b mo29225b(av0.C3834e.C3835a aVar) {
            if (aVar != null) {
                this.f30633f = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        /* renamed from: c */
        public av0.C3834e.C3838b mo29226c(boolean z) {
            this.f30632e = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public av0.C3834e.C3838b mo29227d(av0.C3834e.C3839c cVar) {
            this.f30636i = cVar;
            return this;
        }

        /* renamed from: e */
        public av0.C3834e.C3838b mo29228e(Long l) {
            this.f30631d = l;
            return this;
        }

        /* renamed from: f */
        public av0.C3834e.C3838b mo29229f(ms2<av0.C3834e.C3841d> ms2) {
            this.f30637j = ms2;
            return this;
        }

        /* renamed from: g */
        public av0.C3834e.C3838b mo29230g(String str) {
            if (str != null) {
                this.f30628a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        /* renamed from: h */
        public av0.C3834e.C3838b mo29231h(int i) {
            this.f30638k = Integer.valueOf(i);
            return this;
        }

        /* renamed from: i */
        public av0.C3834e.C3838b mo29232i(String str) {
            if (str != null) {
                this.f30629b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        /* renamed from: k */
        public av0.C3834e.C3838b mo29234k(av0.C3834e.C3861e eVar) {
            this.f30635h = eVar;
            return this;
        }

        /* renamed from: l */
        public av0.C3834e.C3838b mo29235l(long j) {
            this.f30630c = Long.valueOf(j);
            return this;
        }

        /* renamed from: m */
        public av0.C3834e.C3838b mo29236m(av0.C3834e.C3863f fVar) {
            this.f30634g = fVar;
            return this;
        }

        public C6127b() {
        }

        public C6127b(av0.C3834e eVar) {
            this.f30628a = eVar.mo29198f();
            this.f30629b = eVar.mo29200h();
            this.f30630c = Long.valueOf(eVar.mo29203k());
            this.f30631d = eVar.mo29196d();
            this.f30632e = Boolean.valueOf(eVar.mo29205m());
            this.f30633f = eVar.mo29194b();
            this.f30634g = eVar.mo29204l();
            this.f30635h = eVar.mo29202j();
            this.f30636i = eVar.mo29195c();
            this.f30637j = eVar.mo29197e();
            this.f30638k = Integer.valueOf(eVar.mo29199g());
        }
    }

    /* renamed from: b */
    public av0.C3834e.C3835a mo29194b() {
        return this.f30622f;
    }

    /* renamed from: c */
    public av0.C3834e.C3839c mo29195c() {
        return this.f30625i;
    }

    /* renamed from: d */
    public Long mo29196d() {
        return this.f30620d;
    }

    /* renamed from: e */
    public ms2<av0.C3834e.C3841d> mo29197e() {
        return this.f30626j;
    }

    public boolean equals(Object obj) {
        Long l;
        av0.C3834e.C3863f fVar;
        av0.C3834e.C3861e eVar;
        av0.C3834e.C3839c cVar;
        ms2<av0.C3834e.C3841d> ms2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3834e)) {
            return false;
        }
        av0.C3834e eVar2 = (av0.C3834e) obj;
        if (!this.f30617a.equals(eVar2.mo29198f()) || !this.f30618b.equals(eVar2.mo29200h()) || this.f30619c != eVar2.mo29203k() || ((l = this.f30620d) != null ? !l.equals(eVar2.mo29196d()) : eVar2.mo29196d() != null) || this.f30621e != eVar2.mo29205m() || !this.f30622f.equals(eVar2.mo29194b()) || ((fVar = this.f30623g) != null ? !fVar.equals(eVar2.mo29204l()) : eVar2.mo29204l() != null) || ((eVar = this.f30624h) != null ? !eVar.equals(eVar2.mo29202j()) : eVar2.mo29202j() != null) || ((cVar = this.f30625i) != null ? !cVar.equals(eVar2.mo29195c()) : eVar2.mo29195c() != null) || ((ms2 = this.f30626j) != null ? !ms2.equals(eVar2.mo29197e()) : eVar2.mo29197e() != null) || this.f30627k != eVar2.mo29199g()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo29198f() {
        return this.f30617a;
    }

    /* renamed from: g */
    public int mo29199g() {
        return this.f30627k;
    }

    /* renamed from: h */
    public String mo29200h() {
        return this.f30618b;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j = this.f30619c;
        int hashCode = (((((this.f30617a.hashCode() ^ 1000003) * 1000003) ^ this.f30618b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f30620d;
        int i6 = 0;
        if (l == null) {
            i = 0;
        } else {
            i = l.hashCode();
        }
        int i7 = (hashCode ^ i) * 1000003;
        if (this.f30621e) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int hashCode2 = (((i7 ^ i2) * 1000003) ^ this.f30622f.hashCode()) * 1000003;
        av0.C3834e.C3863f fVar = this.f30623g;
        if (fVar == null) {
            i3 = 0;
        } else {
            i3 = fVar.hashCode();
        }
        int i8 = (hashCode2 ^ i3) * 1000003;
        av0.C3834e.C3861e eVar = this.f30624h;
        if (eVar == null) {
            i4 = 0;
        } else {
            i4 = eVar.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        av0.C3834e.C3839c cVar = this.f30625i;
        if (cVar == null) {
            i5 = 0;
        } else {
            i5 = cVar.hashCode();
        }
        int i10 = (i9 ^ i5) * 1000003;
        ms2<av0.C3834e.C3841d> ms2 = this.f30626j;
        if (ms2 != null) {
            i6 = ms2.hashCode();
        }
        return ((i10 ^ i6) * 1000003) ^ this.f30627k;
    }

    /* renamed from: j */
    public av0.C3834e.C3861e mo29202j() {
        return this.f30624h;
    }

    /* renamed from: k */
    public long mo29203k() {
        return this.f30619c;
    }

    /* renamed from: l */
    public av0.C3834e.C3863f mo29204l() {
        return this.f30623g;
    }

    /* renamed from: m */
    public boolean mo29205m() {
        return this.f30621e;
    }

    /* renamed from: n */
    public av0.C3834e.C3838b mo29206n() {
        return new C6127b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f30617a + ", identifier=" + this.f30618b + ", startedAt=" + this.f30619c + ", endedAt=" + this.f30620d + ", crashed=" + this.f30621e + ", app=" + this.f30622f + ", user=" + this.f30623g + ", os=" + this.f30624h + ", device=" + this.f30625i + ", events=" + this.f30626j + ", generatorType=" + this.f30627k + "}";
    }

    public C6125ju(String str, String str2, long j, Long l, boolean z, av0.C3834e.C3835a aVar, av0.C3834e.C3863f fVar, av0.C3834e.C3861e eVar, av0.C3834e.C3839c cVar, ms2<av0.C3834e.C3841d> ms2, int i) {
        this.f30617a = str;
        this.f30618b = str2;
        this.f30619c = j;
        this.f30620d = l;
        this.f30621e = z;
        this.f30622f = aVar;
        this.f30623g = fVar;
        this.f30624h = eVar;
        this.f30625i = cVar;
        this.f30626j = ms2;
        this.f30627k = i;
    }
}

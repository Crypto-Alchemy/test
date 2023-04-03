package p000;

/* renamed from: hm */
/* compiled from: AnnotationsTypeAttribute.kt */
public final class C7185hm extends oz6<C7185hm> {

    /* renamed from: a */
    public final C6983dm f38234a;

    public C7185hm(C6983dm dmVar) {
        vx2.m53591g(dmVar, "annotations");
        this.f38234a = dmVar;
    }

    /* renamed from: b */
    public q83<? extends C7185hm> mo52237b() {
        return ua5.m52727b(C7185hm.class);
    }

    /* renamed from: d */
    public C7185hm mo52236a(C7185hm hmVar) {
        if (hmVar == null) {
            return this;
        }
        return new C7185hm(C7133gm.m58141a(this.f38234a, hmVar.f38234a));
    }

    /* renamed from: e */
    public final C6983dm mo52240e() {
        return this.f38234a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7185hm)) {
            return false;
        }
        return vx2.m53586b(((C7185hm) obj).f38234a, this.f38234a);
    }

    /* renamed from: f */
    public C7185hm mo52238c(C7185hm hmVar) {
        if (vx2.m53586b(hmVar, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f38234a.hashCode();
    }
}

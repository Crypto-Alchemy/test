package p000;

/* renamed from: rd1 */
/* compiled from: DeserializedClassDataFinder.kt */
public final class rd1 implements hf0 {

    /* renamed from: a */
    public final hk4 f44348a;

    public rd1(hk4 hk4) {
        vx2.m53591g(hk4, "packageFragmentProvider");
        this.f44348a = hk4;
    }

    /* renamed from: a */
    public gf0 mo52195a(nf0 nf0) {
        gf0 a;
        vx2.m53591g(nf0, "classId");
        hk4 hk4 = this.f44348a;
        u82 h = nf0.mo62678h();
        vx2.m53590f(h, "classId.packageFqName");
        for (fk4 next : ik4.m58997c(hk4, h)) {
            if ((next instanceof vd1) && (a = ((vd1) next).mo55125A0().mo52195a(nf0)) != null) {
                return a;
            }
        }
        return null;
    }
}

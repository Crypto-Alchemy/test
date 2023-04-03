package p000;

/* renamed from: pb1 */
/* compiled from: DescriptorVisibility.kt */
public abstract class pb1 extends fd1 {

    /* renamed from: a */
    public final if7 f44021a;

    public pb1(if7 if7) {
        vx2.m53591g(if7, "delegate");
        this.f44021a = if7;
    }

    /* renamed from: b */
    public if7 mo51641b() {
        return this.f44021a;
    }

    /* renamed from: c */
    public String mo51642c() {
        return mo51641b().mo52198b();
    }

    /* renamed from: f */
    public fd1 mo51644f() {
        fd1 j = ed1.m57285j(mo51641b().mo52470d());
        vx2.m53590f(j, "toDescriptorVisibility(delegate.normalize())");
        return j;
    }
}

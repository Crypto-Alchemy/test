package p000;

/* renamed from: x96 */
/* compiled from: StopLogic */
public class x96 extends sy3 {

    /* renamed from: a */
    public y96 f19784a;

    /* renamed from: b */
    public j76 f19785b;

    /* renamed from: c */
    public w96 f19786c;

    public x96() {
        y96 y96 = new y96();
        this.f19784a = y96;
        this.f19786c = y96;
    }

    /* renamed from: a */
    public float mo4741a() {
        return this.f19786c.mo21788a();
    }

    /* renamed from: b */
    public void mo27712b(float f, float f2, float f3, float f4, float f5, float f6) {
        y96 y96 = this.f19784a;
        this.f19786c = y96;
        y96.mo28008d(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: c */
    public boolean mo27713c() {
        return this.f19786c.mo21789b();
    }

    /* renamed from: d */
    public void mo27714d(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (this.f19785b == null) {
            this.f19785b = new j76();
        }
        j76 j76 = this.f19785b;
        this.f19786c = j76;
        j76.mo21791d(f, f2, f3, f4, f5, f6, f7, i);
    }

    public float getInterpolation(float f) {
        return this.f19786c.getInterpolation(f);
    }
}

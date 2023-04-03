package p000;

/* renamed from: go3 */
/* compiled from: MarkerEdgeTreatment */
public final class go3 extends mn1 {

    /* renamed from: a */
    public final float f29322a;

    public go3(float f) {
        this.f29322a = f - 0.001f;
    }

    /* renamed from: a */
    public boolean mo42934a() {
        return true;
    }

    /* renamed from: b */
    public void mo42935b(float f, float f2, float f3, uz5 uz5) {
        float sqrt = (float) ((((double) this.f29322a) * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.f29322a, 2.0d) - Math.pow((double) sqrt, 2.0d));
        uz5.mo48566n(f2 - sqrt, ((float) (-((((double) this.f29322a) * Math.sqrt(2.0d)) - ((double) this.f29322a)))) + sqrt2);
        uz5.mo48565m(f2, (float) (-((((double) this.f29322a) * Math.sqrt(2.0d)) - ((double) this.f29322a))));
        uz5.mo48565m(f2 + sqrt, ((float) (-((((double) this.f29322a) * Math.sqrt(2.0d)) - ((double) this.f29322a)))) + sqrt2);
    }
}

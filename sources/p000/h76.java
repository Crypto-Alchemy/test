package p000;

import com.github.mikephil.charting.utils.Utils;
import p000.kl1;

/* renamed from: h76 */
/* compiled from: SpringAnimation */
public final class h76 extends kl1<h76> {

    /* renamed from: A */
    public i76 f12760A = null;

    /* renamed from: B */
    public float f12761B = Float.MAX_VALUE;

    /* renamed from: C */
    public boolean f12762C = false;

    public <K> h76(K k, s42<K> s42) {
        super(k, s42);
    }

    /* renamed from: j */
    public void mo20975j() {
        mo20979o();
        this.f12760A.mo21480g((double) mo22348e());
        super.mo20975j();
    }

    /* renamed from: l */
    public boolean mo20976l(long j) {
        if (this.f12762C) {
            float f = this.f12761B;
            if (f != Float.MAX_VALUE) {
                this.f12760A.mo21478e(f);
                this.f12761B = Float.MAX_VALUE;
            }
            this.f14160b = this.f12760A.mo21474a();
            this.f14159a = Utils.FLOAT_EPSILON;
            this.f12762C = false;
            return true;
        }
        if (this.f12761B != Float.MAX_VALUE) {
            this.f12760A.mo21474a();
            long j2 = j / 2;
            kl1.C2703o h = this.f12760A.mo21481h((double) this.f14160b, (double) this.f14159a, j2);
            this.f12760A.mo21478e(this.f12761B);
            this.f12761B = Float.MAX_VALUE;
            kl1.C2703o h2 = this.f12760A.mo21481h((double) h.f14171a, (double) h.f14172b, j2);
            this.f14160b = h2.f14171a;
            this.f14159a = h2.f14172b;
        } else {
            kl1.C2703o h3 = this.f12760A.mo21481h((double) this.f14160b, (double) this.f14159a, j);
            this.f14160b = h3.f14171a;
            this.f14159a = h3.f14172b;
        }
        float max = Math.max(this.f14160b, this.f14166h);
        this.f14160b = max;
        float min = Math.min(max, this.f14165g);
        this.f14160b = min;
        if (!mo20978n(min, this.f14159a)) {
            return false;
        }
        this.f14160b = this.f12760A.mo21474a();
        this.f14159a = Utils.FLOAT_EPSILON;
        return true;
    }

    /* renamed from: m */
    public void mo20977m(float f) {
        if (mo22349f()) {
            this.f12761B = f;
            return;
        }
        if (this.f12760A == null) {
            this.f12760A = new i76(f);
        }
        this.f12760A.mo21478e(f);
        mo20975j();
    }

    /* renamed from: n */
    public boolean mo20978n(float f, float f2) {
        return this.f12760A.mo21476c(f, f2);
    }

    /* renamed from: o */
    public final void mo20979o() {
        i76 i76 = this.f12760A;
        if (i76 != null) {
            double a = (double) i76.mo21474a();
            if (a > ((double) this.f14165g)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (a < ((double) this.f14166h)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    /* renamed from: p */
    public h76 mo20980p(i76 i76) {
        this.f12760A = i76;
        return this;
    }
}

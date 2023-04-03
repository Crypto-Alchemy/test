package p000;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: y87 */
/* compiled from: VelocityMatrix */
public class y87 {

    /* renamed from: a */
    public float f20092a;

    /* renamed from: b */
    public float f20093b;

    /* renamed from: c */
    public float f20094c;

    /* renamed from: d */
    public float f20095d;

    /* renamed from: e */
    public float f20096e;

    /* renamed from: f */
    public float f20097f;

    /* renamed from: a */
    public void mo27987a(float f, float f2, int i, int i2, float[] fArr) {
        int i3 = i;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f20094c;
        float f8 = f4 + this.f20095d;
        float f9 = f7 + (this.f20092a * f5);
        float f10 = f8 + (this.f20093b * f6);
        float radians = (float) Math.toRadians((double) this.f20096e);
        double radians2 = (double) ((float) Math.toRadians((double) this.f20097f));
        double d = (double) (((float) i2) * f6);
        fArr[0] = f9 + (((float) ((((double) (((float) (-i3)) * f5)) * Math.sin(radians2)) - (Math.cos(radians2) * d))) * radians);
        fArr[1] = f10 + (radians * ((float) ((((double) (((float) i3) * f5)) * Math.cos(radians2)) - (d * Math.sin(radians2)))));
    }

    /* renamed from: b */
    public void mo27988b() {
        this.f20096e = Utils.FLOAT_EPSILON;
        this.f20095d = Utils.FLOAT_EPSILON;
        this.f20094c = Utils.FLOAT_EPSILON;
        this.f20093b = Utils.FLOAT_EPSILON;
        this.f20092a = Utils.FLOAT_EPSILON;
    }

    /* renamed from: c */
    public void mo27989c(ga3 ga3, float f) {
        if (ga3 != null) {
            this.f20096e = ga3.mo20441b(f);
        }
    }

    /* renamed from: d */
    public void mo27990d(v66 v66, float f) {
        if (v66 != null) {
            this.f20096e = v66.mo27075b(f);
            this.f20097f = v66.mo27074a(f);
        }
    }

    /* renamed from: e */
    public void mo27991e(ga3 ga3, ga3 ga32, float f) {
        if (ga3 != null) {
            this.f20092a = ga3.mo20441b(f);
        }
        if (ga32 != null) {
            this.f20093b = ga32.mo20441b(f);
        }
    }

    /* renamed from: f */
    public void mo27992f(v66 v66, v66 v662, float f) {
        if (v66 != null) {
            this.f20092a = v66.mo27075b(f);
        }
        if (v662 != null) {
            this.f20093b = v662.mo27075b(f);
        }
    }

    /* renamed from: g */
    public void mo27993g(ga3 ga3, ga3 ga32, float f) {
        if (ga3 != null) {
            this.f20094c = ga3.mo20441b(f);
        }
        if (ga32 != null) {
            this.f20095d = ga32.mo20441b(f);
        }
    }

    /* renamed from: h */
    public void mo27994h(v66 v66, v66 v662, float f) {
        if (v66 != null) {
            this.f20094c = v66.mo27075b(f);
        }
        if (v662 != null) {
            this.f20095d = v662.mo27075b(f);
        }
    }
}

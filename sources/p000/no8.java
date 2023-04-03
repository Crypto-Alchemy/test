package p000;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: no8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class no8 {

    /* renamed from: a */
    public final o98 f32163a;

    /* renamed from: b */
    public final ps8 f32164b;

    /* renamed from: c */
    public final ps8 f32165c;

    /* renamed from: d */
    public final c19 f32166d;

    public no8() {
        o98 o98 = new o98();
        this.f32163a = o98;
        ps8 ps8 = new ps8((ps8) null, o98);
        this.f32165c = ps8;
        this.f32164b = ps8.mo46867c();
        c19 c19 = new c19();
        this.f32166d = c19;
        ps8.mo46869e("require", new ij9(c19));
        c19.mo29847a("internal.platform", xk8.f35652a);
        ps8.mo46869e("runtime.counter", new e78(Double.valueOf(Utils.DOUBLE_EPSILON)));
    }

    /* renamed from: a */
    public final r88 mo46120a(ps8 ps8, gu8... gu8Arr) {
        r88 r88 = r88.f33330g1;
        for (gu8 b : gu8Arr) {
            r88 = ky8.m47573b(b);
            gv8.m44956k(this.f32165c);
            if ((r88 instanceof u88) || (r88 instanceof l88)) {
                r88 = this.f32163a.mo46365b(ps8, r88);
            }
        }
        return r88;
    }
}

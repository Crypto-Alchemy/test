package p000;

import android.os.Bundle;
import java.util.Map;

/* renamed from: oh8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class oh8 extends al8 {

    /* renamed from: b */
    public final Map<String, Long> f32382b = new C2781lq();

    /* renamed from: c */
    public final Map<String, Integer> f32383c = new C2781lq();

    /* renamed from: d */
    public long f32384d;

    public oh8(kr8 kr8) {
        super(kr8);
    }

    /* renamed from: i */
    public static /* synthetic */ void m49319i(oh8 oh8, String str, long j) {
        oh8.mo29006e();
        cu4.m43217g(str);
        if (oh8.f32383c.isEmpty()) {
            oh8.f32384d = j;
        }
        Integer num = oh8.f32383c.get(str);
        if (num != null) {
            oh8.f32383c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (oh8.f32383c.size() >= 100) {
            oh8.f34342a.mo45237A().mo29673o().mo48769a("Too many ads visible");
        } else {
            oh8.f32383c.put(str, 1);
            oh8.f32382b.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m49320j(oh8 oh8, String str, long j) {
        oh8.mo29006e();
        cu4.m43217g(str);
        Integer num = oh8.f32383c.get(str);
        if (num != null) {
            ty8 p = oh8.f34342a.mo45253Q().mo44640p(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                oh8.f32383c.remove(str);
                Long l = oh8.f32382b.get(str);
                if (l == null) {
                    oh8.f34342a.mo45237A().mo29670l().mo48769a("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    oh8.f32382b.remove(str);
                    oh8.mo46411m(str, j - longValue, p);
                }
                if (oh8.f32383c.isEmpty()) {
                    long j2 = oh8.f32384d;
                    if (j2 == 0) {
                        oh8.f34342a.mo45237A().mo29670l().mo48769a("First ad exposure time was never set");
                        return;
                    }
                    oh8.mo46410l(j - j2, p);
                    oh8.f32384d = 0;
                    return;
                }
                return;
            }
            oh8.f32383c.put(str, Integer.valueOf(intValue));
            return;
        }
        oh8.f34342a.mo45237A().mo29670l().mo48770b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: f */
    public final void mo46407f(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f34342a.mo45237A().mo29670l().mo48769a("Ad unit id must be a non-empty string");
        } else {
            this.f34342a.mo45272s().mo41640o(new p48(this, str, j));
        }
    }

    /* renamed from: g */
    public final void mo46408g(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f34342a.mo45237A().mo29670l().mo48769a("Ad unit id must be a non-empty string");
        } else {
            this.f34342a.mo45272s().mo41640o(new ja8(this, str, j));
        }
    }

    /* renamed from: h */
    public final void mo46409h(long j) {
        ty8 p = this.f34342a.mo45253Q().mo44640p(false);
        for (String next : this.f32382b.keySet()) {
            mo46411m(next, j - this.f32382b.get(next).longValue(), p);
        }
        if (!this.f32382b.isEmpty()) {
            mo46410l(j - this.f32384d, p);
        }
        mo46412n(j);
    }

    /* renamed from: l */
    public final void mo46410l(long j, ty8 ty8) {
        if (ty8 == null) {
            this.f34342a.mo45237A().mo29678v().mo48769a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.f34342a.mo45237A().mo29678v().mo48770b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            jz8.m46827w(ty8, bundle, true);
            this.f34342a.mo45242F().mo47916X("am", "_xa", bundle);
        }
    }

    /* renamed from: m */
    public final void mo46411m(String str, long j, ty8 ty8) {
        if (ty8 == null) {
            this.f34342a.mo45237A().mo29678v().mo48769a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.f34342a.mo45237A().mo29678v().mo48770b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            jz8.m46827w(ty8, bundle, true);
            this.f34342a.mo45242F().mo47916X("am", "_xu", bundle);
        }
    }

    /* renamed from: n */
    public final void mo46412n(long j) {
        for (String put : this.f32382b.keySet()) {
            this.f32382b.put(put, Long.valueOf(j));
        }
        if (!this.f32382b.isEmpty()) {
            this.f32384d = j;
        }
    }
}

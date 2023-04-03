package p000;

import com.google.android.gms.measurement.internal.zzp;
import java.util.concurrent.Callable;

/* renamed from: i59 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class i59 implements Callable<String> {

    /* renamed from: a */
    public final /* synthetic */ zzp f29818a;

    /* renamed from: d */
    public final /* synthetic */ s59 f29819d;

    public i59(s59 s59, zzp zzp) {
        this.f29819d = s59;
        this.f29818a = zzp;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.f29819d.mo47665f0((String) cu4.m43221k(this.f29818a.f23098a)).mo48331h() && u68.m52648c(this.f29818a.f23097Z).mo48331h()) {
            return this.f29819d.mo47686x(this.f29818a).mo41664O();
        }
        this.f29819d.mo45237A().mo29678v().mo48769a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}

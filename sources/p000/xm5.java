package p000;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;

/* renamed from: xm5 */
/* compiled from: SchedulingModule_WorkSchedulerFactory */
public final class xm5 implements sy1<ym7> {

    /* renamed from: a */
    public final ky4<Context> f35659a;

    /* renamed from: b */
    public final ky4<du1> f35660b;

    /* renamed from: c */
    public final ky4<SchedulerConfig> f35661c;

    /* renamed from: d */
    public final ky4<ah0> f35662d;

    public xm5(ky4<Context> ky4, ky4<du1> ky42, ky4<SchedulerConfig> ky43, ky4<ah0> ky44) {
        this.f35659a = ky4;
        this.f35660b = ky42;
        this.f35661c = ky43;
        this.f35662d = ky44;
    }

    /* renamed from: a */
    public static xm5 m54444a(ky4<Context> ky4, ky4<du1> ky42, ky4<SchedulerConfig> ky43, ky4<ah0> ky44) {
        return new xm5(ky4, ky42, ky43, ky44);
    }

    /* renamed from: c */
    public static ym7 m54445c(Context context, du1 du1, SchedulerConfig schedulerConfig, ah0 ah0) {
        return (ym7) bu4.m32727c(wm5.m53987a(context, du1, schedulerConfig, ah0), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public ym7 get() {
        return m54445c(this.f35659a.get(), this.f35660b.get(), this.f35661c.get(), this.f35662d.get());
    }
}

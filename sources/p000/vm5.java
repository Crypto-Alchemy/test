package p000;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;

/* renamed from: vm5 */
/* compiled from: SchedulingConfigModule_ConfigFactory */
public final class vm5 implements sy1<SchedulerConfig> {

    /* renamed from: a */
    public final ky4<ah0> f34971a;

    public vm5(ky4<ah0> ky4) {
        this.f34971a = ky4;
    }

    /* renamed from: a */
    public static SchedulerConfig m53427a(ah0 ah0) {
        return (SchedulerConfig) bu4.m32727c(um5.m52881a(ah0), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static vm5 m53428b(ky4<ah0> ky4) {
        return new vm5(ky4);
    }

    /* renamed from: c */
    public SchedulerConfig get() {
        return m53427a(this.f34971a.get());
    }
}

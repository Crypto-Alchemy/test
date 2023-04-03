package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3988b;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AutoValue
public abstract class SchedulerConfig {

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$a */
    public static class C3984a {

        /* renamed from: a */
        public ah0 f21922a;

        /* renamed from: b */
        public Map<Priority, C3985b> f21923b = new HashMap();

        /* renamed from: a */
        public C3984a mo30156a(Priority priority, C3985b bVar) {
            this.f21923b.put(priority, bVar);
            return this;
        }

        /* renamed from: b */
        public SchedulerConfig mo30157b() {
            if (this.f21922a == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (this.f21923b.keySet().size() >= Priority.values().length) {
                Map<Priority, C3985b> map = this.f21923b;
                this.f21923b = new HashMap();
                return SchedulerConfig.m33183d(this.f21922a, map);
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }

        /* renamed from: c */
        public C3984a mo30158c(ah0 ah0) {
            this.f21922a = ah0;
            return this;
        }
    }

    @AutoValue
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$b */
    public static abstract class C3985b {

        @AutoValue.Builder
        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$b$a */
        public static abstract class C3986a {
            /* renamed from: a */
            public abstract C3985b mo30162a();

            /* renamed from: b */
            public abstract C3986a mo30163b(long j);

            /* renamed from: c */
            public abstract C3986a mo30164c(Set<Flag> set);

            /* renamed from: d */
            public abstract C3986a mo30165d(long j);
        }

        /* renamed from: a */
        public static C3986a m33195a() {
            return new C3988b.C3990b().mo30164c(Collections.emptySet());
        }

        /* renamed from: b */
        public abstract long mo30159b();

        /* renamed from: c */
        public abstract Set<Flag> mo30160c();

        /* renamed from: d */
        public abstract long mo30161d();
    }

    /* renamed from: b */
    public static C3984a m33182b() {
        return new C3984a();
    }

    /* renamed from: d */
    public static SchedulerConfig m33183d(ah0 ah0, Map<Priority, C3985b> map) {
        return new C3987a(ah0, map);
    }

    /* renamed from: f */
    public static SchedulerConfig m33184f(ah0 ah0) {
        return m33182b().mo30156a(Priority.DEFAULT, C3985b.m33195a().mo30163b(30000).mo30165d(86400000).mo30162a()).mo30156a(Priority.HIGHEST, C3985b.m33195a().mo30163b(1000).mo30165d(86400000).mo30162a()).mo30156a(Priority.VERY_LOW, C3985b.m33195a().mo30163b(86400000).mo30165d(86400000).mo30164c(m33185i(Flag.NETWORK_UNMETERED, Flag.DEVICE_IDLE)).mo30162a()).mo30158c(ah0).mo30157b();
    }

    /* renamed from: i */
    public static <T> Set<T> m33185i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: a */
    public final long mo30150a(int i, long j) {
        long j2;
        int i2 = i - 1;
        if (j > 1) {
            j2 = j;
        } else {
            j2 = 2;
        }
        return (long) (Math.pow(3.0d, (double) i2) * ((double) j) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) (j2 * ((long) i2)))));
    }

    /* renamed from: c */
    public JobInfo.Builder mo30151c(JobInfo.Builder builder, Priority priority, long j, int i) {
        builder.setMinimumLatency(mo30153g(priority, j, i));
        mo30155j(builder, mo30154h().get(priority).mo30160c());
        return builder;
    }

    /* renamed from: e */
    public abstract ah0 mo30152e();

    /* renamed from: g */
    public long mo30153g(Priority priority, long j, int i) {
        long a = j - mo30152e().mo28970a();
        C3985b bVar = mo30154h().get(priority);
        return Math.min(Math.max(mo30150a(i, bVar.mo30159b()), a), bVar.mo30161d());
    }

    /* renamed from: h */
    public abstract Map<Priority, C3985b> mo30154h();

    /* renamed from: j */
    public final void mo30155j(JobInfo.Builder builder, Set<Flag> set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}

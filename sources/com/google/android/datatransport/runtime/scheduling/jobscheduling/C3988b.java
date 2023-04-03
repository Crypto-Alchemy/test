package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b */
/* compiled from: AutoValue_SchedulerConfig_ConfigValue */
public final class C3988b extends SchedulerConfig.C3985b {

    /* renamed from: a */
    public final long f21926a;

    /* renamed from: b */
    public final long f21927b;

    /* renamed from: c */
    public final Set<SchedulerConfig.Flag> f21928c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b$b */
    /* compiled from: AutoValue_SchedulerConfig_ConfigValue */
    public static final class C3990b extends SchedulerConfig.C3985b.C3986a {

        /* renamed from: a */
        public Long f21929a;

        /* renamed from: b */
        public Long f21930b;

        /* renamed from: c */
        public Set<SchedulerConfig.Flag> f21931c;

        /* renamed from: a */
        public SchedulerConfig.C3985b mo30162a() {
            String str = "";
            if (this.f21929a == null) {
                str = str + " delta";
            }
            if (this.f21930b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f21931c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C3988b(this.f21929a.longValue(), this.f21930b.longValue(), this.f21931c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public SchedulerConfig.C3985b.C3986a mo30163b(long j) {
            this.f21929a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public SchedulerConfig.C3985b.C3986a mo30164c(Set<SchedulerConfig.Flag> set) {
            if (set != null) {
                this.f21931c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        /* renamed from: d */
        public SchedulerConfig.C3985b.C3986a mo30165d(long j) {
            this.f21930b = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public long mo30159b() {
        return this.f21926a;
    }

    /* renamed from: c */
    public Set<SchedulerConfig.Flag> mo30160c() {
        return this.f21928c;
    }

    /* renamed from: d */
    public long mo30161d() {
        return this.f21927b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.C3985b)) {
            return false;
        }
        SchedulerConfig.C3985b bVar = (SchedulerConfig.C3985b) obj;
        if (this.f21926a == bVar.mo30159b() && this.f21927b == bVar.mo30161d() && this.f21928c.equals(bVar.mo30160c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f21926a;
        long j2 = this.f21927b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f21928c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f21926a + ", maxAllowedDelay=" + this.f21927b + ", flags=" + this.f21928c + "}";
    }

    public C3988b(long j, long j2, Set<SchedulerConfig.Flag> set) {
        this.f21926a = j;
        this.f21927b = j2;
        this.f21928c = set;
    }
}

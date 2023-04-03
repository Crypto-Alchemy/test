package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
/* compiled from: AutoValue_SchedulerConfig */
public final class C3987a extends SchedulerConfig {

    /* renamed from: a */
    public final ah0 f21924a;

    /* renamed from: b */
    public final Map<Priority, SchedulerConfig.C3985b> f21925b;

    public C3987a(ah0 ah0, Map<Priority, SchedulerConfig.C3985b> map) {
        if (ah0 != null) {
            this.f21924a = ah0;
            if (map != null) {
                this.f21925b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* renamed from: e */
    public ah0 mo30152e() {
        return this.f21924a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        if (!this.f21924a.equals(schedulerConfig.mo30152e()) || !this.f21925b.equals(schedulerConfig.mo30154h())) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public Map<Priority, SchedulerConfig.C3985b> mo30154h() {
        return this.f21925b;
    }

    public int hashCode() {
        return ((this.f21924a.hashCode() ^ 1000003) * 1000003) ^ this.f21925b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f21924a + ", values=" + this.f21925b + "}";
    }
}

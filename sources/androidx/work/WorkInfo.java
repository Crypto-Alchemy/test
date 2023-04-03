package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class WorkInfo {

    /* renamed from: a */
    public UUID f7478a;

    /* renamed from: b */
    public State f7479b;

    /* renamed from: c */
    public C1519b f7480c;

    /* renamed from: d */
    public Set<String> f7481d;

    /* renamed from: e */
    public C1519b f7482e;

    /* renamed from: f */
    public int f7483f;

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            if (this == SUCCEEDED || this == FAILED || this == CANCELLED) {
                return true;
            }
            return false;
        }
    }

    public WorkInfo(UUID uuid, State state, C1519b bVar, List<String> list, C1519b bVar2, int i) {
        this.f7478a = uuid;
        this.f7479b = state;
        this.f7480c = bVar;
        this.f7481d = new HashSet(list);
        this.f7482e = bVar2;
        this.f7483f = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkInfo.class != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f7483f == workInfo.f7483f && this.f7478a.equals(workInfo.f7478a) && this.f7479b == workInfo.f7479b && this.f7480c.equals(workInfo.f7480c) && this.f7481d.equals(workInfo.f7481d)) {
            return this.f7482e.equals(workInfo.f7482e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f7478a.hashCode() * 31) + this.f7479b.hashCode()) * 31) + this.f7480c.hashCode()) * 31) + this.f7481d.hashCode()) * 31) + this.f7482e.hashCode()) * 31) + this.f7483f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f7478a + '\'' + ", mState=" + this.f7479b + ", mOutputData=" + this.f7480c + ", mTags=" + this.f7481d + ", mProgress=" + this.f7482e + '}';
    }
}

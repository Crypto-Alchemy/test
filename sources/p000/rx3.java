package p000;

import com.google.errorprone.annotations.Immutable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Immutable
/* renamed from: rx3 */
/* compiled from: MonitoringAnnotations */
public final class rx3 {

    /* renamed from: b */
    public static final rx3 f33629b = m51362a().mo47524a();

    /* renamed from: a */
    public final Map<String, String> f33630a;

    /* renamed from: rx3$b */
    /* compiled from: MonitoringAnnotations */
    public static final class C6461b {

        /* renamed from: a */
        public HashMap<String, String> f33631a = new HashMap<>();

        /* renamed from: a */
        public rx3 mo47524a() {
            if (this.f33631a != null) {
                rx3 rx3 = new rx3(Collections.unmodifiableMap(this.f33631a));
                this.f33631a = null;
                return rx3;
            }
            throw new IllegalStateException("cannot call build() twice");
        }
    }

    /* renamed from: a */
    public static C6461b m51362a() {
        return new C6461b();
    }

    /* renamed from: b */
    public Map<String, String> mo47520b() {
        return this.f33630a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof rx3)) {
            return false;
        }
        return this.f33630a.equals(((rx3) obj).f33630a);
    }

    public int hashCode() {
        return this.f33630a.hashCode();
    }

    public String toString() {
        return this.f33630a.toString();
    }

    public rx3(Map<String, String> map) {
        this.f33630a = map;
    }
}

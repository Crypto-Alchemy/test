package p000;

import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.C3911bv;

@AutoValue
/* renamed from: mt1 */
/* compiled from: EventInternal */
public abstract class mt1 {

    @AutoValue.Builder
    /* renamed from: mt1$a */
    /* compiled from: EventInternal */
    public static abstract class C6257a {
        /* renamed from: a */
        public final C6257a mo45900a(String str, int i) {
            mo29762e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final C6257a mo45901b(String str, long j) {
            mo29762e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final C6257a mo45902c(String str, String str2) {
            mo29762e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract mt1 mo29761d();

        /* renamed from: e */
        public abstract Map<String, String> mo29762e();

        /* renamed from: f */
        public abstract C6257a mo29763f(Map<String, String> map);

        /* renamed from: g */
        public abstract C6257a mo29764g(Integer num);

        /* renamed from: h */
        public abstract C6257a mo29765h(jp1 jp1);

        /* renamed from: i */
        public abstract C6257a mo29766i(long j);

        /* renamed from: j */
        public abstract C6257a mo29767j(String str);

        /* renamed from: k */
        public abstract C6257a mo29768k(long j);
    }

    /* renamed from: a */
    public static C6257a m48451a() {
        return new C3911bv.C3913b().mo29763f(new HashMap());
    }

    /* renamed from: b */
    public final String mo45895b(String str) {
        String str2 = mo29752c().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: c */
    public abstract Map<String, String> mo29752c();

    /* renamed from: d */
    public abstract Integer mo29753d();

    /* renamed from: e */
    public abstract jp1 mo29754e();

    /* renamed from: f */
    public abstract long mo29756f();

    /* renamed from: g */
    public final int mo45896g(String str) {
        String str2 = mo29752c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long mo45897h(String str) {
        String str2 = mo29752c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> mo45898i() {
        return Collections.unmodifiableMap(mo29752c());
    }

    /* renamed from: j */
    public abstract String mo29758j();

    /* renamed from: k */
    public abstract long mo29759k();

    /* renamed from: l */
    public C6257a mo45899l() {
        return new C3911bv.C3913b().mo29767j(mo29758j()).mo29764g(mo29753d()).mo29765h(mo29754e()).mo29766i(mo29756f()).mo29768k(mo29759k()).mo29763f(new HashMap(mo29752c()));
    }
}

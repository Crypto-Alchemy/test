package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;

/* renamed from: r13 */
/* compiled from: JavaNullabilityAnnotationsStatus.kt */
public final class r13 {

    /* renamed from: d */
    public static final C9229a f44274d = new C9229a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final r13 f44275e = new r13(ReportLevel.STRICT, (dd3) null, (ReportLevel) null, 6, (DefaultConstructorMarker) null);

    /* renamed from: a */
    public final ReportLevel f44276a;

    /* renamed from: b */
    public final dd3 f44277b;

    /* renamed from: c */
    public final ReportLevel f44278c;

    /* renamed from: r13$a */
    /* compiled from: JavaNullabilityAnnotationsStatus.kt */
    public static final class C9229a {
        public C9229a() {
        }

        public /* synthetic */ C9229a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final r13 mo65590a() {
            return r13.f44275e;
        }
    }

    public r13(ReportLevel reportLevel, dd3 dd3, ReportLevel reportLevel2) {
        vx2.m53591g(reportLevel, "reportLevelBefore");
        vx2.m53591g(reportLevel2, "reportLevelAfter");
        this.f44276a = reportLevel;
        this.f44277b = dd3;
        this.f44278c = reportLevel2;
    }

    /* renamed from: b */
    public final ReportLevel mo65584b() {
        return this.f44278c;
    }

    /* renamed from: c */
    public final ReportLevel mo65585c() {
        return this.f44276a;
    }

    /* renamed from: d */
    public final dd3 mo65586d() {
        return this.f44277b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r13)) {
            return false;
        }
        r13 r13 = (r13) obj;
        return this.f44276a == r13.f44276a && vx2.m53586b(this.f44277b, r13.f44277b) && this.f44278c == r13.f44278c;
    }

    public int hashCode() {
        int hashCode = this.f44276a.hashCode() * 31;
        dd3 dd3 = this.f44277b;
        return ((hashCode + (dd3 == null ? 0 : dd3.hashCode())) * 31) + this.f44278c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f44276a + ", sinceVersion=" + this.f44277b + ", reportLevelAfter=" + this.f44278c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r13(ReportLevel reportLevel, dd3 dd3, ReportLevel reportLevel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? new dd3(1, 0) : dd3, (i & 4) != 0 ? reportLevel : reportLevel2);
    }
}

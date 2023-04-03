package p000;

import java.util.Map;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings;
import kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import p000.r13;

/* renamed from: q13 */
/* compiled from: JavaNullabilityAnnotationSettings.kt */
public final class q13 {

    /* renamed from: a */
    public static final u82 f44142a;

    /* renamed from: b */
    public static final u82 f44143b;

    /* renamed from: c */
    public static final cc4<r13> f44144c;

    /* renamed from: d */
    public static final r13 f44145d;

    static {
        u82 u82 = new u82("org.jspecify.nullness");
        f44142a = u82;
        u82 u822 = new u82("org.checkerframework.checker.nullness.compatqual");
        f44143b = u822;
        u82 u823 = new u82("org.jetbrains.annotations");
        r13.C9229a aVar = r13.f44274d;
        u82 u824 = new u82("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        ReportLevel reportLevel2 = reportLevel;
        dd3 dd3 = new dd3(1, 8);
        ReportLevel reportLevel3 = ReportLevel.STRICT;
        f44144c = new NullabilityAnnotationStatesImpl(C6177b.m47364l(wy6.m54142a(u823, aVar.mo65590a()), wy6.m54142a(new u82("androidx.annotation"), aVar.mo65590a()), wy6.m54142a(new u82("android.support.annotation"), aVar.mo65590a()), wy6.m54142a(new u82("android.annotation"), aVar.mo65590a()), wy6.m54142a(new u82("com.android.annotations"), aVar.mo65590a()), wy6.m54142a(new u82("org.eclipse.jdt.annotation"), aVar.mo65590a()), wy6.m54142a(new u82("org.checkerframework.checker.nullness.qual"), aVar.mo65590a()), wy6.m54142a(u822, aVar.mo65590a()), wy6.m54142a(new u82("javax.annotation"), aVar.mo65590a()), wy6.m54142a(new u82("edu.umd.cs.findbugs.annotations"), aVar.mo65590a()), wy6.m54142a(new u82("io.reactivex.annotations"), aVar.mo65590a()), wy6.m54142a(u824, new r13(reportLevel2, (dd3) null, (ReportLevel) null, 4, (DefaultConstructorMarker) null)), wy6.m54142a(new u82("androidx.annotation.RecentlyNonNull"), new r13(reportLevel2, (dd3) null, (ReportLevel) null, 4, (DefaultConstructorMarker) null)), wy6.m54142a(new u82("lombok"), aVar.mo65590a()), wy6.m54142a(u82, new r13(reportLevel, dd3, reportLevel3)), wy6.m54142a(new u82("io.reactivex.rxjava3.annotations"), new r13(reportLevel, new dd3(1, 8), reportLevel3))));
        f44145d = new r13(reportLevel2, (dd3) null, (ReportLevel) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final Jsr305Settings m71158a(dd3 dd3) {
        ReportLevel reportLevel;
        vx2.m53591g(dd3, "configuredKotlinVersion");
        r13 r13 = f44145d;
        if (r13.mo65586d() == null || r13.mo65586d().compareTo(dd3) > 0) {
            reportLevel = r13.mo65585c();
        } else {
            reportLevel = r13.mo65584b();
        }
        ReportLevel reportLevel2 = reportLevel;
        return new Jsr305Settings(reportLevel2, m71160c(reportLevel2), (Map) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static /* synthetic */ Jsr305Settings m71159b(dd3 dd3, int i, Object obj) {
        if ((i & 1) != 0) {
            dd3 = dd3.f28153r;
        }
        return m71158a(dd3);
    }

    /* renamed from: c */
    public static final ReportLevel m71160c(ReportLevel reportLevel) {
        vx2.m53591g(reportLevel, "globalReportLevel");
        if (reportLevel == ReportLevel.WARN) {
            return null;
        }
        return reportLevel;
    }

    /* renamed from: d */
    public static final ReportLevel m71161d(u82 u82) {
        vx2.m53591g(u82, "annotationFqName");
        return m71164g(u82, cc4.f37097a.mo50853a(), (dd3) null, 4, (Object) null);
    }

    /* renamed from: e */
    public static final u82 m71162e() {
        return f44142a;
    }

    /* renamed from: f */
    public static final ReportLevel m71163f(u82 u82, cc4<? extends ReportLevel> cc4, dd3 dd3) {
        vx2.m53591g(u82, "annotation");
        vx2.m53591g(cc4, "configuredReportLevels");
        vx2.m53591g(dd3, "configuredKotlinVersion");
        ReportLevel reportLevel = (ReportLevel) cc4.mo50852a(u82);
        if (reportLevel != null) {
            return reportLevel;
        }
        r13 a = f44144c.mo50852a(u82);
        if (a == null) {
            return ReportLevel.IGNORE;
        }
        if (a.mo65586d() == null || a.mo65586d().compareTo(dd3) > 0) {
            return a.mo65585c();
        }
        return a.mo65584b();
    }

    /* renamed from: g */
    public static /* synthetic */ ReportLevel m71164g(u82 u82, cc4 cc4, dd3 dd3, int i, Object obj) {
        if ((i & 4) != 0) {
            dd3 = new dd3(1, 7, 0);
        }
        return m71163f(u82, cc4, dd3);
    }
}

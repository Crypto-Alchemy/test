package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.C6169a;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Jsr305Settings.kt */
public final class Jsr305Settings {

    /* renamed from: a */
    public final ReportLevel f39402a;

    /* renamed from: b */
    public final ReportLevel f39403b;

    /* renamed from: c */
    public final Map<u82, ReportLevel> f39404c;

    /* renamed from: d */
    public final ef3 f39405d;

    /* renamed from: e */
    public final boolean f39406e;

    public Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map<u82, ? extends ReportLevel> map) {
        vx2.m53591g(reportLevel, "globalLevel");
        vx2.m53591g(map, "userDefinedLevelForSpecificAnnotation");
        this.f39402a = reportLevel;
        this.f39403b = reportLevel2;
        this.f39404c = map;
        this.f39405d = C6169a.m47232a(new Jsr305Settings$description$2(this));
        ReportLevel reportLevel3 = ReportLevel.IGNORE;
        this.f39406e = reportLevel == reportLevel3 && reportLevel2 == reportLevel3 && map.isEmpty();
    }

    /* renamed from: a */
    public final ReportLevel mo53445a() {
        return this.f39402a;
    }

    /* renamed from: b */
    public final ReportLevel mo53446b() {
        return this.f39403b;
    }

    /* renamed from: c */
    public final Map<u82, ReportLevel> mo53447c() {
        return this.f39404c;
    }

    /* renamed from: d */
    public final boolean mo53448d() {
        return this.f39406e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.f39402a == jsr305Settings.f39402a && this.f39403b == jsr305Settings.f39403b && vx2.m53586b(this.f39404c, jsr305Settings.f39404c);
    }

    public int hashCode() {
        int hashCode = this.f39402a.hashCode() * 31;
        ReportLevel reportLevel = this.f39403b;
        return ((hashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31) + this.f39404c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f39402a + ", migrationLevel=" + this.f39403b + ", userDefinedLevelForSpecificAnnotation=" + this.f39404c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? null : reportLevel2, (i & 4) != 0 ? C6177b.m47361i() : map);
    }
}

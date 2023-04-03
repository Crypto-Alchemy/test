package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: JavaTypeEnhancementState.kt */
public final class JavaTypeEnhancementState {

    /* renamed from: d */
    public static final C7447a f39397d = new C7447a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final JavaTypeEnhancementState f39398e = new JavaTypeEnhancementState(q13.m71159b((dd3) null, 1, (Object) null), JavaTypeEnhancementState$Companion$DEFAULT$1.INSTANCE);

    /* renamed from: a */
    public final Jsr305Settings f39399a;

    /* renamed from: b */
    public final rc2<u82, ReportLevel> f39400b;

    /* renamed from: c */
    public final boolean f39401c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState$a */
    /* compiled from: JavaTypeEnhancementState.kt */
    public static final class C7447a {
        public C7447a() {
        }

        public /* synthetic */ C7447a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final JavaTypeEnhancementState mo53443a() {
            return JavaTypeEnhancementState.f39398e;
        }
    }

    public JavaTypeEnhancementState(Jsr305Settings jsr305Settings, rc2<? super u82, ? extends ReportLevel> rc2) {
        boolean z;
        vx2.m53591g(jsr305Settings, "jsr305");
        vx2.m53591g(rc2, "getReportLevelForAnnotation");
        this.f39399a = jsr305Settings;
        this.f39400b = rc2;
        if (jsr305Settings.mo53448d() || rc2.invoke(q13.m71162e()) == ReportLevel.IGNORE) {
            z = true;
        } else {
            z = false;
        }
        this.f39401c = z;
    }

    /* renamed from: b */
    public final boolean mo53439b() {
        return this.f39401c;
    }

    /* renamed from: c */
    public final rc2<u82, ReportLevel> mo53440c() {
        return this.f39400b;
    }

    /* renamed from: d */
    public final Jsr305Settings mo53441d() {
        return this.f39399a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f39399a + ", getReportLevelForAnnotation=" + this.f39400b + ')';
    }
}

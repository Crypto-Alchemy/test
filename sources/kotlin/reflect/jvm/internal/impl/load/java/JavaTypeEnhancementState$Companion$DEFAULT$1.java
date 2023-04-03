package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.FunctionReference;

/* compiled from: JavaTypeEnhancementState.kt */
public /* synthetic */ class JavaTypeEnhancementState$Companion$DEFAULT$1 extends FunctionReference implements rc2<u82, ReportLevel> {
    public static final JavaTypeEnhancementState$Companion$DEFAULT$1 INSTANCE = new JavaTypeEnhancementState$Companion$DEFAULT$1();

    public JavaTypeEnhancementState$Companion$DEFAULT$1() {
        super(1);
    }

    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    public final y83 getOwner() {
        return ua5.m52729d(q13.class, "compiler.common.jvm");
    }

    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    public final ReportLevel invoke(u82 u82) {
        vx2.m53591g(u82, "p0");
        return q13.m71161d(u82);
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.FunctionReference;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 */
/* compiled from: findClassInModule.kt */
public /* synthetic */ class C7411x24bfe126 extends FunctionReference implements rc2<nf0, nf0> {
    public static final C7411x24bfe126 INSTANCE = new C7411x24bfe126();

    public C7411x24bfe126() {
        super(1);
    }

    public final String getName() {
        return "getOuterClassId";
    }

    public final y83 getOwner() {
        return ua5.m52727b(nf0.class);
    }

    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    public final nf0 invoke(nf0 nf0) {
        vx2.m53591g(nf0, "p0");
        return nf0.mo62677g();
    }
}

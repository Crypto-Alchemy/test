package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.FunctionReference;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1 */
/* compiled from: TypeDeserializer.kt */
public /* synthetic */ class C7674x1c22db09 extends FunctionReference implements rc2<nf0, nf0> {
    public static final C7674x1c22db09 INSTANCE = new C7674x1c22db09();

    public C7674x1c22db09() {
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

package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: TypesJVM.kt */
public /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends FunctionReferenceImpl implements rc2<Type, String> {
    public static final ParameterizedTypeImpl$getTypeName$1$1 INSTANCE = new ParameterizedTypeImpl$getTypeName$1$1();

    public ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, TypesJVMKt.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    public final String invoke(Type type) {
        vx2.m53591g(type, "p0");
        return TypesJVMKt.m47449h(type);
    }
}

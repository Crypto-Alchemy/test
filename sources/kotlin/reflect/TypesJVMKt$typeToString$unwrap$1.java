package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: TypesJVM.kt */
public /* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends FunctionReferenceImpl implements rc2<Class<?>, Class<?>> {
    public static final TypesJVMKt$typeToString$unwrap$1 INSTANCE = new TypesJVMKt$typeToString$unwrap$1();

    public TypesJVMKt$typeToString$unwrap$1() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    public final Class<?> invoke(Class<?> cls) {
        vx2.m53591g(cls, "p0");
        return cls.getComponentType();
    }
}

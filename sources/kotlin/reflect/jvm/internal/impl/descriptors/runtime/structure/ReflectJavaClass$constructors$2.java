package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Constructor;
import kotlin.jvm.internal.FunctionReference;

/* compiled from: ReflectJavaClass.kt */
public /* synthetic */ class ReflectJavaClass$constructors$2 extends FunctionReference implements rc2<Constructor<?>, z95> {
    public static final ReflectJavaClass$constructors$2 INSTANCE = new ReflectJavaClass$constructors$2();

    public ReflectJavaClass$constructors$2() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final y83 getOwner() {
        return ua5.m52727b(z95.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    public final z95 invoke(Constructor<?> constructor) {
        vx2.m53591g(constructor, "p0");
        return new z95(constructor);
    }
}

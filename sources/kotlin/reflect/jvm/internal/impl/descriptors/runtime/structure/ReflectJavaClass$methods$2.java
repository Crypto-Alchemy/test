package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.internal.FunctionReference;

/* compiled from: ReflectJavaClass.kt */
public /* synthetic */ class ReflectJavaClass$methods$2 extends FunctionReference implements rc2<Method, fa5> {
    public static final ReflectJavaClass$methods$2 INSTANCE = new ReflectJavaClass$methods$2();

    public ReflectJavaClass$methods$2() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final y83 getOwner() {
        return ua5.m52727b(fa5.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    public final fa5 invoke(Method method) {
        vx2.m53591g(method, "p0");
        return new fa5(method);
    }
}

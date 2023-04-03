package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import kotlin.jvm.internal.FunctionReference;

/* compiled from: ReflectJavaClass.kt */
public /* synthetic */ class ReflectJavaClass$fields$2 extends FunctionReference implements rc2<Field, ca5> {
    public static final ReflectJavaClass$fields$2 INSTANCE = new ReflectJavaClass$fields$2();

    public ReflectJavaClass$fields$2() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final y83 getOwner() {
        return ua5.m52727b(ca5.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    public final ca5 invoke(Field field) {
        vx2.m53591g(field, "p0");
        return new ca5(field);
    }
}

package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

@Metadata(mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo44877d2 = {"<anonymous>", "", "it", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RuntimeTypeMapper.kt */
public final class JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1 extends Lambda implements rc2<Method, CharSequence> {
    public static final JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1 INSTANCE = new JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1();

    public JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1() {
        super(1);
    }

    public final CharSequence invoke(Method method) {
        Class<?> returnType = method.getReturnType();
        vx2.m53590f(returnType, "it.returnType");
        return ReflectClassUtilKt.m60594b(returnType);
    }
}

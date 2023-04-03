package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

@Metadata(mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo44877d2 = {"<anonymous>", "", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RuntimeTypeMapper.kt */
public final class JvmFunctionSignature$JavaConstructor$asString$1 extends Lambda implements rc2<Class<?>, CharSequence> {
    public static final JvmFunctionSignature$JavaConstructor$asString$1 INSTANCE = new JvmFunctionSignature$JavaConstructor$asString$1();

    public JvmFunctionSignature$JavaConstructor$asString$1() {
        super(1);
    }

    public final CharSequence invoke(Class<?> cls) {
        vx2.m53590f(cls, "it");
        return ReflectClassUtilKt.m60594b(cls);
    }
}

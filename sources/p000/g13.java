package p000;

import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* renamed from: g13 */
/* compiled from: JavaFlexibleTypeDeserializer.kt */
public final class g13 implements j42 {

    /* renamed from: a */
    public static final g13 f37941a = new g13();

    /* renamed from: a */
    public xc3 mo51842a(ProtoBuf$Type protoBuf$Type, String str, d36 d36, d36 d362) {
        vx2.m53591g(protoBuf$Type, "proto");
        vx2.m53591g(str, "flexibleId");
        vx2.m53591g(d36, "lowerBound");
        vx2.m53591g(d362, "upperBound");
        if (!vx2.m53586b(str, "kotlin.jvm.PlatformType")) {
            return nr1.m70033d(ErrorTypeKind.ERROR_FLEXIBLE_TYPE, str, d36.toString(), d362.toString());
        } else if (protoBuf$Type.hasExtension(JvmProtoBuf.f39870g)) {
            return new RawTypeImpl(d36, d362);
        } else {
            return KotlinTypeFactory.m62849d(d36, d362);
        }
    }
}

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2 */
/* compiled from: TypeDeserializer.kt */
public final class C7676x131ab843 extends Lambda implements rc2<ProtoBuf$Type, Integer> {
    public static final C7676x131ab843 INSTANCE = new C7676x131ab843();

    public C7676x131ab843() {
        super(1);
    }

    public final Integer invoke(ProtoBuf$Type protoBuf$Type) {
        vx2.m53591g(protoBuf$Type, "it");
        return Integer.valueOf(protoBuf$Type.getArgumentCount());
    }
}

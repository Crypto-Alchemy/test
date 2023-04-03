package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KClassImpl.kt */
public /* synthetic */ class KClassImpl$getLocalProperty$2$1$1 extends FunctionReference implements fd2<MemberDeserializer, ProtoBuf$Property, fx4> {
    public static final KClassImpl$getLocalProperty$2$1$1 INSTANCE = new KClassImpl$getLocalProperty$2$1$1();

    public KClassImpl$getLocalProperty$2$1$1() {
        super(2);
    }

    public final String getName() {
        return "loadProperty";
    }

    public final y83 getOwner() {
        return ua5.m52727b(MemberDeserializer.class);
    }

    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    public final fx4 invoke(MemberDeserializer memberDeserializer, ProtoBuf$Property protoBuf$Property) {
        vx2.m53591g(memberDeserializer, "p0");
        vx2.m53591g(protoBuf$Property, "p1");
        return memberDeserializer.mo55138l(protoBuf$Property);
    }
}

package kotlin.reflect.jvm;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: reflectLambda.kt */
public /* synthetic */ class ReflectLambdaKt$reflect$descriptor$1 extends FunctionReference implements fd2<MemberDeserializer, ProtoBuf$Function, C7428e> {
    public static final ReflectLambdaKt$reflect$descriptor$1 INSTANCE = new ReflectLambdaKt$reflect$descriptor$1();

    public ReflectLambdaKt$reflect$descriptor$1() {
        super(2);
    }

    public final String getName() {
        return "loadFunction";
    }

    public final y83 getOwner() {
        return ua5.m52727b(MemberDeserializer.class);
    }

    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    public final C7428e invoke(MemberDeserializer memberDeserializer, ProtoBuf$Function protoBuf$Function) {
        vx2.m53591g(memberDeserializer, "p0");
        vx2.m53591g(protoBuf$Function, "p1");
        return memberDeserializer.mo55136j(protoBuf$Function);
    }
}

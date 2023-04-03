package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.C7628h;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 */
/* compiled from: DeserializedMemberScope.kt */
public final class C7690xb5e458c1 extends Lambda implements pc2 {
    public final /* synthetic */ ByteArrayInputStream $inputStream;
    public final /* synthetic */ jm4 $parser;
    public final /* synthetic */ DeserializedMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7690xb5e458c1(jm4 jm4, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.$parser = jm4;
        this.$inputStream = byteArrayInputStream;
        this.this$0 = deserializedMemberScope;
    }

    public final C7628h invoke() {
        return (C7628h) this.$parser.mo52754d(this.$inputStream, this.this$0.mo55201p().mo56226c().mo52443j());
    }
}

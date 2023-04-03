package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;

/* compiled from: TypeDeserializer.kt */
public final class TypeDeserializer$simpleType$annotations$1 extends Lambda implements pc2<List<? extends C9460vl>> {
    public final /* synthetic */ ProtoBuf$Type $proto;
    public final /* synthetic */ TypeDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$simpleType$annotations$1(TypeDeserializer typeDeserializer, ProtoBuf$Type protoBuf$Type) {
        super(0);
        this.this$0 = typeDeserializer;
        this.$proto = protoBuf$Type;
    }

    public final List<C9460vl> invoke() {
        return this.this$0.f40150a.mo56226c().mo52437d().mo53785k(this.$proto, this.this$0.f40150a.mo56230g());
    }
}

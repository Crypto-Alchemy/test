package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;

/* compiled from: MemberDeserializer.kt */
public final class MemberDeserializer$loadProperty$4 extends Lambda implements pc2<gc4<? extends fq0<?>>> {
    public final /* synthetic */ xd1 $property;
    public final /* synthetic */ ProtoBuf$Property $proto;
    public final /* synthetic */ MemberDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$loadProperty$4(MemberDeserializer memberDeserializer, ProtoBuf$Property protoBuf$Property, xd1 xd1) {
        super(0);
        this.this$0 = memberDeserializer;
        this.$proto = protoBuf$Property;
        this.$property = xd1;
    }

    public final gc4<fq0<?>> invoke() {
        da6 h = this.this$0.f40147a.mo56231h();
        final MemberDeserializer memberDeserializer = this.this$0;
        final ProtoBuf$Property protoBuf$Property = this.$proto;
        final xd1 xd1 = this.$property;
        return h.mo51162g(new pc2<fq0<?>>() {
            public final fq0<?> invoke() {
                MemberDeserializer memberDeserializer = memberDeserializer;
                xx4 a = memberDeserializer.mo55129c(memberDeserializer.f40147a.mo56228e());
                vx2.m53588d(a);
                C9363tl<C9460vl, fq0<?>> d = memberDeserializer.f40147a.mo56226c().mo52437d();
                ProtoBuf$Property protoBuf$Property = protoBuf$Property;
                xc3 returnType = xd1.getReturnType();
                vx2.m53590f(returnType, "property.returnType");
                return d.mo53761h(a, protoBuf$Property, returnType);
            }
        });
    }
}

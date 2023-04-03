package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;

/* compiled from: MemberDeserializer.kt */
public final class MemberDeserializer$getPropertyFieldAnnotations$1 extends Lambda implements pc2<List<? extends C9460vl>> {
    public final /* synthetic */ boolean $isDelegate;
    public final /* synthetic */ ProtoBuf$Property $proto;
    public final /* synthetic */ MemberDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$getPropertyFieldAnnotations$1(MemberDeserializer memberDeserializer, boolean z, ProtoBuf$Property protoBuf$Property) {
        super(0);
        this.this$0 = memberDeserializer;
        this.$isDelegate = z;
        this.$proto = protoBuf$Property;
    }

    public final List<C9460vl> invoke() {
        List<C9460vl> list;
        MemberDeserializer memberDeserializer = this.this$0;
        xx4 a = memberDeserializer.mo55129c(memberDeserializer.f40147a.mo56228e());
        if (a != null) {
            boolean z = this.$isDelegate;
            MemberDeserializer memberDeserializer2 = this.this$0;
            ProtoBuf$Property protoBuf$Property = this.$proto;
            list = z ? CollectionsKt___CollectionsKt.m47311K0(memberDeserializer2.f40147a.mo56226c().mo52437d().mo53783g(a, protoBuf$Property)) : CollectionsKt___CollectionsKt.m47311K0(memberDeserializer2.f40147a.mo56226c().mo52437d().mo53782f(a, protoBuf$Property));
        } else {
            list = null;
        }
        return list == null ? ck0.m33062j() : list;
    }
}

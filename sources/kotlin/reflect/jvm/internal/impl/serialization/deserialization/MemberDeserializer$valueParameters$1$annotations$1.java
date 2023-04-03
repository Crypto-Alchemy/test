package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.C7628h;

/* compiled from: MemberDeserializer.kt */
public final class MemberDeserializer$valueParameters$1$annotations$1 extends Lambda implements pc2<List<? extends C9460vl>> {
    public final /* synthetic */ C7628h $callable;
    public final /* synthetic */ xx4 $containerOfCallable;

    /* renamed from: $i */
    public final /* synthetic */ int f40149$i;
    public final /* synthetic */ AnnotatedCallableKind $kind;
    public final /* synthetic */ ProtoBuf$ValueParameter $proto;
    public final /* synthetic */ MemberDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$valueParameters$1$annotations$1(MemberDeserializer memberDeserializer, xx4 xx4, C7628h hVar, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        super(0);
        this.this$0 = memberDeserializer;
        this.$containerOfCallable = xx4;
        this.$callable = hVar;
        this.$kind = annotatedCallableKind;
        this.f40149$i = i;
        this.$proto = protoBuf$ValueParameter;
    }

    public final List<C9460vl> invoke() {
        return CollectionsKt___CollectionsKt.m47311K0(this.this$0.f40147a.mo56226c().mo52437d().mo53779c(this.$containerOfCallable, this.$callable, this.$kind, this.f40149$i, this.$proto));
    }
}

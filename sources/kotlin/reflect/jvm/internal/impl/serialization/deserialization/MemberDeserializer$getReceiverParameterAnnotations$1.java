package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.C7628h;

/* compiled from: MemberDeserializer.kt */
public final class MemberDeserializer$getReceiverParameterAnnotations$1 extends Lambda implements pc2<List<? extends C9460vl>> {
    public final /* synthetic */ AnnotatedCallableKind $kind;
    public final /* synthetic */ C7628h $proto;
    public final /* synthetic */ MemberDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$getReceiverParameterAnnotations$1(MemberDeserializer memberDeserializer, C7628h hVar, AnnotatedCallableKind annotatedCallableKind) {
        super(0);
        this.this$0 = memberDeserializer;
        this.$proto = hVar;
        this.$kind = annotatedCallableKind;
    }

    public final List<C9460vl> invoke() {
        List<C9460vl> list;
        MemberDeserializer memberDeserializer = this.this$0;
        xx4 a = memberDeserializer.mo55129c(memberDeserializer.f40147a.mo56228e());
        if (a != null) {
            list = this.this$0.f40147a.mo56226c().mo52437d().mo53777a(a, this.$proto, this.$kind);
        } else {
            list = null;
        }
        return list == null ? ck0.m33062j() : list;
    }
}

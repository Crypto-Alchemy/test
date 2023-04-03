package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;

/* compiled from: KotlinTypeFactory.kt */
public final class KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1 extends Lambda implements rc2<bd3, d36> {
    public final /* synthetic */ List<f17> $arguments;
    public final /* synthetic */ rz6 $attributes;
    public final /* synthetic */ yz6 $constructor;
    public final /* synthetic */ MemberScope $memberScope;
    public final /* synthetic */ boolean $nullable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1(yz6 yz6, List<? extends f17> list, rz6 rz6, boolean z, MemberScope memberScope) {
        super(1);
        this.$constructor = yz6;
        this.$arguments = list;
        this.$attributes = rz6;
        this.$nullable = z;
        this.$memberScope = memberScope;
    }

    public final d36 invoke(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        KotlinTypeFactory.C7717a a = KotlinTypeFactory.f40263a.mo55309f(this.$constructor, bd3, this.$arguments);
        if (a == null) {
            return null;
        }
        d36 a2 = a.mo55310a();
        if (a2 != null) {
            return a2;
        }
        rz6 rz6 = this.$attributes;
        yz6 b = a.mo55311b();
        vx2.m53588d(b);
        return KotlinTypeFactory.m62854j(rz6, b, this.$arguments, this.$nullable, this.$memberScope);
    }
}

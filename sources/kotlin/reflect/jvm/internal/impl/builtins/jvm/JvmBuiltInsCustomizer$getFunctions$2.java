package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: JvmBuiltInsCustomizer.kt */
public final class JvmBuiltInsCustomizer$getFunctions$2 extends Lambda implements rc2<MemberScope, Collection<? extends C7428e>> {
    public final /* synthetic */ r24 $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$getFunctions$2(r24 r24) {
        super(1);
        this.$name = r24;
    }

    public final Collection<C7428e> invoke(MemberScope memberScope) {
        vx2.m53591g(memberScope, "it");
        return memberScope.mo50862c(this.$name, NoLookupLocation.FROM_BUILTINS);
    }
}

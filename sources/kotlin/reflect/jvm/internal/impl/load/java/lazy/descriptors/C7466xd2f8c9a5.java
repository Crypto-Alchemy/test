package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1 */
/* compiled from: LazyJavaStaticClassScope.kt */
public final class C7466xd2f8c9a5 extends Lambda implements rc2<MemberScope, Collection<? extends fx4>> {
    public final /* synthetic */ r24 $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7466xd2f8c9a5(r24 r24) {
        super(1);
        this.$name = r24;
    }

    public final Collection<? extends fx4> invoke(MemberScope memberScope) {
        vx2.m53591g(memberScope, "it");
        return memberScope.mo50861b(this.$name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
    }
}

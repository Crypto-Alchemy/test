package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: LazyJavaStaticClassScope.kt */
public final class LazyJavaStaticClassScope$computePropertyNames$1$1 extends Lambda implements rc2<MemberScope, Collection<? extends r24>> {
    public static final LazyJavaStaticClassScope$computePropertyNames$1$1 INSTANCE = new LazyJavaStaticClassScope$computePropertyNames$1$1();

    public LazyJavaStaticClassScope$computePropertyNames$1$1() {
        super(1);
    }

    public final Collection<r24> invoke(MemberScope memberScope) {
        vx2.m53591g(memberScope, "it");
        return memberScope.mo50863d();
    }
}

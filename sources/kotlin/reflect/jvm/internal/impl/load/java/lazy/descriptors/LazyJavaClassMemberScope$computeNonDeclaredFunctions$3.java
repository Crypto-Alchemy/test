package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;

/* compiled from: LazyJavaClassMemberScope.kt */
public /* synthetic */ class LazyJavaClassMemberScope$computeNonDeclaredFunctions$3 extends FunctionReference implements rc2<r24, Collection<? extends C7428e>> {
    public LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(Object obj) {
        super(1, obj);
    }

    public final String getName() {
        return "searchMethodsByNameWithoutBuiltinMagic";
    }

    public final y83 getOwner() {
        return ua5.m52727b(LazyJavaClassMemberScope.class);
    }

    public final String getSignature() {
        return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }

    public final Collection<C7428e> invoke(r24 r24) {
        vx2.m53591g(r24, "p0");
        return ((LazyJavaClassMemberScope) this.receiver).mo53540I0(r24);
    }
}

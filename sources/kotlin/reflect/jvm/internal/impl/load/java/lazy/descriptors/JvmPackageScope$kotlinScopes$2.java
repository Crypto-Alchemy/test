package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: JvmPackageScope.kt */
public final class JvmPackageScope$kotlinScopes$2 extends Lambda implements pc2<MemberScope[]> {
    public final /* synthetic */ JvmPackageScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmPackageScope$kotlinScopes$2(JvmPackageScope jvmPackageScope) {
        super(0);
        this.this$0 = jvmPackageScope;
    }

    public final MemberScope[] invoke() {
        Collection<tc3> values = this.this$0.f39469c.mo53591G0().values();
        JvmPackageScope jvmPackageScope = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (tc3 b : values) {
            MemberScope b2 = jvmPackageScope.f39468b.mo65296a().mo66999b().mo53796b(jvmPackageScope.f39469c, b);
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        Object[] array = on5.m70417b(arrayList).toArray(new MemberScope[0]);
        vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (MemberScope[]) array;
    }
}

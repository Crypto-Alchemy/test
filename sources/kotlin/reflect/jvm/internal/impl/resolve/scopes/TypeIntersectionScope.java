package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: TypeIntersectionScope.kt */
public final class TypeIntersectionScope extends C9628y6 {

    /* renamed from: d */
    public static final C7668a f40125d = new C7668a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public final String f40126b;

    /* renamed from: c */
    public final MemberScope f40127c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope$a */
    /* compiled from: TypeIntersectionScope.kt */
    public static final class C7668a {
        public C7668a() {
        }

        public /* synthetic */ C7668a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MemberScope mo55104a(String str, Collection<? extends xc3> collection) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            vx2.m53591g(collection, "types");
            ArrayList arrayList = new ArrayList(dk0.m43495u(collection, 10));
            for (xc3 m : collection) {
                arrayList.add(m.mo51146m());
            }
            v46<MemberScope> b = on5.m70417b(arrayList);
            MemberScope b2 = cd0.f37102d.mo50869b(str, b);
            if (b.size() <= 1) {
                return b2;
            }
            return new TypeIntersectionScope(str, b2, (DefaultConstructorMarker) null);
        }
    }

    public TypeIntersectionScope(String str, MemberScope memberScope) {
        this.f40126b = str;
        this.f40127c = memberScope;
    }

    public /* synthetic */ TypeIntersectionScope(String str, MemberScope memberScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScope);
    }

    /* renamed from: j */
    public static final MemberScope m62509j(String str, Collection<? extends xc3> collection) {
        return f40125d.mo55104a(str, collection);
    }

    /* renamed from: b */
    public Collection<fx4> mo50861b(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return OverridingUtilsKt.m62408a(super.mo50861b(r24, ul3), TypeIntersectionScope$getContributedVariables$1.INSTANCE);
    }

    /* renamed from: c */
    public Collection<C7428e> mo50862c(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return OverridingUtilsKt.m62408a(super.mo50862c(r24, ul3), TypeIntersectionScope$getContributedFunctions$1.INSTANCE);
    }

    /* renamed from: f */
    public Collection<d31> mo50865f(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        vx2.m53591g(rc2, "nameFilter");
        Collection<d31> f = super.mo50865f(yc1, rc2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T next : f) {
            if (((d31) next) instanceof C7420a) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.component1();
        vx2.m53589e(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return CollectionsKt___CollectionsKt.m47350u0(OverridingUtilsKt.m62408a(list, TypeIntersectionScope$getContributedDescriptors$2.INSTANCE), (List) pair.component2());
    }

    /* renamed from: i */
    public MemberScope mo55094i() {
        return this.f40127c;
    }
}

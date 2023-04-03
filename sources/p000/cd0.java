package p000;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: cd0 */
/* compiled from: ChainedMemberScope.kt */
public final class cd0 implements MemberScope {

    /* renamed from: d */
    public static final C6935a f37102d = new C6935a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public final String f37103b;

    /* renamed from: c */
    public final MemberScope[] f37104c;

    /* renamed from: cd0$a */
    /* compiled from: ChainedMemberScope.kt */
    public static final class C6935a {
        public C6935a() {
        }

        public /* synthetic */ C6935a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MemberScope mo50868a(String str, Iterable<? extends MemberScope> iterable) {
            vx2.m53591g(str, "debugName");
            vx2.m53591g(iterable, "scopes");
            v46 v46 = new v46();
            for (MemberScope memberScope : iterable) {
                if (memberScope != MemberScope.C7667a.f40117b) {
                    if (memberScope instanceof cd0) {
                        hk0.m45266A(v46, ((cd0) memberScope).f37104c);
                    } else {
                        v46.add(memberScope);
                    }
                }
            }
            return mo50869b(str, v46);
        }

        /* renamed from: b */
        public final MemberScope mo50869b(String str, List<? extends MemberScope> list) {
            vx2.m53591g(str, "debugName");
            vx2.m53591g(list, "scopes");
            int size = list.size();
            if (size == 0) {
                return MemberScope.C7667a.f40117b;
            }
            if (size == 1) {
                return (MemberScope) list.get(0);
            }
            Object[] array = list.toArray(new MemberScope[0]);
            vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new cd0(str, (MemberScope[]) array, (DefaultConstructorMarker) null);
        }
    }

    public cd0(String str, MemberScope[] memberScopeArr) {
        this.f37103b = str;
        this.f37104c = memberScopeArr;
    }

    public /* synthetic */ cd0(String str, MemberScope[] memberScopeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScopeArr);
    }

    /* renamed from: a */
    public Set<r24> mo50860a() {
        MemberScope[] memberScopeArr = this.f37104c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope a : memberScopeArr) {
            hk0.m45275z(linkedHashSet, a.mo50860a());
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public Collection<fx4> mo50861b(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        MemberScope[] memberScopeArr = this.f37104c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return ck0.m33062j();
        }
        if (length == 1) {
            return memberScopeArr[0].mo50861b(r24, ul3);
        }
        Collection<fx4> collection = null;
        for (MemberScope b : memberScopeArr) {
            collection = on5.m70416a(collection, b.mo50861b(r24, ul3));
        }
        if (collection == null) {
            return ny5.m49095e();
        }
        return collection;
    }

    /* renamed from: c */
    public Collection<C7428e> mo50862c(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        MemberScope[] memberScopeArr = this.f37104c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return ck0.m33062j();
        }
        if (length == 1) {
            return memberScopeArr[0].mo50862c(r24, ul3);
        }
        Collection<C7428e> collection = null;
        for (MemberScope c : memberScopeArr) {
            collection = on5.m70416a(collection, c.mo50862c(r24, ul3));
        }
        if (collection == null) {
            return ny5.m49095e();
        }
        return collection;
    }

    /* renamed from: d */
    public Set<r24> mo50863d() {
        MemberScope[] memberScopeArr = this.f37104c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope d : memberScopeArr) {
            hk0.m45275z(linkedHashSet, d.mo50863d());
        }
        return linkedHashSet;
    }

    /* renamed from: e */
    public eg0 mo50864e(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        eg0 eg0 = null;
        for (MemberScope e : this.f37104c) {
            eg0 e2 = e.mo50864e(r24, ul3);
            if (e2 != null) {
                if (!(e2 instanceof fg0) || !((fg0) e2).mo51319d0()) {
                    return e2;
                }
                if (eg0 == null) {
                    eg0 = e2;
                }
            }
        }
        return eg0;
    }

    /* renamed from: f */
    public Collection<d31> mo50865f(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        vx2.m53591g(rc2, "nameFilter");
        MemberScope[] memberScopeArr = this.f37104c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return ck0.m33062j();
        }
        if (length == 1) {
            return memberScopeArr[0].mo50865f(yc1, rc2);
        }
        Collection<d31> collection = null;
        for (MemberScope f : memberScopeArr) {
            collection = on5.m70416a(collection, f.mo50865f(yc1, rc2));
        }
        if (collection == null) {
            return ny5.m49095e();
        }
        return collection;
    }

    /* renamed from: g */
    public Set<r24> mo50866g() {
        return rs3.m71677a(ArraysKt___ArraysKt.m47243A(this.f37104c));
    }

    public String toString() {
        return this.f37103b;
    }
}

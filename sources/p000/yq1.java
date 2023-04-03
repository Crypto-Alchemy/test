package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: yq1 */
/* compiled from: EnumEntrySyntheticClassDescriptor */
public class yq1 extends jf0 {

    /* renamed from: A */
    public final MemberScope f46247A;

    /* renamed from: B */
    public final q84<Set<r24>> f46248B;

    /* renamed from: C */
    public final C6983dm f46249C;

    /* renamed from: y */
    public final yz6 f46250y;

    /* renamed from: yq1$a */
    /* compiled from: EnumEntrySyntheticClassDescriptor */
    public class C9644a extends qs3 {

        /* renamed from: b */
        public final vs3<r24, Collection<? extends C7428e>> f46251b;

        /* renamed from: c */
        public final vs3<r24, Collection<? extends fx4>> f46252c;

        /* renamed from: d */
        public final q84<Collection<d31>> f46253d;

        /* renamed from: e */
        public final /* synthetic */ yq1 f46254e;

        /* renamed from: yq1$a$a */
        /* compiled from: EnumEntrySyntheticClassDescriptor */
        public class C9645a implements rc2<r24, Collection<? extends C7428e>> {

            /* renamed from: a */
            public final /* synthetic */ yq1 f46255a;

            public C9645a(yq1 yq1) {
                this.f46255a = yq1;
            }

            /* renamed from: a */
            public Collection<? extends C7428e> invoke(r24 r24) {
                return C9644a.this.mo67151m(r24);
            }
        }

        /* renamed from: yq1$a$b */
        /* compiled from: EnumEntrySyntheticClassDescriptor */
        public class C9646b implements rc2<r24, Collection<? extends fx4>> {

            /* renamed from: a */
            public final /* synthetic */ yq1 f46257a;

            public C9646b(yq1 yq1) {
                this.f46257a = yq1;
            }

            /* renamed from: a */
            public Collection<? extends fx4> invoke(r24 r24) {
                return C9644a.this.mo67152n(r24);
            }
        }

        /* renamed from: yq1$a$c */
        /* compiled from: EnumEntrySyntheticClassDescriptor */
        public class C9647c implements pc2<Collection<d31>> {

            /* renamed from: a */
            public final /* synthetic */ yq1 f46259a;

            public C9647c(yq1 yq1) {
                this.f46259a = yq1;
            }

            /* renamed from: a */
            public Collection<d31> invoke() {
                return C9644a.this.mo67150l();
            }
        }

        /* renamed from: yq1$a$d */
        /* compiled from: EnumEntrySyntheticClassDescriptor */
        public class C9648d extends n84 {

            /* renamed from: a */
            public final /* synthetic */ Set f46261a;

            public C9648d(Set set) {
                this.f46261a = set;
            }

            /* renamed from: f */
            public static /* synthetic */ void m74623f(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            /* renamed from: a */
            public void mo50135a(CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    m74623f(0);
                }
                OverridingUtil.m62364K(callableMemberDescriptor, (rc2<CallableMemberDescriptor, r37>) null);
                this.f46261a.add(callableMemberDescriptor);
            }

            /* renamed from: e */
            public void mo50137e(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                if (callableMemberDescriptor == null) {
                    m74623f(1);
                }
                if (callableMemberDescriptor2 == null) {
                    m74623f(2);
                }
            }
        }

        public C9644a(yq1 yq1, da6 da6) {
            if (da6 == null) {
                m74605h(0);
            }
            this.f46254e = yq1;
            this.f46251b = da6.mo51163h(new C9645a(yq1));
            this.f46252c = da6.mo51163h(new C9646b(yq1));
            this.f46253d = da6.mo51164i(new C9647c(yq1));
        }

        /* renamed from: h */
        public static /* synthetic */ void m74605h(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = PublicResolver.FUNC_NAME;
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i != 12) {
                switch (i) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        /* renamed from: a */
        public Set<r24> mo50860a() {
            Set<r24> set = (Set) this.f46254e.f46248B.invoke();
            if (set == null) {
                m74605h(17);
            }
            return set;
        }

        /* renamed from: b */
        public Collection<? extends fx4> mo50861b(r24 r24, ul3 ul3) {
            if (r24 == null) {
                m74605h(1);
            }
            if (ul3 == null) {
                m74605h(2);
            }
            Collection<? extends fx4> invoke = this.f46252c.invoke(r24);
            if (invoke == null) {
                m74605h(3);
            }
            return invoke;
        }

        /* renamed from: c */
        public Collection<? extends C7428e> mo50862c(r24 r24, ul3 ul3) {
            if (r24 == null) {
                m74605h(5);
            }
            if (ul3 == null) {
                m74605h(6);
            }
            Collection<? extends C7428e> invoke = this.f46251b.invoke(r24);
            if (invoke == null) {
                m74605h(7);
            }
            return invoke;
        }

        /* renamed from: d */
        public Set<r24> mo50863d() {
            Set<r24> set = (Set) this.f46254e.f46248B.invoke();
            if (set == null) {
                m74605h(19);
            }
            return set;
        }

        /* renamed from: f */
        public Collection<d31> mo50865f(yc1 yc1, rc2<? super r24, Boolean> rc2) {
            if (yc1 == null) {
                m74605h(13);
            }
            if (rc2 == null) {
                m74605h(14);
            }
            Collection<d31> collection = (Collection) this.f46253d.invoke();
            if (collection == null) {
                m74605h(15);
            }
            return collection;
        }

        /* renamed from: g */
        public Set<r24> mo50866g() {
            Set<r24> emptySet = Collections.emptySet();
            if (emptySet == null) {
                m74605h(18);
            }
            return emptySet;
        }

        /* renamed from: l */
        public final Collection<d31> mo67150l() {
            HashSet hashSet = new HashSet();
            for (r24 r24 : (Set) this.f46254e.f46248B.invoke()) {
                NoLookupLocation noLookupLocation = NoLookupLocation.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(mo50862c(r24, noLookupLocation));
                hashSet.addAll(mo50861b(r24, noLookupLocation));
            }
            return hashSet;
        }

        /* renamed from: m */
        public final Collection<? extends C7428e> mo67151m(r24 r24) {
            if (r24 == null) {
                m74605h(8);
            }
            return mo67154p(r24, mo67153o().mo50862c(r24, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
        }

        /* renamed from: n */
        public final Collection<? extends fx4> mo67152n(r24 r24) {
            if (r24 == null) {
                m74605h(4);
            }
            return mo67154p(r24, mo67153o().mo50861b(r24, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
        }

        /* renamed from: o */
        public final MemberScope mo67153o() {
            MemberScope m = this.f46254e.mo50046g().mo51811g().iterator().next().mo51146m();
            if (m == null) {
                m74605h(9);
            }
            return m;
        }

        /* renamed from: p */
        public final <D extends CallableMemberDescriptor> Collection<? extends D> mo67154p(r24 r24, Collection<? extends D> collection) {
            if (r24 == null) {
                m74605h(10);
            }
            if (collection == null) {
                m74605h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            OverridingUtil.f40070f.mo55055v(r24, collection, Collections.emptySet(), this.f46254e, new C9648d(linkedHashSet));
            return linkedHashSet;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yq1(da6 da6, if0 if0, xc3 xc3, r24 r24, q84<Set<r24>> q84, C6983dm dmVar, a66 a66) {
        super(da6, if0, r24, a66, false);
        if (da6 == null) {
            m74587y0(6);
        }
        if (if0 == null) {
            m74587y0(7);
        }
        if (xc3 == null) {
            m74587y0(8);
        }
        if (r24 == null) {
            m74587y0(9);
        }
        if (q84 == null) {
            m74587y0(10);
        }
        if (dmVar == null) {
            m74587y0(11);
        }
        if (a66 == null) {
            m74587y0(12);
        }
        this.f46249C = dmVar;
        this.f46250y = new uf0(this, Collections.emptyList(), Collections.singleton(xc3), da6);
        this.f46247A = new C9644a(this, da6);
        this.f46248B = q84;
    }

    /* renamed from: F0 */
    public static yq1 m74586F0(da6 da6, if0 if0, r24 r24, q84<Set<r24>> q84, C6983dm dmVar, a66 a66) {
        if (da6 == null) {
            m74587y0(0);
        }
        if (if0 == null) {
            m74587y0(1);
        }
        if (r24 == null) {
            m74587y0(2);
        }
        if (q84 == null) {
            m74587y0(3);
        }
        if (dmVar == null) {
            m74587y0(4);
        }
        if (a66 == null) {
            m74587y0(5);
        }
        return new yq1(da6, if0, if0.mo51464n(), r24, q84, dmVar, a66);
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m74587y0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: C0 */
    public boolean mo52338C0() {
        return false;
    }

    /* renamed from: P */
    public d87<d36> mo52344P() {
        return null;
    }

    /* renamed from: T */
    public boolean mo51317T() {
        return false;
    }

    /* renamed from: V */
    public boolean mo52345V() {
        return false;
    }

    /* renamed from: Y */
    public boolean mo52346Y() {
        return false;
    }

    /* renamed from: b0 */
    public MemberScope mo51546b0(bd3 bd3) {
        if (bd3 == null) {
            m74587y0(13);
        }
        MemberScope memberScope = this.f46247A;
        if (memberScope == null) {
            m74587y0(14);
        }
        return memberScope;
    }

    /* renamed from: d0 */
    public boolean mo51319d0() {
        return false;
    }

    /* renamed from: g */
    public yz6 mo50046g() {
        yz6 yz6 = this.f46250y;
        if (yz6 == null) {
            m74587y0(17);
        }
        return yz6;
    }

    /* renamed from: g0 */
    public MemberScope mo52347g0() {
        MemberScope.C7667a aVar = MemberScope.C7667a.f40117b;
        if (aVar == null) {
            m74587y0(15);
        }
        return aVar;
    }

    public C6983dm getAnnotations() {
        C6983dm dmVar = this.f46249C;
        if (dmVar == null) {
            m74587y0(21);
        }
        return dmVar;
    }

    public ClassKind getKind() {
        ClassKind classKind = ClassKind.ENUM_ENTRY;
        if (classKind == null) {
            m74587y0(18);
        }
        return classKind;
    }

    public fd1 getVisibility() {
        fd1 fd1 = ed1.f37510e;
        if (fd1 == null) {
            m74587y0(20);
        }
        return fd1;
    }

    /* renamed from: h */
    public Collection<ef0> mo52349h() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m74587y0(16);
        }
        return emptyList;
    }

    /* renamed from: h0 */
    public if0 mo52350h0() {
        return null;
    }

    /* renamed from: i */
    public boolean mo51669i() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: o */
    public List<a17> mo51670o() {
        List<a17> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m74587y0(22);
        }
        return emptyList;
    }

    /* renamed from: p */
    public Modality mo51326p() {
        Modality modality = Modality.FINAL;
        if (modality == null) {
            m74587y0(19);
        }
        return modality;
    }

    /* renamed from: q */
    public boolean mo52352q() {
        return false;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    /* renamed from: w */
    public Collection<if0> mo52354w() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m74587y0(23);
        }
        return emptyList;
    }

    /* renamed from: z */
    public ef0 mo52355z() {
        return null;
    }
}

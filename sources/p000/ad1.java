package p000;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: ad1 */
/* compiled from: DescriptorResolverUtils */
public final class ad1 {

    /* renamed from: ad1$a */
    /* compiled from: DescriptorResolverUtils */
    public static class C6820a extends n84 {

        /* renamed from: a */
        public final /* synthetic */ gr1 f36429a;

        /* renamed from: b */
        public final /* synthetic */ Set f36430b;

        /* renamed from: c */
        public final /* synthetic */ boolean f36431c;

        /* renamed from: ad1$a$a */
        /* compiled from: DescriptorResolverUtils */
        public class C6821a implements rc2<CallableMemberDescriptor, r37> {
            public C6821a() {
            }

            /* renamed from: a */
            public static /* synthetic */ void m55462a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"}));
            }

            /* renamed from: b */
            public r37 invoke(CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    m55462a(0);
                }
                C6820a.this.f36429a.mo51978a(callableMemberDescriptor);
                return r37.f33317a;
            }
        }

        public C6820a(gr1 gr1, Set set, boolean z) {
            this.f36429a = gr1;
            this.f36430b = set;
            this.f36431c = z;
        }

        /* renamed from: f */
        public static /* synthetic */ void m55458f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "fromSuper";
            } else if (i == 2) {
                objArr[0] = "fromCurrent";
            } else if (i == 3) {
                objArr[0] = "member";
            } else if (i != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i == 1 || i == 2) {
                objArr[2] = "conflict";
            } else if (i == 3 || i == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo50135a(CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                m55458f(0);
            }
            OverridingUtil.m62364K(callableMemberDescriptor, new C6821a());
            this.f36430b.add(callableMemberDescriptor);
        }

        /* renamed from: d */
        public void mo50136d(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection) {
            if (callableMemberDescriptor == null) {
                m55458f(3);
            }
            if (collection == null) {
                m55458f(4);
            }
            if (!this.f36431c || callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                super.mo50136d(callableMemberDescriptor, collection);
            }
        }

        /* renamed from: e */
        public void mo50137e(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
            if (callableMemberDescriptor == null) {
                m55458f(1);
            }
            if (callableMemberDescriptor2 == null) {
                m55458f(2);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m55453a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 18 ? 3 : 2)];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
            default:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 18 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: b */
    public static n87 m55454b(r24 r24, if0 if0) {
        if (r24 == null) {
            m55453a(19);
        }
        if (if0 == null) {
            m55453a(20);
        }
        Collection<ef0> h = if0.mo52349h();
        if (h.size() != 1) {
            return null;
        }
        for (n87 next : h.iterator().next().mo51763f()) {
            if (next.getName().equals(r24)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static <D extends CallableMemberDescriptor> Collection<D> m55455c(r24 r24, Collection<D> collection, Collection<D> collection2, if0 if0, gr1 gr1, OverridingUtil overridingUtil, boolean z) {
        if (r24 == null) {
            m55453a(12);
        }
        if (collection == null) {
            m55453a(13);
        }
        if (collection2 == null) {
            m55453a(14);
        }
        if (if0 == null) {
            m55453a(15);
        }
        if (gr1 == null) {
            m55453a(16);
        }
        if (overridingUtil == null) {
            m55453a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        overridingUtil.mo55055v(r24, collection, collection2, if0, new C6820a(gr1, linkedHashSet, z));
        return linkedHashSet;
    }

    /* renamed from: d */
    public static <D extends CallableMemberDescriptor> Collection<D> m55456d(r24 r24, Collection<D> collection, Collection<D> collection2, if0 if0, gr1 gr1, OverridingUtil overridingUtil) {
        if (r24 == null) {
            m55453a(0);
        }
        if (collection == null) {
            m55453a(1);
        }
        if (collection2 == null) {
            m55453a(2);
        }
        if (if0 == null) {
            m55453a(3);
        }
        if (gr1 == null) {
            m55453a(4);
        }
        if (overridingUtil == null) {
            m55453a(5);
        }
        return m55455c(r24, collection, collection2, if0, gr1, overridingUtil, false);
    }

    /* renamed from: e */
    public static <D extends CallableMemberDescriptor> Collection<D> m55457e(r24 r24, Collection<D> collection, Collection<D> collection2, if0 if0, gr1 gr1, OverridingUtil overridingUtil) {
        if (r24 == null) {
            m55453a(6);
        }
        if (collection == null) {
            m55453a(7);
        }
        if (collection2 == null) {
            m55453a(8);
        }
        if (if0 == null) {
            m55453a(9);
        }
        if (gr1 == null) {
            m55453a(10);
        }
        if (overridingUtil == null) {
            m55453a(11);
        }
        return m55455c(r24, collection, collection2, if0, gr1, overridingUtil, true);
    }
}

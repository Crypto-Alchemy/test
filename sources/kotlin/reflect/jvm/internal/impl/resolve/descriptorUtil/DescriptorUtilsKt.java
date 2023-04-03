package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7427d;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import p000.bd3;
import p000.k01;
import p000.k17;

/* compiled from: DescriptorUtils.kt */
public final class DescriptorUtilsKt {

    /* renamed from: a */
    public static final r24 f40098a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$a */
    /* compiled from: DescriptorUtils.kt */
    public static final class C7663a<N> implements k01.C7325c {

        /* renamed from: a */
        public static final C7663a<N> f40099a = new C7663a<>();

        /* renamed from: b */
        public final Iterable<n87> mo52834a(n87 n87) {
            Collection<n87> d = n87.mo51659d();
            ArrayList arrayList = new ArrayList(dk0.m43495u(d, 10));
            for (n87 a : d) {
                arrayList.add(a.mo50045a());
            }
            return arrayList;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$b */
    /* compiled from: DescriptorUtils.kt */
    public static final class C7664b<N> implements k01.C7325c {

        /* renamed from: a */
        public final /* synthetic */ boolean f40100a;

        public C7664b(boolean z) {
            this.f40100a = z;
        }

        /* renamed from: b */
        public final Iterable<CallableMemberDescriptor> mo52834a(CallableMemberDescriptor callableMemberDescriptor) {
            Collection<? extends CallableMemberDescriptor> collection = null;
            if (this.f40100a) {
                if (callableMemberDescriptor != null) {
                    callableMemberDescriptor = callableMemberDescriptor.mo50045a();
                } else {
                    callableMemberDescriptor = null;
                }
            }
            if (callableMemberDescriptor != null) {
                collection = callableMemberDescriptor.mo51659d();
            }
            if (collection == null) {
                return ck0.m33062j();
            }
            return collection;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$c */
    /* compiled from: DescriptorUtils.kt */
    public static final class C7665c extends k01.C7324b<CallableMemberDescriptor, CallableMemberDescriptor> {

        /* renamed from: a */
        public final /* synthetic */ Ref$ObjectRef<CallableMemberDescriptor> f40101a;

        /* renamed from: b */
        public final /* synthetic */ rc2<CallableMemberDescriptor, Boolean> f40102b;

        public C7665c(Ref$ObjectRef<CallableMemberDescriptor> ref$ObjectRef, rc2<? super CallableMemberDescriptor, Boolean> rc2) {
            this.f40101a = ref$ObjectRef;
            this.f40102b = rc2;
        }

        /* renamed from: d */
        public void mo52833b(CallableMemberDescriptor callableMemberDescriptor) {
            vx2.m53591g(callableMemberDescriptor, "current");
            if (this.f40101a.element == null && this.f40102b.invoke(callableMemberDescriptor).booleanValue()) {
                this.f40101a.element = callableMemberDescriptor;
            }
        }

        /* renamed from: e */
        public boolean mo52831c(CallableMemberDescriptor callableMemberDescriptor) {
            vx2.m53591g(callableMemberDescriptor, "current");
            if (this.f40101a.element == null) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public CallableMemberDescriptor mo52830a() {
            return (CallableMemberDescriptor) this.f40101a.element;
        }
    }

    static {
        r24 h = r24.m71445h("value");
        vx2.m53590f(h, "identifier(\"value\")");
        f40098a = h;
    }

    /* renamed from: a */
    public static final boolean m62440a(n87 n87) {
        vx2.m53591g(n87, "<this>");
        Boolean e = k01.m59632e(bk0.m32598e(n87), C7663a.f40099a, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.INSTANCE);
        vx2.m53590f(e, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return e.booleanValue();
    }

    /* renamed from: b */
    public static final CallableMemberDescriptor m62441b(CallableMemberDescriptor callableMemberDescriptor, boolean z, rc2<? super CallableMemberDescriptor, Boolean> rc2) {
        vx2.m53591g(callableMemberDescriptor, "<this>");
        vx2.m53591g(rc2, "predicate");
        return (CallableMemberDescriptor) k01.m59629b(bk0.m32598e(callableMemberDescriptor), new C7664b(z), new C7665c(new Ref$ObjectRef(), rc2));
    }

    /* renamed from: c */
    public static /* synthetic */ CallableMemberDescriptor m62442c(CallableMemberDescriptor callableMemberDescriptor, boolean z, rc2 rc2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m62441b(callableMemberDescriptor, z, rc2);
    }

    /* renamed from: d */
    public static final u82 m62443d(d31 d31) {
        vx2.m53591g(d31, "<this>");
        v82 i = m62448i(d31);
        if (!i.mo66447f()) {
            i = null;
        }
        if (i != null) {
            return i.mo66454l();
        }
        return null;
    }

    /* renamed from: e */
    public static final if0 m62444e(C9460vl vlVar) {
        vx2.m53591g(vlVar, "<this>");
        eg0 d = vlVar.getType().mo51134H0().mo51180d();
        if (d instanceof if0) {
            return (if0) d;
        }
        return null;
    }

    /* renamed from: f */
    public static final C7389b m62445f(d31 d31) {
        vx2.m53591g(d31, "<this>");
        return m62451l(d31).mo51535k();
    }

    /* renamed from: g */
    public static final nf0 m62446g(eg0 eg0) {
        d31 b;
        nf0 g;
        if (eg0 == null || (b = eg0.mo51119b()) == null) {
            return null;
        }
        if (b instanceof fk4) {
            return new nf0(((fk4) b).mo51711e(), eg0.getName());
        }
        if (!(b instanceof fg0) || (g = m62446g((eg0) b)) == null) {
            return null;
        }
        return g.mo62675d(eg0.getName());
    }

    /* renamed from: h */
    public static final u82 m62447h(d31 d31) {
        vx2.m53591g(d31, "<this>");
        u82 n = dd1.m56822n(d31);
        vx2.m53590f(n, "getFqNameSafe(this)");
        return n;
    }

    /* renamed from: i */
    public static final v82 m62448i(d31 d31) {
        vx2.m53591g(d31, "<this>");
        v82 m = dd1.m56821m(d31);
        vx2.m53590f(m, "getFqName(this)");
        return m;
    }

    /* renamed from: j */
    public static final mu2<d36> m62449j(if0 if0) {
        d87 d87;
        if (if0 != null) {
            d87 = if0.mo52344P();
        } else {
            d87 = null;
        }
        if (d87 instanceof mu2) {
            return (mu2) d87;
        }
        return null;
    }

    /* renamed from: k */
    public static final bd3 m62450k(mx3 mx3) {
        k17 k17;
        vx2.m53591g(mx3, "<this>");
        i95 i95 = (i95) mx3.mo51537l0(cd3.m56381a());
        if (i95 != null) {
            k17 = (k17) i95.mo52423a();
        } else {
            k17 = null;
        }
        if (k17 instanceof k17.C7330a) {
            return ((k17.C7330a) k17).mo52848b();
        }
        return bd3.C6859a.f36799a;
    }

    /* renamed from: l */
    public static final mx3 m62451l(d31 d31) {
        vx2.m53591g(d31, "<this>");
        mx3 g = dd1.m56815g(d31);
        vx2.m53590f(g, "getContainingModule(this)");
        return g;
    }

    /* renamed from: m */
    public static final hw5<d31> m62452m(d31 d31) {
        vx2.m53591g(d31, "<this>");
        return SequencesKt___SequencesKt.m63024n(m62453n(d31), 1);
    }

    /* renamed from: n */
    public static final hw5<d31> m62453n(d31 d31) {
        vx2.m53591g(d31, "<this>");
        return SequencesKt__SequencesKt.m63015j(d31, DescriptorUtilsKt$parentsWithSelf$1.INSTANCE);
    }

    /* renamed from: o */
    public static final CallableMemberDescriptor m62454o(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "<this>");
        if (!(callableMemberDescriptor instanceof C7427d)) {
            return callableMemberDescriptor;
        }
        fx4 R = ((C7427d) callableMemberDescriptor).mo51316R();
        vx2.m53590f(R, "correspondingProperty");
        return R;
    }

    /* renamed from: p */
    public static final if0 m62455p(if0 if0) {
        vx2.m53591g(if0, "<this>");
        for (xc3 next : if0.mo51464n().mo51134H0().mo51811g()) {
            if (!C7389b.m60123b0(next)) {
                eg0 d = next.mo51134H0().mo51180d();
                if (dd1.m56831w(d)) {
                    vx2.m53589e(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (if0) d;
                }
            }
        }
        return null;
    }

    /* renamed from: q */
    public static final boolean m62456q(mx3 mx3) {
        k17 k17;
        vx2.m53591g(mx3, "<this>");
        i95 i95 = (i95) mx3.mo51537l0(cd3.m56381a());
        if (i95 == null || (k17 = (k17) i95.mo52423a()) == null || !k17.mo52847a()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static final if0 m62457r(mx3 mx3, u82 u82, ul3 ul3) {
        vx2.m53591g(mx3, "<this>");
        vx2.m53591g(u82, "topLevelClassFqName");
        vx2.m53591g(ul3, "location");
        u82.mo66197d();
        u82 e = u82.mo66198e();
        vx2.m53590f(e, "topLevelClassFqName.parent()");
        MemberScope m = mx3.mo51532N(e).mo53288m();
        r24 g = u82.mo66201g();
        vx2.m53590f(g, "topLevelClassFqName.shortName()");
        eg0 e2 = m.mo50864e(g, ul3);
        if (e2 instanceof if0) {
            return (if0) e2;
        }
        return null;
    }
}

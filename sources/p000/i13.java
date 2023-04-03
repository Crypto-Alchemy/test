package p000;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p000.j83;

/* renamed from: i13 */
/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
public final class i13 implements ExternalOverridabilityCondition {

    /* renamed from: a */
    public static final C7200a f38316a = new C7200a((DefaultConstructorMarker) null);

    /* renamed from: i13$a */
    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class C7200a {
        public C7200a() {
        }

        public /* synthetic */ C7200a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo52365a(C7420a aVar, C7420a aVar2) {
            vx2.m53591g(aVar, "superDescriptor");
            vx2.m53591g(aVar2, "subDescriptor");
            if ((aVar2 instanceof JavaMethodDescriptor) && (aVar instanceof C7425c)) {
                JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) aVar2;
                javaMethodDescriptor.mo51763f().size();
                C7425c cVar = (C7425c) aVar;
                cVar.mo51763f().size();
                List<n87> f = javaMethodDescriptor.mo51329y0().mo51763f();
                vx2.m53590f(f, "subDescriptor.original.valueParameters");
                List<n87> f2 = cVar.mo50045a().mo51763f();
                vx2.m53590f(f2, "superDescriptor.original.valueParameters");
                for (Pair next : CollectionsKt___CollectionsKt.m47321R0(f, f2)) {
                    n87 n87 = (n87) next.component1();
                    n87 n872 = (n87) next.component2();
                    vx2.m53590f(n87, "subParameter");
                    boolean z = mo52367c((C7425c) aVar2, n87) instanceof j83.C7256d;
                    vx2.m53590f(n872, "superParameter");
                    if (z != (mo52367c(cVar, n872) instanceof j83.C7256d)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX WARNING: type inference failed for: r6v6, types: [eg0] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo52366b(kotlin.reflect.jvm.internal.impl.descriptors.C7425c r6) {
            /*
                r5 = this;
                java.util.List r0 = r6.mo51763f()
                int r0 = r0.size()
                r1 = 1
                r2 = 0
                if (r0 == r1) goto L_0x000d
                return r2
            L_0x000d:
                d31 r0 = r6.mo51119b()
                boolean r3 = r0 instanceof p000.if0
                r4 = 0
                if (r3 == 0) goto L_0x0019
                if0 r0 = (p000.if0) r0
                goto L_0x001a
            L_0x0019:
                r0 = r4
            L_0x001a:
                if (r0 != 0) goto L_0x001d
                return r2
            L_0x001d:
                java.util.List r6 = r6.mo51763f()
                java.lang.String r3 = "f.valueParameters"
                p000.vx2.m53590f(r6, r3)
                java.lang.Object r6 = kotlin.collections.CollectionsKt___CollectionsKt.m47355z0(r6)
                n87 r6 = (p000.n87) r6
                xc3 r6 = r6.getType()
                yz6 r6 = r6.mo51134H0()
                eg0 r6 = r6.mo51180d()
                boolean r3 = r6 instanceof p000.if0
                if (r3 == 0) goto L_0x003f
                r4 = r6
                if0 r4 = (p000.if0) r4
            L_0x003f:
                if (r4 != 0) goto L_0x0042
                return r2
            L_0x0042:
                boolean r6 = kotlin.reflect.jvm.internal.impl.builtins.C7389b.m60141q0(r0)
                if (r6 == 0) goto L_0x0057
                u82 r6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m62447h(r0)
                u82 r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m62447h(r4)
                boolean r6 = p000.vx2.m53586b(r6, r0)
                if (r6 == 0) goto L_0x0057
                goto L_0x0058
            L_0x0057:
                r1 = r2
            L_0x0058:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.i13.C7200a.mo52366b(kotlin.reflect.jvm.internal.impl.descriptors.c):boolean");
        }

        /* renamed from: c */
        public final j83 mo52367c(C7425c cVar, n87 n87) {
            if (ov3.m70795e(cVar) || mo52366b(cVar)) {
                xc3 type = n87.getType();
                vx2.m53590f(type, "valueParameterDescriptor.type");
                return ov3.m70797g(TypeUtilsKt.m62964t(type));
            }
            xc3 type2 = n87.getType();
            vx2.m53590f(type2, "valueParameterDescriptor.type");
            return ov3.m70797g(type2);
        }
    }

    /* renamed from: a */
    public ExternalOverridabilityCondition.Result mo52362a(C7420a aVar, C7420a aVar2, if0 if0) {
        vx2.m53591g(aVar, "superDescriptor");
        vx2.m53591g(aVar2, "subDescriptor");
        if (mo52363b(aVar, aVar2, if0)) {
            return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        if (f38316a.mo52365a(aVar, aVar2)) {
            return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    /* renamed from: b */
    public final boolean mo52363b(C7420a aVar, C7420a aVar2, if0 if0) {
        C7425c cVar;
        boolean z;
        if ((aVar instanceof CallableMemberDescriptor) && (aVar2 instanceof C7425c) && !C7389b.m60130f0(aVar2)) {
            BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.f39394n;
            C7425c cVar2 = (C7425c) aVar2;
            r24 name = cVar2.getName();
            vx2.m53590f(name, "subDescriptor.name");
            if (!builtinMethodsWithSpecialGenericSignature.mo53431l(name)) {
                SpecialGenericSignatures.C7449a aVar3 = SpecialGenericSignatures.f39411a;
                r24 name2 = cVar2.getName();
                vx2.m53590f(name2, "subDescriptor.name");
                if (!aVar3.mo53469k(name2)) {
                    return false;
                }
            }
            CallableMemberDescriptor e = SpecialBuiltinMembers.m60682e((CallableMemberDescriptor) aVar);
            boolean z2 = aVar instanceof C7425c;
            if (z2) {
                cVar = (C7425c) aVar;
            } else {
                cVar = null;
            }
            if (cVar == null || cVar2.mo51328w0() != cVar.mo51328w0()) {
                z = false;
            } else {
                z = true;
            }
            if ((!z) && (e == null || !cVar2.mo51328w0())) {
                return true;
            }
            if ((if0 instanceof s03) && cVar2.mo51325n0() == null && e != null && !SpecialBuiltinMembers.m60683f(if0, e)) {
                if ((e instanceof C7425c) && z2 && BuiltinMethodsWithSpecialGenericSignature.m60658k((C7425c) e) != null) {
                    String c = ov3.m70793c(cVar2, false, false, 2, (Object) null);
                    C7425c a = ((C7425c) aVar).mo50045a();
                    vx2.m53590f(a, "superDescriptor.original");
                    if (vx2.m53586b(c, ov3.m70793c(a, false, false, 2, (Object) null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public ExternalOverridabilityCondition.Contract getContract() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }
}

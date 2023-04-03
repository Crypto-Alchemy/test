package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C6169a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: ValueParameterDescriptorImpl.kt */
public class ValueParameterDescriptorImpl extends C7437b implements n87 {

    /* renamed from: C */
    public static final C7432a f39315C = new C7432a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final xc3 f39316A;

    /* renamed from: B */
    public final n87 f39317B;

    /* renamed from: r */
    public final int f39318r;

    /* renamed from: s */
    public final boolean f39319s;

    /* renamed from: x */
    public final boolean f39320x;

    /* renamed from: y */
    public final boolean f39321y;

    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class WithDestructuringDeclaration extends ValueParameterDescriptorImpl {

        /* renamed from: H */
        public final ef3 f39322H;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public WithDestructuringDeclaration(C7420a aVar, n87 n87, int i, C6983dm dmVar, r24 r24, xc3 xc3, boolean z, boolean z2, boolean z3, xc3 xc32, a66 a66, pc2<? extends List<? extends o87>> pc2) {
            super(aVar, n87, i, dmVar, r24, xc3, z, z2, z3, xc32, a66);
            vx2.m53591g(aVar, "containingDeclaration");
            vx2.m53591g(dmVar, "annotations");
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            vx2.m53591g(xc3, "outType");
            vx2.m53591g(a66, "source");
            vx2.m53591g(pc2, "destructuringVariables");
            this.f39322H = C6169a.m47232a(pc2);
        }

        /* renamed from: B0 */
        public n87 mo53311B0(C7420a aVar, r24 r24, int i) {
            C7420a aVar2 = aVar;
            vx2.m53591g(aVar2, "newOwner");
            r24 r242 = r24;
            vx2.m53591g(r242, "newName");
            C6983dm annotations = getAnnotations();
            vx2.m53590f(annotations, "annotations");
            xc3 type = getType();
            vx2.m53590f(type, "type");
            boolean v0 = mo53318v0();
            boolean m0 = mo53316m0();
            boolean k0 = mo53315k0();
            xc3 q0 = mo53317q0();
            a66 a66 = a66.f36360a;
            vx2.m53590f(a66, "NO_SOURCE");
            return new WithDestructuringDeclaration(aVar2, (n87) null, i, annotations, r242, type, v0, m0, k0, q0, a66, new ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1(this));
        }

        /* renamed from: H0 */
        public final List<o87> mo53319H0() {
            return (List) this.f39322H.getValue();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl$a */
    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class C7432a {
        public C7432a() {
        }

        public /* synthetic */ C7432a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ValueParameterDescriptorImpl mo53320a(C7420a aVar, n87 n87, int i, C6983dm dmVar, r24 r24, xc3 xc3, boolean z, boolean z2, boolean z3, xc3 xc32, a66 a66, pc2<? extends List<? extends o87>> pc2) {
            C7420a aVar2 = aVar;
            vx2.m53591g(aVar, "containingDeclaration");
            vx2.m53591g(dmVar, "annotations");
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            vx2.m53591g(xc3, "outType");
            vx2.m53591g(a66, "source");
            if (pc2 == null) {
                return new ValueParameterDescriptorImpl(aVar, n87, i, dmVar, r24, xc3, z, z2, z3, xc32, a66);
            }
            return new WithDestructuringDeclaration(aVar, n87, i, dmVar, r24, xc3, z, z2, z3, xc32, a66, pc2);
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [n87] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ValueParameterDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.C7420a r8, p000.n87 r9, int r10, p000.C6983dm r11, p000.r24 r12, p000.xc3 r13, boolean r14, boolean r15, boolean r16, p000.xc3 r17, p000.a66 r18) {
        /*
            r7 = this;
            r6 = r7
            java.lang.String r0 = "containingDeclaration"
            r1 = r8
            p000.vx2.m53591g(r8, r0)
            java.lang.String r0 = "annotations"
            r2 = r11
            p000.vx2.m53591g(r11, r0)
            java.lang.String r0 = "name"
            r3 = r12
            p000.vx2.m53591g(r12, r0)
            java.lang.String r0 = "outType"
            r4 = r13
            p000.vx2.m53591g(r13, r0)
            java.lang.String r0 = "source"
            r5 = r18
            p000.vx2.m53591g(r5, r0)
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r10
            r6.f39318r = r0
            r0 = r14
            r6.f39319s = r0
            r0 = r15
            r6.f39320x = r0
            r0 = r16
            r6.f39321y = r0
            r0 = r17
            r6.f39316A = r0
            if (r9 != 0) goto L_0x0039
            r0 = r6
            goto L_0x003a
        L_0x0039:
            r0 = r9
        L_0x003a:
            r6.f39317B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.<init>(kotlin.reflect.jvm.internal.impl.descriptors.a, n87, int, dm, r24, xc3, boolean, boolean, boolean, xc3, a66):void");
    }

    /* renamed from: E0 */
    public static final ValueParameterDescriptorImpl m60457E0(C7420a aVar, n87 n87, int i, C6983dm dmVar, r24 r24, xc3 xc3, boolean z, boolean z2, boolean z3, xc3 xc32, a66 a66, pc2<? extends List<? extends o87>> pc2) {
        return f39315C.mo53320a(aVar, n87, i, dmVar, r24, xc3, z, z2, z3, xc32, a66, pc2);
    }

    /* renamed from: B0 */
    public n87 mo53311B0(C7420a aVar, r24 r24, int i) {
        vx2.m53591g(aVar, "newOwner");
        vx2.m53591g(r24, "newName");
        C6983dm annotations = getAnnotations();
        vx2.m53590f(annotations, "annotations");
        xc3 type = getType();
        vx2.m53590f(type, "type");
        boolean v0 = mo53318v0();
        boolean m0 = mo53316m0();
        boolean k0 = mo53315k0();
        xc3 q0 = mo53317q0();
        a66 a66 = a66.f36360a;
        vx2.m53590f(a66, "NO_SOURCE");
        return new ValueParameterDescriptorImpl(aVar, (n87) null, i, annotations, r24, type, v0, m0, k0, q0, a66);
    }

    /* renamed from: F0 */
    public Void mo53312F0() {
        return null;
    }

    /* renamed from: G0 */
    public n87 mo50708c(TypeSubstitutor typeSubstitutor) {
        vx2.m53591g(typeSubstitutor, "substitutor");
        if (typeSubstitutor.mo55336k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: I */
    public boolean mo51761I() {
        return false;
    }

    /* renamed from: d */
    public Collection<n87> mo51659d() {
        Collection<? extends C7420a> d = mo51119b().mo51659d();
        vx2.m53590f(d, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(dk0.m43495u(d, 10));
        for (C7420a f : d) {
            arrayList.add(f.mo51763f().get(getIndex()));
        }
        return arrayList;
    }

    public int getIndex() {
        return this.f39318r;
    }

    public fd1 getVisibility() {
        fd1 fd1 = ed1.f37511f;
        vx2.m53590f(fd1, "LOCAL");
        return fd1;
    }

    /* renamed from: i0 */
    public /* bridge */ /* synthetic */ fq0 mo51768i0() {
        return (fq0) mo53312F0();
    }

    /* renamed from: j0 */
    public <R, D> R mo51120j0(h31<R, D> h31, D d) {
        vx2.m53591g(h31, "visitor");
        return h31.mo52115m(this, d);
    }

    /* renamed from: k0 */
    public boolean mo53315k0() {
        return this.f39321y;
    }

    /* renamed from: m0 */
    public boolean mo53316m0() {
        return this.f39320x;
    }

    /* renamed from: q0 */
    public xc3 mo53317q0() {
        return this.f39316A;
    }

    /* renamed from: v0 */
    public boolean mo53318v0() {
        if (this.f39319s) {
            C7420a b = mo51119b();
            vx2.m53589e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            if (((CallableMemberDescriptor) b).getKind().isReal()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public C7420a m60466b() {
        d31 b = super.mo51119b();
        vx2.m53589e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (C7420a) b;
    }

    /* renamed from: a */
    public n87 m60464a() {
        n87 n87 = this.f39317B;
        return n87 == this ? this : n87.mo50045a();
    }
}

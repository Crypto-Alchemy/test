package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: TypeAliasConstructorDescriptor.kt */
public final class TypeAliasConstructorDescriptorImpl extends C7433a implements gz6 {

    /* renamed from: v1 */
    public static final C7431a f39309v1 = new C7431a((DefaultConstructorMarker) null);

    /* renamed from: w1 */
    public static final /* synthetic */ i93<Object>[] f39310w1 = {ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(TypeAliasConstructorDescriptorImpl.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* renamed from: r1 */
    public final da6 f39311r1;

    /* renamed from: s1 */
    public final hz6 f39312s1;

    /* renamed from: t1 */
    public final gc4 f39313t1;

    /* renamed from: u1 */
    public ef0 f39314u1;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl$a */
    /* compiled from: TypeAliasConstructorDescriptor.kt */
    public static final class C7431a {
        public C7431a() {
        }

        public /* synthetic */ C7431a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final gz6 mo53309b(da6 da6, hz6 hz6, ef0 ef0) {
            ef0 c;
            List list;
            hz6 hz62 = hz6;
            ef0 ef02 = ef0;
            vx2.m53591g(da6, "storageManager");
            vx2.m53591g(hz62, "typeAliasDescriptor");
            vx2.m53591g(ef02, "constructor");
            TypeSubstitutor c2 = mo53310c(hz62);
            h85 h85 = null;
            if (c2 == null || (c = ef02.mo50708c(c2)) == null) {
                return null;
            }
            C6983dm annotations = ef0.getAnnotations();
            CallableMemberDescriptor.Kind kind = ef0.getKind();
            vx2.m53590f(kind, "constructor.kind");
            a66 source = hz6.getSource();
            vx2.m53590f(source, "typeAliasDescriptor.source");
            TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = new TypeAliasConstructorDescriptorImpl(da6, hz6, c, (gz6) null, annotations, kind, source, (DefaultConstructorMarker) null);
            List<n87> I0 = C7433a.m60480I0(typeAliasConstructorDescriptorImpl, ef0.mo51763f(), c2);
            if (I0 == null) {
                return null;
            }
            d36 c3 = n42.m64517c(c.getReturnType().mo64506K0());
            d36 n = hz6.mo51464n();
            vx2.m53590f(n, "typeAliasDescriptor.defaultType");
            d36 j = o66.m70170j(c3, n);
            h85 G = ef0.mo51311G();
            if (G != null) {
                h85 = wc1.m73548h(typeAliasConstructorDescriptorImpl, c2.mo55338n(G.getType(), Variance.INVARIANT), C6983dm.f37317b.mo51228b());
            }
            h85 h852 = h85;
            if0 r = hz6.mo52333r();
            if (r != null) {
                List<h85> s0 = ef0.mo51327s0();
                vx2.m53590f(s0, "constructor.contextReceiverParameters");
                list = new ArrayList(dk0.m43495u(s0, 10));
                for (h85 type : s0) {
                    list.add(wc1.m73543c(r, c2.mo55338n(type.getType(), Variance.INVARIANT), C6983dm.f37317b.mo51228b()));
                }
            } else {
                list = ck0.m33062j();
            }
            typeAliasConstructorDescriptorImpl.mo52098L0(h852, (h85) null, list, hz6.mo51670o(), I0, j, Modality.FINAL, hz6.getVisibility());
            return typeAliasConstructorDescriptorImpl;
        }

        /* renamed from: c */
        public final TypeSubstitutor mo53310c(hz6 hz6) {
            if (hz6.mo52333r() == null) {
                return null;
            }
            return TypeSubstitutor.m62901f(hz6.mo52331C());
        }
    }

    public TypeAliasConstructorDescriptorImpl(da6 da6, hz6 hz6, ef0 ef0, gz6 gz6, C6983dm dmVar, CallableMemberDescriptor.Kind kind, a66 a66) {
        super(hz6, gz6, dmVar, n66.f41110i, kind, a66);
        this.f39311r1 = da6;
        this.f39312s1 = hz6;
        mo53326P0(mo53307i1().mo51317T());
        this.f39313t1 = da6.mo51162g(new TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2(this, ef0));
        this.f39314u1 = ef0;
    }

    public /* synthetic */ TypeAliasConstructorDescriptorImpl(da6 da6, hz6 hz6, ef0 ef0, gz6 gz6, C6983dm dmVar, CallableMemberDescriptor.Kind kind, a66 a66, DefaultConstructorMarker defaultConstructorMarker) {
        this(da6, hz6, ef0, gz6, dmVar, kind, a66);
    }

    /* renamed from: H */
    public final da6 mo53302H() {
        return this.f39311r1;
    }

    /* renamed from: M */
    public ef0 mo52084M() {
        return this.f39314u1;
    }

    /* renamed from: W */
    public boolean mo51657W() {
        return mo52084M().mo51657W();
    }

    /* renamed from: X */
    public if0 mo51658X() {
        if0 X = mo52084M().mo51658X();
        vx2.m53590f(X, "underlyingConstructorDescriptor.constructedClass");
        return X;
    }

    /* renamed from: e1 */
    public gz6 mo50948f0(d31 d31, Modality modality, fd1 fd1, CallableMemberDescriptor.Kind kind, boolean z) {
        vx2.m53591g(d31, "newOwner");
        vx2.m53591g(modality, "modality");
        vx2.m53591g(fd1, "visibility");
        vx2.m53591g(kind, "kind");
        Object build = mo50951s().mo50963j(d31).mo50964k(modality).mo50957d(fd1).mo50971r(kind).mo50967n(z).build();
        vx2.m53589e(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (gz6) build;
    }

    /* renamed from: f1 */
    public TypeAliasConstructorDescriptorImpl mo50142F0(d31 d31, C7425c cVar, CallableMemberDescriptor.Kind kind, r24 r24, C6983dm dmVar, a66 a66) {
        vx2.m53591g(d31, "newOwner");
        vx2.m53591g(kind, "kind");
        vx2.m53591g(dmVar, "annotations");
        vx2.m53591g(a66, "source");
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind != kind2) {
            CallableMemberDescriptor.Kind kind3 = CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return new TypeAliasConstructorDescriptorImpl(this.f39311r1, mo53307i1(), mo52084M(), this, dmVar, kind2, a66);
    }

    /* renamed from: g1 */
    public hz6 m60442b() {
        return mo53307i1();
    }

    public xc3 getReturnType() {
        xc3 returnType = super.getReturnType();
        vx2.m53588d(returnType);
        return returnType;
    }

    /* renamed from: h1 */
    public gz6 mo51329y0() {
        C7425c a = super.mo51329y0();
        vx2.m53589e(a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (gz6) a;
    }

    /* renamed from: i1 */
    public hz6 mo53307i1() {
        return this.f39312s1;
    }

    /* renamed from: j1 */
    public gz6 m60445c(TypeSubstitutor typeSubstitutor) {
        vx2.m53591g(typeSubstitutor, "substitutor");
        C7425c c = super.mo50708c(typeSubstitutor);
        vx2.m53589e(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) c;
        TypeSubstitutor f = TypeSubstitutor.m62901f(typeAliasConstructorDescriptorImpl.getReturnType());
        vx2.m53590f(f, "create(substitutedTypeAliasConstructor.returnType)");
        ef0 c2 = mo52084M().mo50045a().mo50708c(f);
        if (c2 == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.f39314u1 = c2;
        return typeAliasConstructorDescriptorImpl;
    }
}

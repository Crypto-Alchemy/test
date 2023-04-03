package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p000.k01;

/* compiled from: JvmBuiltInsCustomizer.kt */
public final class JvmBuiltInsCustomizer implements C6818ad, bp4 {

    /* renamed from: h */
    public static final /* synthetic */ i93<Object>[] f39227h;

    /* renamed from: a */
    public final mx3 f39228a;

    /* renamed from: b */
    public final d23 f39229b = d23.f37229a;

    /* renamed from: c */
    public final q84 f39230c;

    /* renamed from: d */
    public final xc3 f39231d;

    /* renamed from: e */
    public final q84 f39232e;

    /* renamed from: f */
    public final i80<u82, if0> f39233f;

    /* renamed from: g */
    public final q84 f39234g;

    /* compiled from: JvmBuiltInsCustomizer.kt */
    public enum JDKMemberStatus {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$a */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    public /* synthetic */ class C7404a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39236a;

        static {
            int[] iArr = new int[JDKMemberStatus.values().length];
            iArr[JDKMemberStatus.HIDDEN.ordinal()] = 1;
            iArr[JDKMemberStatus.NOT_CONSIDERED.ordinal()] = 2;
            iArr[JDKMemberStatus.DROP.ordinal()] = 3;
            iArr[JDKMemberStatus.VISIBLE.ordinal()] = 4;
            f39236a = iArr;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$b */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    public static final class C7405b extends gk4 {
        public C7405b(mx3 mx3, u82 u82) {
            super(mx3, u82);
        }

        /* renamed from: A0 */
        public MemberScope.C7667a mo51712m() {
            return MemberScope.C7667a.f40117b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$c */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    public static final class C7406c<N> implements k01.C7325c {

        /* renamed from: a */
        public final /* synthetic */ JvmBuiltInsCustomizer f39237a;

        public C7406c(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
            this.f39237a = jvmBuiltInsCustomizer;
        }

        /* renamed from: b */
        public final Iterable<if0> mo52834a(if0 if0) {
            eg0 eg0;
            if0 if02;
            Collection<xc3> g = if0.mo50046g().mo51811g();
            vx2.m53590f(g, "it.typeConstructor.supertypes");
            JvmBuiltInsCustomizer jvmBuiltInsCustomizer = this.f39237a;
            ArrayList arrayList = new ArrayList();
            for (xc3 H0 : g) {
                eg0 d = H0.mo51134H0().mo51180d();
                LazyJavaClassDescriptor lazyJavaClassDescriptor = null;
                if (d != null) {
                    eg0 = d.mo50045a();
                } else {
                    eg0 = null;
                }
                if (eg0 instanceof if0) {
                    if02 = (if0) eg0;
                } else {
                    if02 = null;
                }
                if (if02 != null) {
                    lazyJavaClassDescriptor = jvmBuiltInsCustomizer.mo53223p(if02);
                }
                if (lazyJavaClassDescriptor != null) {
                    arrayList.add(lazyJavaClassDescriptor);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$d */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    public static final class C7407d extends k01.C7324b<if0, JDKMemberStatus> {

        /* renamed from: a */
        public final /* synthetic */ String f39238a;

        /* renamed from: b */
        public final /* synthetic */ Ref$ObjectRef<JDKMemberStatus> f39239b;

        public C7407d(String str, Ref$ObjectRef<JDKMemberStatus> ref$ObjectRef) {
            this.f39238a = str;
            this.f39239b = ref$ObjectRef;
        }

        /* renamed from: d */
        public boolean mo52831c(if0 if0) {
            vx2.m53591g(if0, "javaClassDescriptor");
            String a = nv3.m70094a(SignatureBuildingComponents.f39611a, if0, this.f39238a);
            w73 w73 = w73.f45458a;
            if (w73.mo66658e().contains(a)) {
                this.f39239b.element = JDKMemberStatus.HIDDEN;
            } else if (w73.mo66661h().contains(a)) {
                this.f39239b.element = JDKMemberStatus.VISIBLE;
            } else if (w73.mo66656c().contains(a)) {
                this.f39239b.element = JDKMemberStatus.DROP;
            }
            if (this.f39239b.element == null) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public JDKMemberStatus mo52830a() {
            JDKMemberStatus jDKMemberStatus = (JDKMemberStatus) this.f39239b.element;
            if (jDKMemberStatus == null) {
                return JDKMemberStatus.NOT_CONSIDERED;
            }
            return jDKMemberStatus;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$e */
    /* compiled from: JvmBuiltInsCustomizer.kt */
    public static final class C7408e<N> implements k01.C7325c {

        /* renamed from: a */
        public static final C7408e<N> f39240a = new C7408e<>();

        /* renamed from: b */
        public final Iterable<CallableMemberDescriptor> mo52834a(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor.mo50045a().mo51659d();
        }
    }

    static {
        Class<JvmBuiltInsCustomizer> cls = JvmBuiltInsCustomizer.class;
        f39227h = new i93[]{ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public JvmBuiltInsCustomizer(mx3 mx3, da6 da6, pc2<JvmBuiltIns.C7401a> pc2) {
        vx2.m53591g(mx3, "moduleDescriptor");
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(pc2, "settingsComputation");
        this.f39228a = mx3;
        this.f39230c = da6.mo51164i(pc2);
        this.f39231d = mo53219k(da6);
        this.f39232e = da6.mo51164i(new JvmBuiltInsCustomizer$cloneableType$2(this, da6));
        this.f39233f = da6.mo51157b();
        this.f39234g = da6.mo51164i(new JvmBuiltInsCustomizer$notConsideredDeprecation$2(this));
    }

    /* renamed from: n */
    public static final boolean m60245n(C7424b bVar, TypeSubstitutor typeSubstitutor, C7424b bVar2) {
        if (OverridingUtil.m62386x(bVar, bVar2.mo50708c(typeSubstitutor)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Collection<xc3> mo50131a(if0 if0) {
        vx2.m53591g(if0, "classDescriptor");
        v82 i = DescriptorUtilsKt.m62448i(if0);
        w73 w73 = w73.f45458a;
        if (w73.mo66662i(i)) {
            d36 m = mo53221m();
            vx2.m53590f(m, "cloneableType");
            return ck0.m33065m(m, this.f39231d);
        } else if (w73.mo66663j(i)) {
            return bk0.m32598e(this.f39231d);
        } else {
            return ck0.m33062j();
        }
    }

    /* renamed from: c */
    public boolean mo50688c(if0 if0, C7428e eVar) {
        vx2.m53591g(if0, "classDescriptor");
        vx2.m53591g(eVar, "functionDescriptor");
        LazyJavaClassDescriptor p = mo53223p(if0);
        if (p == null || !eVar.getAnnotations().mo51224C0(cp4.m56488a())) {
            return true;
        }
        if (!mo53226s().mo53217b()) {
            return false;
        }
        String c = ov3.m70793c(eVar, false, false, 3, (Object) null);
        LazyJavaClassMemberScope M0 = p.mo52462S();
        r24 name = eVar.getName();
        vx2.m53590f(name, "functionDescriptor.name");
        Collection<C7428e> c2 = M0.mo50862c(name, NoLookupLocation.FROM_BUILTINS);
        if (!(c2 instanceof Collection) || !c2.isEmpty()) {
            for (C7428e c3 : c2) {
                if (vx2.m53586b(ov3.m70793c(c3, false, false, 3, (Object) null), c)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fc, code lost:
        if (r2 != 3) goto L_0x0111;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ae A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.C7428e> mo50133d(p000.r24 r7, p000.if0 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "name"
            p000.vx2.m53591g(r7, r0)
            java.lang.String r0 = "classDescriptor"
            p000.vx2.m53591g(r8, r0)
            eh0$a r0 = p000.eh0.f37543e
            r24 r0 = r0.mo51468a()
            boolean r0 = p000.vx2.m53586b(r7, r0)
            r1 = 1
            if (r0 == 0) goto L_0x008d
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor
            if (r0 == 0) goto L_0x008d
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.C7389b.m60127d0(r8)
            if (r0 == 0) goto L_0x008d
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r8 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) r8
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.mo55173V0()
            java.util.List r0 = r0.getFunctionList()
            java.lang.String r2 = "classDescriptor.classProto.functionList"
            p000.vx2.m53590f(r0, r2)
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L_0x003d
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x003d
        L_0x003b:
            r1 = r3
            goto L_0x0069
        L_0x003d:
            java.util.Iterator r0 = r0.iterator()
        L_0x0041:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003b
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function) r2
            md1 r4 = r8.mo55172U0()
            t24 r4 = r4.mo56230g()
            int r2 = r2.getName()
            r24 r2 = p000.v24.m73044b(r4, r2)
            eh0$a r4 = p000.eh0.f37543e
            r24 r4 = r4.mo51468a()
            boolean r2 = p000.vx2.m53586b(r2, r4)
            if (r2 == 0) goto L_0x0041
        L_0x0069:
            if (r1 == 0) goto L_0x0070
            java.util.List r7 = p000.ck0.m33062j()
            return r7
        L_0x0070:
            d36 r0 = r6.mo53221m()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r0 = r0.mo51146m()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r1 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS
            java.util.Collection r7 = r0.mo50862c(r7, r1)
            java.lang.Object r7 = kotlin.collections.CollectionsKt___CollectionsKt.m47354y0(r7)
            kotlin.reflect.jvm.internal.impl.descriptors.e r7 = (kotlin.reflect.jvm.internal.impl.descriptors.C7428e) r7
            kotlin.reflect.jvm.internal.impl.descriptors.e r7 = r6.mo53218j(r8, r7)
            java.util.List r7 = p000.bk0.m32598e(r7)
            return r7
        L_0x008d:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$a r0 = r6.mo53226s()
            boolean r0 = r0.mo53217b()
            if (r0 != 0) goto L_0x009c
            java.util.List r7 = p000.ck0.m33062j()
            return r7
        L_0x009c:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getFunctions$2 r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getFunctions$2
            r0.<init>(r7)
            java.util.Collection r7 = r6.mo53220l(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x00ae:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0121
            java.lang.Object r2 = r7.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C7428e) r2
            d31 r3 = r2.mo51119b()
            java.lang.String r4 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            p000.vx2.m53589e(r3, r4)
            if0 r3 = (p000.if0) r3
            a07 r3 = p000.yn3.m74479a(r3, r8)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r3 = r3.mo65206c()
            kotlin.reflect.jvm.internal.impl.descriptors.c r3 = r2.mo50708c(r3)
            java.lang.String r4 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor"
            p000.vx2.m53589e(r3, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C7428e) r3
            kotlin.reflect.jvm.internal.impl.descriptors.c$a r3 = r3.mo50951s()
            r3.mo50963j(r8)
            h85 r4 = r8.mo52460D0()
            r3.mo50958e(r4)
            r3.mo50965l()
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus r2 = r6.mo53224q(r2)
            int[] r4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.C7404a.f39236a
            int r2 = r2.ordinal()
            r2 = r4[r2]
            r4 = 0
            if (r2 == r1) goto L_0x0107
            r5 = 2
            if (r2 == r5) goto L_0x00ff
            r5 = 3
            if (r2 == r5) goto L_0x011b
            goto L_0x0111
        L_0x00ff:
            dm r2 = r6.mo53225r()
            r3.mo50969p(r2)
            goto L_0x0111
        L_0x0107:
            boolean r2 = p000.iw3.m59127a(r8)
            if (r2 == 0) goto L_0x010e
            goto L_0x011b
        L_0x010e:
            r3.mo50960g()
        L_0x0111:
            kotlin.reflect.jvm.internal.impl.descriptors.c r2 = r3.build()
            p000.vx2.m53588d(r2)
            r4 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.e r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C7428e) r4
        L_0x011b:
            if (r4 == 0) goto L_0x00ae
            r0.add(r4)
            goto L_0x00ae
        L_0x0121:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.mo50133d(r24, if0):java.util.Collection");
    }

    /* renamed from: e */
    public Collection<ef0> mo50134e(if0 if0) {
        boolean z;
        vx2.m53591g(if0, "classDescriptor");
        if (if0.getKind() != ClassKind.CLASS || !mo53226s().mo53217b()) {
            return ck0.m33062j();
        }
        LazyJavaClassDescriptor p = mo53223p(if0);
        if (p == null) {
            return ck0.m33062j();
        }
        if0 f = d23.m56622f(this.f39229b, DescriptorUtilsKt.m62447h(p), yy1.f46296h.mo67192a(), (Integer) null, 4, (Object) null);
        if (f == null) {
            return ck0.m33062j();
        }
        TypeSubstitutor c = yn3.m74479a(f, p).mo65206c();
        List<ef0> I0 = p.mo52349h();
        ArrayList<ef0> arrayList = new ArrayList<>();
        Iterator<T> it = I0.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            ef0 ef0 = (ef0) next;
            if (ef0.getVisibility().mo51643d()) {
                Collection<ef0> h = f.mo52349h();
                vx2.m53590f(h, "defaultKotlinVersion.constructors");
                if (!(h instanceof Collection) || !h.isEmpty()) {
                    Iterator<T> it2 = h.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ef0 ef02 = (ef0) it2.next();
                        vx2.m53590f(ef02, "it");
                        if (m60245n(ef02, c, ef0)) {
                            z = false;
                            break;
                        }
                    }
                    if (z && !mo53228u(ef0, if0) && !C7389b.m60134j0(ef0) && !w73.f45458a.mo66657d().contains(nv3.m70094a(SignatureBuildingComponents.f39611a, p, ov3.m70793c(ef0, false, false, 3, (Object) null)))) {
                        z2 = true;
                    }
                }
                z = true;
                z2 = true;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(dk0.m43495u(arrayList, 10));
        for (ef0 ef03 : arrayList) {
            C7425c.C7426a<? extends C7425c> s = ef03.mo50951s();
            s.mo50963j(if0);
            s.mo50970q(if0.mo51464n());
            s.mo50965l();
            s.mo50959f(c.mo55335j());
            if (!w73.f45458a.mo66660g().contains(nv3.m70094a(SignatureBuildingComponents.f39611a, p, ov3.m70793c(ef03, false, false, 3, (Object) null)))) {
                s.mo50969p(mo53225r());
            }
            Object build = s.build();
            vx2.m53589e(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((ef0) build);
        }
        return arrayList2;
    }

    /* renamed from: j */
    public final C7428e mo53218j(DeserializedClassDescriptor deserializedClassDescriptor, C7428e eVar) {
        C7425c.C7426a<? extends C7428e> s = eVar.mo50951s();
        s.mo50963j(deserializedClassDescriptor);
        s.mo50957d(ed1.f37510e);
        s.mo50970q(deserializedClassDescriptor.mo51464n());
        s.mo50958e(deserializedClassDescriptor.mo52460D0());
        Object build = s.build();
        vx2.m53588d(build);
        return (C7428e) build;
    }

    /* renamed from: k */
    public final xc3 mo53219k(da6 da6) {
        lf0 lf0 = new lf0(new C7405b(this.f39228a, new u82("java.io")), r24.m71445h("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, bk0.m32598e(new LazyWrappedType(da6, new C7409xd3162e24(this))), a66.f36360a, false, da6);
        lf0.mo55890E0(MemberScope.C7667a.f40117b, ny5.m49095e(), (ef0) null);
        d36 n = lf0.mo51464n();
        vx2.m53590f(n, "mockSerializableClass.defaultType");
        return n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00eb, code lost:
        if (mo53227t(r3, r10) != false) goto L_0x0097;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.C7428e> mo53220l(p000.if0 r10, p000.rc2<? super kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, ? extends java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.C7428e>> r11) {
        /*
            r9 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r0 = r9.mo53223p(r10)
            if (r0 != 0) goto L_0x000b
            java.util.List r10 = p000.ck0.m33062j()
            return r10
        L_0x000b:
            d23 r1 = r9.f39229b
            u82 r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m62447h(r0)
            yy1$a r3 = p000.yy1.f46296h
            kotlin.reflect.jvm.internal.impl.builtins.b r3 = r3.mo67192a()
            java.util.Collection r1 = r1.mo51033g(r2, r3)
            java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.m47341l0(r1)
            if0 r2 = (p000.if0) r2
            if (r2 != 0) goto L_0x0028
            java.util.List r10 = p000.ck0.m33062j()
            return r10
        L_0x0028:
            w46$b r3 = p000.w46.f45438e
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = p000.dk0.m43495u(r1, r5)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x0039:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x004d
            java.lang.Object r5 = r1.next()
            if0 r5 = (p000.if0) r5
            u82 r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m62447h(r5)
            r4.add(r5)
            goto L_0x0039
        L_0x004d:
            w46 r1 = r3.mo66632b(r4)
            d23 r3 = r9.f39229b
            boolean r10 = r3.mo51030c(r10)
            i80<u82, if0> r3 = r9.f39233f
            u82 r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m62447h(r0)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1 r5 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1
            r5.<init>(r0, r2)
            java.lang.Object r0 = r3.mo52416a(r4, r5)
            if0 r0 = (p000.if0) r0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r0 = r0.mo52462S()
            java.lang.String r2 = "fakeJavaClassDescriptor.unsubstitutedMemberScope"
            p000.vx2.m53590f(r0, r2)
            java.lang.Object r11 = r11.invoke(r0)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0080:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x00f3
            java.lang.Object r2 = r11.next()
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C7428e) r3
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r4 = r3.getKind()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r5 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L_0x0099
        L_0x0097:
            r6 = r7
            goto L_0x00ed
        L_0x0099:
            fd1 r4 = r3.getVisibility()
            boolean r4 = r4.mo51643d()
            if (r4 != 0) goto L_0x00a4
            goto L_0x0097
        L_0x00a4:
            boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.C7389b.m60134j0(r3)
            if (r4 == 0) goto L_0x00ab
            goto L_0x0097
        L_0x00ab:
            java.util.Collection r4 = r3.mo51659d()
            java.lang.String r5 = "analogueMember.overriddenDescriptors"
            p000.vx2.m53590f(r4, r5)
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L_0x00c0
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x00c0
        L_0x00be:
            r4 = r7
            goto L_0x00e4
        L_0x00c0:
            java.util.Iterator r4 = r4.iterator()
        L_0x00c4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00be
            java.lang.Object r5 = r4.next()
            kotlin.reflect.jvm.internal.impl.descriptors.c r5 = (kotlin.reflect.jvm.internal.impl.descriptors.C7425c) r5
            d31 r5 = r5.mo51119b()
            java.lang.String r8 = "it.containingDeclaration"
            p000.vx2.m53590f(r5, r8)
            u82 r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m62447h(r5)
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L_0x00c4
            r4 = r6
        L_0x00e4:
            if (r4 == 0) goto L_0x00e7
            goto L_0x0097
        L_0x00e7:
            boolean r3 = r9.mo53227t(r3, r10)
            if (r3 != 0) goto L_0x0097
        L_0x00ed:
            if (r6 == 0) goto L_0x0080
            r0.add(r2)
            goto L_0x0080
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.mo53220l(if0, rc2):java.util.Collection");
    }

    /* renamed from: m */
    public final d36 mo53221m() {
        return (d36) ca6.m56364a(this.f39232e, this, f39227h[1]);
    }

    /* renamed from: o */
    public Set<r24> mo50132b(if0 if0) {
        LazyJavaClassMemberScope M0;
        Set<r24> a;
        vx2.m53591g(if0, "classDescriptor");
        if (!mo53226s().mo53217b()) {
            return ny5.m49095e();
        }
        LazyJavaClassDescriptor p = mo53223p(if0);
        if (p == null || (M0 = p.mo52462S()) == null || (a = M0.mo50860a()) == null) {
            return ny5.m49095e();
        }
        return a;
    }

    /* renamed from: p */
    public final LazyJavaClassDescriptor mo53223p(if0 if0) {
        nf0 n;
        u82 b;
        if (C7389b.m60121a0(if0) || !C7389b.m60114A0(if0)) {
            return null;
        }
        v82 i = DescriptorUtilsKt.m62448i(if0);
        if (!i.mo66447f() || (n = c23.f37039a.mo50793n(i)) == null || (b = n.mo62673b()) == null) {
            return null;
        }
        if0 c = cd1.m56380c(mo53226s().mo53216a(), b, NoLookupLocation.FROM_BUILTINS);
        if (c instanceof LazyJavaClassDescriptor) {
            return (LazyJavaClassDescriptor) c;
        }
        return null;
    }

    /* renamed from: q */
    public final JDKMemberStatus mo53224q(C7425c cVar) {
        d31 b = cVar.mo51119b();
        vx2.m53589e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object b2 = k01.m59629b(bk0.m32598e((if0) b), new C7406c(this), new C7407d(ov3.m70793c(cVar, false, false, 3, (Object) null), new Ref$ObjectRef()));
        vx2.m53590f(b2, "private fun FunctionDesc…ERED\n            })\n    }");
        return (JDKMemberStatus) b2;
    }

    /* renamed from: r */
    public final C6983dm mo53225r() {
        return (C6983dm) ca6.m56364a(this.f39234g, this, f39227h[2]);
    }

    /* renamed from: s */
    public final JvmBuiltIns.C7401a mo53226s() {
        return (JvmBuiltIns.C7401a) ca6.m56364a(this.f39230c, this, f39227h[0]);
    }

    /* renamed from: t */
    public final boolean mo53227t(C7428e eVar, boolean z) {
        d31 b = eVar.mo51119b();
        vx2.m53589e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String c = ov3.m70793c(eVar, false, false, 3, (Object) null);
        if (z ^ w73.f45458a.mo66659f().contains(nv3.m70094a(SignatureBuildingComponents.f39611a, (if0) b, c))) {
            return true;
        }
        Boolean e = k01.m59632e(bk0.m32598e(eVar), C7408e.f39240a, new JvmBuiltInsCustomizer$isMutabilityViolation$2(this));
        vx2.m53590f(e, "private fun SimpleFuncti…scriptor)\n        }\n    }");
        return e.booleanValue();
    }

    /* renamed from: u */
    public final boolean mo53228u(C7424b bVar, if0 if0) {
        v82 v82;
        if (bVar.mo51763f().size() == 1) {
            List<n87> f = bVar.mo51763f();
            vx2.m53590f(f, "valueParameters");
            eg0 d = ((n87) CollectionsKt___CollectionsKt.m47355z0(f)).getType().mo51134H0().mo51180d();
            if (d != null) {
                v82 = DescriptorUtilsKt.m62448i(d);
            } else {
                v82 = null;
            }
            if (vx2.m53586b(v82, DescriptorUtilsKt.m62448i(if0))) {
                return true;
            }
        }
        return false;
    }
}

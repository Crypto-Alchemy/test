package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C6169a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.name.C7597a;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: LazyJavaClassDescriptor.kt */
public final class LazyJavaClassDescriptor extends jf0 implements s03 {

    /* renamed from: b1 */
    public static final Set<String> f39481b1 = ny5.m49098h("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* renamed from: v0 */
    public static final C7453a f39482v0 = new C7453a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final p03 f39483A;

    /* renamed from: B */
    public final if0 f39484B;

    /* renamed from: C */
    public final pf3 f39485C;

    /* renamed from: H */
    public final ef3 f39486H;

    /* renamed from: I */
    public final ClassKind f39487I;

    /* renamed from: L */
    public final Modality f39488L;

    /* renamed from: M */
    public final if7 f39489M;

    /* renamed from: P */
    public final boolean f39490P;

    /* renamed from: Q */
    public final LazyJavaClassTypeConstructor f39491Q;

    /* renamed from: U */
    public final LazyJavaClassMemberScope f39492U;

    /* renamed from: X */
    public final ScopesHolderForClass<LazyJavaClassMemberScope> f39493X;

    /* renamed from: Y */
    public final qu2 f39494Y;

    /* renamed from: Z */
    public final LazyJavaStaticClassScope f39495Z;

    /* renamed from: e0 */
    public final C6983dm f39496e0;

    /* renamed from: k0 */
    public final q84<List<a17>> f39497k0;

    /* renamed from: y */
    public final pf3 f39498y;

    /* compiled from: LazyJavaClassDescriptor.kt */
    public final class LazyJavaClassTypeConstructor extends C9442v5 {

        /* renamed from: d */
        public final q84<List<a17>> f39499d;

        public LazyJavaClassTypeConstructor() {
            super(LazyJavaClassDescriptor.this.f39485C.mo65300e());
            this.f39499d = LazyJavaClassDescriptor.this.f39485C.mo65300e().mo51164i(new C7455xbaf55d8a(LazyJavaClassDescriptor.this));
        }

        /* renamed from: e */
        public boolean mo51809e() {
            return true;
        }

        public List<a17> getParameters() {
            return (List) this.f39499d.invoke();
        }

        /* renamed from: m */
        public Collection<xc3> mo52632m() {
            Object obj;
            Collection<x03> g = LazyJavaClassDescriptor.this.mo53517J0().mo53385g();
            ArrayList arrayList = new ArrayList(g.size());
            ArrayList<e23> arrayList2 = new ArrayList<>(0);
            xc3 x = mo53525x();
            Iterator<x03> it = g.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                x03 next = it.next();
                xc3 h = LazyJavaClassDescriptor.this.f39485C.mo65296a().mo67015r().mo53748h(LazyJavaClassDescriptor.this.f39485C.mo65302g().mo53660o(next, l23.m63664d(TypeUsage.SUPERTYPE, false, (a17) null, 3, (Object) null)), LazyJavaClassDescriptor.this.f39485C);
                if (h.mo51134H0().mo51180d() instanceof NotFoundClasses.C7415b) {
                    arrayList2.add(next);
                }
                yz6 H0 = h.mo51134H0();
                if (x != null) {
                    obj = x.mo51134H0();
                }
                if (!vx2.m53586b(H0, obj) && !C7389b.m60123b0(h)) {
                    arrayList.add(h);
                }
            }
            if0 E0 = LazyJavaClassDescriptor.this.f39484B;
            if (E0 != null) {
                obj = yn3.m74479a(E0, LazyJavaClassDescriptor.this).mo65206c().mo55339p(E0.mo51464n(), Variance.INVARIANT);
            }
            ak0.m55531a(arrayList, obj);
            ak0.m55531a(arrayList, x);
            if (!arrayList2.isEmpty()) {
                gr1 c = LazyJavaClassDescriptor.this.f39485C.mo65296a().mo67000c();
                if0 w = mo51180d();
                ArrayList arrayList3 = new ArrayList(dk0.m43495u(arrayList2, 10));
                for (e23 e23 : arrayList2) {
                    vx2.m53589e(e23, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((x03) e23).mo66801E());
                }
                c.mo51979b(w, arrayList3);
            }
            if (!arrayList.isEmpty()) {
                return CollectionsKt___CollectionsKt.m47311K0(arrayList);
            }
            return bk0.m32598e(LazyJavaClassDescriptor.this.f39485C.mo65299d().mo51535k().mo53169i());
        }

        /* renamed from: q */
        public nd6 mo52634q() {
            return LazyJavaClassDescriptor.this.f39485C.mo65296a().mo67019v();
        }

        public String toString() {
            String d = LazyJavaClassDescriptor.this.getName().mo65594d();
            vx2.m53590f(d, "name.asString()");
            return d;
        }

        /* renamed from: w */
        public if0 mo51180d() {
            return LazyJavaClassDescriptor.this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
            if (r3 != false) goto L_0x001d;
         */
        /* renamed from: x */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p000.xc3 mo53525x() {
            /*
                r8 = this;
                u82 r0 = r8.mo53526y()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x001c
                boolean r3 = r0.mo66197d()
                if (r3 != 0) goto L_0x0018
                r24 r3 = kotlin.reflect.jvm.internal.impl.builtins.C7395c.f39112q
                boolean r3 = r0.mo66204i(r3)
                if (r3 == 0) goto L_0x0018
                r3 = r1
                goto L_0x0019
            L_0x0018:
                r3 = 0
            L_0x0019:
                if (r3 == 0) goto L_0x001c
                goto L_0x001d
            L_0x001c:
                r0 = r2
            L_0x001d:
                if (r0 != 0) goto L_0x002e
                xy1 r3 = p000.xy1.f46060a
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this
                u82 r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m62447h(r4)
                u82 r3 = r3.mo66982b(r4)
                if (r3 != 0) goto L_0x002f
                return r2
            L_0x002e:
                r3 = r0
            L_0x002f:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this
                pf3 r4 = r4.f39485C
                mx3 r4 = r4.mo65299d()
                kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r5 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_JAVA_LOADER
                if0 r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m62457r(r4, r3, r5)
                if (r3 != 0) goto L_0x0042
                return r2
            L_0x0042:
                yz6 r4 = r3.mo50046g()
                java.util.List r4 = r4.getParameters()
                int r4 = r4.size()
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.this
                yz6 r5 = r5.mo50046g()
                java.util.List r5 = r5.getParameters()
                java.lang.String r6 = "getTypeConstructor().parameters"
                p000.vx2.m53590f(r5, r6)
                int r6 = r5.size()
                r7 = 10
                if (r6 != r4) goto L_0x008d
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = p000.dk0.m43495u(r5, r7)
                r0.<init>(r1)
                java.util.Iterator r1 = r5.iterator()
            L_0x0072:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x00c7
                java.lang.Object r2 = r1.next()
                a17 r2 = (p000.a17) r2
                h17 r4 = new h17
                kotlin.reflect.jvm.internal.impl.types.Variance r5 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                d36 r2 = r2.mo51464n()
                r4.<init>(r5, r2)
                r0.add(r4)
                goto L_0x0072
            L_0x008d:
                if (r6 != r1) goto L_0x00d2
                if (r4 <= r1) goto L_0x00d2
                if (r0 != 0) goto L_0x00d2
                h17 r0 = new h17
                kotlin.reflect.jvm.internal.impl.types.Variance r2 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                java.lang.Object r5 = kotlin.collections.CollectionsKt___CollectionsKt.m47355z0(r5)
                a17 r5 = (p000.a17) r5
                d36 r5 = r5.mo51464n()
                r0.<init>(r2, r5)
                rw2 r2 = new rw2
                r2.<init>(r1, r4)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r4 = p000.dk0.m43495u(r2, r7)
                r1.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            L_0x00b6:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x00c6
                r4 = r2
                lw2 r4 = (p000.lw2) r4
                r4.nextInt()
                r1.add(r0)
                goto L_0x00b6
            L_0x00c6:
                r0 = r1
            L_0x00c7:
                rz6$a r1 = p000.rz6.f44504d
                rz6 r1 = r1.mo65783h()
                d36 r0 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m62851g(r1, r3, r0)
                return r0
            L_0x00d2:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.mo53525x():xc3");
        }

        /* renamed from: y */
        public final u82 mo53526y() {
            lb6 lb6;
            String str;
            C6983dm annotations = LazyJavaClassDescriptor.this.getAnnotations();
            u82 u82 = t73.f44669q;
            vx2.m53590f(u82, "PURELY_IMPLEMENTS_ANNOTATION");
            C9460vl x = annotations.mo51226x(u82);
            if (x == null) {
                return null;
            }
            Object A0 = CollectionsKt___CollectionsKt.m47301A0(x.mo53264f().values());
            if (A0 instanceof lb6) {
                lb6 = (lb6) A0;
            } else {
                lb6 = null;
            }
            if (lb6 == null || (str = (String) lb6.mo51739b()) == null || !C7597a.m61840e(str)) {
                return null;
            }
            return new u82(str);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$a */
    /* compiled from: LazyJavaClassDescriptor.kt */
    public static final class C7453a {
        public C7453a() {
        }

        public /* synthetic */ C7453a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$b */
    /* compiled from: Comparisons.kt */
    public static final class C7454b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(DescriptorUtilsKt.m62447h((if0) t).mo66195b(), DescriptorUtilsKt.m62447h((if0) t2).mo66195b());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyJavaClassDescriptor(pf3 pf3, d31 d31, p03 p03, if0 if0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pf3, d31, p03, (i & 8) != 0 ? null : if0);
    }

    /* renamed from: C0 */
    public boolean mo52338C0() {
        return false;
    }

    /* renamed from: H0 */
    public final LazyJavaClassDescriptor mo53515H0(x13 x13, if0 if0) {
        vx2.m53591g(x13, "javaResolverCache");
        pf3 pf3 = this.f39485C;
        pf3 i = ContextKt.m60741i(pf3, pf3.mo65296a().mo67021x(x13));
        d31 b = mo51119b();
        vx2.m53590f(b, "containingDeclaration");
        return new LazyJavaClassDescriptor(i, b, this.f39483A, if0);
    }

    /* renamed from: I0 */
    public List<ef0> mo52349h() {
        return (List) this.f39492U.mo53578w0().invoke();
    }

    /* renamed from: J0 */
    public final p03 mo53517J0() {
        return this.f39483A;
    }

    /* renamed from: K0 */
    public final List<h03> mo53518K0() {
        return (List) this.f39486H.getValue();
    }

    /* renamed from: L0 */
    public final pf3 mo53519L0() {
        return this.f39498y;
    }

    /* renamed from: M0 */
    public LazyJavaClassMemberScope mo52462S() {
        MemberScope S = super.mo52462S();
        vx2.m53589e(S, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (LazyJavaClassMemberScope) S;
    }

    /* renamed from: N0 */
    public LazyJavaClassMemberScope mo51546b0(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        return this.f39493X.mo53255c(bd3);
    }

    /* renamed from: O */
    public MemberScope mo52461O() {
        return this.f39494Y;
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

    /* renamed from: d0 */
    public boolean mo51319d0() {
        return false;
    }

    /* renamed from: g */
    public yz6 mo50046g() {
        return this.f39491Q;
    }

    /* renamed from: g0 */
    public MemberScope mo52347g0() {
        return this.f39495Z;
    }

    public C6983dm getAnnotations() {
        return this.f39496e0;
    }

    public ClassKind getKind() {
        return this.f39487I;
    }

    public fd1 getVisibility() {
        if (!vx2.m53586b(this.f39489M, ed1.f37506a) || this.f39483A.mo53388k() != null) {
            return v77.m73135c(this.f39489M);
        }
        fd1 fd1 = c13.f37030a;
        vx2.m53590f(fd1, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
        return fd1;
    }

    /* renamed from: h0 */
    public if0 mo52350h0() {
        return null;
    }

    /* renamed from: i */
    public boolean mo51669i() {
        return this.f39490P;
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: o */
    public List<a17> mo51670o() {
        return (List) this.f39497k0.invoke();
    }

    /* renamed from: p */
    public Modality mo51326p() {
        return this.f39488L;
    }

    /* renamed from: q */
    public boolean mo52352q() {
        return false;
    }

    public String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.m62448i(this);
    }

    /* renamed from: w */
    public Collection<if0> mo52354w() {
        if0 if0;
        if (this.f39488L != Modality.SEALED) {
            return ck0.m33062j();
        }
        f23 d = l23.m63664d(TypeUsage.COMMON, false, (a17) null, 3, (Object) null);
        Collection<x03> C = this.f39483A.mo53370C();
        ArrayList arrayList = new ArrayList();
        for (x03 o : C) {
            eg0 d2 = this.f39485C.mo65302g().mo53660o(o, d).mo51134H0().mo51180d();
            if (d2 instanceof if0) {
                if0 = (if0) d2;
            } else {
                if0 = null;
            }
            if (if0 != null) {
                arrayList.add(if0);
            }
        }
        return CollectionsKt___CollectionsKt.m47304D0(arrayList, new C7454b());
    }

    /* renamed from: z */
    public ef0 mo52355z() {
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(pf3 pf3, d31 d31, p03 p03, if0 if0) {
        super(pf3.mo65300e(), d31, p03.getName(), pf3.mo65296a().mo67017t().mo50460a(p03), false);
        ClassKind classKind;
        Modality modality;
        if0 if02 = if0;
        vx2.m53591g(pf3, "outerContext");
        vx2.m53591g(d31, "containingDeclaration");
        vx2.m53591g(p03, "jClass");
        this.f39498y = pf3;
        this.f39483A = p03;
        this.f39484B = if02;
        pf3 d = ContextKt.m60736d(pf3, this, p03, 0, 4, (Object) null);
        this.f39485C = d;
        d.mo65296a().mo67005h().mo66820d(p03, this);
        p03.mo53372J();
        this.f39486H = C6169a.m47232a(new LazyJavaClassDescriptor$moduleAnnotations$2(this));
        if (p03.mo53390n()) {
            classKind = ClassKind.ANNOTATION_CLASS;
        } else if (p03.mo53371I()) {
            classKind = ClassKind.INTERFACE;
        } else if (p03.mo53394v()) {
            classKind = ClassKind.ENUM_CLASS;
        } else {
            classKind = ClassKind.CLASS;
        }
        this.f39487I = classKind;
        if (p03.mo53390n() || p03.mo53394v()) {
            modality = Modality.FINAL;
        } else {
            modality = Modality.Companion.mo53240a(p03.mo53382c(), p03.mo53382c() || p03.isAbstract() || p03.mo53371I(), !p03.isFinal());
        }
        this.f39488L = modality;
        this.f39489M = p03.getVisibility();
        this.f39490P = p03.mo53388k() != null && !p03.mo51414O();
        this.f39491Q = new LazyJavaClassTypeConstructor();
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(d, this, p03, if02 != null, (LazyJavaClassMemberScope) null, 16, (DefaultConstructorMarker) null);
        this.f39492U = lazyJavaClassMemberScope;
        this.f39493X = ScopesHolderForClass.f39254e.mo53257a(this, d.mo65300e(), d.mo65296a().mo67008k().mo52870d(), new LazyJavaClassDescriptor$scopeHolder$1(this));
        this.f39494Y = new qu2(lazyJavaClassMemberScope);
        this.f39495Z = new LazyJavaStaticClassScope(d, p03, this);
        this.f39496e0 = of3.m70255a(d, p03);
        this.f39497k0 = d.mo65300e().mo51164i(new LazyJavaClassDescriptor$declaredParameters$1(this));
    }
}

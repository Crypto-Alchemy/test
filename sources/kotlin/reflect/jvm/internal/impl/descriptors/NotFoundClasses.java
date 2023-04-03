package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: NotFoundClasses.kt */
public final class NotFoundClasses {

    /* renamed from: a */
    public final da6 f39244a;

    /* renamed from: b */
    public final mx3 f39245b;

    /* renamed from: c */
    public final vs3<u82, fk4> f39246c;

    /* renamed from: d */
    public final vs3<C7414a, if0> f39247d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$a */
    /* compiled from: NotFoundClasses.kt */
    public static final class C7414a {

        /* renamed from: a */
        public final nf0 f39248a;

        /* renamed from: b */
        public final List<Integer> f39249b;

        public C7414a(nf0 nf0, List<Integer> list) {
            vx2.m53591g(nf0, "classId");
            vx2.m53591g(list, "typeParametersCount");
            this.f39248a = nf0;
            this.f39249b = list;
        }

        /* renamed from: a */
        public final nf0 mo53242a() {
            return this.f39248a;
        }

        /* renamed from: b */
        public final List<Integer> mo53243b() {
            return this.f39249b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7414a)) {
                return false;
            }
            C7414a aVar = (C7414a) obj;
            return vx2.m53586b(this.f39248a, aVar.f39248a) && vx2.m53586b(this.f39249b, aVar.f39249b);
        }

        public int hashCode() {
            return (this.f39248a.hashCode() * 31) + this.f39249b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f39248a + ", typeParametersCount=" + this.f39249b + ')';
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$b */
    /* compiled from: NotFoundClasses.kt */
    public static final class C7415b extends jf0 {

        /* renamed from: A */
        public final List<a17> f39250A;

        /* renamed from: B */
        public final uf0 f39251B;

        /* renamed from: y */
        public final boolean f39252y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7415b(da6 da6, d31 d31, r24 r24, boolean z, int i) {
            super(da6, d31, r24, a66.f36360a, false);
            vx2.m53591g(da6, "storageManager");
            vx2.m53591g(d31, "container");
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            this.f39252y = z;
            rw2 q = d75.m43395q(0, i);
            ArrayList arrayList = new ArrayList(dk0.m43495u(q, 10));
            Iterator it = q.iterator();
            while (it.hasNext()) {
                int nextInt = ((lw2) it).nextInt();
                C6983dm b = C6983dm.f37317b.mo51228b();
                Variance variance = Variance.INVARIANT;
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(nextInt);
                arrayList.add(b17.m55708L0(this, b, false, variance, r24.m71445h(sb.toString()), nextInt, da6));
            }
            this.f39250A = arrayList;
            this.f39251B = new uf0(this, TypeParameterUtilsKt.m60322d(this), my5.m48548d(DescriptorUtilsKt.m62451l(this).mo51535k().mo53169i()), da6);
        }

        /* renamed from: C0 */
        public boolean mo52338C0() {
            return false;
        }

        /* renamed from: E0 */
        public MemberScope.C7667a mo52347g0() {
            return MemberScope.C7667a.f40117b;
        }

        /* renamed from: F0 */
        public uf0 mo50046g() {
            return this.f39251B;
        }

        /* renamed from: G0 */
        public MemberScope.C7667a mo51546b0(bd3 bd3) {
            vx2.m53591g(bd3, "kotlinTypeRefiner");
            return MemberScope.C7667a.f40117b;
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

        public C6983dm getAnnotations() {
            return C6983dm.f37317b.mo51228b();
        }

        public ClassKind getKind() {
            return ClassKind.CLASS;
        }

        public fd1 getVisibility() {
            fd1 fd1 = ed1.f37510e;
            vx2.m53590f(fd1, "PUBLIC");
            return fd1;
        }

        /* renamed from: h */
        public Collection<ef0> mo52349h() {
            return ny5.m49095e();
        }

        /* renamed from: h0 */
        public if0 mo52350h0() {
            return null;
        }

        /* renamed from: i */
        public boolean mo51669i() {
            return this.f39252y;
        }

        public boolean isExternal() {
            return false;
        }

        public boolean isInline() {
            return false;
        }

        /* renamed from: o */
        public List<a17> mo51670o() {
            return this.f39250A;
        }

        /* renamed from: p */
        public Modality mo51326p() {
            return Modality.FINAL;
        }

        /* renamed from: q */
        public boolean mo52352q() {
            return false;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        /* renamed from: w */
        public Collection<if0> mo52354w() {
            return ck0.m33062j();
        }

        /* renamed from: z */
        public ef0 mo52355z() {
            return null;
        }
    }

    public NotFoundClasses(da6 da6, mx3 mx3) {
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(mx3, "module");
        this.f39244a = da6;
        this.f39245b = mx3;
        this.f39246c = da6.mo51163h(new NotFoundClasses$packageFragments$1(this));
        this.f39247d = da6.mo51163h(new NotFoundClasses$classes$1(this));
    }

    /* renamed from: d */
    public final if0 mo53241d(nf0 nf0, List<Integer> list) {
        vx2.m53591g(nf0, "classId");
        vx2.m53591g(list, "typeParametersCount");
        return this.f39247d.invoke(new C7414a(nf0, list));
    }
}

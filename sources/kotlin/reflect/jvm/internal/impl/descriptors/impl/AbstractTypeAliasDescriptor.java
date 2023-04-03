package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: AbstractTypeAliasDescriptor.kt */
public abstract class AbstractTypeAliasDescriptor extends g31 implements hz6 {

    /* renamed from: k */
    public final fd1 f39289k;

    /* renamed from: r */
    public List<? extends a17> f39290r;

    /* renamed from: s */
    public final C7429a f39291s = new C7429a(this);

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$a */
    /* compiled from: AbstractTypeAliasDescriptor.kt */
    public static final class C7429a implements yz6 {

        /* renamed from: a */
        public final /* synthetic */ AbstractTypeAliasDescriptor f39292a;

        public C7429a(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
            this.f39292a = abstractTypeAliasDescriptor;
        }

        /* renamed from: a */
        public yz6 mo51808a(bd3 bd3) {
            vx2.m53591g(bd3, "kotlinTypeRefiner");
            return this;
        }

        /* renamed from: e */
        public boolean mo51809e() {
            return true;
        }

        /* renamed from: f */
        public hz6 mo51180d() {
            return this.f39292a;
        }

        /* renamed from: g */
        public Collection<xc3> mo51811g() {
            Collection<xc3> g = mo51180d().mo52332o0().mo51134H0().mo51811g();
            vx2.m53590f(g, "declarationDescriptor.un…pe.constructor.supertypes");
            return g;
        }

        public List<a17> getParameters() {
            return this.f39292a.mo53273G0();
        }

        /* renamed from: k */
        public C7389b mo51813k() {
            return DescriptorUtilsKt.m62445f(mo51180d());
        }

        public String toString() {
            return "[typealias " + mo51180d().getName().mo65594d() + ']';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractTypeAliasDescriptor(d31 d31, C6983dm dmVar, r24 r24, a66 a66, fd1 fd1) {
        super(d31, dmVar, r24, a66);
        vx2.m53591g(d31, "containingDeclaration");
        vx2.m53591g(dmVar, "annotations");
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(a66, "sourceElement");
        vx2.m53591g(fd1, "visibilityImpl");
        this.f39289k = fd1;
    }

    /* renamed from: A0 */
    public final d36 mo53270A0() {
        MemberScope memberScope;
        if0 r = mo52333r();
        if (r == null || (memberScope = r.mo52462S()) == null) {
            memberScope = MemberScope.C7667a.f40117b;
        }
        d36 t = x17.m73836t(this, memberScope, new AbstractTypeAliasDescriptor$computeDefaultType$1(this));
        vx2.m53590f(t, "@OptIn(TypeRefinement::c…s)?.defaultType\n        }");
        return t;
    }

    /* renamed from: E0 */
    public hz6 mo51329y0() {
        j31 y0 = super.mo50045a();
        vx2.m53589e(y0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (hz6) y0;
    }

    /* renamed from: F0 */
    public final Collection<gz6> mo53272F0() {
        if0 r = mo52333r();
        if (r == null) {
            return ck0.m33062j();
        }
        Collection<ef0> h = r.mo52349h();
        vx2.m53590f(h, "classDescriptor.constructors");
        ArrayList arrayList = new ArrayList();
        for (ef0 ef0 : h) {
            TypeAliasConstructorDescriptorImpl.C7431a aVar = TypeAliasConstructorDescriptorImpl.f39309v1;
            da6 H = mo53274H();
            vx2.m53590f(ef0, "it");
            gz6 b = aVar.mo53309b(H, this, ef0);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    /* renamed from: G0 */
    public abstract List<a17> mo53273G0();

    /* renamed from: H */
    public abstract da6 mo53274H();

    /* renamed from: H0 */
    public final void mo53275H0(List<? extends a17> list) {
        vx2.m53591g(list, "declaredTypeParameters");
        this.f39290r = list;
    }

    /* renamed from: T */
    public boolean mo51317T() {
        return false;
    }

    /* renamed from: d0 */
    public boolean mo51319d0() {
        return false;
    }

    /* renamed from: g */
    public yz6 mo50046g() {
        return this.f39291s;
    }

    public fd1 getVisibility() {
        return this.f39289k;
    }

    /* renamed from: i */
    public boolean mo51669i() {
        return x17.m73819c(mo52332o0(), new AbstractTypeAliasDescriptor$isInner$1(this));
    }

    public boolean isExternal() {
        return false;
    }

    /* renamed from: j0 */
    public <R, D> R mo51120j0(h31<R, D> h31, D d) {
        vx2.m53591g(h31, "visitor");
        return h31.mo52110h(this, d);
    }

    /* renamed from: o */
    public List<a17> mo51670o() {
        List<? extends a17> list = this.f39290r;
        if (list != null) {
            return list;
        }
        vx2.m53605u("declaredTypeParametersImpl");
        return null;
    }

    public String toString() {
        return "typealias " + getName().mo65594d();
    }
}

package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;

/* compiled from: AbstractTypeConstructor.kt */
public abstract class AbstractTypeConstructor extends dg0 {

    /* renamed from: b */
    public final q84<C7712a> f40252b;

    /* renamed from: c */
    public final boolean f40253c;

    /* compiled from: AbstractTypeConstructor.kt */
    public final class ModuleViewTypeConstructor implements yz6 {

        /* renamed from: a */
        public final bd3 f40254a;

        /* renamed from: b */
        public final ef3 f40255b;

        /* renamed from: c */
        public final /* synthetic */ AbstractTypeConstructor f40256c;

        public ModuleViewTypeConstructor(AbstractTypeConstructor abstractTypeConstructor, bd3 bd3) {
            vx2.m53591g(bd3, "kotlinTypeRefiner");
            this.f40256c = abstractTypeConstructor;
            this.f40254a = bd3;
            this.f40255b = C6169a.m47233b(LazyThreadSafetyMode.PUBLICATION, new C7713x16a0f668(this, abstractTypeConstructor));
        }

        /* renamed from: a */
        public yz6 mo51808a(bd3 bd3) {
            vx2.m53591g(bd3, "kotlinTypeRefiner");
            return this.f40256c.mo51808a(bd3);
        }

        /* renamed from: d */
        public eg0 mo51180d() {
            return this.f40256c.mo51180d();
        }

        /* renamed from: e */
        public boolean mo51809e() {
            return this.f40256c.mo51809e();
        }

        public boolean equals(Object obj) {
            return this.f40256c.equals(obj);
        }

        public List<a17> getParameters() {
            List<a17> parameters = this.f40256c.getParameters();
            vx2.m53590f(parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }

        /* renamed from: h */
        public final List<xc3> mo55282h() {
            return (List) this.f40255b.getValue();
        }

        public int hashCode() {
            return this.f40256c.hashCode();
        }

        /* renamed from: i */
        public List<xc3> mo51811g() {
            return mo55282h();
        }

        /* renamed from: k */
        public C7389b mo51813k() {
            C7389b k = this.f40256c.mo51813k();
            vx2.m53590f(k, "this@AbstractTypeConstructor.builtIns");
            return k;
        }

        public String toString() {
            return this.f40256c.toString();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$a */
    /* compiled from: AbstractTypeConstructor.kt */
    public static final class C7712a {

        /* renamed from: a */
        public final Collection<xc3> f40257a;

        /* renamed from: b */
        public List<? extends xc3> f40258b = bk0.m32598e(nr1.f43548a.mo62792l());

        public C7712a(Collection<? extends xc3> collection) {
            vx2.m53591g(collection, "allSupertypes");
            this.f40257a = collection;
        }

        /* renamed from: a */
        public final Collection<xc3> mo55286a() {
            return this.f40257a;
        }

        /* renamed from: b */
        public final List<xc3> mo55287b() {
            return this.f40258b;
        }

        /* renamed from: c */
        public final void mo55288c(List<? extends xc3> list) {
            vx2.m53591g(list, "<set-?>");
            this.f40258b = list;
        }
    }

    public AbstractTypeConstructor(da6 da6) {
        vx2.m53591g(da6, "storageManager");
        this.f40252b = da6.mo51156a(new AbstractTypeConstructor$supertypes$1(this), AbstractTypeConstructor$supertypes$2.INSTANCE, new AbstractTypeConstructor$supertypes$3(this));
    }

    /* renamed from: a */
    public yz6 mo51808a(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        return new ModuleViewTypeConstructor(this, bd3);
    }

    /* renamed from: l */
    public final Collection<xc3> mo55276l(yz6 yz6, boolean z) {
        AbstractTypeConstructor abstractTypeConstructor;
        List<T> u0;
        if (yz6 instanceof AbstractTypeConstructor) {
            abstractTypeConstructor = (AbstractTypeConstructor) yz6;
        } else {
            abstractTypeConstructor = null;
        }
        if (abstractTypeConstructor != null && (u0 = CollectionsKt___CollectionsKt.m47350u0(((C7712a) abstractTypeConstructor.f40252b.invoke()).mo55286a(), abstractTypeConstructor.mo55277o(z))) != null) {
            return u0;
        }
        Collection<xc3> g = yz6.mo51811g();
        vx2.m53590f(g, "supertypes");
        return g;
    }

    /* renamed from: m */
    public abstract Collection<xc3> mo52632m();

    /* renamed from: n */
    public xc3 mo52633n() {
        return null;
    }

    /* renamed from: o */
    public Collection<xc3> mo55277o(boolean z) {
        return ck0.m33062j();
    }

    /* renamed from: p */
    public boolean mo55278p() {
        return this.f40253c;
    }

    /* renamed from: q */
    public abstract nd6 mo52634q();

    /* renamed from: r */
    public List<xc3> mo51811g() {
        return ((C7712a) this.f40252b.invoke()).mo55287b();
    }

    /* renamed from: s */
    public List<xc3> mo52635s(List<xc3> list) {
        vx2.m53591g(list, "supertypes");
        return list;
    }

    /* renamed from: t */
    public void mo55280t(xc3 xc3) {
        vx2.m53591g(xc3, "type");
    }

    /* renamed from: u */
    public void mo52637u(xc3 xc3) {
        vx2.m53591g(xc3, "type");
    }
}

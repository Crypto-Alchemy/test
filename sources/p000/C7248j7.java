package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: j7 */
/* compiled from: AbstractTypeParameterDescriptor */
public abstract class C7248j7 extends g31 implements a17 {

    /* renamed from: A */
    public final da6 f38602A;

    /* renamed from: k */
    public final Variance f38603k;

    /* renamed from: r */
    public final boolean f38604r;

    /* renamed from: s */
    public final int f38605s;

    /* renamed from: x */
    public final q84<yz6> f38606x;

    /* renamed from: y */
    public final q84<d36> f38607y;

    /* renamed from: j7$a */
    /* compiled from: AbstractTypeParameterDescriptor */
    public class C7249a implements pc2<yz6> {

        /* renamed from: a */
        public final /* synthetic */ da6 f38608a;

        /* renamed from: d */
        public final /* synthetic */ nd6 f38609d;

        public C7249a(da6 da6, nd6 nd6) {
            this.f38608a = da6;
            this.f38609d = nd6;
        }

        /* renamed from: a */
        public yz6 invoke() {
            return new C7252c(C7248j7.this, this.f38608a, this.f38609d);
        }
    }

    /* renamed from: j7$b */
    /* compiled from: AbstractTypeParameterDescriptor */
    public class C7250b implements pc2<d36> {

        /* renamed from: a */
        public final /* synthetic */ r24 f38611a;

        /* renamed from: j7$b$a */
        /* compiled from: AbstractTypeParameterDescriptor */
        public class C7251a implements pc2<MemberScope> {
            public C7251a() {
            }

            /* renamed from: a */
            public MemberScope invoke() {
                return TypeIntersectionScope.m62509j("Scope for type parameter " + C7250b.this.f38611a.mo65594d(), C7248j7.this.getUpperBounds());
            }
        }

        public C7250b(r24 r24) {
            this.f38611a = r24;
        }

        /* renamed from: a */
        public d36 invoke() {
            return KotlinTypeFactory.m62854j(rz6.f44504d.mo65783h(), C7248j7.this.mo50046g(), Collections.emptyList(), false, new LazyScopeAdapter(new C7251a()));
        }
    }

    /* renamed from: j7$c */
    /* compiled from: AbstractTypeParameterDescriptor */
    public class C7252c extends AbstractTypeConstructor {

        /* renamed from: d */
        public final nd6 f38614d;

        /* renamed from: e */
        public final /* synthetic */ C7248j7 f38615e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7252c(C7248j7 j7Var, da6 da6, nd6 nd6) {
            super(da6);
            if (da6 == null) {
                m59285v(0);
            }
            this.f38615e = j7Var;
            this.f38614d = nd6;
        }

        /* renamed from: v */
        public static /* synthetic */ void m59285v(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3)];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: d */
        public eg0 mo51180d() {
            C7248j7 j7Var = this.f38615e;
            if (j7Var == null) {
                m59285v(3);
            }
            return j7Var;
        }

        /* renamed from: e */
        public boolean mo51809e() {
            return true;
        }

        public List<a17> getParameters() {
            List<a17> emptyList = Collections.emptyList();
            if (emptyList == null) {
                m59285v(2);
            }
            return emptyList;
        }

        /* renamed from: i */
        public boolean mo51185i(eg0 eg0) {
            if (eg0 == null) {
                m59285v(9);
            }
            if (!(eg0 instanceof a17) || !DescriptorEquivalenceForOverrides.f40061a.mo55042f(this.f38615e, (a17) eg0, true)) {
                return false;
            }
            return true;
        }

        /* renamed from: k */
        public C7389b mo51813k() {
            C7389b f = DescriptorUtilsKt.m62445f(this.f38615e);
            if (f == null) {
                m59285v(4);
            }
            return f;
        }

        /* renamed from: m */
        public Collection<xc3> mo52632m() {
            List<xc3> F0 = this.f38615e.mo50451F0();
            if (F0 == null) {
                m59285v(1);
            }
            return F0;
        }

        /* renamed from: n */
        public xc3 mo52633n() {
            return nr1.m70033d(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        /* renamed from: q */
        public nd6 mo52634q() {
            nd6 nd6 = this.f38614d;
            if (nd6 == null) {
                m59285v(5);
            }
            return nd6;
        }

        /* renamed from: s */
        public List<xc3> mo52635s(List<xc3> list) {
            if (list == null) {
                m59285v(7);
            }
            List<xc3> A0 = this.f38615e.mo52628A0(list);
            if (A0 == null) {
                m59285v(8);
            }
            return A0;
        }

        public String toString() {
            return this.f38615e.getName().toString();
        }

        /* renamed from: u */
        public void mo52637u(xc3 xc3) {
            if (xc3 == null) {
                m59285v(6);
            }
            this.f38615e.mo50450E0(xc3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7248j7(da6 da6, d31 d31, C6983dm dmVar, r24 r24, Variance variance, boolean z, int i, a66 a66, nd6 nd6) {
        super(d31, dmVar, r24, a66);
        if (da6 == null) {
            m59267Q(0);
        }
        if (d31 == null) {
            m59267Q(1);
        }
        if (dmVar == null) {
            m59267Q(2);
        }
        if (r24 == null) {
            m59267Q(3);
        }
        if (variance == null) {
            m59267Q(4);
        }
        if (a66 == null) {
            m59267Q(5);
        }
        if (nd6 == null) {
            m59267Q(6);
        }
        this.f38603k = variance;
        this.f38604r = z;
        this.f38605s = i;
        this.f38606x = da6.mo51164i(new C7249a(da6, nd6));
        this.f38607y = da6.mo51164i(new C7250b(r24));
        this.f38602A = da6;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m59267Q(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: A0 */
    public List<xc3> mo52628A0(List<xc3> list) {
        if (list == null) {
            m59267Q(12);
        }
        if (list == null) {
            m59267Q(13);
        }
        return list;
    }

    /* renamed from: E0 */
    public abstract void mo50450E0(xc3 xc3);

    /* renamed from: F0 */
    public abstract List<xc3> mo50451F0();

    /* renamed from: H */
    public da6 mo50043H() {
        da6 da6 = this.f38602A;
        if (da6 == null) {
            m59267Q(14);
        }
        return da6;
    }

    /* renamed from: L */
    public boolean mo50044L() {
        return false;
    }

    /* renamed from: g */
    public final yz6 mo50046g() {
        yz6 yz6 = (yz6) this.f38606x.invoke();
        if (yz6 == null) {
            m59267Q(9);
        }
        return yz6;
    }

    public int getIndex() {
        return this.f38605s;
    }

    public List<xc3> getUpperBounds() {
        List<xc3> r = ((C7252c) mo50046g()).mo51811g();
        if (r == null) {
            m59267Q(8);
        }
        return r;
    }

    /* renamed from: j */
    public Variance mo50049j() {
        Variance variance = this.f38603k;
        if (variance == null) {
            m59267Q(7);
        }
        return variance;
    }

    /* renamed from: j0 */
    public <R, D> R mo51120j0(h31<R, D> h31, D d) {
        return h31.mo52114l(this, d);
    }

    /* renamed from: n */
    public d36 mo51464n() {
        d36 d36 = (d36) this.f38607y.invoke();
        if (d36 == null) {
            m59267Q(10);
        }
        return d36;
    }

    /* renamed from: u */
    public boolean mo50050u() {
        return this.f38604r;
    }

    /* renamed from: a */
    public a17 mo51329y0() {
        a17 a17 = (a17) super.mo50045a();
        if (a17 == null) {
            m59267Q(11);
        }
        return a17;
    }
}

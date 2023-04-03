package p000;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: u5 */
/* compiled from: AbstractClassDescriptor */
public abstract class C9387u5 extends ex3 {

    /* renamed from: d */
    public final r24 f44884d;

    /* renamed from: e */
    public final q84<d36> f44885e;

    /* renamed from: g */
    public final q84<MemberScope> f44886g;

    /* renamed from: k */
    public final q84<h85> f44887k;

    /* renamed from: u5$a */
    /* compiled from: AbstractClassDescriptor */
    public class C9388a implements pc2<d36> {

        /* renamed from: u5$a$a */
        /* compiled from: AbstractClassDescriptor */
        public class C9389a implements rc2<bd3, d36> {
            public C9389a() {
            }

            /* renamed from: a */
            public d36 invoke(bd3 bd3) {
                eg0 f = bd3.mo50560f(C9387u5.this);
                if (f == null) {
                    return (d36) C9387u5.this.f44885e.invoke();
                }
                if (f instanceof hz6) {
                    return KotlinTypeFactory.m62848b((hz6) f, x17.m73823g(f.mo50046g().getParameters()));
                }
                if (f instanceof ex3) {
                    return x17.m73837u(f.mo50046g().mo51808a(bd3), ((ex3) f).mo51546b0(bd3), this);
                }
                return f.mo51464n();
            }
        }

        public C9388a() {
        }

        /* renamed from: a */
        public d36 invoke() {
            C9387u5 u5Var = C9387u5.this;
            return x17.m73836t(u5Var, u5Var.mo52462S(), new C9389a());
        }
    }

    /* renamed from: u5$b */
    /* compiled from: AbstractClassDescriptor */
    public class C9390b implements pc2<MemberScope> {
        public C9390b() {
        }

        /* renamed from: a */
        public MemberScope invoke() {
            return new qu2(C9387u5.this.mo52462S());
        }
    }

    /* renamed from: u5$c */
    /* compiled from: AbstractClassDescriptor */
    public class C9391c implements pc2<h85> {
        public C9391c() {
        }

        /* renamed from: a */
        public h85 invoke() {
            return new hf3(C9387u5.this);
        }
    }

    public C9387u5(da6 da6, r24 r24) {
        if (da6 == null) {
            m72593y0(0);
        }
        if (r24 == null) {
            m72593y0(1);
        }
        this.f44884d = r24;
        this.f44885e = da6.mo51164i(new C9388a());
        this.f44886g = da6.mo51164i(new C9390b());
        this.f44887k = da6.mo51164i(new C9391c());
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m72593y0(int i) {
        int i2 = i;
        String str = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20) ? 2 : 3)];
        switch (i2) {
            case 1:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i2 == 2) {
            objArr[1] = "getName";
        } else if (i2 == 3) {
            objArr[1] = "getOriginal";
        } else if (i2 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i2 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i2 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i2 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i2 == 19) {
            objArr[1] = "substitute";
        } else if (i2 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: A0 */
    public if0 mo50708c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m72593y0(18);
        }
        if (typeSubstitutor.mo55336k()) {
            return this;
        }
        return new zf3(this, typeSubstitutor);
    }

    /* renamed from: D */
    public MemberScope mo52459D(p17 p17) {
        if (p17 == null) {
            m72593y0(15);
        }
        MemberScope Q = mo50707Q(p17, DescriptorUtilsKt.m62450k(dd1.m56815g(this)));
        if (Q == null) {
            m72593y0(16);
        }
        return Q;
    }

    /* renamed from: D0 */
    public h85 mo52460D0() {
        h85 h85 = (h85) this.f44887k.invoke();
        if (h85 == null) {
            m72593y0(5);
        }
        return h85;
    }

    /* renamed from: O */
    public MemberScope mo52461O() {
        MemberScope memberScope = (MemberScope) this.f44886g.invoke();
        if (memberScope == null) {
            m72593y0(4);
        }
        return memberScope;
    }

    /* renamed from: Q */
    public MemberScope mo50707Q(p17 p17, bd3 bd3) {
        if (p17 == null) {
            m72593y0(10);
        }
        if (bd3 == null) {
            m72593y0(11);
        }
        if (p17.mo50031f()) {
            MemberScope b0 = mo51546b0(bd3);
            if (b0 == null) {
                m72593y0(12);
            }
            return b0;
        }
        return new SubstitutingScope(mo51546b0(bd3), TypeSubstitutor.m62902g(p17));
    }

    /* renamed from: S */
    public MemberScope mo52462S() {
        MemberScope b0 = mo51546b0(DescriptorUtilsKt.m62450k(dd1.m56815g(this)));
        if (b0 == null) {
            m72593y0(17);
        }
        return b0;
    }

    /* renamed from: U */
    public List<h85> mo52463U() {
        List<h85> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m72593y0(6);
        }
        return emptyList;
    }

    /* renamed from: a */
    public if0 m72603a() {
        return this;
    }

    public r24 getName() {
        r24 r24 = this.f44884d;
        if (r24 == null) {
            m72593y0(2);
        }
        return r24;
    }

    /* renamed from: j0 */
    public <R, D> R mo51120j0(h31<R, D> h31, D d) {
        return h31.mo52105c(this, d);
    }

    /* renamed from: n */
    public d36 mo51464n() {
        d36 d36 = (d36) this.f44885e.invoke();
        if (d36 == null) {
            m72593y0(20);
        }
        return d36;
    }
}

package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p000.ta5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b*\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e*\u00020\rH\u0002R\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158VX\u0002¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lo93;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lif0;", "Lkotlin/reflect/jvm/internal/KClassImpl;", "d", "Lud1;", "Ljava/lang/Class;", "a", "La17;", "La17;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "descriptor", "", "Lm93;", "Lta5$a;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "Lp93;", "e", "Lp93;", "container", "getName", "()Ljava/lang/String;", "name", "Lkotlin/reflect/KVariance;", "j", "()Lkotlin/reflect/KVariance;", "variance", "<init>", "(Lp93;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: KTypeParameterImpl.kt */
public final class KTypeParameterImpl implements o93 {

    /* renamed from: g */
    public static final /* synthetic */ i93<Object>[] f39032g = {ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(KTypeParameterImpl.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: a */
    public final a17 f39033a;

    /* renamed from: d */
    public final ta5.C9335a f39034d = ta5.m72213c(new KTypeParameterImpl$upperBounds$2(this));

    /* renamed from: e */
    public final p93 f39035e;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.KTypeParameterImpl$a */
    /* compiled from: KTypeParameterImpl.kt */
    public /* synthetic */ class C7373a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39036a;

        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            f39036a = iArr;
        }
    }

    public KTypeParameterImpl(p93 p93, a17 a17) {
        Object obj;
        KClassImpl<?> kClassImpl;
        ud1 ud1;
        vx2.m53591g(a17, "descriptor");
        this.f39033a = a17;
        if (p93 == null) {
            d31 b = mo53099b().mo51119b();
            vx2.m53590f(b, "descriptor.containingDeclaration");
            if (b instanceof if0) {
                obj = mo53100d((if0) b);
            } else if (b instanceof CallableMemberDescriptor) {
                d31 b2 = ((CallableMemberDescriptor) b).mo51119b();
                vx2.m53590f(b2, "declaration.containingDeclaration");
                if (b2 instanceof if0) {
                    kClassImpl = mo53100d((if0) b2);
                } else {
                    if (b instanceof ud1) {
                        ud1 = (ud1) b;
                    } else {
                        ud1 = null;
                    }
                    if (ud1 != null) {
                        q83<?> e = x73.m54256e(mo53098a(ud1));
                        vx2.m53589e(e, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                        kClassImpl = (KClassImpl) e;
                    } else {
                        throw new KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: " + b);
                    }
                }
                obj = b.mo51120j0(new sv0(kClassImpl), r37.f33317a);
            } else {
                throw new KotlinReflectionInternalError("Unknown type parameter container: " + b);
            }
            vx2.m53590f(obj, "when (val declaration = … $declaration\")\n        }");
            p93 = (p93) obj;
        }
        this.f39035e = p93;
    }

    /* renamed from: a */
    public final Class<?> mo53098a(ud1 ud1) {
        tc3 tc3;
        Class<?> d;
        sd1 F = ud1.mo65455F();
        tc3 tc32 = null;
        if (!(F instanceof g83)) {
            F = null;
        }
        g83 g83 = (g83) F;
        if (g83 != null) {
            tc3 = g83.mo51879g();
        } else {
            tc3 = null;
        }
        if (tc3 instanceof pa5) {
            tc32 = tc3;
        }
        pa5 pa5 = (pa5) tc32;
        if (pa5 != null && (d = pa5.mo65264d()) != null) {
            return d;
        }
        throw new KotlinReflectionInternalError("Container of deserialized member is not resolved: " + ud1);
    }

    /* renamed from: b */
    public a17 mo53099b() {
        return this.f39033a;
    }

    /* renamed from: d */
    public final KClassImpl<?> mo53100d(if0 if0) {
        q83<?> q83;
        Class<?> p = y67.m74286p(if0);
        if (p != null) {
            q83 = x73.m54256e(p);
        } else {
            q83 = null;
        }
        KClassImpl<?> kClassImpl = (KClassImpl) q83;
        if (kClassImpl != null) {
            return kClassImpl;
        }
        throw new KotlinReflectionInternalError("Type parameter container is not resolved: " + if0.mo51119b());
    }

    public boolean equals(Object obj) {
        if (obj instanceof KTypeParameterImpl) {
            KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) obj;
            if (!vx2.m53586b(this.f39035e, kTypeParameterImpl.f39035e) || !vx2.m53586b(getName(), kTypeParameterImpl.getName())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String getName() {
        String d = mo53099b().getName().mo65594d();
        vx2.m53590f(d, "descriptor.name.asString()");
        return d;
    }

    public List<m93> getUpperBounds() {
        Object b = this.f39034d.mo66008b(this, f39032g[0]);
        vx2.m53590f(b, "<get-upperBounds>(...)");
        return (List) b;
    }

    public int hashCode() {
        return (this.f39035e.hashCode() * 31) + getName().hashCode();
    }

    /* renamed from: j */
    public KVariance mo46361j() {
        int i = C7373a.f39036a[mo53099b().mo50049j().ordinal()];
        if (i == 1) {
            return KVariance.INVARIANT;
        }
        if (i == 2) {
            return KVariance.IN;
        }
        if (i == 3) {
            return KVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        return d17.f28010a.mo41806a(this);
    }
}

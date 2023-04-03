package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: w6 */
/* compiled from: AbstractReceiverParameterDescriptor */
public abstract class C9486w6 extends e31 implements h85 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9486w6(C6983dm dmVar) {
        super(dmVar, n66.f41109h);
        if (dmVar == null) {
            m73474Q(0);
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ void m73474Q(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 2:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 3:
                objArr[1] = "getTypeParameters";
                break;
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getValueParameters";
                break;
            case 6:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 7:
                objArr[1] = "getVisibility";
                break;
            case 8:
                objArr[1] = "getOriginal";
                break;
            case 9:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: G */
    public h85 mo51311G() {
        return null;
    }

    /* renamed from: J */
    public h85 mo51315J() {
        return null;
    }

    /* renamed from: a0 */
    public boolean mo51318a0() {
        return false;
    }

    /* renamed from: d */
    public Collection<? extends C7420a> mo51659d() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            m73474Q(6);
        }
        return emptySet;
    }

    /* renamed from: f */
    public List<n87> mo51763f() {
        List<n87> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m73474Q(5);
        }
        return emptyList;
    }

    public xc3 getReturnType() {
        return getType();
    }

    public a66 getSource() {
        a66 a66 = a66.f36360a;
        if (a66 == null) {
            m73474Q(9);
        }
        return a66;
    }

    public xc3 getType() {
        xc3 type = getValue().getType();
        if (type == null) {
            m73474Q(4);
        }
        return type;
    }

    public List<a17> getTypeParameters() {
        List<a17> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m73474Q(3);
        }
        return emptyList;
    }

    public fd1 getVisibility() {
        fd1 fd1 = ed1.f37511f;
        if (fd1 == null) {
            m73474Q(7);
        }
        return fd1;
    }

    /* renamed from: j0 */
    public <R, D> R mo51120j0(h31<R, D> h31, D d) {
        return h31.mo52103a(this, d);
    }

    /* renamed from: y0 */
    public ql4 m73478a() {
        return this;
    }

    /* renamed from: c */
    public h85 m73481c(TypeSubstitutor typeSubstitutor) {
        xc3 xc3;
        if (typeSubstitutor == null) {
            m73474Q(1);
        }
        if (typeSubstitutor.mo55336k()) {
            return this;
        }
        if (mo51119b() instanceof if0) {
            xc3 = typeSubstitutor.mo55339p(getType(), Variance.OUT_VARIANCE);
        } else {
            xc3 = typeSubstitutor.mo55339p(getType(), Variance.INVARIANT);
        }
        if (xc3 == null) {
            return null;
        }
        if (xc3 == getType()) {
            return this;
        }
        return new i85(mo51119b(), new vw6(xc3), getAnnotations());
    }
}

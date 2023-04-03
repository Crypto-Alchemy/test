package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7427d;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: dx4 */
/* compiled from: PropertyAccessorDescriptorImpl */
public abstract class dx4 extends g31 implements C7427d {

    /* renamed from: A */
    public final CallableMemberDescriptor.Kind f37418A;

    /* renamed from: B */
    public fd1 f37419B;

    /* renamed from: C */
    public C7425c f37420C;

    /* renamed from: k */
    public boolean f37421k;

    /* renamed from: r */
    public final boolean f37422r;

    /* renamed from: s */
    public final Modality f37423s;

    /* renamed from: x */
    public final fx4 f37424x;

    /* renamed from: y */
    public final boolean f37425y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dx4(Modality modality, fd1 fd1, fx4 fx4, C6983dm dmVar, r24 r24, boolean z, boolean z2, boolean z3, CallableMemberDescriptor.Kind kind, a66 a66) {
        super(fx4.mo51119b(), dmVar, r24, a66);
        if (modality == null) {
            m57090Q(0);
        }
        if (fd1 == null) {
            m57090Q(1);
        }
        if (fx4 == null) {
            m57090Q(2);
        }
        if (dmVar == null) {
            m57090Q(3);
        }
        if (r24 == null) {
            m57090Q(4);
        }
        if (a66 == null) {
            m57090Q(5);
        }
        this.f37420C = null;
        this.f37423s = modality;
        this.f37419B = fd1;
        this.f37424x = fx4;
        this.f37421k = z;
        this.f37422r = z2;
        this.f37425y = z3;
        this.f37418A = kind;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m57090Q(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
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
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 15:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 15:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
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
    public C7427d mo50948f0(d31 d31, Modality modality, fd1 fd1, CallableMemberDescriptor.Kind kind, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    /* renamed from: B */
    public boolean mo51308B() {
        return this.f37421k;
    }

    /* renamed from: E0 */
    public abstract C7427d mo51329y0();

    /* renamed from: F0 */
    public Collection<C7427d> mo51310F0(boolean z) {
        Object obj;
        ArrayList arrayList = new ArrayList(0);
        for (fx4 fx4 : mo51316R().mo51659d()) {
            if (z) {
                obj = fx4.getGetter();
            } else {
                obj = fx4.getSetter();
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: G */
    public h85 mo51311G() {
        return mo51316R().mo51311G();
    }

    /* renamed from: G0 */
    public void mo51312G0(boolean z) {
        this.f37421k = z;
    }

    /* renamed from: H0 */
    public void mo51313H0(C7425c cVar) {
        this.f37420C = cVar;
    }

    /* renamed from: I0 */
    public void mo51314I0(fd1 fd1) {
        this.f37419B = fd1;
    }

    /* renamed from: J */
    public h85 mo51315J() {
        return mo51316R().mo51315J();
    }

    /* renamed from: R */
    public fx4 mo51316R() {
        fx4 fx4 = this.f37424x;
        if (fx4 == null) {
            m57090Q(12);
        }
        return fx4;
    }

    /* renamed from: T */
    public boolean mo51317T() {
        return false;
    }

    /* renamed from: a0 */
    public boolean mo51318a0() {
        return false;
    }

    /* renamed from: d0 */
    public boolean mo51319d0() {
        return false;
    }

    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f37418A;
        if (kind == null) {
            m57090Q(6);
        }
        return kind;
    }

    public List<a17> getTypeParameters() {
        List<a17> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m57090Q(8);
        }
        return emptyList;
    }

    public fd1 getVisibility() {
        fd1 fd1 = this.f37419B;
        if (fd1 == null) {
            m57090Q(10);
        }
        return fd1;
    }

    public boolean isExternal() {
        return this.f37422r;
    }

    public boolean isInfix() {
        return false;
    }

    public boolean isInline() {
        return this.f37425y;
    }

    public boolean isOperator() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }

    /* renamed from: n0 */
    public C7425c mo51325n0() {
        return this.f37420C;
    }

    /* renamed from: p */
    public Modality mo51326p() {
        Modality modality = this.f37423s;
        if (modality == null) {
            m57090Q(9);
        }
        return modality;
    }

    /* renamed from: p0 */
    public <V> V mo50950p0(C7420a.C7421a<V> aVar) {
        return null;
    }

    /* renamed from: s0 */
    public List<h85> mo51327s0() {
        List<h85> s0 = mo51316R().mo51327s0();
        if (s0 == null) {
            m57090Q(13);
        }
        return s0;
    }

    /* renamed from: w0 */
    public boolean mo51328w0() {
        return false;
    }

    /* renamed from: x0 */
    public void mo50952x0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            m57090Q(15);
        }
    }

    /* renamed from: y */
    public boolean mo50147y() {
        return false;
    }

    /* renamed from: z0 */
    public boolean mo51330z0() {
        return false;
    }

    /* renamed from: c */
    public C7425c m57108c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m57090Q(7);
        }
        throw new UnsupportedOperationException();
    }
}

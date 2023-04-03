package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: i04 */
/* compiled from: MutableClassDescriptor */
public class i04 extends jf0 {

    /* renamed from: A */
    public final boolean f38297A;

    /* renamed from: B */
    public Modality f38298B;

    /* renamed from: C */
    public fd1 f38299C;

    /* renamed from: H */
    public yz6 f38300H;

    /* renamed from: I */
    public List<a17> f38301I;

    /* renamed from: L */
    public final Collection<xc3> f38302L;

    /* renamed from: M */
    public final da6 f38303M;

    /* renamed from: y */
    public final ClassKind f38304y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i04(d31 d31, ClassKind classKind, boolean z, boolean z2, r24 r24, a66 a66, da6 da6) {
        super(da6, d31, r24, a66, z2);
        if (d31 == null) {
            m58733y0(0);
        }
        if (classKind == null) {
            m58733y0(1);
        }
        if (r24 == null) {
            m58733y0(2);
        }
        if (a66 == null) {
            m58733y0(3);
        }
        if (da6 == null) {
            m58733y0(4);
        }
        this.f38302L = new ArrayList();
        this.f38303M = da6;
        this.f38304y = classKind;
        this.f38297A = z;
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m58733y0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: C0 */
    public boolean mo52338C0() {
        return false;
    }

    /* renamed from: E0 */
    public void mo52339E0() {
        this.f38300H = new uf0(this, this.f38301I, this.f38302L, this.f38303M);
        Iterator<ef0> it = mo52349h().iterator();
        while (it.hasNext()) {
            ((ff0) it.next()).mo53336a1(mo51464n());
        }
    }

    /* renamed from: F0 */
    public Set<ef0> mo52349h() {
        Set<ef0> emptySet = Collections.emptySet();
        if (emptySet == null) {
            m58733y0(13);
        }
        return emptySet;
    }

    /* renamed from: G0 */
    public void mo52341G0(Modality modality) {
        if (modality == null) {
            m58733y0(6);
        }
        this.f38298B = modality;
    }

    /* renamed from: H0 */
    public void mo52342H0(List<a17> list) {
        if (list == null) {
            m58733y0(14);
        }
        if (this.f38301I == null) {
            this.f38301I = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    /* renamed from: I0 */
    public void mo52343I0(fd1 fd1) {
        if (fd1 == null) {
            m58733y0(9);
        }
        this.f38299C = fd1;
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

    /* renamed from: b0 */
    public MemberScope mo51546b0(bd3 bd3) {
        if (bd3 == null) {
            m58733y0(16);
        }
        MemberScope.C7667a aVar = MemberScope.C7667a.f40117b;
        if (aVar == null) {
            m58733y0(17);
        }
        return aVar;
    }

    /* renamed from: d0 */
    public boolean mo51319d0() {
        return false;
    }

    /* renamed from: g */
    public yz6 mo50046g() {
        yz6 yz6 = this.f38300H;
        if (yz6 == null) {
            m58733y0(11);
        }
        return yz6;
    }

    /* renamed from: g0 */
    public MemberScope mo52347g0() {
        MemberScope.C7667a aVar = MemberScope.C7667a.f40117b;
        if (aVar == null) {
            m58733y0(18);
        }
        return aVar;
    }

    public C6983dm getAnnotations() {
        C6983dm b = C6983dm.f37317b.mo51228b();
        if (b == null) {
            m58733y0(5);
        }
        return b;
    }

    public ClassKind getKind() {
        ClassKind classKind = this.f38304y;
        if (classKind == null) {
            m58733y0(8);
        }
        return classKind;
    }

    public fd1 getVisibility() {
        fd1 fd1 = this.f38299C;
        if (fd1 == null) {
            m58733y0(10);
        }
        return fd1;
    }

    /* renamed from: h0 */
    public if0 mo52350h0() {
        return null;
    }

    /* renamed from: i */
    public boolean mo51669i() {
        return this.f38297A;
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: o */
    public List<a17> mo51670o() {
        List<a17> list = this.f38301I;
        if (list == null) {
            m58733y0(15);
        }
        return list;
    }

    /* renamed from: p */
    public Modality mo51326p() {
        Modality modality = this.f38298B;
        if (modality == null) {
            m58733y0(7);
        }
        return modality;
    }

    /* renamed from: q */
    public boolean mo52352q() {
        return false;
    }

    public String toString() {
        return e31.m57137b0(this);
    }

    /* renamed from: w */
    public Collection<if0> mo52354w() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m58733y0(19);
        }
        return emptyList;
    }

    /* renamed from: z */
    public ef0 mo52355z() {
        return null;
    }
}

package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: lf0 */
/* compiled from: ClassDescriptorImpl */
public class lf0 extends jf0 {

    /* renamed from: A */
    public final ClassKind f40606A;

    /* renamed from: B */
    public final yz6 f40607B;

    /* renamed from: C */
    public MemberScope f40608C;

    /* renamed from: H */
    public Set<ef0> f40609H;

    /* renamed from: I */
    public ef0 f40610I;

    /* renamed from: y */
    public final Modality f40611y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lf0(d31 d31, r24 r24, Modality modality, ClassKind classKind, Collection<xc3> collection, a66 a66, boolean z, da6 da6) {
        super(da6, d31, r24, a66, z);
        if (d31 == null) {
            m63808y0(0);
        }
        if (r24 == null) {
            m63808y0(1);
        }
        if (modality == null) {
            m63808y0(2);
        }
        if (classKind == null) {
            m63808y0(3);
        }
        if (collection == null) {
            m63808y0(4);
        }
        if (a66 == null) {
            m63808y0(5);
        }
        if (da6 == null) {
            m63808y0(6);
        }
        this.f40611y = modality;
        this.f40606A = classKind;
        this.f40607B = new uf0(this, Collections.emptyList(), collection, da6);
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m63808y0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
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
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
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
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
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
    public final void mo55890E0(MemberScope memberScope, Set<ef0> set, ef0 ef0) {
        if (memberScope == null) {
            m63808y0(7);
        }
        if (set == null) {
            m63808y0(8);
        }
        this.f40608C = memberScope;
        this.f40609H = set;
        this.f40610I = ef0;
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
            m63808y0(12);
        }
        MemberScope memberScope = this.f40608C;
        if (memberScope == null) {
            m63808y0(13);
        }
        return memberScope;
    }

    /* renamed from: d0 */
    public boolean mo51319d0() {
        return false;
    }

    /* renamed from: g */
    public yz6 mo50046g() {
        yz6 yz6 = this.f40607B;
        if (yz6 == null) {
            m63808y0(10);
        }
        return yz6;
    }

    /* renamed from: g0 */
    public MemberScope mo52347g0() {
        MemberScope.C7667a aVar = MemberScope.C7667a.f40117b;
        if (aVar == null) {
            m63808y0(14);
        }
        return aVar;
    }

    public C6983dm getAnnotations() {
        C6983dm b = C6983dm.f37317b.mo51228b();
        if (b == null) {
            m63808y0(9);
        }
        return b;
    }

    public ClassKind getKind() {
        ClassKind classKind = this.f40606A;
        if (classKind == null) {
            m63808y0(15);
        }
        return classKind;
    }

    public fd1 getVisibility() {
        fd1 fd1 = ed1.f37510e;
        if (fd1 == null) {
            m63808y0(17);
        }
        return fd1;
    }

    /* renamed from: h */
    public Collection<ef0> mo52349h() {
        Set<ef0> set = this.f40609H;
        if (set == null) {
            m63808y0(11);
        }
        return set;
    }

    /* renamed from: h0 */
    public if0 mo52350h0() {
        return null;
    }

    /* renamed from: i */
    public boolean mo51669i() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: o */
    public List<a17> mo51670o() {
        List<a17> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m63808y0(18);
        }
        return emptyList;
    }

    /* renamed from: p */
    public Modality mo51326p() {
        Modality modality = this.f40611y;
        if (modality == null) {
            m63808y0(16);
        }
        return modality;
    }

    /* renamed from: q */
    public boolean mo52352q() {
        return false;
    }

    public String toString() {
        return "class " + getName();
    }

    /* renamed from: w */
    public Collection<if0> mo52354w() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m63808y0(19);
        }
        return emptyList;
    }

    /* renamed from: z */
    public ef0 mo52355z() {
        return this.f40610I;
    }
}

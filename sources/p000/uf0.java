package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p000.nd6;

/* renamed from: uf0 */
/* compiled from: ClassTypeConstructorImpl */
public class uf0 extends C9442v5 {

    /* renamed from: d */
    public final if0 f45037d;

    /* renamed from: e */
    public final List<a17> f45038e;

    /* renamed from: f */
    public final Collection<xc3> f45039f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uf0(if0 if0, List<? extends a17> list, Collection<xc3> collection, da6 da6) {
        super(da6);
        if (if0 == null) {
            m72768v(0);
        }
        if (list == null) {
            m72768v(1);
        }
        if (collection == null) {
            m72768v(2);
        }
        if (da6 == null) {
            m72768v(3);
        }
        this.f45037d = if0;
        this.f45038e = Collections.unmodifiableList(new ArrayList(list));
        this.f45039f = Collections.unmodifiableCollection(collection);
    }

    /* renamed from: v */
    public static /* synthetic */ void m72768v(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: e */
    public boolean mo51809e() {
        return true;
    }

    public List<a17> getParameters() {
        List<a17> list = this.f45038e;
        if (list == null) {
            m72768v(4);
        }
        return list;
    }

    /* renamed from: m */
    public Collection<xc3> mo52632m() {
        Collection<xc3> collection = this.f45039f;
        if (collection == null) {
            m72768v(6);
        }
        return collection;
    }

    /* renamed from: q */
    public nd6 mo52634q() {
        nd6.C7936a aVar = nd6.C7936a.f41155a;
        if (aVar == null) {
            m72768v(7);
        }
        return aVar;
    }

    public String toString() {
        return dd1.m56821m(this.f45037d).mo66442b();
    }

    /* renamed from: w */
    public if0 mo51180d() {
        if0 if0 = this.f45037d;
        if (if0 == null) {
            m72768v(5);
        }
        return if0;
    }
}

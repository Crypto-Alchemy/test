package p000;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.reflect.TypesJVMKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Lz17;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "", "", "getName", "getGenericDeclaration", "", "Ljava/lang/reflect/Type;", "getBounds", "()[Ljava/lang/reflect/Type;", "getTypeName", "other", "", "equals", "", "hashCode", "toString", "Lo93;", "a", "Lo93;", "typeParameter", "<init>", "(Lo93;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: z17 */
/* compiled from: TypesJVM.kt */
public final class z17 implements TypeVariable<GenericDeclaration>, Type {

    /* renamed from: a */
    public final o93 f35979a;

    public z17(o93 o93) {
        vx2.m53591g(o93, "typeParameter");
        this.f35979a = o93;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (!vx2.m53586b(getName(), typeVariable.getName()) || !vx2.m53586b(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Type[] getBounds() {
        List<m93> upperBounds = this.f35979a.getUpperBounds();
        ArrayList arrayList = new ArrayList(dk0.m43495u(upperBounds, 10));
        for (m93 a : upperBounds) {
            arrayList.add(TypesJVMKt.m47444c(a, true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    public GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f35979a));
    }

    public String getName() {
        return this.f35979a.getName();
    }

    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}

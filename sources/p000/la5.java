package p000;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p000.r95;

/* renamed from: la5 */
/* compiled from: ReflectJavaTypeParameter.kt */
public final class la5 extends aa5 implements r95, h23 {

    /* renamed from: a */
    public final TypeVariable<?> f40593a;

    public la5(TypeVariable<?> typeVariable) {
        vx2.m53591g(typeVariable, "typeVariable");
        this.f40593a = typeVariable;
    }

    /* renamed from: D */
    public boolean mo51412D() {
        return r95.C9234a.m71487c(this);
    }

    /* renamed from: P */
    public o95 mo51429x(u82 u82) {
        return r95.C9234a.m71485a(this, u82);
    }

    /* renamed from: Q */
    public List<o95> getAnnotations() {
        return r95.C9234a.m71486b(this);
    }

    /* renamed from: R */
    public List<y95> getUpperBounds() {
        Type type;
        Type[] bounds = this.f40593a.getBounds();
        vx2.m53590f(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type y95 : bounds) {
            arrayList.add(new y95(y95));
        }
        y95 y952 = (y95) CollectionsKt___CollectionsKt.m47302B0(arrayList);
        if (y952 != null) {
            type = y952.mo52425P();
        } else {
            type = null;
        }
        if (vx2.m53586b(type, Object.class)) {
            return ck0.m33062j();
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof la5) || !vx2.m53586b(this.f40593a, ((la5) obj).f40593a)) {
            return false;
        }
        return true;
    }

    public AnnotatedElement getElement() {
        TypeVariable<?> typeVariable = this.f40593a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    public r24 getName() {
        r24 h = r24.m71445h(this.f40593a.getName());
        vx2.m53590f(h, "identifier(typeVariable.name)");
        return h;
    }

    public int hashCode() {
        return this.f40593a.hashCode();
    }

    public String toString() {
        return la5.class.getName() + ": " + this.f40593a;
    }
}

package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import p000.ka5;

/* renamed from: y95 */
/* compiled from: ReflectJavaClassifierType.kt */
public final class y95 extends ka5 implements x03 {

    /* renamed from: b */
    public final Type f46139b;

    /* renamed from: c */
    public final w03 f46140c;

    public y95(Type type) {
        w03 w03;
        vx2.m53591g(type, "reflectType");
        this.f46139b = type;
        Type P = mo52425P();
        if (P instanceof Class) {
            w03 = new ReflectJavaClass((Class) P);
        } else if (P instanceof TypeVariable) {
            w03 = new la5((TypeVariable) P);
        } else if (P instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) P).getRawType();
            vx2.m53589e(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            w03 = new ReflectJavaClass((Class) rawType);
        } else {
            throw new IllegalStateException("Not a classifier type (" + P.getClass() + "): " + P);
        }
        this.f46140c = w03;
    }

    /* renamed from: D */
    public boolean mo51412D() {
        return false;
    }

    /* renamed from: E */
    public String mo66801E() {
        return mo52425P().toString();
    }

    /* renamed from: G */
    public String mo66802G() {
        throw new UnsupportedOperationException("Type not found: " + mo52425P());
    }

    /* renamed from: P */
    public Type mo52425P() {
        return this.f46139b;
    }

    /* renamed from: d */
    public w03 mo66803d() {
        return this.f46140c;
    }

    public Collection<h03> getAnnotations() {
        return ck0.m33062j();
    }

    /* renamed from: s */
    public boolean mo66804s() {
        boolean z;
        Type P = mo52425P();
        if (!(P instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) P).getTypeParameters();
        vx2.m53590f(typeParameters, "getTypeParameters()");
        if (typeParameters.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public h03 mo51429x(u82 u82) {
        vx2.m53591g(u82, "fqName");
        return null;
    }

    /* renamed from: z */
    public List<e23> mo66805z() {
        List<Type> d = ReflectClassUtilKt.m60596d(mo52425P());
        ka5.C7340a aVar = ka5.f38877a;
        ArrayList arrayList = new ArrayList(dk0.m43495u(d, 10));
        for (Type a : d) {
            arrayList.add(aVar.mo52886a(a));
        }
        return arrayList;
    }
}

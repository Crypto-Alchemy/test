package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import p000.ka5;

/* renamed from: u95 */
/* compiled from: ReflectJavaArrayType.kt */
public final class u95 extends ka5 implements n03 {

    /* renamed from: b */
    public final Type f44939b;

    /* renamed from: c */
    public final ka5 f44940c;

    /* renamed from: d */
    public final Collection<h03> f44941d;

    /* renamed from: e */
    public final boolean f44942e;

    public u95(Type type) {
        ka5 ka5;
        vx2.m53591g(type, "reflectType");
        this.f44939b = type;
        Type P = mo52425P();
        if (P instanceof GenericArrayType) {
            ka5.C7340a aVar = ka5.f38877a;
            Type genericComponentType = ((GenericArrayType) P).getGenericComponentType();
            vx2.m53590f(genericComponentType, "genericComponentType");
            ka5 = aVar.mo52886a(genericComponentType);
        } else {
            if (P instanceof Class) {
                Class cls = (Class) P;
                if (cls.isArray()) {
                    ka5.C7340a aVar2 = ka5.f38877a;
                    Class<?> componentType = cls.getComponentType();
                    vx2.m53590f(componentType, "getComponentType()");
                    ka5 = aVar2.mo52886a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + mo52425P().getClass() + "): " + mo52425P());
        }
        this.f44940c = ka5;
        this.f44941d = ck0.m33062j();
    }

    /* renamed from: D */
    public boolean mo51412D() {
        return this.f44942e;
    }

    /* renamed from: P */
    public Type mo52425P() {
        return this.f44939b;
    }

    /* renamed from: Q */
    public ka5 mo56339m() {
        return this.f44940c;
    }

    public Collection<h03> getAnnotations() {
        return this.f44941d;
    }
}

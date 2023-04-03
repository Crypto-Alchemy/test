package p000;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* renamed from: ia5 */
/* compiled from: ReflectJavaPrimitiveType.kt */
public final class ia5 extends ka5 implements t13 {

    /* renamed from: b */
    public final Class<?> f38344b;

    /* renamed from: c */
    public final Collection<h03> f38345c = ck0.m33062j();

    /* renamed from: d */
    public final boolean f38346d;

    public ia5(Class<?> cls) {
        vx2.m53591g(cls, "reflectType");
        this.f38344b = cls;
    }

    /* renamed from: D */
    public boolean mo51412D() {
        return this.f38346d;
    }

    /* renamed from: Q */
    public Class<?> mo52425P() {
        return this.f38344b;
    }

    public Collection<h03> getAnnotations() {
        return this.f38345c;
    }

    public PrimitiveType getType() {
        if (vx2.m53586b(mo52425P(), Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.get(mo52425P().getName()).getPrimitiveType();
    }
}

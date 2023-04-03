package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.e23;

/* renamed from: ka5 */
/* compiled from: ReflectJavaType.kt */
public abstract class ka5 implements e23 {

    /* renamed from: a */
    public static final C7340a f38877a = new C7340a((DefaultConstructorMarker) null);

    /* renamed from: ka5$a */
    /* compiled from: ReflectJavaType.kt */
    public static final class C7340a {
        public C7340a() {
        }

        public /* synthetic */ C7340a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ka5 mo52886a(Type type) {
            ka5 ka5;
            vx2.m53591g(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new ia5(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                ka5 = new u95(type);
            } else if (type instanceof WildcardType) {
                ka5 = new na5((WildcardType) type);
            } else {
                ka5 = new y95(type);
            }
            return ka5;
        }
    }

    /* renamed from: P */
    public abstract Type mo52425P();

    public boolean equals(Object obj) {
        if (!(obj instanceof ka5) || !vx2.m53586b(mo52425P(), ((ka5) obj).mo52425P())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return mo52425P().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + mo52425P();
    }

    /* renamed from: x */
    public h03 mo51429x(u82 u82) {
        return e23.C7011a.m57131a(this, u82);
    }
}

package p000;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import org.web3j.abi.datatypes.Int;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u001b\n\u0002\b\u0004\"-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018G¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"-\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004\"+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004\"+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00028G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"'\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0010*\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, mo44877d2 = {"T", "Lq83;", "Ljava/lang/Class;", "b", "(Lq83;)Ljava/lang/Class;", "getJavaClass$annotations", "(Lq83;)V", "java", "", "d", "javaPrimitiveType", "c", "javaObjectType", "e", "(Ljava/lang/Class;)Lq83;", "kotlin", "", "a", "(Ljava/lang/annotation/Annotation;)Lq83;", "annotationClass", "kotlin-stdlib"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: x73 */
/* compiled from: JvmClassMapping.kt */
public final class x73 {
    /* renamed from: a */
    public static final <T extends Annotation> q83<? extends T> m54252a(T t) {
        vx2.m53591g(t, "<this>");
        Class<? extends Annotation> annotationType = t.annotationType();
        vx2.m53590f(annotationType, "this as java.lang.annota…otation).annotationType()");
        q83<? extends T> e = m54256e(annotationType);
        vx2.m53589e(e, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return e;
    }

    /* renamed from: b */
    public static final <T> Class<T> m54253b(q83<T> q83) {
        vx2.m53591g(q83, "<this>");
        Class<?> k = ((df0) q83).mo41920k();
        vx2.m53589e(k, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return k;
    }

    /* renamed from: c */
    public static final <T> Class<T> m54254c(q83<T> q83) {
        vx2.m53591g(q83, "<this>");
        Class k = ((df0) q83).mo41920k();
        if (!k.isPrimitive()) {
            vx2.m53589e(k, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return k;
        }
        String name = k.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    k = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals(Int.TYPE_NAME)) {
                    k = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    k = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    k = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    k = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    k = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    k = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    k = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    k = Short.class;
                    break;
                }
                break;
        }
        vx2.m53589e(k, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return k;
    }

    /* renamed from: d */
    public static final <T> Class<T> m54255d(q83<T> q83) {
        vx2.m53591g(q83, "<this>");
        Class<?> k = ((df0) q83).mo41920k();
        if (k.isPrimitive()) {
            vx2.m53589e(k, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return k;
        }
        String name = k.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    /* renamed from: e */
    public static final <T> q83<T> m54256e(Class<T> cls) {
        vx2.m53591g(cls, "<this>");
        return ua5.m52727b(cls);
    }
}

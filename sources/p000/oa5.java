package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\b\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\f\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"/\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\r8F¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, mo44877d2 = {"Li93;", "Ljava/lang/reflect/Field;", "b", "(Li93;)Ljava/lang/reflect/Field;", "javaField", "Ljava/lang/reflect/Method;", "c", "(Li93;)Ljava/lang/reflect/Method;", "javaGetter", "Lf93;", "e", "(Lf93;)Ljava/lang/reflect/Method;", "javaSetter", "Lz83;", "d", "(Lz83;)Ljava/lang/reflect/Method;", "javaMethod", "T", "Ljava/lang/reflect/Constructor;", "a", "(Lz83;)Ljava/lang/reflect/Constructor;", "getJavaConstructor$annotations", "(Lz83;)V", "javaConstructor", "Lm93;", "Ljava/lang/reflect/Type;", "f", "(Lm93;)Ljava/lang/reflect/Type;", "javaType", "kotlin-reflection"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: oa5 */
/* compiled from: ReflectJvmMapping.kt */
public final class oa5 {
    /* renamed from: a */
    public static final <T> Constructor<T> m23727a(z83<? extends T> z83) {
        Object obj;
        u90<?> t;
        vx2.m53591g(z83, "<this>");
        KCallableImpl<?> b = y67.m74272b(z83);
        if (b == null || (t = b.mo52981t()) == null) {
            obj = null;
        } else {
            obj = t.getMember();
        }
        if (obj instanceof Constructor) {
            return (Constructor) obj;
        }
        return null;
    }

    /* renamed from: b */
    public static final Field m23728b(i93<?> i93) {
        vx2.m53591g(i93, "<this>");
        KPropertyImpl<?> d = y67.m74274d(i93);
        if (d != null) {
            return d.mo53079F();
        }
        return null;
    }

    /* renamed from: c */
    public static final Method m23729c(i93<?> i93) {
        vx2.m53591g(i93, "<this>");
        return m23730d(i93.getGetter());
    }

    /* renamed from: d */
    public static final Method m23730d(z83<?> z83) {
        Object obj;
        u90<?> t;
        vx2.m53591g(z83, "<this>");
        KCallableImpl<?> b = y67.m74272b(z83);
        if (b == null || (t = b.mo52981t()) == null) {
            obj = null;
        } else {
            obj = t.getMember();
        }
        if (obj instanceof Method) {
            return (Method) obj;
        }
        return null;
    }

    /* renamed from: e */
    public static final Method m23731e(f93<?> f93) {
        vx2.m53591g(f93, "<this>");
        return m23730d(f93.getSetter());
    }

    /* renamed from: f */
    public static final Type m23732f(m93 m93) {
        vx2.m53591g(m93, "<this>");
        Type g = ((KTypeImpl) m93).mo46045g();
        if (g == null) {
            return TypesJVMKt.m47447f(m93);
        }
        return g;
    }
}

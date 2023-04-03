package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\u0012\u0010\b\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\t"}, mo44877d2 = {"Ljava/lang/reflect/Type;", "Ljava/lang/Class;", "b", "", "c", "Ljava/lang/reflect/ParameterizedType;", "", "index", "a", "scarlet-core"}, mo44878k = 2, mo44879mv = {1, 5, 1})
/* renamed from: y17 */
/* compiled from: TypeUtils.kt */
public final class y17 {
    /* renamed from: a */
    public static final Type m54603a(ParameterizedType parameterizedType, int i) {
        vx2.m53591g(parameterizedType, "<this>");
        Type b = q77.m50385b(i, parameterizedType);
        vx2.m53590f(b, "getParameterUpperBound(index, this)");
        return b;
    }

    /* renamed from: b */
    public static final Class<?> m54604b(Type type) {
        vx2.m53591g(type, "<this>");
        Class<?> c = q77.m50386c(type);
        vx2.m53590f(c, "getRawType(this)");
        return c;
    }

    /* renamed from: c */
    public static final boolean m54605c(Type type) {
        vx2.m53591g(type, "<this>");
        return q77.m50387d(type);
    }
}

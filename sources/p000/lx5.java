package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: lx5 */
/* compiled from: ServiceMethod */
public abstract class lx5<T> {
    /* renamed from: b */
    public static <T> lx5<T> m64026b(og5 og5, Method method) {
        fe5 b = fe5.m57670b(og5, method);
        Type genericReturnType = method.getGenericReturnType();
        if (t77.m72179j(genericReturnType)) {
            throw t77.m72182m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return in2.m59025f(og5, method, b);
        } else {
            throw t77.m72182m(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    /* renamed from: a */
    public abstract T mo52512a(Object[] objArr);
}
